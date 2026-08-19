package p936p0;

import androidx.compose.foundation.lazy.layout.C10846a;
import java.util.List;
import p025An.AbstractC0575H;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p492U1.C7543h;
import p492U1.EnumC7546k;
import p571X9.AbstractC9101A4;
import p635a1.C10450h;
import p635a1.InterfaceC10445c;
import p843k1.C16308b;
import p953q0.C18546D;
import p953q0.C18605z;
import p953q0.InterfaceC18559Q;

/* JADX INFO: renamed from: p0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C18273m implements InterfaceC18559Q {

    /* JADX INFO: renamed from: a */
    public final int f58304a;

    /* JADX INFO: renamed from: b */
    public final List f58305b;

    /* JADX INFO: renamed from: c */
    public final boolean f58306c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC10445c f58307d;

    /* JADX INFO: renamed from: e */
    public final C10450h f58308e;

    /* JADX INFO: renamed from: f */
    public final EnumC7546k f58309f;

    /* JADX INFO: renamed from: g */
    public final boolean f58310g;

    /* JADX INFO: renamed from: h */
    public final int f58311h;

    /* JADX INFO: renamed from: i */
    public final int f58312i;

    /* JADX INFO: renamed from: j */
    public final int f58313j;

    /* JADX INFO: renamed from: k */
    public final long f58314k;

    /* JADX INFO: renamed from: l */
    public final Object f58315l;

    /* JADX INFO: renamed from: m */
    public final Object f58316m;

    /* JADX INFO: renamed from: n */
    public final C10846a f58317n;

    /* JADX INFO: renamed from: o */
    public final long f58318o;

    /* JADX INFO: renamed from: p */
    public int f58319p;

    /* JADX INFO: renamed from: q */
    public final int f58320q;

    /* JADX INFO: renamed from: r */
    public final int f58321r;

    /* JADX INFO: renamed from: s */
    public final int f58322s;

    /* JADX INFO: renamed from: t */
    public boolean f58323t;

    /* JADX INFO: renamed from: u */
    public int f58324u = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: v */
    public int f58325v;

    /* JADX INFO: renamed from: w */
    public int f58326w;

    /* JADX INFO: renamed from: x */
    public final int[] f58327x;

    public C18273m(int i10, List list, boolean z6, InterfaceC10445c interfaceC10445c, C10450h c10450h, EnumC7546k enumC7546k, boolean z10, int i11, int i12, int i13, long j10, Object obj, Object obj2, C10846a c10846a, long j11) {
        this.f58304a = i10;
        this.f58305b = list;
        this.f58306c = z6;
        this.f58307d = interfaceC10445c;
        this.f58308e = c10450h;
        this.f58309f = enumC7546k;
        this.f58310g = z10;
        this.f58311h = i11;
        this.f58312i = i12;
        this.f58313j = i13;
        this.f58314k = j10;
        this.f58315l = obj;
        this.f58316m = obj2;
        this.f58317n = c10846a;
        this.f58318o = j11;
        int size = list.size();
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            AbstractC21069X abstractC21069X = (AbstractC21069X) list.get(i15);
            boolean z11 = this.f58306c;
            i14 += z11 ? abstractC21069X.f66982Z : abstractC21069X.f66981Y;
            iMax = Math.max(iMax, !z11 ? abstractC21069X.f66982Z : abstractC21069X.f66981Y);
        }
        this.f58320q = i14;
        int i16 = i14 + this.f58313j;
        this.f58321r = i16 >= 0 ? i16 : 0;
        this.f58322s = iMax;
        this.f58327x = new int[this.f58305b.size() * 2];
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: a */
    public final int mo19809a() {
        return this.f58305b.size();
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: b */
    public final int mo19810b() {
        return this.f58321r;
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: c */
    public final Object mo19811c(int i10) {
        return ((AbstractC21069X) this.f58305b.get(i10)).mo21534t();
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: d */
    public final long mo19812d() {
        return this.f58318o;
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: e */
    public final int mo19813e() {
        return 1;
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: f */
    public final boolean mo19814f() {
        return this.f58306c;
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: g */
    public final void mo19815g() {
        this.f58323t = true;
    }

    @Override // p953q0.InterfaceC18559Q
    public final int getIndex() {
        return this.f58304a;
    }

    @Override // p953q0.InterfaceC18559Q
    public final Object getKey() {
        return this.f58315l;
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: h */
    public final long mo19816h(int i10) {
        int i11 = i10 * 2;
        int[] iArr = this.f58327x;
        return AbstractC9101A4.m9631a(iArr[i11], iArr[i11 + 1]);
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: i */
    public final int mo19817i() {
        return 0;
    }

    @Override // p953q0.InterfaceC18559Q
    /* JADX INFO: renamed from: j */
    public final void mo19818j(int i10, int i11, int i12, int i13) {
        m19821m(i10, i12, i13);
    }

    /* JADX INFO: renamed from: k */
    public final int m19819k(long j10) {
        return (int) (this.f58306c ? j10 & 4294967295L : j10 >> 32);
    }

    /* JADX INFO: renamed from: l */
    public final void m19820l(AbstractC21068W abstractC21068W, boolean z6) {
        int i10;
        int i11;
        if (this.f58324u == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List list = this.f58305b;
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            AbstractC21069X abstractC21069X = (AbstractC21069X) list.get(i12);
            int i13 = this.f58325v;
            boolean z10 = this.f58306c;
            int i14 = i13 - (z10 ? abstractC21069X.f66982Z : abstractC21069X.f66981Y);
            int i15 = this.f58326w;
            long jMo19816h = mo19816h(i12);
            C18546D c18546dM11264a = this.f58317n.m11264a(i12, this.f58315l);
            C16308b c16308b = null;
            if (c18546dM11264a != null) {
                if (z6) {
                    c18546dM11264a.f59098r = jMo19816h;
                } else {
                    if (!C7543h.m7880b(c18546dM11264a.f59098r, C18546D.f59079s)) {
                        jMo19816h = c18546dM11264a.f59098r;
                    }
                    long jM7882d = C7543h.m7882d(jMo19816h, ((C7543h) c18546dM11264a.f59097q.getValue()).f23897a);
                    if (((m19819k(jMo19816h) <= i14 && m19819k(jM7882d) <= i14) || (m19819k(jMo19816h) >= i15 && m19819k(jM7882d) >= i15)) && ((Boolean) c18546dM11264a.f59088h.getValue()).booleanValue()) {
                        AbstractC0575H.m1156D(c18546dM11264a.f59081a, null, null, new C18605z(c18546dM11264a, null), 3);
                    }
                    jMo19816h = jM7882d;
                }
                c16308b = c18546dM11264a.f59094n;
            } else {
                list = list;
                size = size;
            }
            if (this.f58310g) {
                if (z10) {
                    i10 = (int) (jMo19816h >> 32);
                } else {
                    i10 = (this.f58324u - ((int) (jMo19816h >> 32))) - (z10 ? abstractC21069X.f66982Z : abstractC21069X.f66981Y);
                }
                if (z10) {
                    i11 = (this.f58324u - ((int) (jMo19816h & 4294967295L))) - (z10 ? abstractC21069X.f66982Z : abstractC21069X.f66981Y);
                } else {
                    i11 = (int) (jMo19816h & 4294967295L);
                }
                jMo19816h = AbstractC9101A4.m9631a(i10, i11);
            }
            long jM7882d2 = C7543h.m7882d(jMo19816h, this.f58314k);
            if (!z6 && c18546dM11264a != null) {
                c18546dM11264a.f59093m = jM7882d2;
            }
            if (z10) {
                if (c16308b != null) {
                    abstractC21068W.getClass();
                    AbstractC21068W.m21535a(abstractC21068W, abstractC21069X);
                    abstractC21069X.mo21552Q(C7543h.m7882d(jM7882d2, abstractC21069X.f66985q0), 0.0f, c16308b);
                } else {
                    AbstractC21068W.m21544n(abstractC21068W, abstractC21069X, jM7882d2);
                }
            } else if (c16308b != null) {
                AbstractC21068W.m21542l(abstractC21068W, abstractC21069X, jM7882d2, c16308b);
            } else {
                AbstractC21068W.m21541k(abstractC21068W, abstractC21069X, jM7882d2);
            }
            i12++;
            list = list;
            size = size;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m19821m(int i10, int i11, int i12) {
        int i13;
        this.f58319p = i10;
        boolean z6 = this.f58306c;
        this.f58324u = z6 ? i12 : i11;
        List list = this.f58305b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            AbstractC21069X abstractC21069X = (AbstractC21069X) list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f58327x;
            if (z6) {
                InterfaceC10445c interfaceC10445c = this.f58307d;
                if (interfaceC10445c == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
                iArr[i15] = interfaceC10445c.mo10924a(abstractC21069X.f66981Y, i11, this.f58309f);
                iArr[i15 + 1] = i10;
                i13 = abstractC21069X.f66982Z;
            } else {
                iArr[i15] = i10;
                int i16 = i15 + 1;
                C10450h c10450h = this.f58308e;
                if (c10450h == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
                iArr[i16] = c10450h.m10926a(abstractC21069X.f66982Z, i12);
                i13 = abstractC21069X.f66981Y;
            }
            i10 += i13;
        }
        this.f58325v = -this.f58311h;
        this.f58326w = this.f58324u + this.f58312i;
    }
}
