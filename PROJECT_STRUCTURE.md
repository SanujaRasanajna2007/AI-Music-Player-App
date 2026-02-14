# Project Structure

This document outlines the directory structure for the AI Music Player project.

## Root Directory Structure

```
AI-Music-Player-App/
├── app/                           # Main application module
│   ├── src/
│   │   └── main/
│   │       ├── java/com/aimusic/player/
│   │       │   ├── data/          # Data layer
│   │       │   │   ├── local/     # Room database
│   │       │   │   │   ├── dao/
│   │       │   │   │   ├── entity/
│   │       │   │   │   └── database/
│   │       │   │   ├── repository/
│   │       │   │   └── scanner/   # Media scanner
│   │       │   ├── domain/        # Domain layer
│   │       │   │   ├── model/     # Domain models
│   │       │   │   ├── repository/# Repository interfaces
│   │       │   │   └── usecase/   # Business logic
│   │       │   ├── presentation/  # UI layer
│   │       │   │   ├── screens/
│   │       │   │   │   ├── home/
│   │       │   │   │   ├── library/
│   │       │   │   │   ├── player/
│   │       │   │   │   ├── lyrics/
│   │       │   │   │   └── settings/
│   │       │   │   ├── components/
│   │       │   │   ├── service/   # Music player service
│   │       │   │   ├── navigation/
│   │       │   │   ├── theme/
│   │       │   │   └── MainActivity.kt
│   │       │   ├── di/            # Hilt dependency injection
│   │       │   ├── util/          # Utilities
│   │       │   └── MusicPlayerApp.kt
│   │       ├── assets/            # Assets (Whisper models)
│   │       ├── jni/               # Native code (whisper.cpp)
│   │       ├── res/               # Resources
│   │       └── AndroidManifest.xml
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── gradle/                        # Gradle wrapper
├── build.gradle.kts               # Root build file
├── settings.gradle.kts
├── .gitignore
└── README.md
```

## Layer Responsibilities

### Data Layer (`data/`)
- **local/**: Room database implementation
  - `dao/`: Data Access Objects
  - `entity/`: Database entities
  - `database/`: Database instance
- **repository/**: Repository implementations
- **scanner/**: Media file scanner to detect music files

### Domain Layer (`domain/`)
- **model/**: Business domain models (Song, Artist, Album, etc.)
- **repository/**: Repository interfaces
- **usecase/**: Use cases for business logic

### Presentation Layer (`presentation/`)
- **screens/**: Composable screens
- **components/**: Reusable UI components
- **service/**: Background music playback service
- **navigation/**: Navigation graph
- **theme/**: Material 3 theme configuration

### DI Layer (`di/`)
- Hilt modules for dependency injection

## Next Steps

The following directories will be created as we implement features:

1. **Sprint 1**: `data/local/`, `data/repository/`, `domain/model/`, `presentation/screens/library/`
2. **Sprint 2**: `presentation/service/`, `domain/usecase/playback/`
3. **Sprint 3**: `presentation/screens/player/`, `presentation/screens/settings/`
4. **AI Integration**: `jni/whisper/`, `domain/usecase/lyrics/`, `presentation/screens/lyrics/`
