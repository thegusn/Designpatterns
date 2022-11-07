package com.guan.responsibilitychain;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest=new PurchaseRequest(1,3000,1);
        DepartmentApprover departmentApprover=new DepartmentApprover("章主任");
        CollegeApprover collegeApprover=new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover=new ViceSchoolMasterApprover("陈副校长");
        SchoolMasterApprover schoolMasterApprover=new SchoolMasterApprover("龙校长");


//        需要将下一审批人设置好(将审批人做成一个环状)
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);



        schoolMasterApprover.processRequest(purchaseRequest);
    }
}
