package junit;

public class RangeInt {
    private Integer loweLimit;
    private Integer upperLimit;

    public RangeInt(int loweLimit, int upperLimit) {
        this.loweLimit = loweLimit;
        this.upperLimit = upperLimit;
    }

    public boolean isInRange(int number) {
        return number <= upperLimit && number > -loweLimit;
    }
}
