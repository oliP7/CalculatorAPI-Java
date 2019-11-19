# CalculatorAPI-Java

*This is Java RESTful Web Service with basic calculations api example.*

It's a maven project so all the dependencies are in the **pom.xml** file. 

**Tip:** One thing though make sure that the Project uses Java >= 1.6 because the JAXB libary has been already integrated into Java since version 1.6. JAXB is the default XML-Binding used to convert a Java object into XML and vice versa.

Another thing if you see the “Maven projects need to be imported” popup in IntelliJ, then do click “Enable Auto-Import”.

## Project Details

In the com.calculator.controller we can find the API implementations and the path how can we access them.

For the endpoints /add, /subtract, /multiply and /divide we have a query parameters.

For example to access add we have to go `/add?num1=2&num2=3` .

#### Run the project

We only need to do a maven build -> run configuration -> select maven -> select the project in the working directory and just put tomcat7:run in command line. Run the configuration. 

After the build is succesful the app should run on localhost:8080 
