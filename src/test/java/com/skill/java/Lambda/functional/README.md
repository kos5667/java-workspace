## [Java Function](https://tinyurl.com/2fwblc5e) (Functional Interface)

함수형 인터페이스(*Functional interfaces*) 람다 표현과 방법에 대한 대상 형식 제공한다.

각 함수 인터페이스에는 람다 식의 매개 변수와 반환 유형이 일치하거나 적응되는 함수 인터페이스에 대한 함수 방법이라고 하는 단일 추상 방법이 있습니다. 

함수 인터페이스는 할당 컨텍스트, 메서드 호출 또는 캐스트 컨텍스트와 같은 여러 컨텍스트에서 대상 유형을 제공할 수 있습니다.

### **@Functional Interfaces**

It's recommended that all functional interfaces have an informative *@FunctionalInterface* annotation. This clearly communicates the purpose of the interface, and also allows a compiler to generate an error if the annotated interface does not satisfy the conditions.

| Functional Interfaces | Description                                               | Descripter    | Method                    |
| --------------------- | --------------------------------------------------------- | ------------- | ------------------------- |
| Predicate             | 값을 전달받아 true/false를 리턴한다                       | `T → boolean` | `boolean test(T t)`       |
| Consumer              | 값을 받아서 처리만 하고 결과 리턴은 하지 않는다           | `T → void`    | `void accept(T t)`        |
| Supplier              | 입력값 없이 리턴값만 있다                                 | `() → T`      | `T get()`                 |
| Function<T, R>        | 값을 다른 값으로 변환해 리턴한다                          | `T → R`       | `R apply(T t)`            |
| UnaryOperator\<T>     | 입력과 리턴 타입이 동일. `Function`.                      | `T -> R`      |                           |
| BinaryOperator\<T>    | 입력(2개)과 리턴 타입이 동일. `Function`.                 | `(T,T) → R`   |                           |
| Comparator            | Compares its two arguments for order.                     | `(T,T) → int` | `int compare(T o1, T o2)` |
| Comparable            | Compares this object with the specified object for order. | `(T) → int`   | `int compareTo(T o)`      |
| Runnable              | -                                                         | `() → void`   | `void run()`              |
| Callable              | -                                                         | `() → T`      | `V call()`                |



### Interface Summary

---

#### Interface Function<T,R>

| Interface                                                    | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| [Function](https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html)<T,R> | Represents a function that accepts one argument and produces a result. |
| [BiFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/BiFunction.html)<T,U,R> | Represents a function that accepts two arguments and produces a result. |
| [IntFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntFunction.html)<R> | Represents a function that accepts an int-valued argument and produces a result. |
| [LongFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongFunction.html)<R> | Represents a function that accepts a long-valued argument and produces a result. |
| [DoubleFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleFunction.html)<R> | Represents a function that accepts a double-valued argument and produces a result. |
| [IntToLongFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntToLongFunction.html) | Represents a function that accepts an int-valued argument and produces a long-valued result. |
| [IntToDoubleFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntToDoubleFunction.html) | Represents a function that accepts an int-valued argument and produces a double-valued result. |
| [LongToIntFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongToIntFunction.html) | Represents a function that accepts a long-valued argument and produces an int-valued result. |
| [LongToDoubleFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongToDoubleFunction.html) | Represents a function that accepts a long-valued argument and produces a double-valued result. |
| [DoubleToIntFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleToIntFunction.html) | Represents a function that accepts a double-valued argument and produces an int-valued result. |
| [DoubleToLongFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleToLongFunction.html) | Represents a function that accepts a double-valued argument and produces a long-valued result. |
| [ToDoubleBiFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/ToDoubleBiFunction.html)<T,U> | Represents a function that accepts two arguments and produces a double-valued result. |
| [ToDoubleFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/ToDoubleFunction.html)<T> | Represents a function that produces a double-valued result.  |
| [ToIntBiFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/ToIntBiFunction.html)<T,U> | Represents a function that accepts two arguments and produces an int-valued result. |
| [ToIntFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/ToIntFunction.html)<T> | Represents a function that produces an int-valued result.    |
| [ToLongBiFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/ToLongBiFunction.html)<T,U> | Represents a function that accepts two arguments and produces a long-valued result. |
| [ToLongFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/ToLongFunction.html)<T> | Represents a function that produces a long-valued result.    |

##### Function<T,R>

> **Type Parameters:**
> `T` - the type of the input to the function
> `R` - the type of the result of the function
>
> **Returns:**
> `T` - the function result

