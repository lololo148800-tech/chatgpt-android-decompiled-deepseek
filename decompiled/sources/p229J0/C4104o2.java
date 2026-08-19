package p229J0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1140z1.C21660F;
import p278L0.C4847K;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p759g1.C13803e;
import p774h1.C14365u;
import p775h2.AbstractC14376f;
import p821j1.C16037b;
import p821j1.C16043h;

/* JADX INFO: renamed from: J0.o2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4104o2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13165Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f13166Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f13167o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f13168p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4104o2(float f10, long j10, C3880A3 c3880a3) {
        super(1);
        this.f13167o0 = f10;
        this.f13166Z = j10;
        this.f13168p0 = c3880a3;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f13165Y) {
            case 0:
                C4847K c4847k = (C4847K) obj;
                EnumC3886B3 enumC3886B3 = EnumC3886B3.f11777Y;
                float f10 = this.f13167o0;
                c4847k.m5497a(enumC3886B3, f10);
                int i10 = (int) (this.f13166Z & 4294967295L);
                float f11 = i10;
                if (f11 > f10 / 2 && !((C3880A3) this.f13168p0).f11735a) {
                    c4847k.m5497a(EnumC3886B3.f11779o0, f10 / 2.0f);
                }
                if (i10 != 0) {
                    c4847k.m5497a(EnumC3886B3.f11778Z, Math.max(0.0f, f10 - f11));
                }
                break;
            default:
                C21660F drawWithContent = (C21660F) obj;
                AbstractC16544l.m18094g(drawWithContent, "$this$drawWithContent");
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f13168p0;
                boolean zBooleanValue = ((Boolean) interfaceC5985X.getValue()).booleanValue();
                long j10 = this.f13166Z;
                float f12 = this.f13167o0;
                if (zBooleanValue) {
                    long jM15774b = C14365u.m15774b(0.05f, j10);
                    long jM8536b = AbstractC8088f6.m8536b(drawWithContent.mo7864b0((float) 0.5d), 0.0f);
                    C16037b c16037b = drawWithContent.f68674Y;
                    float f13 = 1;
                    long jM8603a = AbstractC8112i6.m8603a(C13803e.m15333e(c16037b.f49479Z.m15202x()), drawWithContent.mo7864b0(f13) + C13803e.m15331c(c16037b.f49479Z.m15202x()));
                    float fMo7864b0 = drawWithContent.mo7864b0(f12);
                    AbstractC14376f.m15852r(drawWithContent, jM15774b, jM8536b, jM8603a, AbstractC8072d6.m8484a(fMo7864b0, fMo7864b0), new C16043h(drawWithContent.mo7864b0(f13), 0.0f, 0, 0, 30), 224);
                }
                drawWithContent.m22080a();
                if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                    long jM15774b2 = C14365u.m15774b(0.1f, j10);
                    long jM15202x = drawWithContent.f68674Y.f49479Z.m15202x();
                    float fMo7864b1 = drawWithContent.mo7864b0(f12);
                    AbstractC14376f.m15852r(drawWithContent, jM15774b2, 0L, jM15202x, AbstractC8072d6.m8484a(fMo7864b1, fMo7864b1), new C16043h(drawWithContent.mo7864b0(1), 0.0f, 0, 0, 30), 226);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4104o2(long j10, float f10, InterfaceC5985X interfaceC5985X) {
        super(1);
        this.f13166Z = j10;
        this.f13167o0 = f10;
        this.f13168p0 = interfaceC5985X;
    }
}
