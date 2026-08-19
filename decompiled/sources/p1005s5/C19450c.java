package p1005s5;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC16544l;
import p007A5.AbstractC0371f;
import p1075w5.C20835m;

/* JADX INFO: renamed from: s5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C19450c implements InterfaceC19449b {
    @Override // p1005s5.InterfaceC19449b
    /* JADX INFO: renamed from: a */
    public final String mo20538a(Object obj, C20835m c20835m) {
        Uri uri = (Uri) obj;
        if (!AbstractC16544l.m18089b(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        Configuration configuration = c20835m.f66238a.getResources().getConfiguration();
        Bitmap.Config config = AbstractC0371f.f1262a;
        sb2.append(configuration.uiMode & 48);
        return sb2.toString();
    }
}
