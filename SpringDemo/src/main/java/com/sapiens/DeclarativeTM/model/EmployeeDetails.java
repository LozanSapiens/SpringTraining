package com.sapiens.DeclarativeTM.model;

public class EmployeeDetails {
    private int detailsid;
    private String deptname;
    private String designation;
    private String qualification;

    public int getDetailsid() {
        return detailsid;
    }

    public void setDetailsid(int detailsid) {
        this.detailsid = detailsid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "detailsid=" + detailsid +
                ", deptname='" + deptname + '\'' +
                ", designation='" + designation + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
