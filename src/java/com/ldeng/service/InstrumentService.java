/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ldeng.service;

import com.ldeng.model.EntityManagerUtil;
import com.ldeng.model.Instrument;
import javax.persistence.EntityManager;

/**
 *
 * @author Le
 */
public class InstrumentService {
    
    EntityManager entityManager = EntityManagerUtil.getEntityManager();
        
    public void saveInstrument (Instrument inst) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(inst);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }
    
    public void updateInstrument (Instrument inst) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(inst);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }
}
