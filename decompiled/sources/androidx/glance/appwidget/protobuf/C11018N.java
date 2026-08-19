package androidx.glance.appwidget.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.google.protobuf.C12178o0;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import livekit.LivekitInternal$NodeStats;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p030B2.AbstractC0754e0;
import p370P0.C6277D;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.N */
/* JADX INFO: loaded from: classes.dex */
public final class C11018N implements InterfaceC11026W {

    /* JADX INFO: renamed from: n */
    public static final int[] f33246n = new int[0];

    /* JADX INFO: renamed from: o */
    public static final Unsafe f33247o = AbstractC11041f0.m12012i();

    /* JADX INFO: renamed from: a */
    public final int[] f33248a;

    /* JADX INFO: renamed from: b */
    public final Object[] f33249b;

    /* JADX INFO: renamed from: c */
    public final int f33250c;

    /* JADX INFO: renamed from: d */
    public final int f33251d;

    /* JADX INFO: renamed from: e */
    public final AbstractC11030a f33252e;

    /* JADX INFO: renamed from: f */
    public final boolean f33253f;

    /* JADX INFO: renamed from: g */
    public final int[] f33254g;

    /* JADX INFO: renamed from: h */
    public final int f33255h;

    /* JADX INFO: renamed from: i */
    public final int f33256i;

    /* JADX INFO: renamed from: j */
    public final C11020P f33257j;

    /* JADX INFO: renamed from: k */
    public final C11008D f33258k;

    /* JADX INFO: renamed from: l */
    public final C11031a0 f33259l;

    /* JADX INFO: renamed from: m */
    public final C11014J f33260m;

    public C11018N(int[] iArr, Object[] objArr, int i10, int i11, AbstractC11030a abstractC11030a, int[] iArr2, int i12, int i13, C11020P c11020p, C11008D c11008d, C11031a0 c11031a0, C11052n c11052n, C11014J c11014j) {
        this.f33248a = iArr;
        this.f33249b = objArr;
        this.f33250c = i10;
        this.f33251d = i11;
        this.f33253f = abstractC11030a instanceof AbstractC11059u;
        this.f33254g = iArr2;
        this.f33255h = i12;
        this.f33256i = i13;
        this.f33257j = c11020p;
        this.f33258k = c11008d;
        this.f33259l = c11031a0;
        this.f33252e = abstractC11030a;
        this.f33260m = c11014j;
    }

    /* JADX INFO: renamed from: A */
    public static long m11879A(long j10, Object obj) {
        return ((Long) AbstractC11041f0.f33295c.m11996h(j10, obj)).longValue();
    }

