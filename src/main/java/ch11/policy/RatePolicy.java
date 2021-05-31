package ch11.policy;

import ch11.Phone;
import temp.Money;

public interface RatePolicy {
    Money calculatFee(Phone phone);
}
