package ru.chubanova.userdata.entity;

import org.mapstruct.Mapper;
import ru.chubanova.userdata.jpa.UserEntity;
import ru.chubanova.userdata.secondaryadapter.UserToKafka;

@Mapper(componentModel = "spring")
public abstract class UserDataMapper {

    public abstract UserEntity mapToUserEntity(UserData userData);
    public abstract UserToKafka mapToUserToKafka(UserEntity userEntity);
}
