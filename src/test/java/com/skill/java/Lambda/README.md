## [Java Function](https://tinyurl.com/2fwblc5e) (Functional Interface)

함수형 인터페이스(*Functional interfaces*) 람다 표현과 방법에 대한 대상 형식 제공한다.

각 함수 인터페이스에는 람다 식의 매개 변수와 반환 유형이 일치하거나 적응되는 함수 인터페이스에 대한 함수 방법이라고 하는 단일 추상 방법이 있습니다. 

함수 인터페이스는 할당 컨텍스트, 메서드 호출 또는 캐스트 컨텍스트와 같은 여러 컨텍스트에서 대상 유형을 제공할 수 있습니다.

---

### **Interface Summary**

| Interface                                                    | Description                                                  |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| [BiConsumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/BiConsumer.html)<T,U> | Represents an operation that accepts two input arguments and returns no result. |
| [BiFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/BiFunction.html)<T,U,R> | Represents a function that accepts two arguments and produces a result. |
| [BinaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/BinaryOperator.html)<T> | Represents an operation upon two operands of the same type, producing a result of the same type as the operands. |
| [BiPredicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/BiPredicate.html)<T,U> | Represents a predicate (boolean-valued function) of two arguments. |
| [BooleanSupplier](https://docs.oracle.com/javase/8/docs/api/java/util/function/BooleanSupplier.html) | Represents a supplier of `boolean`-valued results.           |
| [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)<T> | Represents an operation that accepts a single input argument and returns no result. |
| [DoubleBinaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleBinaryOperator.html) | Represents an operation upon two `double`-valued operands and producing a `double`-valued result. |
| [DoubleConsumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleConsumer.html) | Represents an operation that accepts a single `double`-valued argument and returns no result. |
| [DoubleFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleFunction.html)<R> | Represents a function that accepts a double-valued argument and produces a result. |
| [DoublePredicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoublePredicate.html) | Represents a predicate (boolean-valued function) of one `double`-valued argument. |
| [DoubleSupplier](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleSupplier.html) | Represents a supplier of `double`-valued results.            |
| [DoubleToIntFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleToIntFunction.html) | Represents a function that accepts a double-valued argument and produces an int-valued result. |
| [DoubleToLongFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleToLongFunction.html) | Represents a function that accepts a double-valued argument and produces a long-valued result. |
| [DoubleUnaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleUnaryOperator.html) | Represents an operation on a single `double`-valued operand that produces a `double`-valued result. |
| [Function](https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html)<T,R> | Represents a function that accepts one argument and produces a result. |
| [IntBinaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntBinaryOperator.html) | Represents an operation upon two `int`-valued operands and producing an `int`-valued result. |
| [IntConsumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntConsumer.html) | Represents an operation that accepts a single `int`-valued argument and returns no result. |
| [IntFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntFunction.html)<R> | Represents a function that accepts an int-valued argument and produces a result. |
| [IntPredicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntPredicate.html) | Represents a predicate (boolean-valued function) of one `int`-valued argument. |
| [IntSupplier](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntSupplier.html) | Represents a supplier of `int`-valued results.               |
| [IntToDoubleFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntToDoubleFunction.html) | Represents a function that accepts an int-valued argument and produces a double-valued result. |
| [IntToLongFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntToLongFunction.html) | Represents a function that accepts an int-valued argument and produces a long-valued result. |
| [IntUnaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntUnaryOperator.html) | Represents an operation on a single `int`-valued operand that produces an `int`-valued result. |
| [LongBinaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongBinaryOperator.html) | Represents an operation upon two `long`-valued operands and producing a `long`-valued result. |
| [LongConsumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongConsumer.html) | Represents an operation that accepts a single `long`-valued argument and returns no result. |
| [LongFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongFunction.html)<R> | Represents a function that accepts a long-valued argument and produces a result. |
| [LongPredicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongPredicate.html) | Represents a predicate (boolean-valued function) of one `long`-valued argument. |
| [LongSupplier](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongSupplier.html) | Represents a supplier of `long`-valued results.              |
| [LongToDoubleFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongToDoubleFunction.html) | Represents a function that accepts a long-valued argument and produces a double-valued result. |
| [LongToIntFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongToIntFunction.html) | Represents a function that accepts a long-valued argument and produces an int-valued result. |
| [LongUnaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongUnaryOperator.html) | Represents an operation on a single `long`-valued operand that produces a `long`-valued result. |
| [ObjDoubleConsumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/ObjDoubleConsumer.html)<T> | Represents an operation that accepts an object-valued and a `double`-valued argument, and returns no result. |
| [ObjIntConsumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/ObjIntConsumer.html)<T> | Represents an operation that accepts an object-valued and a `int`-valued argument, and returns no result. |
| [ObjLongConsumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/ObjLongConsumer.html)<T> | Represents an operation that accepts an object-valued and a `long`-valued argument, and returns no result. |
| [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)<T> | Represents a predicate (boolean-valued function) of one argument. |
| [Supplier](#Interface-Supplier)<T>                           | Represents a supplier of results.                            |
| [ToDoubleBiFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/ToDoubleBiFunction.html)<T,U> | Represents a function that accepts two arguments and produces a double-valued result. |
| [ToDoubleFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/ToDoubleFunction.html)<T> | Represents a function that produces a double-valued result.  |
| [ToIntBiFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/ToIntBiFunction.html)<T,U> | Represents a function that accepts two arguments and produces an int-valued result. |
| [ToIntFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/ToIntFunction.html)<T> | Represents a function that produces an int-valued result.    |
| [ToLongBiFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/ToLongBiFunction.html)<T,U> | Represents a function that accepts two arguments and produces a long-valued result. |
| [ToLongFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/ToLongFunction.html)<T> | Represents a function that produces a long-valued result.    |
| [UnaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/UnaryOperator.html)<T> | Represents an operation on a single operand that produces a result of the same type as its operand. |



### Example

---

#### [Interface Function]()<T,R>

> **Type Parameters:**
>
> `T` - the type of the input to the function
>
> `R` - the type of the result of the function

```java
// Example1
Function<Integer, String> function = (n) -> "parameter : " + n;
String result = function.apply(5); // result = parameter : 5

// Example2
Function<Integer, String> function = (n) -> { return "parameter : " + n; };
String result = function.apply(5); // result = parameter : 5
```

##### andThen()

다수의 Function 순차적 수행

```java
// 이 함수를 입력에 먼저 적용한 다음 결과에 사후 함수를 적용하는 합성 함수를 반환합니다
Function<Integer, Integer> function1 = (n) -> n + n;
Function<Integer, String>  function2 = (r) -> "parameter : " + r;
String result = function1.andThen(function2).apply(5); // result = parameter : 10
```

##### compose()

Function 합성

```java
// 먼저 입력에 이전 함수를 적용한 다음 이 함수를 결과에 적용하는 합성 함수를 반환합니다
Function<Integer, Integer> function1 = n -> n + 2; // 3 + 2 = 5
Function<Integer, Integer> function2 = n -> n * 3; // 5 * 3 = 15
Function<Integer, Integer> composeFunc = function2.compose(function1);
Integer result = composeFunc.apply(3); // result = 15
```

---

#### [Interface Supplier](https://docs.oracle.com/javase/8/docs/api/java/util/function/Supplier.html)\<T>

> **Type Parameters:**
>
> `T` - the type of results supplied by this supplier

```java
Supplier<String> supplier = () -> "Hello World!";
String result = supplier.get(); // result = Hello World!
```

---