package org.leader.framework.annotation;

import java.lang.annotation.*;

/**
 * 服务类注解
 *
 * @author ldh
 * @since 2017-02-05 20:50
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    /**
     * 注解
     * @return
     */
    Class<? extends Annotation> value();
}
