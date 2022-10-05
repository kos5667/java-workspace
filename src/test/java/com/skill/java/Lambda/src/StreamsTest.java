package com.skill.java.Lambda.src;

import java.io.IOException;

import org.junit.jupiter.api.Test;

/**
 * 스트림 Streams
 * 
 * 자바 8에서 추가한 스트림(Streams)은 람다를 활용할 수 있는 기술 중 하나입니다. 
 * 자바 8 이전에는 배열 또는 컬렉션 인스턴스를 다루는 방법은 for 또는 foreach 문을 돌면서 요소 하나씩을 꺼내서 다루는 방법이었습니다.
 * 간단한 경우라면 상관없지만 로직이 복잡해질수록 코드의 양이 많아져 여러 로직이 섞이게 되고, 메소드를 나눌 경우 루프를 여러 번 도는 경우가 발생합니다.
 * 
 * 스트림은 '데이터의 흐름’입니다. 
 * 배열 또는 컬렉션 인스턴스에 함수 여러 개를 조합해서 원하는 결과를 필터링하고 가공된 결과를 얻을 수 있습니다. 
 * 또한 람다를 이용해서 코드의 양을 줄이고 간결하게 표현할 수 있습니다. 즉, 배열과 컬렉션을 함수형으로 처리할 수 있습니다.
 * 
 * 또 하나의 장점은 간단하게 병렬처리(multi-threading)가 가능하다는 점입니다. 
 * 하나의 작업을 둘 이상의 작업으로 잘게 나눠서 동시에 진행하는 것을 병렬 처리(parallel processing)라고 합니다. 
 * 즉 쓰레드를 이용해 많은 요소들을 빠르게 처리할 수 있습니다.
 */
public class StreamsTest {

    /**
     * 스트림을 이용하기 위해서는 먼저 생성을 해야 합니다. 스트림은 배열 또는 컬렉션 인스턴스를 이용해서 생성할 수 있습니다. 배열은 다음과 같이 Arrays.stream 메소드를 사용합니다.
     */
    @Test
    public void createArrayStreams() {
        // String[] arr = new String[]{"a","b","c"};

        // Stream<String> stream = Arrays.stream(arr);
        // Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
    }
    
    /**
     * 컬렉션 타입(Collection, List, Set)의 경우 인터페이스에 추가된 디폴트 메소드 stream 을 이용해서 스트림을 만들 수 있습니다.
     */
    @Test
    public void createCollectionStreams() {
        // List<String> list = Arrays.asList("a","b","c");

        // Stream<String> stream = list.stream();
        // Stream<String> parallelStream = list.parallelStream();
    }

    
    @Test
    public void createBuilderStreams() throws IOException {
        /**
         * Stream.builder()
         * 
         * 빌더(Builder)를 사용하면 스트림에 직접적으로 원하는 값을 넣을 수 있습니다. 
         * 마지막에 build 메소드로 스트림을 리턴합니다.
         */
        // Stream<String> buildeStream = Stream.<String>builder()
        //     .add("Eric").add("Elena").add("Java")
        //     .build(); // [Eric, Elena, Java]

        /**
         * Stream.generate()
         * 
         * generate 메소드를 이용하면 Supplier<T> 에 해당하는 람다로 값을 넣을 수 있습니다. 
         * Supplier<T> 는 인자는 없고 리턴값만 있는 함수형 인터페이스죠. 
         * 람다에서 리턴하는 값이 들어갑니다.
         * 
         * 이 때 생성되는 스트림은 크기가 정해져있지 않고 무한(infinite)하기 때문에 특정 사이즈로 최대 크기를 제한해야 합니다.
         * 5개의 “gen” 이 들어간 스트림이 생성됩니다.
         */
        // Stream<String> generatedStream = Stream.generate(() -> "gen").limit(5); // [el, el, el, el, el]

        /**
         * Stream.iterate()
         * 
         * iterate 메소드를 이용하면 초기값과 해당 값을 다루는 람다를 이용해서 스트림에 들어갈 요소를 만듭니다. 
         * 다음 예제에서는 30이 초기값이고 값이 2씩 증가하는 값들이 들어가게 됩니다. 즉 요소가 다음 요소의 인풋으로 들어갑니다. 
         * 이 방법도 스트림의 사이즈가 무한하기 때문에 특정 사이즈로 제한해야 합니다.
         */
        // Stream<Integer> iteratedStream = Stream.iterate(30, n -> n + 2).limit(5); // [30, 32, 34, 36, 38]

        /**
         * 기본 타입형 스트림
         * 
         * 물론 제네릭을 사용하면 리스트나 배열을 이용해서 기본 타입(int, long, double) 스트림을 생성할 수 있습니다. 
         * 하지만 제네릭을 사용하지 않고 직접적으로 해당 타입의 스트림을 다룰 수도 있습니다. range 와 rangeClosed 는 범위의 차이입니다. 
         * 두 번째 인자인 종료지점이 포함되느냐 안되느냐의 차이입니다.
         */
        // IntStream intStream = IntStream.range(1, 5); // [1, 2, 3, 4]
        // LongStream  longStream = LongStream.rangeClosed(1, 5); // [1, 2, 3, 4, 5]

        /**
         * 제네릭을 사용하지 않기 때문에 불필요한 오토박싱(auto-boxing)이 일어나지 않습니다. 
         * 필요한 경우 boxed 메소드를 이용해서 박싱(boxing)할 수 있습니다.
         */
        // Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed();

        /**
         * Java 8 의 Random 클래스는 난수를 가지고 세 가지 타입의 스트림(IntStream, LongStream, DoubleStream)을 만들어낼 수 있습니다. 
         * 쉽게 난수 스트림을 생성해서 여러가지 후속 작업을 취할 수 있어 유용합니다.
         */
        // DoubleStream doubles = new Random().doubles(3); // 난수 3개 생성
        // LongStream longs = new Random().longs(3); // 난수 3개 생성
        // IntStream ints = new Random().ints(3); // 난수 3개 생성

        /**
         * 문자열 스트링
         * 
         * 스트링을 이용해서 스트림을 생성할수도 있습니다. 다음은 스트링의 각 문자(char)를 IntStream 으로 변환한 예제입니다. 
         * char 는 문자이지만 본질적으로는 숫자이기 때문에 가능합니다.
         */
        // IntStream charsStream = "Stream".chars(); // [83, 116, 114, 101, 97, 109]

        // 다음은 정규표현식(RegEx)을 이용해서 문자열을 자르고, 각 요소들로 스트림을 만든 예제입니다.
        // Stream<String> stringStream = Pattern.compile(", ").splitAsStream("Eric, Elena, Java"); // [Eric, Elena, Java]

        /**
         * 파일 스트림
         * 
         * 자바 NIO 의 Files 클래스의 lines 메소드는 해당 파일의 각 라인을 스트링 타입의 스트림으로 만들어줍니다.
         */
        // Stream<String> lineStream = Files.lines(Paths.get("file.txt"), Charset.forName("UTF-8"));

        /**
         * 병렬 스트림 Parallel Stream
         * 
         * 스트림 생성 시 사용하는 stream 대신 parallelStream 메소드를 사용해서 병렬 스트림을 쉽게 생성할 수 있습니다. 
         * 내부적으로는 쓰레드를 처리하기 위해 자바 7부터 도입된 Fork/Join framework 를 사용합니다.
         */

        // 병렬 스트림 생성
        // Stream<Product> parallelStream = productList.parallelStream();

        // 병렬 여부 확인
        // boolean isParallel = parallelStream.isParallel();


    }
}