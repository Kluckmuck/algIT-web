package com.algit.form.controller;

import com.algit.form.exception.ResourceNotFoundException;
import com.algit.form.model.Contact;
import com.algit.form.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/contact")
    public Page<Contact> getContacts(Pageable pageable) {
        return contactRepository.findAll(pageable);
    }


    @PostMapping("/contact")
    public Contact createContact(@Valid @RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    // @PutMapping("/contact/{questionId}")
    // public Question updateQuestion(@PathVariable Long questionId,
    //                                @Valid @RequestBody Question questionRequest) {
    //     return contactRepository.findById(questionId)
    //             .map(question -> {
    //                 question.setTitle(questionRequest.getTitle());
    //                 question.setDescription(questionRequest.getDescription());
    //                 return contactRepository.save(question);
    //             }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + questionId));
    // }


    @DeleteMapping("/contact/{contactId}")
    public ResponseEntity<?> deleteContact(@PathVariable Long contactId) {
        return contactRepository.findById(contactId)
                .map(contact -> {
                    contactRepository.delete(contact);
                    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("Contact not found with id " + contactId));
    }
}