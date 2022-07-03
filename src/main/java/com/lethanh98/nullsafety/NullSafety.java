package com.lethanh98.nullsafety;

import java.util.function.Supplier;

public class NullSafety {

  public static <T> T safeEvalReturnData(Supplier<T> supplier) {
    return safeEvalReturnData(supplier, null);
  }

  // Only check case NullPointerException
  public static <T> T safeEvalReturnData(Supplier<T> supplier, T defaultReturn) {
    try {
      return supplier.get();
    } catch (NullPointerException exception) {
      return defaultReturn;
    }
  }

  public static boolean safeEvalReturnBoolean(Supplier<Boolean> supplier) {
    return safeEvalReturnBoolean(supplier, false);
  }

  // Only check case NullPointerException
  public static boolean safeEvalReturnBoolean(Supplier<Boolean> supplier, boolean defaultReturn) {
    try {
      return supplier.get();
    } catch (NullPointerException exception) {
      return defaultReturn;
    }
  }
}
