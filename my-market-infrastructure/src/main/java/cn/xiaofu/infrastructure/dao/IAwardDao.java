package cn.xiaofu.infrastructure.dao;

import cn.xiaofu.infrastructure.dao.po.AwardPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IAwardDao {

    /**
     * 查询列表
     * @return
     */
    List<AwardPO> queryList();
}
