package org.rmm.service;

import org.rmm.entity.Site;
import org.rmm.repository.SiteRepository;
import org.springframework.stereotype.Service;

@Service
public class SiteService extends GenericService<Site , SiteRepository>{


    public SiteService(SiteRepository repository) {
        super(repository);
    }
}
