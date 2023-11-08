package ru.chubanova.userdata.primaryadapter;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.chubanova.userdata.application.EventService;
import ru.chubanova.userdata.entity.UserData;

@RestController
@RequestMapping("user-rest")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final EventService eventService;

    @PostMapping(value = "/userDataEvent")
    @ResponseStatus(value = HttpStatus.OK)
    public void event( @RequestBody UserData userData){
        log.info("Получен пользователь ="+userData.toString());

        eventService.saveUserData(userData);

    }
}
