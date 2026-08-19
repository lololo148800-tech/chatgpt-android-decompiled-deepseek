package p349O0;

import com.google.protobuf.AbstractC12107L1;
import java.util.ArrayList;

/* JADX INFO: renamed from: O0.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5941A0 {

    /* JADX INFO: renamed from: a */
    public final C5943B0 f19326a;

    /* JADX INFO: renamed from: b */
    public final int[] f19327b;

    /* JADX INFO: renamed from: c */
    public final int f19328c;

    /* JADX INFO: renamed from: d */
    public final Object[] f19329d;

    /* JADX INFO: renamed from: e */
    public final int f19330e;

    /* JADX INFO: renamed from: f */
    public boolean f19331f;

    /* JADX INFO: renamed from: g */
    public int f19332g;

    /* JADX INFO: renamed from: h */
    public int f19333h;

    /* JADX INFO: renamed from: i */
    public int f19334i;

    /* JADX INFO: renamed from: j */
    public final C5960K f19335j;

    /* JADX INFO: renamed from: k */
    public int f19336k;

    /* JADX INFO: renamed from: l */
    public int f19337l;

    /* JADX INFO: renamed from: m */
    public int f19338m;

    /* JADX INFO: renamed from: n */
    public boolean f19339n;

    public C5941A0(C5943B0 c5943b0) {
        this.f19326a = c5943b0;
        this.f19327b = c5943b0.f19346Y;
        int i10 = c5943b0.f19347Z;
        this.f19328c = i10;
        this.f19329d = c5943b0.f19348o0;
        this.f19330e = c5943b0.f19349p0;
        this.f19333h = i10;
        this.f19334i = -1;
        this.f19335j = new C5960K();
    }

    /* JADX INFO: renamed from: a */
    public final C5995c m6323a(int i10) {
        ArrayList arrayList = this.f19326a.f19353t0;
        int iM6438Y = C5997d.m6438Y(arrayList, i10, this.f19328c);
        if (iM6438Y >= 0) {
            return (C5995c) arrayList.get(iM6438Y);
        }
        C5995c c5995c = new C5995c(i10);
        arrayList.add(-(iM6438Y + 1), c5995c);
        return c5995c;
    }

    /* JADX INFO: renamed from: b */
    public final Object m6324b(int[] iArr, int i10) {
        int iM6416C;
        if (!C5997d.m6458n(iArr, i10)) {
            return C6013l.f19514a;
        }
        int i11 = i10 * 5;
        if (i11 >= iArr.length) {
            iM6416C = iArr.length;
        } else {
            iM6416C = C5997d.m6416C(iArr[i11 + 1] >> 29) + iArr[i11 + 4];
        }
        return this.f19329d[iM6416C];
    }

    /* JADX INFO: renamed from: c */
    public final void m6325c() {
        int i10;
        this.f19331f = true;
        C5943B0 c5943b0 = this.f19326a;
        c5943b0.getClass();
        if (this.f19326a != c5943b0 || (i10 = c5943b0.f19350q0) <= 0) {
            C5997d.m6470z("Unexpected reader close()");
            throw null;
        }
        c5943b0.f19350q0 = i10 - 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m6326d() {
        if (this.f19336k == 0) {
            if (!(this.f19332g == this.f19333h)) {
                C5997d.m6470z("endGroup() not called at the end of a group");
                throw null;
            }
            int i10 = this.f19334i;
            int[] iArr = this.f19327b;
            int iM6463s = C5997d.m6463s(iArr, i10);
            this.f19334i = iM6463s;
            int i11 = this.f19328c;
            this.f19333h = iM6463s < 0 ? i11 : C5997d.m6457m(iArr, iM6463s) + iM6463s;
            int iM6396c = this.f19335j.m6396c();
            if (iM6396c < 0) {
                this.f19337l = 0;
                this.f19338m = 0;
            } else {
                this.f19337l = iM6396c;
                this.f19338m = iM6463s >= i11 - 1 ? this.f19330e : C5997d.m6456l(iArr, iM6463s + 1);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final Object m6327e() {
        int i10 = this.f19332g;
        if (i10 < this.f19333h) {
            return m6324b(this.f19327b, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final int m6328f() {
        int i10 = this.f19332g;
        if (i10 >= this.f19333h) {
            return 0;
        }
        return this.f19327b[i10 * 5];
    }

    /* JADX INFO: renamed from: g */
    public final Object m6329g(int i10, int i11) {
        int[] iArr = this.f19327b;
        int iM6465u = C5997d.m6465u(iArr, i10);
        int i12 = i10 + 1;
        int i13 = iM6465u + i11;
        return i13 < (i12 < this.f19328c ? iArr[(i12 * 5) + 4] : this.f19330e) ? this.f19329d[i13] : C6013l.f19514a;
    }

    /* JADX INFO: renamed from: h */
    public final Object m6330h() {
        int i10;
        if (this.f19336k > 0 || (i10 = this.f19337l) >= this.f19338m) {
            this.f19339n = false;
            return C6013l.f19514a;
        }
        this.f19339n = true;
        this.f19337l = i10 + 1;
        return this.f19329d[i10];
    }

    /* JADX INFO: renamed from: i */
    public final Object m6331i(int i10) {
        int[] iArr = this.f19327b;
        if (!C5997d.m6460p(iArr, i10)) {
            return null;
        }
        if (!C5997d.m6460p(iArr, i10)) {
            return C6013l.f19514a;
        }
        return this.f19329d[iArr[(i10 * 5) + 4]];
    }

    /* JADX INFO: renamed from: j */
    public final Object m6332j(int[] iArr, int i10) {
        if (!C5997d.m6459o(iArr, i10)) {
            return null;
        }
        int i11 = i10 * 5;
        return this.f19329d[C5997d.m6416C(iArr[i11 + 1] >> 30) + iArr[i11 + 4]];
    }

    /* JADX INFO: renamed from: k */
    public final void m6333k(int i10) {
        if (!(this.f19336k == 0)) {
            C5997d.m6470z("Cannot reposition while in an empty region");
            throw null;
        }
        this.f19332g = i10;
        int[] iArr = this.f19327b;
        int i11 = this.f19328c;
        int iM6463s = i10 < i11 ? C5997d.m6463s(iArr, i10) : -1;
        this.f19334i = iM6463s;
        if (iM6463s < 0) {
            this.f19333h = i11;
        } else {
            this.f19333h = C5997d.m6457m(iArr, iM6463s) + iM6463s;
        }
        this.f19337l = 0;
        this.f19338m = 0;
    }

    /* JADX INFO: renamed from: l */
    public final int m6334l() {
        if (!(this.f19336k == 0)) {
            C5997d.m6470z("Cannot skip while in an empty region");
            throw null;
        }
        int i10 = this.f19332g;
        int[] iArr = this.f19327b;
        int iM6462r = C5997d.m6460p(iArr, i10) ? 1 : C5997d.m6462r(iArr, this.f19332g);
        int i11 = this.f19332g;
        this.f19332g = C5997d.m6457m(iArr, i11) + i11;
        return iM6462r;
    }

    /* JADX INFO: renamed from: m */
    public final void m6335m() {
        if (!(this.f19336k == 0)) {
            C5997d.m6470z("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
        this.f19332g = this.f19333h;
        this.f19337l = 0;
        this.f19338m = 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m6336n() {
        if (this.f19336k <= 0) {
            int i10 = this.f19334i;
            int i11 = this.f19332g;
            int[] iArr = this.f19327b;
            if (!(C5997d.m6463s(iArr, i11) == i10)) {
                C5997d.m6443b0("Invalid slot table detected");
                throw null;
            }
            int i12 = this.f19337l;
            int i13 = this.f19338m;
            C5960K c5960k = this.f19335j;
            if (i12 == 0 && i13 == 0) {
                c5960k.m6397d(-1);
            } else {
                c5960k.m6397d(i12);
            }
            this.f19334i = i11;
            this.f19333h = C5997d.m6457m(iArr, i11) + i11;
            int i14 = i11 + 1;
            this.f19332g = i14;
            this.f19337l = C5997d.m6465u(iArr, i11);
            this.f19338m = i11 >= this.f19328c - 1 ? this.f19330e : C5997d.m6456l(iArr, i14);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f19332g);
        sb2.append(", key=");
        sb2.append(m6328f());
        sb2.append(", parent=");
        sb2.append(this.f19334i);
        sb2.append(", end=");
        return AbstractC12107L1.m13826q(sb2, this.f19333h, ')');
    }
}
