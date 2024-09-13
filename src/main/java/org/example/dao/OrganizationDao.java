package org.example.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.entity.Organization;

@Transactional
public class OrganizationDao {
    @PersistenceContext
    private EntityManager entityManager;

    public Organization save(Organization organization) {
        entityManager.persist(organization);
        return organization;
    }
    public Organization findById(Long id) {
        return entityManager.find(Organization.class, id);
    }
    public Organization findByName(String name) {
        return entityManager.find(Organization.class, name);
    }

}
