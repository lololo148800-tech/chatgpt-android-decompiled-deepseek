package p1113xn;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p523V9.AbstractC7974Q5;

/* JADX INFO: renamed from: xn.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C21313g {

    /* JADX INFO: renamed from: b */
    public static final C21313g f67740b = new C21313g();

    /* JADX INFO: renamed from: a */
    public final boolean f67741a = true;

    public C21313g() {
        if (AbstractC7974Q5.m8275b("")) {
            return;
        }
        AbstractC7974Q5.m8275b("");
    }

    /* JADX INFO: renamed from: a */
    public final void m21656a(String str, StringBuilder sb2) {
        AbstractC10763a.m11067y(sb2, str, "prefix = \"", "", "\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("suffix = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("removeLeadingZeros = ");
        sb2.append(false);
        sb2.append(',');
        sb2.append('\n');
        sb2.append(str);
        sb2.append("minLength = ");
        sb2.append(1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NumberHexFormat(\n");
        m21656a("    ", sb2);
        sb2.append('\n');
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
