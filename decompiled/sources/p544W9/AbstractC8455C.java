package p544W9;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.p650ui.draw.AbstractC10861a;
import java.util.Arrays;
import java.util.HashSet;
import p049Bm.InterfaceC1436k;
import p1050v.InterfaceC20412a;
import p124Ei.C2473Q0;
import p228J.C3841i0;
import p228J.InterfaceC3839h0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p523V9.AbstractC8072d6;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17758g;

/* JADX INFO: renamed from: W9.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8455C implements InterfaceC20412a {
    /* JADX INFO: renamed from: a */
    public static final void m9069a(int i10, InterfaceC1436k interfaceC1436k, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        c6021p.m6526U(-932836462);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC17758g.m19482b(c6021p, AbstractC10861a.m11295a(interfaceC10459q, interfaceC1436k));
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2473Q0(interfaceC10459q, interfaceC1436k, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C3841i0 m9070b(Bundle bundle, Context context) {
        boolean z6 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrM9071c = m9071c(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrM9071c2 = m9071c(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        AbstractC8072d6.m8486c("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        AbstractC8072d6.m8486c("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z6);
        AbstractC8072d6.m8486c("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrM9071c));
        AbstractC8072d6.m8486c("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrM9071c2));
        return new C3841i0(z6, new HashSet(m9072d(strArrM9071c)), new HashSet(m9072d(strArrM9071c2)));
    }

    /* JADX INFO: renamed from: c */
    public static String[] m9071c(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i10 = bundle.getInt(str, -1);
        if (i10 == -1) {
            AbstractC8072d6.m8492i("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i10);
        } catch (Resources.NotFoundException e10) {
            AbstractC8072d6.m8493j("QuirkSettingsLoader", "Quirk class names resource not found: " + i10, e10);
            return new String[0];
        }
    }

    /* JADX INFO: renamed from: d */
    public static HashSet m9072d(String[] strArr) {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
                if (!InterfaceC3839h0.class.isAssignableFrom(cls)) {
                    AbstractC8072d6.m8492i("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
                    cls = null;
                }
            } catch (ClassNotFoundException e10) {
                AbstractC8072d6.m8493j("QuirkSettingsLoader", "Class not found: " + str, e10);
            }
            if (cls != null) {
                hashSet.add(cls);
            }
        }
        return hashSet;
    }
}
