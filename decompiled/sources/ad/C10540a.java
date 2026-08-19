package ad;

import mm.C17321x;
import p774h1.C14365u;

/* JADX INFO: renamed from: ad.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C10540a {

    /* JADX INFO: renamed from: c */
    public static final C10540a f31261c;

    /* JADX INFO: renamed from: d */
    public static final C10540a f31262d;

    /* JADX INFO: renamed from: e */
    public static final C10540a f31263e;

    /* JADX INFO: renamed from: f */
    public static final C10540a f31264f;

    /* JADX INFO: renamed from: g */
    public static final C10540a f31265g;

    /* JADX INFO: renamed from: h */
    public static final C10540a f31266h;

    /* JADX INFO: renamed from: i */
    public static final C10540a f31267i;

    /* JADX INFO: renamed from: j */
    public static final C10540a f31268j;

    /* JADX INFO: renamed from: k */
    public static final C10540a f31269k;

    /* JADX INFO: renamed from: a */
    public final long f31270a;

    /* JADX INFO: renamed from: b */
    public final long f31271b;

    static {
        long j10 = AbstractC10541b.f31272a;
        long j11 = AbstractC10541b.f31273b;
        f31261c = new C10540a(j10, j11);
        long j12 = AbstractC10541b.f31274c;
        long j13 = AbstractC10541b.f31275d;
        f31262d = new C10540a(j12, j13);
        f31263e = new C10540a(AbstractC10541b.f31276e, j11);
        f31264f = new C10540a(AbstractC10541b.f31277f, AbstractC10541b.f31278g);
        f31265g = new C10540a(AbstractC10541b.f31279h, AbstractC10541b.f31280i);
        f31266h = new C10540a(AbstractC10541b.f31281j, j13);
        f31267i = new C10540a(AbstractC10541b.f31282k, AbstractC10541b.f31283l);
        f31268j = new C10540a(AbstractC10541b.f31284m, AbstractC10541b.f31285n);
        f31269k = new C10540a(AbstractC10541b.f31286o, AbstractC10541b.f31287p);
    }

    public C10540a(long j10, long j11) {
        this.f31270a = j10;
        this.f31271b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10540a)) {
            return false;
        }
        C10540a c10540a = (C10540a) obj;
        return C14365u.m15775c(this.f31270a, c10540a.f31270a) && C14365u.m15775c(this.f31271b, c10540a.f31271b);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f31271b) + (C17321x.m18981a(this.f31270a) * 31);
    }

    public final String toString() {
        return "█";
    }
}
