package com.retail.rewards.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Transient;

public abstract class Reward {

    @JsonInclude  //include in Jackson serialization
    @Transient    //marking a field as not persistable
    protected Long points;

    public abstract Long getPoints();
}

