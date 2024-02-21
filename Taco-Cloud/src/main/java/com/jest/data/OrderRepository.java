package com.jest.data;

import com.jest.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository 
         extends CrudRepository<TacoOrder, Long> {

}
