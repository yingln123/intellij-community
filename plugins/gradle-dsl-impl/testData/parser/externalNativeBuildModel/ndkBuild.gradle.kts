android {
  externalNativeBuild {
    ndkBuild {
      path = file("foo/Android.mk")
    }
  }
}
