package fun.lww.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @declaration 消息消费者
 * @author liweiwei
 * @date 2018/7/7 19:34
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("------------------------");
        System.out.println("Receiver: " + hello);
        System.out.println("------------------------");
    }
}
