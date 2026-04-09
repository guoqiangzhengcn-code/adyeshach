package ink.ptms.adyeshach.util

import com.mojang.authlib.properties.PropertyMap

fun getPropertiesCompat(profile: Any): PropertyMap {
    return try {
        profile.javaClass.getMethod("getProperties").invoke(profile) as PropertyMap
    } catch (e: Exception) {
        profile.javaClass.getMethod("properties").invoke(profile) as PropertyMap
    }
}
