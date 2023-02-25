package com.mahi.javapassion.userservice.query.api.projection;

import com.mahi.javapassion.commonservice.model.CardDetails;
import com.mahi.javapassion.commonservice.query.GetUserPaymentDetailsQuery;
import com.mahi.javapassion.commonservice.model.User;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;

@Component
public class UserProjection {

    @QueryHandler
    public User getUserPaymentDetails(GetUserPaymentDetailsQuery query) {
        //Ideally Needs to Fetch the details from database
        CardDetails cardDetails = CardDetails.builder()
                .name("Mahesh Yerudkar")
                .cardNumber("1234567890")
                .validTillMonth(12)
                .validTillYear(2030)
                .cvv(235)
                .build();
        return User.builder()
                .userId(query.getUserId())
                .firstName("Mahesh")
                .lastName("Yerudkar")
                .cardDetails(cardDetails)
                .build();
    }
}
