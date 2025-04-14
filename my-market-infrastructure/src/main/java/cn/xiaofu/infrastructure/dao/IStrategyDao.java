package cn.xiaofu.infrastructure.dao;

import cn.xiaofu.infrastructure.dao.po.StrategyPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStrategyDao {

    /**
     * 查询列表
     * @return
     */
    List<StrategyPO> queryList();
}
