package androidx.glance.appwidget.protobuf;

import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17311n;
import p003A1.AbstractC0187M0;
import p025An.C0644w;
import p1000s0.C19392A;
import p1000s0.C19408d;
import p1000s0.C19419o;
import p1113xn.AbstractC21322p;
import p349O0.C6013l;
import p349O0.C6021p;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8202u0;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p736f0.AbstractC13481T;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13795w0;
import p758g0.C13796x;
import p758g0.InterfaceC13772l;
import p881m0.AbstractC17136m;
import p881m0.C17127d;
import p881m0.C17133j;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11043g0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33304a;

    public /* synthetic */ C11043g0(int i10) {
        this.f33304a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static final String m12021a(String str) {
        Object objM9806b;
        AbstractC16544l.m18094g(str, "<this>");
        try {
            objM9806b = new URL(m12023e(str));
        } catch (Throwable th2) {
            objM9806b = AbstractC9233X.m9806b(th2);
        }
        if (objM9806b instanceof C17311n) {
            objM9806b = null;
        }
        URL url = (URL) objM9806b;
        if (url != null) {
            return AbstractC9306j0.m9890i(url.getProtocol(), "://", url.getHost());
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static C17133j m12022d(C19408d c19408d, C19392A c19392a, InterfaceC13772l interfaceC13772l, C6021p c6021p, int i10, int i11) {
        if ((i11 & 2) != 0) {
            c19392a = new C19392A();
        }
        C13796x c13796xM15000a = AbstractC13481T.m15000a(c6021p);
        boolean z6 = true;
        if ((i11 & 8) != 0) {
            Object obj = AbstractC13795w0.f43580a;
            interfaceC13772l = AbstractC13758e.m15254s(0.0f, 400.0f, Float.valueOf(1), 1);
        }
        Object obj2 = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
        EnumC7546k enumC7546k = (EnumC7546k) c6021p.m6548k(AbstractC0187M0.f710l);
        boolean zM6542f = ((((i10 & 14) ^ 6) > 4 && c6021p.m6542f(c19408d)) || (i10 & 6) == 4) | c6021p.m6542f(c13796xM15000a) | c6021p.m6542f(interfaceC13772l);
        if ((((i10 & 112) ^ 48) <= 32 || !c6021p.m6542f(c19392a)) && (i10 & 48) != 32) {
            z6 = false;
        }
        boolean zM6542f2 = zM6542f | z6 | c6021p.m6542f(obj2) | c6021p.m6542f(enumC7546k);
        Object objM6514H = c6021p.m6514H();
        if (zM6542f2 || objM6514H == C6013l.f19514a) {
            C17127d c17127d = new C17127d(c19408d, new C19419o(c19408d, enumC7546k, 0.5f), c19392a);
            float f10 = AbstractC17136m.f54799a;
            Object c17133j = new C17133j(c17127d, c13796xM15000a, interfaceC13772l);
            c6021p.m6537c0(c17133j);
            objM6514H = c17133j;
        }
        return (C17133j) objM6514H;
    }

    /* JADX INFO: renamed from: e */
    public static final String m12023e(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        boolean zM21667A = AbstractC21322p.m21667A(str, "://", false);
        if (zM21667A) {
            return str;
        }
        if (zM21667A) {
            throw new C0644w();
        }
        return "https://".concat(str);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065 A[LOOP:2: B:23:0x005f->B:26:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0139 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final String m12024b(byte[] bArr, int i10, int i11) {
        int i12;
        byte b;
        int i13;
        byte b10;
        byte b11;
        byte b12;
        int i14 = i10;
        switch (this.f33304a) {
            case 0:
                if ((i14 | i11 | ((bArr.length - i14) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                int i15 = i14 + i11;
                char[] cArr = new char[i11];
                int i16 = 0;
                while (i14 < i15) {
                    byte b13 = bArr[i14];
                    if (b13 < 0) {
                        while (i14 < i15) {
                            i12 = i14 + 1;
                            b = bArr[i14];
                            if (b < 0) {
                                i13 = i16 + 1;
                                cArr[i16] = (char) b;
                                while (i12 < i15) {
                                    b10 = bArr[i12];
                                    if (b10 >= 0) {
                                        i12++;
                                        cArr[i13] = (char) b10;
                                        i13++;
                                    } else {
                                        i16 = i13;
                                        i14 = i12;
                                    }
                                }
                                i16 = i13;
                                i14 = i12;
                            } else if (b < -32) {
                                if (i12 < i15) {
                                    throw C11005A.m11843a();
                                }
                                i14 += 2;
                                byte b14 = bArr[i12];
                                int i17 = i16 + 1;
                                if (b >= -62 || AbstractC8202u0.m8817c(b14)) {
                                    throw C11005A.m11843a();
                                }
                                cArr[i16] = (char) ((b14 & 63) | ((b & 31) << 6));
                                i16 = i17;
                            } else if (b < -16) {
                                if (i12 < i15 - 1) {
                                    throw C11005A.m11843a();
                                }
                                int i18 = i14 + 2;
                                b11 = bArr[i12];
                                i14 += 3;
                                byte b15 = bArr[i18];
                                int i19 = i16 + 1;
                                if (!AbstractC8202u0.m8817c(b11) || ((b == -32 && b11 < -96) || ((b == -19 && b11 >= -96) || AbstractC8202u0.m8817c(b15)))) {
                                    throw C11005A.m11843a();
                                }
                                cArr[i16] = (char) (((b11 & 63) << 6) | ((b & 15) << 12) | (b15 & 63));
                                i16 = i19;
                            } else {
                                if (i12 < i15 - 2) {
                                    throw C11005A.m11843a();
                                }
                                b12 = bArr[i12];
                                int i20 = i14 + 3;
                                byte b16 = bArr[i14 + 2];
                                i14 += 4;
                                byte b17 = bArr[i20];
                                int i21 = i16 + 1;
                                if (!AbstractC8202u0.m8817c(b12) || (((b12 + 112) + (b << 28)) >> 30) != 0 || AbstractC8202u0.m8817c(b16) || AbstractC8202u0.m8817c(b17)) {
                                    throw C11005A.m11843a();
                                }
                                int i22 = ((b12 & 63) << 12) | ((b & 7) << 18) | ((b16 & 63) << 6) | (b17 & 63);
                                cArr[i16] = (char) ((i22 >>> 10) + 55232);
                                cArr[i21] = (char) ((i22 & 1023) + 56320);
                                i16 += 2;
                            }
                        }
                        return new String(cArr, 0, i16);
                    }
                    i14++;
                    cArr[i16] = (char) b13;
                    i16++;
                }
                while (i14 < i15) {
                    i12 = i14 + 1;
                    b = bArr[i14];
                    if (b < 0) {
                        if (b < -32) {
                            if (i12 < i15) {
                                throw C11005A.m11843a();
                            }
                            i14 += 2;
                            byte b18 = bArr[i12];
                            int i110 = i16 + 1;
                            if (b >= -62) {
                            }
                            throw C11005A.m11843a();
                        }
                        if (b < -16) {
                            if (i12 < i15 - 1) {
                                throw C11005A.m11843a();
                            }
                            int i111 = i14 + 2;
                            b11 = bArr[i12];
                            i14 += 3;
                            byte b19 = bArr[i111];
                            int i112 = i16 + 1;
                            if (AbstractC8202u0.m8817c(b11)) {
                            }
                            throw C11005A.m11843a();
                        }
                        if (i12 < i15 - 2) {
                            throw C11005A.m11843a();
                        }
                        b12 = bArr[i12];
                        int i23 = i14 + 3;
                        byte b110 = bArr[i14 + 2];
                        i14 += 4;
                        byte b111 = bArr[i23];
                        int i24 = i16 + 1;
                        if (AbstractC8202u0.m8817c(b12)) {
                        }
                        throw C11005A.m11843a();
                    }
                    i13 = i16 + 1;
                    cArr[i16] = (char) b;
                    while (i12 < i15) {
                        b10 = bArr[i12];
                        if (b10 >= 0) {
                            i12++;
                            cArr[i13] = (char) b10;
                            i13++;
                        } else {
                            i16 = i13;
                            i14 = i12;
                        }
                    }
                    i16 = i13;
                    i14 = i12;
                }
                return new String(cArr, 0, i16);
            default:
                Charset charset = AbstractC11063y.f33343a;
                String str = new String(bArr, i14, i11, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i14, i11 + i14))) {
                    throw C11005A.m11843a();
                }
                return str;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m12025c(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        long j10;
        String str2;
        String str3;
        int i14;
        char cCharAt2;
        switch (this.f33304a) {
            case 0:
                int length = str.length();
                int i15 = i11 + i10;
                int i16 = 0;
                while (i16 < length && (i13 = i16 + i10) < i15 && (cCharAt = str.charAt(i16)) < 128) {
                    bArr[i13] = (byte) cCharAt;
                    i16++;
                }
                if (i16 == length) {
                    return i10 + length;
                }
                int i17 = i10 + i16;
                while (i16 < length) {
                    char cCharAt3 = str.charAt(i16);
                    if (cCharAt3 < 128 && i17 < i15) {
                        bArr[i17] = (byte) cCharAt3;
                        i17++;
                    } else if (cCharAt3 < 2048 && i17 <= i15 - 2) {
                        int i18 = i17 + 1;
                        bArr[i17] = (byte) ((cCharAt3 >>> 6) | 960);
                        i17 += 2;
                        bArr[i18] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i17 > i15 - 3) {
                            if (i17 > i15 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i12 = i16 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i12)))) {
                                    throw new C11045h0(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i17);
                            }
                            int i19 = i16 + 1;
                            if (i19 != str.length()) {
                                char cCharAt4 = str.charAt(i19);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i20 = i17 + 3;
                                    bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i17 += 4;
                                    bArr[i20] = (byte) ((codePoint & 63) | 128);
                                    i16 = i19;
                                } else {
                                    i16 = i19;
                                }
                            }
                            throw new C11045h0(i16 - 1, length);
                        }
                        bArr[i17] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i21 = i17 + 2;
                        bArr[i17 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i17 += 3;
                        bArr[i21] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i16++;
                }
                return i17;
            default:
                long j11 = i10;
                long j12 = ((long) i11) + j11;
                int length2 = str.length();
                String str4 = " at index ";
                String str5 = "Failed writing ";
                if (length2 > i11 || bArr.length - i11 < i10) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i10 + i11));
                }
                int i22 = 0;
                while (true) {
                    j10 = 1;
                    if (i22 < length2 && (cCharAt2 = str.charAt(i22)) < 128) {
                        AbstractC11041f0.m12013j(bArr, j11, (byte) cCharAt2);
                        i22++;
                        j11 = 1 + j11;
                    }
                }
                if (i22 != length2) {
                    while (i22 < length2) {
                        char cCharAt5 = str.charAt(i22);
                        if (cCharAt5 < 128 && j11 < j12) {
                            AbstractC11041f0.m12013j(bArr, j11, (byte) cCharAt5);
                            str3 = str5;
                            j11 += j10;
                            str2 = str4;
                        } else if (cCharAt5 >= 2048 || j11 > j12 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j11 > j12 - 3) {
                                if (j11 > j12 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i14)))) {
                                        throw new C11045h0(i22, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + cCharAt5 + str2 + j11);
                                }
                                int i23 = i22 + 1;
                                if (i23 != length2) {
                                    char cCharAt6 = str.charAt(i23);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        AbstractC11041f0.m12013j(bArr, j11, (byte) ((codePoint2 >>> 18) | 240));
                                        AbstractC11041f0.m12013j(bArr, j11 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j13 = 3 + j11;
                                        AbstractC11041f0.m12013j(bArr, j11 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j11 += 4;
                                        AbstractC11041f0.m12013j(bArr, j13, (byte) ((codePoint2 & 63) | 128));
                                        i22 = i23;
                                    } else {
                                        i22 = i23;
                                    }
                                }
                                throw new C11045h0(i22 - 1, length2);
                            }
                            AbstractC11041f0.m12013j(bArr, j11, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j14 = j11 + 2;
                            AbstractC11041f0.m12013j(bArr, j11 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j11 += 3;
                            AbstractC11041f0.m12013j(bArr, j14, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j15 = j11 + j10;
                            AbstractC11041f0.m12013j(bArr, j11, (byte) ((cCharAt5 >>> 6) | 960));
                            j11 += 2;
                            AbstractC11041f0.m12013j(bArr, j15, (byte) ((cCharAt5 & '?') | 128));
                        }
                        i22++;
                        str4 = str2;
                        str5 = str3;
                        j10 = 1;
                    }
                }
                return (int) j11;
        }
    }
}
