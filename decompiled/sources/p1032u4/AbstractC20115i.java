package p1032u4;

import android.gov.nist.core.Separators;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import p1016t3.C19755E;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p644ab.AbstractC10531d;

/* JADX INFO: renamed from: u4.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20115i {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    /* JADX INFO: renamed from: a */
    public static float m20958a(String str) {
        if (str.endsWith(Separators.PERCENT)) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* JADX INFO: renamed from: b */
    public static long m20959b(String str) {
        int i10 = AbstractC20817s.f66106a;
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrSplit.length == 2) {
            j11 += Long.parseLong(strArrSplit[1]);
        }
        return j11 * 1000;
    }

    /* JADX INFO: renamed from: c */
    public static void m20960c(C20811m c20811m) {
        int i10 = c20811m.f66093b;
        Charset charset = AbstractC10531d.f31242c;
        String strM21353h = c20811m.m21353h(charset);
        if (strM21353h == null || !strM21353h.startsWith("WEBVTT")) {
            c20811m.m21344F(i10);
            throw C19755E.m20712a(null, "Expected WEBVTT. Got " + c20811m.m21353h(charset));
        }
    }
}
