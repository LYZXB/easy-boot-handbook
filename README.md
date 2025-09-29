### 📍项目简介

本项目旨在为所有Java后端开发者设计一个现代的、系统化的学习兵器库。

它摒弃了传统“大而全”的项目式教学，采用“微项目驱动”的设计理念，将一个复杂的后端系统解构为一系列正交的、可独立学习的“技术积木”。

### 🎉你将获得

- **一套完整的后端技术图谱：** 掌握从Web开发、数据库交互，到缓存、消息队列、认证授权等企业级开发全貌。
- **工业级的编码实践能力：** 学会如何编写符合代码规范、经过单元测试、并能容器化部署的高质量代码。
- **面向未来的学习方法：** 体验如何将复杂知识体系化、模块化，从而能够从容应对未来层出不穷的新技术。

### 🏆项目特色

- **🎯 微项目驱动：** 将复杂技术体系拆解为独立的、可运行的微项目，逐个击破。
- **🧩 知识点聚焦：** 每个模块只讲透一个核心知识点，确保学习曲线平滑，认知负荷低。
- **🏭 工业级标准：** 代码融合了单元测试、代码检查、容器化等企业级最佳实践，而非玩具级Demo。

### 🤖技术栈一览

![Java](https://img.shields.io/badge/Java-17+-blue.svg) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg) ![Spring Security](https://img.shields.io/badge/Spring%20Security-6.x-blue.svg) ![MyBatis-Plus](https://img.shields.io/badge/MyBatis%20Plus-3.x-orange.svg)

- **核心框架：** Spring Boot, Spring MVC, Spring Security
- **数据访问：** MyBatis-Plus, Druid
- **中间件：** Redis (缓存), RabbitMQ (消息), Elasticsearch (搜索), Redisson (分布式锁)
- **认证授权：** JWT
- **测试与质量：** JUnit 5, Mockito, Checkstyle, PMD, SpotBugs
- **文档：** Knife4j (SpringDoc)
- **容器化：** Docker
- **构建工具：** Maven

### 🧩项目模块导航

> 这是一个持续进行中的项目。✅ 代表已完成并可查阅，🚧 代表正在规划或开发中。

#### 第一阶段：后端基石
> 阶段目标：掌握Web开发与数据库交互的核心能力，快速建立信心。

| 模块名称                                                            | 状态  | 核心知识点与教学目标                                                                                       |
| :-------------------------------------------------------------- | :-: | :----------------------------------------------------------------------------------------------- |
| [`module-01-web-helloworld`](./module-01-web-helloworld/)    | ✅  | **知识点:** Spring Boot基础, `@RestController`, `@GetMapping`。<br>**目标:** 跑起第一个Web服务，理解HTTP请求到响应的全过程。 |
| [`module-02-configuration-management`](./module-02-configuration-management/) | ✅  | **知识点:** `application.yml`, `@Value`, 自定义配置。<br>**目标:** 学会管理项目配置，实现代码与配置的分离。                     |
| [`module-03-database-crud`](./module-03-database-crud/)                       | 🚧  | **知识点:** MyBatis-Plus, MySQL, Druid, RESTful API。<br>**目标:** 掌握使用MyBatis-Plus优雅地实现单表的增、删、改、查。    |
| [`module-04-api-documentation`](./module-04-api-documentation/)               | 🚧  | **知识点:** Knife4j (SpringDoc)。<br>**目标:** 学会为项目自动生成美观、可交互的在线API文档。                                |

#### 第二阶段：Web核心进阶
> 阶段目标：提升Web服务的专业性和健壮性，解决企业级开发中的常见痛点。

| 模块名称 | 状态 | 核心知识点与教学目标 |
| :--- | :--: | :--- |
| [`module-05-param-validation`](./module-05-param-validation/) | 🚧 | **知识点:** `spring-boot-starter-validation`, `@Valid`, JSR 303。<br>**目标:** 学会优雅地对API输入参数进行声明式校验。 |
| [`module-06-global-exception-handler`](./module-06-global-exception-handler/) | 🚧 | **知识点:** `@RestControllerAdvice`, `@ExceptionHandler`。<br>**目标:** 学会捕获并统一处理全局异常，返回友好的错误信息。 |
| [`module-07-unified-response-wrapper`](./module-07-unified-response-wrapper/) | 🚧 | **知识点:** `@ResponseBodyAdvice`, AOP思想。<br>**目标:** 实现对所有成功的API数据进行统一格式的包装。 |

#### 第三阶段：企业级能力整合
> 阶段目标：引入企业开发最高频使用的中间件和解决方案，解决认证、性能、异步、高并发等复杂问题。

| 模块名称 | 状态 | 核心知识点与教学目标 |
| :--- | :--: | :--- |
| [`module-08-authentication-jwt`](./module-08-authentication-jwt/) | 🚧 | **知识点:** Spring Security, JWT, Filter。<br>**目标:** 掌握无状态认证方案，实现用户登录、签发Token与接口鉴权。 |
| [`module-09-caching-with-redis`](./module-09-caching-with-redis/) | 🚧 | **知识点:** Redis, `@Cacheable`, `@CacheEvict`。<br>**目标:** 整合Redis作为缓存，大幅提升高频读取接口的性能。 |
| [`module-10-asynchronous-task`](./module-10-asynchronous-task/) | 🚧 | **知识点:** `@Async`, 自定义线程池。<br>**目标:** 学会处理耗时操作，实现任务异步化，提升API响应速度。 |
| [`module-11-messaging-with-rabbitmq`](./module-11-messaging-with-rabbitmq/) | 🚧 | **知识点:** RabbitMQ, 消息生产者与消费者。<br>**目标:** 掌握使用消息队列进行服务解耦和流量削峰。 |
| [`module-12-searching-with-elasticsearch`](./module-12-searching-with-elasticsearch/) | 🚧 | **知识点:** Elasticsearch, 文档索引与搜索。<br>**目标:** 掌握使用ES实现高效、强大的全文检索功能。 |
| [`module-13-distributed-lock-redisson`](./module-13-distributed-lock-redisson/) | 🚧 | **知识点:** Redisson客户端, 分布式锁实现。<br>**目标:** 理解高并发下数据一致性问题，并使用分布式锁解决秒杀等场景。 |
| [`module-14-file-storage`](./module-14-file-storage/) | 🚧 | **知识点:** `MultipartFile`, 文件上传与下载。<br>**目标:** 掌握Web开发中常见的文件处理功能。 |

#### 第四阶段：生产力与质量保障
> 阶段目标：引入软件工程最佳实践，让项目具有工业级质量和可维护性。

| 模块名称                                                      | 状态  | 核心知识点与教学目标                                                                           |
| :-------------------------------------------------------- | :-: | :----------------------------------------------------------------------------------- |
| [`module-15-unit-testing`](./module-15-unit-testing/)                   | 🚧  | **知识点:** JUnit 5, Mockito, `@SpringBootTest`。<br>**目标:** 学会为业务逻辑编写单元测试与集成测试，保障代码质量。  |
| [`module-16-advanced-aop-logging`](./module-16-advanced-aop-logging/)   | 🚧  | **知识点:** AOP, 自定义注解。<br>**目标:** 实现一个`@Log`注解，自动记录方法参数与执行耗时。                          |
| [`module-17-docker-deployment`](./module-17-docker-deployment/)         | 🚧  | **知识点:** Docker, Dockerfile, Maven插件。<br>**目标:** 学会将Spring Boot应用构建成标准、可移植的Docker镜像。 |
| [`module-18-code-quality-guardian`](./module-18-code-quality-guardian/) | 🚧  | **知识点:** Checkstyle, PMD, SpotBugs。<br>**目标:** 引入静态代码分析工具，统一代码风格，检查潜在缺陷。             |
