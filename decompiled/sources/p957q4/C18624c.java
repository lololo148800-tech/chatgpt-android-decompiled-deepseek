package p957q4;

import android.gov.nist.core.Separators;
import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: q4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18624c {

    /* JADX INFO: renamed from: a */
    public static final Pattern f59332a = Pattern.compile("\\{([^}]*)\\}");

    /* JADX INFO: renamed from: b */
    public static final Pattern f59333b;

    /* JADX INFO: renamed from: c */
    public static final Pattern f59334c;

    /* JADX INFO: renamed from: d */
    public static final Pattern f59335d;

    static {
        int i10 = AbstractC20817s.f66106a;
        Locale locale = Locale.US;
        f59333b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f59334c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f59335d = Pattern.compile("\\\\an(\\d+)");
    }

    /* JADX INFO: renamed from: a */
    public static PointF m19980a(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f59333b.matcher(str);
        Matcher matcher2 = f59334c.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                AbstractC20800b.m21327o("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + Separators.QUOTE);
            }
            strGroup = matcher.group(1);
            strGroup2 = matcher.group(2);
        } else {
            if (!zFind2) {
                return null;
            }
            strGroup = matcher2.group(1);
            strGroup2 = matcher2.group(2);
        }
        strGroup.getClass();
        float f10 = Float.parseFloat(strGroup.trim());
        strGroup2.getClass();
        return new PointF(f10, Float.parseFloat(strGroup2.trim()));
    }
}
