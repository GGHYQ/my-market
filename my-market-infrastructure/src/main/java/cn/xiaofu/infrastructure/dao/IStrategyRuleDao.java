package cn.xiaofu.infrastructure.dao;

import cn.xiaofu.infrastructure.dao.po.StrategyRulePO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStrategyRuleDao {
    List<StrategyRulePO> queryList();
}
