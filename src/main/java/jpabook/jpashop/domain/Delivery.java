package jpabook.jpashop.domain;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

/**
 * Created by sskim on 2021/04/25
 * Github : http://github.com/sskim91
 */
@Entity
public class Delivery extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;
}
