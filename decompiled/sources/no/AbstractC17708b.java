package no;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17327D;
import mo.C17328E;
import mo.C17348o;
import mo.C17349p;
import mo.C17356w;
import p026Ao.AbstractC0668b;
import p026Ao.C0653B;
import p026Ao.C0657F;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p026Ao.InterfaceC0663L;
import p026Ao.InterfaceC0677k;
import p030B2.C0742X;
import p1113xn.AbstractC21322p;
import p1113xn.C21307a;
import p1113xn.C21319m;
import p571X9.AbstractC9276e0;
import p817j$.util.DesugarCollections;
import p817j$.util.DesugarTimeZone;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p959q8.C18639a;
import to.C20011b;

/* JADX INFO: renamed from: no.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC17708b {

    /* JADX INFO: renamed from: a */
    public static final byte[] f56536a;

    /* JADX INFO: renamed from: b */
    public static final C17348o f56537b = AbstractC9276e0.m9847d(new String[0]);

    /* JADX INFO: renamed from: c */
    public static final C17328E f56538c;

    /* JADX INFO: renamed from: d */
    public static final C0653B f56539d;

    /* JADX INFO: renamed from: e */
    public static final TimeZone f56540e;

    /* JADX INFO: renamed from: f */
    public static final C21319m f56541f;

    /* JADX INFO: renamed from: g */
    public static final String f56542g;

    static {
        byte[] bArr = new byte[0];
        f56536a = bArr;
        C0675i c0675i = new C0675i();
        c0675i.m1433d1(bArr);
        long j10 = 0;
        f56538c = new C17328E(null, j10, c0675i, 0);
        m19411c(j10, j10, j10);
        C0678l c0678l = C0678l.f1971p0;
        f56539d = AbstractC0668b.m1407g(C18639a.m19995k("efbbbf"), C18639a.m19995k("feff"), C18639a.m19995k("fffe"), C18639a.m19995k("0000ffff"), C18639a.m19995k("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        AbstractC16544l.m18091d(timeZone);
        f56540e = timeZone;
        f56541f = new C21319m("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f56542g = AbstractC21322p.m21690X(AbstractC21322p.m21688V(C17356w.class.getName(), "okhttp3."), "Client");
    }

    /* JADX INFO: renamed from: A */
    public static final String m19408A(int i10, int i11, String str) {
        int iM19423o = m19423o(i10, i11, str);
        String strSubstring = str.substring(iM19423o, m19424p(iM19423o, i11, str));
        AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m19409a(C17349p c17349p, C17349p other) {
        AbstractC16544l.m18094g(c17349p, "<this>");
        AbstractC16544l.m18094g(other, "other");
        return AbstractC16544l.m18089b(c17349p.f55289d, other.f55289d) && c17349p.f55290e == other.f55290e && AbstractC16544l.m18089b(c17349p.f55286a, other.f55286a);
    }

    /* JADX INFO: renamed from: b */
    public static final int m19410b(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    /* JADX INFO: renamed from: c */
    public static final void m19411c(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m19412d(Closeable closeable) {
        AbstractC16544l.m18094g(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m19413e(Socket socket) {
        AbstractC16544l.m18094g(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!AbstractC16544l.m18089b(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static final int m19414f(String str, char c9, int i10, int i11) {
        AbstractC16544l.m18094g(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c9) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* JADX INFO: renamed from: g */
    public static final int m19415g(String str, int i10, int i11, String str2) {
        AbstractC16544l.m18094g(str, "<this>");
        while (i10 < i11) {
            if (AbstractC21322p.m21668B(str2, str.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m19416h(String str, char c9, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return m19414f(str, c9, i10, i11);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m19417i(InterfaceC0663L interfaceC0663L, TimeUnit timeUnit) {
        AbstractC16544l.m18094g(timeUnit, "timeUnit");
        try {
            return m19430v(interfaceC0663L, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final String m19418j(String format, Object... objArr) {
        AbstractC16544l.m18094g(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m19419k(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC16544l.m18094g(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C0742X c0742xM18098k = AbstractC16544l.m18098k(strArr2);
                while (c0742xM18098k.hasNext()) {
                    if (comparator.compare(str, (String) c0742xM18098k.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static final long m19420l(C17327D c17327d) {
        String strM19012f = c17327d.f55178r0.m19012f(SIPHeaderNames.CONTENT_LENGTH);
        if (strM19012f == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM19012f);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final List m19421m(Object... elements) {
        AbstractC16544l.m18094g(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = DesugarCollections.unmodifiableList(AbstractC17681o.m19382k(Arrays.copyOf(objArr, objArr.length)));
        AbstractC16544l.m18093f(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: n */
    public static final int m19422n(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC16544l.m18096i(cCharAt, 31) <= 0 || AbstractC16544l.m18096i(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public static final int m19423o(int i10, int i11, String str) {
        AbstractC16544l.m18094g(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* JADX INFO: renamed from: p */
    public static final int m19424p(int i10, int i11, String str) {
        AbstractC16544l.m18094g(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 != i10) {
                    i12--;
                }
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: q */
    public static final String[] m19425q(String[] strArr, String[] other, Comparator comparator) {
        AbstractC16544l.m18094g(other, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m19426r(String name) {
        AbstractC16544l.m18094g(name, "name");
        return name.equalsIgnoreCase(SIPHeaderNames.AUTHORIZATION) || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase(SIPHeaderNames.PROXY_AUTHORIZATION) || name.equalsIgnoreCase("Set-Cookie");
    }

    /* JADX INFO: renamed from: s */
    public static final int m19427s(char c9) {
        if ('0' <= c9 && c9 < ':') {
            return c9 - '0';
        }
        if ('a' <= c9 && c9 < 'g') {
            return c9 - 'W';
        }
        if ('A' > c9 || c9 >= 'G') {
            return -1;
        }
        return c9 - '7';
    }

    /* JADX INFO: renamed from: t */
    public static final Charset m19428t(InterfaceC0677k interfaceC0677k, Charset charset) {
        Charset charsetForName;
        AbstractC16544l.m18094g(interfaceC0677k, "<this>");
        AbstractC16544l.m18094g(charset, "default");
        int iMo1342G0 = interfaceC0677k.mo1342G0(f56539d);
        if (iMo1342G0 == -1) {
            return charset;
        }
        if (iMo1342G0 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC16544l.m18093f(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iMo1342G0 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            AbstractC16544l.m18093f(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iMo1342G0 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            AbstractC16544l.m18093f(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iMo1342G0 == 3) {
            Charset charset2 = C21307a.f67720a;
            charsetForName = C21307a.f67723d;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32BE");
                AbstractC16544l.m18093f(charsetForName, "forName(...)");
                C21307a.f67723d = charsetForName;
            }
        } else {
            if (iMo1342G0 != 4) {
                throw new AssertionError();
            }
            Charset charset3 = C21307a.f67720a;
            charsetForName = C21307a.f67722c;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32LE");
                AbstractC16544l.m18093f(charsetForName, "forName(...)");
                C21307a.f67722c = charsetForName;
            }
        }
        return charsetForName;
    }

    /* JADX INFO: renamed from: u */
    public static final int m19429u(C0657F c0657f) {
        AbstractC16544l.m18094g(c0657f, "<this>");
        return (c0657f.readByte() & 255) | ((c0657f.readByte() & 255) << 16) | ((c0657f.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m19430v(InterfaceC0663L interfaceC0663L, int i10, TimeUnit timeUnit) {
        AbstractC16544l.m18094g(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jMo1392c = interfaceC0663L.mo1326h().mo1393e() ? interfaceC0663L.mo1326h().mo1392c() - jNanoTime : Long.MAX_VALUE;
        interfaceC0663L.mo1326h().mo1387d(Math.min(jMo1392c, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C0675i c0675i = new C0675i();
            while (interfaceC0663L.mo1325H(c0675i, 8192L) != -1) {
                c0675i.m1429a();
            }
            if (jMo1392c == Long.MAX_VALUE) {
                interfaceC0663L.mo1326h().mo1390a();
            } else {
                interfaceC0663L.mo1326h().mo1387d(jNanoTime + jMo1392c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo1392c == Long.MAX_VALUE) {
                interfaceC0663L.mo1326h().mo1390a();
            } else {
                interfaceC0663L.mo1326h().mo1387d(jNanoTime + jMo1392c);
            }
            return false;
        } catch (Throwable th2) {
            if (jMo1392c == Long.MAX_VALUE) {
                interfaceC0663L.mo1326h().mo1390a();
            } else {
                interfaceC0663L.mo1326h().mo1387d(jNanoTime + jMo1392c);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: w */
    public static final C17348o m19431w(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20011b c20011b = (C20011b) it.next();
            String strM1452r = c20011b.f63336a.m1452r();
            String strM1452r2 = c20011b.f63337b.m1452r();
            arrayList.add(strM1452r);
            arrayList.add(AbstractC21322p.m21711s0(strM1452r2).toString());
        }
        return new C17348o((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: x */
    public static final String m19432x(C17349p c17349p, boolean z6) {
        int i10;
        AbstractC16544l.m18094g(c17349p, "<this>");
        String strM11047e = c17349p.f55289d;
        if (AbstractC21322p.m21667A(strM11047e, ":", false)) {
            strM11047e = AbstractC10763a.m11047e(']', "[", strM11047e);
        }
        int i11 = c17349p.f55290e;
        if (!z6) {
            String scheme = c17349p.f55286a;
            AbstractC16544l.m18094g(scheme, "scheme");
            if (scheme.equals("http")) {
                i10 = 80;
            } else {
                i10 = scheme.equals("https") ? 443 : -1;
            }
            if (i11 == i10) {
                return strM11047e;
            }
        }
        return strM11047e + ':' + i11;
    }

    /* JADX INFO: renamed from: y */
    public static final List m19433y(List list) {
        AbstractC16544l.m18094g(list, "<this>");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(AbstractC17680n.m19323D0(list));
        AbstractC16544l.m18093f(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: z */
    public static final int m19434z(int i10, String str) {
        if (str == null) {
            return i10;
        }
        try {
            long j10 = Long.parseLong(str);
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j10 < 0) {
                return 0;
            }
            return (int) j10;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }
}
