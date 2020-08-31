package me.zhulin.shopapi.exception;


import me.zhulin.shopapi.enums.ResultEnum;

/**
 * Criado por Dorgival Fernando em 30/08/2020.
 */
public class MyException extends RuntimeException {

    private Integer code;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public MyException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
