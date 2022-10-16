### 一、项目介绍

目前各医疗机构中，绝大部分中小型医疗机构内部没有实现任何信息化管理，医院临床信息，业务流程的数据依然采取纸质记录，造成数据容易丢失，对医院造成重大损失。

![1663329398371](https://github.com/TianWeiChang/hospital/blob/main/assets/1663329398371.png)

医院内部的挂号、收费、药房、药库、科室、病床的信息管理都存在缺漏，对患者的临床信息不能做到完整保存，高效查询，数据的容易出错、遗漏，造成换院治病难，医院不敢治，错过最佳治疗期等现状，对患者的治疗造成严重的影响。 

![1663329642212](https://github.com/TianWeiChang/hospital/blob/main/assets/1663329642212.png)



### 二、技术栈

医院管理系统的开发目标主要包括:

- 实现医院内部的挂号、收费、药房、药库、科室、病床的信息化管理。提供记录医院内部各类经营决策汇总和明细的月报表、年报表。
- 记录用户住院信息、医生信息、科室，药品，手术，病床信息等。
- 药房管理，药房报缺.
- 库房管理，入库信息及经办人，查询剩余库存，出库单，药房报缺后，从库房调取。

#### 2.1.Spring Boot开发构架介绍 

简介：Spring Boot是由Pivotal团队提供的全新框架，其设计目的是用来简化新Spring应用的初始搭建以及开发过程。该框架使用了特定的方式来进行配置，从而使开发人员不再需要定义样板化的配置。通过这种方式，Spring Boot致力于在蓬勃发展的快速应用开发领域(rapid application development)成为领导者。

1：使编码变得简单，Spring Boot采用 JavaConfig的方式，对Spring进行配置，并且提供了大量的注解，极大的提高了工作效率。

2：使配置变得简单,Spring Boot提供许多默认配置，当然也提供自定义配置，但是所有的SpringBoot的项目都只有一个配置文件：`application.properties/application.yml`。用了SpringBoot可以不用担心配置出错找不到问题所在，我们来看一下Spring Boot配置的图片

3：使部署变得简单，Spring Boot内置了三种`Servlet`容器，Tomcat，Jetty,undertow.我们只需要一个Java的运行环境就可以跑Spring Boot的项目了，Spring Boot的项目可以打成一个jar包，然后通过`Java  -jar xxx.jar`来运行（Spring Boot项目的入口是一个main方法，运行该方法即可）。

特点：

1：创立独立的Spring应用程序

2：嵌入的Tomcat，无需部署war文件

3：简化Maven配置

4：自动配置Spring

5：提供生产就绪功能，如指标，健康检查和外部配置

6：绝对没有代码生成和对XML没有配置要求

#### 2.2. MySQL数据库介绍 

MySQL 是瑞典的MySQL AB公司开发的一个可用于各种流行操作系统平台的关系数据库系统，它具有客户机/服务器体系结构的分布式数据库管理系统。MySQL 完全适用于网络，用其建造的数据库可在因特网上的任何地方访问，因此，可以和网络上任何地方的任何人共享数据库。MySQL具有功能强、使用简单、管理方 便、运行速度快、可靠性高、安全保密性强等优点。MySQL用C和C++编写，它可以工作在许多平台（Unix，Linux，Windows）上，提供了 针对不同编程语言(C,C++,JAVA等)的API函数；使用核心线程实现多线程，能够很好的支持多CPU；提供事务和非事务的存储机制；快速的基于线程的内存分配系统。

1)    .速度。MySQL 运行速度很快。开发者声称 MySQL 可能是目前能得到的最快的数据库。可访问 http://www.mysql.com/benchmark.html （MySQL Web 站点上的性能比较页），调查一下这个性能。

2).容易使用。MySQL 是一个高性能且相对简单的数据库系统，与一些更大系统的设置和管理相比，其复杂程度较低。

3).价格。MySQL 对多数个人用户来说是免费的。

4).小巧。4.1.1的数据库发行版仅仅只有21M，安装完成也仅仅51M。

