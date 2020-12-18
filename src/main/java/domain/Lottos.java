package domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lottos {
    private final List<Lotto> lottos;

    public Lottos(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public List<Rank> getResult(WinningLotto winningLotto) {
        return lottos.stream().map(winningLotto::match).collect(Collectors.toList());
    }
}
