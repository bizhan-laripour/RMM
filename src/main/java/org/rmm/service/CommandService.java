package org.rmm.service;

import org.rmm.terminal.CommandRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CommandService {


    private final CommandRunner commandRunner;

    @Autowired
    public CommandService(CommandRunner commandRunner) {
        this.commandRunner = commandRunner;
    }


    public String runCommand(String command){
        try {
            commandRunner.commandExecuter(command);
            return "success";

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
