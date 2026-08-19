package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21329w;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.A */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21891A {
    public static final C22070w Companion = new C22070w();

    /* JADX INFO: renamed from: c */
    public static final C21891A f69409c;

    /* JADX INFO: renamed from: d */
    public static final C21891A f69410d;

    /* JADX INFO: renamed from: e */
    public static final C21891A f69411e;

    /* JADX INFO: renamed from: f */
    public static final C21891A f69412f;

    /* JADX INFO: renamed from: g */
    public static final C21891A f69413g;

    /* JADX INFO: renamed from: h */
    public static final C21891A f69414h;

    /* JADX INFO: renamed from: a */
    public final C22038o f69415a;

    /* JADX INFO: renamed from: b */
    public final C22013h2 f69416b;

    static {
        C22022k c22022k = C22038o.Companion;
        c22022k.getClass();
        C22038o c22038o = C22038o.f69706n;
        C22009g2 c22009g2 = C22013h2.Companion;
        c22009g2.getClass();
        C22013h2 c22013h2 = C22013h2.f69654g;
        f69409c = new C21891A(c22038o, c22013h2);
        c22022k.getClass();
        C22038o c22038o2 = C22038o.f69705m;
        c22009g2.getClass();
        f69410d = new C21891A(c22038o2, c22013h2);
        c22022k.getClass();
        C22038o c22038o3 = C22038o.f69707o;
        c22009g2.getClass();
        f69411e = new C21891A(c22038o3, c22013h2);
        c22022k.getClass();
        C22038o c22038o4 = C22038o.f69708p;
        c22009g2.getClass();
        f69412f = new C21891A(c22038o4, c22013h2);
        c22022k.getClass();
        C22038o c22038o5 = C22038o.f69709q;
        c22009g2.getClass();
        f69413g = new C21891A(c22038o5, c22013h2);
        c22022k.getClass();
        C22038o c22038o6 = C22038o.f69710r;
        c22009g2.getClass();
        f69414h = new C21891A(c22038o6, c22013h2);
    }

    public /* synthetic */ C21891A(int i10, C22038o c22038o, C22013h2 c22013h2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C22066v.f69765a.getDescriptor());
            throw null;
        }
        this.f69415a = c22038o;
        this.f69416b = c22013h2;
    }

    /* JADX INFO: renamed from: a */
    public final String m22322a() {
        C22038o c22038o = this.f69415a;
        if (c22038o != null) {
            return c22038o.f69711a;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final String m22323b() {
        if (!m22331j()) {
            return this.f69416b.f69659e;
        }
        C22038o c22038o = this.f69415a;
        if (c22038o != null) {
            return c22038o.f69720j;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m22324c() {
        AbstractC22014i abstractC22014i;
        C22038o c22038o = this.f69415a;
        return (c22038o == null || (abstractC22014i = c22038o.f69721k) == null || !abstractC22014i.f69662a) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m22325d() {
        C22038o c22038o = this.f69415a;
        return c22038o != null && c22038o.m22345b();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m22326e() {
        C22038o c22038o = this.f69415a;
        if (c22038o == null) {
            return false;
        }
        C21975X1 c21975x1 = c22038o.f69714d;
        return (c21975x1 != null ? c21975x1.f69572b : null) != EnumC21989b2.NOT_PURCHASED;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21891A)) {
            return false;
        }
        C21891A c21891a = (C21891A) obj;
        return AbstractC16544l.m18089b(this.f69415a, c21891a.f69415a) && AbstractC16544l.m18089b(this.f69416b, c21891a.f69416b);
    }

    /* JADX INFO: renamed from: f */
    public final EnumC21905D1 m22327f() {
        EnumC21905D1 enumC21905D1;
        C22038o c22038o = this.f69415a;
        return (c22038o == null || (enumC21905D1 = c22038o.f69718h) == null) ? EnumC21905D1.UNKNOWN : enumC21905D1;
    }

    /* JADX INFO: renamed from: g */
    public final String m22328g() {
        EnumC21905D1 enumC21905D1;
        C22038o c22038o = this.f69415a;
        if (c22038o == null || (enumC21905D1 = c22038o.f69718h) == null) {
            return null;
        }
        return enumC21905D1.f69449Y;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m22329h() {
        C22038o c22038o = this.f69415a;
        return c22038o != null && c22038o.f69719i;
    }

    public final int hashCode() {
        C22038o c22038o = this.f69415a;
        return this.f69416b.hashCode() + ((c22038o == null ? 0 : c22038o.hashCode()) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m22330i() {
        String str = this.f69416b.f69656b;
        return str != null && AbstractC21329w.m21725l(str, "@openai.com", false);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m22331j() {
        C22038o c22038o = this.f69415a;
        return c22038o != null && c22038o.m22346c();
    }

    public final String toString() {
        return "█";
    }

    public C21891A(C22038o c22038o, C22013h2 user) {
        AbstractC16544l.m18094g(user, "user");
        this.f69415a = c22038o;
        this.f69416b = user;
    }
}
