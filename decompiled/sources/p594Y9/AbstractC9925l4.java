package p594Y9;

import android.gov.nist.core.Separators;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p571X9.AbstractC9306j0;
import p919o8.C17931R1;

/* JADX INFO: renamed from: Y9.l4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9925l4 {
    /* JADX INFO: renamed from: a */
    public static String m10582a(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strM20d;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                strM20d = "null";
            } else {
                try {
                    strM20d = obj.toString();
                } catch (Exception e10) {
                    String strM9890i = AbstractC9306j0.m9890i(obj.getClass().getName(), Separators.f31989AT, Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM9890i), (Throwable) e10);
                    strM20d = AbstractC0010F.m20d(Separators.LESS_THAN, strM9890i, " threw ", e10.getClass().getName(), Separators.GREATER_THAN);
                }
            }
            objArr[i11] = strM20d;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static C17931R1 m10583b(C3676s c3676s) {
        try {
            String testId = c3676s.m4395w("test_id").mo4384r();
            String resultId = c3676s.m4395w("result_id").mo4384r();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("injected");
            Boolean boolValueOf = abstractC3673pM4395w != null ? Boolean.valueOf(abstractC3673pM4395w.mo4380f()) : null;
            AbstractC16544l.m18093f(testId, "testId");
            AbstractC16544l.m18093f(resultId, "resultId");
            return new C17931R1(testId, resultId, boolValueOf);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Synthetics", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Synthetics", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Synthetics", e12);
        }
    }
}
