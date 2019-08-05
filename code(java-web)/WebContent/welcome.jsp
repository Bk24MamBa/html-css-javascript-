<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>7.26</title>
</head>
<script src="jquery-3.4.1.js" type="text/javascript"></script>
<script>
    $(function () {
       $("#div-left").show(2000);
       $("#div-top").fadeIn(3000);
       $("#div-right").slideDown(2000);
       $("#div-bottom").slideDown(2000);
    });
</script>
<style type="text/css">
    *{
        margin: 0;
        padding: 0;
    }
    #div-left{
        width:400px;
        padding-left:0px;
        background-color: #b2d0ff;
        display: none;
    }
        #left-top{
            width: 400px;
            height: 240px;
            background-image:url("../pictures/kb1.png");
            background-size: cover;
        }
        #left-b{
            height: 707px;
        }
        ul>li{
            list-style-type: none;
            margin-top: 28px;
            font-size: 24px;
            margin-left: 15px;
        }
        a{
            text-decoration: none;
            color: white;
        }
        #kb2{
            width: 70px;
            height: 70px;
            border-radius: 50%;
            position: relative;
            left: 15px;
            top: 35px;
            border: solid 2px blue;
        }
        .b1{
            font-size: 24px;
            color: white;
            position:relative;
            left: 10px;
            top:50px;
            font-weight:400;
        }
    #div-top{
        width: 1520px;
        height: 240px;
        background-color: #b2d0ff;
        position: absolute;
        top: 0px;
        left: 400px;
        display: none;
    }
        #bk{
            font-size: 40px;
            color: #fff;
            padding-left: 100px;
            position: absolute;
            top:50px;
        }
        #top-2{
            font-size: 35px;
            position: absolute;
            top: 120px;
            left: 150px;
        }
    #div-right{
        width: 1520px;
        height: 600px;
        background-color: #f5ffdb;
        position: absolute;
        top: 240px;
        left: 400px;
        display: none;
    }
    #div-bottom{
        width: 1520px;
        height: 134px;
        background-color: #b2d0ff;
        position: absolute;
        top: 840px;
        left: 400px;
        display: none;
    }
</style>
<body>
   <div id="maxdiv">
       <div id="div-left">
           <div id="left-top">
               <div>
                   <a href="">
                       <img id="kb2" src="../pictures/user.png" alt="">
                   </a>
               </div>
               <div>
                   <b class="b1">BK MamBa</b>
                   <br>
                   <b class="b1">825251514@qq.com</b>
               </div>
           </div>
           <div id="left-b">
               <ul>
                   <li><a  href="/" target="_blank">Home - 主页</a></li>
                   <li><a  href="/tags">Tags - 标签</a></li>
                   <li><a  href="/projects">Github - 项目</a></li>
                   <li><a  href="/about">About - 关于我</a></li>
                   <li><a  href="/contact">Contact - 联系我</a></li>
                   <li><a  href="/categories">Categories - 目录</a></li>
               </ul>
           </div>
       </div>
       <div id="div-top">
           <b id="bk">BK MamBa</b>
           <b id="top-2">Just Do IT.</b>
       </div>
       <div id="div-right">

       </div>
       <div id="div-bottom">
            <p style="font-size: 24px;position: relative;top:10px;left:20px;">勤奋的程序猿，用心敲写明天</p>
            <br>
            <p style="font-size: 18px;position: relative;top:0px;left:20px;">@2019BK MamBa的个人博客</p>
            <p style="font-size: 18px;position: relative;top:10px;left:20px;">All rights reserved Powed by <a href="http://www.github.com/bk24mamba" style="color: #ff7d6c">BK MamBa</a>.</p>
       </div>
   </div>
</body>
</html>