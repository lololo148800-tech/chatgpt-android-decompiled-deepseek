package p1032u4;

import android.gov.nist.core.Separators;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p1053v3.C20424e;
import p1053v3.C20425f;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p523V9.AbstractC8011V4;
import p644ab.AbstractC10531d;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: u4.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20114h {

    /* JADX INFO: renamed from: a */
    public static final Pattern f63734a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f63735b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c */
    public static final Map f63736c;

    /* JADX INFO: renamed from: d */
    public static final Map f63737d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f63736c = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f63737d = DesugarCollections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: a */
    public static void m20951a(String str, C20111e c20111e, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10;
        int i11 = c20111e.f63718b;
        int length = spannableStringBuilder.length();
        String str2 = c20111e.f63717a;
        str2.getClass();
        int i12 = -1;
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i11, length, 33);
                break;
            case "c":
                for (String str3 : c20111e.f63720d) {
                    Map map = f63736c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i11, length, 33);
                    } else {
                        Map map2 = f63737d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i11, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                break;
            case "ruby":
                int iM20953c = m20953c(list2, str, c20111e);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C20110d.f63714c);
                int i13 = c20111e.f63718b;
                int i14 = 0;
                int length2 = 0;
                while (i14 < arrayList.size()) {
                    if ("rt".equals(((C20110d) arrayList.get(i14)).f63715a.f63717a)) {
                        C20110d c20110d = (C20110d) arrayList.get(i14);
                        int iM20953c2 = m20953c(list2, str, c20110d.f63715a);
                        if (iM20953c2 == i12) {
                            iM20953c2 = iM20953c != i12 ? iM20953c : 1;
                        }
                        int i15 = c20110d.f63715a.f63718b - length2;
                        int i16 = c20110d.f63716b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i15, i16);
                        spannableStringBuilder.delete(i15, i16);
                        spannableStringBuilder.setSpan(new C20425f(charSequenceSubSequence.toString(), iM20953c2), i13, i15, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i13 = i15;
                    }
                    i14++;
                    i12 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListM20952b = m20952b(list2, str, c20111e);
        for (int i17 = 0; i17 < arrayListM20952b.size(); i17++) {
            C20108b c20108b = ((C20112f) arrayListM20952b.get(i17)).f63722Z;
            int i18 = c20108b.f63705k;
            if (i18 == -1 && c20108b.f63706l == -1) {
                i10 = -1;
            } else {
                i10 = (c20108b.f63706l == 1 ? (char) 2 : (char) 0) | (i18 == 1 ? (char) 1 : (char) 0);
            }
            if (i10 != -1) {
                int i19 = c20108b.f63705k;
                AbstractC8011V4.m8327c(spannableStringBuilder, new StyleSpan((i19 == -1 && c20108b.f63706l == -1) ? -1 : (i19 == 1 ? 1 : 0) | (c20108b.f63706l == 1 ? 2 : 0)), i11, length);
            }
            if (c20108b.f63704j == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
            }
            if (c20108b.f63701g) {
                if (!c20108b.f63701g) {
                    throw new IllegalStateException("Font color not defined");
                }
                AbstractC8011V4.m8327c(spannableStringBuilder, new ForegroundColorSpan(c20108b.f63700f), i11, length);
            }
            if (c20108b.f63703i) {
                if (!c20108b.f63703i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                AbstractC8011V4.m8327c(spannableStringBuilder, new BackgroundColorSpan(c20108b.f63702h), i11, length);
            }
            if (c20108b.f63699e != null) {
                AbstractC8011V4.m8327c(spannableStringBuilder, new TypefaceSpan(c20108b.f63699e), i11, length);
            }
            int i20 = c20108b.f63707m;
            if (i20 == 1) {
                AbstractC8011V4.m8327c(spannableStringBuilder, new AbsoluteSizeSpan((int) c20108b.f63708n, true), i11, length);
            } else if (i20 == 2) {
                AbstractC8011V4.m8327c(spannableStringBuilder, new RelativeSizeSpan(c20108b.f63708n), i11, length);
            } else if (i20 == 3) {
                AbstractC8011V4.m8327c(spannableStringBuilder, new RelativeSizeSpan(c20108b.f63708n / 100.0f), i11, length);
            }
            if (c20108b.f63710p) {
                spannableStringBuilder.setSpan(new C20424e(), i11, length, 33);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: b */
    public static ArrayList m20952b(List list, String str, C20111e c20111e) {
        ?? r6;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C20108b c20108b = (C20108b) list.get(i10);
            String str2 = c20111e.f63717a;
            if (c20108b.f63695a.isEmpty() && c20108b.f63696b.isEmpty() && c20108b.f63697c.isEmpty() && c20108b.f63698d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iM20949a = C20108b.m20949a(c20108b.f63698d, C20108b.m20949a(c20108b.f63696b, C20108b.m20949a(c20108b.f63695a, 0, 1073741824, str), 2, str2), 4, c20111e.f63719c);
                if (iM20949a != -1) {
                    if (c20111e.f63720d.containsAll(c20108b.f63697c)) {
                        size = iM20949a + (c20108b.f63697c.size() * 4);
                    } else {
                        r6 = 0;
                    }
                } else {
                    r6 = 0;
                }
            }
            if (r6 > 0) {
                r6 = size;
                r6 = zIsEmpty;
                arrayList.add(new C20112f(r6, c20108b));
            } else {
                r6 = size;
                r6 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static int m20953c(List list, String str, C20111e c20111e) {
        ArrayList arrayListM20952b = m20952b(list, str, c20111e);
        for (int i10 = 0; i10 < arrayListM20952b.size(); i10++) {
            int i11 = ((C20112f) arrayListM20952b.get(i10)).f63722Z.f63709o;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static C20109c m20954d(String str, Matcher matcher, C20811m c20811m, ArrayList arrayList) {
        C20113g c20113g = new C20113g();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c20113g.f63723a = AbstractC20115i.m20959b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c20113g.f63724b = AbstractC20115i.m20959b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m20955e(strGroup3, c20113g);
            StringBuilder sb2 = new StringBuilder();
            c20811m.getClass();
            String strM21353h = c20811m.m21353h(AbstractC10531d.f31242c);
            while (!TextUtils.isEmpty(strM21353h)) {
                if (sb2.length() > 0) {
                    sb2.append(Separators.RETURN);
                }
                sb2.append(strM21353h.trim());
                strM21353h = c20811m.m21353h(AbstractC10531d.f31242c);
            }
            c20113g.f63725c = m20956f(str, sb2.toString(), arrayList);
            return new C20109c(c20113g.m20950a().m21081a(), c20113g.f63723a, c20113g.f63724b);
        } catch (NumberFormatException unused) {
            AbstractC20800b.m21332t("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    public static void m20955e(String str, C20113g c20113g) {
        int i10;
        int i11;
        int i12;
        Matcher matcher = f63735b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    m20957g(strGroup2, c20113g);
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            i10 = 2;
                            break;
                        case "end":
                            i10 = 3;
                            break;
                        case "left":
                            i10 = 4;
                            break;
                        case "right":
                            i10 = 5;
                            break;
                        case "start":
                            i10 = 1;
                            break;
                        default:
                            AbstractC20800b.m21332t("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i10 = 2;
                            break;
                    }
                    c20113g.f63726d = i10;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        strSubstring.getClass();
                        switch (strSubstring) {
                            case "line-left":
                            case "start":
                                i11 = 0;
                                break;
                            case "center":
                            case "middle":
                                i11 = 1;
                                break;
                            case "line-right":
                            case "end":
                                i11 = 2;
                                break;
                            default:
                                AbstractC20800b.m21332t("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                i11 = Integer.MIN_VALUE;
                                break;
                        }
                        c20113g.f63731i = i11;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    c20113g.f63730h = AbstractC20115i.m20958a(strGroup2);
                } else if ("size".equals(strGroup)) {
                    c20113g.f63732j = AbstractC20115i.m20958a(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    if (strGroup2.equals("lr")) {
                        i12 = 2;
                    } else if (strGroup2.equals("rl")) {
                        i12 = 1;
                    } else {
                        AbstractC20800b.m21332t("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                        i12 = Integer.MIN_VALUE;
                    }
                    c20113g.f63733k = i12;
                } else {
                    AbstractC20800b.m21332t("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                AbstractC20800b.m21332t("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x00fb. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f */
    public static SpannedString m20956f(String str, String str2, List list) {
        int i10;
        int i11;
        int i12;
        char c9;
        int i13 = -1;
        int i14 = 2;
        int i15 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i16 = 0;
        while (true) {
            String strTrim = "";
            if (i16 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    m20951a(str, (C20111e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                m20951a(str, new C20111e(0, "", "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i16);
            if (cCharAt != '&') {
                if (cCharAt != '<') {
                    spannableStringBuilder.append(cCharAt);
                    i16 += i15;
                } else {
                    int i17 = i16 + 1;
                    if (i17 >= str2.length()) {
                        i16 = i17;
                    } else {
                        int i18 = str2.charAt(i17) == '/' ? i15 : 0;
                        int iIndexOf = str2.indexOf(62, i17);
                        int length = iIndexOf == i13 ? str2.length() : iIndexOf + i15;
                        int i19 = length - 2;
                        int i20 = str2.charAt(i19) == '/' ? i15 : 0;
                        int i21 = i16 + (i18 != 0 ? i14 : i15);
                        if (i20 == 0) {
                            i19 = length - 1;
                        }
                        String strSubstring = str2.substring(i21, i19);
                        if (!strSubstring.trim().isEmpty()) {
                            String strTrim2 = strSubstring.trim();
                            AbstractC20800b.m21316d(strTrim2.isEmpty() ^ i15);
                            int i22 = AbstractC20817s.f66106a;
                            String str3 = strTrim2.split("[ \\.]", i14)[0];
                            str3.getClass();
                            switch (str3.hashCode()) {
                                case 98:
                                    if (str3.equals("b")) {
                                        i12 = 0;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                case 99:
                                    if (str3.equals("c")) {
                                        i12 = i15;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                case 105:
                                    if (str3.equals("i")) {
                                        i12 = i14;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                case 117:
                                    if (str3.equals("u")) {
                                        i12 = 3;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                case 118:
                                    if (str3.equals("v")) {
                                        i12 = 4;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                case 3650:
                                    if (str3.equals("rt")) {
                                        i12 = 5;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                case 3314158:
                                    if (str3.equals("lang")) {
                                        i12 = 6;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                case 3511770:
                                    if (str3.equals("ruby")) {
                                        i12 = 7;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                default:
                                    i12 = -1;
                                    break;
                            }
                            switch (i12) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    if (i18 != 0) {
                                        while (!arrayDeque.isEmpty()) {
                                            C20111e c20111e = (C20111e) arrayDeque.pop();
                                            m20951a(str, c20111e, arrayList, spannableStringBuilder, list);
                                            if (arrayDeque.isEmpty()) {
                                                arrayList.clear();
                                            } else {
                                                arrayList.add(new C20110d(c20111e, spannableStringBuilder.length()));
                                            }
                                            if (c20111e.f63717a.equals(str3)) {
                                            }
                                        }
                                    } else if (i20 == 0) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring.trim();
                                        AbstractC20800b.m21316d(strTrim3.isEmpty() ^ i15);
                                        int iIndexOf2 = strTrim3.indexOf(Separators.f31991SP);
                                        if (iIndexOf2 == -1) {
                                            c9 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf2).trim();
                                            c9 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf2);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str4 = strArrSplit[c9];
                                        HashSet hashSet = new HashSet();
                                        for (int i23 = i15; i23 < strArrSplit.length; i23 += i15) {
                                            hashSet.add(strArrSplit[i23]);
                                        }
                                        arrayDeque.push(new C20111e(length2, str4, strTrim, hashSet));
                                    }
                                    i16 = length;
                                    i11 = i15;
                                    i10 = -1;
                                    break;
                                default:
                                    break;
                            }
                        }
                        i16 = length;
                        i13 = -1;
                    }
                }
                i11 = i15;
                i10 = i13;
            } else {
                i16 += i15;
                int iIndexOf3 = str2.indexOf(59, i16);
                int iIndexOf4 = str2.indexOf(32, i16);
                i10 = -1;
                if (iIndexOf3 == -1) {
                    iIndexOf3 = iIndexOf4;
                } else if (iIndexOf4 != -1) {
                    iIndexOf3 = Math.min(iIndexOf3, iIndexOf4);
                }
                if (iIndexOf3 != -1) {
                    String strSubstring2 = str2.substring(i16, iIndexOf3);
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            AbstractC20800b.m21332t("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring2 + ";'");
                            break;
                    }
                    if (iIndexOf3 == iIndexOf4) {
                        spannableStringBuilder.append((CharSequence) Separators.f31991SP);
                    }
                    i11 = 1;
                    i16 = iIndexOf3 + 1;
                } else {
                    i11 = 1;
                    spannableStringBuilder.append(cCharAt);
                }
            }
            i13 = i10;
            i14 = 2;
            i15 = i11;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m20957g(String str, C20113g c20113g) {
        int i10 = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i10 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i10 = 0;
                    break;
                default:
                    AbstractC20800b.m21332t("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            c20113g.f63729g = i10;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith(Separators.PERCENT)) {
            c20113g.f63727e = AbstractC20115i.m20958a(str);
            c20113g.f63728f = 0;
        } else {
            c20113g.f63727e = Integer.parseInt(str);
            c20113g.f63728f = 1;
        }
    }
}
