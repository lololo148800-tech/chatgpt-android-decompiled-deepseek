package p1073w3;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.Closeable;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import livekit.org.webrtc.MediaStreamTrack;
import p001A.AbstractC0010F;
import p1030u1.C20095b;
import p329N3.C5621k;
import p379Pb.LVf.efyhmdM;
import p479Td.AbstractC7360k;
import p523V9.AbstractC7957O4;
import p571X9.AbstractC9306j0;
import p644ab.AbstractC10531d;
import p703db.AbstractC13056a;
import p703db.AbstractC13057b;

/* JADX INFO: renamed from: w3.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20817s {

    /* JADX INFO: renamed from: a */
    public static final int f66106a;

    /* JADX INFO: renamed from: b */
    public static final String f66107b;

    /* JADX INFO: renamed from: c */
    public static final String f66108c;

    /* JADX INFO: renamed from: d */
    public static final String f66109d;

    /* JADX INFO: renamed from: e */
    public static final String f66110e;

    /* JADX INFO: renamed from: f */
    public static final byte[] f66111f;

    /* JADX INFO: renamed from: g */
    public static final Pattern f66112g;

    /* JADX INFO: renamed from: h */
    public static final Pattern f66113h;

    /* JADX INFO: renamed from: i */
    public static HashMap f66114i;

    /* JADX INFO: renamed from: j */
    public static final String[] f66115j;

    /* JADX INFO: renamed from: k */
    public static final String[] f66116k;

    /* JADX INFO: renamed from: l */
    public static final int[] f66117l;

    /* JADX INFO: renamed from: m */
    public static final int[] f66118m;

    /* JADX INFO: renamed from: n */
    public static final int[] f66119n;

    /* JADX INFO: renamed from: A */
    public static boolean m21387A(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m21388B(Context context) {
        int i10 = f66106a;
        if (i10 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i10 == 30) {
                String str = f66109d;
                if (AbstractC7360k.m7786c(str, "moto g(20)") || AbstractC7360k.m7786c(str, "rmx3231")) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m21389C(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* JADX INFO: renamed from: D */
    public static long m21390D(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    /* JADX INFO: renamed from: E */
    public static String m21391E(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strM7787d = AbstractC7360k.m7787d(str);
        int i10 = 0;
        String str2 = strM7787d.split("-", 2)[0];
        if (f66114i == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f66115j;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                map.put(strArr[i11], strArr[i11 + 1]);
            }
            f66114i = map;
        }
        String str4 = (String) f66114i.get(str2);
        if (str4 != null) {
            StringBuilder sbM9893l = AbstractC9306j0.m9893l(str4);
            sbM9893l.append(strM7787d.substring(str2.length()));
            strM7787d = sbM9893l.toString();
            str2 = str4;
        }
        if (!AuthorizationHeaderIms.f32003NO.equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strM7787d;
        }
        while (true) {
            String[] strArr2 = f66116k;
            if (i10 >= strArr2.length) {
                return strM7787d;
            }
            if (strM7787d.startsWith(strArr2[i10])) {
                return strArr2[i10 + 1] + strM7787d.substring(strArr2[i10].length());
            }
            i10 += 2;
        }
    }

    /* JADX INFO: renamed from: F */
    public static Object[] m21392F(int i10, Object[] objArr) {
        AbstractC20800b.m21316d(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    /* JADX INFO: renamed from: G */
    public static void m21393G(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static long m21394H(int i10, long j10) {
        return m21396J(j10, 1000000L, i10, RoundingMode.FLOOR);
    }

    /* JADX INFO: renamed from: I */
    public static void m21395I(long[] jArr, long j10) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i10 = 0;
        if (j10 >= 1000000 && j10 % 1000000 == 0) {
            long jM8245e = AbstractC7957O4.m8245e(j10, 1000000L, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = AbstractC7957O4.m8245e(jArr[i10], jM8245e, roundingMode);
                i10++;
            }
            return;
        }
        if (j10 < 1000000 && 1000000 % j10 == 0) {
            long jM8245e2 = AbstractC7957O4.m8245e(1000000L, j10, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = AbstractC7957O4.m8247g(jArr[i10], jM8245e2);
                i10++;
            }
            return;
        }
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                if (j10 >= j11 && j10 % j11 == 0) {
                    jArr[i11] = AbstractC7957O4.m8245e(1000000L, AbstractC7957O4.m8245e(j10, j11, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j10 >= j11 || j11 % j10 != 0) {
                    jArr[i11] = m21397K(j11, 1000000L, j10, roundingMode);
                } else {
                    jArr[i11] = AbstractC7957O4.m8247g(1000000L, AbstractC7957O4.m8245e(j11, j10, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static long m21396J(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        if (j12 >= j11 && j12 % j11 == 0) {
            return AbstractC7957O4.m8245e(j10, AbstractC7957O4.m8245e(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return AbstractC7957O4.m8247g(j10, AbstractC7957O4.m8245e(j11, j12, RoundingMode.UNNECESSARY));
        }
        if (j12 < j10 || j12 % j10 != 0) {
            return (j12 >= j10 || j10 % j12 != 0) ? m21397K(j10, j11, j12, roundingMode) : AbstractC7957O4.m8247g(j11, AbstractC7957O4.m8245e(j10, j12, RoundingMode.UNNECESSARY));
        }
        return AbstractC7957O4.m8245e(j11, AbstractC7957O4.m8245e(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x00ff, please report this as an issue */
    /* JADX INFO: renamed from: K */
    public static long m21397K(long j10, long j11, long j12, RoundingMode roundingMode) {
        double dRint;
        long j13;
        boolean z6;
        long jM8247g = AbstractC7957O4.m8247g(j10, j11);
        if (jM8247g != Long.MAX_VALUE && jM8247g != Long.MIN_VALUE) {
            return AbstractC7957O4.m8245e(jM8247g, j12, roundingMode);
        }
        long jM8246f = AbstractC7957O4.m8246f(Math.abs(j11), Math.abs(j12));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jM8245e = AbstractC7957O4.m8245e(j11, jM8246f, roundingMode2);
        long jM8245e2 = AbstractC7957O4.m8245e(j12, jM8246f, roundingMode2);
        long jM8246f2 = AbstractC7957O4.m8246f(Math.abs(j10), Math.abs(jM8245e2));
        long jM8245e3 = AbstractC7957O4.m8245e(j10, jM8246f2, roundingMode2);
        long jM8245e4 = AbstractC7957O4.m8245e(jM8245e2, jM8246f2, roundingMode2);
        long jM8247g2 = AbstractC7957O4.m8247g(jM8245e3, jM8245e);
        if (jM8247g2 != Long.MAX_VALUE && jM8247g2 != Long.MIN_VALUE) {
            return AbstractC7957O4.m8245e(jM8247g2, jM8245e4, roundingMode);
        }
        double d10 = jM8245e3 * (jM8245e / jM8245e4);
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i10 = AbstractC13057b.f41486a;
        if (Math.getExponent(d10) > 1023) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (AbstractC13056a.f41485a[roundingMode.ordinal()]) {
            case 1:
                if (!AbstractC13057b.m14799a(d10)) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                dRint = d10;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            case 2:
                if (d10 >= 0.0d || AbstractC13057b.m14799a(d10)) {
                    dRint = d10;
                } else {
                    j13 = ((long) d10) - 1;
                    dRint = j13;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            case 3:
                if (d10 <= 0.0d || AbstractC13057b.m14799a(d10)) {
                    dRint = d10;
                } else {
                    j13 = ((long) d10) + 1;
                    dRint = j13;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            case 4:
                dRint = d10;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            case 5:
                if (AbstractC13057b.m14799a(d10)) {
                    dRint = d10;
                } else {
                    dRint = ((long) d10) + ((long) (d10 > 0.0d ? 1 : -1));
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            case 6:
                dRint = Math.rint(d10);
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            case 7:
                dRint = Math.rint(d10);
                if (Math.abs(d10 - dRint) == 0.5d) {
                    dRint = Math.copySign(0.5d, d10) + d10;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            case 8:
                dRint = Math.rint(d10);
                if (Math.abs(d10 - dRint) == 0.5d) {
                    dRint = d10;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: L */
    public static String[] m21398L(String str) {
        return str.split(Separators.SLASH, -1);
    }

    /* JADX INFO: renamed from: M */
    public static long m21399M(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21400a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: b */
    public static int m21401b(long[] jArr, long j10, boolean z6) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i10 = iBinarySearch + 1;
            if (i10 >= jArr.length || jArr[i10] != j10) {
                break;
            }
            iBinarySearch = i10;
        }
        return z6 ? iBinarySearch : i10;
    }

    /* JADX INFO: renamed from: c */
    public static int m21402c(C20095b c20095b, long j10) {
        int i10 = c20095b.f63624a - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            if (c20095b.m20924d(i12) < j10) {
                i11 = i12 + 1;
            } else {
                i10 = i12 - 1;
            }
        }
        int i13 = i10 + 1;
        if (i13 < c20095b.f63624a && c20095b.m20924d(i13) == j10) {
            return i13;
        }
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    /* JADX INFO: renamed from: d */
    public static int m21403d(int[] iArr, int i10, boolean z6, boolean z10) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z6 ? iBinarySearch : i11;
        }
        return z10 ? Math.max(0, i12) : i12;
    }

    /* JADX INFO: renamed from: e */
    public static int m21404e(long[] jArr, long j10, boolean z6) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i11 = iBinarySearch - 1;
                if (i11 < 0 || jArr[i11] != j10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i10 = iBinarySearch;
        }
        return z6 ? Math.max(0, i10) : i10;
    }

    /* JADX INFO: renamed from: f */
    public static int m21405f(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    /* JADX INFO: renamed from: g */
    public static void m21406g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static float m21407h(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    /* JADX INFO: renamed from: i */
    public static int m21408i(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    /* JADX INFO: renamed from: j */
    public static long m21409j(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    /* JADX INFO: renamed from: k */
    public static int m21410k(int i10, int i11, int i12, byte[] bArr) {
        while (i10 < i11) {
            i12 = f66117l[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    /* JADX INFO: renamed from: l */
    public static Handler m21411l(C5621k c5621k) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC20800b.m21321i(looperMyLooper);
        return new Handler(looperMyLooper, c5621k);
    }

    /* JADX INFO: renamed from: m */
    public static String m21412m(byte[] bArr) {
        return new String(bArr, AbstractC10531d.f31242c);
    }

    /* JADX INFO: renamed from: n */
    public static int m21413n(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 == 22) {
            return 31;
        }
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    /* JADX INFO: renamed from: o */
    public static AudioFormat m21414o(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    /* JADX INFO: renamed from: p */
    public static int m21415p(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f66106a >= 32) {
                    return 737532;
                }
                return 6396;
            case 12:
                return 743676;
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m21416q(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m21417r(String str) {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z6 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            int i10 = Integer.parseInt(str2);
            return z6 ? -i10 : i10;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public static long m21418s(float f10, long j10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * ((double) f10));
    }

    /* JADX INFO: renamed from: t */
    public static int m21419t(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 22;
        }
        return 21;
    }

    /* JADX INFO: renamed from: u */
    public static int m21420u(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i11 * 3;
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    /* JADX INFO: renamed from: v */
    public static String[] m21421v() {
        String[] strArrSplit;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i10 = f66106a;
        if (i10 >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(Separators.COMMA, -1);
        } else {
            Locale locale = configuration.locale;
            strArrSplit = new String[]{i10 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            strArrSplit[i11] = m21391E(strArrSplit[i11]);
        }
        return strArrSplit;
    }

    /* JADX INFO: renamed from: w */
    public static String m21422w(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            AbstractC20800b.m21325m("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: x */
    public static String m21423x(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return MediaStreamTrack.AUDIO_TRACK_KIND;
            case 2:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i10 >= 10000 ? AbstractC0010F.m19c(i10, "custom (", Separators.RPAREN) : Separators.QUESTION;
        }
    }

    /* JADX INFO: renamed from: y */
    public static int m21424y(Uri uri, String str) {
        int i10;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme != null && AbstractC7360k.m7786c("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int iLastIndexOf = lastPathSegment.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                String strM7787d = AbstractC7360k.m7787d(lastPathSegment.substring(iLastIndexOf + 1));
                strM7787d.getClass();
                switch (strM7787d.hashCode()) {
                    case 104579:
                        if (strM7787d.equals("ism")) {
                        }
                        break;
                    case 108321:
                        if (strM7787d.equals("mpd")) {
                        }
                        break;
                    case 3242057:
                        if (strM7787d.equals("isml")) {
                        }
                        break;
                    case 3299913:
                        if (strM7787d.equals("m3u8")) {
                        }
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
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                    Method dump skipped, instruction units count: 284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p1073w3.AbstractC20817s.m21424y(android.net.Uri, java.lang.String):int");
            }

            /* JADX INFO: renamed from: z */
            public static void m21425z(int i10) {
                Integer.toString(i10, 36);
            }

            static {
                int i10 = Build.VERSION.SDK_INT;
                f66106a = i10;
                String str = Build.DEVICE;
                f66107b = str;
                String str2 = Build.MANUFACTURER;
                f66108c = str2;
                String str3 = Build.MODEL;
                f66109d = str3;
                f66110e = str + ", " + str3 + ", " + str2 + ", " + i10;
                f66111f = new byte[0];
                Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
                Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
                f66112g = Pattern.compile("%([A-Fa-f0-9]{2})");
                f66113h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
                f66115j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", efyhmdM.EmgzaSicSvpWd, "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", ParameterNames.f31999ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", lZYtIbClQJm.KDTCdQktIOUKZd, "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
                f66116k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
                f66117l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
                f66118m = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
                f66119n = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, RCHTTPStatusCodes.CREATED, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, RCHTTPStatusCodes.SUCCESS, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
            }
        }
