package com.egzosn.pay.fuiou.bean;

import com.egzosn.pay.common.bean.TransactionType;

/**
 * 支付类型
 * @author Fuzx
 * create 2017 2017/1/24 0024
 */
public enum FuiouTransactionType implements TransactionType {
    B2B("B2B"),
    B2C("B2C")
    ;

    private String method;

    FuiouTransactionType(String method) {
        this.method = method;
    }

    @Override
    public String getType() {
        return this.name();
    }

    /**
     * 获取接口名称
     * @return 接口名称
     */
    @Override
    public String getMethod() {
        return this.method;
    }
}
