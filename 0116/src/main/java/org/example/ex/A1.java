package org.example.ex;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
	어노테이션으로 생성.
	@Target(ElementType.METHOD) - 어딘가의 메서드에 '@A1'을 붙일 수 있게 됨.

 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface A1 {
}
