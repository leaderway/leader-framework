package org.leader.framework;

/**
 * 提供相关配置项常量
 *
 * @author ldh
 * @since 2017-02-05 19:41
 */
public interface ConfigConstant {

    String CONFIG_FILE = "leader.properties";

    String JDBC_DRIVER = "leader.framework.jdbc.driver";
    String JDBC_URL = "leader.framework.jdbc.url";
    String JDBC_USERNAME = "leader.framework.jdbc.username";
    String JDBC_PASSWORD = "leader.framework.jdbc.password";

    String APP_BASE_PACKAGE = "leader.framework.app.base_package";// 项目基础包名
    String APP_JSP_PATH = "leader.framework.app.jsp_path";// JSP基础路径
    String APP_ASSET_PATH = "leader.framework.app.asset_path";// 静态资源文件基础路径
}
