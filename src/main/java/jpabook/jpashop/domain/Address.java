package jpabook.jpashop.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by sskim on 2021/07/18
 * Github : http://github.com/sskim91
 */
@Embeddable
@Getter
@NoArgsConstructor
@EqualsAndHashCode
public class Address {

    @Column(length = 10)
    private String city;
    @Column(length = 20)
    private String street;
    @Column(length = 5)
    private String zipcode;

    private String fullAddress() {
        return getCity() + " " + getStreet() + " " + getZipcode();
    }
}
