package umc.study.domain;
import lombok.*;

import lombok.Builder;
import lombok.Getter;
import umc.study.domain.common.BaseEntity;
import javax.persistence.*;

@Entity
@Table(name = "food_category")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor

public class FoodCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length=15)
    private String name;

}
