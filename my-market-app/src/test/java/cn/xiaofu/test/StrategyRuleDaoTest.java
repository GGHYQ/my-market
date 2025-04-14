package cn.xiaofu.test;

import cn.xiaofu.infrastructure.dao.IStrategyDao;
import cn.xiaofu.infrastructure.dao.IStrategyRuleDao;
import cn.xiaofu.infrastructure.dao.po.StrategyRulePO;
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
public class StrategyRuleDaoTest {
    @Autowired
    private IStrategyRuleDao iStrategyRuleDao;

    @Test
    public void testStrategyAwardList(){
        List<StrategyRulePO> strategyRulePOS = iStrategyRuleDao.queryList();
        log.info("strategyRulePOS:{}", JSON.toJSONString(strategyRulePOS));
    }
}
