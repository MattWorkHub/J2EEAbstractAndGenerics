package org.example.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.entity.Contact;

@Transactional
public class ContactDao {
    @PersistenceContext
    private EntityManager entityManager;

    public Contact save(Contact contact) {
        entityManager.persist(contact);
        return contact;
    }
    public Contact findById(long id) {
        return entityManager.find(Contact.class, id);
    }
}
