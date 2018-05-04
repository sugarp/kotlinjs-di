# kotlinjs-di
<h1>Primitive implementation of dependency injection for kotlin JS.</h1>

This is repository of a single file, which happened to be very useful during development of a kotlin multiplatform application for Android and JS + ReactJS. 
When following MVP I ended up needing Dependency injection similar to Dagger for Java.

You define what is returned when injecting. Because the injection is a function you can either choose whether you 
create instance:
```
DI.define<IShape> {
    Circle()
}
```

or return singleton:
```
var shape = Circle()

DI.define<IShape> {
    shape
}
```

and then you inject the defined:
```
var shape = DI.inject<IShape>()
```



 
