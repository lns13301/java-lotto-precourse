package view;

import domain.Rank;

import java.util.List;

public class OutputView {
    public static void printBuyCount(int value) {
        System.out.println(value + "개를 구매했습니다.");
    }

    public static void printResult(List<Rank> ranks) {
        ranks.forEach(rank ->
                System.out.println("맞춘 개수 : " + rank.getCountOfMatch()
                + ", 당첨금 : " + rank.getWinningMoney()));
    }
}
