```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  closure()
  println "After closure execution"
}

methodWithClosure {  // Missing parentheses for the closure
  println "Inside closure"
}
```