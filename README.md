# 电脑销售数据分析可视化

## 项目概述

本项目基于SpringBoot对电脑销售数据进行分析与可视化，该项目利用MySQL数据库存储销售数据，使用MyBatis进行数据访问与操作，Thymeleaf作为模板引擎构建前端页面，ECharts用于生成交互式数据可视化图表。整个项目的技术栈涵盖了Spring Boot、MySQL、MyBatis、Thymeleaf以及ECharts。

## 技术栈

- **Spring Boot:** 作为项目的基础框架，简化了项目的配置和开发过程，提供了丰富的功能模块。

- **MySQL:** 用于存储电脑销售数据的关系型数据库，可以高效地存储和检索大量结构化数据。

- **MyBatis:** 作为数据访问层的框架，通过XML或注解的方式，实现了数据的持久化操作，提供了对象关系映射（ORM）功能。

- **Thymeleaf:** 作为模板引擎，用于在后端渲染动态的HTML页面，使得数据展示更加灵活且易于维护。

- **ECharts:** 强大的数据可视化库，能够生成各种类型的交互式图表，如折线图、柱状图、饼图等，为项目提供直观的数据展示。

## 功能特点

1. **数据导入与存储：** 通过MySQL数据库存储销售数据，实现数据的长期保存与管理。

2. **数据查询与分析：** 利用MyBatis进行数据查询，提供多种维度的查询接口，帮助用户深入了解销售数据。

3. **数据可视化：** 使用ECharts绘制多种图表，如销售趋势折线图、不同产品销售比例饼图等，使数据更具可读性。

4. **动态页面展示：** 利用Thymeleaf将后端数据渲染到前端页面，实现动态数据展示与交互。


## 项目结构

```
- src
  - main
    - java
      - com.yyz.sale
        - controller       # 控制器层
        - dao              # 数据访问层
        - pojo             # 数据模型
        - service          # 业务逻辑接口层
          - impl           # 业务逻辑层
        - SaleApplication.java  # 应用入口
    - resources
      - static            # 静态资源，如CSS、JavaScript等
      - templates         # Thymeleaf模板
      - application.yml   # Spring Boot配置文件
```

## 使用步骤

1. 安装MySQL并导入数据。
2. 导入Maven依赖。
3. 配置MyBatis配置数据源。
4. 启动Spring Boot应用，访问 [localhost:8080](localhost:8080) 即可查看电脑销售数据分析可视化效果。

## 示例图

![capture](img/capture.png)

## 总结

基于Spring Boot的电脑销售数据分析可视化项目充分利用了各项技术栈的优势，实现了数据存储、查询、可视化展示等功能。通过Thymeleaf和ECharts的配合，使得项目能够为用户提供直观、易用的数据分析工具。