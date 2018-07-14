# AndroidWearSampleKotlin
An Android Wear Sample by Kotlin


<img src="https://github.com/cagataymuhammet/AndroidWearSampleKotlin/sh.png"/>


# gradle

```gradle

apply plugin: 'com.android.application'

apply plugin: 'kotlin-android'

apply plugin: 'kotlin-android-extensions'

android {
    compileSdkVersion 28
    buildToolsVersion "28.0.0"
    defaultConfig {
        applicationId "com.cagataymuhammet.androidwearsample"
        minSdkVersion 23
        targetSdkVersion 28
        versionCode 1
        versionName "1.0"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}

dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation "org.jetbrains.kotlin:kotlin-stdlib-jre7:$kotlin_version"
    implementation 'com.google.android.support:wearable:2.3.0'
    implementation 'com.google.android.gms:play-services-wearable:15.0.1'
    implementation 'com.android.support:percent:28.0.0-alpha3'
    implementation 'com.android.support:support-v4:28.0.0-alpha3'
    implementation 'com.android.support:recyclerview-v7:28.0.0-alpha3'
    implementation 'com.android.support:wear:28.0.0-alpha3'
    implementation 'com.android.support:appcompat-v7:28.0.0-alpha3'
    implementation 'com.android.support.constraint:constraint-layout:1.1.2'
    compileOnly 'com.google.android.wearable:wearable:2.3.0'
}


```

# ActivityMain.kt
```kotlin

class ActivityMain : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        setAmbientEnabled()

        var count=0
        val btnCounter = findViewById<Button>(R.id.btnCounter)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtCount = findViewById<TextView>(R.id.txtCount)

        btnClear.setOnClickListener {
            count=0
            txtCount.text="0"
        }

        btnCounter.setOnClickListener {
            count=count+1
            txtCount.text=count.toString()
        }
    }
}

```


License
--------


    Copyright 2018 Muhammet ÇAĞATAY.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
