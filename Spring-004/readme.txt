Bean生命周期五步：
    1.调用无参构造，实例化Bean
    2.为对象赋值
    3.初始化Bean
    4.使用Bean
    5.销毁Bean

Bean生命周期七步：
    1.调用无参构造，实例化Bean
    2.为对象赋值
    执行Bean后处理器的before方法
    3.初始化Bean
    执行Bean后处理器的after方法
    4.使用Bean
    5.销毁Bean

Bean生命周期十步：
    1.调用无参构造，实例化Bean
    2.为对象赋值
    检查Bean是否实现Aware的相关接口，并设置相关依赖
    执行Bean后处理器的before方法
    检查Bean是否实现了InitializingBean接口，并调用接口方法
    3.初始化Bean
    执行Bean后处理器的after方法
    4.使用Bean
    检查Bean是否实现了DisposableBean接口，并调用接口方法
    5.销毁Bean