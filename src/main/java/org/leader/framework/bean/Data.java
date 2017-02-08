package org.leader.framework.bean;

/**
 * 返回数据对象
 *
 * @author ldh
 * @since 2017-02-05 23:49
 */
public class Data {

    /**
     * 模型数据
     */
    private Object model;

    public Data(Object model) {
        this.model = model;
    }

    public Object getModel() {
        return model;
    }
}
