package com.artqiyi.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by: xmg
 * 2018/3/27 0:25
 */
@Data
public class ResultVO {
    /** 错误码. */
    private int code;

    /** 提示信息. */
    private String msg;

    /** 返回的具体内容. */
    private Object data;

}
