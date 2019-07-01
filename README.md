# bankApp

Using Kotlin/Native to build the native files in order for business logic to be reused in an android and ios app. Abstraction by using an interface that represents the abstraction of an implementation, in order to be decoupled of that implementation and it dependencies. Using a core module (with the interfaces) in different projects (potentially even web applications), we inject the interface-using-projects with a implementation of the core (e.g. A project uses the interface IBankProvider, while that interface is injected with the BankProviderImpl, which represents the implementation of that particular interface.

Added Koin dependency for injection BankImplementationProvider<br/>
Added application class, to inject in onCreate().
