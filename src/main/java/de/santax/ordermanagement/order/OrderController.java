package de.santax.ordermanagement.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {

    public OrderService orderService;


    @GetMapping
    public List<Order> getAllOrder() {
        return orderService.getAllOrder();
    }
}
