package p571X9;

import android.gov.nist.core.Separators;
import java.util.logging.Level;
import java.util.logging.Logger;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17971g;

/* JADX INFO: renamed from: X9.S3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9207S3 {
    /* JADX INFO: renamed from: a */
    public static C17971g m9773a(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("technology");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("carrier_name");
            return new C17971g(strMo4384r, abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Cellular", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Cellular", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Cellular", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m9774b(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append(Separators.f31989AT);
                    sb2.append(hexString);
                    String string2 = sb2.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string2), (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(name2.length() + string2.length() + 8 + 1);
                    sb3.append(Separators.LESS_THAN);
                    sb3.append(string2);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(Separators.GREATER_THAN);
                    string = sb3.toString();
                }
            }
            objArr[i11] = string;
            i11++;
        }
        StringBuilder sb4 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb4.append((CharSequence) str, i12, iIndexOf);
            sb4.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb4.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb4.append(" [");
            sb4.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb4.append(", ");
                sb4.append(objArr[i13]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }
}
