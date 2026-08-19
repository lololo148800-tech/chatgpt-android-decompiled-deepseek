package p716e2;

import p760g2.C13807d;

/* JADX INFO: renamed from: e2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13266c {

    /* JADX INFO: renamed from: f */
    public static final Object f41924f = new Object();

    /* JADX INFO: renamed from: g */
    public static final Object f41925g = new Object();

    /* JADX INFO: renamed from: h */
    public static final Object f41926h = new Object();

    /* JADX INFO: renamed from: i */
    public static final Object f41927i = new Object();

    /* JADX INFO: renamed from: j */
    public static final Object f41928j = new Object();

    /* JADX INFO: renamed from: d */
    public Object f41932d;

    /* JADX INFO: renamed from: a */
    public int f41929a = 0;

    /* JADX INFO: renamed from: b */
    public int f41930b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c */
    public int f41931c = 0;

    /* JADX INFO: renamed from: e */
    public boolean f41933e = false;

    public C13266c(Object obj) {
        this.f41932d = obj;
    }

    /* JADX INFO: renamed from: a */
    public static C13266c m14869a() {
        Object obj = f41925g;
        C13266c c13266c = new C13266c(f41924f);
        c13266c.f41932d = obj;
        if (obj instanceof Integer) {
            c13266c.f41931c = ((Integer) obj).intValue();
            c13266c.f41932d = null;
        }
        return c13266c;
    }

    /* JADX INFO: renamed from: b */
    public final void m14870b(C13807d c13807d, int i10) {
        Object obj = f41927i;
        Object obj2 = f41928j;
        Object obj3 = f41925g;
        int i11 = 2;
        if (i10 == 0) {
            if (this.f41933e) {
                c13807d.m15367N(3);
                Object obj4 = this.f41932d;
                if (obj4 == obj3) {
                    i11 = 1;
                } else if (obj4 != obj2) {
                    i11 = 0;
                }
                c13807d.m15368O(i11, this.f41929a, this.f41930b, 1.0f);
                return;
            }
            int i12 = this.f41929a;
            if (i12 > 0) {
                if (i12 < 0) {
                    c13807d.f43660c0 = 0;
                } else {
                    c13807d.f43660c0 = i12;
                }
            }
            int i13 = this.f41930b;
            if (i13 < Integer.MAX_VALUE) {
                c13807d.f43632D[0] = i13;
            }
            Object obj5 = this.f41932d;
            if (obj5 == obj3) {
                c13807d.m15367N(2);
                return;
            }
            if (obj5 == obj) {
                c13807d.m15367N(4);
                return;
            } else {
                if (obj5 == null) {
                    c13807d.m15367N(1);
                    c13807d.m15371R(this.f41931c);
                    return;
                }
                return;
            }
        }
        if (this.f41933e) {
            c13807d.m15369P(3);
            Object obj6 = this.f41932d;
            if (obj6 == obj3) {
                i11 = 1;
            } else if (obj6 != obj2) {
                i11 = 0;
            }
            c13807d.m15370Q(i11, this.f41929a, this.f41930b, 1.0f);
            return;
        }
        int i14 = this.f41929a;
        if (i14 > 0) {
            if (i14 < 0) {
                c13807d.f43662d0 = 0;
            } else {
                c13807d.f43662d0 = i14;
            }
        }
        int i15 = this.f41930b;
        if (i15 < Integer.MAX_VALUE) {
            c13807d.f43632D[1] = i15;
        }
        Object obj7 = this.f41932d;
        if (obj7 == obj3) {
            c13807d.m15369P(2);
            return;
        }
        if (obj7 == obj) {
            c13807d.m15369P(4);
        } else if (obj7 == null) {
            c13807d.m15369P(1);
            c13807d.m15366M(this.f41931c);
        }
    }
}
