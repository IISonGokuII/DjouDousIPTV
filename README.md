# DjouDousIPTV

Next-Gen Android TV IPTV Player - Eine moderne, native Android TV Applikation für Media-Streaming.

## Features

- 🎬 **Modern Video Player** basierend auf AndroidX Media3 (ExoPlayer)
- 📺 **Android TV Optimized** mit Leanback Launcher und D-Pad Navigation
- 🏗️ **Clean Architecture** mit MVVM, StateFlow und Repository Pattern
- 💉 **Dependency Injection** mit Dagger Hilt
- 🗄️ **Offline-First** mit Room Database (unterstützt 20.000+ Kanäle)
- ⚡ **Performant** mit Coil Image Loading und optimiertem Buffer-Management
- 🔒 **Type-Safe** mit Kotlin Serialization

## Tech Stack

| Komponente | Bibliothek |
|------------|-----------|
| Language | Kotlin |
| UI | Jetpack Compose + TV Material |
| Video Engine | AndroidX Media3 (ExoPlayer) |
| DI | Dagger Hilt |
| Database | Room |
| Settings | Preferences DataStore |
| Network | Retrofit2 + OkHttp |
| Images | Coil |
| Background | WorkManager |

## Architektur

```
┌─────────────────────────────────────────────────────────────┐
│                    Presentation Layer                        │
│  ┌─────────────┐  ┌─────────────┐  ┌─────────────────────┐  │
│  │   Screens   │  │  ViewModels │  │  UI State (Flow)    │  │
│  └─────────────┘  └─────────────┘  └─────────────────────┘  │
├─────────────────────────────────────────────────────────────┤
│                     Domain Layer                             │
│  ┌─────────────┐  ┌─────────────┐  ┌─────────────────────┐  │
│  │   Models    │  │  Use Cases  │  │ Repository Interfaces│  │
│  └─────────────┘  └─────────────┘  └─────────────────────┘  │
├─────────────────────────────────────────────────────────────┤
│                      Data Layer                              │
│  ┌─────────────┐  ┌─────────────┐  ┌─────────────────────┐  │
│  │   Room DB   │  │   API/Retrofit│  │   DataStore       │  │
│  └─────────────┘  └─────────────┘  └─────────────────────┘  │
└─────────────────────────────────────────────────────────────┘
```

## Build

```bash
# Debug Build
./gradlew assembleDebug

# Release Build
./gradlew assembleRelease
```

## Projektphasen

1. ✅ **Phase 1**: Projekt-Setup & Grundstruktur
2. ⏳ **Phase 2**: Domain Layer & Datenbank-Schema
3. ⏳ **Phase 3**: Data Layer & API Integration
4. ⏳ **Phase 4**: Onboarding Flow & UI
5. ⏳ **Phase 5**: Player & EPG
6. ⏳ **Phase 6**: Settings & TV Integration

## License

MIT License
