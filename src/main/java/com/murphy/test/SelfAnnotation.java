package com.murphy.test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by 29513 on 2017/8/4.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SelfAnnotation {
    String name();
}
