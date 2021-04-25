package jpabook.jpashop.domain;

import javax.persistence.*;

/**
 * Created by sskim on 2021/04/25
 * Github : http://github.com/sskim91
 */
@Entity
public class Delivery {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String city;
    private String street;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery")
    private Order order;
}
