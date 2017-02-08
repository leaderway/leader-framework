package org.leader.framework.proxy;

/**
 * 代理接口
 *
 * @author ldh
 * @since 2017-02-07 21:40
 */
public interface Proxy {

    /**
     * 执行链式代理
     * @param proxyChain
     * @return
     * @throws Throwable
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
