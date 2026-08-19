package p544W9;

import p328N1.C5605u;
import p328N1.C5609y;

/* JADX INFO: renamed from: W9.R3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8548R3 {
    /* JADX INFO: renamed from: a */
    public static final int m9208a(C5609y c5609y, int i10) {
        boolean z6 = c5609y.compareTo(C5609y.f18153p0) >= 0;
        boolean zM5992a = C5605u.m5992a(i10, 1);
        if (zM5992a && z6) {
            return 3;
        }
        if (z6) {
            return 1;
        }
        return zM5992a ? 2 : 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo9209b();
}
