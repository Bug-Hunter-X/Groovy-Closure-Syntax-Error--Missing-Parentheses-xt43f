```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  closure()
  println "After closure execution"
}

methodWithClosure({  // Correct: parentheses around the closure
  println "Inside closure"
})
```