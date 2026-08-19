package ge;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p403Qd.AbstractC6601G;
import p478Tc.AbstractC7313q;
import pf.C18398n;

/* JADX INFO: renamed from: ge.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C14060X extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C14060X f44203Z = new C14060X(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C14060X f44204o0 = new C14060X(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C14060X f44205p0 = new C14060X(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C14060X f44206q0 = new C14060X(1, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44207Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14060X(int i10, int i11) {
        super(i10);
        this.f44207Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f44207Y) {
            case 0:
                AbstractC6601G it = (AbstractC6601G) obj;
                AbstractC16544l.m18094g(it, "it");
                return it.mo7159a();
            case 1:
                ((Number) obj).intValue();
                return C17296C.f55119a;
            case 2:
                C18398n it2 = (C18398n) obj;
                AbstractC16544l.m18094g(it2, "it");
                return Boolean.valueOf(it2.f58686a);
            default:
                ((Number) obj).intValue();
                return Integer.valueOf((int) AbstractC7313q.f23199d);
        }
    }
}
