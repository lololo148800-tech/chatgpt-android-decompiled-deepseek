package p1134ym;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.C21307a;
import p523V9.AbstractC7966P5;
import p571X9.AbstractC9381v3;

/* JADX INFO: renamed from: ym.c */
/* JADX INFO: loaded from: classes3.dex */
public class C21552c {

    /* JADX INFO: renamed from: c */
    public static final C21550a f68250c;

    /* JADX INFO: renamed from: d */
    public static final byte[] f68251d;

    /* JADX INFO: renamed from: e */
    public static final C21552c f68252e;

    /* JADX INFO: renamed from: f */
    public static final C21552c f68253f;

    /* JADX INFO: renamed from: a */
    public final boolean f68254a;

    /* JADX INFO: renamed from: b */
    public final boolean f68255b;

    static {
        EnumC21551b[] enumC21551bArr = EnumC21551b.f68249Y;
        f68250c = new C21550a(false, false);
        f68251d = new byte[]{13, 10};
        f68252e = new C21552c(true, false);
        f68253f = new C21552c(false, true);
    }

    public C21552c(boolean z6, boolean z10) {
        EnumC21551b[] enumC21551bArr = EnumC21551b.f68249Y;
        this.f68254a = z6;
        this.f68255b = z10;
        if (z6 && z10) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0101 A[EDGE_INSN: B:115:0x0101->B:53:0x0101 BREAK  A[LOOP:2: B:54:0x0103->B:58:0x0111], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0103 A[ADDED_TO_REGION, LOOP:2: B:54:0x0103->B:58:0x0111, LOOP_START, PHI: r14
      0x0103: PHI (r14v13 int) = (r14v12 int), (r14v14 int) binds: [B:52:0x00ff, B:58:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x0111 A[LOOP:2: B:54:0x0103->B:58:0x0111, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0133  */
    /* JADX WARN: Code duplicated, block: B:69:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0144  */
    /* JADX WARN: Code duplicated, block: B:74:0x0179  */
    /* JADX WARN: Code duplicated, block: B:76:0x0186  */
    /* JADX WARN: Code duplicated, block: B:77:0x019c  */
    /* JADX INFO: renamed from: a */
    public static byte[] m21829a(C21552c c21552c, String source) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int length = source.length();
        c21552c.getClass();
        AbstractC16544l.m18094g(source, "source");
        int i19 = 0;
        AbstractC9381v3.m9953a(0, length, source.length());
        String strSubstring = source.substring(0, length);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(C21307a.f67721b);
        AbstractC16544l.m18093f(bytes, "getBytes(...)");
        int length2 = bytes.length;
        AbstractC9381v3.m9953a(0, length2, bytes.length);
        boolean z6 = c21552c.f68255b;
        if (length2 == 0) {
            i11 = 0;
        } else {
            if (length2 == 1) {
                throw new IllegalArgumentException(AbstractC10763a.m11048f(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
            }
            if (z6) {
                i10 = length2;
                for (int i20 = 0; i20 < length2; i20++) {
                    int i21 = AbstractC21553d.f68257b[bytes[i20] & 255];
                    if (i21 < 0) {
                        if (i21 == -2) {
                            i10 -= length2 - i20;
                            break;
                        }
                        i10--;
                    }
                }
            } else if (bytes[length2 - 1] == 61) {
                i10 = length2 - 1;
                if (bytes[length2 - 2] == 61) {
                    i10 = length2 - 2;
                }
            } else {
                i10 = length2;
            }
            i11 = (int) ((((long) i10) * ((long) 6)) / ((long) 8));
        }
        byte[] bArr = new byte[i11];
        int[] iArr = c21552c.f68254a ? AbstractC21553d.f68259d : AbstractC21553d.f68257b;
        int i22 = -8;
        int i23 = 0;
        int i24 = 0;
        int i25 = -8;
        while (true) {
            if (i23 >= length2) {
                i12 = -2;
                i13 = 0;
                break;
            }
            if (i25 != i22 || (i18 = i23 + 3) >= length2) {
                i14 = bytes[i23] & 255;
                i15 = iArr[i14];
                if (i15 < 0) {
                    i23++;
                    i24 = (i24 << 6) | i15;
                    i16 = i25 + 6;
                    if (i16 >= 0) {
                        bArr[i19] = (byte) (i24 >>> i16);
                        i24 &= (1 << i16) - 1;
                        i25 -= 2;
                        i19++;
                    } else {
                        i25 = i16;
                    }
                } else {
                    if (i15 == -2) {
                        if (i25 != -8) {
                            throw new IllegalArgumentException(AbstractC10763a.m11048f(i23, "Redundant pad character at index "));
                        }
                        if (i25 != -6) {
                            if (i25 != -4) {
                                EnumC21551b[] enumC21551bArr = EnumC21551b.f68249Y;
                                i23++;
                                if (z6) {
                                    while (i23 < length2) {
                                        if (AbstractC21553d.f68257b[bytes[i23] & 255] != -1) {
                                            break;
                                        }
                                        i23++;
                                    }
                                }
                                i17 = 1;
                                if (i23 != length2 || bytes[i23] != 61) {
                                    throw new IllegalArgumentException(AbstractC10763a.m11048f(i23, "Missing one pad character at index "));
                                }
                            } else {
                                if (i25 == -2) {
                                    throw new IllegalStateException("Unreachable");
                                }
                                i23++;
                                i17 = 1;
                            }
                            i13 = i17;
                            i12 = -2;
                            break;
                        }
                        i17 = 1;
                        EnumC21551b[] enumC21551bArr2 = EnumC21551b.f68249Y;
                        i23 += i17;
                        i13 = i17;
                        i12 = -2;
                        break;
                    }
                    if (z6) {
                        StringBuilder sb2 = new StringBuilder("Invalid symbol '");
                        sb2.append((char) i14);
                        sb2.append("'(");
                        AbstractC7966P5.m8254b(8);
                        String string = Integer.toString(i14, 8);
                        AbstractC16544l.m18093f(string, "toString(...)");
                        sb2.append(string);
                        sb2.append(") at index ");
                        sb2.append(i23);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    i23++;
                }
            } else {
                int i26 = i23 + 4;
                int i27 = (iArr[bytes[i23] & 255] << 18) | (iArr[bytes[i23 + 1] & 255] << 12) | (iArr[bytes[i23 + 2] & 255] << 6) | iArr[bytes[i18] & 255];
                if (i27 >= 0) {
                    bArr[i19] = (byte) (i27 >> 16);
                    int i28 = i19 + 2;
                    bArr[i19 + 1] = (byte) (i27 >> 8);
                    i19 += 3;
                    bArr[i28] = (byte) i27;
                    i23 = i26;
                } else {
                    i14 = bytes[i23] & 255;
                    i15 = iArr[i14];
                    if (i15 < 0) {
                        i23++;
                        i24 = (i24 << 6) | i15;
                        i16 = i25 + 6;
                        if (i16 >= 0) {
                            bArr[i19] = (byte) (i24 >>> i16);
                            i24 &= (1 << i16) - 1;
                            i25 -= 2;
                            i19++;
                        } else {
                            i25 = i16;
                        }
                    } else {
                        if (i15 == -2) {
                            if (i25 != -8) {
                                throw new IllegalArgumentException(AbstractC10763a.m11048f(i23, "Redundant pad character at index "));
                            }
                            if (i25 != -6) {
                                if (i25 != -4) {
                                    EnumC21551b[] enumC21551bArr3 = EnumC21551b.f68249Y;
                                    i23++;
                                    if (z6) {
                                        while (i23 < length2) {
                                            if (AbstractC21553d.f68257b[bytes[i23] & 255] != -1) {
                                                break;
                                                break;
                                            }
                                            i23++;
                                        }
                                    }
                                    i17 = 1;
                                    if (i23 != length2) {
                                    }
                                    throw new IllegalArgumentException(AbstractC10763a.m11048f(i23, "Missing one pad character at index "));
                                }
                                if (i25 == -2) {
                                    throw new IllegalStateException("Unreachable");
                                }
                                i23++;
                                i17 = 1;
                                i13 = i17;
                                i12 = -2;
                                break;
                            }
                            i17 = 1;
                            EnumC21551b[] enumC21551bArr4 = EnumC21551b.f68249Y;
                            i23 += i17;
                            i13 = i17;
                            i12 = -2;
                            break;
                        }
                        if (z6) {
                            StringBuilder sb3 = new StringBuilder("Invalid symbol '");
                            sb3.append((char) i14);
                            sb3.append("'(");
                            AbstractC7966P5.m8254b(8);
                            String string2 = Integer.toString(i14, 8);
                            AbstractC16544l.m18093f(string2, "toString(...)");
                            sb3.append(string2);
                            sb3.append(") at index ");
                            sb3.append(i23);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        i23++;
                    }
                }
            }
            i22 = -8;
        }
        if (i25 == i12) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i25 != -8 && i13 == 0) {
            EnumC21551b[] enumC21551bArr5 = EnumC21551b.f68249Y;
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i24 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        if (z6) {
            while (i23 < length2) {
                if (AbstractC21553d.f68257b[bytes[i23] & 255] != -1) {
                    break;
                }
                i23++;
            }
        }
        if (i23 >= length2) {
            if (i19 == i11) {
                return bArr;
            }
            throw new IllegalStateException("Check failed.");
        }
        int i29 = bytes[i23] & 255;
        StringBuilder sb4 = new StringBuilder("Symbol '");
        sb4.append((char) i29);
        sb4.append("'(");
        AbstractC7966P5.m8254b(8);
        String string3 = Integer.toString(i29, 8);
        AbstractC16544l.m18093f(string3, "toString(...)");
        sb4.append(string3);
        sb4.append(") at index ");
        throw new IllegalArgumentException(AbstractC10763a.m11056n(sb4, i23 - 1, " is prohibited after the pad character"));
    }

    /* JADX INFO: renamed from: b */
    public final int m21830b(int i10) {
        int i11 = (i10 / 3) * 4;
        if (i10 % 3 != 0) {
            EnumC21551b[] enumC21551bArr = EnumC21551b.f68249Y;
            i11 += 4;
        }
        if (this.f68255b) {
            i11 += ((i11 - 1) / 76) * 2;
        }
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalArgumentException("Input is too big");
    }
}