5).支持查询语言。MySQL 可以利用 SQL（结构化查询语言），SQL 是一种所有现代数据库系统都选用的语言。也可以利用支持 ODBC（开放式数据库连接）的应用程序，ODBC 是 Microsoft 开发的一种数据库通信协议。

6).性能。许多客户机可同时连接到服务器。MySQL数据库没有用户数的限制，多个客户机可同时使用同一个数据库。可利用几个输入查询并查看结果的界面来交互 式地访问 MySQL。这些界面为：命令行客户机程序、Web 浏览器或 X Window System 客户机程序。此外，还有由各种语言（如C, C++, Eiffel, Java, Perl, PHP, Python, Ruby, and Tcl）编写的界面。因此，可以选择使用已编好的客户机程序或编写自己的客户机应用程序。

7).连接性和安全性。MySQL 是完全网络化的，其数据库可在因特网上的任何地方访问，因此，可以和任何地方的任何人共享数据库。而且 MySQL 还能进行访问控制，可以控制哪些人不能看到您的数据。

8).可移植性。MySQL 可运行在各种版本的 UNIX 以及其他非 UNIX 的系统（如 Windows 和 OS/2）上。MySQL 可运行在从家用 PC 到高级的服务器上。

#### 2.3 JAVA开发语言介绍

Java是由Sun Microsystems公司于1995年5月推出的Java面向对象程序设计语言和Java平台的总称。由James Gosling和同事们共同研发，并在1995年正式推出。

Java分为三个体系：

- JavaSE（J2SE）（Java2 Platform Standard Edition，java平台标准版）
-  JavaEE(J2EE)(Java 2 Platform,Enterprise Edition，java平台企业版)
-  JavaME(J2ME)(Java 2 Platform Micro Edition，java平台微型版)。

2005年6月，JavaOne大会召开，SUN公司公开Java SE 6。此时，Java的各种版本已经更名以取消其中的数字"2"：J2EE更名为Java EE, J2SE更名为Java SE，J2ME更名为Java ME。

 **Java语言是简单的：**

Java语言的语法与C语言和C++语言很接近，使得大多数程序员很容易学习和使用。另一方面，Java丢弃了C++中很少使用的、很难理解的、令人迷惑的那些特性，如操作符重载、多继承、自动的强制类型转换。特别地，Java语言不使用指针，而是引用。并提供了自动的废料收集，使得程序员不必为内存管理而担忧。

 **Java语言是面向对象的：**

Java语言提供类、接口和继承等面向对象的特性，为了简单起见，只支持类之间的单继承，但支持接口之间的多继承，并支持类与接口之间的实现机制（关键字为implements）。Java语言全面支持动态绑定，而C++语言只对虚函数使用动态绑定。总之，Java语言是一个纯的面向对象程序设计语言。

 **Java语言是分布式的：**

Java语言支持Internet应用的开发，在基本的Java应用编程接口中有一个网络应用编程接口（java net），它提供了用于网络应用编程的类库，包括URL、URLConnection、Socket、ServerSocket等。Java的RMI（远程方法激活）机制也是开发分布式应用的重要手段。

 **Java语言是健壮的：**

Java的强类型机制、异常处理、垃圾的自动收集等是Java程序健壮性的重要保证。对指针的丢弃是Java的明智选择。Java的安全检查机制使得Java更具健壮性。

 **Java语言是安全的：**

Java通常被用在网络环境中，为此，Java提供了一个安全机制以防恶意代码的攻击。除了Java语言具有的许多安全特性以外，Java对通过网络下载的类具有一个安全防范机制（类ClassLoader），如分配不同的名字空间以防替代本地的同名类、字节代码检查，并提供安全管理机制（类SecurityManager）让Java应用设置安全哨兵。

**Java语言是体系结构中立的：**

Java程序（后缀为java的文件）在Java平台上被编译为体系结构中立的字节码格式（后缀为class的文件），然后可以在实现这个Java平台的任何系统中运行。这种途径适合于异构的网络环境和软件的分发。

 **Java语言是可移植的：**

