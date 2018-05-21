    大平台基础架构

    技术选型
    1、后端使用技术
        springframework4.3.7.RELEASE
        EhCache2.10.2
        mybatis3.4.1
        shiro1.3.2
        servlet3.1.0
        druid1.0.28
        slf4j1.7.19
        fastjson1.2.30
        velocity1.7
        quartz2.2.3
        mysql5.1.39
        
    前端使用技术
        Vue2.5.1
        iview
        layer3.0.3
        jquery2.2.4
        bootstrap3.3.7
        jqgrid5.1.1
        ztreev3.5.26

    platform-admin 
    后台管理

    platform-restful 
    提供REST风格接口

    platform-common 
    公共模块

    platform-framework 
    系统WEB合并模块
    
    platform-gen 
    代码生成

    platform-schedule 
    定时任务

    platform-shiro 
    登陆权限相关
    
    platform-vue 
    前端项目

    实现功能

    一：综合管理系统
        管理员列表
        角色管理
        部门管理
        菜单管理
        应用域管理
        文件上传
        系统参数
        系统日志
        
        SQL监控
        代码生成器
        
        定时任务
        
        短信服务平台
            安全起见，需配置有效IP地址。ApiSmsController.VALID_IP
            然后配置短信平台账户信息
		    向外提供发送短信接口：
		        http://域名:端口/api/sendSms?mobile=13000000000,15209831990&content=发送的短信内容
		
		开发环境配置：
			platform-admin/src/main/resources/dev/log4j.properties
			platform-admin/src/main/resources/dev/platform.properties
		开发环境打包：
			项目根目录>mvn package
		
		生产环境配置：
			platform-admin/src/main/resources/prod/log4j.properties
			platform-admin/src/main/resources/prod/platform.properties
		生产环境打包：
			项目根目录>mvn package -P prod
		
		打包路径：
			platform-framework\target\platform-framework.war
		
		
    后台管理项目演示
    演示地址：http://fly2you.cn/admin
    账号密码：admin/admin
    
    如何交流、反馈、参与贡献？
    官方QQ群：66502035
    git：https://gitee.com/feixiangni/platform
    如需获取项目最新源码，请Watch、Star项目，同时也是对项目最好的支持

	
### 登录页面
![](http://7xqbwh.dl1.z0.glb.clouddn.com/20171212/21131417147fdb.png "登录")
### 首页
![](http://7xqbwh.dl1.z0.glb.clouddn.com/20171124/0040351224717d.png "首页")
### 多系统切换
![](http://7xqbwh.dl1.z0.glb.clouddn.com/20171124/00384448918539.png "多系统切换")
### 角色授权
![](http://7xqbwh.dl1.z0.glb.clouddn.com/20171124/0040593234231c.png "角色授权")
### 短信发送
![](http://7xqbwh.dl1.z0.glb.clouddn.com/20180208/15333527921893.png "短信发送")
### 捐赠
![](http://7xqbwh.dl1.z0.glb.clouddn.com/20171124/0041155051171d.png "捐赠")