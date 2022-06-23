//package com.ck.config;
//
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
//import com.baomidou.mybatisplus.generator.config.rules.DbType;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//
///**
// * 自动生成映射工具类
// *
// * @author hubin
// */
//public class AutoGeneratorHelper {
//
//    /**
//     * <p>
//     * 测试 run 执行
//     * </p>
//     * <p>
//     * 更多使用查看 http://mp.baomidou.com
//     * </p>
//     */
//    public static void main(String[] args) {
//        AutoGenerator mpg = new AutoGenerator();
//
//        // 全局配置
//        GlobalConfig gc = new GlobalConfig();
//        gc.setOutputDir("D:/cache/");
//        gc.setFileOverride(true);
//        gc.setActiveRecord(true); // 开启 activeRecord 模式
//        gc.setEnableCache(false); // XML 二级缓存
//        gc.setBaseResultMap(true); // XML ResultMap
//        gc.setBaseColumnList(true); // XML columList
//        gc.setAuthor("zdp");
//
//        // 自定义文件命名，注意 %s 会自动填充表实体属性！
//        // gc.setMapperName("%sDao");
//        // gc.setXmlName("%sDao");
//        gc.setServiceName("I%sService");
//        gc.setServiceImplName("%sService");
//        gc.setControllerName("%sController");
////        gc.setSwagger2(true);//实体属性 Swagger2 注解
//        mpg.setGlobalConfig(gc);
//
//        // 数据源配置
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setDbType(DbType.MYSQL);
//        dsc.setTypeConvert(new MySqlTypeConvert());
//        dsc.setDriverName("com.mysql.jdbc.Driver");
//        dsc.setUsername("sme");
//        dsc.setPassword("JyritbdhTNtB8JKE");
//        dsc.setUrl("jdbc:mysql://192.168.2.200:3306/carbon-ss-user?useUnicode=true&characterEncoding=UTF-8");
//        mpg.setDataSource(dsc);
//
//        // 策略配置
//        StrategyConfig strategy = new StrategyConfig();
////        strategy.setTablePrefix("t_"); // 此处可以修改为您的表前缀
//        strategy.setNaming(NamingStrategy.underline_to_camel); // 表名生成策略
////        strategy.setFieldPrefix("C_"); //提出字段前缀
//        strategy.setEntityLombokModel(true);//自动支持Lombok注解
//        strategy.setSuperEntityClass("com.pinlan.model.entity.baseEntity");//设置公共实体
////        strategy.setCapitalMode(true); // 全局大写命名 ORACLE 注意
////        strategy.setExclude(new String[]{"test"}); // 排除生成的表
////        strategy.setEntityBuilderModel(true); // 【实体】是否为构建者模型（默认 false）
//        // controller类是否直接返回json
//        strategy.setRestControllerStyle(true);//设置控制层返回JSON
////        strategy.setSuperServiceImplClass("com.pinlan.model.service.impl");
//        mpg.setStrategy(strategy);
//
//        // 包配置
//        PackageConfig pc = new PackageConfig();
//        pc.setModuleName("model");
//        pc.setParent("com.pinlan"); // 自定义包路径
//        pc.setController("controller"); // 这里是控制器包名，默认 web
//        mpg.setPackageInfo(pc);
//        // 执行生成
//        mpg.execute();
//    }
//
//}
