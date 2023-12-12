package umc.study.domain;
import lombok.*;

import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;
import umc.study.domain.common.BaseEntity;
import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Store extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String address;

    @Column(nullable = false, columnDefinition = "FLOAT DEFAULT 0.0")
    private Float score;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;
}
