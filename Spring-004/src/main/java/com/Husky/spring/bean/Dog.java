package com.Husky.spring.bean;

public class Dog {
    private  String name;
    public Dog() {
        System.out.println("第一步，无参构造方法执行，对象实例化");
    }
    public void setName(String name) {
        this.name = name;
        System.out.println("第二步，为对象赋值");
    }
    public void initDog(){
        System.out.println("第三步，初始化对象");
    }
    public void destroyDog(){
        System.out.println("第五步，销毁对象");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
