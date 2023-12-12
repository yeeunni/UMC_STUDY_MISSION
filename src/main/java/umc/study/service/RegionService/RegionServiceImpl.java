package umc.study.service.RegionService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.study.apiPayload.code.status.ErrorStatus;
import umc.study.apiPayload.exception.handler.TempHandler;
import umc.study.domain.Region;
import umc.study.repository.RegionRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class RegionServiceImpl implements RegionService {
    public final RegionRepository regionRepository;

    @Override
    public Region findByName(String name){
        return regionRepository.findByName(name)
                .orElseThrow(() -> new TempHandler(ErrorStatus.REGION_NOT_EXIST));
    }

    @Override
    public Region addRegion(String name) {
        return regionRepository.save(Region.builder().name(name).build());
    }
}
