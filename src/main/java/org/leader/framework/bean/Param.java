package org.leader.framework.bean;

import org.leader.framework.util.CastUtil;

import java.util.Map;

/**
 * 请求参数对象
 *
 * @author ldh
 * @since 2017-02-05 23:39
 */
public class Param {

    /**
     * 请求参数对象
     */
    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * 根据参数名获取long型参数值
     * @param name
     * @return
     */
    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    /**
     * 获取所有字段信息
     * @return
     */
    public Map<String, Object> getMap() {
        return paramMap;
    }
}
