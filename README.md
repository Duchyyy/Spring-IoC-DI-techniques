# Spring-IoC-DI-techniques
In Spring framework are 3 techniques for IoC and DI.
  1. Full XML where are all defined all beans and dependencies 
  2. Minimize XML configuration, where we define XML scan for package and it looking for @Component
  3. Full Java config file where are defined all beans, dependencies, no need to component and autowired annotation, it can easily read properties.
  
  Its all about outsourcing creating and managing implementations. Dependency Injection can be used with constructor, setter, method, even field.
  There is not prefered technique. The best solution is to choose one and be consistent with it.
