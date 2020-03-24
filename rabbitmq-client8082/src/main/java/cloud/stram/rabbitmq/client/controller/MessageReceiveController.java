package cloud.stram.rabbitmq.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author pms
 * @date 2020/3/24 10:02
 * @since 1.0
 */
@Component
@EnableBinding(Sink.class)
public class MessageReceiveController {

    @Value("${server.port}")
    private String port;

    @StreamListener(Sink.INPUT)
    public void receiveMsg(Message<?> msg){
        System.out.println("接收到消息："+msg.getPayload()+"\t port:"+port);
    }
}
