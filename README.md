# ying
基于Java语言的分层应用框架
### 相关知识点
[Maven Archetype Plugin](https://maven.apache.org/archetype/maven-archetype-plugin/index.html)
[Maven Archetype模板开发](https://my.oschina.net/lujianing/blog/912028)

https://www.cnblogs.com/hafiz/p/5515388.html

功能定义：
1. api：作为服务接口直接对外提供服务，不引入任何依赖，越简单越好；
2. application：对api模块提供服务的实现。依赖api、service模块；
3. service：具体业务代码的实现，依赖manager、util模块；
4. dao：数据库操作模块；
5. manager：引用外部服务，如RPC；
6. util：工具类。

依赖关系：

### 使用
mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate -DarchetypeCatalog=https://raw.githubusercontent.com/codingXcong/ying/master/archetype-catalog.xml -DarchetypeRepository=https://raw.githubusercontent.com/codingXcong/ying/master/

通过mybatis-generator插件生成mapper层代码
mybatis-generator:generate -Dmybatis.generator.configurationFile=src/main/resources/generatorConfig.xml

https://www.jianshu.com/p/98a141701cc7