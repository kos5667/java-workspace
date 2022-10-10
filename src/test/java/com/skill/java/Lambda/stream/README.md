## Java Stream

### *Stream*

자바 8에서 추가한 스트림(*Streams*)은 람다를 활용할 수 있는 기술 중 하나입니다. 자바 8 이전에는 배열 또는 컬렉션 인스턴스를 다루는 방법은 `for` 또는 `foreach` 문을 돌면서 요소 하나씩을 꺼내서 다루는 방법이었습니다. 간단한 경우라면 상관없지만 로직이 복잡해질수록 코드의 양이 많아져 여러 로직이 섞이게 되고, 메소드를 나눌 경우 루프를 여러 번 도는 경우가 발생합니다.

스트림은 '데이터의 흐름’입니다. 배열 또는 컬렉션 인스턴스에 함수 여러 개를 조합해서 원하는 결과를 필터링하고 가공된 결과를 얻을 수 있습니다. 또한 람다를 이용해서 코드의 양을 줄이고 간결하게 표현할 수 있습니다. 즉, 배열과 컬렉션을 함수형으로 처리할 수 있습니다.

또 하나의 장점은 간단하게 병렬처리(*multi-threading*)가 가능하다는 점입니다. 하나의 작업을 둘 이상의 작업으로 잘게 나눠서 동시에 진행하는 것을 병렬 처리(*parallel processing*)라고 합니다. 즉 쓰레드를 이용해 많은 요소들을 빠르게 처리할 수 있습니다.

#### *Stream Summary*

- 생성하기
  - 배열 / 컬렉션 / 빈 스트림
  - *Stream.builder()* / *Stream.generate()* / *Stream.iterate()*
  - 기본 타입형 / *String* / 파일 스트림
  - 병렬 스트림 / 스트림 연결하기
- 가공하기
  - Filtering
  - Mapping
  - Sorting
  - Iterating
- 결과 만들기
  - Calculating
  - Reduction
  - Collecting
  - Matching
  - Iterating

---

### *Stream* 활용





> #### 참고
>
> https://futurecreator.github.io/2018/08/26/java-8-streams/
>
> 
