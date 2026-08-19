package p229J0;

import androidx.compose.material3.AbstractC10859d;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.InterfaceC21718w;
import p193Hf.C3363f1;
import p302M0.AbstractC5239F;
import p492U1.C7536a;
import p571X9.AbstractC9388w4;
import p571X9.AbstractC9406z4;
import p635a1.AbstractC10458p;
import p758g0.C13756d;
import p894n0.InterfaceC17406l;
import p909nm.C17690x;

/* JADX INFO: renamed from: J0.v4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4148v4 extends AbstractC10458p implements InterfaceC21718w {

    /* JADX INFO: renamed from: A0 */
    public boolean f13434A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f13435B0;

    /* JADX INFO: renamed from: C0 */
    public C13756d f13436C0;

    /* JADX INFO: renamed from: D0 */
    public C13756d f13437D0;

    /* JADX INFO: renamed from: E0 */
    public float f13438E0;

    /* JADX INFO: renamed from: F0 */
    public float f13439F0;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC17406l f13440z0;

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        AbstractC0575H.m1156D(m10935y0(), null, null, new C4142u4(this, null), 3);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21238i(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        float f10;
        boolean z6 = false;
        boolean z10 = (interfaceC21056J.mo21530b(C7536a.m7854i(j10)) == 0 || interfaceC21056J.mo21532o(C7536a.m7853h(j10)) == 0) ? false : true;
        if (this.f13435B0) {
            f10 = AbstractC5239F.f17010a;
        } else {
            f10 = (z10 || this.f13434A0) ? AbstractC10859d.f32660a : AbstractC10859d.f32661b;
        }
        float fMo7864b0 = interfaceC21059M.mo7864b0(f10);
        C13756d c13756d = this.f13437D0;
        int iFloatValue = (int) (c13756d != null ? ((Number) c13756d.m15224e()).floatValue() : fMo7864b0);
        if (iFloatValue >= 0 && iFloatValue >= 0) {
            z6 = true;
        }
        if (!z6) {
            AbstractC9406z4.m9983b("width(" + iFloatValue + ") and height(" + iFloatValue + ") must be >= 0");
            throw null;
        }
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(AbstractC9388w4.m9966i(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fMo7864b1 = interfaceC21059M.mo7864b0((AbstractC10859d.f32663d - interfaceC21059M.mo7862P(fMo7864b0)) / 2.0f);
        float fMo7864b2 = interfaceC21059M.mo7864b0((AbstractC10859d.f32662c - AbstractC10859d.f32660a) - AbstractC10859d.f32664e);
        boolean z11 = this.f13435B0;
        if (z11 && this.f13434A0) {
            fMo7864b1 = fMo7864b2 - interfaceC21059M.mo7864b0(AbstractC5239F.f17014e);
        } else if (z11 && !this.f13434A0) {
            fMo7864b1 = interfaceC21059M.mo7864b0(AbstractC5239F.f17014e);
        } else if (this.f13434A0) {
            fMo7864b1 = fMo7864b2;
        }
        C13756d c13756d2 = this.f13437D0;
        if (!AbstractC16544l.m18088a(c13756d2 != null ? (Float) c13756d2.f43413e.getValue() : null, fMo7864b0)) {
            AbstractC0575H.m1156D(m10935y0(), null, null, new C4130s4(this, fMo7864b0, null), 3);
        }
        C13756d c13756d3 = this.f13436C0;
        if (!AbstractC16544l.m18088a(c13756d3 != null ? (Float) c13756d3.f43413e.getValue() : null, fMo7864b1)) {
            AbstractC0575H.m1156D(m10935y0(), null, null, new C4136t4(this, fMo7864b1, null), 3);
        }
        if (Float.isNaN(this.f13439F0) && Float.isNaN(this.f13438E0)) {
            this.f13439F0 = fMo7864b0;
            this.f13438E0 = fMo7864b1;
        }
        return interfaceC21059M.mo19936R(iFloatValue, iFloatValue, C17690x.f56481Y, new C3363f1(abstractC21069XMo21533p, this, fMo7864b1, 1));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21234e(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21242m(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return AbstractC20734X.m21246q(this, abstractC21668N, interfaceC21056J, i10);
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: z0 */
    public final boolean mo4774z0() {
        return false;
    }
}
