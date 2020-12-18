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
        OutputView.printResult(lottos.stream().map(winningLotto::match).collect(Collectors.toList()));
    }
}
