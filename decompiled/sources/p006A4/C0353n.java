package p006A4;

import androidx.navigation.AbstractC11122c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0260j0;
import p049Bm.InterfaceC1436k;
import p1000s0.C19408d;
import p1000s0.C19422r;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1113xn.AbstractC21329w;
import p1143z4.C21760B;
import p1143z4.C21778h;
import p1143z4.C21795y;
import p1155zi.C22011h0;
import p153Fn.C2925c;
import p156G1.AbstractC2962i;
import p156G1.AbstractC2973t;
import p156G1.C2954a;
import p156G1.C2963j;
import p225Im.InterfaceC3776x;
import p318Mh.C5387a;
import p318Mh.C5431w;
import p318Mh.C5435y;
import p349O0.C5996c0;
import p586Y0.C9566r;

/* JADX INFO: renamed from: A4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0353n extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1223Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f1224Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f1225o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f1226p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0353n(Object obj, boolean z6, Object obj2, int i10) {
        super(1);
        this.f1223Y = i10;
        this.f1225o0 = obj;
        this.f1224Z = z6;
        this.f1226p0 = obj2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        C17296C c17296c = C17296C.f55119a;
        Object obj2 = this.f1225o0;
        boolean z6 = this.f1224Z;
        Object obj3 = this.f1226p0;
        switch (this.f1223Y) {
            case 0:
                C21778h c21778h = (C21778h) obj2;
                C0352m c0352m = new C0352m(z6, (C9566r) obj3, c21778h);
                c21778h.f69080t0.mo7806a(c0352m);
                return new C0260j0(c21778h, i10, c0352m);
            case 1:
                ((AbstractC21068W) obj).m21545d((AbstractC21069X) obj3, 0, 0, ((Number) ((C5996c0) obj2).getValue()).floatValue() + (z6 ? 5.0f : 0.0f));
                return c17296c;
            case 2:
                C5387a buildRoute = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute, "$this$buildRoute");
                C5435y.f17770g.getClass();
                buildRoute.m5900a(C5435y.f17771h, new C22011h0((String) obj2));
                buildRoute.m5900a(C5435y.f17772i, (String) obj3);
                buildRoute.m5900a(C5435y.f17773j, Boolean.valueOf(z6));
                return c17296c;
            case 3:
                C21760B navigate = (C21760B) obj;
                AbstractC16544l.m18094g(navigate, "$this$navigate");
                if (z6) {
                    C5431w c5431w = C5431w.f17746g;
                    c5431w.getClass();
                    String route = (String) obj2;
                    AbstractC16544l.m18094g(route, "route");
                    if (AbstractC21329w.m21734u(route, "conversation?", false)) {
                        AbstractC11122c.m12180q((C21795y) obj3, (String) c5431w.f17599c.getValue(), true);
                    }
                }
                return c17296c;
            default:
                C2963j c2963j = (C2963j) obj;
                C2925c c2925c = (C2925c) obj3;
                C19408d c19408d = (C19408d) obj2;
                if (z6) {
                    C19422r c19422r = new C19422r(c19408d, c2925c, i12);
                    InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
                    c2963j.m3787m(AbstractC2962i.f8876w, new C2954a(null, c19422r));
                    c2963j.m3787m(AbstractC2962i.f8878y, new C2954a(null, new C19422r(c19408d, c2925c, i11)));
                } else {
                    C19422r c19422r2 = new C19422r(c19408d, c2925c, i10);
                    InterfaceC3776x[] interfaceC3776xArr2 = AbstractC2973t.f8942a;
                    c2963j.m3787m(AbstractC2962i.f8877x, new C2954a(null, c19422r2));
                    c2963j.m3787m(AbstractC2962i.f8879z, new C2954a(null, new C19422r(c19408d, c2925c, 3)));
                }
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0353n(String str, String str2, boolean z6) {
        super(1);
        this.f1223Y = 2;
        this.f1225o0 = str;
        this.f1226p0 = str2;
        this.f1224Z = z6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0353n(boolean z6, Object obj, Object obj2, int i10) {
        super(1);
        this.f1223Y = i10;
        this.f1224Z = z6;
        this.f1225o0 = obj;
        this.f1226p0 = obj2;
    }
}
