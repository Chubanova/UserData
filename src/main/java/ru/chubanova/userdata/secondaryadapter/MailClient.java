package ru.chubanova.userdata.secondaryadapter;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class MailClient {

@Autowired
    private final JavaMailSender emailSender;

    private final String from;
    private final String to;


    public MailClient(JavaMailSender emailSender,
                      @Value("${mail.from}")String from,
                      @Value("${mail.to}")String to
    ) {
        this.emailSender = emailSender;
        this.from = from;
        this.to = to;
    }

    public void send(UserToMail userToMail){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(userToMail.getSubject());
        message.setText(userToMail.getText());
        emailSender.send(message);

    }
}
