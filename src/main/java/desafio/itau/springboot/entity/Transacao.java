package desafio.itau.springboot.entity;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@ToString
@AllArgsConstructor
public class Transacao {

    @NotNull
    private BigDecimal valor;

    @NotNull
    private OffsetDateTime dataHora;

}
