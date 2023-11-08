package ru.chubanova.userdata.secondaryadapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaSender {
    private final KafkaTemplate<String,String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    public void produce(UserToKafka userToKafka){
        try {
            String json = objectMapper.writeValueAsString(userToKafka);
            log.info("Отправляем сообщение "+json);
            kafkaTemplate.send("topic", UUID.randomUUID().toString(), json);
        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
        }

    }

}
