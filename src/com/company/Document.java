package com.company;

import java.util.regex.Matcher;

public class Document {
    private String fileName;
    private String phoneNumber;
    private String mail;
    private String docNumber;

    public Document(String fileName, String phoneNumber, String mail, String docNumber) {
        this.fileName = fileName;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.docNumber = docNumber;
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "fileName='" + fileName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mail='" + mail + '\'' +
                ", docNumber='" + docNumber + '\'' +
                '}';
    }
}