这种可移植性来源于体系结构中立性，另外，Java还严格规定了各个基本数据类型的长度。Java系统本身也具有很强的可移植性，Java编译器是用Java实现的，Java的运行环境是用ANSI C实现的。

 **Java语言是解释型的：**

如前所述，Java程序在Java平台上被编译为字节码格式，然后可以在实现这个Java平台的任何系统中运行。在运行时，Java平台中的Java解释器对这些字节码进行解释执行，执行过程中需要的类在联接阶段被载入到运行环境中。

 **Java是高性能的：**

与那些解释型的高级脚本语言相比，Java的确是高性能的。事实上，Java的运行速度随着JIT(Just-In-Time）编译器技术的发展越来越接近于C++。

 **Java语言是多线程的：**

在Java语言中，线程是一种特殊的对象，它必须由Thread类或其子（孙）类来创建。通常有两种方法来创建线程：其一，使用型构为Thread(Runnable)的构造子类将一个实现了Runnable接口的对象包装成一个线程，其二，从Thread类派生出子类并重写run方法，使用该子类创建的对象即为线程。值得注意的是Thread类已经实现了Runnable接口，因此，任何一个线程均有它的run方法，而run方法中包含了线程所要运行的代码。线程的活动由一组方法来控制。Java语言支持多个线程的同时执行，并提供多线程之间的同步机制（关键字为synchronized）。

 **Java语言是动态的：**

Java语言的设计目标之一是适应于动态变化的环境。Java程序需要的类能够动态地被载入到运行环境，也可以通过网络来载入所需要的类。这也有利于软件的升级。另外，Java中的类有一个运行时刻的表示，能进行运行时刻的类型检查。

#### 2.4. LayUI前端开发框架介绍 

 layui，是一款采用自身模块规范编写的前端 UI 框架，遵循原生 HTML/CSS/JS 的书写与组织形式，门槛极低，拿来即用。其外在极简，却又不失饱满的内在，体积轻盈，组件丰盈，从核心代码到 API 的每一处细节都经过精心雕琢，非常适合界面的快速开发。layui 首个版本发布于2016年秋，它区别于那些基于 [MVVM](https://baike.baidu.com/item/MVVM/96310) 底层的 UI 框架，却并非逆道而行，而是信奉返璞归真之道。准确地说，她更多是为服务端程序员量身定做，你无需涉足各种前端工具的复杂配置，只需面对浏览器本身，让一切你所需要的元素与交互，从这里信手拈来。 

#### 2.5. JavaScript前端开发技术介绍 

JavaScript是一种基于对象(Object)和事件驱动(Event Driven)并具有安全性能的脚本语言。它与Java不同：JavaScript主要用于HTML的页面，脚本嵌入在HTML的源码中；而Java是一个独立的、完整的编程语言，既可以在Web中应用，也可以用于与Web网无关的情况。另外，JavaS cript编写的程序不必在运行前编译，它们可以直接写入Web页面中并由调用它们的浏览器来解释执行。这样，一些基本交互作用就不用在服务器端完成，提高了客户端的响应时间。JavaScript的四个特点如下：

**简单性**：它是基于java基本语句和控制流之上的简单而紧凑的设计，是学习java的好过渡，而且，它的变量类型是采用弱类型，未采用严格的数据类型。

**安全性**：爪哇脚本（JAVA SCRIPT）不允许访问本地硬盘，不能将数据存入到服务器上，不允许对网络文档进行修改和删除，只能通过浏览器实现信息浏览或动态交互，从而有效的防止数据的丢失。

**动态性**：javascrpt可以直接对用户或客户输入做出响应，无须经过web程序。它对用户的响应采用以事件驱动的方式进行，即由某种操作动作引起相应的事件响应，如：点击鼠标、移动窗口、选择菜单等。

**跨平台性**：javascript依赖于浏览器本身，与操作环境无关。只要能运行浏览器的计算机，并安装了支持javascript的浏览器就可以正确执行，从而实现了“编写一次，走遍天下”的梦想。

#### 2.6. CSS3前端开发技术介绍 

CSS即[层叠样式表](https://www.baidu.com/s?wd=%E5%B1%82%E5%8F%A0%E6%A0%B7%E5%BC%8F%E8%A1%A8&tn=44039180_cpr&fenlei=mv6quAkxTZn0IZRqIHckPjm4nH00T1Y3nym1nW6sPHTdn1R1rj7h0ZwV5Hcvrjm3rH6sPfKWUMw85HfYnjn4nH6sgvPsT6KdThsqpZwYTjCEQLGCpyw9Uz4Bmy-bIi4WUvYETgN-TLwGUv3EnHRLP1RdP1T4rjb1PHmYPjRYn0)（Cascading StyleSheet）。 在[网页制作](https://www.baidu.com/s?wd=%E7%BD%91%E9%A1%B5%E5%88%B6%E4%BD%9C&tn=44039180_cpr&fenlei=mv6quAkxTZn0IZRqIHckPjm4nH00T1Y3nym1nW6sPHTdn1R1rj7h0ZwV5Hcvrjm3rH6sPfKWUMw85HfYnjn4nH6sgvPsT6KdThsqpZwYTjCEQLGCpyw9Uz4Bmy-bIi4WUvYETgN-TLwGUv3EnHRLP1RdP1T4rjb1PHmYPjRYn0)时采用[层叠样式表](https://www.baidu.com/s?wd=%E5%B1%82%E5%8F%A0%E6%A0%B7%E5%BC%8F%E8%A1%A8&tn=44039180_cpr&fenlei=mv6quAkxTZn0IZRqIHckPjm4nH00T1Y3nym1nW6sPHTdn1R1rj7h0ZwV5Hcvrjm3rH6sPfKWUMw85HfYnjn4nH6sgvPsT6KdThsqpZwYTjCEQLGCpyw9Uz4Bmy-bIi4WUvYETgN-TLwGUv3EnHRLP1RdP1T4rjb1PHmYPjRYn0)技术，可以有效地对页面的布局、字体、颜色、背景和其它效果实现更加精确的控制。 只要对相应的代码做一些简单的修改，就可以改变同一页面的不同部分，或者页数不同的网页的外观和格式。CSS3是CSS技术的升级版本，CSS3语言开发是朝着模块化发展的。以前的规范作为一个模块实在是太庞大而且比较复杂，所以，把它分解为一些小的模块，更多新的模块也被加入进来。这些模块包括： 盒子模型、列表模块、超链接方式 、语言模块 、背景和边框 、文字特效 、多栏布局等。

使用CSS可以减少开发与维护成本 提高页面性能。

#### 2.7 .HTM5前端开发技术介绍 

HTML5对于用户来说，提高了用户体验，加强了视觉感受。HTML5技术在移动端，能够让应用程序回归到网页，并对网页的功能进行扩展，用户不需要下载客户端或插件就能够观看视频、玩游戏，操作更加简单，用户体验更好。HTML5的视音频新技术解决了移动端苹果和安卓4.0+，对flash的支持问题。在视音频方面，性能表现比flash要更好。网页表现方面，HTML5中的CSS3特效样式、Canvas、webgl的介入，不仅加强了网页的视觉效果，甚至能够使用户在网页当中看到三维立体特效。

HTML5加强了视觉体验，在视频音频方面，性能表现比Flash要更好，网页表现方面，HTML5中的CSS3特效样式、Canvas、webgl的介入，不仅加强了网页的视觉效果，而且还可以让用户在网页中看到三维立体特效。

#### 2.8.shiro（java安全框架）

Apache Shiro是一个强大且易用的Java安全框架,执行身份验证、授权、密码和会话管理。使用Shiro的易于理解的API,您可以快速、轻松地获得任何应用程序,从最小的移动应用程序到最大的网络和企业应用程序。

**主要功能**

三个核心组件：Subject, SecurityManager 和 Realms.

Subject：即“当前操作用户”。但是，在Shiro中，Subject这一概念并不仅仅指人，也可以是第三方进程、后台帐户（Daemon Account）或其他类似事物。它仅仅意味着“当前跟软件交互的东西”。

Subject代表了当前用户的安全操作，SecurityManager则管理所有用户的安全操作。

SecurityManager：它是Shiro框架的核心，典型的Facade模式，Shiro通过SecurityManager来管理内部组件实例，并通过它来提供安全管理的各种服务。

Realm： Realm充当了Shiro与应用安全数据间的“桥梁”或者“连接器”。也就是说，当对用户执行认证（登录）和授权（访问控制）验证时，Shiro会从应用配置的Realm中查找用户及其权限信息。

从这个意义上讲，Realm实质上是一个安全相关的DAO：它封装了数据源的连接细节，并在需要时将相关数据提供给Shiro。当配置Shiro时，你必须至少指定一个Realm，用于认证和（或）授权。配置多个Realm是可以的，但是至少需要一个。

Shiro内置了可以连接大量安全数据源（又名目录）的Realm，如LDAP、关系数据库（JDBC）、类似INI的文本配置资源以及属性文件等。如果缺省的Realm不能满足需求，你还可以插入代表自定义数据源的自己的Realm实现。

#### 2.9. DRUID 阿里数据库连接池介绍 

1)可以监控数据库访问性能，Druid内置提供了一个功能强大的StatFilter插件，能够详细统计SQL的执行性能，这对于线上分析数据库访问性能有帮助。

2)数据库密码加密。直接把数据库密码写在配置文件中，这是不好的行为，容易导致安全问题。DruidDruiver和DruidDataSource都支持PasswordCallback。

3)SQL执行日志，Druid提供了不同的LogFilter，能够支持Common-Logging、Log4j和JdkLog，你可以按需要选择相应的LogFilter，监控你应用的数据库访问情况。

