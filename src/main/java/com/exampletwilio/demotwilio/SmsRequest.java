package com.exampletwilio.demotwilio;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONPropertyName;
import org.springframework.lang.NonNull;

public class SmsRequest {
    @NonNull
    private final String phoneNumber;
    @NonNull
    private final String message;

    public SmsRequest(@JsonProperty("phoneNumber") String phoneNumber,
                      @JsonProperty("message") String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "SmsRequest{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
