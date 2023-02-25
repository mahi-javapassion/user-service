package com.mahi.javapassion.commonservice.model;

import com.mahi.javapassion.commonservice.model.CardDetails;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String userId;
    private String firstName;
    private String lastName;
    private CardDetails cardDetails;
}
