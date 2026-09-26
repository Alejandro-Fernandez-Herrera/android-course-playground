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
- [ ] DataBinding configurado
- [ ] Validación: campos vacíos, cero, negativos (sin crashes)
- [ ] Coma decimal (`1,75`) aceptada
- [ ] Unidad de estatura explícita en el `hint`
- [ ] Textos en `strings.xml`, tamaños de texto en `sp`, `contentDescription` donde aplique
- [ ] Verificado: 70 kg y 1.75 m → 22.86, peso normal
- [ ] Puedo explicarlo línea por línea

## Notas / dudas
