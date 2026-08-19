package p886m5;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p1075w5.C20830h;
import p1075w5.C20831i;
import p774h1.C14351g;
import p882m1.AbstractC17140a;
import p895n1.C17425e;

/* JADX INFO: renamed from: m5.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17172g {

    /* JADX INFO: renamed from: a */
    public static final C17171f f54856a = new C17171f();

    /* JADX INFO: renamed from: a */
    public static void m18921a(String str) {
        throw new IllegalArgumentException(AbstractC10763a.m11055m("Unsupported type: ", str, ". ", AbstractC10763a.m11054l("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    /* JADX INFO: renamed from: b */
    public static final void m18922b(C20831i c20831i) {
        Object obj = c20831i.f66211b;
        if (obj instanceof C20830h) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj instanceof C14351g) {
            m18921a("ImageBitmap");
            throw null;
        }
        if (obj instanceof C17425e) {
            m18921a("ImageVector");
            throw null;
        }
        if (obj instanceof AbstractC17140a) {
            m18921a("Painter");
            throw null;
        }
        if (c20831i.f66212c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
