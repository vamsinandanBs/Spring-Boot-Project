package com.vamsi.springboot.spring_boot_project;

public class Payment_status {
    private long Txn_id;
    private String Pay_method;
    private String Txn_Status;

    public Payment_status(long txn_id, String pay_method, String txn_Status) {
        Txn_id = txn_id;
        Pay_method = pay_method;
        Txn_Status = txn_Status;
    }

    public long getTxn_id() {
        return Txn_id;
    }

    public String getPay_method() {
        return Pay_method;
    }

    public String getTxn_Status() {
        return Txn_Status;
    }

    @Override
    public String toString() {
        return "Payment_status{" +
                "Txn_id=" + Txn_id +
                ", Pay_method='" + Pay_method + '\'' +
                ", Txn_Status='" + Txn_Status + '\'' +
                '}';


    }
}
