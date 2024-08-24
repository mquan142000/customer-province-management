package com.example.customerprovincemanagement.repository;

import com.example.customerprovincemanagement.model.DTO.ICountCustomer;
import com.example.customerprovincemanagement.model.Province;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IProvinceRepository extends CrudRepository<Province, Long> {

    @Query(nativeQuery = true, value = "select name, count(c.id) as number from province left join customer.customer c on province.id = c.province_id group by name;")
    Iterable<ICountCustomer> getNumberOfProvince();
}
