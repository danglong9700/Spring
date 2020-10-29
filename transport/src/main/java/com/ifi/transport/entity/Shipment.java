package com.ifi.transport.entity;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transport")
public class Shipment {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private int sId;
    private String sName;
    private String sStatus;
    private String sInitDest;
    private String sFinishDest;
    private Date sInitDate;
    private Date sFinishDate;
    private String sShipBrand;
    private String sDesc;
    private double sWeight;
    private BigInteger sPayment;
    private BigInteger sTotalPayment;


    public int getSId() {
        return this.sId;
    }

    public void setSId(int sId) {
        this.sId = sId;
    }

    public String getSName() {
        return this.sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public String getSStatus() {
        return this.sStatus;
    }

    public void setSStatus(String sStatus) {
        this.sStatus = sStatus;
    }

    public String getSInitDest() {
        return this.sInitDest;
    }

    public void setSInitDest(String sInitDest) {
        this.sInitDest = sInitDest;
    }

    public String getSFinishDest() {
        return this.sFinishDest;
    }

    public void setSFinishDest(String sFinishDest) {
        this.sFinishDest = sFinishDest;
    }

    public Date getSInitDate() {
        return this.sInitDate;
    }

    public void setSInitDate(Date sInitDate) {
        this.sInitDate = sInitDate;
    }

    public Date getSFinishDate() {
        return this.sFinishDate;
    }

    public void setSFinishDate(Date sFinishDate) {
        this.sFinishDate = sFinishDate;
    }

    public String getSShipBrand() {
        return this.sShipBrand;
    }

    public void setSShipBrand(String sShipBrand) {
        this.sShipBrand = sShipBrand;
    }

    public String getSDesc() {
        return this.sDesc;
    }

    public void setSDesc(String sDesc) {
        this.sDesc = sDesc;
    }

    public double getSWeight() {
        return this.sWeight;
    }

    public void setSWeight(double sWeight) {
        this.sWeight = sWeight;
    }

    public BigInteger getSPayment() {
        return this.sPayment;
    }

    public void setSPayment(BigInteger sPayment) {
        this.sPayment = sPayment;
    }

    public BigInteger getSTotalPayment() {
        return this.sTotalPayment;
    }

    public void setSTotalPayment(BigInteger sTotalPayment) {
        this.sTotalPayment = sTotalPayment;
    }

    @Override
    public String toString() {
        return "{" +
            " sId='" + getSId() + "'" +
            ", sName='" + getSName() + "'" +
            ", sStatus='" + getSStatus() + "'" +
            ", sInitDest='" + getSInitDest() + "'" +
            ", sFinishDest='" + getSFinishDest() + "'" +
            ", sInitDate='" + getSInitDate() + "'" +
            ", sFinishDate='" + getSFinishDate() + "'" +
            ", sShipBrand='" + getSShipBrand() + "'" +
            ", sDesc='" + getSDesc() + "'" +
            ", sWeight='" + getSWeight() + "'" +
            ", sPayment='" + getSPayment() + "'" +
            ", sTotalPayment='" + getSTotalPayment() + "'" +
            "}";
    }
    
}
