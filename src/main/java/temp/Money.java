package temp;

public class Money {
    public static final Money ZERO = new Money(0);
    private int num;

    private Money(int num) {
        this.num = num;
    }

    public static Money wons(int num) {
        return new Money(num);
    }

    public int num() {
        return this.num;
    }

    public Money plus(Money money) {
        //TODO
        return null;
    }

    public Money times(double taxRatio) {
        //TODO
        return null;
    }

    public Money minus(Money discountAmount) {
        //TODO
        return null;
    }
}
