
# Eclipse快捷键
## ctrl+shift+c 注释光标所选定行
## alt+/ 内容提示
## ctrl+alt+下箭头  快速向下复制
## shift+alt+a  块编辑
## shift+alt+L 自动定义变量
## shift+回车键 快速到下一行
## shift+alt+s 菜单对话框  
## ctrl+D 删除光标所在的整行

***
# JavaWeb  
## jsp
可写java代码的html文件  
**jsp->java(servlet文件)->class（可执行文件）**
![](pictures/_20190729173139.png)
![](pictures/_20190729175214.png)
![](pictures/_20190729180458.png)
![](pictures/_20190729201120.png)
![](pictures/_20190729202004.png)
![](pictures/_20190729204811.png)
![](pictures/_20190729204544.png)
## 转发与重定向
![](pictures/_20190729211551.png)
![](pictures/_20190729211353.png)
**转发是request对象的方法，而重定向是response的方法。**
## session对象
![](pictures/_20190729214355.png)
注意：1.获取Cookie只能获取所有cookie，即用getCookies（）方法；  
2.添加cookie是在response对象添加，而获取cookies是在request对象获取
![](pictures/_20190729214837.png)
![](pictures/_20190730194557.png)
![](pictures/_20190730194524.png)
![](pictures/_20190730194309.png)
![](pictures/_20190730233645.png)
**request.getParameter("name")此处的name应该是html中标签的name属性的值，而不是id属性的值**
![](pictures/_20190801003314.png)
## application对象
![](pictures/_20190801004530.png)
## 四种范围对象
![](pictures/_20190801125803.png)
![](pictures/_20190801131758.png)
## 数据库
![](pictures/_20190801133218.png)
![](pictures/_20190801141227.png)
![](pictures/_20190801192956.png)
![](pictures/_20190801195136.png)
![](pictures/_20190801195529.png)
![](pictures/_20190802171836.png)
![](pictures/_20190802171735.png)
![](pictures/_20190802173825.png)
![](pictures/_20190802173915.png)
![](pictures/_20190802223409.png)
![](pictures/_20190802235833.png)
## JavaBean
![](pictures/_20190803012458.png)
# 8.3 实战jsp访问数据库
## MVC模式
![](pictures/_20190803215654.png)
![](pictures/_20190803220524.png)
![](pictures/_20190803221029.png)
![](pictures/_20190803222047.png)
## Servlet生命周期
![](pictures/_20190804113042.png)
![](pictures/_20190804173644.png)
![](pictures/_20190804174443.png)
## Servlet总结：在Eclipse中的src创建一个Servlet，然后重写doGet（），doPost（）即可（doGet（），doPost（）只需写一个，另一个调用该方法即可）
**MVC案例**
![](pictures/_20190804190653.png)
## 三层架构
![](pictures/_20190804223524.png)
![](pictures/_20190804224146.png)
## MVC与三层架构的关系
![](pictures/_20190804223326.png)
# 8.6三层架构实战
**Student student=null;此处声明student类的时候必须声明为null，而不是new Student（），否则return的student将会是空的！**  
**int b=Integer.parseInt（String a）将字符a转为整形b**
## Debug
![](pictures/_20190807150542.png)
点击最左边 可跳过所有断点，相当于正常模式执行
### 双击行数前面设置断点
### F6单步执行
### F8单步跳过
![](pictures/_20190807150401.png)
## 代码优化
![](pictures/_20190807150813.png)
**DBUtil(通用数据库帮助类)：提取相同的代码，减少代码量，减少代码冗余，简化Dao层的代码量，一般写在xxx.Util包中**。
## 乱码问题--解决方法
![](pictures/_20190809115020.png)
## 文件上传与下载
![](pictures/_20190809151543.png)
![](pictures/_20190809153121.png) 
### 下载文件名乱码问题
![](pictures/_20190811140001.png)
## EL表达式
![](pictures/_20190811141543.png)
![](pictures/_20190811143016.png)
![](pictures/_20190811143622.png)
## JSTL
![](pictures/_20190812144252.png)
![](pictures/_20190812145432.png)
![](pictures/_20190812151725.png)  
迭代标签<c: foreach>
```<c: foreach begin="0" end="5" step="1">  
	从0到5依次加一 共执行6次
</c: foreach>```
![](pictures/_20190812155406.png)
## 过滤器
![](pictures/_20190812171847.png)
![](pictures/_20190812172030.png)
![](pictures/_20190812171653.png)
## 监听器
![](pictures/_20190812195624.png)
### session的四种状态（绑定、解绑、钝化、活化）
![](pictures/_20190813004751.png)
![](pictures/_20190813125144.png)
### 钝化配置
    <Manager classname="org.apache.catalina.session.PersistentManager" maxIdleSwap="3">//三秒不操作则进行钝化操作，将session从内存存到硬盘MB目录中
    	<Store classname="org.apache.catalina.session.FileStore" directory="MB"/>
    </Manager>
## Ajax
**异步刷新js和xml**  
**异步刷新：如果一个网页中只有某个地方需要修改（百度搜索栏提示/视频点赞等），异步刷新可以使得网页只有一部分被修改，而其他地方不变，不需要刷新整个页面。**
![](pictures/_20190813160828.png)
![](pictures/_20190813173249.png)
![](pictures/_20190813173050.png)
实战：phone.jsp PhoneServlet.java
![](pictures/)
![](pictures/)
![](pictures/)
![](pictures/)
![](pictures/)
![](pictures/)
![](pictures/)
