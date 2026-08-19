package p911o0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p229J0.C4063h3;
import p492U1.C7536a;
import p635a1.InterfaceC10445c;
import p909nm.C17690x;

/* JADX INFO: renamed from: o0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C17790w implements InterfaceC21057K, InterfaceC17773n0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17766k f56771a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10445c f56772b;

    public C17790w(InterfaceC17766k interfaceC17766k, InterfaceC10445c interfaceC10445c) {
        this.f56771a = interfaceC17766k;
        this.f56772b = interfaceC10445c;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: a */
    public final int mo1119a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int iMo7866k0 = interfaceC21095p.mo7866k0(this.f56771a.mo455a());
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
            int iMo21530b = interfaceC21056J.mo21530b(i10);
            if (fM19487i == 0.0f) {
                i11 += iMo21530b;
            } else if (fM19487i > 0.0f) {
                f10 += fM19487i;
                iMax = Math.max(iMax, Math.round(iMo21530b / fM19487i));
            }
        }
        return ((list.size() - 1) * iMo7866k0) + Math.round(iMax * f10) + i11;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: b */
    public final int mo1120b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int iMo7866k0 = interfaceC21095p.mo7866k0(this.f56771a.mo455a());
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
            int iMo21529G = interfaceC21056J.mo21529G(i10);
            if (fM19487i == 0.0f) {
                i11 += iMo21529G;
            } else if (fM19487i > 0.0f) {
                f10 += fM19487i;
                iMax = Math.max(iMax, Math.round(iMo21529G / fM19487i));
            }
        }
        return ((list.size() - 1) * iMo7866k0) + Math.round(iMax * f10) + i11;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo1121c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        return AbstractC17758g.m19489k(this, C7536a.m7855j(j10), C7536a.m7856k(j10), C7536a.m7853h(j10), C7536a.m7854i(j10), interfaceC21059M.mo7866k0(this.f56771a.mo455a()), interfaceC21059M, list, new AbstractC21069X[list.size()], 0, list.size(), null, 0);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: d */
    public final int mo1122d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int iMo7866k0 = interfaceC21095p.mo7866k0(this.f56771a.mo455a());
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
                int iMin2 = Math.min(interfaceC21056J.mo21530b(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC21056J.mo21532o(iMin2));
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
                iMax = Math.max(iMax, interfaceC21056J2.mo21532o(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM19487i2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: e */
    public final int mo1123e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        int iMo7866k0 = interfaceC21095p.mo7866k0(this.f56771a.mo455a());
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
                int iMin2 = Math.min(interfaceC21056J.mo21530b(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC21056J.mo21531l(iMin2));
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
                iMax = Math.max(iMax, interfaceC21056J2.mo21531l(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM19487i2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17790w)) {
            return false;
        }
        C17790w c17790w = (C17790w) obj;
        return AbstractC16544l.m18089b(this.f56771a, c17790w.f56771a) && AbstractC16544l.m18089b(this.f56772b, c17790w.f56772b);
    }

    @Override // p911o0.InterfaceC17773n0
    /* JADX INFO: renamed from: f */
    public final long mo19465f(int i10, int i11, int i12, boolean z6) {
        return AbstractC17788v.m19516b(i10, i11, i12, z6);
    }

    @Override // p911o0.InterfaceC17773n0
    /* JADX INFO: renamed from: g */
    public final int mo19466g(AbstractC21069X abstractC21069X) {
        return abstractC21069X.f66982Z;
    }

    @Override // p911o0.InterfaceC17773n0
    /* JADX INFO: renamed from: h */
    public final int mo19467h(AbstractC21069X abstractC21069X) {
        return abstractC21069X.f66981Y;
    }

    public final int hashCode() {
        return this.f56772b.hashCode() + (this.f56771a.hashCode() * 31);
    }

    @Override // p911o0.InterfaceC17773n0
    /* JADX INFO: renamed from: i */
    public final void mo19468i(int i10, InterfaceC21059M interfaceC21059M, int[] iArr, int[] iArr2) {
        this.f56771a.mo456b(i10, interfaceC21059M, iArr, iArr2);
    }

    @Override // p911o0.InterfaceC17773n0
    /* JADX INFO: renamed from: j */
    public final InterfaceC21058L mo19469j(AbstractC21069X[] abstractC21069XArr, InterfaceC21059M interfaceC21059M, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return interfaceC21059M.mo19936R(i12, i11, C17690x.f56481Y, new C4063h3(abstractC21069XArr, this, i12, i10, interfaceC21059M, iArr));
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f56771a + ", horizontalAlignment=" + this.f56772b + ')';
    }
}
