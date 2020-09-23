# [Codecov](https://codecov.io) Kotlin Example with standard file structure
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fcodecov%2Fexample-kotlin-flat.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Fcodecov%2Fexample-kotlin-flat?ref=badge_shield)

## Guide

**Using maven?** See [maven kotlin example](https://github.com/codecov/example-kotlin)

### Travis Setup

Add to your `.travis.yml` file.
```yml
language: java
after_success:
  - bash <(curl -s https://codecov.io/bash)
```
### Produce Coverage Reports
#### Add Jacoco plugin
```xml
plugins {
    ...
    jacoco
}

...

tasks.withType<JacocoReport> {
    reports {
        xml.isEnabled = true
        csv.isEnabled = false
        html.isEnabled = false
    }
}
```
## Caveats
### Fixes for the report file paths
The standard file structure for kotlin omits the common prefix for packages, for example: `org.jacoco.examples.gradle`. Jacoco will render its reports with the complete import path, which can throw off codecov when it start looking for the files. To fix the issues, create a `codecov.yml` and add this content in it.

```yaml
fixes:
  - "src/main/org/jacoco/examples/gradle/kotlin/::src/main/kotlin/" 
  - "src/test/org/jacoco/examples/gradle/kotlin/::src/test/kotlin/" 
```

Replacing `org/jacoco/examples/gradle` with your own package prefix.

### Private Repo
Repository tokens are required for (a) all private repos, (b) public repos not using Travis-CI, CircleCI or AppVeyor. Find your repository token at Codecov and provide via appending `-t <your upload token>` to you where you upload reports.

## Links
- [Community Boards](https://community.codecov.io)
- [Support](https://codecov.io/support)
- [Documentation](https://docs.codecov.io)

## License
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fcodecov%2Fexample-kotlin-flat.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2Fcodecov%2Fexample-kotlin-flat?ref=badge_large)

.
