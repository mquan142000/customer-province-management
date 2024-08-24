package com.example.customerprovincemanagement.service;

import com.example.customerprovincemanagement.model.DTO.ICountCustomer;
import com.example.customerprovincemanagement.model.Province;

public interface IProvinceService extends IGenericService<Province> {
    Iterable<ICountCustomer> getCountCustomers();
}
