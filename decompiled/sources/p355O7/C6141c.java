package p355O7;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import fo.C13711h;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p1053v3.p1054lN.IGDwkYw;
import p138F8.vJO.vRJidSveZHcTw;
import p239Ja.C4312o;
import p257K3.C4535c;
import p284L7.C4957b;
import p305M3.C5289i;
import p449S9.C7042K;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC7933L4;
import p571X9.AbstractC9306j0;
import p615Z6.AbstractC10170B0;
import p615Z6.AbstractC10172C0;
import p615Z6.AbstractC10174D0;
import p615Z6.AbstractC10176E0;
import p615Z6.AbstractC10196V;
import p615Z6.AbstractC10199Y;
import p615Z6.AbstractC10202a0;
import p615Z6.AbstractC10204b0;
import p615Z6.AbstractC10206c0;
import p615Z6.AbstractC10210e0;
import p615Z6.AbstractC10224l0;
import p615Z6.AbstractC10228n0;
import p615Z6.AbstractC10249y;
import p615Z6.C10167A;
import p615Z6.C10168A0;
import p615Z6.C10171C;
import p615Z6.C10173D;
import p615Z6.C10175E;
import p615Z6.C10177F;
import p615Z6.C10178F0;
import p615Z6.C10179G;
import p615Z6.C10183I;
import p615Z6.C10184I0;
import p615Z6.C10185J;
import p615Z6.C10187L;
import p615Z6.C10188M;
import p615Z6.C10189N;
import p615Z6.C10190O;
import p615Z6.C10191P;
import p615Z6.C10192Q;
import p615Z6.C10193S;
import p615Z6.C10194T;
import p615Z6.C10200Z;
import p615Z6.C10205c;
import p615Z6.C10208d0;
import p615Z6.C10212f0;
import p615Z6.C10214g0;
import p615Z6.C10216h0;
import p615Z6.C10218i0;
import p615Z6.C10220j0;
import p615Z6.C10226m0;
import p615Z6.C10229o;
import p615Z6.C10230o0;
import p615Z6.C10232p0;
import p615Z6.C10233q;
import p615Z6.C10234q0;
import p615Z6.C10235r;
import p615Z6.C10237s;
import p615Z6.C10239t;
import p615Z6.C10241u;
import p615Z6.C10243v;
import p615Z6.C10245w;
import p615Z6.C10247x;
import p615Z6.EnumC10180G0;
import p615Z6.EnumC10182H0;
import p615Z6.EnumC10207d;
import p615Z6.EnumC10231p;
import p615Z6.InterfaceC10169B;
import p615Z6.InterfaceC10195U;
import p615Z6.InterfaceC10197W;
import p615Z6.InterfaceC10222k0;
import p658b5.C11234e;
import p658b5.C11238i;
import p661b7.EnumC11255b;
import p765g7.InterfaceC13823a;
import p849k7.C16360m;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: O7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6141c implements InterfaceC6142d {

    /* JADX INFO: renamed from: Y */
    public boolean f20019Y;

    /* JADX INFO: renamed from: Z */
    public int f20020Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f20021o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f20022p0;

    /* JADX INFO: renamed from: q0 */
    public Object f20023q0;

    /* JADX INFO: renamed from: r0 */
    public Object f20024r0;

    /* JADX INFO: renamed from: s0 */
    public Object f20025s0;

    /* JADX INFO: renamed from: t0 */
    public Object f20026t0;

    /* JADX INFO: renamed from: u0 */
    public Object f20027u0;

    /* JADX INFO: renamed from: A */
    public static Matrix m6677A(String str) throws C10168A0 {
        Matrix matrix = new Matrix();
        C4312o c4312o = new C4312o(str);
        c4312o.m5081M();
        while (!c4312o.m5098q()) {
            String strSubstring = null;
            if (!c4312o.m5098q()) {
                int i10 = c4312o.f14016b;
                String str2 = (String) c4312o.f14018d;
                int iCharAt = str2.charAt(i10);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = c4312o.m5089h();
                    }
                }
                int i11 = c4312o.f14016b;
                while (C4312o.m5068x(iCharAt)) {
                    iCharAt = c4312o.m5089h();
                }
                if (iCharAt == 40) {
                    c4312o.f14016b++;
                    strSubstring = str2.substring(i10, i11);
                } else {
                    c4312o.f14016b = i10;
                }
            }
            if (strSubstring == null) {
                throw new C10168A0("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    c4312o.m5081M();
                    float fM5106z = c4312o.m5106z();
                    c4312o.m5080L();
                    float fM5106z2 = c4312o.m5106z();
                    c4312o.m5080L();
                    float fM5106z3 = c4312o.m5106z();
                    c4312o.m5080L();
                    float fM5106z4 = c4312o.m5106z();
                    c4312o.m5080L();
                    float fM5106z5 = c4312o.m5106z();
                    c4312o.m5080L();
                    float fM5106z6 = c4312o.m5106z();
                    c4312o.m5081M();
                    if (Float.isNaN(fM5106z6) || !c4312o.m5094m(')')) {
                        throw new C10168A0("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fM5106z, fM5106z3, fM5106z5, fM5106z2, fM5106z4, fM5106z6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    c4312o.m5081M();
                    float fM5106z7 = c4312o.m5106z();
                    float fM5077I = c4312o.m5077I();
                    float fM5077I2 = c4312o.m5077I();
                    c4312o.m5081M();
                    if (Float.isNaN(fM5106z7) || !c4312o.m5094m(')')) {
                        throw new C10168A0("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fM5077I)) {
                        matrix.preRotate(fM5106z7);
                    } else {
                        if (Float.isNaN(fM5077I2)) {
                            throw new C10168A0("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fM5106z7, fM5077I, fM5077I2);
                    }
                    break;
                    break;
                case "scale":
                    c4312o.m5081M();
                    float fM5106z8 = c4312o.m5106z();
                    float fM5077I3 = c4312o.m5077I();
                    c4312o.m5081M();
                    if (Float.isNaN(fM5106z8) || !c4312o.m5094m(')')) {
                        throw new C10168A0("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM5077I3)) {
                        matrix.preScale(fM5106z8, fM5077I3);
                    } else {
                        matrix.preScale(fM5106z8, fM5106z8);
                    }
                    break;
                    break;
                case "skewX":
                    c4312o.m5081M();
                    float fM5106z9 = c4312o.m5106z();
                    c4312o.m5081M();
                    if (Float.isNaN(fM5106z9) || !c4312o.m5094m(')')) {
                        throw new C10168A0("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fM5106z9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    c4312o.m5081M();
                    float fM5106z10 = c4312o.m5106z();
                    c4312o.m5081M();
                    if (Float.isNaN(fM5106z10) || !c4312o.m5094m(')')) {
                        throw new C10168A0("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fM5106z10)));
                    break;
                    break;
                case "translate":
                    c4312o.m5081M();
                    float fM5106z11 = c4312o.m5106z();
                    float fM5077I4 = c4312o.m5077I();
                    c4312o.m5081M();
                    if (Float.isNaN(fM5106z11) || !c4312o.m5094m(')')) {
                        throw new C10168A0("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM5077I4)) {
                        matrix.preTranslate(fM5106z11, fM5077I4);
                    } else {
                        matrix.preTranslate(fM5106z11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new C10168A0(AbstractC10763a.m11054l("Invalid transform list fn: ", strSubstring, Separators.RPAREN));
            }
            if (c4312o.m5098q()) {
                return matrix;
            }
            c4312o.m5080L();
        }
        return matrix;
    }

    /* JADX INFO: renamed from: c */
    public static int m6679c(float f10) {
        if (f10 < 0.0f) {
            return 0;
        }
        if (f10 > 255.0f) {
            return 255;
        }
        return Math.round(f10);
    }

    /* JADX INFO: renamed from: e */
    public static int m6680e(float f10, float f11, float f12) {
        float f13 = 0.0f;
        float f14 = f10 % 360.0f;
        if (f10 < 0.0f) {
            f14 += 360.0f;
        }
        float f15 = f14 / 60.0f;
        float f16 = f11 / 100.0f;
        float f17 = f12 / 100.0f;
        if (f16 < 0.0f) {
            f16 = 0.0f;
        } else if (f16 > 1.0f) {
            f16 = 1.0f;
        }
        if (f17 >= 0.0f) {
            f13 = f17 > 1.0f ? 1.0f : f17;
        }
        float f18 = f13 <= 0.5f ? (f16 + 1.0f) * f13 : (f13 + f16) - (f16 * f13);
        float f19 = (f13 * 2.0f) - f18;
        return m6679c(m6681f(f19, f18, f15 - 2.0f) * 256.0f) | (m6679c(m6681f(f19, f18, f15 + 2.0f) * 256.0f) << 16) | (m6679c(m6681f(f19, f18, f15) * 256.0f) << 8);
    }

    /* JADX INFO: renamed from: f */
    public static float m6681f(float f10, float f11, float f12) {
        if (f12 < 0.0f) {
            f12 += 6.0f;
        }
        if (f12 >= 6.0f) {
            f12 -= 6.0f;
        }
        if (f12 < 1.0f) {
            return AbstractC12107L1.m13818i(f11, f10, f12, f10);
        }
        if (f12 < 3.0f) {
            return f11;
        }
        return f12 < 4.0f ? AbstractC12107L1.m13818i(4.0f, f12, f11 - f10, f10) : f10;
    }

    /* JADX INFO: renamed from: g */
    public static void m6682g(InterfaceC10195U interfaceC10195U, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int iM9886e = AbstractC9306j0.m9886e(attributes, i10);
            if (iM9886e != 73) {
                switch (iM9886e) {
                    case 52:
                        C4312o c4312o = new C4312o(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!c4312o.m5098q()) {
                            String strM5071C = c4312o.m5071C();
                            if (strM5071C.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strM5071C.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            c4312o.m5081M();
                        }
                        interfaceC10195U.mo10777d(hashSet);
                        break;
                    case 53:
                        interfaceC10195U.mo10780g(strTrim);
                        break;
                    case 54:
                        C4312o c4312o2 = new C4312o(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!c4312o2.m5098q()) {
                            hashSet2.add(c4312o2.m5071C());
                            c4312o2.m5081M();
                        }
                        interfaceC10195U.mo10781h(hashSet2);
                        break;
                    case 55:
                        ArrayList arrayListM6693r = m6693r(strTrim);
                        interfaceC10195U.mo10779f(arrayListM6693r != null ? new HashSet(arrayListM6693r) : new HashSet(0));
                        break;
                }
            } else {
                C4312o c4312o3 = new C4312o(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!c4312o3.m5098q()) {
                    String strM5071C2 = c4312o3.m5071C();
                    int iIndexOf = strM5071C2.indexOf(45);
                    if (iIndexOf != -1) {
                        strM5071C2 = strM5071C2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strM5071C2, "", "").getLanguage());
                    c4312o3.m5081M();
                }
                interfaceC10195U.mo10782i(hashSet3);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m6683h(AbstractC10199Y abstractC10199Y, Attributes attributes) throws C10168A0 {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals(ParameterNames.f31999ID) || qName.equals("xml:id")) {
                abstractC10199Y.f30305c = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i10).trim();
                if ("default".equals(strTrim)) {
                    abstractC10199Y.f30306d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new C10168A0(AbstractC9306j0.m9889h("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    abstractC10199Y.f30306d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m6684i(AbstractC10249y abstractC10249y, Attributes attributes) throws C10168A0 {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int iM9886e = AbstractC9306j0.m9886e(attributes, i10);
            if (iM9886e == 23) {
                abstractC10249y.f30442j = m6677A(strTrim);
            } else if (iM9886e != 24) {
                if (iM9886e != 26) {
                    if (iM9886e != 60) {
                        continue;
                    } else {
                        try {
                            abstractC10249y.f30443k = AbstractC9306j0.m9904w(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new C10168A0(AbstractC10763a.m11054l("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                        }
                    }
                } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                    abstractC10249y.f30444l = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                abstractC10249y.f30441i = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new C10168A0("Invalid value for attribute gradientUnits");
                }
                abstractC10249y.f30441i = Boolean.TRUE;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m6685j(C10188M c10188m, Attributes attributes, String str) throws C10168A0 {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (EnumC10180G0.m10772a(attributes.getLocalName(i10)) == EnumC10180G0.f30199h1) {
                C4312o c4312o = new C4312o(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                c4312o.m5081M();
                while (!c4312o.m5098q()) {
                    float fM5106z = c4312o.m5106z();
                    if (Float.isNaN(fM5106z)) {
                        throw new C10168A0(AbstractC10763a.m11054l("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    c4312o.m5080L();
                    float fM5106z2 = c4312o.m5106z();
                    if (Float.isNaN(fM5106z2)) {
                        throw new C10168A0(AbstractC10763a.m11054l("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    c4312o.m5080L();
                    arrayList.add(Float.valueOf(fM5106z));
                    arrayList.add(Float.valueOf(fM5106z2));
                }
                c10188m.f30248o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    c10188m.f30248o[i11] = ((Float) it.next()).floatValue();
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m6686k(AbstractC10199Y abstractC10199Y, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (strTrim.length() != 0) {
                int iM9886e = AbstractC9306j0.m9886e(attributes, i10);
                if (iM9886e == 0) {
                    C10205c c10205c = new C10205c(strTrim);
                    ArrayList arrayList = null;
                    while (!c10205c.m5098q()) {
                        String strM5071C = c10205c.m5071C();
                        if (strM5071C != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strM5071C);
                            c10205c.m5081M();
                        }
                    }
                    abstractC10199Y.f30309g = arrayList;
                } else if (iM9886e != 72) {
                    if (abstractC10199Y.f30307e == null) {
                        abstractC10199Y.f30307e = new C10193S();
                    }
                    m6678E(abstractC10199Y.f30307e, attributes.getLocalName(i10), attributes.getValue(i10).trim());
                } else {
                    C4312o c4312o = new C4312o(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strM5072D = c4312o.m5072D(':', false);
                        c4312o.m5081M();
                        if (!c4312o.m5094m(':')) {
                            break;
                        }
                        c4312o.m5081M();
                        String strM5072D2 = c4312o.m5072D(';', true);
                        if (strM5072D2 == null) {
                            break;
                        }
                        c4312o.m5081M();
                        if (c4312o.m5098q() || c4312o.m5094m(';')) {
                            if (abstractC10199Y.f30308f == null) {
                                abstractC10199Y.f30308f = new C10193S();
                            }
                            m6678E(abstractC10199Y.f30308f, strM5072D, strM5072D2);
                            c4312o.m5081M();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m6687l(AbstractC10228n0 abstractC10228n0, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int iM9886e = AbstractC9306j0.m9886e(attributes, i10);
            if (iM9886e == 9) {
                abstractC10228n0.f30363p = m6696u(strTrim);
            } else if (iM9886e == 10) {
                abstractC10228n0.f30364q = m6696u(strTrim);
            } else if (iM9886e == 82) {
                abstractC10228n0.f30361n = m6696u(strTrim);
            } else if (iM9886e == 83) {
                abstractC10228n0.f30362o = m6696u(strTrim);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m6688m(InterfaceC10169B interfaceC10169B, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (EnumC10180G0.m10772a(attributes.getLocalName(i10)) == EnumC10180G0.f30157K1) {
                interfaceC10169B.mo10763k(m6677A(attributes.getValue(i10)));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m6689n(AbstractC10210e0 abstractC10210e0, Attributes attributes) throws C10168A0 {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int iM9886e = AbstractC9306j0.m9886e(attributes, i10);
            if (iM9886e == 48) {
                m6700y(abstractC10210e0, strTrim);
            } else if (iM9886e != 80) {
                continue;
            } else {
                C4312o c4312o = new C4312o(strTrim);
                c4312o.m5081M();
                float fM5106z = c4312o.m5106z();
                c4312o.m5080L();
                float fM5106z2 = c4312o.m5106z();
                c4312o.m5080L();
                float fM5106z3 = c4312o.m5106z();
                c4312o.m5080L();
                float fM5106z4 = c4312o.m5106z();
                if (Float.isNaN(fM5106z) || Float.isNaN(fM5106z2) || Float.isNaN(fM5106z3) || Float.isNaN(fM5106z4)) {
                    throw new C10168A0("Invalid viewBox definition - should have four numbers");
                }
                if (fM5106z3 < 0.0f) {
                    throw new C10168A0("Invalid viewBox. width cannot be negative");
                }
                if (fM5106z4 < 0.0f) {
                    throw new C10168A0("Invalid viewBox. height cannot be negative");
                }
                abstractC10210e0.f30328o = new C10235r(fM5106z, fM5106z2, fM5106z3, fM5106z4);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static C10241u m6690o(String str) throws C10168A0 {
        long j10;
        int i10;
        if (str.charAt(0) == '#') {
            int length = str.length();
            C5289i c5289i = null;
            if (1 < length) {
                long j11 = 0;
                int i11 = 1;
                while (true) {
                    if (i11 < length) {
                        char cCharAt = str.charAt(i11);
                        if (cCharAt < '0' || cCharAt > '9') {
                            if (cCharAt >= 'A' && cCharAt <= 'F') {
                                j10 = j11 * 16;
                                i10 = cCharAt - 'A';
                            } else if (cCharAt >= 'a' && cCharAt <= 'f') {
                                j10 = j11 * 16;
                                i10 = cCharAt - 'a';
                            }
                            j11 = j10 + ((long) i10) + 10;
                        } else {
                            j11 = (j11 * 16) + ((long) (cCharAt - '0'));
                        }
                        if (j11 <= 4294967295L) {
                            i11++;
                        }
                    }
                    if (i11 != 1) {
                        c5289i = new C5289i(j11, i11);
                    }
                }
            }
            if (c5289i == null) {
                throw new C10168A0("Bad hex colour value: ".concat(str));
            }
            long j12 = c5289i.f17431b;
            int i12 = c5289i.f17430a;
            if (i12 == 4) {
                int i13 = (int) j12;
                int i14 = i13 & 3840;
                int i15 = i13 & 240;
                int i16 = i13 & 15;
                return new C10241u(i16 | (i14 << 8) | (-16777216) | (i14 << 12) | (i15 << 8) | (i15 << 4) | (i16 << 4));
            }
            if (i12 != 5) {
                if (i12 == 7) {
                    return new C10241u(((int) j12) | (-16777216));
                }
                if (i12 != 9) {
                    throw new C10168A0("Bad hex colour value: ".concat(str));
                }
                int i17 = (int) j12;
                return new C10241u((i17 >>> 8) | (i17 << 24));
            }
            int i18 = (int) j12;
            int i19 = 61440 & i18;
            int i20 = i18 & 3840;
            int i21 = i18 & 240;
            int i22 = i18 & 15;
            return new C10241u((i22 << 24) | (i22 << 28) | (i19 << 8) | (i19 << 4) | (i20 << 4) | i20 | i21 | (i21 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            C4312o c4312o = new C4312o(str.substring(zStartsWith ? 5 : 4));
            c4312o.m5081M();
            float fM5106z = c4312o.m5106z();
            if (!Float.isNaN(fM5106z) && c4312o.m5094m('%')) {
                fM5106z = (fM5106z * 256.0f) / 100.0f;
            }
            float fM5092k = c4312o.m5092k(fM5106z);
            if (!Float.isNaN(fM5092k) && c4312o.m5094m('%')) {
                fM5092k = (fM5092k * 256.0f) / 100.0f;
            }
            float fM5092k2 = c4312o.m5092k(fM5092k);
            if (!Float.isNaN(fM5092k2) && c4312o.m5094m('%')) {
                fM5092k2 = (fM5092k2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                c4312o.m5081M();
                if (Float.isNaN(fM5092k2) || !c4312o.m5094m(')')) {
                    throw new C10168A0("Bad rgb() colour value: ".concat(str));
                }
                return new C10241u((m6679c(fM5106z) << 16) | (-16777216) | (m6679c(fM5092k) << 8) | m6679c(fM5092k2));
            }
            float fM5092k3 = c4312o.m5092k(fM5092k2);
            c4312o.m5081M();
            if (Float.isNaN(fM5092k3) || !c4312o.m5094m(')')) {
                throw new C10168A0("Bad rgba() colour value: ".concat(str));
            }
            return new C10241u((m6679c(fM5092k3 * 256.0f) << 24) | (m6679c(fM5106z) << 16) | (m6679c(fM5092k) << 8) | m6679c(fM5092k2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) AbstractC10172C0.f30116a.get(lowerCase);
            if (num != null) {
                return new C10241u(num.intValue());
            }
            throw new C10168A0("Invalid colour keyword: ".concat(lowerCase));
        }
        C4312o c4312o2 = new C4312o(str.substring(zStartsWith2 ? 5 : 4));
        c4312o2.m5081M();
        float fM5106z2 = c4312o2.m5106z();
        float fM5092k4 = c4312o2.m5092k(fM5106z2);
        if (!Float.isNaN(fM5092k4)) {
            c4312o2.m5094m('%');
        }
        float fM5092k5 = c4312o2.m5092k(fM5092k4);
        if (!Float.isNaN(fM5092k5)) {
            c4312o2.m5094m('%');
        }
        if (!zStartsWith2) {
            c4312o2.m5081M();
            if (Float.isNaN(fM5092k5) || !c4312o2.m5094m(')')) {
                throw new C10168A0("Bad hsl() colour value: ".concat(str));
            }
            return new C10241u(m6680e(fM5106z2, fM5092k4, fM5092k5) | (-16777216));
        }
        float fM5092k6 = c4312o2.m5092k(fM5092k5);
        c4312o2.m5081M();
        if (Float.isNaN(fM5092k6) || !c4312o2.m5094m(')')) {
            throw new C10168A0("Bad hsla() colour value: ".concat(str));
        }
        return new C10241u((m6679c(fM5092k6 * 256.0f) << 24) | m6680e(fM5106z2, fM5092k4, fM5092k5));
    }

    /* JADX INFO: renamed from: p */
    public static float m6691p(int i10, String str) throws C10168A0 {
        float fM10793a = new C10229o().m10793a(0, i10, str);
        if (Float.isNaN(fM10793a)) {
            throw new C10168A0(AbstractC9306j0.m9889h("Invalid float value: ", str));
        }
        return fM10793a;
    }

    /* JADX INFO: renamed from: q */
    public static float m6692q(String str) throws C10168A0 {
        int length = str.length();
        if (length != 0) {
            return m6691p(length, str);
        }
        throw new C10168A0("Invalid float value (empty string)");
    }

    /* JADX INFO: renamed from: r */
    public static ArrayList m6693r(String str) {
        C4312o c4312o = new C4312o(str);
        ArrayList arrayList = null;
        do {
            String strM5070B = c4312o.m5070B();
            if (strM5070B == null) {
                strM5070B = c4312o.m5072D(',', true);
            }
            if (strM5070B == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strM5070B);
            c4312o.m5080L();
        } while (!c4312o.m5098q());
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static String m6694s(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(Separators.RPAREN) ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static C10173D m6695t(String str) throws C10168A0 {
        int iM9905x;
        if (str.length() == 0) {
            throw new C10168A0("Invalid length value (empty string)");
        }
        int length = str.length();
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            iM9905x = 9;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                iM9905x = AbstractC9306j0.m9905x(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new C10168A0("Invalid length unit specifier: ".concat(str));
            }
        } else {
            iM9905x = 1;
        }
        try {
            return new C10173D(iM9905x, m6691p(length, str));
        } catch (NumberFormatException e10) {
            throw new C10168A0("Invalid length value: ".concat(str), e10);
        }
    }

    /* JADX INFO: renamed from: u */
    public static ArrayList m6696u(String str) throws C10168A0 {
        String str2;
        if (str.length() == 0) {
            throw new C10168A0("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        C4312o c4312o = new C4312o(str);
        c4312o.m5081M();
        while (!c4312o.m5098q()) {
            float fM5106z = c4312o.m5106z();
            if (Float.isNaN(fM5106z)) {
                StringBuilder sb2 = new StringBuilder("Invalid length list value: ");
                int i10 = c4312o.f14016b;
                while (true) {
                    boolean zM5098q = c4312o.m5098q();
                    str2 = (String) c4312o.f14018d;
                    if (zM5098q || C4312o.m5068x(str2.charAt(c4312o.f14016b))) {
                        break;
                    }
                    c4312o.f14016b++;
                }
                String strSubstring = str2.substring(i10, c4312o.f14016b);
                c4312o.f14016b = i10;
                sb2.append(strSubstring);
                throw new C10168A0(sb2.toString());
            }
            int iM5073E = c4312o.m5073E();
            if (iM5073E == 0) {
                iM5073E = 1;
            }
            arrayList.add(new C10173D(iM5073E, fM5106z));
            c4312o.m5080L();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public static C10173D m6697v(C4312o c4312o) {
        return c4312o.m5095n("auto") ? new C10173D(0.0f) : c4312o.m5069A();
    }

    /* JADX INFO: renamed from: w */
    public static Float m6698w(String str) {
        try {
            float fM6692q = m6692q(str);
            float f10 = 0.0f;
            if (fM6692q < 0.0f) {
                fM6692q = f10;
            } else {
                f10 = 1.0f;
                if (fM6692q > 1.0f) {
                    fM6692q = f10;
                }
            }
            return Float.valueOf(fM6692q);
        } catch (C10168A0 unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: x */
    public static AbstractC10204b0 m6699x(String str) {
        boolean zStartsWith = str.startsWith("url(");
        AbstractC10204b0 abstractC10204b0M6690o = C10241u.f30415o0;
        C10243v c10243v = C10243v.f30419Y;
        AbstractC10204b0 abstractC10204b0 = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return abstractC10204b0M6690o;
            }
            if (str.equals("currentColor")) {
                return c10243v;
            }
            try {
                return m6690o(str);
            } catch (C10168A0 unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(Separators.RPAREN);
        if (iIndexOf == -1) {
            return new C10183I(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    abstractC10204b0M6690o = c10243v;
                } else {
                    try {
                        abstractC10204b0M6690o = m6690o(strTrim2);
                    } catch (C10168A0 unused2) {
                        abstractC10204b0M6690o = null;
                    }
                }
            }
            abstractC10204b0 = abstractC10204b0M6690o;
        }
        return new C10183I(strTrim, abstractC10204b0);
    }

    /* JADX INFO: renamed from: y */
    public static void m6700y(AbstractC10206c0 abstractC10206c0, String str) throws C10168A0 {
        int i10;
        C4312o c4312o = new C4312o(str);
        c4312o.m5081M();
        String strM5071C = c4312o.m5071C();
        if ("defer".equals(strM5071C)) {
            c4312o.m5081M();
            strM5071C = c4312o.m5071C();
        }
        EnumC10231p enumC10231p = (EnumC10231p) AbstractC10170B0.f30109a.get(strM5071C);
        c4312o.m5081M();
        if (c4312o.m5098q()) {
            i10 = 0;
        } else {
            String strM5071C2 = c4312o.m5071C();
            strM5071C2.getClass();
            if (strM5071C2.equals("meet")) {
                i10 = 1;
            } else {
                if (!strM5071C2.equals("slice")) {
                    throw new C10168A0("Invalid preserveAspectRatio definition: ".concat(str));
                }
                i10 = 2;
            }
        }
        abstractC10206c0.f30319n = new C10233q(enumC10231p, i10);
    }

    /* JADX INFO: renamed from: z */
    public static HashMap m6701z(C4312o c4312o) {
        HashMap map = new HashMap();
        c4312o.m5081M();
        String strM5072D = c4312o.m5072D('=', false);
        while (strM5072D != null) {
            c4312o.m5094m('=');
            map.put(strM5072D, c4312o.m5070B());
            c4312o.m5081M();
            strM5072D = c4312o.m5072D('=', false);
        }
        return map;
    }

    /* JADX INFO: renamed from: B */
    public void m6702B(InputStream inputStream) throws C10168A0 {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            C10178F0 c10178f0 = new C10178F0(this);
            xMLReader.setContentHandler(c10178f0);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", c10178f0);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e10) {
            throw new C10168A0("Stream error", e10);
        } catch (ParserConfigurationException e11) {
            throw new C10168A0("XML parser problem", e11);
        } catch (SAXException e12) {
            throw new C10168A0("SVG parse error", e12);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m6703C(InputStream inputStream) throws C10168A0 {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                C10184I0 c10184i0 = new C10184I0();
                c10184i0.f30238a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        m6705F();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        C4312o c4312o = new C4312o(xmlPullParserNewPullParser.getText());
                        String strM5071C = c4312o.m5071C();
                        m6701z(c4312o);
                        strM5071C.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (((C10194T) ((C13711h) this.f20023q0).f43259Z) == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                m6702B(inputStream);
                                return;
                            } catch (IOException unused) {
                                AbstractC15256t.m16482t("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        m6706G(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, c10184i0);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        m6711d(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        m6708I(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        m6707H(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (XmlPullParserException e10) {
                throw new C10168A0("XML parser problem", e10);
            }
        } catch (IOException e11) {
            throw new C10168A0("Stream error", e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x031e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0325  */
    /* JADX WARN: Code duplicated, block: B:148:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0343 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: D */
    public void m6704D(Attributes attributes) throws C10168A0 {
        int iIntValue;
        float fM5106z;
        char c9;
        int i10;
        char cCharAt;
        C6141c c6141c = this;
        Attributes attributes2 = attributes;
        InterfaceC10197W interfaceC10197W = (InterfaceC10197W) c6141c.f20024r0;
        if (interfaceC10197W == null) {
            throw new C10168A0("Invalid document. Root element must be <svg>");
        }
        C10185J c10185j = new C10185J();
        c10185j.f30314a = (C13711h) c6141c.f20023q0;
        c10185j.f30315b = interfaceC10197W;
        m6683h(c10185j, attributes2);
        m6686k(c10185j, attributes2);
        m6688m(c10185j, attributes2);
        m6682g(c10185j, attributes2);
        int i11 = 0;
        int i12 = 0;
        while (i12 < attributes.getLength()) {
            String strTrim = attributes2.getValue(i12).trim();
            int iM9886e = AbstractC9306j0.m9886e(attributes2, i12);
            boolean z6 = false;
            if (iM9886e == 13) {
                C4312o c4312o = new C4312o(strTrim);
                C4312o c4312o2 = new C4312o(3, (byte) 0);
                c4312o2.f14016b = i11;
                c4312o2.f14017c = i11;
                c4312o2.f14018d = new byte[8];
                c4312o2.f14019e = new float[16];
                if (!c4312o.m5098q() && ((iIntValue = c4312o.m5105y().intValue()) == 77 || iIntValue == 109)) {
                    float f10 = 0.0f;
                    float f11 = 0.0f;
                    float f12 = 0.0f;
                    float f13 = 0.0f;
                    float f14 = 0.0f;
                    float f15 = 0.0f;
                    while (true) {
                        c4312o.m5081M();
                        switch (iIntValue) {
                            case 65:
                            case 97:
                                float fM5106z2 = c4312o.m5106z();
                                float fM5092k = c4312o.m5092k(fM5106z2);
                                float fM5092k2 = c4312o.m5092k(fM5092k);
                                Boolean boolM5091j = c4312o.m5091j(Float.valueOf(fM5092k2));
                                Boolean boolM5091j2 = c4312o.m5091j(boolM5091j);
                                if (boolM5091j2 == null) {
                                    fM5106z = Float.NaN;
                                } else {
                                    c4312o.m5080L();
                                    fM5106z = c4312o.m5106z();
                                }
                                float f16 = fM5106z;
                                float fM5092k3 = c4312o.m5092k(f16);
                                if (!Float.isNaN(fM5092k3)) {
                                    z6 = false;
                                    if (fM5106z2 >= 0.0f && fM5092k >= 0.0f) {
                                        i12 = i12;
                                        c9 = 'a';
                                        if (iIntValue == 97) {
                                            f16 += f10;
                                            fM5092k3 += f12;
                                        }
                                        float f17 = fM5092k3;
                                        c4312o2.mo5085d(fM5106z2, fM5092k, fM5092k2, boolM5091j.booleanValue(), boolM5091j2.booleanValue(), f16, f17);
                                        f10 = f16;
                                        f11 = f10;
                                        f12 = f17;
                                        f13 = f12;
                                        c4312o.m5080L();
                                        if (c4312o.m5098q()) {
                                            i10 = c4312o.f14016b;
                                            if (i10 != c4312o.f14017c && (((cCharAt = ((String) c4312o.f14018d).charAt(i10)) >= c9 && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                                iIntValue = c4312o.m5105y().intValue();
                                            }
                                            z6 = z6;
                                            i12 = i12;
                                        }
                                        break;
                                    }
                                }
                                i12 = i12;
                                AbstractC15256t.m16465c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                break;
                            case 67:
                            case 99:
                                float fM5106z3 = c4312o.m5106z();
                                float fM5092k4 = c4312o.m5092k(fM5106z3);
                                float fM5092k5 = c4312o.m5092k(fM5092k4);
                                float fM5092k6 = c4312o.m5092k(fM5092k5);
                                float fM5092k7 = c4312o.m5092k(fM5092k6);
                                float fM5092k8 = c4312o.m5092k(fM5092k7);
                                if (!Float.isNaN(fM5092k8)) {
                                    if (iIntValue == 99) {
                                        fM5092k7 += f10;
                                        fM5092k8 += f12;
                                        fM5106z3 += f10;
                                        fM5092k4 += f12;
                                        fM5092k5 += f10;
                                        fM5092k6 += f12;
                                    }
                                    float f18 = fM5092k4;
                                    float f19 = fM5092k5;
                                    float f20 = fM5106z3;
                                    float f21 = fM5092k6;
                                    c4312o2.mo5084c(f20, f18, f19, f21, fM5092k7, fM5092k8);
                                    f10 = fM5092k7;
                                    f11 = f19;
                                    f13 = f21;
                                    f12 = fM5092k8;
                                    c9 = 'a';
                                    z6 = false;
                                    c4312o.m5080L();
                                    if (c4312o.m5098q()) {
                                        i10 = c4312o.f14016b;
                                        if (i10 != c4312o.f14017c) {
                                            iIntValue = c4312o.m5105y().intValue();
                                        }
                                        z6 = z6;
                                        i12 = i12;
                                    }
                                } else {
                                    AbstractC15256t.m16465c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 72:
                            case 104:
                                float fM5106z4 = c4312o.m5106z();
                                if (!Float.isNaN(fM5106z4)) {
                                    if (iIntValue == 104) {
                                        fM5106z4 += f10;
                                    }
                                    f10 = fM5106z4;
                                    c4312o2.mo5086e(f10, f12);
                                    f11 = f10;
                                    c9 = 'a';
                                    z6 = false;
                                    c4312o.m5080L();
                                    if (c4312o.m5098q()) {
                                        i10 = c4312o.f14016b;
                                        if (i10 != c4312o.f14017c) {
                                            iIntValue = c4312o.m5105y().intValue();
                                        }
                                        z6 = z6;
                                        i12 = i12;
                                    }
                                } else {
                                    AbstractC15256t.m16465c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 76:
                            case 108:
                                float fM5106z5 = c4312o.m5106z();
                                float fM5092k9 = c4312o.m5092k(fM5106z5);
                                if (!Float.isNaN(fM5092k9)) {
                                    if (iIntValue == 108) {
                                        fM5106z5 += f10;
                                        fM5092k9 += f12;
                                    }
                                    f10 = fM5106z5;
                                    f12 = fM5092k9;
                                    c4312o2.mo5086e(f10, f12);
                                    f11 = f10;
                                    f13 = f12;
                                    c9 = 'a';
                                    z6 = false;
                                    c4312o.m5080L();
                                    if (c4312o.m5098q()) {
                                        i10 = c4312o.f14016b;
                                        if (i10 != c4312o.f14017c) {
                                            iIntValue = c4312o.m5105y().intValue();
                                        }
                                        z6 = z6;
                                        i12 = i12;
                                    }
                                } else {
                                    AbstractC15256t.m16465c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 77:
                            case 109:
                                float fM5106z6 = c4312o.m5106z();
                                float fM5092k10 = c4312o.m5092k(fM5106z6);
                                if (!Float.isNaN(fM5092k10)) {
                                    if (iIntValue == 109 && c4312o2.f14016b != 0) {
                                        fM5106z6 += f10;
                                        fM5092k10 += f12;
                                    }
                                    f10 = fM5106z6;
                                    f12 = fM5092k10;
                                    c4312o2.mo5083b(f10, f12);
                                    f11 = f10;
                                    f14 = f11;
                                    f13 = f12;
                                    f15 = f13;
                                    iIntValue = iIntValue != 109 ? 76 : 108;
                                    c9 = 'a';
                                    z6 = false;
                                    c4312o.m5080L();
                                    if (c4312o.m5098q()) {
                                        i10 = c4312o.f14016b;
                                        if (i10 != c4312o.f14017c) {
                                            iIntValue = c4312o.m5105y().intValue();
                                        }
                                        z6 = z6;
                                        i12 = i12;
                                    }
                                } else {
                                    AbstractC15256t.m16465c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 81:
                            case 113:
                                float fM5106z7 = c4312o.m5106z();
                                float fM5092k11 = c4312o.m5092k(fM5106z7);
                                float fM5092k12 = c4312o.m5092k(fM5092k11);
                                float fM5092k13 = c4312o.m5092k(fM5092k12);
                                if (!Float.isNaN(fM5092k13)) {
                                    if (iIntValue == 113) {
                                        fM5092k12 += f10;
                                        fM5092k13 += f12;
                                        fM5106z7 += f10;
                                        fM5092k11 += f12;
                                    }
                                    f10 = fM5092k12;
                                    f12 = fM5092k13;
                                    f13 = fM5092k11;
                                    f11 = fM5106z7;
                                    c4312o2.mo5082a(f11, f13, f10, f12);
                                    c9 = 'a';
                                    z6 = false;
                                    c4312o.m5080L();
                                    if (c4312o.m5098q()) {
                                        i10 = c4312o.f14016b;
                                        if (i10 != c4312o.f14017c) {
                                            iIntValue = c4312o.m5105y().intValue();
                                        }
                                        z6 = z6;
                                        i12 = i12;
                                    }
                                } else {
                                    AbstractC15256t.m16465c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 83:
                            case 115:
                                float f22 = (f10 * 2.0f) - f11;
                                float f23 = (2.0f * f12) - f13;
                                float fM5106z8 = c4312o.m5106z();
                                float fM5092k14 = c4312o.m5092k(fM5106z8);
                                float fM5092k15 = c4312o.m5092k(fM5092k14);
                                float fM5092k16 = c4312o.m5092k(fM5092k15);
                                if (!Float.isNaN(fM5092k16)) {
                                    if (iIntValue == 115) {
                                        fM5092k15 += f10;
                                        fM5092k16 += f12;
                                        fM5106z8 += f10;
                                        fM5092k14 += f12;
                                    }
                                    float f24 = fM5106z8;
                                    c4312o2.mo5084c(f22, f23, f24, fM5092k14, fM5092k15, fM5092k16);
                                    f11 = f24;
                                    f13 = fM5092k14;
                                    f12 = fM5092k16;
                                    f10 = fM5092k15;
                                    c9 = 'a';
                                    z6 = false;
                                    c4312o.m5080L();
                                    if (c4312o.m5098q()) {
                                        i10 = c4312o.f14016b;
                                        if (i10 != c4312o.f14017c) {
                                            iIntValue = c4312o.m5105y().intValue();
                                        }
                                        z6 = z6;
                                        i12 = i12;
                                    }
                                } else {
                                    AbstractC15256t.m16465c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 84:
                            case 116:
                                f11 = (f10 * 2.0f) - f11;
                                f13 = (2.0f * f12) - f13;
                                float fM5106z9 = c4312o.m5106z();
                                float fM5092k17 = c4312o.m5092k(fM5106z9);
                                if (!Float.isNaN(fM5092k17)) {
                                    if (iIntValue == 116) {
                                        fM5106z9 += f10;
                                        fM5092k17 += f12;
                                    }
                                    f10 = fM5106z9;
                                    f12 = fM5092k17;
                                    c4312o2.mo5082a(f11, f13, f10, f12);
                                    i12 = i12;
                                    z6 = z6;
                                    c9 = 'a';
                                    c4312o.m5080L();
                                    if (c4312o.m5098q()) {
                                        i10 = c4312o.f14016b;
                                        if (i10 != c4312o.f14017c) {
                                            iIntValue = c4312o.m5105y().intValue();
                                        }
                                        z6 = z6;
                                        i12 = i12;
                                    }
                                } else {
                                    AbstractC15256t.m16465c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 86:
                            case 118:
                                float fM5106z10 = c4312o.m5106z();
                                if (!Float.isNaN(fM5106z10)) {
                                    if (iIntValue == 118) {
                                        fM5106z10 += f12;
                                    }
                                    f12 = fM5106z10;
                                    c4312o2.mo5086e(f10, f12);
                                    f13 = f12;
                                    c9 = 'a';
                                    c4312o.m5080L();
                                    if (c4312o.m5098q()) {
                                        i10 = c4312o.f14016b;
                                        if (i10 != c4312o.f14017c) {
                                            iIntValue = c4312o.m5105y().intValue();
                                        }
                                        z6 = z6;
                                        i12 = i12;
                                    }
                                } else {
                                    AbstractC15256t.m16465c("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 90:
                            case 122:
                                c4312o2.close();
                                f10 = f14;
                                f11 = f10;
                                f12 = f15;
                                f13 = f12;
                                c9 = 'a';
                                c4312o.m5080L();
                                if (c4312o.m5098q()) {
                                    i10 = c4312o.f14016b;
                                    if (i10 != c4312o.f14017c) {
                                        iIntValue = c4312o.m5105y().intValue();
                                    }
                                    z6 = z6;
                                    i12 = i12;
                                }
                                break;
                            default:
                                i12 = i12;
                                break;
                        }
                    }
                } else {
                    i12 = i12;
                }
                c10185j.f30239o = c4312o2;
            } else {
                if (iM9886e == 43 && m6692q(strTrim) < 0.0f) {
                    throw new C10168A0("Invalid <path> element. pathLength cannot be negative");
                }
                i12 = i12;
            }
            i12++;
            i11 = 0;
            c6141c = this;
            attributes2 = attributes;
        }
        ((InterfaceC10197W) c6141c.f20024r0).mo10773j(c10185j);
    }

    /* JADX INFO: renamed from: F */
    public void m6705F() {
        C13711h c13711h = new C13711h(19, false);
        c13711h.f43259Z = null;
        c13711h.f43260o0 = new C4535c(1);
        c13711h.f43261p0 = new HashMap();
        this.f20023q0 = c13711h;
    }

    /* JADX INFO: renamed from: H */
    public void m6707H(String str) {
        if (this.f20019Y) {
            return;
        }
        if (this.f20021o0) {
            if (((StringBuilder) this.f20026t0) == null) {
                this.f20026t0 = new StringBuilder(str.length());
            }
            ((StringBuilder) this.f20026t0).append(str);
        } else if (this.f20022p0) {
            if (((StringBuilder) this.f20027u0) == null) {
                this.f20027u0 = new StringBuilder(str.length());
            }
            ((StringBuilder) this.f20027u0).append(str);
        } else if (((InterfaceC10197W) this.f20024r0) instanceof AbstractC10224l0) {
            m6710b(str);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m6708I(char[] cArr, int i10, int i11) {
        if (this.f20019Y) {
            return;
        }
        if (this.f20021o0) {
            if (((StringBuilder) this.f20026t0) == null) {
                this.f20026t0 = new StringBuilder(i11);
            }
            ((StringBuilder) this.f20026t0).append(cArr, i10, i11);
        } else if (this.f20022p0) {
            if (((StringBuilder) this.f20027u0) == null) {
                this.f20027u0 = new StringBuilder(i11);
            }
            ((StringBuilder) this.f20027u0).append(cArr, i10, i11);
        } else if (((InterfaceC10197W) this.f20024r0) instanceof AbstractC10224l0) {
            m6710b(new String(cArr, i10, i11));
        }
    }

    @Override // p355O7.InterfaceC6142d
    /* JADX INFO: renamed from: a */
    public void mo6709a(int i10, String message, Throwable th2, LinkedHashMap linkedHashMap, HashSet hashSet, Long l4) {
        AbstractC16544l.m18094g(message, "message");
        if (i10 < this.f20020Z) {
            return;
        }
        long jLongValue = l4 != null ? l4.longValue() : System.currentTimeMillis();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        InterfaceC13823a interfaceC13823a = (InterfaceC13823a) this.f20025s0;
        C16360m c16360mMo15458n = interfaceC13823a.mo15458n("logs");
        if (c16360mMo15458n != null) {
            linkedHashMap2.putAll(AbstractC17659D.m19256r(AbstractC17659D.m19254p(((C4957b) c16360mMo15458n.f50808b).f16177s0)));
        }
        linkedHashMap2.putAll(linkedHashMap);
        boolean zM12504H = ((C11234e) this.f20027u0).m12504H();
        EnumC11255b enumC11255b = EnumC11255b.f34098Y;
        if (zM12504H) {
            if (c16360mMo15458n != null) {
                AbstractC7933L4.m8226d(c16360mMo15458n, new C6139a(this, i10, message, th2, linkedHashMap2, hashSet, Thread.currentThread().getName(), jLongValue));
            } else {
                AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 4, enumC11255b, C6140b.f20016Z, null, false, 56);
            }
        }
        if (i10 >= 6) {
            C16360m c16360mMo15458n2 = interfaceC13823a.mo15458n("rum");
            if (c16360mMo15458n2 != null) {
                c16360mMo15458n2.m17960a(AbstractC17659D.m19244f(new C17309l("type", "logger_error"), new C17309l("message", message), new C17309l("throwable", th2), new C17309l("attributes", linkedHashMap2)));
            } else {
                AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 3, enumC11255b, C6140b.f20017o0, null, false, 56);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m6710b(String str) {
        AbstractC10196V abstractC10196V = (AbstractC10196V) ((InterfaceC10197W) this.f20024r0);
        int size = abstractC10196V.f30299i.size();
        AbstractC10202a0 abstractC10202a0 = size == 0 ? null : (AbstractC10202a0) abstractC10196V.f30299i.get(size - 1);
        if (abstractC10202a0 instanceof C10230o0) {
            C10230o0 c10230o0 = (C10230o0) abstractC10202a0;
            c10230o0.f30368c = AbstractC9306j0.m9891j(c10230o0.f30368c, str, new StringBuilder());
        } else {
            InterfaceC10197W interfaceC10197W = (InterfaceC10197W) this.f20024r0;
            C10230o0 c10230o1 = new C10230o0();
            c10230o1.f30368c = str;
            interfaceC10197W.mo10773j(c10230o1);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m6711d(String str, String str2, String str3) {
        if (this.f20019Y) {
            int i10 = this.f20020Z - 1;
            this.f20020Z = i10;
            if (i10 == 0) {
                this.f20019Y = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            EnumC10182H0 enumC10182H0 = (EnumC10182H0) EnumC10182H0.f30234q0.get(str2);
            if (enumC10182H0 == null) {
                enumC10182H0 = EnumC10182H0.f30233p0;
            }
            switch (enumC10182H0.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.f20024r0 = ((AbstractC10202a0) ((InterfaceC10197W) this.f20024r0)).f30315b;
                    break;
                case 5:
                case 26:
                    this.f20021o0 = false;
                    if (((StringBuilder) this.f20026t0) != null) {
                        EnumC10182H0 enumC10182H1 = (EnumC10182H0) this.f20025s0;
                        if (enumC10182H1 == EnumC10182H0.f30232o0 || enumC10182H1 == EnumC10182H0.f30230Y) {
                            ((C13711h) this.f20023q0).getClass();
                        }
                        ((StringBuilder) this.f20026t0).setLength(0);
                    }
                    break;
                case 21:
                    StringBuilder sb2 = (StringBuilder) this.f20027u0;
                    if (sb2 != null) {
                        this.f20022p0 = false;
                        String string = sb2.toString();
                        C7042K c7042k = new C7042K(1);
                        C13711h c13711h = (C13711h) this.f20023q0;
                        C10205c c10205c = new C10205c(string);
                        c10205c.m5081M();
                        ((C4535c) c13711h.f43260o0).m5281g(c7042k.m7438h(c10205c));
                        ((StringBuilder) this.f20027u0).setLength(0);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:134:0x027d  */
    /* JADX WARN: Code duplicated, block: B:157:0x02be  */
    /* JADX WARN: Code duplicated, block: B:214:0x038c  */
    /* JADX WARN: Code duplicated, block: B:285:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:318:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:359:0x059b  */
    /* JADX WARN: Code duplicated, block: B:407:0x0663  */
    /* JADX INFO: renamed from: E */
    public static void m6678E(C10193S c10193s, String str, String str2) {
        C11238i c11238i;
        Boolean bool;
        int i10;
        int i11;
        String strM5072D;
        C10173D c10173dM6695t;
        String strSubstring;
        C10173D c10173dM6695t2;
        int i12;
        int i13;
        C10173D c10173dM5069A;
        C10173D[] c10173dArr;
        int i14;
        int i15;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = EnumC10180G0.m10772a(str).ordinal();
        if (iOrdinal == 1) {
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                C4312o c4312o = new C4312o(str2.substring(5));
                c4312o.m5081M();
                C10173D c10173dM6697v = m6697v(c4312o);
                c4312o.m5080L();
                C10173D c10173dM6697v2 = m6697v(c4312o);
                c4312o.m5080L();
                C10173D c10173dM6697v3 = m6697v(c4312o);
                c4312o.m5080L();
                C10173D c10173dM6697v4 = m6697v(c4312o);
                c4312o.m5081M();
                if (c4312o.m5094m(')') || c4312o.m5098q()) {
                    c11238i = new C11238i();
                    c11238i.f34008Y = c10173dM6697v;
                    c11238i.f34009Z = c10173dM6697v2;
                    c11238i.f34010o0 = c10173dM6697v3;
                    c11238i.f34011p0 = c10173dM6697v4;
                } else {
                    c11238i = null;
                }
            } else {
                c11238i = null;
            }
            c10193s.f30257B0 = c11238i;
            if (c11238i != null) {
                c10193s.f30280Y |= 1048576;
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            c10193s.f30265J0 = m6694s(str2);
            c10193s.f30280Y |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            int i16 = 0;
            if ("nonzero".equals(str2)) {
                i16 = 1;
            } else if ("evenodd".equals(str2)) {
                i16 = 2;
            }
            c10193s.f30278W0 = i16;
            c10193s.f30280Y |= 536870912;
            return;
        }
        try {
            if (iOrdinal == 5) {
                c10193s.f30291w0 = m6690o(str2);
                c10193s.f30280Y |= 4096;
                return;
            }
            if (iOrdinal == 8) {
                int i17 = 0;
                if (str2.equals("ltr")) {
                    i17 = 1;
                } else if (str2.equals("rtl")) {
                    i17 = 2;
                }
                c10193s.f30276U0 = i17;
                if (i17 != 0) {
                    c10193s.f30280Y |= 68719476736L;
                    return;
                }
                return;
            }
            if (iOrdinal == 35) {
                c10193s.f30266K0 = m6694s(str2);
                c10193s.f30280Y |= 1073741824;
                return;
            }
            if (iOrdinal == 40) {
                c10193s.f30290v0 = m6698w(str2);
                c10193s.f30280Y |= 2048;
                return;
            }
            if (iOrdinal == 42) {
                switch (str2) {
                    case "hidden":
                    case "scroll":
                        bool = Boolean.FALSE;
                        break;
                    case "auto":
                    case "visible":
                        bool = Boolean.TRUE;
                        break;
                    default:
                        bool = null;
                        break;
                }
                c10193s.f30256A0 = bool;
                if (bool != null) {
                    c10193s.f30280Y |= 524288;
                    return;
                }
                return;
            }
            if (iOrdinal == 78) {
                int i18 = 0;
                if (str2.equals("none")) {
                    i18 = 1;
                } else if (str2.equals("non-scaling-stroke")) {
                    i18 = 2;
                }
                c10193s.f30279X0 = i18;
                if (i18 != 0) {
                    c10193s.f30280Y |= 34359738368L;
                    return;
                }
                return;
            }
            C10243v c10243v = C10243v.f30419Y;
            if (iOrdinal == 58) {
                if (str2.equals("currentColor")) {
                    c10193s.f30267L0 = c10243v;
                } else {
                    try {
                        c10193s.f30267L0 = m6690o(str2);
                    } catch (C10168A0 e10) {
                        AbstractC15256t.m16482t("SVGParser", e10.getMessage());
                        return;
                    }
                }
                c10193s.f30280Y |= 2147483648L;
                return;
            }
            if (iOrdinal == 59) {
                c10193s.f30268M0 = m6698w(str2);
                c10193s.f30280Y |= 4294967296L;
                return;
            }
            if (iOrdinal == 74) {
                switch (str2) {
                    case "middle":
                        i10 = 2;
                        break;
                    case "end":
                        i10 = 3;
                        break;
                    case "start":
                        i10 = 1;
                        break;
                    default:
                        i10 = 0;
                        break;
                }
                c10193s.f30277V0 = i10;
                if (i10 != 0) {
                    c10193s.f30280Y |= 262144;
                    return;
                }
                return;
            }
            if (iOrdinal == 75) {
                switch (str2) {
                    case "line-through":
                        i11 = 4;
                        break;
                    case "underline":
                        i11 = 2;
                        break;
                    case "none":
                        i11 = 1;
                        break;
                    case "blink":
                        i11 = 5;
                        break;
                    case "overline":
                        i11 = 3;
                        break;
                    default:
                        i11 = 0;
                        break;
                }
                c10193s.f30275T0 = i11;
                if (i11 != 0) {
                    c10193s.f30280Y |= 131072;
                    return;
                }
                return;
            }
            switch (iOrdinal) {
                case 14:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            c10193s.f30261F0 = Boolean.valueOf(!str2.equals("none"));
                            c10193s.f30280Y |= 16777216;
                            break;
                        }
                    }
                    break;
                case 15:
                    AbstractC10204b0 abstractC10204b0M6699x = m6699x(str2);
                    c10193s.f30282Z = abstractC10204b0M6699x;
                    if (abstractC10204b0M6699x != null) {
                        c10193s.f30280Y |= 1;
                    }
                    break;
                case 16:
                    int i19 = 0;
                    if ("nonzero".equals(str2)) {
                        i19 = 1;
                    } else if ("evenodd".equals(str2)) {
                        i19 = 2;
                    }
                    c10193s.f30271P0 = i19;
                    if (i19 != 0) {
                        c10193s.f30280Y |= 2;
                    }
                    break;
                case 17:
                    Float fM6698w = m6698w(str2);
                    c10193s.f30283o0 = fM6698w;
                    if (fM6698w != null) {
                        c10193s.f30280Y |= 4;
                    }
                    break;
                case 18:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        C4312o c4312o2 = new C4312o(str2);
                        Integer num = null;
                        String str3 = null;
                        int i20 = 0;
                        while (true) {
                            strM5072D = c4312o2.m5072D('/', false);
                            c4312o2.m5081M();
                            if (strM5072D == null) {
                                break;
                            } else if (num == null || i20 == 0) {
                                if (!strM5072D.equals("normal") && (num != null || (num = (Integer) AbstractC10176E0.f30124a.get(strM5072D)) == null)) {
                                    if (i20 == 0) {
                                        switch (strM5072D) {
                                            case "oblique":
                                                i20 = 3;
                                                break;
                                            case "italic":
                                                i20 = 2;
                                                break;
                                            case "normal":
                                                i20 = 1;
                                                break;
                                            default:
                                                i20 = 0;
                                                break;
                                        }
                                        if (i20 != 0) {
                                            continue;
                                        }
                                    }
                                    if (str3 == null && strM5072D.equals("small-caps")) {
                                        str3 = strM5072D;
                                    }
                                }
                            }
                        }
                        try {
                            c10173dM6695t = (C10173D) AbstractC10174D0.f30119a.get(strM5072D);
                            if (c10173dM6695t == null) {
                                c10173dM6695t = m6695t(strM5072D);
                            }
                        } catch (C10168A0 unused) {
                            c10173dM6695t = null;
                        }
                        if (c4312o2.m5094m('/')) {
                            c4312o2.m5081M();
                            String strM5071C = c4312o2.m5071C();
                            if (strM5071C != null) {
                                m6695t(strM5071C);
                            }
                            c4312o2.m5081M();
                        }
                        if (c4312o2.m5098q()) {
                            strSubstring = null;
                        } else {
                            int i21 = c4312o2.f14016b;
                            c4312o2.f14016b = c4312o2.f14017c;
                            strSubstring = ((String) c4312o2.f14018d).substring(i21);
                        }
                        c10193s.f30292x0 = m6693r(strSubstring);
                        c10193s.f30293y0 = c10173dM6695t;
                        c10193s.f30294z0 = Integer.valueOf(num == null ? RCHTTPStatusCodes.BAD_REQUEST : num.intValue());
                        c10193s.f30274S0 = i20 == 0 ? 1 : i20;
                        c10193s.f30280Y |= 122880;
                        break;
                    }
                    break;
                case 19:
                    ArrayList arrayListM6693r = m6693r(str2);
                    c10193s.f30292x0 = arrayListM6693r;
                    if (arrayListM6693r != null) {
                        c10193s.f30280Y |= 8192;
                    }
                    break;
                case 20:
                    try {
                        C10173D c10173d = (C10173D) AbstractC10174D0.f30119a.get(str2);
                        c10173dM6695t2 = c10173d == null ? m6695t(str2) : c10173d;
                    } catch (C10168A0 unused2) {
                        c10173dM6695t2 = null;
                    }
                    c10193s.f30293y0 = c10173dM6695t2;
                    if (c10173dM6695t2 != null) {
                        c10193s.f30280Y |= 16384;
                    }
                    break;
                case 21:
                    Integer num2 = (Integer) AbstractC10176E0.f30124a.get(str2);
                    c10193s.f30294z0 = num2;
                    if (num2 != null) {
                        c10193s.f30280Y |= 32768;
                    }
                    break;
                case 22:
                    switch (str2) {
                        case "oblique":
                            i12 = 3;
                            break;
                        case "italic":
                            i12 = 2;
                            break;
                        case "normal":
                            i12 = 1;
                            break;
                        default:
                            i12 = 0;
                            break;
                    }
                    c10193s.f30274S0 = i12;
                    if (i12 != 0) {
                        c10193s.f30280Y |= 65536;
                    }
                    break;
                default:
                    switch (iOrdinal) {
                        case 27:
                            switch (str2) {
                                case "optimizeQuality":
                                    i13 = 2;
                                    break;
                                case "auto":
                                    i13 = 1;
                                    break;
                                case "optimizeSpeed":
                                    i13 = 3;
                                    break;
                                default:
                                    i13 = 0;
                                    break;
                            }
                            c10193s.f30281Y0 = i13;
                            if (i13 != 0) {
                                c10193s.f30280Y |= 137438953472L;
                            }
                            break;
                        case 28:
                            String strM6694s = m6694s(str2);
                            c10193s.f30258C0 = strM6694s;
                            c10193s.f30259D0 = strM6694s;
                            c10193s.f30260E0 = strM6694s;
                            c10193s.f30280Y |= 14680064;
                            break;
                        case 29:
                            c10193s.f30258C0 = m6694s(str2);
                            c10193s.f30280Y |= 2097152;
                            break;
                        case 30:
                            c10193s.f30259D0 = m6694s(str2);
                            c10193s.f30280Y |= 4194304;
                            break;
                        case 31:
                            c10193s.f30260E0 = m6694s(str2);
                            c10193s.f30280Y |= 8388608;
                            break;
                        default:
                            String str4 = vRJidSveZHcTw.hyaBCjuQpwdcg;
                            switch (iOrdinal) {
                                case 62:
                                    if (str2.equals("currentColor")) {
                                        c10193s.f30263H0 = c10243v;
                                    } else {
                                        try {
                                            c10193s.f30263H0 = m6690o(str2);
                                        } catch (C10168A0 e11) {
                                            AbstractC15256t.m16482t("SVGParser", e11.getMessage());
                                            return;
                                        }
                                    }
                                    c10193s.f30280Y |= 67108864;
                                    break;
                                case 63:
                                    c10193s.f30264I0 = m6698w(str2);
                                    c10193s.f30280Y |= 134217728;
                                    break;
                                case 64:
                                    AbstractC10204b0 abstractC10204b0M6699x2 = m6699x(str2);
                                    c10193s.f30284p0 = abstractC10204b0M6699x2;
                                    if (abstractC10204b0M6699x2 != null) {
                                        c10193s.f30280Y |= 8;
                                    }
                                    break;
                                case 65:
                                    if (!"none".equals(str2)) {
                                        C4312o c4312o3 = new C4312o(str2);
                                        c4312o3.m5081M();
                                        if (c4312o3.m5098q() || (c10173dM5069A = c4312o3.m5069A()) == null || c10173dM5069A.m10770f()) {
                                            c10173dArr = null;
                                        } else {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(c10173dM5069A);
                                            float f10 = c10173dM5069A.f30117Y;
                                            while (true) {
                                                if (!c4312o3.m5098q()) {
                                                    c4312o3.m5080L();
                                                    C10173D c10173dM5069A2 = c4312o3.m5069A();
                                                    if (c10173dM5069A2 != null && !c10173dM5069A2.m10770f()) {
                                                        arrayList.add(c10173dM5069A2);
                                                        f10 += c10173dM5069A2.f30117Y;
                                                    }
                                                } else if (f10 != 0.0f) {
                                                    c10173dArr = (C10173D[]) arrayList.toArray(new C10173D[arrayList.size()]);
                                                }
                                                c10173dArr = null;
                                            }
                                        }
                                        c10193s.f30288t0 = c10173dArr;
                                        if (c10173dArr != null) {
                                            c10193s.f30280Y |= 512;
                                        }
                                    } else {
                                        c10193s.f30288t0 = null;
                                        c10193s.f30280Y |= 512;
                                    }
                                    break;
                                case 66:
                                    c10193s.f30289u0 = m6695t(str2);
                                    c10193s.f30280Y |= 1024;
                                    break;
                                case 67:
                                    if ("butt".equals(str2)) {
                                        i14 = 1;
                                    } else if (str4.equals(str2)) {
                                        i14 = 2;
                                    } else {
                                        i14 = "square".equals(str2) ? 3 : 0;
                                    }
                                    c10193s.f30272Q0 = i14;
                                    if (i14 != 0) {
                                        c10193s.f30280Y |= 64;
                                    }
                                    break;
                                case 68:
                                    if ("miter".equals(str2)) {
                                        i15 = 1;
                                    } else if (str4.equals(str2)) {
                                        i15 = 2;
                                    } else {
                                        i15 = "bevel".equals(str2) ? 3 : 0;
                                    }
                                    c10193s.f30273R0 = i15;
                                    if (i15 != 0) {
                                        c10193s.f30280Y |= 128;
                                    }
                                    break;
                                case 69:
                                    c10193s.f30287s0 = Float.valueOf(m6692q(str2));
                                    c10193s.f30280Y |= 256;
                                    break;
                                case 70:
                                    Float fM6698w2 = m6698w(str2);
                                    c10193s.f30285q0 = fM6698w2;
                                    if (fM6698w2 != null) {
                                        c10193s.f30280Y |= 16;
                                    }
                                    break;
                                case 71:
                                    c10193s.f30286r0 = m6695t(str2);
                                    c10193s.f30280Y |= 32;
                                    break;
                                default:
                                    switch (iOrdinal) {
                                        case 88:
                                            if (str2.equals("currentColor")) {
                                                c10193s.f30269N0 = c10243v;
                                            } else {
                                                try {
                                                    c10193s.f30269N0 = m6690o(str2);
                                                } catch (C10168A0 e12) {
                                                    AbstractC15256t.m16482t("SVGParser", e12.getMessage());
                                                    return;
                                                }
                                            }
                                            c10193s.f30280Y |= 8589934592L;
                                            break;
                                        case 89:
                                            c10193s.f30270O0 = m6698w(str2);
                                            c10193s.f30280Y |= 17179869184L;
                                            break;
                                        case 90:
                                            if (str2.indexOf(124) < 0) {
                                                if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                    c10193s.f30262G0 = Boolean.valueOf(str2.equals("visible"));
                                                    c10193s.f30280Y |= 33554432;
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } catch (C10168A0 unused3) {
        }
    }

    /* JADX INFO: renamed from: G */
    public void m6706G(String str, String str2, String str3, Attributes attributes) throws C10168A0 {
        boolean z6;
        if (this.f20019Y) {
            this.f20020Z++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            EnumC10182H0 enumC10182H0 = (EnumC10182H0) EnumC10182H0.f30234q0.get(str2.length() > 0 ? str2 : str3);
            if (enumC10182H0 == null) {
                enumC10182H0 = EnumC10182H0.f30233p0;
            }
            switch (enumC10182H0.ordinal()) {
                case 0:
                    C10194T c10194t = new C10194T();
                    c10194t.f30314a = (C13711h) this.f20023q0;
                    c10194t.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10194t, attributes);
                    m6686k(c10194t, attributes);
                    m6682g(c10194t, attributes);
                    m6689n(c10194t, attributes);
                    for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                        String strTrim = attributes.getValue(i10).trim();
                        int iM9886e = AbstractC9306j0.m9886e(attributes, i10);
                        if (iM9886e == 25) {
                            C10173D c10173dM6695t = m6695t(strTrim);
                            c10194t.f30298s = c10173dM6695t;
                            if (c10173dM6695t.m10770f()) {
                                throw new C10168A0("Invalid <svg> element. height cannot be negative");
                            }
                        } else if (iM9886e != 79) {
                            switch (iM9886e) {
                                case 81:
                                    C10173D c10173dM6695t2 = m6695t(strTrim);
                                    c10194t.f30297r = c10173dM6695t2;
                                    if (c10173dM6695t2.m10770f()) {
                                        throw new C10168A0("Invalid <svg> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    c10194t.f30295p = m6695t(strTrim);
                                    break;
                                case 83:
                                    c10194t.f30296q = m6695t(strTrim);
                                    break;
                            }
                        } else {
                            continue;
                        }
                    }
                    InterfaceC10197W interfaceC10197W = (InterfaceC10197W) this.f20024r0;
                    if (interfaceC10197W == null) {
                        ((C13711h) this.f20023q0).f43259Z = c10194t;
                    } else {
                        interfaceC10197W.mo10773j(c10194t);
                    }
                    this.f20024r0 = c10194t;
                    return;
                case 1:
                case 7:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10167A c10167a = new C10167A();
                    c10167a.f30314a = (C13711h) this.f20023q0;
                    c10167a.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10167a, attributes);
                    m6686k(c10167a, attributes);
                    m6688m(c10167a, attributes);
                    m6682g(c10167a, attributes);
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10167a);
                    this.f20024r0 = c10167a;
                    return;
                case 2:
                    InterfaceC10197W interfaceC10197W2 = (InterfaceC10197W) this.f20024r0;
                    if (interfaceC10197W2 == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10237s c10237s = new C10237s();
                    c10237s.f30314a = (C13711h) this.f20023q0;
                    c10237s.f30315b = interfaceC10197W2;
                    m6683h(c10237s, attributes);
                    m6686k(c10237s, attributes);
                    m6688m(c10237s, attributes);
                    m6682g(c10237s, attributes);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        String strTrim2 = attributes.getValue(i11).trim();
                        int iM9886e2 = AbstractC9306j0.m9886e(attributes, i11);
                        if (iM9886e2 == 6) {
                            c10237s.f30402o = m6695t(strTrim2);
                        } else if (iM9886e2 == 7) {
                            c10237s.f30403p = m6695t(strTrim2);
                        } else if (iM9886e2 != 49) {
                            continue;
                        } else {
                            C10173D c10173dM6695t3 = m6695t(strTrim2);
                            c10237s.f30404q = c10173dM6695t3;
                            if (c10173dM6695t3.m10770f()) {
                                throw new C10168A0("Invalid <circle> element. r cannot be negative");
                            }
                        }
                    }
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10237s);
                    return;
                case 3:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10239t c10239t = new C10239t();
                    c10239t.f30314a = (C13711h) this.f20023q0;
                    c10239t.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10239t, attributes);
                    m6686k(c10239t, attributes);
                    m6688m(c10239t, attributes);
                    m6682g(c10239t, attributes);
                    for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                        String strTrim3 = attributes.getValue(i12).trim();
                        if (AbstractC9306j0.m9886e(attributes, i12) == 3) {
                            if ("objectBoundingBox".equals(strTrim3)) {
                                c10239t.f30410o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim3)) {
                                    throw new C10168A0("Invalid value for attribute clipPathUnits");
                                }
                                c10239t.f30410o = Boolean.TRUE;
                            }
                        }
                    }
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10239t);
                    this.f20024r0 = c10239t;
                    return;
                case 4:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10245w c10245w = new C10245w();
                    c10245w.f30314a = (C13711h) this.f20023q0;
                    c10245w.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10245w, attributes);
                    m6686k(c10245w, attributes);
                    m6688m(c10245w, attributes);
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10245w);
                    this.f20024r0 = c10245w;
                    return;
                case 5:
                case 26:
                    this.f20021o0 = true;
                    this.f20025s0 = enumC10182H0;
                    return;
                case 6:
                    InterfaceC10197W interfaceC10197W3 = (InterfaceC10197W) this.f20024r0;
                    if (interfaceC10197W3 == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10247x c10247x = new C10247x();
                    c10247x.f30314a = (C13711h) this.f20023q0;
                    c10247x.f30315b = interfaceC10197W3;
                    m6683h(c10247x, attributes);
                    m6686k(c10247x, attributes);
                    m6688m(c10247x, attributes);
                    m6682g(c10247x, attributes);
                    for (int i13 = 0; i13 < attributes.getLength(); i13++) {
                        String strTrim4 = attributes.getValue(i13).trim();
                        int iM9886e3 = AbstractC9306j0.m9886e(attributes, i13);
                        if (iM9886e3 == 6) {
                            c10247x.f30428o = m6695t(strTrim4);
                        } else if (iM9886e3 == 7) {
                            c10247x.f30429p = m6695t(strTrim4);
                        } else if (iM9886e3 == 56) {
                            C10173D c10173dM6695t4 = m6695t(strTrim4);
                            c10247x.f30430q = c10173dM6695t4;
                            if (c10173dM6695t4.m10770f()) {
                                throw new C10168A0("Invalid <ellipse> element. rx cannot be negative");
                            }
                        } else if (iM9886e3 != 57) {
                            continue;
                        } else {
                            C10173D c10173dM6695t5 = m6695t(strTrim4);
                            c10247x.f30431r = c10173dM6695t5;
                            if (c10173dM6695t5.m10770f()) {
                                throw new C10168A0("Invalid <ellipse> element. ry cannot be negative");
                            }
                        }
                    }
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10247x);
                    return;
                case 8:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10171C c10171c = new C10171C();
                    c10171c.f30314a = (C13711h) this.f20023q0;
                    c10171c.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10171c, attributes);
                    m6686k(c10171c, attributes);
                    m6688m(c10171c, attributes);
                    m6682g(c10171c, attributes);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String strTrim5 = attributes.getValue(i14).trim();
                        int iM9886e4 = AbstractC9306j0.m9886e(attributes, i14);
                        if (iM9886e4 == 25) {
                            C10173D c10173dM6695t6 = m6695t(strTrim5);
                            c10171c.f30114s = c10173dM6695t6;
                            if (c10173dM6695t6.m10770f()) {
                                throw new C10168A0("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iM9886e4 != 26) {
                            if (iM9886e4 != 48) {
                                switch (iM9886e4) {
                                    case 81:
                                        C10173D c10173dM6695t7 = m6695t(strTrim5);
                                        c10171c.f30113r = c10173dM6695t7;
                                        if (c10173dM6695t7.m10770f()) {
                                            throw new C10168A0("Invalid <use> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        c10171c.f30111p = m6695t(strTrim5);
                                        break;
                                    case 83:
                                        c10171c.f30112q = m6695t(strTrim5);
                                        break;
                                }
                            } else {
                                m6700y(c10171c, strTrim5);
                            }
                        } else if ("".equals(attributes.getURI(i14)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i14))) {
                            c10171c.f30110o = strTrim5;
                        }
                    }
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10171c);
                    this.f20024r0 = c10171c;
                    return;
                case 9:
                    InterfaceC10197W interfaceC10197W4 = (InterfaceC10197W) this.f20024r0;
                    if (interfaceC10197W4 == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10175E c10175e = new C10175E();
                    c10175e.f30314a = (C13711h) this.f20023q0;
                    c10175e.f30315b = interfaceC10197W4;
                    m6683h(c10175e, attributes);
                    m6686k(c10175e, attributes);
                    m6688m(c10175e, attributes);
                    m6682g(c10175e, attributes);
                    for (int i15 = 0; i15 < attributes.getLength(); i15++) {
                        String strTrim6 = attributes.getValue(i15).trim();
                        switch (AbstractC9306j0.m9886e(attributes, i15)) {
                            case 84:
                                c10175e.f30120o = m6695t(strTrim6);
                                break;
                            case 85:
                                c10175e.f30121p = m6695t(strTrim6);
                                break;
                            case 86:
                                c10175e.f30122q = m6695t(strTrim6);
                                break;
                            case 87:
                                c10175e.f30123r = m6695t(strTrim6);
                                break;
                        }
                    }
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10175e);
                    return;
                case 10:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10200Z c10200z = new C10200Z();
                    c10200z.f30314a = (C13711h) this.f20023q0;
                    c10200z.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10200z, attributes);
                    m6686k(c10200z, attributes);
                    m6684i(c10200z, attributes);
                    for (int i16 = 0; i16 < attributes.getLength(); i16++) {
                        String strTrim7 = attributes.getValue(i16).trim();
                        switch (AbstractC9306j0.m9886e(attributes, i16)) {
                            case 84:
                                c10200z.f30310m = m6695t(strTrim7);
                                break;
                            case 85:
                                c10200z.f30311n = m6695t(strTrim7);
                                break;
                            case 86:
                                c10200z.f30312o = m6695t(strTrim7);
                                break;
                            case 87:
                                c10200z.f30313p = m6695t(strTrim7);
                                break;
                        }
                    }
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10200z);
                    this.f20024r0 = c10200z;
                    return;
                case 11:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10177F c10177f = new C10177F();
                    c10177f.f30314a = (C13711h) this.f20023q0;
                    c10177f.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10177f, attributes);
                    m6686k(c10177f, attributes);
                    m6682g(c10177f, attributes);
                    m6689n(c10177f, attributes);
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        String strTrim8 = attributes.getValue(i17).trim();
                        int iM9886e5 = AbstractC9306j0.m9886e(attributes, i17);
                        if (iM9886e5 != 41) {
                            if (iM9886e5 == 50) {
                                c10177f.f30126q = m6695t(strTrim8);
                            } else if (iM9886e5 != 51) {
                                switch (iM9886e5) {
                                    case 32:
                                        C10173D c10173dM6695t8 = m6695t(strTrim8);
                                        c10177f.f30129t = c10173dM6695t8;
                                        if (c10173dM6695t8.m10770f()) {
                                            throw new C10168A0("Invalid <marker> element. markerHeight cannot be negative");
                                        }
                                        continue;
                                        break;
                                    case 33:
                                        if (!"strokeWidth".equals(strTrim8)) {
                                            if (!"userSpaceOnUse".equals(strTrim8)) {
                                                throw new C10168A0("Invalid value for attribute markerUnits");
                                            }
                                            c10177f.f30125p = true;
                                        } else {
                                            c10177f.f30125p = false;
                                            continue;
                                        }
                                        break;
                                    case 34:
                                        C10173D c10173dM6695t9 = m6695t(strTrim8);
                                        c10177f.f30128s = c10173dM6695t9;
                                        if (c10173dM6695t9.m10770f()) {
                                            throw new C10168A0("Invalid <marker> element. markerWidth cannot be negative");
                                        }
                                        break;
                                }
                            } else {
                                c10177f.f30127r = m6695t(strTrim8);
                            }
                        } else if ("auto".equals(strTrim8)) {
                            c10177f.f30130u = Float.valueOf(Float.NaN);
                        } else {
                            c10177f.f30130u = Float.valueOf(m6692q(strTrim8));
                        }
                    }
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10177f);
                    this.f20024r0 = c10177f;
                    return;
                case 12:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10179G c10179g = new C10179G();
                    c10179g.f30314a = (C13711h) this.f20023q0;
                    c10179g.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10179g, attributes);
                    m6686k(c10179g, attributes);
                    m6682g(c10179g, attributes);
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        String strTrim9 = attributes.getValue(i18).trim();
                        int iM9886e6 = AbstractC9306j0.m9886e(attributes, i18);
                        if (iM9886e6 == 25) {
                            C10173D c10173dM6695t10 = m6695t(strTrim9);
                            c10179g.f30135q = c10173dM6695t10;
                            if (c10173dM6695t10.m10770f()) {
                                throw new C10168A0("Invalid <mask> element. height cannot be negative");
                            }
                        } else if (iM9886e6 != 36) {
                            if (iM9886e6 != 37) {
                                switch (iM9886e6) {
                                    case 81:
                                        C10173D c10173dM6695t11 = m6695t(strTrim9);
                                        c10179g.f30134p = c10173dM6695t11;
                                        if (c10173dM6695t11.m10770f()) {
                                            throw new C10168A0("Invalid <mask> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        m6695t(strTrim9);
                                        break;
                                    case 83:
                                        m6695t(strTrim9);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(strTrim9)) {
                                c10179g.f30132n = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim9)) {
                                    throw new C10168A0("Invalid value for attribute maskUnits");
                                }
                                c10179g.f30132n = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim9)) {
                            c10179g.f30133o = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim9)) {
                                throw new C10168A0("Invalid value for attribute maskContentUnits");
                            }
                            c10179g.f30133o = Boolean.TRUE;
                        }
                    }
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10179g);
                    this.f20024r0 = c10179g;
                    return;
                case 13:
                    m6704D(attributes);
                    return;
                case 14:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10187L c10187l = new C10187L();
                    c10187l.f30314a = (C13711h) this.f20023q0;
                    c10187l.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10187l, attributes);
                    m6686k(c10187l, attributes);
                    m6682g(c10187l, attributes);
                    m6689n(c10187l, attributes);
                    for (int i19 = 0; i19 < attributes.getLength(); i19++) {
                        String strTrim10 = attributes.getValue(i19).trim();
                        int iM9886e7 = AbstractC9306j0.m9886e(attributes, i19);
                        if (iM9886e7 == 25) {
                            C10173D c10173dM6695t12 = m6695t(strTrim10);
                            c10187l.f30246v = c10173dM6695t12;
                            if (c10173dM6695t12.m10770f()) {
                                throw new C10168A0("Invalid <pattern> element. height cannot be negative");
                            }
                        } else if (iM9886e7 != 26) {
                            switch (iM9886e7) {
                                case 44:
                                    if (!"objectBoundingBox".equals(strTrim10)) {
                                        if (!"userSpaceOnUse".equals(strTrim10)) {
                                            throw new C10168A0(IGDwkYw.fWxRkHzvKqcxn);
                                        }
                                        c10187l.f30241q = Boolean.TRUE;
                                    } else {
                                        c10187l.f30241q = Boolean.FALSE;
                                    }
                                    break;
                                case 45:
                                    c10187l.f30242r = m6677A(strTrim10);
                                    break;
                                case 46:
                                    if (!"objectBoundingBox".equals(strTrim10)) {
                                        if (!"userSpaceOnUse".equals(strTrim10)) {
                                            throw new C10168A0("Invalid value for attribute patternUnits");
                                        }
                                        c10187l.f30240p = Boolean.TRUE;
                                    } else {
                                        c10187l.f30240p = Boolean.FALSE;
                                    }
                                    break;
                                default:
                                    switch (iM9886e7) {
                                        case 81:
                                            C10173D c10173dM6695t13 = m6695t(strTrim10);
                                            c10187l.f30245u = c10173dM6695t13;
                                            if (c10173dM6695t13.m10770f()) {
                                                throw new C10168A0("Invalid <pattern> element. width cannot be negative");
                                            }
                                            break;
                                            break;
                                        case 82:
                                            c10187l.f30243s = m6695t(strTrim10);
                                            break;
                                        case 83:
                                            c10187l.f30244t = m6695t(strTrim10);
                                            break;
                                    }
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i19)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i19))) {
                            c10187l.f30247w = strTrim10;
                        }
                    }
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10187l);
                    this.f20024r0 = c10187l;
                    return;
                case 15:
                    InterfaceC10197W interfaceC10197W5 = (InterfaceC10197W) this.f20024r0;
                    if (interfaceC10197W5 == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10189N c10189n = new C10189N();
                    c10189n.f30314a = (C13711h) this.f20023q0;
                    c10189n.f30315b = interfaceC10197W5;
                    m6683h(c10189n, attributes);
                    m6686k(c10189n, attributes);
                    m6688m(c10189n, attributes);
                    m6682g(c10189n, attributes);
                    m6685j(c10189n, attributes, "polygon");
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10189n);
                    return;
                case 16:
                    InterfaceC10197W interfaceC10197W6 = (InterfaceC10197W) this.f20024r0;
                    if (interfaceC10197W6 == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10188M c10188m = new C10188M();
                    c10188m.f30314a = (C13711h) this.f20023q0;
                    c10188m.f30315b = interfaceC10197W6;
                    m6683h(c10188m, attributes);
                    m6686k(c10188m, attributes);
                    m6688m(c10188m, attributes);
                    m6682g(c10188m, attributes);
                    m6685j(c10188m, attributes, "polyline");
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10188m);
                    return;
                case 17:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10208d0 c10208d0 = new C10208d0();
                    c10208d0.f30314a = (C13711h) this.f20023q0;
                    c10208d0.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10208d0, attributes);
                    m6686k(c10208d0, attributes);
                    m6684i(c10208d0, attributes);
                    for (int i20 = 0; i20 < attributes.getLength(); i20++) {
                        String strTrim11 = attributes.getValue(i20).trim();
                        int iM9886e8 = AbstractC9306j0.m9886e(attributes, i20);
                        if (iM9886e8 == 6) {
                            c10208d0.f30323m = m6695t(strTrim11);
                        } else if (iM9886e8 == 7) {
                            c10208d0.f30324n = m6695t(strTrim11);
                        } else if (iM9886e8 == 11) {
                            c10208d0.f30326p = m6695t(strTrim11);
                        } else if (iM9886e8 == 12) {
                            c10208d0.f30327q = m6695t(strTrim11);
                        } else if (iM9886e8 != 49) {
                            continue;
                        } else {
                            C10173D c10173dM6695t14 = m6695t(strTrim11);
                            c10208d0.f30325o = c10173dM6695t14;
                            if (c10173dM6695t14.m10770f()) {
                                throw new C10168A0("Invalid <radialGradient> element. r cannot be negative");
                            }
                        }
                    }
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10208d0);
                    this.f20024r0 = c10208d0;
                    return;
                case 18:
                    InterfaceC10197W interfaceC10197W7 = (InterfaceC10197W) this.f20024r0;
                    if (interfaceC10197W7 == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10190O c10190o = new C10190O();
                    c10190o.f30314a = (C13711h) this.f20023q0;
                    c10190o.f30315b = interfaceC10197W7;
                    m6683h(c10190o, attributes);
                    m6686k(c10190o, attributes);
                    m6688m(c10190o, attributes);
                    m6682g(c10190o, attributes);
                    for (int i21 = 0; i21 < attributes.getLength(); i21++) {
                        String strTrim12 = attributes.getValue(i21).trim();
                        int iM9886e9 = AbstractC9306j0.m9886e(attributes, i21);
                        if (iM9886e9 == 25) {
                            C10173D c10173dM6695t15 = m6695t(strTrim12);
                            c10190o.f30252r = c10173dM6695t15;
                            if (c10173dM6695t15.m10770f()) {
                                throw new C10168A0("Invalid <rect> element. height cannot be negative");
                            }
                        } else if (iM9886e9 == 56) {
                            C10173D c10173dM6695t16 = m6695t(strTrim12);
                            c10190o.f30253s = c10173dM6695t16;
                            if (c10173dM6695t16.m10770f()) {
                                throw new C10168A0("Invalid <rect> element. rx cannot be negative");
                            }
                        } else if (iM9886e9 != 57) {
                            switch (iM9886e9) {
                                case 81:
                                    C10173D c10173dM6695t17 = m6695t(strTrim12);
                                    c10190o.f30251q = c10173dM6695t17;
                                    if (c10173dM6695t17.m10770f()) {
                                        throw new C10168A0("Invalid <rect> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    c10190o.f30249o = m6695t(strTrim12);
                                    break;
                                case 83:
                                    c10190o.f30250p = m6695t(strTrim12);
                                    break;
                            }
                        } else {
                            C10173D c10173dM6695t18 = m6695t(strTrim12);
                            c10190o.f30254t = c10173dM6695t18;
                            if (c10173dM6695t18.m10770f()) {
                                throw new C10168A0("Invalid <rect> element. ry cannot be negative");
                            }
                        }
                    }
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10190o);
                    return;
                case 19:
                    InterfaceC10197W interfaceC10197W8 = (InterfaceC10197W) this.f20024r0;
                    if (interfaceC10197W8 == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10191P c10191p = new C10191P();
                    c10191p.f30314a = (C13711h) this.f20023q0;
                    c10191p.f30315b = interfaceC10197W8;
                    m6683h(c10191p, attributes);
                    m6686k(c10191p, attributes);
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10191p);
                    this.f20024r0 = c10191p;
                    return;
                case 20:
                    InterfaceC10197W interfaceC10197W9 = (InterfaceC10197W) this.f20024r0;
                    if (interfaceC10197W9 == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    if (!(interfaceC10197W9 instanceof AbstractC10249y)) {
                        throw new C10168A0("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                    }
                    C10192Q c10192q = new C10192Q();
                    c10192q.f30314a = (C13711h) this.f20023q0;
                    c10192q.f30315b = interfaceC10197W9;
                    m6683h(c10192q, attributes);
                    m6686k(c10192q, attributes);
                    for (int i22 = 0; i22 < attributes.getLength(); i22++) {
                        String strTrim13 = attributes.getValue(i22).trim();
                        if (AbstractC9306j0.m9886e(attributes, i22) == 39) {
                            if (strTrim13.length() == 0) {
                                throw new C10168A0("Invalid offset value in <stop> (empty string)");
                            }
                            int length = strTrim13.length();
                            if (strTrim13.charAt(strTrim13.length() - 1) == '%') {
                                length--;
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            try {
                                float fM6691p = m6691p(length, strTrim13);
                                float f10 = 100.0f;
                                if (z6) {
                                    fM6691p /= 100.0f;
                                }
                                if (fM6691p < 0.0f) {
                                    f10 = 0.0f;
                                } else if (fM6691p <= 100.0f) {
                                    f10 = fM6691p;
                                }
                                c10192q.f30255h = Float.valueOf(f10);
                            } catch (NumberFormatException e10) {
                                throw new C10168A0("Invalid offset value in <stop>: ".concat(strTrim13), e10);
                            }
                        }
                    }
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10192q);
                    this.f20024r0 = c10192q;
                    return;
                case 21:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    String str4 = "all";
                    boolean zEquals = true;
                    for (int i23 = 0; i23 < attributes.getLength(); i23++) {
                        String strTrim14 = attributes.getValue(i23).trim();
                        int iM9886e10 = AbstractC9306j0.m9886e(attributes, i23);
                        if (iM9886e10 == 38) {
                            str4 = strTrim14;
                        } else if (iM9886e10 == 77) {
                            zEquals = strTrim14.equals("text/css");
                        }
                    }
                    if (zEquals) {
                        EnumC10207d enumC10207d = EnumC10207d.f30321Z;
                        C10205c c10205c = new C10205c(str4);
                        c10205c.m5081M();
                        for (EnumC10207d enumC10207d2 : C7042K.m7431f(c10205c)) {
                            if (enumC10207d2 == EnumC10207d.f30320Y || enumC10207d2 == enumC10207d) {
                                this.f20022p0 = true;
                                return;
                            }
                        }
                    }
                    this.f20019Y = true;
                    this.f20020Z = 1;
                    return;
                case 22:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10212f0 c10212f0 = new C10212f0();
                    c10212f0.f30314a = (C13711h) this.f20023q0;
                    c10212f0.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10212f0, attributes);
                    m6686k(c10212f0, attributes);
                    m6688m(c10212f0, attributes);
                    m6682g(c10212f0, attributes);
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10212f0);
                    this.f20024r0 = c10212f0;
                    return;
                case 23:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10214g0 c10214g0 = new C10214g0();
                    c10214g0.f30314a = (C13711h) this.f20023q0;
                    c10214g0.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10214g0, attributes);
                    m6686k(c10214g0, attributes);
                    m6682g(c10214g0, attributes);
                    m6689n(c10214g0, attributes);
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10214g0);
                    this.f20024r0 = c10214g0;
                    return;
                case 24:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10220j0 c10220j0 = new C10220j0();
                    c10220j0.f30314a = (C13711h) this.f20023q0;
                    c10220j0.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10220j0, attributes);
                    m6686k(c10220j0, attributes);
                    m6688m(c10220j0, attributes);
                    m6682g(c10220j0, attributes);
                    m6687l(c10220j0, attributes);
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10220j0);
                    this.f20024r0 = c10220j0;
                    return;
                case 25:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10226m0 c10226m0 = new C10226m0();
                    c10226m0.f30314a = (C13711h) this.f20023q0;
                    c10226m0.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10226m0, attributes);
                    m6686k(c10226m0, attributes);
                    m6682g(c10226m0, attributes);
                    for (int i24 = 0; i24 < attributes.getLength(); i24++) {
                        String strTrim15 = attributes.getValue(i24).trim();
                        int iM9886e11 = AbstractC9306j0.m9886e(attributes, i24);
                        if (iM9886e11 != 26) {
                            if (iM9886e11 == 61) {
                                c10226m0.f30355o = m6695t(strTrim15);
                            }
                        } else if ("".equals(attributes.getURI(i24)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i24))) {
                            c10226m0.f30354n = strTrim15;
                        }
                    }
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10226m0);
                    this.f20024r0 = c10226m0;
                    InterfaceC10197W interfaceC10197W10 = c10226m0.f30315b;
                    if (interfaceC10197W10 instanceof C10220j0) {
                        c10226m0.f30356p = (C10220j0) interfaceC10197W10;
                        return;
                    } else {
                        c10226m0.f30356p = ((InterfaceC10222k0) interfaceC10197W10).mo10790c();
                        return;
                    }
                case 27:
                    InterfaceC10197W interfaceC10197W11 = (InterfaceC10197W) this.f20024r0;
                    if (interfaceC10197W11 == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    if (!(interfaceC10197W11 instanceof AbstractC10224l0)) {
                        throw new C10168A0("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                    C10216h0 c10216h0 = new C10216h0();
                    c10216h0.f30314a = (C13711h) this.f20023q0;
                    c10216h0.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10216h0, attributes);
                    m6686k(c10216h0, attributes);
                    m6682g(c10216h0, attributes);
                    for (int i25 = 0; i25 < attributes.getLength(); i25++) {
                        String strTrim16 = attributes.getValue(i25).trim();
                        if (AbstractC9306j0.m9886e(attributes, i25) == 26 && ("".equals(attributes.getURI(i25)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i25)))) {
                            c10216h0.f30341n = strTrim16;
                        }
                    }
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10216h0);
                    InterfaceC10197W interfaceC10197W12 = c10216h0.f30315b;
                    if (interfaceC10197W12 instanceof C10220j0) {
                        c10216h0.f30342o = (C10220j0) interfaceC10197W12;
                        return;
                    } else {
                        c10216h0.f30342o = ((InterfaceC10222k0) interfaceC10197W12).mo10790c();
                        return;
                    }
                case 28:
                    InterfaceC10197W interfaceC10197W13 = (InterfaceC10197W) this.f20024r0;
                    if (interfaceC10197W13 == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    if (!(interfaceC10197W13 instanceof AbstractC10224l0)) {
                        throw new C10168A0("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                    C10218i0 c10218i0 = new C10218i0();
                    c10218i0.f30314a = (C13711h) this.f20023q0;
                    c10218i0.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10218i0, attributes);
                    m6686k(c10218i0, attributes);
                    m6682g(c10218i0, attributes);
                    m6687l(c10218i0, attributes);
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10218i0);
                    this.f20024r0 = c10218i0;
                    InterfaceC10197W interfaceC10197W14 = c10218i0.f30315b;
                    if (interfaceC10197W14 instanceof C10220j0) {
                        c10218i0.f30344r = (C10220j0) interfaceC10197W14;
                        return;
                    } else {
                        c10218i0.f30344r = ((InterfaceC10222k0) interfaceC10197W14).mo10790c();
                        return;
                    }
                case 29:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10232p0 c10232p0 = new C10232p0();
                    c10232p0.f30314a = (C13711h) this.f20023q0;
                    c10232p0.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10232p0, attributes);
                    m6686k(c10232p0, attributes);
                    m6688m(c10232p0, attributes);
                    m6682g(c10232p0, attributes);
                    for (int i26 = 0; i26 < attributes.getLength(); i26++) {
                        String strTrim17 = attributes.getValue(i26).trim();
                        int iM9886e12 = AbstractC9306j0.m9886e(attributes, i26);
                        if (iM9886e12 == 25) {
                            C10173D c10173dM6695t19 = m6695t(strTrim17);
                            c10232p0.f30384s = c10173dM6695t19;
                            if (c10173dM6695t19.m10770f()) {
                                throw new C10168A0("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iM9886e12 != 26) {
                            switch (iM9886e12) {
                                case 81:
                                    C10173D c10173dM6695t20 = m6695t(strTrim17);
                                    c10232p0.f30383r = c10173dM6695t20;
                                    if (c10173dM6695t20.m10770f()) {
                                        throw new C10168A0("Invalid <use> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    c10232p0.f30381p = m6695t(strTrim17);
                                    break;
                                case 83:
                                    c10232p0.f30382q = m6695t(strTrim17);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i26)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i26))) {
                            c10232p0.f30380o = strTrim17;
                        }
                    }
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10232p0);
                    this.f20024r0 = c10232p0;
                    return;
                case 30:
                    if (((InterfaceC10197W) this.f20024r0) == null) {
                        throw new C10168A0("Invalid document. Root element must be <svg>");
                    }
                    C10234q0 c10234q0 = new C10234q0();
                    c10234q0.f30314a = (C13711h) this.f20023q0;
                    c10234q0.f30315b = (InterfaceC10197W) this.f20024r0;
                    m6683h(c10234q0, attributes);
                    m6682g(c10234q0, attributes);
                    m6689n(c10234q0, attributes);
                    ((InterfaceC10197W) this.f20024r0).mo10773j(c10234q0);
                    this.f20024r0 = c10234q0;
                    return;
                default:
                    this.f20019Y = true;
                    this.f20020Z = 1;
                    return;
            }
        }
    }
}
