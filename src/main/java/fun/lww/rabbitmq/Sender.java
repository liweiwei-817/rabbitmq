package fun.lww.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @declaration 消息生产者
 * @author liweiwei
 * @date 2018/7/7 19:33
 */
@Component
public class Sender {

    @Autowired
    AmqpTemplate rabbitTempalte;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("----------------------------");
        System.out.println("Sender:" + context);
        System.out.println("----------------------------");
        rabbitTempalte.convertAndSend("hello", context);
    }

}
