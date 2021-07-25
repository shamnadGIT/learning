
1. Functional programming = functional composition + lazy evaluation

2. Reactive programming = Functional programming ++ Immutability higher order funcions

3. Normal functions 
- we may pass object to a function 
- we may create object in a function
- We may return objects from a function

4. Functional programming
 - We may pass function to a function
 - We may create function in a function 
 - We may return function from a function

Reactive programming is like MS-excel, when one cell changes all dependent cell and its dependent cell changes... Ripples through the changes


CRUD
database -> process -> database

dataflow computing = serverless computing-> aws lambda

OOP
- Absraction
- Encapsulation
- Inheritance
- Polymorphism

Reactive
 - Elasticity
 - Message driven
 - Responsive
 - resilience

Java stream      vs.              Recative stream
pipeline                          pipeline
functional composition            functional composition
lazy                              lazy

---

# Differences
Streams                           
data channel                      data channel also
what about exception - no luck    deal with it downstream
No forking                        multiple subscriber
                                  three channels, 1. data 2. error 3. complete
push at will                      backpressure
sequential vs parallel            synchronous/asynchronous
                                  
Exceptions are imperative programming idea
Treat error as data

---

# Reactive programming attributes
Elastic
Message driven
Responsive
Resilient
Rxjava contributed by Netflix
# Reactive Streams API
4 interfaces
Publisher     -  Publishes data, emits data, emitter
Subscriber    -  Subscribes data
Subscription  -  Kind of session with publisher
Processor     - they are intermediate things with subscriber at one end and publisher at other end(Eg: filter,map...)
Publisher - 
