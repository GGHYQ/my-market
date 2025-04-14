package cn.xiaofu.test;

import cn.xiaofu.infrastructure.dao.IStrategyDao;
import cn.xiaofu.infrastructure.dao.po.StrategyPO;
import cn.xiaofu.infrastructure.redis.IRedisService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private IRedisService redissionService;

    @Test
   public void testRedisGet(){

        redissionService.setValue("testKey", "测试");

        Object test = redissionService.getValue("testKey");
        log.info("test:{}", JSON.toJSONString(test));


    }
}
