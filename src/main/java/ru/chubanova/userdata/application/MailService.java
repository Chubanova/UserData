package ru.chubanova.userdata.application;

import ru.chubanova.userdata.jpa.UserEntity;

public interface MailService {

    void readyToSend(UserEntity userEntity);

}
