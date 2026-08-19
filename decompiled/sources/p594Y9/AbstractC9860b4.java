package p594Y9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.AbstractC17976h1;
import p919o8.C17914L1;

/* JADX INFO: renamed from: Y9.b4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9860b4 {
    /* JADX INFO: renamed from: a */
    public static C17914L1 m10512a(C3676s c3676s) {
        try {
            String strMo4384r = c3676s.m4395w("state").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"state\").asString");
            for (int i10 : AbstractC0010F.m27k(5)) {
                if (AbstractC17976h1.m19668c(i10).equals(strMo4384r)) {
                    return new C17914L1(i10, c3676s.m4395w("start").mo4382p());
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type PageState", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type PageState", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type PageState", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m10513b(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM10522b = AbstractC9867c4.m10522b(obj);
        int i11 = iM10522b & i10;
        int iM10514c = m10514c(i11, obj3);
        if (iM10514c != 0) {
            int i12 = ~i10;
            int i13 = iM10522b & i12;
            int i14 = -1;
            while (true) {
                int i15 = iM10514c - 1;
                int i16 = iArr[i15];
                if ((i16 & i12) != i13 || !AbstractC9881e4.m10535b(obj, objArr[i15]) || (objArr2 != null && !AbstractC9881e4.m10535b(obj2, objArr2[i15]))) {
                    int i17 = i16 & i10;
                    if (i17 == 0) {
                        break;
                    }
                    i14 = i15;
                    iM10514c = i17;
                } else {
                    int i18 = i16 & i10;
                    if (i14 == -1) {
                        m10516e(i11, obj3, i18);
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
    public static int m10514c(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i10] : ((int[]) obj)[i10];
    }

    /* JADX INFO: renamed from: d */
    public static Object m10515d(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i10 <= 256) {
            return new byte[i10];
        }
        return i10 <= 65536 ? new short[i10] : new int[i10];
    }

    /* JADX INFO: renamed from: e */
    public static void m10516e(int i10, Object obj, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
