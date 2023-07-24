package br.com.dsi.controller;

import br.com.dsi.domain.infra.amqp.RabbitMqSender;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs/characters")
public class JobCharactersController {

    @Autowired
    private RabbitMqSender topic;

    @GetMapping
    public ResponseEntity<String> publishTest() {


        topic.send("myqueue", "myqueue", "myqueue");
        /*  String foo = (String) template.receiveAndConvert("myqueue");*/


        return ResponseEntity.ok().build();
    }


}
