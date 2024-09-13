package org.example.controller;

import jakarta.ejb.EJB;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.dto.ContactDto;
import org.example.entity.Organization;
import org.example.service.ContactService;
import org.example.service.OrganizationService;

@WebServlet("/contact")
public class ContactController extends HttpServlet {

    @EJB
    private ContactService contactService;
    @EJB
    private OrganizationService organizationService;

    protected void createContact(HttpServletRequest request, HttpServletResponse response) {
        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String job = request.getParameter("job");
        Organization organization = (organizationService.findOrganizationByName("name"));
        ContactDto contactDto = new ContactDto(id, name, job, organization);


    }
}
