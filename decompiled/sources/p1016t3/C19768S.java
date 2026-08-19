package p1016t3;

import bb.AbstractC11281F;
import bb.AbstractC11320m;
import bb.C11294T;
import bb.C11299Y;
import p1073w3.AbstractC20817s;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: t3.S */
/* JADX INFO: loaded from: classes.dex */
public class C19768S {

    /* JADX INFO: renamed from: a */
    public final int f62625a;

    /* JADX INFO: renamed from: b */
    public final int f62626b;

    /* JADX INFO: renamed from: c */
    public final int f62627c;

    /* JADX INFO: renamed from: d */
    public final int f62628d;

    /* JADX INFO: renamed from: e */
    public final int f62629e;

    /* JADX INFO: renamed from: f */
    public final int f62630f;

    /* JADX INFO: renamed from: g */
    public final boolean f62631g;

    /* JADX INFO: renamed from: h */
    public final C11294T f62632h;

    /* JADX INFO: renamed from: i */
    public final C11294T f62633i;

    /* JADX INFO: renamed from: j */
    public final int f62634j;

    /* JADX INFO: renamed from: k */
    public final int f62635k;

    /* JADX INFO: renamed from: l */
    public final C11294T f62636l;

    /* JADX INFO: renamed from: m */
    public final C19766P f62637m;

    /* JADX INFO: renamed from: n */
    public final C11294T f62638n;

    /* JADX INFO: renamed from: o */
    public final int f62639o;

    /* JADX INFO: renamed from: p */
    public final C11299Y f62640p;

    /* JADX INFO: renamed from: q */
    public final AbstractC11281F f62641q;

    static {
        new C19768S(new C19767Q());
        AbstractC20817s.m21425z(1);
        AbstractC20817s.m21425z(2);
        AbstractC20817s.m21425z(3);
        AbstractC20817s.m21425z(4);
        AbstractC17792x.m19540w(5, 6, 7, 8, 9);
        AbstractC17792x.m19540w(10, 11, 12, 13, 14);
        AbstractC17792x.m19540w(15, 16, 17, 18, 19);
        AbstractC17792x.m19540w(20, 21, 22, 23, 24);
        AbstractC17792x.m19540w(25, 26, 27, 28, 29);
        AbstractC20817s.m21425z(30);
        AbstractC20817s.m21425z(31);
    }

    public C19768S(C19767Q c19767q) {
        this.f62625a = c19767q.f62608a;
        this.f62626b = c19767q.f62609b;
        this.f62627c = c19767q.f62610c;
        this.f62628d = c19767q.f62611d;
        this.f62629e = c19767q.f62612e;
        this.f62630f = c19767q.f62613f;
        this.f62631g = c19767q.f62614g;
        this.f62632h = c19767q.f62615h;
        this.f62633i = c19767q.f62616i;
        this.f62634j = c19767q.f62617j;
        this.f62635k = c19767q.f62618k;
        this.f62636l = c19767q.f62619l;
        this.f62637m = c19767q.f62620m;
        this.f62638n = c19767q.f62621n;
        this.f62639o = c19767q.f62622o;
        this.f62640p = C11299Y.m12713a(c19767q.f62623p);
        this.f62641q = AbstractC11281F.m12705t(c19767q.f62624q);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C19768S c19768s = (C19768S) obj;
        if (this.f62625a == c19768s.f62625a && this.f62626b == c19768s.f62626b && this.f62627c == c19768s.f62627c && this.f62628d == c19768s.f62628d && this.f62631g == c19768s.f62631g && this.f62629e == c19768s.f62629e && this.f62630f == c19768s.f62630f && this.f62632h.equals(c19768s.f62632h) && this.f62633i.equals(c19768s.f62633i) && this.f62634j == c19768s.f62634j && this.f62635k == c19768s.f62635k && this.f62636l.equals(c19768s.f62636l) && this.f62637m.equals(c19768s.f62637m) && this.f62638n.equals(c19768s.f62638n) && this.f62639o == c19768s.f62639o) {
            C11299Y c11299y = this.f62640p;
            c11299y.getClass();
            if (AbstractC11320m.m12726f(c11299y, c19768s.f62640p) && this.f62641q.equals(c19768s.f62641q)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f62636l.hashCode() + ((((((this.f62633i.hashCode() + ((this.f62632h.hashCode() + ((((((((((((((this.f62625a + 31) * 31) + this.f62626b) * 31) + this.f62627c) * 31) + this.f62628d) * 28629151) + (this.f62631g ? 1 : 0)) * 31) + this.f62629e) * 31) + this.f62630f) * 31)) * 961)) * 961) + this.f62634j) * 31) + this.f62635k) * 31)) * 31;
        this.f62637m.getClass();
        return this.f62641q.hashCode() + ((this.f62640p.hashCode() + ((((this.f62638n.hashCode() + ((iHashCode + 29791) * 31)) * 31) + this.f62639o) * 887503681)) * 31);
    }
}
