package com.signora.calendario.utils

import androidx.compose.ui.graphics.Color

/**
 * Include Color:
 * Red, Pink, Purple, Deep Purple, Indigo, Blue, Light Blue, Cyan, Teal, Green,
 * Light Green, Lime, Yellow, Amber, Orange, Deep Orange, Brown, Blue Grey
 */
private val defaultPalette: Map<String, Array<Long>> = mapOf(
    "50" to arrayOf(
        0xFFFFEBEE, 0xFFFCE4EC, 0xFFF3E5F5, 0xFFEDE7F6, 0xFFE8EAF6, 0xFFE3F2FD,
        0xFFE1F5FE, 0xFFE0F7FA, 0xFFE0F2F1, 0xFFE8F5E9, 0xFFF1F8E9, 0xFFF9FBE7,
        0xFFFFFDE7, 0xFFFFF8E1, 0xFFFFF3E0, 0xFFFBE9E7, 0xFFEFEBE9, 0xFFECEFF1
    ),
    "100" to arrayOf(
        0xFFFFCDD2, 0xFFF8BBD0, 0xFFE1BEE7, 0xFFD1C4E9, 0xFFC5CAE9, 0xFFBBDEFB,
        0xFFB3E5FC, 0xFFB2EBF2, 0xFFB2DFDB, 0xFFC8E6C9, 0xFFDCEDC8, 0xFFF0F4C3,
        0xFFFFF9C4, 0xFFFFECB3, 0xFFFFE0B2, 0xFFFFCCBC, 0xFFD7CCC8, 0xFFCFD8DC
    ),
    "200" to arrayOf(
        0xFFEF9A9A, 0xFFF48FB1, 0xFFCE93D8, 0xFFB39DDB, 0xFF9FA8DA, 0xFF90CAF9,
        0xFF81D4FA, 0xFF80DEEA, 0xFF80CBC4, 0xFFA5D6A7, 0xFFC5E1A5, 0xFFE6EE9C,
        0xFFFFF59D, 0xFFFFE082, 0xFFFFCC80, 0xFFFFAB91, 0xFFBCAAA4, 0xFFB0BEC5
    ),
    "300" to arrayOf(
        0xFFE57373, 0xFFF06292, 0xFFBA68C8, 0xFF9575CD, 0xFF7986CB, 0xFF64B5F6,
        0xFF4FC3F7, 0xFF4DD0E1, 0xFF4DB6AC, 0xFF81C784, 0xFFAED581, 0xFFDCE775,
        0xFFFFF176, 0xFFFFD54F, 0xFFFFB74D, 0xFFFF8A65, 0xFFA1887F, 0xFF90A4AE
    ),
    "400" to arrayOf(
        0xFFEF5350, 0xFFEC407A, 0xFFAB47BC, 0xFF7E57C2, 0xFF5C6BC0, 0xFF42A5F5,
        0xFF29B6F6, 0xFF26C6DA, 0xFF26A69A, 0xFF66BB6A, 0xFF9CCC65, 0xFFD4E157,
        0xFFFFEE58, 0xFFFFCA28, 0xFFFFA726, 0xFFFF7043, 0xFF8D6E63, 0xFF78909C
    ),
    "500" to arrayOf(
        0xFFF44336, 0xFFE91E63, 0xFF9C27B0, 0xFF673AB7, 0xFF3F51B5, 0xFF2196F3,
        0xFF03A9F4, 0xFF00BCD4, 0xFF009688, 0xFF4CAF50, 0xFF8BC34A, 0xFFCDDC39,
        0xFFFFEB3B, 0xFFFFC107, 0xFFFF9800, 0xFFFF5722, 0xFF795548, 0xFF607D8B
    ),
    "600" to arrayOf(
        0xFFE53935, 0xFFD81B60, 0xFF8E24AA, 0xFF5E35B1, 0xFF3949AB, 0xFF1E88E5,
        0xFF039BE5, 0xFF00ACC1, 0xFF00897B, 0xFF43A047, 0xFF7CB342, 0xFFC0CA33,
        0xFFFDD835, 0xFFFFB300, 0xFFFB8C00, 0xFFF4511E, 0xFF6D4C41, 0xFF546E7A
    ),
    "700" to arrayOf(
        0xFFD32F2F, 0xFFC2185B, 0xFF7B1FA2, 0xFF512DA8, 0xFF303F9F, 0xFF1976D2,
        0xFF0288D1, 0xFF0097A7, 0xFF00796B, 0xFF388E3C, 0xFF689F38, 0xFFAFB42B,
        0xFFFBC02D, 0xFFFFA000, 0xFFF57C00, 0xFFE64A19, 0xFF5D4037, 0xFF455A64
    ),
    "800" to arrayOf(
        0xFFC62828, 0xFFAD1457, 0xFF6A1B9A, 0xFF4527A0, 0xFF283593, 0xFF1565C0,
        0xFF0277BD, 0xFF00838F, 0xFF00695C, 0xFF2E7D32, 0xFF558B2F, 0xFF9E9D24,
        0xFFF9A825, 0xFFFF8F00, 0xFFEF6C00, 0xFFD84315, 0xFF4E342E, 0xFF37474F),
    "900" to arrayOf(
        0xFFB71C1C, 0xFF880E4F, 0xFF4A148C, 0xFF311B92, 0xFF1A237E, 0xFF0D47A1,
        0xFF01579B, 0xFF006064, 0xFF004D40, 0xFF1B5E20, 0xFF33691E, 0xFF827717,
        0xFFF57F17, 0xFFFF6F00, 0xFFE65100, 0xFFBF360C, 0xFF3E2723, 0xFF263238),
    "A100" to arrayOf(
        0xFFFF8A80, 0xFFFF80AB, 0xFFEA80FC, 0xFFB388FF, 0xFF8C9EFF, 0xFF82B1FF,
        0xFF80D8FF, 0xFF84FFFF, 0xFFA7FFEB, 0xFFB9F6CA, 0xFFCCFF90, 0xFFF4FF81,
        0xFFFFFF8D, 0xFFFFE57F, 0xFFFFD180, 0xFFFF9E80
    ),
    "A200" to arrayOf(
        0xFFFF5252, 0xFFFF4081, 0xFFE040FB, 0xFF7C4DFF, 0xFF536DFE, 0xFF448AFF,
        0xFF40C4FF, 0xFF18FFFF, 0xFF64FFDA, 0xFF69F0AE, 0xFFB2FF59, 0xFFEEFF41,
        0xFFFFFF00, 0xFFFFD740, 0xFFFFAB40, 0xFFFF6E40
    ),
    "A400" to arrayOf(
        0xFFFF1744, 0xFFF50057, 0xFFD500F9, 0xFF651FFF, 0xFF3D5AFE, 0xFF2979FF,
        0xFF00B0FF, 0xFF00E5FF, 0xFF1DE9B6, 0xFF00E676, 0xFF76FF03, 0xFFC6FF00,
        0xFFFFEA00, 0xFFFFC400, 0xFFFF9100, 0xFFFF3D00
    ),
    "A700" to arrayOf(
        0xFFD50000, 0xFFC51162, 0xFFAA00FF, 0xFF6200EA, 0xFF304FFE, 0xFF2962FF,
        0xFF0091EA, 0xFF00B8D4, 0xFF00BFA5, 0xFF00C853, 0xFF64DD17, 0xFFAEEA00,
        0xFFFFD600, 0xFFFFAB00, 0xFFFF6D00, 0xFFDD2C00
    )
)

internal fun generateRandomColor(type: String = "300"): Color {
    return defaultPalette[type]?.let { Color(it.random()) } ?: Color.Gray
}

internal fun getBuildInColor(type: String = "300"): Array<Color> {
    return requireNotNull(defaultPalette[type]).map { Color(it) }.toTypedArray()
}