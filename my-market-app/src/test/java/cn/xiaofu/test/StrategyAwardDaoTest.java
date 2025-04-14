package cn.xiaofu.test;

import cn.xiaofu.infrastructure.dao.IStrategyAwardDao;
import cn.xiaofu.infrastructure.dao.IStrategyDao;
import cn.xiaofu.infrastructure.dao.po.StrategyAwardPO;
import cn.xiaofu.infrastructure.dao.po.StrategyPO;
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
public class StrategyAwardDaoTest {
    @Autowired
    private IStrategyAwardDao iStrategyAwardDao;

    @Test
    public void testStrategyAwardList(){
        List<StrategyAwardPO> strategyAwardPOS = iStrategyAwardDao.queryList();
        log.info("strategyAwardPOS:{}", JSON.toJSONString(strategyAwardPOS));
    }
}
