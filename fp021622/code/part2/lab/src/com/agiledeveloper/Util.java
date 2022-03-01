package com.agiledeveloper;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

interface Util {
  static List<String> getNamesOfLength4(List<String> names) {
    List<String> namesOfLength4 = new ArrayList<>();

    for(String name: names) {
      if(name.length() == 4) {
        namesOfLength4.add(name);
      }
    }

    return namesOfLength4;
  }

  static List<String> getNamesOfLength5InUpperCase(List<String> names) {
    List<String> namesOfLength5InUpperCase = new ArrayList<>();

    for(String name: names) {
      if(name.length() == 5) {
        namesOfLength5InUpperCase.add(name.toUpperCase());
      }
    }

    return namesOfLength5InUpperCase;
  }

  static List<String> getInUpperCaseNamesOfLength4AndHavingL(List<String> names) {
    List<String> result = new ArrayList<>();

    for(String name: names) {
      if(name.length() == 4 && name.contains("l")) {
        result.add(name.toUpperCase());
      }
    }

    return result;
  }
}