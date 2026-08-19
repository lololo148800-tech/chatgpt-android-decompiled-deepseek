package p594Y9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.logging.Level;
import java.util.logging.Logger;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17967e1;

/* JADX INFO: renamed from: Y9.v3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9984v3 {
    /* JADX INFO: renamed from: a */
    public static C17967e1 m10622a(C3676s c3676s) {
        try {
            return new C17967e1(c3676s.m4395w("duration").mo4382p(), c3676s.m4395w("start").mo4382p());
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Redirect", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Redirect", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Redirect", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m10623b(String str, Object... objArr) {
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
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e10);
                    StringBuilder sbM11058p = AbstractC10763a.m11058p(Separators.LESS_THAN, str2, " threw ");
                    sbM11058p.append(e10.getClass().getName());
                    sbM11058p.append(Separators.GREATER_THAN);
                    string = sbM11058p.toString();
                }
            }
            objArr[i11] = string;
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
