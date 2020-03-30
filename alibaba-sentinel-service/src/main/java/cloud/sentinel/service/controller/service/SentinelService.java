package cloud.sentinel.service.controller.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author pms
 * @date 2020/3/28 11:10
 * @since 1.0
 */
@Service
public class SentinelService {
    @SentinelResource("getOrder")
    public String getOrder(){
        return "order";
    }
}
