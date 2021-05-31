package ch11;

import ch11.policy.additional.TaxablePolicy;
import ch11.policy.basic.NightlyDiscountPolicy;
import ch11.policy.basic.RegularPolicy;
import org.junit.Test;
import temp.Money;

import java.time.Duration;

public class PhoneTest {

    @Test
    public void phone1() {
        Phone phone = new Phone(new RegularPolicy(Money.wons(10), Duration.ofSeconds(10)));
    }

    @Test
    public void phone2() {
        Phone phone = new Phone(new NightlyDiscountPolicy(Money.wons(5), Money.wons(10), Duration.ofSeconds(10)));
    }

    @Test
    public void phone3() {
        Phone phone = new Phone(new TaxablePolicy(10, new RegularPolicy(Money.wons(10), Duration.ofSeconds(10))));
    }

}