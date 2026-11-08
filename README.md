# 📚 Java 控制台版简易图书管理系统 (Library Management System)

* **课程名称**：Java 编程期末项目
* **指导老师**：徐东曼
* **开发者账号**：`chenbosheng2002-ux`

---

## 1. 项目主题理由 (Project Theme Rationale)
图书管理系统是计算机科学与技术专业学习面向对象编程（OOP）和数据结构的经典实践课题。随着数字化图书馆的普及，高效、轻量的信息检索与库存管理系统在实际应用中具有重要价值。本设计旨在通过实现一个基于控制台的简易图书管理系统，巩固 Java 基础语法、集合框架应用以及面向对象设计思想，具备良好的可扩展性与实用价值。

## 2. 相关研究与技术路线 (Related Research)
在现有的控制台图书管理方案中，多数系统采用简单的数组存储，存在容量固定、扩展困难的问题。本项目引入了 Java 集合框架中的 `ArrayList` 动态数组，有效解决了图书数量动态增减的问题；同时结合 `Scanner` 类实现人机交互，保证了程序的健壮性与易用性。

## 3. 项目设计 (Project Design)
本项目遵循面向对象设计原则，主要包含两个核心类：
* **`Book` 类**：封装图书的基本属性（如图书编号 `id`、书名 `title`、借阅状态 `status`），提供构造方法及 Getter/Setter 方法。
* **`Main` 类**：系统控制核心，负责初始化图书数据源，维护基于 `ArrayList<Book>` 的图书列表，并通过 `while` 循环与 `switch/if-else` 分支结构提供交互菜单。

## 4. 实施过程 (Implementation)
1. **环境搭建**：基于 Windows 环境，使用 Eclipse IDE 配置工作空间并创建 Java 项目。
2. **核心代码编写**：
   * 实现 `Book` 对象的属性封装。
   * 在 `Main` 中初始化默认测试数据（如《Java面向对象程序设计》）。
   * 编写“查看图书”与“添加图书”的核心逻辑方法。
3. **版本控制**：通过 GitHub 仓库 (`chenbosheng2002-ux/LibrarySystem`) 进行源码托管与版本迭代。

## 5. 程序运行与结果 (Program Running & Results)
程序启动后，控制台输出操作主菜单：
```text
--- 简易图书管理系统 ---
1. 查看所有图书
2. 添加图书
3. 退出系统
请选择操作编号:
功能 1（查看图书）：实时输出当前系统内所有藏书的编号、书名与状态。

功能 2（添加图书）：支持用户交互式输入编号与书名，动态追加至内存集合中。

6. 结果分析与讨论 (Result Analysis & Discussion)
优点：代码结构清晰，内存占用小，响应速度快，完全满足基础管理需求。

局限性与改进方向：当前数据仅存储于内存（RAM）中，程序退出后数据会丢失。后续可引入 JDBC 与 MySQL 数据库或文件读写（I/O）实现持久化存储。

7. 参考文献 (References)
孙卫琴. Java面向对象编程 [M]. 北京: 电子工业出版社, 2017.

Oracle Documentation. The Collections Framework (Java SE). https://docs.oracle.com/en/java/

🛠️ 附录：快速运行指南
克隆或下载本项目源码：

Bash
git clone [https://github.com/chenbosheng2002-ux/LibrarySystem.git](https://github.com/chenbosheng2002-ux/LibrarySystem.git)
使用 Eclipse 打开项目，定位至 src/Main.java。

点击 Run 运行，即可在控制台进行交互。
