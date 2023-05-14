
package com.portfolio_gs.backend.controller;

import com.portfolio_gs.backend.model.Mail;
import com.portfolio_gs.backend.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Mail")
//@CrossOrigin(origins= "http://localhost:4200")
public class MailController {
 
    @Autowired
    private MailService mailSender;
    
    @PostMapping("/enviar")
    public void enviarMail(@RequestBody Mail mail){
        mailSender.sendSimpleEmail(mail.getFromEmail(), mail.getBody(), mail.getNombre());
    }
}
