package p1004s4;

import android.gov.nist.core.Separators;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p1053v3.C20420a;
import p1053v3.C20424e;
import p1053v3.C20425f;
import p1053v3.C20426g;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p523V9.AbstractC8011V4;
import p523V9.AbstractC8242z0;

/* JADX INFO: renamed from: s4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C19443c {

    /* JADX INFO: renamed from: a */
    public final String f61654a;

    /* JADX INFO: renamed from: b */
    public final String f61655b;

    /* JADX INFO: renamed from: c */
    public final boolean f61656c;

    /* JADX INFO: renamed from: d */
    public final long f61657d;

    /* JADX INFO: renamed from: e */
    public final long f61658e;

    /* JADX INFO: renamed from: f */
    public final C19447g f61659f;

    /* JADX INFO: renamed from: g */
    public final String[] f61660g;

    /* JADX INFO: renamed from: h */
    public final String f61661h;

    /* JADX INFO: renamed from: i */
    public final String f61662i;

    /* JADX INFO: renamed from: j */
    public final C19443c f61663j;

    /* JADX INFO: renamed from: k */
    public final HashMap f61664k;

    /* JADX INFO: renamed from: l */
    public final HashMap f61665l;

    /* JADX INFO: renamed from: m */
    public ArrayList f61666m;

    public C19443c(String str, String str2, long j10, long j11, C19447g c19447g, String[] strArr, String str3, String str4, C19443c c19443c) {
        this.f61654a = str;
        this.f61655b = str2;
        this.f61662i = str4;
        this.f61659f = c19447g;
        this.f61660g = strArr;
        this.f61656c = str2 != null;
        this.f61657d = j10;
        this.f61658e = j11;
        str3.getClass();
        this.f61661h = str3;
        this.f61663j = c19443c;
        this.f61664k = new HashMap();
        this.f61665l = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static C19443c m20518a(String str) {
        return new C19443c(null, str.replaceAll(Separators.NEWLINE, Separators.RETURN).replaceAll(" *\n *", Separators.RETURN).replaceAll(Separators.RETURN, Separators.f31991SP).replaceAll("[ \t\\x0B\f\r]+", Separators.f31991SP), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: e */
    public static SpannableStringBuilder m20519e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C20420a c20420a = new C20420a();
            c20420a.f64541a = new SpannableStringBuilder();
            treeMap.put(str, c20420a);
        }
        CharSequence charSequence = ((C20420a) treeMap.get(str)).f64541a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* JADX INFO: renamed from: b */
    public final C19443c m20520b(int i10) {
        ArrayList arrayList = this.f61666m;
        if (arrayList != null) {
            return (C19443c) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: c */
    public final int m20521c() {
        ArrayList arrayList = this.f61666m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: d */
    public final void m20522d(TreeSet treeSet, boolean z6) {
        String str = this.f61654a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z6 || zEquals || (zEquals2 && this.f61662i != null)) {
            long j10 = this.f61657d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f61658e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f61666m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f61666m.size(); i10++) {
            ((C19443c) this.f61666m.get(i10)).m20522d(treeSet, z6 || zEquals);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m20523f(long j10) {
        long j11 = this.f61657d;
        long j12 = this.f61658e;
        return (j11 == -9223372036854775807L && j12 == -9223372036854775807L) || (j11 <= j10 && j12 == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < j12) || (j11 <= j10 && j10 < j12));
    }

    /* JADX INFO: renamed from: g */
    public final void m20524g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f61661h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m20523f(j10) && "div".equals(this.f61654a) && (str2 = this.f61662i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < m20521c(); i10++) {
            m20520b(i10).m20524g(j10, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0208  */
    /* JADX WARN: Code duplicated, block: B:145:0x0216  */
    /* JADX WARN: Code duplicated, block: B:147:0x0219  */
    /* JADX WARN: Code duplicated, block: B:149:0x021c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0220  */
    /* JADX WARN: Code duplicated, block: B:152:0x022f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0260  */
    /* JADX WARN: Code duplicated, block: B:168:0x027a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0287  */
    /* JADX WARN: Code duplicated, block: B:172:0x029f  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:177:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:180:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:193:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    /* JADX INFO: renamed from: h */
    public final void m20525h(long j10, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        int i10;
        C19443c c19443c;
        C19447g c19447gM8890c;
        int i11;
        float f10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        float sizeChange;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        int i12;
        RelativeSizeSpan relativeSizeSpan;
        RelativeSizeSpan[] relativeSizeSpanArr2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = -1;
        int i18 = 1;
        if (m20523f(j10)) {
            String str2 = this.f61661h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.f61665l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map3 = this.f61664k;
                int iIntValue = map3.containsKey(str4) ? ((Integer) map3.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    C20420a c20420a = (C20420a) treeMap.get(str4);
                    c20420a.getClass();
                    C19446f c19446f = (C19446f) map2.get(str3);
                    c19446f.getClass();
                    C19447g c19447gM8890c2 = AbstractC8242z0.m8890c(this.f61659f, this.f61660g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c20420a.f64541a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c20420a.f64541a = spannableStringBuilder;
                    }
                    if (c19447gM8890c2 != null) {
                        int i19 = c19447gM8890c2.f61696h;
                        if (((i19 == i17 && c19447gM8890c2.f61697i == i17) ? i17 : (i19 == i18 ? i18 : 0) | (c19447gM8890c2.f61697i == i18 ? 2 : 0)) != i17) {
                            int i20 = c19447gM8890c2.f61696h;
                            if (i20 != i17) {
                                if (i20 == i18) {
                                    i14 = i18;
                                } else {
                                    i14 = 0;
                                }
                                if (c19447gM8890c2.f61697i == i18) {
                                    i15 = 2;
                                } else {
                                    i15 = 0;
                                }
                                i16 = i14 | i15;
                            } else if (c19447gM8890c2.f61697i == i17) {
                                i16 = i17;
                                i18 = 1;
                            } else {
                                i18 = 1;
                                if (i20 == i18) {
                                    i14 = i18;
                                } else {
                                    i14 = 0;
                                }
                                if (c19447gM8890c2.f61697i == i18) {
                                    i15 = 2;
                                } else {
                                    i15 = 0;
                                }
                                i16 = i14 | i15;
                            }
                            StyleSpan styleSpan = new StyleSpan(i16);
                            i10 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i10 = 33;
                        }
                        if (c19447gM8890c2.f61694f == i18) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i10);
                        }
                        if (c19447gM8890c2.f61695g == i18) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i10);
                        }
                        if (c19447gM8890c2.f61691c) {
                            if (!c19447gM8890c2.f61691c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            AbstractC8011V4.m8327c(spannableStringBuilder, new ForegroundColorSpan(c19447gM8890c2.f61690b), iIntValue, iIntValue2);
                        }
                        if (c19447gM8890c2.f61693e) {
                            if (!c19447gM8890c2.f61693e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            AbstractC8011V4.m8327c(spannableStringBuilder, new BackgroundColorSpan(c19447gM8890c2.f61692d), iIntValue, iIntValue2);
                        }
                        if (c19447gM8890c2.f61689a != null) {
                            AbstractC8011V4.m8327c(spannableStringBuilder, new TypefaceSpan(c19447gM8890c2.f61689a), iIntValue, iIntValue2);
                        }
                        C19442b c19442b = c19447gM8890c2.f61706r;
                        if (c19442b != null) {
                            int i21 = c19442b.f61651a;
                            if (i21 == i17) {
                                int i22 = c19446f.f61688j;
                                i21 = (i22 == 2 || i22 == 1) ? 3 : 1;
                                i13 = 1;
                            } else {
                                i13 = c19442b.f61652b;
                            }
                            int i23 = c19442b.f61653c;
                            if (i23 == -2) {
                                i23 = 1;
                            }
                            AbstractC8011V4.m8327c(spannableStringBuilder, new C20426g(i21, i13, i23), iIntValue, iIntValue2);
                        }
                        int i24 = c19447gM8890c2.f61701m;
                        if (i24 == 2) {
                            C19443c c19443c2 = this.f61663j;
                            while (true) {
                                if (c19443c2 == null) {
                                    c19443c2 = null;
                                    break;
                                }
                                C19447g c19447gM8890c3 = AbstractC8242z0.m8890c(c19443c2.f61659f, c19443c2.f61660g, map);
                                if (c19447gM8890c3 != null && c19447gM8890c3.f61701m == 1) {
                                    break;
                                } else {
                                    c19443c2 = c19443c2.f61663j;
                                }
                            }
                            if (c19443c2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c19443c2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c19443c = null;
                                        break;
                                    }
                                    C19443c c19443c3 = (C19443c) arrayDeque.pop();
                                    C19447g c19447gM8890c4 = AbstractC8242z0.m8890c(c19443c3.f61659f, c19443c3.f61660g, map);
                                    if (c19447gM8890c4 != null && c19447gM8890c4.f61701m == 3) {
                                        c19443c = c19443c3;
                                        break;
                                    }
                                    for (int iM20521c = c19443c3.m20521c() - 1; iM20521c >= 0; iM20521c--) {
                                        arrayDeque.push(c19443c3.m20520b(iM20521c));
                                    }
                                }
                                if (c19443c != null) {
                                    if (c19443c.m20521c() != 1 || c19443c.m20520b(0).f61655b == null) {
                                        AbstractC20800b.m21327o("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = c19443c.m20520b(0).f61655b;
                                        int i25 = AbstractC20817s.f66106a;
                                        C19447g c19447gM8890c5 = AbstractC8242z0.m8890c(c19443c.f61659f, c19443c.f61660g, map);
                                        int i26 = c19447gM8890c5 != null ? c19447gM8890c5.f61702n : -1;
                                        if (i26 == -1 && (c19447gM8890c = AbstractC8242z0.m8890c(c19443c2.f61659f, c19443c2.f61660g, map)) != null) {
                                            i26 = c19447gM8890c.f61702n;
                                        }
                                        spannableStringBuilder.setSpan(new C20425f(str5, i26), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                            if (c19447gM8890c2.f61705q == 1) {
                                AbstractC8011V4.m8327c(spannableStringBuilder, new C20424e(), iIntValue, iIntValue2);
                            }
                            i11 = c19447gM8890c2.f61698j;
                            if (i11 != 1) {
                                it = it2;
                                AbstractC8011V4.m8327c(spannableStringBuilder, new AbsoluteSizeSpan((int) c19447gM8890c2.f61699k, true), iIntValue, iIntValue2);
                            } else if (i11 != 2) {
                                it = it2;
                                AbstractC8011V4.m8327c(spannableStringBuilder, new RelativeSizeSpan(c19447gM8890c2.f61699k), iIntValue, iIntValue2);
                            } else if (i11 != 3) {
                                it = it2;
                            } else {
                                sizeChange = c19447gM8890c2.f61699k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                i12 = 0;
                                while (i12 < length) {
                                    relativeSizeSpan = relativeSizeSpanArr[i12];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                        relativeSizeSpanArr2 = relativeSizeSpanArr;
                                    } else {
                                        relativeSizeSpanArr2 = relativeSizeSpanArr;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i12++;
                                    it2 = it3;
                                    relativeSizeSpanArr = relativeSizeSpanArr2;
                                }
                                it = it2;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.f61654a)) {
                                f10 = c19447gM8890c2.f61707s;
                                if (f10 != Float.MAX_VALUE) {
                                    c20420a.f64557q = (f10 * (-90.0f)) / 100.0f;
                                }
                                alignment = c19447gM8890c2.f61703o;
                                if (alignment != null) {
                                    c20420a.f64543c = alignment;
                                }
                                alignment2 = c19447gM8890c2.f61704p;
                                if (alignment2 != null) {
                                    c20420a.f64544d = alignment2;
                                }
                            }
                        } else if (i24 == 3 || i24 == 4) {
                            spannableStringBuilder.setSpan(new C19441a(), iIntValue, iIntValue2, 33);
                        }
                        if (c19447gM8890c2.f61705q == 1) {
                            AbstractC8011V4.m8327c(spannableStringBuilder, new C20424e(), iIntValue, iIntValue2);
                        }
                        i11 = c19447gM8890c2.f61698j;
                        if (i11 != 1) {
                            it = it2;
                            AbstractC8011V4.m8327c(spannableStringBuilder, new AbsoluteSizeSpan((int) c19447gM8890c2.f61699k, true), iIntValue, iIntValue2);
                        } else if (i11 != 2) {
                            it = it2;
                            AbstractC8011V4.m8327c(spannableStringBuilder, new RelativeSizeSpan(c19447gM8890c2.f61699k), iIntValue, iIntValue2);
                        } else if (i11 != 3) {
                            it = it2;
                        } else {
                            sizeChange = c19447gM8890c2.f61699k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            i12 = 0;
                            while (i12 < length) {
                                relativeSizeSpan = relativeSizeSpanArr[i12];
                                Iterator it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                    relativeSizeSpanArr2 = relativeSizeSpanArr;
                                } else {
                                    relativeSizeSpanArr2 = relativeSizeSpanArr;
                                }
                                i12++;
                                it2 = it4;
                                relativeSizeSpanArr = relativeSizeSpanArr2;
                            }
                            it = it2;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.f61654a)) {
                            f10 = c19447gM8890c2.f61707s;
                            if (f10 != Float.MAX_VALUE) {
                                c20420a.f64557q = (f10 * (-90.0f)) / 100.0f;
                            }
                            alignment = c19447gM8890c2.f61703o;
                            if (alignment != null) {
                                c20420a.f64543c = alignment;
                            }
                            alignment2 = c19447gM8890c2.f61704p;
                            if (alignment2 != null) {
                                c20420a.f64544d = alignment2;
                            }
                        }
                    }
                    it2 = it;
                    i17 = -1;
                    i18 = 1;
                }
                it = it2;
                it2 = it;
                i17 = -1;
                i18 = 1;
            }
            for (int i27 = 0; i27 < m20521c(); i27++) {
                m20520b(i27).m20525h(j10, map, map2, str3, treeMap);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m20526i(long j10, boolean z6, String str, TreeMap treeMap) {
        HashMap map = this.f61664k;
        map.clear();
        HashMap map2 = this.f61665l;
        map2.clear();
        String str2 = this.f61654a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f61661h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f61656c && z6) {
            SpannableStringBuilder spannableStringBuilderM20519e = m20519e(str4, treeMap);
            String str5 = this.f61655b;
            str5.getClass();
            spannableStringBuilderM20519e.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z6) {
            m20519e(str4, treeMap).append('\n');
            return;
        }
        if (m20523f(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C20420a) entry.getValue()).f64541a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i10 = 0; i10 < m20521c(); i10++) {
                m20520b(i10).m20526i(j10, z6 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM20519e2 = m20519e(str4, treeMap);
                int length = spannableStringBuilderM20519e2.length() - 1;
                while (length >= 0 && spannableStringBuilderM20519e2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderM20519e2.charAt(length) != '\n') {
                    spannableStringBuilderM20519e2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C20420a) entry2.getValue()).f64541a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
