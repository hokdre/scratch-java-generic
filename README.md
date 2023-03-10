this is my notes learning java generic. I really suggest to watch this video :
https://www.youtube.com/watch?v=bvWRDAl30Gs&list=PL-CtdCApEFH-p_Q2GyK4K3ORoAT0Yt7CX&index=6

this video will teach you about java generic in conceptual and daily used like Comperable and Comparator Interface.

- Generic is better way to handle case where we need take object that the type of that object is declared in the runtime. Before generic we handle it with define the field/parameters with Object class and do type checking to that object and that is not safe way. Generic help us to do type checking in compile time but underhood after compile time generic will be Object class (type erasure). Because that too, we just can use object that inherit from Object class on other word we cannot use primitive in generic.

  generic provide some behavior :

  1. we can declare two or more parameter type in class and method.
  2. we can put one or more constraint  on parameter type (bounded context), with rule : generic just extends from 1 class, and can multiple interface. you can access the parameter type's method if we do bounded context.
  3. by default generic class in java is invariant, means you cannot subtitute the type with parent or class like polymorfisme
  4. in generic method we still can subtitute the type with some constraint :
  a. covariant : we can subtitute with super class. read is safe, write is not safe throw err
  b. contravariant : we can subtitue with child class. write is safe, read not error but unsafe
  
  Note : 
- while using generic, type casting is unsafe and anti pattern