4)扩展JDBC，如果你要对JDBC层有编程的需求，可以通过Druid提供的Filter机制，很方便编写JDBC层的扩展插件。

 

### 三、数据库设计

创建数据库 hospital

#### 3.1.创建药品清单drugdictionary

```sql
CREATE TABLE `drugdictionary` (
  `drugId` int NOT NULL AUTO_INCREMENT,	-- 序号
  `drugName` varchar(50) NOT NULL,-- 药品名称
  `unitId` int NOT NULL, -- 计量单位
  `sellingPrice` double NOT NULL,-- 售价
  `areaId` int NOT NULL,-- 产地
  `typeId` int NOT NULL,-- 类型
   `exprationDate` int	Not null  -- 保质期 
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
```

#### 3.2.创建计量单位unit表（连接hospitaldata表unitId）

 ```sql
CREATE table unit(
unitId	int	Not null auto_increment	Primary key,-- 	序号
unitName	Varchar(50)	Not null	-- 单位
);
 ```

#### 3.3.产地area

 ```sql
CREATE table area(
areaId	int	Not null	auto_increment Primary key,	-- 序号
areaName	Varchar(50)	Not null	-- 产地
);
 ```

#### 3.4.类型type

 ```sql
CREATE table type(
typeId	int	Not null auto_increment	Primary key,	-- 序号
typeName	Varchar(50)	Not null		-- 类型
);
 ```

