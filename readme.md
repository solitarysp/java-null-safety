# Check for null for java
- We only catch NullPointerException case, other cases will throws
```
  if (NullSafety.safeEvalReturnBoolean(() -> ok.getB().getC().getName().equals(name))) {
      System.out.println("ok");
    }
```