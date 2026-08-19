package p1073w3;

import android.gov.nist.core.Separators;
import android.graphics.Color;
import android.text.TextUtils;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p037B9.MeDP.MpoABj;
import p1071w0.AbstractC20734X;
import p479Td.AbstractC7360k;
import p806ia.nJAW.FpwNpGDhomXHZ;
import p882m1.clb.WGTYqNchEpHca;
import sj.hJY.CsqksqyPE;

/* JADX INFO: renamed from: w3.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20801c {

    /* JADX INFO: renamed from: a */
    public static final Pattern f66067a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f66068b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c */
    public static final Pattern f66069c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d */
    public static final HashMap f66070d;

    /* JADX INFO: renamed from: a */
    public static int m21334a(String str, boolean z6) {
        int i10;
        AbstractC20800b.m21316d(!TextUtils.isEmpty(str));
        String strReplace = str.replace(Separators.f31991SP, "");
        if (strReplace.charAt(0) == '#') {
            int i11 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i11;
            }
            if (strReplace.length() == 9) {
                return ((i11 & 255) << 24) | (i11 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z6 ? f66069c : f66068b).matcher(strReplace);
            if (matcher.matches()) {
                if (z6) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i10 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i10 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i12 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i13 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i10, i12, i13, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f66067a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i14 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i15 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i14, i15, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f66070d.get(AbstractC7360k.m7787d(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    static {
        HashMap map = new HashMap();
        f66070d = map;
        AbstractC20734X.m21225B(-984833, map, "aliceblue", -332841, "antiquewhite");
        AbstractC20734X.m21227D(map, "aqua", -16711681, -8388652, "aquamarine");
        AbstractC20734X.m21225B(-983041, map, "azure", -657956, "beige");
        AbstractC20734X.m21225B(-6972, map, "bisque", -16777216, "black");
        AbstractC20734X.m21225B(-5171, map, "blanchedalmond", -16776961, "blue");
        AbstractC20734X.m21225B(-7722014, map, "blueviolet", -5952982, "brown");
        AbstractC20734X.m21225B(-2180985, map, "burlywood", -10510688, "cadetblue");
        AbstractC20734X.m21225B(-8388864, map, "chartreuse", -2987746, "chocolate");
        AbstractC20734X.m21225B(-32944, map, "coral", -10185235, "cornflowerblue");
        AbstractC20734X.m21225B(-1828, map, "cornsilk", -2354116, "crimson");
        AbstractC20734X.m21227D(map, "cyan", -16711681, -16777077, "darkblue");
        AbstractC20734X.m21225B(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        AbstractC20734X.m21227D(map, "darkgray", -5658199, -16751616, "darkgreen");
        AbstractC20734X.m21227D(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        AbstractC20734X.m21225B(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        AbstractC20734X.m21225B(-29696, map, "darkorange", -6737204, FpwNpGDhomXHZ.FcrsdJG);
        AbstractC20734X.m21225B(-7667712, map, "darkred", -1468806, "darksalmon");
        AbstractC20734X.m21225B(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put(VjclRfeKsMflo.WeKMZQXW, -13676721);
        map.put("darkslategrey", -13676721);
        AbstractC20734X.m21227D(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        AbstractC20734X.m21225B(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        AbstractC20734X.m21227D(map, MpoABj.KZecGqjqRxJjFo, -14774017, -5103070, "firebrick");
        AbstractC20734X.m21225B(-1296, map, CsqksqyPE.PeV, -14513374, "forestgreen");
        AbstractC20734X.m21227D(map, "fuchsia", -65281, -2302756, "gainsboro");
        AbstractC20734X.m21225B(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        AbstractC20734X.m21225B(-16744448, map, "green", -5374161, "greenyellow");
        AbstractC20734X.m21227D(map, "grey", -8355712, -983056, "honeydew");
        AbstractC20734X.m21225B(-38476, map, "hotpink", -3318692, "indianred");
        AbstractC20734X.m21225B(-11861886, map, "indigo", -16, "ivory");
        AbstractC20734X.m21225B(-989556, map, "khaki", -1644806, "lavender");
        AbstractC20734X.m21225B(-3851, map, "lavenderblush", -8586240, "lawngreen");
        AbstractC20734X.m21225B(-1331, map, "lemonchiffon", -5383962, "lightblue");
        AbstractC20734X.m21225B(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        AbstractC20734X.m21225B(-18751, map, "lightpink", -24454, "lightsalmon");
        AbstractC20734X.m21225B(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        AbstractC20734X.m21227D(map, "lightsteelblue", -5192482, -32, "lightyellow");
        AbstractC20734X.m21225B(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        AbstractC20734X.m21225B(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        AbstractC20734X.m21225B(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        AbstractC20734X.m21225B(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        AbstractC20734X.m21225B(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        AbstractC20734X.m21225B(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        AbstractC20734X.m21225B(-15132304, map, "midnightblue", -655366, "mintcream");
        AbstractC20734X.m21225B(-6943, map, "mistyrose", -6987, "moccasin");
        AbstractC20734X.m21225B(-8531, map, "navajowhite", -16777088, "navy");
        AbstractC20734X.m21225B(-133658, map, "oldlace", -8355840, "olive");
        AbstractC20734X.m21225B(-9728477, map, "olivedrab", -23296, "orange");
        AbstractC20734X.m21225B(-47872, map, "orangered", -2461482, "orchid");
        AbstractC20734X.m21225B(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        AbstractC20734X.m21225B(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        AbstractC20734X.m21225B(-4139, map, "papayawhip", -9543, "peachpuff");
        AbstractC20734X.m21225B(-3308225, map, "peru", -16181, "pink");
        AbstractC20734X.m21225B(-2252579, map, "plum", -5185306, "powderblue");
        AbstractC20734X.m21225B(-8388480, map, "purple", -10079335, "rebeccapurple");
        AbstractC20734X.m21225B(-65536, map, "red", -4419697, "rosybrown");
        AbstractC20734X.m21225B(-12490271, map, "royalblue", -7650029, "saddlebrown");
        AbstractC20734X.m21225B(-360334, map, WGTYqNchEpHca.rAspLdj, -744352, "sandybrown");
        AbstractC20734X.m21225B(-13726889, map, "seagreen", -2578, "seashell");
        AbstractC20734X.m21225B(-6270419, map, "sienna", -4144960, "silver");
        AbstractC20734X.m21225B(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        AbstractC20734X.m21227D(map, "snow", -1286, -16711809, "springgreen");
        AbstractC20734X.m21225B(-12156236, map, "steelblue", -2968436, "tan");
        AbstractC20734X.m21225B(-16744320, map, "teal", -2572328, "thistle");
        AbstractC20734X.m21225B(-40121, map, "tomato", 0, "transparent");
        AbstractC20734X.m21225B(-12525360, map, "turquoise", -1146130, "violet");
        AbstractC20734X.m21225B(-663885, map, "wheat", -1, "white");
        AbstractC20734X.m21225B(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }
}
