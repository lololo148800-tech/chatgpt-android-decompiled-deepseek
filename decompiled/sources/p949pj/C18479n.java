package p949pj;

import android.gov.nist.core.Separators;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p1113xn.C21319m;
import p1113xn.EnumC21320n;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: pj.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C18479n extends AbstractC18481o {

    /* JADX INFO: renamed from: a */
    public final String f58923a;

    public C18479n(String str) {
        this.f58923a = str;
    }

    @Override // p949pj.AbstractC18481o
    /* JADX INFO: renamed from: a */
    public final String mo19878a() {
        return this.f58923a;
    }

    /* JADX INFO: renamed from: b */
    public final C18453a m19879b() {
        C21319m c21319m = C18453a.f58871o;
        String str = this.f58923a;
        String input = AbstractC21322p.m21711s0(str).toString();
        EnumC21320n enumC21320n = EnumC21320n.MULTILINE;
        Pattern patternCompile = Pattern.compile("^@\n\\u001e\r(ANSI |AAMVA)\\d{10}.+", 32);
        AbstractC16544l.m18093f(patternCompile, "compile(...)");
        AbstractC16544l.m18094g(input, "input");
        if (patternCompile.matcher(input).matches()) {
            C21319m c21319m2 = C18453a.f58877u;
            if (C18490u.m19882c(str, c21319m2) != null) {
                C21319m c21319m3 = C18453a.f58881y;
                if (C18490u.m19882c(str, c21319m3) != null) {
                    return new C18453a(C18490u.m19882c(str, c21319m2), C18490u.m19882c(str, C18453a.f58870A), C18490u.m19882c(str, c21319m3), C18490u.m19882c(str, C18453a.f58878v), C18490u.m19882c(str, C18453a.f58873q), C18490u.m19882c(str, C18453a.f58871o), C18490u.m19882c(str, C18453a.f58872p), C18490u.m19882c(str, C18453a.f58874r), C18490u.m19882c(str, C18453a.f58882z), C18490u.m19881b(C18490u.m19882c(str, C18453a.f58879w)), C18490u.m19881b(C18490u.m19882c(str, C18453a.f58876t)), C18490u.m19881b(C18490u.m19882c(str, C18453a.f58875s)), C18490u.m19882c(str, C18453a.f58880x));
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18479n) && AbstractC16544l.m18089b(this.f58923a, ((C18479n) obj).f58923a);
    }

    public final int hashCode() {
        return this.f58923a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f58923a, Separators.RPAREN, new StringBuilder("Pdf417BarcodeInfo(extractionRawPayload="));
    }
}
