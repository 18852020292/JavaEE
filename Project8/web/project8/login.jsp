<%@ page contentType="text/html;charset=UTF-8" language="java"   %>
<!DOCTYPE html PUBLIC "-//w3c//DTD HTML 4.01 Transitional//EN">
<html>
<body>

<SCRIPT LANGUAGE="JavaScript">
    function login(){

        var name = document.loginFrom.name.value;
        var password = document.loginFrom.password.value;
        var xmlhttp = new XMLHttpRequest();

        var url = "Project8Servlet?name="+name+"&password="+password;
        xmlhttp.open("post",url,true);
        xmlhttp.onreadystatechange = function(){
            if(xmlhttp.readyState == 4) {
                console.log(xmlhttp.responseText);
                resultDiv.innerHTML = xmlhttp.responseText;
            }else
            {
                resultDiv.innerHTML += "登录中";
        }
        }
        xmlhttp.send();
    }
</SCRIPT>
欢迎登录本系统.<hr>
<div id = "resultDiv">
<form  name="loginFrom">
    请您输入账号:<input name = "name" type="text"><br>
    请您输入密码:<input name = "password" type = "password"><br>
    <input type="button" value="登录" onclick = "login()">
</form>
</div>
</body>
</html>
