package com.abtesting.emailsmtp.controller;

import com.abtesting.emailsmtp.pojos.dto.EmailDetails;
import com.abtesting.emailsmtp.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/approval-teams")
public class EmailController {

  @Autowired
  private EmailService emailService;

  @PostMapping("/sendMail")
  public ResponseEntity<?> sendMail(@RequestBody EmailDetails details) {
    return new ResponseEntity<>(emailService.sendSimpleMail(details), HttpStatus.OK);
  }



}
