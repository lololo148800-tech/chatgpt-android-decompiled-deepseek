package p523V9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: V9.r0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8178r0 {

    /* JADX INFO: renamed from: a */
    public static long f25621a;

    /* JADX INFO: renamed from: a */
    public static void m8760a(long j10) {
        long j11 = f25621a - j10;
        f25621a = j11;
        if (j11 < 0) {
            f25621a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8761b(long j10) {
        f25621a += j10;
    }

    /* JADX INFO: renamed from: c */
    public static int m8762c(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 32) {
            return 5;
        }
        if (i10 == 64) {
            return 6;
        }
        if (i10 == 128) {
            return 7;
        }
        if (i10 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "type needs to be >= FIRST and <= LAST, type="));
    }
}
