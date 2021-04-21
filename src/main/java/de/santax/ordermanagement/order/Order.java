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
    public Long id;
    public Date createDateOrder;
    public String userAuthor;
    public String settlement;
    public String streetName;
    public Long postalCode;
    public String orderPlace;
    @Enumerated(EnumType.STRING)
    public TypeOfOrder typeOfOrder;
    public Date createDateOrderType;
    @Enumerated(EnumType.STRING)
    public EntranceType entranceType;
    @Enumerated(EnumType.STRING)
    public DamageType damageType;
    public String damageNumber;
    public String insuranceNumber;
    public boolean releasedOrder;
    public boolean closedOrder;
    @OneToMany(mappedBy="order")
    private Set<DryingOrder> dryingOrder;

}
