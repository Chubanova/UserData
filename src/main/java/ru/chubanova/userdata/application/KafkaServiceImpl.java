package ru.chubanova.userdata.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chubanova.userdata.entity.UserDataMapper;
import ru.chubanova.userdata.jpa.UserEntity;
import ru.chubanova.userdata.secondaryadapter.KafkaSender;

@Service
@RequiredArgsConstructor
public class KafkaServiceImpl implements KafkaService{
    private final KafkaSender kafkaSender;
    private final UserDataMapper userDataMapper;
    @Override
    public void readyToProduce(UserEntity userEntity) {

        kafkaSender.produce(userDataMapper.mapToUserToKafka(userEntity));

    }
}
