package umc.study.service.RegionService;

import umc.study.domain.Region;

public interface RegionService {
    Region findByName(String name);

    Region addRegion(String name);
}
