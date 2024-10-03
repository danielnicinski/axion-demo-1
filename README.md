### Reproducing the error

Running following command
```
gradle verifyRelease
```
causes error
```
Execution failed for task ':verifyRelease'.
    > The project uses snapshot versions - can't release. Snapshots found: [com.dn.axion:commons-test:0.1.0-SNAPSHOT]
```
