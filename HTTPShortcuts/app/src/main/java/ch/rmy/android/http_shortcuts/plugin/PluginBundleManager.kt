package ch.rmy.android.http_shortcuts.plugin

import android.os.Bundle

object PluginBundleManager {

    private val SHORTCUT_ID = "ch.rmy.android.http_shortcuts.shortcut_id"

    fun generateBundle(shortcutId: Long): Bundle {
        val bundle = Bundle()
        bundle.putLong(SHORTCUT_ID, shortcutId)
        return bundle
    }

    fun getShortcutId(bundle: Bundle) = bundle.getLong(SHORTCUT_ID)

    fun isBundleValid(bundle: Bundle?) = bundle?.containsKey(SHORTCUT_ID) ?: false

}
