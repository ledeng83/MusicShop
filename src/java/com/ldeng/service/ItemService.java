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
        List<Item> itemList=null;
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createQuery("Select e From Item e");
            itemList = (List<Item>) query.getResultList();
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for (Item i : itemList) {
            System.out.println(i.getName());
        }
        
        return itemList;
    }

}
