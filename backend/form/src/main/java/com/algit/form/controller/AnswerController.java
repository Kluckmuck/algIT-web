package com.algit.form.controller;

import com.algit.form.exception.ResourceNotFoundException;
import com.algit.form.model.Answer;
import com.algit.form.repository.AnswerRepository;
import com.algit.form.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
public class AnswerController {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/contact/{contactId}/answers")
    public List<Answer> getAnswersByContactId(@PathVariable Long contactId) {
        return answerRepository.findByContactId(contactId);
    }

    // @PostMapping("/contact/{contactId}/answers")
    // public Answer addAnswer(@PathVariable Long contactId,
    //                         @Valid @RequestBody Answer answer) {
    //     return contactRepository.findById(contactId)
    //             .map(contact -> {
    //                 answer.setContact(contact);
    //                 return answerRepository.save(answer);
    //             }).orElseThrow(() -> new ResourceNotFoundException("Conctact not found with id " + contactId));
    // }

    @PutMapping("/contact/{contactId}/answers/{answerId}")
    public Answer updateAnswer(@PathVariable Long contactId,
                               @PathVariable Long answerId,
                               @Valid @RequestBody Answer answerRequest) {
        if(!contactRepository.existsById(contactId)) {
            throw new ResourceNotFoundException("Contact not found with id " + contactId);
        }

        return answerRepository.findById(answerId)
                .map(answer -> {
                    answer.setText(answerRequest.getText());
                    return answerRepository.save(answer);
                }).orElseThrow(() -> new ResourceNotFoundException("Answer not found with id " + answerId));
    }

    @DeleteMapping("/contact/{contactId}/answers/{answerId}")
    public ResponseEntity<?> deleteAnswer(@PathVariable Long contactId,
                                          @PathVariable Long answerId) {
        if(!contactRepository.existsById(contactId)) {
            throw new ResourceNotFoundException("Contact not found with id " + contactId);
        }

        return answerRepository.findById(answerId)
                .map(answer -> {
                    answerRepository.delete(answer);
                    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("Answer not found with id " + answerId));

    }
}