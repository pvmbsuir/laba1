# Technologies of Software Development and Testing

## Who Am I?

Timur S. Zhuk, group 050502, year 3, term 5, BSUIR, 2022

## How I configured JavaFX

Special thanks to this [guide](https://javabook.bloomu.edu/setupjavafx.html).

* Step 1. Downloaded JavaFX SDK from [here](https://gluonhq.com/products/javafx).

| JavaFX info | |
| - | - |
| Version | 19 |
| OS | Linux |
| Architecture | x64 |
| Type | SDK |

* Step 2. Unpacked `.zip` file to project directory.

* Step 3. Added JavaFX as a library in the IntelliJ IDE:

```
File -> Project Structure -> Libraries -> New Project Library -> Java
```

There I added `<full_path_to_javafx-sdk-19>/lib`

* Step 4. Configured Project's Run Configuration

```
Current File -> Edit Configurations... -> Add New Configuration -> Application
Modify options -> Add VM options
```

VM options:
```
--module-path <full_path_to_javafx-sdk-19>/lib
--add-modules=javafx.base,javafx.controls,javafx.graphics,javafx.media
```
