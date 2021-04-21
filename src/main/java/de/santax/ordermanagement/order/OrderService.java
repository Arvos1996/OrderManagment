package de.santax.ordermanagement.order;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class OrderService {

    private OrderRepository orderRepository;

    public List<Order> getAllOrder(){
        return orderRepository.findAll();
    }
}
