package ch11.policy.additional;

import ch11.Phone;
import ch11.policy.RatePolicy;
import temp.Money;

public abstract class AdditionalRatePolicy implements RatePolicy {
    private RatePolicy next;

    public AdditionalRatePolicy(RatePolicy next) {
        this.next = next;
    }

    @Override
    public Money calculatFee(Phone phone) {
        Money fee = next.calculatFee(phone);

        return afterCalculated(fee);
    }

    abstract protected Money afterCalculated(Money fee);
}
