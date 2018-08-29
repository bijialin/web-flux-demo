package com.nickbi.webfluxdemo.webflux;

import com.nickbi.webfluxdemo.webflux.handler.DemoHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * @author nickbi
 * @date 2018-08-28
 */

@Configuration
public class DemoRoutes {

    private DemoHandler demoHandler;

    public DemoRoutes(DemoHandler demoHandler) {
        this.demoHandler = demoHandler;
    }

    /**
     * say hello route
     *
     * @return
     */
    @Bean
    public RouterFunction<ServerResponse> routes() {
        return route(GET("/sayHello").and(accept(MediaType.APPLICATION_JSON)), demoHandler::sayHello).andRoute(GET
                ("/date").and(accept(MediaType.APPLICATION_JSON)), demoHandler::getDate);
    }

}
