package p193Hf;

import android.webkit.JavascriptInterface;
import bo.C11527o;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8024X3;
import p523V9.AbstractC8160o6;
import p929oi.AbstractC18201b;
import sl.AbstractC19667b;

/* JADX INFO: renamed from: Hf.L0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3318L0 {

    /* JADX INFO: renamed from: a */
    public final C11527o f10120a = AbstractC8024X3.m8363a(AbstractC18201b.f58034a, C3317L.f10114v0);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3324O0 f10121b;

    public C3318L0(C3324O0 c3324o0) {
        this.f10121b = c3324o0;
    }

    @JavascriptInterface
    public final void postMessage(String msg) {
        C3324O0 c3324o0 = this.f10121b;
        AbstractC16544l.m18094g(msg, "msg");
        String strM20645a = AbstractC19667b.m20645a(msg);
        try {
            C11527o c11527o = this.f10120a;
            c11527o.getClass();
            c3324o0.getOnMessage().invoke((AbstractC3409v) c11527o.m12903b(strM20645a, AbstractC3409v.Companion.serializer()));
        } catch (Exception e10) {
            AbstractC8160o6.m8731f(c3324o0.f10137p0, "Failed to deserialize message from web", e10, null, 4);
        }
    }
}
