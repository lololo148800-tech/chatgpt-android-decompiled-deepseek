package p594Y9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.NoSuchElementException;
import p001A.AbstractC0010F;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.AbstractC17962d;
import p919o8.C17964d1;

/* JADX INFO: renamed from: Y9.q3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9954q3 {
    /* JADX INFO: renamed from: a */
    public static C17964d1 m10610a(C3676s c3676s) {
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
                    if (AbstractC17962d.m19662w(i11).equals(strMo4384r)) {
                        i10 = i11;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new C17964d1(i10, strMo4384r2, strMo4384r3);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Provider", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Provider", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Provider", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10611b(int i10, int i11) {
        String strM10623b;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM10623b = AbstractC9984v3.m10623b("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
                }
                strM10623b = AbstractC9984v3.m10623b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM10623b);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10612c(int i10, int i11, int i12) {
        String strM10613d;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM10613d = m10613d(i10, i12, "start index");
            } else {
                strM10613d = (i11 < 0 || i11 > i12) ? m10613d(i11, i12, "end index") : AbstractC9984v3.m10623b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM10613d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m10613d(int i10, int i11, String str) {
        if (i10 < 0) {
            return AbstractC9984v3.m10623b("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return AbstractC9984v3.m10623b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
    }
}
