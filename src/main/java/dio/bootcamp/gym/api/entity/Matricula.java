package dio.bootcamp.gym.api.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@NoArgsContructor
@AllArsContructor
@Entity
@Table(name = "tb_matricula")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")

    private Aluno aluno;
    private LocalDateTime dataDaMatricula = LocalDateTime.now();
}
