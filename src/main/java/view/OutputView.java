package view;

import domain.RankCount;

public class OutputView {
    private static final String NEW_LINE = "\n";

    public static void printBuyCount(int value) {
        System.out.println(value + "개를 구매했습니다.");
    }

    public static void printResult(RankCount rankCount) {
        System.out.println(NEW_LINE + "## 로또 결과");
        System.out.println("1등 : " + rankCount.getFirst());
        System.out.println("2등 : " + rankCount.getSecond());
        System.out.println("3등 : " + rankCount.getThird());
        System.out.println("4등 : " + rankCount.getFourth());
        System.out.println("5등 : " + rankCount.getFifth());
        System.out.println("총 당첨금 : " + rankCount.getTotalMoney());
    }
}
