package p504Ue;

import kotlin.jvm.internal.AbstractC16544l;
import p033B5.C0840x;
import p1155zi.C21907E;
import p160G5.InterfaceC3000f;
import p160G5.InterfaceC3001g;
import p374P5.C6361n;
import p480Te.C7392q;

/* JADX INFO: renamed from: Ue.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C7635e implements InterfaceC3000f {

    /* JADX INFO: renamed from: a */
    public final C7392q f24139a;

    public C7635e(C7392q c7392q) {
        this.f24139a = c7392q;
    }

    @Override // p160G5.InterfaceC3000f
    /* JADX INFO: renamed from: a */
    public final InterfaceC3001g mo3828a(Object obj, C6361n options, C0840x c0840x) {
        String data = ((C21907E) obj).f69451a;
        AbstractC16544l.m18094g(data, "data");
        AbstractC16544l.m18094g(options, "options");
        return new C7637g(this.f24139a, data, options, c0840x);
    }
}
