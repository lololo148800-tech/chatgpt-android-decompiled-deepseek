package com.google.android.gms.internal.play_billing;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import livekit.LivekitInternal$NodeStats;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.bQBnquXS;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11957g1 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f36270Y;

    public /* synthetic */ AbstractC11957g1(int i10) {
        this.f36270Y = i10;
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ boolean m13428C(byte b) {
        return b >= 0;
    }

    /* JADX INFO: renamed from: E */
    public static int m13429E(InterfaceC11880I1 interfaceC11880I1, int i10, byte[] bArr, int i11, int i12, InterfaceC11985n1 interfaceC11985n1, C11917V0 c11917v0) throws C11997q1 {
        AbstractC11969j1 abstractC11969j1Mo13243g = interfaceC11880I1.mo13243g();
        int iM13440T = m13440T(abstractC11969j1Mo13243g, interfaceC11880I1, bArr, i11, i12, c11917v0);
        interfaceC11880I1.mo13237a(abstractC11969j1Mo13243g);
        c11917v0.f36202c = abstractC11969j1Mo13243g;
        interfaceC11985n1.add(abstractC11969j1Mo13243g);
        while (iM13440T < i12) {
            int iM13435O = m13435O(bArr, iM13440T, c11917v0);
            if (i10 != c11917v0.f36200a) {
                break;
            }
            AbstractC11969j1 abstractC11969j1Mo13243g2 = interfaceC11880I1.mo13243g();
            int iM13440T2 = m13440T(abstractC11969j1Mo13243g2, interfaceC11880I1, bArr, iM13435O, i12, c11917v0);
            interfaceC11880I1.mo13237a(abstractC11969j1Mo13243g2);
            c11917v0.f36202c = abstractC11969j1Mo13243g2;
            interfaceC11985n1.add(abstractC11969j1Mo13243g2);
            iM13440T = iM13440T2;
        }
        return iM13440T;
    }

    /* JADX INFO: renamed from: F */
    public static void m13430F(int i10, int i11, int i12) {
        String strM13433K;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM13433K = m13433K(i10, i12, "start index");
            } else {
                strM13433K = (i11 < 0 || i11 > i12) ? m13433K(i11, i12, "end index") : m13445g("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM13433K);
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m13431G(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: J */
    public static int m13432J(byte[] bArr, int i10, InterfaceC11985n1 interfaceC11985n1, C11917V0 c11917v0) throws C11997q1 {
        C11973k1 c11973k1 = (C11973k1) interfaceC11985n1;
        int iM13435O = m13435O(bArr, i10, c11917v0);
        int i11 = c11917v0.f36200a + iM13435O;
        while (iM13435O < i11) {
            iM13435O = m13435O(bArr, iM13435O, c11917v0);
            c11973k1.m13487p(c11917v0.f36200a);
        }
        if (iM13435O == i11) {
            return iM13435O;
        }
        throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: K */
    public static String m13433K(int i10, int i11, String str) {
        if (i10 < 0) {
            return m13445g("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return m13445g("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
    }

    /* JADX INFO: renamed from: M */
    public static int m13434M(int i10, byte[] bArr, int i11, int i12, C11892M1 c11892m1, C11917V0 c11917v0) throws C11997q1 {
        if ((i10 >>> 3) == 0) {
            throw new C11997q1("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iM13438R = m13438R(bArr, i11, c11917v0);
            c11892m1.m13309c(i10, Long.valueOf(c11917v0.f36201b));
            return iM13438R;
        }
        if (i13 == 1) {
            c11892m1.m13309c(i10, Long.valueOf(m13441U(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iM13435O = m13435O(bArr, i11, c11917v0);
            int i14 = c11917v0.f36200a;
            if (i14 < 0) {
                throw new C11997q1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iM13435O) {
                throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                c11892m1.m13309c(i10, C11929Z0.f36227o0);
            } else {
                c11892m1.m13309c(i10, C11929Z0.m13375p(bArr, iM13435O, i14));
            }
            return iM13435O + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new C11997q1("Protocol message contained an invalid tag (zero).");
            }
            c11892m1.m13309c(i10, Integer.valueOf(m13454q(i11, bArr)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        C11892M1 c11892m1M13307b = C11892M1.m13307b();
        int i16 = c11917v0.f36203d + 1;
        c11917v0.f36203d = i16;
        if (i16 >= 100) {
            throw new C11997q1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i17 = 0;
        while (i11 < i12) {
            int iM13435O2 = m13435O(bArr, i11, c11917v0);
            i17 = c11917v0.f36200a;
            if (i17 == i15) {
                i11 = iM13435O2;
                break;
            }
            i11 = m13434M(i17, bArr, iM13435O2, i12, c11892m1M13307b, c11917v0);
        }
        c11917v0.f36203d--;
        if (i11 > i12 || i17 != i15) {
            throw new C11997q1("Failed to parse the message.");
        }
        c11892m1.m13309c(i10, c11892m1M13307b);
        return i11;
    }

    /* JADX INFO: renamed from: O */
    public static int m13435O(byte[] bArr, int i10, C11917V0 c11917v0) {
        int i11 = i10 + 1;
        byte b = bArr[i10];
        if (b < 0) {
            return m13436P(b, bArr, i11, c11917v0);
        }
        c11917v0.f36200a = b;
        return i11;
    }

    /* JADX INFO: renamed from: P */
    public static int m13436P(int i10, byte[] bArr, int i11, C11917V0 c11917v0) {
        byte b = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b >= 0) {
            c11917v0.f36200a = i13 | (b << 7);
            return i12;
        }
        int i14 = i13 | ((b & 127) << 7);
        int i15 = i11 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            c11917v0.f36200a = i14 | (b10 << 14);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 14);
        int i17 = i11 + 3;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            c11917v0.f36200a = i16 | (b11 << 21);
            return i17;
        }
        int i18 = i16 | ((b11 & 127) << 21);
        int i19 = i11 + 4;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            c11917v0.f36200a = i18 | (b12 << 28);
            return i19;
        }
        int i20 = i18 | ((b12 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c11917v0.f36200a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static int m13437Q(int i10, byte[] bArr, int i11, int i12, InterfaceC11985n1 interfaceC11985n1, C11917V0 c11917v0) {
        C11973k1 c11973k1 = (C11973k1) interfaceC11985n1;
        int iM13435O = m13435O(bArr, i11, c11917v0);
        c11973k1.m13487p(c11917v0.f36200a);
        while (iM13435O < i12) {
            int iM13435O2 = m13435O(bArr, iM13435O, c11917v0);
            if (i10 != c11917v0.f36200a) {
                break;
            }
            iM13435O = m13435O(bArr, iM13435O2, c11917v0);
            c11973k1.m13487p(c11917v0.f36200a);
        }
        return iM13435O;
    }

    /* JADX INFO: renamed from: R */
    public static int m13438R(byte[] bArr, int i10, C11917V0 c11917v0) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c11917v0.f36201b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b & 127)) << 7);
        int i13 = 7;
        while (b < 0) {
            int i14 = i12 + 1;
            byte b10 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b10 & 127)) << i13;
            b = b10;
            i12 = i14;
        }
        c11917v0.f36201b = j11;
        return i12;
    }

    /* JADX INFO: renamed from: S */
    public static int m13439S(Object obj, InterfaceC11880I1 interfaceC11880I1, byte[] bArr, int i10, int i11, int i12, C11917V0 c11917v0) throws C11997q1 {
        C11859B1 c11859b1 = (C11859B1) interfaceC11880I1;
        int i13 = c11917v0.f36203d + 1;
        c11917v0.f36203d = i13;
        if (i13 >= 100) {
            throw new C11997q1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iM13255t = c11859b1.m13255t(obj, bArr, i10, i11, i12, c11917v0);
        c11917v0.f36203d--;
        c11917v0.f36202c = obj;
        return iM13255t;
    }

    /* JADX INFO: renamed from: T */
    public static int m13440T(Object obj, InterfaceC11880I1 interfaceC11880I1, byte[] bArr, int i10, int i11, C11917V0 c11917v0) throws C11997q1 {
        int iM13436P = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iM13436P = m13436P(i12, bArr, iM13436P, c11917v0);
            i12 = c11917v0.f36200a;
        }
        int i13 = iM13436P;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = c11917v0.f36203d + 1;
        c11917v0.f36203d = i14;
        if (i14 >= 100) {
            throw new C11997q1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i12 + i13;
        interfaceC11880I1.mo13238b(obj, bArr, i13, i15, c11917v0);
        c11917v0.f36203d--;
        c11917v0.f36202c = obj;
        return i15;
    }

    /* JADX INFO: renamed from: U */
    public static long m13441U(int i10, byte[] bArr) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: c */
    public static int m13442c(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: d */
    public static int m13443d(byte[] bArr, int i10, C11917V0 c11917v0) throws C11997q1 {
        int iM13435O = m13435O(bArr, i10, c11917v0);
        int i11 = c11917v0.f36200a;
        if (i11 < 0) {
            throw new C11997q1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iM13435O) {
            throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            c11917v0.f36202c = C11929Z0.f36227o0;
            return iM13435O;
        }
        c11917v0.f36202c = C11929Z0.m13375p(bArr, iM13435O, i11);
        return iM13435O + i11;
    }

    /* JADX INFO: renamed from: f */
    public static String m13444f(C11929Z0 c11929z0) {
        StringBuilder sb2 = new StringBuilder(c11929z0.mo13368j());
        for (int i10 = 0; i10 < c11929z0.mo13368j(); i10++) {
            byte bMo13366f = c11929z0.mo13366f(i10);
            if (bMo13366f == 34) {
                sb2.append("\\\"");
            } else if (bMo13366f == 39) {
                sb2.append("\\'");
            } else if (bMo13366f != 92) {
                switch (bMo13366f) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bMo13366f < 32 || bMo13366f > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bMo13366f >>> 6) & 3) + 48));
                            sb2.append((char) (((bMo13366f >>> 3) & 7) + 48));
                            sb2.append((char) ((bMo13366f & 7) + 48));
                        } else {
                            sb2.append((char) bMo13366f);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m13445g(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strM20d;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                strM20d = "null";
            } else {
                try {
                    strM20d = obj.toString();
                } catch (Exception e10) {
                    String strM9890i = AbstractC9306j0.m9890i(obj.getClass().getName(), Separators.f31989AT, Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM9890i), (Throwable) e10);
                    strM20d = AbstractC0010F.m20d(Separators.LESS_THAN, strM9890i, " threw ", e10.getClass().getName(), Separators.GREATER_THAN);
                }
            }
            objArr[i11] = strM20d;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: h */
    public static void m13446h(byte b, byte b10, byte b11, byte b12, char[] cArr, int i10) throws C11997q1 {
        if (!m13431G(b10)) {
            if ((((b10 + 112) + (b << 28)) >> 30) == 0 && !m13431G(b11) && !m13431G(b12)) {
                int i11 = ((b & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw new C11997q1("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: i */
    public static void m13447i(int i10, int i11) {
        String strM13445g;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM13445g = m13445g("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
                }
                strM13445g = m13445g("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM13445g);
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m13449l(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = C11890M.f36160Y;
            }
        } else {
            if (!(collection instanceof InterfaceC11936b0)) {
                return false;
            }
            objComparator = ((AbstractC11875H) ((InterfaceC11936b0) collection)).f36133o0;
        }
        return comparator.equals(objComparator);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ boolean m13450m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AbstractC11984n0 abstractC11984n0, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC11984n0, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(abstractC11984n0) != obj && atomicReferenceFieldUpdater.get(abstractC11984n0) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m13451n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C12022w2 c12022w2, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c12022w2, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(c12022w2) != obj && atomicReferenceFieldUpdater.get(c12022w2) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static int m13452o(int i10) {
        if (i10 == 90) {
            return 91;
        }
        if (i10 == 91) {
            return 92;
        }
        if (i10 == 93) {
            return 94;
        }
        if (i10 == 94) {
            return 95;
        }
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                return 49;
            case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                return 50;
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i10) {
                    case 96:
                        return 97;
                    case 97:
                        return 98;
                    case 98:
                        return 99;
                    case 99:
                        return 100;
                    case 100:
                        return 101;
                    case 101:
                        return 102;
                    case 102:
                        return 103;
                    case 103:
                        return 104;
                    case 104:
                        return 105;
                    case 105:
                        return 106;
                    case 106:
                        return 107;
                    case 107:
                        return 108;
                    case 108:
                        return 109;
                    case 109:
                        return 110;
                    case 110:
                        return 111;
                    case 111:
                        return 112;
                    case 112:
                        return 113;
                    case 113:
                        return 114;
                    case 114:
                        return 115;
                    case 115:
                        return 116;
                    case 116:
                        return 117;
                    case 117:
                        return 118;
                    case 118:
                        return 119;
                    case 119:
                        return 120;
                    case 120:
                        return 121;
                    case 121:
                        return 122;
                    default:
                        return 0;
                }
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m13453p(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    /* JADX INFO: renamed from: q */
    public static int m13454q(int i10, byte[] bArr) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* JADX INFO: renamed from: s */
    public static C11941c1 m13455s() {
        String str;
        ClassLoader classLoader = AbstractC11957g1.class.getClassLoader();
        if (C11941c1.class.equals(C11941c1.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!C11941c1.class.getPackage().equals(AbstractC11957g1.class.getPackage())) {
                throw new IllegalArgumentException(C11941c1.class.getName());
            }
            str = C11941c1.class.getPackage().getName() + ".BlazeGenerated" + C11941c1.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    try {
                        AbstractC0168G.m507B(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                        throw null;
                    } catch (IllegalAccessException e10) {
                        throw new IllegalStateException(e10);
                    } catch (InvocationTargetException e11) {
                        throw new IllegalStateException(e11);
                    }
                } catch (InstantiationException e12) {
                    throw new IllegalStateException(e12);
                } catch (NoSuchMethodException e13) {
                    throw new IllegalStateException(e13);
                }
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = Arrays.asList(new AbstractC11957g1[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e14) {
                    Logger.getLogger(C11933a1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(C11941c1.class.getSimpleName()), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (C11941c1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C11941c1) C11941c1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (NoSuchMethodException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    /* JADX INFO: renamed from: t */
    public static void m13456t(byte b, byte b10, byte b11, char[] cArr, int i10) throws C11997q1 {
        if (!m13431G(b10)) {
            if (b != -32) {
                if (b != -19) {
                    if (!m13431G(b11)) {
                        cArr[i10] = (char) (((b & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                } else if (b10 < -96) {
                    b = -19;
                    if (!m13431G(b11)) {
                        cArr[i10] = (char) (((b & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                }
            } else if (b10 >= -96) {
                b = -32;
                if (b != -19) {
                    if (!m13431G(b11)) {
                        cArr[i10] = (char) (((b & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                } else if (b10 < -96) {
                    b = -19;
                    if (!m13431G(b11)) {
                        cArr[i10] = (char) (((b & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                }
            }
        }
        throw new C11997q1("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: u */
    public static void m13457u(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m13433K(i10, i11, "index"));
        }
    }

    /* JADX INFO: renamed from: w */
    public static int m13458w(InterfaceC11880I1 interfaceC11880I1, byte[] bArr, int i10, int i11, int i12, C11917V0 c11917v0) throws C11997q1 {
        AbstractC11969j1 abstractC11969j1Mo13243g = interfaceC11880I1.mo13243g();
        int iM13439S = m13439S(abstractC11969j1Mo13243g, interfaceC11880I1, bArr, i10, i11, i12, c11917v0);
        interfaceC11880I1.mo13237a(abstractC11969j1Mo13243g);
        c11917v0.f36202c = abstractC11969j1Mo13243g;
        return iM13439S;
    }

    /* JADX INFO: renamed from: x */
    public static long m13459x(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    /* JADX INFO: renamed from: y */
    public static void m13460y(byte b, byte b10, char[] cArr, int i10) throws C11997q1 {
        if (b < -62 || m13431G(b10)) {
            throw new C11997q1("Protocol message had invalid UTF-8.");
        }
        cArr[i10] = (char) (((b & 31) << 6) | (b10 & 63));
    }

    /* JADX INFO: renamed from: A */
    public abstract boolean mo13461A(C12022w2 c12022w2, C11886K1 c11886k1, C11886K1 c11886k2);

    /* JADX INFO: renamed from: B */
    public abstract void mo13421B(C11980m0 c11980m0, Thread thread);

    /* JADX INFO: renamed from: D */
    public abstract boolean mo13462D(C12022w2 c12022w2, Object obj, Object obj2);

    /* JADX INFO: renamed from: H */
    public abstract boolean mo13422H(AbstractC11984n0 abstractC11984n0, C11952f0 c11952f0, C11952f0 c11952f1);

    /* JADX INFO: renamed from: I */
    public abstract boolean mo13463I(C12022w2 c12022w2, C12018v2 c12018v2, C12018v2 c12018v3);

    /* JADX INFO: renamed from: L */
    public abstract boolean mo13423L(AbstractC11984n0 abstractC11984n0, Object obj, Object obj2);

    /* JADX INFO: renamed from: N */
    public abstract boolean mo13424N(AbstractC11984n0 abstractC11984n0, C11980m0 c11980m0, C11980m0 c11980m1);

    /* JADX INFO: renamed from: e */
    public abstract C11952f0 mo13425e(AbstractC11984n0 abstractC11984n0);

    /* JADX INFO: renamed from: k */
    public abstract void mo13464k(C12018v2 c12018v2, C12018v2 c12018v3);

    /* JADX INFO: renamed from: r */
    public abstract C11980m0 mo13426r(AbstractC11984n0 abstractC11984n0);

    public String toString() {
        switch (this.f36270Y) {
            case 4:
                return ((ScheduledFutureC11861C0) this).f36113Z.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo13465v(C12018v2 c12018v2, Thread thread);

    /* JADX INFO: renamed from: z */
    public abstract void mo13427z(C11980m0 c11980m0, C11980m0 c11980m1);

    /* JADX INFO: renamed from: j */
    public static void m13448j(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + bQBnquXS.kCjRJHj + i10);
    }
}
