package com.example.globalexception.exception;

import lombok.Data;

import java.io.Serializable;

/**
 * MyException:
 *
 * @author zhangxiaoxiang
 * @date: 2019/06/26
 */
@Data
public class MyException extends RuntimeException implements Serializable {

    /**
     * 异常信息
     */
    private String message;

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public MyException(String message) {
        this.message = message;
    }
}