#### 3.5.门诊收费项目outpatienttype

 

#### 3.6.住院收费项目inoutpatienttype

 

#### 3.7.项目类别projecttype

 

#### 3.8.住院收费inhospitaltype

 

 

#### 3.9.科室departments

 

#### 3.10.医生doctor

 

#### 3.11.挂号类型registeredtype

 

#### 3.12.收费类型moneytype

 

#### 3.13床位bed

 

#### 3.14供货单位upplier

 

#### 3.15.库房warehuose

 

#### 3.16.药品仓库drugstore

 

 

#### 3.17.经办人skull

 

#### 3.18.药房pharmacy 

 

 

#### 3.19.挂号report

 

 

#### 3.20.门诊收费cashier

 

#### 3.21.住院登记register

 

 

#### 3.22.住院收费hospitalprice

 

#### 3.23预交金记录

 

#### 3.24外键

 

 

### 四．功能演示

#### 4.1门诊管理

##### 4.1.1挂号

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image002.jpg)

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image004.jpg)

 

##### 4.1.2选择挂号病人

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image006.jpg)

填写医生给患者诊查信息

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image008.jpg)

##### 4.1.3按照病因选择相应的药物

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image010.jpg)

如若有需要检查的项目

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image012.jpg)

##### 4.1.4选择相应的检查项目

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image014.jpg)

