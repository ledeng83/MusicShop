/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ldeng.service;

import com.ldeng.model.EntityManagerUtil;
import com.ldeng.model.Item;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Le
 */
public class ItemService {

    EntityManager entityManager = EntityManagerUtil.getEntityManager();

    public void saveItem(Item item) {

        entityManager.getTransaction().begin();
        entityManager.persist(item);
        entityManager.getTransaction().commit();

    }

    public List<Item> findAllItems() {
        List<Item> itemList = null;

        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("Select e From Item e");
        itemList = (List<Item>) query.getResultList();
        entityManager.getTransaction().commit();

        return itemList;
    }

    public void removeItem(Integer id) {
        entityManager.getTransaction().begin();
        Item item = entityManager.find(Item.class, id);
        entityManager.remove(item);
        entityManager.getTransaction().commit();
    }

    public void updateItem(Item item, Integer id) {
        entityManager.getTransaction().begin();
        Item itemForUpdate=entityManager.find(Item.class, id);
        itemForUpdate.setName(item.getName());
        itemForUpdate.setType(item.getType());
        itemForUpdate.setPrice(item.getPrice());
        itemForUpdate.setDesc(item.getDesc());
        entityManager.getTransaction().commit();
    }

}
