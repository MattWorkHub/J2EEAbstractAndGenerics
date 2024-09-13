package org.example.service;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.example.dao.ContactDao;
import org.example.dto.ContactDto;
import org.example.entity.Contact;
import org.example.mapper.ContactMapper;

@Stateless
public class ContactService extends AbstractService {
    @Inject
    private ContactDao contactDao;
    @Inject
    private ContactMapper contactMapper;

    public void createContact(ContactDto contactdto) {
        Contact contact = contactMapper.dtoToEntity(contactdto);
        contactDao.save(contact);
    }
    public void findContactById(Long id) {
        Contact contact = contactDao.findById(id);
    }

    @Override
    public Object findById(Object o) {
        Contact contact = contactDao.findById(id);
        return null;
    }

    @Override
    public void save(Object entity) {

    }

    @Override
    public void delete(Object o) {

    }
}