#####  BiFunction<T,U,R>

> **Type Parameters:**
>
> `T` - the type of the first argument to the function
>
> `U` - the type of the second argument to the function
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

###### andThen()

```java
// 다수의 Function 순차적 수행
// 이 함수를 입력에 먼저 적용한 다음 결과에 사후 함수를 적용하는 합성 함수를 반환합니다
Function<Integer, Integer> function1 = (n) -> n + n;
Function<Integer, String>  function2 = (r) -> "parameter : " + r;
String result = function1.andThen(function2).apply(5); // result = parameter : 10
```

###### compose()

```java
// Function 합성
// 먼저 입력에 이전 함수를 적용한 다음 이 함수를 결과에 적용하는 합성 함수를 반환합니다
Function<Integer, Integer> function1 = n -> n + 2; // 3 + 2 = 5
Function<Integer, Integer> function2 = n -> n * 3; // 5 * 3 = 15
Function<Integer, Integer> composeFunc = function2.compose(function1);
Integer result = composeFunc.apply(3); // result = 15
```

---

#### Interface Supplier\<T>

| Interface                                                    | Description                                        |
| ------------------------------------------------------------ | -------------------------------------------------- |
| [Supplier](https://docs.oracle.com/javase/8/docs/api/java/util/function/Supplier.html)<T> | Represents a supplier of results.                  |
| [IntSupplier](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntSupplier.html) | Represents a supplier of `int`-valued results.     |
| [LongSupplier](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongSupplier.html) | Represents a supplier of `long`-valued results.    |
| [DoubleSupplier](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleSupplier.html) | Represents a supplier of `double`-valued results.  |
| [BooleanSupplier](https://docs.oracle.com/javase/8/docs/api/java/util/function/BooleanSupplier.html) | Represents a supplier of `boolean`-valued results. |

##### Supplier\<T>

> **Type Parameters:**
> `T` - the type of results supplied by this supplier
>
> **Returns:**
> `T` - Gets a result.

```java
Supplier<String> supplier = () -> "Hello World!";
String result = supplier.get(); // result = Hello World!
```

##### IntSupplier

```java
IntSupplier intSupplier1 = () -> Integer.MAX_VALUE; // 2147483647
IntSupplier intSupplier2 = () -> Integer.MIN_VALUE; // -2147483648
IntSupplier intSupplier3 = () -> { return (int) (Math.random() * 10); };
```

##### LongSupplier

```java
LongSupplier longSupplier1 = () -> Long.MAX_VALUE; // 9223372036854775807
LongSupplier longSupplier2 = () -> Long.MIN_VALUE; // -9223372036854775808
```

##### DoubleSupplier

```java
DoubleSupplier doubleSupplier1 = () -> Double.MAX_VALUE; // 1.7976931348623157E308
DoubleSupplier doubleSupplier2 = () -> Double.MIN_VALUE; // 4.9E-324
DoubleSupplier doubleSupplier3 = () -> Double.MIN_NORMAL; // 2.2250738585072014E-308
```

##### BooleanSupplier

```java
BooleanSupplier booleanSupplier = () -> true; // true
```

---

#### Interface Consumer\<T>

| Interface                                                    | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)<T> | Represents an operation that accepts a single input argument and returns no result. |
| [BiConsumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/BiConsumer.html)<T,U> | Represents an operation that accepts two input arguments and returns no result. |
| [IntConsumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntConsumer.html) | Represents an operation that accepts a single `int`-valued argument and returns no result. |
| [LongConsumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongConsumer.html) | Represents an operation that accepts a single `long`-valued argument and returns no result. |
| [DoubleConsumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleConsumer.html) | Represents an operation that accepts a single `double`-valued argument and returns no result. |
| [ObjDoubleConsumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/ObjDoubleConsumer.html)<T> | Represents an operation that accepts an object-valued and a `double`-valued argument, and returns no result. |
| [ObjIntConsumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/ObjIntConsumer.html)<T> | Represents an operation that accepts an object-valued and a `int`-valued argument, and returns no result. |
| [ObjLongConsumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/ObjLongConsumer.html)<T> | Represents an operation that accepts an object-valued and a `long`-valued argument, and returns no result. |

##### Consumer\<T>

>  **Type Parameters:**
>  `T` - the type of the input to the operation
>
>  **Returns:**
>  `void`

```java
Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
consumer.accept("hello world");
```

---

#### Interface BinaryOperator\<T>

| Interface                                                    | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| [BinaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/BinaryOperator.html)<T> | Represents an operation upon two operands of the same type, producing a result of the same type as the operands. |
| [IntBinaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntBinaryOperator.html) | Represents an operation upon two `int`-valued operands and producing an `int`-valued result. |
| [LongBinaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongBinaryOperator.html) | Represents an operation upon two `long`-valued operands and producing a `long`-valued result. |
| [DoubleBinaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleBinaryOperator.html) | Represents an operation upon two `double`-valued operands and producing a `double`-valued result. |

##### BinaryOperator\<T>

>  **Type Parameters:**
>  `T` - the type of the operands and result of the operator
>
>  **Returns:**
>  `T` - a `BinaryOperator` which returns the lesser of its operands, according to the supplied `Comparator`

```java
// Example1
BinaryOperator<Integer> binaryOperator1 = (x, y) -> x + y;
Integer result1 = binaryOperator1.apply(1, 2); // 3

// Example2
Comparator<Integer> comparator1 = Comparator.naturalOrder();
BinaryOperator<Integer> binaryOperator2 = BinaryOperator.minBy(comparator1);
Integer result2 = binaryOperator2.apply(2, 5); // 2

// Example3
Comparator<Integer> comparator2 = Comparator.reverseOrder();
BinaryOperator<Integer> binaryOperator3 = BinaryOperator.maxBy(comparator2);
Integer result3 = binaryOperator3.apply(2, 5); // 5

// Example4
BinaryOperator<Item> binaryOperator4 = BinaryOperator.minBy((Item i1, Item i2) -> i1.getKey() - i2.getKey());
Item item1 = new Item(10, "key1");
Item item2 = new Item(20, "key2");
Item min = binaryOperator4.apply(item1, item2); // item1
```

#### Interface  UnaryOperator\<T>

| Interface                                                    | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| [UnaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/UnaryOperator.html)<T> | Represents an operation on a single operand that produces a result of the same type as its operand. |
| [IntUnaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntUnaryOperator.html) | Represents an operation on a single `int`-valued operand that produces an `int`-valued result. |
| [LongUnaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongUnaryOperator.html) | Represents an operation on a single `long`-valued operand that produces a `long`-valued result. |
| [DoubleUnaryOperator](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleUnaryOperator.html) | Represents an operation on a single `double`-valued operand that produces a `double`-valued result. |

##### UnaryOperator\<T>

>  **Type Parameters:**
>  `T` - the type of the operand and result of the operator
>
>  **Returns:**
>  `T` - a unary operator that always returns its input argument

```java
UnaryOperator<Integer> unaryOperator = x -> x * 2;
Integer result = unaryOperator.apply(2); // 4;
```

---

#### Interface Predicate\<T>

| Interface                                                    | Description                                                  |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)<T> | Represents a predicate (boolean-valued function) of one argument. |
| [BiPredicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/BiPredicate.html)<T,U> | Represents a predicate (boolean-valued function) of two arguments. |
| [IntPredicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntPredicate.html) | Represents a predicate (boolean-valued function) of one `int`-valued argument. |
| [LongPredicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/LongPredicate.html) | Represents a predicate (boolean-valued function) of one `long`-valued argument. |
| [DoublePredicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/DoublePredicate.html) | Represents a predicate (boolean-valued function) of one `double`-valued argument. |

##### Predicate\<T>

>  **Type Parameters:**
>  `T` - the type of the input to the predicate
>
>  **Returns:**
>  `boolean`

```java
Predicate<Integer> predicate = i -> i > 2;
predicate.test(1); // false
predicate.test(3); // true

```

###### and()

```java
Predicate<Integer> predicate1 = (num) -> num > 10;
Predicate<Integer> predicate2 = (num) -> num < 20;

boolean result = predicate1.and(predicate2).test(25);
System.out.println("25 : 10 < num < 20 ? " + result); // false

result = predicate1.and(predicate2).test(15);
System.out.println("15: 10 < num < 20 ? " + result); // true
```

###### or()

```java
Predicate<Integer> predicate1 = (num) -> num > 10;
Predicate<Integer> predicate2 = (num) -> num < 0;

boolean result = predicate1.or(predicate2).test(5);
System.out.println("5 : num < 0 or num > 10 ? " + result); // false

result = predicate1.or(predicate2).test(15);
System.out.println("15 : num < 0 or num > 10 ? " + result); // true

result = predicate1.or(predicate2).test(-5);
System.out.println("-5 : num < 0 or num > 10 ? " + result); // true
```

---

