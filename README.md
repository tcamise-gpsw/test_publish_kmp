This [medium article](https://medium.com/@cristurean.marius.ovidiu/how-to-publish-your-own-kotlin-multiplatform-library-to-mavencentral-4bc02c8e109d)
is the starting point. 

It instructs us to use the [gradle-maven-publish-plugin](https://github.com/vanniktech/gradle-maven-publish-plugin?tab=readme-ov-file)
which is additional functionality on top of the default [maven-publish](https://docs.gradle.org/current/userguide/publishing_maven.html) plugin.

We're first trying to publish locally via `gradle publishToMavenLocal` but its failing due to some signing stuff:

```text
1: Task failed with an exception.
-----------
* What went wrong:
Execution failed for task ':capitalizeLib:signAndroidDebugPublication'.
> Cannot perform signing task ':capitalizeLib:signAndroidDebugPublication' because it has no configured signatory
```

Let's trying following [these steps](https://vanniktech.github.io/gradle-maven-publish-plugin/central/).

I've registered and verified Sonatype to my Github Ac  count. I've created and distributed a GPG key (via WSL).
Password is "password". These credentials are stored in my global (per-user) `gradle.properties`

Publishing to local Maven and consuming via ComposeApp is working.

Next...publish to Maven Central.