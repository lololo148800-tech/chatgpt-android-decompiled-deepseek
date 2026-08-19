package p229J0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p156G1.AbstractC2962i;
import p156G1.AbstractC2973t;
import p156G1.C2954a;
import p156G1.C2958e;
import p156G1.C2963j;
import p156G1.C2971r;
import p156G1.C2974u;
import p225Im.InterfaceC3776x;

/* JADX INFO: renamed from: J0.F3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3910F3 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f11993Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3934J3 f11994Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3910F3(C3934J3 c3934j3, int i10) {
        super(1);
        this.f11993Y = i10;
        this.f11994Z = c3934j3;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C3934J3 c3934j3 = this.f11994Z;
        switch (this.f11993Y) {
            case 0:
                C2963j c2963j = (C2963j) obj;
                InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
                C2974u c2974u = C2971r.f8924j;
                InterfaceC3776x interfaceC3776x = AbstractC2973t.f8942a[3];
                c2974u.m3814a(c2963j, new C2958e(0));
                c2963j.m3787m(AbstractC2962i.f8873t, new C2954a(null, new C3904E3(c3934j3, 0)));
                return C17296C.f55119a;
            default:
                return Boolean.valueOf(AbstractC16544l.m18089b(((C4061h1) obj).f12884a, c3934j3));
        }
    }
}
