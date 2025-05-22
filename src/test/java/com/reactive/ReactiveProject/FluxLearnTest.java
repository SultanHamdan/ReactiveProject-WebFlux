package com.reactive.ReactiveProject;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@SpringBootTest
public class FluxLearnTest {

    private static final Logger log = LoggerFactory.getLogger(FluxLearnTest.class);
    @Autowired
    private FluxService fluxService;

    @Test
    public void fluxTest1() {
        fluxService.getFlux().subscribe(data -> {
            System.out.println(data);
            System.out.println("Getting done");
        });
    }

//    Using List
    @Test
    public void fluxTest2() {
        fluxService.fruitFlux().subscribe(data -> {
            System.out.println(data);
        });
        // 1 More way is
        fluxService.fruitFlux().subscribe(System.out::println);
    }

//    Flux using Map
    @Test
    public void fluxTest3() {
        fluxService.mapExampleFlux().subscribe(data -> {
            System.out.println(data);
        });
        fluxService.mapExampleFlux().subscribe(System.out::println);
    }

//    For Testing Flux
//    @Test
//    public void fluxTestCase4() {
//        Flux<String> testCase = fluxService.mapExampleFlux();
//        StepVerifier.create(capFlux)
//                .expectNext("Hamdan","Raziya")
//                .verifyComplete();
//
//    }

//    Flux with Filter
    @Test
    public void fluxTest5() {
        fluxService.fluxFilter().subscribe(System.out::println);
    }




}
