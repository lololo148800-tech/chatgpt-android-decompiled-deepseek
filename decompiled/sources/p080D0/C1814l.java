package p080D0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p002A0.C0146w;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p692d0.AbstractC12975n;
import p692d0.C12984w;
import p692d0.C12985x;

/* JADX INFO: renamed from: D0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1814l implements InterfaceC1784S {

    /* JADX INFO: renamed from: a */
    public final C12984w f5221a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5222b;

    /* JADX INFO: renamed from: c */
    public final int f5223c;

    /* JADX INFO: renamed from: d */
    public final int f5224d;

    /* JADX INFO: renamed from: e */
    public final boolean f5225e;

    /* JADX INFO: renamed from: f */
    public final C1824q f5226f;

    public C1814l(C12984w c12984w, ArrayList arrayList, int i10, int i11, boolean z6, C1824q c1824q) {
        this.f5221a = c12984w;
        this.f5222b = arrayList;
        this.f5223c = i10;
        this.f5224d = i11;
        this.f5225e = z6;
        this.f5226f = c1824q;
        if (arrayList.size() > 1) {
            return;
        }
        throw new IllegalStateException(("MultiSelectionLayout requires an infoList size greater than 1, was " + arrayList.size() + '.').toString());
    }

    /* JADX INFO: renamed from: n */
    public static void m2639n(C12985x c12985x, C1824q c1824q, C1820o c1820o, int i10, int i11) {
        C1824q c1824q2;
        if (c1824q.f5259c) {
            c1824q2 = new C1824q(c1820o.m2646a(i11), c1820o.m2646a(i10), i11 > i10);
        } else {
            c1824q2 = new C1824q(c1820o.m2646a(i10), c1820o.m2646a(i11), i10 > i11);
        }
        if (i10 > i11) {
            throw new IllegalStateException(("minOffset should be less than or equal to maxOffset: " + c1824q2).toString());
        }
        long j10 = c1820o.f5235a;
        int iM14710c = c12985x.m14710c(j10);
        Object[] objArr = c12985x.f41223c;
        Object obj = objArr[iM14710c];
        c12985x.f41222b[iM14710c] = j10;
        objArr[iM14710c] = c1824q2;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: a */
    public final boolean mo2573a() {
        return this.f5225e;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: b */
    public final int mo2574b() {
        return this.f5222b.size();
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: c */
    public final C1820o mo2575c() {
        return this.f5225e ? mo2584l() : mo2581i();
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: d */
    public final C1824q mo2576d() {
        return this.f5226f;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: e */
    public final C1820o mo2577e() {
        return mo2582j() == 1 ? mo2581i() : mo2584l();
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: f */
    public final boolean mo2578f(InterfaceC1784S interfaceC1784S) {
        if (this.f5226f != null && interfaceC1784S != null && (interfaceC1784S instanceof C1814l)) {
            C1814l c1814l = (C1814l) interfaceC1784S;
            if (this.f5225e == c1814l.f5225e && this.f5223c == c1814l.f5223c && this.f5224d == c1814l.f5224d) {
                ArrayList arrayList = this.f5222b;
                int size = arrayList.size();
                ArrayList arrayList2 = c1814l.f5222b;
                if (size == arrayList2.size()) {
                    int size2 = arrayList.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        C1820o c1820o = (C1820o) arrayList.get(i10);
                        C1820o c1820o2 = (C1820o) arrayList2.get(i10);
                        c1820o.getClass();
                        if (c1820o.f5235a == c1820o2.f5235a && c1820o.f5237c == c1820o2.f5237c && c1820o.f5238d == c1820o2.f5238d) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: g */
    public final void mo2579g(InterfaceC1436k interfaceC1436k) {
        int iM2640o = m2640o(mo2577e().f5235a);
        int iM2640o2 = m2640o((mo2582j() == 1 ? mo2584l() : mo2581i()).f5235a);
        int i10 = iM2640o + 1;
        if (i10 >= iM2640o2) {
            return;
        }
        while (i10 < iM2640o2) {
            interfaceC1436k.invoke(this.f5222b.get(i10));
            i10++;
        }
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: h */
    public final int mo2580h() {
        return this.f5224d;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: i */
    public final C1820o mo2581i() {
        return (C1820o) this.f5222b.get(m2641p(this.f5224d, false));
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: j */
    public final int mo2582j() {
        int i10 = this.f5223c;
        int i11 = this.f5224d;
        if (i10 < i11) {
            return 2;
        }
        if (i10 > i11) {
            return 1;
        }
        return ((C1820o) this.f5222b.get(i10 / 2)).m2647b();
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: k */
    public final C12985x mo2583k(C1824q c1824q) {
        C1822p c1822p = c1824q.f5257a;
        long j10 = c1822p.f5255c;
        C1822p c1822p2 = c1824q.f5258b;
        long j11 = c1822p2.f5255c;
        boolean z6 = c1824q.f5259c;
        if (j10 != j11) {
            C12985x c12985x = AbstractC12975n.f41185a;
            C12985x c12985x2 = new C12985x();
            C1822p c1822p3 = c1824q.f5257a;
            m2639n(c12985x2, c1824q, mo2577e(), (z6 ? c1822p2 : c1822p3).f5254b, mo2577e().f5240f.f10892a.f10882a.f10934Y.length());
            mo2579g(new C0146w(this, c12985x2, c1824q, 9));
            if (z6) {
                c1822p2 = c1822p3;
            }
            m2639n(c12985x2, c1824q, mo2582j() == 1 ? mo2584l() : mo2581i(), 0, c1822p2.f5254b);
            return c12985x2;
        }
        int i10 = c1822p.f5254b;
        int i11 = c1822p2.f5254b;
        if ((!z6 || i10 < i11) && (z6 || i10 > i11)) {
            throw new IllegalStateException(("unexpectedly miss-crossed selection: " + c1824q).toString());
        }
        C12985x c12985x3 = AbstractC12975n.f41185a;
        C12985x c12985x4 = new C12985x();
        int iM14710c = c12985x4.m14710c(j10);
        c12985x4.f41222b[iM14710c] = j10;
        c12985x4.f41223c[iM14710c] = c1824q;
        return c12985x4;
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: l */
    public final C1820o mo2584l() {
        return (C1820o) this.f5222b.get(m2641p(this.f5223c, true));
    }

    @Override // p080D0.InterfaceC1784S
    /* JADX INFO: renamed from: m */
    public final int mo2585m() {
        return this.f5223c;
    }

    /* JADX INFO: renamed from: o */
    public final int m2640o(long j10) {
        try {
            return this.f5221a.m14705b(j10);
        } catch (NoSuchElementException e10) {
            throw new IllegalStateException(AbstractC10763a.m11049g(j10, "Invalid selectableId: "), e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final int m2641p(int i10, boolean z6) {
        int iM24h = AbstractC0010F.m24h(mo2582j());
        boolean z10 = z6;
        if (iM24h == 0) {
            z10 = !z6 ? 1 : 0;
        } else if (iM24h != 1) {
            if (iM24h != 2) {
                throw new C0644w();
            }
        }
        return (i10 - (!z10)) / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb2.append(this.f5225e);
        sb2.append(", startPosition=");
        boolean z6 = true;
        float f10 = 2;
        sb2.append((this.f5223c + 1) / f10);
        sb2.append(", endPosition=");
        sb2.append((this.f5224d + 1) / f10);
        sb2.append(", crossed=");
        sb2.append(AbstractC0168G.m511F(mo2582j()));
        sb2.append(", infos=");
        StringBuilder sb3 = new StringBuilder("[\n\t");
        ArrayList arrayList = this.f5222b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            C1820o c1820o = (C1820o) arrayList.get(i10);
            if (z6) {
                z6 = false;
            } else {
                sb3.append(",\n\t");
            }
            StringBuilder sb4 = new StringBuilder();
            i10++;
            sb4.append(i10);
            sb4.append(" -> ");
            sb4.append(c1820o);
            sb3.append(sb4.toString());
        }
        sb3.append("\n]");
        String string = sb3.toString();
        AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
        sb2.append(string);
        sb2.append(')');
        return sb2.toString();
    }
}
