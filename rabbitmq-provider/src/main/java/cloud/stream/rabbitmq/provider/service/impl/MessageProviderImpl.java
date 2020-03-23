package cloud.stream.rabbitmq.provider.service.impl;

import cloud.stream.rabbitmq.provider.service.MessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author pms
 * @date 2020/3/23 8:08
 * @since 1.0
 */
@EnableBinding(Source.class)//消息发送管道
public class MessageProviderImpl implements MessageProvider {
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String msg = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(msg).build());
        System.out.println(msg);
        return null;
    }
}
