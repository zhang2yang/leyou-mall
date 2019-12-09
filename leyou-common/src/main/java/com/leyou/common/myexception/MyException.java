package com.leyou.common.myexception;

/**
 * @author Administrator on 2019/12/8.
 */
public class MyException extends RuntimeException{
    public MyException(LyException exception){
        super(exception.toString());
    }
}
