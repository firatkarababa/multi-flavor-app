# multi-flavor-app
A sample app demonstrating the implementation of Android Build Variants

# Android Build Variants

One common problem that Android developers occasionally face is the pain of releasing more than one version of an app to the market. As a developer, you may want to have different versions of your app with some differences but at the same time you may not be so willing to create and maintain different projects. Being either free-paid versions or different flavors of an app as one of them is updated for its basic functionality, the other version or flavor of the app has to be updated properly.

A very rough solution to that problem is to maintain different projects for different versions and make the updates for each project. That is a painful and a kind of unnecessary process. There is an alternative way to solve this problem thanks to Gradle build system: Build Variants. By using Build Variants, more than one app can be handled through a single project. The rest of this article will be on how to create different flavors of an app, how to install and release them as different apps.

To better explain Build Variants, we will develop a celebrity app and generate different flavors of that app for different celebrity/mode options. The main functionality for the flavors of that app is same but the resources such as the images, colors and strings used in the app are different.

At the end of this tutorial, there will be flavors for two different celebrities with Debug-Release and Free-Full combinations. The two flavors derived from one Android Studio project look like the following images.

![Flavors for two different celebrities](https://cdn-images-1.medium.com/max/800/1*DDsXRiCv3hCAy413lDQR0Q.png)

* Full article explaining whole code can be found in this [Tutorial](https://medium.com/@firatkarababa/android-build-variants-6880a07abf0)
