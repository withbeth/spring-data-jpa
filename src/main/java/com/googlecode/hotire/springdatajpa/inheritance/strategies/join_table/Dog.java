package com.googlecode.hotire.springdatajpa.inheritance.strategies.join_table;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("dog")
@PrimaryKeyJoinColumn(name = "animalId")
public class Dog extends Animal {

}
