package p229J0;

import android.content.res.Configuration;
import android.graphics.Path;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21098s;
import p193Hf.C3353c0;
import p349O0.C6021p;
import p492U1.C7542g;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p537W0.C8410b;
import p635a1.InterfaceC10459q;
import p715e1.C13257c;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.C14353i;

/* JADX INFO: renamed from: J0.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C3968Q extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12369Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f12370Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f12371o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f12372p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f12373q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3968Q(InterfaceC7537b interfaceC7537b, Configuration configuration, long j10, long j11) {
        super(2);
        this.f12372p0 = interfaceC7537b;
        this.f12373q0 = configuration;
        this.f12370Z = j10;
        this.f12371o0 = j11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12369Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4034c4.m4725a((InterfaceC10459q) this.f12372p0, null, this.f12370Z, this.f12371o0, 0.0f, 0.0f, null, (C8410b) this.f12373q0, c6021p, 0, 114);
                }
                return C17296C.f55119a;
            default:
                C13257c c13257c = (C13257c) obj;
                InterfaceC21098s interfaceC21098s = (InterfaceC21098s) obj2;
                C14353i c14353iM15631i = AbstractC14334L.m15631i();
                if (interfaceC21098s != null) {
                    long j10 = this.f12371o0;
                    float fM7876a = C7542g.m7876a(j10);
                    InterfaceC7537b interfaceC7537b = (InterfaceC7537b) this.f12372p0;
                    int iMo7866k0 = interfaceC7537b.mo7866k0(fM7876a);
                    int iMo7866k1 = interfaceC7537b.mo7866k0(C7542g.m7877b(j10));
                    int iMo7866k2 = interfaceC7537b.mo7866k0(((Configuration) this.f12373q0).screenWidthDp);
                    int iMo7866k3 = interfaceC7537b.mo7866k0(AbstractC4166y4.f13535a);
                    C13801c c13801cM21565f = AbstractC21075b0.m21565f(interfaceC21098s);
                    float f10 = c13801cM21565f.f43588c;
                    float f11 = c13801cM21565f.f43586a;
                    float f12 = 2;
                    float f13 = (f10 + f11) / f12;
                    float f14 = f10 - f11;
                    float fM15333e = C13803e.m15333e(c13257c.f41873Y.mo14854i());
                    float fM15331c = C13803e.m15331c(c13257c.f41873Y.mo14854i());
                    boolean z6 = (c13801cM21565f.f43587b - fM15331c) - ((float) iMo7866k3) < 0.0f;
                    if (z6) {
                        fM15331c = 0.0f;
                    }
                    float f15 = iMo7866k2;
                    long jM8536b = (fM15333e / f12) + f13 > f15 ? AbstractC8088f6.m8536b(fM15333e - (f15 - f13), fM15331c) : AbstractC8088f6.m8536b(f13 - Math.max(f11 - ((C13803e.m15333e(c13257c.f41873Y.mo14854i()) / f12) - (f14 / f12)), 0.0f), fM15331c);
                    Path path = c14353iM15631i.f45039a;
                    if (z6) {
                        c14353iM15631i.m15731c(C13800b.m15306g(jM8536b), C13800b.m15307h(jM8536b));
                        float f16 = iMo7866k1 / 2;
                        c14353iM15631i.m15730b(C13800b.m15306g(jM8536b) + f16, C13800b.m15307h(jM8536b));
                        c14353iM15631i.m15730b(C13800b.m15306g(jM8536b), C13800b.m15307h(jM8536b) - iMo7866k0);
                        c14353iM15631i.m15730b(C13800b.m15306g(jM8536b) - f16, C13800b.m15307h(jM8536b));
                        path.close();
                    } else {
                        c14353iM15631i.m15731c(C13800b.m15306g(jM8536b), C13800b.m15307h(jM8536b));
                        float f17 = iMo7866k1 / 2;
                        c14353iM15631i.m15730b(C13800b.m15306g(jM8536b) + f17, C13800b.m15307h(jM8536b));
                        c14353iM15631i.m15730b(C13800b.m15306g(jM8536b), C13800b.m15307h(jM8536b) + iMo7866k0);
                        c14353iM15631i.m15730b(C13800b.m15306g(jM8536b) - f17, C13800b.m15307h(jM8536b));
                        path.close();
                    }
                }
                return c13257c.m14856a(new C3353c0(interfaceC21098s, c14353iM15631i, this.f12370Z, 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3968Q(InterfaceC10459q interfaceC10459q, long j10, long j11, C8410b c8410b) {
        super(2);
        this.f12372p0 = interfaceC10459q;
        this.f12370Z = j10;
        this.f12371o0 = j11;
        this.f12373q0 = c8410b;
    }
}
