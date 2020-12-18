package domain;

public class RankCount {
    private final int first;
    private final int second;
    private final int third;
    private final int fourth;
    private final int fifth;

    public RankCount(int first, int second, int third, int fourth, int fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }

    public int getFourth() {
        return fourth;
    }

    public int getFifth() {
        return fifth;
    }

    public long getTotalMoney() {
        return Rank.FIRST.getWinningMoney() * first
                + Rank.SECOND.getWinningMoney() * second
                + Rank.THIRD.getWinningMoney() * third
                + Rank.FOURTH.getWinningMoney() * fourth
                + Rank.FIFTH.getWinningMoney() * fifth;
    }
}
