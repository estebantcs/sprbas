#Using Thymeleaf with HTML5
Add a properties file at src/main/resources/application.properties
Add the following text at the top:
spring.thymeleaf.mode = LEGACYHTML5
In the dependencies block of build.gradle, add Neko HTML as a runtime dependency:
runtime 'net.sourceforge.nekohtml:nekohtml:1.9.22'