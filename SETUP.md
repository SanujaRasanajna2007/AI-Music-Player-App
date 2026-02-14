# Setup Instructions

## Prerequisites

Before you begin, ensure you have the following installed:

1. **Android Studio** (Hedgehog | 2023.1.1 or later)
   - Download from: https://developer.android.com/studio

2. **Java Development Kit (JDK) 17**
   - Android Studio typically includes this

3. **Android SDK**
   - Minimum SDK: API 26 (Android 8.0 Oreo)
   - Target SDK: API 34 (Android 14)

4. **Android NDK** (for future whisper.cpp integration)
   - Install via Android Studio → SDK Manager → SDK Tools → NDK

## Getting Started

### 1. Open Project in Android Studio

```bash
# Navigate to project directory
cd "d:\Personal Projects\AI Music Player App\AI-Music-Player-App"

# Open in Android Studio
# File → Open → Select project folder
```

### 2. Sync Gradle

Android Studio will automatically detect the project and prompt you to sync Gradle dependencies.

- Click "Sync Now" when prompted
- Wait for all dependencies to download (~5-10 minutes on first sync)

### 3. Configure Android Virtual Device (AVD)

If you don't have a physical Android device:

1. Tools → Device Manager
2. Create Device → Select a phone (e.g., Pixel 5)
3. Select System Image: API 34 (Android 14)
4. Finish setup

### 4. Run the App

```bash
# Option 1: Using Android Studio
- Click the green "Run" button (or press Shift + F10)
- Select your device/emulator

# Option 2: Using Gradle command line
./gradlew installDebug  # On Windows: gradlew.bat installDebug
```

### 5. Verify Installation

When the app launches, you should see:
- 🎵 AI Music Player welcome screen
- "Project setup complete!" message

## Project Configuration

### Current Setup

✅ **Completed:**
- Kotlin 1.9.22 with Jetpack Compose
- Material 3 theming with dark/light modes
- Gradle 8.2 with Kotlin DSL
- AndroidX dependencies
- Media3 ExoPlayer (v1.2.1)
- Room Database (v2.6.1)
- Hilt DI (v2.50)
- All required permissions configured

📋 **Next Steps:**
- Implement Room database schema
- Set up Hilt modules
- Create media scanner
- Build library UI

## Troubleshooting

### Gradle Sync Issues

If Gradle sync fails:

1. **Clear cache:**
   ```bash
   ./gradlew clean
   # Or: Build → Clean Project
   ```

2. **Invalidate caches:**
   - File → Invalidate Caches → Invalidate and Restart

3. **Check internet connection** (for downloading dependencies)

### Build Errors

**Issue:** "SDK location not found"
- **Solution:** Create `local.properties` file with:
  ```properties
  sdk.dir=C\:\\Users\\YourUsername\\AppData\\Local\\Android\\Sdk
  ```

**Issue:** "Minimum supported Gradle version is X.X"
- **Solution:** Update Gradle wrapper in `gradle/wrapper/gradle-wrapper.properties`

### Runtime Issues

**Issue:** App crashes on launch
- **Solution:** Check Logcat in Android Studio for error messages
- Ensure target device is API 26+ (Android 8.0+)

## Development Workflow

### Recommended IDE Settings

1. **Enable Auto Import:**
   - Settings → Editor → General → Auto Import
   - Check "Add unambiguous imports on the fly"

2. **Code Style:**
   - Settings → Editor → Code Style → Kotlin
   - Use official Kotlin style guide

3. **Live Templates:**
   - Use `compose` live template for Composables
   - Use `vm` for ViewModels

### Git Workflow

```bash
# Create feature branch
git checkout -b feature/implement-room-database

# Make changes and commit
git add .
git commit -m "Implement Room database schema"

# Push to remote
git push origin feature/implement-room-database
```

## Next Development Phase

See `task.md` for the implementation checklist. The next tasks are:

1. Set up Hilt dependency injection modules
2. Implement Room database schema (Song, Artist, Album entities)
3. Build media scanner to detect local music files
4. Create basic library UI with songs list

Refer to `implementation_plan.md` for detailed architecture and implementation guidance.

---

**Ready to start building!** 🚀
