package com.guan.template;
//表示豆浆
public abstract class SoyaMilk {


//    模板方法  做成final,不让子类覆盖
    final void make(){
        select();
        if(customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }
    void select(){
        System.out.println("第一步：选择好的新鲜黄豆");
    }
//    添加不同的配料，抽象方法，子类具体实现
    abstract void addCondiments();
    void soak(){
        System.out.println("第三步，黄豆和配料开始浸泡，需要3小时");
    }
    void beat(){
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎");
    }
//    钩子方法
    boolean customerWantCondiments(){
        return true;
    }


































}
