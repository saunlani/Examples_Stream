/* Stream are generic interfaces.
 * A stream is a sequence of objects that supports various methods which can be pipelined 
 * to produce the desired result.
 * Streams bring functional programming to Java. (Prior to Java 8, everything was object oriented.)
 * Streams create concise, functional code.
 * Streams make heavy use of lambda expressions.
 * 
 * A stream pipeline consists of a - source
 * 								   - 0 or more intermediate operations
 * 								   - a terminal operation.
 * 
 * Streams do ~not~ modify it's source.
 * 
 * Streams can be created from Collections, Lists, Sets, ints, longs, doubles, arrays, & lines of a file.
 * 
 * Stream operations are either intermediate(stateless and stateful) or terminal.
 * 
 * Intermediate Stateless operations: such as filter() and map(), retain no state from previously seen 
 * element when processing a new element -- each element can be processed independently 
 * of operations on other elements. Stateful operations, such as distinct and sorted, 
 * may incorporate state from previously seen elements when processing new elements.
 * 
 * Intermediate Stateful operations: such as distinct() and sorted() may need to process the entire 
 * input before producing a result. For example, one cannot produce any results from sorting a 
 * stream until one has seen all elements of the stream.
 * 
 * Terminal: forEach, collect or reduce. 
 * 
 * Intermediate Operations:
 * distinct()
 * filter(Predicate<T>)
 * flatmap()
 * limit()
 * map() 
 * peek()
 * skip()
 * sorted()
 * 
 * Terminal Operations: (either void or return a non-stream result.)
 * findFirst()
 * anyMatch()
 * count()
 * max()
 * min()
 * reduce()
 * 
 * https://docs.oracle.com/javase/10/docs/api/java/util/stream/Stream.html
 */



























