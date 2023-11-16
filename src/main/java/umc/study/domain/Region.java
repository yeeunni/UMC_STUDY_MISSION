package umc.study.domain;
import lombok.*;

import lombok.Builder;
import lombok.Getter;
import umc.study.domain.common.BaseEntity;
import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Region extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, length = 20)
    private String name;


}
