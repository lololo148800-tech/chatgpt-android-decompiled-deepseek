package p911o0;

import com.google.protobuf.AbstractC12107L1;
import p001A.AbstractC0010F;
import p025An.C0644w;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p492U1.C7536a;
import p692d0.C12970i;

/* JADX INFO: renamed from: o0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C17734N {

    /* JADX INFO: renamed from: a */
    public final int f56619a;

    /* JADX INFO: renamed from: b */
    public final int f56620b;

    /* JADX INFO: renamed from: c */
    public final int f56621c;

    /* JADX INFO: renamed from: d */
    public InterfaceC21056J f56622d;

    /* JADX INFO: renamed from: e */
    public AbstractC21069X f56623e;

    /* JADX INFO: renamed from: f */
    public InterfaceC21056J f56624f;

    /* JADX INFO: renamed from: g */
    public AbstractC21069X f56625g;

    /* JADX INFO: renamed from: h */
    public C12970i f56626h;

    /* JADX INFO: renamed from: i */
    public C12970i f56627i;

    public C17734N(int i10, int i11, int i12) {
        this.f56619a = i10;
        this.f56620b = i11;
        this.f56621c = i12;
    }

    /* JADX INFO: renamed from: a */
    public final C12970i m19463a(int i10, int i11, boolean z6) {
        int iM24h = AbstractC0010F.m24h(this.f56619a);
        if (iM24h == 0 || iM24h == 1) {
            return null;
        }
        if (iM24h == 2) {
            if (z6) {
                return this.f56626h;
            }
            return null;
        }
        if (iM24h != 3) {
            throw new C0644w();
        }
        if (z6) {
            return this.f56626h;
        }
        if (i10 + 1 < this.f56620b || i11 < this.f56621c) {
            return null;
        }
        return this.f56627i;
    }

    /* JADX INFO: renamed from: b */
    public final void m19464b(InterfaceC21056J interfaceC21056J, InterfaceC21056J interfaceC21056J2, long j10) {
        long jM19483e = AbstractC17758g.m19483e(1, j10);
        if (interfaceC21056J != null) {
            int iM7853h = C7536a.m7853h(jM19483e);
            C17719C c17719c = AbstractC17731K.f56610a;
            int iMo21531l = interfaceC21056J.mo21531l(iM7853h);
            this.f56626h = new C12970i(C12970i.m14660a(iMo21531l, interfaceC21056J.mo21529G(iMo21531l)));
            this.f56622d = interfaceC21056J instanceof InterfaceC21056J ? interfaceC21056J : null;
            this.f56623e = null;
        }
        if (interfaceC21056J2 != null) {
            int iM7853h2 = C7536a.m7853h(jM19483e);
            C17719C c17719c2 = AbstractC17731K.f56610a;
            int iMo21531l2 = interfaceC21056J2.mo21531l(iM7853h2);
            this.f56627i = new C12970i(C12970i.m14660a(iMo21531l2, interfaceC21056J2.mo21529G(iMo21531l2)));
            this.f56624f = interfaceC21056J2 instanceof InterfaceC21056J ? interfaceC21056J2 : null;
            this.f56625g = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17734N)) {
            return false;
        }
        C17734N c17734n = (C17734N) obj;
        return this.f56619a == c17734n.f56619a && this.f56620b == c17734n.f56620b && this.f56621c == c17734n.f56621c;
    }

    public final int hashCode() {
        return (((AbstractC0010F.m24h(this.f56619a) * 31) + this.f56620b) * 31) + this.f56621c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("FlowLayoutOverflowState(type=");
        int i10 = this.f56619a;
        if (i10 == 1) {
            str = "Visible";
        } else if (i10 == 2) {
            str = "Clip";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "ExpandOrCollapseIndicator";
        } else {
            str = "ExpandIndicator";
        }
        sb2.append(str);
        sb2.append(", minLinesToShowCollapse=");
        sb2.append(this.f56620b);
        sb2.append(", minCrossAxisSizeToShowCollapse=");
        return AbstractC12107L1.m13826q(sb2, this.f56621c, ')');
    }
}
