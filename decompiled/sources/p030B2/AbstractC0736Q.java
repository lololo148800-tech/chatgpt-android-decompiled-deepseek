package p030B2;

import android.javax.sip.C10808o;
import android.view.ContentInfo;
import android.view.View;
import p817j$.util.Objects;

/* JADX INFO: renamed from: B2.Q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0736Q {
    /* JADX INFO: renamed from: a */
    public static String[] m1570a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static C0755f m1571b(View view, C0755f c0755f) {
        ContentInfo contentInfoMo1606e = c0755f.f2132a.mo1606e();
        Objects.requireNonNull(contentInfoMo1606e);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo1606e);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo1606e ? c0755f : new C0755f(new C10808o(contentInfoPerformReceiveContent));
    }
}
