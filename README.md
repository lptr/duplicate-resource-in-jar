## Tests multiple resources in the same JAR file

This is a test project to confirm whether multiple resources with the same name in the same JAR file can be loaded by the JVM.

### How to use:

```console
$ ./gradlew installDist

BUILD SUCCESSFUL in 709ms
5 actionable tasks: 5 executed

$ unzip -l build/install/org.lptr.test.duplicateresource/lib/org.lptr.test.duplicateresource.jar
Archive:  build/install/org.lptr.test.duplicateresource/lib/org.lptr.test.duplicateresource.jar
  Length      Date    Time    Name
---------  ---------- -----   ----
        0  07-23-2019 10:27   META-INF/
       25  07-23-2019 10:27   META-INF/MANIFEST.MF
        0  07-23-2019 10:27   org/
        0  07-23-2019 10:27   org/lptr/
        0  07-23-2019 10:27   org/lptr/test/
        0  07-23-2019 10:27   org/lptr/test/duplicateresource/
     2575  07-23-2019 10:27   org/lptr/test/duplicateresource/App.class
       19  07-23-2019 10:27   resource.txt
       21  07-23-2019 10:11   resource-2.txt
       21  07-23-2019 10:11   resource.txt
---------                     -------
     2661                     10 files

$ build/install/org.lptr.test.duplicateresource/bin/org.lptr.test.duplicateresource
Looking for resources...
jar:file:/Users/lptr/Workspace/gradle/bugs/duplicate-resource-in-jar/build/install/org.lptr.test.duplicateresource/lib/org.lptr.test.duplicateresource.jar!/resource.txt: src/main/resources-2
```
