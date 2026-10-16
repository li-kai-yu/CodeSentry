package com.codesentry.common.aop;

import java.lang.annotation.*;

/**
 * 操作日志注解，标记在类或方法上以启用 AOP 日志记录。
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperationLog {
}
