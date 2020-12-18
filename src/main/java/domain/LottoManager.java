package domain;

import view.InputView;

import java.util.Scanner;

public class LottoManager {
    private static final int LOTTO_PRICE = 1000;

    public void doLotto(Scanner scanner) {
        viewInputMoney(scanner);
    }

    public int viewInputMoney(Scanner scanner) {
        return getBuyCount(InputView.inputMoneyToBuyLotto(scanner));
    }

    private int getBuyCount(int money) {
        return money / LOTTO_PRICE;
    }
}
