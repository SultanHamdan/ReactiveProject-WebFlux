package com.reactive.ReactiveProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class FluxService {

    public Flux<String> abc = Flux.just("Hello");

    public Flux<String> getFlux() {
        return Flux.just("hamdan","Hamy","Raziya","Petu");
    }
// Flux using List
    public Flux<String> fruitFlux() {
        List<String> fruitNames = List.of("WaterMalon", "Apple");
        return Flux.fromIterable(fruitNames).log();
    };
//    Empty Flux
    public Flux<Void> getBlankFlux() {
        return Flux.empty();
    }
//    Flux using Map
    public Flux<String> mapExampleFlux() {
       Flux<String> capFlux = getFlux().map(String::toUpperCase);
       return capFlux;
    }
// Flux using Filter
    public Flux<String> fluxFilter() {
        return getFlux().filter(name -> name.length()>5);
    }






}
