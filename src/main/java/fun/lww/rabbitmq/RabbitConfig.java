package fun.lww.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @declaration rabbitMQ 配置类 用来配置队列 交换器 路由等
 * @author liweiwei
 * @date 2018/7/7 19:36
 */
@Configuration
public class RabbitConfig {

    @Bean
    Queue queue() {
        return new Queue("hello");
    }

}
