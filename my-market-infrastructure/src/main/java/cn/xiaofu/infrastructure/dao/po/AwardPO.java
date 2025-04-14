package cn.xiaofu.infrastructure.dao.po;

import lombok.Data;

import java.util.Date;

/**
 * 奖品信息
 */
@Data
public class AwardPO {

    /**
     * 自增ID
     */
    private String id;
    /**
     * 奖品ID - 内部流转使用
     */
    private String awardId;
    /**
     * 奖品处理标识
     */
    private String awardKey;
    /**
     * 奖品处理配置
     */
    private String awardConfig;
    /**
     * 奖品描述
     */
    private String awardDesc;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改时间
     */
    private String updateTime;
}
