package p911o0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p492U1.C7536a;
import p635a1.C10450h;
import p909nm.C17690x;

/* JADX INFO: renamed from: o0.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17781r0 implements InterfaceC21057K, InterfaceC17773n0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17760h f56757a;

    /* JADX INFO: renamed from: b */
    public final C10450h f56758b;

    public C17781r0(InterfaceC17760h interfaceC17760h, C10450h c10450h) {
        this.f56757a = interfaceC17760h;
        this.f56758b = c10450h;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: a */
    public final int mo1119a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int iMo7866k0 = interfaceC21095p.mo7866k0(this.f56757a.mo455a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo7866k0, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC21056J interfaceC21056J = (InterfaceC21056J) list.get(i11);
            float fM19487i = AbstractC17758g.m19487i(AbstractC17758g.m19485g(interfaceC21056J));
            if (fM19487i == 0.0f) {
                int iMin2 = Math.min(interfaceC21056J.mo21532o(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC21056J.mo21530b(iMin2));
            } else if (fM19487i > 0.0f) {
                f10 += fM19487i;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            InterfaceC21056J interfaceC21056J2 = (InterfaceC21056J) list.get(i12);
            float fM19487i2 = AbstractC17758g.m19487i(AbstractC17758g.m19485g(interfaceC21056J2));
            if (fM19487i2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC21056J2.mo21530b(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM19487i2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: b */
    public final int mo1120b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int iMo7866k0 = interfaceC21095p.mo7866k0(this.f56757a.mo455a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo7866k0, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC21056J interfaceC21056J = (InterfaceC21056J) list.get(i11);
            float fM19487i = AbstractC17758g.m19487i(AbstractC17758g.m19485g(interfaceC21056J));
            if (fM19487i == 0.0f) {
                int iMin2 = Math.min(interfaceC21056J.mo21532o(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC21056J.mo21529G(iMin2));
            } else if (fM19487i > 0.0f) {
                f10 += fM19487i;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            InterfaceC21056J interfaceC21056J2 = (InterfaceC21056J) list.get(i12);
            float fM19487i2 = AbstractC17758g.m19487i(AbstractC17758g.m19485g(interfaceC21056J2));
            if (fM19487i2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC21056J2.mo21529G(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM19487i2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo1121c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        return AbstractC17758g.m19489k(this, C7536a.m7856k(j10), C7536a.m7855j(j10), C7536a.m7854i(j10), C7536a.m7853h(j10), interfaceC21059M.mo7866k0(this.f56757a.mo455a()), interfaceC21059M, list, new AbstractC21069X[list.size()], 0, list.size(), null, 0);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: d */
    public final int mo1122d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int iMo7866k0 = interfaceC21095p.mo7866k0(this.f56757a.mo455a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC21056J interfaceC21056J = (InterfaceC21056J) list.get(i12);
            float fM19487i = AbstractC17758g.m19487i(AbstractC17758g.m19485g(interfaceC21056J));
            int iMo21532o = interfaceC21056J.mo21532o(i10);
            if (fM19487i == 0.0f) {
                i11 += iMo21532o;
            } else if (fM19487i > 0.0f) {
                f10 += fM19487i;
                iMax = Math.max(iMax, Math.round(iMo21532o / fM19487i));
            }
        }
        return ((list.size() - 1) * iMo7866k0) + Math.round(iMax * f10) + i11;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: e */
    public final int mo1123e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int iMo7866k0 = interfaceC21095p.mo7866k0(this.f56757a.mo455a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC21056J interfaceC21056J = (InterfaceC21056J) list.get(i12);
            float fM19487i = AbstractC17758g.m19487i(AbstractC17758g.m19485g(interfaceC21056J));
            int iMo21531l = interfaceC21056J.mo21531l(i10);
            if (fM19487i == 0.0f) {
                i11 += iMo21531l;
            } else if (fM19487i > 0.0f) {
                f10 += fM19487i;
                iMax = Math.max(iMax, Math.round(iMo21531l / fM19487i));
            }
        }
        return ((list.size() - 1) * iMo7866k0) + Math.round(iMax * f10) + i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17781r0)) {
            return false;
        }
        C17781r0 c17781r0 = (C17781r0) obj;
        return AbstractC16544l.m18089b(this.f56757a, c17781r0.f56757a) && AbstractC16544l.m18089b(this.f56758b, c17781r0.f56758b);
    }

    @Override // p911o0.InterfaceC17773n0
    /* JADX INFO: renamed from: f */
    public final long mo19465f(int i10, int i11, int i12, boolean z6) {
        return AbstractC17777p0.m19505a(i10, i11, i12, z6);
    }

    @Override // p911o0.InterfaceC17773n0
    /* JADX INFO: renamed from: g */
    public final int mo19466g(AbstractC21069X abstractC21069X) {
        return abstractC21069X.f66981Y;
    }

    @Override // p911o0.InterfaceC17773n0
    /* JADX INFO: renamed from: h */
    public final int mo19467h(AbstractC21069X abstractC21069X) {
        return abstractC21069X.f66982Z;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f56758b.f30951a) + (this.f56757a.hashCode() * 31);
    }

    @Override // p911o0.InterfaceC17773n0
    /* JADX INFO: renamed from: i */
    public final void mo19468i(int i10, InterfaceC21059M interfaceC21059M, int[] iArr, int[] iArr2) {
        this.f56757a.mo457c(interfaceC21059M, i10, iArr, interfaceC21059M.getLayoutDirection(), iArr2);
    }

    @Override // p911o0.InterfaceC17773n0
    /* JADX INFO: renamed from: j */
    public final InterfaceC21058L mo19469j(AbstractC21069X[] abstractC21069XArr, InterfaceC21059M interfaceC21059M, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return interfaceC21059M.mo19936R(i11, i12, C17690x.f56481Y, new C17779q0(abstractC21069XArr, this, i12, i10, iArr));
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f56757a + ", verticalAlignment=" + this.f56758b + ')';
    }
}
