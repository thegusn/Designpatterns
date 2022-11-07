package com.guan.responsibilitychain;

public abstract class Approver {
//    下一个处理
    Approver approver;
    String name;
    public Approver(String name){
        this.name=name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }
//    处理审批请求的，得到一个请求，处理是子类完成的，所以做成出翔方法
    public abstract void processRequest(PurchaseRequest purchaseRequest);



























}
