package ru.chubanova.userdata.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chubanova.userdata.jpa.UserEntity;

@Service
@RequiredArgsConstructor
public class NotificationImpl implements Notificataion {
    private final MailServiceImpl mailService;
    private final KafkaService kafkaService;
    private final EventService eventService;
    @Override
    public void notifyAboutNewInfo() {
        UserEntity userEntity = eventService.get();
        mailService.readyToSend(userEntity);
        kafkaService.readyToProduce(userEntity);


    }
}
