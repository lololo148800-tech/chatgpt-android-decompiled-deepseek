package p1032u4;

import java.util.regex.Pattern;
import p1073w3.C20811m;

/* JADX INFO: renamed from: u4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20107a {

    /* JADX INFO: renamed from: c */
    public static final Pattern f63691c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f63692d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final C20811m f63693a = new C20811m();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f63694b = new StringBuilder();

    /* JADX INFO: renamed from: a */
    public static String m20946a(C20811m c20811m, StringBuilder sb2) {
        boolean z6 = false;
        sb2.setLength(0);
        int i10 = c20811m.f66093b;
        int i11 = c20811m.f66094c;
        while (i10 < i11 && !z6) {
            char c9 = (char) c20811m.f66092a[i10];
            if ((c9 < 'A' || c9 > 'Z') && ((c9 < 'a' || c9 > 'z') && !((c9 >= '0' && c9 <= '9') || c9 == '#' || c9 == '-' || c9 == '.' || c9 == '_'))) {
                z6 = true;
            } else {
                i10++;
                sb2.append(c9);
            }
        }
        c20811m.m21345G(i10 - c20811m.f66093b);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m20947b(C20811m c20811m, StringBuilder sb2) {
        m20948c(c20811m);
        if (c20811m.m21346a() == 0) {
            return null;
        }
        String strM20946a = m20946a(c20811m, sb2);
        if (!"".equals(strM20946a)) {
            return strM20946a;
        }
        return "" + ((char) c20811m.m21365t());
    }

    /* JADX INFO: renamed from: c */
    public static void m20948c(C20811m c20811m) {
        while (true) {
            for (boolean z6 = true; c20811m.m21346a() > 0 && z6; z6 = false) {
                int i10 = c20811m.f66093b;
                byte[] bArr = c20811m.f66092a;
                byte b = bArr[i10];
                char c9 = (char) b;
                if (c9 == '\t' || c9 == '\n' || c9 == '\f' || c9 == '\r' || c9 == ' ') {
                    c20811m.m21345G(1);
                } else {
                    int i11 = c20811m.f66094c;
                    int i12 = i10 + 2;
                    if (i12 <= i11) {
                        int i13 = i10 + 1;
                        if (b == 47 && bArr[i13] == 42) {
                            while (true) {
                                int i14 = i12 + 1;
                                if (i14 >= i11) {
                                    break;
                                }
                                if (((char) bArr[i12]) == '*' && ((char) bArr[i14]) == '/') {
                                    i12 += 2;
                                    i11 = i12;
                                } else {
                                    i12 = i14;
                                }
                            }
                            c20811m.m21345G(i11 - c20811m.f66093b);
                        }
                    }
                }
            }
            return;
        }
    }
}
