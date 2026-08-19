package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11859B1 implements InterfaceC11880I1 {

    /* JADX INFO: renamed from: j */
    public static final int[] f36099j = new int[0];

    /* JADX INFO: renamed from: k */
    public static final Unsafe f36100k = AbstractC11906R1.m13333j();

    /* JADX INFO: renamed from: a */
    public final int[] f36101a;

    /* JADX INFO: renamed from: b */
    public final Object[] f36102b;

    /* JADX INFO: renamed from: c */
    public final int f36103c;

    /* JADX INFO: renamed from: d */
    public final int f36104d;

    /* JADX INFO: renamed from: e */
    public final AbstractC11908S0 f36105e;

    /* JADX INFO: renamed from: f */
    public final int[] f36106f;

    /* JADX INFO: renamed from: g */
    public final int f36107g;

    /* JADX INFO: renamed from: h */
    public final int f36108h;

    /* JADX INFO: renamed from: i */
    public final C11961h1 f36109i;

    public C11859B1(int[] iArr, Object[] objArr, int i10, int i11, AbstractC11908S0 abstractC11908S0, int[] iArr2, int i12, int i13, C11961h1 c11961h1, C11961h1 c11961h2) {
        this.f36101a = iArr;
        this.f36102b = objArr;
        this.f36103c = i10;
        this.f36104d = i11;
        this.f36106f = iArr2;
        this.f36107g = i12;
        this.f36108h = i13;
        this.f36109i = c11961h1;
        this.f36105e = abstractC11908S0;
    }

    /* JADX INFO: renamed from: E */
    public static Field m13227E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbM9896o = AbstractC9306j0.m9896o("Field ", str, " for ", name, " not found. Known fields are ");
            sbM9896o.append(string);
            throw new RuntimeException(sbM9896o.toString());
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m13228r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC11969j1) {
            return ((AbstractC11969j1) obj).m13478c();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:127:0x026a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0280  */
    /* JADX WARN: Code duplicated, block: B:131:0x0283  */
    /* JADX INFO: renamed from: u */
    public static C11859B1 m13229u(C11877H1 c11877h1, C11961h1 c11961h1, C11961h1 c11961h2) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        int iObjectFieldOffset;
        int i26;
        int i27;
        int iObjectFieldOffset2;
        Field fieldM13227E;
        int i28;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field fieldM13227E2;
        int i34;
        Object obj2;
        Field fieldM13227E3;
        int i35;
        char cCharAt10;
        int i36;
        char cCharAt11;
        int i37;
        char cCharAt12;
        int i38;
        char cCharAt13;
        if (!(c11877h1 instanceof C11877H1)) {
            AbstractC10763a.m11064v(c11877h1);
            throw null;
        }
        String strM13271c = c11877h1.m13271c();
        int length = strM13271c.length();
        char c9 = 55296;
        if (strM13271c.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i10 = i39 + 1;
                if (strM13271c.charAt(i39) < 55296) {
                    break;
                }
                i39 = i10;
            }
        } else {
            i10 = 1;
        }
        int i40 = i10 + 1;
        int iCharAt3 = strM13271c.charAt(i10);
        if (iCharAt3 >= 55296) {
            int i41 = iCharAt3 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i40 + 1;
                cCharAt13 = strM13271c.charAt(i40);
                if (cCharAt13 < 55296) {
                    break;
                }
                i41 |= (cCharAt13 & 8191) << i42;
                i42 += 13;
                i40 = i38;
            }
            iCharAt3 = i41 | (cCharAt13 << i42);
            i40 = i38;
        }
        if (iCharAt3 == 0) {
            i12 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i11 = 0;
            i14 = 0;
            i13 = 0;
            iArr = f36099j;
            i15 = 0;
        } else {
            int i43 = i40 + 1;
            int iCharAt4 = strM13271c.charAt(i40);
            if (iCharAt4 >= 55296) {
                int i44 = iCharAt4 & 8191;
                int i45 = 13;
                while (true) {
                    i23 = i43 + 1;
                    cCharAt8 = strM13271c.charAt(i43);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i23;
                }
                iCharAt4 = i44 | (cCharAt8 << i45);
                i43 = i23;
            }
            int i46 = i43 + 1;
            int iCharAt5 = strM13271c.charAt(i43);
            if (iCharAt5 >= 55296) {
                int i47 = iCharAt5 & 8191;
                int i48 = 13;
                while (true) {
                    i22 = i46 + 1;
                    cCharAt7 = strM13271c.charAt(i46);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i22;
                }
                iCharAt5 = i47 | (cCharAt7 << i48);
                i46 = i22;
            }
            int i49 = i46 + 1;
            int iCharAt6 = strM13271c.charAt(i46);
            if (iCharAt6 >= 55296) {
                int i50 = iCharAt6 & 8191;
                int i51 = 13;
                while (true) {
                    i21 = i49 + 1;
                    cCharAt6 = strM13271c.charAt(i49);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i21;
                }
                iCharAt6 = i50 | (cCharAt6 << i51);
                i49 = i21;
            }
            int i52 = i49 + 1;
            int iCharAt7 = strM13271c.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i20 = i52 + 1;
                    cCharAt5 = strM13271c.charAt(i52);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i20;
                }
                iCharAt7 = i53 | (cCharAt5 << i54);
                i52 = i20;
            }
            int i55 = i52 + 1;
            iCharAt = strM13271c.charAt(i52);
            if (iCharAt >= 55296) {
                int i56 = iCharAt & 8191;
                int i57 = 13;
                while (true) {
                    i19 = i55 + 1;
                    cCharAt4 = strM13271c.charAt(i55);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i19;
                }
                iCharAt = i56 | (cCharAt4 << i57);
                i55 = i19;
            }
            int i58 = i55 + 1;
            iCharAt2 = strM13271c.charAt(i55);
            if (iCharAt2 >= 55296) {
                int i59 = iCharAt2 & 8191;
                int i60 = 13;
                while (true) {
                    i18 = i58 + 1;
                    cCharAt3 = strM13271c.charAt(i58);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt3 & 8191) << i60;
                    i60 += 13;
                    i58 = i18;
                }
                iCharAt2 = i59 | (cCharAt3 << i60);
                i58 = i18;
            }
            int i61 = i58 + 1;
            int iCharAt8 = strM13271c.charAt(i58);
            if (iCharAt8 >= 55296) {
                int i62 = iCharAt8 & 8191;
                int i63 = 13;
                while (true) {
                    i17 = i61 + 1;
                    cCharAt2 = strM13271c.charAt(i61);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt2 & 8191) << i63;
                    i63 += 13;
                    i61 = i17;
                }
                iCharAt8 = i62 | (cCharAt2 << i63);
                i61 = i17;
            }
            int i64 = i61 + 1;
            int iCharAt9 = strM13271c.charAt(i61);
            if (iCharAt9 >= 55296) {
                int i65 = iCharAt9 & 8191;
                int i66 = 13;
                while (true) {
                    i16 = i64 + 1;
                    cCharAt = strM13271c.charAt(i64);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i65 |= (cCharAt & 8191) << i66;
                    i66 += 13;
                    i64 = i16;
                }
                iCharAt9 = i65 | (cCharAt << i66);
                i64 = i16;
            }
            int i67 = iCharAt4 + iCharAt4 + iCharAt5;
            int[] iArr2 = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i11 = iCharAt6;
            i12 = i67;
            i13 = iCharAt9;
            i14 = iCharAt7;
            i15 = iCharAt4;
            i40 = i64;
            iArr = iArr2;
        }
        Unsafe unsafe = f36100k;
        Object[] objArrM13272d = c11877h1.m13272d();
        Class<?> cls = c11877h1.m13269a().getClass();
        int i68 = i13 + iCharAt2;
        int i69 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i69];
        int i70 = i13;
        int i71 = i68;
        int i72 = 0;
        int i73 = 0;
        while (i40 < length) {
            int i74 = i40 + 1;
            int iCharAt10 = strM13271c.charAt(i40);
            if (iCharAt10 >= c9) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i37 = i76 + 1;
                    cCharAt12 = strM13271c.charAt(i76);
                    if (cCharAt12 < c9) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i37;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i24 = i37;
            } else {
                i24 = i74;
            }
            int i78 = i24 + 1;
            int iCharAt11 = strM13271c.charAt(i24);
            if (iCharAt11 >= c9) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i36 = i80 + 1;
                    cCharAt11 = strM13271c.charAt(i80);
                    if (cCharAt11 < c9) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i81;
                    i81 += 13;
                    i80 = i36;
                }
                iCharAt11 = i79 | (cCharAt11 << i81);
                i25 = i36;
            } else {
                i25 = i78;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i73] = i72;
                i73++;
            }
            int i82 = iCharAt11 & 255;
            int i83 = iCharAt11 & 2048;
            int i84 = length;
            if (i82 >= 51) {
                int i85 = i25 + 1;
                int iCharAt12 = strM13271c.charAt(i25);
                char c10 = 55296;
                if (iCharAt12 >= 55296) {
                    int i86 = 13;
                    int i87 = iCharAt12 & 8191;
                    int i88 = i85;
                    while (true) {
                        i35 = i88 + 1;
                        cCharAt10 = strM13271c.charAt(i88);
                        if (cCharAt10 < c10) {
                            break;
                        }
                        i87 |= (cCharAt10 & 8191) << i86;
                        i86 += 13;
                        i88 = i35;
                        c10 = 55296;
                    }
                    iCharAt12 = i87 | (cCharAt10 << i86);
                    i31 = i35;
                } else {
                    i31 = i85;
                }
                int i89 = i31;
                int i90 = i82 - 51;
                if (i90 == 9 || i90 == 17) {
                    i32 = i12 + 1;
                    int i91 = i72 / 3;
                    objArr[i91 + i91 + 1] = objArrM13272d[i12];
                } else {
                    if (i90 == 12) {
                        if (c11877h1.m13270b() == 1 || i83 != 0) {
                            i32 = i12 + 1;
                            int i92 = i72 / 3;
                            objArr[i92 + i92 + 1] = objArrM13272d[i12];
                        } else {
                            i83 = 0;
                        }
                    }
                    i33 = iCharAt12 + iCharAt12;
                    obj = objArrM13272d[i33];
                    if (obj instanceof Field) {
                        fieldM13227E2 = (Field) obj;
                    } else {
                        fieldM13227E2 = m13227E(cls, (String) obj);
                        objArrM13272d[i33] = fieldM13227E2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM13227E2);
                    i34 = i33 + 1;
                    obj2 = objArrM13272d[i34];
                    if (obj2 instanceof Field) {
                        fieldM13227E3 = (Field) obj2;
                    } else {
                        fieldM13227E3 = m13227E(cls, (String) obj2);
                        objArrM13272d[i34] = fieldM13227E3;
                    }
                    i83 = i83;
                    strM13271c = strM13271c;
                    iCharAt10 = iCharAt10;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM13227E3);
                    i40 = i89;
                    i27 = 0;
                }
                i12 = i32;
                i33 = iCharAt12 + iCharAt12;
                obj = objArrM13272d[i33];
                if (obj instanceof Field) {
                    fieldM13227E2 = (Field) obj;
                } else {
                    fieldM13227E2 = m13227E(cls, (String) obj);
                    objArrM13272d[i33] = fieldM13227E2;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM13227E2);
                i34 = i33 + 1;
                obj2 = objArrM13272d[i34];
                if (obj2 instanceof Field) {
                    fieldM13227E3 = (Field) obj2;
                } else {
                    fieldM13227E3 = m13227E(cls, (String) obj2);
                    objArrM13272d[i34] = fieldM13227E3;
                }
                i83 = i83;
                strM13271c = strM13271c;
                iCharAt10 = iCharAt10;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM13227E3);
                i40 = i89;
                i27 = 0;
            } else {
                int i93 = i12 + 1;
                Field fieldM13227E4 = m13227E(cls, (String) objArrM13272d[i12]);
                if (i82 == 9 || i82 == 17) {
                    iCharAt10 = iCharAt10;
                    int i94 = i72 / 3;
                    objArr[i94 + i94 + 1] = fieldM13227E4.getType();
                } else {
                    if (i82 == 27) {
                        i29 = 1;
                        i30 = i12 + 2;
                    } else if (i82 == 49) {
                        i30 = i12 + 2;
                        i29 = 1;
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        iCharAt10 = iCharAt10;
                        if (c11877h1.m13270b() == 1 || i83 != 0) {
                            i30 = i12 + 2;
                            int i95 = i72 / 3;
                            objArr[i95 + i95 + 1] = objArrM13272d[i93];
                            i93 = i30;
                        } else {
                            i83 = 0;
                        }
                    } else {
                        if (i82 == 50) {
                            int i96 = i12 + 2;
                            int i97 = i70 + 1;
                            iArr[i70] = i72;
                            int i98 = i72 / 3;
                            int i99 = i98 + i98;
                            objArr[i99] = objArrM13272d[i93];
                            if (i83 != 0) {
                                i93 = i12 + 3;
                                objArr[i99 + 1] = objArrM13272d[i96];
                                i70 = i97;
                            } else {
                                i93 = i96;
                                i70 = i97;
                                i83 = 0;
                            }
                        }
                        iCharAt10 = iCharAt10;
                    }
                    int i100 = i72 / 3;
                    objArr[i100 + i100 + i29] = objArrM13272d[i93];
                    i93 = i30;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM13227E4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) == 0 || i82 > 17) {
                    i26 = i25;
                    i27 = 0;
                } else {
                    i26 = i25 + 1;
                    int iCharAt13 = strM13271c.charAt(i25);
                    if (iCharAt13 >= 55296) {
                        int i101 = iCharAt13 & 8191;
                        int i102 = 13;
                        while (true) {
                            i28 = i26 + 1;
                            cCharAt9 = strM13271c.charAt(i26);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i101 |= (cCharAt9 & 8191) << i102;
                            i102 += 13;
                            i26 = i28;
                        }
                        iCharAt13 = i101 | (cCharAt9 << i102);
                        i26 = i28;
                    }
                    int i103 = (iCharAt13 / 32) + i15 + i15;
                    Object obj3 = objArrM13272d[i103];
                    if (obj3 instanceof Field) {
                        fieldM13227E = (Field) obj3;
                    } else {
                        fieldM13227E = m13227E(cls, (String) obj3);
                        objArrM13272d[i103] = fieldM13227E;
                    }
                    i27 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM13227E);
                }
                if (i82 >= 18 && i82 <= 49) {
                    iArr[i71] = iObjectFieldOffset3;
                    i71++;
                }
                i40 = i26;
                i12 = i93;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i104 = i72 + 1;
            iArr3[i72] = iCharAt10;
            int i105 = i72 + 2;
            iArr3[i104] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i83 != 0 ? Integer.MIN_VALUE : 0) | (i82 << 20) | iObjectFieldOffset2;
            i72 += 3;
            iArr3[i105] = (i27 << 20) | iObjectFieldOffset;
            strM13271c = strM13271c;
            length = i84;
            i14 = i14;
            i11 = i11;
            c9 = 55296;
        }
        return new C11859B1(iArr3, objArr, i11, i14, c11877h1.m13269a(), iArr, i13, i68, c11961h1, c11961h2);
    }

    /* JADX INFO: renamed from: v */
    public static int m13230v(long j10, Object obj) {
        return ((Integer) AbstractC11906R1.m13332i(j10, obj)).intValue();
    }

    /* JADX INFO: renamed from: x */
    public static int m13231x(int i10) {
        return (i10 >>> 20) & 255;
    }

    /* JADX INFO: renamed from: z */
    public static long m13232z(long j10, Object obj) {
        return ((Long) AbstractC11906R1.m13332i(j10, obj)).longValue();
    }

    /* JADX INFO: renamed from: A */
    public final InterfaceC11977l1 m13233A(int i10) {
        int i11 = i10 / 3;
        return (InterfaceC11977l1) this.f36102b[i11 + i11 + 1];
    }

    /* JADX INFO: renamed from: B */
    public final InterfaceC11880I1 m13234B(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f36102b;
        InterfaceC11880I1 interfaceC11880I1 = (InterfaceC11880I1) objArr[i12];
        if (interfaceC11880I1 != null) {
            return interfaceC11880I1;
        }
        InterfaceC11880I1 interfaceC11880I1M13262a = C11871F1.f36125c.m13262a((Class) objArr[i12 + 1]);
        objArr[i12] = interfaceC11880I1M13262a;
        return interfaceC11880I1M13262a;
    }

    /* JADX INFO: renamed from: C */
    public final Object m13235C(int i10, Object obj) {
        InterfaceC11880I1 interfaceC11880I1M13234B = m13234B(i10);
        int iM13257y = m13257y(i10) & 1048575;
        if (!m13252p(i10, obj)) {
            return interfaceC11880I1M13234B.mo13243g();
        }
        Object object = f36100k.getObject(obj, iM13257y);
        if (m13228r(object)) {
            return object;
        }
        AbstractC11969j1 abstractC11969j1Mo13243g = interfaceC11880I1M13234B.mo13243g();
        if (object != null) {
            interfaceC11880I1M13234B.mo13241e(abstractC11969j1Mo13243g, object);
        }
        return abstractC11969j1Mo13243g;
    }

    /* JADX INFO: renamed from: D */
    public final Object m13236D(int i10, Object obj, int i11) {
        InterfaceC11880I1 interfaceC11880I1M13234B = m13234B(i11);
        if (!m13254s(i10, obj, i11)) {
            return interfaceC11880I1M13234B.mo13243g();
        }
        Object object = f36100k.getObject(obj, m13257y(i11) & 1048575);
        if (m13228r(object)) {
            return object;
        }
        AbstractC11969j1 abstractC11969j1Mo13243g = interfaceC11880I1M13234B.mo13243g();
        if (object != null) {
            interfaceC11880I1M13234B.mo13241e(abstractC11969j1Mo13243g, object);
        }
        return abstractC11969j1Mo13243g;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: a */
    public final void mo13237a(Object obj) {
        if (!m13228r(obj)) {
            return;
        }
        int i10 = 0;
        if (obj instanceof AbstractC11969j1) {
            AbstractC11969j1 abstractC11969j1 = (AbstractC11969j1) obj;
            abstractC11969j1.m13483l();
            abstractC11969j1.zza = 0;
            abstractC11969j1.m13482j();
        }
        while (true) {
            int[] iArr = this.f36101a;
            if (i10 >= iArr.length) {
                this.f36109i.getClass();
                C11961h1.m13467d(obj);
                return;
            }
            int iM13257y = m13257y(i10);
            int i11 = 1048575 & iM13257y;
            int iM13231x = m13231x(iM13257y);
            long j10 = i11;
            if (iM13231x != 9) {
                if (iM13231x != 60 && iM13231x != 68) {
                    switch (iM13231x) {
                        case 17:
                            if (m13252p(i10, obj)) {
                                m13234B(i10).mo13237a(f36100k.getObject(obj, j10));
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
                            ((AbstractC11911T0) ((InterfaceC11985n1) AbstractC11906R1.m13332i(j10, obj))).m13348i();
                            break;
                        case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                            Unsafe unsafe = f36100k;
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                ((C12025x1) object).m13560c();
                                unsafe.putObject(obj, j10, object);
                            }
                            break;
                    }
                } else if (m13254s(iArr[i10], obj, i10)) {
                    m13234B(i10).mo13237a(f36100k.getObject(obj, j10));
                }
            } else if (m13252p(i10, obj)) {
                m13234B(i10).mo13237a(f36100k.getObject(obj, j10));
            }
            i10 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: b */
    public final void mo13238b(Object obj, byte[] bArr, int i10, int i11, C11917V0 c11917v0) {
        m13255t(obj, bArr, i10, i11, 0, c11917v0);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ca A[LOOP:1: B:45:0x00b9->B:50:0x00ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ee A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: c */
    public final boolean mo13239c(Object obj) {
        int i10;
        int i11;
        List list;
        InterfaceC11880I1 interfaceC11880I1M13234B;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.f36107g) {
            int i16 = this.f36106f[i14];
            int[] iArr = this.f36101a;
            int i17 = iArr[i16];
            int iM13257y = m13257y(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = f36100k.getInt(obj, i19);
                }
                i11 = i13;
                i10 = i19;
            } else {
                i10 = i15;
                i11 = i13;
            }
            if ((268435456 & iM13257y) != 0 && !m13253q(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iM13231x = m13231x(iM13257y);
            if (iM13231x == 9 || iM13231x == 17) {
                if (m13253q(obj, i16, i10, i11, i20) && !m13234B(i16).mo13239c(AbstractC11906R1.m13332i(iM13257y & 1048575, obj))) {
                    return false;
                }
            } else if (iM13231x == 27) {
                list = (List) AbstractC11906R1.m13332i(iM13257y & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC11880I1M13234B = m13234B(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!interfaceC11880I1M13234B.mo13239c(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iM13231x == 60 || iM13231x == 68) {
                if (m13254s(i17, obj, i16) && !m13234B(i16).mo13239c(AbstractC11906R1.m13332i(iM13257y & 1048575, obj))) {
                    return false;
                }
            } else if (iM13231x == 49) {
                list = (List) AbstractC11906R1.m13332i(iM13257y & 1048575, obj);
                if (list.isEmpty()) {
                    interfaceC11880I1M13234B = m13234B(i16);
                    while (i12 < list.size()) {
                        if (!interfaceC11880I1M13234B.mo13239c(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iM13231x == 50 && !((C12025x1) AbstractC11906R1.m13332i(iM13257y & 1048575, obj)).isEmpty()) {
                int i21 = i16 / 3;
                AbstractC0168G.m507B(this.f36102b[i21 + i21]);
                throw null;
            }
            i14++;
            i15 = i10;
            i13 = i11;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0395  */
    /* JADX WARN: Code duplicated, block: B:191:0x04d3  */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: d */
    public final int mo13240d(AbstractC11969j1 abstractC11969j1) {
        int i10;
        int i11;
        int i12;
        int iM13386n0;
        int iM13382V;
        int iM13386n1;
        int iMo13368j;
        int iM13386n2;
        int iM13289m;
        int iM13386n3;
        int size;
        int iM13293q;
        int iM13386n4;
        int iM13386n5;
        int iM13386n6;
        int iM13383k0;
        Unsafe unsafe = f36100k;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int iM11045c = 0;
        while (true) {
            int[] iArr = this.f36101a;
            if (i16 >= iArr.length) {
                return abstractC11969j1.zzc.m13308a() + iM11045c;
            }
            int iM13257y = m13257y(i16);
            int iM13231x = m13231x(iM13257y);
            int i17 = iArr[i16];
            int i18 = iArr[i16 + 2];
            int i19 = i18 & i13;
            if (iM13231x <= 17) {
                if (i19 != i14) {
                    i15 = i19 == i13 ? 0 : unsafe.getInt(abstractC11969j1, i19);
                    i14 = i19;
                }
                i10 = i14;
                i11 = i15;
                i12 = 1 << (i18 >>> 20);
            } else {
                i10 = i14;
                i11 = i15;
                i12 = 0;
            }
            int i20 = iM13257y & i13;
            if (iM13231x >= EnumC11949e1.f36255Z.m13415a()) {
                EnumC11949e1.f36256o0.getClass();
            }
            long j10 = i20;
            switch (iM13231x) {
                case 0:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        iM11045c = AbstractC10763a.m11045c(i17 << 3, 8, iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 1:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        iM11045c = AbstractC10763a.m11045c(i17 << 3, 4, iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 2:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        long j11 = unsafe.getLong(abstractC11969j1, j10);
                        iM13386n0 = C11933a1.m13386n0(i17 << 3);
                        iM13382V = C11933a1.m13382V(j11);
                        iM11045c += iM13382V + iM13386n0;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 3:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        long j12 = unsafe.getLong(abstractC11969j1, j10);
                        iM13386n0 = C11933a1.m13386n0(i17 << 3);
                        iM13382V = C11933a1.m13382V(j12);
                        iM11045c += iM13382V + iM13386n0;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 4:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        long j13 = unsafe.getInt(abstractC11969j1, j10);
                        iM13386n0 = C11933a1.m13386n0(i17 << 3);
                        iM13382V = C11933a1.m13382V(j13);
                        iM11045c += iM13382V + iM13386n0;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 5:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        iM11045c = AbstractC10763a.m11045c(i17 << 3, 8, iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 6:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        iM11045c = AbstractC10763a.m11045c(i17 << 3, 4, iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 7:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        iM11045c = AbstractC10763a.m11045c(i17 << 3, 1, iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 8:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        int i21 = i17 << 3;
                        Object object = unsafe.getObject(abstractC11969j1, j10);
                        if (object instanceof C11929Z0) {
                            iM13386n1 = C11933a1.m13386n0(i21);
                            iMo13368j = ((C11929Z0) object).mo13368j();
                            iM13386n2 = C11933a1.m13386n0(iMo13368j);
                            iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                        } else {
                            iM13386n0 = C11933a1.m13386n0(i21);
                            iM13382V = C11933a1.m13385m0((String) object);
                            iM11045c += iM13382V + iM13386n0;
                        }
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 9:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        iM13289m = AbstractC11883J1.m13289m(i17, unsafe.getObject(abstractC11969j1, j10), m13234B(i16));
                        iM11045c += iM13289m;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 10:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        C11929Z0 c11929z0 = (C11929Z0) unsafe.getObject(abstractC11969j1, j10);
                        iM13386n1 = C11933a1.m13386n0(i17 << 3);
                        iMo13368j = c11929z0.mo13368j();
                        iM13386n2 = C11933a1.m13386n0(iMo13368j);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 11:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        iM11045c = AbstractC10763a.m11045c(unsafe.getInt(abstractC11969j1, j10), C11933a1.m13386n0(i17 << 3), iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 12:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        long j14 = unsafe.getInt(abstractC11969j1, j10);
                        iM13386n0 = C11933a1.m13386n0(i17 << 3);
                        iM13382V = C11933a1.m13382V(j14);
                        iM11045c += iM13382V + iM13386n0;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 13:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        iM11045c = AbstractC10763a.m11045c(i17 << 3, 4, iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 14:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        iM11045c = AbstractC10763a.m11045c(i17 << 3, 8, iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 15:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        int i22 = unsafe.getInt(abstractC11969j1, j10);
                        iM11045c = AbstractC10763a.m11045c((i22 >> 31) ^ (i22 + i22), C11933a1.m13386n0(i17 << 3), iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 16:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        long j15 = unsafe.getLong(abstractC11969j1, j10);
                        iM13386n0 = C11933a1.m13386n0(i17 << 3);
                        iM13382V = C11933a1.m13382V((j15 >> 63) ^ (j15 + j15));
                        iM11045c += iM13382V + iM13386n0;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 17:
                    if (m13253q(abstractC11969j1, i16, i10, i11, i12)) {
                        iM13289m = C11933a1.m13383k0(i17, (AbstractC11908S0) unsafe.getObject(abstractC11969j1, j10), m13234B(i16));
                        iM11045c += iM13289m;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 18:
                    iM13289m = AbstractC11883J1.m13285i(i17, (List) unsafe.getObject(abstractC11969j1, j10));
                    iM11045c += iM13289m;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 19:
                    iM13289m = AbstractC11883J1.m13283g(i17, (List) unsafe.getObject(abstractC11969j1, j10));
                    iM11045c += iM13289m;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC11969j1, j10);
                    C11961h1 c11961h1 = AbstractC11883J1.f36151a;
                    if (list.size() == 0) {
                        iM13386n3 = 0;
                    } else {
                        iM13386n3 = (C11933a1.m13386n0(i17 << 3) * list.size()) + AbstractC11883J1.m13288l(list);
                    }
                    iM11045c += iM13386n3;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC11969j1, j10);
                    C11961h1 c11961h2 = AbstractC11883J1.f36151a;
                    size = list2.size();
                    if (size == 0) {
                        iM13386n5 = 0;
                    } else {
                        iM13293q = AbstractC11883J1.m13293q(list2);
                        iM13386n4 = C11933a1.m13386n0(i17 << 3);
                        iM13386n5 = (iM13386n4 * size) + iM13293q;
                    }
                    iM11045c += iM13386n5;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC11969j1, j10);
                    C11961h1 c11961h3 = AbstractC11883J1.f36151a;
                    size = list3.size();
                    if (size == 0) {
                        iM13386n5 = 0;
                    } else {
                        iM13293q = AbstractC11883J1.m13287k(list3);
                        iM13386n4 = C11933a1.m13386n0(i17 << 3);
                        iM13386n5 = (iM13386n4 * size) + iM13293q;
                    }
                    iM11045c += iM13386n5;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 23:
                    iM13289m = AbstractC11883J1.m13285i(i17, (List) unsafe.getObject(abstractC11969j1, j10));
                    iM11045c += iM13289m;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 24:
                    iM13289m = AbstractC11883J1.m13283g(i17, (List) unsafe.getObject(abstractC11969j1, j10));
                    iM11045c += iM13289m;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC11969j1, j10);
                    C11961h1 c11961h4 = AbstractC11883J1.f36151a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM13386n3 = 0;
                    } else {
                        iM13386n3 = (C11933a1.m13386n0(i17 << 3) + 1) * size2;
                    }
                    iM11045c += iM13386n3;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC11969j1, j10);
                    C11961h1 c11961h5 = AbstractC11883J1.f36151a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM13386n5 = 0;
                    } else {
                        iM13386n5 = C11933a1.m13386n0(i17 << 3) * size3;
                        if (list5 instanceof InterfaceC12005s1) {
                            InterfaceC12005s1 interfaceC12005s1 = (InterfaceC12005s1) list5;
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object objM13524c = interfaceC12005s1.m13524c();
                                if (objM13524c instanceof C11929Z0) {
                                    int iMo13368j2 = ((C11929Z0) objM13524c).mo13368j();
                                    iM13386n5 = AbstractC10763a.m11045c(iMo13368j2, iMo13368j2, iM13386n5);
                                } else {
                                    iM13386n5 = C11933a1.m13385m0((String) objM13524c) + iM13386n5;
                                }
                            }
                        } else {
                            for (int i24 = 0; i24 < size3; i24++) {
                                Object obj = list5.get(i24);
                                if (obj instanceof C11929Z0) {
                                    int iMo13368j3 = ((C11929Z0) obj).mo13368j();
                                    iM13386n5 = AbstractC10763a.m11045c(iMo13368j3, iMo13368j3, iM13386n5);
                                } else {
                                    iM13386n5 = C11933a1.m13385m0((String) obj) + iM13386n5;
                                }
                            }
                        }
                    }
                    iM11045c += iM13386n5;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC11969j1, j10);
                    InterfaceC11880I1 interfaceC11880I1M13234B = m13234B(i16);
                    C11961h1 c11961h6 = AbstractC11883J1.f36151a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iM13386n6 = 0;
                    } else {
                        iM13386n6 = C11933a1.m13386n0(i17 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            iM13386n6 += C11933a1.m13384l0((AbstractC11908S0) list6.get(i25), interfaceC11880I1M13234B);
                        }
                    }
                    iM11045c += iM13386n6;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC11969j1, j10);
                    C11961h1 c11961h7 = AbstractC11883J1.f36151a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iM13386n5 = 0;
                    } else {
                        iM13386n5 = C11933a1.m13386n0(i17 << 3) * size5;
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int iMo13368j4 = ((C11929Z0) list7.get(i26)).mo13368j();
                            iM13386n5 = AbstractC10763a.m11045c(iMo13368j4, iMo13368j4, iM13386n5);
                        }
                    }
                    iM11045c += iM13386n5;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC11969j1, j10);
                    C11961h1 c11961h8 = AbstractC11883J1.f36151a;
                    size = list8.size();
                    if (size == 0) {
                        iM13386n5 = 0;
                    } else {
                        iM13293q = AbstractC11883J1.m13292p(list8);
                        iM13386n4 = C11933a1.m13386n0(i17 << 3);
                        iM13386n5 = (iM13386n4 * size) + iM13293q;
                    }
                    iM11045c += iM13386n5;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC11969j1, j10);
                    C11961h1 c11961h9 = AbstractC11883J1.f36151a;
                    size = list9.size();
                    if (size == 0) {
                        iM13386n5 = 0;
                    } else {
                        iM13293q = AbstractC11883J1.m13282f(list9);
                        iM13386n4 = C11933a1.m13386n0(i17 << 3);
                        iM13386n5 = (iM13386n4 * size) + iM13293q;
                    }
                    iM11045c += iM13386n5;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 31:
                    iM13289m = AbstractC11883J1.m13283g(i17, (List) unsafe.getObject(abstractC11969j1, j10));
                    iM11045c += iM13289m;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 32:
                    iM13289m = AbstractC11883J1.m13285i(i17, (List) unsafe.getObject(abstractC11969j1, j10));
                    iM11045c += iM13289m;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC11969j1, j10);
                    C11961h1 c11961h10 = AbstractC11883J1.f36151a;
                    size = list10.size();
                    if (size == 0) {
                        iM13386n5 = 0;
                    } else {
                        iM13293q = AbstractC11883J1.m13290n(list10);
                        iM13386n4 = C11933a1.m13386n0(i17 << 3);
                        iM13386n5 = (iM13386n4 * size) + iM13293q;
                    }
                    iM11045c += iM13386n5;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC11969j1, j10);
                    C11961h1 c11961h11 = AbstractC11883J1.f36151a;
                    size = list11.size();
                    if (size == 0) {
                        iM13386n5 = 0;
                    } else {
                        iM13293q = AbstractC11883J1.m13291o(list11);
                        iM13386n4 = C11933a1.m13386n0(i17 << 3);
                        iM13386n5 = (iM13386n4 * size) + iM13293q;
                    }
                    iM11045c += iM13386n5;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 35:
                    iM13386n1 = AbstractC11883J1.m13286j((List) unsafe.getObject(abstractC11969j1, j10));
                    if (iM13386n1 > 0) {
                        iMo13368j = C11933a1.m13386n0(i17 << 3);
                        iM13386n2 = C11933a1.m13386n0(iM13386n1);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 36:
                    iM13386n1 = AbstractC11883J1.m13284h((List) unsafe.getObject(abstractC11969j1, j10));
                    if (iM13386n1 > 0) {
                        iMo13368j = C11933a1.m13386n0(i17 << 3);
                        iM13386n2 = C11933a1.m13386n0(iM13386n1);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 37:
                    iM13386n1 = AbstractC11883J1.m13288l((List) unsafe.getObject(abstractC11969j1, j10));
                    if (iM13386n1 > 0) {
                        iMo13368j = C11933a1.m13386n0(i17 << 3);
                        iM13386n2 = C11933a1.m13386n0(iM13386n1);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 38:
                    iM13386n1 = AbstractC11883J1.m13293q((List) unsafe.getObject(abstractC11969j1, j10));
                    if (iM13386n1 > 0) {
                        iMo13368j = C11933a1.m13386n0(i17 << 3);
                        iM13386n2 = C11933a1.m13386n0(iM13386n1);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 39:
                    iM13386n1 = AbstractC11883J1.m13287k((List) unsafe.getObject(abstractC11969j1, j10));
                    if (iM13386n1 > 0) {
                        iMo13368j = C11933a1.m13386n0(i17 << 3);
                        iM13386n2 = C11933a1.m13386n0(iM13386n1);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 40:
                    iM13386n1 = AbstractC11883J1.m13286j((List) unsafe.getObject(abstractC11969j1, j10));
                    if (iM13386n1 > 0) {
                        iMo13368j = C11933a1.m13386n0(i17 << 3);
                        iM13386n2 = C11933a1.m13386n0(iM13386n1);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 41:
                    iM13386n1 = AbstractC11883J1.m13284h((List) unsafe.getObject(abstractC11969j1, j10));
                    if (iM13386n1 > 0) {
                        iMo13368j = C11933a1.m13386n0(i17 << 3);
                        iM13386n2 = C11933a1.m13386n0(iM13386n1);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(abstractC11969j1, j10);
                    C11961h1 c11961h12 = AbstractC11883J1.f36151a;
                    iM13386n1 = list12.size();
                    if (iM13386n1 > 0) {
                        iMo13368j = C11933a1.m13386n0(i17 << 3);
                        iM13386n2 = C11933a1.m13386n0(iM13386n1);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 43:
                    iM13386n1 = AbstractC11883J1.m13292p((List) unsafe.getObject(abstractC11969j1, j10));
                    if (iM13386n1 > 0) {
                        iMo13368j = C11933a1.m13386n0(i17 << 3);
                        iM13386n2 = C11933a1.m13386n0(iM13386n1);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 44:
                    iM13386n1 = AbstractC11883J1.m13282f((List) unsafe.getObject(abstractC11969j1, j10));
                    if (iM13386n1 > 0) {
                        iMo13368j = C11933a1.m13386n0(i17 << 3);
                        iM13386n2 = C11933a1.m13386n0(iM13386n1);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 45:
                    iM13386n1 = AbstractC11883J1.m13284h((List) unsafe.getObject(abstractC11969j1, j10));
                    if (iM13386n1 > 0) {
                        iMo13368j = C11933a1.m13386n0(i17 << 3);
                        iM13386n2 = C11933a1.m13386n0(iM13386n1);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 46:
                    iM13386n1 = AbstractC11883J1.m13286j((List) unsafe.getObject(abstractC11969j1, j10));
                    if (iM13386n1 > 0) {
                        iMo13368j = C11933a1.m13386n0(i17 << 3);
                        iM13386n2 = C11933a1.m13386n0(iM13386n1);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 47:
                    iM13386n1 = AbstractC11883J1.m13290n((List) unsafe.getObject(abstractC11969j1, j10));
                    if (iM13386n1 > 0) {
                        iMo13368j = C11933a1.m13386n0(i17 << 3);
                        iM13386n2 = C11933a1.m13386n0(iM13386n1);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                    iM13386n1 = AbstractC11883J1.m13291o((List) unsafe.getObject(abstractC11969j1, j10));
                    if (iM13386n1 > 0) {
                        iMo13368j = C11933a1.m13386n0(i17 << 3);
                        iM13386n2 = C11933a1.m13386n0(iM13386n1);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                    List list13 = (List) unsafe.getObject(abstractC11969j1, j10);
                    InterfaceC11880I1 interfaceC11880I1M13234B2 = m13234B(i16);
                    C11961h1 c11961h13 = AbstractC11883J1.f36151a;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iM13383k0 = 0;
                    } else {
                        iM13383k0 = 0;
                        for (int i27 = 0; i27 < size6; i27++) {
                            iM13383k0 += C11933a1.m13383k0(i17, (AbstractC11908S0) list13.get(i27), interfaceC11880I1M13234B2);
                        }
                    }
                    iM11045c += iM13383k0;
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    int i28 = i16 / 3;
                    C12025x1 c12025x1 = (C12025x1) unsafe.getObject(abstractC11969j1, j10);
                    AbstractC0168G.m507B(this.f36102b[i28 + i28]);
                    if (c12025x1.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = c12025x1.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                case 51:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        iM11045c = AbstractC10763a.m11045c(i17 << 3, 8, iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 52:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        iM11045c = AbstractC10763a.m11045c(i17 << 3, 4, iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 53:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        long jM13232z = m13232z(j10, abstractC11969j1);
                        iM13386n0 = C11933a1.m13386n0(i17 << 3);
                        iM13382V = C11933a1.m13382V(jM13232z);
                        iM11045c += iM13382V + iM13386n0;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 54:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        long jM13232z2 = m13232z(j10, abstractC11969j1);
                        iM13386n0 = C11933a1.m13386n0(i17 << 3);
                        iM13382V = C11933a1.m13382V(jM13232z2);
                        iM11045c += iM13382V + iM13386n0;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 55:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        long jM13230v = m13230v(j10, abstractC11969j1);
                        iM13386n0 = C11933a1.m13386n0(i17 << 3);
                        iM13382V = C11933a1.m13382V(jM13230v);
                        iM11045c += iM13382V + iM13386n0;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 56:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        iM11045c = AbstractC10763a.m11045c(i17 << 3, 8, iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 57:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        iM11045c = AbstractC10763a.m11045c(i17 << 3, 4, iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 58:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        iM11045c = AbstractC10763a.m11045c(i17 << 3, 1, iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 59:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        int i29 = i17 << 3;
                        Object object2 = unsafe.getObject(abstractC11969j1, j10);
                        if (object2 instanceof C11929Z0) {
                            iM13386n1 = C11933a1.m13386n0(i29);
                            iMo13368j = ((C11929Z0) object2).mo13368j();
                            iM13386n2 = C11933a1.m13386n0(iMo13368j);
                            iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                        } else {
                            iM13386n0 = C11933a1.m13386n0(i29);
                            iM13382V = C11933a1.m13385m0((String) object2);
                            iM11045c += iM13382V + iM13386n0;
                        }
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 60:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        iM13289m = AbstractC11883J1.m13289m(i17, unsafe.getObject(abstractC11969j1, j10), m13234B(i16));
                        iM11045c += iM13289m;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 61:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        C11929Z0 c11929z1 = (C11929Z0) unsafe.getObject(abstractC11969j1, j10);
                        iM13386n1 = C11933a1.m13386n0(i17 << 3);
                        iMo13368j = c11929z1.mo13368j();
                        iM13386n2 = C11933a1.m13386n0(iMo13368j);
                        iM11045c += iM13386n2 + iMo13368j + iM13386n1;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 62:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        iM11045c = AbstractC10763a.m11045c(m13230v(j10, abstractC11969j1), C11933a1.m13386n0(i17 << 3), iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 63:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        long jM13230v2 = m13230v(j10, abstractC11969j1);
                        iM13386n0 = C11933a1.m13386n0(i17 << 3);
                        iM13382V = C11933a1.m13382V(jM13230v2);
                        iM11045c += iM13382V + iM13386n0;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 64:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        iM11045c = AbstractC10763a.m11045c(i17 << 3, 4, iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 65:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        iM11045c = AbstractC10763a.m11045c(i17 << 3, 8, iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 66:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        int iM13230v = m13230v(j10, abstractC11969j1);
                        iM11045c = AbstractC10763a.m11045c((iM13230v >> 31) ^ (iM13230v + iM13230v), C11933a1.m13386n0(i17 << 3), iM11045c);
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 67:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        long jM13232z3 = m13232z(j10, abstractC11969j1);
                        iM13386n0 = C11933a1.m13386n0(i17 << 3);
                        iM13382V = C11933a1.m13382V((jM13232z3 >> 63) ^ (jM13232z3 + jM13232z3));
                        iM11045c += iM13382V + iM13386n0;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 68:
                    if (m13254s(i17, abstractC11969j1, i16)) {
                        iM13289m = C11933a1.m13383k0(i17, (AbstractC11908S0) unsafe.getObject(abstractC11969j1, j10), m13234B(i16));
                        iM11045c += iM13289m;
                    }
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                default:
                    i16 += 3;
                    i14 = i10;
                    i15 = i11;
                    i13 = 1048575;
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: e */
    public final void mo13241e(Object obj, Object obj2) {
        if (!m13228r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f36101a;
            if (i10 >= iArr.length) {
                AbstractC11883J1.m13295s(obj, obj2);
                return;
            }
            int iM13257y = m13257y(i10);
            int i11 = iM13257y & 1048575;
            int iM13231x = m13231x(iM13257y);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iM13231x) {
                case 0:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13335l(obj, j10, AbstractC11906R1.f36183c.mo13314a(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 1:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13336m(obj, j10, AbstractC11906R1.f36183c.mo13315b(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 2:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13338o(obj, j10, AbstractC11906R1.m13330g(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 3:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13338o(obj, j10, AbstractC11906R1.m13330g(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 4:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13337n(j10, obj, AbstractC11906R1.m13329f(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 5:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13338o(obj, j10, AbstractC11906R1.m13330g(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 6:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13337n(j10, obj, AbstractC11906R1.m13329f(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 7:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13334k(obj, j10, AbstractC11906R1.f36183c.mo13320g(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 8:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13339p(j10, obj, AbstractC11906R1.m13332i(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 9:
                    m13246j(obj, i10, obj2);
                    break;
                case 10:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13339p(j10, obj, AbstractC11906R1.m13332i(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 11:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13337n(j10, obj, AbstractC11906R1.m13329f(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 12:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13337n(j10, obj, AbstractC11906R1.m13329f(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 13:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13337n(j10, obj, AbstractC11906R1.m13329f(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 14:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13338o(obj, j10, AbstractC11906R1.m13330g(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 15:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13337n(j10, obj, AbstractC11906R1.m13329f(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 16:
                    if (m13252p(i10, obj2)) {
                        AbstractC11906R1.m13338o(obj, j10, AbstractC11906R1.m13330g(j10, obj2));
                        m13248l(i10, obj);
                    }
                    break;
                case 17:
                    m13246j(obj, i10, obj2);
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
                    InterfaceC11985n1 interfaceC11985n1Mo13266e = (InterfaceC11985n1) AbstractC11906R1.m13332i(j10, obj);
                    InterfaceC11985n1 interfaceC11985n1 = (InterfaceC11985n1) AbstractC11906R1.m13332i(j10, obj2);
                    int size = interfaceC11985n1Mo13266e.size();
                    int size2 = interfaceC11985n1.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC11911T0) interfaceC11985n1Mo13266e).f36192Y) {
                            interfaceC11985n1Mo13266e = interfaceC11985n1Mo13266e.mo13266e(size2 + size);
                        }
                        interfaceC11985n1Mo13266e.addAll(interfaceC11985n1);
                    }
                    if (size > 0) {
                        interfaceC11985n1 = interfaceC11985n1Mo13266e;
                    }
                    AbstractC11906R1.m13339p(j10, obj, interfaceC11985n1);
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    C11961h1 c11961h1 = AbstractC11883J1.f36151a;
                    AbstractC11906R1.m13339p(j10, obj, C11961h1.m13466c(AbstractC11906R1.m13332i(j10, obj), AbstractC11906R1.m13332i(j10, obj2)));
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
                    if (m13254s(i12, obj2, i10)) {
                        AbstractC11906R1.m13339p(j10, obj, AbstractC11906R1.m13332i(j10, obj2));
                        AbstractC11906R1.m13337n(iArr[i10 + 2] & 1048575, obj, i12);
                    }
                    break;
                case 60:
                    m13247k(obj, i10, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m13254s(i12, obj2, i10)) {
                        AbstractC11906R1.m13339p(j10, obj, AbstractC11906R1.m13332i(j10, obj2));
                        AbstractC11906R1.m13337n(iArr[i10 + 2] & 1048575, obj, i12);
                    }
                    break;
                case 68:
                    m13247k(obj, i10, obj2);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: f */
    public final int mo13242f(AbstractC11969j1 abstractC11969j1) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f36101a;
            if (i14 >= iArr.length) {
                return abstractC11969j1.zzc.hashCode() + (i15 * 53);
            }
            int iM13257y = m13257y(i14);
            int i16 = 1048575 & iM13257y;
            int iM13231x = m13231x(iM13257y);
            int i17 = iArr[i14];
            long j10 = i16;
            int i18 = 1237;
            int iHashCode = 37;
            switch (iM13231x) {
                case 0:
                    i10 = i15 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(AbstractC11906R1.f36183c.mo13314a(j10, abstractC11969j1));
                    Charset charset = AbstractC11989o1.f36309a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i11 = i15 * 53;
                    iFloatToIntBits = Float.floatToIntBits(AbstractC11906R1.f36183c.mo13315b(j10, abstractC11969j1));
                    i15 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i15 * 53;
                    jDoubleToLongBits = AbstractC11906R1.m13330g(j10, abstractC11969j1);
                    Charset charset2 = AbstractC11989o1.f36309a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i10 = i15 * 53;
                    jDoubleToLongBits = AbstractC11906R1.m13330g(j10, abstractC11969j1);
                    Charset charset3 = AbstractC11989o1.f36309a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i11 = i15 * 53;
                    iFloatToIntBits = AbstractC11906R1.m13329f(j10, abstractC11969j1);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 5:
                    i10 = i15 * 53;
                    jDoubleToLongBits = AbstractC11906R1.m13330g(j10, abstractC11969j1);
                    Charset charset4 = AbstractC11989o1.f36309a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i11 = i15 * 53;
                    iFloatToIntBits = AbstractC11906R1.m13329f(j10, abstractC11969j1);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 7:
                    i12 = i15 * 53;
                    boolean zMo13320g = AbstractC11906R1.f36183c.mo13320g(j10, abstractC11969j1);
                    Charset charset5 = AbstractC11989o1.f36309a;
                    if (zMo13320g) {
                        i18 = 1231;
                    }
                    i15 = i18 + i12;
                    break;
                case 8:
                    i11 = i15 * 53;
                    iFloatToIntBits = ((String) AbstractC11906R1.m13332i(j10, abstractC11969j1)).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case 9:
                    i13 = i15 * 53;
                    Object objM13332i = AbstractC11906R1.m13332i(j10, abstractC11969j1);
                    if (objM13332i != null) {
                        iHashCode = objM13332i.hashCode();
                    }
                    i15 = i13 + iHashCode;
                    break;
                case 10:
                    i11 = i15 * 53;
                    iFloatToIntBits = AbstractC11906R1.m13332i(j10, abstractC11969j1).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i11 = i15 * 53;
                    iFloatToIntBits = AbstractC11906R1.m13329f(j10, abstractC11969j1);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 12:
                    i11 = i15 * 53;
                    iFloatToIntBits = AbstractC11906R1.m13329f(j10, abstractC11969j1);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 13:
                    i11 = i15 * 53;
                    iFloatToIntBits = AbstractC11906R1.m13329f(j10, abstractC11969j1);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 14:
                    i10 = i15 * 53;
                    jDoubleToLongBits = AbstractC11906R1.m13330g(j10, abstractC11969j1);
                    Charset charset6 = AbstractC11989o1.f36309a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i11 = i15 * 53;
                    iFloatToIntBits = AbstractC11906R1.m13329f(j10, abstractC11969j1);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 16:
                    i10 = i15 * 53;
                    jDoubleToLongBits = AbstractC11906R1.m13330g(j10, abstractC11969j1);
                    Charset charset7 = AbstractC11989o1.f36309a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i13 = i15 * 53;
                    Object objM13332i2 = AbstractC11906R1.m13332i(j10, abstractC11969j1);
                    if (objM13332i2 != null) {
                        iHashCode = objM13332i2.hashCode();
                    }
                    i15 = i13 + iHashCode;
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
                    i11 = i15 * 53;
                    iFloatToIntBits = AbstractC11906R1.m13332i(j10, abstractC11969j1).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    i11 = i15 * 53;
                    iFloatToIntBits = AbstractC11906R1.m13332i(j10, abstractC11969j1).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case 51:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) AbstractC11906R1.m13332i(j10, abstractC11969j1)).doubleValue());
                        Charset charset8 = AbstractC11989o1.f36309a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) AbstractC11906R1.m13332i(j10, abstractC11969j1)).floatValue());
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 53:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = m13232z(j10, abstractC11969j1);
                        Charset charset9 = AbstractC11989o1.f36309a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = m13232z(j10, abstractC11969j1);
                        Charset charset10 = AbstractC11989o1.f36309a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = m13230v(j10, abstractC11969j1);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 56:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = m13232z(j10, abstractC11969j1);
                        Charset charset11 = AbstractC11989o1.f36309a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = m13230v(j10, abstractC11969j1);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 58:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i12 = i15 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC11906R1.m13332i(j10, abstractC11969j1)).booleanValue();
                        Charset charset12 = AbstractC11989o1.f36309a;
                        if (zBooleanValue) {
                            i18 = 1231;
                        }
                        i15 = i18 + i12;
                    }
                    break;
                case 59:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = ((String) AbstractC11906R1.m13332i(j10, abstractC11969j1)).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 60:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = AbstractC11906R1.m13332i(j10, abstractC11969j1).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 61:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = AbstractC11906R1.m13332i(j10, abstractC11969j1).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 62:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = m13230v(j10, abstractC11969j1);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 63:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = m13230v(j10, abstractC11969j1);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 64:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = m13230v(j10, abstractC11969j1);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 65:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = m13232z(j10, abstractC11969j1);
                        Charset charset13 = AbstractC11989o1.f36309a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = m13230v(j10, abstractC11969j1);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 67:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = m13232z(j10, abstractC11969j1);
                        Charset charset14 = AbstractC11989o1.f36309a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (m13254s(i17, abstractC11969j1, i14)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = AbstractC11906R1.m13332i(j10, abstractC11969j1).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
            }
            i14 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: g */
    public final AbstractC11969j1 mo13243g() {
        return (AbstractC11969j1) ((AbstractC11969j1) this.f36105e).mo13306d(4);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: h */
    public final boolean mo13244h(AbstractC11969j1 abstractC11969j1, Object obj) {
        boolean zM13281e;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f36101a;
            if (i10 >= iArr.length) {
                return abstractC11969j1.zzc.equals(((AbstractC11969j1) obj).zzc);
            }
            int iM13257y = m13257y(i10);
            long j10 = iM13257y & 1048575;
            switch (m13231x(iM13257y)) {
                case 0:
                    if (m13251o(abstractC11969j1, obj, i10)) {
                        AbstractC11904Q1 abstractC11904Q1 = AbstractC11906R1.f36183c;
                        if (Double.doubleToLongBits(abstractC11904Q1.mo13314a(j10, abstractC11969j1)) == Double.doubleToLongBits(abstractC11904Q1.mo13314a(j10, obj))) {
                            continue;
                            i10 += 3;
                            break;
                        }
                    }
                    return false;
                case 1:
                    if (m13251o(abstractC11969j1, obj, i10)) {
                        AbstractC11904Q1 abstractC11904Q2 = AbstractC11906R1.f36183c;
                        if (Float.floatToIntBits(abstractC11904Q2.mo13315b(j10, abstractC11969j1)) == Float.floatToIntBits(abstractC11904Q2.mo13315b(j10, obj))) {
                            continue;
                            i10 += 3;
                            break;
                        }
                    }
                    return false;
                case 2:
                    if (!m13251o(abstractC11969j1, obj, i10) || AbstractC11906R1.m13330g(j10, abstractC11969j1) != AbstractC11906R1.m13330g(j10, obj)) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
                    break;
                case 3:
                    if (!m13251o(abstractC11969j1, obj, i10) || AbstractC11906R1.m13330g(j10, abstractC11969j1) != AbstractC11906R1.m13330g(j10, obj)) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
                    break;
                case 4:
                    if (!m13251o(abstractC11969j1, obj, i10) || AbstractC11906R1.m13329f(j10, abstractC11969j1) != AbstractC11906R1.m13329f(j10, obj)) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
                    break;
                case 5:
                    if (!m13251o(abstractC11969j1, obj, i10) || AbstractC11906R1.m13330g(j10, abstractC11969j1) != AbstractC11906R1.m13330g(j10, obj)) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
                    break;
                case 6:
                    if (!m13251o(abstractC11969j1, obj, i10) || AbstractC11906R1.m13329f(j10, abstractC11969j1) != AbstractC11906R1.m13329f(j10, obj)) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
                    break;
                case 7:
                    if (m13251o(abstractC11969j1, obj, i10)) {
                        AbstractC11904Q1 abstractC11904Q3 = AbstractC11906R1.f36183c;
                        if (abstractC11904Q3.mo13320g(j10, abstractC11969j1) == abstractC11904Q3.mo13320g(j10, obj)) {
                            continue;
                            i10 += 3;
                            break;
                        }
                    }
                    return false;
                case 8:
                    if (!m13251o(abstractC11969j1, obj, i10) || !AbstractC11883J1.m13281e(AbstractC11906R1.m13332i(j10, abstractC11969j1), AbstractC11906R1.m13332i(j10, obj))) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
                    break;
                case 9:
                    if (!m13251o(abstractC11969j1, obj, i10) || !AbstractC11883J1.m13281e(AbstractC11906R1.m13332i(j10, abstractC11969j1), AbstractC11906R1.m13332i(j10, obj))) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
                    break;
                case 10:
                    if (!m13251o(abstractC11969j1, obj, i10) || !AbstractC11883J1.m13281e(AbstractC11906R1.m13332i(j10, abstractC11969j1), AbstractC11906R1.m13332i(j10, obj))) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
                    break;
                case 11:
                    if (!m13251o(abstractC11969j1, obj, i10) || AbstractC11906R1.m13329f(j10, abstractC11969j1) != AbstractC11906R1.m13329f(j10, obj)) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
                    break;
                case 12:
                    if (!m13251o(abstractC11969j1, obj, i10) || AbstractC11906R1.m13329f(j10, abstractC11969j1) != AbstractC11906R1.m13329f(j10, obj)) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
                    break;
                case 13:
                    if (!m13251o(abstractC11969j1, obj, i10) || AbstractC11906R1.m13329f(j10, abstractC11969j1) != AbstractC11906R1.m13329f(j10, obj)) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
                    break;
                case 14:
                    if (!m13251o(abstractC11969j1, obj, i10) || AbstractC11906R1.m13330g(j10, abstractC11969j1) != AbstractC11906R1.m13330g(j10, obj)) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
                    break;
                case 15:
                    if (!m13251o(abstractC11969j1, obj, i10) || AbstractC11906R1.m13329f(j10, abstractC11969j1) != AbstractC11906R1.m13329f(j10, obj)) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
                    break;
                case 16:
                    if (!m13251o(abstractC11969j1, obj, i10) || AbstractC11906R1.m13330g(j10, abstractC11969j1) != AbstractC11906R1.m13330g(j10, obj)) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
                    break;
                case 17:
                    if (!m13251o(abstractC11969j1, obj, i10) || !AbstractC11883J1.m13281e(AbstractC11906R1.m13332i(j10, abstractC11969j1), AbstractC11906R1.m13332i(j10, obj))) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
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
                    zM13281e = AbstractC11883J1.m13281e(AbstractC11906R1.m13332i(j10, abstractC11969j1), AbstractC11906R1.m13332i(j10, obj));
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    zM13281e = AbstractC11883J1.m13281e(AbstractC11906R1.m13332i(j10, abstractC11969j1), AbstractC11906R1.m13332i(j10, obj));
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
                    if (AbstractC11906R1.m13329f(j11, abstractC11969j1) != AbstractC11906R1.m13329f(j11, obj) || !AbstractC11883J1.m13281e(AbstractC11906R1.m13332i(j10, abstractC11969j1), AbstractC11906R1.m13332i(j10, obj))) {
                        return false;
                    }
                    continue;
                    i10 += 3;
                    break;
                    break;
                default:
                    continue;
                    i10 += 3;
                    break;
            }
            if (!zM13281e) {
                return false;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v127, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.google.android.gms.internal.play_billing.B1] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: i */
    public final void mo13245i(Object obj, C12021w1 c12021w1) {
        int i10;
        ?? r16;
        ?? r6;
        ?? r10;
        Unsafe unsafe = f36100k;
        int i11 = 1048575;
        boolean z6 = false;
        int i12 = 1048575;
        ?? r11 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f36101a;
            if (i13 >= iArr.length) {
                ((AbstractC11969j1) obj).zzc.m13310d(c12021w1);
                return;
            }
            int iM13257y = m13257y(i13);
            int iM13231x = m13231x(iM13257y);
            int i14 = iArr[i13];
            if (iM13231x <= 17) {
                int i15 = iArr[i13 + 2];
                int i16 = i15 & i11;
                if (i16 != i12) {
                    i12 = i16;
                    r10 = i16 == i11 ? z6 : unsafe.getInt(obj, i16);
                }
                r10 = r11;
                i10 = i12;
                r16 = r10;
                r6 = 1 << (i15 >>> 20);
            } else {
                i10 = i12;
                r16 = r11;
                r6 = z6;
            }
            long j10 = iM13257y & i11;
            switch (iM13231x) {
                case 0:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13539k(i14, AbstractC11906R1.m13327d(j10, obj));
                    }
                    break;
                case 1:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13543o(i14, AbstractC11906R1.m13328e(j10, obj));
                    }
                    break;
                case 2:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13546r(i14, unsafe.getLong(obj, j10));
                    }
                    break;
                case 3:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13535g(i14, unsafe.getLong(obj, j10));
                    }
                    break;
                case 4:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13545q(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 5:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13542n(i14, unsafe.getLong(obj, j10));
                    }
                    break;
                case 6:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13541m(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 7:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13536h(i14, AbstractC11906R1.m13343t(j10, obj));
                    }
                    break;
                case 8:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof String) {
                            ((C11933a1) c12021w1.f36344a).m13395e0(i14, (String) object);
                        } else {
                            c12021w1.m13537i(i14, (C11929Z0) object);
                        }
                    }
                    break;
                case 9:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13547s(i14, unsafe.getObject(obj, j10), m13234B(i13));
                    }
                    break;
                case 10:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13537i(i14, (C11929Z0) unsafe.getObject(obj, j10));
                    }
                    break;
                case 11:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13534f(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 12:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13540l(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 13:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13548t(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 14:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13549u(i14, unsafe.getLong(obj, j10));
                    }
                    break;
                case 15:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13531c(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 16:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13532d(i14, unsafe.getLong(obj, j10));
                    }
                    break;
                case 17:
                    if (m13253q(obj, i13, i10, r16 == true ? 1 : 0, r6)) {
                        c12021w1.m13544p(i14, unsafe.getObject(obj, j10), m13234B(i13));
                    }
                    break;
                case 18:
                    AbstractC11883J1.m13297u(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, z6);
                    break;
                case 19:
                    AbstractC11883J1.m13301y(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, z6);
                    break;
                case 20:
                    AbstractC11883J1.m13274A(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, z6);
                    break;
                case 21:
                    AbstractC11883J1.m13280d(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, z6);
                    break;
                case 22:
                    AbstractC11883J1.m13302z(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, z6);
                    break;
                case 23:
                    AbstractC11883J1.m13300x(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, z6);
                    break;
                case 24:
                    AbstractC11883J1.m13299w(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, z6);
                    break;
                case 25:
                    AbstractC11883J1.m13296t(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, z6);
                    break;
                case 26:
                    int i17 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j10);
                    C11961h1 c11961h1 = AbstractC11883J1.f36151a;
                    if (list != null && !list.isEmpty()) {
                        c12021w1.m13533e(i17, list);
                    }
                    break;
                case 27:
                    int i18 = iArr[i13];
                    ?? r12 = (List) unsafe.getObject(obj, j10);
                    InterfaceC11880I1 interfaceC11880I1M13234B = m13234B(i13);
                    C11961h1 c11961h2 = AbstractC11883J1.f36151a;
                    if (r12 != 0 && !r12.isEmpty()) {
                        for (?? r13 = z6; r13 < r12.size(); r13++) {
                            c12021w1.m13547s(i18, r12.get(r13), interfaceC11880I1M13234B);
                        }
                    }
                    break;
                case 28:
                    int i19 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    C11961h1 c11961h3 = AbstractC11883J1.f36151a;
                    if (list2 != null && !list2.isEmpty()) {
                        c12021w1.m13538j(i19, list2);
                    }
                    break;
                case 29:
                    AbstractC11883J1.m13279c(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, z6);
                    break;
                case 30:
                    AbstractC11883J1.m13298v(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, z6);
                    break;
                case 31:
                    AbstractC11883J1.m13275B(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, z6);
                    break;
                case 32:
                    AbstractC11883J1.m13276C(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, z6);
                    break;
                case 33:
                    AbstractC11883J1.m13277a(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, z6);
                    break;
                case 34:
                    AbstractC11883J1.m13278b(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, z6);
                    break;
                case 35:
                    AbstractC11883J1.m13297u(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, true);
                    break;
                case 36:
                    AbstractC11883J1.m13301y(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, true);
                    break;
                case 37:
                    AbstractC11883J1.m13274A(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, true);
                    break;
                case 38:
                    AbstractC11883J1.m13280d(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, true);
                    break;
                case 39:
                    AbstractC11883J1.m13302z(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, true);
                    break;
                case 40:
                    AbstractC11883J1.m13300x(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, true);
                    break;
                case 41:
                    AbstractC11883J1.m13299w(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, true);
                    break;
                case 42:
                    AbstractC11883J1.m13296t(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, true);
                    break;
                case 43:
                    AbstractC11883J1.m13279c(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, true);
                    break;
                case 44:
                    AbstractC11883J1.m13298v(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, true);
                    break;
                case 45:
                    AbstractC11883J1.m13275B(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, true);
                    break;
                case 46:
                    AbstractC11883J1.m13276C(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, true);
                    break;
                case 47:
                    AbstractC11883J1.m13277a(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, true);
                    break;
                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                    AbstractC11883J1.m13278b(iArr[i13], (List) unsafe.getObject(obj, j10), c12021w1, true);
                    break;
                case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                    int i20 = iArr[i13];
                    ?? r14 = (List) unsafe.getObject(obj, j10);
                    InterfaceC11880I1 interfaceC11880I1M13234B2 = m13234B(i13);
                    C11961h1 c11961h4 = AbstractC11883J1.f36151a;
                    if (r14 != 0 && !r14.isEmpty()) {
                        for (?? r15 = z6; r15 < r14.size(); r15++) {
                            c12021w1.m13544p(i20, r14.get(r15), interfaceC11880I1M13234B2);
                        }
                    }
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    if (unsafe.getObject(obj, j10) != null) {
                        int i21 = i13 / 3;
                        AbstractC0168G.m507B(this.f36102b[i21 + i21]);
                        throw null;
                    }
                    break;
                    break;
                case 51:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13539k(i14, ((Double) AbstractC11906R1.m13332i(j10, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13543o(i14, ((Float) AbstractC11906R1.m13332i(j10, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13546r(i14, m13232z(j10, obj));
                    }
                    break;
                case 54:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13535g(i14, m13232z(j10, obj));
                    }
                    break;
                case 55:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13545q(i14, m13230v(j10, obj));
                    }
                    break;
                case 56:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13542n(i14, m13232z(j10, obj));
                    }
                    break;
                case 57:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13541m(i14, m13230v(j10, obj));
                    }
                    break;
                case 58:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13536h(i14, ((Boolean) AbstractC11906R1.m13332i(j10, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (m13254s(i14, obj, i13)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof String) {
                            ((C11933a1) c12021w1.f36344a).m13395e0(i14, (String) object2);
                        } else {
                            c12021w1.m13537i(i14, (C11929Z0) object2);
                        }
                    }
                    break;
                case 60:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13547s(i14, unsafe.getObject(obj, j10), m13234B(i13));
                    }
                    break;
                case 61:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13537i(i14, (C11929Z0) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13534f(i14, m13230v(j10, obj));
                    }
                    break;
                case 63:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13540l(i14, m13230v(j10, obj));
                    }
                    break;
                case 64:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13548t(i14, m13230v(j10, obj));
                    }
                    break;
                case 65:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13549u(i14, m13232z(j10, obj));
                    }
                    break;
                case 66:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13531c(i14, m13230v(j10, obj));
                    }
                    break;
                case 67:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13532d(i14, m13232z(j10, obj));
                    }
                    break;
                case 68:
                    if (m13254s(i14, obj, i13)) {
                        c12021w1.m13544p(i14, unsafe.getObject(obj, j10), m13234B(i13));
                    }
                    break;
            }
            i13 += 3;
            i12 = i10;
            r11 = r16;
            i11 = 1048575;
            z6 = false;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m13246j(Object obj, int i10, Object obj2) {
        if (m13252p(i10, obj2)) {
            int iM13257y = m13257y(i10) & 1048575;
            Unsafe unsafe = f36100k;
            long j10 = iM13257y;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f36101a[i10] + " is present but null: " + obj2.toString());
            }
            InterfaceC11880I1 interfaceC11880I1M13234B = m13234B(i10);
            if (!m13252p(i10, obj)) {
                if (m13228r(object)) {
                    AbstractC11969j1 abstractC11969j1Mo13243g = interfaceC11880I1M13234B.mo13243g();
                    interfaceC11880I1M13234B.mo13241e(abstractC11969j1Mo13243g, object);
                    unsafe.putObject(obj, j10, abstractC11969j1Mo13243g);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                m13248l(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!m13228r(object2)) {
                AbstractC11969j1 abstractC11969j1Mo13243g2 = interfaceC11880I1M13234B.mo13243g();
                interfaceC11880I1M13234B.mo13241e(abstractC11969j1Mo13243g2, object2);
                unsafe.putObject(obj, j10, abstractC11969j1Mo13243g2);
                object2 = abstractC11969j1Mo13243g2;
            }
            interfaceC11880I1M13234B.mo13241e(object2, object);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m13247k(Object obj, int i10, Object obj2) {
        int[] iArr = this.f36101a;
        int i11 = iArr[i10];
        if (m13254s(i11, obj2, i10)) {
            int iM13257y = m13257y(i10) & 1048575;
            Unsafe unsafe = f36100k;
            long j10 = iM13257y;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            InterfaceC11880I1 interfaceC11880I1M13234B = m13234B(i10);
            if (!m13254s(i11, obj, i10)) {
                if (m13228r(object)) {
                    AbstractC11969j1 abstractC11969j1Mo13243g = interfaceC11880I1M13234B.mo13243g();
                    interfaceC11880I1M13234B.mo13241e(abstractC11969j1Mo13243g, object);
                    unsafe.putObject(obj, j10, abstractC11969j1Mo13243g);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                AbstractC11906R1.m13337n(iArr[i10 + 2] & 1048575, obj, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!m13228r(object2)) {
                AbstractC11969j1 abstractC11969j1Mo13243g2 = interfaceC11880I1M13234B.mo13243g();
                interfaceC11880I1M13234B.mo13241e(abstractC11969j1Mo13243g2, object2);
                unsafe.putObject(obj, j10, abstractC11969j1Mo13243g2);
                object2 = abstractC11969j1Mo13243g2;
            }
            interfaceC11880I1M13234B.mo13241e(object2, object);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m13248l(int i10, Object obj) {
        int i11 = this.f36101a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        AbstractC11906R1.m13337n(j10, obj, (1 << (i11 >>> 20)) | AbstractC11906R1.m13329f(j10, obj));
    }

    /* JADX INFO: renamed from: m */
    public final void m13249m(Object obj, int i10, Object obj2) {
        f36100k.putObject(obj, m13257y(i10) & 1048575, obj2);
        m13248l(i10, obj);
    }

    /* JADX INFO: renamed from: n */
    public final void m13250n(int i10, Object obj, Object obj2, int i11) {
        f36100k.putObject(obj, m13257y(i11) & 1048575, obj2);
        AbstractC11906R1.m13337n(this.f36101a[i11 + 2] & 1048575, obj, i10);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m13251o(AbstractC11969j1 abstractC11969j1, Object obj, int i10) {
        return m13252p(i10, abstractC11969j1) == m13252p(i10, obj);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m13252p(int i10, Object obj) {
        int i11 = this.f36101a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 != 1048575) {
            return ((1 << (i11 >>> 20)) & AbstractC11906R1.m13329f(j10, obj)) != 0;
        }
        int iM13257y = m13257y(i10);
        long j11 = iM13257y & 1048575;
        switch (m13231x(iM13257y)) {
            case 0:
                return Double.doubleToRawLongBits(AbstractC11906R1.f36183c.mo13314a(j11, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC11906R1.f36183c.mo13315b(j11, obj)) != 0;
            case 2:
                return AbstractC11906R1.m13330g(j11, obj) != 0;
            case 3:
                return AbstractC11906R1.m13330g(j11, obj) != 0;
            case 4:
                return AbstractC11906R1.m13329f(j11, obj) != 0;
            case 5:
                return AbstractC11906R1.m13330g(j11, obj) != 0;
            case 6:
                return AbstractC11906R1.m13329f(j11, obj) != 0;
            case 7:
                return AbstractC11906R1.f36183c.mo13320g(j11, obj);
            case 8:
                Object objM13332i = AbstractC11906R1.m13332i(j11, obj);
                if (objM13332i instanceof String) {
                    return !((String) objM13332i).isEmpty();
                }
                if (objM13332i instanceof C11929Z0) {
                    return !C11929Z0.f36227o0.equals(objM13332i);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC11906R1.m13332i(j11, obj) != null;
            case 10:
                return !C11929Z0.f36227o0.equals(AbstractC11906R1.m13332i(j11, obj));
            case 11:
                return AbstractC11906R1.m13329f(j11, obj) != 0;
            case 12:
                return AbstractC11906R1.m13329f(j11, obj) != 0;
            case 13:
                return AbstractC11906R1.m13329f(j11, obj) != 0;
            case 14:
                return AbstractC11906R1.m13330g(j11, obj) != 0;
            case 15:
                return AbstractC11906R1.m13329f(j11, obj) != 0;
            case 16:
                return AbstractC11906R1.m13330g(j11, obj) != 0;
            case 17:
                return AbstractC11906R1.m13332i(j11, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m13253q(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return m13252p(i10, obj);
        }
        return (i12 & i13) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m13254s(int i10, Object obj, int i11) {
        return AbstractC11906R1.m13329f((long) (this.f36101a[i11 + 2] & 1048575), obj) == i10;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:102:0x02ff A[LOOP:13: B:99:0x02f5->B:102:0x02ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0313 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0315  */
    /* JADX WARN: Code duplicated, block: B:111:0x032d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0335  */
    /* JADX WARN: Code duplicated, block: B:115:0x0339  */
    /* JADX WARN: Code duplicated, block: B:119:0x0355  */
    /* JADX WARN: Code duplicated, block: B:121:0x0359  */
    /* JADX WARN: Code duplicated, block: B:530:0x0ea7 A[PHI: r0 r3 r5 r12 r13 r18 r25
      0x0ea7: PHI (r0v53 int) = 
      (r0v25 int)
      (r0v26 int)
      (r0v27 int)
      (r0v28 int)
      (r0v29 int)
      (r0v30 int)
      (r0v32 int)
      (r0v33 int)
      (r0v41 int)
      (r12v62 int)
     binds: [B:528:0x0e90, B:525:0x0e6d, B:522:0x0e4b, B:519:0x0e2b, B:516:0x0e0c, B:513:0x0dec, B:505:0x0dc0, B:491:0x0d83, B:462:0x0c98, B:449:0x0c19] A[DONT_GENERATE, DONT_INLINE]
      0x0ea7: PHI (r3v102 byte[]) = 
      (r3v87 byte[])
      (r3v88 byte[])
      (r3v89 byte[])
      (r3v90 byte[])
      (r3v91 byte[])
      (r3v92 byte[])
      (r3v94 byte[])
      (r3v95 byte[])
      (r3v98 byte[])
      (r3v103 byte[])
     binds: [B:528:0x0e90, B:525:0x0e6d, B:522:0x0e4b, B:519:0x0e2b, B:516:0x0e0c, B:513:0x0dec, B:505:0x0dc0, B:491:0x0d83, B:462:0x0c98, B:449:0x0c19] A[DONT_GENERATE, DONT_INLINE]
      0x0ea7: PHI (r5v105 java.lang.Object) = 
      (r5v78 java.lang.Object)
      (r5v79 java.lang.Object)
      (r5v80 java.lang.Object)
      (r5v81 java.lang.Object)
      (r5v82 java.lang.Object)
      (r5v83 java.lang.Object)
      (r5v85 java.lang.Object)
      (r5v86 java.lang.Object)
      (r5v95 java.lang.Object)
      (r3v86 java.lang.Object)
     binds: [B:528:0x0e90, B:525:0x0e6d, B:522:0x0e4b, B:519:0x0e2b, B:516:0x0e0c, B:513:0x0dec, B:505:0x0dc0, B:491:0x0d83, B:462:0x0c98, B:449:0x0c19] A[DONT_GENERATE, DONT_INLINE]
      0x0ea7: PHI (r12v89 int) = 
      (r12v63 int)
      (r12v64 int)
      (r12v65 int)
      (r12v66 int)
      (r12v67 int)
      (r12v68 int)
      (r12v70 int)
      (r12v71 int)
      (r12v79 int)
      (r12v90 int)
     binds: [B:528:0x0e90, B:525:0x0e6d, B:522:0x0e4b, B:519:0x0e2b, B:516:0x0e0c, B:513:0x0dec, B:505:0x0dc0, B:491:0x0d83, B:462:0x0c98, B:449:0x0c19] A[DONT_GENERATE, DONT_INLINE]
      0x0ea7: PHI (r13v76 com.google.android.gms.internal.play_billing.V0) = 
      (r13v50 com.google.android.gms.internal.play_billing.V0)
      (r13v51 com.google.android.gms.internal.play_billing.V0)
      (r13v52 com.google.android.gms.internal.play_billing.V0)
      (r13v53 com.google.android.gms.internal.play_billing.V0)
      (r13v54 com.google.android.gms.internal.play_billing.V0)
      (r13v55 com.google.android.gms.internal.play_billing.V0)
      (r13v57 com.google.android.gms.internal.play_billing.V0)
      (r13v58 com.google.android.gms.internal.play_billing.V0)
      (r13v65 com.google.android.gms.internal.play_billing.V0)
      (r13v77 com.google.android.gms.internal.play_billing.V0)
     binds: [B:528:0x0e90, B:525:0x0e6d, B:522:0x0e4b, B:519:0x0e2b, B:516:0x0e0c, B:513:0x0dec, B:505:0x0dc0, B:491:0x0d83, B:462:0x0c98, B:449:0x0c19] A[DONT_GENERATE, DONT_INLINE]
      0x0ea7: PHI (r18v56 int) = 
      (r18v32 int)
      (r18v33 int)
      (r18v34 int)
      (r18v35 int)
      (r18v36 int)
      (r18v37 int)
      (r18v39 int)
      (r18v40 int)
      (r18v46 int)
      (r43v7 int)
     binds: [B:528:0x0e90, B:525:0x0e6d, B:522:0x0e4b, B:519:0x0e2b, B:516:0x0e0c, B:513:0x0dec, B:505:0x0dc0, B:491:0x0d83, B:462:0x0c98, B:449:0x0c19] A[DONT_GENERATE, DONT_INLINE]
      0x0ea7: PHI (r25v33 com.google.android.gms.internal.play_billing.M1) = 
      (r25v7 com.google.android.gms.internal.play_billing.M1)
      (r25v8 com.google.android.gms.internal.play_billing.M1)
      (r25v9 com.google.android.gms.internal.play_billing.M1)
      (r25v10 com.google.android.gms.internal.play_billing.M1)
      (r25v11 com.google.android.gms.internal.play_billing.M1)
      (r25v12 com.google.android.gms.internal.play_billing.M1)
      (r25v14 com.google.android.gms.internal.play_billing.M1)
      (r25v15 com.google.android.gms.internal.play_billing.M1)
      (r25v23 com.google.android.gms.internal.play_billing.M1)
      (r11v42 com.google.android.gms.internal.play_billing.M1)
     binds: [B:528:0x0e90, B:525:0x0e6d, B:522:0x0e4b, B:519:0x0e2b, B:516:0x0e0c, B:513:0x0dec, B:505:0x0dc0, B:491:0x0d83, B:462:0x0c98, B:449:0x0c19] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:573:0x0eaa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x0b6f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x0325 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x0375 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x0ebf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x0b89 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:0x030b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x02e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public final int m13255t(Object obj, byte[] bArr, int i10, int i11, int i12, C11917V0 c11917v0) {
        int i13;
        Object obj2;
        Object[] objArr;
        Unsafe unsafe;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        int i17;
        int iM13256w;
        int i18;
        Object obj3;
        C11892M1 c11892m1;
        int i19;
        C11917V0 c11917v1;
        int i20;
        Unsafe unsafe2;
        int i21;
        boolean z6;
        C11917V0 c11917v2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int iM13435O;
        char c9;
        int i27;
        int i28;
        byte b;
        byte b10;
        int i29;
        int i30;
        int i31;
        C11917V0 c11917v3;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj4;
        byte[] bArr2;
        int iM13435O2;
        int iM13438R;
        byte[] bArr3;
        int i36;
        int i37;
        int i38;
        AbstractC11911T0 abstractC11911T0;
        byte[] bArr4;
        int i39;
        int i40;
        int i41;
        int iM13435O3;
        int i42;
        int i43;
        int iM13432J;
        int iM13435O4;
        AbstractC11911T0 abstractC11911T1;
        byte[] bArr5;
        int i44;
        int i45;
        int iM13437Q;
        int i46;
        int i47;
        int i48;
        byte[] bArr6;
        int i49;
        int i50;
        this = this;
        Object obj5 = obj;
        byte[] bArr7 = bArr;
        i11 = i11;
        i12 = i12;
        C11917V0 c11917v4 = c11917v0;
        int i51 = 3;
        if (!m13228r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        Unsafe unsafe3 = f36100k;
        int iM13439S = i10;
        int i52 = -1;
        int i53 = 0;
        int i54 = 1048575;
        int i55 = 0;
        int i56 = 0;
        while (true) {
            int[] iArr2 = this.f36101a;
            Object[] objArr2 = this.f36102b;
            if (iM13439S < i11) {
                int iM13436P = iM13439S + 1;
                int i57 = bArr7[iM13439S];
                if (i57 < 0) {
                    iM13436P = AbstractC11957g1.m13436P(i57, bArr7, iM13436P, c11917v4);
                    i57 = c11917v4.f36200a;
                }
                int i58 = i57 >>> 3;
                int i59 = this.f36104d;
                int i60 = this.f36103c;
                if (i58 > i52) {
                    iM13256w = (i58 < i60 || i58 > i59) ? -1 : this.m13256w(i58, i53 / i51);
                    i17 = 0;
                } else if (i58 < i60 || i58 > i59) {
                    i17 = 0;
                    iM13256w = -1;
                } else {
                    i17 = 0;
                    iM13256w = this.m13256w(i58, 0);
                }
                C11892M1 c11892m2 = C11892M1.f36161f;
                if (iM13256w == -1) {
                    i18 = iM13436P;
                    obj3 = obj5;
                    c11892m1 = c11892m2;
                    objArr = objArr2;
                    unsafe = unsafe3;
                    iArr = iArr2;
                    i53 = i17;
                    i12 = i12;
                    i16 = i57;
                    i19 = i58;
                    c11917v1 = c11917v4;
                } else {
                    int i61 = i57 & 7;
                    int i62 = iArr2[iM13256w + 1];
                    int iM13231x = m13231x(i62);
                    C11892M1 c11892m3 = c11892m2;
                    objArr = objArr2;
                    long j10 = i62 & 1048575;
                    int i63 = i57;
                    String str = "Protocol message had invalid UTF-8.";
                    if (iM13231x <= 17) {
                        int i64 = iArr2[iM13256w + 2];
                        int i65 = 1 << (i64 >>> 20);
                        iArr = iArr2;
                        int i66 = i64 & 1048575;
                        int i67 = i54;
                        if (i66 != i67) {
                            if (i67 != 1048575) {
                                unsafe3.putInt(obj5, i67, i55);
                                i31 = 1048575;
                            } else {
                                i31 = 1048575;
                            }
                            i20 = i66 == i31 ? 0 : unsafe3.getInt(obj5, i66);
                            i54 = i66;
                        } else {
                            j10 = j10;
                            i20 = i55;
                            i54 = i67;
                        }
                        switch (iM13231x) {
                            case 0:
                                unsafe2 = unsafe3;
                                i21 = i58;
                                c11892m3 = c11892m3;
                                long j11 = j10;
                                z6 = false;
                                c11917v2 = c11917v4;
                                i22 = iM13256w;
                                i23 = i63 == true ? 1 : 0;
                                iM13436P = iM13436P;
                                if (i61 == 1) {
                                    i24 = i20 | i65;
                                    AbstractC11906R1.m13335l(obj5, j11, Double.longBitsToDouble(AbstractC11957g1.m13441U(iM13436P, bArr7)));
                                    iM13439S = iM13436P + 8;
                                    i56 = i23 == true ? 1 : 0;
                                    c11917v4 = c11917v2;
                                    i53 = i22;
                                    unsafe3 = unsafe2;
                                    i51 = 3;
                                    i52 = i21;
                                    i11 = i11;
                                    i55 = i24;
                                } else {
                                    objArr = objArr;
                                    i18 = iM13436P;
                                    c11892m1 = c11892m3;
                                    i53 = i22;
                                    unsafe = unsafe2;
                                    i54 = i54;
                                    i19 = i21;
                                    i55 = i20;
                                    c11917v1 = c11917v2;
                                    i16 = i23;
                                    obj3 = obj5;
                                    i12 = i12;
                                }
                                break;
                            case 1:
                                unsafe2 = unsafe3;
                                i21 = i58;
                                c11892m3 = c11892m3;
                                long j12 = j10;
                                z6 = false;
                                c11917v2 = c11917v4;
                                i22 = iM13256w;
                                i23 = i63 == true ? 1 : 0;
                                iM13436P = iM13436P;
                                if (i61 == 5) {
                                    i25 = i20 | i65;
                                    AbstractC11906R1.m13336m(obj5, j12, Float.intBitsToFloat(AbstractC11957g1.m13454q(iM13436P, bArr7)));
                                    iM13439S = iM13436P + 4;
                                    i56 = i23 == true ? 1 : 0;
                                    c11917v4 = c11917v2;
                                    i53 = i22;
                                    unsafe3 = unsafe2;
                                    i51 = 3;
                                    i52 = i21;
                                    i11 = i11;
                                    i55 = i25;
                                } else {
                                    objArr = objArr;
                                    i18 = iM13436P;
                                    c11892m1 = c11892m3;
                                    i53 = i22;
                                    unsafe = unsafe2;
                                    i54 = i54;
                                    i19 = i21;
                                    i55 = i20;
                                    c11917v1 = c11917v2;
                                    i16 = i23;
                                    obj3 = obj5;
                                    i12 = i12;
                                }
                                break;
                            case 2:
                            case 3:
                                unsafe2 = unsafe3;
                                i21 = i58;
                                c11892m3 = c11892m3;
                                long j13 = j10;
                                z6 = false;
                                c11917v2 = c11917v4;
                                i22 = iM13256w;
                                i23 = i63 == true ? 1 : 0;
                                iM13436P = iM13436P;
                                if (i61 == 0) {
                                    int iM13438R2 = AbstractC11957g1.m13438R(bArr7, iM13436P, c11917v2);
                                    unsafe2.putLong(obj, j13, c11917v2.f36201b);
                                    i11 = i11;
                                    c11917v4 = c11917v2;
                                    i53 = i22;
                                    unsafe3 = unsafe2;
                                    iM13439S = iM13438R2;
                                    i51 = 3;
                                    i56 = i23 == true ? 1 : 0;
                                    i55 = i20 | i65;
                                    i52 = i21;
                                } else {
                                    objArr = objArr;
                                    i18 = iM13436P;
                                    c11892m1 = c11892m3;
                                    i53 = i22;
                                    unsafe = unsafe2;
                                    i54 = i54;
                                    i19 = i21;
                                    i55 = i20;
                                    c11917v1 = c11917v2;
                                    i16 = i23;
                                    obj3 = obj5;
                                    i12 = i12;
                                }
                                break;
                            case 4:
                            case 11:
                                unsafe2 = unsafe3;
                                i21 = i58;
                                c11892m3 = c11892m3;
                                long j14 = j10;
                                z6 = false;
                                c11917v2 = c11917v4;
                                i22 = iM13256w;
                                i23 = i63 == true ? 1 : 0;
                                iM13436P = iM13436P;
                                if (i61 == 0) {
                                    int i68 = i20 | i65;
                                    int iM13435O5 = AbstractC11957g1.m13435O(bArr7, iM13436P, c11917v2);
                                    unsafe2.putInt(obj5, j14, c11917v2.f36200a);
                                    i12 = i12;
                                    iM13439S = iM13435O5;
                                    i56 = i23 == true ? 1 : 0;
                                    c11917v4 = c11917v2;
                                    i53 = i22;
                                    unsafe3 = unsafe2;
                                    i54 = i54;
                                    i52 = i21;
                                    i11 = i11;
                                    i55 = i68;
                                    i51 = 3;
                                } else {
                                    objArr = objArr;
                                    i18 = iM13436P;
                                    c11892m1 = c11892m3;
                                    i53 = i22;
                                    unsafe = unsafe2;
                                    i54 = i54;
                                    i19 = i21;
                                    i55 = i20;
                                    c11917v1 = c11917v2;
                                    i16 = i23;
                                    obj3 = obj5;
                                    i12 = i12;
                                }
                                break;
                            case 5:
                            case 14:
                                unsafe2 = unsafe3;
                                i21 = i58;
                                long j15 = j10;
                                z6 = false;
                                c11917v2 = c11917v4;
                                i22 = iM13256w;
                                i26 = 3;
                                iM13436P = iM13436P;
                                if (i61 == 1) {
                                    unsafe2.putLong(obj, j15, AbstractC11957g1.m13441U(iM13436P, bArr7));
                                    i11 = i11;
                                    iM13439S = iM13436P + 8;
                                    c11917v4 = c11917v2;
                                    i53 = i22;
                                    unsafe3 = unsafe2;
                                    i55 = i20 | i65;
                                    i51 = 3;
                                    i56 = i63 == true ? 1 : 0;
                                    i52 = i21;
                                } else {
                                    i23 = i63 == true ? 1 : 0;
                                    objArr = objArr;
                                    i18 = iM13436P;
                                    c11892m1 = c11892m3;
                                    i53 = i22;
                                    unsafe = unsafe2;
                                    i54 = i54;
                                    i19 = i21;
                                    i55 = i20;
                                    c11917v1 = c11917v2;
                                    i16 = i23;
                                    obj3 = obj5;
                                    i12 = i12;
                                }
                                break;
                            case 6:
                            case 13:
                                unsafe2 = unsafe3;
                                i21 = i58;
                                long j16 = j10;
                                z6 = false;
                                c11917v2 = c11917v4;
                                i22 = iM13256w;
                                i26 = 3;
                                iM13436P = iM13436P;
                                if (i61 == 5) {
                                    iM13435O = iM13436P + 4;
                                    i25 = i20 | i65;
                                    unsafe2.putInt(obj5, j16, AbstractC11957g1.m13454q(iM13436P, bArr7));
                                    iM13439S = iM13435O;
                                    i51 = i26;
                                    c11917v4 = c11917v2;
                                    i53 = i22;
                                    unsafe3 = unsafe2;
                                    i56 = i63;
                                    i52 = i21;
                                    i11 = i11;
                                    i55 = i25;
                                } else {
                                    i23 = i63 == true ? 1 : 0;
                                    objArr = objArr;
                                    i18 = iM13436P;
                                    c11892m1 = c11892m3;
                                    i53 = i22;
                                    unsafe = unsafe2;
                                    i54 = i54;
                                    i19 = i21;
                                    i55 = i20;
                                    c11917v1 = c11917v2;
                                    i16 = i23;
                                    obj3 = obj5;
                                    i12 = i12;
                                }
                                break;
                            case 7:
                                unsafe2 = unsafe3;
                                i21 = i58;
                                long j17 = j10;
                                z6 = false;
                                c11917v2 = c11917v4;
                                i22 = iM13256w;
                                i26 = 3;
                                iM13436P = iM13436P;
                                if (i61 == 0) {
                                    int i69 = i20 | i65;
                                    int iM13438R3 = AbstractC11957g1.m13438R(bArr7, iM13436P, c11917v2);
                                    AbstractC11906R1.m13334k(obj5, j17, c11917v2.f36201b != 0);
                                    iM13439S = iM13438R3;
                                    c11917v4 = c11917v2;
                                    i53 = i22;
                                    unsafe3 = unsafe2;
                                    i54 = i54;
                                    i56 = i63 == true ? 1 : 0;
                                    i52 = i21;
                                    i55 = i69;
                                    i51 = 3;
                                    i11 = i11;
                                } else {
                                    i23 = i63 == true ? 1 : 0;
                                    objArr = objArr;
                                    i18 = iM13436P;
                                    c11892m1 = c11892m3;
                                    i53 = i22;
                                    unsafe = unsafe2;
                                    i54 = i54;
                                    i19 = i21;
                                    i55 = i20;
                                    c11917v1 = c11917v2;
                                    i16 = i23;
                                    obj3 = obj5;
                                    i12 = i12;
                                }
                                break;
                            case 8:
                                unsafe2 = unsafe3;
                                i21 = i58;
                                c11892m3 = c11892m3;
                                long j18 = j10;
                                c9 = 2;
                                c11917v2 = c11917v4;
                                i22 = iM13256w;
                                i23 = i63 == true ? 1 : 0;
                                iM13436P = iM13436P;
                                if (i61 == 2) {
                                    if ((i62 & 536870912) != 0) {
                                        int i70 = i20 | i65;
                                        int iM13435O6 = AbstractC11957g1.m13435O(bArr7, iM13436P, c11917v2);
                                        int i71 = c11917v2.f36200a;
                                        if (i71 < 0) {
                                            throw new C11997q1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i71 == 0) {
                                            c11917v2.f36202c = "";
                                            i27 = i70;
                                            i63 = i23 == true ? 1 : 0;
                                        } else {
                                            int i72 = AbstractC11912T1.f36193a;
                                            int length = bArr7.length;
                                            if ((((length - iM13435O6) - i71) | iM13435O6 | i71) < 0) {
                                                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iM13435O6), Integer.valueOf(i71)));
                                            }
                                            int i73 = iM13435O6 + i71;
                                            char[] cArr = new char[i71];
                                            int i74 = 0;
                                            while (iM13435O6 < i73) {
                                                byte b11 = bArr7[iM13435O6];
                                                if (AbstractC11957g1.m13428C(b11)) {
                                                    iM13435O6++;
                                                    cArr[i74] = (char) b11;
                                                    i74++;
                                                } else {
                                                    while (iM13435O6 < i73) {
                                                        i28 = iM13435O6 + 1;
                                                        b = bArr7[iM13435O6];
                                                        if (AbstractC11957g1.m13428C(b)) {
                                                            cArr[i74] = (char) b;
                                                            i74++;
                                                            iM13435O6 = i28;
                                                            while (iM13435O6 < i73) {
                                                                b10 = bArr7[iM13435O6];
                                                                if (AbstractC11957g1.m13428C(b10)) {
                                                                    iM13435O6++;
                                                                    cArr[i74] = (char) b10;
                                                                    i74++;
                                                                }
                                                            }
                                                        } else {
                                                            int i75 = i70;
                                                            if (b < -32) {
                                                                boolean z10 = i23 == true ? 1 : 0;
                                                                str = str;
                                                                if (b < -16) {
                                                                    if (i28 < i73 - 1) {
                                                                        throw new C11997q1(str);
                                                                    }
                                                                    int i76 = iM13435O6 + 2;
                                                                    iM13435O6 += 3;
                                                                    AbstractC11957g1.m13456t(b, bArr7[i28], bArr7[i76], cArr, i74);
                                                                    i74++;
                                                                } else {
                                                                    if (i28 < i73 - 2) {
                                                                        throw new C11997q1(str);
                                                                    }
                                                                    byte b12 = bArr7[i28];
                                                                    int i77 = iM13435O6 + 3;
                                                                    byte b13 = bArr7[iM13435O6 + 2];
                                                                    iM13435O6 += 4;
                                                                    AbstractC11957g1.m13446h(b, b12, b13, bArr7[i77], cArr, i74);
                                                                    i74 += 2;
                                                                }
                                                                i23 = z10 ? 1 : 0;
                                                            } else {
                                                                if (i28 < i73) {
                                                                    throw new C11997q1(str);
                                                                }
                                                                iM13435O6 += 2;
                                                                AbstractC11957g1.m13460y(b, bArr7[i28], cArr, i74);
                                                                i74++;
                                                            }
                                                            i70 = i75;
                                                        }
                                                    }
                                                    i27 = i70;
                                                    i63 = i23 == true ? 1 : 0;
                                                    c11917v2.f36202c = new String(cArr, 0, i74);
                                                    iM13435O6 = i73;
                                                }
                                            }
                                            while (iM13435O6 < i73) {
                                                i28 = iM13435O6 + 1;
                                                b = bArr7[iM13435O6];
                                                if (AbstractC11957g1.m13428C(b)) {
                                                    cArr[i74] = (char) b;
                                                    i74++;
                                                    iM13435O6 = i28;
                                                    while (iM13435O6 < i73) {
                                                        b10 = bArr7[iM13435O6];
                                                        if (AbstractC11957g1.m13428C(b10)) {
                                                            iM13435O6++;
                                                            cArr[i74] = (char) b10;
                                                            i74++;
                                                        }
                                                    }
                                                } else {
                                                    int i78 = i70;
                                                    if (b < -32) {
                                                        boolean z11 = i23 == true ? 1 : 0;
                                                        str = str;
                                                        if (b < -16) {
                                                            if (i28 < i73 - 1) {
                                                                throw new C11997q1(str);
                                                            }
                                                            int i79 = iM13435O6 + 2;
                                                            iM13435O6 += 3;
                                                            AbstractC11957g1.m13456t(b, bArr7[i28], bArr7[i79], cArr, i74);
                                                            i74++;
                                                        } else {
                                                            if (i28 < i73 - 2) {
                                                                throw new C11997q1(str);
                                                            }
                                                            byte b14 = bArr7[i28];
                                                            int i710 = iM13435O6 + 3;
                                                            byte b15 = bArr7[iM13435O6 + 2];
                                                            iM13435O6 += 4;
                                                            AbstractC11957g1.m13446h(b, b14, b15, bArr7[i710], cArr, i74);
                                                            i74 += 2;
                                                        }
                                                        i23 = z11 ? 1 : 0;
                                                    } else {
                                                        if (i28 < i73) {
                                                            throw new C11997q1(str);
                                                        }
                                                        iM13435O6 += 2;
                                                        AbstractC11957g1.m13460y(b, bArr7[i28], cArr, i74);
                                                        i74++;
                                                    }
                                                    i70 = i78;
                                                }
                                            }
                                            i27 = i70;
                                            i63 = i23 == true ? 1 : 0;
                                            c11917v2.f36202c = new String(cArr, 0, i74);
                                            iM13435O6 = i73;
                                        }
                                        iM13435O = iM13435O6;
                                        i26 = 3;
                                        i25 = i27;
                                    } else {
                                        i63 = i23 == true ? 1 : 0;
                                        i26 = 3;
                                        iM13435O = AbstractC11957g1.m13435O(bArr7, iM13436P, c11917v2);
                                        int i80 = c11917v2.f36200a;
                                        if (i80 < 0) {
                                            throw new C11997q1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        i25 = i20 | i65;
                                        if (i80 == 0) {
                                            c11917v2.f36202c = "";
                                        } else {
                                            c11917v2.f36202c = new String(bArr7, iM13435O, i80, AbstractC11989o1.f36309a);
                                            iM13435O += i80;
                                        }
                                    }
                                    unsafe2.putObject(obj5, j18, c11917v2.f36202c);
                                    iM13439S = iM13435O;
                                    i51 = i26;
                                    c11917v4 = c11917v2;
                                    i53 = i22;
                                    unsafe3 = unsafe2;
                                    i56 = i63;
                                    i52 = i21;
                                    i11 = i11;
                                    i55 = i25;
                                } else {
                                    z6 = false;
                                    objArr = objArr;
                                    i18 = iM13436P;
                                    c11892m1 = c11892m3;
                                    i53 = i22;
                                    unsafe = unsafe2;
                                    i54 = i54;
                                    i19 = i21;
                                    i55 = i20;
                                    c11917v1 = c11917v2;
                                    i16 = i23;
                                    obj3 = obj5;
                                    i12 = i12;
                                }
                                break;
                            case 9:
                                unsafe2 = unsafe3;
                                i21 = i58;
                                c9 = 2;
                                c11917v2 = c11917v4;
                                i22 = iM13256w;
                                i23 = i63 == true ? 1 : 0;
                                if (i61 == 2) {
                                    Object objM13235C = this.m13235C(i22, obj5);
                                    i11 = i11;
                                    int iM13440T = AbstractC11957g1.m13440T(objM13235C, this.m13234B(i22), bArr, iM13436P, i11, c11917v0);
                                    this.m13249m(obj5, i22, objM13235C);
                                    iM13439S = iM13440T;
                                    i56 = i23 == true ? 1 : 0;
                                    c11917v4 = c11917v2;
                                    i53 = i22;
                                    unsafe3 = unsafe2;
                                    i51 = 3;
                                    i55 = i20 | i65;
                                    i52 = i21;
                                } else {
                                    iM13436P = iM13436P;
                                    z6 = false;
                                    objArr = objArr;
                                    i18 = iM13436P;
                                    c11892m1 = c11892m3;
                                    i53 = i22;
                                    unsafe = unsafe2;
                                    i54 = i54;
                                    i19 = i21;
                                    i55 = i20;
                                    c11917v1 = c11917v2;
                                    i16 = i23;
                                    obj3 = obj5;
                                    i12 = i12;
                                }
                                break;
                            case 10:
                                unsafe2 = unsafe3;
                                i21 = i58;
                                long j19 = j10;
                                c9 = 2;
                                c11917v2 = c11917v4;
                                i22 = iM13256w;
                                i23 = i63 == true ? 1 : 0;
                                if (i61 == 2) {
                                    i29 = i20 | i65;
                                    int iM13443d = AbstractC11957g1.m13443d(bArr7, iM13436P, c11917v2);
                                    unsafe2.putObject(obj5, j19, c11917v2.f36202c);
                                    iM13439S = iM13443d;
                                    i56 = i23 == true ? 1 : 0;
                                    c11917v4 = c11917v2;
                                    i53 = i22;
                                    unsafe3 = unsafe2;
                                    i52 = i21;
                                    i55 = i29;
                                    i51 = 3;
                                }
                                iM13436P = iM13436P;
                                z6 = false;
                                objArr = objArr;
                                i18 = iM13436P;
                                c11892m1 = c11892m3;
                                i53 = i22;
                                unsafe = unsafe2;
                                i54 = i54;
                                i19 = i21;
                                i55 = i20;
                                c11917v1 = c11917v2;
                                i16 = i23;
                                obj3 = obj5;
                                i12 = i12;
                                break;
                            case 12:
                                unsafe2 = unsafe3;
                                i21 = i58;
                                i30 = i63 == true ? 1 : 0;
                                long j20 = j10;
                                c11917v2 = c11917v4;
                                i22 = iM13256w;
                                if (i61 == 0) {
                                    iM13439S = AbstractC11957g1.m13435O(bArr7, iM13436P, c11917v2);
                                    int i81 = c11917v2.f36200a;
                                    InterfaceC11977l1 interfaceC11977l1M13233A = this.m13233A(i22);
                                    if ((i62 & Integer.MIN_VALUE) == 0 || interfaceC11977l1M13233A == null || interfaceC11977l1M13233A.mo13323a(i81)) {
                                        i25 = i20 | i65;
                                        unsafe2.putInt(obj5, j20, i81);
                                        i12 = i12;
                                        i56 = i30 == true ? 1 : 0;
                                        c11917v4 = c11917v2;
                                        i53 = i22;
                                        unsafe3 = unsafe2;
                                        i54 = i54;
                                        i52 = i21;
                                        i51 = 3;
                                        i11 = i11;
                                        i55 = i25;
                                    } else {
                                        AbstractC11969j1 abstractC11969j1 = (AbstractC11969j1) obj5;
                                        C11892M1 c11892m1M13307b = abstractC11969j1.zzc;
                                        if (c11892m1M13307b == c11892m3) {
                                            c11892m1M13307b = C11892M1.m13307b();
                                            abstractC11969j1.zzc = c11892m1M13307b;
                                        }
                                        c11892m1M13307b.m13309c(i30 == true ? 1 : 0, Long.valueOf(i81));
                                        i56 = i30 == true ? 1 : 0;
                                        c11917v4 = c11917v2;
                                        i53 = i22;
                                        unsafe3 = unsafe2;
                                        i54 = i54;
                                        i52 = i21;
                                        i51 = 3;
                                        i11 = i11;
                                        i55 = i20;
                                        i12 = i12;
                                    }
                                } else {
                                    i23 = i30;
                                    z6 = false;
                                    objArr = objArr;
                                    i18 = iM13436P;
                                    c11892m1 = c11892m3;
                                    i53 = i22;
                                    unsafe = unsafe2;
                                    i54 = i54;
                                    i19 = i21;
                                    i55 = i20;
                                    c11917v1 = c11917v2;
                                    i16 = i23;
                                    obj3 = obj5;
                                    i12 = i12;
                                }
                                break;
                            case 15:
                                unsafe2 = unsafe3;
                                i21 = i58;
                                i30 = i63 == true ? 1 : 0;
                                c11917v2 = c11917v4;
                                i22 = iM13256w;
                                if (i61 == 0) {
                                    i29 = i20 | i65;
                                    iM13439S = AbstractC11957g1.m13435O(bArr7, iM13436P, c11917v2);
                                    unsafe2.putInt(obj5, j10, AbstractC11957g1.m13453p(c11917v2.f36200a));
                                    c11917v4 = c11917v2;
                                    i53 = i22;
                                    unsafe3 = unsafe2;
                                    i56 = i30 == true ? 1 : 0;
                                    i52 = i21;
                                    i55 = i29;
                                    i51 = 3;
                                } else {
                                    i23 = i30;
                                    z6 = false;
                                    objArr = objArr;
                                    i18 = iM13436P;
                                    c11892m1 = c11892m3;
                                    i53 = i22;
                                    unsafe = unsafe2;
                                    i54 = i54;
                                    i19 = i21;
                                    i55 = i20;
                                    c11917v1 = c11917v2;
                                    i16 = i23;
                                    obj3 = obj5;
                                    i12 = i12;
                                }
                                break;
                            case 16:
                                unsafe2 = unsafe3;
                                i21 = i58;
                                if (i61 == 0) {
                                    int iM13438R4 = AbstractC11957g1.m13438R(bArr7, iM13436P, c11917v4);
                                    int i82 = iM13256w;
                                    unsafe2.putLong(obj, j10, AbstractC11957g1.m13459x(c11917v4.f36201b));
                                    i11 = i11;
                                    c11917v4 = c11917v4;
                                    i53 = i82;
                                    unsafe3 = unsafe2;
                                    i56 = i63 == true ? 1 : 0;
                                    i51 = 3;
                                    i55 = i20 | i65;
                                    iM13439S = iM13438R4;
                                    i52 = i21;
                                } else {
                                    c11917v2 = c11917v4;
                                    i22 = iM13256w;
                                    iM13436P = iM13436P;
                                    c11892m3 = c11892m3;
                                    i23 = i63 == true ? 1 : 0;
                                    z6 = false;
                                    objArr = objArr;
                                    i18 = iM13436P;
                                    c11892m1 = c11892m3;
                                    i53 = i22;
                                    unsafe = unsafe2;
                                    i54 = i54;
                                    i19 = i21;
                                    i55 = i20;
                                    c11917v1 = c11917v2;
                                    i16 = i23;
                                    obj3 = obj5;
                                    i12 = i12;
                                }
                                break;
                            default:
                                i51 = 3;
                                if (i61 == 3) {
                                    i24 = i20 | i65;
                                    Object objM13235C2 = this.m13235C(iM13256w, obj5);
                                    i21 = i58;
                                    iM13439S = AbstractC11957g1.m13439S(objM13235C2, this.m13234B(iM13256w), bArr, iM13436P, i11, (i58 << 3) | 4, c11917v0);
                                    this.m13249m(obj5, iM13256w, objM13235C2);
                                    unsafe3 = unsafe3;
                                    i53 = iM13256w;
                                    i56 = i63 == true ? 1 : 0;
                                    i52 = i21;
                                    i11 = i11;
                                    i55 = i24;
                                } else {
                                    unsafe2 = unsafe3;
                                    i21 = i58;
                                    c11917v2 = c11917v4;
                                    i22 = iM13256w;
                                    c11892m3 = c11892m3;
                                    i23 = i63 == true ? 1 : 0;
                                    z6 = false;
                                    iM13436P = iM13436P;
                                    objArr = objArr;
                                    i18 = iM13436P;
                                    c11892m1 = c11892m3;
                                    i53 = i22;
                                    unsafe = unsafe2;
                                    i54 = i54;
                                    i19 = i21;
                                    i55 = i20;
                                    c11917v1 = c11917v2;
                                    i16 = i23;
                                    obj3 = obj5;
                                    i12 = i12;
                                }
                                break;
                        }
                    } else {
                        int i83 = i58;
                        iArr = iArr2;
                        int i84 = i55;
                        int i85 = iM13256w;
                        Unsafe unsafe4 = unsafe3;
                        int i86 = i54;
                        C11917V0 c11917v5 = c11917v4;
                        int i87 = iM13436P;
                        if (iM13231x != 27) {
                            int i88 = i85;
                            C11917V0 c11917v6 = c11917v5;
                            if (iM13231x <= 49) {
                                long j21 = i62;
                                Unsafe unsafe5 = f36100k;
                                unsafe = unsafe4;
                                AbstractC11911T0 abstractC11911T2 = (AbstractC11911T0) ((InterfaceC11985n1) unsafe5.getObject(obj5, j10));
                                if (abstractC11911T2.m13349j()) {
                                    abstractC11911T0 = abstractC11911T2;
                                } else {
                                    int size = abstractC11911T2.size();
                                    InterfaceC11985n1 interfaceC11985n1Mo13266e = abstractC11911T2.mo13266e(size + size);
                                    unsafe5.putObject(obj5, j10, interfaceC11985n1Mo13266e);
                                    abstractC11911T0 = interfaceC11985n1Mo13266e;
                                }
                                switch (iM13231x) {
                                    case 18:
                                    case 35:
                                        bArr4 = bArr;
                                        objArr = objArr;
                                        i39 = i11;
                                        i88 = i88;
                                        AbstractC11911T0 abstractC11911T3 = abstractC11911T0;
                                        c11917v6 = c11917v6;
                                        i40 = i87;
                                        i33 = i84;
                                        c11892m3 = c11892m3;
                                        unsafe = unsafe;
                                        i19 = i83;
                                        i41 = i63 == true ? 1 : 0;
                                        if (i61 == 2) {
                                            AbstractC10763a.m11063u(abstractC11911T3);
                                            if (AbstractC11957g1.m13435O(bArr4, i40, c11917v6) + c11917v6.f36200a > bArr4.length) {
                                                throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            throw null;
                                        }
                                        if (i61 == 1) {
                                            AbstractC10763a.m11063u(abstractC11911T3);
                                            Double.longBitsToDouble(AbstractC11957g1.m13441U(i40, bArr4));
                                            throw null;
                                        }
                                        iM13435O3 = i40;
                                        if (iM13435O3 != i40) {
                                            i53 = i88;
                                            c11917v4 = c11917v6;
                                            i11 = i39;
                                            i56 = i41;
                                            bArr7 = bArr4;
                                            unsafe3 = unsafe;
                                            obj5 = obj;
                                            i52 = i19;
                                            iM13439S = iM13435O3;
                                            i51 = 3;
                                            i55 = i33;
                                            i54 = i86;
                                        } else {
                                            obj3 = obj;
                                            i53 = i88;
                                            i18 = iM13435O3;
                                            c11892m1 = c11892m3;
                                            i16 = i41;
                                            c11917v1 = c11917v6;
                                            i55 = i33;
                                            i54 = i86;
                                        }
                                        break;
                                        break;
                                    case 19:
                                    case 36:
                                        bArr4 = bArr;
                                        objArr = objArr;
                                        i39 = i11;
                                        i88 = i88;
                                        AbstractC11911T0 abstractC11911T4 = abstractC11911T0;
                                        c11917v6 = c11917v6;
                                        i40 = i87;
                                        i33 = i84;
                                        c11892m3 = c11892m3;
                                        unsafe = unsafe;
                                        i19 = i83;
                                        i41 = i63 == true ? 1 : 0;
                                        if (i61 == 2) {
                                            AbstractC10763a.m11063u(abstractC11911T4);
                                            if (AbstractC11957g1.m13435O(bArr4, i40, c11917v6) + c11917v6.f36200a > bArr4.length) {
                                                throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            throw null;
                                        }
                                        if (i61 == 5) {
                                            AbstractC10763a.m11063u(abstractC11911T4);
                                            Float.intBitsToFloat(AbstractC11957g1.m13454q(i40, bArr4));
                                            throw null;
                                        }
                                        iM13435O3 = i40;
                                        if (iM13435O3 != i40) {
                                            i53 = i88;
                                            c11917v4 = c11917v6;
                                            i11 = i39;
                                            i56 = i41;
                                            bArr7 = bArr4;
                                            unsafe3 = unsafe;
                                            obj5 = obj;
                                            i52 = i19;
                                            iM13439S = iM13435O3;
                                            i51 = 3;
                                            i55 = i33;
                                            i54 = i86;
                                        } else {
                                            obj3 = obj;
                                            i53 = i88;
                                            i18 = iM13435O3;
                                            c11892m1 = c11892m3;
                                            i16 = i41;
                                            c11917v1 = c11917v6;
                                            i55 = i33;
                                            i54 = i86;
                                        }
                                        break;
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        bArr4 = bArr;
                                        objArr = objArr;
                                        i39 = i11;
                                        i88 = i88;
                                        AbstractC11911T0 abstractC11911T5 = abstractC11911T0;
                                        c11917v6 = c11917v6;
                                        i40 = i87;
                                        i33 = i84;
                                        c11892m3 = c11892m3;
                                        unsafe = unsafe;
                                        i19 = i83;
                                        i41 = i63 == true ? 1 : 0;
                                        if (i61 == 2) {
                                            AbstractC10763a.m11063u(abstractC11911T5);
                                            iM13435O3 = AbstractC11957g1.m13435O(bArr4, i40, c11917v6);
                                            int i89 = c11917v6.f36200a + iM13435O3;
                                            if (iM13435O3 < i89) {
                                                AbstractC11957g1.m13438R(bArr4, iM13435O3, c11917v6);
                                                throw null;
                                            }
                                            if (iM13435O3 != i89) {
                                                throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i61 == 0) {
                                                AbstractC10763a.m11063u(abstractC11911T5);
                                                AbstractC11957g1.m13438R(bArr4, i40, c11917v6);
                                                throw null;
                                            }
                                            iM13435O3 = i40;
                                        }
                                        if (iM13435O3 != i40) {
                                            i53 = i88;
                                            c11917v4 = c11917v6;
                                            i11 = i39;
                                            i56 = i41;
                                            bArr7 = bArr4;
                                            unsafe3 = unsafe;
                                            obj5 = obj;
                                            i52 = i19;
                                            iM13439S = iM13435O3;
                                            i51 = 3;
                                            i55 = i33;
                                            i54 = i86;
                                        } else {
                                            obj3 = obj;
                                            i53 = i88;
                                            i18 = iM13435O3;
                                            c11892m1 = c11892m3;
                                            i16 = i41;
                                            c11917v1 = c11917v6;
                                            i55 = i33;
                                            i54 = i86;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        bArr4 = bArr;
                                        objArr = objArr;
                                        i88 = i88;
                                        AbstractC11911T0 abstractC11911T6 = abstractC11911T0;
                                        c11917v6 = c11917v6;
                                        i40 = i87;
                                        i33 = i84;
                                        c11892m3 = c11892m3;
                                        unsafe = unsafe;
                                        i42 = i83;
                                        i41 = i63 == true ? 1 : 0;
                                        i43 = i11;
                                        if (i61 == 2) {
                                            iM13432J = AbstractC11957g1.m13432J(bArr4, i40, abstractC11911T6, c11917v6);
                                            i19 = i42;
                                            iM13435O3 = iM13432J;
                                            i39 = i43;
                                        } else if (i61 == 0) {
                                            i19 = i42;
                                            i39 = i43;
                                            iM13435O3 = AbstractC11957g1.m13437Q(i41 == true ? 1 : 0, bArr, i40, i11, abstractC11911T6, c11917v0);
                                        } else {
                                            i19 = i42;
                                            i39 = i43;
                                            iM13435O3 = i40;
                                        }
                                        if (iM13435O3 != i40) {
                                            i53 = i88;
                                            c11917v4 = c11917v6;
                                            i11 = i39;
                                            i56 = i41;
                                            bArr7 = bArr4;
                                            unsafe3 = unsafe;
                                            obj5 = obj;
                                            i52 = i19;
                                            iM13439S = iM13435O3;
                                            i51 = 3;
                                            i55 = i33;
                                            i54 = i86;
                                        } else {
                                            obj3 = obj;
                                            i53 = i88;
                                            i18 = iM13435O3;
                                            c11892m1 = c11892m3;
                                            i16 = i41;
                                            c11917v1 = c11917v6;
                                            i55 = i33;
                                            i54 = i86;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        bArr4 = bArr;
                                        objArr = objArr;
                                        i88 = i88;
                                        AbstractC11911T0 abstractC11911T7 = abstractC11911T0;
                                        c11917v6 = c11917v6;
                                        i40 = i87;
                                        i33 = i84;
                                        c11892m3 = c11892m3;
                                        unsafe = unsafe;
                                        i42 = i83;
                                        i41 = i63 == true ? 1 : 0;
                                        i43 = i11;
                                        if (i61 == 2) {
                                            AbstractC10763a.m11063u(abstractC11911T7);
                                            if (AbstractC11957g1.m13435O(bArr4, i40, c11917v6) + c11917v6.f36200a > bArr4.length) {
                                                throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            throw null;
                                        }
                                        if (i61 == 1) {
                                            AbstractC10763a.m11063u(abstractC11911T7);
                                            AbstractC11957g1.m13441U(i40, bArr4);
                                            throw null;
                                        }
                                        i19 = i42;
                                        i39 = i43;
                                        iM13435O3 = i40;
                                        if (iM13435O3 != i40) {
                                            i53 = i88;
                                            c11917v4 = c11917v6;
                                            i11 = i39;
                                            i56 = i41;
                                            bArr7 = bArr4;
                                            unsafe3 = unsafe;
                                            obj5 = obj;
                                            i52 = i19;
                                            iM13439S = iM13435O3;
                                            i51 = 3;
                                            i55 = i33;
                                            i54 = i86;
                                        } else {
                                            obj3 = obj;
                                            i53 = i88;
                                            i18 = iM13435O3;
                                            c11892m1 = c11892m3;
                                            i16 = i41;
                                            c11917v1 = c11917v6;
                                            i55 = i33;
                                            i54 = i86;
                                        }
                                        break;
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        bArr4 = bArr;
                                        objArr = objArr;
                                        i88 = i88;
                                        AbstractC11911T0 abstractC11911T8 = abstractC11911T0;
                                        c11917v6 = c11917v6;
                                        i40 = i87;
                                        i33 = i84;
                                        c11892m3 = c11892m3;
                                        unsafe = unsafe;
                                        i42 = i83;
                                        i41 = i63 == true ? 1 : 0;
                                        i43 = i11;
                                        if (i61 != 2) {
                                            if (i61 == 5) {
                                                iM13432J = i40 + 4;
                                                C11973k1 c11973k1 = (C11973k1) abstractC11911T8;
                                                c11973k1.m13487p(AbstractC11957g1.m13454q(i40, bArr4));
                                                while (iM13432J < i43) {
                                                    int iM13435O7 = AbstractC11957g1.m13435O(bArr4, iM13432J, c11917v6);
                                                    if (i41 != c11917v6.f36200a) {
                                                        i19 = i42;
                                                        iM13435O3 = iM13432J;
                                                        i39 = i43;
                                                        if (iM13435O3 != i40) {
                                                            i53 = i88;
                                                            c11917v4 = c11917v6;
                                                            i11 = i39;
                                                            i56 = i41;
                                                            bArr7 = bArr4;
                                                            unsafe3 = unsafe;
                                                            obj5 = obj;
                                                            i52 = i19;
                                                            iM13439S = iM13435O3;
                                                            i51 = 3;
                                                            i55 = i33;
                                                            i54 = i86;
                                                        } else {
                                                            obj3 = obj;
                                                            i53 = i88;
                                                            i18 = iM13435O3;
                                                            c11892m1 = c11892m3;
                                                            i16 = i41;
                                                            c11917v1 = c11917v6;
                                                            i55 = i33;
                                                            i54 = i86;
                                                        }
                                                    } else {
                                                        c11973k1.m13487p(AbstractC11957g1.m13454q(iM13435O7, bArr4));
                                                        iM13432J = iM13435O7 + 4;
                                                    }
                                                    break;
                                                }
                                                i19 = i42;
                                                iM13435O3 = iM13432J;
                                                i39 = i43;
                                                if (iM13435O3 != i40) {
                                                    i53 = i88;
                                                    c11917v4 = c11917v6;
                                                    i11 = i39;
                                                    i56 = i41;
                                                    bArr7 = bArr4;
                                                    unsafe3 = unsafe;
                                                    obj5 = obj;
                                                    i52 = i19;
                                                    iM13439S = iM13435O3;
                                                    i51 = 3;
                                                    i55 = i33;
                                                    i54 = i86;
                                                } else {
                                                    obj3 = obj;
                                                    i53 = i88;
                                                    i18 = iM13435O3;
                                                    c11892m1 = c11892m3;
                                                    i16 = i41;
                                                    c11917v1 = c11917v6;
                                                    i55 = i33;
                                                    i54 = i86;
                                                }
                                            }
                                            i19 = i42;
                                            i39 = i43;
                                            iM13435O3 = i40;
                                            if (iM13435O3 != i40) {
                                                i53 = i88;
                                                c11917v4 = c11917v6;
                                                i11 = i39;
                                                i56 = i41;
                                                bArr7 = bArr4;
                                                unsafe3 = unsafe;
                                                obj5 = obj;
                                                i52 = i19;
                                                iM13439S = iM13435O3;
                                                i51 = 3;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                obj3 = obj;
                                                i53 = i88;
                                                i18 = iM13435O3;
                                                c11892m1 = c11892m3;
                                                i16 = i41;
                                                c11917v1 = c11917v6;
                                                i55 = i33;
                                                i54 = i86;
                                            }
                                            break;
                                        } else {
                                            C11973k1 c11973k2 = (C11973k1) abstractC11911T8;
                                            iM13435O4 = AbstractC11957g1.m13435O(bArr4, i40, c11917v6);
                                            int i90 = c11917v6.f36200a;
                                            int i91 = iM13435O4 + i90;
                                            if (i91 > bArr4.length) {
                                                throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            c11973k2.m13488q((i90 / 4) + c11973k2.size());
                                            while (iM13435O4 < i91) {
                                                c11973k2.m13487p(AbstractC11957g1.m13454q(iM13435O4, bArr4));
                                                iM13435O4 += 4;
                                            }
                                            if (iM13435O4 != i91) {
                                                throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i19 = i42;
                                            iM13435O3 = iM13435O4;
                                            i39 = i43;
                                            if (iM13435O3 != i40) {
                                                i53 = i88;
                                                c11917v4 = c11917v6;
                                                i11 = i39;
                                                i56 = i41;
                                                bArr7 = bArr4;
                                                unsafe3 = unsafe;
                                                obj5 = obj;
                                                i52 = i19;
                                                iM13439S = iM13435O3;
                                                i51 = 3;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                obj3 = obj;
                                                i53 = i88;
                                                i18 = iM13435O3;
                                                c11892m1 = c11892m3;
                                                i16 = i41;
                                                c11917v1 = c11917v6;
                                                i55 = i33;
                                                i54 = i86;
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        bArr4 = bArr;
                                        objArr = objArr;
                                        i88 = i88;
                                        AbstractC11911T0 abstractC11911T9 = abstractC11911T0;
                                        c11917v6 = c11917v6;
                                        i40 = i87;
                                        i33 = i84;
                                        c11892m3 = c11892m3;
                                        unsafe = unsafe;
                                        i42 = i83;
                                        i41 = i63 == true ? 1 : 0;
                                        i43 = i11;
                                        if (i61 == 2) {
                                            AbstractC10763a.m11063u(abstractC11911T9);
                                            iM13432J = AbstractC11957g1.m13435O(bArr4, i40, c11917v6);
                                            int i92 = c11917v6.f36200a + iM13432J;
                                            if (iM13432J < i92) {
                                                AbstractC11957g1.m13438R(bArr4, iM13432J, c11917v6);
                                                throw null;
                                            }
                                            if (iM13432J != i92) {
                                                throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i19 = i42;
                                            iM13435O3 = iM13432J;
                                            i39 = i43;
                                            if (iM13435O3 != i40) {
                                                i53 = i88;
                                                c11917v4 = c11917v6;
                                                i11 = i39;
                                                i56 = i41;
                                                bArr7 = bArr4;
                                                unsafe3 = unsafe;
                                                obj5 = obj;
                                                i52 = i19;
                                                iM13439S = iM13435O3;
                                                i51 = 3;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                obj3 = obj;
                                                i53 = i88;
                                                i18 = iM13435O3;
                                                c11892m1 = c11892m3;
                                                i16 = i41;
                                                c11917v1 = c11917v6;
                                                i55 = i33;
                                                i54 = i86;
                                            }
                                        } else {
                                            if (i61 == 0) {
                                                AbstractC10763a.m11063u(abstractC11911T9);
                                                AbstractC11957g1.m13438R(bArr4, i40, c11917v6);
                                                throw null;
                                            }
                                            i19 = i42;
                                            i39 = i43;
                                            iM13435O3 = i40;
                                            if (iM13435O3 != i40) {
                                                i53 = i88;
                                                c11917v4 = c11917v6;
                                                i11 = i39;
                                                i56 = i41;
                                                bArr7 = bArr4;
                                                unsafe3 = unsafe;
                                                obj5 = obj;
                                                i52 = i19;
                                                iM13439S = iM13435O3;
                                                i51 = 3;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                obj3 = obj;
                                                i53 = i88;
                                                i18 = iM13435O3;
                                                c11892m1 = c11892m3;
                                                i16 = i41;
                                                c11917v1 = c11917v6;
                                                i55 = i33;
                                                i54 = i86;
                                            }
                                        }
                                        break;
                                    case 26:
                                        objArr = objArr;
                                        i88 = i88;
                                        AbstractC11911T0 abstractC11911T10 = abstractC11911T0;
                                        c11917v6 = c11917v6;
                                        i40 = i87;
                                        i33 = i84;
                                        c11892m3 = c11892m3;
                                        unsafe = unsafe;
                                        i41 = i63 == true ? 1 : 0;
                                        i43 = i11;
                                        if (i61 == 2) {
                                            if ((536870912 & j21) == 0) {
                                                iM13435O4 = AbstractC11957g1.m13435O(bArr, i40, c11917v6);
                                                int i93 = c11917v6.f36200a;
                                                if (i93 < 0) {
                                                    throw new C11997q1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i93 == 0) {
                                                    abstractC11911T1 = abstractC11911T10;
                                                    abstractC11911T1.add("");
                                                } else {
                                                    abstractC11911T1 = abstractC11911T10;
                                                    abstractC11911T1.add(new String(bArr, iM13435O4, i93, AbstractC11989o1.f36309a));
                                                    iM13435O4 += i93;
                                                }
                                                while (iM13435O4 < i43) {
                                                    int iM13435O8 = AbstractC11957g1.m13435O(bArr, iM13435O4, c11917v6);
                                                    if (i41 == c11917v6.f36200a) {
                                                        iM13435O4 = AbstractC11957g1.m13435O(bArr, iM13435O8, c11917v6);
                                                        int i94 = c11917v6.f36200a;
                                                        if (i94 < 0) {
                                                            throw new C11997q1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i94 == 0) {
                                                            abstractC11911T1.add("");
                                                        } else {
                                                            abstractC11911T1.add(new String(bArr, iM13435O4, i94, AbstractC11989o1.f36309a));
                                                            iM13435O4 += i94;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iM13435O4 = AbstractC11957g1.m13435O(bArr, i40, c11917v6);
                                                int i95 = c11917v6.f36200a;
                                                if (i95 < 0) {
                                                    throw new C11997q1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i95 == 0) {
                                                    abstractC11911T10.add("");
                                                } else {
                                                    int i96 = iM13435O4 + i95;
                                                    if (!AbstractC11912T1.m13353d(bArr, iM13435O4, i96)) {
                                                        throw new C11997q1(r8);
                                                    }
                                                    abstractC11911T10.add(new String(bArr, iM13435O4, i95, AbstractC11989o1.f36309a));
                                                    iM13435O4 = i96;
                                                }
                                                while (iM13435O4 < i43) {
                                                    int iM13435O9 = AbstractC11957g1.m13435O(bArr, iM13435O4, c11917v6);
                                                    if (i41 == c11917v6.f36200a) {
                                                        iM13435O4 = AbstractC11957g1.m13435O(bArr, iM13435O9, c11917v6);
                                                        int i97 = c11917v6.f36200a;
                                                        if (i97 < 0) {
                                                            throw new C11997q1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i97 == 0) {
                                                            abstractC11911T10.add("");
                                                        } else {
                                                            int i98 = iM13435O4 + i97;
                                                            if (!AbstractC11912T1.m13353d(bArr, iM13435O4, i98)) {
                                                                throw new C11997q1(str);
                                                            }
                                                            abstractC11911T10.add(new String(bArr, iM13435O4, i97, AbstractC11989o1.f36309a));
                                                            iM13435O4 = i98;
                                                        }
                                                    }
                                                }
                                            }
                                            i19 = i83;
                                            bArr4 = bArr;
                                            iM13435O3 = iM13435O4;
                                            i39 = i43;
                                            if (iM13435O3 != i40) {
                                                i53 = i88;
                                                c11917v4 = c11917v6;
                                                i11 = i39;
                                                i56 = i41;
                                                bArr7 = bArr4;
                                                unsafe3 = unsafe;
                                                obj5 = obj;
                                                i52 = i19;
                                                iM13439S = iM13435O3;
                                                i51 = 3;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                obj3 = obj;
                                                i53 = i88;
                                                i18 = iM13435O3;
                                                c11892m1 = c11892m3;
                                                i16 = i41;
                                                c11917v1 = c11917v6;
                                                i55 = i33;
                                                i54 = i86;
                                            }
                                        } else {
                                            i19 = i83;
                                            bArr4 = bArr;
                                            i39 = i43;
                                            iM13435O3 = i40;
                                            if (iM13435O3 != i40) {
                                                i53 = i88;
                                                c11917v4 = c11917v6;
                                                i11 = i39;
                                                i56 = i41;
                                                bArr7 = bArr4;
                                                unsafe3 = unsafe;
                                                obj5 = obj;
                                                i52 = i19;
                                                iM13439S = iM13435O3;
                                                i51 = 3;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                obj3 = obj;
                                                i53 = i88;
                                                i18 = iM13435O3;
                                                c11892m1 = c11892m3;
                                                i16 = i41;
                                                c11917v1 = c11917v6;
                                                i55 = i33;
                                                i54 = i86;
                                            }
                                        }
                                        break;
                                    case 27:
                                        bArr5 = bArr;
                                        i44 = i11;
                                        i33 = i84;
                                        i45 = i83;
                                        if (i61 == 2) {
                                            InterfaceC11880I1 interfaceC11880I1M13234B = this.m13234B(i88);
                                            objArr = objArr;
                                            i88 = i88;
                                            unsafe = unsafe;
                                            c11917v6 = c11917v6;
                                            int iM13429E = AbstractC11957g1.m13429E(interfaceC11880I1M13234B, i63 == true ? 1 : 0, bArr, i87, i11, abstractC11911T0, c11917v0);
                                            c11892m3 = c11892m3;
                                            bArr4 = bArr5;
                                            i39 = i44;
                                            i41 = i63 == true ? 1 : 0;
                                            i40 = i87;
                                            i19 = i45;
                                            iM13435O3 = iM13429E;
                                        } else {
                                            i41 = i63 == true ? 1 : 0;
                                            i40 = i87;
                                            bArr4 = bArr5;
                                            i39 = i44;
                                            i19 = i45;
                                            iM13435O3 = i40;
                                        }
                                        if (iM13435O3 != i40) {
                                            i53 = i88;
                                            c11917v4 = c11917v6;
                                            i11 = i39;
                                            i56 = i41;
                                            bArr7 = bArr4;
                                            unsafe3 = unsafe;
                                            obj5 = obj;
                                            i52 = i19;
                                            iM13439S = iM13435O3;
                                            i51 = 3;
                                            i55 = i33;
                                            i54 = i86;
                                        } else {
                                            obj3 = obj;
                                            i53 = i88;
                                            i18 = iM13435O3;
                                            c11892m1 = c11892m3;
                                            i16 = i41;
                                            c11917v1 = c11917v6;
                                            i55 = i33;
                                            i54 = i86;
                                        }
                                        break;
                                    case 28:
                                        bArr5 = bArr;
                                        i44 = i11;
                                        i33 = i84;
                                        i45 = i83;
                                        if (i61 == 2) {
                                            iM13435O3 = AbstractC11957g1.m13435O(bArr5, i87, c11917v6);
                                            int i99 = c11917v6.f36200a;
                                            if (i99 < 0) {
                                                throw new C11997q1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i99 > bArr5.length - iM13435O3) {
                                                throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i99 == 0) {
                                                abstractC11911T0.add(C11929Z0.f36227o0);
                                            } else {
                                                abstractC11911T0.add(C11929Z0.m13375p(bArr5, iM13435O3, i99));
                                                iM13435O3 += i99;
                                            }
                                            while (iM13435O3 < i44) {
                                                int iM13435O10 = AbstractC11957g1.m13435O(bArr5, iM13435O3, c11917v6);
                                                if (i63 != c11917v6.f36200a) {
                                                    i41 = i63 == true ? 1 : 0;
                                                    i40 = i87;
                                                    bArr4 = bArr5;
                                                    i39 = i44;
                                                    i19 = i45;
                                                    if (iM13435O3 != i40) {
                                                        i53 = i88;
                                                        c11917v4 = c11917v6;
                                                        i11 = i39;
                                                        i56 = i41;
                                                        bArr7 = bArr4;
                                                        unsafe3 = unsafe;
                                                        obj5 = obj;
                                                        i52 = i19;
                                                        iM13439S = iM13435O3;
                                                        i51 = 3;
                                                        i55 = i33;
                                                        i54 = i86;
                                                    } else {
                                                        obj3 = obj;
                                                        i53 = i88;
                                                        i18 = iM13435O3;
                                                        c11892m1 = c11892m3;
                                                        i16 = i41;
                                                        c11917v1 = c11917v6;
                                                        i55 = i33;
                                                        i54 = i86;
                                                    }
                                                    break;
                                                } else {
                                                    iM13435O3 = AbstractC11957g1.m13435O(bArr5, iM13435O10, c11917v6);
                                                    int i100 = c11917v6.f36200a;
                                                    if (i100 < 0) {
                                                        throw new C11997q1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i100 > bArr5.length - iM13435O3) {
                                                        throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i100 == 0) {
                                                        abstractC11911T0.add(C11929Z0.f36227o0);
                                                    } else {
                                                        abstractC11911T0.add(C11929Z0.m13375p(bArr5, iM13435O3, i100));
                                                        iM13435O3 += i100;
                                                    }
                                                }
                                            }
                                            i41 = i63 == true ? 1 : 0;
                                            i40 = i87;
                                            bArr4 = bArr5;
                                            i39 = i44;
                                            i19 = i45;
                                            if (iM13435O3 != i40) {
                                                i53 = i88;
                                                c11917v4 = c11917v6;
                                                i11 = i39;
                                                i56 = i41;
                                                bArr7 = bArr4;
                                                unsafe3 = unsafe;
                                                obj5 = obj;
                                                i52 = i19;
                                                iM13439S = iM13435O3;
                                                i51 = 3;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                obj3 = obj;
                                                i53 = i88;
                                                i18 = iM13435O3;
                                                c11892m1 = c11892m3;
                                                i16 = i41;
                                                c11917v1 = c11917v6;
                                                i55 = i33;
                                                i54 = i86;
                                            }
                                        } else {
                                            i41 = i63 == true ? 1 : 0;
                                            i40 = i87;
                                            bArr4 = bArr5;
                                            i39 = i44;
                                            i19 = i45;
                                            iM13435O3 = i40;
                                            if (iM13435O3 != i40) {
                                                i53 = i88;
                                                c11917v4 = c11917v6;
                                                i11 = i39;
                                                i56 = i41;
                                                bArr7 = bArr4;
                                                unsafe3 = unsafe;
                                                obj5 = obj;
                                                i52 = i19;
                                                iM13439S = iM13435O3;
                                                i51 = 3;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                obj3 = obj;
                                                i53 = i88;
                                                i18 = iM13435O3;
                                                c11892m1 = c11892m3;
                                                i16 = i41;
                                                c11917v1 = c11917v6;
                                                i55 = i33;
                                                i54 = i86;
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        bArr5 = bArr;
                                        i44 = i11;
                                        i33 = i84;
                                        if (i61 == 2) {
                                            iM13437Q = AbstractC11957g1.m13432J(bArr5, i87, abstractC11911T0, c11917v6);
                                        } else if (i61 != 0) {
                                            objArr = objArr;
                                            i88 = i88;
                                            c11917v6 = c11917v6;
                                            i41 = i63 == true ? 1 : 0;
                                            i40 = i87;
                                            c11892m3 = c11892m3;
                                            unsafe = unsafe;
                                            bArr4 = bArr5;
                                            i39 = i44;
                                            i19 = i83;
                                            iM13435O3 = i40;
                                            if (iM13435O3 != i40) {
                                                i53 = i88;
                                                c11917v4 = c11917v6;
                                                i11 = i39;
                                                i56 = i41;
                                                bArr7 = bArr4;
                                                unsafe3 = unsafe;
                                                obj5 = obj;
                                                i52 = i19;
                                                iM13439S = iM13435O3;
                                                i51 = 3;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                obj3 = obj;
                                                i53 = i88;
                                                i18 = iM13435O3;
                                                c11892m1 = c11892m3;
                                                i16 = i41;
                                                c11917v1 = c11917v6;
                                                i55 = i33;
                                                i54 = i86;
                                            }
                                        } else {
                                            iM13437Q = AbstractC11957g1.m13437Q(i63 == true ? 1 : 0, bArr, i87, i11, abstractC11911T0, c11917v0);
                                        }
                                        InterfaceC11977l1 interfaceC11977l1M13233A2 = this.m13233A(i88);
                                        C11961h1 c11961h1 = AbstractC11883J1.f36151a;
                                        if (interfaceC11977l1M13233A2 != null) {
                                            int size2 = abstractC11911T0.size();
                                            int i101 = 0;
                                            int i102 = 0;
                                            Object objM13294r = null;
                                            while (i101 < size2) {
                                                Integer num = (Integer) abstractC11911T0.get(i101);
                                                int i103 = iM13437Q;
                                                int iIntValue = num.intValue();
                                                if (interfaceC11977l1M13233A2.mo13323a(iIntValue)) {
                                                    if (i101 != i102) {
                                                        abstractC11911T0.set(i102, num);
                                                    }
                                                    i102++;
                                                    i48 = 1;
                                                    i47 = i83;
                                                } else {
                                                    i47 = i83;
                                                    objM13294r = AbstractC11883J1.m13294r(i47, obj5, objM13294r, iIntValue);
                                                    i48 = 1;
                                                }
                                                i101 += i48;
                                                i83 = i47;
                                                iM13437Q = i103;
                                            }
                                            i46 = iM13437Q;
                                            i45 = i83;
                                            if (i102 != size2) {
                                                abstractC11911T0.subList(i102, size2).clear();
                                            }
                                        } else {
                                            i46 = iM13437Q;
                                            i45 = i83;
                                        }
                                        i41 = i63 == true ? 1 : 0;
                                        i40 = i87;
                                        iM13435O3 = i46;
                                        bArr4 = bArr5;
                                        i39 = i44;
                                        i19 = i45;
                                        if (iM13435O3 != i40) {
                                            i53 = i88;
                                            c11917v4 = c11917v6;
                                            i11 = i39;
                                            i56 = i41;
                                            bArr7 = bArr4;
                                            unsafe3 = unsafe;
                                            obj5 = obj;
                                            i52 = i19;
                                            iM13439S = iM13435O3;
                                            i51 = 3;
                                            i55 = i33;
                                            i54 = i86;
                                        } else {
                                            obj3 = obj;
                                            i53 = i88;
                                            i18 = iM13435O3;
                                            c11892m1 = c11892m3;
                                            i16 = i41;
                                            c11917v1 = c11917v6;
                                            i55 = i33;
                                            i54 = i86;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        bArr6 = bArr;
                                        i49 = i63 == true ? 1 : 0;
                                        i50 = i87;
                                        i33 = i84;
                                        if (i61 == 2) {
                                            C11973k1 c11973k3 = (C11973k1) abstractC11911T0;
                                            iM13435O3 = AbstractC11957g1.m13435O(bArr6, i50, c11917v6);
                                            int i104 = c11917v6.f36200a + iM13435O3;
                                            while (iM13435O3 < i104) {
                                                iM13435O3 = AbstractC11957g1.m13435O(bArr6, iM13435O3, c11917v6);
                                                c11973k3.m13487p(AbstractC11957g1.m13453p(c11917v6.f36200a));
                                            }
                                            if (iM13435O3 != i104) {
                                                throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            objArr = objArr;
                                            i88 = i88;
                                            c11917v6 = c11917v6;
                                            i41 = i49;
                                            i40 = i50;
                                            c11892m3 = c11892m3;
                                            unsafe = unsafe;
                                            i19 = i83;
                                            bArr4 = bArr6;
                                            i39 = i11;
                                        } else if (i61 == 0) {
                                            C11973k1 c11973k4 = (C11973k1) abstractC11911T0;
                                            iM13435O3 = AbstractC11957g1.m13435O(bArr6, i50, c11917v6);
                                            c11973k4.m13487p(AbstractC11957g1.m13453p(c11917v6.f36200a));
                                            while (iM13435O3 < i11) {
                                                int iM13435O11 = AbstractC11957g1.m13435O(bArr6, iM13435O3, c11917v6);
                                                if (i49 == c11917v6.f36200a) {
                                                    iM13435O3 = AbstractC11957g1.m13435O(bArr6, iM13435O11, c11917v6);
                                                    c11973k4.m13487p(AbstractC11957g1.m13453p(c11917v6.f36200a));
                                                } else {
                                                    objArr = objArr;
                                                    i88 = i88;
                                                    c11917v6 = c11917v6;
                                                    i41 = i49 == true ? 1 : 0;
                                                    i40 = i50;
                                                    c11892m3 = c11892m3;
                                                    unsafe = unsafe;
                                                    bArr4 = bArr6;
                                                    i39 = i11;
                                                    i19 = i83;
                                                }
                                            }
                                            objArr = objArr;
                                            i88 = i88;
                                            c11917v6 = c11917v6;
                                            i41 = i49 == true ? 1 : 0;
                                            i40 = i50;
                                            c11892m3 = c11892m3;
                                            unsafe = unsafe;
                                            bArr4 = bArr6;
                                            i39 = i11;
                                            i19 = i83;
                                        } else {
                                            objArr = objArr;
                                            i88 = i88;
                                            c11917v6 = c11917v6;
                                            i41 = i49;
                                            i40 = i50;
                                            c11892m3 = c11892m3;
                                            unsafe = unsafe;
                                            i19 = i83;
                                            bArr4 = bArr6;
                                            i39 = i11;
                                            iM13435O3 = i40;
                                        }
                                        if (iM13435O3 != i40) {
                                            i53 = i88;
                                            c11917v4 = c11917v6;
                                            i11 = i39;
                                            i56 = i41;
                                            bArr7 = bArr4;
                                            unsafe3 = unsafe;
                                            obj5 = obj;
                                            i52 = i19;
                                            iM13439S = iM13435O3;
                                            i51 = 3;
                                            i55 = i33;
                                            i54 = i86;
                                        } else {
                                            obj3 = obj;
                                            i53 = i88;
                                            i18 = iM13435O3;
                                            c11892m1 = c11892m3;
                                            i16 = i41;
                                            c11917v1 = c11917v6;
                                            i55 = i33;
                                            i54 = i86;
                                        }
                                        break;
                                    case 34:
                                    case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                                        i49 = i63 == true ? 1 : 0;
                                        i50 = i87;
                                        i33 = i84;
                                        if (i61 == 2) {
                                            AbstractC10763a.m11063u(abstractC11911T0);
                                            bArr6 = bArr;
                                            iM13435O3 = AbstractC11957g1.m13435O(bArr6, i50, c11917v6);
                                            int i105 = c11917v6.f36200a + iM13435O3;
                                            if (iM13435O3 < i105) {
                                                AbstractC11957g1.m13438R(bArr6, iM13435O3, c11917v6);
                                                throw null;
                                            }
                                            if (iM13435O3 != i105) {
                                                throw new C11997q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            objArr = objArr;
                                            i88 = i88;
                                            c11917v6 = c11917v6;
                                            i41 = i49;
                                            i40 = i50;
                                            c11892m3 = c11892m3;
                                            unsafe = unsafe;
                                            i19 = i83;
                                            bArr4 = bArr6;
                                            i39 = i11;
                                            if (iM13435O3 != i40) {
                                                i53 = i88;
                                                c11917v4 = c11917v6;
                                                i11 = i39;
                                                i56 = i41;
                                                bArr7 = bArr4;
                                                unsafe3 = unsafe;
                                                obj5 = obj;
                                                i52 = i19;
                                                iM13439S = iM13435O3;
                                                i51 = 3;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                obj3 = obj;
                                                i53 = i88;
                                                i18 = iM13435O3;
                                                c11892m1 = c11892m3;
                                                i16 = i41;
                                                c11917v1 = c11917v6;
                                                i55 = i33;
                                                i54 = i86;
                                            }
                                        } else {
                                            bArr6 = bArr;
                                            if (i61 == 0) {
                                                AbstractC10763a.m11063u(abstractC11911T0);
                                                AbstractC11957g1.m13438R(bArr6, i50, c11917v6);
                                                throw null;
                                            }
                                            objArr = objArr;
                                            i88 = i88;
                                            c11917v6 = c11917v6;
                                            i41 = i49;
                                            i40 = i50;
                                            c11892m3 = c11892m3;
                                            unsafe = unsafe;
                                            i19 = i83;
                                            bArr4 = bArr6;
                                            i39 = i11;
                                            iM13435O3 = i40;
                                            if (iM13435O3 != i40) {
                                                i53 = i88;
                                                c11917v4 = c11917v6;
                                                i11 = i39;
                                                i56 = i41;
                                                bArr7 = bArr4;
                                                unsafe3 = unsafe;
                                                obj5 = obj;
                                                i52 = i19;
                                                iM13439S = iM13435O3;
                                                i51 = 3;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                obj3 = obj;
                                                i53 = i88;
                                                i18 = iM13435O3;
                                                c11892m1 = c11892m3;
                                                i16 = i41;
                                                c11917v1 = c11917v6;
                                                i55 = i33;
                                                i54 = i86;
                                            }
                                        }
                                        break;
                                    default:
                                        if (i61 == 3) {
                                            int i106 = ((i63 == true ? 1 : 0) & (-8)) | 4;
                                            InterfaceC11880I1 interfaceC11880I1M13234B2 = this.m13234B(i88);
                                            i33 = i84;
                                            iM13435O3 = AbstractC11957g1.m13458w(interfaceC11880I1M13234B2, bArr, i87, i11, i106, c11917v0);
                                            abstractC11911T0.add(c11917v6.f36202c);
                                            while (iM13435O3 < i11) {
                                                int iM13435O12 = AbstractC11957g1.m13435O(bArr, iM13435O3, c11917v6);
                                                if (i63 == c11917v6.f36200a) {
                                                    iM13435O3 = AbstractC11957g1.m13458w(interfaceC11880I1M13234B2, bArr, iM13435O12, i11, i106, c11917v0);
                                                    abstractC11911T0.add(c11917v6.f36202c);
                                                } else {
                                                    objArr = objArr;
                                                    i39 = i11;
                                                    i88 = i88;
                                                    c11917v6 = c11917v6;
                                                    i41 = i63 == true ? 1 : 0;
                                                    i40 = i87;
                                                    c11892m3 = c11892m3;
                                                    unsafe = unsafe;
                                                    i19 = i83;
                                                    bArr4 = bArr;
                                                }
                                            }
                                            objArr = objArr;
                                            i39 = i11;
                                            i88 = i88;
                                            c11917v6 = c11917v6;
                                            i41 = i63 == true ? 1 : 0;
                                            i40 = i87;
                                            c11892m3 = c11892m3;
                                            unsafe = unsafe;
                                            i19 = i83;
                                            bArr4 = bArr;
                                        } else {
                                            i33 = i84;
                                            bArr4 = bArr;
                                            objArr = objArr;
                                            i39 = i11;
                                            i88 = i88;
                                            c11917v6 = c11917v6;
                                            i40 = i87;
                                            c11892m3 = c11892m3;
                                            unsafe = unsafe;
                                            i19 = i83;
                                            i41 = i63 == true ? 1 : 0;
                                            iM13435O3 = i40;
                                        }
                                        if (iM13435O3 != i40) {
                                            i53 = i88;
                                            c11917v4 = c11917v6;
                                            i11 = i39;
                                            i56 = i41;
                                            bArr7 = bArr4;
                                            unsafe3 = unsafe;
                                            obj5 = obj;
                                            i52 = i19;
                                            iM13439S = iM13435O3;
                                            i51 = 3;
                                            i55 = i33;
                                            i54 = i86;
                                        } else {
                                            obj3 = obj;
                                            i53 = i88;
                                            i18 = iM13435O3;
                                            c11892m1 = c11892m3;
                                            i16 = i41;
                                            c11917v1 = c11917v6;
                                            i55 = i33;
                                            i54 = i86;
                                        }
                                        break;
                                }
                            } else {
                                objArr = objArr;
                                i32 = i88;
                                unsafe = unsafe4;
                                i33 = i84;
                                c11892m1 = c11892m3;
                                i19 = i83;
                                i34 = i87;
                                i35 = i63 == true ? 1 : 0;
                                if (iM13231x != 50) {
                                    obj3 = obj;
                                    Unsafe unsafe6 = f36100k;
                                    int i107 = i32;
                                    long j22 = iArr[i32 + 2] & 1048575;
                                    switch (iM13231x) {
                                        case 51:
                                            i107 = i107;
                                            obj3 = obj3;
                                            c11892m1 = c11892m1;
                                            i34 = i34;
                                            i16 = i35 == true ? 1 : 0;
                                            bArr2 = bArr;
                                            c11917v1 = c11917v0;
                                            if (i61 == 1) {
                                                iM13435O2 = i34 + 8;
                                                unsafe6.putObject(obj3, j10, Double.valueOf(Double.longBitsToDouble(AbstractC11957g1.m13441U(i34, bArr2))));
                                                unsafe6.putInt(obj3, j22, i19);
                                            } else {
                                                iM13435O2 = i34;
                                            }
                                            if (iM13435O2 != i34) {
                                                bArr7 = bArr2;
                                                obj5 = obj3;
                                                i52 = i19;
                                                c11917v4 = c11917v1;
                                                i53 = i107;
                                                i51 = 3;
                                                i11 = i11;
                                                iM13439S = iM13435O2;
                                                i56 = i16 == true ? 1 : 0;
                                                unsafe3 = unsafe;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                i18 = iM13435O2;
                                                i53 = i107;
                                            }
                                            break;
                                        case 52:
                                            i107 = i107;
                                            obj3 = obj3;
                                            c11892m1 = c11892m1;
                                            i34 = i34;
                                            i16 = i35 == true ? 1 : 0;
                                            bArr2 = bArr;
                                            c11917v1 = c11917v0;
                                            if (i61 == 5) {
                                                iM13435O2 = i34 + 4;
                                                unsafe6.putObject(obj3, j10, Float.valueOf(Float.intBitsToFloat(AbstractC11957g1.m13454q(i34, bArr2))));
                                                unsafe6.putInt(obj3, j22, i19);
                                            } else {
                                                iM13435O2 = i34;
                                            }
                                            if (iM13435O2 != i34) {
                                                bArr7 = bArr2;
                                                obj5 = obj3;
                                                i52 = i19;
                                                c11917v4 = c11917v1;
                                                i53 = i107;
                                                i51 = 3;
                                                i11 = i11;
                                                iM13439S = iM13435O2;
                                                i56 = i16 == true ? 1 : 0;
                                                unsafe3 = unsafe;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                i18 = iM13435O2;
                                                i53 = i107;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i107 = i107;
                                            obj3 = obj3;
                                            c11892m1 = c11892m1;
                                            i34 = i34;
                                            i16 = i35 == true ? 1 : 0;
                                            bArr2 = bArr;
                                            c11917v1 = c11917v0;
                                            if (i61 == 0) {
                                                iM13438R = AbstractC11957g1.m13438R(bArr2, i34, c11917v1);
                                                unsafe6.putObject(obj3, j10, Long.valueOf(c11917v1.f36201b));
                                                unsafe6.putInt(obj3, j22, i19);
                                                iM13435O2 = iM13438R;
                                            } else {
                                                iM13435O2 = i34;
                                            }
                                            if (iM13435O2 != i34) {
                                                bArr7 = bArr2;
                                                obj5 = obj3;
                                                i52 = i19;
                                                c11917v4 = c11917v1;
                                                i53 = i107;
                                                i51 = 3;
                                                i11 = i11;
                                                iM13439S = iM13435O2;
                                                i56 = i16 == true ? 1 : 0;
                                                unsafe3 = unsafe;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                i18 = iM13435O2;
                                                i53 = i107;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i107 = i107;
                                            obj3 = obj3;
                                            c11892m1 = c11892m1;
                                            i34 = i34;
                                            i16 = i35 == true ? 1 : 0;
                                            bArr2 = bArr;
                                            c11917v1 = c11917v0;
                                            if (i61 == 0) {
                                                int iM13435O13 = AbstractC11957g1.m13435O(bArr2, i34, c11917v1);
                                                unsafe6.putObject(obj3, j10, Integer.valueOf(c11917v1.f36200a));
                                                unsafe6.putInt(obj3, j22, i19);
                                                iM13435O2 = iM13435O13;
                                            } else {
                                                iM13435O2 = i34;
                                            }
                                            if (iM13435O2 != i34) {
                                                bArr7 = bArr2;
                                                obj5 = obj3;
                                                i52 = i19;
                                                c11917v4 = c11917v1;
                                                i53 = i107;
                                                i51 = 3;
                                                i11 = i11;
                                                iM13439S = iM13435O2;
                                                i56 = i16 == true ? 1 : 0;
                                                unsafe3 = unsafe;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                i18 = iM13435O2;
                                                i53 = i107;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i107 = i107;
                                            obj3 = obj3;
                                            c11892m1 = c11892m1;
                                            i34 = i34;
                                            i16 = i35 == true ? 1 : 0;
                                            bArr2 = bArr;
                                            c11917v1 = c11917v0;
                                            if (i61 == 1) {
                                                iM13435O2 = i34 + 8;
                                                unsafe6.putObject(obj3, j10, Long.valueOf(AbstractC11957g1.m13441U(i34, bArr2)));
                                                unsafe6.putInt(obj3, j22, i19);
                                            } else {
                                                iM13435O2 = i34;
                                            }
                                            if (iM13435O2 != i34) {
                                                bArr7 = bArr2;
                                                obj5 = obj3;
                                                i52 = i19;
                                                c11917v4 = c11917v1;
                                                i53 = i107;
                                                i51 = 3;
                                                i11 = i11;
                                                iM13439S = iM13435O2;
                                                i56 = i16 == true ? 1 : 0;
                                                unsafe3 = unsafe;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                i18 = iM13435O2;
                                                i53 = i107;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i107 = i107;
                                            obj3 = obj3;
                                            c11892m1 = c11892m1;
                                            i34 = i34;
                                            i16 = i35 == true ? 1 : 0;
                                            bArr2 = bArr;
                                            c11917v1 = c11917v0;
                                            if (i61 == 5) {
                                                iM13435O2 = i34 + 4;
                                                unsafe6.putObject(obj3, j10, Integer.valueOf(AbstractC11957g1.m13454q(i34, bArr2)));
                                                unsafe6.putInt(obj3, j22, i19);
                                            } else {
                                                iM13435O2 = i34;
                                            }
                                            if (iM13435O2 != i34) {
                                                bArr7 = bArr2;
                                                obj5 = obj3;
                                                i52 = i19;
                                                c11917v4 = c11917v1;
                                                i53 = i107;
                                                i51 = 3;
                                                i11 = i11;
                                                iM13439S = iM13435O2;
                                                i56 = i16 == true ? 1 : 0;
                                                unsafe3 = unsafe;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                i18 = iM13435O2;
                                                i53 = i107;
                                            }
                                            break;
                                        case 58:
                                            i107 = i107;
                                            obj3 = obj3;
                                            c11892m1 = c11892m1;
                                            i34 = i34;
                                            i16 = i35 == true ? 1 : 0;
                                            bArr2 = bArr;
                                            c11917v1 = c11917v0;
                                            if (i61 == 0) {
                                                iM13438R = AbstractC11957g1.m13438R(bArr2, i34, c11917v1);
                                                unsafe6.putObject(obj3, j10, Boolean.valueOf(c11917v1.f36201b != 0));
                                                unsafe6.putInt(obj3, j22, i19);
                                                iM13435O2 = iM13438R;
                                            } else {
                                                iM13435O2 = i34;
                                            }
                                            if (iM13435O2 != i34) {
                                                bArr7 = bArr2;
                                                obj5 = obj3;
                                                i52 = i19;
                                                c11917v4 = c11917v1;
                                                i53 = i107;
                                                i51 = 3;
                                                i11 = i11;
                                                iM13439S = iM13435O2;
                                                i56 = i16 == true ? 1 : 0;
                                                unsafe3 = unsafe;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                i18 = iM13435O2;
                                                i53 = i107;
                                            }
                                            break;
                                        case 59:
                                            obj3 = obj3;
                                            c11892m1 = c11892m1;
                                            i34 = i34;
                                            i16 = i35 == true ? 1 : 0;
                                            bArr2 = bArr;
                                            i107 = i107;
                                            c11917v1 = c11917v0;
                                            if (i61 == 2) {
                                                int iM13435O14 = AbstractC11957g1.m13435O(bArr2, i34, c11917v1);
                                                int i108 = c11917v1.f36200a;
                                                if (i108 == 0) {
                                                    unsafe6.putObject(obj3, j10, "");
                                                } else {
                                                    int i109 = iM13435O14 + i108;
                                                    if ((i62 & 536870912) != 0 && !AbstractC11912T1.m13353d(bArr2, iM13435O14, i109)) {
                                                        throw new C11997q1(str);
                                                    }
                                                    unsafe6.putObject(obj3, j10, new String(bArr2, iM13435O14, i108, AbstractC11989o1.f36309a));
                                                    iM13435O14 = i109;
                                                }
                                                unsafe6.putInt(obj3, j22, i19);
                                                iM13435O2 = iM13435O14;
                                            } else {
                                                iM13435O2 = i34;
                                            }
                                            if (iM13435O2 != i34) {
                                                bArr7 = bArr2;
                                                obj5 = obj3;
                                                i52 = i19;
                                                c11917v4 = c11917v1;
                                                i53 = i107;
                                                i51 = 3;
                                                i11 = i11;
                                                iM13439S = iM13435O2;
                                                i56 = i16 == true ? 1 : 0;
                                                unsafe3 = unsafe;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                i18 = iM13435O2;
                                                i53 = i107;
                                            }
                                            break;
                                        case 60:
                                            bArr3 = bArr;
                                            i36 = i107;
                                            i34 = i34;
                                            i16 = i35 == true ? 1 : 0;
                                            c11917v1 = c11917v0;
                                            if (i61 == 2) {
                                                Object objM13236D = m13236D(i19, obj3, i36);
                                                c11892m1 = c11892m1;
                                                int iM13440T2 = AbstractC11957g1.m13440T(objM13236D, m13234B(i36), bArr, i34, i11, c11917v0);
                                                m13250n(i19, obj3, objM13236D, i36);
                                                iM13435O2 = iM13440T2;
                                                bArr2 = bArr3;
                                                obj3 = obj3;
                                                i107 = i36;
                                            } else {
                                                c11892m1 = c11892m1;
                                                i107 = i36;
                                                obj3 = obj3;
                                                bArr2 = bArr3;
                                                iM13435O2 = i34;
                                            }
                                            if (iM13435O2 != i34) {
                                                bArr7 = bArr2;
                                                obj5 = obj3;
                                                i52 = i19;
                                                c11917v4 = c11917v1;
                                                i53 = i107;
                                                i51 = 3;
                                                i11 = i11;
                                                iM13439S = iM13435O2;
                                                i56 = i16 == true ? 1 : 0;
                                                unsafe3 = unsafe;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                i18 = iM13435O2;
                                                i53 = i107;
                                            }
                                            break;
                                        case 61:
                                            bArr3 = bArr;
                                            i36 = i107;
                                            i34 = i34;
                                            i16 = i35 == true ? 1 : 0;
                                            c11917v1 = c11917v0;
                                            if (i61 == 2) {
                                                int iM13443d2 = AbstractC11957g1.m13443d(bArr3, i34, c11917v1);
                                                unsafe6.putObject(obj3, j10, c11917v1.f36202c);
                                                unsafe6.putInt(obj3, j22, i19);
                                                iM13435O2 = iM13443d2;
                                                i107 = i36;
                                                c11892m1 = c11892m1;
                                                bArr2 = bArr3;
                                                if (iM13435O2 != i34) {
                                                    bArr7 = bArr2;
                                                    obj5 = obj3;
                                                    i52 = i19;
                                                    c11917v4 = c11917v1;
                                                    i53 = i107;
                                                    i51 = 3;
                                                    i11 = i11;
                                                    iM13439S = iM13435O2;
                                                    i56 = i16 == true ? 1 : 0;
                                                    unsafe3 = unsafe;
                                                    i55 = i33;
                                                    i54 = i86;
                                                } else {
                                                    i18 = iM13435O2;
                                                    i53 = i107;
                                                }
                                            } else {
                                                i107 = i36;
                                                c11892m1 = c11892m1;
                                                obj3 = obj3;
                                                bArr2 = bArr3;
                                                iM13435O2 = i34;
                                                if (iM13435O2 != i34) {
                                                    bArr7 = bArr2;
                                                    obj5 = obj3;
                                                    i52 = i19;
                                                    c11917v4 = c11917v1;
                                                    i53 = i107;
                                                    i51 = 3;
                                                    i11 = i11;
                                                    iM13439S = iM13435O2;
                                                    i56 = i16 == true ? 1 : 0;
                                                    unsafe3 = unsafe;
                                                    i55 = i33;
                                                    i54 = i86;
                                                } else {
                                                    i18 = iM13435O2;
                                                    i53 = i107;
                                                }
                                            }
                                            break;
                                        case 63:
                                            bArr3 = bArr;
                                            i36 = i107;
                                            c11892m1 = c11892m1;
                                            i34 = i34;
                                            c11917v1 = c11917v0;
                                            if (i61 == 0) {
                                                iM13435O2 = AbstractC11957g1.m13435O(bArr3, i34, c11917v1);
                                                int i110 = c11917v1.f36200a;
                                                InterfaceC11977l1 interfaceC11977l1M13233A3 = m13233A(i36);
                                                if (interfaceC11977l1M13233A3 == null || interfaceC11977l1M13233A3.mo13323a(i110)) {
                                                    c11892m1 = c11892m1;
                                                    i16 = i35 == true ? 1 : 0;
                                                    unsafe6.putObject(obj3, j10, Integer.valueOf(i110));
                                                    unsafe6.putInt(obj3, j22, i19);
                                                } else {
                                                    AbstractC11969j1 abstractC11969j2 = (AbstractC11969j1) obj3;
                                                    C11892M1 c11892m1M13307b2 = abstractC11969j2.zzc;
                                                    c11892m1 = c11892m1;
                                                    if (c11892m1M13307b2 == c11892m1) {
                                                        c11892m1M13307b2 = C11892M1.m13307b();
                                                        abstractC11969j2.zzc = c11892m1M13307b2;
                                                    }
                                                    Long lValueOf = Long.valueOf(i110);
                                                    i16 = i35 == true ? 1 : 0;
                                                    c11892m1M13307b2.m13309c(i16 == true ? 1 : 0, lValueOf);
                                                }
                                                i107 = i36;
                                                c11892m1 = c11892m1;
                                                bArr2 = bArr3;
                                                if (iM13435O2 != i34) {
                                                    bArr7 = bArr2;
                                                    obj5 = obj3;
                                                    i52 = i19;
                                                    c11917v4 = c11917v1;
                                                    i53 = i107;
                                                    i51 = 3;
                                                    i11 = i11;
                                                    iM13439S = iM13435O2;
                                                    i56 = i16 == true ? 1 : 0;
                                                    unsafe3 = unsafe;
                                                    i55 = i33;
                                                    i54 = i86;
                                                } else {
                                                    i18 = iM13435O2;
                                                    i53 = i107;
                                                }
                                            } else {
                                                i16 = i35 == true ? 1 : 0;
                                                i107 = i36;
                                                obj3 = obj3;
                                                bArr2 = bArr3;
                                                iM13435O2 = i34;
                                                if (iM13435O2 != i34) {
                                                    bArr7 = bArr2;
                                                    obj5 = obj3;
                                                    i52 = i19;
                                                    c11917v4 = c11917v1;
                                                    i53 = i107;
                                                    i51 = 3;
                                                    i11 = i11;
                                                    iM13439S = iM13435O2;
                                                    i56 = i16 == true ? 1 : 0;
                                                    unsafe3 = unsafe;
                                                    i55 = i33;
                                                    i54 = i86;
                                                } else {
                                                    i18 = iM13435O2;
                                                    i53 = i107;
                                                }
                                            }
                                            break;
                                        case 66:
                                            bArr3 = bArr;
                                            i37 = i107;
                                            c11892m1 = c11892m1;
                                            i34 = i34;
                                            i38 = i35 == true ? 1 : 0;
                                            c11917v1 = c11917v0;
                                            if (i61 == 0) {
                                                iM13435O2 = AbstractC11957g1.m13435O(bArr3, i34, c11917v1);
                                                unsafe6.putObject(obj3, j10, Integer.valueOf(AbstractC11957g1.m13453p(c11917v1.f36200a)));
                                                unsafe6.putInt(obj3, j22, i19);
                                                i107 = i37;
                                                i16 = i38;
                                                bArr2 = bArr3;
                                                if (iM13435O2 != i34) {
                                                    bArr7 = bArr2;
                                                    obj5 = obj3;
                                                    i52 = i19;
                                                    c11917v4 = c11917v1;
                                                    i53 = i107;
                                                    i51 = 3;
                                                    i11 = i11;
                                                    iM13439S = iM13435O2;
                                                    i56 = i16 == true ? 1 : 0;
                                                    unsafe3 = unsafe;
                                                    i55 = i33;
                                                    i54 = i86;
                                                } else {
                                                    i18 = iM13435O2;
                                                    i53 = i107;
                                                }
                                            } else {
                                                i107 = i37;
                                                i16 = i38;
                                                obj3 = obj3;
                                                bArr2 = bArr3;
                                                iM13435O2 = i34;
                                                if (iM13435O2 != i34) {
                                                    bArr7 = bArr2;
                                                    obj5 = obj3;
                                                    i52 = i19;
                                                    c11917v4 = c11917v1;
                                                    i53 = i107;
                                                    i51 = 3;
                                                    i11 = i11;
                                                    iM13439S = iM13435O2;
                                                    i56 = i16 == true ? 1 : 0;
                                                    unsafe3 = unsafe;
                                                    i55 = i33;
                                                    i54 = i86;
                                                } else {
                                                    i18 = iM13435O2;
                                                    i53 = i107;
                                                }
                                            }
                                            break;
                                        case 67:
                                            bArr3 = bArr;
                                            i37 = i107;
                                            i34 = i34;
                                            i38 = i35 == true ? 1 : 0;
                                            if (i61 == 0) {
                                                c11917v1 = c11917v0;
                                                iM13435O2 = AbstractC11957g1.m13438R(bArr3, i34, c11917v1);
                                                c11892m1 = c11892m1;
                                                unsafe6.putObject(obj3, j10, Long.valueOf(AbstractC11957g1.m13459x(c11917v1.f36201b)));
                                                unsafe6.putInt(obj3, j22, i19);
                                                i107 = i37;
                                                i16 = i38;
                                                bArr2 = bArr3;
                                                if (iM13435O2 != i34) {
                                                    bArr7 = bArr2;
                                                    obj5 = obj3;
                                                    i52 = i19;
                                                    c11917v4 = c11917v1;
                                                    i53 = i107;
                                                    i51 = 3;
                                                    i11 = i11;
                                                    iM13439S = iM13435O2;
                                                    i56 = i16 == true ? 1 : 0;
                                                    unsafe3 = unsafe;
                                                    i55 = i33;
                                                    i54 = i86;
                                                } else {
                                                    i18 = iM13435O2;
                                                    i53 = i107;
                                                }
                                            } else {
                                                c11917v1 = c11917v0;
                                                i107 = i37;
                                                c11892m1 = c11892m1;
                                                i16 = i38;
                                                obj3 = obj3;
                                                bArr2 = bArr3;
                                                iM13435O2 = i34;
                                                if (iM13435O2 != i34) {
                                                    bArr7 = bArr2;
                                                    obj5 = obj3;
                                                    i52 = i19;
                                                    c11917v4 = c11917v1;
                                                    i53 = i107;
                                                    i51 = 3;
                                                    i11 = i11;
                                                    iM13439S = iM13435O2;
                                                    i56 = i16 == true ? 1 : 0;
                                                    unsafe3 = unsafe;
                                                    i55 = i33;
                                                    i54 = i86;
                                                } else {
                                                    i18 = iM13435O2;
                                                    i53 = i107;
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (i61 == 3) {
                                                int i111 = ((i35 == true ? 1 : 0) & (-8)) | 4;
                                                Object objM13236D2 = m13236D(i19, obj3, i107);
                                                bArr3 = bArr;
                                                i34 = i34;
                                                int iM13439S2 = AbstractC11957g1.m13439S(objM13236D2, m13234B(i107), bArr, i34, i11, i111, c11917v0);
                                                m13250n(i19, obj3, objM13236D2, i107);
                                                c11917v1 = c11917v0;
                                                i107 = i107;
                                                iM13435O2 = iM13439S2;
                                                c11892m1 = c11892m1;
                                                i16 = i35 == true ? 1 : 0;
                                                i19 = i19;
                                                bArr2 = bArr3;
                                                if (iM13435O2 != i34) {
                                                    bArr7 = bArr2;
                                                    obj5 = obj3;
                                                    i52 = i19;
                                                    c11917v4 = c11917v1;
                                                    i53 = i107;
                                                    i51 = 3;
                                                    i11 = i11;
                                                    iM13439S = iM13435O2;
                                                    i56 = i16 == true ? 1 : 0;
                                                    unsafe3 = unsafe;
                                                    i55 = i33;
                                                    i54 = i86;
                                                } else {
                                                    i18 = iM13435O2;
                                                    i53 = i107;
                                                }
                                            } else {
                                                i16 = i35 == true ? 1 : 0;
                                                bArr2 = bArr;
                                                c11917v1 = c11917v0;
                                                iM13435O2 = i34;
                                                if (iM13435O2 != i34) {
                                                    bArr7 = bArr2;
                                                    obj5 = obj3;
                                                    i52 = i19;
                                                    c11917v4 = c11917v1;
                                                    i53 = i107;
                                                    i51 = 3;
                                                    i11 = i11;
                                                    iM13439S = iM13435O2;
                                                    i56 = i16 == true ? 1 : 0;
                                                    unsafe3 = unsafe;
                                                    i55 = i33;
                                                    i54 = i86;
                                                } else {
                                                    i18 = iM13435O2;
                                                    i53 = i107;
                                                }
                                            }
                                            break;
                                        default:
                                            i16 = i35 == true ? 1 : 0;
                                            bArr2 = bArr;
                                            c11917v1 = c11917v0;
                                            iM13435O2 = i34;
                                            if (iM13435O2 != i34) {
                                                bArr7 = bArr2;
                                                obj5 = obj3;
                                                i52 = i19;
                                                c11917v4 = c11917v1;
                                                i53 = i107;
                                                i51 = 3;
                                                i11 = i11;
                                                iM13439S = iM13435O2;
                                                i56 = i16 == true ? 1 : 0;
                                                unsafe3 = unsafe;
                                                i55 = i33;
                                                i54 = i86;
                                            } else {
                                                i18 = iM13435O2;
                                                i53 = i107;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i61 == 2) {
                                        Unsafe unsafe7 = f36100k;
                                        int i112 = i32 / 3;
                                        Object obj6 = objArr[i112 + i112];
                                        Object object = unsafe7.getObject(obj, j10);
                                        if (!((C12025x1) object).m13561d()) {
                                            C12025x1 c12025x1M13559b = C12025x1.m13557a().m13559b();
                                            C11961h1.m13466c(c12025x1M13559b, object);
                                            unsafe7.putObject(obj, j10, c12025x1M13559b);
                                        }
                                        AbstractC0168G.m507B(obj6);
                                        throw null;
                                    }
                                    obj4 = obj;
                                    c11917v3 = c11917v6;
                                }
                                i55 = i33;
                                i54 = i86;
                            }
                        } else if (i61 == 2) {
                            AbstractC11911T0 abstractC11911T11 = (AbstractC11911T0) ((InterfaceC11985n1) unsafe4.getObject(obj5, j10));
                            boolean zM13349j = abstractC11911T11.m13349j();
                            AbstractC11911T0 abstractC11911T12 = abstractC11911T11;
                            if (!zM13349j) {
                                int size3 = abstractC11911T11.size();
                                InterfaceC11985n1 interfaceC11985n1Mo13266e2 = abstractC11911T11.mo13266e(size3 == 0 ? 10 : size3 + size3);
                                unsafe4.putObject(obj5, j10, interfaceC11985n1Mo13266e2);
                                abstractC11911T12 = interfaceC11985n1Mo13266e2;
                            }
                            iM13439S = AbstractC11957g1.m13429E(this.m13234B(i85), i63 == true ? 1 : 0, bArr, i87, i11, abstractC11911T12, c11917v0);
                            bArr7 = bArr;
                            unsafe3 = unsafe4;
                            i51 = 3;
                            c11917v4 = c11917v5;
                            i53 = i85;
                            i54 = i86;
                            i55 = i84;
                            i52 = i83;
                            i56 = i63 == true ? 1 : 0;
                            i11 = i11;
                        } else {
                            c11917v3 = c11917v5;
                            i32 = i85;
                            unsafe = unsafe4;
                            i33 = i84;
                            c11892m1 = c11892m3;
                            i19 = i83;
                            i34 = i87;
                            i35 = i63 == true ? 1 : 0;
                            obj4 = obj5;
                            objArr = objArr;
                        }
                        i53 = i32;
                        obj3 = obj4;
                        c11892m1 = c11892m1;
                        i18 = i34;
                        i16 = i35;
                        c11917v1 = c11917v3;
                        i55 = i33;
                        i54 = i86;
                    }
                }
                if (i16 != i12 || i12 == 0) {
                    AbstractC11969j1 abstractC11969j3 = (AbstractC11969j1) obj3;
                    C11892M1 c11892m1M13307b3 = abstractC11969j3.zzc;
                    if (c11892m1M13307b3 == c11892m1) {
                        c11892m1M13307b3 = C11892M1.m13307b();
                        abstractC11969j3.zzc = c11892m1M13307b3;
                    }
                    int i113 = i18;
                    Object obj7 = obj3;
                    int iM13434M = AbstractC11957g1.m13434M(i16 == true ? 1 : 0 ? 1 : 0, bArr, i113, i11, c11892m1M13307b3, c11917v0);
                    bArr7 = bArr;
                    i12 = i12;
                    i11 = i11;
                    i56 = i16 == true ? 1 : 0;
                    c11917v4 = c11917v1;
                    unsafe3 = unsafe;
                    obj5 = obj7;
                    i52 = i19;
                    this = this;
                    iM13439S = iM13434M;
                    i51 = 3;
                } else {
                    i13 = i11;
                    iM13439S = i18;
                    obj2 = obj3;
                    i15 = i54;
                    i14 = i55;
                }
            } else {
                i13 = i11;
                obj2 = obj5;
                objArr = objArr2;
                unsafe = unsafe3;
                iArr = iArr2;
                i12 = i12;
                i14 = i55;
                i15 = i54;
                i16 = i56;
            }
        }
        if (i15 != 1048575) {
            unsafe.putInt(obj2, i15, i14);
        }
        for (int i114 = this.f36107g; i114 < this.f36108h; i114++) {
            int i115 = this.f36106f[i114];
            int i116 = iArr[i115];
            Object objM13332i = AbstractC11906R1.m13332i(m13257y(i115) & 1048575, obj2);
            if (objM13332i != null && m13233A(i115) != null) {
                int i117 = i115 / 3;
                AbstractC0168G.m507B(objArr[i117 + i117]);
                throw null;
            }
        }
        if (i12 == 0) {
            if (iM13439S != i13) {
                throw new C11997q1("Failed to parse the message.");
            }
        } else if (iM13439S > i13 || i16 != i12) {
            throw new C11997q1("Failed to parse the message.");
        }
        return iM13439S;
    }

    /* JADX INFO: renamed from: w */
    public final int m13256w(int i10, int i11) {
        int[] iArr = this.f36101a;
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

    /* JADX INFO: renamed from: y */
    public final int m13257y(int i10) {
        return this.f36101a[i10 + 1];
    }
}
