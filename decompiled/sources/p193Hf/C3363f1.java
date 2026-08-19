package p193Hf;

import com.google.protobuf.AbstractC12107L1;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p006A4.C0364y;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p1039ud.C20198o;
import p1062vd.AbstractC20554e;
import p1062vd.C20549b0;
import p1062vd.C20566p;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1140z1.C21660F;
import p153Fn.C2925c;
import p229J0.C4148v4;
import p492U1.C7545j;
import p530Vi.AbstractC8301I;
import p537W0.C8410b;
import p604Yk.C10077b;
import p758g0.C13756d;
import p758g0.C13770k;
import p758g0.C13776n;
import p774h1.C14351g;
import p774h1.C14356l;
import p775h2.AbstractC14376f;
import p860l0.C16698N1;
import p860l0.InterfaceC16694M0;
import p911o0.AbstractC17792x;
import p936p0.C18265e;

/* JADX INFO: renamed from: Hf.f1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3363f1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10270Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f10271Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f10272o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f10273p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3363f1(float f10, Object obj, Object obj2, int i10) {
        super(1);
        this.f10270Y = i10;
        this.f10271Z = f10;
        this.f10272o0 = obj;
        this.f10273p0 = obj2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        long jM3196j;
        switch (this.f10270Y) {
            case 0:
                AbstractC0575H.m1156D((C2925c) this.f10272o0, null, null, new C3360e1((C3369h1) this.f10273p0, AbstractC8301I.m8915f(((int) (((C7545j) obj).f23903a & 4294967295L)) - this.f10271Z, 0.0f), null), 3);
                return C17296C.f55119a;
            case 1:
                AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
                C13756d c13756d = ((C4148v4) this.f10273p0).f13436C0;
                abstractC21068W.m21546g((AbstractC21069X) this.f10272o0, (int) (c13756d != null ? ((Number) c13756d.m15224e()).floatValue() : this.f10271Z), 0, 0.0f);
                return C17296C.f55119a;
            case 2:
                long jLongValue = ((Number) obj).longValue();
                C16698N1 c16698n1 = (C16698N1) this.f10272o0;
                if (c16698n1.f53509b == Long.MIN_VALUE) {
                    c16698n1.f53509b = jLongValue;
                }
                float f10 = c16698n1.f53512e;
                C13776n c13776n = new C13776n(f10);
                float f11 = this.f10271Z;
                C13776n c13776n2 = C16698N1.f53507f;
                if (f11 == 0.0f) {
                    jM3196j = c16698n1.f53508a.mo3882q(new C13776n(f10), c13776n2, c16698n1.f53510c);
                } else {
                    jM3196j = AbstractC2119a.m3196j((jLongValue - c16698n1.f53509b) / f11);
                }
                long j10 = jM3196j;
                float f12 = ((C13776n) c16698n1.f53508a.mo3884u(j10, c13776n, c13776n2, c16698n1.f53510c)).f43510a;
                c16698n1.f53510c = (C13776n) c16698n1.f53508a.mo3877K(j10, c13776n, c13776n2, c16698n1.f53510c);
                c16698n1.f53509b = jLongValue;
                float f13 = c16698n1.f53512e - f12;
                c16698n1.f53512e = f12;
                ((InterfaceC1436k) this.f10273p0).invoke(Float.valueOf(f13));
                return C17296C.f55119a;
            case 3:
                C13770k c13770k = (C13770k) obj;
                float f14 = this.f10271Z;
                float fM8915f = 0.0f;
                if (f14 > 0.0f) {
                    fM8915f = AbstractC8301I.m8917h(((Number) c13770k.f43484e.getValue()).floatValue(), f14);
                } else if (f14 < 0.0f) {
                    fM8915f = AbstractC8301I.m8915f(((Number) c13770k.f43484e.getValue()).floatValue(), f14);
                }
                C16557y c16557y = (C16557y) this.f10272o0;
                float f15 = fM8915f - c16557y.f51286Y;
                if (f15 != ((InterfaceC16694M0) this.f10273p0).mo18510a(f15) || fM8915f != ((Number) c13770k.f43484e.getValue()).floatValue()) {
                    c13770k.m15268a();
                }
                c16557y.f51286Y += f15;
                return C17296C.f55119a;
            case 4:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                AbstractC17792x.m19528k(LazyColumn, null, AbstractC20554e.f65243a, 3);
                C20549b0 c20549b0 = (C20549b0) this.f10272o0;
                AbstractC17792x.m19529l(LazyColumn, c20549b0.f65208E.size(), new C20198o(c20549b0, 7), new C8410b(new C0364y(c20549b0, 15, (InterfaceC1436k) this.f10273p0), true, 1507745314), 4);
                AbstractC17792x.m19528k(LazyColumn, null, AbstractC20554e.f65244b, 3);
                boolean z6 = c20549b0.f65232x;
                if (z6 && c20549b0.f65209a) {
                    AbstractC17792x.m19528k(LazyColumn, null, AbstractC20554e.f65245c, 3);
                } else if (z6 && !c20549b0.f65210b) {
                    AbstractC17792x.m19528k(LazyColumn, null, AbstractC20554e.f65248f, 3);
                }
                AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C20566p(this.f10271Z), true, 1049248977), 3);
                return C17296C.f55119a;
            default:
                C21660F c21660f = (C21660F) obj;
                c21660f.m22080a();
                float f16 = this.f10271Z;
                C14351g c14351g = (C14351g) this.f10272o0;
                C14356l c14356l = (C14356l) this.f10273p0;
                C13711h c13711h = c21660f.f68674Y.f49479Z;
                long jM15202x = c13711h.m15202x();
                c13711h.m15196m().mo15706e();
                try {
                    C10077b c10077b = (C10077b) c13711h.f43259Z;
                    c10077b.m10665M(f16, 0.0f);
                    c10077b.m10662J(45.0f, 0L);
                    AbstractC14376f.m15844j(c21660f, c14351g, c14356l);
                    return C17296C.f55119a;
                } finally {
                    AbstractC12107L1.m13830u(c13711h, jM15202x);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3363f1(Object obj, Object obj2, float f10, int i10) {
        super(1);
        this.f10270Y = i10;
        this.f10272o0 = obj;
        this.f10273p0 = obj2;
        this.f10271Z = f10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3363f1(C16698N1 c16698n1, float f10, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f10270Y = 2;
        this.f10272o0 = c16698n1;
        this.f10271Z = f10;
        this.f10273p0 = interfaceC1436k;
    }
}
