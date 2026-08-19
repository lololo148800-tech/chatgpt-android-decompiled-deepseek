package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10984s0 extends AbstractC10937P {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f33097c;

    /* JADX INFO: renamed from: n */
    public static int m11714n(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            AbstractC10937P abstractC10937P = AbstractC10988u0.f33098a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return AbstractC10988u0.m11721c(i10, AbstractC10982r0.m11697f(j10, bArr));
        }
        if (i11 == 2) {
            return AbstractC10988u0.m11722d(i10, AbstractC10982r0.m11697f(j10, bArr), AbstractC10982r0.m11697f(j10 + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e A[LOOP:2: B:17:0x0050->B:21:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x0129  */
    /* JADX WARN: Code duplicated, block: B:60:0x0132 A[LOOP:5: B:56:0x0127->B:60:0x0132, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0147  */
    /* JADX WARN: Code duplicated, block: B:72:0x0162  */
    /* JADX WARN: Code duplicated, block: B:77:0x017d  */
    /* JADX WARN: Code duplicated, block: B:86:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0141 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC10937P
    /* JADX INFO: renamed from: f */
    public final String mo11470f(byte[] bArr, int i10, int i11) throws C10997z {
        int i12;
        byte b;
        int i13;
        byte b10;
        int i14;
        int i15;
        byte bM11697f;
        int i16;
        byte bM11697f2;
        byte b11 = -16;
        byte b12 = -32;
        switch (this.f33097c) {
            case 0:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                int i17 = i10 + i11;
                char[] cArr = new char[i11];
                int i18 = i10;
                int i19 = 0;
                while (i18 < i17) {
                    byte b13 = bArr[i18];
                    if (!AbstractC10937P.m11462b(b13)) {
                        while (i18 < i17) {
                            i12 = i18 + 1;
                            b = bArr[i18];
                            if (AbstractC10937P.m11462b(b)) {
                                i13 = i19 + 1;
                                cArr[i19] = (char) b;
                                while (i12 < i17) {
                                    b10 = bArr[i12];
                                    if (AbstractC10937P.m11462b(b10)) {
                                        i12++;
                                        cArr[i13] = (char) b10;
                                        i13++;
                                    } else {
                                        i19 = i13;
                                        i18 = i12;
                                    }
                                }
                                i19 = i13;
                                i18 = i12;
                            } else if (b < -32) {
                                if (i12 < i17) {
                                    throw C10997z.m11726a();
                                }
                                i18 += 2;
                                AbstractC10937P.m11463c(b, bArr[i12], cArr, i19);
                                i19++;
                            } else if (b < -16) {
                                if (i12 < i17 - 1) {
                                    throw C10997z.m11726a();
                                }
                                int i20 = i18 + 2;
                                i18 += 3;
                                AbstractC10937P.m11464d(b, bArr[i12], bArr[i20], cArr, i19);
                                i19++;
                            } else {
                                if (i12 < i17 - 2) {
                                    throw C10997z.m11726a();
                                }
                                byte b14 = bArr[i12];
                                int i21 = i18 + 3;
                                byte b15 = bArr[i18 + 2];
                                i18 += 4;
                                AbstractC10937P.m11461a(b, b14, b15, bArr[i21], cArr, i19);
                                i19 += 2;
                            }
                        }
                        return new String(cArr, 0, i19);
                    }
                    i18++;
                    cArr[i19] = (char) b13;
                    i19++;
                }
                while (i18 < i17) {
                    i12 = i18 + 1;
                    b = bArr[i18];
                    if (AbstractC10937P.m11462b(b)) {
                        i13 = i19 + 1;
                        cArr[i19] = (char) b;
                        while (i12 < i17) {
                            b10 = bArr[i12];
                            if (AbstractC10937P.m11462b(b10)) {
                                i19 = i13;
                                i18 = i12;
                            } else {
                                i12++;
                                cArr[i13] = (char) b10;
                                i13++;
                            }
                        }
                        i19 = i13;
                        i18 = i12;
                    } else if (b < -32) {
                        if (i12 < i17) {
                            throw C10997z.m11726a();
                        }
                        i18 += 2;
                        AbstractC10937P.m11463c(b, bArr[i12], cArr, i19);
                        i19++;
                    } else if (b < -16) {
                        if (i12 < i17 - 1) {
                            throw C10997z.m11726a();
                        }
                        int i22 = i18 + 2;
                        i18 += 3;
                        AbstractC10937P.m11464d(b, bArr[i12], bArr[i22], cArr, i19);
                        i19++;
                    } else {
                        if (i12 < i17 - 2) {
                            throw C10997z.m11726a();
                        }
                        byte b16 = bArr[i12];
                        int i23 = i18 + 3;
                        byte b17 = bArr[i18 + 2];
                        i18 += 4;
                        AbstractC10937P.m11461a(b, b16, b17, bArr[i23], cArr, i19);
                        i19 += 2;
                    }
                }
                return new String(cArr, 0, i19);
            default:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                int i24 = i10 + i11;
                char[] cArr2 = new char[i11];
                int i25 = i10;
                int i26 = 0;
                while (i25 < i24) {
                    byte bM11697f3 = AbstractC10982r0.m11697f(i25, bArr);
                    if (!AbstractC10937P.m11462b(bM11697f3)) {
                        i14 = i26;
                        while (i25 < i24) {
                            i15 = i25 + 1;
                            bM11697f = AbstractC10982r0.m11697f(i25, bArr);
                            if (AbstractC10937P.m11462b(bM11697f)) {
                                i16 = i14 + 1;
                                cArr2[i14] = (char) bM11697f;
                                while (i15 < i24) {
                                    bM11697f2 = AbstractC10982r0.m11697f(i15, bArr);
                                    if (AbstractC10937P.m11462b(bM11697f2)) {
                                        i15++;
                                        cArr2[i16] = (char) bM11697f2;
                                        i16++;
                                    } else {
                                        i14 = i16;
                                        i25 = i15;
                                    }
                                }
                                i14 = i16;
                                i25 = i15;
                            } else if (bM11697f < b12) {
                                if (i15 < i24) {
                                    throw C10997z.m11726a();
                                }
                                i25 += 2;
                                AbstractC10937P.m11463c(bM11697f, AbstractC10982r0.m11697f(i15, bArr), cArr2, i14);
                                i14++;
                            } else if (bM11697f < b11) {
                                if (i15 < i24 - 1) {
                                    throw C10997z.m11726a();
                                }
                                int i27 = i25 + 2;
                                i25 += 3;
                                AbstractC10937P.m11464d(bM11697f, AbstractC10982r0.m11697f(i15, bArr), AbstractC10982r0.m11697f(i27, bArr), cArr2, i14);
                                i14++;
                            } else {
                                if (i15 < i24 - 2) {
                                    throw C10997z.m11726a();
                                }
                                AbstractC10937P.m11461a(bM11697f, AbstractC10982r0.m11697f(i15, bArr), AbstractC10982r0.m11697f(i25 + 2, bArr), AbstractC10982r0.m11697f(i25 + 3, bArr), cArr2, i14);
                                i14 += 2;
                                i25 += 4;
                            }
                            b11 = -16;
                            b12 = -32;
                        }
                        return new String(cArr2, 0, i14);
                    }
                    i25++;
                    cArr2[i26] = (char) bM11697f3;
                    i26++;
                }
                i14 = i26;
                while (i25 < i24) {
                    i15 = i25 + 1;
                    bM11697f = AbstractC10982r0.m11697f(i25, bArr);
                    if (AbstractC10937P.m11462b(bM11697f)) {
                        i16 = i14 + 1;
                        cArr2[i14] = (char) bM11697f;
                        while (i15 < i24) {
                            bM11697f2 = AbstractC10982r0.m11697f(i15, bArr);
                            if (AbstractC10937P.m11462b(bM11697f2)) {
                                i14 = i16;
                                i25 = i15;
                            } else {
                                i15++;
                                cArr2[i16] = (char) bM11697f2;
                                i16++;
                            }
                        }
                        i14 = i16;
                        i25 = i15;
                    } else if (bM11697f < b12) {
                        if (i15 < i24) {
                            throw C10997z.m11726a();
                        }
                        i25 += 2;
                        AbstractC10937P.m11463c(bM11697f, AbstractC10982r0.m11697f(i15, bArr), cArr2, i14);
                        i14++;
                    } else if (bM11697f < b11) {
                        if (i15 < i24 - 1) {
                            throw C10997z.m11726a();
                        }
                        int i28 = i25 + 2;
                        i25 += 3;
                        AbstractC10937P.m11464d(bM11697f, AbstractC10982r0.m11697f(i15, bArr), AbstractC10982r0.m11697f(i28, bArr), cArr2, i14);
                        i14++;
                    } else {
                        if (i15 < i24 - 2) {
                            throw C10997z.m11726a();
                        }
                        AbstractC10937P.m11461a(bM11697f, AbstractC10982r0.m11697f(i15, bArr), AbstractC10982r0.m11697f(i25 + 2, bArr), AbstractC10982r0.m11697f(i25 + 3, bArr), cArr2, i14);
                        i14 += 2;
                        i25 += 4;
                    }
                    b11 = -16;
                    b12 = -32;
                }
                return new String(cArr2, 0, i14);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10937P
    /* JADX INFO: renamed from: g */
    public final int mo11471g(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        long j10;
        String str2;
        String str3;
        int i14;
        char cCharAt2;
        switch (this.f33097c) {
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
                                    throw new C10986t0(i16, length);
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
                            throw new C10986t0(i16 - 1, length);
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
                        AbstractC10982r0.m11704m(bArr, j11, (byte) cCharAt2);
                        i22++;
                        j11 = 1 + j11;
                    }
                }
                if (i22 != length2) {
                    while (i22 < length2) {
                        char cCharAt5 = str.charAt(i22);
                        if (cCharAt5 < 128 && j11 < j12) {
                            AbstractC10982r0.m11704m(bArr, j11, (byte) cCharAt5);
                            str3 = str5;
                            j11 += j10;
                            str2 = str4;
                        } else if (cCharAt5 >= 2048 || j11 > j12 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j11 > j12 - 3) {
                                if (j11 > j12 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i14)))) {
                                        throw new C10986t0(i22, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + cCharAt5 + str2 + j11);
                                }
                                int i23 = i22 + 1;
                                if (i23 != length2) {
                                    char cCharAt6 = str.charAt(i23);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        AbstractC10982r0.m11704m(bArr, j11, (byte) ((codePoint2 >>> 18) | 240));
                                        AbstractC10982r0.m11704m(bArr, j11 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j13 = 3 + j11;
                                        AbstractC10982r0.m11704m(bArr, j11 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j11 += 4;
                                        AbstractC10982r0.m11704m(bArr, j13, (byte) ((codePoint2 & 63) | 128));
                                        i22 = i23;
                                    } else {
                                        i22 = i23;
                                    }
                                }
                                throw new C10986t0(i22 - 1, length2);
                            }
                            AbstractC10982r0.m11704m(bArr, j11, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j14 = j11 + 2;
                            AbstractC10982r0.m11704m(bArr, j11 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j11 += 3;
                            AbstractC10982r0.m11704m(bArr, j14, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j15 = j11 + j10;
                            AbstractC10982r0.m11704m(bArr, j11, (byte) ((cCharAt5 >>> 6) | 960));
                            j11 += 2;
                            AbstractC10982r0.m11704m(bArr, j15, (byte) ((cCharAt5 & '?') | 128));
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

    /* JADX WARN: Code duplicated, block: B:123:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    @Override // androidx.datastore.preferences.protobuf.AbstractC10937P
    /* JADX INFO: renamed from: j */
    public final int mo11472j(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte bM11697f;
        byte bM11697f2;
        long j10;
        int i14 = i10;
        byte b = -16;
        byte b10 = -62;
        int i15 = -1;
        switch (this.f33097c) {
            case 0:
                while (i14 < i11 && bArr[i14] >= 0) {
                    i14++;
                }
                if (i14 < i11) {
                    while (i14 < i11) {
                        int i16 = i14 + 1;
                        byte b11 = bArr[i14];
                        if (b11 < 0) {
                            if (b11 < -32) {
                                if (i16 >= i11) {
                                    return b11;
                                }
                                if (b11 >= -62) {
                                    i14 += 2;
                                    if (bArr[i16] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b11 >= -16) {
                                if (i16 >= i11 - 2) {
                                    return AbstractC10988u0.m11719a(bArr, i16, i11);
                                }
                                int i17 = i14 + 2;
                                byte b12 = bArr[i16];
                                if (b12 <= -65 && (((b12 + 112) + (b11 << 28)) >> 30) == 0) {
                                    int i18 = i14 + 3;
                                    if (bArr[i17] <= -65) {
                                        i14 += 4;
                                        if (bArr[i18] > -65) {
                                        }
                                    }
                                }
                                return -1;
                            }
                            if (i16 >= i11 - 1) {
                                return AbstractC10988u0.m11719a(bArr, i16, i11);
                            }
                            int i19 = i14 + 2;
                            byte b13 = bArr[i16];
                            if (b13 <= -65 && ((b11 != -32 || b13 >= -96) && (b11 != -19 || b13 < -96))) {
                                i14 += 3;
                                if (bArr[i19] > -65) {
                                }
                            }
                            return -1;
                        }
                        i14 = i16;
                    }
                }
                return 0;
            default:
                if (((bArr.length - i11) | i14 | i11) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                long j11 = i14;
                int i20 = (int) (((long) i11) - j11);
                if (i20 < 16) {
                    i12 = 0;
                } else {
                    long j12 = j11;
                    i12 = 0;
                    while (true) {
                        if (i12 < i20) {
                            long j13 = j12 + 1;
                            if (AbstractC10982r0.m11697f(j12, bArr) >= 0) {
                                i12++;
                                j12 = j13;
                            }
                        } else {
                            i12 = i20;
                        }
                    }
                }
                int i21 = i20 - i12;
                long j14 = j11 + ((long) i12);
                while (true) {
                    byte bM11697f3 = 0;
                    while (i21 > 0) {
                        long j15 = j14 + 1;
                        bM11697f3 = AbstractC10982r0.m11697f(j14, bArr);
                        if (bM11697f3 >= 0) {
                            i21 += i15;
                            j14 = j15;
                        } else {
                            j14 = j15;
                            if (i21 == 0) {
                                return 0;
                            }
                            i13 = i21 - 1;
                            if (bM11697f3 < -32) {
                                if (i13 == 0) {
                                    return bM11697f3;
                                }
                                i21 -= 2;
                                if (bM11697f3 >= b10) {
                                    j10 = j14 + 1;
                                    if (AbstractC10982r0.m11697f(j14, bArr) > -65) {
                                        j14 = j10;
                                    }
                                }
                                return i15;
                            }
                            if (bM11697f3 < b) {
                                if (i13 < 2) {
                                    return m11714n(j14, bArr, bM11697f3, i13);
                                }
                                i21 -= 3;
                                long j16 = j14 + 1;
                                bM11697f2 = AbstractC10982r0.m11697f(j14, bArr);
                                if (bM11697f2 > -65 && ((bM11697f3 != -32 || bM11697f2 >= -96) && (bM11697f3 != -19 || bM11697f2 < -96))) {
                                    j14 += 2;
                                    if (AbstractC10982r0.m11697f(j16, bArr) > -65) {
                                    }
                                }
                            } else {
                                if (i13 < 3) {
                                    return m11714n(j14, bArr, bM11697f3, i13);
                                }
                                i21 -= 4;
                                long j17 = j14 + 1;
                                bM11697f = AbstractC10982r0.m11697f(j14, bArr);
                                if (bM11697f > -65 && (((bM11697f + 112) + (bM11697f3 << 28)) >> 30) == 0) {
                                    long j18 = j14 + 2;
                                    if (AbstractC10982r0.m11697f(j17, bArr) <= -65) {
                                        j14 += 3;
                                        if (AbstractC10982r0.m11697f(j18, bArr) > -65) {
                                        }
                                    }
                                }
                            }
                            b = -16;
                            b10 = -62;
                            i15 = -1;
                        }
                    }
                    if (i21 == 0) {
                        return 0;
                    }
                    i13 = i21 - 1;
                    if (bM11697f3 < -32) {
                        if (i13 == 0) {
                            return bM11697f3;
                        }
                        i21 -= 2;
                        if (bM11697f3 >= b10) {
                            j10 = j14 + 1;
                            if (AbstractC10982r0.m11697f(j14, bArr) > -65) {
                                j14 = j10;
                            }
                        }
                        return i15;
                    }
                    if (bM11697f3 < b) {
                        if (i13 < 2) {
                            return m11714n(j14, bArr, bM11697f3, i13);
                        }
                        i21 -= 3;
                        long j19 = j14 + 1;
                        bM11697f2 = AbstractC10982r0.m11697f(j14, bArr);
                        if (bM11697f2 > -65) {
                        }
                    } else {
                        if (i13 < 3) {
                            return m11714n(j14, bArr, bM11697f3, i13);
                        }
                        i21 -= 4;
                        long j110 = j14 + 1;
                        bM11697f = AbstractC10982r0.m11697f(j14, bArr);
                        if (bM11697f > -65) {
                        }
                    }
                    b = -16;
                    b10 = -62;
                    i15 = -1;
                }
                return -1;
        }
    }
}
