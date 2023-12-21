package lt.vilniustech.gsk.mkdf_20_4.vestina.model


import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes
    val stringResourceId: Int,
    @DrawableRes
    val imageResourceId: Int,
    @StringRes
    val expandedTextResourceId: Int
)