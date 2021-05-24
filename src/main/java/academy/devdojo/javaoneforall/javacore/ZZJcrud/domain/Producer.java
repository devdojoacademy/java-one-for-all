package academy.devdojo.javaoneforall.javacore.ZZJcrud.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer {
    Integer id;
    String name;
}
