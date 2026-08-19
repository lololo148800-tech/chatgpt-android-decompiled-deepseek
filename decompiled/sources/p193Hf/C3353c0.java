package p193Hf;

import io.sentry.C15108A1;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.android.replay.C15294h;
import io.sentry.android.replay.C15295i;
import io.sentry.android.replay.capture.C15278i;
import io.sentry.android.replay.capture.C15281l;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21098s;
import p1140z1.C21660F;
import p478Tc.AbstractC7313q;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8112i6;
import p571X9.AbstractC9113C4;
import p736f0.C13493k;
import p758g0.C13767i0;
import p774h1.C14336N;
import p774h1.C14353i;
import p774h1.C14365u;
import p775h2.AbstractC14376f;
import p821j1.C16043h;

/* JADX INFO: renamed from: Hf.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3353c0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10242Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f10243Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f10244o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f10245p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3353c0(long j10, Object obj, Object obj2, int i10) {
        super(1);
        this.f10242Y = i10;
        this.f10243Z = j10;
        this.f10244o0 = obj;
        this.f10245p0 = obj2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        long j10 = this.f10243Z;
        Object obj2 = this.f10245p0;
        Object obj3 = this.f10244o0;
        switch (this.f10242Y) {
            case 0:
                C21660F drawWithContent = (C21660F) obj;
                AbstractC16544l.m18094g(drawWithContent, "$this$drawWithContent");
                drawWithContent.m22080a();
                C3418y0 c3418y0 = (C3418y0) obj3;
                long jM15774b = C14365u.m15774b(((Number) c3418y0.f10413f.m15224e()).floatValue() * C14365u.m15776d(j10), j10);
                long jM8603a = AbstractC8112i6.m8603a(c3418y0.m4184a().m15321h(), c3418y0.m4184a().m15318e());
                InterfaceC7537b density = (InterfaceC7537b) obj2;
                AbstractC16544l.m18094g(density, "density");
                float fMo7864b0 = density.mo7864b0(((Number) c3418y0.f10413f.m15224e()).floatValue() * AbstractC7313q.f23200e);
                AbstractC14376f.m15852r(drawWithContent, jM15774b, 0L, jM8603a, AbstractC8072d6.m8484a(fMo7864b0, fMo7864b0), new C16043h(drawWithContent.mo7864b0(1), 0.0f, 0, 0, 30), 226);
                return c17296c;
            case 1:
                C21660F c21660f = (C21660F) obj;
                if (((InterfaceC21098s) obj3) != null) {
                    c21660f.m22080a();
                    AbstractC14376f.m15848n(c21660f, (C14353i) obj2, this.f10243Z, 0.0f, null, 60);
                }
                return c17296c;
            case 2:
                C14336N graphicsLayer = (C14336N) obj;
                AbstractC16544l.m18094g(graphicsLayer, "$this$graphicsLayer");
                C13767i0 c13767i0 = (C13767i0) obj3;
                graphicsLayer.m15655g(((Number) c13767i0.f43468t0.getValue()).floatValue());
                graphicsLayer.m15656h(((Number) c13767i0.f43468t0.getValue()).floatValue());
                graphicsLayer.m15649a(((Number) ((C13767i0) obj2).f43468t0.getValue()).floatValue());
                graphicsLayer.m15660n(j10);
                return c17296c;
            case 3:
                AbstractC21069X abstractC21069X = (AbstractC21069X) obj2;
                AbstractC21068W.m21537f((AbstractC21068W) obj, abstractC21069X, ((C13493k) obj3).f42711b.mo10925a(AbstractC9113C4.m9643a(abstractC21069X.f66981Y, abstractC21069X.f66982Z), this.f10243Z, EnumC7546k.f23904Y));
                return c17296c;
            case 4:
                C15295i it = (C15295i) obj;
                AbstractC16544l.m18094g(it, "it");
                if (it.f47782b < j10) {
                    ((C15294h) obj3).m16516a(it.f47781a);
                    return Boolean.TRUE;
                }
                C16525B c16525b = (C16525B) obj2;
                if (c16525b.f51262Y == null) {
                    c16525b.f51262Y = it.f47783c;
                }
                return Boolean.FALSE;
            default:
                C15281l it2 = (C15281l) obj;
                AbstractC16544l.m18094g(it2, "it");
                C15108A1 c15108a1 = it2.f47739a;
                if (c15108a1.f47011G0.getTime() >= j10) {
                    return Boolean.FALSE;
                }
                C15278i c15278i = (C15278i) obj3;
                c15278i.m16501m(c15278i.m16499k() - 1);
                File file = c15108a1.f47006B0;
                C15524y1 c15524y1 = c15278i.f47734s;
                if (file != null) {
                    try {
                        if (!file.delete()) {
                            c15524y1.getLogger().mo16298o(EnumC15375i1.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                        }
                    } catch (Throwable th2) {
                        c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "Failed to delete replay segment: %s", file.getAbsolutePath());
                    }
                    break;
                }
                ((C16556x) obj2).f51285Y = true;
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3353c0(Object obj, Object obj2, long j10, int i10) {
        super(1);
        this.f10242Y = i10;
        this.f10244o0 = obj;
        this.f10245p0 = obj2;
        this.f10243Z = j10;
    }
}
