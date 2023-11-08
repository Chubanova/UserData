package ru.chubanova.userdata.primaryadapter;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.chubanova.userdata.application.EventService;
import ru.chubanova.userdata.entity.UserData;

@RestController
@RequestMapping("user-rest")
@RequiredArgsConstructor
public class UserController {
    private final EventService eventService;

    @PostMapping(value = "/userDataEvent")
    @ResponseStatus(value = HttpStatus.OK)
    public void event(UserData userData){
        eventService.saveUserData(userData);

    }
}
