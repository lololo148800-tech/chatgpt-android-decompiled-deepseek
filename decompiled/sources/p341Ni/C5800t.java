package p341Ni;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p855kj.AbstractC16428g;

/* JADX INFO: renamed from: Ni.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C5800t implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C5801u f18935Y;

    public C5800t(C5801u c5801u) {
        this.f18935Y = c5801u;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        List audioDevices = (List) obj;
        AbstractC16544l.m18094g(audioDevices, "audioDevices");
        C5801u c5801u = this.f18935Y;
        c5801u.f18945j.setValue((AbstractC16428g) obj2);
        C2153Q0 c2153q0 = c5801u.f18947l;
        c2153q0.getClass();
        c2153q0.m3251l(null, audioDevices);
        return C17296C.f55119a;
    }
}
