package cloud.sentinel.service.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author pms
 * @date 2020/3/29 10:13
 * @since 1.0
 */
public class BlockExceptionHandler {
    public static String blockException(BlockException ex){
        return "超过限流";
    }
}
