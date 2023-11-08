package ru.chubanova.userdata.application;

import ru.chubanova.userdata.entity.UserData;
import ru.chubanova.userdata.jpa.UserEntity;

public interface EventService {
    void saveUserData(UserData userData);
    UserEntity get();

}
