package umc.study.domain.mapping;
import lombok.*;
import umc.study.domain.FoodCategory;
import umc.study.domain.Member;
import umc.study.domain.common.BaseEntity;
import umc.study.domain.eunums.MissionStatus;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor

public class MemberPrefer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private FoodCategory foodCategory;
    public void setMember(Member member){
        if(this.member != null)     //현재 MemberPrefer 객체에 이미 멤버가 설정되어 있다면
            member.getMemberPreferList().remove(this); //기존 멤버의 MemberPreferList에서 현재 객체를 제거합니다.
        this.member = member;
        member.getMemberPreferList().add(this); //새로운 List추가
    }
    public void setFoodCategory(FoodCategory foodCategory){
        this.foodCategory = foodCategory;
    }
}
