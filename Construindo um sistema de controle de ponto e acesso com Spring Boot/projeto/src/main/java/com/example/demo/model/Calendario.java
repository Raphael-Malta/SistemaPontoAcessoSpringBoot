package com.example.demo.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class calendario {
    @Id
    private long id;
    private tipoData tipoData;
    private String descricao;
    private LocalDateTime dataEsoecial;
}
