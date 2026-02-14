# AI Music Player

An AI-powered local music player for Android featuring real-time lyrics generation using on-device speech recognition.

## Features

### Core Features (MVP)
- Local audio playback (MP3, FLAC, AAC, OGG, WAV)
- Library management (Artists, Albums, Genres, Folders)
- Smart playlists (Recently Added, Most Played, Favorites)
- Background playback with lock screen controls
- Sleep timer

### Advanced Features
- High-fidelity audio engine (Custom EQ, Bass Boost, Virtualizer)
- Multiple playback queues
- Highly customizable UI (Material You theming)
- Audio visualizer
- Edge lighting effects

### Unique AI Feature
- **On-device AI Real-time Lyrics Generation** using whisper.cpp
- Karaoke-style synchronized lyrics display
- 100% offline, no API costs
- Privacy-focused (all processing local)

## Tech Stack

- **Language**: Kotlin
- **UI**: Jetpack Compose + Material 3
- **Architecture**: MVVM + Clean Architecture
- **Audio Engine**: Media3 ExoPlayer
- **Database**: Room
- **DI**: Hilt
- **AI**: whisper.cpp (JNI)

## Project Structure

```
app/
├── src/
│   └── main/
│       ├── java/com/aimusic/player/
│       │   ├── data/          # Data layer (Room, repositories)
│       │   ├── domain/        # Business logic (use cases, models)
│       │   ├── presentation/  # UI layer (Compose, ViewModels)
│       │   ├── di/            # Hilt modules
│       │   └── utils/         # Utilities
│       ├── assets/            # Whisper models
│       ├── jni/               # Native code (whisper.cpp)
│       └── res/               # Resources
└── build.gradle.kts
```

## Build Instructions

1. Clone the repository
2. Open in Android Studio
3. Sync Gradle dependencies
4. Run the app

## Requirements

- Android Studio Hedgehog | 2023.1.1 or later
- Android SDK 26+ (Android 8.0 Oreo)
- NDK for whisper.cpp compilation

## License

Apache 2.0 - Free and Open Source

## Roadmap

See [implementation_plan.md](docs/implementation_plan.md) for detailed development phases.