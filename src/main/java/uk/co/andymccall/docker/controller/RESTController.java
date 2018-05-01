package uk.co.andymccall.docker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import uk.co.andymccall.docker.model.Ping;
import uk.co.andymccall.docker.model.PingJsonResponse;

@RestController
@RequestMapping("/")
public class RESTController {

    private static final Logger logger =
            LoggerFactory.getLogger(RESTController.class);

    @RequestMapping(value = "/ping", method = RequestMethod.GET, produces="application/json;charset=UTF-8")
    public @ResponseBody
    PingJsonResponse getPing() {
        logger.debug("Entering getPing()");

        Ping ping = new Ping();

        PingJsonResponse pingJsonResponse = new PingJsonResponse();
        pingJsonResponse.setResult(ping);

        pingJsonResponse.setStatus(200);

        logger.debug("Exiting getPing()");
        return (pingJsonResponse);
    }

}