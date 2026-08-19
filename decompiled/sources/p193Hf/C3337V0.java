package p193Hf;

import bo.C11527o;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21323q;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p929oi.AbstractC18201b;

/* JADX INFO: renamed from: Hf.V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3337V0 {

    /* JADX INFO: renamed from: a */
    public final C6002f0 f10189a = C5997d.m6430Q(null, C5975S.f19448r0);

    /* JADX INFO: renamed from: a */
    public final void m4172a(InterfaceC3305F message) {
        AbstractC16544l.m18094g(message, "message");
        C3311I c3311i = new C3311I(message);
        C11527o c11527o = AbstractC18201b.f58034a;
        c11527o.getClass();
        String strM21717d = AbstractC21323q.m21717d("\n            window.dispatchEvent(\n                new MessageEvent(\"message\", {\n                    data: " + c11527o.m12905d(C3311I.Companion.serializer(), c3311i) + "\n                })\n            );\n        ");
        C3324O0 c3324o0 = (C3324O0) this.f10189a.getValue();
        if (c3324o0 != null) {
            c3324o0.evaluateJavascript(strM21717d, new C3335U0());
        }
    }
}
