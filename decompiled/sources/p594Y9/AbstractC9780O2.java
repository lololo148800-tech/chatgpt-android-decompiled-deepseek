package p594Y9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17892E0;

/* JADX INFO: renamed from: Y9.O2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9780O2 {
    /* JADX INFO: renamed from: a */
    public static C17892E0 m10388a(C3676s c3676s) {
        try {
            String testId = c3676s.m4395w("test_id").mo4384r();
            String resultId = c3676s.m4395w("result_id").mo4384r();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("injected");
            Boolean boolValueOf = abstractC3673pM4395w != null ? Boolean.valueOf(abstractC3673pM4395w.mo4380f()) : null;
            AbstractC16544l.m18093f(testId, "testId");
            AbstractC16544l.m18093f(resultId, "resultId");
            return new C17892E0(testId, resultId, boolValueOf);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Synthetics", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Synthetics", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Synthetics", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m10389b(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM10400b = AbstractC9786P2.m10400b(obj);
        int i11 = iM10400b & i10;
        int iM10390c = m10390c(i11, obj3);
        if (iM10390c != 0) {
            int i12 = ~i10;
            int i13 = iM10400b & i12;
            int i14 = -1;
            while (true) {
                int i15 = iM10390c - 1;
                int i16 = iArr[i15];
                if ((i16 & i12) != i13 || !AbstractC9762L2.m10365b(obj, objArr[i15]) || (objArr2 != null && !AbstractC9762L2.m10365b(obj2, objArr2[i15]))) {
                    int i17 = i16 & i10;
                    if (i17 == 0) {
                        break;
                    }
                    i14 = i15;
                    iM10390c = i17;
                } else {
                    int i18 = i16 & i10;
                    if (i14 == -1) {
                        m10392e(i11, obj3, i18);
                    } else {
                        iArr[i14] = (i18 & i10) | (iArr[i14] & i12);
                    }
                    return i15;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static int m10390c(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i10] : ((int[]) obj)[i10];
    }

    /* JADX INFO: renamed from: d */
    public static Object m10391d(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i10 <= 256) {
            return new byte[i10];
        }
        return i10 <= 65536 ? new short[i10] : new int[i10];
    }

    /* JADX INFO: renamed from: e */
    public static void m10392e(int i10, Object obj, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
