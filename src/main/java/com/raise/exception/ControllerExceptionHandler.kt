//package com.raise.exception
//
//import org.springframework.http.HttpStatus
//import org.springframework.web.bind.annotation.ControllerAdvice
//import org.springframework.web.bind.annotation.ExceptionHandler
//import org.springframework.web.bind.annotation.ResponseStatus
//import org.springframework.web.servlet.ModelAndView
//
///**
// * http://blog.csdn.net/cesul/article/details/38539343
// * 注意只能捕获Controller抛出的,插值器不行
// */
//@ControllerAdvice
//class ControllerExceptionHandler {
//
//    @ExceptionHandler(ReiseException::class)
//    @ResponseStatus(HttpStatus.OK)
//    fun handlerRaiseException(re: ReiseException) :ModelAndView{
//        println(re)
//        val m = ModelAndView()
//        m.addObject("msg", re.msg)
//        m.viewName = "error/500"
//        return m
//    }
//
//}