package ch11;

import ch11.policy.RatePolicy;
import temp.Call;
import temp.Money;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone {
    private final RatePolicy ratePolicy;
    private final List<Call> calls = new ArrayList<>();

    public Phone(RatePolicy ratePolicy) {
        this.ratePolicy = ratePolicy;
    }

    public List<Call> getCalls() {
        return Collections.unmodifiableList(calls);
    }

    public Money calculateFee() {
        return ratePolicy.calculatFee(this);
    }

}
