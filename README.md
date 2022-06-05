# 实验报告
- [实验报告](#实验报告)
  - [实验报告8](#实验报告8)
    - [实验8过程](#实验8过程)
    - [实验8总结](#实验8总结)
  - [实验报告9](#实验报告9)
    - [实验9过程](#实验9过程)
    - [实验9总结](#实验9总结)
  - [实验报告10](#实验报告10)
    - [实验10过程](#实验10过程)
    - [实验10总结](#实验10总结)
    - [数据库](#数据库)
  - [实验报告11](#实验报告11)
      - [user](#user)
    - [实验报告11过程](#实验报告11过程)
    - [实验报告11总结](#实验报告11总结)
  - [实验报告12](#实验报告12)
    - [实验报告12过程](#实验报告12过程)
    - [实验报告12总结](#实验报告12总结)
  - [实验报告13](#实验报告13)
      - [user](#user-1)
    - [实验报告13过程](#实验报告13过程)
    - [实验报告13总结](#实验报告13总结)
> 这个项目是用来保存 JavaEE 实验报告9及以后的代码，实验过程中有什么体会我也会写在这里。
>
> 每个实验报告的代码都简化过，大部分涉及到数据库，故可以直接运行。如需要数据库操作自行添加即可。
>
> **为节省运行时间，不再默认运行所有项目，实验10及之前的项目请自行勾选，将下面的路径改为Project***即可
>
> ![勾选](https://fastly.jsdelivr.net/gh/Mr-188/Pictures@main/img/1654416381138image-20220605160613376.png)

运行环境：JDK1.8 Tomcat9.0



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

## 实验报告10

structs2

### 实验10过程

启动Tomcat后在地址栏输入[localhost:8080/Project10/login.jsp](http://localhost:8080/Project10/login.jsp)

![login.jsp](https://github.com/18852020292/JavaEE/raw/master/image/图片8.png)

若输入的账号与密码相等则登录成功：

![loginSuccess.jsp](https://github.com/18852020292/JavaEE/raw/master/image/图片6.png)

反之则登录失败：

![loginFild.jsp](https://github.com/18852020292/JavaEE/raw/master/image/图片7.png)

### 实验10总结

确实比struts1方便了许多。

### 数据库

数据库代码在这。

![数据库代码位置](https://github.com/18852020292/JavaEE/raw/master/image/图片9.png)

根据上面注释把这些改成自己的。

![数据库代码](https://github.com/18852020292/JavaEE/raw/master/image/图片11.png)

然后就可以用数据库了，记得把下面几行注释掉。

![image-20220521112806504](https://github.com/18852020292/JavaEE/raw/master/image/图片10.png)

## 实验报告11

hibernate

必须使用数据库。

案例数据库project：

####  user

| 序号 |    名称    | 描述 |     类型     |  键  | 为空 |   额外   | 默认值 |
| :--: | :--------: | :--: | :----------: | :--: | :--: | :------: | :----: |
|  1   | `account`  |      | varchar(255) |      |  NO  |          |        |
|  2   | `password` |      | varchar(255) |      | YES  |          |        |
|  3   |    `id`    |      |   int(11)    | PRI  |  NO  | 自动递增 |        |

其中id为主键并且自动递增是必须项。

修改文件hibernate.cfg.xml为自己的数据库和密码。

![修改文件](https://fastly.jsdelivr.net/gh/Mr-188/Pictures@main/img/1654415121130image-20220605154506526.png)

### 实验报告11过程

运行Project11/src/UserTest.java

![运行](https://fastly.jsdelivr.net/gh/Mr-188/Pictures@main/img/1654414641141image-20220605141532433.png)

运行结果：

运行前：

![运行前](https://fastly.jsdelivr.net/gh/Mr-188/Pictures@main/img/1654415301133image-20220605154803135.png)

运行后：

![运行结果](https://fastly.jsdelivr.net/gh/Mr-188/Pictures@main/img/1654415421136image-20220605154911642.png)

![运行后](https://fastly.jsdelivr.net/gh/Mr-188/Pictures@main/img/1654415361139image-20220605154845417.png)

### 实验报告11总结

4个静态方法增删改查可以自己在main方法里选用（默认全用），改和查之前先看看id对应数据是不是存在。

```
 /**
     * 添加用户
     * @param session
     */
    public static void add(Session session){
        User user = new User("admin", "admin");
        session.save(user);
        session.beginTransaction().commit();
    }

    /**
     * 删除用户
     * @param session
     */
    public static void delete(Session session){
        //要删除的用户id
        int id = 22;
        User user = session.get(User.class, id);
        session.delete(user);
        session.beginTransaction().commit();
    }

    /**
     * 更新用户
     * @param session
     */
    public static void update(Session session){
        //要修改的用户id
        int id = 19;
        User user = session.get(User.class, id);
        user.setAccount("123");
        session.update(user);
        session.beginTransaction().commit();
    }

    /**
     * 查询用户
     * @param session
     */
    public static void query(Session session){
        //要查询的用户id
        int id = 19;
        User user = (User) session.get(User.class, id);
        System.out.println("get：" + user.getAccount());
    }
```

## 实验报告12

基于spring设置延迟加载和非延迟加载

### 实验报告12过程

运行Project12/src/Test

![运行](https://fastly.jsdelivr.net/gh/Mr-188/Pictures@main/img/1654415661137image-20220605155328409.png)

运行结果：

![运行结构](https://fastly.jsdelivr.net/gh/Mr-188/Pictures@main/img/1654415721136image-20220605155413204.png)

### 实验报告12总结

两个对象，其中User1没有使用延迟，User2延迟执行。

![spring](https://fastly.jsdelivr.net/gh/Mr-188/Pictures@main/img/1654415781133image-20220605155452868.png)

User2在使用到时才初始化，而User1刚开始就初始化了。

```
 	    ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println("使用前");
        User2 user2 = (User2) context.getBean("User2");
```

## 实验报告13

ssh框架。

必须使用数据库。

案例数据库project：

####  user

| 序号 |    名称    | 描述 |     类型     |  键  | 为空 |   额外   | 默认值 |
| :--: | :--------: | :--: | :----------: | :--: | :--: | :------: | :----: |
|  1   | `account`  |      | varchar(255) |      |  NO  |          |        |
|  2   | `password` |      | varchar(255) |      | YES  |          |        |
|  3   |    `id`    |      |   int(11)    | PRI  |  NO  | 自动递增 |        |

其中id为主键并且自动递增是必须项。

修改resources/applicationContext.xml为自己的数据库密码与数据库名。

![修改](https://fastly.jsdelivr.net/gh/Mr-188/Pictures@main/img/1654415961140image-20220605155843341.png)

### 实验报告13过程

启动tomcat后，输入[localhost:8080/Project13/index.jsp](http://localhost:8080/Project13/index.jsp)

![运行](https://fastly.jsdelivr.net/gh/Mr-188/Pictures@main/img/1654416141135image-20220605160159321.png)

点击用户（查）

![用户](https://fastly.jsdelivr.net/gh/Mr-188/Pictures@main/img/1654416201142image-20220605160219638.png)

三个可点击项（增删改），都是可以用的。

### 实验报告13总结

没什么好说的，反之是可以直接运行的，想研究自己研究去吧。