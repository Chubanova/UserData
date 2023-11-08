package ru.chubanova.userdata.application;

import org.springframework.stereotype.Service;
import ru.chubanova.userdata.jpa.UserEntity;
@Service
public class MailServiceImpl implements MailService{
    @Override
    public void readyToSend(UserEntity userEntity) {

    }
}
