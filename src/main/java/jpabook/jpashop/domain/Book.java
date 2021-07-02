package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * @author sskim
 */
@Entity
@Getter
@Setter
public class Book extends Item{

    private String author;
    private String isbn;
}
