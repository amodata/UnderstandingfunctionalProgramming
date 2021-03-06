package com.agiledeveloper;

import java.util.List;
import static java.util.stream.Collectors.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface Util {
  public static String getTriple(int m, int n) {
    int a = m * m - n * n;
    int b = 2 * m * n;
    int c = m * m + n * n;

    return String.format("%d %d %d", a, b, c);
  }

  public static List<String> computeTriples(int numberOfValues) {
//    List<String> triples = new ArrayList<>();
//    int count = 1;
//
//    for(int m = 2; ; m++) {
//      for(int n = 1; n < m; n++) {
//        triples.add(getTriple(m, n));
//        count++;
//
//        if(count > numberOfValues)
//          break;
//      }
//
//      if(count > numberOfValues)
//        break;
//    }
//
//    return triples;

    return Stream.iterate(2, m -> m + 1)
      .flatMap(m -> IntStream.range(1, m)
        .mapToObj(n -> getTriple(m, n)))
      .limit(numberOfValues)
      .collect(toList());
  }
}