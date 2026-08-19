package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11047i0 {

    /* JADX INFO: renamed from: a */
    public static final C11043g0 f33320a;

    static {
        f33320a = (AbstractC11041f0.f33297e && AbstractC11041f0.f33296d && !AbstractC11034c.m11982a()) ? new C11043g0(1) : new C11043g0(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m12044a(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new C11045h0(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i12) + 4294967296L));
    }
}
