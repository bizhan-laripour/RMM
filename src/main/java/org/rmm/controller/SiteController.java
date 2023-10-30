package org.rmm.controller;

import org.rmm.entity.Site;
import org.rmm.repository.SiteRepository;
import org.rmm.service.SiteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/site/")
public class SiteController extends GenericController<SiteService , Site , SiteRepository>{

    public SiteController(SiteService service) {
        super(service);
    }
}