##### 4.1.5项目中有需要检查的项目与非检查项

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image016.jpg)

##### 4.1.6选择相应的患者

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image018.jpg)

##### 4.1.7开始收费

 

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image020.jpg)

##### 4.1.8为检查会有相应的状态

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image022.jpg)

##### 4.1.9检查过后填写病因

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image024.jpg)

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image026.jpg)

##### 4.1.10检查过后可以再次回到处方划价开取相应的药物

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image028.jpg)

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image030.jpg)

##### 4.1.11出院缴费

 

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image032.jpg)

##### 4.1.12选择患者进行药品取药

 

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image034.jpg)

##### 4.1.13门诊记录

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image036.jpg)

某一患者的详情记录

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image038.jpg)

#### 4.2住院管理

##### 4.2.1入院登记或从门诊转到住院

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image040.jpg)

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image042.jpg)

##### 4.2.2缴费管理

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image044.jpg)

预缴金会相应的增加

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image046.jpg)

 

##### 4.2.3药品记账

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image048.jpg)

##### 4.2.4手术项目记账 

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image050.jpg)

##### 4.2.5药房取药

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image052.jpg)

##### 4.2.6出院结算，会查询出所用费用，退下余额

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image054.jpg)

##### 4.2.7患者出院记录

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image056.jpg)

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image058.jpg)

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image060.jpg)

#### 4.3系统设置

##### 4.3.1用户管理

添加登陆用户，有默认密码，或选择可用不可用

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image062.jpg)

编辑

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image064.jpg)

##### 4.3.2重置密码

重置初始状态

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image066.jpg)

##### 4.3.3分配可用角色

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image068.jpg)

##### 4.3.4添加角色

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image070.jpg)

编辑

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image072.jpg)

##### 4.3.5给角色分配菜单

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image074.jpg)

##### 4.3.6菜单管理

点击相应的左侧菜单会进行查询

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image076.jpg)

3.7添加菜单

 

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image078.jpg)

 

#### 4.4统计管理

##### 4.4.4门诊月统计或根据时间查询

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image080.jpg)

##### 4.4.5住院月统计或根据时间查询

 

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image082.jpg)

##### 4.4.6门诊年统计

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image084.jpg)

##### 4.4.7住院年统计

 

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image086.jpg)

##### 4.4.8医生统计对比

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image088.jpg)

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image090.jpg)

#### 5.5排班管理

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image092.jpg)

#### 6.6数据中心

##### 4.6.1添加科室

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image094.jpg)

##### 4.6.2添加医生选择医生相应的科室

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image096.jpg)

##### 4.6.3药品生产地

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image098.jpg)

##### 4.6.4项目大类

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image100.jpg)

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image102.jpg)

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image104.jpg)

##### 4.6.5挂号类型

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image106.jpg)

##### 4.6.6经办人

药品入库的中间人，一个记录

##### 4.6.7药品计量单位

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image108.jpg)

##### 4.6.8供货商

  ![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image110.jpg)

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image112.jpg)



##### 4.6.9药品供货商

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image114.jpg)

##### 4.6.10药品字典

药品字典指的时仓库采药需要从药品字典中选取药品相当与药品采购单

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image116.jpg)

 

#### 7.7药房管理

##### 4.7.1查询所有从库房调来的药品

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image118.jpg)

