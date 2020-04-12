package com.lpp.exception;


import com.lpp.enums.EnumInterface;

/**
 * 业务-统一异常
 */
public class BusinessException extends BaseException {

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String code, String message) {
        super(code, message);
    }

    public BusinessException(EnumInterface enums, Object... args) {
        super(enums.getCode(), enums.getMsg(), args);
    }

}