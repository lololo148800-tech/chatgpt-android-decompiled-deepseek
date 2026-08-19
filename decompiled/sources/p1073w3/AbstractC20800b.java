package p1073w3;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import p160G5.p161rK.TVCuK;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: w3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20800b {

    /* JADX INFO: renamed from: a */
    public static final byte[] f66064a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final String[] f66065b = {"", "A", TVCuK.rIlKDX, TokenNames.f32009C};

    /* JADX INFO: renamed from: c */
    public static final Object f66066c = new Object();

    /* JADX INFO: renamed from: a */
    public static String m21313a(String str, Throwable th2) {
        String strReplace;
        if (th2 != null) {
            synchronized (f66066c) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace(Separators.f31990HT, "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, "\n  ");
        sbM9895n.append(strReplace.replace(Separators.RETURN, "\n  "));
        sbM9895n.append('\n');
        return sbM9895n.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m21314b(int i10, boolean z6, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = {f66065b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z6 ? 'H' : 'L'), Integer.valueOf(i13)};
        int i14 = AbstractC20817s.f66106a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i15 = 0; i15 < length; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static void m21315c(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m21316d(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m21317e(String str, boolean z6) throws C20804f {
        if (!z6) {
            throw new C20804f(str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m21318f(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m21319g(String str, boolean z6) {
        if (!z6) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m21320h(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m21321i(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m21322j(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m21323k(String str, String str2) {
        synchronized (f66066c) {
            Log.d(str, m21313a(str2, null));
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m21324l(String str, String str2) {
        synchronized (f66066c) {
            AbstractC15256t.m16465c(str, m21313a(str2, null));
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m21325m(String str, String str2, Throwable th2) {
        synchronized (f66066c) {
            AbstractC15256t.m16465c(str, m21313a(str2, th2));
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m21326n(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static void m21327o(String str, String str2) {
        synchronized (f66066c) {
            Log.i(str, m21313a(str2, null));
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m21328p(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m21329q(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: r */
    public static void m21330r(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m21331s(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(AbstractC10763a.m11048f(i10, "csd-"), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m21332t(String str, String str2) {
        synchronized (f66066c) {
            AbstractC15256t.m16482t(str, m21313a(str2, null));
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m21333u(String str, String str2, Throwable th2) {
        synchronized (f66066c) {
            AbstractC15256t.m16482t(str, m21313a(str2, th2));
        }
    }
}