##### 4.7.2根据药品的数量报缺

 ![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image118-1663328822877.jpg)



#### 8.8仓库管理

##### 4.8.1入库单

根据供货商选择存入库房

 

##### 4.8.2根据医院购药清单选择药品

##### ![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image120.jpg)

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image122.jpg)

##### 4.8.2查询入库药品

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image124.jpg)

##### 4.8.3出库单

根据药品选择出库

 

从仓库调到药房

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image126.jpg)

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image128.jpg)

##### 4.8.4库存不足

库存某医药品不足30时会相应的 提示

选择添加到库房采购

 

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image130.jpg)

##### 4.8.5过期提醒

药品保质期已过药品会进行提示销毁

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image132.jpg)

##### 4.8.6操作记录

查询药房的所有的药品信息，或根据模糊查询找到某一药品的信息

或者根据库存的数量进行药房库存报缺

 

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image134.jpg)

 

### 五、业务详情

 

#### 1、门诊管理 

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image136.jpg)

处理功能描述

##### 1.1门诊挂号

门诊当天挂号，填写患者姓名，性别，年龄，电话，身份证信息，选择挂号科室，根据科室查询出该科室的医生，挂号费等。

##### 1.2 药品划价

门诊划价包括药品划价，医技划价，选择划价患者，获取药房药品信息，获取药品的规格，单位，价格，药品类别(中药/西药)可以根据模糊查询查询药品信息，选择药品数量，若药品加错可以移除药品，医生检查后开出药品，病因等。 

##### 1.3项目划价

项目划价包括出诊费，输液费等信息，获取项目的规格，单位，价格，可以根据模糊查询查询项目信息，若项目加错可以移除项目等。

##### 1.4项目缴费

医生开完项目后，需要根据患者的项目内容去缴费，输入患者交付金额，根据键盘事件计算出结果。

##### 1.5项目检查

患者拿到项目单根据具体项目去检查 ，检查后填写病因，根据病因可以再次到药房划价。

##### 1.6药品缴费

缴费包括药品和项目的价格，选择患者信息，开始收费，药品费用(已经计算好的)，输入患者交付金额，根据键盘事件计算出结果。

##### 1.7药品出库

患者根据医生开取的药单缴过费用后，拿取药单到药房取药，根据查询选择患者之后，相应的药方会显示出来，选择出库。

##### 1.8患者库

已经就诊过后缴完费的患者信息，可以查询该患者所用的药品以及项目和检查结果。

#### 2、住院管理

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image138.jpg)

 

##### 2.1住院登记

填写患者资料，科室，医生，床位，登记时间，预交金等 ，或者从门诊部转到住院部，填写患者科室，根据科室寻找到相应的医生。登记后可以显示所登记的入院记录，或根据模糊查询查询该患者，患者有突发情况可以申请转科。

##### 2.2药品划价

医生根据患者的情况开取相应的药物，选择划价患者，获取药房药品信息，获取药品的规格，单位，价格，药品类别(中药/西药)可以根据模糊查询查询药品信息，选择药品数量，若药品加错可以移除药品，医生检查后开出药品，病因等。

##### 2.3项目划价

项目划价包括手术费，护理费费等信息，获取项目的规格，价格，可以根据模糊查询查询项目信息，若项目加错可以移除项目等。

##### 2.4预交金

预交金是患者手术费或药费等，如果费用不够 可以到预交处进行补缴或预先交付等情况，每次缴费都有缴费记录，可以根据查询来寻找某一患者的预交记录。

##### 2.5药品出库

患者根据医生开取的药单缴过费用后，拿取药单到药房取药，根据查询选择患者之后，相应的药方会显示出来，选择出库。

##### 2.6出院结算

选择患者信息，相应的床位，个人信息费用情况会显示出来，费用根据相应的社保比例扣除，结算后相应的信息情况会显示出来。

#### 3、系统管理

##### 3.1菜单管理

菜单管理，增加系统菜单，管理系统左边菜单，添加路径，图标，禁用启用菜单等，菜单管理页面是用frameset 标签两个页面集合而成，点击左边菜单，相应的右边表格会模糊查询。 

