package pf;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p492U1.C7545j;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p774h1.AbstractC14360p;
import p775h2.AbstractC14376f;
import p821j1.InterfaceC16039d;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: pf.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C18410z extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ List f58735Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC14360p f58736Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f58737o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f58738p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ float f58739q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ float f58740r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC5985X f58741s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC5982V0 f58742t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18410z(List list, AbstractC14360p abstractC14360p, float f10, float f11, float f12, float f13, InterfaceC5985X interfaceC5985X, InterfaceC5982V0 interfaceC5982V0) {
        super(1);
        this.f58735Y = list;
        this.f58736Z = abstractC14360p;
        this.f58737o0 = f10;
        this.f58738p0 = f11;
        this.f58739q0 = f12;
        this.f58740r0 = f13;
        this.f58741s0 = interfaceC5985X;
        this.f58742t0 = interfaceC5982V0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC16039d Canvas = (InterfaceC16039d) obj;
        AbstractC16544l.m18094g(Canvas, "$this$Canvas");
        List list = this.f58735Y;
        boolean zM19863c = AbstractC18384B.m19863c(list);
        InterfaceC5985X interfaceC5985X = this.f58741s0;
        if (zM19863c) {
            int i10 = 0;
            for (Object obj2 : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                float fFloatValue = ((Number) obj2).floatValue();
                float f10 = this.f58738p0;
                float f11 = this.f58739q0;
                float f12 = (f10 + f11) * i10;
                float f13 = ((int) (((C7545j) interfaceC5985X.getValue()).f23903a & 4294967295L)) * fFloatValue;
                float f14 = this.f58740r0;
                float fMax = Math.max(this.f58737o0, Math.max(f14, f13));
                AbstractC14376f.m15851q(Canvas, this.f58736Z, AbstractC8088f6.m8536b(f12, (((int) (((C7545j) interfaceC5985X.getValue()).f23903a & 4294967295L)) / 2.0f) - (fMax / 2)), AbstractC8112i6.m8603a(((1.0f - ((Number) this.f58742t0.getValue()).floatValue()) * f11) + f10, fMax), AbstractC8072d6.m8484a(f14, f14), null, 240);
                i10 = i11;
            }
        } else {
            Canvas.mo17594a0(this.f58736Z, AbstractC8088f6.m8536b(0.0f, ((int) (((C7545j) interfaceC5985X.getValue()).f23903a & 4294967295L)) / 2.0f), AbstractC8088f6.m8536b((int) (((C7545j) interfaceC5985X.getValue()).f23903a >> 32), ((int) (((C7545j) interfaceC5985X.getValue()).f23903a & 4294967295L)) / 2.0f), this.f58737o0, (432 & 16) != 0 ? 0 : 1, (432 & 64) != 0 ? 1.0f : 0.0f, null, 3);
        }
        return C17296C.f55119a;
    }
}
