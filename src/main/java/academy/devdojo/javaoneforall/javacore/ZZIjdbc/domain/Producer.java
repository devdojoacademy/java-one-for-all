package academy.devdojo.javaoneforall.javacore.ZZIjdbc.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public final class Producer {
    private final Integer id;
    private final String name;
}
