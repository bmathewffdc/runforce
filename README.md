## runforce

Stub declarations for Salesforce platform types encoded as compilable Java. 

These stub declarations help support static analysis of Apex code in [apex-link](https://github.com/nawforce/apex-link) but you may also find them useful for other purposes. They have been encoded in Java to get the benefit of type checking by javac so it easier to spot when something is amiss. In apex-link JVM reflection is used to 'read' the stubs as part of the static analysis. 

The library is versioned to reflect Salesforce API numbers, so currently v55.0.0 matches the Salesforce Summer '22 API.

The original versions of the stubs were autogenerated via a couple of Java tools but they have required a lot of manual work to correct into the current form. Now this is fairly stable, the plan is to add some level of verification tooling to this project so that differences with future versions can be more easily identified and corrected.  
     
### Maven
To use the jar in a maven project add the following to your pom.xml

    <dependency>
        <groupId>com.github.nawforce</groupId>
        <artifactId>runforce</artifactId>
        <version>55.4.0</version>
    </dependency>

