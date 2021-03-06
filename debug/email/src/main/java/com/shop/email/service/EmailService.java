package com.shop.email.service;

import com.shop.email.dao.AddressDao;
import com.shop.email.dao.EmailTransactionDao;
import com.shop.email.entity.Address;
import com.shop.email.entity.EmailTransaction;
import com.shop.email.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmailService {

    @Autowired
    AddressDao addressDao;

    @Autowired
    EmailTransactionDao emailTransactionDao;

    @Value("${spring.mail.username}")
    private String from;


    // TODO
    @Transactional
    public void sendEmail(Orders orders) {
        // 这里要保证幂等性
        EmailTransaction emailTransaction = emailTransactionDao.selectByPrimaryKey(orders.getId());
        if(emailTransaction==null){
            Address address = addressDao.selectByPrimaryKey(orders.getAddressId());
            System.out.println("发送邮件给买家"+address.getEmail());
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(from);
            message.setTo(address.getEmail());
            message.setSubject("title");
            message.setText("content");
            emailTransactionDao.insert(new EmailTransaction(orders.getGlobalId()));
        }
        else{
            System.out.println("幂等拒绝多次服务");
        }
    }


}
