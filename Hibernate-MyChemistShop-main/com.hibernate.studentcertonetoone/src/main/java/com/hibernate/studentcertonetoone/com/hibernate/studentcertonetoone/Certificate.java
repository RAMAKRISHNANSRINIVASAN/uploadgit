package com.hibernate.studentcertonetoone.com.hibernate.studentcertonetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Certificate {

    @Id
    private int certId;
    private String certName;

    public Certificate() {}

    public Certificate(int certId, String certName) {
        this.certId = certId;
        this.certName = certName;
    }

    public int getCertId() {
        return certId;
    }

    public void setCertId(int certId) {
        this.certId = certId;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    @Override
    public String toString() {
        return "Certificate [certId=" + certId + ", certName=" + certName + "]";
    }
}
