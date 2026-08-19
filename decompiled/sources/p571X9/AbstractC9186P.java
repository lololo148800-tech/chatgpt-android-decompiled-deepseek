package p571X9;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: X9.P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9186P {
    /* JADX INFO: renamed from: a */
    public static final boolean m9747a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static final void m9748b(Intent intent, String url) {
        AbstractC16544l.m18094g(url, "url");
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(url));
    }
}
