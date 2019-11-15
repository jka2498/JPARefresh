package com.sparta.jka.services;

import com.sparta.jka.components.User;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Named
@Stateless
public class RegistrationService {

    @PersistenceContext
    private EntityManager entityManager;
    public String registerUser(User user) {


        entityManager.persist(user);

        return "welcome";
    }
}
