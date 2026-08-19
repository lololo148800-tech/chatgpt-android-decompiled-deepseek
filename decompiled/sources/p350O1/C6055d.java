package p350O1;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1139z0.C21585H;
import p204I1.AbstractC3572C;
import p204I1.C3581L;
import p204I1.C3590f;
import p774h1.C14328F;

/* JADX INFO: renamed from: O1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6055d extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C6055d f19713Z = new C6055d(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C6055d f19714o0 = new C6055d(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C6055d f19715p0 = new C6055d(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C6055d f19716q0 = new C6055d(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C6055d f19717r0 = new C6055d(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C6055d f19718s0 = new C6055d(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C6055d f19719t0 = new C6055d(1, 6);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19720Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6055d(int i10, int i11) {
        super(i10);
        this.f19720Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f19720Y) {
            case 0:
                float[] fArr = ((C14328F) obj).f44968a;
                return c17296c;
            case 1:
                float[] fArr2 = ((C14328F) obj).f44968a;
                return c17296c;
            case 2:
                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                C21585H c21585h = AbstractC3572C.f10837a;
                Boolean bool = Boolean.FALSE;
                C3590f c3590f = (AbstractC16544l.m18089b(obj2, bool) || obj2 == null) ? null : (C3590f) ((InterfaceC1436k) c21585h.f68345o0).invoke(obj2);
                AbstractC16544l.m18091d(c3590f);
                Object obj3 = list.get(1);
                int i10 = C3581L.f10907c;
                C3581L c3581l = (AbstractC16544l.m18089b(obj3, bool) || obj3 == null) ? null : (C3581L) ((InterfaceC1436k) AbstractC3572C.f10852p.f68345o0).invoke(obj3);
                AbstractC16544l.m18091d(c3581l);
                return new C6045C(c3590f, c3581l.f10908a, (C3581L) null);
            case 3:
                return c17296c;
            case 4:
                int i11 = ((C6064m) obj).f19754a;
                return c17296c;
            case 5:
                return c17296c;
            default:
                int i12 = ((C6064m) obj).f19754a;
                return c17296c;
        }
    }
}
