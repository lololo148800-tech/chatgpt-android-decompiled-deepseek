package p106E0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p349O0.C5984W0;
import p492U1.C7540e;
import p774h1.AbstractC14334L;
import p774h1.C14365u;

/* JADX INFO: renamed from: E0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2228b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C2228b f6828Z = new C2228b(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C2228b f6829o0 = new C2228b(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C2228b f6830p0 = new C2228b(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C2228b f6831q0 = new C2228b(0, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6832Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2228b(int i10, int i11) {
        super(i10);
        this.f6832Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f6832Y) {
            case 0:
                C5984W0 c5984w0 = AbstractC2229c.f6833a;
                long jM15626d = AbstractC14334L.m15626d(4284612846L);
                long jM15626d2 = AbstractC14334L.m15626d(4281794739L);
                long jM15626d3 = AbstractC14334L.m15626d(4278442694L);
                long jM15626d4 = AbstractC14334L.m15626d(4278290310L);
                long j10 = C14365u.f45055e;
                long jM15626d5 = AbstractC14334L.m15626d(4289724448L);
                long j11 = C14365u.f45052b;
                return new C2227a(jM15626d, jM15626d2, jM15626d3, jM15626d4, j10, j10, jM15626d5, j10, j11, j11, j11, j10);
            case 1:
                return new C14365u(C14365u.f45052b);
            case 2:
                return new C7540e(0);
            default:
                return C2231e.f6835a;
        }
    }
}
