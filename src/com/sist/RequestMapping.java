package com.sist;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 기억 ==> CLASS , SOURCE , RUNTIME
// 대상 ==> 구분자 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
// @RequestMapping("a.do")
public @interface RequestMapping {
  public String value();
}
