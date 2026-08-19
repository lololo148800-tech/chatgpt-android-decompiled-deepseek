package p981r4;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import bb.AbstractC11278C;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p1053v3.C20421b;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p1073w3.InterfaceC20802d;
import p644ab.AbstractC10531d;
import p775h2.AbstractC14376f;
import p885m4.C17153c;
import p885m4.C17162l;
import p885m4.InterfaceC17157g;
import p885m4.InterfaceC17163m;

/* JADX INFO: renamed from: r4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18872a implements InterfaceC17163m {

    /* JADX INFO: renamed from: p0 */
    public static final Pattern f60114p0 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: q0 */
    public static final Pattern f60115q0 = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: Y */
    public final StringBuilder f60116Y = new StringBuilder();

    /* JADX INFO: renamed from: Z */
    public final ArrayList f60117Z = new ArrayList();

    /* JADX INFO: renamed from: o0 */
    public final C20811m f60118o0 = new C20811m();

    /* JADX INFO: renamed from: a */
    public static C20421b m20194a(Spanned spanned, String str) {
        byte b;
        int i10;
        byte b10;
        int i11;
        float f10;
        if (str == null) {
            return new C20421b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        }
        switch (str) {
            case "{\an1}":
                b = 0;
                break;
            case "{\an2}":
                b = 6;
                break;
            case "{\an3}":
                b = 3;
                break;
            case "{\an4}":
                b = 1;
                break;
            case "{\an5}":
                b = 7;
                break;
            case "{\an6}":
                b = 4;
                break;
            case "{\an7}":
                b = 2;
                break;
            case "{\an8}":
                b = 8;
                break;
            case "{\an9}":
                b = 5;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0 || b == 1 || b == 2) {
            i10 = 0;
        } else {
            i10 = (b == 3 || b == 4 || b == 5) ? 2 : 1;
        }
        switch (str) {
            case "{\an1}":
                b10 = 0;
                break;
            case "{\an2}":
                b10 = 1;
                break;
            case "{\an3}":
                b10 = 2;
                break;
            case "{\an4}":
                b10 = 6;
                break;
            case "{\an5}":
                b10 = 7;
                break;
            case "{\an6}":
                b10 = 8;
                break;
            case "{\an7}":
                b10 = 3;
                break;
            case "{\an8}":
                b10 = 4;
                break;
            case "{\an9}":
                b10 = 5;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0 || b10 == 1 || b10 == 2) {
            i11 = 2;
        } else {
            i11 = (b10 == 3 || b10 == 4 || b10 == 5) ? 0 : 1;
        }
        float f11 = 0.92f;
        if (i10 == 0) {
            f10 = 0.08f;
        } else if (i10 == 1) {
            f10 = 0.5f;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            f10 = 0.92f;
        }
        if (i11 == 0) {
            f11 = 0.08f;
        } else if (i11 == 1) {
            f11 = 0.5f;
        } else if (i11 != 2) {
            throw new IllegalArgumentException();
        }
        return new C20421b(spanned, null, null, null, f11, 0, i11, f10, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public static long m20195b(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j11 = (Long.parseLong(strGroup2) * StatsigLoggerKt.FLUSH_TIMER_MS) + j10;
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j12 = (Long.parseLong(strGroup3) * 1000) + j11;
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
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
        String str;
        InterfaceC20802d interfaceC20802d2;
        C18872a c18872a = this;
        InterfaceC20802d interfaceC20802d3 = interfaceC20802d;
        String str2 = "SubripParser";
        C20811m c20811m = c18872a.f60118o0;
        c20811m.m21342D(i10 + i11, bArr);
        c20811m.m21344F(i10);
        Charset charsetM21340B = c20811m.m21340B();
        if (charsetM21340B == null) {
            charsetM21340B = AbstractC10531d.f31242c;
        }
        long j10 = c17162l.f54834a;
        ArrayList arrayList = (j10 == -9223372036854775807L || !c17162l.f54835b) ? null : new ArrayList();
        while (true) {
            String strM21353h = c20811m.m21353h(charsetM21340B);
            if (strM21353h == null) {
                break;
            }
            if (strM21353h.length() != 0) {
                try {
                    Integer.parseInt(strM21353h);
                    String strM21353h2 = c20811m.m21353h(charsetM21340B);
                    if (strM21353h2 == null) {
                        AbstractC20800b.m21332t(str2, "Unexpected end");
                        break;
                    }
                    Matcher matcher = f60114p0.matcher(strM21353h2);
                    if (matcher.matches()) {
                        long jM20195b = m20195b(matcher, 1);
                        long jM20195b2 = m20195b(matcher, 6);
                        StringBuilder sb2 = c18872a.f60116Y;
                        sb2.setLength(0);
                        ArrayList arrayList2 = c18872a.f60117Z;
                        arrayList2.clear();
                        String strM21353h3 = c20811m.m21353h(charsetM21340B);
                        while (!TextUtils.isEmpty(strM21353h3)) {
                            if (sb2.length() > 0) {
                                sb2.append("<br>");
                            }
                            String strTrim = strM21353h3.trim();
                            StringBuilder sb3 = new StringBuilder(strTrim);
                            Matcher matcher2 = f60115q0.matcher(strTrim);
                            int i12 = 0;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                Matcher matcher3 = matcher2;
                                int iStart = matcher2.start() - i12;
                                int length = strGroup.length();
                                sb3.replace(iStart, iStart + length, "");
                                i12 += length;
                                matcher2 = matcher3;
                                str2 = str2;
                            }
                            sb2.append(sb3.toString());
                            strM21353h3 = c20811m.m21353h(charsetM21340B);
                            str2 = str2;
                        }
                        String str3 = str2;
                        Spanned spannedFromHtml = Html.fromHtml(sb2.toString());
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i13);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (j10 == -9223372036854775807L || jM20195b >= j10) {
                            C17153c c17153c = new C17153c(AbstractC11278C.m12695y(m20194a(spannedFromHtml, str)), jM20195b, jM20195b2 - jM20195b);
                            interfaceC20802d2 = interfaceC20802d;
                            interfaceC20802d2.accept(c17153c);
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new C17153c(AbstractC11278C.m12695y(m20194a(spannedFromHtml, str)), jM20195b, jM20195b2 - jM20195b));
                            }
                            interfaceC20802d2 = interfaceC20802d;
                        }
                        interfaceC20802d3 = interfaceC20802d2;
                        str2 = str3;
                    } else {
                        AbstractC20800b.m21332t(str2, "Skipping invalid timing: ".concat(strM21353h2));
                        interfaceC20802d3 = interfaceC20802d3;
                    }
                    c18872a = this;
                } catch (NumberFormatException unused) {
                    AbstractC20800b.m21332t(str2, "Skipping invalid index: ".concat(strM21353h));
                }
            }
        }
        InterfaceC20802d interfaceC20802d4 = interfaceC20802d3;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC20802d4.accept((C17153c) it.next());
            }
        }
    }
}
