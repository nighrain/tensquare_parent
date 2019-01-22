package com.tensquare.base.controller;

//Created by Wang .  

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author      Wang
 * @version     1.0
 * -description step :controller的异常处理类
 * -date        2019-01-22--20:04 @_@ ~~
 */
//配置异常处理通知(通知类型:异常通知)
@ControllerAdvice
public class BaseExceptionHandler {

  //指定出现什么异常执行该通知代码
  @ExceptionHandler(value = Exception.class)
  @ResponseBody
  public Result error(Exception e) {
    //打印异常信息到控制台(方便调试)
    e.printStackTrace();
    return new Result(false, StatusCode.ERROR, "失败! " + e.getMessage());
  }

}
