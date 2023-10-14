package org.rmm.terminal;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CommandRunner {


    public void commandExecuter(String command) throws IOException, InterruptedException {
        boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
        Process process;
        if (isWindows) {
            process = Runtime.getRuntime()
                    .exec(String.format("cmd.exe /c %s", command));
        } else {
            process = Runtime.getRuntime()
                    .exec(String.format("/bin/sh -c %s", command));
        }
        StreamGobbler streamGobbler =
                new StreamGobbler(process.getInputStream(), System.out::println);
        streamGobbler.run();

        int exitCode = process.waitFor();

    }
}
