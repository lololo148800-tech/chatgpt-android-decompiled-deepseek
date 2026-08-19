package p1016t3;

import android.net.Uri;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.util.Collections;
import java.util.List;
import p1073w3.AbstractC20817s;
import p372P3.C6337s;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: t3.M */
/* JADX INFO: loaded from: classes.dex */
public final class C19763M {

    /* JADX INFO: renamed from: p */
    public static final Object f62584p = new Object();

    /* JADX INFO: renamed from: q */
    public static final C19797x f62585q;

    /* JADX INFO: renamed from: b */
    public Object f62587b;

    /* JADX INFO: renamed from: d */
    public long f62589d;

    /* JADX INFO: renamed from: e */
    public long f62590e;

    /* JADX INFO: renamed from: f */
    public long f62591f;

    /* JADX INFO: renamed from: g */
    public boolean f62592g;

    /* JADX INFO: renamed from: h */
    public boolean f62593h;

    /* JADX INFO: renamed from: i */
    public C19793t f62594i;

    /* JADX INFO: renamed from: j */
    public boolean f62595j;

    /* JADX INFO: renamed from: k */
    public long f62596k;

    /* JADX INFO: renamed from: l */
    public long f62597l;

    /* JADX INFO: renamed from: m */
    public int f62598m;

    /* JADX INFO: renamed from: n */
    public int f62599n;

    /* JADX INFO: renamed from: o */
    public long f62600o;

    /* JADX INFO: renamed from: a */
    public Object f62586a = f62584p;

    /* JADX INFO: renamed from: c */
    public C19797x f62588c = f62585q;

    static {
        C6337s c6337s = new C6337s(5);
        C11276A c11276a = AbstractC11278C.f34162Z;
        C11294T c11294t = C11294T.f34185q0;
        List listEmptyList = Collections.emptyList();
        C11294T c11294t2 = C11294T.f34185q0;
        C19792s c19792s = new C19792s();
        C19795v c19795v = C19795v.f62784a;
        Uri uri = Uri.EMPTY;
        f62585q = new C19797x("androidx.media3.common.Timeline", new C19791r(c6337s), uri != null ? new C19794u(uri, null, null, listEmptyList, c11294t2, -9223372036854775807L) : null, new C19793t(c19792s), C19751A.f62530y, c19795v);
        AbstractC17792x.m19540w(1, 2, 3, 4, 5);
        AbstractC17792x.m19540w(6, 7, 8, 9, 10);
        AbstractC20817s.m21425z(11);
        AbstractC20817s.m21425z(12);
        AbstractC20817s.m21425z(13);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20722a() {
        return this.f62594i != null;
    }

    /* JADX INFO: renamed from: b */
    public final void m20723b(C19797x c19797x, boolean z6, boolean z10, C19793t c19793t, long j10, long j11) {
        this.f62586a = f62584p;
        this.f62588c = c19797x != null ? c19797x : f62585q;
        if (c19797x != null) {
            C19794u c19794u = c19797x.f62786b;
        }
        this.f62589d = -9223372036854775807L;
        this.f62590e = -9223372036854775807L;
        this.f62591f = -9223372036854775807L;
        this.f62592g = z6;
        this.f62593h = z10;
        this.f62594i = c19793t;
        this.f62596k = j10;
        this.f62597l = j11;
        this.f62598m = 0;
        this.f62599n = 0;
        this.f62600o = 0L;
        this.f62595j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C19763M.class.equals(obj.getClass())) {
            return false;
        }
        C19763M c19763m = (C19763M) obj;
        return AbstractC20817s.m21400a(this.f62586a, c19763m.f62586a) && AbstractC20817s.m21400a(this.f62588c, c19763m.f62588c) && AbstractC20817s.m21400a(null, null) && AbstractC20817s.m21400a(this.f62594i, c19763m.f62594i) && this.f62589d == c19763m.f62589d && this.f62590e == c19763m.f62590e && this.f62591f == c19763m.f62591f && this.f62592g == c19763m.f62592g && this.f62593h == c19763m.f62593h && this.f62595j == c19763m.f62595j && this.f62596k == c19763m.f62596k && this.f62597l == c19763m.f62597l && this.f62598m == c19763m.f62598m && this.f62599n == c19763m.f62599n && this.f62600o == c19763m.f62600o;
    }

    public final int hashCode() {
        int iHashCode = (this.f62588c.hashCode() + ((this.f62586a.hashCode() + 217) * 31)) * 961;
        C19793t c19793t = this.f62594i;
        int iHashCode2 = c19793t == null ? 0 : c19793t.hashCode();
        long j10 = this.f62589d;
        int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f62590e;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f62591f;
        int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f62592g ? 1 : 0)) * 31) + (this.f62593h ? 1 : 0)) * 31) + (this.f62595j ? 1 : 0)) * 31;
        long j13 = this.f62596k;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f62597l;
        int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f62598m) * 31) + this.f62599n) * 31;
        long j15 = this.f62600o;
        return i14 + ((int) (j15 ^ (j15 >>> 32)));
    }
}
