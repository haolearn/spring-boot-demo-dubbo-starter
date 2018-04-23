## spring-boot DEMO starter
### profile
- 支持properties文件：`application-{profile}.properties`
- 支持YAML（推荐采用此种方式）：`application.yaml`
	- 多个profile配置在单一yaml文件中，根据profile名调用
- profile名：dev,prod，其他如test，home，local，请参考dev自行定义
- 缺省profile: dev

### 打包
- prod: `mvn clean package -Dmaven.test.skip=true -Dprod -U`
- dev: `mvn clean package -Dmaven.test.skip=true -Ddev -U
- TODO`
### 启动方式
- 开发: 
```shell
mvn spring-boot:run -Dspring.profiles.active=dev 
```
- 运行exec.jar文件：
```shell
./some-exec.jar -Dspring.profiles.active=prod
```
- assembly打包tar.gz，解压后
```shell
# 启动
bin/start.sh -Dspring.profiles.active=prod
# 关闭
bin/stop.sh
```
- start.sh，stop.sh脚本需要修改
```
# start.sh 设置启动入口Main类名
# 设置唯一业务名
todo_unique_app_name 
```
### 日志
- 修改日志配置文件中的服务名配置：demo-app