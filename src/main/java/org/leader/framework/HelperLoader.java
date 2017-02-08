package org.leader.framework;

import org.leader.framework.helper.BeanHelper;
import org.leader.framework.helper.ClassHelper;
import org.leader.framework.helper.ControllerHelper;
import org.leader.framework.helper.IocHelper;
import org.leader.framework.util.ClassUtil;

/**
 * 加载相应的Helper类
 *
 * @author ldh
 * @since 2017-02-05 23:28
 */
public final class HelperLoader {

    public static void init() {

        Class<?>[] classList = {ClassHelper.class, BeanHelper.class, IocHelper.class, ControllerHelper.class};

        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName(), false);
        }
    }
}
