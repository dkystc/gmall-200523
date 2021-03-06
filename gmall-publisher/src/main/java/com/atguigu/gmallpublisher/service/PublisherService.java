package com.atguigu.gmallpublisher.service;

import java.util.Map;

public interface PublisherService {

    public Integer getDauTotal(String date);

    public Map getDauHourTotal(String date);

    public Double getOrderAmount(String date);

    public Map getOrderAmountHour(String date);

}
