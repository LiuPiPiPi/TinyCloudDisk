# SS-TCDS-SUM-1.0(E)软件用户手册

| 项目编号: 

《TinyCloudDiskSystem-微云盘系统》 |
| :--- |
| 软件用户手册
Version: 1.0

项目承担部门：文档小组                
撰写人（签名）：刘碧豪
完 成 日 期：2020.6.28
本文档使用部门： ■主管领导     ■项目组 
□客户（市场）  □维护人员  □用户 
评审负责人（签名）：    |

目  录
[1. 引言	4](#_Toc13906)
[1.1. 标识	4](#_Toc20742)
[1.2. 系统概述	4](#_Toc22293)
[1.3. 文档概述	5](#_Toc20566)
[2. 引用文件	6](#_Toc22644)
[3. 软件综述	7](#_Toc25064)
[3.1. 软件应用	7](#_Toc10193)
[3.2. 软件清单	7](#_Toc6200)
[3.3. 软件环境	8](#_Toc1491)
[3.4. 软件组织和操作概述	8](#_Toc12542)
[3.5. 意外事故以及运行的备用状态和方式	15](#_Toc570)
[3.6. 保密性和私密性	15](#_Toc19008)
[3.7. 帮助和问题报告	15](#_Toc25387)
[4. 访问软件	16](#_Toc6369)
[4.1. 软件的首次用户	16](#_Toc15373)
[4.1.1. 熟悉设备	16](#_Toc29837)
[4.1.2. 访问控制	16](#_Toc22580)
[4.1.3. 安装和设置	16](#_Toc27707)
[4.2. 启动过程	16](#_Toc32740)
[4.3. 停止和挂起工作	16](#_Toc28576)
[5. 使用软件指南	17](#_Toc4726)
[5.1. 能力	17](#_Toc15681)
[5.2. 约定	33](#_Toc1706)
[5.3. 处理过程	33](#_Toc517)
[5.4. 相关处理	35](#_Toc10847)
[5.5. 数据备份	35](#_Toc15997)
[5.6. 错误，故障和紧急情况时的恢复	35](#_Toc1362)
[5.7. 消息	35](#_Toc26422)
[5.8. 快速引用指南	36](#_Toc7827)
[6. 注解	36](#_Toc8401)
[7. 附录	37](#_Toc8904)


# 引言
## 标识
中文名称：《软件用户手册》。
英文名称：“Software User Manual（SUM）”。
文档版本：“1.0”。
文档编号：“SS-TCDS-SUM-1.0(E)”。
TCDS(Tiny Cloud Disk System)-微云盘系统
## 系统概述
本文档适用于“微云盘系统”项目的软件设计说明。微云盘系统项目由项目小组提出，并负责具体实施，该项目标识号为“SS-TCDS”，其软件产品版本号为“1.0”，包括三个内部版本，分别是0.1版、0.2版和0.3版。
微云盘系统是一个适用于个人、团队或小型组织的在线云盘系统，用户可以注册账号进行登录。系统提供了个人信息设置，包括用户头像，昵称，电话号码，qq微信账号等；购买，发布二手商品，收藏或者取消收藏二手商品，浏览首页商品信息，查看已收藏商品等功能。本系统还包含：设定商品分类，例如设定生活用品，书籍学习等类别，若存在二级分类还可以进一步进行设定；再编辑已发布的商品，例如重新编辑商品的价格，分类等，使用户可以根据自身需求及时调整。系统的各个模块操作界面简单、实用，美观，让用户可以在最短的时间内掌握软件的使用方法。项目的需方为西北工业大学，用户为需要使用二手交易平台的西工大内部人员。
## 文档概述
本文档依据国家标准《GBT 8567-2006》制定，属于开发文档，仅限于项目小组和项目相关人员阅读。本文档旨在帮助进销存管理系统的用户正确使用系统，本系统的用户为西工大学生。本手册将指导用户进行登陆、绑定翱翔门户、设置个人信息、对已收藏商品进行管理、对已发布商品进行管理、浏览货架、发布商品等操作。能够方便用户了解本系统的诸多性能及相对应的使用方法。
## 基线
| 功能类别 | 功能名称、标识符 | 描述 |
| --- | --- | --- |
| 登录/注册/登出 | 注册 | 用户通过翱翔门户的账号，密码进行注册。 |
|  | 登录 | 用户可以通过翱翔门户的账号密码进行登录。 |
|  | 登出 | 用户点击退出按钮退出登录。 |
| 个人信息 | 个人信息的设置 | 用户可以设置头像，昵称，电话号码，qq号，微信号。 |
|  | 查看收藏商品 | 用户可以查看已收藏的商品，包括商品标题等，收藏的商品按时间排序。 |
|  | 意见反馈 | 用户可对交易平台本身的设计内容等提出意见，或者对平台出现的bug进行反馈。 |
| 首页展示 | 浏览货架 | 用户可以浏览首页展出的商品信息。 |
|  | 查看二手商品的详细信息 | 用户可以通过点击商品，查看商品的详细信息，并对商品进行评论。 |
|  | 首页搜索 | 用户可以通过在搜索框内输入商品信息进行搜索。 |
| 发布二手商品 | 发布二手商品 | 用户可以发布二手商品，包括商品的图片，价格，可面交校区等。 |
|  | 删除已发布的商品 | 用户可以对已发布的商品进行删除。 |
|  | 对已发布商品的再编辑 | 用户可以对已发布的商品进行再编辑，例如价格，分类等。 |
|  | 购买二手商品 | 用户可以购买平台上的二手商品。 |
| 收藏二手商品 | 收藏二手商品 | 用户可以收藏自己感兴趣的二手商品。 |
|  | 取消收藏 | 用户可以取消已收藏的二手商品，在取消时需要选择取消原因。 |
| 设定分类 | 设定商品分类 | 可以设定商品的分类，例如生活用品，书籍学习，数码产品，服装箱包等，如果存在二级分类则进一步进行分类。 |



# 引用文件
| 编号 | 标题 | 编写单位 |
| --- | --- | --- |
| 1 | 《GB/T 8567-2006》 | 中国国家标准化管理委员会等 |
| 2  | 《软件工程基础》 | 武君胜 |
| 3 | 《实用软件文档写作》 | 肖刚 |
| 4 | 《软件设计说明书》 | 项目小组联合编写 |
| 5 | 《软件开发计划（Excel）》 | 项目小组联合编写 |

# 软件综述
## 软件应用
本项目的类型为新产品，旨在为学校开发一个完整的二手交易平台。目前很多大学每年临近毕业季，都会举办形式上类似“跳蚤市场”的线下交易市场，由此可见学生对于线下交易是有较大的需求的，然而线下交易的时间往往比较短暂，且能展示的商品有限，对于学生而言不够方便。针对这种情况，需要设计一个专门为学校内部人员量身打造的二手交易平台，以提高学校内部交易的效率，力求改善线下交易的短暂性、不完整性，尽量满足学生的需求，为学生出售、购买弃置的二手商品提供便利，同时也使得学校尽早进入快捷、高效的信息化时代。
实现访问的网址为：m.biologyscience.cn         二维码如下：
![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812713387-5e5b7837-613a-478f-bbd3-3e94e5dedf36.png#align=left&display=inline&height=260&margin=%5Bobject%20Object%5D&originHeight=402&originWidth=437&status=done&style=none&width=283)
## 软件清单与之前文档中内容的对应
NSTP1.0.rar  抛瓜-西工大二手交易平台web项目源代码
NSTP.sql  抛瓜-西工大二手交易平台web项目数据库
NSTP1.0.war 抛瓜-西工大二手交易平台web应用程序
## 软件环境
硬件要求：128M以上内存，支持标准网络协议的网卡；
操作系统：Android 5.0以上；ios 7.1以上；
数据库访问：mongoDB；
网络环境：100MB广域网。
## 软件组织和操作概述

1. 用户功能
1. 个人信息管理：
   1. 登陆：
3. 输入翱翔门户学号、密码；
3. 点击登陆按钮；
3. 如果输入用户信息错误，提示“账号或密码错误”；
3. 如果输入用户信息正确，提示“登陆成功”
3. 登陆成功后进入货架界面，可以浏览货架中商品标题、发布时间等信息。
   1. 个人信息设置
      1. 用户名/头像设置
8. 点击页面下方导航栏右侧“我的”图标，进入个人信息页面。
8. 点击头像下方的“相机”按钮，进入修改头像和用户名界面。
8. 点击头像的圆框，可从手机存储空间内选择图片作为头像。
8. 点击任意图片，系统会自动调整图片比例，并在头像圆框中显示缩略图。
8. 点击用户名文本框，可输入任意字符作为用户名。
8. 点击“跳过”，可以取消保存本次修改，并返回货架界面。
8. 点击“保存”，可以保存本次用户名/头像修改。
   - 

      1. 手机号/QQ号/微信号设置
15. 点击页面下方导航栏右侧“我的”图标，，进入个人信息页面。
15. 点击“个人信息”，进入个人信息详细页面。
15. 点击“电话”图标右侧文本框，输入任意11位字符串可以设置电话号。
15. 点击“微信”图标右侧文本框，输入任意20位内字符串可以设置微信号。
15. 点击“QQ”图标右侧文本框，输入任意15位内字符串可以设置微信号。
15. 点击“保存”，返回个人信息页面，提示“修改成功”。
15. 如果设置的手机号/QQ号/微信号不符合预设的输入格式，提示“手机号无效”/“QQ号无效”/“微信号无效”，并返回个人信息详细页面。
   1. 意见反馈
22. 点击页面下方导航栏右侧“我的”图标，进入个人信息页面。
22. 点击“意见反馈”，进入意见反馈详细页面。
22. 点击复选框左侧的“产品意见”，可以反馈对产品的意见。
22. 点击复选框右侧的“bug反馈”，可以反馈使用过程中遇到的bug。
22. 点击页面中部的文本框，可以输入任意字符，字数上限为200字。
22. 点击提交可以反馈以上填写的信息。
   1. 已发布管理
28. 点击页面下方导航栏右侧“我的”图标，进入个人信息页面。
28. 点击“我的发布”，查看已发布商品，显示商品图片、标题、分类、价格。
28. 点击已发布商品中的任意一个，进入商品详细信息页面。
28. 点击“编辑”按钮，进入编辑商品页面。
28. 点击“擦亮”按钮，商品的发布时间会更新至被擦亮时间，被擦亮的商品会移动至“我发布的”页面最顶端，商品在货架首页上的显示会移动到最上方。
28. 点击“删除”按钮，提示删除成功，商品在系统中被删除，在货架上不再显示。
   1. 已收藏管理
34. 点击页面下方导航栏右侧“我的”图标，进入个人信息界面。
34. 点击“我的收藏”，查看已收藏商品，显示商品图片、标题、分类、价格。
34. 点击已发布商品中的任意一个，进入商品详细信息页面。
34. 点击价格右侧“⭐”，可以取消收藏，点击后商品从“我收藏的”页面中不再显示。
34. 货架管理
   1. 浏览商品
39. 点击页面下方导航栏左侧“货架”图标，进入货架页面。
39. 文本“最新鲜”下方显示商品信息，每次显示10个商品。
39. 浏览商品到页面最低端时，向上滑动可以再显示10件商品。
39. 再货架页面最顶端时，向上滑动可以刷新货架页面显示的商品。
39. 点击货架页面的商品，可以显示商品详细信息。
39. 进入商品详细信息页面后，可以查看商品发布者的用户名、发布校区、发布时间、商品标题、商品描述、商品图片、发布者手机号、发布者微信号、发布者QQ号。
39. 点击“生活用品”，可以显示分类为“生活用品”的商品信息。
39. 点击“书籍学习”，可以显示分类为“书籍学习”的商品信息。
39. 点击“数码产品”，可以显示分类为“数码产品”的商品信息。
39. 点击“服装鞋包”，可以显示分类为“服装鞋包”的商品信息。
39. 点击“好吃的”，可以显示分类为“好吃的”的商品信息。
39. 点击“美妆美护”，可以显示分类为“美妆美护”的商品信息。
39. 点击“求购”，可以显示分类为“求购”的商品信息。
39. 进入任意分类页面后，点击页面上方左侧“全部校区”复选框，点击“友谊校区”或“长安校区”，可以进一步筛选发布校区。
39. 进入任意分类页面后，点击页面上方右侧复选框，点击选择其他分类，可以查看其他分类。
   1. 查看商品详细信息
54. 点击页面下方导航栏左侧“货架”图标，进入货架页面。
54. 点击货架页面的商品，可以显示商品详细信息。
54. 进入商品详细信息页面后，可以查看商品发布者的用户名、发布校区、发布时间、商品标题、商品描述、商品图片、发布者手机号、发布者微信号、发布者QQ号。
54. 商品详细页面左下角的”⭐“标志表示商品是否被用户收藏，如果”⭐“内部为白色，则表示未收藏；如果”⭐“内部为红色，则表示已收藏。
54. 如果尚未收藏，点击左下角”⭐“，当”⭐“内部变为红色，表示商品已被收藏；如果已收藏，点击左下角”⭐“，当”⭐“内部变为白色，表示商品已取消收藏。
54. 点击手机号/QQ号/微信号右侧的”复制“按钮，可以复制发布者的手机号/QQ号/微信号。
   1. 搜索功能
60. 点击页面下方导航栏左侧“货架”图标，进入货架页面。
60. 点击货架页面中间搜索框，输入搜索关键字。
60. 货架按照发布时间排序，显示带有关键字的商品。
60. 发布管理
60. 点击页面下方导航栏中间“+”图标，进入发布页面。
60. 点击”取一个标题......“文本框，可以输入商品标题，字数限制为15字。
60. 点击”详细介绍......“文本框，可以输入商品详细信息，字数限制为200字。
60. 点击中间”+“图标，可以从手机存储中选择图片，添加到商品图片中。
60. 点击”价格“右侧文本框，可以输入数字，设置商品具体定价。
60. 点击”分类“右侧复选框，可以选择分类，设置商品具体分类；分类是选填项。
60. 点击”可面交校区“右侧复选框，可以选择校区，设置商品发布校区。
60. 点击”手机号“或”QQ号“或”微信号“右侧文本框，可以设置发布者的手机号、QQ号、微信号，手机号、QQ号、微信号是选填项。
60. 点击页面下方发布按钮，可以发布商品。
60. 如果未填写标题，显示信息”未输入标题“，商品无法成功发布。
60. 如果未填写介绍，显示信息”未输入介绍“，商品无法成功发布。
60. 如果未添加图片，显示信息”未添加图片“，商品无法成功发布。
60. 如果未填写价格，显示信息”未输入价格“，商品无法成功发布。
60. 如果未选择校区，显示信息”未添加校区“，商品无法成功发布。
60. 在发布页面点击返回键，显示”确认退出“选择框。
60. 在选择框”确认退出“中，点击“取消”按钮，回到发布页面，原本填写的商品信息未被清空。
60. 在选择框”确认退出“中，点击“确定”按钮，回到货架页面，原本填写的商品信息被清空。
60. 发布成功后，显示提示信息”闲置物品若5天内未被‘擦亮’，买家可能会看不见。记得常去”我的发布“中擦亮你的闲置哦“。



VI软件运行表

| 功能类别 | 功能名称、标识符 | 描述 |
| --- | --- | --- |
| 登录/注册/登出 | 注册 | 用户通过翱翔门户的账号，密码进行注册。 |
|  | 登录 | 用户可以通过翱翔门户的账号密码进行登录。 |
|  | 登出 | 用户点击退出按钮退出登录。 |
| 个人信息 | 个人信息的设置 | 用户可以设置头像，昵称，电话号码，qq号，微信号。 |
|  | 查看收藏商品 | 用户可以查看已收藏的商品，包括商品标题等，收藏的商品按时间排序。 |
|  | 意见反馈 | 用户可对交易平台本身的设计内容等提出意见，或者对平台出现的bug进行反馈。 |
| 首页展示 | 浏览货架 | 用户可以浏览首页展出的商品信息。 |
|  | 查看二手商品的详细信息 | 用户可以通过点击商品，查看商品的详细信息，并对商品进行评论。 |
|  | 首页搜索 | 用户可以通过在搜索框内输入商品信息进行搜索。 |
| 发布二手商品 | 发布二手商品 | 用户可以发布二手商品，包括商品的图片，价格，可面交校区等。 |
|  | 删除已发布的商品 | 用户可以对已发布的商品进行删除。 |
|  | 对已发布商品的再编辑 | 用户可以对已发布的商品进行再编辑，例如价格，分类等。 |
|  | 购买二手商品 | 用户可以购买平台上的二手商品。 |
| 收藏二手商品 | 收藏二手商品 | 用户可以收藏自己感兴趣的二手商品。 |
|  | 取消收藏 | 用户可以取消已收藏的二手商品，在取消时需要选择取消原因。 |
| 设定分类 | 设定商品分类 | 可以设定商品的分类，例如生活用品，书籍学习，数码产品，服装箱包等，如果存在二级分类则进一步进行分类。 |



VII性能及安全性说明

1. 本系统只应用于西工大内部，在高峰期，系统能同时支持100个用户在线；用户向系统提交信息后，系统将在2秒内向用户显示确认消息；用户提交了查询之后，对查询的响应时间不能超过5秒，在此时间内要将查询结果显示在屏幕上；

2.精度：本系统输入输出各项数据精确到小数点后一位；
3.数据类型：输入输出数据类型为字符串和数值型；
4.出错率：测试中检查出来的程序编制中的错误发生率（每千条指令（或语句）中的错误指令数（或语句数））为0.027%，预计出错率将0.001%增长，但属于正常合理的出错几率范围；
5.网络安全：本系统能经受来自互联网的一般性恶意攻击。如病毒（包括木马）攻击、口令猜测攻击、黑客入侵等。因此，必须配备较强的网络安全防范、响应能力，为应用系统提供安全可靠的网络统计平台。
6.数据库安全:数据库级备份和恢复。数据库级用户进行角色和权限授权，在异常情况发生时，系统可以得以快速恢复，避免数据的丢失或将其影响降到最低限度。同样，要保证存储过程中数据不被非法访问和篡改。
## 意外事故以及运行的备用状态和方式
当有意外事故发生时，人工进行备份数据恢复。
## 保密性和私密性
本系统主要用于学生实验，主要运用于学校教学实践。本系统仅限于项目小组和项目相关人员使用，其他人员未经许可不得擅自拷贝使用，一经发现后果自负。
## 帮助和问题报告
本系统由西北工业大学－软件学院高级软件工程能力综合训练10组（简称“10组”）负责提供技术帮助。
# 访问软件
## 软件的首次用户
### 熟悉设备
以iphone 8 4.7英寸的屏幕为标准显示屏幕，软件的使用与一般程序无异。
### 访问控制
基于项目特点，项目的安全控制主要由程序代码控制。mongoDB 端没有特殊地设定安全设置和检查。项目的用户身份验证、用户授权管理都由应用程序代码实现。
### 安装和设置

1. 用户可以通过扫描二维码进入平台。
1. 用户也可以通过输入网址进入平台。
1. 不需要其他设置。
## 启动过程
在手机浏览器中输入网址：182.92.116.189即可进入抛瓜-西工大二手交易平台。


## 停止和挂起工作
正常关闭界面，退出系统，停止工作。
# 使用软件指南
## 能力

- 

   1. 登陆：
1. 输入翱翔门户学号、密码；
1. 点击登陆按钮；
1. 如果输入用户信息错误，提示“账号或密码错误”；
1. 如果输入用户信息正确，提示“登陆成功”
1. 登陆成功后进入货架界面，可以浏览货架中商品标题、发布时间等信息。

![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812713453-4b437269-067c-4f5e-b64c-03134ddeff3f.jpeg#align=left&display=inline&height=726&margin=%5Bobject%20Object%5D&originHeight=1110&originWidth=624&status=done&style=none&width=408)![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812713526-2f2eedb7-8e21-47d6-bc53-9204136aebc2.jpeg#align=left&display=inline&height=725&margin=%5Bobject%20Object%5D&originHeight=1107&originWidth=623&status=done&style=none&width=408)![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812713607-ece44153-9d63-481e-a64d-fb5387d38245.jpeg#align=left&display=inline&height=717&margin=%5Bobject%20Object%5D&originHeight=1096&originWidth=616&status=done&style=none&width=403)![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812713672-ce1f6a84-99ce-4864-82bf-bd9d53fb762e.jpeg#align=left&display=inline&height=720&margin=%5Bobject%20Object%5D&originHeight=1101&originWidth=619&status=done&style=none&width=405)

- 

   1. 用户名/头像设置
1. 点击页面下方导航栏右侧“我的”图标，进入个人信息页面。
1. 点击头像下方的“相机”按钮，进入修改头像和用户名界面。
1. 点击头像的圆框，可从手机存储空间内选择图片作为头像。
1. 点击任意图片，系统会自动调整图片比例，并在头像圆框中显示缩略图。
1. 点击用户名文本框，可输入任意字符作为用户名。
1. 点击“跳过”，可以取消保存本次修改，并返回货架界面。
1. 点击“保存”，可以保存本次用户名/头像修改。

![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812713743-3612b499-5e58-4909-a07e-d0906ea82f1b.png#align=left&display=inline&height=674&margin=%5Bobject%20Object%5D&originHeight=1030&originWidth=579&status=done&style=none&width=379)![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812713816-fed3b567-90e5-4d5e-9f5e-0bba4e5b94c4.jpeg#align=left&display=inline&height=676&margin=%5Bobject%20Object%5D&originHeight=1033&originWidth=581&status=done&style=none&width=380)
![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812713884-2b4cd9b2-14fa-4674-894b-02ce0d9e001d.jpeg#align=left&display=inline&height=663&margin=%5Bobject%20Object%5D&originHeight=1013&originWidth=570&status=done&style=none&width=373)![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812713934-985b358d-9078-444b-9cc6-ef6ce19791f3.jpeg#align=left&display=inline&height=669&margin=%5Bobject%20Object%5D&originHeight=1021&originWidth=574&status=done&style=none&width=376)

- 

   1. 意见反馈
1. 点击页面下方导航栏右侧“我的”图标，进入个人信息页面。
1. 点击“意见反馈”，进入意见反馈详细页面。
1. 点击复选框左侧的“产品意见”，可以反馈对产品的意见。
1. 点击复选框右侧的“bug反馈”，可以反馈使用过程中遇到的bug。
1. 点击页面中部的文本框，输入文字可以反馈遇到的问题，字数上限为200字。
1. 点击提交可以反馈以上填写的信息。

![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812713998-4149b639-2fc4-4763-9193-7c414e0295ba.jpeg#align=left&display=inline&height=656&margin=%5Bobject%20Object%5D&originHeight=1001&originWidth=563&status=done&style=none&width=369)![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812714065-2e75d577-e5c5-4808-bd88-c7b79c2572b8.jpeg#align=left&display=inline&height=656&margin=%5Bobject%20Object%5D&originHeight=1003&originWidth=564&status=done&style=none&width=369)

- 

   1. 手机号/QQ号/微信号设置
1. 点击页面下方导航栏右侧“我的”图标，进入个人信息页面。
1. 点击“个人信息”，进入个人信息详细页面。
1. 点击“电话”图标右侧文本框，输入任意11位数字可以设置电话号。
1. 点击“微信”图标右侧文本框，输入任意20位内字符串可以设置微信号。
1. 点击“QQ”图标右侧文本框，输入任意15位内数字可以设置微信号。
1. 点击“保存”，返回个人信息页面，提示“修改成功”。
1. 如果设置的手机号/QQ号/微信号不符合预设的输入格式，提示“手机号无效”/“QQ号无效”/“微信号无效”，并返回个人信息详细页面。

![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812714137-8ed46933-fcf9-446c-96da-9ae157c48894.jpeg#align=left&display=inline&height=688&margin=%5Bobject%20Object%5D&originHeight=1051&originWidth=591&status=done&style=none&width=387)![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812714206-80cb6c29-7ef2-4a8b-8a90-aefc71761d6e.jpeg#align=left&display=inline&height=690&margin=%5Bobject%20Object%5D&originHeight=1055&originWidth=593&status=done&style=none&width=388)![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812714274-26fa82c3-1a59-465f-9eaa-d6d12c1c8611.jpeg#align=left&display=inline&height=720&margin=%5Bobject%20Object%5D&originHeight=1101&originWidth=619&status=done&style=none&width=405)![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812714380-10559e7b-d18c-4c8e-93bf-8dd84e84ca88.jpeg#align=left&display=inline&height=722&margin=%5Bobject%20Object%5D&originHeight=1103&originWidth=620&status=done&style=none&width=406)

- 

   1. 已发布管理
1. 点击页面下方导航栏右侧“我的”图标，进入个人信息页面。
1. 点击“我的发布”，查看已发布商品，显示商品图片、标题、分类、价格。
1. 点击已发布商品中的任意一个，进入商品详细信息页面。
1. 点击“编辑”按钮，进入编辑商品页面。
1. 点击“擦亮”按钮，商品的发布时间会更新至被擦亮时间，被擦亮的商品会移动至“我发布的”页面最顶端，商品在货架首页上的显示会移动到最上方。
1. 点击“删除”按钮，提示删除成功，商品在系统中被删除，在货架上不再显示。

![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812714443-6e27e856-4ee7-4ddd-a4ad-a8c166014242.jpeg#align=left&display=inline&height=664&margin=%5Bobject%20Object%5D&originHeight=1016&originWidth=572&status=done&style=none&width=374)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812714516-6e4c425a-99a3-4985-87be-4f16e08e76c0.png#align=left&display=inline&height=665&margin=%5Bobject%20Object%5D&originHeight=1016&originWidth=571&status=done&style=none&width=374)
![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812714608-0bd761d2-8abc-4eea-beba-2a0e0f695195.png#align=left&display=inline&height=660&margin=%5Bobject%20Object%5D&originHeight=1010&originWidth=574&status=done&style=none&width=375)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812714692-ef34d8ae-ce2d-4e6e-9761-3fac0a04b3cc.png#align=left&display=inline&height=663&margin=%5Bobject%20Object%5D&originHeight=1012&originWidth=569&status=done&style=none&width=373)

- 

   1. 已收藏管理
1. 点击页面下方导航栏右侧“我的”图标，进入个人信息界面。
1. 点击“我的收藏”，查看已收藏商品，显示商品图片、标题、分类、价格。
1. 点击已发布商品中的任意一个，进入商品详细信息页面。
1. 点击价格右侧“⭐”，可以取消收藏，点击后商品从“我收藏的”页面中不再显示。

![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812714778-a1f24c12-ba06-4212-8687-74f0c41e0adf.png#align=left&display=inline&height=686&margin=%5Bobject%20Object%5D&originHeight=1049&originWidth=590&status=done&style=none&width=386)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812714853-19c2bd34-b30a-464f-9789-b1cb49c3d429.png#align=left&display=inline&height=694&margin=%5Bobject%20Object%5D&originHeight=1059&originWidth=595&status=done&style=none&width=390)

- 

   1. 浏览商品
1. 点击页面下方导航栏左侧“货架”图标，进入货架页面。
1. 文本“最新鲜”下方显示商品信息，每次显示10个商品。
1. 浏览商品到页面最低端时，向上滑动可以再显示10件商品。
1. 再货架页面最顶端时，向上滑动可以刷新货架页面显示的商品。
1. 点击货架页面的商品，可以显示商品详细信息。
1. 进入商品详细信息页面后，可以查看商品发布者的用户名、发布校区、发布时间、商品标题、商品描述、商品图片、发布者手机号、发布者微信号、发布者QQ号。
1. 点击“生活用品”，可以显示分类为“生活用品”的商品信息。
1. 点击“书籍学习”，可以显示分类为“书籍学习”的商品信息。
1. 点击“数码产品”，可以显示分类为“数码产品”的商品信息。
1. 点击“服装鞋包”，可以显示分类为“服装鞋包”的商品信息。
1. 点击“好吃的”，可以显示分类为“好吃的”的商品信息。
1. 点击“美妆美护”，可以显示分类为“美妆美护”的商品信息。
1. 点击“求购”，可以显示分类为“求购”的商品信息。
1. 进入任意分类页面后，点击页面上方左侧“全部校区”复选框，点击“友谊校区”或“长安校区”，可以进一步筛选发布校区。
1. 进入任意分类页面后，点击页面上方右侧复选框，点击选择其他分类，可以查看其他分类。

![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812714929-09248c0b-fa13-45a3-afd4-6644cc5624a9.png#align=left&display=inline&height=485&margin=%5Bobject%20Object%5D&originHeight=741&originWidth=416&status=done&style=none&width=272)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812715004-6f345de9-217e-43ff-9f45-015739412595.png#align=left&display=inline&height=482&margin=%5Bobject%20Object%5D&originHeight=735&originWidth=413&status=done&style=none&width=271)


![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812715097-72c99098-b216-4636-8a73-fecd07cb910e.jpeg#align=left&display=inline&height=481&margin=%5Bobject%20Object%5D&originHeight=735&originWidth=413&status=done&style=none&width=270)![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812715186-ff3ae943-9c02-4b0a-bec8-20acd56954db.jpeg#align=left&display=inline&height=485&margin=%5Bobject%20Object%5D&originHeight=741&originWidth=417&status=done&style=none&width=273)![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812715254-9ef5cf74-1e51-44ea-a8b1-0c715cefd4d3.jpeg#align=left&display=inline&height=484&margin=%5Bobject%20Object%5D&originHeight=740&originWidth=416&status=done&style=none&width=272)

- 

   1. 查看商品详细信息
1. 点击页面下方导航栏左侧“货架”图标，进入货架页面。
1. 点击货架页面的商品，可以显示商品详细信息。
1. 进入商品详细信息页面后，可以查看商品发布者的用户名、发布校区、发布时间、商品标题、商品描述、商品图片、发布者手机号、发布者微信号、发布者QQ号。
1. 商品详细页面左下角的”⭐“标志表示商品是否被用户收藏，如果”⭐“内部为白色，则表示未收藏；如果”⭐“内部为红色，则表示已收藏。
1. 如果尚未收藏，点击左下角”⭐“，当”⭐“内部变为红色，表示商品已被收藏；如果已收藏，点击左下角”⭐“，当”⭐“内部变为白色，表示商品已取消收藏。
1. 点击手机号/QQ号/微信号右侧的”复制“按钮，可以复制发布者的手机号/QQ号/微信号。

![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812715364-ee911125-e299-477b-b84c-3e562eac9eb2.jpeg#align=left&display=inline&height=671&margin=%5Bobject%20Object%5D&originHeight=1023&originWidth=575&status=done&style=none&width=377)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812715431-d724e983-48ee-436f-b502-c508701641a6.png#align=left&display=inline&height=670&margin=%5Bobject%20Object%5D&originHeight=1024&originWidth=576&status=done&style=none&width=377)
![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812715569-b0befd04-278f-4656-9299-fb444525948b.png#align=left&display=inline&height=667&margin=%5Bobject%20Object%5D&originHeight=1019&originWidth=573&status=done&style=none&width=375)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812715660-44491d73-5099-403f-8cba-4ba234009d4d.png#align=left&display=inline&height=669&margin=%5Bobject%20Object%5D&originHeight=1021&originWidth=574&status=done&style=none&width=376)

- 

   1. 搜索功能
1. 点击页面下方导航栏左侧“货架”图标，进入货架页面。
1. 点击货架页面中间搜索框，输入搜索关键字。
1. 货架按照发布时间排序，显示带有关键字的商品。

![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812715755-3df8eb26-7fd3-45b9-a09b-55ed1e5117ec.png#align=left&display=inline&height=489&margin=%5Bobject%20Object%5D&originHeight=747&originWidth=420&status=done&style=none&width=275)![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812715849-2d20fc8c-2519-49b0-9be9-0029ed8d4be0.jpeg#align=left&display=inline&height=492&margin=%5Bobject%20Object%5D&originHeight=750&originWidth=421&status=done&style=none&width=276)![](https://cdn.nlark.com/yuque/0/2019/jpeg/394268/1562812715939-c769db77-66c2-4bc9-9a68-1777e6523e40.jpeg#align=left&display=inline&height=489&margin=%5Bobject%20Object%5D&originHeight=749&originWidth=421&status=done&style=none&width=275)


- 

   1. 发布管理
1. 点击页面下方导航栏中间“+”图标，进入发布页面。
1. 点击”取一个标题......“文本框，可以输入商品标题，字数限制为15字。
1. 点击”详细介绍......“文本框，可以输入商品详细信息，字数限制为200字。
1. 点击中间”+“图标，可以从手机存储中选择图片，添加到商品图片中。
1. 点击”价格“右侧文本框，可以输入数字，设置商品具体定价。
1. 点击”分类“右侧复选框，可以选择分类，设置商品具体分类；分类是选填项。
1. 点击”可面交校区“右侧复选框，可以选择校区，设置商品发布校区。
1. 点击”手机号“或”QQ号“或”微信号“右侧文本框，可以设置发布者的手机号、QQ号、微信号，手机号、QQ号、微信号是选填项。
1. 点击页面下方发布按钮，可以发布商品。
1. 如果未填写标题，显示信息”未输入标题“，商品无法成功发布。
1. 如果未填写介绍，显示信息”未输入介绍“，商品无法成功发布。
1. 如果未添加图片，显示信息”未添加图片“，商品无法成功发布。
1. 如果未填写价格，显示信息”未输入价格“，商品无法成功发布。
1. 如果未选择校区，显示信息”未添加校区“，商品无法成功发布。
1. 在发布页面点击返回键，显示”确认退出“选择框。
1. 在选择框”确认退出“中，点击“取消”按钮，回到发布页面，原本填写的商品信息未被清空。
1. 在选择框”确认退出“中，点击“确定”按钮，回到货架页面，原本填写的商品信息被清空。
1. 发布成功后，显示提示信息”闲置物品若5天内未被‘擦亮’，买家可能会看不见。记得常去”我的发布“中擦亮你的闲置哦“。

![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812715997-48326f38-05d9-48e0-9ddd-d960e6bdb52f.png#align=left&display=inline&height=664&margin=%5Bobject%20Object%5D&originHeight=426&originWidth=240&status=done&style=none&width=374)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812716075-869887aa-ff6e-4c6e-95cc-c504d24d7e3e.png#align=left&display=inline&height=658&margin=%5Bobject%20Object%5D&originHeight=1006&originWidth=601&status=done&style=none&width=393)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812716137-a99c23b1-10b1-413c-bbf2-0060f54b8ba7.png#align=left&display=inline&height=656&margin=%5Bobject%20Object%5D&originHeight=1003&originWidth=564&status=done&style=none&width=369)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812716197-0afaa926-03e5-4ac1-aade-525d23fb3573.png#align=left&display=inline&height=658&margin=%5Bobject%20Object%5D&originHeight=1005&originWidth=565&status=done&style=none&width=370)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812716269-5631f5a5-1cb4-46e5-8444-0f99fa7db57c.png#align=left&display=inline&height=673&margin=%5Bobject%20Object%5D&originHeight=1027&originWidth=577&status=done&style=none&width=378)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812716380-63c4e4a7-a6bc-4ca7-8d8c-ef8e33690fdb.png#align=left&display=inline&height=673&margin=%5Bobject%20Object%5D&originHeight=1027&originWidth=577&status=done&style=none&width=378)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812716506-3bf339dc-ee36-4b07-8d05-b938cdf8cbaf.png#align=left&display=inline&height=655&margin=%5Bobject%20Object%5D&originHeight=1000&originWidth=559&status=done&style=none&width=366)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812716591-203b4b49-5215-4810-8d89-f5463a98466a.png#align=left&display=inline&height=655&margin=%5Bobject%20Object%5D&originHeight=1001&originWidth=562&status=done&style=none&width=368)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812716684-5f0bec78-df43-4c09-b581-cf3638f075d8.png#align=left&display=inline&height=665&margin=%5Bobject%20Object%5D&originHeight=1016&originWidth=571&status=done&style=none&width=374)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812716740-c4258430-15e4-478e-b613-ba4c0588b2c6.png#align=left&display=inline&height=669&margin=%5Bobject%20Object%5D&originHeight=1021&originWidth=574&status=done&style=none&width=376)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812716798-e84741be-8086-4c74-85d8-4e6168404196.png#align=left&display=inline&height=667&margin=%5Bobject%20Object%5D&originHeight=1018&originWidth=572&status=done&style=none&width=375)![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812716862-be364e4c-cee7-423f-b3b7-f77c838c42ba.png#align=left&display=inline&height=665&margin=%5Bobject%20Object%5D&originHeight=1017&originWidth=572&status=done&style=none&width=374)
## 约定
本软件操作简单，正确输入数据，按流程操作即可。
## 处理过程
本系统分为三个模块，以下为系统的处理流程和数据流程。
处理流程：
个人信息管理模块
![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812716915-ee875579-5a95-41a9-9827-c743a1ddf25c.png#align=left&display=inline&height=272&margin=%5Bobject%20Object%5D&originHeight=381&originWidth=1162&status=done&style=none&width=830)


发布管理模块
发布管理模块业务流程：
![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812716971-3a1cdbbd-d212-4969-83ed-f6550b23d080.png#align=left&display=inline&height=572&margin=%5Bobject%20Object%5D&originHeight=381&originWidth=537&status=done&style=none&width=806)
货架管理模块
货架管理模块业务流程：
![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812717018-58f7e1b2-2908-4e30-89ed-d8ab03c0a6d4.png#align=left&display=inline&height=572&margin=%5Bobject%20Object%5D&originHeight=381&originWidth=537&status=done&style=none&width=806)


数据流程：
![](https://cdn.nlark.com/yuque/0/2019/png/394268/1562812717071-948d215e-9365-4525-a1c6-afabec34ff71.png#align=left&display=inline&height=457&margin=%5Bobject%20Object%5D&originHeight=510&originWidth=927&status=done&style=none&width=831)
## 相关处理
系统管理员在为编程人员，负责后台管理。为了保障数据的安全和可用性，建议将数据库的故障还原模块设定为“完全”，这也是数据库的默认设置。
## 数据备份
数据库的大小和数据修改的频率决定了采用何种数据库备份恢复策略。如果数据库较小或修改的频度非常低，则可以只实施完全数据库备份，不过此时要定期清理数据库的事务日志，防止数据库的事务日志被填满。其他情况则需要使用差异备份。由于本项目涉及的数据库规模较小，建议每周做一次完全备份，中间间隔两天做一次差异备份。
## 错误，故障和紧急情况时的恢复
本软件出现故障灯紧急情况时，应关闭当前应用程序，重新启动恢复。
## 消息
本软件可能发生的的错误消息一般为输入格式错误或某项数据未输入，请重新按要求填写信息。
## 快速引用指南
本软件操作简单，与一般软件操作无异，例如在货架页面下拉可以刷新，在页面低端上拉可以浏览更多商品。		
# 注解
相关背景：目前很多大学每年临近毕业季，都会举办形式上类似“跳蚤市场”的线下交易市场，由此可见学生对于线下交易是有较大的需求的，然而线下交易的时间往往比较短暂，且能展示的商品有限，对于学生而言不够方便。针对这种情况，需要设计一个专门为学校内部人员量身打造的二手交易平台，以提高学校内部交易的效率，力求改善线下交易的短暂性、不完整性，尽量满足学生的需求，为学生出售、购买弃置的二手商品提供便利，同时也使得学校尽早进入快捷、高效的信息化时代。本系统是一个仅限西工大内部人员使用的二手交易平台，用户在使用本系统时需绑定翱翔门户的账号，并用翱翔门户的账号进行注册和登录。系统提供了个人信息设置，包括用户头像，昵称，电话号码，qq微信账号等；发布二手商品，收藏或者取消收藏二手商品，浏览首页商品信息，查看已收藏商品等功能。本系统还包含：设定商品分类，例如设定生活用品，书籍学习等类别，若存在二级分类还可以进一步进行设定；再编辑已发布的商品，例如重新编辑商品的价格，分类等，使用户可以根据自身需求及时调整，以及擦亮已发布的商品，系统根据距离发布或上次擦亮的时间提示用户进行擦亮。系统的各个模块操作界面简单、实用，美观，让用户可以在最短的时间内掌握软件的使用方法。项目的需方为西北工业大学，用户为需要使用二手交易平台的西工大内部人员。
服务器：指一个管理资源并为用户提供服务的[计算机](http://baike.baidu.com/view/3314.htm)软件，通常分为文件[服务器](http://baike.baidu.com/view/899.htm)、数据库服务器和应用程序服务器。运行以上软件的计算机或计算机系统也被称为服务器。
注册：把名字记入系统用户名单，获得系统使用资格。
# 附录
暂无
