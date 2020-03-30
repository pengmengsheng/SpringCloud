package cloud.sentinel.service.controller;

import cloud.sentinel.service.controller.service.SentinelService;
import cloud.sentinel.service.handler.BlockExceptionHandler;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author pms
 * @date 2020/3/28 9:50
 * @since 1.0
 */
@RestController
public class SentinelContoller {
    @RequestMapping("/geta")
    @SentinelResource(value="geta",fallback = "fallbackMethod")
    public String geta(){
        return "geta";
    }
    @RequestMapping("/getb")
    public String getb(){
        return "getb";
    }
    @RequestMapping("/compute")
    public int compute(){
        return 10/0;
    }

    public String myException(BlockException ex){

        return "访问超过设定qps"+ex.getMessage();
    }
}
