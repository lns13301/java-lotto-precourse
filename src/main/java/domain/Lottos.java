package domain;

import view.OutputView;

import java.util.List;
import java.util.stream.Collectors;

public class Lottos {
    private final List<Lotto> lottos;

    public Lottos(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public void showResult(WinningLotto winningLotto) {
        List<Rank> ranks = lottos.stream().map(winningLotto::match).collect(Collectors.toList());

        OutputView.printResult(getTotalRankCount(ranks));
    }

    private RankCount getTotalRankCount(List<Rank> ranks) {
        return addRankCount(ranks);
    }

    private RankCount addRankCount(List<Rank> ranks) {
        return new RankCount(getFirstRank(ranks)
                , getSecondRank(ranks)
                , getThirdRank(ranks)
                , getFourthRank(ranks)
                , getFifthRank(ranks));
    }

    private int getFirstRank(List<Rank> ranks) {
        return (int) ranks.stream().filter(rank -> rank == Rank.FIRST).count();
    }

    private int getSecondRank(List<Rank> ranks) {
        return (int) ranks.stream().filter(rank -> rank == Rank.SECOND).count();
    }

    private int getThirdRank(List<Rank> ranks) {
        return (int) ranks.stream().filter(rank -> rank == Rank.THIRD).count();
    }

    private int getFourthRank(List<Rank> ranks) {
        return (int) ranks.stream().filter(rank -> rank == Rank.FOURTH).count();
    }

    private int getFifthRank(List<Rank> ranks) {
        return (int) ranks.stream().filter(rank -> rank == Rank.FIFTH).count();
    }
}
