package p544W9;

import android.content.res.Configuration;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import p164G8.AbstractC3010d;
import p164G8.C3014h;
import p349O0.C6021p;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: W9.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8467E {
    /* JADX INFO: renamed from: a */
    public static String m9096a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9097b(C6021p c6021p) {
        return (((Configuration) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32824a)).uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: c */
    public static C3014h m9098c(int i10, String str) {
        C3014h c3014h = new C3014h(str, i10);
        if (c3014h.compareTo(AbstractC3010d.f9062D0) < 0 || c3014h.compareTo(AbstractC3010d.f9060B0) > 0) {
            throw new IllegalArgumentException(AbstractC9306j0.m9889h("ID out of range, must be between 0 and 2^128-1, got: ", str));
        }
        return c3014h;
    }

    /* JADX INFO: renamed from: d */
    public static C3014h m9099d(int i10, String str) {
        C3014h c3014h = new C3014h(str, i10);
        if (c3014h.compareTo(AbstractC3010d.f9062D0) < 0 || c3014h.compareTo(AbstractC3010d.f9061C0) > 0) {
            throw new IllegalArgumentException(AbstractC9306j0.m9889h("ID out of range, must be between 0 and 2^64-1, got: ", str));
        }
        return c3014h;
    }
}
