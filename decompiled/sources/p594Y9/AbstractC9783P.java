package p594Y9;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001A.AbstractC0010F;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p571X9.AbstractC9306j0;
import p919o8.AbstractC17962d;
import p919o8.C17966e0;

/* JADX INFO: renamed from: Y9.P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9783P {
    /* JADX INFO: renamed from: a */
    public static C17966e0 m10397a(C3676s c3676s) {
        String strMo4384r;
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("domain");
            String strMo4384r2 = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w(DiagnosticsEntry.NAME_KEY);
            String strMo4384r3 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("type");
            int i10 = 0;
            if (abstractC3673pM4395w3 != null && (strMo4384r = abstractC3673pM4395w3.mo4384r()) != null) {
                int[] iArrM27k = AbstractC0010F.m27k(14);
                int length = iArrM27k.length;
                while (i10 < length) {
                    int i11 = iArrM27k[i10];
                    if (AbstractC17962d.m19647h(i11).equals(strMo4384r)) {
                        i10 = i11;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new C17966e0(i10, strMo4384r2, strMo4384r3);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Provider", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Provider", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Provider", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m10398b(String str, Object... objArr) {
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
}
