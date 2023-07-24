package br.com.dsi.domain.infra.amqp;

import lombok.Getter;
import lombok.Setter;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqSender {

    @Autowired
    private RabbitTemplate messageTemplate;

    @Getter
    @Setter
    private String filter;


    public void send(String exchange, String routingKey, String message) {
        var msg = createMessage(message);
        messageTemplate.convertAndSend(exchange, routingKey, msg);
    }


    private Message createMessage(String msg)  {
        return messageTemplate.getMessageConverter().toMessage(msg.getBytes(), null);
    }
}

