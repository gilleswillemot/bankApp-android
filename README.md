# bankApp-android

This is android bankApp, which is a very simple android application that shows a list of banks. The interesting part of this application is that it has 2 dependencies which are build via kotlin-multiplatform (kotlin/native),
which means the code of the 2 libraries can be shared on different platforms (and even a web application).
The ios bankApp, which differs only in layout, also depends on the same libraries to present a list of banks. 
You can find the ios bankApp <a href="https://github.com/gilleswillemot/bankApp-ios">here</a>.

[Technicalities & Architecture]
Using Kotlin/Native to build the native files in order for business logic to be reused in an android and ios app. Abstraction by using an interface that represents the abstraction of an implementation, in order to be decoupled 
of that implementation and its dependencies. Using a core module (with the interfaces) in different projects (potentially even web applications), we inject the interface-using-projects with a implementation
of the core (e.g. A project uses the interface IBankProvider, while that interface is injected with the BankProviderImpl, which represents the implementation of that particular interface.

Added Koin dependency for injection BankImplementationProvider<br/>
Added application class, to inject in onCreate().

[Bugs & Fixes]
If java.lang.RuntimeException: Duplicate class:
As bankApp-android has a dependency on bankApp-core and BankProviderImpl, which also has a dependency on bankApp-core,
both bankApp-android and BankProviderImpl need to use the same release version of bankApp-core.
