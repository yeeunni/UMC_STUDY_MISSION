package umc.study.service.StoreService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.study.converter.StoreConverter;
import umc.study.domain.Region;
import umc.study.domain.Store;
import umc.study.repository.StoreRepository;
import umc.study.service.RegionService.RegionService;
import umc.study.web.dto.StoreRequestDTO;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class StoreCommandServiceImpl implements StoreCommandService {
    public final StoreRepository storeRepository;
    public final RegionService regionService;
    @Override
    @Transactional
    public Store joinStore(StoreRequestDTO.StoreFromDto request) {

        Region newRegion = regionService.findByName(request.getRegion());
        Store newStore= StoreConverter.toStore(request,newRegion);
        return storeRepository.save(newStore);
    }
}
