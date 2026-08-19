package p029B0;

import p140Fa.C2685e;
import p204I1.C3581L;

/* JADX INFO: renamed from: B0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0714a {

    /* JADX INFO: renamed from: i */
    public static final C2685e f2060i = new C2685e();

    /* JADX INFO: renamed from: a */
    public final int f2061a;

    /* JADX INFO: renamed from: b */
    public final String f2062b;

    /* JADX INFO: renamed from: c */
    public final String f2063c;

    /* JADX INFO: renamed from: d */
    public final long f2064d;

    /* JADX INFO: renamed from: e */
    public final long f2065e;

    /* JADX INFO: renamed from: f */
    public final long f2066f;

    /* JADX INFO: renamed from: g */
    public final boolean f2067g;

    /* JADX INFO: renamed from: h */
    public final int f2068h;

    public C0714a(int i10, String str, String str2, long j10, long j11, long j12, boolean z6, int i11) {
        j12 = (i11 & 32) != 0 ? System.currentTimeMillis() : j12;
        z6 = (i11 & 64) != 0 ? true : z6;
        this.f2061a = i10;
        this.f2062b = str;
        this.f2063c = str2;
        this.f2064d = j10;
        this.f2065e = j11;
        this.f2066f = j12;
        this.f2067g = z6;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        this.f2068h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? 3 : 2 : 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m1488a() {
        if (this.f2068h != 2) {
            return 4;
        }
        long j10 = this.f2065e;
        if (!C3581L.m4267c(j10)) {
            return 4;
        }
        long j11 = this.f2064d;
        if (C3581L.m4267c(j11)) {
            return ((int) (j11 >> 32)) > ((int) (j10 >> 32)) ? 1 : 2;
        }
        int i10 = (int) (j11 >> 32);
        return (i10 == ((int) (j10 >> 32)) && i10 == this.f2061a) ? 3 : 4;
    }
}
