package umc.study.web.dto;

import lombok.Getter;
import umc.study.validation.annotation.ExistCategories;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class StoreRequestDTO {
    @Getter
    public static class StoreFromDto{
        @NotBlank(message = "가게 이름은 필수입니다.")
        private String name;

        @NotBlank
        private String address;

        @NotBlank(message = "지역 선택은 필수입니다.")
        private String region;

    }
}
