package p857kl;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: kl.v */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16474v {

    /* JADX INFO: renamed from: a */
    public static final Set f51114a = AbstractC17678l.m19293P(new Character[]{'(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', ' ', '\t', '\n', '\r'});

    /* JADX INFO: renamed from: a */
    public static final boolean m18045a(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (str.length() >= 2 && AbstractC21322p.m21673G(str) == '\"' && AbstractC21322p.m21682P(str) == '\"') {
            int i10 = 1;
            do {
                int iM21678L = AbstractC21322p.m21678L(str, '\"', i10, false, 4);
                if (iM21678L == AbstractC21322p.m21674H(str)) {
                    break;
                }
                int i11 = 0;
                for (int i12 = iM21678L - 1; str.charAt(i12) == '\\'; i12--) {
                    i11++;
                }
                if (i11 % 2 != 0) {
                    i10 = iM21678L + 1;
                }
            } while (i10 < str.length());
            return false;
        }
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            if (f51114a.contains(Character.valueOf(str.charAt(i13)))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final String m18046b(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        StringBuilder sb2 = new StringBuilder(Separators.DOUBLE_QUOTE);
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\t') {
                sb2.append("\\t");
            } else if (cCharAt == '\n') {
                sb2.append("\\n");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else if (cCharAt != '\\') {
                sb2.append(cCharAt);
            } else {
                sb2.append("\\\\");
            }
        }
        sb2.append(Separators.DOUBLE_QUOTE);
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }
}
