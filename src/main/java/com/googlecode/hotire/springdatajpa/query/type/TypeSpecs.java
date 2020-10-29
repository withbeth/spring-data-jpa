package com.googlecode.hotire.springdatajpa.query.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TypeSpecs {
    ID("id"),
    OWNER("owner")
    ;
    private final String property;
}
