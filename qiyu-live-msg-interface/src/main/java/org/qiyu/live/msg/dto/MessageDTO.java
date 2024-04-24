package org.qiyu.live.msg.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;


@Data
public class MessageDTO implements Serializable {


    @Serial
    private static final long serialVersionUID = -759018873561012748L;
    private Long userId;
    private Integer roomId;
    //发送人名称
    private String senderName;
    //发送人头像
    private String senderAvtar;
    /**
     * 消息类型
     */
    private Integer type;
    /**
     * 消息内容
     */
    private String content;
    private Date createTime;
    private Date updateTime;



}
