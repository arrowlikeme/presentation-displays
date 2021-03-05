package com.namit.presentation_displays

import androidx.annotation.Keep;

/**
 * @hide
 */
@Keep
data class DisplayJson(val displayId: Int,
                       val flags: Int,
                       val rotation: Int,
                       val name: String){
}