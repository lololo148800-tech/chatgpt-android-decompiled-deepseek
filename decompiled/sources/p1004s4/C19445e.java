package p1004s4;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.text.Layout;
import android.text.TextUtils;
import bb.AbstractC11281F;
import bb.AbstractC11320m;
import bb.C11282G;
import bb.C11300Z;
import bb.C11306c0;
import bb.C11312f0;
import cn.UfGr.EhBykzn;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p003A1.AbstractC0168G;
import p030B2.C0781s;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20801c;
import p1073w3.AbstractC20817s;
import p1073w3.InterfaceC20802d;
import p479Td.AbstractC7360k;
import p547Wc.AbstractC8757A;
import p571X9.AbstractC9306j0;
import p791hj.C14522e;
import p885m4.C17159i;
import p885m4.C17162l;
import p885m4.InterfaceC17157g;
import p885m4.InterfaceC17163m;

/* JADX INFO: renamed from: s4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C19445e implements InterfaceC17163m {

    /* JADX INFO: renamed from: Z */
    public static final Pattern f61670Z = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: o0 */
    public static final Pattern f61671o0 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: p0 */
    public static final Pattern f61672p0 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: q0 */
    public static final Pattern f61673q0 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: r0 */
    public static final Pattern f61674r0 = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: s0 */
    public static final Pattern f61675s0 = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: t0 */
    public static final Pattern f61676t0 = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: u0 */
    public static final C19444d f61677u0 = new C19444d(30.0f, 1, 1);

    /* JADX INFO: renamed from: Y */
    public final XmlPullParserFactory f61678Y;

    public C19445e() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f61678Y = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C19447g m20527a(C19447g c19447g) {
        return c19447g == null ? new C19447g() : c19447g;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20528b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* JADX INFO: renamed from: d */
    public static int m20529d(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f61676t0.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC20800b.m21332t("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z6 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i11 = Integer.parseInt(strGroup2);
            if (i10 == 0 || i11 == 0) {
                z6 = false;
            }
            AbstractC20800b.m21315c("Invalid cell resolution " + i10 + Separators.f31991SP + i11, z6);
            return i11;
        } catch (NumberFormatException unused) {
            AbstractC20800b.m21332t("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m20530e(String str, C19447g c19447g) throws C17159i {
        Matcher matcher;
        int i10 = AbstractC20817s.f66106a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f61672p0;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new C17159i(AbstractC10763a.m11056n(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, Separators.DOT));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            AbstractC20800b.m21332t(EhBykzn.QzQwIUsKJhTPBGa, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new C17159i(AbstractC10763a.m11054l("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                c19447g.f61698j = 3;
                break;
            case "em":
                c19447g.f61698j = 2;
                break;
            case "px":
                c19447g.f61698j = 1;
                break;
            default:
                throw new C17159i(AbstractC10763a.m11054l("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        c19447g.f61699k = Float.parseFloat(strGroup2);
    }

    /* JADX INFO: renamed from: f */
    public static C19444d m20531f(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = AbstractC20817s.f66106a;
            String[] strArrSplit = attributeValue2.split(Separators.f31991SP, -1);
            AbstractC20800b.m21315c("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f10 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f10 = 1.0f;
        }
        C19444d c19444d = f61677u0;
        int i12 = c19444d.f61668b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new C19444d(i10 * f10, i12, attributeValue4 != null ? Integer.parseInt(attributeValue4) : c19444d.f61669c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x024d A[LOOP:0: B:3:0x000a->B:104:0x024d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x0122  */
    /* JADX WARN: Code duplicated, block: B:46:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x012a  */
    /* JADX WARN: Code duplicated, block: B:52:0x015e  */
    /* JADX WARN: Code duplicated, block: B:54:0x016d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0176  */
    /* JADX WARN: Code duplicated, block: B:58:0x017a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0182  */
    /* JADX WARN: Code duplicated, block: B:62:0x0192  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ef  */
    /* JADX INFO: renamed from: g */
    public static void m20532g(XmlPullParser xmlPullParser, HashMap map, int i10, C0781s c0781s, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strM21326n;
        float f10;
        float f11;
        String strM21326n2;
        Matcher matcher;
        Matcher matcher2;
        float f12;
        float f13;
        String strM21326n3;
        int i11;
        String strM21326n4;
        int i12;
        String strM7787d;
        String strM7787d2;
        String[] strArrSplit;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            xmlPullParser.next();
            if (AbstractC20800b.m21329q(xmlPullParser, "style")) {
                String strM21326n5 = AbstractC20800b.m21326n(xmlPullParser, "style");
                C19447g c19447gM20534j = m20534j(xmlPullParser, new C19447g());
                if (strM21326n5 != null) {
                    String strTrim = strM21326n5.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[i14];
                    } else {
                        int i15 = AbstractC20817s.f66106a;
                        strArrSplit = strTrim.split("\\s+", i13);
                    }
                    int length = strArrSplit.length;
                    for (int i16 = i14; i16 < length; i16++) {
                        c19447gM20534j.m20537a((C19447g) map.get(strArrSplit[i16]));
                    }
                }
                String str = c19447gM20534j.f61700l;
                if (str != null) {
                    map.put(str, c19447gM20534j);
                }
            } else {
                if (AbstractC20800b.m21329q(xmlPullParser, "region")) {
                    String strM21326n6 = AbstractC20800b.m21326n(xmlPullParser, ParameterNames.f31999ID);
                    C19446f c19446f = null;
                    if (strM21326n6 != null) {
                        String strM21326n7 = AbstractC20800b.m21326n(xmlPullParser, "origin");
                        if (strM21326n7 != null) {
                            Pattern pattern = f61674r0;
                            Matcher matcher3 = pattern.matcher(strM21326n7);
                            Pattern pattern2 = f61675s0;
                            Matcher matcher4 = pattern2.matcher(strM21326n7);
                            if (matcher3.matches()) {
                                try {
                                    String strGroup = matcher3.group(1);
                                    strGroup.getClass();
                                    float f14 = Float.parseFloat(strGroup) / 100.0f;
                                    String strGroup2 = matcher3.group(2);
                                    strGroup2.getClass();
                                    f10 = Float.parseFloat(strGroup2) / 100.0f;
                                    f11 = f14;
                                    strM21326n2 = AbstractC20800b.m21326n(xmlPullParser, "extent");
                                    if (strM21326n2 != null) {
                                        matcher = pattern.matcher(strM21326n2);
                                        matcher2 = pattern2.matcher(strM21326n2);
                                        if (matcher.matches()) {
                                            try {
                                                String strGroup3 = matcher.group(1);
                                                strGroup3.getClass();
                                                float f15 = Float.parseFloat(strGroup3) / 100.0f;
                                                String strGroup4 = matcher.group(2);
                                                strGroup4.getClass();
                                                f12 = f15;
                                                f13 = Float.parseFloat(strGroup4) / 100.0f;
                                                strM21326n3 = AbstractC20800b.m21326n(xmlPullParser, "displayAlign");
                                                if (strM21326n3 != null) {
                                                    strM7787d2 = AbstractC7360k.m7787d(strM21326n3);
                                                    strM7787d2.getClass();
                                                    if (!strM7787d2.equals("center")) {
                                                        f10 = (f13 / 2.0f) + f10;
                                                        i11 = 1;
                                                    } else if (strM7787d2.equals("after")) {
                                                        f10 += f13;
                                                        i11 = 2;
                                                    } else {
                                                        i11 = 0;
                                                    }
                                                } else {
                                                    i11 = 0;
                                                }
                                                float f16 = 1.0f / i10;
                                                strM21326n4 = AbstractC20800b.m21326n(xmlPullParser, "writingMode");
                                                if (strM21326n4 != null) {
                                                    strM7787d = AbstractC7360k.m7787d(strM21326n4);
                                                    strM7787d.getClass();
                                                    switch (strM7787d) {
                                                        case "tb":
                                                        case "tblr":
                                                            i12 = 2;
                                                            break;
                                                        case "tbrl":
                                                            i12 = 1;
                                                            break;
                                                        default:
                                                            i12 = Integer.MIN_VALUE;
                                                            break;
                                                    }
                                                } else {
                                                    i12 = Integer.MIN_VALUE;
                                                }
                                                c19446f = new C19446f(strM21326n6, f11, f10, 0, i11, f12, f13, 1, f16, i12);
                                            } catch (NumberFormatException unused) {
                                                AbstractC20800b.m21332t("TtmlParser", "Ignoring region with malformed extent: ".concat(strM21326n7));
                                            }
                                        } else if (matcher2.matches()) {
                                            AbstractC20800b.m21332t("TtmlParser", "Ignoring region with unsupported extent: ".concat(strM21326n7));
                                        } else if (c0781s == null) {
                                            AbstractC20800b.m21332t("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strM21326n7));
                                        } else {
                                            try {
                                                String strGroup5 = matcher2.group(1);
                                                strGroup5.getClass();
                                                int i17 = Integer.parseInt(strGroup5);
                                                String strGroup6 = matcher2.group(2);
                                                strGroup6.getClass();
                                                float f17 = Integer.parseInt(strGroup6);
                                                f12 = i17 / c0781s.f2192b;
                                                f13 = f17 / c0781s.f2193c;
                                                strM21326n3 = AbstractC20800b.m21326n(xmlPullParser, "displayAlign");
                                                if (strM21326n3 != null) {
                                                    strM7787d2 = AbstractC7360k.m7787d(strM21326n3);
                                                    strM7787d2.getClass();
                                                    if (!strM7787d2.equals("center")) {
                                                        f10 = (f13 / 2.0f) + f10;
                                                        i11 = 1;
                                                    } else if (strM7787d2.equals("after")) {
                                                        i11 = 0;
                                                    } else {
                                                        f10 += f13;
                                                        i11 = 2;
                                                    }
                                                } else {
                                                    i11 = 0;
                                                }
                                                float f18 = 1.0f / i10;
                                                strM21326n4 = AbstractC20800b.m21326n(xmlPullParser, "writingMode");
                                                if (strM21326n4 != null) {
                                                    strM7787d = AbstractC7360k.m7787d(strM21326n4);
                                                    strM7787d.getClass();
                                                    switch (strM7787d) {
                                                        case 3694:
                                                            if (!strM7787d.equals("tb")) {
                                                            }
                                                            break;
                                                        case 3553396:
                                                            if (!strM7787d.equals("tblr")) {
                                                            }
                                                            break;
                                                        case 3553576:
                                                            if (!strM7787d.equals("tbrl")) {
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    /*  JADX ERROR: Method code generation error
                                                        java.lang.NullPointerException: Switch insn not found in header
                                                        	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                                                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
                                                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                        */
                                                    /*
                                                        Method dump skipped, instruction units count: 618
                                                        To view this dump add '--comments-level debug' option
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: p1004s4.C19445e.m20532g(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, B2.s, java.util.HashMap, java.util.HashMap):void");
                                                }

                                                /* JADX WARN: Code duplicated, block: B:70:0x00fb  */
                                                /* JADX INFO: renamed from: h */
                                                public static C19443c m20533h(XmlPullParser xmlPullParser, C19443c c19443c, HashMap map, C19444d c19444d) throws C17159i {
                                                    long j10;
                                                    long j11;
                                                    String[] strArrSplit;
                                                    int attributeCount = xmlPullParser.getAttributeCount();
                                                    C19447g c19447gM20534j = m20534j(xmlPullParser, null);
                                                    String[] strArr = null;
                                                    String strSubstring = null;
                                                    String str = "";
                                                    long jM20535k = -9223372036854775807L;
                                                    long jM20535k2 = -9223372036854775807L;
                                                    long jM20535k3 = -9223372036854775807L;
                                                    for (int i10 = 0; i10 < attributeCount; i10++) {
                                                        String attributeName = xmlPullParser.getAttributeName(i10);
                                                        String attributeValue = xmlPullParser.getAttributeValue(i10);
                                                        attributeName.getClass();
                                                        switch (attributeName) {
                                                            case "region":
                                                                if (map.containsKey(attributeValue)) {
                                                                    str = attributeValue;
                                                                    continue;
                                                                }
                                                                break;
                                                            case "dur":
                                                                jM20535k3 = m20535k(attributeValue, c19444d);
                                                                break;
                                                            case "end":
                                                                jM20535k2 = m20535k(attributeValue, c19444d);
                                                                break;
                                                            case "begin":
                                                                jM20535k = m20535k(attributeValue, c19444d);
                                                                break;
                                                            case "style":
                                                                String strTrim = attributeValue.trim();
                                                                if (strTrim.isEmpty()) {
                                                                    strArrSplit = new String[0];
                                                                } else {
                                                                    int i11 = AbstractC20817s.f66106a;
                                                                    strArrSplit = strTrim.split("\\s+", -1);
                                                                }
                                                                if (strArrSplit.length > 0) {
                                                                    strArr = strArrSplit;
                                                                    break;
                                                                }
                                                                break;
                                                            case "backgroundImage":
                                                                if (attributeValue.startsWith(Separators.POUND)) {
                                                                    strSubstring = attributeValue.substring(1);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    if (c19443c != null) {
                                                        long j12 = c19443c.f61657d;
                                                        j10 = -9223372036854775807L;
                                                        if (j12 != -9223372036854775807L) {
                                                            if (jM20535k != -9223372036854775807L) {
                                                                jM20535k += j12;
                                                            }
                                                            if (jM20535k2 != -9223372036854775807L) {
                                                                jM20535k2 += j12;
                                                            }
                                                        }
                                                    } else {
                                                        j10 = -9223372036854775807L;
                                                    }
                                                    if (jM20535k2 != j10) {
                                                        j11 = jM20535k2;
                                                    } else if (jM20535k3 != j10) {
                                                        j11 = jM20535k + jM20535k3;
                                                    } else if (c19443c != null) {
                                                        long j13 = c19443c.f61658e;
                                                        if (j13 != j10) {
                                                            j11 = j13;
                                                        } else {
                                                            j11 = jM20535k2;
                                                        }
                                                    } else {
                                                        j11 = jM20535k2;
                                                    }
                                                    return new C19443c(xmlPullParser.getName(), null, jM20535k, j11, c19447gM20534j, strArr, str, strSubstring, c19443c);
                                                }

                                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                                /* JADX WARN: Code duplicated, block: B:114:0x018c  */
                                                /* JADX WARN: Code duplicated, block: B:146:0x020c  */
                                                /* JADX WARN: Code duplicated, block: B:188:0x02c0  */
                                                /* JADX WARN: Code duplicated, block: B:189:0x02c5  */
                                                /* JADX WARN: Code duplicated, block: B:192:0x02d1  */
                                                /* JADX WARN: Code duplicated, block: B:194:0x02d6  */
                                                /* JADX WARN: Code duplicated, block: B:200:0x02e6  */
                                                /* JADX WARN: Code duplicated, block: B:202:0x02ee  */
                                                /* JADX WARN: Code duplicated, block: B:203:0x02f0  */
                                                /* JADX WARN: Code duplicated, block: B:205:0x02f6  */
                                                /* JADX WARN: Code duplicated, block: B:206:0x02f8  */
                                                /* JADX WARN: Code duplicated, block: B:208:0x02fb  */
                                                /* JADX WARN: Code duplicated, block: B:210:0x02fe  */
                                                /* JADX WARN: Code duplicated, block: B:211:0x0300  */
                                                /* JADX WARN: Code duplicated, block: B:212:0x0302  */
                                                /* JADX WARN: Code duplicated, block: B:241:0x03c2  */
                                                /* JADX WARN: Code duplicated, block: B:279:0x0472  */
                                                /* JADX WARN: Code duplicated, block: B:305:0x04e0  */
                                                /* JADX WARN: Code duplicated, block: B:6:0x0031  */
                                                /* JADX WARN: Code duplicated, block: B:71:0x0103  */
                                                /* JADX WARN: Failed to find 'out' block for switch in B:67:0x00eb. Please report as an issue. */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                /* JADX WARN: Type inference failed for: r11v120, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r12v14, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r16v0 */
                                                /* JADX WARN: Type inference failed for: r16v1, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r16v10, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r16v11 */
                                                /* JADX WARN: Type inference failed for: r16v2, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r16v3, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r16v4 */
                                                /* JADX WARN: Type inference failed for: r16v5 */
                                                /* JADX WARN: Type inference failed for: r16v6 */
                                                /* JADX WARN: Type inference failed for: r16v7 */
                                                /* JADX WARN: Type inference failed for: r16v8, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r16v9, types: [android.text.Layout$Alignment] */
                                                /* JADX WARN: Type inference failed for: r1v50, types: [s4.b] */
                                                /* JADX INFO: renamed from: j */
                                                public static C19447g m20534j(XmlPullParser xmlPullParser, C19447g c19447g) {
                                                    int i10;
                                                    byte b;
                                                    C11282G c11282g;
                                                    Object next;
                                                    String str;
                                                    int iHashCode;
                                                    byte b10;
                                                    int i11;
                                                    C19442b c19442b;
                                                    String str2 = "after";
                                                    int attributeCount = xmlPullParser.getAttributeCount();
                                                    C19447g c19447gM20527a = c19447g;
                                                    int i12 = 0;
                                                    while (i12 < attributeCount) {
                                                        String attributeValue = xmlPullParser.getAttributeValue(i12);
                                                        String attributeName = xmlPullParser.getAttributeName(i12);
                                                        attributeName.getClass();
                                                        ?? c19442b2 = null;
                                                        switch (attributeName) {
                                                            case "fontStyle":
                                                                str2 = str2;
                                                                c19447gM20527a = m20527a(c19447gM20527a);
                                                                c19447gM20527a.f61697i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                                i10 = 1;
                                                                break;
                                                            case "fontFamily":
                                                                str2 = str2;
                                                                c19447gM20527a = m20527a(c19447gM20527a);
                                                                c19447gM20527a.f61689a = attributeValue;
                                                                i10 = 1;
                                                                break;
                                                            case "textAlign":
                                                                str2 = str2;
                                                                c19447gM20527a = m20527a(c19447gM20527a);
                                                                String strM7787d = AbstractC7360k.m7787d(attributeValue);
                                                                strM7787d.getClass();
                                                                switch (strM7787d) {
                                                                    case "center":
                                                                        c19442b2 = Layout.Alignment.ALIGN_CENTER;
                                                                        break;
                                                                    case "end":
                                                                    case "right":
                                                                        c19442b2 = Layout.Alignment.ALIGN_OPPOSITE;
                                                                        break;
                                                                    case "left":
                                                                    case "start":
                                                                        c19442b2 = Layout.Alignment.ALIGN_NORMAL;
                                                                        break;
                                                                }
                                                                c19447gM20527a.f61703o = c19442b2;
                                                                i10 = 1;
                                                                break;
                                                            case "textDecoration":
                                                                str2 = str2;
                                                                String strM7787d2 = AbstractC7360k.m7787d(attributeValue);
                                                                strM7787d2.getClass();
                                                                switch (strM7787d2) {
                                                                    case "nounderline":
                                                                        c19447gM20527a = m20527a(c19447gM20527a);
                                                                        c19447gM20527a.f61695g = 0;
                                                                        break;
                                                                    case "underline":
                                                                        c19447gM20527a = m20527a(c19447gM20527a);
                                                                        c19447gM20527a.f61695g = 1;
                                                                        break;
                                                                    case "nolinethrough":
                                                                        c19447gM20527a = m20527a(c19447gM20527a);
                                                                        c19447gM20527a.f61694f = 0;
                                                                        break;
                                                                    case "linethrough":
                                                                        c19447gM20527a = m20527a(c19447gM20527a);
                                                                        c19447gM20527a.f61694f = 1;
                                                                    default:
                                                                        break;
                                                                }
                                                                i10 = 1;
                                                                break;
                                                            case "fontWeight":
                                                                str2 = str2;
                                                                c19447gM20527a = m20527a(c19447gM20527a);
                                                                c19447gM20527a.f61696h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                                i10 = 1;
                                                                break;
                                                            case "id":
                                                                str2 = str2;
                                                                if ("style".equals(xmlPullParser.getName())) {
                                                                    c19447gM20527a = m20527a(c19447gM20527a);
                                                                    c19447gM20527a.f61700l = attributeValue;
                                                                }
                                                                i10 = 1;
                                                                break;
                                                            case "ruby":
                                                                str2 = str2;
                                                                String strM7787d3 = AbstractC7360k.m7787d(attributeValue);
                                                                strM7787d3.getClass();
                                                                switch (strM7787d3) {
                                                                    case "baseContainer":
                                                                    case "base":
                                                                        c19447gM20527a = m20527a(c19447gM20527a);
                                                                        c19447gM20527a.f61701m = 2;
                                                                        break;
                                                                    case "container":
                                                                        c19447gM20527a = m20527a(c19447gM20527a);
                                                                        c19447gM20527a.f61701m = 1;
                                                                        break;
                                                                    case "delimiter":
                                                                        c19447gM20527a = m20527a(c19447gM20527a);
                                                                        c19447gM20527a.f61701m = 4;
                                                                        break;
                                                                    case "textContainer":
                                                                    case "text":
                                                                        c19447gM20527a = m20527a(c19447gM20527a);
                                                                        c19447gM20527a.f61701m = 3;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                i10 = 1;
                                                                break;
                                                            case "color":
                                                                str2 = str2;
                                                                c19447gM20527a = m20527a(c19447gM20527a);
                                                                try {
                                                                    c19447gM20527a.f61690b = AbstractC20801c.m21334a(attributeValue, false);
                                                                    c19447gM20527a.f61691c = true;
                                                                    break;
                                                                } catch (IllegalArgumentException unused) {
                                                                    AbstractC0168G.m508C("Failed parsing color value: ", attributeValue, "TtmlParser");
                                                                }
                                                                i10 = 1;
                                                                break;
                                                            case "shear":
                                                                str2 = str2;
                                                                C19447g c19447gM20527a2 = m20527a(c19447gM20527a);
                                                                Matcher matcher = f61673q0.matcher(attributeValue);
                                                                float fMin = Float.MAX_VALUE;
                                                                if (matcher.matches()) {
                                                                    try {
                                                                        String strGroup = matcher.group(1);
                                                                        strGroup.getClass();
                                                                        fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                                                                    } catch (NumberFormatException e10) {
                                                                        AbstractC20800b.m21333u("TtmlParser", "Failed to parse shear: " + attributeValue, e10);
                                                                    }
                                                                    break;
                                                                } else {
                                                                    AbstractC0168G.m508C("Invalid value for shear: ", attributeValue, "TtmlParser");
                                                                }
                                                                c19447gM20527a2.f61707s = fMin;
                                                                c19447gM20527a = c19447gM20527a2;
                                                                i10 = 1;
                                                                break;
                                                            case "textCombine":
                                                                str2 = str2;
                                                                String strM7787d4 = AbstractC7360k.m7787d(attributeValue);
                                                                strM7787d4.getClass();
                                                                if (strM7787d4.equals("all")) {
                                                                    c19447gM20527a = m20527a(c19447gM20527a);
                                                                    c19447gM20527a.f61705q = 1;
                                                                } else if (strM7787d4.equals("none")) {
                                                                    c19447gM20527a = m20527a(c19447gM20527a);
                                                                    c19447gM20527a.f61705q = 0;
                                                                }
                                                                i10 = 1;
                                                                break;
                                                            case "fontSize":
                                                                str2 = str2;
                                                                try {
                                                                    c19447gM20527a = m20527a(c19447gM20527a);
                                                                    m20530e(attributeValue, c19447gM20527a);
                                                                    break;
                                                                } catch (C17159i unused2) {
                                                                    AbstractC0168G.m508C("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                                                                }
                                                                i10 = 1;
                                                                break;
                                                            case "textEmphasis":
                                                                c19447gM20527a = m20527a(c19447gM20527a);
                                                                Pattern pattern = C19442b.f61646d;
                                                                if (attributeValue == null) {
                                                                    str2 = str2;
                                                                } else {
                                                                    String strM7787d5 = AbstractC7360k.m7787d(attributeValue.trim());
                                                                    if (strM7787d5.isEmpty()) {
                                                                        str2 = str2;
                                                                    } else {
                                                                        String[] strArrSplit = TextUtils.split(strM7787d5, C19442b.f61646d);
                                                                        int length = strArrSplit.length;
                                                                        AbstractC11281F abstractC11281FM12704s = length != 0 ? length != 1 ? AbstractC11281F.m12704s(strArrSplit.length, (Object[]) strArrSplit.clone()) : new C11312f0(strArrSplit[0]) : C11300Z.f34205v0;
                                                                        C11282G c11282g2 = new C11282G(AbstractC11320m.m12731k(C19442b.f61650h, abstractC11281FM12704s));
                                                                        String str3 = (String) (c11282g2.hasNext() ? c11282g2.next() : "outside");
                                                                        int iHashCode2 = str3.hashCode();
                                                                        if (iHashCode2 != -1392885889) {
                                                                            if (iHashCode2 != -1106037339) {
                                                                                if (iHashCode2 == 92734940 && str3.equals(str2)) {
                                                                                    b = 0;
                                                                                } else {
                                                                                    b = -1;
                                                                                }
                                                                            } else if (str3.equals("outside")) {
                                                                                b = 1;
                                                                            } else {
                                                                                b = -1;
                                                                            }
                                                                        } else if (str3.equals("before")) {
                                                                            b = 2;
                                                                        } else {
                                                                            b = -1;
                                                                        }
                                                                        int i13 = b != 0 ? b != 1 ? 1 : -2 : 2;
                                                                        C11306c0 c11306c0M12731k = AbstractC11320m.m12731k(C19442b.f61647e, abstractC11281FM12704s);
                                                                        if (c11306c0M12731k.isEmpty()) {
                                                                            C11306c0 c11306c0M12731k2 = AbstractC11320m.m12731k(C19442b.f61649g, abstractC11281FM12704s);
                                                                            C11306c0 c11306c0M12731k3 = AbstractC11320m.m12731k(C19442b.f61648f, abstractC11281FM12704s);
                                                                            if (c11306c0M12731k2.isEmpty() && c11306c0M12731k3.isEmpty()) {
                                                                                str2 = str2;
                                                                                c19442b2 = new C19442b(-1, 0, i13);
                                                                            } else {
                                                                                C11282G c11282g3 = new C11282G(c11306c0M12731k2);
                                                                                String str4 = (String) (c11282g3.hasNext() ? c11282g3.next() : "filled");
                                                                                int iHashCode3 = str4.hashCode();
                                                                                if (iHashCode3 != -1274499742) {
                                                                                    int i14 = (iHashCode3 == 3417674 && str4.equals("open")) ? 2 : 1;
                                                                                    c11282g = new C11282G(c11306c0M12731k3);
                                                                                    if (c11282g.hasNext()) {
                                                                                        next = c11282g.next();
                                                                                    } else {
                                                                                        next = "circle";
                                                                                    }
                                                                                    str = (String) next;
                                                                                    iHashCode = str.hashCode();
                                                                                    if (iHashCode != -1360216880) {
                                                                                        if (iHashCode != -905816648) {
                                                                                            if (iHashCode != 99657 && str.equals("dot")) {
                                                                                                b10 = 0;
                                                                                            } else {
                                                                                                b10 = -1;
                                                                                            }
                                                                                        } else if (str.equals("sesame")) {
                                                                                            b10 = 1;
                                                                                        } else {
                                                                                            b10 = -1;
                                                                                        }
                                                                                    } else if (str.equals("circle")) {
                                                                                        b10 = 2;
                                                                                    } else {
                                                                                        b10 = -1;
                                                                                    }
                                                                                    if (b10 != 0) {
                                                                                        i11 = 2;
                                                                                    } else if (b10 != 1) {
                                                                                        i11 = 1;
                                                                                    } else {
                                                                                        i11 = 3;
                                                                                    }
                                                                                    c19442b = new C19442b(i11, i14, i13);
                                                                                } else {
                                                                                    str4.equals("filled");
                                                                                }
                                                                                c11282g = new C11282G(c11306c0M12731k3);
                                                                                if (c11282g.hasNext()) {
                                                                                    next = c11282g.next();
                                                                                } else {
                                                                                    next = "circle";
                                                                                }
                                                                                str = (String) next;
                                                                                iHashCode = str.hashCode();
                                                                                if (iHashCode != -1360216880) {
                                                                                    if (iHashCode != -905816648) {
                                                                                        if (iHashCode != 99657) {
                                                                                            b10 = -1;
                                                                                        } else {
                                                                                            b10 = 0;
                                                                                        }
                                                                                    } else if (str.equals("sesame")) {
                                                                                        b10 = 1;
                                                                                    } else {
                                                                                        b10 = -1;
                                                                                    }
                                                                                } else if (str.equals("circle")) {
                                                                                    b10 = 2;
                                                                                } else {
                                                                                    b10 = -1;
                                                                                }
                                                                                if (b10 != 0) {
                                                                                    i11 = 2;
                                                                                } else if (b10 != 1) {
                                                                                    i11 = 1;
                                                                                } else {
                                                                                    i11 = 3;
                                                                                }
                                                                                c19442b = new C19442b(i11, i14, i13);
                                                                            }
                                                                        } else {
                                                                            String str5 = (String) new C11282G(c11306c0M12731k).next();
                                                                            int iHashCode4 = str5.hashCode();
                                                                            if (iHashCode4 != 3005871) {
                                                                                int i15 = (iHashCode4 == 3387192 && str5.equals("none")) ? 0 : -1;
                                                                                c19442b = new C19442b(i15, 0, i13);
                                                                            } else {
                                                                                str5.equals("auto");
                                                                            }
                                                                            c19442b = new C19442b(i15, 0, i13);
                                                                        }
                                                                        c19442b2 = c19442b;
                                                                    }
                                                                }
                                                                c19447gM20527a.f61706r = c19442b2;
                                                                i10 = 1;
                                                                break;
                                                            case "rubyPosition":
                                                                String strM7787d6 = AbstractC7360k.m7787d(attributeValue);
                                                                strM7787d6.getClass();
                                                                if (strM7787d6.equals("before")) {
                                                                    c19447gM20527a = m20527a(c19447gM20527a);
                                                                    c19447gM20527a.f61702n = 1;
                                                                } else if (strM7787d6.equals(str2)) {
                                                                    c19447gM20527a = m20527a(c19447gM20527a);
                                                                    c19447gM20527a.f61702n = 2;
                                                                }
                                                                str2 = str2;
                                                                i10 = 1;
                                                                break;
                                                            case "backgroundColor":
                                                                c19447gM20527a = m20527a(c19447gM20527a);
                                                                try {
                                                                    c19447gM20527a.f61692d = AbstractC20801c.m21334a(attributeValue, false);
                                                                    c19447gM20527a.f61693e = true;
                                                                    break;
                                                                } catch (IllegalArgumentException unused3) {
                                                                    AbstractC0168G.m508C("Failed parsing background value: ", attributeValue, "TtmlParser");
                                                                }
                                                                str2 = str2;
                                                                i10 = 1;
                                                                break;
                                                            case "multiRowAlign":
                                                                c19447gM20527a = m20527a(c19447gM20527a);
                                                                String strM7787d7 = AbstractC7360k.m7787d(attributeValue);
                                                                strM7787d7.getClass();
                                                                switch (strM7787d7) {
                                                                    case "center":
                                                                        c19442b2 = Layout.Alignment.ALIGN_CENTER;
                                                                        break;
                                                                    case "end":
                                                                    case "right":
                                                                        c19442b2 = Layout.Alignment.ALIGN_OPPOSITE;
                                                                        break;
                                                                    case "left":
                                                                    case "start":
                                                                        c19442b2 = Layout.Alignment.ALIGN_NORMAL;
                                                                        break;
                                                                }
                                                                c19447gM20527a.f61704p = c19442b2;
                                                                str2 = str2;
                                                                i10 = 1;
                                                                break;
                                                            default:
                                                                str2 = str2;
                                                                i10 = 1;
                                                                break;
                                                        }
                                                        i12 += i10;
                                                        str2 = str2;
                                                    }
                                                    return c19447gM20527a;
                                                }

                                                /* JADX INFO: renamed from: k */
                                                public static long m20535k(String str, C19444d c19444d) throws C17159i {
                                                    double d10;
                                                    double d11;
                                                    byte b = 4;
                                                    Matcher matcher = f61670Z.matcher(str);
                                                    if (matcher.matches()) {
                                                        String strGroup = matcher.group(1);
                                                        strGroup.getClass();
                                                        double d12 = Long.parseLong(strGroup) * 3600;
                                                        String strGroup2 = matcher.group(2);
                                                        strGroup2.getClass();
                                                        double d13 = d12 + (Long.parseLong(strGroup2) * 60);
                                                        String strGroup3 = matcher.group(3);
                                                        strGroup3.getClass();
                                                        double d14 = d13 + Long.parseLong(strGroup3);
                                                        String strGroup4 = matcher.group(4);
                                                        double d15 = d14 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
                                                        String strGroup5 = matcher.group(5);
                                                        double d16 = d15 + (strGroup5 != null ? Long.parseLong(strGroup5) / c19444d.f61667a : 0.0d);
                                                        String strGroup6 = matcher.group(6);
                                                        return (long) ((d16 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) c19444d.f61668b)) / ((double) c19444d.f61667a) : 0.0d)) * 1000000.0d);
                                                    }
                                                    Matcher matcher2 = f61671o0.matcher(str);
                                                    if (!matcher2.matches()) {
                                                        throw new C17159i(AbstractC9306j0.m9889h("Malformed time expression: ", str));
                                                    }
                                                    String strGroup7 = matcher2.group(1);
                                                    strGroup7.getClass();
                                                    double d17 = Double.parseDouble(strGroup7);
                                                    String strGroup8 = matcher2.group(2);
                                                    strGroup8.getClass();
                                                    switch (strGroup8.hashCode()) {
                                                        case 102:
                                                            b = !strGroup8.equals("f") ? (byte) -1 : (byte) 0;
                                                            break;
                                                        case 104:
                                                            b = !strGroup8.equals("h") ? (byte) -1 : (byte) 1;
                                                            break;
                                                        case 109:
                                                            b = !strGroup8.equals("m") ? (byte) -1 : (byte) 2;
                                                            break;
                                                        case 116:
                                                            b = !strGroup8.equals("t") ? (byte) -1 : (byte) 3;
                                                            break;
                                                        case 3494:
                                                            if (!strGroup8.equals("ms")) {
                                                                b = -1;
                                                            }
                                                            break;
                                                        default:
                                                            b = -1;
                                                            break;
                                                    }
                                                    switch (b) {
                                                        case 0:
                                                            d10 = c19444d.f61667a;
                                                            d17 /= d10;
                                                            return (long) (d17 * 1000000.0d);
                                                        case 1:
                                                            d11 = 3600.0d;
                                                            break;
                                                        case 2:
                                                            d11 = 60.0d;
                                                            break;
                                                        case 3:
                                                            d10 = c19444d.f61669c;
                                                            d17 /= d10;
                                                            return (long) (d17 * 1000000.0d);
                                                        case 4:
                                                            d10 = 1000.0d;
                                                            d17 /= d10;
                                                            return (long) (d17 * 1000000.0d);
                                                        default:
                                                            return (long) (d17 * 1000000.0d);
                                                    }
                                                    d17 *= d11;
                                                    return (long) (d17 * 1000000.0d);
                                                }

                                                /* JADX INFO: renamed from: l */
                                                public static C0781s m20536l(XmlPullParser xmlPullParser) {
                                                    String strM21326n = AbstractC20800b.m21326n(xmlPullParser, "extent");
                                                    if (strM21326n == null) {
                                                        return null;
                                                    }
                                                    Matcher matcher = f61675s0.matcher(strM21326n);
                                                    if (!matcher.matches()) {
                                                        AbstractC20800b.m21332t("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strM21326n));
                                                        return null;
                                                    }
                                                    try {
                                                        String strGroup = matcher.group(1);
                                                        strGroup.getClass();
                                                        int i10 = Integer.parseInt(strGroup);
                                                        String strGroup2 = matcher.group(2);
                                                        strGroup2.getClass();
                                                        return new C0781s(i10, Integer.parseInt(strGroup2), 8);
                                                    } catch (NumberFormatException unused) {
                                                        AbstractC20800b.m21332t("TtmlParser", "Ignoring malformed tts extent: ".concat(strM21326n));
                                                        return null;
                                                    }
                                                }

                                                @Override // p885m4.InterfaceC17163m
                                                /* JADX INFO: renamed from: c */
                                                public final /* synthetic */ void mo3514c() {
                                                }

                                                @Override // p885m4.InterfaceC17163m
                                                /* JADX INFO: renamed from: i */
                                                public final InterfaceC17157g mo3516i(byte[] bArr, int i10, int i11) {
                                                    C19444d c19444d;
                                                    try {
                                                        XmlPullParser xmlPullParserNewPullParser = this.f61678Y.newPullParser();
                                                        HashMap map = new HashMap();
                                                        HashMap map2 = new HashMap();
                                                        HashMap map3 = new HashMap();
                                                        map2.put("", new C19446f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                                                        C0781s c0781sM20536l = null;
                                                        xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
                                                        ArrayDeque arrayDeque = new ArrayDeque();
                                                        C19444d c19444dM20531f = f61677u0;
                                                        int iM20529d = 15;
                                                        C14522e c14522e = null;
                                                        int i12 = 0;
                                                        for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                                            C19443c c19443c = (C19443c) arrayDeque.peek();
                                                            if (i12 == 0) {
                                                                String name = xmlPullParserNewPullParser.getName();
                                                                if (eventType == 2) {
                                                                    if ("tt".equals(name)) {
                                                                        c19444dM20531f = m20531f(xmlPullParserNewPullParser);
                                                                        iM20529d = m20529d(xmlPullParserNewPullParser);
                                                                        c0781sM20536l = m20536l(xmlPullParserNewPullParser);
                                                                    }
                                                                    C0781s c0781s = c0781sM20536l;
                                                                    C19444d c19444d2 = c19444dM20531f;
                                                                    int i13 = iM20529d;
                                                                    if (m20528b(name)) {
                                                                        if ("head".equals(name)) {
                                                                            c19444d = c19444d2;
                                                                            m20532g(xmlPullParserNewPullParser, map, i13, c0781s, map2, map3);
                                                                        } else {
                                                                            c19444d = c19444d2;
                                                                            try {
                                                                                C19443c c19443cM20533h = m20533h(xmlPullParserNewPullParser, c19443c, map2, c19444d);
                                                                                arrayDeque.push(c19443cM20533h);
                                                                                if (c19443c != null) {
                                                                                    if (c19443c.f61666m == null) {
                                                                                        c19443c.f61666m = new ArrayList();
                                                                                    }
                                                                                    c19443c.f61666m.add(c19443cM20533h);
                                                                                }
                                                                            } catch (C17159i e10) {
                                                                                AbstractC20800b.m21333u("TtmlParser", "Suppressing parser error", e10);
                                                                                i12++;
                                                                            }
                                                                        }
                                                                        c19444dM20531f = c19444d;
                                                                    } else {
                                                                        AbstractC20800b.m21327o("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                                                                        i12++;
                                                                        c19444dM20531f = c19444d2;
                                                                    }
                                                                    c0781sM20536l = c0781s;
                                                                    iM20529d = i13;
                                                                } else if (eventType == 4) {
                                                                    c19443c.getClass();
                                                                    C19443c c19443cM20518a = C19443c.m20518a(xmlPullParserNewPullParser.getText());
                                                                    if (c19443c.f61666m == null) {
                                                                        c19443c.f61666m = new ArrayList();
                                                                    }
                                                                    c19443c.f61666m.add(c19443cM20518a);
                                                                } else if (eventType == 3) {
                                                                    if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                                                        C19443c c19443c2 = (C19443c) arrayDeque.peek();
                                                                        c19443c2.getClass();
                                                                        c14522e = new C14522e(c19443c2, map, map2, map3);
                                                                    }
                                                                    arrayDeque.pop();
                                                                }
                                                            } else if (eventType == 2) {
                                                                i12++;
                                                            } else if (eventType == 3) {
                                                                i12--;
                                                            }
                                                            xmlPullParserNewPullParser.next();
                                                        }
                                                        c14522e.getClass();
                                                        return c14522e;
                                                    } catch (IOException e11) {
                                                        throw new IllegalStateException("Unexpected error when reading input.", e11);
                                                    } catch (XmlPullParserException e12) {
                                                        throw new IllegalStateException("Unable to decode source", e12);
                                                    }
                                                }

                                                @Override // p885m4.InterfaceC17163m
                                                /* JADX INFO: renamed from: o */
                                                public final void mo3519o(byte[] bArr, int i10, int i11, C17162l c17162l, InterfaceC20802d interfaceC20802d) {
                                                    AbstractC8757A.m9527h(mo3516i(bArr, i10, i11), c17162l, interfaceC20802d);
                                                }
                                            }
