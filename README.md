

1、利用MyBatis的Generator生成器自动生成实体类、DAO接口和Mapping映射文件。这样可以省去很多的功夫，将生成的代码copy到项目工程中即可。
  首先在本地建一个文件夹用来使用生成代码工具
  该文件夹下src目录用来存放生成的代码,generatorConfig.xml文件用来配置数据库连接表等配置信息,mybatis jar包,数据库连接jar包,代码生成jar包.

2、在该目录下打开(按shift,在该文件夹下右键)cmd窗口,运行下面指令

java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite
