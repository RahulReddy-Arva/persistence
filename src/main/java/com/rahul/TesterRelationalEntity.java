package com.rahul;

import com.rahul.entity.Address;
import com.rahul.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.security.Permission;

public class TesterRelationalEntity {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        User user = new User();
//        user.setEmail("rarva@uncc.edu");
//        user.setFirstname("Rahul Reddy");
//        user.setLastname("Arva");
//
//        Address address = new Address();
//        address.setCity("Richmond");
//        address.setState("Virginia");
//        address.setStreet("Henrico");
//
//        // Always persist the child first and then set that id to the parent and then persist parent.
//         // INSERT QUERY
//        entityManager.getTransaction().begin();
//        entityManager.persist(address);
//        user.setAddress(address);
//        entityManager.persist(user);
//        entityManager.getTransaction().commit();


        //  SEARCH QUERY
//        User user = entityManager.find(User.class, "1065fc5f-4f96-41b5-8374-621a5e3622a6");
//        System.out.println(user);

//        // UPDATE QUERY
//        User user = entityManager.find(User.class, "1065fc5f-4f96-41b5-8374-621a5e3622a6");
//        Address address = entityManager.find(Address.class,"1065fc5f-4f96-41b5-8374-621a5e3622a6");
//

        entityManager.close();
        entityManagerFactory.close();
    }

}
