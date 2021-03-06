package com.google.android.gms.internal;

import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: Unknown */
public final class zzlp {
    public static boolean zzb(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        boolean z2 = (resources.getConfiguration().screenLayout & 15) > 3;
        if ((zzlv.zzpQ() && z2) || zzc(resources)) {
            z = true;
        }
        return z;
    }

    private static boolean zzc(Resources resources) {
        boolean z = false;
        Configuration configuration = resources.getConfiguration();
        if (!zzlv.zzpS()) {
            return false;
        }
        if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
            z = true;
        }
        return z;
    }
}
