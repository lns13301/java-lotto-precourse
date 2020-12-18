package domain;

/**
 * 당첨 번호를 담당하는 객체
 */
public class WinningLotto {
    private final Lotto lotto;
    private final int bonusNo;

    public WinningLotto(Lotto lotto, int bonusNo) {
        this.lotto = lotto;
        this.bonusNo = bonusNo;
    }

    public Rank match(Lotto userLotto) {
        return Rank.valueOf(getLottoMatchCount(userLotto), isMatchBonusNumber(userLotto));
    }

    private int getLottoMatchCount(Lotto lotto) {
        return (int) lotto.getNumbers().stream()
                .mapToInt(number -> number)
                .filter(this::isMatchNumber)
                .count();
    }

    private boolean isMatchNumber(int userNumber) {
        return lotto.getNumbers().stream().mapToInt(number -> number).anyMatch(number -> number == userNumber);
    }

    private boolean isMatchBonusNumber(Lotto lotto) {
        return lotto.getNumbers().stream().mapToInt(number -> number).anyMatch(number -> number == bonusNo);
    }
}
