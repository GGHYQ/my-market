package cn.xiaofu.infrastructure.dao;

import cn.xiaofu.infrastructure.dao.po.StrategyAwardPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStrategyAwardDao {
    List<StrategyAwardPO> queryList();
}
