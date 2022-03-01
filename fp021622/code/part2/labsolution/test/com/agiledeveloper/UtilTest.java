package com.agiledeveloper;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

import static org.junit.jupiter.api.Assertions.*;

public class UtilTest {
  private List<String> names = Arrays.asList("Jill", "George", "Raju", "Ahmed", "Chen", "Paul", "Priya");

  @Test
  void getNamesOfLength4(){
    List<String> namesOfLength4 = Util.getNamesOfLength4(names);

    assertEquals(Arrays.asList("Jill", "Raju", "Chen", "Paul"), namesOfLength4);
  }

  @Test
  void getNamesOfLength5InUpperCase(){
    List<String> namesOfLength4 = Util.getNamesOfLength5InUpperCase(names);

    assertEquals(Arrays.asList("AHMED", "PRIYA"), namesOfLength4);
  }

  @Test
  void getInUpperCaseNamesOfLength4AndHavingL(){
    List<String> namesOfLength4 = Util.getInUpperCaseNamesOfLength4AndHavingL(names);

    assertEquals(Arrays.asList("JILL", "PAUL"), namesOfLength4);
  }
}
