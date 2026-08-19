package p305M3;

import p1073w3.C20811m;
import p372P3.C6330l;

/* JADX INFO: renamed from: M3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5289i {

    /* JADX INFO: renamed from: a */
    public final int f17430a;

    /* JADX INFO: renamed from: b */
    public final long f17431b;

    public /* synthetic */ C5289i(int i10, long j10) {
        this.f17430a = i10;
        this.f17431b = j10;
    }

    /* JADX INFO: renamed from: a */
    public static C5289i m5829a(int i10, int i11, String str) {
        if (i10 >= i11) {
            return null;
        }
        long j10 = 0;
        int i12 = i10;
        while (i12 < i11) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j10 = (j10 * 10) + ((long) (cCharAt - '0'));
            if (j10 > 2147483647L) {
                return null;
            }
            i12++;
        }
        if (i12 == i10) {
            return null;
        }
        return new C5289i(j10, i12);
    }

    /* JADX INFO: renamed from: b */
    public static C5289i m5830b(C6330l c6330l, C20811m c20811m) {
        c6330l.mo3047d(c20811m.f66092a, 0, 8, false);
        c20811m.m21344F(0);
        return new C5289i(c20811m.m21352g(), c20811m.m21356k());
    }

    public C5289i(long j10, int i10) {
        this.f17431b = j10;
        this.f17430a = i10;
    }
}
