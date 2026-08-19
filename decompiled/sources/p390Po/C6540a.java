package p390Po;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17311n;
import p027Ap.C0693a;
import p078Co.InterfaceC1760b;
import p523V9.AbstractC8038Z3;
import p523V9.AbstractC8046a4;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9282f0;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Po.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6540a implements InterfaceC1760b {

    /* JADX INFO: renamed from: b */
    public static final C6540a f21167b = new C6540a(0);

    /* JADX INFO: renamed from: c */
    public static final C6540a f21168c = new C6540a(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21169a;

    public /* synthetic */ C6540a(int i10) {
        this.f21169a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static int m7095a(int i10, int i11) {
        Integer numValueOf = Integer.valueOf(i10);
        if (i10 > i11) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11;
    }

    /* JADX INFO: renamed from: b */
    public static String m7096b(int i10, int i11, String str) {
        Integer numValueOf;
        if (i10 >= 0 && i11 > 0) {
            String strSubstring = str.substring(i10, m7095a(i11 + i10, str.length()));
            AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
        if (i10 >= 0 && i11 < 0) {
            String strSubstring2 = str.substring(i10, str.length() + i11);
            AbstractC16544l.m18093f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring2;
        }
        if (i10 < 0 && i11 < 0) {
            int length = str.length() + i10;
            numValueOf = length >= 0 ? Integer.valueOf(length) : null;
            String strSubstring3 = str.substring(numValueOf != null ? numValueOf.intValue() : 0, m7095a(str.length() + i11, str.length()));
            AbstractC16544l.m18093f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring3;
        }
        if (i10 >= 0 || i11 <= 0) {
            return null;
        }
        int length2 = str.length() + i10;
        numValueOf = length2 >= 0 ? Integer.valueOf(length2) : null;
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        String strSubstring4 = str.substring(iIntValue, m7095a(i11 + iIntValue, str.length()));
        AbstractC16544l.m18093f(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring4;
    }

    @Override // p078Co.InterfaceC1760b
    /* JADX INFO: renamed from: d */
    public final Object mo2570d(Object obj, Object obj2) {
        Object objM9806b;
        switch (this.f21169a) {
            case 0:
                return AbstractC17680n.m19349Y(AbstractC9282f0.m9859e(obj), "", null, null, 0, null, null, 62);
            default:
                C0693a c0693aM8396e = AbstractC8038Z3.m8396e(obj);
                List list = c0693aM8396e.f2015Y;
                int iM8426e = (int) AbstractC8046a4.m8426e(String.valueOf(AbstractC17680n.m19344T(1, c0693aM8396e)));
                int iM8426e2 = (int) AbstractC8046a4.m8426e(String.valueOf(AbstractC17680n.m19344T(2, c0693aM8396e)));
                String strM19349Y = AbstractC17680n.m19349Y(AbstractC9282f0.m9859e(AbstractC17680n.m19343S(c0693aM8396e)), Separators.COMMA, null, null, 0, null, null, 62);
                try {
                    if (list.size() == 2) {
                        if (iM8426e >= 0) {
                            Object objSubstring = strM19349Y.substring(iM8426e);
                            AbstractC16544l.m18093f(objSubstring, "this as java.lang.String).substring(startIndex)");
                            objM9806b = objSubstring;
                        } else if (Math.abs(iM8426e) <= strM19349Y.length()) {
                            objM9806b = strM19349Y;
                            Object objSubstring2 = strM19349Y.substring(strM19349Y.length() + iM8426e);
                            AbstractC16544l.m18093f(objSubstring2, "this as java.lang.String).substring(startIndex)");
                            objM9806b = objSubstring2;
                        }
                    } else if (list.size() > 2) {
                        objM9806b = strM19349Y;
                        objM9806b = m7096b(iM8426e, iM8426e2, strM19349Y);
                    }
                    objM9806b = strM19349Y;
                    objM9806b = strM19349Y;
                    break;
                } catch (Throwable th2) {
                    objM9806b = AbstractC9233X.m9806b(th2);
                }
                boolean z6 = objM9806b instanceof C17311n;
                Object obj3 = objM9806b;
                if (z6) {
                    obj3 = null;
                }
                String str = (String) obj3;
                return str == null ? "" : str;
        }
    }
}
