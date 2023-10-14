package org.rmm.controller;

import org.rmm.dto.Command;
import org.rmm.service.CommandService;
import org.rmm.service.OsInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OsTotalInfoController {

    private final OsInformationService osInformationService;

    private final CommandService commandService;

    @Autowired
    public OsTotalInfoController(OsInformationService osInformationService , CommandService commandService) {
        this.osInformationService = osInformationService;
        this.commandService = commandService;
    }


    @RequestMapping(value = "/get-total-info" , method = RequestMethod.GET)
    public ResponseEntity<?> getOsTotalInfo(){
        return new ResponseEntity<>(osInformationService.getOsTotalInfo() , HttpStatus.ACCEPTED);
    }


    @RequestMapping(value = "/command" , method = RequestMethod.POST)
    public void command(@RequestBody Command command){
        commandService.runCommand(command.getCommand());
    }
}
