package com.nickbi.webfluxdemo.webflux.handler;

import com.nickbi.webfluxdemo.webflux.entity.Demo;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * @author nickbi
 * @date 2018-08-28
 */
@Component
public class DemoHandler {

    /**
     * we can import static method ServerResponse.ok()  to simply use it,by use ok() to replace it
     * say hello handler
     *
     * @return
     */
    public Mono<ServerResponse> sayHello(ServerRequest request) {
        return ok().contentType(MediaType.APPLICATION_JSON).body(Mono.just(Demo.builder().name("WebFlux").title
                ("Hello Spring WebFlux !").build()), Demo.class);
    }

    /**
     * get current date
     *
     * @param request
     * @return
     */
    public Mono<ServerResponse> getDate(ServerRequest request) {
        return ok().contentType(MediaType.APPLICATION_JSON).body(Mono.just(new Date()), Date.class);
    }
}
