package multipledatasources.common;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


/**
 * 描述：生成First数据源的实体，Mapper，XML文件
 */
public class MainGenerator {
    private static Logger logger = null;
    public static void main(String[] args) throws URISyntaxException {
        InputStream is=null;
        try {
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
             is = classloader.getResourceAsStream("\\generator\\mybatis-generator.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(is);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        } catch (SQLException e) {
            logger.info("系统异常："+e);
        } catch (IOException e) {
            logger.info("系统异常："+e);
        } catch (InterruptedException e) {
            logger.info("系统异常："+e);
        } catch (InvalidConfigurationException e) {
            logger.info("系统异常："+e);
        } catch (XMLParserException e) {
            logger.info("系统异常："+e);
        }finally {
            if (is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                   logger.info("系统异常："+e);
                }
            }

        }
    }
}