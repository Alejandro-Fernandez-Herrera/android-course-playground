# Clase 3 — Componentes de UI y DataBinding

## Temas
- DataBinding: `buildFeatures { dataBinding = true }` → XML envuelto en `<layout>` → `DataBindingUtil.setContentView(...)`
- Ids `snake_case` en XML → `camelCase` en Kotlin (`et_weight` → `binding.etWeight`)
- Listeners: `setOnClickListener`, `addTextChangedListener`, `setOnCheckedChangeListener` (RadioGroup → `Int`, CheckBox/Switch → `Boolean`)
- Recursos: textos en `strings.xml`, colores en `colors.xml`
- `ArrayAdapter` + `AutoCompleteTextView` (base de RecyclerView)

## Ejercicio: `bmi-calculator` — entrega jueves 1 de octubre
Calculadora de IMC: peso y estatura → IMC y categoría (bajo peso < 18.5, normal < 25, sobrepeso < 30, obesidad ≥ 30).

Checklist:
- [x] DataBinding configurado
- [x] Validación: campos vacíos, cero, negativos (sin crashes)
- [ ] Coma decimal (`1,75`) aceptada
- [x] Unidad de estatura explícita en el `hint`
- [x] Textos en `strings.xml`, tamaños de texto en `sp`, `contentDescription` donde aplique
- [x] Verificado: 70 kg y 1.75 m → 22.86, peso normal

