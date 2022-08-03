# Deep Links to App Content Examples

### :simple

- Deep Links: https://developer.android.com/training/app-links/deep-linking

```console
adb shell am start -a android.intent.action.VIEW -d "cosmin://nav/?deviceId=3943826401&appId=8abe413b-2b74-4ee5-83aa-30d971961d63"
```

### :nav

- Navigation Components Deep links: https://developer.android.com/guide/navigation/navigation-deep-link#implicit

```console
adb shell am start -a android.intent.action.VIEW -d "cosmin://nav/?deviceId=3943826401&appId=8abe413b-2b74-4ee5-83aa-30d971961d63"
```

### :compose

- Navigation Components for Compose Deep links: https://developer.android.com/jetpack/compose/navigation#deeplinks

```console
adb shell am start -a android.intent.action.VIEW -d "cosmin://compose/?deviceId=3943826401&appId=8abe413b-2b74-4ee5-83aa-30d971961d63"
```

### :web

- Web links: https://developer.android.com/training/app-links#web-links

```console
adb shell am start -a android.intent.action.VIEW -d "https://mdc-software.ro/?deviceId=3943826401&appId=8abe413b-2b74-4ee5-83aa-30d971961d63"
```

### :app

- App links: https://developer.android.com/training/app-links#android-app-links
- https://mdc-software.ro/.well-known/assetlinks.json

```console
adb shell am start -a android.intent.action.VIEW -d "https://mdc-software.ro/?deviceId=3943826401&appId=8abe413b-2b74-4ee5-83aa-30d971961d63"
```
