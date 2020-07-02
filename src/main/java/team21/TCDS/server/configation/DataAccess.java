package team21.TCDS.server.configation;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import team21.TCDS.server.util.ConfigureReader;

import javax.sql.DataSource;
import java.io.File;

/**
 * <h2>服务器部分数据接入设置</h2>
 * <p>
 * 该配置类定义了服务器组件使用的MyBatis将如何链接数据库。如需更换其他数据库，请在此配置自己的数据源并替换原有数据源。
 * </p>
 *
 * @author 高级软件21组(team21)
 * @version 1.0
 */
@Configurable
public class DataAccess {
    private static Resource[] mapperFiles;
    private static Resource mybatisConfg;

    @Bean
    public DataSource dataSource() {
        final DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(ConfigureReader.instance().getFileNodePathDriver());
        ds.setUrl(ConfigureReader.instance().getFileNodePathURL());
        ds.setUsername(ConfigureReader.instance().getFileNodePathUserName());
        ds.setPassword(ConfigureReader.instance().getFileNodePathPassWord());
        return (DataSource) ds;
    }

    @Bean(name = {"sqlSessionFactory"})
    @Autowired
    public SqlSessionFactoryBean sqlSessionFactoryBean(final DataSource ds) {
        final SqlSessionFactoryBean ssf = new SqlSessionFactoryBean();
        ssf.setDataSource(ds);
        ssf.setConfigLocation(DataAccess.mybatisConfg);
        ssf.setMapperLocations(DataAccess.mapperFiles);
        return ssf;
    }

    // 扫描 mapper文件
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        final MapperScannerConfigurer msf = new MapperScannerConfigurer();
        msf.setBasePackage("team21.TCDS.server.mapper");
        msf.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return msf;
    }

    static {
        final String mybatisResourceFolder = ConfigureReader.instance().getPath() + File.separator + "mybatisResource"
                + File.separator;
        final String mapperFilesFolder = mybatisResourceFolder + "mapperXML" + File.separator;
        DataAccess.mapperFiles = new Resource[]{new FileSystemResource(mapperFilesFolder + "NodeMapper.xml"),
                new FileSystemResource(mapperFilesFolder + "FolderMapper.xml"),
                new FileSystemResource(mapperFilesFolder + "PropertiesMapper.xml")};
        DataAccess.mybatisConfg = (Resource) new FileSystemResource(mybatisResourceFolder + "mybatis.xml");
    }
}
