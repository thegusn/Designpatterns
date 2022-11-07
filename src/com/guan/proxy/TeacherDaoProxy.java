package com.guan.proxy;
//代理对象，静态代理
public class TeacherDaoProxy implements ITeacherDao{
//通过接口聚合对象
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target){
        super();
        this.target=target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始...");
        target.teach();
        System.out.println("代理结束...");
    }
}
