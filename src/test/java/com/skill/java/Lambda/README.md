### 함수형 인터페이스와 람다 표현식

#### 1. 함수형 인터페이스란?

- 추상 메소드를 단 하나만 가지고 있는 인터페이스
- static 메소드나, default 메소드는 몇 개를 갖고 있던 상관없으나 추상메소드는 단 하나여야 한다.
- @FunctionalInterface 어노테이션을 지닌 인터페이스



#### 2. 람다 표현식이란?

- 함수형 인터페이스의 인스턴스를 만드는 방법으로 쓰일 수 있다.
- 함수형 인터페이스를 구현할 때 쓸 수 있는 표현 방법으로 코드를 간결하게 할 수 있다.
- 메소드의 매개변수, 리턴 타입, 변수로 만들어 사용할 수 있다.



#### 3. 자바에서 함수형 프로그래밍

- 순수 함수 (Pure function)

- - 함수 밖에 있는 값을 참조하거나 변경하려 하면 안 된다. 오직 **함수 내부에서 쓰는 값(매개변수)만 사용**하는 것을 지향해야 한다.
  - 사이드 이팩트가 없다. (함수 밖에 있는 값을 변경하지 않는다.)
  - 상태가 없다. (함수 밖에 있는 값을 사용하지 않는다.)

- 고차 함수 (Higher-Order Function)

- - 함수가 함수를 매개변수로 받을 수 있고 함수를 리턴할 수도 있다.

- 불변성



#### 4. 자바에서 기본으로 제공하는 함수형 인터페이스

- 자바에서 미리 정의해둔 자주 사용할만한 함수 인터페이스
  - Function<T, R>
  - BiFunction<T, U, R>
  - Consumer<T>
  - Supplier<T>
  - Predicate<T>
  - UnaryOperator<T>
  - BinaryOperator<T>
  - 그 외 : [java.util.function 패키지](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)



> #### 참조
>
> - https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
> - https://young-bin.tistory.com/55
