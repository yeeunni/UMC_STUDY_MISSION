package umc.study.converter;

import umc.study.domain.Region;
import umc.study.domain.Store;
import umc.study.web.dto.StoreRespondDTO;
import umc.study.web.dto.StoreRequestDTO;

import java.time.LocalDateTime;

public class StoreConverter {
    public static StoreRespondDTO.StoreResultDTO makeResultStoreDTO(Store store){
        return StoreRespondDTO.StoreResultDTO.builder()
                .storeId(store.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Store toStore(StoreRequestDTO.StoreFromDto request, Region region){

        return Store.builder()
                .name(request.getName())
                .address(request.getAddress())
                .region(region)
                .score(0.0f)
                .build();
    }

}
