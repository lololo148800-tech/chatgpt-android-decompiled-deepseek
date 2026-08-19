package p324Mn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import livekit.org.webrtc.WebrtcBuildVersion;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p016Ae.C0439a;
import p1113xn.AbstractC21329w;
import p369On.AbstractC6273b;
import p463Sn.C7151d;
import p523V9.AbstractC7966P5;

/* JADX INFO: renamed from: Mn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C5534d {
    /* JADX WARN: Code duplicated, block: B:102:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:116:0x0205  */
    /* JADX WARN: Code duplicated, block: B:118:0x0208  */
    /* JADX WARN: Code duplicated, block: B:123:0x021a  */
    /* JADX WARN: Code duplicated, block: B:125:0x021e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0221  */
    /* JADX WARN: Code duplicated, block: B:129:0x0225  */
    /* JADX WARN: Code duplicated, block: B:135:0x0237  */
    /* JADX WARN: Code duplicated, block: B:137:0x023c  */
    /* JADX WARN: Code duplicated, block: B:140:0x024c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0250  */
    /* JADX WARN: Code duplicated, block: B:144:0x0253  */
    /* JADX WARN: Code duplicated, block: B:147:0x025f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0263  */
    /* JADX WARN: Code duplicated, block: B:151:0x0266  */
    /* JADX WARN: Code duplicated, block: B:154:0x0271  */
    /* JADX WARN: Code duplicated, block: B:156:0x0275  */
    /* JADX WARN: Code duplicated, block: B:163:0x0288  */
    /* JADX WARN: Code duplicated, block: B:165:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:178:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:188:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:190:0x0302  */
    /* JADX WARN: Code duplicated, block: B:223:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x031c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x01e6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static AbstractC5535e m5937a(String text) {
        int i10;
        int i11;
        char cCharAt;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        char upperCase;
        int i16;
        int i17;
        char cCharAt2;
        char cCharAt3;
        int i18;
        AbstractC16544l.m18094g(text, "text");
        int i19 = 0;
        char c9 = 0;
        int i20 = 1;
        int iM5939c = 0;
        int iM5939c2 = 0;
        int iM5939c3 = 0;
        int iM5939c4 = 0;
        int iM5939c5 = 0;
        int iM5939c6 = 0;
        int iM5939c7 = 0;
        int i21 = 0;
        while (i19 < text.length()) {
            if (c9 == 0) {
                int i22 = i19 + 1;
                if (i22 >= text.length() && (text.charAt(i19) == '+' || text.charAt(i19) == '-')) {
                    m5938b(i19, "Unexpected end of string; 'P' designator is required");
                    throw null;
                }
                char cCharAt4 = text.charAt(i19);
                if (cCharAt4 == '+' || cCharAt4 == '-') {
                    if (text.charAt(i19) == '-') {
                        i20 = -1;
                    }
                    if (text.charAt(i22) != 'P') {
                        m5938b(i22, "Expected 'P', got '" + text.charAt(i22) + '\'');
                        throw null;
                    }
                    i19 += 2;
                } else {
                    if (cCharAt4 != 'P') {
                        m5938b(i19, "Expected '+', '-', 'P', got '" + text.charAt(i19) + '\'');
                        throw null;
                    }
                    i19 = i22;
                }
                c9 = 1;
            } else {
                char cCharAt5 = text.charAt(i19);
                if (cCharAt5 == '+' || cCharAt5 == '-') {
                    i10 = text.charAt(i19) == '-' ? i20 * (-1) : i20;
                    i11 = i19 + 1;
                    if (i11 >= text.length() || '0' > (cCharAt = text.charAt(i11)) || cCharAt >= ':') {
                        m5938b(i11, "A number expected after '" + text.charAt(i11) + '\'');
                        throw null;
                    }
                    i12 = i20;
                    i13 = iM5939c;
                    long jM6755b = 0;
                    while (true) {
                        if (i11 < text.length()) {
                            i14 = iM5939c2;
                            break;
                        }
                        cCharAt3 = text.charAt(i11);
                        i14 = iM5939c2;
                        if ('0' > cCharAt3) {
                            break;
                        }
                        break;
                        break;
                        i11++;
                        iM5939c3 = i18;
                        iM5939c2 = i14;
                    }
                    i15 = iM5939c3;
                    j10 = jM6755b * ((long) i10);
                    if (i11 != text.length()) {
                        m5938b(i11, "Expected a designator after the numerical value");
                        throw null;
                    }
                    upperCase = Character.toUpperCase(text.charAt(i11));
                    int i23 = iM5939c4;
                    if (upperCase == 'Y') {
                        if (upperCase == 'M') {
                            if (c9 >= 6) {
                                if (c9 < '\b') {
                                    m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                c9 = '\b';
                                iM5939c6 = m5939c(j10, i19, 'M');
                                iM5939c = i13;
                                iM5939c2 = i14;
                                iM5939c3 = i15;
                            } else {
                                if (c9 < 3) {
                                    m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                c9 = 3;
                                iM5939c4 = m5939c(j10, i19, 'M');
                                iM5939c = i13;
                                iM5939c2 = i14;
                                iM5939c3 = i15;
                            }
                        } else if (upperCase == 'W') {
                            if (c9 < 4) {
                                m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                throw null;
                            }
                            c9 = 4;
                            iM5939c2 = m5939c(j10, i19, 'W');
                            iM5939c = i13;
                            iM5939c3 = i15;
                        } else if (upperCase == 'D') {
                            if (upperCase == 'H') {
                                if (c9 < 7) {
                                }
                                m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                throw null;
                            }
                            if (upperCase == 'S') {
                                if (c9 < '\t') {
                                }
                                m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                throw null;
                            }
                            if (upperCase != '.') {
                                m5938b(i11, "Expected a designator after the numerical value");
                                throw null;
                            }
                            i16 = i11 + 1;
                            if (i16 < text.length()) {
                                m5938b(i16, "Expected designator 'S' after " + text.charAt(i11));
                                throw null;
                            }
                            i11 = i16;
                            while (i11 < text.length()) {
                                i11++;
                            }
                            i17 = i11 - i16;
                            if (i17 <= 9) {
                                m5938b(i16, "Only the nanosecond fractions of a second are supported");
                                throw null;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            String strSubstring = text.substring(i16, i11);
                            AbstractC16544l.m18093f(strSubstring, "substring(...)");
                            sb2.append(strSubstring);
                            sb2.append(AbstractC21329w.m21729p(9 - i17, WebrtcBuildVersion.maint_version));
                            String string = sb2.toString();
                            AbstractC7966P5.m8254b(10);
                            int i24 = Integer.parseInt(string, 10) * i10;
                            if (text.charAt(i11) == 'S') {
                                m5938b(i11, "Expected the 'S' designator after a fraction");
                                throw null;
                            }
                            if (c9 < '\t') {
                            }
                            m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                            throw null;
                            iM5939c = i13;
                            iM5939c2 = i14;
                            iM5939c3 = i15;
                        } else {
                            if (c9 < 5) {
                                m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                throw null;
                            }
                            c9 = 5;
                            iM5939c = m5939c(j10, i19, 'D');
                            iM5939c2 = i14;
                            iM5939c3 = i15;
                        }
                        i19 = i11 + 1;
                        i20 = i12;
                    } else {
                        if (c9 < 2) {
                            m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                            throw null;
                        }
                        c9 = 2;
                        iM5939c3 = m5939c(j10, i19, 'Y');
                        iM5939c = i13;
                        iM5939c2 = i14;
                    }
                    iM5939c4 = i23;
                    i19 = i11 + 1;
                    i20 = i12;
                } else if (('0' <= cCharAt5 && cCharAt5 < ':') || cCharAt5 != 'T') {
                    i11 = i19;
                    i10 = i20;
                    i12 = i20;
                    i13 = iM5939c;
                    long jM6755b2 = 0;
                    while (true) {
                        if (i11 < text.length()) {
                            i14 = iM5939c2;
                            break;
                        }
                        cCharAt3 = text.charAt(i11);
                        i14 = iM5939c2;
                        if ('0' > cCharAt3 || cCharAt3 >= ':') {
                            break;
                        }
                        i18 = iM5939c3;
                        try {
                            jM6755b2 = AbstractC6273b.m6755b(AbstractC6273b.m6756c(jM6755b2, 10L), text.charAt(i11) - '0');
                            i11++;
                            iM5939c3 = i18;
                            iM5939c2 = i14;
                        } catch (ArithmeticException unused) {
                            m5938b(i19, "The number is too large");
                            throw null;
                        }
                    }
                    i15 = iM5939c3;
                    j10 = jM6755b2 * ((long) i10);
                    if (i11 != text.length()) {
                        m5938b(i11, "Expected a designator after the numerical value");
                        throw null;
                    }
                    upperCase = Character.toUpperCase(text.charAt(i11));
                    int i25 = iM5939c4;
                    if (upperCase == 'Y') {
                        if (upperCase == 'M') {
                            if (c9 >= 6) {
                                if (c9 < '\b') {
                                    m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                c9 = '\b';
                                iM5939c6 = m5939c(j10, i19, 'M');
                                iM5939c = i13;
                                iM5939c2 = i14;
                                iM5939c3 = i15;
                            } else {
                                if (c9 < 3) {
                                    m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                c9 = 3;
                                iM5939c4 = m5939c(j10, i19, 'M');
                                iM5939c = i13;
                                iM5939c2 = i14;
                                iM5939c3 = i15;
                            }
                        } else if (upperCase == 'W') {
                            if (c9 < 4) {
                                m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                throw null;
                            }
                            c9 = 4;
                            iM5939c2 = m5939c(j10, i19, 'W');
                            iM5939c = i13;
                            iM5939c3 = i15;
                        } else if (upperCase == 'D') {
                            if (upperCase == 'H') {
                                if (c9 < 7 || c9 < 6) {
                                    m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                iM5939c5 = m5939c(j10, i19, 'H');
                                c9 = 7;
                            } else if (upperCase == 'S') {
                                if (c9 < '\t' || c9 < 6) {
                                    m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                c9 = '\t';
                                iM5939c = i13;
                                iM5939c2 = i14;
                                iM5939c3 = i15;
                                iM5939c4 = i25;
                                iM5939c7 = m5939c(j10, i19, 'S');
                            } else {
                                if (upperCase != '.' && upperCase != ',') {
                                    m5938b(i11, "Expected a designator after the numerical value");
                                    throw null;
                                }
                                i16 = i11 + 1;
                                if (i16 < text.length()) {
                                    m5938b(i16, "Expected designator 'S' after " + text.charAt(i11));
                                    throw null;
                                }
                                i11 = i16;
                                while (i11 < text.length() && '0' <= (cCharAt2 = text.charAt(i11)) && cCharAt2 < ':') {
                                    i11++;
                                }
                                i17 = i11 - i16;
                                if (i17 <= 9) {
                                    m5938b(i16, "Only the nanosecond fractions of a second are supported");
                                    throw null;
                                }
                                StringBuilder sb3 = new StringBuilder();
                                String strSubstring2 = text.substring(i16, i11);
                                AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                                sb3.append(strSubstring2);
                                sb3.append(AbstractC21329w.m21729p(9 - i17, WebrtcBuildVersion.maint_version));
                                String string2 = sb3.toString();
                                AbstractC7966P5.m8254b(10);
                                int i26 = Integer.parseInt(string2, 10) * i10;
                                if (text.charAt(i11) == 'S') {
                                    m5938b(i11, "Expected the 'S' designator after a fraction");
                                    throw null;
                                }
                                if (c9 < '\t' || c9 < 6) {
                                    m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                c9 = '\t';
                                iM5939c7 = m5939c(j10, i19, 'S');
                                i21 = i26;
                            }
                            iM5939c = i13;
                            iM5939c2 = i14;
                            iM5939c3 = i15;
                        } else {
                            if (c9 < 5) {
                                m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                throw null;
                            }
                            c9 = 5;
                            iM5939c = m5939c(j10, i19, 'D');
                            iM5939c2 = i14;
                            iM5939c3 = i15;
                        }
                        i19 = i11 + 1;
                        i20 = i12;
                    } else {
                        if (c9 < 2) {
                            m5938b(i11, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                            throw null;
                        }
                        c9 = 2;
                        iM5939c3 = m5939c(j10, i19, 'Y');
                        iM5939c = i13;
                        iM5939c2 = i14;
                    }
                    iM5939c4 = i25;
                    i19 = i11 + 1;
                    i20 = i12;
                } else {
                    if (c9 >= 6) {
                        m5938b(i19, "Only one 'T' designator is allowed");
                        throw null;
                    }
                    i19++;
                    c9 = 6;
                }
            }
        }
        if (c9 == 0) {
            m5938b(i19, "Unexpected end of input; 'P' designator is required");
            throw null;
        }
        if (c9 == 6) {
            m5938b(i19, "Unexpected end of input; at least one time component is required after 'T'");
            throw null;
        }
        long j11 = ((long) iM5939c) + ((long) (iM5939c2 * 7));
        if (-2147483648L > j11 || j11 > 2147483647L) {
            m5938b(0, "The total number of days under 'D' and 'W' designators should fit into an Int");
            throw null;
        }
        int i27 = (int) j11;
        long j12 = i21;
        long j13 = (((long) iM5939c3) * ((long) 12)) + ((long) iM5939c4);
        if (-2147483648L > j13 || j13 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0168G.m532u("The total number of months in ", iM5939c3, " years and ", iM5939c4, " months overflows an Int"));
        }
        int i28 = (int) j13;
        long j14 = 60;
        long j15 = ((((long) iM5939c5) * j14) + ((long) iM5939c6)) * j14;
        long j16 = 1000000000;
        long j17 = (j12 / j16) + j15 + ((long) iM5939c7);
        try {
            long j18 = j12 % j16;
            if (j17 > 0 && j18 < 0) {
                j17--;
                j18 += 1000000000;
            } else if (j17 < 0 && j18 > 0) {
                j17++;
                j18 -= 1000000000;
            }
            long jM6755b3 = AbstractC6273b.m6755b(AbstractC6273b.m6756c(j17, 1000000000L), j18);
            return jM6755b3 != 0 ? new C5536f(jM6755b3, i28, i27) : new C5533c(i28, i27);
        } catch (ArithmeticException unused2) {
            StringBuilder sbM21e = AbstractC0010F.m21e("The total number of nanoseconds in ", iM5939c5, " hours, ", iM5939c6, " minutes, ");
            sbM21e.append(iM5939c7);
            sbM21e.append(" seconds, and ");
            sbM21e.append(j12);
            sbM21e.append(" nanoseconds overflows a Long");
            throw new IllegalArgumentException(sbM21e.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5938b(int i10, String str) {
        throw new C0439a("Parse error at char " + i10 + ": " + str, 1);
    }

    /* JADX INFO: renamed from: c */
    public static final int m5939c(long j10, int i10, char c9) {
        if (j10 >= -2147483648L && j10 <= 2147483647L) {
            return (int) j10;
        }
        m5938b(i10, "Value " + j10 + " does not fit into an Int, which is required for component '" + c9 + '\'');
        throw null;
    }

    public final KSerializer serializer() {
        return C7151d.f22742a;
    }
}
