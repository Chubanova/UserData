package ru.chubanova.userdata.application;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Scheduler {
    private final Notificataion notificataion;
    @Scheduled(fixedDelay = 1000_000)
    public void notifyAboutNewUserData(){
        notificataion.notifyAboutNewInfo();
    }

}
