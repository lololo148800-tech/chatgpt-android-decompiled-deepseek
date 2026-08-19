package p1113xn;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p523V9.AbstractC7974Q5;

/* JADX INFO: renamed from: xn.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C21312f {

    /* JADX INFO: renamed from: c */
    public static final C21312f f67737c = new C21312f();

    /* JADX INFO: renamed from: a */
    public final boolean f67738a = true;

    /* JADX INFO: renamed from: b */
    public final boolean f67739b = true;

    public C21312f() {
        if (AbstractC7974Q5.m8275b("  ") || AbstractC7974Q5.m8275b("") || AbstractC7974Q5.m8275b("")) {
            return;
        }
        AbstractC7974Q5.m8275b("");
    }

    /* JADX INFO: renamed from: a */
    public final void m21655a(String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append("bytesPerLine = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(Separators.COMMA);
        sb2.append('\n');
        sb2.append(str);
        sb2.append("bytesPerGroup = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(Separators.COMMA);
        sb2.append('\n');
        sb2.append(str);
        sb2.append("groupSeparator = \"");
        sb2.append("  ");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("byteSeparator = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        AbstractC10763a.m11067y(sb2, str, "bytePrefix = \"", "", "\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("byteSuffix = \"");
        sb2.append("");
        sb2.append(Separators.DOUBLE_QUOTE);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BytesHexFormat(\n");
        m21655a("    ", sb2);
        sb2.append('\n');
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
