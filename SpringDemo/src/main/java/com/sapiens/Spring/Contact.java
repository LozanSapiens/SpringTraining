package com.sapiens.Spring;

public class Contact {
    String primaryMobileNo;
    String secondaryMobileNo;
    String emergencyContactNo;
    String emailID;
    String officialMailID;

    public String getPrimaryMobileNo() {
        return primaryMobileNo;
    }

    public void setPrimaryMobileNo(String primaryMobileNo) {
        this.primaryMobileNo = primaryMobileNo;
    }

    public String getSecondaryMobileNo() {
        return secondaryMobileNo;
    }

    public void setSecondaryMobileNo(String secondaryMobileNo) {
        this.secondaryMobileNo = secondaryMobileNo;
    }

    public String getEmergencyContactNo() {
        return emergencyContactNo;
    }

    public void setEmergencyContactNo(String emergencyContactNo) {
        this.emergencyContactNo = emergencyContactNo;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getOfficialMailID() {
        return officialMailID;
    }

    public void setOfficialMailID(String officialMailID) {
        this.officialMailID = officialMailID;
    }
}
