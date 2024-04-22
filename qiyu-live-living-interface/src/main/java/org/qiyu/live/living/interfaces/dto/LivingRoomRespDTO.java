package org.qiyu.live.living.interfaces.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class LivingRoomRespDTO implements Serializable {


    @Serial
    private static final long serialVersionUID = -2370410556480808116L;
    private Integer id;
    private Long anchorId;
    private String roomName;
    private String covertImg;
    private Integer type;
    private Integer watchNum;
    private Integer goodNum;
    private Long pkObjId;
}