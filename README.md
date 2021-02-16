<h1 align="center">
    SimpleTextWatcher
</h1>

<p align="center">
    <a><img src="https://img.shields.io/badge/Version-2.0.0-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/Kotlin-Suport-green?logo=kotlin&style=flat"></a>
    <a href="https://github.com/gzeinnumer"><img src="https://img.shields.io/github/followers/gzeinnumer?label=follow&style=social"></a>
    <br>
    <p>Remove Useless Function TextWacher.</p>
</p>

---
# Content List
* [Download](#download)
* [Feature List](#feature-list)
* [Tech stack and 3rd library](#tech-stack-and-3rd-library)
* [Usage](#usage)
* [Version](#version)
* [Contribution](#contribution)

---
# Download
Add maven `jitpack.io` and `dependencies` in `build.gradle (Project)` :
```gradle
// build.gradle project
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

// build.gradle app/module
dependencies {
  ...
  implementation 'com.github.gzeinnumer:SimpleTextWatcher:version'
}
```

---
# Feature List
- [x] [beforeTextChanged](#beforetextchanged)
- [x] [onTextChanged](#ontextchanged)
- [x] [afterTextChanged](#aftertextchanged)

---
# Tech stack and 3rd library
- TextWatcher ([docs](https://developer.android.com/reference/android/text/TextWatcher))

---
# Usage

### TextWacher Default Method Callback
> **Java**
```java
editText.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        Log.d(TAG, "beforeTextChanged: "+s+"_"+start+"_"+count+"_"+after);
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        Log.d(TAG, "onTextChanged: "+s+"_"+start+"_"+before+"_"+count);
    }

    @Override
    public void afterTextChanged(Editable s) {
        Log.d(TAG, "afterTextChanged: "+s.toString());
    }
});
```
#
### beforeTextChanged.
> **Java**
```java
editText.addTextChangedListener(new SimpleTextWatcher(new BeforeTextChanged() {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        Log.d(TAG, "beforeTextChanged: "+s+"_"+start+"_"+count+"_"+after);
    }
}));
```

#
### onTextChanged.
> **Java**
```java
editText.addTextChangedListener(new SimpleTextWatcher(new OnTextChanged() {
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        Log.d(TAG, "onTextChanged: "+s+"_"+start+"_"+before+"_"+count);
    }
}));
```

#
### **afterTextChanged.**
To check your date is in range between 2 date or not.
> **Java**
```java
editText.addTextChangedListener(new SimpleTextWatcher(new AfterTextChanged() {
    @Override
    public void afterTextChanged(Editable s) {
        Log.d(TAG, "afterTextChanged: "+s.toString());
    }
}));
```

---
# Version
- **1.0.0**
  - First Release
- **1.0.1**
  - Simple CallBack
- **2.0.0**
  - Support SDK 16

---
# Contribution
You can sent your constibution to `branch` `open-pull`.

---

```
Copyright 2020 M. Fadli Zein
```
