package com.abtesting.emailsmtp.service;

import com.abtesting.emailsmtp.pojos.dto.EmailDetails;

public interface EmailService {

  String sendSimpleMail(EmailDetails details);
}
