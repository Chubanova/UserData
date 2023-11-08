package ru.chubanova.userdata.application;

import org.springframework.stereotype.Service;
import ru.chubanova.userdata.entity.UserData;
import ru.chubanova.userdata.jpa.UserEntity;
@Service
public class EventServiceImpl implements EventService{
    @Override
    public void saveUserData(UserData userData) {

    }

    @Override
    public UserEntity get() {
        return null;
    }
}