##### 3.2角色管理

角色管理，包括添加角色，修改角色，删除角色，系统中有不同的角色，每个角色分配的菜单不同，只有给角色分配菜单后，角色才有相应的菜单，分配菜单，给每个角色分配菜单需要先删除除原角色先前的菜单，然后给角色分配菜单，删除角色，根据角色的id删除角色后需要删除关联的角色的菜单表中的角色。

##### 3.3用户管理

添加用户，添加的用户是登陆系统的账户及用户信息，用户的密码为默认密码（可以进行修该），添加用户后需要给用户分配角色每个角色拥有的菜单不同，给用户分配角色后该用户会有相应的角色中的菜单权限，分配角色，给每个用户添加不同的角色后可以禁行修改，删除等操作，删除用户需要删除相应 分配的角色id。

##### 3.4数据源监控

数据源监控可以监控每个sql的运行信息，jdk,数据可版本等信息。

#### 4、统计管理

##### 4.1门诊年统计数据图

查询门诊年统计饼状图记录每年的财务情况

##### 4.2住院年统计数据图

查询住院年统计饼状图记录每年的财务情况

##### 4.3门诊月统计数据图

查询医院某一年每月的门诊统计情况，可以根据查询某一年的每月的收入统计

##### 4.4住院月统计数据图

查询医院某一年每月的住院统计情况，可以根据查询某一年的每月的收入统计

##### 4.5门诊每天的统计数据图

查询医院某一天每天的门诊统计情况，可以根据查询某一天的每天的收入统计，查看详细的项目统计或者药品统计。

#### 5、仓库管理

##### 5.1入库

首先选择供货商，根据数据中心的药品字典，从供货商采购相应的药品，首先根据采购清单获取某一药品的信息回显到文本框内，点击添加，需要填写每个药品相应的数量，判断生产日期不能大于当天，有限期不能小于当天，非空验证等

##### 5.2出库单

出库单指的是库房药品正常调到药房等一系列操作，选择某一与药品相应提示输入调取数量，如若库房数量小于正常输入数量，提示失败，否则正常出库。如若出库单有药品报缺可以直接点击紧急补给操作。

##### 5.3库存不足

仓库药品数量不足数量30时会提示请及时补充，添加到库房采购单

##### 5.4库存查询

查询入库的药品信息，数量等，如若某一系列出错可以进行编辑操作

##### 5.5过期提醒

如若药品过期会在过期提醒板块一一罗列出相应的过期药品，进行及时的销毁

##### 5.6操作记录

![img](https://github.com/TianWeiChang/hospital/blob/main/assets/clip_image140.jpg)

操作记录值得是药品的出库记录，或者说药房报缺，这是紧急报缺补给记录，入库记录等信息。 

#### 6、药房管理

##### 6.1药品查询

查询药房的所有的药品信息，或根据模糊查询找到某一药品的信息或者根据库存的数量进行药房库存报缺。

### 六、后期规划

#### 1、技术栈

- 加入Redis做数据缓存
- RabbitMQ做异步解耦

后期，对服务进行拆分，作成微服务：Spring Boot、Dubbo、Nacos、Sentinel....

#### 2、功能扩展


### 在线刷题

![在线刷题](https://mmbiz.qpic.cn/mmbiz_png/07BicZywOVtlO7E6oFZ4EGwxcx7Q1rrctf3fXWCPSCVibLe8icHIuibUIplt7whKh0ZWGD8CzyRa81NGw8Q8btdWHA/640?wx_fmt=png&wxfrom=5&wx_lazy=1&wx_co=1)

https://mmbiz.qpic.cn/mmbiz_png/07BicZywOVtlO7E6oFZ4EGwxcx7Q1rrctf3fXWCPSCVibLe8icHIuibUIplt7whKh0ZWGD8CzyRa81NGw8Q8btdWHA/640?wx_fmt=png&wxfrom=5&wx_lazy=1&wx_co=1