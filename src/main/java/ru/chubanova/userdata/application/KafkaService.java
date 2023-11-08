package ru.chubanova.userdata.application;

import ru.chubanova.userdata.jpa.UserEntity;

public interface KafkaService {

    void readyToProduce(UserEntity userEntity);
}
