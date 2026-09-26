# Clase 2 — Estructura del proyecto y ciclo de vida

## Temas
- Plantilla **Empty Views Activity** (no *Empty Activity*, que genera Compose)
- Paquete propio, nunca `com.example` (Play Store lo rechaza); minSdk 24 (Android 7.0)
- Carpetas: `manifests`, `kotlin+java` (`test`, `androidTest`), `res` (`drawable`, `mipmap`, `values`)
- Capas de Android, componentes (Activity, Fragment, Service, Intent, BroadcastReceiver, ContentProvider)
- Ciclo de vida: `onCreate` → `onStart` → `onResume` → `onPause` → `onStop` → `onDestroy`
- `Toast.makeText(this, msg, Toast.LENGTH_LONG).show()` desde `onCreate`
- Si falla el build: Gradle JDK → Clean → Sync → Invalidate Caches → borrar `.gradle`, `.idea`, `app/build`

## Ejercicio: `lifecycle-logger`
`Log.d("Lifecycle", ...)` en los 6 métodos del ciclo de vida. Ejecutar, mandar a segundo plano, volver y **rotar la pantalla**; observar en Logcat qué se llama.

- [ ] Resuelto
- [ ] Pregunta de control: al rotar, ¿se pierde el texto de un `EditText` con `android:id`? ¿Y una `var counter` de la Activity? ¿Por qué?

## Notas / dudas
