package com.ydsworld.model;

import com.ydsworld.model.user.User;
import lombok.Data;

import java.util.Date;

@Data
public class ExpenseInvoice {
    int id;
    Date invoicedate;
    byte[] image;
    String imagecontenttype;
    double amount;
    double tax;
    double total;
    String comment;
    ExpenseType expensetype;
    Vendor vendor;
    PaymentType paymenttype;
    User enteruser;
}
