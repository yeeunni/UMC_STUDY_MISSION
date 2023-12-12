package umc.study.converter;

import umc.study.domain.FoodCategory;
import umc.study.domain.mapping.MemberPrefer;

import java.util.List;
import java.util.stream.Collectors;

public class MemberPreferConverter {
    public static List<MemberPrefer> toMemberPreferList(List<FoodCategory> foodCategoryList){

        return foodCategoryList.stream() //기입받은 category를 통해 MemberPrefer 생성
                .map(foodCategory ->
                        MemberPrefer.builder()
                                .foodCategory(foodCategory)
                                .build()
                ).collect(Collectors.toList());
    }
}
