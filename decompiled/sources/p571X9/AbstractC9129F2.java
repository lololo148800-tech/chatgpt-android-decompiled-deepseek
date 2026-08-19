package p571X9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17328E;
import mo.C17352s;
import p026Ao.C0675i;
import p1113xn.C21307a;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: X9.F2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9129F2 {
    /* JADX INFO: renamed from: a */
    public static final void m9667a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    /* JADX INFO: renamed from: b */
    public static C17328E m9668b(String string, C17352s c17352s) {
        C17352s c17352sM9858d;
        AbstractC16544l.m18094g(string, "<this>");
        Charset charset = C21307a.f67720a;
        Pattern pattern = C17352s.f55296e;
        Charset charsetM19029a = c17352s.m19029a(null);
        if (charsetM19029a == null) {
            c17352sM9858d = AbstractC9282f0.m9858d(c17352s + "; charset=utf-8");
        } else {
            c17352sM9858d = c17352s;
            charset = charsetM19029a;
        }
        C0675i c0675i = new C0675i();
        AbstractC16544l.m18094g(charset, "charset");
        int length = string.length();
        AbstractC16544l.m18094g(string, "string");
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("endIndex < beginIndex: ", length, 0, " < ").toString());
        }
        if (length > string.length()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(length, "endIndex > string.length: ", " > ");
            sbM11057o.append(string.length());
            throw new IllegalArgumentException(sbM11057o.toString().toString());
        }
        if (charset.equals(C21307a.f67720a)) {
            c0675i.m1443k1(0, length, string);
        } else {
            String strSubstring = string.substring(0, length);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
            byte[] bytes = strSubstring.getBytes(charset);
            AbstractC16544l.m18093f(bytes, "getBytes(...)");
            c0675i.m1435e1(bytes, 0, bytes.length);
        }
        return new C17328E(c17352sM9858d, c0675i.f1970Z, c0675i, 0);
    }
}
