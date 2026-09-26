# Android Course Playground

My exercises and study notes for **Desarrollo de Aplicaciones para Dispositivos Móviles** (750026C), Universidad del Valle, 2026-2.

Native Android · Kotlin · XML Views · Android Studio

## Structure

Each class has its own folder with study notes (`README.md`) and one Android Studio project per exercise:

```
class-XX-topic/
├── README.md          # what was covered, exercise statement, status
└── <exercise-name>/   # standalone Android Studio project (open this folder, not the repo root)
```

| Class | Topic | Exercises |
|---|---|---|
| [01](class-01-kotlin-basics/) | Kotlin basics | `student-filter` |
| [02](class-02-project-structure-lifecycle/) | Android architecture, project structure, Activity lifecycle | `lifecycle-logger` |
| [03](class-03-ui-components-databinding/) | UI components, DataBinding, listeners, resources | `bmi-calculator` |

## Notes

- Teacher's example code is **not** stored here; the originals live in Prof. Walter Medina's GitHub account: [waltermedinacode](https://github.com/waltermedinacode) (repos `claseN_univalle`). His class numbering does not match this semester's, so check the topic, not the number.
- Every project is opened in Android Studio from its own folder.
- Commit messages follow `<scope>: <imperative summary>`, e.g. `class-03: add BMI input validation`.
