package umc.study.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.study.apiPayload.ApiResponse;
import umc.study.converter.StoreConverter;
import umc.study.domain.Store;
import umc.study.repository.StoreRepository;
import umc.study.service.StoreService.StoreCommandService;
import umc.study.web.dto.StoreRequestDTO;
import umc.study.web.dto.StoreRespondDTO;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/stores")
public class StoreRestController {
    //private final StoreRepository storeRepository;
    private final StoreCommandService storeService;

    @PostMapping("/add")
    public ApiResponse<StoreRespondDTO.StoreResultDTO> joinStoreInSpecificArea(@RequestBody @Valid StoreRequestDTO.StoreFromDto request){
        Store store = storeService.joinStore(request);
        return ApiResponse.onSuccess(StoreConverter.makeResultStoreDTO(store));
    }
}
