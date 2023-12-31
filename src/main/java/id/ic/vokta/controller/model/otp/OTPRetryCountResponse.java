package id.ic.vokta.controller.model.otp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OTPRetryCountResponse extends BaseOtpResponse {

    @JsonProperty("count")
    private int count;

    public OTPRetryCountResponse() {
        // Empty Constructor
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
