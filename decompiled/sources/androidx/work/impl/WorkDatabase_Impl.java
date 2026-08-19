package androidx.work.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p110E4.C2304b;
import p110E4.C2309g;
import p110E4.C2314l;
import p167Gb.C3032c;
import p207I4.C3615b;
import p207I4.InterfaceC3617d;
import p470T4.C7239d;
import p658b5.AbstractC11235f;
import p658b5.C11231b;
import p658b5.C11232c;
import p658b5.C11234e;
import p658b5.C11237h;
import p658b5.C11238i;
import p658b5.C11241l;
import p658b5.C11242m;
import p658b5.C11246q;
import p658b5.C11248s;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: l */
    public volatile C11246q f33713l;

    /* JADX INFO: renamed from: m */
    public volatile C11232c f33714m;

    /* JADX INFO: renamed from: n */
    public volatile C11248s f33715n;

    /* JADX INFO: renamed from: o */
    public volatile C11238i f33716o;

    /* JADX INFO: renamed from: p */
    public volatile C11241l f33717p;

    /* JADX INFO: renamed from: q */
    public volatile C11242m f33718q;

    /* JADX INFO: renamed from: r */
    public volatile C11234e f33719r;

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: d */
    public final C2309g mo12341d() {
        return new C2309g(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: e */
    public final InterfaceC3617d mo12342e(C2304b c2304b) {
        return c2304b.f7144c.mo4327b(new C3615b(c2304b.f7142a, c2304b.f7143b, new C2314l(c2304b, new C3032c(this, 21)), false, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: f */
    public final C11232c mo12343f() {
        C11232c c11232c;
        if (this.f33714m != null) {
            return this.f33714m;
        }
        synchronized (this) {
            try {
                if (this.f33714m == null) {
                    C11232c c11232c2 = new C11232c();
                    c11232c2.f33996Y = this;
                    c11232c2.f33997Z = new C11231b(this, 0);
                    this.f33714m = c11232c2;
                }
                c11232c = this.f33714m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c11232c;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: g */
    public final List mo12344g(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new C7239d(13, 14, 10), new C7239d(11), new C7239d(16, 17, 12), new C7239d(17, 18, 13), new C7239d(18, 19, 14), new C7239d(15));
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: i */
    public final Set mo12346i() {
        return new HashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: j */
    public final Map mo12347j() {
        HashMap map = new HashMap();
        map.put(C11246q.class, Collections.emptyList());
        map.put(C11232c.class, Collections.emptyList());
        map.put(C11248s.class, Collections.emptyList());
        map.put(C11238i.class, Collections.emptyList());
        map.put(C11241l.class, Collections.emptyList());
        map.put(C11242m.class, Collections.emptyList());
        map.put(C11234e.class, Collections.emptyList());
        map.put(AbstractC11235f.class, Collections.emptyList());
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: l */
    public final C11234e mo12349l() {
        C11234e c11234e;
        if (this.f33719r != null) {
            return this.f33719r;
        }
        synchronized (this) {
            try {
                if (this.f33719r == null) {
                    this.f33719r = new C11234e(this);
                }
                c11234e = this.f33719r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c11234e;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: p */
    public final C11238i mo12353p() {
        C11238i c11238i;
        if (this.f33716o != null) {
            return this.f33716o;
        }
        synchronized (this) {
            try {
                if (this.f33716o == null) {
                    C11238i c11238i2 = new C11238i();
                    c11238i2.f34008Y = this;
                    c11238i2.f34009Z = new C11231b(this, 2);
                    c11238i2.f34010o0 = new C11237h(this, 0);
                    c11238i2.f34011p0 = new C11237h(this, 1);
                    this.f33716o = c11238i2;
                }
                c11238i = this.f33716o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c11238i;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: r */
    public final C11241l mo12354r() {
        C11241l c11241l;
        if (this.f33717p != null) {
            return this.f33717p;
        }
        synchronized (this) {
            try {
                if (this.f33717p == null) {
                    C11241l c11241l2 = new C11241l();
                    c11241l2.f34016Y = this;
                    c11241l2.f34017Z = new C11231b(this, 3);
                    this.f33717p = c11241l2;
                }
                c11241l = this.f33717p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c11241l;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: s */
    public final C11242m mo12355s() {
        C11242m c11242m;
        if (this.f33718q != null) {
            return this.f33718q;
        }
        synchronized (this) {
            try {
                if (this.f33718q == null) {
                    C11242m c11242m2 = new C11242m();
                    c11242m2.f34018Y = this;
                    new C11231b(this, 4);
                    c11242m2.f34019Z = new C11237h(this, 2);
                    c11242m2.f34020o0 = new C11237h(this, 3);
                    this.f33718q = c11242m2;
                }
                c11242m = this.f33718q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c11242m;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: t */
    public final C11246q mo12356t() {
        C11246q c11246q;
        if (this.f33713l != null) {
            return this.f33713l;
        }
        synchronized (this) {
            try {
                if (this.f33713l == null) {
                    this.f33713l = new C11246q(this);
                }
                c11246q = this.f33713l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c11246q;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: u */
    public final C11248s mo12357u() {
        C11248s c11248s;
        if (this.f33715n != null) {
            return this.f33715n;
        }
        synchronized (this) {
            try {
                if (this.f33715n == null) {
                    this.f33715n = new C11248s(this);
                }
                c11248s = this.f33715n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c11248s;
    }
}
