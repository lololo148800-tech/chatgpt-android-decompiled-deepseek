package com.google.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.datastore.preferences.protobuf.C10995y;
import androidx.glance.appwidget.protobuf.C11064z;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import livekit.LivekitInternal$NodeStats;
import p002A0.C0138o;
import p370P0.C6277D;
import p658b5.C11238i;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12100J0 implements InterfaceC12134Z0 {

    /* JADX INFO: renamed from: q */
    public static final int[] f36897q = new int[0];

    /* JADX INFO: renamed from: r */
    public static final Unsafe f36898r = AbstractC12209y1.m14190m();

    /* JADX INFO: renamed from: a */
    public final int[] f36899a;

    /* JADX INFO: renamed from: b */
    public final Object[] f36900b;

    /* JADX INFO: renamed from: c */
    public final int f36901c;

    /* JADX INFO: renamed from: d */
    public final int f36902d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC12091G0 f36903e;

    /* JADX INFO: renamed from: f */
    public final boolean f36904f;

    /* JADX INFO: renamed from: g */
    public final boolean f36905g;

    /* JADX INFO: renamed from: h */
    public final boolean f36906h;

    /* JADX INFO: renamed from: i */
    public final int[] f36907i;

    /* JADX INFO: renamed from: j */
    public final int f36908j;

    /* JADX INFO: renamed from: k */
    public final int f36909k;

    /* JADX INFO: renamed from: l */
    public final C12115P0 f36910l;

    /* JADX INFO: renamed from: m */
    public final AbstractC12199v0 f36911m;

    /* JADX INFO: renamed from: n */
    public final C12185q1 f36912n;

    /* JADX INFO: renamed from: o */
    public final C12090G f36913o;

    /* JADX INFO: renamed from: p */
    public final C12079C0 f36914p;

    public C12100J0(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC12091G0 interfaceC12091G0, boolean z6, int[] iArr2, int i12, int i13, C12115P0 c12115p0, AbstractC12199v0 abstractC12199v0, C12185q1 c12185q1, C12090G c12090g, C12079C0 c12079c0) {
        this.f36899a = iArr;
        this.f36900b = objArr;
        this.f36901c = i10;
        this.f36902d = i11;
        this.f36905g = interfaceC12091G0 instanceof AbstractC12133Z;
        this.f36906h = z6;
        this.f36904f = c12090g != null && (interfaceC12091G0 instanceof GeneratedMessageLite$ExtendableMessage);
        this.f36907i = iArr2;
        this.f36908j = i12;
        this.f36909k = i13;
        this.f36910l = c12115p0;
        this.f36911m = abstractC12199v0;
        this.f36912n = c12185q1;
        this.f36913o = c12090g;
        this.f36903e = interfaceC12091G0;
        this.f36914p = c12079c0;
    }

    /* JADX INFO: renamed from: E */
    public static C12100J0 m13753E(C12132Y0 c12132y0, C12115P0 c12115p0, AbstractC12199v0 abstractC12199v0, C12185q1 c12185q1, C12090G c12090g, C12079C0 c12079c0) {
        if (c12132y0 instanceof C12132Y0) {
            return m13754F(c12132y0, c12115p0, abstractC12199v0, c12185q1, c12090g, c12079c0);
        }
        c12132y0.getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: F */
    public static C12100J0 m13754F(C12132Y0 c12132y0, C12115P0 c12115p0, AbstractC12199v0 abstractC12199v0, C12185q1 c12185q1, C12090G c12090g, C12079C0 c12079c0) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        char cCharAt;
        int i15;
        char cCharAt2;
        int i16;
        char cCharAt3;
        int i17;
        char cCharAt4;
        int i18;
        char cCharAt5;
        int i19;
        char cCharAt6;
        int i20;
        char cCharAt7;
        int i21;
        char cCharAt8;
        int i22;
        int i23;
        int i24;
        int i25;
        int[] iArr2;
        int iObjectFieldOffset;
        int i26;
        int i27;
        java.lang.reflect.Field fieldM13758S;
        int i28;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        java.lang.reflect.Field fieldM13758S2;
        java.lang.reflect.Field fieldM13758S3;
        int i32;
        char cCharAt10;
        int i33;
        char cCharAt11;
        int i34;
        char cCharAt12;
        int i35;
        char cCharAt13;
        int i36 = 0;
        boolean z6 = c12132y0.m13876d() == 2;
        String strM13875c = c12132y0.m13875c();
        int length = strM13875c.length();
        if (strM13875c.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i10 = i37 + 1;
                if (strM13875c.charAt(i37) < 55296) {
                    break;
                }
                i37 = i10;
            }
        } else {
            i10 = 1;
        }
        int i38 = i10 + 1;
        int iCharAt4 = strM13875c.charAt(i10);
        if (iCharAt4 >= 55296) {
            int i39 = iCharAt4 & 8191;
            int i40 = 13;
            while (true) {
                i35 = i38 + 1;
                cCharAt13 = strM13875c.charAt(i38);
                if (cCharAt13 < 55296) {
                    break;
                }
                i39 |= (cCharAt13 & 8191) << i40;
                i40 += 13;
                i38 = i35;
            }
            iCharAt4 = i39 | (cCharAt13 << i40);
            i38 = i35;
        }
        if (iCharAt4 == 0) {
            i13 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i11 = 0;
            iCharAt3 = 0;
            iArr = f36897q;
            i12 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt5 = strM13875c.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
                int i43 = 13;
                while (true) {
                    i21 = i41 + 1;
                    cCharAt8 = strM13875c.charAt(i41);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i21;
                }
                iCharAt5 = i42 | (cCharAt8 << i43);
                i41 = i21;
            }
            int i44 = i41 + 1;
            int iCharAt6 = strM13875c.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i20 = i44 + 1;
                    cCharAt7 = strM13875c.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i20;
                }
                iCharAt6 = i45 | (cCharAt7 << i46);
                i44 = i20;
            }
            int i47 = i44 + 1;
            int iCharAt7 = strM13875c.charAt(i44);
            if (iCharAt7 >= 55296) {
                int i48 = iCharAt7 & 8191;
                int i49 = 13;
                while (true) {
                    i19 = i47 + 1;
                    cCharAt6 = strM13875c.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i19;
                }
                iCharAt7 = i48 | (cCharAt6 << i49);
                i47 = i19;
            }
            int i50 = i47 + 1;
            iCharAt = strM13875c.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i18 = i50 + 1;
                    cCharAt5 = strM13875c.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i18;
                }
                iCharAt = i51 | (cCharAt5 << i52);
                i50 = i18;
            }
            int i53 = i50 + 1;
            int iCharAt8 = strM13875c.charAt(i50);
            if (iCharAt8 >= 55296) {
                int i54 = iCharAt8 & 8191;
                int i55 = 13;
                while (true) {
                    i17 = i53 + 1;
                    cCharAt4 = strM13875c.charAt(i53);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i17;
                }
                iCharAt8 = i54 | (cCharAt4 << i55);
                i53 = i17;
            }
            int i56 = i53 + 1;
            iCharAt2 = strM13875c.charAt(i53);
            if (iCharAt2 >= 55296) {
                int i57 = iCharAt2 & 8191;
                int i58 = 13;
                while (true) {
                    i16 = i56 + 1;
                    cCharAt3 = strM13875c.charAt(i56);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i16;
                }
                iCharAt2 = i57 | (cCharAt3 << i58);
                i56 = i16;
            }
            int i59 = i56 + 1;
            int iCharAt9 = strM13875c.charAt(i56);
            if (iCharAt9 >= 55296) {
                int i60 = iCharAt9 & 8191;
                int i61 = 13;
                while (true) {
                    i15 = i59 + 1;
                    cCharAt2 = strM13875c.charAt(i59);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i15;
                }
                iCharAt9 = i60 | (cCharAt2 << i61);
                i59 = i15;
            }
            int i62 = i59 + 1;
            iCharAt3 = strM13875c.charAt(i59);
            if (iCharAt3 >= 55296) {
                int i63 = iCharAt3 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i14 = i64 + 1;
                    cCharAt = strM13875c.charAt(i64);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i64 = i14;
                }
                iCharAt3 = i63 | (cCharAt << i65);
                i62 = i14;
            }
            int[] iArr3 = new int[iCharAt3 + iCharAt2 + iCharAt9];
            i11 = (iCharAt5 * 2) + iCharAt6;
            i12 = iCharAt7;
            i13 = iCharAt8;
            iArr = iArr3;
            i36 = iCharAt5;
            i38 = i62;
        }
        Unsafe unsafe = f36898r;
        Object[] objArrM13874b = c12132y0.m13874b();
        Class<?> cls = c12132y0.m13873a().getClass();
        int[] iArr4 = new int[i13 * 3];
        Object[] objArr = new Object[i13 * 2];
        int i66 = iCharAt2 + iCharAt3;
        int i67 = i66;
        int i68 = iCharAt3;
        int i69 = 0;
        int i70 = 0;
        while (i38 < length) {
            int i71 = i38 + 1;
            int iCharAt10 = strM13875c.charAt(i38);
            int i72 = length;
            if (iCharAt10 >= 55296) {
                int i73 = iCharAt10 & 8191;
                int i74 = i71;
                int i75 = 13;
                while (true) {
                    i34 = i74 + 1;
                    cCharAt12 = strM13875c.charAt(i74);
                    i22 = i66;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i73 |= (cCharAt12 & 8191) << i75;
                    i75 += 13;
                    i74 = i34;
                    i66 = i22;
                }
                iCharAt10 = i73 | (cCharAt12 << i75);
                i23 = i34;
            } else {
                i22 = i66;
                i23 = i71;
            }
            int i76 = i23 + 1;
            int iCharAt11 = strM13875c.charAt(i23);
            if (iCharAt11 >= 55296) {
                int i77 = iCharAt11 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i33 = i78 + 1;
                    cCharAt11 = strM13875c.charAt(i78);
                    i24 = iCharAt3;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i77 |= (cCharAt11 & 8191) << i79;
                    i79 += 13;
                    i78 = i33;
                    iCharAt3 = i24;
                }
                iCharAt11 = i77 | (cCharAt11 << i79);
                i25 = i33;
            } else {
                i24 = iCharAt3;
                i25 = i76;
            }
            int i80 = iCharAt11 & 255;
            int i81 = iCharAt;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i70] = i69;
                i70++;
            }
            if (i80 >= 51) {
                int i82 = i25 + 1;
                int iCharAt12 = strM13875c.charAt(i25);
                char c9 = 55296;
                if (iCharAt12 >= 55296) {
                    int i83 = 13;
                    int i84 = iCharAt12 & 8191;
                    int i85 = i82;
                    while (true) {
                        i32 = i85 + 1;
                        cCharAt10 = strM13875c.charAt(i85);
                        if (cCharAt10 < c9) {
                            break;
                        }
                        i84 |= (cCharAt10 & 8191) << i83;
                        i83 += 13;
                        i85 = i32;
                        c9 = 55296;
                    }
                    iCharAt12 = i84 | (cCharAt10 << i83);
                    i30 = i32;
                } else {
                    i30 = i82;
                }
                int i86 = i30;
                int i87 = i80 - 51;
                if (i87 == 9 || i87 == 17) {
                    i31 = 2;
                    objArr[AbstractC10763a.m11068z(i69, 3, 2, 1)] = objArrM13874b[i11];
                    i11++;
                } else if (i87 != 12 || z6) {
                    i31 = 2;
                } else {
                    i31 = 2;
                    objArr[AbstractC10763a.m11068z(i69, 3, 2, 1)] = objArrM13874b[i11];
                    i11++;
                }
                int i88 = iCharAt12 * i31;
                Object obj = objArrM13874b[i88];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldM13758S2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldM13758S2 = m13758S(cls, (String) obj);
                    objArrM13874b[i88] = fieldM13758S2;
                }
                int[] iArr5 = iArr4;
                int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM13758S2);
                int i89 = i88 + 1;
                Object obj2 = objArrM13874b[i89];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldM13758S3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldM13758S3 = m13758S(cls, (String) obj2);
                    objArrM13874b[i89] = fieldM13758S3;
                }
                iArr2 = iArr5;
                z6 = z6;
                i80 = i80;
                i25 = i86;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM13758S3);
                i27 = iObjectFieldOffset2;
                i26 = 0;
            } else {
                iCharAt10 = iCharAt10;
                iArr2 = iArr4;
                int i90 = i11 + 1;
                java.lang.reflect.Field fieldM13758S4 = m13758S(cls, (String) objArrM13874b[i11]);
                if (i80 == 9 || i80 == 17) {
                    iArr2 = iArr2;
                    z6 = z6;
                    objArr[AbstractC10763a.m11068z(i69, 3, 2, 1)] = fieldM13758S4.getType();
                } else {
                    if (i80 == 27 || i80 == 49) {
                        i29 = i11 + 2;
                        objArr[AbstractC10763a.m11068z(i69, 3, 2, 1)] = objArrM13874b[i90];
                    } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                        if (!z6) {
                            i29 = i11 + 2;
                            objArr[AbstractC10763a.m11068z(i69, 3, 2, 1)] = objArrM13874b[i90];
                        }
                    } else if (i80 == 50) {
                        int i91 = i68 + 1;
                        iArr[i68] = i69;
                        int i92 = (i69 / 3) * 2;
                        int i93 = i11 + 2;
                        objArr[i92] = objArrM13874b[i90];
                        if ((iCharAt11 & 2048) != 0) {
                            i90 = i11 + 3;
                            objArr[i92 + 1] = objArrM13874b[i93];
                            i68 = i91;
                        } else {
                            iArr2 = iArr2;
                            i68 = i91;
                            i90 = i93;
                            z6 = z6;
                        }
                    }
                    i90 = i29;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM13758S4);
                if ((iCharAt11 & 4096) != 4096 || i80 > 17) {
                    iObjectFieldOffset = 1048575;
                    i26 = 0;
                } else {
                    int i94 = i25 + 1;
                    int iCharAt13 = strM13875c.charAt(i25);
                    if (iCharAt13 >= 55296) {
                        int i95 = iCharAt13 & 8191;
                        int i96 = 13;
                        while (true) {
                            i28 = i94 + 1;
                            cCharAt9 = strM13875c.charAt(i94);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i95 |= (cCharAt9 & 8191) << i96;
                            i96 += 13;
                            i94 = i28;
                        }
                        iCharAt13 = i95 | (cCharAt9 << i96);
                        i25 = i28;
                    } else {
                        i25 = i94;
                    }
                    int i97 = (iCharAt13 / 32) + (i36 * 2);
                    Object obj3 = objArrM13874b[i97];
                    if (obj3 instanceof java.lang.reflect.Field) {
                        fieldM13758S = (java.lang.reflect.Field) obj3;
                    } else {
                        fieldM13758S = m13758S(cls, (String) obj3);
                        objArrM13874b[i97] = fieldM13758S;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM13758S);
                    i26 = iCharAt13 % 32;
                }
                if (i80 >= 18 && i80 <= 49) {
                    iArr[i67] = iObjectFieldOffset3;
                    i67++;
                }
                i11 = i90;
                i27 = iObjectFieldOffset3;
            }
            int i98 = i69 + 1;
            iArr2[i69] = iCharAt10;
            int i99 = i69 + 2;
            String str = strM13875c;
            iArr2[i98] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i80 << 20) | i27;
            i69 += 3;
            iArr2[i99] = (i26 << 20) | iObjectFieldOffset;
            i38 = i25;
            iArr4 = iArr2;
            iCharAt = i81;
            length = i72;
            strM13875c = str;
            i66 = i22;
            iCharAt3 = i24;
            z6 = z6;
            i12 = i12;
        }
        return new C12100J0(iArr4, objArr, i12, iCharAt, c12132y0.m13873a(), z6, iArr, iCharAt3, i66, c12115p0, abstractC12199v0, c12185q1, c12090g, c12079c0);
    }

    /* JADX INFO: renamed from: G */
    public static long m13755G(int i10) {
        return i10 & 1048575;
    }

    /* JADX INFO: renamed from: H */
    public static int m13756H(long j10, Object obj) {
        return ((Integer) AbstractC12209y1.f37124c.m14173k(j10, obj)).intValue();
    }

    /* JADX INFO: renamed from: I */
    public static long m13757I(long j10, Object obj) {
        return ((Long) AbstractC12209y1.f37124c.m14173k(j10, obj)).longValue();
    }

    /* JADX INFO: renamed from: S */
    public static java.lang.reflect.Field m13758S(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM11058p = AbstractC10763a.m11058p("Field ", str, " for ");
            sbM11058p.append(cls.getName());
            sbM11058p.append(" not found. Known fields are ");
            sbM11058p.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbM11058p.toString());
        }
    }

    /* JADX INFO: renamed from: Y */
    public static int m13759Y(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m13760c0(int i10, Object obj, C12211z0 c12211z0) {
        if (!(obj instanceof String)) {
            c12211z0.m14201b(i10, (AbstractC12171m) obj);
        } else {
            ((AbstractC12195u) c12211z0.f37131a).mo14106O0(i10, (String) obj);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m13761l(Object obj) {
        if (!m13764v(obj)) {
            throw new IllegalArgumentException(AbstractC10763a.m11051i(obj, "Mutating immutable message: "));
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m13762m(byte[] bArr, int i10, int i11, EnumC12101J1 enumC12101J1, Class cls, C0138o c0138o) {
        switch (enumC12101J1.ordinal()) {
            case 0:
                c0138o.f577o0 = Double.valueOf(AbstractC12153g.m13972h(i10, bArr));
                return i10 + 8;
            case 1:
                c0138o.f577o0 = Float.valueOf(AbstractC12153g.m13979o(i10, bArr));
                return i10 + 4;
            case 2:
            case 3:
                int iM13957Q = AbstractC12153g.m13957Q(bArr, i10, c0138o);
                c0138o.f577o0 = Long.valueOf(c0138o.f576Z);
                return iM13957Q;
            case 4:
            case 12:
            case 13:
                int iM13955O = AbstractC12153g.m13955O(bArr, i10, c0138o);
                c0138o.f577o0 = Integer.valueOf(c0138o.f575Y);
                return iM13955O;
            case 5:
            case 15:
                c0138o.f577o0 = Long.valueOf(AbstractC12153g.m13977m(i10, bArr));
                return i10 + 8;
            case 6:
            case 14:
                c0138o.f577o0 = Integer.valueOf(AbstractC12153g.m13975k(i10, bArr));
                return i10 + 4;
            case 7:
                int iM13957Q2 = AbstractC12153g.m13957Q(bArr, i10, c0138o);
                c0138o.f577o0 = Boolean.valueOf(c0138o.f576Z != 0);
                return iM13957Q2;
            case 8:
                return AbstractC12153g.m13951I(bArr, i10, c0138o);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return AbstractC12153g.m13983s(C12128W0.f36987c.m13868a(cls), bArr, i10, i11, c0138o);
            case 11:
                return AbstractC12153g.m13970f(bArr, i10, c0138o);
            case 16:
                int iM13955O2 = AbstractC12153g.m13955O(bArr, i10, c0138o);
                c0138o.f577o0 = Integer.valueOf(AbstractC12186r.m14084c(c0138o.f575Y));
                return iM13955O2;
            case 17:
                int iM13957Q3 = AbstractC12153g.m13957Q(bArr, i10, c0138o);
                c0138o.f577o0 = Long.valueOf(AbstractC12186r.m14085d(c0138o.f576Z));
                return iM13957Q3;
        }
    }

    /* JADX INFO: renamed from: r */
    public static C12182p1 m13763r(Object obj) {
        AbstractC12133Z abstractC12133Z = (AbstractC12133Z) obj;
        C12182p1 c12182p1 = abstractC12133Z.unknownFields;
        if (c12182p1 != C12182p1.f37068f) {
            return c12182p1;
        }
        C12182p1 c12182p2 = new C12182p1();
        abstractC12133Z.unknownFields = c12182p2;
        return c12182p2;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m13764v(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC12133Z) {
            return ((AbstractC12133Z) obj).isMutable();
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public static List m13765x(AbstractC12133Z abstractC12133Z, long j10) {
        return (List) AbstractC12209y1.f37124c.m14173k(j10, abstractC12133Z);
    }

    /* JADX INFO: renamed from: A */
    public final void m13766A(Object obj, int i10, Object obj2) {
        if (m13804u(i10, obj2)) {
            long jM13784Z = m13784Z(i10) & 1048575;
            Unsafe unsafe = f36898r;
            Object object = unsafe.getObject(obj2, jM13784Z);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f36899a[i10] + " is present but null: " + obj2);
            }
            InterfaceC12134Z0 interfaceC12134Z0M13801q = m13801q(i10);
            if (!m13804u(i10, obj)) {
                if (m13764v(object)) {
                    AbstractC12133Z abstractC12133ZMo13789c = interfaceC12134Z0M13801q.mo13789c();
                    interfaceC12134Z0M13801q.mo13790d(abstractC12133ZMo13789c, object);
                    unsafe.putObject(obj, jM13784Z, abstractC12133ZMo13789c);
                } else {
                    unsafe.putObject(obj, jM13784Z, object);
                }
                m13779T(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM13784Z);
            if (!m13764v(object2)) {
                AbstractC12133Z abstractC12133ZMo13789c2 = interfaceC12134Z0M13801q.mo13789c();
                interfaceC12134Z0M13801q.mo13790d(abstractC12133ZMo13789c2, object2);
                unsafe.putObject(obj, jM13784Z, abstractC12133ZMo13789c2);
                object2 = abstractC12133ZMo13789c2;
            }
            interfaceC12134Z0M13801q.mo13790d(object2, object);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m13767B(Object obj, int i10, Object obj2) {
        int[] iArr = this.f36899a;
        int i11 = iArr[i10];
        if (m13805w(i11, obj2, i10)) {
            long jM13784Z = m13784Z(i10) & 1048575;
            Unsafe unsafe = f36898r;
            Object object = unsafe.getObject(obj2, jM13784Z);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            InterfaceC12134Z0 interfaceC12134Z0M13801q = m13801q(i10);
            if (!m13805w(i11, obj, i10)) {
                if (m13764v(object)) {
                    AbstractC12133Z abstractC12133ZMo13789c = interfaceC12134Z0M13801q.mo13789c();
                    interfaceC12134Z0M13801q.mo13790d(abstractC12133ZMo13789c, object);
                    unsafe.putObject(obj, jM13784Z, abstractC12133ZMo13789c);
                } else {
                    unsafe.putObject(obj, jM13784Z, object);
                }
                m13780U(i11, obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM13784Z);
            if (!m13764v(object2)) {
                AbstractC12133Z abstractC12133ZMo13789c2 = interfaceC12134Z0M13801q.mo13789c();
                interfaceC12134Z0M13801q.mo13790d(abstractC12133ZMo13789c2, object2);
                unsafe.putObject(obj, jM13784Z, abstractC12133ZMo13789c2);
                object2 = abstractC12133ZMo13789c2;
            }
            interfaceC12134Z0M13801q.mo13790d(object2, object);
        }
    }

    /* JADX INFO: renamed from: C */
    public final Object m13768C(int i10, Object obj) {
        InterfaceC12134Z0 interfaceC12134Z0M13801q = m13801q(i10);
        long jM13784Z = m13784Z(i10) & 1048575;
        if (!m13804u(i10, obj)) {
            return interfaceC12134Z0M13801q.mo13789c();
        }
        Object object = f36898r.getObject(obj, jM13784Z);
        if (m13764v(object)) {
            return object;
        }
        AbstractC12133Z abstractC12133ZMo13789c = interfaceC12134Z0M13801q.mo13789c();
        if (object != null) {
            interfaceC12134Z0M13801q.mo13790d(abstractC12133ZMo13789c, object);
        }
        return abstractC12133ZMo13789c;
    }

    /* JADX INFO: renamed from: D */
    public final Object m13769D(int i10, Object obj, int i11) {
        InterfaceC12134Z0 interfaceC12134Z0M13801q = m13801q(i11);
        if (!m13805w(i10, obj, i11)) {
            return interfaceC12134Z0M13801q.mo13789c();
        }
        Object object = f36898r.getObject(obj, m13784Z(i11) & 1048575);
        if (m13764v(object)) {
            return object;
        }
        AbstractC12133Z abstractC12133ZMo13789c = interfaceC12134Z0M13801q.mo13789c();
        if (object != null) {
            interfaceC12134Z0M13801q.mo13790d(abstractC12133ZMo13789c, object);
        }
        return abstractC12133ZMo13789c;
    }

    /* JADX INFO: renamed from: J */
    public final int m13770J(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, C0138o c0138o) throws C12181p0 {
        Unsafe unsafe = f36898r;
        Object objM13800p = m13800p(i12);
        Object object = unsafe.getObject(obj, j10);
        this.f36914p.getClass();
        if (C12079C0.m13730d(object)) {
            C12076B0 c12076b0M13732f = C12079C0.m13732f();
            C12079C0.m13731e(c12076b0M13732f, object);
            unsafe.putObject(obj, j10, c12076b0M13732f);
            object = c12076b0M13732f;
        }
        C11238i c11238iM13727a = C12079C0.m13727a(objM13800p);
        C12076B0 c12076b0M13728b = C12079C0.m13728b(object);
        int iM13955O = AbstractC12153g.m13955O(bArr, i10, c0138o);
        int i13 = c0138o.f575Y;
        if (i13 < 0 || i13 > i11 - iM13955O) {
            throw C12181p0.m14066g();
        }
        int i14 = iM13955O + i13;
        Object obj2 = c11238iM13727a.f34009Z;
        Object obj3 = c11238iM13727a.f34011p0;
        Object obj4 = obj2;
        Object obj5 = obj3;
        while (iM13955O < i14) {
            int iM13954N = iM13955O + 1;
            int i15 = bArr[iM13955O];
            if (i15 < 0) {
                iM13954N = AbstractC12153g.m13954N(i15, bArr, iM13954N, c0138o);
                i15 = c0138o.f575Y;
            }
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i16 != 1) {
                if (i16 == 2) {
                    EnumC12101J1 enumC12101J1 = (EnumC12101J1) c11238iM13727a.f34010o0;
                    if (i17 == enumC12101J1.f36923Z) {
                        iM13955O = m13762m(bArr, iM13954N, i11, enumC12101J1, obj3.getClass(), c0138o);
                        obj5 = c0138o.f577o0;
                    }
                }
                iM13955O = AbstractC12153g.m13964Z(i15, bArr, iM13954N, i11, c0138o);
            } else {
                EnumC12101J1 enumC12101J2 = (EnumC12101J1) c11238iM13727a.f34008Y;
                if (i17 == enumC12101J2.f36923Z) {
                    iM13955O = m13762m(bArr, iM13954N, i11, enumC12101J2, null, c0138o);
                    obj4 = c0138o.f577o0;
                } else {
                    iM13955O = AbstractC12153g.m13964Z(i15, bArr, iM13954N, i11, c0138o);
                }
            }
        }
        if (iM13955O != i14) {
            throw C12181p0.m14065f();
        }
        c12076b0M13728b.put(obj4, obj5);
        return i14;
    }

    /* JADX INFO: renamed from: K */
    public final int m13771K(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C0138o c0138o) throws C12181p0 {
        Unsafe unsafe = f36898r;
        long j11 = this.f36899a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(AbstractC12153g.m13972h(i10, bArr)));
                int i18 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(AbstractC12153g.m13979o(i10, bArr)));
                int i19 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iM13957Q = AbstractC12153g.m13957Q(bArr, i10, c0138o);
                unsafe.putObject(obj, j10, Long.valueOf(c0138o.f576Z));
                unsafe.putInt(obj, j11, i13);
                return iM13957Q;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iM13955O = AbstractC12153g.m13955O(bArr, i10, c0138o);
                unsafe.putObject(obj, j10, Integer.valueOf(c0138o.f575Y));
                unsafe.putInt(obj, j11, i13);
                return iM13955O;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(AbstractC12153g.m13977m(i10, bArr)));
                int i20 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(AbstractC12153g.m13975k(i10, bArr)));
                int i21 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iM13957Q2 = AbstractC12153g.m13957Q(bArr, i10, c0138o);
                unsafe.putObject(obj, j10, Boolean.valueOf(c0138o.f576Z != 0));
                unsafe.putInt(obj, j11, i13);
                return iM13957Q2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iM13955O2 = AbstractC12153g.m13955O(bArr, i10, c0138o);
                int i22 = c0138o.f575Y;
                if (i22 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !AbstractC12077B1.m13724e(bArr, iM13955O2, iM13955O2 + i22)) {
                        throw C12181p0.m14061b();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iM13955O2, i22, AbstractC12175n0.f37050a));
                    iM13955O2 += i22;
                }
                unsafe.putInt(obj, j11, i13);
                return iM13955O2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objM13769D = m13769D(i13, obj, i17);
                int iM13962W = AbstractC12153g.m13962W(objM13769D, m13801q(i17), bArr, i10, i11, c0138o);
                m13783X(i13, obj, objM13769D, i17);
                return iM13962W;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iM13970f = AbstractC12153g.m13970f(bArr, i10, c0138o);
                unsafe.putObject(obj, j10, c0138o.f577o0);
                unsafe.putInt(obj, j11, i13);
                return iM13970f;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iM13955O3 = AbstractC12153g.m13955O(bArr, i10, c0138o);
                int i23 = c0138o.f575Y;
                m13799o(i17);
                unsafe.putObject(obj, j10, Integer.valueOf(i23));
                unsafe.putInt(obj, j11, i13);
                return iM13955O3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iM13955O4 = AbstractC12153g.m13955O(bArr, i10, c0138o);
                unsafe.putObject(obj, j10, Integer.valueOf(AbstractC12186r.m14084c(c0138o.f575Y)));
                unsafe.putInt(obj, j11, i13);
                return iM13955O4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iM13957Q3 = AbstractC12153g.m13957Q(bArr, i10, c0138o);
                unsafe.putObject(obj, j10, Long.valueOf(AbstractC12186r.m14085d(c0138o.f576Z)));
                unsafe.putInt(obj, j11, i13);
                return iM13957Q3;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                Object objM13769D2 = m13769D(i13, obj, i17);
                int iM13961V = AbstractC12153g.m13961V(objM13769D2, m13801q(i17), bArr, i10, i11, (i12 & (-8)) | 4, c0138o);
                m13783X(i13, obj, objM13769D2, i17);
                return iM13961V;
            default:
                return i10;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11501. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: L */
    public final int m13772L(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, p002A0.C0138o r36) {
        /*
            Method dump skipped, instruction units count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C12100J0.m13772L(java.lang.Object, byte[], int, int, int, A0.o):int");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x009c. Please report as an issue. */
    /* JADX INFO: renamed from: M */
    public final void m13773M(Object obj, byte[] bArr, int i10, int i11, C0138o c0138o) throws C12181p0 {
        int i12;
        int iM13954N;
        int iM13781V;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Unsafe unsafe;
        int i18;
        int i19;
        int iM13957Q;
        int i20;
        int i21;
        int i22;
        C12100J0 c12100j0 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        i11 = i11;
        C0138o c0138o2 = c0138o;
        m13761l(obj);
        Unsafe unsafe2 = f36898r;
        int i23 = 0;
        int iM13952J = i10;
        int i24 = 0;
        int i25 = 0;
        int i26 = -1;
        int i27 = 1048575;
        while (iM13952J < i11) {
            int i28 = iM13952J + 1;
            byte b = bArr2[iM13952J];
            if (b < 0) {
                iM13954N = AbstractC12153g.m13954N(b, bArr2, i28, c0138o2);
                i12 = c0138o2.f575Y;
            } else {
                i12 = b;
                iM13954N = i28;
            }
            int i29 = i12 >>> 3;
            int i30 = i12 & 7;
            int i31 = c12100j0.f36902d;
            int i32 = c12100j0.f36901c;
            if (i29 > i26) {
                int i33 = i24 / 3;
                if (i29 < i32 || i29 > i31) {
                    iM13781V = -1;
                } else {
                    iM13781V = c12100j0.m13781V(i29, i33);
                }
            } else if (i29 < i32 || i29 > i31) {
                iM13781V = -1;
            } else {
                iM13781V = c12100j0.m13781V(i29, i23);
            }
            i24 = iM13781V;
            if (i24 == -1) {
                i13 = i29;
                i14 = iM13954N;
                i15 = i25;
                i16 = i23;
                i17 = i16;
                unsafe = unsafe2;
            } else {
                int[] iArr = c12100j0.f36899a;
                int i34 = iArr[i24 + 1];
                int iM13759Y = m13759Y(i34);
                i13 = i29;
                int i35 = iM13954N;
                long j10 = i34 & 1048575;
                if (iM13759Y <= 17) {
                    int i36 = iArr[i24 + 2];
                    int i37 = 1 << (i36 >>> 20);
                    int i38 = i36 & 1048575;
                    if (i38 != i27) {
                        if (i27 != 1048575) {
                            unsafe2.putInt(obj2, i27, i25);
                        }
                        if (i38 != 1048575) {
                            i25 = unsafe2.getInt(obj2, i38);
                        }
                        i18 = i38;
                    } else {
                        i18 = i27;
                    }
                    int i39 = i25;
                    switch (iM13759Y) {
                        case 0:
                            i19 = i35;
                            if (i30 != 1) {
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                AbstractC12209y1.m14195r(obj2, j10, AbstractC12153g.m13972h(i19, bArr2));
                                iM13952J = i19 + 8;
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 1:
                            i19 = i35;
                            if (i30 != 5) {
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                AbstractC12209y1.m14196s(obj2, j10, AbstractC12153g.m13979o(i19, bArr2));
                                iM13952J = i19 + 4;
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 2:
                        case 3:
                            i19 = i35;
                            if (i30 != 0) {
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iM13957Q = AbstractC12153g.m13957Q(bArr2, i19, c0138o2);
                                unsafe2.putLong(obj, j10, c0138o2.f576Z);
                                i25 = i39 | i37;
                                i27 = i18;
                                iM13952J = iM13957Q;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 4:
                        case 11:
                            i19 = i35;
                            if (i30 != 0) {
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iM13952J = AbstractC12153g.m13955O(bArr2, i19, c0138o2);
                                unsafe2.putInt(obj2, j10, c0138o2.f575Y);
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 5:
                        case 14:
                            i20 = i35;
                            if (i30 != 1) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                i19 = i20;
                                unsafe2.putLong(obj, j10, AbstractC12153g.m13977m(i20, bArr2));
                                iM13952J = i19 + 8;
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 6:
                        case 13:
                            i20 = i35;
                            if (i30 != 5) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                unsafe2.putInt(obj2, j10, AbstractC12153g.m13975k(i20, bArr2));
                                iM13952J = i20 + 4;
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 7:
                            i20 = i35;
                            if (i30 != 0) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iM13952J = AbstractC12153g.m13957Q(bArr2, i20, c0138o2);
                                AbstractC12209y1.m14191n(obj2, j10, c0138o2.f576Z != 0);
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 8:
                            i20 = i35;
                            if (i30 != 2) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iM13952J = (536870912 & i34) == 0 ? AbstractC12153g.m13948F(bArr2, i20, c0138o2) : AbstractC12153g.m13951I(bArr2, i20, c0138o2);
                                unsafe2.putObject(obj2, j10, c0138o2.f577o0);
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 9:
                            i20 = i35;
                            if (i30 != 2) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                Object objM13768C = c12100j0.m13768C(i24, obj2);
                                iM13952J = AbstractC12153g.m13962W(objM13768C, c12100j0.m13801q(i24), bArr, i20, i11, c0138o);
                                c12100j0.m13782W(obj2, i24, objM13768C);
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 10:
                            i20 = i35;
                            if (i30 != 2) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iM13952J = AbstractC12153g.m13970f(bArr2, i20, c0138o2);
                                unsafe2.putObject(obj2, j10, c0138o2.f577o0);
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 12:
                            i20 = i35;
                            if (i30 != 0) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iM13952J = AbstractC12153g.m13955O(bArr2, i20, c0138o2);
                                unsafe2.putInt(obj2, j10, c0138o2.f575Y);
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 15:
                            i20 = i35;
                            if (i30 != 0) {
                                i19 = i20;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iM13952J = AbstractC12153g.m13955O(bArr2, i20, c0138o2);
                                unsafe2.putInt(obj2, j10, AbstractC12186r.m14084c(c0138o2.f575Y));
                                i25 = i39 | i37;
                                i27 = i18;
                                i24 = i24;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 16:
                            if (i30 != 0) {
                                i19 = i35;
                                i15 = i39;
                                i27 = i18;
                                i16 = i24;
                                unsafe = unsafe2;
                                i14 = i19;
                                i17 = 0;
                            } else {
                                iM13957Q = AbstractC12153g.m13957Q(bArr2, i35, c0138o2);
                                unsafe2.putLong(obj, j10, AbstractC12186r.m14085d(c0138o2.f576Z));
                                i25 = i39 | i37;
                                i27 = i18;
                                iM13952J = iM13957Q;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        default:
                            i19 = i35;
                            i15 = i39;
                            i27 = i18;
                            i16 = i24;
                            unsafe = unsafe2;
                            i14 = i19;
                            i17 = 0;
                            break;
                    }
                } else {
                    if (iM13759Y != 27) {
                        int i40 = i27;
                        int i41 = i25;
                        if (iM13759Y <= 49) {
                            i22 = i40;
                            i15 = i41;
                            i16 = i24;
                            i17 = 0;
                            unsafe = unsafe2;
                            iM13952J = m13774N(obj, bArr, i35, i11, i12, i30, i24, i34, iM13759Y, j10, c0138o);
                            if (iM13952J != i35) {
                                obj2 = obj;
                                bArr2 = bArr;
                                c0138o2 = c0138o;
                                i27 = i22;
                                i24 = i16;
                                i26 = i13;
                                i23 = i17;
                                i25 = i15;
                                unsafe2 = unsafe;
                                c12100j0 = this;
                            } else {
                                i14 = iM13952J;
                                i27 = i22;
                            }
                        } else {
                            i22 = i40;
                            i15 = i41;
                            i21 = i35;
                            i16 = i24;
                            unsafe = unsafe2;
                            i17 = 0;
                            if (iM13759Y != 50) {
                                iM13952J = m13771K(obj, bArr, i21, i11, i12, i13, i30, i34, iM13759Y, j10, i16, c0138o);
                                if (iM13952J != i21) {
                                    obj2 = obj;
                                    bArr2 = bArr;
                                    c0138o2 = c0138o;
                                    i27 = i22;
                                    i24 = i16;
                                    i26 = i13;
                                    i23 = i17;
                                    i25 = i15;
                                    unsafe2 = unsafe;
                                    c12100j0 = this;
                                } else {
                                    i14 = iM13952J;
                                    i27 = i22;
                                }
                            } else if (i30 == 2) {
                                iM13952J = m13770J(obj, bArr, i21, i11, i16, j10, c0138o);
                                if (iM13952J != i21) {
                                    obj2 = obj;
                                    bArr2 = bArr;
                                    c0138o2 = c0138o;
                                    i27 = i22;
                                    i24 = i16;
                                    i26 = i13;
                                    i23 = i17;
                                    i25 = i15;
                                    unsafe2 = unsafe;
                                    c12100j0 = this;
                                } else {
                                    i14 = iM13952J;
                                    i27 = i22;
                                }
                            }
                        }
                    } else if (i30 == 2) {
                        AbstractC12141c abstractC12141c = (AbstractC12141c) ((InterfaceC12172m0) unsafe2.getObject(obj2, j10));
                        boolean zM13937i = abstractC12141c.m13937i();
                        AbstractC12141c abstractC12141c2 = abstractC12141c;
                        if (!zM13937i) {
                            int size = abstractC12141c.size();
                            InterfaceC12172m0 interfaceC12172m0Mo13855b = abstractC12141c.mo13855b(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(obj2, j10, interfaceC12172m0Mo13855b);
                            abstractC12141c2 = interfaceC12172m0Mo13855b;
                        }
                        iM13952J = AbstractC12153g.m13984t(c12100j0.m13801q(i24), i12, bArr, i35, i11, abstractC12141c2, c0138o);
                        i25 = i25;
                        i27 = i27;
                        i26 = i13;
                        i23 = 0;
                    } else {
                        i15 = i25;
                        i21 = i35;
                        i16 = i24;
                        unsafe = unsafe2;
                        i22 = i27;
                        i17 = 0;
                    }
                    i27 = i22;
                    i14 = i21;
                }
            }
            iM13952J = AbstractC12153g.m13952J(i12, bArr, i14, i11, m13763r(obj), c0138o);
            c12100j0 = this;
            obj2 = obj;
            bArr2 = bArr;
            c0138o2 = c0138o;
            i24 = i16;
            i26 = i13;
            i23 = i17;
            i25 = i15;
            unsafe2 = unsafe;
        }
        int i42 = i25;
        int i43 = i27;
        Unsafe unsafe3 = unsafe2;
        if (i43 != 1048575) {
            unsafe3.putInt(obj, i43, i42);
        }
        if (iM13952J != i11) {
            throw C12181p0.m14065f();
        }
    }

    /* JADX INFO: renamed from: N */
    public final int m13774N(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, long j10, int i15, long j11, C0138o c0138o) throws C12181p0 {
        int iM13956P;
        Unsafe unsafe = f36898r;
        AbstractC12141c abstractC12141c = (AbstractC12141c) ((InterfaceC12172m0) unsafe.getObject(obj, j11));
        boolean zM13937i = abstractC12141c.m13937i();
        AbstractC12141c abstractC12141c2 = abstractC12141c;
        if (!zM13937i) {
            int size = abstractC12141c.size();
            InterfaceC12172m0 interfaceC12172m0Mo13855b = abstractC12141c.mo13855b(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j11, interfaceC12172m0Mo13855b);
            abstractC12141c2 = interfaceC12172m0Mo13855b;
        }
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    return AbstractC12153g.m13986v(bArr, i10, abstractC12141c2, c0138o);
                }
                return i13 == 1 ? AbstractC12153g.m13973i(i12, bArr, i10, i11, abstractC12141c2, c0138o) : i10;
            case 19:
            case 36:
                if (i13 == 2) {
                    return AbstractC12153g.m13989y(bArr, i10, abstractC12141c2, c0138o);
                }
                return i13 == 5 ? AbstractC12153g.m13980p(i12, bArr, i10, i11, abstractC12141c2, c0138o) : i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 == 2) {
                    return AbstractC12153g.m13945C(bArr, i10, abstractC12141c2, c0138o);
                }
                return i13 == 0 ? AbstractC12153g.m13958R(i12, bArr, i10, i11, abstractC12141c2, c0138o) : i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return AbstractC12153g.m13944B(bArr, i10, abstractC12141c2, c0138o);
                }
                return i13 == 0 ? AbstractC12153g.m13956P(i12, bArr, i10, i11, abstractC12141c2, c0138o) : i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    return AbstractC12153g.m13988x(bArr, i10, abstractC12141c2, c0138o);
                }
                return i13 == 1 ? AbstractC12153g.m13978n(i12, bArr, i10, i11, abstractC12141c2, c0138o) : i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    return AbstractC12153g.m13987w(bArr, i10, abstractC12141c2, c0138o);
                }
                return i13 == 5 ? AbstractC12153g.m13976l(i12, bArr, i10, i11, abstractC12141c2, c0138o) : i10;
            case 25:
            case 42:
                if (i13 == 2) {
                    return AbstractC12153g.m13985u(bArr, i10, abstractC12141c2, c0138o);
                }
                return i13 == 0 ? AbstractC12153g.m13969e(i12, bArr, i10, i11, abstractC12141c2, c0138o) : i10;
            case 26:
                if (i13 == 2) {
                    return (j10 & 536870912) == 0 ? AbstractC12153g.m13949G(i12, bArr, i10, i11, abstractC12141c2, c0138o) : AbstractC12153g.m13950H(i12, bArr, i10, i11, abstractC12141c2, c0138o);
                }
                return i10;
            case 27:
                return i13 == 2 ? AbstractC12153g.m13984t(m13801q(i14), i12, bArr, i10, i11, abstractC12141c2, c0138o) : i10;
            case 28:
                return i13 == 2 ? AbstractC12153g.m13971g(i12, bArr, i10, i11, abstractC12141c2, c0138o) : i10;
            case 30:
            case 44:
                if (i13 == 2) {
                    iM13956P = AbstractC12153g.m13944B(bArr, i10, abstractC12141c2, c0138o);
                } else {
                    if (i13 != 0) {
                        return i10;
                    }
                    iM13956P = AbstractC12153g.m13956P(i12, bArr, i10, i11, abstractC12141c2, c0138o);
                }
                m13799o(i14);
                Class cls = AbstractC12137a1.f37010a;
                return iM13956P;
            case 33:
            case 47:
                if (i13 == 2) {
                    return AbstractC12153g.m13990z(bArr, i10, abstractC12141c2, c0138o);
                }
                return i13 == 0 ? AbstractC12153g.m13946D(i12, bArr, i10, i11, abstractC12141c2, c0138o) : i10;
            case 34:
            case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                if (i13 == 2) {
                    return AbstractC12153g.m13943A(bArr, i10, abstractC12141c2, c0138o);
                }
                return i13 == 0 ? AbstractC12153g.m13947E(i12, bArr, i10, i11, abstractC12141c2, c0138o) : i10;
            case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                return i13 == 3 ? AbstractC12153g.m13982r(m13801q(i14), i12, bArr, i10, i11, abstractC12141c2, c0138o) : i10;
            default:
                return i10;
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m13775O(Object obj, long j10, C6277D c6277d, InterfaceC12134Z0 interfaceC12134Z0, C12087F c12087f) throws C12178o0 {
        int iMo14019E;
        List listMo14127c = this.f36911m.mo14127c(j10, obj);
        int i10 = c6277d.f20382b;
        if ((i10 & 7) != 3) {
            throw C12181p0.m14062c();
        }
        do {
            AbstractC12133Z abstractC12133ZMo13789c = interfaceC12134Z0.mo13789c();
            c6277d.m6804g(abstractC12133ZMo13789c, interfaceC12134Z0, c12087f);
            interfaceC12134Z0.mo13785a(abstractC12133ZMo13789c);
            listMo14127c.add(abstractC12133ZMo13789c);
            AbstractC12186r abstractC12186r = (AbstractC12186r) c6277d.f20385e;
            if (abstractC12186r.mo14032g() || c6277d.f20384d != 0) {
                return;
            } else {
                iMo14019E = abstractC12186r.mo14019E();
            }
        } while (iMo14019E == i10);
        c6277d.f20384d = iMo14019E;
    }

    /* JADX INFO: renamed from: P */
    public final void m13776P(Object obj, int i10, C6277D c6277d, InterfaceC12134Z0 interfaceC12134Z0, C12087F c12087f) throws C12181p0 {
        int iMo14019E;
        List listMo14127c = this.f36911m.mo14127c(i10 & 1048575, obj);
        int i11 = c6277d.f20382b;
        if ((i11 & 7) != 2) {
            throw C12181p0.m14062c();
        }
        do {
            AbstractC12133Z abstractC12133ZMo13789c = interfaceC12134Z0.mo13789c();
            c6277d.m6808i(abstractC12133ZMo13789c, interfaceC12134Z0, c12087f);
            interfaceC12134Z0.mo13785a(abstractC12133ZMo13789c);
            listMo14127c.add(abstractC12133ZMo13789c);
            AbstractC12186r abstractC12186r = (AbstractC12186r) c6277d.f20385e;
            if (abstractC12186r.mo14032g() || c6277d.f20384d != 0) {
                return;
            } else {
                iMo14019E = abstractC12186r.mo14019E();
            }
        } while (iMo14019E == i11);
        c6277d.f20384d = iMo14019E;
    }

    /* JADX INFO: renamed from: Q */
    public final void m13777Q(int i10, C6277D c6277d, Object obj) throws C11064z, C12178o0 {
        if ((536870912 & i10) != 0) {
            c6277d.m6829s0(2);
            AbstractC12209y1.m14199v(i10 & 1048575, obj, ((AbstractC12186r) c6277d.f20385e).mo14018D());
        } else if (!this.f36905g) {
            AbstractC12209y1.m14199v(i10 & 1048575, obj, c6277d.m6820o());
        } else {
            c6277d.m6829s0(2);
            AbstractC12209y1.m14199v(i10 & 1048575, obj, ((AbstractC12186r) c6277d.f20385e).mo14017C());
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m13778R(int i10, C6277D c6277d, Object obj) throws C10995y, C11064z, C12178o0 {
        boolean z6 = (536870912 & i10) != 0;
        AbstractC12199v0 abstractC12199v0 = this.f36911m;
        if (z6) {
            c6277d.m6807h0(abstractC12199v0.mo14127c(i10 & 1048575, obj), true);
        } else {
            c6277d.m6807h0(abstractC12199v0.mo14127c(i10 & 1048575, obj), false);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m13779T(int i10, Object obj) {
        int i11 = this.f36899a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        AbstractC12209y1.m14197t(j10, obj, (1 << (i11 >>> 20)) | AbstractC12209y1.f37124c.m14171i(j10, obj));
    }

    /* JADX INFO: renamed from: U */
    public final void m13780U(int i10, Object obj, int i11) {
        AbstractC12209y1.m14197t(this.f36899a[i11 + 2] & 1048575, obj, i10);
    }

    /* JADX INFO: renamed from: V */
    public final int m13781V(int i10, int i11) {
        int[] iArr = this.f36899a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: W */
    public final void m13782W(Object obj, int i10, Object obj2) {
        f36898r.putObject(obj, m13784Z(i10) & 1048575, obj2);
        m13779T(i10, obj);
    }

    /* JADX INFO: renamed from: X */
    public final void m13783X(int i10, Object obj, Object obj2, int i11) {
        f36898r.putObject(obj, m13784Z(i11) & 1048575, obj2);
        m13780U(i10, obj, i11);
    }

    /* JADX INFO: renamed from: Z */
    public final int m13784Z(int i10) {
        return this.f36899a[i10 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f A[SYNTHETIC] */
    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: a */
    public final void mo13785a(Object obj) {
        if (m13764v(obj)) {
            if (obj instanceof AbstractC12133Z) {
                AbstractC12133Z abstractC12133Z = (AbstractC12133Z) obj;
                abstractC12133Z.clearMemoizedSerializedSize();
                abstractC12133Z.clearMemoizedHashCode();
                abstractC12133Z.markImmutable();
            }
            int length = this.f36899a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iM13784Z = m13784Z(i10);
                long j10 = 1048575 & iM13784Z;
                int iM13759Y = m13759Y(iM13784Z);
                if (iM13759Y != 9) {
                    switch (iM13759Y) {
                        case 17:
                            if (m13804u(i10, obj)) {
                                m13801q(i10).mo13785a(f36898r.getObject(obj, j10));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                        case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                            this.f36911m.mo14125a(j10, obj);
                            break;
                        case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                            Unsafe unsafe = f36898r;
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                this.f36914p.getClass();
                                C12079C0.m13733g(object);
                                unsafe.putObject(obj, j10, object);
                            }
                            break;
                    }
                } else if (m13804u(i10, obj)) {
                    m13801q(i10).mo13785a(f36898r.getObject(obj, j10));
                }
            }
            this.f36912n.getClass();
            C12185q1.m14081b(obj);
            if (this.f36904f) {
                this.f36913o.getClass();
                C12090G.m13744e(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX INFO: renamed from: a0 */
    public final void m13786a0(Object obj, C12211z0 c12211z0) {
        Iterator itM13849l;
        Map.Entry entry;
        int i10;
        int i11;
        Unsafe unsafe;
        boolean z6;
        boolean z10 = this.f36904f;
        C12090G c12090g = this.f36913o;
        if (z10) {
            c12090g.getClass();
            C12110N c12110nM13742c = C12090G.m13742c(obj);
            if (c12110nM13742c.m13847i()) {
                itM13849l = null;
                entry = null;
            } else {
                itM13849l = c12110nM13742c.m13849l();
                entry = (Map.Entry) itM13849l.next();
            }
        } else {
            itM13849l = null;
            entry = null;
        }
        int[] iArr = this.f36899a;
        int length = iArr.length;
        Unsafe unsafe2 = f36898r;
        int i12 = 0;
        int i13 = 1048575;
        int i14 = 0;
        while (i12 < length) {
            int iM13784Z = m13784Z(i12);
            int i15 = iArr[i12];
            int iM13759Y = m13759Y(iM13784Z);
            entry = entry;
            if (iM13759Y <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & 1048575;
                if (i17 != i13) {
                    i14 = unsafe2.getInt(obj, i17);
                    i13 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            while (true) {
                if (entry != null) {
                    c12090g.getClass();
                    i11 = length;
                    if (C12090G.m13740a(entry) <= i15) {
                        C12090G.m13746g(c12211z0, entry);
                        entry = itM13849l.hasNext() ? (Map.Entry) itM13849l.next() : null;
                        length = i11;
                    }
                } else {
                    i11 = length;
                }
            }
            Unsafe unsafe3 = unsafe2;
            long j10 = iM13784Z & 1048575;
            switch (iM13759Y) {
                case 0:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14202c(i15, AbstractC12209y1.f37124c.mo14159g(j10, obj));
                    }
                    break;
                case 1:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14206g(i15, AbstractC12209y1.f37124c.mo14160h(j10, obj));
                    }
                    break;
                case 2:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14209j(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 3:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14216q(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 4:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14208i(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 5:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14205f(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 6:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14204e(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 7:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14200a(i15, AbstractC12209y1.f37124c.mo14156d(j10, obj));
                    }
                    break;
                case 8:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        m13760c0(i15, unsafe.getObject(obj, j10), c12211z0);
                    }
                    break;
                case 9:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14210k(i15, unsafe.getObject(obj, j10), m13801q(i12));
                    }
                    break;
                case 10:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14201b(i15, (AbstractC12171m) unsafe.getObject(obj, j10));
                    }
                    break;
                case 11:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14215p(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 12:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14203d(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 13:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14211l(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 14:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14212m(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 15:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14213n(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 16:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14214o(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 17:
                    unsafe = unsafe3;
                    if ((i10 & i14) != 0) {
                        c12211z0.m14207h(i15, unsafe.getObject(obj, j10), m13801q(i12));
                    }
                    break;
                case 18:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13886G(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, false);
                    break;
                case 19:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13890K(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, false);
                    break;
                case 20:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13893N(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, false);
                    break;
                case 21:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13901V(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, false);
                    break;
                case 22:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13892M(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, false);
                    break;
                case 23:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13889J(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, false);
                    break;
                case 24:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13888I(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, false);
                    break;
                case 25:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13884E(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, false);
                    break;
                case 26:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13899T(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0);
                    break;
                case 27:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13894O(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, m13801q(i12));
                    break;
                case 28:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13885F(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0);
                    break;
                case 29:
                    unsafe = unsafe3;
                    z6 = false;
                    AbstractC12137a1.m13900U(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, false);
                    break;
                case 30:
                    unsafe = unsafe3;
                    z6 = false;
                    AbstractC12137a1.m13887H(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, false);
                    break;
                case 31:
                    unsafe = unsafe3;
                    z6 = false;
                    AbstractC12137a1.m13895P(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, false);
                    break;
                case 32:
                    unsafe = unsafe3;
                    z6 = false;
                    AbstractC12137a1.m13896Q(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, false);
                    break;
                case 33:
                    unsafe = unsafe3;
                    z6 = false;
                    AbstractC12137a1.m13897R(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, false);
                    break;
                case 34:
                    unsafe = unsafe3;
                    z6 = false;
                    AbstractC12137a1.m13898S(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, false);
                    break;
                case 35:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13886G(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, true);
                    break;
                case 36:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13890K(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, true);
                    break;
                case 37:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13893N(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, true);
                    break;
                case 38:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13901V(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, true);
                    break;
                case 39:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13892M(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, true);
                    break;
                case 40:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13889J(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, true);
                    break;
                case 41:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13888I(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, true);
                    break;
                case 42:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13884E(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, true);
                    break;
                case 43:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13900U(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, true);
                    break;
                case 44:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13887H(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, true);
                    break;
                case 45:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13895P(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, true);
                    break;
                case 46:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13896Q(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, true);
                    break;
                case 47:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13897R(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, true);
                    break;
                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13898S(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, true);
                    break;
                case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                    unsafe = unsafe3;
                    AbstractC12137a1.m13891L(iArr[i12], (List) unsafe.getObject(obj, j10), c12211z0, m13801q(i12));
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    unsafe = unsafe3;
                    m13788b0(c12211z0, i15, unsafe.getObject(obj, j10), i12);
                    break;
                case 51:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14202c(i15, ((Double) AbstractC12209y1.f37124c.m14173k(j10, obj)).doubleValue());
                    }
                    break;
                case 52:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14206g(i15, ((Float) AbstractC12209y1.f37124c.m14173k(j10, obj)).floatValue());
                    }
                    break;
                case 53:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14209j(i15, m13757I(j10, obj));
                    }
                    break;
                case 54:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14216q(i15, m13757I(j10, obj));
                    }
                    break;
                case 55:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14208i(i15, m13756H(j10, obj));
                    }
                    break;
                case 56:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14205f(i15, m13757I(j10, obj));
                    }
                    break;
                case 57:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14204e(i15, m13756H(j10, obj));
                    }
                    break;
                case 58:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14200a(i15, ((Boolean) AbstractC12209y1.f37124c.m14173k(j10, obj)).booleanValue());
                    }
                    break;
                case 59:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        m13760c0(i15, unsafe.getObject(obj, j10), c12211z0);
                    }
                    break;
                case 60:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14210k(i15, unsafe.getObject(obj, j10), m13801q(i12));
                    }
                    break;
                case 61:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14201b(i15, (AbstractC12171m) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14215p(i15, m13756H(j10, obj));
                    }
                    break;
                case 63:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14203d(i15, m13756H(j10, obj));
                    }
                    break;
                case 64:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14211l(i15, m13756H(j10, obj));
                    }
                    break;
                case 65:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14212m(i15, m13757I(j10, obj));
                    }
                    break;
                case 66:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14213n(i15, m13756H(j10, obj));
                    }
                    break;
                case 67:
                    unsafe = unsafe3;
                    if (m13805w(i15, obj, i12)) {
                        c12211z0.m14214o(i15, m13757I(j10, obj));
                    }
                    break;
                case 68:
                    if (m13805w(i15, obj, i12)) {
                        unsafe = unsafe3;
                        c12211z0.m14207h(i15, unsafe.getObject(obj, j10), m13801q(i12));
                    }
                default:
                    unsafe = unsafe3;
                    break;
            }
            i12 += 3;
            unsafe2 = unsafe;
            length = i11;
        }
        while (entry != null) {
            c12090g.getClass();
            C12090G.m13746g(c12211z0, entry);
            entry = itM13849l.hasNext() ? (Map.Entry) itM13849l.next() : null;
        }
        this.f36912n.getClass();
        ((AbstractC12133Z) obj).unknownFields.m14073g(c12211z0);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fa A[LOOP:2: B:59:0x00e9->B:64:0x00fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x011f A[SYNTHETIC] */
    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: b */
    public final boolean mo13787b(Object obj) {
        List list;
        InterfaceC12134Z0 interfaceC12134Z0M13801q;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean zM13804u = true;
            if (i12 >= this.f36908j) {
                if (this.f36904f) {
                    this.f36913o.getClass();
                    if (!C12090G.m13742c(obj).m13848j()) {
                        return false;
                    }
                }
                return true;
            }
            int i14 = this.f36907i[i12];
            int[] iArr = this.f36899a;
            int i15 = iArr[i14];
            int iM13784Z = m13784Z(i14);
            int i16 = iArr[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i11) {
                if (i17 != 1048575) {
                    i13 = f36898r.getInt(obj, i17);
                }
                i11 = i17;
            }
            if ((268435456 & iM13784Z) != 0) {
                if (!(i11 == 1048575 ? m13804u(i14, obj) : (i13 & i18) != 0)) {
                    return false;
                }
            }
            int iM13759Y = m13759Y(iM13784Z);
            if (iM13759Y == 9 || iM13759Y == 17) {
                if (i11 == 1048575) {
                    zM13804u = m13804u(i14, obj);
                } else if ((i18 & i13) == 0) {
                    zM13804u = false;
                }
                if (zM13804u) {
                    if (!m13801q(i14).mo13787b(AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iM13759Y == 27) {
                list = (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC12134Z0M13801q = m13801q(i14);
                    for (i10 = 0; i10 < list.size(); i10++) {
                        if (!interfaceC12134Z0M13801q.mo13787b(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (iM13759Y == 60 || iM13759Y == 68) {
                if (m13805w(i15, obj, i14)) {
                    if (!m13801q(i14).mo13787b(AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iM13759Y == 49) {
                list = (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC12134Z0M13801q = m13801q(i14);
                    while (i10 < list.size()) {
                        if (!interfaceC12134Z0M13801q.mo13787b(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (iM13759Y != 50) {
                continue;
            } else {
                Object objM14173k = AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj);
                this.f36914p.getClass();
                C12076B0 c12076b0 = (C12076B0) objM14173k;
                if (!c12076b0.isEmpty() && ((EnumC12101J1) ((C12073A0) m13800p(i14)).f36865a.f34010o0).f36922Y == EnumC12104K1.MESSAGE) {
                    InterfaceC12134Z0 interfaceC12134Z0M13868a = null;
                    for (Object obj2 : c12076b0.values()) {
                        if (interfaceC12134Z0M13868a == null) {
                            interfaceC12134Z0M13868a = C12128W0.f36987c.m13868a(obj2.getClass());
                        }
                        if (!interfaceC12134Z0M13868a.mo13787b(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i12++;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m13788b0(C12211z0 c12211z0, int i10, Object obj, int i11) {
        if (obj != null) {
            Object objM13800p = m13800p(i11);
            this.f36914p.getClass();
            C11238i c11238i = ((C12073A0) objM13800p).f36865a;
            AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
            abstractC12195u.getClass();
            for (Map.Entry entry : ((C12076B0) obj).entrySet()) {
                abstractC12195u.mo14108Q0(i10, 2);
                Object key = entry.getKey();
                Object value = entry.getValue();
                EnumC12101J1 enumC12101J1 = (EnumC12101J1) c11238i.f34008Y;
                int iM13836c = C12110N.m13836c(enumC12101J1, 1, key);
                EnumC12101J1 enumC12101J2 = (EnumC12101J1) c11238i.f34010o0;
                abstractC12195u.mo14110S0(C12110N.m13836c(enumC12101J2, 2, value) + iM13836c);
                Object key2 = entry.getKey();
                Object value2 = entry.getValue();
                C12110N.m13842r(abstractC12195u, enumC12101J1, 1, key2);
                C12110N.m13842r(abstractC12195u, enumC12101J2, 2, value2);
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: c */
    public final AbstractC12133Z mo13789c() {
        this.f36910l.getClass();
        return ((AbstractC12133Z) this.f36903e).newMutableInstance();
    }

    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: d */
    public final void mo13790d(Object obj, Object obj2) {
        m13761l(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f36899a;
            if (i10 >= iArr.length) {
                AbstractC12137a1.m13882C(this.f36912n, obj, obj2);
                if (this.f36904f) {
                    this.f36913o.getClass();
                    C12110N c12110n = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
                    if (c12110n.f36962a.isEmpty()) {
                        return;
                    }
                    ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().m13851n(c12110n);
                    return;
                }
                return;
            }
            int iM13784Z = m13784Z(i10);
            long j10 = 1048575 & iM13784Z;
            int i11 = iArr[i10];
            switch (m13759Y(iM13784Z)) {
                case 0:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14195r(obj, j10, AbstractC12209y1.f37124c.mo14159g(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 1:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14196s(obj, j10, AbstractC12209y1.f37124c.mo14160h(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 2:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14198u(obj, j10, AbstractC12209y1.f37124c.m14172j(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 3:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14198u(obj, j10, AbstractC12209y1.f37124c.m14172j(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 4:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14197t(j10, obj, AbstractC12209y1.f37124c.m14171i(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 5:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14198u(obj, j10, AbstractC12209y1.f37124c.m14172j(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 6:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14197t(j10, obj, AbstractC12209y1.f37124c.m14171i(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 7:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14191n(obj, j10, AbstractC12209y1.f37124c.mo14156d(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 8:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14199v(j10, obj, AbstractC12209y1.f37124c.m14173k(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 9:
                    m13766A(obj, i10, obj2);
                    break;
                case 10:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14199v(j10, obj, AbstractC12209y1.f37124c.m14173k(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 11:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14197t(j10, obj, AbstractC12209y1.f37124c.m14171i(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 12:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14197t(j10, obj, AbstractC12209y1.f37124c.m14171i(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 13:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14197t(j10, obj, AbstractC12209y1.f37124c.m14171i(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 14:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14198u(obj, j10, AbstractC12209y1.f37124c.m14172j(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 15:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14197t(j10, obj, AbstractC12209y1.f37124c.m14171i(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 16:
                    if (m13804u(i10, obj2)) {
                        AbstractC12209y1.m14198u(obj, j10, AbstractC12209y1.f37124c.m14172j(j10, obj2));
                        m13779T(i10, obj);
                    }
                    break;
                case 17:
                    m13766A(obj, i10, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                    this.f36911m.mo14126b(j10, obj, obj2);
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    Class cls = AbstractC12137a1.f37010a;
                    AbstractC12206x1 abstractC12206x1 = AbstractC12209y1.f37124c;
                    Object objM14173k = abstractC12206x1.m14173k(j10, obj);
                    Object objM14173k2 = abstractC12206x1.m14173k(j10, obj2);
                    this.f36914p.getClass();
                    AbstractC12209y1.m14199v(j10, obj, C12079C0.m13731e(objM14173k, objM14173k2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m13805w(i11, obj2, i10)) {
                        AbstractC12209y1.m14199v(j10, obj, AbstractC12209y1.f37124c.m14173k(j10, obj2));
                        m13780U(i11, obj, i10);
                    }
                    break;
                case 60:
                    m13767B(obj, i10, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m13805w(i11, obj2, i10)) {
                        AbstractC12209y1.m14199v(j10, obj, AbstractC12209y1.f37124c.m14173k(j10, obj2));
                        m13780U(i11, obj, i10);
                    }
                    break;
                case 68:
                    m13767B(obj, i10, obj2);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0387  */
    /* JADX WARN: Code duplicated, block: B:101:0x039f  */
    /* JADX WARN: Code duplicated, block: B:102:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:103:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:104:0x03db  */
    /* JADX WARN: Code duplicated, block: B:105:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:106:0x0403  */
    /* JADX WARN: Code duplicated, block: B:107:0x0417  */
    /* JADX WARN: Code duplicated, block: B:108:0x042b  */
    /* JADX WARN: Code duplicated, block: B:109:0x043f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0453  */
    /* JADX WARN: Code duplicated, block: B:112:0x045b  */
    /* JADX WARN: Code duplicated, block: B:113:0x046d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0475  */
    /* JADX WARN: Code duplicated, block: B:116:0x0483  */
    /* JADX WARN: Code duplicated, block: B:118:0x048b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0499  */
    /* JADX WARN: Code duplicated, block: B:121:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:122:0x04af  */
    /* JADX WARN: Code duplicated, block: B:124:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:125:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:127:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:128:0x04db  */
    /* JADX WARN: Code duplicated, block: B:130:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:131:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:133:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:134:0x0509  */
    /* JADX WARN: Code duplicated, block: B:136:0x0511  */
    /* JADX WARN: Code duplicated, block: B:137:0x0523  */
    /* JADX WARN: Code duplicated, block: B:139:0x052b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0539  */
    /* JADX WARN: Code duplicated, block: B:142:0x0541  */
    /* JADX WARN: Code duplicated, block: B:143:0x054f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0557  */
    /* JADX WARN: Code duplicated, block: B:146:0x0565  */
    /* JADX WARN: Code duplicated, block: B:148:0x056d  */
    /* JADX WARN: Code duplicated, block: B:149:0x057a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0582  */
    /* JADX WARN: Code duplicated, block: B:152:0x058f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0597  */
    /* JADX WARN: Code duplicated, block: B:155:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:157:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:158:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:160:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:161:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:163:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:207:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:241:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0115  */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x013b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0141  */
    /* JADX WARN: Code duplicated, block: B:59:0x014c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0152  */
    /* JADX WARN: Code duplicated, block: B:62:0x015d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0163  */
    /* JADX WARN: Code duplicated, block: B:65:0x016e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0174  */
    /* JADX WARN: Code duplicated, block: B:68:0x017f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x0190  */
    /* JADX WARN: Code duplicated, block: B:73:0x0196  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01af  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x020b  */
    /* JADX WARN: Code duplicated, block: B:82:0x021f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0233  */
    /* JADX WARN: Code duplicated, block: B:84:0x0247  */
    /* JADX WARN: Code duplicated, block: B:85:0x025b  */
    /* JADX WARN: Code duplicated, block: B:86:0x026f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0283  */
    /* JADX WARN: Code duplicated, block: B:88:0x0297  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:90:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:91:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:92:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:93:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x030f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0323  */
    /* JADX WARN: Code duplicated, block: B:96:0x0337  */
    /* JADX WARN: Code duplicated, block: B:97:0x034b  */
    /* JADX WARN: Code duplicated, block: B:98:0x035f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0373  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: e */
    public final void mo13791e(Object obj, C12211z0 c12211z0) {
        Iterator itM13849l;
        Map.Entry entry;
        Map.Entry entry2;
        c12211z0.getClass();
        if (!this.f36906h) {
            m13786a0(obj, c12211z0);
            return;
        }
        boolean z6 = this.f36904f;
        C12090G c12090g = this.f36913o;
        if (z6) {
            c12090g.getClass();
            C12110N c12110n = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
            if (c12110n.f36962a.isEmpty()) {
                itM13849l = null;
                entry = null;
            } else {
                itM13849l = c12110n.m13849l();
                entry = (Map.Entry) itM13849l.next();
            }
        } else {
            itM13849l = null;
            entry = null;
        }
        int[] iArr = this.f36899a;
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            int iM13784Z = m13784Z(i10);
            int i11 = iArr[i10];
            while (entry != null) {
                c12090g.getClass();
                if (((C12127W) entry.getKey()).f36983Y <= i11) {
                    C12090G.m13746g(c12211z0, entry);
                    entry = itM13849l.hasNext() ? (Map.Entry) itM13849l.next() : null;
                } else {
                    switch (m13759Y(iM13784Z)) {
                        case 0:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14202c(i11, AbstractC12209y1.f37124c.mo14159g(iM13784Z & 1048575, obj));
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 1:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14206g(i11, AbstractC12209y1.f37124c.mo14160h(iM13784Z & 1048575, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 2:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14209j(i11, AbstractC12209y1.f37124c.m14172j(iM13784Z & 1048575, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 3:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14216q(i11, AbstractC12209y1.f37124c.m14172j(iM13784Z & 1048575, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 4:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14208i(i11, AbstractC12209y1.f37124c.m14171i(iM13784Z & 1048575, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 5:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14205f(i11, AbstractC12209y1.f37124c.m14172j(iM13784Z & 1048575, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 6:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14204e(i11, AbstractC12209y1.f37124c.m14171i(iM13784Z & 1048575, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 7:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14200a(i11, AbstractC12209y1.f37124c.mo14156d(iM13784Z & 1048575, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 8:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                m13760c0(i11, AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0);
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 9:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14210k(i11, AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), m13801q(i10));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 10:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14201b(i11, (AbstractC12171m) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 11:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14215p(i11, AbstractC12209y1.f37124c.m14171i(iM13784Z & 1048575, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 12:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14203d(i11, AbstractC12209y1.f37124c.m14171i(iM13784Z & 1048575, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 13:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14211l(i11, AbstractC12209y1.f37124c.m14171i(iM13784Z & 1048575, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 14:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14212m(i11, AbstractC12209y1.f37124c.m14172j(iM13784Z & 1048575, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 15:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14213n(i11, AbstractC12209y1.f37124c.m14171i(iM13784Z & 1048575, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 16:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14214o(i11, AbstractC12209y1.f37124c.m14172j(iM13784Z & 1048575, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 17:
                            entry2 = entry;
                            if (m13804u(i10, obj)) {
                                c12211z0.m14207h(i11, AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), m13801q(i10));
                            } else {
                                continue;
                                continue;
                            }
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 18:
                            entry2 = entry;
                            AbstractC12137a1.m13886G(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 19:
                            entry2 = entry;
                            AbstractC12137a1.m13890K(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 20:
                            entry2 = entry;
                            AbstractC12137a1.m13893N(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 21:
                            entry2 = entry;
                            AbstractC12137a1.m13901V(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 22:
                            entry2 = entry;
                            AbstractC12137a1.m13892M(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 23:
                            entry2 = entry;
                            AbstractC12137a1.m13889J(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 24:
                            entry2 = entry;
                            AbstractC12137a1.m13888I(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 25:
                            entry2 = entry;
                            AbstractC12137a1.m13884E(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 26:
                            entry2 = entry;
                            AbstractC12137a1.m13899T(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 27:
                            entry2 = entry;
                            AbstractC12137a1.m13894O(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, m13801q(i10));
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 28:
                            entry2 = entry;
                            AbstractC12137a1.m13885F(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 29:
                            entry2 = entry;
                            AbstractC12137a1.m13900U(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 30:
                            entry2 = entry;
                            AbstractC12137a1.m13887H(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 31:
                            entry2 = entry;
                            AbstractC12137a1.m13895P(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 32:
                            entry2 = entry;
                            AbstractC12137a1.m13896Q(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 33:
                            entry2 = entry;
                            AbstractC12137a1.m13897R(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 34:
                            entry2 = entry;
                            AbstractC12137a1.m13898S(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 35:
                            entry2 = entry;
                            AbstractC12137a1.m13886G(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 36:
                            entry2 = entry;
                            AbstractC12137a1.m13890K(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 37:
                            entry2 = entry;
                            AbstractC12137a1.m13893N(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 38:
                            entry2 = entry;
                            AbstractC12137a1.m13901V(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 39:
                            entry2 = entry;
                            AbstractC12137a1.m13892M(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 40:
                            entry2 = entry;
                            AbstractC12137a1.m13889J(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 41:
                            entry2 = entry;
                            AbstractC12137a1.m13888I(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 42:
                            entry2 = entry;
                            AbstractC12137a1.m13884E(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 43:
                            entry2 = entry;
                            AbstractC12137a1.m13900U(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 44:
                            entry2 = entry;
                            AbstractC12137a1.m13887H(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 45:
                            entry2 = entry;
                            AbstractC12137a1.m13895P(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 46:
                            entry2 = entry;
                            AbstractC12137a1.m13896Q(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case 47:
                            entry2 = entry;
                            AbstractC12137a1.m13897R(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                            entry2 = entry;
                            AbstractC12137a1.m13898S(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                            continue;
                            continue;
                            i10 += 3;
                            entry = entry2;
                            break;
                        case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                            AbstractC12137a1.m13891L(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, m13801q(i10));
                            break;
                        case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                            m13788b0(c12211z0, i11, AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), i10);
                            break;
                        case 51:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14202c(i11, ((Double) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj)).doubleValue());
                            }
                            break;
                        case 52:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14206g(i11, ((Float) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj)).floatValue());
                            }
                            break;
                        case 53:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14209j(i11, m13757I(iM13784Z & 1048575, obj));
                            }
                            break;
                        case 54:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14216q(i11, m13757I(iM13784Z & 1048575, obj));
                            }
                            break;
                        case 55:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14208i(i11, m13756H(iM13784Z & 1048575, obj));
                            }
                            break;
                        case 56:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14205f(i11, m13757I(iM13784Z & 1048575, obj));
                            }
                            break;
                        case 57:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14204e(i11, m13756H(iM13784Z & 1048575, obj));
                            }
                            break;
                        case 58:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14200a(i11, ((Boolean) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj)).booleanValue());
                            }
                            break;
                        case 59:
                            if (m13805w(i11, obj, i10)) {
                                m13760c0(i11, AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0);
                            }
                            break;
                        case 60:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14210k(i11, AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), m13801q(i10));
                            }
                            break;
                        case 61:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14201b(i11, (AbstractC12171m) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj));
                            }
                            break;
                        case 62:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14215p(i11, m13756H(iM13784Z & 1048575, obj));
                            }
                            break;
                        case 63:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14203d(i11, m13756H(iM13784Z & 1048575, obj));
                            }
                            break;
                        case 64:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14211l(i11, m13756H(iM13784Z & 1048575, obj));
                            }
                            break;
                        case 65:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14212m(i11, m13757I(iM13784Z & 1048575, obj));
                            }
                            break;
                        case 66:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14213n(i11, m13756H(iM13784Z & 1048575, obj));
                            }
                            break;
                        case 67:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14214o(i11, m13757I(iM13784Z & 1048575, obj));
                            }
                            break;
                        case 68:
                            if (m13805w(i11, obj, i10)) {
                                c12211z0.m14207h(i11, AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), m13801q(i10));
                            }
                            break;
                    }
                    entry2 = entry;
                    i10 += 3;
                    entry = entry2;
                }
            }
            switch (m13759Y(iM13784Z)) {
                case 0:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14202c(i11, AbstractC12209y1.f37124c.mo14159g(iM13784Z & 1048575, obj));
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 1:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14206g(i11, AbstractC12209y1.f37124c.mo14160h(iM13784Z & 1048575, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 2:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14209j(i11, AbstractC12209y1.f37124c.m14172j(iM13784Z & 1048575, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 3:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14216q(i11, AbstractC12209y1.f37124c.m14172j(iM13784Z & 1048575, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 4:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14208i(i11, AbstractC12209y1.f37124c.m14171i(iM13784Z & 1048575, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 5:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14205f(i11, AbstractC12209y1.f37124c.m14172j(iM13784Z & 1048575, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 6:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14204e(i11, AbstractC12209y1.f37124c.m14171i(iM13784Z & 1048575, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 7:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14200a(i11, AbstractC12209y1.f37124c.mo14156d(iM13784Z & 1048575, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 8:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        m13760c0(i11, AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0);
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 9:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14210k(i11, AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), m13801q(i10));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 10:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14201b(i11, (AbstractC12171m) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 11:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14215p(i11, AbstractC12209y1.f37124c.m14171i(iM13784Z & 1048575, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 12:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14203d(i11, AbstractC12209y1.f37124c.m14171i(iM13784Z & 1048575, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 13:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14211l(i11, AbstractC12209y1.f37124c.m14171i(iM13784Z & 1048575, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 14:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14212m(i11, AbstractC12209y1.f37124c.m14172j(iM13784Z & 1048575, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 15:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14213n(i11, AbstractC12209y1.f37124c.m14171i(iM13784Z & 1048575, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 16:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14214o(i11, AbstractC12209y1.f37124c.m14172j(iM13784Z & 1048575, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 17:
                    entry2 = entry;
                    if (m13804u(i10, obj)) {
                        c12211z0.m14207h(i11, AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), m13801q(i10));
                    } else {
                        continue;
                        continue;
                    }
                    i10 += 3;
                    entry = entry2;
                    break;
                case 18:
                    entry2 = entry;
                    AbstractC12137a1.m13886G(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 19:
                    entry2 = entry;
                    AbstractC12137a1.m13890K(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 20:
                    entry2 = entry;
                    AbstractC12137a1.m13893N(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 21:
                    entry2 = entry;
                    AbstractC12137a1.m13901V(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 22:
                    entry2 = entry;
                    AbstractC12137a1.m13892M(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 23:
                    entry2 = entry;
                    AbstractC12137a1.m13889J(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 24:
                    entry2 = entry;
                    AbstractC12137a1.m13888I(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 25:
                    entry2 = entry;
                    AbstractC12137a1.m13884E(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 26:
                    entry2 = entry;
                    AbstractC12137a1.m13899T(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 27:
                    entry2 = entry;
                    AbstractC12137a1.m13894O(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, m13801q(i10));
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 28:
                    entry2 = entry;
                    AbstractC12137a1.m13885F(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 29:
                    entry2 = entry;
                    AbstractC12137a1.m13900U(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 30:
                    entry2 = entry;
                    AbstractC12137a1.m13887H(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 31:
                    entry2 = entry;
                    AbstractC12137a1.m13895P(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 32:
                    entry2 = entry;
                    AbstractC12137a1.m13896Q(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 33:
                    entry2 = entry;
                    AbstractC12137a1.m13897R(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 34:
                    entry2 = entry;
                    AbstractC12137a1.m13898S(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, false);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 35:
                    entry2 = entry;
                    AbstractC12137a1.m13886G(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 36:
                    entry2 = entry;
                    AbstractC12137a1.m13890K(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 37:
                    entry2 = entry;
                    AbstractC12137a1.m13893N(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 38:
                    entry2 = entry;
                    AbstractC12137a1.m13901V(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 39:
                    entry2 = entry;
                    AbstractC12137a1.m13892M(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 40:
                    entry2 = entry;
                    AbstractC12137a1.m13889J(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 41:
                    entry2 = entry;
                    AbstractC12137a1.m13888I(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 42:
                    entry2 = entry;
                    AbstractC12137a1.m13884E(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 43:
                    entry2 = entry;
                    AbstractC12137a1.m13900U(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 44:
                    entry2 = entry;
                    AbstractC12137a1.m13887H(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 45:
                    entry2 = entry;
                    AbstractC12137a1.m13895P(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 46:
                    entry2 = entry;
                    AbstractC12137a1.m13896Q(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case 47:
                    entry2 = entry;
                    AbstractC12137a1.m13897R(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                    entry2 = entry;
                    AbstractC12137a1.m13898S(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, true);
                    continue;
                    continue;
                    i10 += 3;
                    entry = entry2;
                    break;
                case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                    AbstractC12137a1.m13891L(iArr[i10], (List) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0, m13801q(i10));
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    m13788b0(c12211z0, i11, AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), i10);
                    break;
                case 51:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14202c(i11, ((Double) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14206g(i11, ((Float) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14209j(i11, m13757I(iM13784Z & 1048575, obj));
                    }
                    break;
                case 54:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14216q(i11, m13757I(iM13784Z & 1048575, obj));
                    }
                    break;
                case 55:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14208i(i11, m13756H(iM13784Z & 1048575, obj));
                    }
                    break;
                case 56:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14205f(i11, m13757I(iM13784Z & 1048575, obj));
                    }
                    break;
                case 57:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14204e(i11, m13756H(iM13784Z & 1048575, obj));
                    }
                    break;
                case 58:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14200a(i11, ((Boolean) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (m13805w(i11, obj, i10)) {
                        m13760c0(i11, AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), c12211z0);
                    }
                    break;
                case 60:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14210k(i11, AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), m13801q(i10));
                    }
                    break;
                case 61:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14201b(i11, (AbstractC12171m) AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj));
                    }
                    break;
                case 62:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14215p(i11, m13756H(iM13784Z & 1048575, obj));
                    }
                    break;
                case 63:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14203d(i11, m13756H(iM13784Z & 1048575, obj));
                    }
                    break;
                case 64:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14211l(i11, m13756H(iM13784Z & 1048575, obj));
                    }
                    break;
                case 65:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14212m(i11, m13757I(iM13784Z & 1048575, obj));
                    }
                    break;
                case 66:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14213n(i11, m13756H(iM13784Z & 1048575, obj));
                    }
                    break;
                case 67:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14214o(i11, m13757I(iM13784Z & 1048575, obj));
                    }
                    break;
                case 68:
                    if (m13805w(i11, obj, i10)) {
                        c12211z0.m14207h(i11, AbstractC12209y1.f37124c.m14173k(iM13784Z & 1048575, obj), m13801q(i10));
                    }
                    break;
            }
            entry2 = entry;
            i10 += 3;
            entry = entry2;
        }
        while (entry != null) {
            c12090g.getClass();
            C12090G.m13746g(c12211z0, entry);
            entry = itM13849l.hasNext() ? (Map.Entry) itM13849l.next() : null;
        }
        this.f36912n.getClass();
        ((AbstractC12133Z) obj).unknownFields.m14073g(c12211z0);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: f */
    public final int mo13792f(AbstractC12133Z abstractC12133Z) {
        int i10;
        int iM14014b;
        int i11;
        int[] iArr = this.f36899a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iM13784Z = m13784Z(i13);
            int i14 = iArr[i13];
            long j10 = 1048575 & iM13784Z;
            int i15 = 1237;
            int iHashCode = 37;
            switch (m13759Y(iM13784Z)) {
                case 0:
                    i10 = i12 * 53;
                    iM14014b = AbstractC12175n0.m14014b(Double.doubleToLongBits(AbstractC12209y1.f37124c.mo14159g(j10, abstractC12133Z)));
                    i12 = iM14014b + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iM14014b = Float.floatToIntBits(AbstractC12209y1.f37124c.mo14160h(j10, abstractC12133Z));
                    i12 = iM14014b + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iM14014b = AbstractC12175n0.m14014b(AbstractC12209y1.f37124c.m14172j(j10, abstractC12133Z));
                    i12 = iM14014b + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iM14014b = AbstractC12175n0.m14014b(AbstractC12209y1.f37124c.m14172j(j10, abstractC12133Z));
                    i12 = iM14014b + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iM14014b = AbstractC12209y1.f37124c.m14171i(j10, abstractC12133Z);
                    i12 = iM14014b + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iM14014b = AbstractC12175n0.m14014b(AbstractC12209y1.f37124c.m14172j(j10, abstractC12133Z));
                    i12 = iM14014b + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iM14014b = AbstractC12209y1.f37124c.m14171i(j10, abstractC12133Z);
                    i12 = iM14014b + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zMo14156d = AbstractC12209y1.f37124c.mo14156d(j10, abstractC12133Z);
                    Charset charset = AbstractC12175n0.f37050a;
                    if (zMo14156d) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iM14014b = ((String) AbstractC12209y1.f37124c.m14173k(j10, abstractC12133Z)).hashCode();
                    i12 = iM14014b + i10;
                    break;
                case 9:
                    Object objM14173k = AbstractC12209y1.f37124c.m14173k(j10, abstractC12133Z);
                    if (objM14173k != null) {
                        iHashCode = objM14173k.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iM14014b = AbstractC12209y1.f37124c.m14173k(j10, abstractC12133Z).hashCode();
                    i12 = iM14014b + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iM14014b = AbstractC12209y1.f37124c.m14171i(j10, abstractC12133Z);
                    i12 = iM14014b + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iM14014b = AbstractC12209y1.f37124c.m14171i(j10, abstractC12133Z);
                    i12 = iM14014b + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iM14014b = AbstractC12209y1.f37124c.m14171i(j10, abstractC12133Z);
                    i12 = iM14014b + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iM14014b = AbstractC12175n0.m14014b(AbstractC12209y1.f37124c.m14172j(j10, abstractC12133Z));
                    i12 = iM14014b + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iM14014b = AbstractC12209y1.f37124c.m14171i(j10, abstractC12133Z);
                    i12 = iM14014b + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iM14014b = AbstractC12175n0.m14014b(AbstractC12209y1.f37124c.m14172j(j10, abstractC12133Z));
                    i12 = iM14014b + i10;
                    break;
                case 17:
                    Object objM14173k2 = AbstractC12209y1.f37124c.m14173k(j10, abstractC12133Z);
                    if (objM14173k2 != null) {
                        iHashCode = objM14173k2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                    i10 = i12 * 53;
                    iM14014b = AbstractC12209y1.f37124c.m14173k(j10, abstractC12133Z).hashCode();
                    i12 = iM14014b + i10;
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    i10 = i12 * 53;
                    iM14014b = AbstractC12209y1.f37124c.m14173k(j10, abstractC12133Z).hashCode();
                    i12 = iM14014b + i10;
                    break;
                case 51:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = AbstractC12175n0.m14014b(Double.doubleToLongBits(((Double) AbstractC12209y1.f37124c.m14173k(j10, abstractC12133Z)).doubleValue()));
                        i12 = iM14014b + i10;
                    }
                    break;
                case 52:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = Float.floatToIntBits(((Float) AbstractC12209y1.f37124c.m14173k(j10, abstractC12133Z)).floatValue());
                        i12 = iM14014b + i10;
                    }
                    break;
                case 53:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = AbstractC12175n0.m14014b(m13757I(j10, abstractC12133Z));
                        i12 = iM14014b + i10;
                    }
                    break;
                case 54:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = AbstractC12175n0.m14014b(m13757I(j10, abstractC12133Z));
                        i12 = iM14014b + i10;
                    }
                    break;
                case 55:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = m13756H(j10, abstractC12133Z);
                        i12 = iM14014b + i10;
                    }
                    break;
                case 56:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = AbstractC12175n0.m14014b(m13757I(j10, abstractC12133Z));
                        i12 = iM14014b + i10;
                    }
                    break;
                case 57:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = m13756H(j10, abstractC12133Z);
                        i12 = iM14014b + i10;
                    }
                    break;
                case 58:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC12209y1.f37124c.m14173k(j10, abstractC12133Z)).booleanValue();
                        Charset charset2 = AbstractC12175n0.f37050a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case 59:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = ((String) AbstractC12209y1.f37124c.m14173k(j10, abstractC12133Z)).hashCode();
                        i12 = iM14014b + i10;
                    }
                    break;
                case 60:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = AbstractC12209y1.f37124c.m14173k(j10, abstractC12133Z).hashCode();
                        i12 = iM14014b + i10;
                    }
                    break;
                case 61:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = AbstractC12209y1.f37124c.m14173k(j10, abstractC12133Z).hashCode();
                        i12 = iM14014b + i10;
                    }
                    break;
                case 62:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = m13756H(j10, abstractC12133Z);
                        i12 = iM14014b + i10;
                    }
                    break;
                case 63:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = m13756H(j10, abstractC12133Z);
                        i12 = iM14014b + i10;
                    }
                    break;
                case 64:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = m13756H(j10, abstractC12133Z);
                        i12 = iM14014b + i10;
                    }
                    break;
                case 65:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = AbstractC12175n0.m14014b(m13757I(j10, abstractC12133Z));
                        i12 = iM14014b + i10;
                    }
                    break;
                case 66:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = m13756H(j10, abstractC12133Z);
                        i12 = iM14014b + i10;
                    }
                    break;
                case 67:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = AbstractC12175n0.m14014b(m13757I(j10, abstractC12133Z));
                        i12 = iM14014b + i10;
                    }
                    break;
                case 68:
                    if (m13805w(i14, abstractC12133Z, i13)) {
                        i10 = i12 * 53;
                        iM14014b = AbstractC12209y1.f37124c.m14173k(j10, abstractC12133Z).hashCode();
                        i12 = iM14014b + i10;
                    }
                    break;
            }
        }
        this.f36912n.getClass();
        int iHashCode2 = abstractC12133Z.unknownFields.hashCode() + (i12 * 53);
        if (!this.f36904f) {
            return iHashCode2;
        }
        this.f36913o.getClass();
        return (iHashCode2 * 53) + ((GeneratedMessageLite$ExtendableMessage) abstractC12133Z).extensions.f36962a.hashCode();
    }

    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: g */
    public final int mo13793g(AbstractC12133Z abstractC12133Z) {
        return this.f36906h ? m13803t(abstractC12133Z) : m13802s(abstractC12133Z);
    }

    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: h */
    public final void mo13794h(Object obj, byte[] bArr, int i10, int i11, C0138o c0138o) throws C12181p0 {
        if (this.f36906h) {
            m13773M(obj, bArr, i10, i11, c0138o);
        } else {
            m13772L(obj, bArr, i10, i11, 0, c0138o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: i */
    public final boolean mo13795i(AbstractC12133Z abstractC12133Z, Object obj) {
        int[] iArr = this.f36899a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zM13883D = true;
            if (i10 >= length) {
                this.f36912n.getClass();
                if (!abstractC12133Z.unknownFields.equals(((AbstractC12133Z) obj).unknownFields)) {
                    return false;
                }
                if (!this.f36904f) {
                    return true;
                }
                this.f36913o.getClass();
                return ((GeneratedMessageLite$ExtendableMessage) abstractC12133Z).extensions.equals(((GeneratedMessageLite$ExtendableMessage) obj).extensions);
            }
            int iM13784Z = m13784Z(i10);
            long j10 = iM13784Z & 1048575;
            switch (m13759Y(iM13784Z)) {
                case 0:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x1 = AbstractC12209y1.f37124c;
                        if (Double.doubleToLongBits(abstractC12206x1.mo14159g(j10, abstractC12133Z)) != Double.doubleToLongBits(abstractC12206x1.mo14159g(j10, obj))) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 1:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x2 = AbstractC12209y1.f37124c;
                        if (Float.floatToIntBits(abstractC12206x2.mo14160h(j10, abstractC12133Z)) != Float.floatToIntBits(abstractC12206x2.mo14160h(j10, obj))) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 2:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x3 = AbstractC12209y1.f37124c;
                        if (abstractC12206x3.m14172j(j10, abstractC12133Z) != abstractC12206x3.m14172j(j10, obj)) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 3:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x4 = AbstractC12209y1.f37124c;
                        if (abstractC12206x4.m14172j(j10, abstractC12133Z) != abstractC12206x4.m14172j(j10, obj)) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 4:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x5 = AbstractC12209y1.f37124c;
                        if (abstractC12206x5.m14171i(j10, abstractC12133Z) != abstractC12206x5.m14171i(j10, obj)) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 5:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x6 = AbstractC12209y1.f37124c;
                        if (abstractC12206x6.m14172j(j10, abstractC12133Z) != abstractC12206x6.m14172j(j10, obj)) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 6:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x7 = AbstractC12209y1.f37124c;
                        if (abstractC12206x7.m14171i(j10, abstractC12133Z) != abstractC12206x7.m14171i(j10, obj)) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 7:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x8 = AbstractC12209y1.f37124c;
                        if (abstractC12206x8.mo14156d(j10, abstractC12133Z) != abstractC12206x8.mo14156d(j10, obj)) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 8:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x9 = AbstractC12209y1.f37124c;
                        if (!AbstractC12137a1.m13883D(abstractC12206x9.m14173k(j10, abstractC12133Z), abstractC12206x9.m14173k(j10, obj))) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 9:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x10 = AbstractC12209y1.f37124c;
                        if (!AbstractC12137a1.m13883D(abstractC12206x10.m14173k(j10, abstractC12133Z), abstractC12206x10.m14173k(j10, obj))) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 10:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x11 = AbstractC12209y1.f37124c;
                        if (!AbstractC12137a1.m13883D(abstractC12206x11.m14173k(j10, abstractC12133Z), abstractC12206x11.m14173k(j10, obj))) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 11:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x12 = AbstractC12209y1.f37124c;
                        if (abstractC12206x12.m14171i(j10, abstractC12133Z) != abstractC12206x12.m14171i(j10, obj)) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 12:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x13 = AbstractC12209y1.f37124c;
                        if (abstractC12206x13.m14171i(j10, abstractC12133Z) != abstractC12206x13.m14171i(j10, obj)) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 13:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x14 = AbstractC12209y1.f37124c;
                        if (abstractC12206x14.m14171i(j10, abstractC12133Z) != abstractC12206x14.m14171i(j10, obj)) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 14:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x15 = AbstractC12209y1.f37124c;
                        if (abstractC12206x15.m14172j(j10, abstractC12133Z) != abstractC12206x15.m14172j(j10, obj)) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 15:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x16 = AbstractC12209y1.f37124c;
                        if (abstractC12206x16.m14171i(j10, abstractC12133Z) != abstractC12206x16.m14171i(j10, obj)) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 16:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x17 = AbstractC12209y1.f37124c;
                        if (abstractC12206x17.m14172j(j10, abstractC12133Z) != abstractC12206x17.m14172j(j10, obj)) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 17:
                    if (!m13797k(abstractC12133Z, obj, i10)) {
                        zM13883D = false;
                    } else {
                        AbstractC12206x1 abstractC12206x18 = AbstractC12209y1.f37124c;
                        if (!AbstractC12137a1.m13883D(abstractC12206x18.m14173k(j10, abstractC12133Z), abstractC12206x18.m14173k(j10, obj))) {
                            zM13883D = false;
                        }
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                    AbstractC12206x1 abstractC12206x19 = AbstractC12209y1.f37124c;
                    zM13883D = AbstractC12137a1.m13883D(abstractC12206x19.m14173k(j10, abstractC12133Z), abstractC12206x19.m14173k(j10, obj));
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    AbstractC12206x1 abstractC12206x20 = AbstractC12209y1.f37124c;
                    zM13883D = AbstractC12137a1.m13883D(abstractC12206x20.m14173k(j10, abstractC12133Z), abstractC12206x20.m14173k(j10, obj));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j11 = iArr[i10 + 2] & 1048575;
                    AbstractC12206x1 abstractC12206x21 = AbstractC12209y1.f37124c;
                    if (abstractC12206x21.m14171i(j11, abstractC12133Z) != abstractC12206x21.m14171i(j11, obj) || !AbstractC12137a1.m13883D(abstractC12206x21.m14173k(j10, abstractC12133Z), abstractC12206x21.m14173k(j10, obj))) {
                        zM13883D = false;
                    }
                    break;
            }
            if (!zM13883D) {
                return false;
            }
            i10 += 3;
        }
    }

    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: j */
    public final void mo13796j(Object obj, C6277D c6277d, C12087F c12087f) throws Throwable {
        c12087f.getClass();
        m13761l(obj);
        m13806y(this.f36912n, this.f36913o, obj, c6277d, c12087f);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m13797k(AbstractC12133Z abstractC12133Z, Object obj, int i10) {
        return m13804u(i10, abstractC12133Z) == m13804u(i10, obj);
    }

    /* JADX INFO: renamed from: n */
    public final void m13798n(Object obj, int i10, Object obj2) {
        int i11 = this.f36899a[i10];
        if (AbstractC12209y1.f37124c.m14173k(m13784Z(i10) & 1048575, obj) == null) {
            return;
        }
        m13799o(i10);
    }

    /* JADX INFO: renamed from: o */
    public final void m13799o(int i10) {
        if (this.f36900b[AbstractC10763a.m11068z(i10, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: p */
    public final Object m13800p(int i10) {
        return this.f36900b[(i10 / 3) * 2];
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC12134Z0 m13801q(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f36900b;
        InterfaceC12134Z0 interfaceC12134Z0 = (InterfaceC12134Z0) objArr[i11];
        if (interfaceC12134Z0 != null) {
            return interfaceC12134Z0;
        }
        InterfaceC12134Z0 interfaceC12134Z0M13868a = C12128W0.f36987c.m13868a((Class) objArr[i11 + 1]);
        objArr[i11] = interfaceC12134Z0M13868a;
        return interfaceC12134Z0M13868a;
    }

    /* JADX INFO: renamed from: s */
    public final int m13802s(AbstractC12133Z abstractC12133Z) {
        int i10;
        int iM14131e0;
        int iM14129c0;
        Unsafe unsafe = f36898r;
        int i11 = 0;
        int iM11040A = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = this.f36899a;
            if (i11 >= iArr.length) {
                this.f36912n.getClass();
                int iM14070c = abstractC12133Z.unknownFields.m14070c() + iM11040A;
                if (!this.f36904f) {
                    return iM14070c;
                }
                this.f36913o.getClass();
                return iM14070c + C12090G.m13742c(abstractC12133Z).m13846h();
            }
            int iM13784Z = m13784Z(i11);
            int i14 = iArr[i11];
            int iM13759Y = m13759Y(iM13784Z);
            if (iM13759Y <= 17) {
                int i15 = iArr[i11 + 2];
                int i16 = i15 & 1048575;
                i10 = 1 << (i15 >>> 20);
                if (i16 != i13) {
                    i12 = unsafe.getInt(abstractC12133Z, i16);
                    i13 = i16;
                }
            } else {
                i10 = 0;
            }
            long j10 = iM13784Z & 1048575;
            switch (iM13759Y) {
                case 0:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14131e0(i14);
                        iM11040A += iM14131e0;
                    }
                    break;
                case 1:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14135i0(i14);
                        iM11040A += iM14131e0;
                    }
                    break;
                case 2:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14139m0(i14, unsafe.getLong(abstractC12133Z, j10));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 3:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14149w0(i14, unsafe.getLong(abstractC12133Z, j10));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 4:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14137k0(i14, unsafe.getInt(abstractC12133Z, j10));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 5:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14134h0(i14);
                        iM11040A += iM14131e0;
                    }
                    break;
                case 6:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14133g0(i14);
                        iM11040A += iM14131e0;
                    }
                    break;
                case 7:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14128b0(i14);
                        iM11040A += iM14131e0;
                    }
                    break;
                case 8:
                    if ((i10 & i12) != 0) {
                        Object object = unsafe.getObject(abstractC12133Z, j10);
                        iM14129c0 = object instanceof AbstractC12171m ? AbstractC12195u.m14129c0(i14, (AbstractC12171m) object) : AbstractC12195u.m14144r0(i14, (String) object);
                        iM11040A = iM14129c0 + iM11040A;
                    }
                    break;
                case 9:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12137a1.m13916o(i14, unsafe.getObject(abstractC12133Z, j10), m13801q(i11));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 10:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14129c0(i14, (AbstractC12171m) unsafe.getObject(abstractC12133Z, j10));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 11:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14147u0(i14, unsafe.getInt(abstractC12133Z, j10));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 12:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14132f0(i14, unsafe.getInt(abstractC12133Z, j10));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 13:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14140n0(i14);
                        iM11040A += iM14131e0;
                    }
                    break;
                case 14:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14141o0(i14);
                        iM11040A += iM14131e0;
                    }
                    break;
                case 15:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14142p0(i14, unsafe.getInt(abstractC12133Z, j10));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 16:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14143q0(i14, unsafe.getLong(abstractC12133Z, j10));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 17:
                    if ((i10 & i12) != 0) {
                        iM14131e0 = AbstractC12195u.m14136j0(i14, (InterfaceC12091G0) unsafe.getObject(abstractC12133Z, j10), m13801q(i11));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 18:
                    iM14131e0 = AbstractC12137a1.m13909h(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 19:
                    iM14131e0 = AbstractC12137a1.m13907f(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 20:
                    iM14131e0 = AbstractC12137a1.m13914m(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 21:
                    iM14131e0 = AbstractC12137a1.m13925x(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 22:
                    iM14131e0 = AbstractC12137a1.m13912k(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 23:
                    iM14131e0 = AbstractC12137a1.m13909h(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 24:
                    iM14131e0 = AbstractC12137a1.m13907f(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 25:
                    iM14131e0 = AbstractC12137a1.m13902a(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 26:
                    iM14131e0 = AbstractC12137a1.m13922u(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 27:
                    iM14131e0 = AbstractC12137a1.m13917p(i14, (List) unsafe.getObject(abstractC12133Z, j10), m13801q(i11));
                    iM11040A += iM14131e0;
                    break;
                case 28:
                    iM14131e0 = AbstractC12137a1.m13904c(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 29:
                    iM14131e0 = AbstractC12137a1.m13923v(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 30:
                    iM14131e0 = AbstractC12137a1.m13905d(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 31:
                    iM14131e0 = AbstractC12137a1.m13907f(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 32:
                    iM14131e0 = AbstractC12137a1.m13909h(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 33:
                    iM14131e0 = AbstractC12137a1.m13918q(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 34:
                    iM14131e0 = AbstractC12137a1.m13920s(i14, (List) unsafe.getObject(abstractC12133Z, j10));
                    iM11040A += iM14131e0;
                    break;
                case 35:
                    int iM13910i = AbstractC12137a1.m13910i((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13910i > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13910i, AbstractC12195u.m14146t0(i14), iM13910i, iM11040A);
                    }
                    break;
                case 36:
                    int iM13908g = AbstractC12137a1.m13908g((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13908g > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13908g, AbstractC12195u.m14146t0(i14), iM13908g, iM11040A);
                    }
                    break;
                case 37:
                    int iM13915n = AbstractC12137a1.m13915n((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13915n > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13915n, AbstractC12195u.m14146t0(i14), iM13915n, iM11040A);
                    }
                    break;
                case 38:
                    int iM13926y = AbstractC12137a1.m13926y((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13926y > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13926y, AbstractC12195u.m14146t0(i14), iM13926y, iM11040A);
                    }
                    break;
                case 39:
                    int iM13913l = AbstractC12137a1.m13913l((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13913l > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13913l, AbstractC12195u.m14146t0(i14), iM13913l, iM11040A);
                    }
                    break;
                case 40:
                    int iM13910i2 = AbstractC12137a1.m13910i((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13910i2 > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13910i2, AbstractC12195u.m14146t0(i14), iM13910i2, iM11040A);
                    }
                    break;
                case 41:
                    int iM13908g2 = AbstractC12137a1.m13908g((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13908g2 > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13908g2, AbstractC12195u.m14146t0(i14), iM13908g2, iM11040A);
                    }
                    break;
                case 42:
                    int iM13903b = AbstractC12137a1.m13903b((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13903b > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13903b, AbstractC12195u.m14146t0(i14), iM13903b, iM11040A);
                    }
                    break;
                case 43:
                    int iM13924w = AbstractC12137a1.m13924w((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13924w > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13924w, AbstractC12195u.m14146t0(i14), iM13924w, iM11040A);
                    }
                    break;
                case 44:
                    int iM13906e = AbstractC12137a1.m13906e((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13906e > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13906e, AbstractC12195u.m14146t0(i14), iM13906e, iM11040A);
                    }
                    break;
                case 45:
                    int iM13908g3 = AbstractC12137a1.m13908g((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13908g3 > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13908g3, AbstractC12195u.m14146t0(i14), iM13908g3, iM11040A);
                    }
                    break;
                case 46:
                    int iM13910i3 = AbstractC12137a1.m13910i((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13910i3 > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13910i3, AbstractC12195u.m14146t0(i14), iM13910i3, iM11040A);
                    }
                    break;
                case 47:
                    int iM13919r = AbstractC12137a1.m13919r((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13919r > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13919r, AbstractC12195u.m14146t0(i14), iM13919r, iM11040A);
                    }
                    break;
                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                    int iM13921t = AbstractC12137a1.m13921t((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13921t > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13921t, AbstractC12195u.m14146t0(i14), iM13921t, iM11040A);
                    }
                    break;
                case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                    iM14131e0 = AbstractC12137a1.m13911j(i14, (List) unsafe.getObject(abstractC12133Z, j10), m13801q(i11));
                    iM11040A += iM14131e0;
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    Object object2 = unsafe.getObject(abstractC12133Z, j10);
                    Object objM13800p = m13800p(i11);
                    this.f36914p.getClass();
                    iM14131e0 = C12079C0.m13729c(object2, i14, objM13800p);
                    iM11040A += iM14131e0;
                    break;
                case 51:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14131e0(i14);
                        iM11040A += iM14131e0;
                    }
                    break;
                case 52:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14135i0(i14);
                        iM11040A += iM14131e0;
                    }
                    break;
                case 53:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14139m0(i14, m13757I(j10, abstractC12133Z));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 54:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14149w0(i14, m13757I(j10, abstractC12133Z));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 55:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14137k0(i14, m13756H(j10, abstractC12133Z));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 56:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14134h0(i14);
                        iM11040A += iM14131e0;
                    }
                    break;
                case 57:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14133g0(i14);
                        iM11040A += iM14131e0;
                    }
                    break;
                case 58:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14128b0(i14);
                        iM11040A += iM14131e0;
                    }
                    break;
                case 59:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        Object object3 = unsafe.getObject(abstractC12133Z, j10);
                        iM14129c0 = object3 instanceof AbstractC12171m ? AbstractC12195u.m14129c0(i14, (AbstractC12171m) object3) : AbstractC12195u.m14144r0(i14, (String) object3);
                        iM11040A = iM14129c0 + iM11040A;
                    }
                    break;
                case 60:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12137a1.m13916o(i14, unsafe.getObject(abstractC12133Z, j10), m13801q(i11));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 61:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14129c0(i14, (AbstractC12171m) unsafe.getObject(abstractC12133Z, j10));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 62:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14147u0(i14, m13756H(j10, abstractC12133Z));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 63:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14132f0(i14, m13756H(j10, abstractC12133Z));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 64:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14140n0(i14);
                        iM11040A += iM14131e0;
                    }
                    break;
                case 65:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14141o0(i14);
                        iM11040A += iM14131e0;
                    }
                    break;
                case 66:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14142p0(i14, m13756H(j10, abstractC12133Z));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 67:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14143q0(i14, m13757I(j10, abstractC12133Z));
                        iM11040A += iM14131e0;
                    }
                    break;
                case 68:
                    if (m13805w(i14, abstractC12133Z, i11)) {
                        iM14131e0 = AbstractC12195u.m14136j0(i14, (InterfaceC12091G0) unsafe.getObject(abstractC12133Z, j10), m13801q(i11));
                        iM11040A += iM14131e0;
                    }
                    break;
            }
            i11 += 3;
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m13803t(AbstractC12133Z abstractC12133Z) {
        int iM14131e0;
        Unsafe unsafe = f36898r;
        int i10 = 0;
        int iM11040A = 0;
        while (true) {
            int[] iArr = this.f36899a;
            if (i10 >= iArr.length) {
                this.f36912n.getClass();
                return abstractC12133Z.unknownFields.m14070c() + iM11040A;
            }
            int iM13784Z = m13784Z(i10);
            int iM13759Y = m13759Y(iM13784Z);
            int i11 = iArr[i10];
            long j10 = iM13784Z & 1048575;
            if (iM13759Y >= EnumC12112O.f36964Z.m13854a() && iM13759Y <= EnumC12112O.f36965o0.m13854a()) {
                int i12 = iArr[i10 + 2];
            }
            switch (iM13759Y) {
                case 0:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14131e0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 1:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14135i0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 2:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14139m0(i11, AbstractC12209y1.m14188k(abstractC12133Z, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 3:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14149w0(i11, AbstractC12209y1.m14188k(abstractC12133Z, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 4:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14137k0(i11, AbstractC12209y1.m14187j(abstractC12133Z, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 5:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14134h0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 6:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14133g0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 7:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14128b0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 8:
                    if (m13804u(i10, abstractC12133Z)) {
                        Object objM14189l = AbstractC12209y1.m14189l(abstractC12133Z, j10);
                        iM14131e0 = !(objM14189l instanceof AbstractC12171m) ? AbstractC12195u.m14144r0(i11, (String) objM14189l) : AbstractC12195u.m14129c0(i11, (AbstractC12171m) objM14189l);
                        break;
                    }
                    i10 += 3;
                    break;
                case 9:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12137a1.m13916o(i11, AbstractC12209y1.m14189l(abstractC12133Z, j10), m13801q(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 10:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14129c0(i11, (AbstractC12171m) AbstractC12209y1.m14189l(abstractC12133Z, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 11:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14147u0(i11, AbstractC12209y1.m14187j(abstractC12133Z, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 12:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14132f0(i11, AbstractC12209y1.m14187j(abstractC12133Z, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 13:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14140n0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 14:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14141o0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 15:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14142p0(i11, AbstractC12209y1.m14187j(abstractC12133Z, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 16:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14143q0(i11, AbstractC12209y1.m14188k(abstractC12133Z, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 17:
                    if (m13804u(i10, abstractC12133Z)) {
                        iM14131e0 = AbstractC12195u.m14136j0(i11, (InterfaceC12091G0) AbstractC12209y1.m14189l(abstractC12133Z, j10), m13801q(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 18:
                    iM14131e0 = AbstractC12137a1.m13909h(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 19:
                    iM14131e0 = AbstractC12137a1.m13907f(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 20:
                    iM14131e0 = AbstractC12137a1.m13914m(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 21:
                    iM14131e0 = AbstractC12137a1.m13925x(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 22:
                    iM14131e0 = AbstractC12137a1.m13912k(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 23:
                    iM14131e0 = AbstractC12137a1.m13909h(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 24:
                    iM14131e0 = AbstractC12137a1.m13907f(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 25:
                    iM14131e0 = AbstractC12137a1.m13902a(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 26:
                    iM14131e0 = AbstractC12137a1.m13922u(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 27:
                    iM14131e0 = AbstractC12137a1.m13917p(i11, m13765x(abstractC12133Z, j10), m13801q(i10));
                    break;
                case 28:
                    iM14131e0 = AbstractC12137a1.m13904c(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 29:
                    iM14131e0 = AbstractC12137a1.m13923v(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 30:
                    iM14131e0 = AbstractC12137a1.m13905d(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 31:
                    iM14131e0 = AbstractC12137a1.m13907f(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 32:
                    iM14131e0 = AbstractC12137a1.m13909h(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 33:
                    iM14131e0 = AbstractC12137a1.m13918q(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 34:
                    iM14131e0 = AbstractC12137a1.m13920s(i11, m13765x(abstractC12133Z, j10));
                    break;
                case 35:
                    int iM13910i = AbstractC12137a1.m13910i((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13910i > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13910i, AbstractC12195u.m14146t0(i11), iM13910i, iM11040A);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 36:
                    int iM13908g = AbstractC12137a1.m13908g((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13908g > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13908g, AbstractC12195u.m14146t0(i11), iM13908g, iM11040A);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 37:
                    int iM13915n = AbstractC12137a1.m13915n((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13915n > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13915n, AbstractC12195u.m14146t0(i11), iM13915n, iM11040A);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 38:
                    int iM13926y = AbstractC12137a1.m13926y((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13926y > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13926y, AbstractC12195u.m14146t0(i11), iM13926y, iM11040A);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 39:
                    int iM13913l = AbstractC12137a1.m13913l((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13913l > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13913l, AbstractC12195u.m14146t0(i11), iM13913l, iM11040A);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 40:
                    int iM13910i2 = AbstractC12137a1.m13910i((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13910i2 > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13910i2, AbstractC12195u.m14146t0(i11), iM13910i2, iM11040A);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 41:
                    int iM13908g2 = AbstractC12137a1.m13908g((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13908g2 > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13908g2, AbstractC12195u.m14146t0(i11), iM13908g2, iM11040A);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 42:
                    int iM13903b = AbstractC12137a1.m13903b((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13903b > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13903b, AbstractC12195u.m14146t0(i11), iM13903b, iM11040A);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 43:
                    int iM13924w = AbstractC12137a1.m13924w((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13924w > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13924w, AbstractC12195u.m14146t0(i11), iM13924w, iM11040A);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 44:
                    int iM13906e = AbstractC12137a1.m13906e((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13906e > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13906e, AbstractC12195u.m14146t0(i11), iM13906e, iM11040A);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 45:
                    int iM13908g3 = AbstractC12137a1.m13908g((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13908g3 > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13908g3, AbstractC12195u.m14146t0(i11), iM13908g3, iM11040A);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 46:
                    int iM13910i3 = AbstractC12137a1.m13910i((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13910i3 > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13910i3, AbstractC12195u.m14146t0(i11), iM13910i3, iM11040A);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 47:
                    int iM13919r = AbstractC12137a1.m13919r((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13919r > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13919r, AbstractC12195u.m14146t0(i11), iM13919r, iM11040A);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                    int iM13921t = AbstractC12137a1.m13921t((List) unsafe.getObject(abstractC12133Z, j10));
                    if (iM13921t > 0) {
                        iM11040A = AbstractC10763a.m11040A(iM13921t, AbstractC12195u.m14146t0(i11), iM13921t, iM11040A);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                    iM14131e0 = AbstractC12137a1.m13911j(i11, m13765x(abstractC12133Z, j10), m13801q(i10));
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    Object objM14189l2 = AbstractC12209y1.m14189l(abstractC12133Z, j10);
                    Object objM13800p = m13800p(i10);
                    this.f36914p.getClass();
                    iM14131e0 = C12079C0.m13729c(objM14189l2, i11, objM13800p);
                    break;
                case 51:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14131e0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 52:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14135i0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 53:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14139m0(i11, m13757I(j10, abstractC12133Z));
                        break;
                    }
                    i10 += 3;
                    break;
                case 54:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14149w0(i11, m13757I(j10, abstractC12133Z));
                        break;
                    }
                    i10 += 3;
                    break;
                case 55:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14137k0(i11, m13756H(j10, abstractC12133Z));
                        break;
                    }
                    i10 += 3;
                    break;
                case 56:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14134h0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 57:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14133g0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 58:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14128b0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 59:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        Object objM14189l3 = AbstractC12209y1.m14189l(abstractC12133Z, j10);
                        iM14131e0 = !(objM14189l3 instanceof AbstractC12171m) ? AbstractC12195u.m14144r0(i11, (String) objM14189l3) : AbstractC12195u.m14129c0(i11, (AbstractC12171m) objM14189l3);
                        break;
                    }
                    i10 += 3;
                    break;
                case 60:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12137a1.m13916o(i11, AbstractC12209y1.m14189l(abstractC12133Z, j10), m13801q(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 61:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14129c0(i11, (AbstractC12171m) AbstractC12209y1.m14189l(abstractC12133Z, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 62:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14147u0(i11, m13756H(j10, abstractC12133Z));
                        break;
                    }
                    i10 += 3;
                    break;
                case 63:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14132f0(i11, m13756H(j10, abstractC12133Z));
                        break;
                    }
                    i10 += 3;
                    break;
                case 64:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14140n0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 65:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14141o0(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 66:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14142p0(i11, m13756H(j10, abstractC12133Z));
                        break;
                    }
                    i10 += 3;
                    break;
                case 67:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14143q0(i11, m13757I(j10, abstractC12133Z));
                        break;
                    }
                    i10 += 3;
                    break;
                case 68:
                    if (m13805w(i11, abstractC12133Z, i10)) {
                        iM14131e0 = AbstractC12195u.m14136j0(i11, (InterfaceC12091G0) AbstractC12209y1.m14189l(abstractC12133Z, j10), m13801q(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                default:
                    continue;
                    i10 += 3;
                    break;
            }
            iM11040A = iM14131e0 + iM11040A;
            i10 += 3;
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m13804u(int i10, Object obj) {
        int i11 = this.f36899a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 != 1048575) {
            return ((1 << (i11 >>> 20)) & AbstractC12209y1.f37124c.m14171i(j10, obj)) != 0;
        }
        int iM13784Z = m13784Z(i10);
        long j11 = iM13784Z & 1048575;
        switch (m13759Y(iM13784Z)) {
            case 0:
                return Double.doubleToRawLongBits(AbstractC12209y1.f37124c.mo14159g(j11, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC12209y1.f37124c.mo14160h(j11, obj)) != 0;
            case 2:
                return AbstractC12209y1.f37124c.m14172j(j11, obj) != 0;
            case 3:
                return AbstractC12209y1.f37124c.m14172j(j11, obj) != 0;
            case 4:
                return AbstractC12209y1.f37124c.m14171i(j11, obj) != 0;
            case 5:
                return AbstractC12209y1.f37124c.m14172j(j11, obj) != 0;
            case 6:
                return AbstractC12209y1.f37124c.m14171i(j11, obj) != 0;
            case 7:
                return AbstractC12209y1.f37124c.mo14156d(j11, obj);
            case 8:
                Object objM14173k = AbstractC12209y1.f37124c.m14173k(j11, obj);
                if (objM14173k instanceof String) {
                    return !((String) objM14173k).isEmpty();
                }
                if (objM14173k instanceof AbstractC12171m) {
                    return !AbstractC12171m.f37047Z.equals(objM14173k);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC12209y1.f37124c.m14173k(j11, obj) != null;
            case 10:
                return !AbstractC12171m.f37047Z.equals(AbstractC12209y1.f37124c.m14173k(j11, obj));
            case 11:
                return AbstractC12209y1.f37124c.m14171i(j11, obj) != 0;
            case 12:
                return AbstractC12209y1.f37124c.m14171i(j11, obj) != 0;
            case 13:
                return AbstractC12209y1.f37124c.m14171i(j11, obj) != 0;
            case 14:
                return AbstractC12209y1.f37124c.m14172j(j11, obj) != 0;
            case 15:
                return AbstractC12209y1.f37124c.m14171i(j11, obj) != 0;
            case 16:
                return AbstractC12209y1.f37124c.m14172j(j11, obj) != 0;
            case 17:
                return AbstractC12209y1.f37124c.m14173k(j11, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m13805w(int i10, Object obj, int i11) {
        return AbstractC12209y1.f37124c.m14171i((long) (this.f36899a[i11 + 2] & 1048575), obj) == i10;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x05b0 A[LOOP:4: B:154:0x05ae->B:155:0x05b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x05ba  */
    /* JADX INFO: renamed from: y */
    public final void m13806y(C12185q1 c12185q1, C12090G c12090g, Object obj, C6277D c6277d, C12087F c12087f) throws Throwable {
        C12129X c12129xM13741b;
        int[] iArr = this.f36907i;
        int i10 = this.f36909k;
        int i11 = this.f36908j;
        Object objM13745f = null;
        C12110N c12110nM13743d = null;
        while (true) {
            try {
                int iM6794b = c6277d.m6794b();
                int iM13781V = (iM6794b < this.f36901c || iM6794b > this.f36902d) ? -1 : m13781V(iM6794b, 0);
                if (iM13781V < 0) {
                    if (iM6794b == Integer.MAX_VALUE) {
                        while (i11 < i10) {
                            m13798n(obj, iArr[i11], objM13745f);
                            i11++;
                        }
                        if (objM13745f != null) {
                            c12185q1.getClass();
                            C12185q1.m14083d(obj, objM13745f);
                            return;
                        }
                        return;
                    }
                    if (this.f36904f) {
                        InterfaceC12091G0 interfaceC12091G0 = this.f36903e;
                        c12090g.getClass();
                        c12129xM13741b = C12090G.m13741b(c12087f, interfaceC12091G0, iM6794b);
                    } else {
                        c12129xM13741b = null;
                    }
                    if (c12129xM13741b != null) {
                        if (c12110nM13743d == null) {
                            try {
                                c12090g.getClass();
                                c12110nM13743d = C12090G.m13743d(obj);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        try {
                            c12090g.getClass();
                            try {
                                objM13745f = C12090G.m13745f(obj, c6277d, c12129xM13741b, c12087f, c12110nM13743d, objM13745f, c12185q1);
                            } catch (Throwable th3) {
                                th = th3;
                                objM13745f = objM13745f;
                                while (i11 < i10) {
                                    m13798n(obj, iArr[i11], objM13745f);
                                    i11++;
                                }
                                if (objM13745f != null) {
                                    c12185q1.getClass();
                                    C12185q1.m14083d(obj, objM13745f);
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            objM13745f = objM13745f;
                            while (i11 < i10) {
                                m13798n(obj, iArr[i11], objM13745f);
                                i11++;
                            }
                            if (objM13745f != null) {
                                c12185q1.getClass();
                                C12185q1.m14083d(obj, objM13745f);
                            }
                            throw th;
                        }
                    } else {
                        Object obj2 = objM13745f;
                        c12185q1.getClass();
                        objM13745f = obj2 == null ? C12185q1.m14080a(obj) : obj2;
                        if (!C12185q1.m14082c(objM13745f, c6277d)) {
                            while (i11 < i10) {
                                m13798n(obj, iArr[i11], objM13745f);
                                i11++;
                            }
                            if (objM13745f != null) {
                                C12185q1.m14083d(obj, objM13745f);
                                return;
                            }
                            return;
                        }
                    }
                    while (i11 < i10) {
                        m13798n(obj, iArr[i11], objM13745f);
                        i11++;
                    }
                    if (objM13745f != null) {
                        c12185q1.getClass();
                        C12185q1.m14083d(obj, objM13745f);
                    }
                    throw th;
                }
                Object obj3 = objM13745f;
                int iM13784Z = m13784Z(iM13781V);
                try {
                    int iM13759Y = m13759Y(iM13784Z);
                    AbstractC12186r abstractC12186r = (AbstractC12186r) c6277d.f20385e;
                    AbstractC12199v0 abstractC12199v0 = this.f36911m;
                    switch (iM13759Y) {
                        case 0:
                            long jM13755G = m13755G(iM13784Z);
                            c6277d.m6829s0(1);
                            AbstractC12209y1.m14195r(obj, jM13755G, abstractC12186r.mo14037n());
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 1:
                            long jM13755G2 = m13755G(iM13784Z);
                            c6277d.m6829s0(5);
                            AbstractC12209y1.m14196s(obj, jM13755G2, abstractC12186r.mo14041r());
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 2:
                            long jM13755G3 = m13755G(iM13784Z);
                            c6277d.m6829s0(0);
                            AbstractC12209y1.m14198u(obj, jM13755G3, abstractC12186r.mo14044u());
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 3:
                            long jM13755G4 = m13755G(iM13784Z);
                            c6277d.m6829s0(0);
                            AbstractC12209y1.m14198u(obj, jM13755G4, abstractC12186r.mo14021G());
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 4:
                            long jM13755G5 = m13755G(iM13784Z);
                            c6277d.m6829s0(0);
                            AbstractC12209y1.m14197t(jM13755G5, obj, abstractC12186r.mo14043t());
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 5:
                            long jM13755G6 = m13755G(iM13784Z);
                            c6277d.m6829s0(1);
                            AbstractC12209y1.m14198u(obj, jM13755G6, abstractC12186r.mo14040q());
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 6:
                            long jM13755G7 = m13755G(iM13784Z);
                            c6277d.m6829s0(5);
                            AbstractC12209y1.m14197t(jM13755G7, obj, abstractC12186r.mo14039p());
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 7:
                            long jM13755G8 = m13755G(iM13784Z);
                            c6277d.m6829s0(0);
                            AbstractC12209y1.m14191n(obj, jM13755G8, abstractC12186r.mo14035l());
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 8:
                            m13777Q(iM13784Z, c6277d, obj);
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 9:
                            InterfaceC12091G0 interfaceC12091G1 = (InterfaceC12091G0) m13768C(iM13781V, obj);
                            InterfaceC12134Z0 interfaceC12134Z0M13801q = m13801q(iM13781V);
                            c6277d.m6829s0(2);
                            c6277d.m6808i(interfaceC12091G1, interfaceC12134Z0M13801q, c12087f);
                            m13782W(obj, iM13781V, interfaceC12091G1);
                            objM13745f = obj3;
                            break;
                        case 10:
                            AbstractC12209y1.m14199v(m13755G(iM13784Z), obj, c6277d.m6820o());
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 11:
                            long jM13755G9 = m13755G(iM13784Z);
                            c6277d.m6829s0(0);
                            AbstractC12209y1.m14197t(jM13755G9, obj, abstractC12186r.mo14020F());
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 12:
                            c6277d.m6829s0(0);
                            int iMo14038o = abstractC12186r.mo14038o();
                            m13799o(iM13781V);
                            AbstractC12209y1.m14197t(m13755G(iM13784Z), obj, iMo14038o);
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 13:
                            long jM13755G10 = m13755G(iM13784Z);
                            c6277d.m6829s0(5);
                            AbstractC12209y1.m14197t(jM13755G10, obj, abstractC12186r.mo14047y());
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 14:
                            long jM13755G11 = m13755G(iM13784Z);
                            c6277d.m6829s0(1);
                            AbstractC12209y1.m14198u(obj, jM13755G11, abstractC12186r.mo14048z());
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 15:
                            long jM13755G12 = m13755G(iM13784Z);
                            c6277d.m6829s0(0);
                            AbstractC12209y1.m14197t(jM13755G12, obj, abstractC12186r.mo14015A());
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 16:
                            long jM13755G13 = m13755G(iM13784Z);
                            c6277d.m6829s0(0);
                            AbstractC12209y1.m14198u(obj, jM13755G13, abstractC12186r.mo14016B());
                            m13779T(iM13781V, obj);
                            objM13745f = obj3;
                            break;
                        case 17:
                            InterfaceC12091G0 interfaceC12091G2 = (InterfaceC12091G0) m13768C(iM13781V, obj);
                            InterfaceC12134Z0 interfaceC12134Z0M13801q2 = m13801q(iM13781V);
                            c6277d.m6829s0(3);
                            c6277d.m6804g(interfaceC12091G2, interfaceC12134Z0M13801q2, c12087f);
                            m13782W(obj, iM13781V, interfaceC12091G2);
                            objM13745f = obj3;
                            break;
                        case 18:
                            c6277d.m6830t(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 19:
                            c6277d.m6773H(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 20:
                            c6277d.m6781P(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 21:
                            c6277d.m6821o0(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 22:
                            c6277d.m6778M(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 23:
                            c6277d.m6770E(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 24:
                            c6277d.m6767B(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 25:
                            c6277d.m6814l(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 26:
                            m13778R(iM13784Z, c6277d, obj);
                            objM13745f = obj3;
                            break;
                        case 27:
                            m13776P(obj, iM13784Z, c6277d, m13801q(iM13781V), c12087f);
                            objM13745f = obj3;
                            break;
                        case 28:
                            c6277d.m6824q(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 29:
                            c6277d.m6815l0(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 30:
                            List listMo14127c = abstractC12199v0.mo14127c(m13755G(iM13784Z), obj);
                            c6277d.m6835w(listMo14127c);
                            m13799o(iM13781V);
                            AbstractC12137a1.m13880A(obj, iM6794b, listMo14127c, obj3, c12185q1);
                            objM13745f = obj3;
                            break;
                        case 31:
                            c6277d.m6787V(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 32:
                            c6277d.m6790Y(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 33:
                            c6277d.m6795b0(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 34:
                            c6277d.m6801e0(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 35:
                            c6277d.m6830t(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 36:
                            c6277d.m6773H(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 37:
                            c6277d.m6781P(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 38:
                            c6277d.m6821o0(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 39:
                            c6277d.m6778M(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 40:
                            c6277d.m6770E(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 41:
                            c6277d.m6767B(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 42:
                            c6277d.m6814l(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 43:
                            c6277d.m6815l0(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 44:
                            List listMo14127c2 = abstractC12199v0.mo14127c(m13755G(iM13784Z), obj);
                            c6277d.m6835w(listMo14127c2);
                            m13799o(iM13781V);
                            AbstractC12137a1.m13880A(obj, iM6794b, listMo14127c2, obj3, c12185q1);
                            objM13745f = obj3;
                            break;
                        case 45:
                            c6277d.m6787V(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 46:
                            c6277d.m6790Y(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case 47:
                            c6277d.m6795b0(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                            c6277d.m6801e0(abstractC12199v0.mo14127c(m13755G(iM13784Z), obj));
                            objM13745f = obj3;
                            break;
                        case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                            m13775O(obj, m13755G(iM13784Z), c6277d, m13801q(iM13781V), c12087f);
                            objM13745f = obj3;
                            break;
                        case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                            m13807z(obj, iM13781V, m13800p(iM13781V), c12087f, c6277d);
                            objM13745f = obj3;
                            break;
                        case 51:
                            long jM13755G14 = m13755G(iM13784Z);
                            c6277d.m6829s0(1);
                            AbstractC12209y1.m14199v(jM13755G14, obj, Double.valueOf(abstractC12186r.mo14037n()));
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 52:
                            long jM13755G15 = m13755G(iM13784Z);
                            c6277d.m6829s0(5);
                            AbstractC12209y1.m14199v(jM13755G15, obj, Float.valueOf(abstractC12186r.mo14041r()));
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 53:
                            long jM13755G16 = m13755G(iM13784Z);
                            c6277d.m6829s0(0);
                            AbstractC12209y1.m14199v(jM13755G16, obj, Long.valueOf(abstractC12186r.mo14044u()));
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 54:
                            long jM13755G17 = m13755G(iM13784Z);
                            c6277d.m6829s0(0);
                            AbstractC12209y1.m14199v(jM13755G17, obj, Long.valueOf(abstractC12186r.mo14021G()));
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 55:
                            long jM13755G18 = m13755G(iM13784Z);
                            c6277d.m6829s0(0);
                            AbstractC12209y1.m14199v(jM13755G18, obj, Integer.valueOf(abstractC12186r.mo14043t()));
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 56:
                            long jM13755G19 = m13755G(iM13784Z);
                            c6277d.m6829s0(1);
                            AbstractC12209y1.m14199v(jM13755G19, obj, Long.valueOf(abstractC12186r.mo14040q()));
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 57:
                            long jM13755G20 = m13755G(iM13784Z);
                            c6277d.m6829s0(5);
                            AbstractC12209y1.m14199v(jM13755G20, obj, Integer.valueOf(abstractC12186r.mo14039p()));
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 58:
                            long jM13755G21 = m13755G(iM13784Z);
                            c6277d.m6829s0(0);
                            AbstractC12209y1.m14199v(jM13755G21, obj, Boolean.valueOf(abstractC12186r.mo14035l()));
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 59:
                            m13777Q(iM13784Z, c6277d, obj);
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 60:
                            InterfaceC12091G0 interfaceC12091G3 = (InterfaceC12091G0) m13769D(iM6794b, obj, iM13781V);
                            InterfaceC12134Z0 interfaceC12134Z0M13801q3 = m13801q(iM13781V);
                            c6277d.m6829s0(2);
                            c6277d.m6808i(interfaceC12091G3, interfaceC12134Z0M13801q3, c12087f);
                            m13783X(iM6794b, obj, interfaceC12091G3, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 61:
                            AbstractC12209y1.m14199v(m13755G(iM13784Z), obj, c6277d.m6820o());
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 62:
                            long jM13755G22 = m13755G(iM13784Z);
                            c6277d.m6829s0(0);
                            AbstractC12209y1.m14199v(jM13755G22, obj, Integer.valueOf(abstractC12186r.mo14020F()));
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 63:
                            c6277d.m6829s0(0);
                            int iMo14038o2 = abstractC12186r.mo14038o();
                            m13799o(iM13781V);
                            AbstractC12209y1.m14199v(m13755G(iM13784Z), obj, Integer.valueOf(iMo14038o2));
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 64:
                            long jM13755G23 = m13755G(iM13784Z);
                            c6277d.m6829s0(5);
                            AbstractC12209y1.m14199v(jM13755G23, obj, Integer.valueOf(abstractC12186r.mo14047y()));
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 65:
                            long jM13755G24 = m13755G(iM13784Z);
                            c6277d.m6829s0(1);
                            AbstractC12209y1.m14199v(jM13755G24, obj, Long.valueOf(abstractC12186r.mo14048z()));
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 66:
                            long jM13755G25 = m13755G(iM13784Z);
                            c6277d.m6829s0(0);
                            AbstractC12209y1.m14199v(jM13755G25, obj, Integer.valueOf(abstractC12186r.mo14015A()));
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 67:
                            long jM13755G26 = m13755G(iM13784Z);
                            c6277d.m6829s0(0);
                            AbstractC12209y1.m14199v(jM13755G26, obj, Long.valueOf(abstractC12186r.mo14016B()));
                            m13780U(iM6794b, obj, iM13781V);
                            objM13745f = obj3;
                            break;
                        case 68:
                            InterfaceC12091G0 interfaceC12091G4 = (InterfaceC12091G0) m13769D(iM6794b, obj, iM13781V);
                            InterfaceC12134Z0 interfaceC12134Z0M13801q4 = m13801q(iM13781V);
                            c6277d.m6829s0(3);
                            c6277d.m6804g(interfaceC12091G4, interfaceC12134Z0M13801q4, c12087f);
                            m13783X(iM6794b, obj, interfaceC12091G4, iM13781V);
                            objM13745f = obj3;
                            break;
                        default:
                            if (obj3 == null) {
                                c12185q1.getClass();
                                objM13745f = C12185q1.m14080a(obj);
                            } else {
                                objM13745f = obj3;
                            }
                            try {
                                c12185q1.getClass();
                                if (!C12185q1.m14082c(objM13745f, c6277d)) {
                                    while (i11 < i10) {
                                        m13798n(obj, iArr[i11], objM13745f);
                                        i11++;
                                    }
                                    if (objM13745f != null) {
                                        C12185q1.m14083d(obj, objM13745f);
                                        return;
                                    }
                                    return;
                                }
                            } catch (C12178o0 unused) {
                                c12185q1.getClass();
                                if (objM13745f == null) {
                                    objM13745f = C12185q1.m14080a(obj);
                                }
                                if (!C12185q1.m14082c(objM13745f, c6277d)) {
                                    while (i11 < i10) {
                                        m13798n(obj, iArr[i11], objM13745f);
                                        i11++;
                                    }
                                    if (objM13745f != null) {
                                        C12185q1.m14083d(obj, objM13745f);
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                    }
                } catch (C12178o0 unused2) {
                    objM13745f = obj3;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m13807z(Object obj, int i10, Object obj2, C12087F c12087f, C6277D c6277d) throws C11064z, C12178o0 {
        long jM13784Z = m13784Z(i10) & 1048575;
        Object objM14173k = AbstractC12209y1.f37124c.m14173k(jM13784Z, obj);
        C12079C0 c12079c0 = this.f36914p;
        if (objM14173k == null) {
            c12079c0.getClass();
            objM14173k = C12076B0.f36868Z.m13719c();
            AbstractC12209y1.m14199v(jM13784Z, obj, objM14173k);
        } else {
            c12079c0.getClass();
            if (C12079C0.m13730d(objM14173k)) {
                C12076B0 c12076b0M13719c = C12076B0.f36868Z.m13719c();
                C12079C0.m13731e(c12076b0M13719c, objM14173k);
                AbstractC12209y1.m14199v(jM13784Z, obj, c12076b0M13719c);
                objM14173k = c12076b0M13719c;
            }
        }
        c12079c0.getClass();
        C12076B0 c12076b0 = (C12076B0) objM14173k;
        C11238i c11238i = ((C12073A0) obj2).f36865a;
        c6277d.m6829s0(2);
        AbstractC12186r abstractC12186r = (AbstractC12186r) c6277d.f20385e;
        int iMo14034k = abstractC12186r.mo14034k(abstractC12186r.mo14020F());
        Object objM6836x = c11238i.f34009Z;
        Object obj3 = c11238i.f34011p0;
        Object objM6836x2 = obj3;
        while (true) {
            try {
                int iM6794b = c6277d.m6794b();
                if (iM6794b == Integer.MAX_VALUE || abstractC12186r.mo14032g()) {
                    break;
                }
                if (iM6794b == 1) {
                    objM6836x = c6277d.m6836x((EnumC12101J1) c11238i.f34008Y, null, null);
                } else if (iM6794b != 2) {
                    try {
                        if (!c6277d.m6833u0()) {
                            throw new C12181p0("Unable to parse map entry.");
                        }
                    } catch (C12178o0 unused) {
                        if (!c6277d.m6833u0()) {
                            throw new C12181p0("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM6836x2 = c6277d.m6836x((EnumC12101J1) c11238i.f34010o0, obj3.getClass(), c12087f);
                }
            } catch (Throwable th2) {
                abstractC12186r.mo14033j(iMo14034k);
                throw th2;
            }
        }
        c12076b0.put(objM6836x, objM6836x2);
        abstractC12186r.mo14033j(iMo14034k);
    }
}
