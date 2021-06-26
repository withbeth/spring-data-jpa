package com.googlecode.hotire.springdatajpa.deadlock;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;

@Getter
@Entity
public class DeadLock {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
