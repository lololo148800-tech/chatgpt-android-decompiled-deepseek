package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.z1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12212z1 extends AbstractC12153g {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f37132c;

    public /* synthetic */ C12212z1(int i10) {
        this.f37132c = i10;
    }

    /* JADX INFO: renamed from: b0 */
    public static int m14217b0(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            AbstractC12153g abstractC12153g = AbstractC12077B1.f36870a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return AbstractC12077B1.m13722c(i10, AbstractC12209y1.m14184g(j10, bArr));
        }
        if (i11 == 2) {
            return AbstractC12077B1.m13723d(i10, AbstractC12209y1.m14184g(j10, bArr), AbstractC12209y1.m14184g(j10 + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b A[LOOP:2: B:25:0x0060->B:29:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0073 A[SYNTHETIC] */
    @Override // com.google.protobuf.AbstractC12153g
    /* JADX INFO: renamed from: K */
    public final String mo13991K(byte[] bArr, int i10, int i11) throws C12181p0 {
        int i12;
        int i13;
        byte b;
        int i14;
        byte b10;
        switch (this.f37132c) {
            case 0:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                int i15 = i10 + i11;
                char[] cArr = new char[i11];
                int i16 = 0;
                while (i10 < i15) {
                    byte b11 = bArr[i10];
                    if (!AbstractC12153g.m13966b(b11)) {
                        i12 = i16;
                        while (i10 < i15) {
                            i13 = i10 + 1;
                            b = bArr[i10];
                            if (AbstractC12153g.m13966b(b)) {
                                i14 = i12 + 1;
                                cArr[i12] = (char) b;
                                while (i13 < i15) {
                                    b10 = bArr[i13];
                                    if (AbstractC12153g.m13966b(b10)) {
                                        i13++;
                                        cArr[i14] = (char) b10;
                                        i14++;
                                    } else {
                                        i12 = i14;
                                        i10 = i13;
                                    }
                                }
                                i12 = i14;
                                i10 = i13;
                            } else if (b < -32) {
                                if (i13 < i15) {
                                    throw C12181p0.m14061b();
                                }
                                i10 += 2;
                                AbstractC12153g.m13967c(b, bArr[i13], cArr, i12);
                                i12++;
                            } else if (b < -16) {
                                if (i13 < i15 - 1) {
                                    throw C12181p0.m14061b();
                                }
                                int i17 = i10 + 2;
                                i10 += 3;
                                AbstractC12153g.m13968d(b, bArr[i13], bArr[i17], cArr, i12);
                                i12++;
                            } else {
                                if (i13 < i15 - 2) {
                                    throw C12181p0.m14061b();
                                }
                                byte b12 = bArr[i13];
                                int i18 = i10 + 3;
                                byte b13 = bArr[i10 + 2];
                                i10 += 4;
                                AbstractC12153g.m13965a(b, b12, b13, bArr[i18], cArr, i12);
                                i12 += 2;
                            }
                        }
                        return new String(cArr, 0, i12);
                    }
                    i10++;
                    cArr[i16] = (char) b11;
                    i16++;
                }
                i12 = i16;
                while (i10 < i15) {
                    i13 = i10 + 1;
                    b = bArr[i10];
                    if (AbstractC12153g.m13966b(b)) {
                        i14 = i12 + 1;
                        cArr[i12] = (char) b;
                        while (i13 < i15) {
                            b10 = bArr[i13];
                            if (AbstractC12153g.m13966b(b10)) {
                                i12 = i14;
                                i10 = i13;
                            } else {
                                i13++;
                                cArr[i14] = (char) b10;
                                i14++;
                            }
                        }
                        i12 = i14;
                        i10 = i13;
                    } else if (b < -32) {
                        if (i13 < i15) {
                            throw C12181p0.m14061b();
                        }
                        i10 += 2;
                        AbstractC12153g.m13967c(b, bArr[i13], cArr, i12);
                        i12++;
                    } else if (b < -16) {
                        if (i13 < i15 - 1) {
                            throw C12181p0.m14061b();
                        }
                        int i19 = i10 + 2;
                        i10 += 3;
                        AbstractC12153g.m13968d(b, bArr[i13], bArr[i19], cArr, i12);
                        i12++;
                    } else {
                        if (i13 < i15 - 2) {
                            throw C12181p0.m14061b();
                        }
                        byte b14 = bArr[i13];
                        int i110 = i10 + 3;
                        byte b15 = bArr[i10 + 2];
                        i10 += 4;
                        AbstractC12153g.m13965a(b, b14, b15, bArr[i110], cArr, i12);
                        i12 += 2;
                    }
                }
                return new String(cArr, 0, i12);
            default:
                Charset charset = AbstractC12175n0.f37050a;
                String str = new String(bArr, i10, i11, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                    throw C12181p0.m14061b();
                }
                return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x006e A[LOOP:2: B:18:0x005d->B:23:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0077 A[SYNTHETIC] */
    @Override // com.google.protobuf.AbstractC12153g
    /* JADX INFO: renamed from: M */
    public final String mo13992M(int i10, int i11, ByteBuffer byteBuffer) throws C12181p0 {
        long j10;
        AbstractC12206x1 abstractC12206x1;
        byte bMo14157e;
        boolean z6;
        boolean z10;
        int i12;
        byte bMo14157e2;
        boolean z11 = true;
        switch (this.f37132c) {
            case 0:
                return AbstractC12153g.m13953L(i10, i11, byteBuffer);
            default:
                if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                long jM14172j = AbstractC12209y1.f37124c.m14172j(AbstractC12209y1.f37128g, byteBuffer) + ((long) i10);
                long j11 = ((long) i11) + jM14172j;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (jM14172j < j11) {
                    byte bMo14157e3 = AbstractC12209y1.f37124c.mo14157e(jM14172j);
                    if (!AbstractC12153g.m13966b(bMo14157e3)) {
                        while (jM14172j < j11) {
                            j10 = jM14172j + 1;
                            abstractC12206x1 = AbstractC12209y1.f37124c;
                            bMo14157e = abstractC12206x1.mo14157e(jM14172j);
                            if (AbstractC12153g.m13966b(bMo14157e)) {
                                i12 = i13 + 1;
                                cArr[i13] = (char) bMo14157e;
                                while (j10 < j11) {
                                    bMo14157e2 = AbstractC12209y1.f37124c.mo14157e(j10);
                                    if (AbstractC12153g.m13966b(bMo14157e2)) {
                                        j10++;
                                        cArr[i12] = (char) bMo14157e2;
                                        i12++;
                                    } else {
                                        i13 = i12;
                                        jM14172j = j10;
                                    }
                                }
                                i13 = i12;
                                jM14172j = j10;
                            } else {
                                if (bMo14157e < -32) {
                                    z6 = z11;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    if (bMo14157e < -16) {
                                        z10 = z11;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        if (j10 < j11 - 1) {
                                            throw C12181p0.m14061b();
                                        }
                                        long j12 = jM14172j + 2;
                                        jM14172j += 3;
                                        AbstractC12153g.m13968d(bMo14157e, abstractC12206x1.mo14157e(j10), abstractC12206x1.mo14157e(j12), cArr, i13);
                                        i13++;
                                    } else {
                                        if (j10 < j11 - 2) {
                                            throw C12181p0.m14061b();
                                        }
                                        byte bMo14157e4 = abstractC12206x1.mo14157e(j10);
                                        long j13 = jM14172j + 3;
                                        byte bMo14157e5 = abstractC12206x1.mo14157e(jM14172j + 2);
                                        jM14172j += 4;
                                        AbstractC12153g.m13965a(bMo14157e, bMo14157e4, bMo14157e5, abstractC12206x1.mo14157e(j13), cArr, i13);
                                        i13 += 2;
                                    }
                                } else {
                                    if (j10 < j11) {
                                        throw C12181p0.m14061b();
                                    }
                                    jM14172j += 2;
                                    AbstractC12153g.m13967c(bMo14157e, abstractC12206x1.mo14157e(j10), cArr, i13);
                                    i13++;
                                }
                            }
                            z11 = true;
                        }
                        return new String(cArr, 0, i13);
                    }
                    jM14172j++;
                    cArr[i13] = (char) bMo14157e3;
                    i13++;
                }
                while (jM14172j < j11) {
                    j10 = jM14172j + 1;
                    abstractC12206x1 = AbstractC12209y1.f37124c;
                    bMo14157e = abstractC12206x1.mo14157e(jM14172j);
                    if (AbstractC12153g.m13966b(bMo14157e)) {
                        i12 = i13 + 1;
                        cArr[i13] = (char) bMo14157e;
                        while (j10 < j11) {
                            bMo14157e2 = AbstractC12209y1.f37124c.mo14157e(j10);
                            if (AbstractC12153g.m13966b(bMo14157e2)) {
                                i13 = i12;
                                jM14172j = j10;
                            } else {
                                j10++;
                                cArr[i12] = (char) bMo14157e2;
                                i12++;
                            }
                        }
                        i13 = i12;
                        jM14172j = j10;
                    } else {
                        if (bMo14157e < -32) {
                            z6 = z11;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            if (bMo14157e < -16) {
                                z10 = z11;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (j10 < j11 - 1) {
                                    throw C12181p0.m14061b();
                                }
                                long j14 = jM14172j + 2;
                                jM14172j += 3;
                                AbstractC12153g.m13968d(bMo14157e, abstractC12206x1.mo14157e(j10), abstractC12206x1.mo14157e(j14), cArr, i13);
                                i13++;
                            } else {
                                if (j10 < j11 - 2) {
                                    throw C12181p0.m14061b();
                                }
                                byte bMo14157e6 = abstractC12206x1.mo14157e(j10);
                                long j15 = jM14172j + 3;
                                byte bMo14157e7 = abstractC12206x1.mo14157e(jM14172j + 2);
                                jM14172j += 4;
                                AbstractC12153g.m13965a(bMo14157e, bMo14157e6, bMo14157e7, abstractC12206x1.mo14157e(j15), cArr, i13);
                                i13 += 2;
                            }
                        } else {
                            if (j10 < j11) {
                                throw C12181p0.m14061b();
                            }
                            jM14172j += 2;
                            AbstractC12153g.m13967c(bMo14157e, abstractC12206x1.mo14157e(j10), cArr, i13);
                            i13++;
                        }
                    }
                    z11 = true;
                }
                return new String(cArr, 0, i13);
        }
    }

    @Override // com.google.protobuf.AbstractC12153g
    /* JADX INFO: renamed from: S */
    public final int mo13993S(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        long j10;
        String str2;
        String str3;
        int i14;
        char cCharAt2;
        switch (this.f37132c) {
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
                                    throw new C12074A1(i16, length);
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
                            throw new C12074A1(i16 - 1, length);
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
                        AbstractC12209y1.m14192o(bArr, j11, (byte) cCharAt2);
                        i22++;
                        j11 = 1 + j11;
                    }
                }
                if (i22 != length2) {
                    while (i22 < length2) {
                        char cCharAt5 = str.charAt(i22);
                        if (cCharAt5 < 128 && j11 < j12) {
                            AbstractC12209y1.m14192o(bArr, j11, (byte) cCharAt5);
                            str3 = str5;
                            j11 += j10;
                            str2 = str4;
                        } else if (cCharAt5 >= 2048 || j11 > j12 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j11 > j12 - 3) {
                                if (j11 > j12 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i14)))) {
                                        throw new C12074A1(i22, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + cCharAt5 + str2 + j11);
                                }
                                int i23 = i22 + 1;
                                if (i23 != length2) {
                                    char cCharAt6 = str.charAt(i23);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        AbstractC12209y1.m14192o(bArr, j11, (byte) ((codePoint2 >>> 18) | 240));
                                        AbstractC12209y1.m14192o(bArr, j11 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j13 = 3 + j11;
                                        AbstractC12209y1.m14192o(bArr, j11 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j11 += 4;
                                        AbstractC12209y1.m14192o(bArr, j13, (byte) ((codePoint2 & 63) | 128));
                                        i22 = i23;
                                    } else {
                                        i22 = i23;
                                    }
                                }
                                throw new C12074A1(i22 - 1, length2);
                            }
                            AbstractC12209y1.m14192o(bArr, j11, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j14 = j11 + 2;
                            AbstractC12209y1.m14192o(bArr, j11 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j11 += 3;
                            AbstractC12209y1.m14192o(bArr, j14, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j15 = j11 + j10;
                            AbstractC12209y1.m14192o(bArr, j11, (byte) ((cCharAt5 >>> 6) | 960));
                            j11 += 2;
                            AbstractC12209y1.m14192o(bArr, j15, (byte) ((cCharAt5 & '?') | 128));
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

    /* JADX WARN: Code duplicated, block: B:134:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e1  */
    @Override // com.google.protobuf.AbstractC12153g
    /* JADX INFO: renamed from: X */
    public final int mo13994X(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte bM14184g;
        long j10;
        byte bM14184g2;
        byte b;
        long j11;
        int i14 = i10;
        int i15 = -1;
        int i16 = 2;
        switch (this.f37132c) {
            case 0:
                int i17 = 0;
                while (i14 < i11 && bArr[i14] >= 0) {
                    i14++;
                }
                if (i14 < i11) {
                    while (i14 < i11) {
                        int i18 = i14 + 1;
                        byte b10 = bArr[i14];
                        if (b10 < 0) {
                            if (b10 < -32) {
                                if (i18 >= i11) {
                                    return b10;
                                }
                                if (b10 >= -62) {
                                    i14 += 2;
                                    if (bArr[i18] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b10 < -16) {
                                if (i18 >= i11 - 1) {
                                    return AbstractC12077B1.m13720a(bArr, i18, i11);
                                }
                                int i19 = i14 + 2;
                                byte b11 = bArr[i18];
                                if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                                    i14 += 3;
                                    if (bArr[i19] > -65) {
                                    }
                                }
                            } else {
                                if (i18 >= i11 - 2) {
                                    return AbstractC12077B1.m13720a(bArr, i18, i11);
                                }
                                int i20 = i14 + 2;
                                byte b12 = bArr[i18];
                                if (b12 <= -65 && (((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                                    int i21 = i14 + 3;
                                    if (bArr[i20] <= -65) {
                                        i14 += 4;
                                        if (bArr[i21] > -65) {
                                        }
                                    }
                                }
                            }
                            return -1;
                            i17 = 0;
                        } else {
                            i14 = i18;
                        }
                    }
                }
                return i17;
            default:
                if (((bArr.length - i11) | i14 | i11) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                long j12 = i14;
                int i22 = (int) (((long) i11) - j12);
                if (i22 < 16) {
                    i12 = 0;
                } else {
                    int i23 = 8 - (((int) j12) & 7);
                    long j13 = j12;
                    i12 = 0;
                    while (true) {
                        if (i12 < i23) {
                            long j14 = j13 + 1;
                            if (AbstractC12209y1.m14184g(j13, bArr) >= 0) {
                                i12++;
                                j13 = j14;
                            }
                        } else {
                            while (true) {
                                int i24 = i12 + 8;
                                if (i24 <= i22 && (AbstractC12209y1.f37124c.m14172j(AbstractC12209y1.f37127f + j13, bArr) & (-9187201950435737472L)) == 0) {
                                    j13 += 8;
                                    i12 = i24;
                                }
                            }
                            while (true) {
                                if (i12 < i22) {
                                    long j15 = j13 + 1;
                                    if (AbstractC12209y1.m14184g(j13, bArr) >= 0) {
                                        i12++;
                                        j13 = j15;
                                    }
                                } else {
                                    i12 = i22;
                                }
                            }
                        }
                    }
                }
                int i25 = i22 - i12;
                long j16 = j12 + ((long) i12);
                while (true) {
                    byte bM14184g3 = 0;
                    while (i25 > 0) {
                        long j17 = j16 + 1;
                        bM14184g3 = AbstractC12209y1.m14184g(j16, bArr);
                        if (bM14184g3 >= 0) {
                            i25 += i15;
                            j16 = j17;
                        } else {
                            j16 = j17;
                            if (i25 == 0) {
                                return 0;
                            }
                            i13 = i25 - 1;
                            if (bM14184g3 < -32) {
                                if (i13 == 0) {
                                    return bM14184g3;
                                }
                                i25 -= 2;
                                if (bM14184g3 >= -62) {
                                    j11 = j16 + 1;
                                    if (AbstractC12209y1.m14184g(j16, bArr) > -65) {
                                        j16 = j11;
                                    }
                                }
                                return i15;
                            }
                            if (bM14184g3 < -16) {
                                if (i13 < 3) {
                                    return m14217b0(j16, bArr, bM14184g3, i13);
                                }
                                i25 -= 4;
                                long j18 = j16 + 1;
                                bM14184g = AbstractC12209y1.m14184g(j16, bArr);
                                if (bM14184g > -65 && (((bM14184g + 112) + (bM14184g3 << 28)) >> 30) == 0) {
                                    long j19 = 2 + j16;
                                    if (AbstractC12209y1.m14184g(j18, bArr) <= -65) {
                                        j16 += 3;
                                        if (AbstractC12209y1.m14184g(j19, bArr) > -65) {
                                        }
                                    }
                                }
                                return -1;
                            }
                            if (i13 < i16) {
                                return m14217b0(j16, bArr, bM14184g3, i13);
                            }
                            i25 -= 3;
                            j10 = j16 + 1;
                            bM14184g2 = AbstractC12209y1.m14184g(j16, bArr);
                            if (bM14184g2 > -65) {
                                if (bM14184g3 == -32) {
                                    b = -96;
                                    if (bM14184g2 >= -96) {
                                    }
                                } else {
                                    b = -96;
                                }
                                if (bM14184g3 == -19 || bM14184g2 < b) {
                                    j16 += 2;
                                    if (AbstractC12209y1.m14184g(j10, bArr) > -65) {
                                    }
                                }
                            }
                            return -1;
                            i15 = -1;
                            i16 = 2;
                        }
                    }
                    if (i25 == 0) {
                        return 0;
                    }
                    i13 = i25 - 1;
                    if (bM14184g3 < -32) {
                        if (i13 == 0) {
                            return bM14184g3;
                        }
                        i25 -= 2;
                        if (bM14184g3 >= -62) {
                            j11 = j16 + 1;
                            if (AbstractC12209y1.m14184g(j16, bArr) > -65) {
                                j16 = j11;
                            }
                        }
                        return i15;
                    }
                    if (bM14184g3 < -16) {
                        if (i13 < 3) {
                            return m14217b0(j16, bArr, bM14184g3, i13);
                        }
                        i25 -= 4;
                        long j110 = j16 + 1;
                        bM14184g = AbstractC12209y1.m14184g(j16, bArr);
                        if (bM14184g > -65) {
                        }
                        return -1;
                    }
                    if (i13 < i16) {
                        return m14217b0(j16, bArr, bM14184g3, i13);
                    }
                    i25 -= 3;
                    j10 = j16 + 1;
                    bM14184g2 = AbstractC12209y1.m14184g(j16, bArr);
                    if (bM14184g2 > -65) {
                        if (bM14184g3 == -32) {
                            b = -96;
                            if (bM14184g2 >= -96) {
                            }
                        } else {
                            b = -96;
                        }
                        if (bM14184g3 == -19) {
                            j16 += 2;
                            if (AbstractC12209y1.m14184g(j10, bArr) > -65) {
                            }
                        } else {
                            j16 += 2;
                            if (AbstractC12209y1.m14184g(j10, bArr) > -65) {
                            }
                        }
                    }
                    return -1;
                    i15 = -1;
                    i16 = 2;
                }
                break;
        }
    }
}
