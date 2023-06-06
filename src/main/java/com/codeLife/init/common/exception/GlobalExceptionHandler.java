package com.codeLife.init.common.exception;

import com.codeLife.init.common.param.CodeMsg;
import com.codeLife.init.common.param.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public ResultData<Object> other(CustomException e) {
        log.error("自定义异常打印：{} ",e.getMessage(),e);
        return ResultData.fail(new CodeMsg(e.getCode(), e.getMsg()));
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultData<Object> other(Exception e) {
        log.error("全局异常打印：{} ",e.getMessage(),e);
        return ResultData.fail(CodeMsg.SERVER_ERROR);
    }
}