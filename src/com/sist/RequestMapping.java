package com.sist;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// ��� ==> CLASS , SOURCE , RUNTIME
// ��� ==> ������ 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
// @RequestMapping("a.do")
public @interface RequestMapping {
  public String value();
}
