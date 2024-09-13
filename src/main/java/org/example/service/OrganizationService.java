package org.example.service;


import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.example.dao.OrganizationDao;
import org.example.dto.OrganizationDto;
import org.example.entity.Organization;
import org.example.mapper.OrganizationMapper;

@Stateless
public class OrganizationService {
    @Inject
    private OrganizationDao organizationDao;
    @Inject
    private OrganizationMapper organizationMapper;

    public void createOrganization(OrganizationDto organizationdto){
        Organization organization = organizationMapper.dtoToEntity(organizationdto);
        organizationDao.save(organization);
    }
    public void findOrganizationById(Long id){
        Organization organization = organizationDao.findById(id);
    }
    public Organization findOrganizationByName(String name){
        return organizationDao.findByName(name);
    }


}
