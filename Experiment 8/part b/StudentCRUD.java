package com.example.hibernatecrud;

import org.hibernate.*;

public class StudentCRUD {

    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        // Create
        Student s1 = new Student();
        s1.setName("Rohit");
        s1.setCity("Mumbai");
        session.save(s1);

        // Read
        Student s2 = session.get(Student.class, 1);
        if (s2 != null) System.out.println("Student: " + s2.getName() + " - " + s2.getCity());

        // Update
        s2.setCity("Pune");
        session.update(s2);

        // Delete
        Student s3 = session.get(Student.class, 2);
        if (s3 != null) session.delete(s3);

        tx.commit();
        session.close();
    }
}

