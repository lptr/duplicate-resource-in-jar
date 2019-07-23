## Tests multiple resources in the same JAR file

This is a test project to confirm whether multiple resources with the same name in the same JAR file can be loaded by the JVM.

### How to use:

```console
$ ./gradlew installDist

BUILD SUCCESSFUL in 709ms
5 actionable tasks: 5 executed

$ build/install/org.lptr.test.duplicateresource/bin/org.lptr.test.duplicateresource
Looking for resources...
jar:file:/Users/lptr/Workspace/gradle/bugs/duplicate-resource-in-jar/build/install/org.lptr.test.duplicateresource/lib/org.lptr.test.duplicateresource.jar!/resource.txt: src/main/resources-2
```
