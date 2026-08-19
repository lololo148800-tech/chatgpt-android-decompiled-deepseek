package p544W9;

import android.gov.nist.core.Separators;
import android.os.Build;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC16544l;
import p109E3.C2292p;
import p1113xn.AbstractC21322p;
import p857kl.C16460h;
import p857kl.C16472t;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: W9.d4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8621d4 {

    /* JADX INFO: renamed from: a */
    public static boolean f26455a = true;

    /* JADX INFO: renamed from: a */
    public static C16460h m9270a(String str) throws C2292p {
        if (AbstractC21322p.m21681O(str)) {
            return C16460h.f51065f;
        }
        C16472t c16472t = (C16472t) AbstractC17680n.m19351a0(AbstractC8645h4.m9313b(str));
        String str2 = c16472t.f51109a;
        int iM21678L = AbstractC21322p.m21678L(str2, '/', 0, false, 6);
        if (iM21678L == -1) {
            if (AbstractC16544l.m18089b(AbstractC21322p.m21711s0(str2).toString(), Separators.STAR)) {
                return C16460h.f51065f;
            }
            throw new C2292p("Bad Content-Type format: ".concat(str));
        }
        String strSubstring = str2.substring(0, iM21678L);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        String string = AbstractC21322p.m21711s0(strSubstring).toString();
        if (string.length() == 0) {
            throw new C2292p("Bad Content-Type format: ".concat(str));
        }
        String strSubstring2 = str2.substring(iM21678L + 1);
        AbstractC16544l.m18093f(strSubstring2, "substring(...)");
        String string2 = AbstractC21322p.m21711s0(strSubstring2).toString();
        if (AbstractC21322p.m21668B(string, ' ') || AbstractC21322p.m21668B(string2, ' ')) {
            throw new C2292p("Bad Content-Type format: ".concat(str));
        }
        if (string2.length() == 0 || AbstractC21322p.m21668B(string2, '/')) {
            throw new C2292p("Bad Content-Type format: ".concat(str));
        }
        return new C16460h(string, string2, c16472t.f51110b);
    }

    /* JADX INFO: renamed from: b */
    public static void m9271b(ViewGroup viewGroup, boolean z6) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z6);
        } else if (f26455a) {
            try {
                viewGroup.suppressLayout(z6);
            } catch (NoSuchMethodError unused) {
                f26455a = false;
            }
        }
    }
}
