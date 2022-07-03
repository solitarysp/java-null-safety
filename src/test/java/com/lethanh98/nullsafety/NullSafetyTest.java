package com.lethanh98.nullsafety;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;

public class NullSafetyTest {

  @Test
  public void test() {
    String name = "Thanh";
    A ok = new A(new B(new C(name)));
    A error = new A(new B(null));
    if (NullSafety.safeEvalReturnBoolean(() -> ok.getB().getC().getName().equals(name))) {
      System.out.println("ok");
    }
    System.out.println(NullSafety.safeEvalReturnData(() -> error.getB().getC().getName()));
  }

  @Data
  @AllArgsConstructor
  public static class A {

    private B b;

  }

  @Data
  @AllArgsConstructor
  public static class B {

    private C c;
  }

  @Data
  @AllArgsConstructor
  public static class C {

    private String name;
  }
}
