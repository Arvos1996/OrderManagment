package de.santax.ordermanagement.order;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "mainorder")
public class Order {

    @SequenceGenerator(
            name= "order_sequence",
            sequenceName ="order_sequence",
            allocationSize = 1)
    @GeneratedValue(
            generator = "order_sequence",
            strategy = GenerationType.SEQUENCE
    )
    @Id
    public Long orderId;
    public Date createDateOrder;
    public String userAuthor;
    public String settlement;
    public String streetName;
    public Long postalCode;
    public String cityName;
    @OneToMany(mappedBy="dryingOrder")
    private Set<DryingOrder> dryingOrder;

}
