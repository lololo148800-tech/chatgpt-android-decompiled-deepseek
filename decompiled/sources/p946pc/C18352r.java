package p946pc;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;
import p204I1.C3582M;
import p328N1.C5605u;
import p328N1.C5609y;
import p349O0.C6021p;
import p571X9.AbstractC9119D4;
import p774h1.C14365u;

/* JADX INFO: renamed from: pc.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C18352r extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C18352r f58596Z = new C18352r(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18352r f58597o0 = new C18352r(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C18352r f58598p0 = new C18352r(2, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58599Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18352r(int i10, int i11) {
        super(i10);
        this.f58599Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58599Y) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C3582M textStyle = (C3582M) obj2;
                AbstractC16544l.m18094g(textStyle, "textStyle");
                if (iIntValue == 0) {
                    return new C3582M(0L, AbstractC9119D4.m9650c(36), C5609y.f18158u0, null, null, 16777209);
                }
                if (iIntValue == 1) {
                    return new C3582M(0L, AbstractC9119D4.m9650c(26), C5609y.f18158u0, null, null, 16777209);
                }
                if (iIntValue == 2) {
                    return new C3582M(C14365u.m15774b(0.7f, textStyle.m4277d()), AbstractC9119D4.m9650c(22), C5609y.f18158u0, null, null, 16777208);
                }
                if (iIntValue == 3) {
                    return new C3582M(0L, AbstractC9119D4.m9650c(20), C5609y.f18158u0, new C5605u(1), null, 16777201);
                }
                if (iIntValue == 4) {
                    return new C3582M(C14365u.m15774b(0.7f, textStyle.m4277d()), AbstractC9119D4.m9650c(18), C5609y.f18158u0, null, null, 16777208);
                }
                if (iIntValue != 5) {
                    return textStyle;
                }
                return new C3582M(C14365u.m15774b(0.5f, textStyle.m4277d()), 0L, C5609y.f18158u0, null, null, 16777210);
            case 1:
                C6021p c6021p = (C6021p) obj;
                ((Number) obj2).intValue();
                c6021p.m6525T(-333154667);
                C3582M c3582m = (C3582M) c6021p.m6548k(AbstractC18319D.f58477a);
                c6021p.m6553p(false);
                return c3582m;
            default:
                C6021p c6021p2 = (C6021p) obj;
                ((Number) obj2).intValue();
                c6021p2.m6525T(1457540156);
                long j10 = ((C14365u) c6021p2.m6548k(AbstractC18319D.f58478b)).f45062a;
                c6021p2.m6553p(false);
                return new C14365u(j10);
        }
    }
}
