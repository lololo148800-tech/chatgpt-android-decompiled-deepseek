package com.google.protobuf;

import java.nio.ByteBuffer;
import p002A0.C0138o;
import p379Pb.LVf.efyhmdM;

/* JADX INFO: renamed from: com.google.protobuf.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12153g {

    /* JADX INFO: renamed from: a */
    public static final C12143c1 f37030a = new C12143c1();

    /* JADX INFO: renamed from: b */
    public static final C12146d1 f37031b = new C12146d1();

    /* JADX INFO: renamed from: A */
    public static int m13943A(byte[] bArr, int i10, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) throws C12181p0 {
        C12205x0 c12205x0 = (C12205x0) interfaceC12172m0;
        int iM13955O = m13955O(bArr, i10, c0138o);
        int i11 = c0138o.f575Y + iM13955O;
        while (iM13955O < i11) {
            iM13955O = m13957Q(bArr, iM13955O, c0138o);
            c12205x0.m14167j(AbstractC12186r.m14085d(c0138o.f576Z));
        }
        if (iM13955O == i11) {
            return iM13955O;
        }
        throw C12181p0.m14066g();
    }

    /* JADX INFO: renamed from: B */
    public static int m13944B(byte[] bArr, int i10, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) throws C12181p0 {
        C12142c0 c12142c0 = (C12142c0) interfaceC12172m0;
        int iM13955O = m13955O(bArr, i10, c0138o);
        int i11 = c0138o.f575Y + iM13955O;
        while (iM13955O < i11) {
            iM13955O = m13955O(bArr, iM13955O, c0138o);
            c12142c0.m13938j(c0138o.f575Y);
        }
        if (iM13955O == i11) {
            return iM13955O;
        }
        throw C12181p0.m14066g();
    }

    /* JADX INFO: renamed from: C */
    public static int m13945C(byte[] bArr, int i10, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) throws C12181p0 {
        C12205x0 c12205x0 = (C12205x0) interfaceC12172m0;
        int iM13955O = m13955O(bArr, i10, c0138o);
        int i11 = c0138o.f575Y + iM13955O;
        while (iM13955O < i11) {
            iM13955O = m13957Q(bArr, iM13955O, c0138o);
            c12205x0.m14167j(c0138o.f576Z);
        }
        if (iM13955O == i11) {
            return iM13955O;
        }
        throw C12181p0.m14066g();
    }

    /* JADX INFO: renamed from: D */
    public static int m13946D(int i10, byte[] bArr, int i11, int i12, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) {
        C12142c0 c12142c0 = (C12142c0) interfaceC12172m0;
        int iM13955O = m13955O(bArr, i11, c0138o);
        c12142c0.m13938j(AbstractC12186r.m14084c(c0138o.f575Y));
        while (iM13955O < i12) {
            int iM13955O2 = m13955O(bArr, iM13955O, c0138o);
            if (i10 != c0138o.f575Y) {
                break;
            }
            iM13955O = m13955O(bArr, iM13955O2, c0138o);
            c12142c0.m13938j(AbstractC12186r.m14084c(c0138o.f575Y));
        }
        return iM13955O;
    }

    /* JADX INFO: renamed from: E */
    public static int m13947E(int i10, byte[] bArr, int i11, int i12, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) {
        C12205x0 c12205x0 = (C12205x0) interfaceC12172m0;
        int iM13957Q = m13957Q(bArr, i11, c0138o);
        c12205x0.m14167j(AbstractC12186r.m14085d(c0138o.f576Z));
        while (iM13957Q < i12) {
            int iM13955O = m13955O(bArr, iM13957Q, c0138o);
            if (i10 != c0138o.f575Y) {
                break;
            }
            iM13957Q = m13957Q(bArr, iM13955O, c0138o);
            c12205x0.m14167j(AbstractC12186r.m14085d(c0138o.f576Z));
        }
        return iM13957Q;
    }

    /* JADX INFO: renamed from: G */
    public static int m13949G(int i10, byte[] bArr, int i11, int i12, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) throws C12181p0 {
        int iM13955O = m13955O(bArr, i11, c0138o);
        int i13 = c0138o.f575Y;
        if (i13 < 0) {
            throw C12181p0.m14064e();
        }
        if (i13 == 0) {
            interfaceC12172m0.add("");
        } else {
            interfaceC12172m0.add(new String(bArr, iM13955O, i13, AbstractC12175n0.f37050a));
            iM13955O += i13;
        }
        while (iM13955O < i12) {
            int iM13955O2 = m13955O(bArr, iM13955O, c0138o);
            if (i10 != c0138o.f575Y) {
                break;
            }
            iM13955O = m13955O(bArr, iM13955O2, c0138o);
            int i14 = c0138o.f575Y;
            if (i14 < 0) {
                throw C12181p0.m14064e();
            }
            if (i14 == 0) {
                interfaceC12172m0.add("");
            } else {
                interfaceC12172m0.add(new String(bArr, iM13955O, i14, AbstractC12175n0.f37050a));
                iM13955O += i14;
            }
        }
        return iM13955O;
    }

    /* JADX INFO: renamed from: H */
    public static int m13950H(int i10, byte[] bArr, int i11, int i12, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) throws C12181p0 {
        int iM13955O = m13955O(bArr, i11, c0138o);
        int i13 = c0138o.f575Y;
        if (i13 < 0) {
            throw C12181p0.m14064e();
        }
        if (i13 == 0) {
            interfaceC12172m0.add("");
        } else {
            int i14 = iM13955O + i13;
            if (AbstractC12077B1.f36870a.mo13994X(bArr, iM13955O, i14) != 0) {
                throw C12181p0.m14061b();
            }
            interfaceC12172m0.add(new String(bArr, iM13955O, i13, AbstractC12175n0.f37050a));
            iM13955O = i14;
        }
        while (iM13955O < i12) {
            int iM13955O2 = m13955O(bArr, iM13955O, c0138o);
            if (i10 != c0138o.f575Y) {
                break;
            }
            iM13955O = m13955O(bArr, iM13955O2, c0138o);
            int i15 = c0138o.f575Y;
            if (i15 < 0) {
                throw C12181p0.m14064e();
            }
            if (i15 == 0) {
                interfaceC12172m0.add("");
            } else {
                int i16 = iM13955O + i15;
                if (AbstractC12077B1.f36870a.mo13994X(bArr, iM13955O, i16) != 0) {
                    throw C12181p0.m14061b();
                }
                interfaceC12172m0.add(new String(bArr, iM13955O, i15, AbstractC12175n0.f37050a));
                iM13955O = i16;
            }
        }
        return iM13955O;
    }

    /* JADX INFO: renamed from: I */
    public static int m13951I(byte[] bArr, int i10, C0138o c0138o) throws C12181p0 {
        int iM13955O = m13955O(bArr, i10, c0138o);
        int i11 = c0138o.f575Y;
        if (i11 < 0) {
            throw C12181p0.m14064e();
        }
        if (i11 == 0) {
            c0138o.f577o0 = "";
            return iM13955O;
        }
        c0138o.f577o0 = AbstractC12077B1.f36870a.mo13991K(bArr, iM13955O, i11);
        return iM13955O + i11;
    }

    /* JADX INFO: renamed from: J */
    public static int m13952J(int i10, byte[] bArr, int i11, int i12, C12182p1 c12182p1, C0138o c0138o) throws C12181p0 {
        if ((i10 >>> 3) == 0) {
            throw C12181p0.m14060a();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iM13957Q = m13957Q(bArr, i11, c0138o);
            c12182p1.m14072f(i10, Long.valueOf(c0138o.f576Z));
            return iM13957Q;
        }
        if (i13 == 1) {
            c12182p1.m14072f(i10, Long.valueOf(m13977m(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iM13955O = m13955O(bArr, i11, c0138o);
            int i14 = c0138o.f575Y;
            if (i14 < 0) {
                throw C12181p0.m14064e();
            }
            if (i14 > bArr.length - iM13955O) {
                throw C12181p0.m14066g();
            }
            if (i14 == 0) {
                c12182p1.m14072f(i10, AbstractC12171m.f37047Z);
            } else {
                c12182p1.m14072f(i10, AbstractC12171m.m14010j(bArr, iM13955O, i14));
            }
            return iM13955O + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw C12181p0.m14060a();
            }
            c12182p1.m14072f(i10, Integer.valueOf(m13975k(i11, bArr)));
            return i11 + 4;
        }
        C12182p1 c12182p2 = new C12182p1();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (i11 < i12) {
            int iM13955O2 = m13955O(bArr, i11, c0138o);
            int i17 = c0138o.f575Y;
            if (i17 == i15) {
                i16 = i17;
                i11 = iM13955O2;
                break;
            }
            i16 = i17;
            i11 = m13952J(i17, bArr, iM13955O2, i12, c12182p2, c0138o);
        }
        if (i11 > i12 || i16 != i15) {
            throw C12181p0.m14065f();
        }
        c12182p1.m14072f(i10, c12182p2);
        return i11;
    }

    /* JADX INFO: renamed from: L */
    public static String m13953L(int i10, int i11, ByteBuffer byteBuffer) throws C12181p0 {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b = byteBuffer.get(i10);
            if (!m13966b(b)) {
                break;
            }
            i10++;
            cArr[i13] = (char) b;
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b10 = byteBuffer.get(i10);
            if (m13966b(b10)) {
                int i16 = i14 + 1;
                cArr[i14] = (char) b10;
                while (i15 < i12) {
                    byte b11 = byteBuffer.get(i15);
                    if (!m13966b(b11)) {
                        break;
                    }
                    i15++;
                    cArr[i16] = (char) b11;
                    i16++;
                }
                i14 = i16;
                i10 = i15;
            } else if (b10 < -32) {
                if (i15 >= i12) {
                    throw C12181p0.m14061b();
                }
                i10 += 2;
                m13967c(b10, byteBuffer.get(i15), cArr, i14);
                i14++;
            } else if (b10 < -16) {
                if (i15 >= i12 - 1) {
                    throw C12181p0.m14061b();
                }
                int i17 = i10 + 2;
                i10 += 3;
                m13968d(b10, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw C12181p0.m14061b();
                }
                byte b12 = byteBuffer.get(i15);
                int i18 = i10 + 3;
                byte b13 = byteBuffer.get(i10 + 2);
                i10 += 4;
                m13965a(b10, b12, b13, byteBuffer.get(i18), cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }

    /* JADX INFO: renamed from: N */
    public static int m13954N(int i10, byte[] bArr, int i11, C0138o c0138o) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b = bArr[i11];
        if (b >= 0) {
            c0138o.f575Y = i12 | (b << 7);
            return i13;
        }
        int i14 = i12 | ((b & 127) << 7);
        int i15 = i11 + 2;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            c0138o.f575Y = i14 | (b10 << 14);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 14);
        int i17 = i11 + 3;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            c0138o.f575Y = i16 | (b11 << 21);
            return i17;
        }
        int i18 = i16 | ((b11 & 127) << 21);
        int i19 = i11 + 4;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            c0138o.f575Y = i18 | (b12 << 28);
            return i19;
        }
        int i20 = i18 | ((b12 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c0138o.f575Y = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* JADX INFO: renamed from: O */
    public static int m13955O(byte[] bArr, int i10, C0138o c0138o) {
        int i11 = i10 + 1;
        byte b = bArr[i10];
        if (b < 0) {
            return m13954N(b, bArr, i11, c0138o);
        }
        c0138o.f575Y = b;
        return i11;
    }

    /* JADX INFO: renamed from: P */
    public static int m13956P(int i10, byte[] bArr, int i11, int i12, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) {
        C12142c0 c12142c0 = (C12142c0) interfaceC12172m0;
        int iM13955O = m13955O(bArr, i11, c0138o);
        c12142c0.m13938j(c0138o.f575Y);
        while (iM13955O < i12) {
            int iM13955O2 = m13955O(bArr, iM13955O, c0138o);
            if (i10 != c0138o.f575Y) {
                break;
            }
            iM13955O = m13955O(bArr, iM13955O2, c0138o);
            c12142c0.m13938j(c0138o.f575Y);
        }
        return iM13955O;
    }

    /* JADX INFO: renamed from: Q */
    public static int m13957Q(byte[] bArr, int i10, C0138o c0138o) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            c0138o.f576Z = j10;
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
        c0138o.f576Z = j11;
        return i12;
    }

    /* JADX INFO: renamed from: R */
    public static int m13958R(int i10, byte[] bArr, int i11, int i12, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) {
        C12205x0 c12205x0 = (C12205x0) interfaceC12172m0;
        int iM13957Q = m13957Q(bArr, i11, c0138o);
        c12205x0.m14167j(c0138o.f576Z);
        while (iM13957Q < i12) {
            int iM13955O = m13955O(bArr, iM13957Q, c0138o);
            if (i10 != c0138o.f575Y) {
                break;
            }
            iM13957Q = m13957Q(bArr, iM13955O, c0138o);
            c12205x0.m14167j(c0138o.f576Z);
        }
        return iM13957Q;
    }

    /* JADX INFO: renamed from: T */
    public static String m13959T(AbstractC12171m abstractC12171m) {
        StringBuilder sb2 = new StringBuilder(abstractC12171m.size());
        for (int i10 = 0; i10 < abstractC12171m.size(); i10++) {
            byte bMo13999f = abstractC12171m.mo13999f(i10);
            if (bMo13999f == 34) {
                sb2.append("\\\"");
            } else if (bMo13999f == 39) {
                sb2.append("\\'");
            } else if (bMo13999f != 92) {
                switch (bMo13999f) {
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
                        if (bMo13999f < 32 || bMo13999f > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bMo13999f >>> 6) & 3) + 48));
                            sb2.append((char) (((bMo13999f >>> 3) & 7) + 48));
                            sb2.append((char) ((bMo13999f & 7) + 48));
                        } else {
                            sb2.append((char) bMo13999f);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: U */
    public static boolean m13960U(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: V */
    public static int m13961V(Object obj, InterfaceC12134Z0 interfaceC12134Z0, byte[] bArr, int i10, int i11, int i12, C0138o c0138o) {
        int iM13772L = ((C12100J0) interfaceC12134Z0).m13772L(obj, bArr, i10, i11, i12, c0138o);
        c0138o.f577o0 = obj;
        return iM13772L;
    }

    /* JADX INFO: renamed from: W */
    public static int m13962W(Object obj, InterfaceC12134Z0 interfaceC12134Z0, byte[] bArr, int i10, int i11, C0138o c0138o) throws C12181p0 {
        int iM13954N = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iM13954N = m13954N(i12, bArr, iM13954N, c0138o);
            i12 = c0138o.f575Y;
        }
        int i13 = iM13954N;
        if (i12 < 0 || i12 > i11 - i13) {
            throw C12181p0.m14066g();
        }
        int i14 = i12 + i13;
        interfaceC12134Z0.mo13794h(obj, bArr, i13, i14, c0138o);
        c0138o.f577o0 = obj;
        return i14;
    }

    /* JADX INFO: renamed from: Y */
    public static Object m13963Y(AbstractC12186r abstractC12186r, EnumC12101J1 enumC12101J1, int i10) {
        switch (enumC12101J1.ordinal()) {
            case 0:
                return Double.valueOf(abstractC12186r.mo14037n());
            case 1:
                return Float.valueOf(abstractC12186r.mo14041r());
            case 2:
                return Long.valueOf(abstractC12186r.mo14044u());
            case 3:
                return Long.valueOf(abstractC12186r.mo14021G());
            case 4:
                return Integer.valueOf(abstractC12186r.mo14043t());
            case 5:
                return Long.valueOf(abstractC12186r.mo14040q());
            case 6:
                return Integer.valueOf(abstractC12186r.mo14039p());
            case 7:
                return Boolean.valueOf(abstractC12186r.mo14035l());
            case 8:
                if (i10 != 1) {
                    return i10 != 2 ? abstractC12186r.mo14036m() : abstractC12186r.mo14018D();
                }
                return abstractC12186r.mo14017C();
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return abstractC12186r.mo14036m();
            case 12:
                return Integer.valueOf(abstractC12186r.mo14020F());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(abstractC12186r.mo14047y());
            case 15:
                return Long.valueOf(abstractC12186r.mo14048z());
            case 16:
                return Integer.valueOf(abstractC12186r.mo14015A());
            case 17:
                return Long.valueOf(abstractC12186r.mo14016B());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: Z */
    public static int m13964Z(int i10, byte[] bArr, int i11, int i12, C0138o c0138o) throws C12181p0 {
        if ((i10 >>> 3) == 0) {
            throw C12181p0.m14060a();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return m13957Q(bArr, i11, c0138o);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return m13955O(bArr, i11, c0138o) + c0138o.f575Y;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw C12181p0.m14060a();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = m13955O(bArr, i11, c0138o);
            i15 = c0138o.f575Y;
            if (i15 == i14) {
                break;
            }
            i11 = m13964Z(i15, bArr, i11, i12, c0138o);
        }
        if (i11 > i12 || i15 != i14) {
            throw C12181p0.m14065f();
        }
        return i11;
    }

    /* JADX INFO: renamed from: a */
    public static void m13965a(byte b, byte b10, byte b11, byte b12, char[] cArr, int i10) throws C12181p0 {
        if (!m13960U(b10)) {
            if ((((b10 + 112) + (b << 28)) >> 30) == 0 && !m13960U(b11) && !m13960U(b12)) {
                int i11 = ((b & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw C12181p0.m14061b();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13966b(byte b) {
        return b >= 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m13967c(byte b, byte b10, char[] cArr, int i10) throws C12181p0 {
        if (b < -62 || m13960U(b10)) {
            throw C12181p0.m14061b();
        }
        cArr[i10] = (char) (((b & 31) << 6) | (b10 & 63));
    }

    /* JADX INFO: renamed from: d */
    public static void m13968d(byte b, byte b10, byte b11, char[] cArr, int i10) throws C12181p0 {
        if (m13960U(b10) || ((b == -32 && b10 < -96) || ((b == -19 && b10 >= -96) || m13960U(b11)))) {
            throw C12181p0.m14061b();
        }
        cArr[i10] = (char) (((b & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
    }

    /* JADX INFO: renamed from: e */
    public static int m13969e(int i10, byte[] bArr, int i11, int i12, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) {
        C12159i c12159i = (C12159i) interfaceC12172m0;
        int iM13957Q = m13957Q(bArr, i11, c0138o);
        c12159i.m13996j(c0138o.f576Z != 0);
        while (iM13957Q < i12) {
            int iM13955O = m13955O(bArr, iM13957Q, c0138o);
            if (i10 != c0138o.f575Y) {
                break;
            }
            iM13957Q = m13957Q(bArr, iM13955O, c0138o);
            c12159i.m13996j(c0138o.f576Z != 0);
        }
        return iM13957Q;
    }

    /* JADX INFO: renamed from: f */
    public static int m13970f(byte[] bArr, int i10, C0138o c0138o) throws C12181p0 {
        int iM13955O = m13955O(bArr, i10, c0138o);
        int i11 = c0138o.f575Y;
        if (i11 < 0) {
            throw C12181p0.m14064e();
        }
        if (i11 > bArr.length - iM13955O) {
            throw C12181p0.m14066g();
        }
        if (i11 == 0) {
            c0138o.f577o0 = AbstractC12171m.f37047Z;
            return iM13955O;
        }
        c0138o.f577o0 = AbstractC12171m.m14010j(bArr, iM13955O, i11);
        return iM13955O + i11;
    }

    /* JADX INFO: renamed from: g */
    public static int m13971g(int i10, byte[] bArr, int i11, int i12, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) throws C12181p0 {
        int iM13955O = m13955O(bArr, i11, c0138o);
        int i13 = c0138o.f575Y;
        if (i13 < 0) {
            throw C12181p0.m14064e();
        }
        if (i13 > bArr.length - iM13955O) {
            throw C12181p0.m14066g();
        }
        if (i13 == 0) {
            interfaceC12172m0.add(AbstractC12171m.f37047Z);
        } else {
            interfaceC12172m0.add(AbstractC12171m.m14010j(bArr, iM13955O, i13));
            iM13955O += i13;
        }
        while (iM13955O < i12) {
            int iM13955O2 = m13955O(bArr, iM13955O, c0138o);
            if (i10 != c0138o.f575Y) {
                break;
            }
            iM13955O = m13955O(bArr, iM13955O2, c0138o);
            int i14 = c0138o.f575Y;
            if (i14 < 0) {
                throw C12181p0.m14064e();
            }
            if (i14 > bArr.length - iM13955O) {
                throw C12181p0.m14066g();
            }
            if (i14 == 0) {
                interfaceC12172m0.add(AbstractC12171m.f37047Z);
            } else {
                interfaceC12172m0.add(AbstractC12171m.m14010j(bArr, iM13955O, i14));
                iM13955O += i14;
            }
        }
        return iM13955O;
    }

    /* JADX INFO: renamed from: h */
    public static double m13972h(int i10, byte[] bArr) {
        return Double.longBitsToDouble(m13977m(i10, bArr));
    }

    /* JADX INFO: renamed from: i */
    public static int m13973i(int i10, byte[] bArr, int i11, int i12, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) {
        C12198v c12198v = (C12198v) interfaceC12172m0;
        c12198v.m14153j(m13972h(i11, bArr));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iM13955O = m13955O(bArr, i13, c0138o);
            if (i10 != c0138o.f575Y) {
                break;
            }
            c12198v.m14153j(Double.longBitsToDouble(m13977m(iM13955O, bArr)));
            i13 = iM13955O + 8;
        }
        return i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f8  */
    /* JADX INFO: renamed from: j */
    public static int m13974j(int i10, byte[] bArr, int i11, int i12, Object obj, InterfaceC12091G0 interfaceC12091G0, C12185q1 c12185q1, C0138o c0138o) throws C12181p0 {
        C12129X c12129xM13738a = ((C12087F) c0138o.f578p0).m13738a(i10 >>> 3, interfaceC12091G0);
        if (c12129xM13738a == null) {
            return m13952J(i10, bArr, i11, i12, C12100J0.m13763r(obj), c0138o);
        }
        GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = (GeneratedMessageLite$ExtendableMessage) obj;
        generatedMessageLite$ExtendableMessage.ensureExtensionsAreMutable();
        C12110N c12110n = generatedMessageLite$ExtendableMessage.extensions;
        int i13 = i10 >>> 3;
        C12127W c12127w = c12129xM13738a.f36993d;
        boolean z6 = c12127w.f36985o0;
        EnumC12101J1 enumC12101J1 = c12127w.f36984Z;
        if (z6 && c12127w.f36986p0) {
            switch (enumC12101J1.ordinal()) {
                case 0:
                    C12198v c12198v = new C12198v(new double[10], 0);
                    int iM13986v = m13986v(bArr, i11, c12198v, c0138o);
                    c12110n.m13853p(c12127w, c12198v);
                    return iM13986v;
                case 1:
                    C12114P c12114p = new C12114P(new float[10], 0);
                    int iM13989y = m13989y(bArr, i11, c12114p, c0138o);
                    c12110n.m13853p(c12127w, c12114p);
                    return iM13989y;
                case 2:
                case 3:
                    C12205x0 c12205x0 = new C12205x0();
                    int iM13945C = m13945C(bArr, i11, c12205x0, c0138o);
                    c12110n.m13853p(c12127w, c12205x0);
                    return iM13945C;
                case 4:
                case 12:
                    C12142c0 c12142c0 = new C12142c0();
                    int iM13944B = m13944B(bArr, i11, c12142c0, c0138o);
                    c12110n.m13853p(c12127w, c12142c0);
                    return iM13944B;
                case 5:
                case 15:
                    C12205x0 c12205x1 = new C12205x0();
                    int iM13988x = m13988x(bArr, i11, c12205x1, c0138o);
                    c12110n.m13853p(c12127w, c12205x1);
                    return iM13988x;
                case 6:
                case 14:
                    C12142c0 c12142c1 = new C12142c0();
                    int iM13987w = m13987w(bArr, i11, c12142c1, c0138o);
                    c12110n.m13853p(c12127w, c12142c1);
                    return iM13987w;
                case 7:
                    C12159i c12159i = new C12159i(new boolean[10], 0);
                    int iM13985u = m13985u(bArr, i11, c12159i, c0138o);
                    c12110n.m13853p(c12127w, c12159i);
                    return iM13985u;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c12127w.f36984Z);
                case 13:
                    C12142c0 c12142c2 = new C12142c0();
                    int iM13944B2 = m13944B(bArr, i11, c12142c2, c0138o);
                    AbstractC12137a1.m13927z(generatedMessageLite$ExtendableMessage, i13, c12142c2, null, null, c12185q1);
                    c12110n.m13853p(c12127w, c12142c2);
                    return iM13944B2;
                case 16:
                    C12142c0 c12142c3 = new C12142c0();
                    int iM13990z = m13990z(bArr, i11, c12142c3, c0138o);
                    c12110n.m13853p(c12127w, c12142c3);
                    return iM13990z;
                case 17:
                    C12205x0 c12205x2 = new C12205x0();
                    int iM13943A = m13943A(bArr, i11, c12205x2, c0138o);
                    c12110n.m13853p(c12127w, c12205x2);
                    return iM13943A;
            }
        }
        Object objValueOf = null;
        if (enumC12101J1 == EnumC12101J1.f36920t0) {
            m13955O(bArr, i11, c0138o);
            int i14 = c0138o.f575Y;
            throw null;
        }
        int iOrdinal = enumC12101J1.ordinal();
        InterfaceC12091G0 interfaceC12091G1 = c12129xM13738a.f36992c;
        switch (iOrdinal) {
            case 0:
                objValueOf = Double.valueOf(m13972h(i11, bArr));
                i11 += 8;
                if (c12127w.f36985o0) {
                    c12110n.m13843a(c12127w, objValueOf);
                } else {
                    c12110n.m13853p(c12127w, objValueOf);
                }
                return i11;
            case 1:
                objValueOf = Float.valueOf(m13979o(i11, bArr));
                i11 += 4;
                if (c12127w.f36985o0) {
                    c12110n.m13843a(c12127w, objValueOf);
                } else {
                    c12110n.m13853p(c12127w, objValueOf);
                }
                return i11;
            case 2:
            case 3:
                i11 = m13957Q(bArr, i11, c0138o);
                objValueOf = Long.valueOf(c0138o.f576Z);
                if (c12127w.f36985o0) {
                    c12110n.m13843a(c12127w, objValueOf);
                } else {
                    c12110n.m13853p(c12127w, objValueOf);
                }
                return i11;
            case 4:
            case 12:
                i11 = m13955O(bArr, i11, c0138o);
                objValueOf = Integer.valueOf(c0138o.f575Y);
                if (c12127w.f36985o0) {
                    c12110n.m13843a(c12127w, objValueOf);
                } else {
                    c12110n.m13853p(c12127w, objValueOf);
                }
                return i11;
            case 5:
            case 15:
                objValueOf = Long.valueOf(m13977m(i11, bArr));
                i11 += 8;
                if (c12127w.f36985o0) {
                    c12110n.m13843a(c12127w, objValueOf);
                } else {
                    c12110n.m13853p(c12127w, objValueOf);
                }
                return i11;
            case 6:
            case 14:
                objValueOf = Integer.valueOf(m13975k(i11, bArr));
                i11 += 4;
                if (c12127w.f36985o0) {
                    c12110n.m13843a(c12127w, objValueOf);
                } else {
                    c12110n.m13853p(c12127w, objValueOf);
                }
                return i11;
            case 7:
                i11 = m13957Q(bArr, i11, c0138o);
                objValueOf = Boolean.valueOf(c0138o.f576Z != 0);
                if (c12127w.f36985o0) {
                    c12110n.m13843a(c12127w, objValueOf);
                } else {
                    c12110n.m13853p(c12127w, objValueOf);
                }
                return i11;
            case 8:
                i11 = m13948F(bArr, i11, c0138o);
                objValueOf = c0138o.f577o0;
                if (c12127w.f36985o0) {
                    c12110n.m13843a(c12127w, objValueOf);
                } else {
                    c12110n.m13853p(c12127w, objValueOf);
                }
                return i11;
            case 9:
                int i15 = (i13 << 3) | 4;
                InterfaceC12134Z0 interfaceC12134Z0M13868a = C12128W0.f36987c.m13868a(interfaceC12091G1.getClass());
                if (c12127w.f36985o0) {
                    int iM13981q = m13981q(interfaceC12134Z0M13868a, bArr, i11, i12, i15, c0138o);
                    c12110n.m13843a(c12127w, c0138o.f577o0);
                    return iM13981q;
                }
                Object objMo13789c = c12110n.f36962a.get(c12127w);
                if (objMo13789c == null) {
                    objMo13789c = interfaceC12134Z0M13868a.mo13789c();
                    c12110n.m13853p(c12127w, objMo13789c);
                }
                return m13961V(objMo13789c, interfaceC12134Z0M13868a, bArr, i11, i12, i15, c0138o);
            case 10:
                InterfaceC12134Z0 interfaceC12134Z0M13868a2 = C12128W0.f36987c.m13868a(interfaceC12091G1.getClass());
                if (c12127w.f36985o0) {
                    int iM13983s = m13983s(interfaceC12134Z0M13868a2, bArr, i11, i12, c0138o);
                    c12110n.m13843a(c12127w, c0138o.f577o0);
                    return iM13983s;
                }
                Object objMo13789c2 = c12110n.f36962a.get(c12127w);
                if (objMo13789c2 == null) {
                    objMo13789c2 = interfaceC12134Z0M13868a2.mo13789c();
                    c12110n.m13853p(c12127w, objMo13789c2);
                }
                return m13962W(objMo13789c2, interfaceC12134Z0M13868a2, bArr, i11, i12, c0138o);
            case 11:
                i11 = m13970f(bArr, i11, c0138o);
                objValueOf = c0138o.f577o0;
                if (c12127w.f36985o0) {
                    c12110n.m13843a(c12127w, objValueOf);
                } else {
                    c12110n.m13853p(c12127w, objValueOf);
                }
                return i11;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 16:
                i11 = m13955O(bArr, i11, c0138o);
                objValueOf = Integer.valueOf(AbstractC12186r.m14084c(c0138o.f575Y));
                if (c12127w.f36985o0) {
                    c12110n.m13843a(c12127w, objValueOf);
                } else {
                    c12110n.m13853p(c12127w, objValueOf);
                }
                return i11;
            case 17:
                i11 = m13957Q(bArr, i11, c0138o);
                objValueOf = Long.valueOf(AbstractC12186r.m14085d(c0138o.f576Z));
                if (c12127w.f36985o0) {
                    c12110n.m13843a(c12127w, objValueOf);
                } else {
                    c12110n.m13853p(c12127w, objValueOf);
                }
                return i11;
            default:
                if (c12127w.f36985o0) {
                    c12110n.m13843a(c12127w, objValueOf);
                } else {
                    c12110n.m13853p(c12127w, objValueOf);
                }
                return i11;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m13975k(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: l */
    public static int m13976l(int i10, byte[] bArr, int i11, int i12, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) {
        C12142c0 c12142c0 = (C12142c0) interfaceC12172m0;
        c12142c0.m13938j(m13975k(i11, bArr));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iM13955O = m13955O(bArr, i13, c0138o);
            if (i10 != c0138o.f575Y) {
                break;
            }
            c12142c0.m13938j(m13975k(iM13955O, bArr));
            i13 = iM13955O + 4;
        }
        return i13;
    }

    /* JADX INFO: renamed from: m */
    public static long m13977m(int i10, byte[] bArr) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: n */
    public static int m13978n(int i10, byte[] bArr, int i11, int i12, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) {
        C12205x0 c12205x0 = (C12205x0) interfaceC12172m0;
        c12205x0.m14167j(m13977m(i11, bArr));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iM13955O = m13955O(bArr, i13, c0138o);
            if (i10 != c0138o.f575Y) {
                break;
            }
            c12205x0.m14167j(m13977m(iM13955O, bArr));
            i13 = iM13955O + 8;
        }
        return i13;
    }

    /* JADX INFO: renamed from: o */
    public static float m13979o(int i10, byte[] bArr) {
        return Float.intBitsToFloat(m13975k(i10, bArr));
    }

    /* JADX INFO: renamed from: p */
    public static int m13980p(int i10, byte[] bArr, int i11, int i12, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) {
        C12114P c12114p = (C12114P) interfaceC12172m0;
        c12114p.m13856j(m13979o(i11, bArr));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iM13955O = m13955O(bArr, i13, c0138o);
            if (i10 != c0138o.f575Y) {
                break;
            }
            c12114p.m13856j(Float.intBitsToFloat(m13975k(iM13955O, bArr)));
            i13 = iM13955O + 4;
        }
        return i13;
    }

    /* JADX INFO: renamed from: q */
    public static int m13981q(InterfaceC12134Z0 interfaceC12134Z0, byte[] bArr, int i10, int i11, int i12, C0138o c0138o) {
        AbstractC12133Z abstractC12133ZMo13789c = interfaceC12134Z0.mo13789c();
        int iM13961V = m13961V(abstractC12133ZMo13789c, interfaceC12134Z0, bArr, i10, i11, i12, c0138o);
        interfaceC12134Z0.mo13785a(abstractC12133ZMo13789c);
        c0138o.f577o0 = abstractC12133ZMo13789c;
        return iM13961V;
    }

    /* JADX INFO: renamed from: r */
    public static int m13982r(InterfaceC12134Z0 interfaceC12134Z0, int i10, byte[] bArr, int i11, int i12, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) {
        int i13 = (i10 & (-8)) | 4;
        int iM13981q = m13981q(interfaceC12134Z0, bArr, i11, i12, i13, c0138o);
        interfaceC12172m0.add(c0138o.f577o0);
        while (iM13981q < i12) {
            int iM13955O = m13955O(bArr, iM13981q, c0138o);
            if (i10 != c0138o.f575Y) {
                break;
            }
            iM13981q = m13981q(interfaceC12134Z0, bArr, iM13955O, i12, i13, c0138o);
            interfaceC12172m0.add(c0138o.f577o0);
        }
        return iM13981q;
    }

    /* JADX INFO: renamed from: s */
    public static int m13983s(InterfaceC12134Z0 interfaceC12134Z0, byte[] bArr, int i10, int i11, C0138o c0138o) throws C12181p0 {
        AbstractC12133Z abstractC12133ZMo13789c = interfaceC12134Z0.mo13789c();
        int iM13962W = m13962W(abstractC12133ZMo13789c, interfaceC12134Z0, bArr, i10, i11, c0138o);
        interfaceC12134Z0.mo13785a(abstractC12133ZMo13789c);
        c0138o.f577o0 = abstractC12133ZMo13789c;
        return iM13962W;
    }

    /* JADX INFO: renamed from: t */
    public static int m13984t(InterfaceC12134Z0 interfaceC12134Z0, int i10, byte[] bArr, int i11, int i12, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) throws C12181p0 {
        int iM13983s = m13983s(interfaceC12134Z0, bArr, i11, i12, c0138o);
        interfaceC12172m0.add(c0138o.f577o0);
        while (iM13983s < i12) {
            int iM13955O = m13955O(bArr, iM13983s, c0138o);
            if (i10 != c0138o.f575Y) {
                break;
            }
            iM13983s = m13983s(interfaceC12134Z0, bArr, iM13955O, i12, c0138o);
            interfaceC12172m0.add(c0138o.f577o0);
        }
        return iM13983s;
    }

    /* JADX INFO: renamed from: u */
    public static int m13985u(byte[] bArr, int i10, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) throws C12181p0 {
        C12159i c12159i = (C12159i) interfaceC12172m0;
        int iM13955O = m13955O(bArr, i10, c0138o);
        int i11 = c0138o.f575Y + iM13955O;
        while (iM13955O < i11) {
            iM13955O = m13957Q(bArr, iM13955O, c0138o);
            c12159i.m13996j(c0138o.f576Z != 0);
        }
        if (iM13955O == i11) {
            return iM13955O;
        }
        throw C12181p0.m14066g();
    }

    /* JADX INFO: renamed from: v */
    public static int m13986v(byte[] bArr, int i10, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) throws C12181p0 {
        C12198v c12198v = (C12198v) interfaceC12172m0;
        int iM13955O = m13955O(bArr, i10, c0138o);
        int i11 = c0138o.f575Y + iM13955O;
        while (iM13955O < i11) {
            c12198v.m14153j(Double.longBitsToDouble(m13977m(iM13955O, bArr)));
            iM13955O += 8;
        }
        if (iM13955O == i11) {
            return iM13955O;
        }
        throw C12181p0.m14066g();
    }

    /* JADX INFO: renamed from: w */
    public static int m13987w(byte[] bArr, int i10, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) throws C12181p0 {
        C12142c0 c12142c0 = (C12142c0) interfaceC12172m0;
        int iM13955O = m13955O(bArr, i10, c0138o);
        int i11 = c0138o.f575Y + iM13955O;
        while (iM13955O < i11) {
            c12142c0.m13938j(m13975k(iM13955O, bArr));
            iM13955O += 4;
        }
        if (iM13955O == i11) {
            return iM13955O;
        }
        throw C12181p0.m14066g();
    }

    /* JADX INFO: renamed from: x */
    public static int m13988x(byte[] bArr, int i10, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) throws C12181p0 {
        C12205x0 c12205x0 = (C12205x0) interfaceC12172m0;
        int iM13955O = m13955O(bArr, i10, c0138o);
        int i11 = c0138o.f575Y + iM13955O;
        while (iM13955O < i11) {
            c12205x0.m14167j(m13977m(iM13955O, bArr));
            iM13955O += 8;
        }
        if (iM13955O == i11) {
            return iM13955O;
        }
        throw C12181p0.m14066g();
    }

    /* JADX INFO: renamed from: y */
    public static int m13989y(byte[] bArr, int i10, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) throws C12181p0 {
        C12114P c12114p = (C12114P) interfaceC12172m0;
        int iM13955O = m13955O(bArr, i10, c0138o);
        int i11 = c0138o.f575Y + iM13955O;
        while (iM13955O < i11) {
            c12114p.m13856j(Float.intBitsToFloat(m13975k(iM13955O, bArr)));
            iM13955O += 4;
        }
        if (iM13955O == i11) {
            return iM13955O;
        }
        throw C12181p0.m14066g();
    }

    /* JADX INFO: renamed from: z */
    public static int m13990z(byte[] bArr, int i10, InterfaceC12172m0 interfaceC12172m0, C0138o c0138o) throws C12181p0 {
        C12142c0 c12142c0 = (C12142c0) interfaceC12172m0;
        int iM13955O = m13955O(bArr, i10, c0138o);
        int i11 = c0138o.f575Y + iM13955O;
        while (iM13955O < i11) {
            iM13955O = m13955O(bArr, iM13955O, c0138o);
            c12142c0.m13938j(AbstractC12186r.m14084c(c0138o.f575Y));
        }
        if (iM13955O == i11) {
            return iM13955O;
        }
        throw C12181p0.m14066g();
    }

    /* JADX INFO: renamed from: K */
    public abstract String mo13991K(byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: M */
    public abstract String mo13992M(int i10, int i11, ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: S */
    public abstract int mo13993S(String str, byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: X */
    public abstract int mo13994X(byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: a0 */
    public abstract void mo13995a0(byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: F */
    public static int m13948F(byte[] bArr, int i10, C0138o c0138o) throws C12181p0 {
        int iM13955O = m13955O(bArr, i10, c0138o);
        int i11 = c0138o.f575Y;
        if (i11 >= 0) {
            if (i11 == 0) {
                c0138o.f577o0 = efyhmdM.RMxoG;
                return iM13955O;
            }
            c0138o.f577o0 = new String(bArr, iM13955O, i11, AbstractC12175n0.f37050a);
            return iM13955O + i11;
        }
        throw C12181p0.m14064e();
    }
}
