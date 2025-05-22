package com.reactive.ReactiveProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@SpringBootTest
class ReactiveProjectApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void workingWithMono() {
		Mono<String> m1 = Mono.just("Hello");
		Mono<String> m2 = Mono.just("Hii");

		Mono<Tuple2<String, String>> combinedMono = Mono.zip(m1, m2);

//		combinedMono.subscribe(data -> {
//			System.out.println(data.getT1());
//			System.out.println(data.getT2());
//		});
//		m1.subscribe(data -> {
//			System.out.println("data is " + data);
//		});
		Flux<String> concatString = m1.concatWith(m2);
		concatString.subscribe(System.out::println);


	}

}
