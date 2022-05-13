# 实验报告
- [实验报告](#实验报告)
  - [实验报告8](#实验报告8)
    - [实验8过程](#实验8过程)
    - [实验8总结](#实验8总结)
  - [实验报告9](#实验报告9)
    - [实验9过程](#实验9过程)
    - [实验9总结](#实验9总结)

> 这个项目是用来保存 JavaEE 实验报告9及以后的代码，实验过程中有什么体会我也会写在这里。
>
> 每个实验报告的代码都简化过，因此不涉及到数据库，故可以直接运行。如需要数据库操作自行添加即可。
>
> 使用前将箭头所示处改为你的 tomcat。

![将这里改成你的tomcat](https://github.com/18852020292/JavaEE/raw/master/image/图片1.png)

## 实验报告8

Ajax

### 实验8过程

启动Tomcat后在地址栏输入[localhost:8080/Project8/project8/login.jsp](http://localhost:8080/Project8/project8/login.jsp)（注意第二个p是小写）

![login.jsp](https://github.com/18852020292/JavaEE/raw/master/image/图片3.png)

若输入的账号与密码相等则登录成功：

![loginSuccessful.jsp](https://github.com/18852020292/JavaEE/raw/master/image/图片4.png)

反之登录失败：

![loginFail.jsp](https://github.com/18852020292/JavaEE/raw/master/image/图片2.png)

### 实验8总结

建议使用现代的浏览器运行，如Edge，Chrome等等。

初始化浏览器内部对象时使用`var xmlhttp = new XMLHttpRequest();`

## 实验报告9

structs

### 实验9过程

启动Tomcat后在地址栏输入[localhost:8080/Project9/index.jsp](http://localhost:8080/Project9/index.jsp)

![index.jsp](https://github.com/18852020292/JavaEE/raw/master/image/图片5.png)

若输入的账号与密码相等则登录成功：

![loginSuccess.jsp](https://github.com/18852020292/JavaEE/raw/master/image/图片6.png)

反之则登录失败：

![loginFild.jsp](https://github.com/18852020292/JavaEE/raw/master/image/图片7.png)

### 实验9总结

新版IDEA已经抛弃structs1.x了，能跑起来已经不错了....，等以后学structs2吧。