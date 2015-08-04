/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ldeng.service;

import com.ldeng.model.EntityManagerUtil;
import com.ldeng.model.Item;
import javax.persistence.EntityManager;

/**
 *
 * @author Le
 */
public class ItemService {
    
    EntityManager entityManager = EntityManagerUtil.getEntityManager();
        
    public void saveItem (Item item) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(item);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }
    
    
}
