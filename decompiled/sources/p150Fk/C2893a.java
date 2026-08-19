package p150Fk;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17314q;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Fk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2893a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public static final C2893a f8700Y = new C2893a(0);

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Class<?> cls;
        C17314q c17314q = AbstractC2894b.f8701a;
        try {
            cls = Class.forName("com.withpersona.sdk2.inquiry.webrtc.impl.WebRtcManager");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        return Boolean.valueOf(cls != null);
    }
}
