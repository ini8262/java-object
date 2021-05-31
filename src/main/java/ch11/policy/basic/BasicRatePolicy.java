package ch11.policy.basic;

import ch11.Phone;
import ch11.policy.RatePolicy;
import temp.Call;
import temp.Money;

public abstract class BasicRatePolicy implements RatePolicy {

    @Override
    public Money calculatFee(Phone phone) {
        Money result = Money.ZERO;

        for(Call call : phone.getCalls()) {
            result.plus(calculateCallFee(call));
        }

        return result;
    }

    abstract protected Money calculateCallFee(Call call);
}
