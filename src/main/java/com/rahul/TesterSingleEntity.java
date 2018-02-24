package com.rahul;

import javax.persistence.*;
import java.util.List;

public class TesterSingleEntity {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        Employee emp = new Employee();
//        emp.setEmail("rarva@uncc.edu");
//        emp.setFirstname("Rahul Reddy");
//        emp.setLastname("Arva");
//
//        // CREATE
//        entityManager.getTransaction().begin();
//        entityManager.persist(emp);
//        entityManager.getTransaction().commit();

        // FIND BY ID
//        Employee emp = entityManager.find(Employee.class,"a406ec1a-1b16-4f1f-9650-62887ab90658");
//        System.out.println(emp);

        // UPDATE
//        Employee emp = entityManager.find(Employee.class,"a406ec1a-1b16-4f1f-9650-62887ab90658");
//        emp.setFirstname("Rahul");
//        emp.setLastname("Arva");
//
//        entityManager.getTransaction().begin();
//        entityManager.merge(emp);
//        entityManager.getTransaction().commit();

        // DELETE
//        Employee emp = entityManager.find(Employee.class,"a406ec1a-1b16-4f1f-9650-62887ab90658");
//        entityManager.getTransaction().begin();
//        entityManager.remove(emp);
//        entityManager.getTransaction().commit();


        // FIND ALL

        // Using JSQL query
//        TypedQuery<Employee> query = entityManager.createQuery("SELECT emp FROM Employee emp ORDER BY emp.email DESC ", Employee.class);
//        List<Employee> resultList = query.getResultList();
//        for ( Employee emp: resultList) {
//            System.out.println(emp);
//        }

        // Using SQL native Query.
//        Query nativeQuery = entityManager.createNativeQuery("SELECT * FROM emp_db.Employee", Employee.class);
//        List resultList = nativeQuery.getResultList();
//        for (Object emp: resultList) {
//            System.out.println(emp);
//        }

        // Using named Query.
        //  All the named queries can be stored together at the top of entity object it is used upon.

//        TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findByEmail", Employee.class);
//        query.setParameter("paramEmail","aviswan2@uncc.edu");
//        List<Employee> resultList = query.getResultList();
//        for ( Employee emp: resultList) {
//            System.out.println(emp);
//        }
//


        entityManager.close();

        entityManagerFactory.close();
    }
}
