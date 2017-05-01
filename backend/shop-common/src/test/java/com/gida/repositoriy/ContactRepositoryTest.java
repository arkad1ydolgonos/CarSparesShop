package com.gida.repositoriy;

import com.gida.models.Contact;
import com.gida.models.enums.ContactType;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.Assert.assertEquals;

@ContextConfiguration(value = {"classpath:app-context-common.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
//@TestExecutionListeners
@DatabaseSetup("")
public class ContactRepositoryTest {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private EntityManager entityManager;

    @Test
    @Transactional
    public void saveContactWithSameIdShouldUpdateExistingContact() {
        //GIVEN
        Contact detachedContact = getContact();
        Contact savedContact =contactRepository.save(detachedContact);
        entityManager.flush();
        entityManager.clear();
        //WHEN
        savedContact.setDescription("test123");
        contactRepository.save(savedContact);
        entityManager.flush();
        entityManager.clear();

        Contact updated = contactRepository.findOne(savedContact.getId());
        //THEN

        assertEquals("test123", savedContact.getDescription());

    }


    private Contact getContact() {
        Contact contact = new Contact();
        contact.setContactType(ContactType.MOBILE_PHONE);
        contact.setValue("+12345678901");
        contact.setDescription("test");
       // contact.setId(1000);
        return contact;
    }


}