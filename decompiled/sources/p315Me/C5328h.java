package p315Me;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p216Id.EnumC3703k;
import p228J.AbstractC3794B0;
import p228J.AbstractC3812N;
import p324Mn.C5550t;
import p324Mn.C5551u;
import p775h2.AbstractC14376f;
import p909nm.C17690x;

/* JADX INFO: renamed from: Me.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C5328h {

    /* JADX INFO: renamed from: a */
    public final String f17518a;

    /* JADX INFO: renamed from: b */
    public final String f17519b;

    /* JADX INFO: renamed from: c */
    public final EnumC3703k f17520c;

    /* JADX INFO: renamed from: d */
    public final String f17521d;

    /* JADX INFO: renamed from: e */
    public final String f17522e;

    /* JADX INFO: renamed from: f */
    public final int f17523f;

    /* JADX INFO: renamed from: g */
    public final int f17524g;

    /* JADX INFO: renamed from: h */
    public String f17525h;

    /* JADX INFO: renamed from: i */
    public boolean f17526i;

    /* JADX INFO: renamed from: j */
    public AbstractC3812N f17527j;

    /* JADX INFO: renamed from: k */
    public final C5551u f17528k;

    /* JADX INFO: renamed from: l */
    public String f17529l;

    /* JADX INFO: renamed from: m */
    public long f17530m;

    /* JADX INFO: renamed from: n */
    public C5551u f17531n;

    /* JADX INFO: renamed from: o */
    public long f17532o;

    /* JADX INFO: renamed from: p */
    public final List f17533p;

    /* JADX INFO: renamed from: q */
    public int f17534q;

    /* JADX INFO: renamed from: r */
    public int f17535r;

    /* JADX INFO: renamed from: s */
    public final Set f17536s;

    /* JADX INFO: renamed from: t */
    public Map f17537t;

    public C5328h(String model, String str, EnumC3703k trigger, String str2, String str3, int i10, int i11) {
        C5326f c5326f = C5326f.f17516o0;
        C5550t c5550t = C5551u.Companion;
        c5550t.getClass();
        C5551u c5551u = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
        C21554a c21554a = C21555b.f68260Z;
        c5550t.getClass();
        C5551u c5551u2 = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C17690x c17690x = C17690x.f56481Y;
        AbstractC16544l.m18094g(model, "model");
        AbstractC16544l.m18094g(trigger, "trigger");
        this.f17518a = model;
        this.f17519b = str;
        this.f17520c = trigger;
        this.f17521d = str2;
        this.f17522e = str3;
        this.f17523f = i10;
        this.f17524g = i11;
        this.f17525h = null;
        this.f17526i = false;
        this.f17527j = c5326f;
        this.f17528k = c5551u;
        this.f17529l = "start";
        this.f17530m = 0L;
        this.f17531n = c5551u2;
        this.f17532o = 0L;
        this.f17533p = arrayList;
        this.f17534q = 0;
        this.f17535r = 0;
        this.f17536s = linkedHashSet;
        this.f17537t = c17690x;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5328h)) {
            return false;
        }
        C5328h c5328h = (C5328h) obj;
        if (!AbstractC16544l.m18089b(this.f17518a, c5328h.f17518a) || !AbstractC16544l.m18089b(this.f17519b, c5328h.f17519b) || this.f17520c != c5328h.f17520c) {
            return false;
        }
        String str = this.f17521d;
        String str2 = c5328h.f17521d;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f17522e, c5328h.f17522e) && this.f17523f == c5328h.f17523f && this.f17524g == c5328h.f17524g && AbstractC16544l.m18089b(this.f17525h, c5328h.f17525h) && this.f17526i == c5328h.f17526i && AbstractC16544l.m18089b(this.f17527j, c5328h.f17527j) && AbstractC16544l.m18089b(this.f17528k, c5328h.f17528k) && AbstractC16544l.m18089b(this.f17529l, c5328h.f17529l) && C21555b.m21834d(this.f17530m, c5328h.f17530m) && AbstractC16544l.m18089b(this.f17531n, c5328h.f17531n) && C21555b.m21834d(this.f17532o, c5328h.f17532o) && AbstractC16544l.m18089b(this.f17533p, c5328h.f17533p) && this.f17534q == c5328h.f17534q && this.f17535r == c5328h.f17535r && AbstractC16544l.m18089b(this.f17536s, c5328h.f17536s) && AbstractC16544l.m18089b(this.f17537t, c5328h.f17537t);
    }

    public final int hashCode() {
        int iHashCode = (this.f17520c.hashCode() + AbstractC0168G.m527p(this.f17518a.hashCode() * 31, 31, this.f17519b)) * 31;
        String str = this.f17521d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17522e;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f17523f) * 31) + this.f17524g) * 31;
        String str3 = this.f17525h;
        return this.f17537t.hashCode() + ((this.f17536s.hashCode() + ((((AbstractC14376f.m15858x(this.f17533p, (C21555b.m21837g(this.f17532o) + ((this.f17531n.f18004Y.hashCode() + ((C21555b.m21837g(this.f17530m) + AbstractC0168G.m527p((this.f17528k.f18004Y.hashCode() + ((this.f17527j.hashCode() + ((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f17526i ? 1231 : 1237)) * 31)) * 31)) * 31, 31, this.f17529l)) * 31)) * 31)) * 31, 31) + this.f17534q) * 31) + this.f17535r) * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
