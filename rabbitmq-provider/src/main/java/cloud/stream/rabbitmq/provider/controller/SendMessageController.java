package cloud.stream.rabbitmq.provider.controller;

import cloud.stream.rabbitmq.provider.service.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pms
 * @date 2020/3/23 8:21
 * @since 1.0
 */
@RestController
public class SendMessageController {
    @Autowired
    MessageProvider messageProvider;

    @RequestMapping("/sendmsg")
    public String send(){
        return messageProvider.send();
    }
}
