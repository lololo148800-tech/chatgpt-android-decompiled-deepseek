package p957q4;

import android.gov.nist.core.Separators;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001A.AbstractC0010F;
import p084D4.C1951y0;
import p1053v3.C20421b;
import p1071w0.AbstractC20734X;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1073w3.InterfaceC20802d;
import p479Td.AbstractC7360k;
import p644ab.AbstractC10531d;
import p775h2.AbstractC14376f;
import p885m4.C17153c;
import p885m4.C17162l;
import p885m4.InterfaceC17157g;
import p885m4.InterfaceC17163m;

/* JADX INFO: renamed from: q4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18622a implements InterfaceC17163m {

    /* JADX INFO: renamed from: s0 */
    public static final Pattern f59314s0 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: Y */
    public final boolean f59315Y;

    /* JADX INFO: renamed from: Z */
    public final C1951y0 f59316Z;

    /* JADX INFO: renamed from: p0 */
    public LinkedHashMap f59318p0;

    /* JADX INFO: renamed from: q0 */
    public float f59319q0 = -3.4028235E38f;

    /* JADX INFO: renamed from: r0 */
    public float f59320r0 = -3.4028235E38f;

    /* JADX INFO: renamed from: o0 */
    public final C20811m f59317o0 = new C20811m();

    public C18622a(List list) {
        if (list == null || list.isEmpty()) {
            this.f59315Y = false;
            this.f59316Z = null;
            return;
        }
        this.f59315Y = true;
        String strM21412m = AbstractC20817s.m21412m((byte[]) list.get(0));
        AbstractC20800b.m21316d(strM21412m.startsWith("Format:"));
        C1951y0 c1951y0M3131b = C1951y0.m3131b(strM21412m);
        c1951y0M3131b.getClass();
        this.f59316Z = c1951y0M3131b;
        m19979b(new C20811m((byte[]) list.get(1)), AbstractC10531d.f31242c);
    }

    /* JADX INFO: renamed from: a */
    public static int m19977a(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, Long.valueOf(j10));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    /* JADX INFO: renamed from: d */
    public static long m19978d(String str) {
        Matcher matcher = f59314s0.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i10 = AbstractC20817s.f66106a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Code duplicated, block: B:167:0x02d4  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public final void m19979b(C20811m c20811m, Charset charset) {
        int i10;
        C18625d c18625d;
        float f10;
        int i11;
        int i12;
        float f11;
        int i13 = 6;
        int i14 = 7;
        int i15 = 2;
        int i16 = 0;
        while (true) {
            String strM21353h = c20811m.m21353h(charset);
            if (strM21353h == null) {
                return;
            }
            char c9 = '[';
            if ("[Script Info]".equalsIgnoreCase(strM21353h)) {
                while (true) {
                    String strM21353h2 = c20811m.m21353h(charset);
                    if (strM21353h2 == null || (c20811m.m21346a() != 0 && c20811m.m21348c(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strM21353h2.split(":");
                    if (strArrSplit.length == i15) {
                        String strM7787d = AbstractC7360k.m7787d(strArrSplit[i16].trim());
                        strM7787d.getClass();
                        if (strM7787d.equals("playresx")) {
                            this.f59319q0 = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strM7787d.equals("playresy")) {
                            try {
                                this.f59320r0 = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else {
                if ("[V4+ Styles]".equalsIgnoreCase(strM21353h)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C18623b c18623b = null;
                    while (true) {
                        String strM21353h3 = c20811m.m21353h(charset);
                        if (strM21353h3 != null && (c20811m.m21346a() == 0 || c20811m.m21348c(charset) != c9)) {
                            if (strM21353h3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strM21353h3.substring(i14), Separators.COMMA);
                                int i17 = -1;
                                int i18 = -1;
                                int i19 = -1;
                                int i20 = -1;
                                int i21 = -1;
                                int i22 = -1;
                                int i23 = -1;
                                int i24 = -1;
                                int i25 = -1;
                                int i26 = -1;
                                for (int i27 = i16; i27 < strArrSplit2.length; i27++) {
                                    String strM7787d2 = AbstractC7360k.m7787d(strArrSplit2[i27].trim());
                                    strM7787d2.getClass();
                                    switch (strM7787d2.hashCode()) {
                                        case -1178781136:
                                            i10 = strM7787d2.equals("italic") ? i16 : -1;
                                            break;
                                        case -1026963764:
                                            i10 = strM7787d2.equals("underline") ? 1 : -1;
                                            break;
                                        case -192095652:
                                            i10 = strM7787d2.equals("strikeout") ? i15 : -1;
                                            break;
                                        case -70925746:
                                            i10 = strM7787d2.equals("primarycolour") ? 3 : -1;
                                            break;
                                        case 3029637:
                                            i10 = strM7787d2.equals("bold") ? 4 : -1;
                                            break;
                                        case 3373707:
                                            i10 = strM7787d2.equals(DiagnosticsEntry.NAME_KEY) ? 5 : -1;
                                            break;
                                        case 366554320:
                                            i10 = strM7787d2.equals("fontsize") ? i13 : -1;
                                            break;
                                        case 767321349:
                                            i10 = strM7787d2.equals("borderstyle") ? 7 : -1;
                                            break;
                                        case 1767875043:
                                            i10 = strM7787d2.equals("alignment") ? 8 : -1;
                                            break;
                                        case 1988365454:
                                            i10 = strM7787d2.equals("outlinecolour") ? 9 : -1;
                                            break;
                                        default:
                                            i10 = -1;
                                            break;
                                    }
                                    switch (i10) {
                                        case 0:
                                            i23 = i27;
                                            break;
                                        case 1:
                                            i24 = i27;
                                            break;
                                        case 2:
                                            i25 = i27;
                                            break;
                                        case 3:
                                            i19 = i27;
                                            break;
                                        case 4:
                                            i22 = i27;
                                            break;
                                        case 5:
                                            i17 = i27;
                                            break;
                                        case 6:
                                            i21 = i27;
                                            break;
                                        case 7:
                                            i26 = i27;
                                            break;
                                        case 8:
                                            i18 = i27;
                                            break;
                                        case 9:
                                            i20 = i27;
                                            break;
                                    }
                                }
                                c18623b = i17 != -1 ? new C18623b(i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, strArrSplit2.length) : null;
                                i14 = 7;
                            } else {
                                if (strM21353h3.startsWith("Style:")) {
                                    if (c18623b == null) {
                                        AbstractC20800b.m21332t("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strM21353h3));
                                    } else {
                                        AbstractC20800b.m21316d(strM21353h3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strM21353h3.substring(i13), Separators.COMMA);
                                        int length = strArrSplit3.length;
                                        int i28 = c18623b.f59331k;
                                        if (length != i28) {
                                            int length2 = strArrSplit3.length;
                                            int i29 = AbstractC20817s.f66106a;
                                            Locale locale = Locale.US;
                                            StringBuilder sbM21e = AbstractC0010F.m21e("Skipping malformed 'Style:' line (expected ", i28, " values, found ", length2, "): '");
                                            sbM21e.append(strM21353h3);
                                            sbM21e.append(Separators.QUOTE);
                                            AbstractC20800b.m21332t("SsaStyle", sbM21e.toString());
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[c18623b.f59321a].trim();
                                                int i30 = c18623b.f59322b;
                                                int iM19981a = i30 != -1 ? C18625d.m19981a(strArrSplit3[i30].trim()) : -1;
                                                int i31 = c18623b.f59323c;
                                                Integer numM19983c = i31 != -1 ? C18625d.m19983c(strArrSplit3[i31].trim()) : null;
                                                int i32 = c18623b.f59324d;
                                                Integer numM19983c2 = i32 != -1 ? C18625d.m19983c(strArrSplit3[i32].trim()) : null;
                                                int i33 = c18623b.f59325e;
                                                if (i33 != -1) {
                                                    String strTrim2 = strArrSplit3[i33].trim();
                                                    try {
                                                        f11 = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e10) {
                                                        AbstractC20800b.m21333u("SsaStyle", "Failed to parse font size: '" + strTrim2 + Separators.QUOTE, e10);
                                                        f11 = -3.4028235E38f;
                                                    }
                                                    f10 = f11;
                                                } else {
                                                    f10 = -3.4028235E38f;
                                                }
                                                int i34 = c18623b.f59326f;
                                                boolean z6 = i34 != -1 && C18625d.m19982b(strArrSplit3[i34].trim());
                                                int i35 = c18623b.f59327g;
                                                boolean z10 = i35 != -1 && C18625d.m19982b(strArrSplit3[i35].trim());
                                                int i36 = c18623b.f59328h;
                                                boolean z11 = i36 != -1 && C18625d.m19982b(strArrSplit3[i36].trim());
                                                int i37 = c18623b.f59329i;
                                                boolean z12 = i37 != -1 && C18625d.m19982b(strArrSplit3[i37].trim());
                                                int i38 = c18623b.f59330j;
                                                if (i38 != -1) {
                                                    String strTrim3 = strArrSplit3[i38].trim();
                                                    try {
                                                        i12 = Integer.parseInt(strTrim3.trim());
                                                        if (i12 != 1 && i12 != 3) {
                                                            AbstractC20800b.m21332t("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                            i12 = -1;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    i11 = i12;
                                                } else {
                                                    i11 = -1;
                                                }
                                                c18625d = new C18625d(strTrim, iM19981a, numM19983c, numM19983c2, f10, z6, z10, z11, z12, i11);
                                            } catch (RuntimeException e11) {
                                                AbstractC20800b.m21333u("SsaStyle", "Skipping malformed 'Style:' line: '" + strM21353h3 + Separators.QUOTE, e11);
                                                c18625d = null;
                                            }
                                            if (c18625d != null) {
                                                linkedHashMap.put(c18625d.f59336a, c18625d);
                                            }
                                        }
                                        c18625d = null;
                                        if (c18625d != null) {
                                            linkedHashMap.put(c18625d.f59336a, c18625d);
                                        }
                                    }
                                }
                                i13 = 6;
                                i14 = 7;
                                i15 = 2;
                                i16 = 0;
                                c9 = '[';
                            }
                        }
                    }
                    this.f59318p0 = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(strM21353h)) {
                    AbstractC20800b.m21327o("SsaParser", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(strM21353h)) {
                    return;
                }
                i13 = 6;
                i14 = 7;
                i15 = 2;
                i16 = 0;
            }
        }
    }

    @Override // p885m4.InterfaceC17163m
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo3514c() {
    }

    @Override // p885m4.InterfaceC17163m
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC17157g mo3516i(byte[] bArr, int i10, int i11) {
        return AbstractC14376f.m15838d(this, bArr, i11);
    }

    @Override // p885m4.InterfaceC17163m
    /* JADX INFO: renamed from: o */
    public final void mo3519o(byte[] bArr, int i10, int i11, C17162l c17162l, InterfaceC20802d interfaceC20802d) {
        C1951y0 c1951y0;
        C20811m c20811m;
        float f10;
        int i12;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i13;
        int i14;
        int i15;
        float f11;
        float f12;
        float f13;
        float f14;
        int i16;
        int i17;
        float f15;
        int i18;
        int i19;
        Integer num;
        int iM19981a;
        int i20;
        C18622a c18622a = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C20811m c20811m2 = c18622a.f59317o0;
        c20811m2.m21342D(i10 + i11, bArr);
        c20811m2.m21344F(i10);
        Charset charsetM21340B = c20811m2.m21340B();
        if (charsetM21340B == null) {
            charsetM21340B = AbstractC10531d.f31242c;
        }
        boolean z6 = c18622a.f59315Y;
        if (!z6) {
            c18622a.m19979b(c20811m2, charsetM21340B);
        }
        C1951y0 c1951y0M3131b = z6 ? c18622a.f59316Z : null;
        while (true) {
            String strM21353h = c20811m2.m21353h(charsetM21340B);
            if (strM21353h == null) {
                long j10 = c17162l.f54834a;
                ArrayList arrayList3 = (j10 == -9223372036854775807L || !c17162l.f54835b) ? null : new ArrayList();
                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                    List list = (List) arrayList.get(i21);
                    if (!list.isEmpty() || i21 == 0) {
                        if (i21 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i21)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i21 + 1)).longValue() - ((Long) arrayList2.get(i21)).longValue();
                        if (j10 == -9223372036854775807L || jLongValue >= j10) {
                            interfaceC20802d.accept(new C17153c(list, jLongValue, jLongValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new C17153c(list, jLongValue, jLongValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        interfaceC20802d.accept((C17153c) it.next());
                    }
                    return;
                }
                return;
            }
            if (strM21353h.startsWith("Format:")) {
                c1951y0M3131b = C1951y0.m3131b(strM21353h);
            } else {
                if (strM21353h.startsWith("Dialogue:")) {
                    if (c1951y0M3131b == null) {
                        AbstractC20800b.m21332t("SsaParser", "Skipping dialogue line before complete format: ".concat(strM21353h));
                    } else {
                        AbstractC20800b.m21316d(strM21353h.startsWith("Dialogue:"));
                        String strSubstring = strM21353h.substring(9);
                        int i22 = c1951y0M3131b.f5781e;
                        String[] strArrSplit = strSubstring.split(Separators.COMMA, i22);
                        if (strArrSplit.length != i22) {
                            AbstractC20800b.m21332t("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strM21353h));
                        } else {
                            c20811m = c20811m2;
                            long jM19978d = m19978d(strArrSplit[c1951y0M3131b.f5777a]);
                            if (jM19978d == -9223372036854775807L) {
                                AbstractC20800b.m21332t("SsaParser", "Skipping invalid timing: ".concat(strM21353h));
                            } else {
                                long jM19978d2 = m19978d(strArrSplit[c1951y0M3131b.f5778b]);
                                if (jM19978d2 == -9223372036854775807L) {
                                    AbstractC20800b.m21332t("SsaParser", "Skipping invalid timing: ".concat(strM21353h));
                                } else {
                                    LinkedHashMap linkedHashMap = c18622a.f59318p0;
                                    C18625d c18625d = (linkedHashMap == null || (i20 = c1951y0M3131b.f5779c) == -1) ? null : (C18625d) linkedHashMap.get(strArrSplit[i20].trim());
                                    String str = strArrSplit[c1951y0M3131b.f5780d];
                                    Matcher matcher = C18624c.f59332a.matcher(str);
                                    int i23 = -1;
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        C1951y0 c1951y1 = c1951y0M3131b;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFM19980a = C18624c.m19980a(strGroup);
                                            if (pointFM19980a != null) {
                                                pointF = pointFM19980a;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = C18624c.f59335d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iM19981a = C18625d.m19981a(strGroup2);
                                            } else {
                                                iM19981a = -1;
                                            }
                                            if (iM19981a != -1) {
                                                i23 = iM19981a;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        c1951y0M3131b = c1951y1;
                                    }
                                    c1951y0 = c1951y0M3131b;
                                    String strReplace = C18624c.f59332a.matcher(str).replaceAll("").replace("\\N", Separators.RETURN).replace("\\n", Separators.RETURN).replace("\\h", " ");
                                    float f16 = c18622a.f59319q0;
                                    float f17 = c18622a.f59320r0;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (c18625d != null) {
                                        Integer num2 = c18625d.f59338c;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (c18625d.f59345j == 3 && (num = c18625d.f59339d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f18 = c18625d.f59340e;
                                        if (f18 == -3.4028235E38f || f17 == -3.4028235E38f) {
                                            f14 = -3.4028235E38f;
                                            i16 = Integer.MIN_VALUE;
                                        } else {
                                            f14 = f18 / f17;
                                            i16 = 1;
                                        }
                                        boolean z10 = c18625d.f59342g;
                                        boolean z11 = c18625d.f59341f;
                                        if (z11 && z10) {
                                            i17 = i16;
                                            f15 = f14;
                                            i18 = 0;
                                            i19 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i17 = i16;
                                            f15 = f14;
                                            i18 = 0;
                                            i19 = 33;
                                            if (z11) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z10) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (c18625d.f59343h) {
                                            spannableString.setSpan(new UnderlineSpan(), i18, spannableString.length(), i19);
                                        }
                                        if (c18625d.f59344i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i18, spannableString.length(), i19);
                                        }
                                        f10 = f15;
                                        i12 = i17;
                                    } else {
                                        c20811m = c20811m;
                                        f10 = -3.4028235E38f;
                                        i12 = Integer.MIN_VALUE;
                                    }
                                    int i24 = -1;
                                    if (i23 != -1) {
                                        i24 = i23;
                                    } else if (c18625d != null) {
                                        i24 = c18625d.f59337b;
                                    }
                                    switch (i24) {
                                        case 0:
                                        default:
                                            AbstractC20734X.m21224A(i24, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i25 = Integer.MIN_VALUE;
                                    switch (i24) {
                                        case 0:
                                        default:
                                            AbstractC20734X.m21224A(i24, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            i13 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i13 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i13 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i13 = 2;
                                            break;
                                    }
                                    switch (i24) {
                                        case 0:
                                        default:
                                            AbstractC20734X.m21224A(i24, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i25 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i25 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i25 = 0;
                                            break;
                                    }
                                    if (pointF == 0 || f17 == -3.4028235E38f || f16 == -3.4028235E38f) {
                                        float f19 = 0.95f;
                                        if (i13 != 0) {
                                            i14 = 1;
                                            if (i13 != 1) {
                                                i15 = 2;
                                                f11 = i13 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i15 = 2;
                                                f11 = 0.5f;
                                            }
                                        } else {
                                            i14 = 1;
                                            i15 = 2;
                                            f11 = 0.05f;
                                        }
                                        if (i25 == 0) {
                                            f19 = 0.05f;
                                        } else if (i25 == i14) {
                                            f19 = 0.5f;
                                        } else if (i25 != i15) {
                                            f19 = -3.4028235E38f;
                                        }
                                        f12 = f19;
                                        f13 = f11;
                                    } else {
                                        float f20 = pointF.x / f16;
                                        f12 = pointF.y / f17;
                                        f13 = f20;
                                    }
                                    C20421b c20421b = new C20421b(spannableString, alignment2, null, null, f12, 0, i25, f13, i13, i12, f10, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int iM19977a = m19977a(jM19978d2, arrayList2, arrayList);
                                    for (int iM19977a2 = m19977a(jM19978d, arrayList2, arrayList); iM19977a2 < iM19977a; iM19977a2++) {
                                        ((List) arrayList.get(iM19977a2)).add(c20421b);
                                    }
                                }
                            }
                            c1951y0 = c1951y0M3131b;
                            c20811m = c20811m;
                        }
                    }
                    c1951y0 = c1951y0M3131b;
                    c20811m = c20811m2;
                } else {
                    c1951y0 = c1951y0M3131b;
                    c20811m = c20811m2;
                }
                c18622a = this;
                charsetM21340B = charsetM21340B;
                c1951y0M3131b = c1951y0;
                c20811m2 = c20811m;
            }
        }
    }
}
