package com.ydsworld.model;

import com.ydsworld.model.user.User;
import lombok.Data;

import java.util.Date;

@Data
public class ExpenseInvoice {

    Date invoicedate;
    Date dateentered = new Date();
    Date datepaid;
    int status;
    byte[] image;
    String imagecontenttype;
    double amount;
    double tax;
    double total;
    String paymentdescription;
    String accountnumber;
    ExpenseType expensetype;
    Vendor vendor;
    PaymentType paymenttype;
    User enteruser;
}