    /* JADX INFO: renamed from: G */
    public static Field m11880G(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
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

    /* JADX INFO: renamed from: L */
    public static int m11881L(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m11882p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC11059u) {
            return ((AbstractC11059u) obj).m12102h();
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public static C11018N m11883x(C11025V c11025v, C11020P c11020p, C11008D c11008d, C11031a0 c11031a0, C11052n c11052n, C11014J c11014j) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
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
        int i26;
        int i27;
        int iObjectFieldOffset;
        int i28;
        int i29;
        int iObjectFieldOffset2;
        int iObjectFieldOffset3;
        Field fieldM11880G;
        int i30;
        char cCharAt9;
        int i31;
        int i32;
        Field fieldM11880G2;
        Field fieldM11880G3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        String strM11924c = c11025v.m11924c();
        int length = strM11924c.length();
        int i37 = 55296;
        if (strM11924c.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i10 = i38 + 1;
                if (strM11924c.charAt(i38) < 55296) {
                    break;
                }
                i38 = i10;
            }
        } else {
            i10 = 1;
        }
        int i39 = i10 + 1;
        int iCharAt3 = strM11924c.charAt(i10);
        if (iCharAt3 >= 55296) {
            int i40 = iCharAt3 & 8191;
            int i41 = 13;
            while (true) {
                i36 = i39 + 1;
                cCharAt13 = strM11924c.charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i36;
            }
            iCharAt3 = i40 | (cCharAt13 << i41);
            i39 = i36;
        }
        if (iCharAt3 == 0) {
            i13 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i12 = 0;
            i15 = 0;
            i14 = 0;
            iArr = f33246n;
            i11 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt4 = strM11924c.charAt(i39);
            if (iCharAt4 >= 55296) {
                int i43 = iCharAt4 & 8191;
                int i44 = 13;
                while (true) {
                    i23 = i42 + 1;
                    cCharAt8 = strM11924c.charAt(i42);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i23;
                }
                iCharAt4 = i43 | (cCharAt8 << i44);
                i42 = i23;
            }
            int i45 = i42 + 1;
            int iCharAt5 = strM11924c.charAt(i42);
            if (iCharAt5 >= 55296) {
                int i46 = iCharAt5 & 8191;
                int i47 = 13;
                while (true) {
                    i22 = i45 + 1;
                    cCharAt7 = strM11924c.charAt(i45);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i22;
                }
                iCharAt5 = i46 | (cCharAt7 << i47);
                i45 = i22;
            }
            int i48 = i45 + 1;
            int iCharAt6 = strM11924c.charAt(i45);
            if (iCharAt6 >= 55296) {
                int i49 = iCharAt6 & 8191;
                int i50 = 13;
                while (true) {
                    i21 = i48 + 1;
                    cCharAt6 = strM11924c.charAt(i48);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i21;
                }
                iCharAt6 = i49 | (cCharAt6 << i50);
                i48 = i21;
            }
            int i51 = i48 + 1;
            int iCharAt7 = strM11924c.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i20 = i51 + 1;
                    cCharAt5 = strM11924c.charAt(i51);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i20;
                }
                iCharAt7 = i52 | (cCharAt5 << i53);
                i51 = i20;
            }
            int i54 = i51 + 1;
            iCharAt = strM11924c.charAt(i51);
            if (iCharAt >= 55296) {
                int i55 = iCharAt & 8191;
                int i56 = 13;
                while (true) {
                    i19 = i54 + 1;
                    cCharAt4 = strM11924c.charAt(i54);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i19;
                }
                iCharAt = i55 | (cCharAt4 << i56);
                i54 = i19;
            }
            int i57 = i54 + 1;
            iCharAt2 = strM11924c.charAt(i54);
            if (iCharAt2 >= 55296) {
                int i58 = iCharAt2 & 8191;
                int i59 = 13;
                while (true) {
                    i18 = i57 + 1;
                    cCharAt3 = strM11924c.charAt(i57);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i18;
                }
                iCharAt2 = i58 | (cCharAt3 << i59);
                i57 = i18;
            }
            int i60 = i57 + 1;
            int iCharAt8 = strM11924c.charAt(i57);
            if (iCharAt8 >= 55296) {
                int i61 = iCharAt8 & 8191;
                int i62 = 13;
                while (true) {
                    i17 = i60 + 1;
                    cCharAt2 = strM11924c.charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i17;
                }
                iCharAt8 = i61 | (cCharAt2 << i62);
                i60 = i17;
            }
            int i63 = i60 + 1;
            int iCharAt9 = strM11924c.charAt(i60);
            if (iCharAt9 >= 55296) {
                int i64 = iCharAt9 & 8191;
                int i65 = 13;
                while (true) {
                    i16 = i63 + 1;
                    cCharAt = strM11924c.charAt(i63);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i63 = i16;
                }
                iCharAt9 = i64 | (cCharAt << i65);
                i63 = i16;
            }
            int i66 = (iCharAt4 * 2) + iCharAt5;
            i11 = iCharAt4;
            i39 = i63;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i12 = iCharAt6;
            i13 = i66;
            i14 = iCharAt9;
            i15 = iCharAt7;
        }
        Unsafe unsafe = f33247o;
        Object[] objArrM11923b = c11025v.m11923b();
        Class<?> cls = c11025v.m11922a().getClass();
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i67 = i14 + iCharAt2;
        int i68 = i14;
        int i69 = i67;
        int i70 = 0;
        int i71 = 0;
        while (i39 < length) {
            int i72 = i39 + 1;
            int iCharAt10 = strM11924c.charAt(i39);
            if (iCharAt10 >= i37) {
                int i73 = iCharAt10 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i35 = i74 + 1;
                    cCharAt12 = strM11924c.charAt(i74);
                    i24 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i73 |= (cCharAt12 & 8191) << i75;
                    i75 += 13;
                    i74 = i35;
                    length = i24;
                }
                iCharAt10 = i73 | (cCharAt12 << i75);
                i25 = i35;
            } else {
                i24 = length;
                i25 = i72;
            }
            int i76 = i25 + 1;
            int iCharAt11 = strM11924c.charAt(i25);
            if (iCharAt11 >= 55296) {
                int i77 = iCharAt11 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i34 = i78 + 1;
                    cCharAt11 = strM11924c.charAt(i78);
                    i26 = i14;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i77 |= (cCharAt11 & 8191) << i79;
                    i79 += 13;
                    i78 = i34;
                    i14 = i26;
                }
                iCharAt11 = i77 | (cCharAt11 << i79);
                i27 = i34;
            } else {
                i26 = i14;
                i27 = i76;
            }
            int i80 = iCharAt11 & 255;
            int i81 = i15;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i71] = i70;
                i71++;
            }
            if (i80 >= 51) {
                int i82 = i27 + 1;
                int iCharAt12 = strM11924c.charAt(i27);
                char c9 = 55296;
                if (iCharAt12 >= 55296) {
                    int i83 = iCharAt12 & 8191;
                    int i84 = 13;
                    while (true) {
                        i33 = i82 + 1;
                        cCharAt10 = strM11924c.charAt(i82);
                        if (cCharAt10 < c9) {
                            break;
                        }
                        i83 |= (cCharAt10 & 8191) << i84;
                        i84 += 13;
                        i82 = i33;
                        c9 = 55296;
                    }
                    iCharAt12 = i83 | (cCharAt10 << i84);
                    i82 = i33;
                }
                int i85 = i80 - 51;
                int i86 = i82;
                if (i85 == 9 || i85 == 17) {
                    i32 = 2;
                    objArr[AbstractC10763a.m11068z(i70, 3, 2, 1)] = objArrM11923b[i13];
                    i13++;
                } else if (i85 != 12) {
                    i32 = 2;
                } else if (AbstractC0010F.m17a(c11025v.m11925d(), 1) || (iCharAt11 & 2048) != 0) {
                    i32 = 2;
                    objArr[AbstractC10763a.m11068z(i70, 3, 2, 1)] = objArrM11923b[i13];
                    i13++;
                } else {
                    i32 = 2;
                }
                int i87 = iCharAt12 * i32;
                Object obj = objArrM11923b[i87];
                if (obj instanceof Field) {
                    fieldM11880G2 = (Field) obj;
                } else {
                    fieldM11880G2 = m11880G(cls, (String) obj);
                    objArrM11923b[i87] = fieldM11880G2;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM11880G2);
                int i88 = i87 + 1;
                Object obj2 = objArrM11923b[i88];
                if (obj2 instanceof Field) {
                    fieldM11880G3 = (Field) obj2;
                } else {
                    fieldM11880G3 = m11880G(cls, (String) obj2);
                    objArrM11923b[i88] = fieldM11880G3;
                }
                iCharAt10 = iCharAt10;
                iArr2 = iArr2;
                iArr = iArr;
                i39 = i86;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM11880G3);
                i29 = 0;
            } else {
                i12 = i12;
                int i89 = i13 + 1;
                Field fieldM11880G4 = m11880G(cls, (String) objArrM11923b[i13]);
                if (i80 == 9 || i80 == 17) {
                    iCharAt10 = iCharAt10;
                    iArr2 = iArr2;
                    objArr[AbstractC10763a.m11068z(i70, 3, 2, 1)] = fieldM11880G4.getType();
                } else {
                    if (i80 == 27 || i80 == 49) {
                        iCharAt10 = iCharAt10;
                        i31 = i13 + 2;
                        objArr[AbstractC10763a.m11068z(i70, 3, 2, 1)] = objArrM11923b[i89];
                    } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                        iCharAt10 = iCharAt10;
                        if (c11025v.m11925d() == 1 || (iCharAt11 & 2048) != 0) {
                            i31 = i13 + 2;
                            objArr[AbstractC10763a.m11068z(i70, 3, 2, 1)] = objArrM11923b[i89];
                        } else {
                            iArr2 = iArr2;
                        }
                    } else if (i80 == 50) {
                        int i90 = i68 + 1;
                        iArr[i68] = i70;
                        int i91 = (i70 / 3) * 2;
                        int i92 = i13 + 2;
                        objArr[i91] = objArrM11923b[i89];
                        if ((iCharAt11 & 2048) != 0) {
                            i89 = i13 + 3;
                            objArr[i91 + 1] = objArrM11923b[i92];
                            i68 = i90;
                        } else {
                            i68 = i90;
                            i89 = i92;
                        }
                    }
                    i89 = i31;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM11880G4);
                if ((iCharAt11 & 4096) == 0 || i80 > 17) {
                    iObjectFieldOffset = 1048575;
                    i28 = i27;
                    i29 = 0;
                } else {
                    i28 = i27 + 1;
                    int iCharAt13 = strM11924c.charAt(i27);
                    if (iCharAt13 >= 55296) {
                        int i93 = iCharAt13 & 8191;
                        int i94 = 13;
                        while (true) {
                            i30 = i28 + 1;
                            cCharAt9 = strM11924c.charAt(i28);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i93 |= (cCharAt9 & 8191) << i94;
                            i94 += 13;
                            i28 = i30;
                        }
                        iCharAt13 = i93 | (cCharAt9 << i94);
                        i28 = i30;
                    }
                    int i95 = (iCharAt13 / 32) + (i11 * 2);
                    Object obj3 = objArrM11923b[i95];
                    if (obj3 instanceof Field) {
                        fieldM11880G = (Field) obj3;
                    } else {
                        fieldM11880G = m11880G(cls, (String) obj3);
                        objArrM11923b[i95] = fieldM11880G;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM11880G);
                    i29 = iCharAt13 % 32;
                }
                if (i80 >= 18 && i80 <= 49) {
                    iArr[i69] = iObjectFieldOffset4;
                    i69++;
                }
                iObjectFieldOffset2 = iObjectFieldOffset;
                i39 = i28;
                i13 = i89;
                iObjectFieldOffset3 = iObjectFieldOffset4;
            }
            int i96 = i70 + 1;
            iArr2[i70] = iCharAt10;
            int i97 = i70 + 2;
            String str = strM11924c;
            iArr2[i96] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i80 << 20) | iObjectFieldOffset3;
            i70 += 3;
            iArr2[i97] = (i29 << 20) | iObjectFieldOffset2;
            iArr2 = iArr2;
            i15 = i81;
            iArr = iArr;
            i71 = i71;
            length = i24;
            i14 = i26;
            strM11924c = str;
            i12 = i12;
            i37 = 55296;
        }
        return new C11018N(iArr2, objArr, i12, i15, c11025v.m11922a(), iArr, i14, i67, c11020p, c11008d, c11031a0, c11052n, c11014j);
    }

    /* JADX INFO: renamed from: y */
    public static long m11884y(int i10) {
        return i10 & 1048575;
    }

    /* JADX INFO: renamed from: z */
    public static int m11885z(long j10, Object obj) {
        return ((Integer) AbstractC11041f0.f33295c.m11996h(j10, obj)).intValue();
    }

    /* JADX INFO: renamed from: B */
    public final int m11886B(int i10) {
        if (i10 < this.f33250c || i10 > this.f33251d) {
            return -1;
        }
        int[] iArr = this.f33248a;
        int length = (iArr.length / 3) - 1;
        int i11 = 0;
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

    /* JADX INFO: renamed from: C */
    public final void m11887C(Object obj, long j10, C6277D c6277d, InterfaceC11026W interfaceC11026W, C11051m c11051m) throws C11064z {
        int iMo1636z;
        this.f33258k.getClass();
        InterfaceC11062x interfaceC11062xM11850b = C11008D.m11850b(j10, obj);
        int i10 = c6277d.f20382b;
        if ((i10 & 7) != 3) {
            throw C11005A.m11844b();
        }
        do {
            AbstractC11059u abstractC11059uMo11899c = interfaceC11026W.mo11899c();
            c6277d.m6802f(abstractC11059uMo11899c, interfaceC11026W, c11051m);
            interfaceC11026W.mo11897a(abstractC11059uMo11899c);
            interfaceC11062xM11850b.add(abstractC11059uMo11899c);
            AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) c6277d.f20385e;
            if (abstractC0754e0.mo1614c() || c6277d.f20384d != 0) {
                return;
            } else {
                iMo1636z = abstractC0754e0.mo1636z();
            }
        } while (iMo1636z == i10);
        c6277d.f20384d = iMo1636z;
    }

    /* JADX INFO: renamed from: D */
    public final void m11888D(Object obj, int i10, C6277D c6277d, InterfaceC11026W interfaceC11026W, C11051m c11051m) throws C11005A {
        int iMo1636z;
        this.f33258k.getClass();
        InterfaceC11062x interfaceC11062xM11850b = C11008D.m11850b(i10 & 1048575, obj);
        int i11 = c6277d.f20382b;
        if ((i11 & 7) != 2) {
            throw C11005A.m11844b();
        }
        do {
            AbstractC11059u abstractC11059uMo11899c = interfaceC11026W.mo11899c();
            c6277d.m6806h(abstractC11059uMo11899c, interfaceC11026W, c11051m);
            interfaceC11026W.mo11897a(abstractC11059uMo11899c);
            interfaceC11062xM11850b.add(abstractC11059uMo11899c);
            AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) c6277d.f20385e;
            if (abstractC0754e0.mo1614c() || c6277d.f20384d != 0) {
                return;
            } else {
                iMo1636z = abstractC0754e0.mo1636z();
            }
        } while (iMo1636z == i11);
        c6277d.f20384d = iMo1636z;
    }

    /* JADX INFO: renamed from: E */
    public final void m11889E(int i10, C6277D c6277d, Object obj) throws C11064z, C12178o0 {
        if ((536870912 & i10) != 0) {
            c6277d.m6829s0(2);
            AbstractC11041f0.m12018o(i10 & 1048575, obj, ((AbstractC0754e0) c6277d.f20385e).mo1635y());
        } else if (!this.f33253f) {
            AbstractC11041f0.m12018o(i10 & 1048575, obj, c6277d.m6818n());
        } else {
            c6277d.m6829s0(2);
            AbstractC11041f0.m12018o(i10 & 1048575, obj, ((AbstractC0754e0) c6277d.f20385e).mo1634x());
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m11890F(int i10, C6277D c6277d, Object obj) throws C11064z, C12178o0 {
        boolean z6 = (536870912 & i10) != 0;
        C11008D c11008d = this.f33258k;
        if (z6) {
            c11008d.getClass();
            c6277d.m6805g0(C11008D.m11850b(i10 & 1048575, obj), true);
        } else {
            c11008d.getClass();
            c6277d.m6805g0(C11008D.m11850b(i10 & 1048575, obj), false);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m11891H(int i10, Object obj) {
        int i11 = this.f33248a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        AbstractC11041f0.m12016m(j10, obj, (1 << (i11 >>> 20)) | AbstractC11041f0.f33295c.m11994f(j10, obj));
    }

    /* JADX INFO: renamed from: I */
    public final void m11892I(int i10, Object obj, int i11) {
        AbstractC11041f0.m12016m(this.f33248a[i11 + 2] & 1048575, obj, i10);
    }

    /* JADX INFO: renamed from: J */
    public final void m11893J(Object obj, int i10, AbstractC11030a abstractC11030a) {
        f33247o.putObject(obj, m11895M(i10) & 1048575, abstractC11030a);
        m11891H(i10, obj);
    }

    /* JADX INFO: renamed from: K */
    public final void m11894K(Object obj, int i10, int i11, AbstractC11030a abstractC11030a) {
        f33247o.putObject(obj, m11895M(i11) & 1048575, abstractC11030a);
        m11892I(i10, obj, i11);
    }

    /* JADX INFO: renamed from: M */
    public final int m11895M(int i10) {
        return this.f33248a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: N */
    public final void m11896N(Object obj, C11012H c11012h) {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        boolean z6;
        boolean z10;
        int[] iArr2 = this.f33248a;
        int length = iArr2.length;
        Unsafe unsafe = f33247o;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i16 < length) {
            int iM11895M = m11895M(i16);
            int i17 = iArr2[i16];
            int iM11881L = m11881L(iM11895M);
            if (iM11881L <= 17) {
                int i18 = iArr2[i16 + 2];
                int i19 = i18 & 1048575;
                if (i19 != i14) {
                    i15 = i19 == 1048575 ? 0 : unsafe.getInt(obj, i19);
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
            long j10 = iM11895M & 1048575;
            switch (iM11881L) {
                case 0:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11855c(i17, AbstractC11041f0.f33295c.mo11984d(j10, obj));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 1:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11859g(i17, AbstractC11041f0.f33295c.mo11985e(j10, obj));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 2:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11862j(i17, unsafe.getLong(obj, j10));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 3:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11869q(i17, unsafe.getLong(obj, j10));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 4:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11861i(i17, unsafe.getInt(obj, j10));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 5:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11858f(i17, unsafe.getLong(obj, j10));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 6:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11857e(i17, unsafe.getInt(obj, j10));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 7:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11853a(i17, AbstractC11041f0.f33295c.mo11983c(j10, obj));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 8:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof String) {
                            ((C11048j) c11012h.f33240a).m12078Q(i17, (String) object);
                        } else {
                            c11012h.m11854b(i17, (C11042g) object);
                        }
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 9:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11863k(i17, unsafe.getObject(obj, j10), m11909m(i16));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 10:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11854b(i17, (C11042g) unsafe.getObject(obj, j10));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 11:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11868p(i17, unsafe.getInt(obj, j10));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 12:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11856d(i17, unsafe.getInt(obj, j10));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 13:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11864l(i17, unsafe.getInt(obj, j10));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 14:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11865m(i17, unsafe.getLong(obj, j10));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 15:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11866n(i17, unsafe.getInt(obj, j10));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 16:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11867o(i17, unsafe.getLong(obj, j10));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 17:
                    iArr = iArr2;
                    i13 = length;
                    if (m11911o(obj, i16, i10, i11, i12)) {
                        c11012h.m11860h(i17, unsafe.getObject(obj, j10), m11909m(i16));
                    }
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 18:
                    z6 = false;
                    AbstractC11027X.m11930E(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, false);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 19:
                    z6 = false;
                    AbstractC11027X.m11934I(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, false);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 20:
                    z6 = false;
                    AbstractC11027X.m11937L(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, false);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 21:
                    z6 = false;
                    AbstractC11027X.m11945T(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, false);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 22:
                    z6 = false;
                    AbstractC11027X.m11936K(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, false);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 23:
                    z6 = false;
                    AbstractC11027X.m11933H(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, false);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 24:
                    z6 = false;
                    AbstractC11027X.m11932G(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, false);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 25:
                    z6 = false;
                    AbstractC11027X.m11928C(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, false);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 26:
                    AbstractC11027X.m11943R(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 27:
                    AbstractC11027X.m11938M(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, m11909m(i16));
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 28:
                    AbstractC11027X.m11929D(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 29:
                    z10 = false;
                    AbstractC11027X.m11944S(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, false);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 30:
                    z10 = false;
                    AbstractC11027X.m11931F(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, false);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 31:
                    z10 = false;
                    AbstractC11027X.m11939N(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, false);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 32:
                    z10 = false;
                    AbstractC11027X.m11940O(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, false);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 33:
                    z10 = false;
                    AbstractC11027X.m11941P(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, false);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 34:
                    z10 = false;
                    AbstractC11027X.m11942Q(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, false);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 35:
                    AbstractC11027X.m11930E(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, true);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 36:
                    AbstractC11027X.m11934I(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, true);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 37:
                    AbstractC11027X.m11937L(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, true);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 38:
                    AbstractC11027X.m11945T(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, true);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 39:
                    AbstractC11027X.m11936K(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, true);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 40:
                    AbstractC11027X.m11933H(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, true);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 41:
                    AbstractC11027X.m11932G(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, true);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 42:
                    AbstractC11027X.m11928C(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, true);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 43:
                    AbstractC11027X.m11944S(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, true);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 44:
                    AbstractC11027X.m11931F(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, true);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 45:
                    AbstractC11027X.m11939N(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, true);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 46:
                    AbstractC11027X.m11940O(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, true);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 47:
                    AbstractC11027X.m11941P(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, true);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                    AbstractC11027X.m11942Q(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, true);
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                    AbstractC11027X.m11935J(iArr2[i16], (List) unsafe.getObject(obj, j10), c11012h, m11909m(i16));
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    if (unsafe.getObject(obj, j10) != null) {
                        Object obj2 = this.f33249b[(i16 / 3) * 2];
                        this.f33260m.getClass();
                        AbstractC0168G.m507B(obj2);
                        throw null;
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 51:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11855c(i17, ((Double) AbstractC11041f0.f33295c.m11996h(j10, obj)).doubleValue());
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 52:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11859g(i17, ((Float) AbstractC11041f0.f33295c.m11996h(j10, obj)).floatValue());
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 53:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11862j(i17, m11879A(j10, obj));
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 54:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11869q(i17, m11879A(j10, obj));
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 55:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11861i(i17, m11885z(j10, obj));
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 56:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11858f(i17, m11879A(j10, obj));
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 57:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11857e(i17, m11885z(j10, obj));
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 58:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11853a(i17, ((Boolean) AbstractC11041f0.f33295c.m11996h(j10, obj)).booleanValue());
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 59:
                    if (m11912q(i17, obj, i16)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof String) {
                            ((C11048j) c11012h.f33240a).m12078Q(i17, (String) object2);
                        } else {
                            c11012h.m11854b(i17, (C11042g) object2);
                        }
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 60:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11863k(i17, unsafe.getObject(obj, j10), m11909m(i16));
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 61:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11854b(i17, (C11042g) unsafe.getObject(obj, j10));
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 62:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11868p(i17, m11885z(j10, obj));
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 63:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11856d(i17, m11885z(j10, obj));
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 64:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11864l(i17, m11885z(j10, obj));
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 65:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11865m(i17, m11879A(j10, obj));
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 66:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11866n(i17, m11885z(j10, obj));
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 67:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11867o(i17, m11879A(j10, obj));
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                case 68:
                    if (m11912q(i17, obj, i16)) {
                        c11012h.m11860h(i17, unsafe.getObject(obj, j10), m11909m(i16));
                    }
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
                default:
                    iArr = iArr2;
                    i13 = length;
                    i16 += 3;
                    i14 = i10;
                    iArr2 = iArr;
                    i15 = i11;
                    length = i13;
                    break;
            }
        }
        this.f33259l.getClass();
        ((AbstractC11059u) obj).unknownFields.m11975d(c11012h);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0080 A[SYNTHETIC] */
    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: a */
    public final void mo11897a(Object obj) {
        if (m11882p(obj)) {
            if (obj instanceof AbstractC11059u) {
                AbstractC11059u abstractC11059u = (AbstractC11059u) obj;
                abstractC11059u.m12100c();
                abstractC11059u.m12099b();
                abstractC11059u.m12103i();
            }
            int[] iArr = this.f33248a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iM11895M = m11895M(i10);
                long j10 = 1048575 & iM11895M;
                int iM11881L = m11881L(iM11895M);
                if (iM11881L != 9) {
                    if (iM11881L != 60 && iM11881L != 68) {
                        switch (iM11881L) {
                            case 17:
                                if (m11910n(i10, obj)) {
                                    m11909m(i10).mo11897a(f33247o.getObject(obj, j10));
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
                                this.f33258k.getClass();
                                C11008D.m11849a(j10, obj);
                                break;
                            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                Unsafe unsafe = f33247o;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    this.f33260m.getClass();
                                    C11014J.m11875c(object);
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (m11912q(iArr[i10], obj, i10)) {
                        m11909m(i10).mo11897a(f33247o.getObject(obj, j10));
                    }
                } else if (m11910n(i10, obj)) {
                    m11909m(i10).mo11897a(f33247o.getObject(obj, j10));
                }
            }
            this.f33259l.getClass();
            C11031a0.m11978b(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6 A[LOOP:1: B:45:0x00c5->B:50:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00fc A[SYNTHETIC] */
    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: b */
    public final boolean mo11898b(Object obj) {
        int i10;
        int i11;
        List list;
        InterfaceC11026W interfaceC11026WM11909m;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.f33255h) {
            int i16 = this.f33254g[i15];
            int[] iArr = this.f33248a;
            int i17 = iArr[i16];
            int iM11895M = m11895M(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = f33247o.getInt(obj, i19);
                }
                i11 = i14;
                i10 = i19;
            } else {
                i10 = i13;
                i11 = i14;
            }
            if ((268435456 & iM11895M) != 0 && !m11911o(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iM11881L = m11881L(iM11895M);
            if (iM11881L == 9 || iM11881L == 17) {
                if (m11911o(obj, i16, i10, i11, i20)) {
                    if (!m11909m(i16).mo11898b(AbstractC11041f0.f33295c.m11996h(iM11895M & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iM11881L == 27) {
                list = (List) AbstractC11041f0.f33295c.m11996h(iM11895M & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC11026WM11909m = m11909m(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!interfaceC11026WM11909m.mo11898b(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iM11881L == 60 || iM11881L == 68) {
                if (m11912q(i17, obj, i16)) {
                    if (!m11909m(i16).mo11898b(AbstractC11041f0.f33295c.m11996h(iM11895M & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iM11881L == 49) {
                list = (List) AbstractC11041f0.f33295c.m11996h(iM11895M & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC11026WM11909m = m11909m(i16);
                    while (i12 < list.size()) {
                        if (!interfaceC11026WM11909m.mo11898b(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iM11881L != 50) {
                continue;
            } else {
                Object objM11996h = AbstractC11041f0.f33295c.m11996h(iM11895M & 1048575, obj);
                this.f33260m.getClass();
                if (!((C11013I) objM11996h).isEmpty()) {
                    AbstractC0168G.m507B(this.f33249b[(i16 / 3) * 2]);
                    throw null;
                }
            }
            i15++;
            i13 = i10;
            i14 = i11;
        }
        return true;
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: c */
    public final AbstractC11059u mo11899c() {
        this.f33257j.getClass();
        return ((AbstractC11059u) this.f33252e).m12104j();
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: d */
    public final void mo11900d(Object obj, Object obj2) {
        if (!m11882p(obj)) {
            throw new IllegalArgumentException(AbstractC10763a.m11051i(obj, "Mutating immutable message: "));
        }
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f33248a;
            if (i10 >= iArr.length) {
                AbstractC11027X.m11926A(this.f33259l, obj, obj2);
                return;
            }
            int iM11895M = m11895M(i10);
            long j10 = 1048575 & iM11895M;
            int i11 = iArr[i10];
            switch (m11881L(iM11895M)) {
                case 0:
                    if (m11910n(i10, obj2)) {
                        AbstractC11039e0 abstractC11039e0 = AbstractC11041f0.f33295c;
                        abstractC11039e0.mo11988l(obj, j10, abstractC11039e0.mo11984d(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 1:
                    if (m11910n(i10, obj2)) {
                        AbstractC11039e0 abstractC11039e1 = AbstractC11041f0.f33295c;
                        abstractC11039e1.mo11989m(obj, j10, abstractC11039e1.mo11985e(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 2:
                    if (m11910n(i10, obj2)) {
                        AbstractC11041f0.m12017n(obj, j10, AbstractC11041f0.f33295c.m11995g(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 3:
                    if (m11910n(i10, obj2)) {
                        AbstractC11041f0.m12017n(obj, j10, AbstractC11041f0.f33295c.m11995g(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 4:
                    if (m11910n(i10, obj2)) {
                        AbstractC11041f0.m12016m(j10, obj, AbstractC11041f0.f33295c.m11994f(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 5:
                    if (m11910n(i10, obj2)) {
                        AbstractC11041f0.m12017n(obj, j10, AbstractC11041f0.f33295c.m11995g(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 6:
                    if (m11910n(i10, obj2)) {
                        AbstractC11041f0.m12016m(j10, obj, AbstractC11041f0.f33295c.m11994f(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 7:
                    if (m11910n(i10, obj2)) {
                        AbstractC11039e0 abstractC11039e2 = AbstractC11041f0.f33295c;
                        abstractC11039e2.mo11986j(obj, j10, abstractC11039e2.mo11983c(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 8:
                    if (m11910n(i10, obj2)) {
                        AbstractC11041f0.m12018o(j10, obj, AbstractC11041f0.f33295c.m11996h(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 9:
                    m11915t(obj, i10, obj2);
                    break;
                case 10:
                    if (m11910n(i10, obj2)) {
                        AbstractC11041f0.m12018o(j10, obj, AbstractC11041f0.f33295c.m11996h(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 11:
                    if (m11910n(i10, obj2)) {
                        AbstractC11041f0.m12016m(j10, obj, AbstractC11041f0.f33295c.m11994f(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 12:
                    if (m11910n(i10, obj2)) {
                        AbstractC11041f0.m12016m(j10, obj, AbstractC11041f0.f33295c.m11994f(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 13:
                    if (m11910n(i10, obj2)) {
                        AbstractC11041f0.m12016m(j10, obj, AbstractC11041f0.f33295c.m11994f(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 14:
                    if (m11910n(i10, obj2)) {
                        AbstractC11041f0.m12017n(obj, j10, AbstractC11041f0.f33295c.m11995g(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 15:
                    if (m11910n(i10, obj2)) {
                        AbstractC11041f0.m12016m(j10, obj, AbstractC11041f0.f33295c.m11994f(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 16:
                    if (m11910n(i10, obj2)) {
                        AbstractC11041f0.m12017n(obj, j10, AbstractC11041f0.f33295c.m11995g(j10, obj2));
                        m11891H(i10, obj);
                    }
                    break;
                case 17:
                    m11915t(obj, i10, obj2);
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
                    this.f33258k.getClass();
                    AbstractC11039e0 abstractC11039e3 = AbstractC11041f0.f33295c;
                    InterfaceC11062x interfaceC11062xM11921j = (InterfaceC11062x) abstractC11039e3.m11996h(j10, obj);
                    InterfaceC11062x interfaceC11062x = (InterfaceC11062x) abstractC11039e3.m11996h(j10, obj2);
                    int size = interfaceC11062xM11921j.size();
                    int size2 = interfaceC11062x.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC11032b) interfaceC11062xM11921j).f33285Y) {
                            interfaceC11062xM11921j = ((C11024U) interfaceC11062xM11921j).m11921j(size2 + size);
                        }
                        interfaceC11062xM11921j.addAll(interfaceC11062x);
                    }
                    if (size > 0) {
                        interfaceC11062x = interfaceC11062xM11921j;
                    }
                    AbstractC11041f0.m12018o(j10, obj, interfaceC11062x);
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    Class cls = AbstractC11027X.f33276a;
                    AbstractC11039e0 abstractC11039e4 = AbstractC11041f0.f33295c;
                    Object objM11996h = abstractC11039e4.m11996h(j10, obj);
                    Object objM11996h2 = abstractC11039e4.m11996h(j10, obj2);
                    this.f33260m.getClass();
                    AbstractC11041f0.m12018o(j10, obj, C11014J.m11874b(objM11996h, objM11996h2));
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
                    if (m11912q(i11, obj2, i10)) {
                        AbstractC11041f0.m12018o(j10, obj, AbstractC11041f0.f33295c.m11996h(j10, obj2));
                        m11892I(i11, obj, i10);
                    }
                    break;
                case 60:
                    m11916u(obj, i10, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m11912q(i11, obj2, i10)) {
                        AbstractC11041f0.m12018o(j10, obj, AbstractC11041f0.f33295c.m11996h(j10, obj2));
                        m11892I(i11, obj, i10);
                    }
                    break;
                case 68:
                    m11916u(obj, i10, obj2);
                    break;
            }
            i10 += 3;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: e */
    public final int mo11901e(AbstractC11059u abstractC11059u) {
        int i10;
        int i11;
        int i12;
        int iM12053m;
        int iM12051k;
        int iM11954i;
        int iM12045A;
        int iM12047C;
        Unsafe unsafe = f33247o;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int[] iArr = this.f33248a;
            if (i16 >= iArr.length) {
                this.f33259l.getClass();
                return abstractC11059u.unknownFields.m11973b() + i17;
            }
            int iM11895M = m11895M(i16);
            int iM11881L = m11881L(iM11895M);
            int i18 = iArr[i16];
            int i19 = iArr[i16 + 2];
            int i20 = i19 & i13;
            if (iM11881L <= 17) {
                if (i20 != i14) {
                    i15 = i20 == i13 ? 0 : unsafe.getInt(abstractC11059u, i20);
                    i14 = i20;
                }
                i10 = i14;
                i11 = i15;
                i12 = 1 << (i19 >>> 20);
            } else {
                i10 = i14;
                i11 = i15;
                i12 = 0;
            }
            long j10 = iM11895M & i13;
            if (iM11881L >= EnumC11054p.f33334Z.m12090a()) {
                EnumC11054p.f33335o0.m12090a();
            }
            switch (iM11881L) {
                case 0:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12053m(i18);
                        i17 += iM12053m;
                    }
                    break;
                case 1:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12057q(i18);
                        i17 += iM12053m;
                    }
                    break;
                case 2:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12060t(i18, unsafe.getLong(abstractC11059u, j10));
                        i17 += iM12053m;
                    }
                    break;
                case 3:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12048D(i18, unsafe.getLong(abstractC11059u, j10));
                        i17 += iM12053m;
                    }
                    break;
                case 4:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12059s(i18, unsafe.getInt(abstractC11059u, j10));
                        i17 += iM12053m;
                    }
                    break;
                case 5:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12056p(i18);
                        i17 += iM12053m;
                    }
                    break;
                case 6:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12055o(i18);
                        i17 += iM12053m;
                    }
                    break;
                case 7:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12050j(i18);
                        i17 += iM12053m;
                    }
                    break;
                case 8:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        Object object = unsafe.getObject(abstractC11059u, j10);
                        iM12051k = object instanceof C11042g ? C11048j.m12051k(i18, (C11042g) object) : C11048j.m12065y(i18, (String) object);
                        i17 = iM12051k + i17;
                    }
                    break;
                case 9:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = AbstractC11027X.m11960o(i18, unsafe.getObject(abstractC11059u, j10), m11909m(i16));
                        i17 += iM12053m;
                    }
                    break;
                case 10:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12051k(i18, (C11042g) unsafe.getObject(abstractC11059u, j10));
                        i17 += iM12053m;
                    }
                    break;
                case 11:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12046B(i18, unsafe.getInt(abstractC11059u, j10));
                        i17 += iM12053m;
                    }
                    break;
                case 12:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12054n(i18, unsafe.getInt(abstractC11059u, j10));
                        i17 += iM12053m;
                    }
                    break;
                case 13:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12061u(i18);
                        i17 += iM12053m;
                    }
                    break;
                case 14:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12062v(i18);
                        i17 += iM12053m;
                    }
                    break;
                case 15:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12063w(i18, unsafe.getInt(abstractC11059u, j10));
                        i17 += iM12053m;
                    }
                    break;
                case 16:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12064x(i18, unsafe.getLong(abstractC11059u, j10));
                        i17 += iM12053m;
                    }
                    break;
                case 17:
                    if (m11911o(abstractC11059u, i16, i10, i11, i12)) {
                        iM12053m = C11048j.m12058r(i18, (AbstractC11030a) unsafe.getObject(abstractC11059u, j10), m11909m(i16));
                        i17 += iM12053m;
                    }
                    break;
                case 18:
                    iM12053m = AbstractC11027X.m11953h(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 19:
                    iM12053m = AbstractC11027X.m11951f(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 20:
                    iM12053m = AbstractC11027X.m11958m(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 21:
                    iM12053m = AbstractC11027X.m11969x(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 22:
                    iM12053m = AbstractC11027X.m11956k(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 23:
                    iM12053m = AbstractC11027X.m11953h(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 24:
                    iM12053m = AbstractC11027X.m11951f(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 25:
                    iM12053m = AbstractC11027X.m11946a(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 26:
                    iM12053m = AbstractC11027X.m11966u(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 27:
                    iM12053m = AbstractC11027X.m11961p(i18, (List) unsafe.getObject(abstractC11059u, j10), m11909m(i16));
                    i17 += iM12053m;
                    break;
                case 28:
                    iM12053m = AbstractC11027X.m11948c(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 29:
                    iM12053m = AbstractC11027X.m11967v(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 30:
                    iM12053m = AbstractC11027X.m11949d(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 31:
                    iM12053m = AbstractC11027X.m11951f(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 32:
                    iM12053m = AbstractC11027X.m11953h(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 33:
                    iM12053m = AbstractC11027X.m11962q(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 34:
                    iM12053m = AbstractC11027X.m11964s(i18, (List) unsafe.getObject(abstractC11059u, j10));
                    i17 += iM12053m;
                    break;
                case 35:
                    iM11954i = AbstractC11027X.m11954i((List) unsafe.getObject(abstractC11059u, j10));
                    if (iM11954i > 0) {
                        iM12045A = C11048j.m12045A(i18);
                        iM12047C = C11048j.m12047C(iM11954i);
                        i17 += iM12047C + iM12045A + iM11954i;
                    }
                    break;
                case 36:
                    iM11954i = AbstractC11027X.m11952g((List) unsafe.getObject(abstractC11059u, j10));
                    if (iM11954i > 0) {
                        iM12045A = C11048j.m12045A(i18);
                        iM12047C = C11048j.m12047C(iM11954i);
                        i17 += iM12047C + iM12045A + iM11954i;
                    }
                    break;
                case 37:
                    iM11954i = AbstractC11027X.m11959n((List) unsafe.getObject(abstractC11059u, j10));
                    if (iM11954i > 0) {
                        iM12045A = C11048j.m12045A(i18);
                        iM12047C = C11048j.m12047C(iM11954i);
                        i17 += iM12047C + iM12045A + iM11954i;
                    }
                    break;
                case 38:
                    iM11954i = AbstractC11027X.m11970y((List) unsafe.getObject(abstractC11059u, j10));
                    if (iM11954i > 0) {
                        iM12045A = C11048j.m12045A(i18);
                        iM12047C = C11048j.m12047C(iM11954i);
                        i17 += iM12047C + iM12045A + iM11954i;
                    }
                    break;
                case 39:
                    iM11954i = AbstractC11027X.m11957l((List) unsafe.getObject(abstractC11059u, j10));
                    if (iM11954i > 0) {
                        iM12045A = C11048j.m12045A(i18);
                        iM12047C = C11048j.m12047C(iM11954i);
                        i17 += iM12047C + iM12045A + iM11954i;
                    }
                    break;
                case 40:
                    iM11954i = AbstractC11027X.m11954i((List) unsafe.getObject(abstractC11059u, j10));
                    if (iM11954i > 0) {
                        iM12045A = C11048j.m12045A(i18);
                        iM12047C = C11048j.m12047C(iM11954i);
                        i17 += iM12047C + iM12045A + iM11954i;
                    }
                    break;
                case 41:
                    iM11954i = AbstractC11027X.m11952g((List) unsafe.getObject(abstractC11059u, j10));
                    if (iM11954i > 0) {
                        iM12045A = C11048j.m12045A(i18);
                        iM12047C = C11048j.m12047C(iM11954i);
                        i17 += iM12047C + iM12045A + iM11954i;
                    }
                    break;
                case 42:
                    iM11954i = AbstractC11027X.m11947b((List) unsafe.getObject(abstractC11059u, j10));
                    if (iM11954i > 0) {
                        iM12045A = C11048j.m12045A(i18);
                        iM12047C = C11048j.m12047C(iM11954i);
                        i17 += iM12047C + iM12045A + iM11954i;
                    }
                    break;
                case 43:
                    iM11954i = AbstractC11027X.m11968w((List) unsafe.getObject(abstractC11059u, j10));
                    if (iM11954i > 0) {
                        iM12045A = C11048j.m12045A(i18);
                        iM12047C = C11048j.m12047C(iM11954i);
                        i17 += iM12047C + iM12045A + iM11954i;
                    }
                    break;
                case 44:
                    iM11954i = AbstractC11027X.m11950e((List) unsafe.getObject(abstractC11059u, j10));
                    if (iM11954i > 0) {
                        iM12045A = C11048j.m12045A(i18);
                        iM12047C = C11048j.m12047C(iM11954i);
                        i17 += iM12047C + iM12045A + iM11954i;
                    }
                    break;
                case 45:
                    iM11954i = AbstractC11027X.m11952g((List) unsafe.getObject(abstractC11059u, j10));
                    if (iM11954i > 0) {
                        iM12045A = C11048j.m12045A(i18);
                        iM12047C = C11048j.m12047C(iM11954i);
                        i17 += iM12047C + iM12045A + iM11954i;
                    }
                    break;
                case 46:
                    iM11954i = AbstractC11027X.m11954i((List) unsafe.getObject(abstractC11059u, j10));
                    if (iM11954i > 0) {
                        iM12045A = C11048j.m12045A(i18);
                        iM12047C = C11048j.m12047C(iM11954i);
                        i17 += iM12047C + iM12045A + iM11954i;
                    }
                    break;
                case 47:
                    iM11954i = AbstractC11027X.m11963r((List) unsafe.getObject(abstractC11059u, j10));
                    if (iM11954i > 0) {
                        iM12045A = C11048j.m12045A(i18);
                        iM12047C = C11048j.m12047C(iM11954i);
                        i17 += iM12047C + iM12045A + iM11954i;
                    }
                    break;
                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                    iM11954i = AbstractC11027X.m11965t((List) unsafe.getObject(abstractC11059u, j10));
                    if (iM11954i > 0) {
                        iM12045A = C11048j.m12045A(i18);
                        iM12047C = C11048j.m12047C(iM11954i);
                        i17 += iM12047C + iM12045A + iM11954i;
                    }
                    break;
                case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                    iM12053m = AbstractC11027X.m11955j(i18, (List) unsafe.getObject(abstractC11059u, j10), m11909m(i16));
                    i17 += iM12053m;
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    Object object2 = unsafe.getObject(abstractC11059u, j10);
                    Object obj = this.f33249b[(i16 / 3) * 2];
                    this.f33260m.getClass();
                    C11014J.m11873a(object2, obj);
                    break;
                case 51:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12053m(i18);
                        i17 += iM12053m;
                    }
                    break;
                case 52:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12057q(i18);
                        i17 += iM12053m;
                    }
                    break;
                case 53:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12060t(i18, m11879A(j10, abstractC11059u));
                        i17 += iM12053m;
                    }
                    break;
                case 54:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12048D(i18, m11879A(j10, abstractC11059u));
                        i17 += iM12053m;
                    }
                    break;
                case 55:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12059s(i18, m11885z(j10, abstractC11059u));
                        i17 += iM12053m;
                    }
                    break;
                case 56:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12056p(i18);
                        i17 += iM12053m;
                    }
                    break;
                case 57:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12055o(i18);
                        i17 += iM12053m;
                    }
                    break;
                case 58:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12050j(i18);
                        i17 += iM12053m;
                    }
                    break;
                case 59:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        Object object3 = unsafe.getObject(abstractC11059u, j10);
                        iM12051k = object3 instanceof C11042g ? C11048j.m12051k(i18, (C11042g) object3) : C11048j.m12065y(i18, (String) object3);
                        i17 = iM12051k + i17;
                    }
                    break;
                case 60:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = AbstractC11027X.m11960o(i18, unsafe.getObject(abstractC11059u, j10), m11909m(i16));
                        i17 += iM12053m;
                    }
                    break;
                case 61:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12051k(i18, (C11042g) unsafe.getObject(abstractC11059u, j10));
                        i17 += iM12053m;
                    }
                    break;
                case 62:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12046B(i18, m11885z(j10, abstractC11059u));
                        i17 += iM12053m;
                    }
                    break;
                case 63:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12054n(i18, m11885z(j10, abstractC11059u));
                        i17 += iM12053m;
                    }
                    break;
                case 64:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12061u(i18);
                        i17 += iM12053m;
                    }
                    break;
                case 65:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12062v(i18);
                        i17 += iM12053m;
                    }
                    break;
                case 66:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12063w(i18, m11885z(j10, abstractC11059u));
                        i17 += iM12053m;
                    }
                    break;
                case 67:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12064x(i18, m11879A(j10, abstractC11059u));
                        i17 += iM12053m;
                    }
                    break;
                case 68:
                    if (m11912q(i18, abstractC11059u, i16)) {
                        iM12053m = C11048j.m12058r(i18, (AbstractC11030a) unsafe.getObject(abstractC11059u, j10), m11909m(i16));
                        i17 += iM12053m;
                    }
                    break;
            }
            i16 += 3;
            i14 = i10;
            i15 = i11;
            i13 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: f */
    public final int mo11902f(AbstractC11059u abstractC11059u) {
        int i10;
        int iM12107b;
        int i11;
        int[] iArr = this.f33248a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iM11895M = m11895M(i13);
            int i14 = iArr[i13];
            long j10 = 1048575 & iM11895M;
            int i15 = 1237;
            int iHashCode = 37;
            switch (m11881L(iM11895M)) {
                case 0:
                    i10 = i12 * 53;
                    iM12107b = AbstractC11063y.m12107b(Double.doubleToLongBits(AbstractC11041f0.f33295c.mo11984d(j10, abstractC11059u)));
                    i12 = iM12107b + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iM12107b = Float.floatToIntBits(AbstractC11041f0.f33295c.mo11985e(j10, abstractC11059u));
                    i12 = iM12107b + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iM12107b = AbstractC11063y.m12107b(AbstractC11041f0.f33295c.m11995g(j10, abstractC11059u));
                    i12 = iM12107b + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iM12107b = AbstractC11063y.m12107b(AbstractC11041f0.f33295c.m11995g(j10, abstractC11059u));
                    i12 = iM12107b + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iM12107b = AbstractC11041f0.f33295c.m11994f(j10, abstractC11059u);
                    i12 = iM12107b + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iM12107b = AbstractC11063y.m12107b(AbstractC11041f0.f33295c.m11995g(j10, abstractC11059u));
                    i12 = iM12107b + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iM12107b = AbstractC11041f0.f33295c.m11994f(j10, abstractC11059u);
                    i12 = iM12107b + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zMo11983c = AbstractC11041f0.f33295c.mo11983c(j10, abstractC11059u);
                    Charset charset = AbstractC11063y.f33343a;
                    if (zMo11983c) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iM12107b = ((String) AbstractC11041f0.f33295c.m11996h(j10, abstractC11059u)).hashCode();
                    i12 = iM12107b + i10;
                    break;
                case 9:
                    Object objM11996h = AbstractC11041f0.f33295c.m11996h(j10, abstractC11059u);
                    if (objM11996h != null) {
                        iHashCode = objM11996h.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iM12107b = AbstractC11041f0.f33295c.m11996h(j10, abstractC11059u).hashCode();
                    i12 = iM12107b + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iM12107b = AbstractC11041f0.f33295c.m11994f(j10, abstractC11059u);
                    i12 = iM12107b + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iM12107b = AbstractC11041f0.f33295c.m11994f(j10, abstractC11059u);
                    i12 = iM12107b + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iM12107b = AbstractC11041f0.f33295c.m11994f(j10, abstractC11059u);
                    i12 = iM12107b + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iM12107b = AbstractC11063y.m12107b(AbstractC11041f0.f33295c.m11995g(j10, abstractC11059u));
                    i12 = iM12107b + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iM12107b = AbstractC11041f0.f33295c.m11994f(j10, abstractC11059u);
                    i12 = iM12107b + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iM12107b = AbstractC11063y.m12107b(AbstractC11041f0.f33295c.m11995g(j10, abstractC11059u));
                    i12 = iM12107b + i10;
                    break;
                case 17:
                    Object objM11996h2 = AbstractC11041f0.f33295c.m11996h(j10, abstractC11059u);
                    if (objM11996h2 != null) {
                        iHashCode = objM11996h2.hashCode();
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
                    iM12107b = AbstractC11041f0.f33295c.m11996h(j10, abstractC11059u).hashCode();
                    i12 = iM12107b + i10;
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    i10 = i12 * 53;
                    iM12107b = AbstractC11041f0.f33295c.m11996h(j10, abstractC11059u).hashCode();
                    i12 = iM12107b + i10;
                    break;
                case 51:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = AbstractC11063y.m12107b(Double.doubleToLongBits(((Double) AbstractC11041f0.f33295c.m11996h(j10, abstractC11059u)).doubleValue()));
                        i12 = iM12107b + i10;
                    }
                    break;
                case 52:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = Float.floatToIntBits(((Float) AbstractC11041f0.f33295c.m11996h(j10, abstractC11059u)).floatValue());
                        i12 = iM12107b + i10;
                    }
                    break;
                case 53:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = AbstractC11063y.m12107b(m11879A(j10, abstractC11059u));
                        i12 = iM12107b + i10;
                    }
                    break;
                case 54:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = AbstractC11063y.m12107b(m11879A(j10, abstractC11059u));
                        i12 = iM12107b + i10;
                    }
                    break;
                case 55:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = m11885z(j10, abstractC11059u);
                        i12 = iM12107b + i10;
                    }
                    break;
                case 56:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = AbstractC11063y.m12107b(m11879A(j10, abstractC11059u));
                        i12 = iM12107b + i10;
                    }
                    break;
                case 57:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = m11885z(j10, abstractC11059u);
                        i12 = iM12107b + i10;
                    }
                    break;
                case 58:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC11041f0.f33295c.m11996h(j10, abstractC11059u)).booleanValue();
                        Charset charset2 = AbstractC11063y.f33343a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case 59:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = ((String) AbstractC11041f0.f33295c.m11996h(j10, abstractC11059u)).hashCode();
                        i12 = iM12107b + i10;
                    }
                    break;
                case 60:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = AbstractC11041f0.f33295c.m11996h(j10, abstractC11059u).hashCode();
                        i12 = iM12107b + i10;
                    }
                    break;
                case 61:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = AbstractC11041f0.f33295c.m11996h(j10, abstractC11059u).hashCode();
                        i12 = iM12107b + i10;
                    }
                    break;
                case 62:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = m11885z(j10, abstractC11059u);
                        i12 = iM12107b + i10;
                    }
                    break;
                case 63:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = m11885z(j10, abstractC11059u);
                        i12 = iM12107b + i10;
                    }
                    break;
                case 64:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = m11885z(j10, abstractC11059u);
                        i12 = iM12107b + i10;
                    }
                    break;
                case 65:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = AbstractC11063y.m12107b(m11879A(j10, abstractC11059u));
                        i12 = iM12107b + i10;
                    }
                    break;
                case 66:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = m11885z(j10, abstractC11059u);
                        i12 = iM12107b + i10;
                    }
                    break;
                case 67:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = AbstractC11063y.m12107b(m11879A(j10, abstractC11059u));
                        i12 = iM12107b + i10;
                    }
                    break;
                case 68:
                    if (m11912q(i14, abstractC11059u, i13)) {
                        i10 = i12 * 53;
                        iM12107b = AbstractC11041f0.f33295c.m11996h(j10, abstractC11059u).hashCode();
                        i12 = iM12107b + i10;
                    }
                    break;
            }
        }
        this.f33259l.getClass();
        return abstractC11059u.unknownFields.hashCode() + (i12 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: g */
    public final boolean mo11903g(AbstractC11059u abstractC11059u, Object obj) {
        int[] iArr = this.f33248a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zM11927B = true;
            if (i10 >= length) {
                this.f33259l.getClass();
                return abstractC11059u.unknownFields.equals(((AbstractC11059u) obj).unknownFields);
            }
            int iM11895M = m11895M(i10);
            long j10 = iM11895M & 1048575;
            switch (m11881L(iM11895M)) {
                case 0:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e0 = AbstractC11041f0.f33295c;
                        if (Double.doubleToLongBits(abstractC11039e0.mo11984d(j10, abstractC11059u)) != Double.doubleToLongBits(abstractC11039e0.mo11984d(j10, obj))) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 1:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e1 = AbstractC11041f0.f33295c;
                        if (Float.floatToIntBits(abstractC11039e1.mo11985e(j10, abstractC11059u)) != Float.floatToIntBits(abstractC11039e1.mo11985e(j10, obj))) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 2:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e2 = AbstractC11041f0.f33295c;
                        if (abstractC11039e2.m11995g(j10, abstractC11059u) != abstractC11039e2.m11995g(j10, obj)) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 3:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e3 = AbstractC11041f0.f33295c;
                        if (abstractC11039e3.m11995g(j10, abstractC11059u) != abstractC11039e3.m11995g(j10, obj)) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 4:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e4 = AbstractC11041f0.f33295c;
                        if (abstractC11039e4.m11994f(j10, abstractC11059u) != abstractC11039e4.m11994f(j10, obj)) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 5:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e5 = AbstractC11041f0.f33295c;
                        if (abstractC11039e5.m11995g(j10, abstractC11059u) != abstractC11039e5.m11995g(j10, obj)) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 6:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e6 = AbstractC11041f0.f33295c;
                        if (abstractC11039e6.m11994f(j10, abstractC11059u) != abstractC11039e6.m11994f(j10, obj)) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 7:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e7 = AbstractC11041f0.f33295c;
                        if (abstractC11039e7.mo11983c(j10, abstractC11059u) != abstractC11039e7.mo11983c(j10, obj)) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 8:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e8 = AbstractC11041f0.f33295c;
                        if (!AbstractC11027X.m11927B(abstractC11039e8.m11996h(j10, abstractC11059u), abstractC11039e8.m11996h(j10, obj))) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 9:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e9 = AbstractC11041f0.f33295c;
                        if (!AbstractC11027X.m11927B(abstractC11039e9.m11996h(j10, abstractC11059u), abstractC11039e9.m11996h(j10, obj))) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 10:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e10 = AbstractC11041f0.f33295c;
                        if (!AbstractC11027X.m11927B(abstractC11039e10.m11996h(j10, abstractC11059u), abstractC11039e10.m11996h(j10, obj))) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 11:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e11 = AbstractC11041f0.f33295c;
                        if (abstractC11039e11.m11994f(j10, abstractC11059u) != abstractC11039e11.m11994f(j10, obj)) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 12:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e12 = AbstractC11041f0.f33295c;
                        if (abstractC11039e12.m11994f(j10, abstractC11059u) != abstractC11039e12.m11994f(j10, obj)) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 13:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e13 = AbstractC11041f0.f33295c;
                        if (abstractC11039e13.m11994f(j10, abstractC11059u) != abstractC11039e13.m11994f(j10, obj)) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 14:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e14 = AbstractC11041f0.f33295c;
                        if (abstractC11039e14.m11995g(j10, abstractC11059u) != abstractC11039e14.m11995g(j10, obj)) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 15:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e15 = AbstractC11041f0.f33295c;
                        if (abstractC11039e15.m11994f(j10, abstractC11059u) != abstractC11039e15.m11994f(j10, obj)) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 16:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e16 = AbstractC11041f0.f33295c;
                        if (abstractC11039e16.m11995g(j10, abstractC11059u) != abstractC11039e16.m11995g(j10, obj)) {
                            zM11927B = false;
                        }
                    }
                    break;
                case 17:
                    if (!m11906j(abstractC11059u, obj, i10)) {
                        zM11927B = false;
                    } else {
                        AbstractC11039e0 abstractC11039e17 = AbstractC11041f0.f33295c;
                        if (!AbstractC11027X.m11927B(abstractC11039e17.m11996h(j10, abstractC11059u), abstractC11039e17.m11996h(j10, obj))) {
                            zM11927B = false;
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
                    AbstractC11039e0 abstractC11039e18 = AbstractC11041f0.f33295c;
                    zM11927B = AbstractC11027X.m11927B(abstractC11039e18.m11996h(j10, abstractC11059u), abstractC11039e18.m11996h(j10, obj));
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    AbstractC11039e0 abstractC11039e19 = AbstractC11041f0.f33295c;
                    zM11927B = AbstractC11027X.m11927B(abstractC11039e19.m11996h(j10, abstractC11059u), abstractC11039e19.m11996h(j10, obj));
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
                    AbstractC11039e0 abstractC11039e20 = AbstractC11041f0.f33295c;
                    if (abstractC11039e20.m11994f(j11, abstractC11059u) != abstractC11039e20.m11994f(j11, obj) || !AbstractC11027X.m11927B(abstractC11039e20.m11996h(j10, abstractC11059u), abstractC11039e20.m11996h(j10, obj))) {
                        zM11927B = false;
                    }
                    break;
            }
            if (!zM11927B) {
                return false;
            }
            i10 += 3;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: h */
    public final void mo11904h(Object obj, C6277D c6277d, C11051m c11051m) throws Throwable {
        c11051m.getClass();
        if (!m11882p(obj)) {
            throw new IllegalArgumentException(AbstractC10763a.m11051i(obj, "Mutating immutable message: "));
        }
        m11913r(this.f33259l, obj, c6277d, c11051m);
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: i */
    public final void mo11905i(Object obj, C11012H c11012h) {
        c11012h.getClass();
        m11896N(obj, c11012h);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11906j(AbstractC11059u abstractC11059u, Object obj, int i10) {
        return m11910n(i10, abstractC11059u) == m11910n(i10, obj);
    }

    /* JADX INFO: renamed from: k */
    public final void m11907k(Object obj, int i10, Object obj2) {
        int i11 = this.f33248a[i10];
        if (AbstractC11041f0.f33295c.m11996h(m11895M(i10) & 1048575, obj) == null) {
            return;
        }
        m11908l(i10);
    }

    /* JADX INFO: renamed from: l */
    public final void m11908l(int i10) {
        if (this.f33249b[AbstractC10763a.m11068z(i10, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC11026W m11909m(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f33249b;
        InterfaceC11026W interfaceC11026W = (InterfaceC11026W) objArr[i11];
        if (interfaceC11026W != null) {
            return interfaceC11026W;
        }
        InterfaceC11026W interfaceC11026WM11919a = C11023T.f33266c.m11919a((Class) objArr[i11 + 1]);
        objArr[i11] = interfaceC11026WM11919a;
        return interfaceC11026WM11919a;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m11910n(int i10, Object obj) {
        int i11 = this.f33248a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 != 1048575) {
            return ((1 << (i11 >>> 20)) & AbstractC11041f0.f33295c.m11994f(j10, obj)) != 0;
        }
        int iM11895M = m11895M(i10);
        long j11 = iM11895M & 1048575;
        switch (m11881L(iM11895M)) {
            case 0:
                return Double.doubleToRawLongBits(AbstractC11041f0.f33295c.mo11984d(j11, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC11041f0.f33295c.mo11985e(j11, obj)) != 0;
            case 2:
                return AbstractC11041f0.f33295c.m11995g(j11, obj) != 0;
            case 3:
                return AbstractC11041f0.f33295c.m11995g(j11, obj) != 0;
            case 4:
                return AbstractC11041f0.f33295c.m11994f(j11, obj) != 0;
            case 5:
                return AbstractC11041f0.f33295c.m11995g(j11, obj) != 0;
            case 6:
                return AbstractC11041f0.f33295c.m11994f(j11, obj) != 0;
            case 7:
                return AbstractC11041f0.f33295c.mo11983c(j11, obj);
            case 8:
                Object objM11996h = AbstractC11041f0.f33295c.m11996h(j11, obj);
                if (objM11996h instanceof String) {
                    return !((String) objM11996h).isEmpty();
                }
                if (objM11996h instanceof C11042g) {
                    return !C11042g.f33300o0.equals(objM11996h);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC11041f0.f33295c.m11996h(j11, obj) != null;
            case 10:
                return !C11042g.f33300o0.equals(AbstractC11041f0.f33295c.m11996h(j11, obj));
            case 11:
                return AbstractC11041f0.f33295c.m11994f(j11, obj) != 0;
            case 12:
                return AbstractC11041f0.f33295c.m11994f(j11, obj) != 0;
            case 13:
                return AbstractC11041f0.f33295c.m11994f(j11, obj) != 0;
            case 14:
                return AbstractC11041f0.f33295c.m11995g(j11, obj) != 0;
            case 15:
                return AbstractC11041f0.f33295c.m11994f(j11, obj) != 0;
            case 16:
                return AbstractC11041f0.f33295c.m11995g(j11, obj) != 0;
            case 17:
                return AbstractC11041f0.f33295c.m11996h(j11, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11911o(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return m11910n(i10, obj);
        }
        return (i12 & i13) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m11912q(int i10, Object obj, int i11) {
        return AbstractC11041f0.f33295c.m11994f((long) (this.f33248a[i11 + 2] & 1048575), obj) == i10;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x06b8 A[Catch: all -> 0x027d, TryCatch #9 {all -> 0x027d, blocks: (B:131:0x06b3, B:133:0x06b8, B:134:0x06bd, B:79:0x026d, B:82:0x0280, B:83:0x0295, B:84:0x02aa, B:85:0x02bf, B:86:0x02da, B:87:0x02ef, B:88:0x0304, B:89:0x0319, B:90:0x032e, B:91:0x0343, B:92:0x0358, B:93:0x036d, B:94:0x0382, B:95:0x0397, B:96:0x03ac, B:97:0x03c1, B:98:0x03d6, B:99:0x03eb, B:100:0x0406, B:101:0x041b, B:102:0x0430, B:103:0x0446, B:104:0x0450, B:105:0x0465, B:106:0x047a, B:107:0x048f, B:108:0x04a4, B:109:0x04b9, B:110:0x04ce, B:111:0x04e3, B:112:0x04f8, B:113:0x0513, B:114:0x052b, B:115:0x0543, B:116:0x055c, B:117:0x0575, B:118:0x0590, B:119:0x05a8, B:120:0x05bd, B:121:0x05d8, B:122:0x05e5, B:123:0x05ff, B:124:0x0618, B:125:0x0631, B:126:0x0649, B:127:0x0661, B:128:0x0678, B:129:0x0692), top: B:161:0x06b3 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x06c7 A[LOOP:2: B:137:0x06c5->B:138:0x06c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:145:0x06df A[LOOP:3: B:144:0x06dd->B:145:0x06df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:173:0x06c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public final void m11913r(C11031a0 c11031a0, Object obj, C6277D c6277d, C11051m c11051m) throws Throwable {
        int i10;
        int i11;
        int[] iArr = this.f33254g;
        int i12 = this.f33256i;
        int i13 = this.f33255h;
        C11029Z c11029zM11977a = null;
        while (true) {
            try {
                int iM6794b = c6277d.m6794b();
                int iM11886B = m11886B(iM6794b);
                if (iM11886B >= 0) {
                    int iM11895M = m11895M(iM11886B);
                    try {
                        int iM11881L = m11881L(iM11895M);
                        AbstractC0754e0 abstractC0754e0 = (AbstractC0754e0) c6277d.f20385e;
                        C11008D c11008d = this.f33258k;
                        switch (iM11881L) {
                            case 0:
                                i13 = i13;
                                long jM11884y = m11884y(iM11895M);
                                c6277d.m6829s0(1);
                                AbstractC11041f0.f33295c.mo11988l(obj, jM11884y, abstractC0754e0.mo1623m());
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 1:
                                i13 = i13;
                                long jM11884y2 = m11884y(iM11895M);
                                c6277d.m6829s0(5);
                                AbstractC11041f0.f33295c.mo11989m(obj, jM11884y2, abstractC0754e0.mo1627q());
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 2:
                                i13 = i13;
                                long jM11884y3 = m11884y(iM11895M);
                                c6277d.m6829s0(0);
                                AbstractC11041f0.m12017n(obj, jM11884y3, abstractC0754e0.mo1629s());
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 3:
                                i13 = i13;
                                long jM11884y4 = m11884y(iM11895M);
                                c6277d.m6829s0(0);
                                AbstractC11041f0.m12017n(obj, jM11884y4, abstractC0754e0.mo1611B());
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 4:
                                i13 = i13;
                                long jM11884y5 = m11884y(iM11895M);
                                c6277d.m6829s0(0);
                                AbstractC11041f0.m12016m(jM11884y5, obj, abstractC0754e0.mo1628r());
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 5:
                                i13 = i13;
                                long jM11884y6 = m11884y(iM11895M);
                                c6277d.m6829s0(1);
                                AbstractC11041f0.m12017n(obj, jM11884y6, abstractC0754e0.mo1626p());
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 6:
                                i13 = i13;
                                long jM11884y7 = m11884y(iM11895M);
                                c6277d.m6829s0(5);
                                AbstractC11041f0.m12016m(jM11884y7, obj, abstractC0754e0.mo1625o());
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 7:
                                i13 = i13;
                                long jM11884y8 = m11884y(iM11895M);
                                c6277d.m6829s0(0);
                                AbstractC11041f0.f33295c.mo11986j(obj, jM11884y8, abstractC0754e0.mo1621j());
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 8:
                                i13 = i13;
                                m11889E(iM11895M, c6277d, obj);
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 9:
                                i13 = i13;
                                AbstractC11030a abstractC11030a = (AbstractC11030a) m11917v(iM11886B, obj);
                                InterfaceC11026W interfaceC11026WM11909m = m11909m(iM11886B);
                                c6277d.m6829s0(2);
                                c6277d.m6806h(abstractC11030a, interfaceC11026WM11909m, c11051m);
                                m11893J(obj, iM11886B, abstractC11030a);
                                i13 = i13;
                                break;
                            case 10:
                                i13 = i13;
                                AbstractC11041f0.m12018o(m11884y(iM11895M), obj, c6277d.m6818n());
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 11:
                                i13 = i13;
                                long jM11884y9 = m11884y(iM11895M);
                                c6277d.m6829s0(0);
                                AbstractC11041f0.m12016m(jM11884y9, obj, abstractC0754e0.mo1610A());
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 12:
                                i13 = i13;
                                c6277d.m6829s0(0);
                                int iMo1624n = abstractC0754e0.mo1624n();
                                m11908l(iM11886B);
                                AbstractC11041f0.m12016m(m11884y(iM11895M), obj, iMo1624n);
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 13:
                                i13 = i13;
                                long jM11884y10 = m11884y(iM11895M);
                                c6277d.m6829s0(5);
                                AbstractC11041f0.m12016m(jM11884y10, obj, abstractC0754e0.mo1630t());
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 14:
                                i13 = i13;
                                long jM11884y11 = m11884y(iM11895M);
                                c6277d.m6829s0(1);
                                AbstractC11041f0.m12017n(obj, jM11884y11, abstractC0754e0.mo1631u());
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 15:
                                i13 = i13;
                                long jM11884y12 = m11884y(iM11895M);
                                c6277d.m6829s0(0);
                                AbstractC11041f0.m12016m(jM11884y12, obj, abstractC0754e0.mo1632v());
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 16:
                                i13 = i13;
                                long jM11884y13 = m11884y(iM11895M);
                                c6277d.m6829s0(0);
                                AbstractC11041f0.m12017n(obj, jM11884y13, abstractC0754e0.mo1633w());
                                m11891H(iM11886B, obj);
                                i13 = i13;
                                break;
                            case 17:
                                i13 = i13;
                                AbstractC11030a abstractC11030a2 = (AbstractC11030a) m11917v(iM11886B, obj);
                                InterfaceC11026W interfaceC11026WM11909m2 = m11909m(iM11886B);
                                c6277d.m6829s0(3);
                                c6277d.m6802f(abstractC11030a2, interfaceC11026WM11909m2, c11051m);
                                m11893J(obj, iM11886B, abstractC11030a2);
                                i13 = i13;
                                break;
                            case 18:
                                i13 = i13;
                                long jM11884y14 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6828s(C11008D.m11850b(jM11884y14, obj));
                                i13 = i13;
                                break;
                            case 19:
                                i13 = i13;
                                long jM11884y15 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6772G(C11008D.m11850b(jM11884y15, obj));
                                i13 = i13;
                                break;
                            case 20:
                                i13 = i13;
                                long jM11884y16 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6780O(C11008D.m11850b(jM11884y16, obj));
                                i13 = i13;
                                break;
                            case 21:
                                i13 = i13;
                                long jM11884y17 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6819n0(C11008D.m11850b(jM11884y17, obj));
                                i13 = i13;
                                break;
                            case 22:
                                i13 = i13;
                                long jM11884y18 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6777L(C11008D.m11850b(jM11884y18, obj));
                                i13 = i13;
                                break;
                            case 23:
                                i13 = i13;
                                long jM11884y19 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6769D(C11008D.m11850b(jM11884y19, obj));
                                i13 = i13;
                                break;
                            case 24:
                                i13 = i13;
                                long jM11884y20 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6766A(C11008D.m11850b(jM11884y20, obj));
                                i13 = i13;
                                break;
                            case 25:
                                i13 = i13;
                                long jM11884y21 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6812k(C11008D.m11850b(jM11884y21, obj));
                                i13 = i13;
                                break;
                            case 26:
                                i13 = i13;
                                m11890F(iM11895M, c6277d, obj);
                                i13 = i13;
                                break;
                            case 27:
                                i13 = i13;
                                m11888D(obj, iM11895M, c6277d, m11909m(iM11886B), c11051m);
                                i13 = i13;
                                break;
                            case 28:
                                i13 = i13;
                                long jM11884y22 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6822p(C11008D.m11850b(jM11884y22, obj));
                                i13 = i13;
                                break;
                            case 29:
                                i13 = i13;
                                long jM11884y23 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6813k0(C11008D.m11850b(jM11884y23, obj));
                                i13 = i13;
                                break;
                            case 30:
                                i13 = i13;
                                long jM11884y24 = m11884y(iM11895M);
                                c11008d.getClass();
                                InterfaceC11062x interfaceC11062xM11850b = C11008D.m11850b(jM11884y24, obj);
                                c6277d.m6834v(interfaceC11062xM11850b);
                                m11908l(iM11886B);
                                AbstractC11027X.m11971z(obj, iM6794b, interfaceC11062xM11850b, c11029zM11977a, c11031a0);
                                i13 = i13;
                                break;
                            case 31:
                                i13 = i13;
                                long jM11884y25 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6786U(C11008D.m11850b(jM11884y25, obj));
                                i13 = i13;
                                break;
                            case 32:
                                i13 = i13;
                                long jM11884y26 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6789X(C11008D.m11850b(jM11884y26, obj));
                                i13 = i13;
                                break;
                            case 33:
                                i13 = i13;
                                long jM11884y27 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6793a0(C11008D.m11850b(jM11884y27, obj));
                                i13 = i13;
                                break;
                            case 34:
                                i13 = i13;
                                long jM11884y28 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6799d0(C11008D.m11850b(jM11884y28, obj));
                                i13 = i13;
                                break;
                            case 35:
                                i13 = i13;
                                long jM11884y29 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6828s(C11008D.m11850b(jM11884y29, obj));
                                i13 = i13;
                                break;
                            case 36:
                                i13 = i13;
                                long jM11884y30 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6772G(C11008D.m11850b(jM11884y30, obj));
                                i13 = i13;
                                break;
                            case 37:
                                i13 = i13;
                                long jM11884y31 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6780O(C11008D.m11850b(jM11884y31, obj));
                                i13 = i13;
                                break;
                            case 38:
                                i13 = i13;
                                long jM11884y32 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6819n0(C11008D.m11850b(jM11884y32, obj));
                                i13 = i13;
                                break;
                            case 39:
                                i13 = i13;
                                long jM11884y33 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6777L(C11008D.m11850b(jM11884y33, obj));
                                i13 = i13;
                                break;
                            case 40:
                                i13 = i13;
                                long jM11884y34 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6769D(C11008D.m11850b(jM11884y34, obj));
                                i13 = i13;
                                break;
                            case 41:
                                i13 = i13;
                                long jM11884y35 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6766A(C11008D.m11850b(jM11884y35, obj));
                                i13 = i13;
                                break;
                            case 42:
                                i13 = i13;
                                long jM11884y36 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6812k(C11008D.m11850b(jM11884y36, obj));
                                i13 = i13;
                                break;
                            case 43:
                                i13 = i13;
                                long jM11884y37 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6813k0(C11008D.m11850b(jM11884y37, obj));
                                i13 = i13;
                                break;
                            case 44:
                                i13 = i13;
                                long jM11884y38 = m11884y(iM11895M);
                                c11008d.getClass();
                                InterfaceC11062x interfaceC11062xM11850b2 = C11008D.m11850b(jM11884y38, obj);
                                c6277d.m6834v(interfaceC11062xM11850b2);
                                m11908l(iM11886B);
                                AbstractC11027X.m11971z(obj, iM6794b, interfaceC11062xM11850b2, c11029zM11977a, c11031a0);
                                i13 = i13;
                                break;
                            case 45:
                                i13 = i13;
                                long jM11884y39 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6786U(C11008D.m11850b(jM11884y39, obj));
                                i13 = i13;
                                break;
                            case 46:
                                i13 = i13;
                                long jM11884y40 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6789X(C11008D.m11850b(jM11884y40, obj));
                                i13 = i13;
                                break;
                            case 47:
                                i13 = i13;
                                long jM11884y41 = m11884y(iM11895M);
                                c11008d.getClass();
                                c6277d.m6793a0(C11008D.m11850b(jM11884y41, obj));
                                i13 = i13;
                                break;
                            case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                                i13 = i13;
                                try {
                                    long jM11884y42 = m11884y(iM11895M);
                                    c11008d.getClass();
                                    c6277d.m6799d0(C11008D.m11850b(jM11884y42, obj));
                                    break;
                                } catch (C11064z unused) {
                                    try {
                                        c11031a0.getClass();
                                        if (c11029zM11977a == null) {
                                            c11029zM11977a = C11031a0.m11977a(obj);
                                        }
                                        if (!C11031a0.m11979c(0, c6277d, c11029zM11977a)) {
                                            for (i11 = i13; i11 < i12; i11++) {
                                                m11907k(obj, iArr[i11], c11029zM11977a);
                                            }
                                            if (c11029zM11977a != null) {
                                                ((AbstractC11059u) obj).unknownFields = c11029zM11977a;
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        for (i10 = i13; i10 < i12; i10++) {
                                            m11907k(obj, iArr[i10], c11029zM11977a);
                                        }
                                        if (c11029zM11977a != null) {
                                            c11031a0.getClass();
                                            ((AbstractC11059u) obj).unknownFields = c11029zM11977a;
                                        }
                                        throw th;
                                    }
                                }
                                i13 = i13;
                                break;
                            case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                                try {
                                    i13 = i13;
                                    C11029Z c11029z = c11029zM11977a;
                                    try {
                                        m11887C(obj, m11884y(iM11895M), c6277d, m11909m(iM11886B), c11051m);
                                        c11029zM11977a = c11029z;
                                    } catch (C11064z unused2) {
                                        c11029zM11977a = c11029z;
                                        c11031a0.getClass();
                                        if (c11029zM11977a == null) {
                                            c11029zM11977a = C11031a0.m11977a(obj);
                                        }
                                        if (!C11031a0.m11979c(0, c6277d, c11029zM11977a)) {
                                            while (i11 < i12) {
                                                m11907k(obj, iArr[i11], c11029zM11977a);
                                            }
                                            if (c11029zM11977a != null) {
                                                ((AbstractC11059u) obj).unknownFields = c11029zM11977a;
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c11029zM11977a = c11029z;
                                        while (i10 < i12) {
                                            m11907k(obj, iArr[i10], c11029zM11977a);
                                        }
                                        if (c11029zM11977a != null) {
                                            c11031a0.getClass();
                                            ((AbstractC11059u) obj).unknownFields = c11029zM11977a;
                                        }
                                        throw th;
                                    }
                                } catch (C11064z unused3) {
                                    c11031a0.getClass();
                                    if (c11029zM11977a == null) {
                                        c11029zM11977a = C11031a0.m11977a(obj);
                                    }
                                    if (!C11031a0.m11979c(0, c6277d, c11029zM11977a)) {
                                        while (i11 < i12) {
                                            m11907k(obj, iArr[i11], c11029zM11977a);
                                        }
                                        if (c11029zM11977a != null) {
                                            ((AbstractC11059u) obj).unknownFields = c11029zM11977a;
                                            return;
                                        }
                                        return;
                                    }
                                    i13 = i13;
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    i13 = i13;
                                    while (i10 < i12) {
                                        m11907k(obj, iArr[i10], c11029zM11977a);
                                    }
                                    if (c11029zM11977a != null) {
                                        c11031a0.getClass();
                                        ((AbstractC11059u) obj).unknownFields = c11029zM11977a;
                                    }
                                    throw th;
                                }
                                i13 = i13;
                                break;
                            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                try {
                                    m11914s(obj, iM11886B, this.f33249b[(iM11886B / 3) * 2]);
                                    try {
                                        throw null;
                                    } catch (C11064z unused4) {
                                        c11031a0.getClass();
                                        if (c11029zM11977a == null) {
                                            c11029zM11977a = C11031a0.m11977a(obj);
                                        }
                                        if (!C11031a0.m11979c(0, c6277d, c11029zM11977a)) {
                                            while (i11 < i12) {
                                                m11907k(obj, iArr[i11], c11029zM11977a);
                                            }
                                            if (c11029zM11977a != null) {
                                                ((AbstractC11059u) obj).unknownFields = c11029zM11977a;
                                                return;
                                            }
                                            return;
                                        }
                                        i13 = i13;
                                    }
                                    break;
                                } catch (C11064z unused5) {
                                }
                                break;
                            case 51:
                                long jM11884y43 = m11884y(iM11895M);
                                c6277d.m6829s0(1);
                                AbstractC11041f0.m12018o(jM11884y43, obj, Double.valueOf(abstractC0754e0.mo1623m()));
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 52:
                                long jM11884y44 = m11884y(iM11895M);
                                c6277d.m6829s0(5);
                                AbstractC11041f0.m12018o(jM11884y44, obj, Float.valueOf(abstractC0754e0.mo1627q()));
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 53:
                                long jM11884y45 = m11884y(iM11895M);
                                c6277d.m6829s0(0);
                                AbstractC11041f0.m12018o(jM11884y45, obj, Long.valueOf(abstractC0754e0.mo1629s()));
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 54:
                                long jM11884y46 = m11884y(iM11895M);
                                c6277d.m6829s0(0);
                                AbstractC11041f0.m12018o(jM11884y46, obj, Long.valueOf(abstractC0754e0.mo1611B()));
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 55:
                                long jM11884y47 = m11884y(iM11895M);
                                c6277d.m6829s0(0);
                                AbstractC11041f0.m12018o(jM11884y47, obj, Integer.valueOf(abstractC0754e0.mo1628r()));
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 56:
                                long jM11884y48 = m11884y(iM11895M);
                                c6277d.m6829s0(1);
                                AbstractC11041f0.m12018o(jM11884y48, obj, Long.valueOf(abstractC0754e0.mo1626p()));
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 57:
                                long jM11884y49 = m11884y(iM11895M);
                                c6277d.m6829s0(5);
                                AbstractC11041f0.m12018o(jM11884y49, obj, Integer.valueOf(abstractC0754e0.mo1625o()));
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 58:
                                long jM11884y50 = m11884y(iM11895M);
                                c6277d.m6829s0(0);
                                AbstractC11041f0.m12018o(jM11884y50, obj, Boolean.valueOf(abstractC0754e0.mo1621j()));
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 59:
                                m11889E(iM11895M, c6277d, obj);
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 60:
                                AbstractC11030a abstractC11030a3 = (AbstractC11030a) m11918w(iM6794b, obj, iM11886B);
                                InterfaceC11026W interfaceC11026WM11909m3 = m11909m(iM11886B);
                                c6277d.m6829s0(2);
                                c6277d.m6806h(abstractC11030a3, interfaceC11026WM11909m3, c11051m);
                                m11894K(obj, iM6794b, iM11886B, abstractC11030a3);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 61:
                                AbstractC11041f0.m12018o(m11884y(iM11895M), obj, c6277d.m6818n());
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 62:
                                long jM11884y51 = m11884y(iM11895M);
                                c6277d.m6829s0(0);
                                AbstractC11041f0.m12018o(jM11884y51, obj, Integer.valueOf(abstractC0754e0.mo1610A()));
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 63:
                                c6277d.m6829s0(0);
                                int iMo1624n2 = abstractC0754e0.mo1624n();
                                m11908l(iM11886B);
                                AbstractC11041f0.m12018o(m11884y(iM11895M), obj, Integer.valueOf(iMo1624n2));
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 64:
                                long jM11884y52 = m11884y(iM11895M);
                                c6277d.m6829s0(5);
                                AbstractC11041f0.m12018o(jM11884y52, obj, Integer.valueOf(abstractC0754e0.mo1630t()));
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 65:
                                long jM11884y53 = m11884y(iM11895M);
                                c6277d.m6829s0(1);
                                AbstractC11041f0.m12018o(jM11884y53, obj, Long.valueOf(abstractC0754e0.mo1631u()));
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 66:
                                long jM11884y54 = m11884y(iM11895M);
                                c6277d.m6829s0(0);
                                AbstractC11041f0.m12018o(jM11884y54, obj, Integer.valueOf(abstractC0754e0.mo1632v()));
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 67:
                                long jM11884y55 = m11884y(iM11895M);
                                c6277d.m6829s0(0);
                                AbstractC11041f0.m12018o(jM11884y55, obj, Long.valueOf(abstractC0754e0.mo1633w()));
                                m11892I(iM6794b, obj, iM11886B);
                                i13 = i13;
                                i13 = i13;
                                break;
                            case 68:
                                AbstractC11030a abstractC11030a4 = (AbstractC11030a) m11918w(iM6794b, obj, iM11886B);
                                InterfaceC11026W interfaceC11026WM11909m4 = m11909m(iM11886B);
                                c6277d.m6829s0(3);
                                c6277d.m6802f(abstractC11030a4, interfaceC11026WM11909m4, c11051m);
                                m11894K(obj, iM6794b, iM11886B, abstractC11030a4);
                                i13 = i13;
                                i13 = i13;
                                break;
                            default:
                                if (c11029zM11977a == null) {
                                    c11031a0.getClass();
                                    c11029zM11977a = C11031a0.m11977a(obj);
                                }
                                c11031a0.getClass();
                                if (!C11031a0.m11979c(0, c6277d, c11029zM11977a)) {
                                    while (i13 < i12) {
                                        m11907k(obj, iArr[i13], c11029zM11977a);
                                        i13++;
                                    }
                                    if (c11029zM11977a != null) {
                                        ((AbstractC11059u) obj).unknownFields = c11029zM11977a;
                                        return;
                                    }
                                    return;
                                }
                                i13 = i13;
                                i13 = i13;
                                break;
                        }
                    } catch (C11064z unused6) {
                    }
                } else {
                    if (iM6794b == Integer.MAX_VALUE) {
                        while (i13 < i12) {
                            m11907k(obj, iArr[i13], c11029zM11977a);
                            i13++;
                        }
                        if (c11029zM11977a != null) {
                            c11031a0.getClass();
                            ((AbstractC11059u) obj).unknownFields = c11029zM11977a;
                            return;
                        }
                        return;
                    }
                    c11031a0.getClass();
                    if (c11029zM11977a == null) {
                        c11029zM11977a = C11031a0.m11977a(obj);
                    }
                    if (!C11031a0.m11979c(0, c6277d, c11029zM11977a)) {
                        while (i13 < i12) {
                            m11907k(obj, iArr[i13], c11029zM11977a);
                            i13++;
                        }
                        if (c11029zM11977a != null) {
                            ((AbstractC11059u) obj).unknownFields = c11029zM11977a;
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m11914s(Object obj, int i10, Object obj2) {
        long jM11895M = m11895M(i10) & 1048575;
        Object objM11996h = AbstractC11041f0.f33295c.m11996h(jM11895M, obj);
        C11014J c11014j = this.f33260m;
        if (objM11996h != null) {
            c11014j.getClass();
            if (!((C11013I) objM11996h).f33242Y) {
                C11013I c11013iM11872c = C11013I.f33241Z.m11872c();
                C11014J.m11874b(c11013iM11872c, objM11996h);
                AbstractC11041f0.m12018o(jM11895M, obj, c11013iM11872c);
                objM11996h = c11013iM11872c;
            }
        } else {
            c11014j.getClass();
            objM11996h = C11013I.f33241Z.m11872c();
            AbstractC11041f0.m12018o(jM11895M, obj, objM11996h);
        }
        c11014j.getClass();
        AbstractC0168G.m507B(obj2);
        throw null;
    }

    /* JADX INFO: renamed from: t */
    public final void m11915t(Object obj, int i10, Object obj2) {
        if (m11910n(i10, obj2)) {
            long jM11895M = m11895M(i10) & 1048575;
            Unsafe unsafe = f33247o;
            Object object = unsafe.getObject(obj2, jM11895M);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f33248a[i10] + " is present but null: " + obj2);
            }
            InterfaceC11026W interfaceC11026WM11909m = m11909m(i10);
            if (!m11910n(i10, obj)) {
                if (m11882p(object)) {
                    AbstractC11059u abstractC11059uMo11899c = interfaceC11026WM11909m.mo11899c();
                    interfaceC11026WM11909m.mo11900d(abstractC11059uMo11899c, object);
                    unsafe.putObject(obj, jM11895M, abstractC11059uMo11899c);
                } else {
                    unsafe.putObject(obj, jM11895M, object);
                }
                m11891H(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM11895M);
            if (!m11882p(object2)) {
                AbstractC11059u abstractC11059uMo11899c2 = interfaceC11026WM11909m.mo11899c();
                interfaceC11026WM11909m.mo11900d(abstractC11059uMo11899c2, object2);
                unsafe.putObject(obj, jM11895M, abstractC11059uMo11899c2);
                object2 = abstractC11059uMo11899c2;
            }
            interfaceC11026WM11909m.mo11900d(object2, object);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m11916u(Object obj, int i10, Object obj2) {
        int[] iArr = this.f33248a;
        int i11 = iArr[i10];
        if (m11912q(i11, obj2, i10)) {
            long jM11895M = m11895M(i10) & 1048575;
            Unsafe unsafe = f33247o;
            Object object = unsafe.getObject(obj2, jM11895M);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            InterfaceC11026W interfaceC11026WM11909m = m11909m(i10);
            if (!m11912q(i11, obj, i10)) {
                if (m11882p(object)) {
                    AbstractC11059u abstractC11059uMo11899c = interfaceC11026WM11909m.mo11899c();
                    interfaceC11026WM11909m.mo11900d(abstractC11059uMo11899c, object);
                    unsafe.putObject(obj, jM11895M, abstractC11059uMo11899c);
                } else {
                    unsafe.putObject(obj, jM11895M, object);
                }
                m11892I(i11, obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM11895M);
            if (!m11882p(object2)) {
                AbstractC11059u abstractC11059uMo11899c2 = interfaceC11026WM11909m.mo11899c();
                interfaceC11026WM11909m.mo11900d(abstractC11059uMo11899c2, object2);
                unsafe.putObject(obj, jM11895M, abstractC11059uMo11899c2);
                object2 = abstractC11059uMo11899c2;
            }
            interfaceC11026WM11909m.mo11900d(object2, object);
        }
    }

    /* JADX INFO: renamed from: v */
    public final Object m11917v(int i10, Object obj) {
        InterfaceC11026W interfaceC11026WM11909m = m11909m(i10);
        long jM11895M = m11895M(i10) & 1048575;
        if (!m11910n(i10, obj)) {
            return interfaceC11026WM11909m.mo11899c();
        }
        Object object = f33247o.getObject(obj, jM11895M);
        if (m11882p(object)) {
            return object;
        }
        AbstractC11059u abstractC11059uMo11899c = interfaceC11026WM11909m.mo11899c();
        if (object != null) {
            interfaceC11026WM11909m.mo11900d(abstractC11059uMo11899c, object);
        }
        return abstractC11059uMo11899c;
    }

    /* JADX INFO: renamed from: w */
    public final Object m11918w(int i10, Object obj, int i11) {
        InterfaceC11026W interfaceC11026WM11909m = m11909m(i11);
        if (!m11912q(i10, obj, i11)) {
            return interfaceC11026WM11909m.mo11899c();
        }
        Object object = f33247o.getObject(obj, m11895M(i11) & 1048575);
        if (m11882p(object)) {
            return object;
        }
        AbstractC11059u abstractC11059uMo11899c = interfaceC11026WM11909m.mo11899c();
        if (object != null) {
            interfaceC11026WM11909m.mo11900d(abstractC11059uMo11899c, object);
        }
        return abstractC11059uMo11899c;
    }
}
