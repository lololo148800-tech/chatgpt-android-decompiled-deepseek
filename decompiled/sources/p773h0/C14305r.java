package p773h0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1140z1.C21660F;
import p156G1.AbstractC2973t;
import p156G1.C2959f;
import p156G1.C2963j;
import p156G1.C2971r;
import p156G1.C2974u;
import p225Im.InterfaceC3776x;

/* JADX INFO: renamed from: h0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C14305r extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C14305r f44907Z = new C14305r(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C14305r f44908o0 = new C14305r(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C14305r f44909p0 = new C14305r(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C14305r f44910q0 = new C14305r(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C14305r f44911r0 = new C14305r(1, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44912Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14305r(int i10, int i11) {
        super(i10);
        this.f44912Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f44912Y) {
            case 0:
                ((C21660F) obj).m22080a();
                return c17296c;
            case 1:
                return c17296c;
            case 2:
                ((Number) obj).longValue();
                return c17296c;
            case 3:
                C2959f c2959f = C2959f.f8845d;
                InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
                C2974u c2974u = C2971r.f8917c;
                InterfaceC3776x interfaceC3776x = AbstractC2973t.f8942a[1];
                c2974u.m3814a((C2963j) obj, c2959f);
                return c17296c;
            default:
                return new C14322z0(((Number) obj).intValue());
        }
    }
}
