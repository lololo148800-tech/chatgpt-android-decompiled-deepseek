package androidx.datastore.preferences.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.glance.appwidget.protobuf.C11064z;
import com.google.protobuf.C12178o0;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import livekit.LivekitInternal$NodeStats;
import p370P0.C6277D;
import p394Q2.C6569i;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C10938Q implements InterfaceC10948a0 {

    /* JADX INFO: renamed from: o */
    public static final int[] f32982o = new int[0];

    /* JADX INFO: renamed from: p */
    public static final Unsafe f32983p = AbstractC10982r0.m11703l();

    /* JADX INFO: renamed from: a */
    public final int[] f32984a;

    /* JADX INFO: renamed from: b */
    public final Object[] f32985b;

    /* JADX INFO: renamed from: c */
    public final int f32986c;

    /* JADX INFO: renamed from: d */
    public final int f32987d;

    /* JADX INFO: renamed from: e */
    public final AbstractC10947a f32988e;

    /* JADX INFO: renamed from: f */
    public final boolean f32989f;

    /* JADX INFO: renamed from: g */
    public final boolean f32990g;

    /* JADX INFO: renamed from: h */
    public final int[] f32991h;

    /* JADX INFO: renamed from: i */
    public final int f32992i;

    /* JADX INFO: renamed from: j */
    public final int f32993j;

    /* JADX INFO: renamed from: k */
    public final C10940T f32994k;

    /* JADX INFO: renamed from: l */
    public final AbstractC10927F f32995l;

    /* JADX INFO: renamed from: m */
    public final C10966j0 f32996m;

    /* JADX INFO: renamed from: n */
    public final C10934M f32997n;

    public C10938Q(int[] iArr, Object[] objArr, int i10, int i11, AbstractC10947a abstractC10947a, boolean z6, int[] iArr2, int i12, int i13, C10940T c10940t, AbstractC10927F abstractC10927F, C10966j0 c10966j0, C10971m c10971m, C10934M c10934m) {
        this.f32984a = iArr;
        this.f32985b = objArr;
        this.f32986c = i10;
        this.f32987d = i11;
        this.f32989f = abstractC10947a instanceof AbstractC10987u;
        this.f32990g = z6;
        this.f32991h = iArr2;
        this.f32992i = i12;
        this.f32993j = i13;
        this.f32994k = c10940t;
        this.f32995l = abstractC10927F;
        this.f32996m = c10966j0;
        this.f32988e = abstractC10947a;
        this.f32997n = c10934m;
    }

    /* JADX INFO: renamed from: A */
    public static int m11474A(long j10, Object obj) {
        return ((Integer) AbstractC10982r0.f33089d.m11687i(j10, obj)).intValue();
    }

    /* JADX INFO: renamed from: B */
    public static long m11475B(long j10, Object obj) {
        return ((Long) AbstractC10982r0.f33089d.m11687i(j10, obj)).longValue();
    }

    /* JADX INFO: renamed from: H */
    public static Field m11476H(Class cls, String str) {
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

    /* JADX INFO: renamed from: K */
    public static int m11477K(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: O */
    public static void m11478O(int i10, Object obj, C10930I c10930i) throws C10961h {
        if (!(obj instanceof String)) {
            c10930i.m11441b(i10, (C10957f) obj);
        } else {
            ((C10963i) c10930i.f32971a).m11652c0(i10, (String) obj);
        }
    }

    /* JADX INFO: renamed from: s */
    public static List m11479s(AbstractC10947a abstractC10947a, long j10) {
        return (List) AbstractC10982r0.f33089d.m11687i(j10, abstractC10947a);
    }

    /* JADX INFO: renamed from: x */
    public static C10938Q m11480x(C10946Z c10946z, C10940T c10940t, AbstractC10927F abstractC10927F, C10966j0 c10966j0, C10971m c10971m, C10934M c10934m) {
        if (c10946z instanceof C10946Z) {
            return m11481y(c10946z, c10940t, abstractC10927F, c10966j0, c10971m, c10934m);
        }
        c10946z.getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: y */
    public static C10938Q m11481y(C10946Z c10946z, C10940T c10940t, AbstractC10927F abstractC10927F, C10966j0 c10966j0, C10971m c10971m, C10934M c10934m) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
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
        boolean z6;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int i28;
        int i29;
        int iObjectFieldOffset2;
        Field fieldM11476H;
        int i30;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        Field fieldM11476H2;
        Field fieldM11476H3;
        int i34;
        char cCharAt10;
        int i35;
        char cCharAt11;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        char cCharAt14;
        int i38 = 0;
        boolean z10 = c10946z.m11520d() == 2;
        String strM11519c = c10946z.m11519c();
        int length = strM11519c.length();
        int iCharAt3 = strM11519c.charAt(0);
        if (iCharAt3 >= 55296) {
            int i39 = iCharAt3 & 8191;
            int i40 = 1;
            int i41 = 13;
            while (true) {
                i10 = i40 + 1;
                cCharAt14 = strM11519c.charAt(i40);
                if (cCharAt14 < 55296) {
                    break;
                }
                i39 |= (cCharAt14 & 8191) << i41;
                i41 += 13;
                i40 = i10;
            }
            iCharAt3 = i39 | (cCharAt14 << i41);
        } else {
            i10 = 1;
        }
        int i42 = i10 + 1;
        int iCharAt4 = strM11519c.charAt(i10);
        if (iCharAt4 >= 55296) {
            int i43 = iCharAt4 & 8191;
            int i44 = 13;
            while (true) {
                i37 = i42 + 1;
                cCharAt13 = strM11519c.charAt(i42);
                if (cCharAt13 < 55296) {
                    break;
                }
                i43 |= (cCharAt13 & 8191) << i44;
                i44 += 13;
                i42 = i37;
            }
            iCharAt4 = i43 | (cCharAt13 << i44);
            i42 = i37;
        }
        if (iCharAt4 == 0) {
            i15 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i14 = 0;
            i12 = 0;
            iArr = f32982o;
            i13 = 0;
        } else {
            int i45 = i42 + 1;
            int iCharAt5 = strM11519c.charAt(i42);
            if (iCharAt5 >= 55296) {
                int i46 = iCharAt5 & 8191;
                int i47 = 13;
                while (true) {
                    i23 = i45 + 1;
                    cCharAt8 = strM11519c.charAt(i45);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i23;
                }
                iCharAt5 = i46 | (cCharAt8 << i47);
                i45 = i23;
            }
            int i48 = i45 + 1;
            int iCharAt6 = strM11519c.charAt(i45);
            if (iCharAt6 >= 55296) {
                int i49 = iCharAt6 & 8191;
                int i50 = 13;
                while (true) {
                    i22 = i48 + 1;
                    cCharAt7 = strM11519c.charAt(i48);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i22;
                }
                iCharAt6 = i49 | (cCharAt7 << i50);
                i48 = i22;
            }
            int i51 = i48 + 1;
            iCharAt = strM11519c.charAt(i48);
            if (iCharAt >= 55296) {
                int i52 = iCharAt & 8191;
                int i53 = 13;
                while (true) {
                    i21 = i51 + 1;
                    cCharAt6 = strM11519c.charAt(i51);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i21;
                }
                iCharAt = i52 | (cCharAt6 << i53);
                i51 = i21;
            }
            int i54 = i51 + 1;
            iCharAt2 = strM11519c.charAt(i51);
            if (iCharAt2 >= 55296) {
                int i55 = iCharAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i20 = i54 + 1;
                    cCharAt5 = strM11519c.charAt(i54);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i20;
                }
                iCharAt2 = i55 | (cCharAt5 << i56);
                i54 = i20;
            }
            int i57 = i54 + 1;
            int iCharAt7 = strM11519c.charAt(i54);
            if (iCharAt7 >= 55296) {
                int i58 = iCharAt7 & 8191;
                int i59 = 13;
                while (true) {
                    i19 = i57 + 1;
                    cCharAt4 = strM11519c.charAt(i57);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i19;
                }
                iCharAt7 = i58 | (cCharAt4 << i59);
                i57 = i19;
            }
            int i60 = i57 + 1;
            int iCharAt8 = strM11519c.charAt(i57);
            if (iCharAt8 >= 55296) {
                int i61 = iCharAt8 & 8191;
                int i62 = 13;
                while (true) {
                    i18 = i60 + 1;
                    cCharAt3 = strM11519c.charAt(i60);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i18;
                }
                iCharAt8 = i61 | (cCharAt3 << i62);
                i60 = i18;
            }
            int i63 = i60 + 1;
            int iCharAt9 = strM11519c.charAt(i60);
            if (iCharAt9 >= 55296) {
                int i64 = iCharAt9 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i17 = i65 + 1;
                    cCharAt2 = strM11519c.charAt(i65);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt2 & 8191) << i66;
                    i66 += 13;
                    i65 = i17;
                }
                iCharAt9 = i64 | (cCharAt2 << i66);
                i11 = i17;
            } else {
                i11 = i63;
            }
            int i67 = i11 + 1;
            int iCharAt10 = strM11519c.charAt(i11);
            if (iCharAt10 >= 55296) {
                int i68 = iCharAt10 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i16 = i69 + 1;
                    cCharAt = strM11519c.charAt(i69);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i68 |= (cCharAt & 8191) << i70;
                    i70 += 13;
                    i69 = i16;
                }
                iCharAt10 = i68 | (cCharAt << i70);
                i67 = i16;
            }
            int[] iArr2 = new int[iCharAt10 + iCharAt8 + iCharAt9];
            i12 = (iCharAt5 * 2) + iCharAt6;
            i13 = iCharAt8;
            i14 = iCharAt10;
            i38 = iCharAt5;
            i42 = i67;
            int i71 = iCharAt7;
            iArr = iArr2;
            i15 = i71;
        }
        Unsafe unsafe = f32983p;
        Object[] objArrM11518b = c10946z.m11518b();
        Class<?> cls = c10946z.m11517a().getClass();
        int i72 = i42;
        int[] iArr3 = new int[i15 * 3];
        Object[] objArr = new Object[i15 * 2];
        int i73 = i14 + i13;
        int i74 = i14;
        int i75 = i72;
        int i76 = i73;
        int i77 = 0;
        int i78 = 0;
        while (i75 < length) {
            int i79 = i75 + 1;
            int iCharAt11 = strM11519c.charAt(i75);
            int i80 = length;
            if (iCharAt11 >= 55296) {
                int i81 = iCharAt11 & 8191;
                int i82 = i79;
                int i83 = 13;
                while (true) {
                    i36 = i82 + 1;
                    cCharAt12 = strM11519c.charAt(i82);
                    i24 = i14;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i81 |= (cCharAt12 & 8191) << i83;
                    i83 += 13;
                    i82 = i36;
                    i14 = i24;
                }
                iCharAt11 = i81 | (cCharAt12 << i83);
                i25 = i36;
            } else {
                i24 = i14;
                i25 = i79;
            }
            int i84 = i25 + 1;
            int iCharAt12 = strM11519c.charAt(i25);
            if (iCharAt12 >= 55296) {
                int i85 = iCharAt12 & 8191;
                int i86 = i84;
                int i87 = 13;
                while (true) {
                    i35 = i86 + 1;
                    cCharAt11 = strM11519c.charAt(i86);
                    z6 = z10;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i85 |= (cCharAt11 & 8191) << i87;
                    i87 += 13;
                    i86 = i35;
                    z10 = z6;
                }
                iCharAt12 = i85 | (cCharAt11 << i87);
                i26 = i35;
            } else {
                z6 = z10;
                i26 = i84;
            }
            int i88 = iCharAt12 & 255;
            int i89 = iCharAt2;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i78] = i77;
                i78++;
            }
            if (i88 >= 51) {
                int i90 = i26 + 1;
                int iCharAt13 = strM11519c.charAt(i26);
                char c9 = 55296;
                if (iCharAt13 >= 55296) {
                    int i91 = 13;
                    int i92 = iCharAt13 & 8191;
                    int i93 = i90;
                    while (true) {
                        i34 = i93 + 1;
                        cCharAt10 = strM11519c.charAt(i93);
                        if (cCharAt10 < c9) {
                            break;
                        }
                        i92 |= (cCharAt10 & 8191) << i91;
                        i91 += 13;
                        i93 = i34;
                        c9 = 55296;
                    }
                    iCharAt13 = i92 | (cCharAt10 << i91);
                    i32 = i34;
                } else {
                    i32 = i90;
                }
                int i94 = i32;
                int i95 = i88 - 51;
                if (i95 == 9 || i95 == 17) {
                    i33 = 2;
                    objArr[AbstractC10763a.m11068z(i77, 3, 2, 1)] = objArrM11518b[i12];
                    i12++;
                } else if (i95 == 12 && (iCharAt3 & 1) == 1) {
                    i33 = 2;
                    objArr[AbstractC10763a.m11068z(i77, 3, 2, 1)] = objArrM11518b[i12];
                    i12++;
                } else {
                    i33 = 2;
                }
                int i96 = iCharAt13 * i33;
                Object obj = objArrM11518b[i96];
                if (obj instanceof Field) {
                    fieldM11476H2 = (Field) obj;
                } else {
                    fieldM11476H2 = m11476H(cls, (String) obj);
                    objArrM11518b[i96] = fieldM11476H2;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM11476H2);
                int i97 = i96 + 1;
                Object obj2 = objArrM11518b[i97];
                if (obj2 instanceof Field) {
                    fieldM11476H3 = (Field) obj2;
                } else {
                    fieldM11476H3 = m11476H(cls, (String) obj2);
                    objArrM11518b[i97] = fieldM11476H3;
                }
                iCharAt12 = iCharAt12;
                iCharAt11 = iCharAt11;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM11476H3);
                i75 = i94;
                i28 = 0;
                iCharAt3 = iCharAt3;
                i29 = i12;
            } else {
                iArr3 = iArr3;
                int i98 = i12 + 1;
                Field fieldM11476H4 = m11476H(cls, (String) objArrM11518b[i12]);
                if (i88 == 9 || i88 == 17) {
                    iCharAt12 = iCharAt12;
                    iCharAt11 = iCharAt11;
                    i27 = 1;
                    objArr[AbstractC10763a.m11068z(i77, 3, 2, 1)] = fieldM11476H4.getType();
                } else {
                    if (i88 == 27 || i88 == 49) {
                        iCharAt12 = iCharAt12;
                        i27 = 1;
                        i31 = i12 + 2;
                        objArr[AbstractC10763a.m11068z(i77, 3, 2, 1)] = objArrM11518b[i98];
                    } else if (i88 == 12 || i88 == 30 || i88 == 44) {
                        iCharAt12 = iCharAt12;
                        i27 = 1;
                        if ((iCharAt3 & 1) == 1) {
                            i31 = i12 + 2;
                            objArr[AbstractC10763a.m11068z(i77, 3, 2, 1)] = objArrM11518b[i98];
                        } else {
                            iCharAt11 = iCharAt11;
                        }
                    } else {
                        if (i88 == 50) {
                            int i99 = i74 + 1;
                            iArr[i74] = i77;
                            int i100 = (i77 / 3) * 2;
                            int i101 = i12 + 2;
                            objArr[i100] = objArrM11518b[i98];
                            if ((iCharAt12 & 2048) != 0) {
                                i98 = i12 + 3;
                                objArr[i100 + 1] = objArrM11518b[i101];
                                i74 = i99;
                            } else {
                                i74 = i99;
                                i98 = i101;
                            }
                        }
                        i27 = 1;
                    }
                    i98 = i31;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM11476H4);
                if ((iCharAt3 & 1) != i27 || i88 > 17) {
                    iObjectFieldOffset = 0;
                    i28 = 0;
                } else {
                    int i102 = i26 + 1;
                    int iCharAt14 = strM11519c.charAt(i26);
                    if (iCharAt14 >= 55296) {
                        int i103 = iCharAt14 & 8191;
                        int i104 = 13;
                        while (true) {
                            i30 = i102 + 1;
                            cCharAt9 = strM11519c.charAt(i102);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i103 |= (cCharAt9 & 8191) << i104;
                            i104 += 13;
                            i102 = i30;
                        }
                        iCharAt14 = i103 | (cCharAt9 << i104);
                        i26 = i30;
                    } else {
                        i26 = i102;
                    }
                    int i105 = (iCharAt14 / 32) + (i38 * 2);
                    Object obj3 = objArrM11518b[i105];
                    if (obj3 instanceof Field) {
                        fieldM11476H = (Field) obj3;
                    } else {
                        fieldM11476H = m11476H(cls, (String) obj3);
                        objArrM11518b[i105] = fieldM11476H;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM11476H);
                    i28 = iCharAt14 % 32;
                }
                if (i88 >= 18 && i88 <= 49) {
                    iArr[i76] = iObjectFieldOffset3;
                    i76++;
                }
                i29 = i98;
                iObjectFieldOffset2 = iObjectFieldOffset3;
                i75 = i26;
            }
            int i106 = i77 + 1;
            iArr3[i77] = iCharAt11;
            int i107 = i77 + 2;
            String str = strM11519c;
            int i108 = iCharAt12;
            iArr3[i106] = ((i108 & 512) != 0 ? 536870912 : 0) | ((i108 & 256) != 0 ? 268435456 : 0) | (i88 << 20) | iObjectFieldOffset2;
            i77 += 3;
            iArr3[i107] = (i28 << 20) | iObjectFieldOffset;
            i12 = i29;
            iCharAt3 = iCharAt3;
            iCharAt2 = i89;
            length = i80;
            strM11519c = str;
            i14 = i24;
            z10 = z6;
            iCharAt = iCharAt;
            iArr3 = iArr3;
        }
        return new C10938Q(iArr3, objArr, iCharAt, iCharAt2, c10946z.m11517a(), z10, iArr, i14, i73, c10940t, abstractC10927F, c10966j0, c10971m, c10934m);
    }

    /* JADX INFO: renamed from: z */
    public static long m11482z(int i10) {
        return i10 & 1048575;
    }

    /* JADX INFO: renamed from: C */
    public final int m11483C(int i10) {
        if (i10 < this.f32986c || i10 > this.f32987d) {
            return -1;
        }
        int[] iArr = this.f32984a;
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

    /* JADX INFO: renamed from: D */
    public final void m11484D(Object obj, long j10, C6277D c6277d, InterfaceC10948a0 interfaceC10948a0, C10969l c10969l) throws C10995y {
        int iM11614z;
        List listMo11437c = this.f32995l.mo11437c(j10, obj);
        int i10 = c6277d.f20382b;
        if ((i10 & 7) != 3) {
            throw C10997z.m11727b();
        }
        do {
            listMo11437c.add(c6277d.m6774I(interfaceC10948a0, c10969l));
            C10959g c10959g = (C10959g) c6277d.f20385e;
            if (c10959g.m11591c() || c6277d.f20384d != 0) {
                return;
            } else {
                iM11614z = c10959g.m11614z();
            }
        } while (iM11614z == i10);
        c6277d.f20384d = iM11614z;
    }

    /* JADX INFO: renamed from: E */
    public final void m11485E(Object obj, int i10, C6277D c6277d, InterfaceC10948a0 interfaceC10948a0, C10969l c10969l) throws C10995y {
        int iM11614z;
        List listMo11437c = this.f32995l.mo11437c(i10 & 1048575, obj);
        int i11 = c6277d.f20382b;
        if ((i11 & 7) != 2) {
            throw C10997z.m11727b();
        }
        do {
            listMo11437c.add(c6277d.m6783R(interfaceC10948a0, c10969l));
            C10959g c10959g = (C10959g) c6277d.f20385e;
            if (c10959g.m11591c() || c6277d.f20384d != 0) {
                return;
            } else {
                iM11614z = c10959g.m11614z();
            }
        } while (iM11614z == i11);
        c6277d.f20384d = iM11614z;
    }

    /* JADX INFO: renamed from: F */
    public final void m11486F(int i10, C6277D c6277d, Object obj) {
        if ((536870912 & i10) != 0) {
            AbstractC10982r0.m11709r(i10 & 1048575, obj, c6277d.m6809i0());
        } else if (this.f32989f) {
            AbstractC10982r0.m11709r(i10 & 1048575, obj, c6277d.m6803f0());
        } else {
            AbstractC10982r0.m11709r(i10 & 1048575, obj, c6277d.m6816m());
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m11487G(int i10, C6277D c6277d, Object obj) throws C10995y, C11064z, C12178o0 {
        boolean z6 = (536870912 & i10) != 0;
        AbstractC10927F abstractC10927F = this.f32995l;
        if (z6) {
            c6277d.m6807h0(abstractC10927F.mo11437c(i10 & 1048575, obj), true);
        } else {
            c6277d.m6807h0(abstractC10927F.mo11437c(i10 & 1048575, obj), false);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m11488I(int i10, Object obj) {
        if (this.f32990g) {
            return;
        }
        int i11 = this.f32984a[i10 + 2];
        long j10 = i11 & 1048575;
        AbstractC10982r0.m11707p(j10, obj, AbstractC10982r0.f33089d.m11685g(j10, obj) | (1 << (i11 >>> 20)));
    }

    /* JADX INFO: renamed from: J */
    public final void m11489J(int i10, Object obj, int i11) {
        AbstractC10982r0.m11707p(this.f32984a[i11 + 2] & 1048575, obj, i10);
    }

    /* JADX INFO: renamed from: L */
    public final int m11490L(int i10) {
        return this.f32984a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: M */
    public final void m11491M(Object obj, C10930I c10930i) throws C10961h {
        int i10;
        boolean z6;
        int[] iArr = this.f32984a;
        int length = iArr.length;
        Unsafe unsafe = f32983p;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iM11490L = m11490L(i13);
            int i14 = iArr[i13];
            int iM11477K = m11477K(iM11490L);
            if (this.f32990g || iM11477K > 17) {
                i10 = 0;
            } else {
                int i15 = iArr[i13 + 2];
                int i16 = i15 & 1048575;
                if (i16 != i11) {
                    i12 = unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i10 = 1 << (i15 >>> 20);
            }
            long j10 = iM11490L & 1048575;
            switch (iM11477K) {
                case 0:
                    if ((i10 & i12) != 0) {
                        c10930i.m11442c(i14, AbstractC10982r0.f33089d.mo11676e(j10, obj));
                    }
                    break;
                case 1:
                    if ((i10 & i12) != 0) {
                        c10930i.m11446g(i14, AbstractC10982r0.f33089d.mo11677f(j10, obj));
                    }
                    break;
                case 2:
                    if ((i10 & i12) != 0) {
                        c10930i.m11449j(i14, unsafe.getLong(obj, j10));
                    }
                    break;
                case 3:
                    if ((i10 & i12) != 0) {
                        c10930i.m11456q(i14, unsafe.getLong(obj, j10));
                    }
                    break;
                case 4:
                    if ((i10 & i12) != 0) {
                        c10930i.m11448i(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 5:
                    if ((i10 & i12) != 0) {
                        c10930i.m11445f(i14, unsafe.getLong(obj, j10));
                    }
                    break;
                case 6:
                    if ((i10 & i12) != 0) {
                        c10930i.m11444e(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 7:
                    if ((i10 & i12) != 0) {
                        c10930i.m11440a(i14, AbstractC10982r0.f33089d.mo11674c(j10, obj));
                    }
                    break;
                case 8:
                    if ((i10 & i12) != 0) {
                        m11478O(i14, unsafe.getObject(obj, j10), c10930i);
                    }
                    break;
                case 9:
                    if ((i10 & i12) != 0) {
                        c10930i.m11450k(i14, unsafe.getObject(obj, j10), m11506n(i13));
                    }
                    break;
                case 10:
                    if ((i10 & i12) != 0) {
                        c10930i.m11441b(i14, (C10957f) unsafe.getObject(obj, j10));
                    }
                    break;
                case 11:
                    if ((i10 & i12) != 0) {
                        c10930i.m11455p(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 12:
                    if ((i10 & i12) != 0) {
                        c10930i.m11443d(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 13:
                    if ((i10 & i12) != 0) {
                        c10930i.m11451l(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 14:
                    if ((i10 & i12) != 0) {
                        c10930i.m11452m(i14, unsafe.getLong(obj, j10));
                    }
                    break;
                case 15:
                    if ((i10 & i12) != 0) {
                        c10930i.m11453n(i14, unsafe.getInt(obj, j10));
                    }
                    break;
                case 16:
                    if ((i10 & i12) != 0) {
                        c10930i.m11454o(i14, unsafe.getLong(obj, j10));
                    }
                    break;
                case 17:
                    if ((i10 & i12) != 0) {
                        c10930i.m11447h(i14, unsafe.getObject(obj, j10), m11506n(i13));
                    }
                    break;
                case 18:
                    AbstractC10950b0.m11530F(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, false);
                    break;
                case 19:
                    AbstractC10950b0.m11534J(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, false);
                    break;
                case 20:
                    AbstractC10950b0.m11537M(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, false);
                    break;
                case 21:
                    AbstractC10950b0.m11545U(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, false);
                    break;
                case 22:
                    AbstractC10950b0.m11536L(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, false);
                    break;
                case 23:
                    AbstractC10950b0.m11533I(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, false);
                    break;
                case 24:
                    AbstractC10950b0.m11532H(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, false);
                    break;
                case 25:
                    AbstractC10950b0.m11528D(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, false);
                    break;
                case 26:
                    AbstractC10950b0.m11543S(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i);
                    break;
                case 27:
                    AbstractC10950b0.m11538N(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, m11506n(i13));
                    break;
                case 28:
                    AbstractC10950b0.m11529E(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i);
                    break;
                case 29:
                    z6 = false;
                    AbstractC10950b0.m11544T(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, false);
                    break;
                case 30:
                    z6 = false;
                    AbstractC10950b0.m11531G(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, false);
                    break;
                case 31:
                    z6 = false;
                    AbstractC10950b0.m11539O(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, false);
                    break;
                case 32:
                    z6 = false;
                    AbstractC10950b0.m11540P(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, false);
                    break;
                case 33:
                    z6 = false;
                    AbstractC10950b0.m11541Q(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, false);
                    break;
                case 34:
                    z6 = false;
                    AbstractC10950b0.m11542R(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, false);
                    break;
                case 35:
                    AbstractC10950b0.m11530F(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, true);
                    break;
                case 36:
                    AbstractC10950b0.m11534J(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, true);
                    break;
                case 37:
                    AbstractC10950b0.m11537M(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, true);
                    break;
                case 38:
                    AbstractC10950b0.m11545U(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, true);
                    break;
                case 39:
                    AbstractC10950b0.m11536L(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, true);
                    break;
                case 40:
                    AbstractC10950b0.m11533I(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, true);
                    break;
                case 41:
                    AbstractC10950b0.m11532H(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, true);
                    break;
                case 42:
                    AbstractC10950b0.m11528D(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, true);
                    break;
                case 43:
                    AbstractC10950b0.m11544T(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, true);
                    break;
                case 44:
                    AbstractC10950b0.m11531G(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, true);
                    break;
                case 45:
                    AbstractC10950b0.m11539O(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, true);
                    break;
                case 46:
                    AbstractC10950b0.m11540P(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, true);
                    break;
                case 47:
                    AbstractC10950b0.m11541Q(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, true);
                    break;
                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                    AbstractC10950b0.m11542R(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, true);
                    break;
                case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                    AbstractC10950b0.m11535K(iArr[i13], (List) unsafe.getObject(obj, j10), c10930i, m11506n(i13));
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    m11492N(c10930i, i14, unsafe.getObject(obj, j10), i13);
                    break;
                case 51:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11442c(i14, ((Double) AbstractC10982r0.f33089d.m11687i(j10, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11446g(i14, ((Float) AbstractC10982r0.f33089d.m11687i(j10, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11449j(i14, m11475B(j10, obj));
                    }
                    break;
                case 54:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11456q(i14, m11475B(j10, obj));
                    }
                    break;
                case 55:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11448i(i14, m11474A(j10, obj));
                    }
                    break;
                case 56:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11445f(i14, m11475B(j10, obj));
                    }
                    break;
                case 57:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11444e(i14, m11474A(j10, obj));
                    }
                    break;
                case 58:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11440a(i14, ((Boolean) AbstractC10982r0.f33089d.m11687i(j10, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (m11510r(i14, obj, i13)) {
                        m11478O(i14, unsafe.getObject(obj, j10), c10930i);
                    }
                    break;
                case 60:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11450k(i14, unsafe.getObject(obj, j10), m11506n(i13));
                    }
                    break;
                case 61:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11441b(i14, (C10957f) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11455p(i14, m11474A(j10, obj));
                    }
                    break;
                case 63:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11443d(i14, m11474A(j10, obj));
                    }
                    break;
                case 64:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11451l(i14, m11474A(j10, obj));
                    }
                    break;
                case 65:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11452m(i14, m11475B(j10, obj));
                    }
                    break;
                case 66:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11453n(i14, m11474A(j10, obj));
                    }
                    break;
                case 67:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11454o(i14, m11475B(j10, obj));
                    }
                    break;
                case 68:
                    if (m11510r(i14, obj, i13)) {
                        c10930i.m11447h(i14, unsafe.getObject(obj, j10), m11506n(i13));
                    }
                    break;
                default:
                    break;
            }
        }
        this.f32996m.getClass();
        ((AbstractC10987u) obj).unknownFields.m11667d(c10930i);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0137  */
    /* JADX WARN: Code duplicated, block: B:48:0x0145  */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:50:0x0168  */
    /* JADX WARN: Code duplicated, block: B:51:0x016f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0178  */
    /* JADX WARN: Code duplicated, block: B:54:0x0184  */
    /* JADX WARN: Code duplicated, block: B:55:0x0190  */
    /* JADX WARN: Code duplicated, block: B:57:0x0194  */
    /* JADX WARN: Code duplicated, block: B:58:0x019c  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01de  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x0206  */
    /* JADX WARN: Code duplicated, block: B:78:0x013f A[SYNTHETIC] */
    /* JADX INFO: renamed from: N */
    public final void m11492N(C10930I c10930i, int i10, Object obj, int i11) throws C10961h {
        int iM11630O;
        int iMo11521a;
        int iM11628M;
        int i12;
        int iM11626K;
        C10994x0 c10994x0;
        int iMo11521a2;
        int iM11628M2;
        if (obj != null) {
            Object objM11505m = m11505m(i11);
            this.f32997n.getClass();
            C10931J c10931j = ((C10932K) objM11505m).f32975a;
            C10963i c10963i = (C10963i) c10930i.f32971a;
            c10963i.getClass();
            for (Map.Entry entry : ((C10933L) obj).entrySet()) {
                c10963i.m11654e0(i10, 2);
                Object key = entry.getKey();
                Object value = entry.getValue();
                int i13 = C10975o.f33074c;
                int iM11626K2 = C10963i.m11626K(1);
                C10992w0 c10992w0 = EnumC10998z0.f33102p0;
                C10990v0 c10990v0 = c10931j.f32972a;
                if (c10990v0 == c10992w0) {
                    iM11626K2 *= 2;
                }
                int iM11630O2 = 8;
                switch (c10990v0.ordinal()) {
                    case 0:
                        ((Double) key).getClass();
                        iM11630O = 8;
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key2 = entry.getKey();
                                Object value2 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key2);
                                C10975o.m11672b(c10963i, c10994x0, 2, value2);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key3 = entry.getKey();
                                Object value3 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key3);
                                C10975o.m11672b(c10963i, c10994x0, 2, value3);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key4 = entry.getKey();
                                Object value4 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key4);
                                C10975o.m11672b(c10963i, c10994x0, 2, value4);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key5 = entry.getKey();
                                Object value5 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key5);
                                C10975o.m11672b(c10963i, c10994x0, 2, value5);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key6 = entry.getKey();
                                Object value6 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key6);
                                C10975o.m11672b(c10963i, c10994x0, 2, value6);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key7 = entry.getKey();
                                Object value7 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key7);
                                C10975o.m11672b(c10963i, c10994x0, 2, value7);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key8 = entry.getKey();
                                Object value8 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key8);
                                C10975o.m11672b(c10963i, c10994x0, 2, value8);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key9 = entry.getKey();
                                Object value9 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key9);
                                C10975o.m11672b(c10963i, c10994x0, 2, value9);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key10 = entry.getKey();
                                Object value10 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key10);
                                C10975o.m11672b(c10963i, c10994x0, 2, value10);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11 = entry.getKey();
                                Object value11 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key12 = entry.getKey();
                                Object value12 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key12);
                                C10975o.m11672b(c10963i, c10994x0, 2, value12);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key13 = entry.getKey();
                                Object value13 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key13);
                                C10975o.m11672b(c10963i, c10994x0, 2, value13);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key14 = entry.getKey();
                                Object value14 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key14);
                                C10975o.m11672b(c10963i, c10994x0, 2, value14);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key15 = entry.getKey();
                                Object value15 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key15);
                                C10975o.m11672b(c10963i, c10994x0, 2, value15);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key16 = entry.getKey();
                                Object value16 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key16);
                                C10975o.m11672b(c10963i, c10994x0, 2, value16);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key17 = entry.getKey();
                                Object value17 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key17);
                                C10975o.m11672b(c10963i, c10994x0, 2, value17);
                                break;
                            case 16:
                                int iIntValue = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue >> 31) ^ (iIntValue << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key18 = entry.getKey();
                                Object value18 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key18);
                                C10975o.m11672b(c10963i, c10994x0, 2, value18);
                                break;
                            case 17:
                                long jLongValue = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue << 1) ^ (jLongValue >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key19 = entry.getKey();
                                Object value19 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key19);
                                C10975o.m11672b(c10963i, c10994x0, 2, value19);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 1:
                        ((Float) key).getClass();
                        iM11630O = 4;
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key110 = entry.getKey();
                                Object value110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111 = entry.getKey();
                                Object value111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key112 = entry.getKey();
                                Object value112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value112);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key113 = entry.getKey();
                                Object value113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value113);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key114 = entry.getKey();
                                Object value114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key115 = entry.getKey();
                                Object value115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key116 = entry.getKey();
                                Object value116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key117 = entry.getKey();
                                Object value117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value117);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key118 = entry.getKey();
                                Object value118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value118);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key119 = entry.getKey();
                                Object value119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value119);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1110 = entry.getKey();
                                Object value1110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1110);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111 = entry.getKey();
                                Object value1111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1112 = entry.getKey();
                                Object value1112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1112);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1113 = entry.getKey();
                                Object value1113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1114 = entry.getKey();
                                Object value1114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1115 = entry.getKey();
                                Object value1115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1115);
                                break;
                            case 16:
                                int iIntValue2 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1116 = entry.getKey();
                                Object value1116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1116);
                                break;
                            case 17:
                                long jLongValue2 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue2 << 1) ^ (jLongValue2 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1117 = entry.getKey();
                                Object value1117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 2:
                        iM11630O = C10963i.m11630O(((Long) key).longValue());
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1118 = entry.getKey();
                                Object value1118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1119 = entry.getKey();
                                Object value1119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1119);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11110 = entry.getKey();
                                Object value11110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11110);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111 = entry.getKey();
                                Object value11111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11112 = entry.getKey();
                                Object value11112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11113 = entry.getKey();
                                Object value11113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11114 = entry.getKey();
                                Object value11114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11115 = entry.getKey();
                                Object value11115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11115);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11116 = entry.getKey();
                                Object value11116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11116);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11117 = entry.getKey();
                                Object value11117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11117);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11118 = entry.getKey();
                                Object value11118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11118);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11119 = entry.getKey();
                                Object value11119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11119);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111110 = entry.getKey();
                                Object value111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111110);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111 = entry.getKey();
                                Object value111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111112 = entry.getKey();
                                Object value111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111113 = entry.getKey();
                                Object value111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111113);
                                break;
                            case 16:
                                int iIntValue3 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111114 = entry.getKey();
                                Object value111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111114);
                                break;
                            case 17:
                                long jLongValue3 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue3 << 1) ^ (jLongValue3 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111115 = entry.getKey();
                                Object value111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 3:
                        iM11630O = C10963i.m11630O(((Long) key).longValue());
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111116 = entry.getKey();
                                Object value111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111116);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111117 = entry.getKey();
                                Object value111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111117);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111118 = entry.getKey();
                                Object value111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111118);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111119 = entry.getKey();
                                Object value111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111119);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111110 = entry.getKey();
                                Object value1111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111110);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111 = entry.getKey();
                                Object value1111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111112 = entry.getKey();
                                Object value1111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111112);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111113 = entry.getKey();
                                Object value1111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111113);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111114 = entry.getKey();
                                Object value1111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111114);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111115 = entry.getKey();
                                Object value1111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111115);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111116 = entry.getKey();
                                Object value1111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111116);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111117 = entry.getKey();
                                Object value1111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111117);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111118 = entry.getKey();
                                Object value1111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111118);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111119 = entry.getKey();
                                Object value1111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111119);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111110 = entry.getKey();
                                Object value11111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111110);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111 = entry.getKey();
                                Object value11111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111);
                                break;
                            case 16:
                                int iIntValue4 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111112 = entry.getKey();
                                Object value11111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111112);
                                break;
                            case 17:
                                long jLongValue4 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue4 << 1) ^ (jLongValue4 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111113 = entry.getKey();
                                Object value11111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111113);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 4:
                        iM11630O = C10963i.m11618C(((Integer) key).intValue());
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111114 = entry.getKey();
                                Object value11111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111114);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111115 = entry.getKey();
                                Object value11111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111115);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111116 = entry.getKey();
                                Object value11111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111116);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111117 = entry.getKey();
                                Object value11111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111117);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111118 = entry.getKey();
                                Object value11111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111118);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111119 = entry.getKey();
                                Object value11111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111119);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111110 = entry.getKey();
                                Object value111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111110);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111 = entry.getKey();
                                Object value111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111112 = entry.getKey();
                                Object value111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111112);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111113 = entry.getKey();
                                Object value111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111113);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111114 = entry.getKey();
                                Object value111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111114);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111115 = entry.getKey();
                                Object value111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111115);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111116 = entry.getKey();
                                Object value111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111116);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111117 = entry.getKey();
                                Object value111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111117);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111118 = entry.getKey();
                                Object value111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111118);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111119 = entry.getKey();
                                Object value111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111119);
                                break;
                            case 16:
                                int iIntValue5 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111110 = entry.getKey();
                                Object value1111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111110);
                                break;
                            case 17:
                                long jLongValue5 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue5 << 1) ^ (jLongValue5 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111 = entry.getKey();
                                Object value1111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 5:
                        ((Long) key).getClass();
                        iM11630O = 8;
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111112 = entry.getKey();
                                Object value1111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111112);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111113 = entry.getKey();
                                Object value1111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111113);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111114 = entry.getKey();
                                Object value1111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111114);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111115 = entry.getKey();
                                Object value1111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111115);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111116 = entry.getKey();
                                Object value1111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111116);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111117 = entry.getKey();
                                Object value1111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111117);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111118 = entry.getKey();
                                Object value1111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111118);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111119 = entry.getKey();
                                Object value1111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111119);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111110 = entry.getKey();
                                Object value11111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111110);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111 = entry.getKey();
                                Object value11111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111112 = entry.getKey();
                                Object value11111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111112);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111113 = entry.getKey();
                                Object value11111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111113);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111114 = entry.getKey();
                                Object value11111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111114);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111115 = entry.getKey();
                                Object value11111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111115);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111116 = entry.getKey();
                                Object value11111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111116);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111117 = entry.getKey();
                                Object value11111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111117);
                                break;
                            case 16:
                                int iIntValue6 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111118 = entry.getKey();
                                Object value11111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111118);
                                break;
                            case 17:
                                long jLongValue6 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue6 << 1) ^ (jLongValue6 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111119 = entry.getKey();
                                Object value11111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111119);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 6:
                        ((Integer) key).getClass();
                        iM11630O = 4;
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111110 = entry.getKey();
                                Object value111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111 = entry.getKey();
                                Object value111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111112 = entry.getKey();
                                Object value111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111112);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111113 = entry.getKey();
                                Object value111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111113);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111114 = entry.getKey();
                                Object value111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111115 = entry.getKey();
                                Object value111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111116 = entry.getKey();
                                Object value111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111117 = entry.getKey();
                                Object value111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111117);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111118 = entry.getKey();
                                Object value111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111118);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111119 = entry.getKey();
                                Object value111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111119);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111110 = entry.getKey();
                                Object value1111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111110);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111 = entry.getKey();
                                Object value1111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111112 = entry.getKey();
                                Object value1111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111112);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111113 = entry.getKey();
                                Object value1111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111114 = entry.getKey();
                                Object value1111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111115 = entry.getKey();
                                Object value1111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111115);
                                break;
                            case 16:
                                int iIntValue7 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111116 = entry.getKey();
                                Object value1111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111116);
                                break;
                            case 17:
                                long jLongValue7 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue7 << 1) ^ (jLongValue7 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111117 = entry.getKey();
                                Object value1111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 7:
                        ((Boolean) key).getClass();
                        iM11630O = 1;
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111118 = entry.getKey();
                                Object value1111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111119 = entry.getKey();
                                Object value1111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111119);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111110 = entry.getKey();
                                Object value11111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111110);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111 = entry.getKey();
                                Object value11111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111112 = entry.getKey();
                                Object value11111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111113 = entry.getKey();
                                Object value11111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111114 = entry.getKey();
                                Object value11111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111115 = entry.getKey();
                                Object value11111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111115);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111116 = entry.getKey();
                                Object value11111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111116);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111117 = entry.getKey();
                                Object value11111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111117);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111118 = entry.getKey();
                                Object value11111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111118);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111119 = entry.getKey();
                                Object value11111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111119);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111110 = entry.getKey();
                                Object value111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111110);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111 = entry.getKey();
                                Object value111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111112 = entry.getKey();
                                Object value111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111113 = entry.getKey();
                                Object value111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111113);
                                break;
                            case 16:
                                int iIntValue8 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111114 = entry.getKey();
                                Object value111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111114);
                                break;
                            case 17:
                                long jLongValue8 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue8 << 1) ^ (jLongValue8 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111115 = entry.getKey();
                                Object value111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 8:
                        iM11630O = key instanceof C10957f ? C10963i.m11633u((C10957f) key) : C10963i.m11625J((String) key);
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111116 = entry.getKey();
                                Object value111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111116);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111117 = entry.getKey();
                                Object value111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111117);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111118 = entry.getKey();
                                Object value111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111118);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111119 = entry.getKey();
                                Object value111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111119);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111110 = entry.getKey();
                                Object value1111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111110);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111 = entry.getKey();
                                Object value1111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111112 = entry.getKey();
                                Object value1111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111112);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111113 = entry.getKey();
                                Object value1111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111113);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111114 = entry.getKey();
                                Object value1111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111114);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111115 = entry.getKey();
                                Object value1111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111115);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111116 = entry.getKey();
                                Object value1111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111116);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111117 = entry.getKey();
                                Object value1111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111117);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111118 = entry.getKey();
                                Object value1111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111118);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111119 = entry.getKey();
                                Object value1111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111119);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111110 = entry.getKey();
                                Object value11111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111110);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111 = entry.getKey();
                                Object value11111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111);
                                break;
                            case 16:
                                int iIntValue9 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111112 = entry.getKey();
                                Object value11111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111112);
                                break;
                            case 17:
                                long jLongValue9 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue9 << 1) ^ (jLongValue9 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111113 = entry.getKey();
                                Object value11111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111113);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 9:
                        iM11630O = ((AbstractC10947a) key).mo11521a();
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111114 = entry.getKey();
                                Object value11111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111114);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111115 = entry.getKey();
                                Object value11111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111115);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111116 = entry.getKey();
                                Object value11111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111116);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111117 = entry.getKey();
                                Object value11111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111117);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111118 = entry.getKey();
                                Object value11111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111118);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111119 = entry.getKey();
                                Object value11111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111119);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111110 = entry.getKey();
                                Object value111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111110);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111 = entry.getKey();
                                Object value111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111112 = entry.getKey();
                                Object value111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111112);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111113 = entry.getKey();
                                Object value111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111113);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111114 = entry.getKey();
                                Object value111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111114);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111115 = entry.getKey();
                                Object value111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111115);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111116 = entry.getKey();
                                Object value111111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111116);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111117 = entry.getKey();
                                Object value111111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111117);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111118 = entry.getKey();
                                Object value111111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111118);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111119 = entry.getKey();
                                Object value111111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111119);
                                break;
                            case 16:
                                int iIntValue10 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111110 = entry.getKey();
                                Object value1111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111110);
                                break;
                            case 17:
                                long jLongValue10 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue10 << 1) ^ (jLongValue10 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111 = entry.getKey();
                                Object value1111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 10:
                        iMo11521a = ((AbstractC10947a) key).mo11521a();
                        iM11628M = C10963i.m11628M(iMo11521a);
                        iM11630O = iMo11521a + iM11628M;
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111112 = entry.getKey();
                                Object value1111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111112);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111113 = entry.getKey();
                                Object value1111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111113);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111114 = entry.getKey();
                                Object value1111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111114);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111115 = entry.getKey();
                                Object value1111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111115);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111116 = entry.getKey();
                                Object value1111111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111116);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111117 = entry.getKey();
                                Object value1111111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111117);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111118 = entry.getKey();
                                Object value1111111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111118);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111119 = entry.getKey();
                                Object value1111111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111119);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111110 = entry.getKey();
                                Object value11111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111110);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111 = entry.getKey();
                                Object value11111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111112 = entry.getKey();
                                Object value11111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111112);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111113 = entry.getKey();
                                Object value11111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111113);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111114 = entry.getKey();
                                Object value11111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111114);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111115 = entry.getKey();
                                Object value11111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111115);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111116 = entry.getKey();
                                Object value11111111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111116);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111117 = entry.getKey();
                                Object value11111111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111117);
                                break;
                            case 16:
                                int iIntValue11 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111118 = entry.getKey();
                                Object value11111111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111118);
                                break;
                            case 17:
                                long jLongValue11 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue11 << 1) ^ (jLongValue11 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111119 = entry.getKey();
                                Object value11111111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111119);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 11:
                        if (key instanceof C10957f) {
                            iM11630O = C10963i.m11633u((C10957f) key);
                        } else {
                            iMo11521a = ((byte[]) key).length;
                            iM11628M = C10963i.m11628M(iMo11521a);
                            iM11630O = iMo11521a + iM11628M;
                        }
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111110 = entry.getKey();
                                Object value111111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111 = entry.getKey();
                                Object value111111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111112 = entry.getKey();
                                Object value111111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111112);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111113 = entry.getKey();
                                Object value111111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111113);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111114 = entry.getKey();
                                Object value111111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111115 = entry.getKey();
                                Object value111111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111116 = entry.getKey();
                                Object value111111111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111117 = entry.getKey();
                                Object value111111111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111117);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111118 = entry.getKey();
                                Object value111111111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111118);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111119 = entry.getKey();
                                Object value111111111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111119);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111110 = entry.getKey();
                                Object value1111111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111110);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111112 = entry.getKey();
                                Object value1111111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111112);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111113 = entry.getKey();
                                Object value1111111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111114 = entry.getKey();
                                Object value1111111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111115 = entry.getKey();
                                Object value1111111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111115);
                                break;
                            case 16:
                                int iIntValue12 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111116 = entry.getKey();
                                Object value1111111111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111116);
                                break;
                            case 17:
                                long jLongValue12 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue12 << 1) ^ (jLongValue12 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111117 = entry.getKey();
                                Object value1111111111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 12:
                        iM11630O = C10963i.m11628M(((Integer) key).intValue());
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111118 = entry.getKey();
                                Object value1111111111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111119 = entry.getKey();
                                Object value1111111111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111119);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111110 = entry.getKey();
                                Object value11111111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111110);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111112 = entry.getKey();
                                Object value11111111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111113 = entry.getKey();
                                Object value11111111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111114 = entry.getKey();
                                Object value11111111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111115 = entry.getKey();
                                Object value11111111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111115);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111116 = entry.getKey();
                                Object value11111111111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111116);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111117 = entry.getKey();
                                Object value11111111111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111117);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111118 = entry.getKey();
                                Object value11111111111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111118);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111119 = entry.getKey();
                                Object value11111111111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111119);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111110);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111113);
                                break;
                            case 16:
                                int iIntValue13 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111114);
                                break;
                            case 17:
                                long jLongValue13 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue13 << 1) ^ (jLongValue13 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 13:
                        iM11630O = C10963i.m11618C(((Integer) key).intValue());
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111116);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111117);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111118);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111119);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111110);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111112);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111113);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111114);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111115);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111116);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111117);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111118);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111119);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111110);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111);
                                break;
                            case 16:
                                int iIntValue14 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111112);
                                break;
                            case 17:
                                long jLongValue14 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue14 << 1) ^ (jLongValue14 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111113);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 14:
                        ((Integer) key).getClass();
                        iM11630O = 4;
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111114);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111115);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111116);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111117);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111118);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111119);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111110);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111112);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111113);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111114);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111115);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111116);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111117);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111118);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111119);
                                break;
                            case 16:
                                int iIntValue15 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111110);
                                break;
                            case 17:
                                long jLongValue15 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue15 << 1) ^ (jLongValue15 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111111);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 15:
                        ((Long) key).getClass();
                        iM11630O = 8;
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111112);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111113);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111114);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111115);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111116);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111117);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111118);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111119);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111110);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111111);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111112);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111113);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111114);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111115);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111116);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111117);
                                break;
                            case 16:
                                int iIntValue16 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111118);
                                break;
                            case 17:
                                long jLongValue16 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue16 << 1) ^ (jLongValue16 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111119);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 16:
                        int iIntValue17 = ((Integer) key).intValue();
                        iM11630O = C10963i.m11628M((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111111);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111112);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111113);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111117);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111118);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111119);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111111110);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111111111);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111111112);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111111113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111111114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111111115);
                                break;
                            case 16:
                                int iIntValue18 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111111116);
                                break;
                            case 17:
                                long jLongValue17 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue17 << 1) ^ (jLongValue17 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111111117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 17:
                        long jLongValue18 = ((Long) key).longValue();
                        iM11630O = C10963i.m11630O((jLongValue18 << 1) ^ (jLongValue18 >> 63));
                        i12 = iM11630O + iM11626K2;
                        iM11626K = C10963i.m11626K(2);
                        c10994x0 = c10931j.f32973b;
                        if (c10994x0 == c10992w0) {
                            iM11626K *= 2;
                        }
                        switch (c10994x0.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111111118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key1111111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key1111111111111111111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value1111111111111111111111111111119);
                                break;
                            case 2:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111111110);
                                break;
                            case 3:
                                iM11630O2 = C10963i.m11630O(((Long) value).longValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111111111);
                                break;
                            case 4:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111111112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111111113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111111114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iM11630O2 = 1;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111111115);
                                break;
                            case 8:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iM11630O2 = C10963i.m11625J((String) value);
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111111116 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111111116);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111111116);
                                break;
                            case 9:
                                iM11630O2 = ((AbstractC10947a) value).mo11521a();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111111117 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111111117);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111111117);
                                break;
                            case 10:
                                iMo11521a2 = ((AbstractC10947a) value).mo11521a();
                                iM11628M2 = C10963i.m11628M(iMo11521a2);
                                iM11630O2 = iM11628M2 + iMo11521a2;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111111118 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111111118);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111111118);
                                break;
                            case 11:
                                if (value instanceof C10957f) {
                                    iM11630O2 = C10963i.m11633u((C10957f) value);
                                } else {
                                    iMo11521a2 = ((byte[]) value).length;
                                    iM11628M2 = C10963i.m11628M(iMo11521a2);
                                    iM11630O2 = iM11628M2 + iMo11521a2;
                                }
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key11111111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111111119 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key11111111111111111111111111111119);
                                C10975o.m11672b(c10963i, c10994x0, 2, value11111111111111111111111111111119);
                                break;
                            case 12:
                                iM11630O2 = C10963i.m11628M(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111111110 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111111110);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111111110);
                                break;
                            case 13:
                                iM11630O2 = C10963i.m11618C(((Integer) value).intValue());
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111111 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111111111);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iM11630O2 = 4;
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111111112 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111111112);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111111113 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111111113);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111111113);
                                break;
                            case 16:
                                int iIntValue19 = ((Integer) value).intValue();
                                iM11630O2 = C10963i.m11628M((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111111114 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111111114);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111111114);
                                break;
                            case 17:
                                long jLongValue19 = ((Long) value).longValue();
                                iM11630O2 = C10963i.m11630O((jLongValue19 << 1) ^ (jLongValue19 >> 63));
                                c10963i.m11656g0(iM11630O2 + iM11626K + i12);
                                Object key111111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111111115 = entry.getValue();
                                C10975o.m11672b(c10963i, c10990v0, 1, key111111111111111111111111111111115);
                                C10975o.m11672b(c10963i, c10994x0, 2, value111111111111111111111111111111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: a */
    public final void mo11493a(Object obj) {
        int[] iArr;
        int i10;
        int i11 = this.f32992i;
        while (true) {
            iArr = this.f32991h;
            i10 = this.f32993j;
            if (i11 >= i10) {
                break;
            }
            long jM11490L = m11490L(iArr[i11]) & 1048575;
            Object objM11687i = AbstractC10982r0.f33089d.m11687i(jM11490L, obj);
            if (objM11687i != null) {
                this.f32997n.getClass();
                ((C10933L) objM11687i).f32977Y = false;
                AbstractC10982r0.m11709r(jM11490L, obj, objM11687i);
            }
            i11++;
        }
        int length = iArr.length;
        while (i10 < length) {
            this.f32995l.mo11435a(iArr[i10], obj);
            i10++;
        }
        this.f32996m.getClass();
        ((AbstractC10987u) obj).unknownFields.f33064e = false;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fc A[LOOP:2: B:60:0x00eb->B:65:0x00fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0121 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: b */
    public final boolean mo11494b(Object obj) {
        int i10;
        List list;
        InterfaceC10948a0 interfaceC10948a0M11506n;
        int i11;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean zM11509q = true;
            if (i13 >= this.f32992i) {
                return true;
            }
            int i15 = this.f32991h[i13];
            int[] iArr = this.f32984a;
            int i16 = iArr[i15];
            int iM11490L = m11490L(i15);
            boolean z6 = this.f32990g;
            if (z6) {
                i10 = 0;
            } else {
                int i17 = iArr[i15 + 2];
                int i18 = i17 & 1048575;
                i10 = 1 << (i17 >>> 20);
                if (i18 != i12) {
                    i14 = f32983p.getInt(obj, i18);
                    i12 = i18;
                }
            }
            if ((268435456 & iM11490L) != 0) {
                if (!(z6 ? m11509q(i15, obj) : (i14 & i10) != 0)) {
                    return false;
                }
            }
            int iM11477K = m11477K(iM11490L);
            if (iM11477K == 9 || iM11477K == 17) {
                if (z6) {
                    zM11509q = m11509q(i15, obj);
                } else if ((i10 & i14) == 0) {
                    zM11509q = false;
                }
                if (zM11509q) {
                    if (!m11506n(i15).mo11494b(AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iM11477K == 27) {
                list = (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC10948a0M11506n = m11506n(i15);
                    for (i11 = 0; i11 < list.size(); i11++) {
                        if (!interfaceC10948a0M11506n.mo11494b(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iM11477K == 60 || iM11477K == 68) {
                if (m11510r(i16, obj, i15)) {
                    if (!m11506n(i15).mo11494b(AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iM11477K == 49) {
                list = (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC10948a0M11506n = m11506n(i15);
                    while (i11 < list.size()) {
                        if (!interfaceC10948a0M11506n.mo11494b(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iM11477K != 50) {
                continue;
            } else {
                Object objM11687i = AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj);
                this.f32997n.getClass();
                C10933L c10933l = (C10933L) objM11687i;
                if (!c10933l.isEmpty() && ((C10932K) m11505m(i15)).f32975a.f32973b.f33105Y == EnumC10922A0.MESSAGE) {
                    InterfaceC10948a0 interfaceC10948a0M11515a = null;
                    for (Object obj2 : c10933l.values()) {
                        if (interfaceC10948a0M11515a == null) {
                            interfaceC10948a0M11515a = C10944X.f33003c.m11515a(obj2.getClass());
                        }
                        if (!interfaceC10948a0M11515a.mo11494b(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: c */
    public final Object mo11495c() {
        this.f32994k.getClass();
        return ((AbstractC10987u) this.f32988e).mo7129d(4);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: d */
    public final void mo11496d(Object obj, C10930I c10930i) throws C10961h {
        c10930i.getClass();
        if (!this.f32990g) {
            m11491M(obj, c10930i);
            return;
        }
        int[] iArr = this.f32984a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iM11490L = m11490L(i10);
            int i11 = iArr[i10];
            switch (m11477K(iM11490L)) {
                case 0:
                    if (m11509q(i10, obj)) {
                        c10930i.m11442c(i11, AbstractC10982r0.f33089d.mo11676e(iM11490L & 1048575, obj));
                    }
                    break;
                case 1:
                    if (m11509q(i10, obj)) {
                        c10930i.m11446g(i11, AbstractC10982r0.f33089d.mo11677f(iM11490L & 1048575, obj));
                    }
                    break;
                case 2:
                    if (m11509q(i10, obj)) {
                        c10930i.m11449j(i11, AbstractC10982r0.f33089d.m11686h(iM11490L & 1048575, obj));
                    }
                    break;
                case 3:
                    if (m11509q(i10, obj)) {
                        c10930i.m11456q(i11, AbstractC10982r0.f33089d.m11686h(iM11490L & 1048575, obj));
                    }
                    break;
                case 4:
                    if (m11509q(i10, obj)) {
                        c10930i.m11448i(i11, AbstractC10982r0.f33089d.m11685g(iM11490L & 1048575, obj));
                    }
                    break;
                case 5:
                    if (m11509q(i10, obj)) {
                        c10930i.m11445f(i11, AbstractC10982r0.f33089d.m11686h(iM11490L & 1048575, obj));
                    }
                    break;
                case 6:
                    if (m11509q(i10, obj)) {
                        c10930i.m11444e(i11, AbstractC10982r0.f33089d.m11685g(iM11490L & 1048575, obj));
                    }
                    break;
                case 7:
                    if (m11509q(i10, obj)) {
                        c10930i.m11440a(i11, AbstractC10982r0.f33089d.mo11674c(iM11490L & 1048575, obj));
                    }
                    break;
                case 8:
                    if (m11509q(i10, obj)) {
                        m11478O(i11, AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i);
                    }
                    break;
                case 9:
                    if (m11509q(i10, obj)) {
                        c10930i.m11450k(i11, AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), m11506n(i10));
                    }
                    break;
                case 10:
                    if (m11509q(i10, obj)) {
                        c10930i.m11441b(i11, (C10957f) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj));
                    }
                    break;
                case 11:
                    if (m11509q(i10, obj)) {
                        c10930i.m11455p(i11, AbstractC10982r0.f33089d.m11685g(iM11490L & 1048575, obj));
                    }
                    break;
                case 12:
                    if (m11509q(i10, obj)) {
                        c10930i.m11443d(i11, AbstractC10982r0.f33089d.m11685g(iM11490L & 1048575, obj));
                    }
                    break;
                case 13:
                    if (m11509q(i10, obj)) {
                        c10930i.m11451l(i11, AbstractC10982r0.f33089d.m11685g(iM11490L & 1048575, obj));
                    }
                    break;
                case 14:
                    if (m11509q(i10, obj)) {
                        c10930i.m11452m(i11, AbstractC10982r0.f33089d.m11686h(iM11490L & 1048575, obj));
                    }
                    break;
                case 15:
                    if (m11509q(i10, obj)) {
                        c10930i.m11453n(i11, AbstractC10982r0.f33089d.m11685g(iM11490L & 1048575, obj));
                    }
                    break;
                case 16:
                    if (m11509q(i10, obj)) {
                        c10930i.m11454o(i11, AbstractC10982r0.f33089d.m11686h(iM11490L & 1048575, obj));
                    }
                    break;
                case 17:
                    if (m11509q(i10, obj)) {
                        c10930i.m11447h(i11, AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), m11506n(i10));
                    }
                    break;
                case 18:
                    AbstractC10950b0.m11530F(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, false);
                    break;
                case 19:
                    AbstractC10950b0.m11534J(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, false);
                    break;
                case 20:
                    AbstractC10950b0.m11537M(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, false);
                    break;
                case 21:
                    AbstractC10950b0.m11545U(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, false);
                    break;
                case 22:
                    AbstractC10950b0.m11536L(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, false);
                    break;
                case 23:
                    AbstractC10950b0.m11533I(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, false);
                    break;
                case 24:
                    AbstractC10950b0.m11532H(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, false);
                    break;
                case 25:
                    AbstractC10950b0.m11528D(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, false);
                    break;
                case 26:
                    AbstractC10950b0.m11543S(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i);
                    break;
                case 27:
                    AbstractC10950b0.m11538N(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, m11506n(i10));
                    break;
                case 28:
                    AbstractC10950b0.m11529E(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i);
                    break;
                case 29:
                    AbstractC10950b0.m11544T(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, false);
                    break;
                case 30:
                    AbstractC10950b0.m11531G(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, false);
                    break;
                case 31:
                    AbstractC10950b0.m11539O(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, false);
                    break;
                case 32:
                    AbstractC10950b0.m11540P(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, false);
                    break;
                case 33:
                    AbstractC10950b0.m11541Q(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, false);
                    break;
                case 34:
                    AbstractC10950b0.m11542R(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, false);
                    break;
                case 35:
                    AbstractC10950b0.m11530F(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, true);
                    break;
                case 36:
                    AbstractC10950b0.m11534J(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, true);
                    break;
                case 37:
                    AbstractC10950b0.m11537M(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, true);
                    break;
                case 38:
                    AbstractC10950b0.m11545U(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, true);
                    break;
                case 39:
                    AbstractC10950b0.m11536L(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, true);
                    break;
                case 40:
                    AbstractC10950b0.m11533I(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, true);
                    break;
                case 41:
                    AbstractC10950b0.m11532H(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, true);
                    break;
                case 42:
                    AbstractC10950b0.m11528D(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, true);
                    break;
                case 43:
                    AbstractC10950b0.m11544T(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, true);
                    break;
                case 44:
                    AbstractC10950b0.m11531G(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, true);
                    break;
                case 45:
                    AbstractC10950b0.m11539O(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, true);
                    break;
                case 46:
                    AbstractC10950b0.m11540P(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, true);
                    break;
                case 47:
                    AbstractC10950b0.m11541Q(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, true);
                    break;
                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                    AbstractC10950b0.m11542R(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, true);
                    break;
                case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                    AbstractC10950b0.m11535K(iArr[i10], (List) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i, m11506n(i10));
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    m11492N(c10930i, i11, AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), i10);
                    break;
                case 51:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11442c(i11, ((Double) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11446g(i11, ((Float) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11449j(i11, m11475B(iM11490L & 1048575, obj));
                    }
                    break;
                case 54:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11456q(i11, m11475B(iM11490L & 1048575, obj));
                    }
                    break;
                case 55:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11448i(i11, m11474A(iM11490L & 1048575, obj));
                    }
                    break;
                case 56:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11445f(i11, m11475B(iM11490L & 1048575, obj));
                    }
                    break;
                case 57:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11444e(i11, m11474A(iM11490L & 1048575, obj));
                    }
                    break;
                case 58:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11440a(i11, ((Boolean) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (m11510r(i11, obj, i10)) {
                        m11478O(i11, AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), c10930i);
                    }
                    break;
                case 60:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11450k(i11, AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), m11506n(i10));
                    }
                    break;
                case 61:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11441b(i11, (C10957f) AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj));
                    }
                    break;
                case 62:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11455p(i11, m11474A(iM11490L & 1048575, obj));
                    }
                    break;
                case 63:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11443d(i11, m11474A(iM11490L & 1048575, obj));
                    }
                    break;
                case 64:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11451l(i11, m11474A(iM11490L & 1048575, obj));
                    }
                    break;
                case 65:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11452m(i11, m11475B(iM11490L & 1048575, obj));
                    }
                    break;
                case 66:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11453n(i11, m11474A(iM11490L & 1048575, obj));
                    }
                    break;
                case 67:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11454o(i11, m11475B(iM11490L & 1048575, obj));
                    }
                    break;
                case 68:
                    if (m11510r(i11, obj, i10)) {
                        c10930i.m11447h(i11, AbstractC10982r0.f33089d.m11687i(iM11490L & 1048575, obj), m11506n(i10));
                    }
                    break;
            }
        }
        this.f32996m.getClass();
        ((AbstractC10987u) obj).unknownFields.m11667d(c10930i);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: e */
    public final int mo11497e(AbstractC10947a abstractC10947a) {
        return this.f32990g ? m11508p(abstractC10947a) : m11507o(abstractC10947a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: f */
    public final void mo11498f(Object obj, C6277D c6277d, C10969l c10969l) throws Throwable {
        c10969l.getClass();
        m11511t(this.f32996m, obj, c6277d, c10969l);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: g */
    public final void mo11499g(AbstractC10987u abstractC10987u, AbstractC10987u abstractC10987u2) {
        abstractC10987u2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f32984a;
            if (i10 >= iArr.length) {
                if (this.f32990g) {
                    return;
                }
                AbstractC10950b0.m11526B(this.f32996m, abstractC10987u, abstractC10987u2);
                return;
            }
            int iM11490L = m11490L(i10);
            long j10 = 1048575 & iM11490L;
            int i11 = iArr[i10];
            switch (m11477K(iM11490L)) {
                case 0:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10980q0 abstractC10980q0 = AbstractC10982r0.f33089d;
                        abstractC10980q0.mo11680m(abstractC10987u, j10, abstractC10980q0.mo11676e(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 1:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10980q0 abstractC10980q1 = AbstractC10982r0.f33089d;
                        abstractC10980q1.mo11681n(abstractC10987u, j10, abstractC10980q1.mo11677f(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 2:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10982r0.m11708q(abstractC10987u, j10, AbstractC10982r0.f33089d.m11686h(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 3:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10982r0.m11708q(abstractC10987u, j10, AbstractC10982r0.f33089d.m11686h(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 4:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10982r0.m11707p(j10, abstractC10987u, AbstractC10982r0.f33089d.m11685g(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 5:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10982r0.m11708q(abstractC10987u, j10, AbstractC10982r0.f33089d.m11686h(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 6:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10982r0.m11707p(j10, abstractC10987u, AbstractC10982r0.f33089d.m11685g(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 7:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10980q0 abstractC10980q2 = AbstractC10982r0.f33089d;
                        abstractC10980q2.mo11678k(abstractC10987u, j10, abstractC10980q2.mo11674c(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 8:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10982r0.m11709r(j10, abstractC10987u, AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 9:
                    m11513v(abstractC10987u, abstractC10987u2, i10);
                    break;
                case 10:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10982r0.m11709r(j10, abstractC10987u, AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 11:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10982r0.m11707p(j10, abstractC10987u, AbstractC10982r0.f33089d.m11685g(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 12:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10982r0.m11707p(j10, abstractC10987u, AbstractC10982r0.f33089d.m11685g(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 13:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10982r0.m11707p(j10, abstractC10987u, AbstractC10982r0.f33089d.m11685g(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 14:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10982r0.m11708q(abstractC10987u, j10, AbstractC10982r0.f33089d.m11686h(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 15:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10982r0.m11707p(j10, abstractC10987u, AbstractC10982r0.f33089d.m11685g(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 16:
                    if (m11509q(i10, abstractC10987u2)) {
                        AbstractC10982r0.m11708q(abstractC10987u, j10, AbstractC10982r0.f33089d.m11686h(j10, abstractC10987u2));
                        m11488I(i10, abstractC10987u);
                    }
                    break;
                case 17:
                    m11513v(abstractC10987u, abstractC10987u2, i10);
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
                    this.f32995l.mo11436b(abstractC10987u, abstractC10987u2, j10);
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    Class cls = AbstractC10950b0.f33014a;
                    AbstractC10980q0 abstractC10980q3 = AbstractC10982r0.f33089d;
                    Object objM11687i = abstractC10980q3.m11687i(j10, abstractC10987u);
                    Object objM11687i2 = abstractC10980q3.m11687i(j10, abstractC10987u2);
                    this.f32997n.getClass();
                    AbstractC10982r0.m11709r(j10, abstractC10987u, C10934M.m11460b(objM11687i, objM11687i2));
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
                    if (m11510r(i11, abstractC10987u2, i10)) {
                        AbstractC10982r0.m11709r(j10, abstractC10987u, AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u2));
                        m11489J(i11, abstractC10987u, i10);
                    }
                    break;
                case 60:
                    m11514w(abstractC10987u, abstractC10987u2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m11510r(i11, abstractC10987u2, i10)) {
                        AbstractC10982r0.m11709r(j10, abstractC10987u, AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u2));
                        m11489J(i11, abstractC10987u, i10);
                    }
                    break;
                case 68:
                    m11514w(abstractC10987u, abstractC10987u2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: h */
    public final int mo11500h(AbstractC10987u abstractC10987u) {
        int i10;
        int iM11724b;
        int i11;
        int[] iArr = this.f32984a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iM11490L = m11490L(i13);
            int i14 = iArr[i13];
            long j10 = 1048575 & iM11490L;
            int i15 = 1237;
            int iHashCode = 37;
            switch (m11477K(iM11490L)) {
                case 0:
                    i10 = i12 * 53;
                    iM11724b = AbstractC10993x.m11724b(Double.doubleToLongBits(AbstractC10982r0.f33089d.mo11676e(j10, abstractC10987u)));
                    i12 = iM11724b + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iM11724b = Float.floatToIntBits(AbstractC10982r0.f33089d.mo11677f(j10, abstractC10987u));
                    i12 = iM11724b + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iM11724b = AbstractC10993x.m11724b(AbstractC10982r0.f33089d.m11686h(j10, abstractC10987u));
                    i12 = iM11724b + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iM11724b = AbstractC10993x.m11724b(AbstractC10982r0.f33089d.m11686h(j10, abstractC10987u));
                    i12 = iM11724b + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iM11724b = AbstractC10982r0.f33089d.m11685g(j10, abstractC10987u);
                    i12 = iM11724b + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iM11724b = AbstractC10993x.m11724b(AbstractC10982r0.f33089d.m11686h(j10, abstractC10987u));
                    i12 = iM11724b + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iM11724b = AbstractC10982r0.f33089d.m11685g(j10, abstractC10987u);
                    i12 = iM11724b + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zMo11674c = AbstractC10982r0.f33089d.mo11674c(j10, abstractC10987u);
                    Charset charset = AbstractC10993x.f33099a;
                    if (zMo11674c) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iM11724b = ((String) AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u)).hashCode();
                    i12 = iM11724b + i10;
                    break;
                case 9:
                    Object objM11687i = AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u);
                    if (objM11687i != null) {
                        iHashCode = objM11687i.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iM11724b = AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u).hashCode();
                    i12 = iM11724b + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iM11724b = AbstractC10982r0.f33089d.m11685g(j10, abstractC10987u);
                    i12 = iM11724b + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iM11724b = AbstractC10982r0.f33089d.m11685g(j10, abstractC10987u);
                    i12 = iM11724b + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iM11724b = AbstractC10982r0.f33089d.m11685g(j10, abstractC10987u);
                    i12 = iM11724b + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iM11724b = AbstractC10993x.m11724b(AbstractC10982r0.f33089d.m11686h(j10, abstractC10987u));
                    i12 = iM11724b + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iM11724b = AbstractC10982r0.f33089d.m11685g(j10, abstractC10987u);
                    i12 = iM11724b + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iM11724b = AbstractC10993x.m11724b(AbstractC10982r0.f33089d.m11686h(j10, abstractC10987u));
                    i12 = iM11724b + i10;
                    break;
                case 17:
                    Object objM11687i2 = AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u);
                    if (objM11687i2 != null) {
                        iHashCode = objM11687i2.hashCode();
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
                    iM11724b = AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u).hashCode();
                    i12 = iM11724b + i10;
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    i10 = i12 * 53;
                    iM11724b = AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u).hashCode();
                    i12 = iM11724b + i10;
                    break;
                case 51:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = AbstractC10993x.m11724b(Double.doubleToLongBits(((Double) AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u)).doubleValue()));
                        i12 = iM11724b + i10;
                    }
                    break;
                case 52:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = Float.floatToIntBits(((Float) AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u)).floatValue());
                        i12 = iM11724b + i10;
                    }
                    break;
                case 53:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = AbstractC10993x.m11724b(m11475B(j10, abstractC10987u));
                        i12 = iM11724b + i10;
                    }
                    break;
                case 54:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = AbstractC10993x.m11724b(m11475B(j10, abstractC10987u));
                        i12 = iM11724b + i10;
                    }
                    break;
                case 55:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = m11474A(j10, abstractC10987u);
                        i12 = iM11724b + i10;
                    }
                    break;
                case 56:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = AbstractC10993x.m11724b(m11475B(j10, abstractC10987u));
                        i12 = iM11724b + i10;
                    }
                    break;
                case 57:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = m11474A(j10, abstractC10987u);
                        i12 = iM11724b + i10;
                    }
                    break;
                case 58:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u)).booleanValue();
                        Charset charset2 = AbstractC10993x.f33099a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case 59:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = ((String) AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u)).hashCode();
                        i12 = iM11724b + i10;
                    }
                    break;
                case 60:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u).hashCode();
                        i12 = iM11724b + i10;
                    }
                    break;
                case 61:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u).hashCode();
                        i12 = iM11724b + i10;
                    }
                    break;
                case 62:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = m11474A(j10, abstractC10987u);
                        i12 = iM11724b + i10;
                    }
                    break;
                case 63:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = m11474A(j10, abstractC10987u);
                        i12 = iM11724b + i10;
                    }
                    break;
                case 64:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = m11474A(j10, abstractC10987u);
                        i12 = iM11724b + i10;
                    }
                    break;
                case 65:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = AbstractC10993x.m11724b(m11475B(j10, abstractC10987u));
                        i12 = iM11724b + i10;
                    }
                    break;
                case 66:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = m11474A(j10, abstractC10987u);
                        i12 = iM11724b + i10;
                    }
                    break;
                case 67:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = AbstractC10993x.m11724b(m11475B(j10, abstractC10987u));
                        i12 = iM11724b + i10;
                    }
                    break;
                case 68:
                    if (m11510r(i14, abstractC10987u, i13)) {
                        i10 = i12 * 53;
                        iM11724b = AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u).hashCode();
                        i12 = iM11724b + i10;
                    }
                    break;
            }
        }
        this.f32996m.getClass();
        return abstractC10987u.unknownFields.hashCode() + (i12 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: i */
    public final boolean mo11501i(AbstractC10987u abstractC10987u, Object obj) {
        int[] iArr = this.f32984a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zM11527C = true;
            if (i10 >= length) {
                this.f32996m.getClass();
                return abstractC10987u.unknownFields.equals(((AbstractC10987u) obj).unknownFields);
            }
            int iM11490L = m11490L(i10);
            long j10 = iM11490L & 1048575;
            switch (m11477K(iM11490L)) {
                case 0:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q0 = AbstractC10982r0.f33089d;
                        if (Double.doubleToLongBits(abstractC10980q0.mo11676e(j10, abstractC10987u)) != Double.doubleToLongBits(abstractC10980q0.mo11676e(j10, obj))) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 1:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q1 = AbstractC10982r0.f33089d;
                        if (Float.floatToIntBits(abstractC10980q1.mo11677f(j10, abstractC10987u)) != Float.floatToIntBits(abstractC10980q1.mo11677f(j10, obj))) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 2:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q2 = AbstractC10982r0.f33089d;
                        if (abstractC10980q2.m11686h(j10, abstractC10987u) != abstractC10980q2.m11686h(j10, obj)) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 3:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q3 = AbstractC10982r0.f33089d;
                        if (abstractC10980q3.m11686h(j10, abstractC10987u) != abstractC10980q3.m11686h(j10, obj)) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 4:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q4 = AbstractC10982r0.f33089d;
                        if (abstractC10980q4.m11685g(j10, abstractC10987u) != abstractC10980q4.m11685g(j10, obj)) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 5:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q5 = AbstractC10982r0.f33089d;
                        if (abstractC10980q5.m11686h(j10, abstractC10987u) != abstractC10980q5.m11686h(j10, obj)) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 6:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q6 = AbstractC10982r0.f33089d;
                        if (abstractC10980q6.m11685g(j10, abstractC10987u) != abstractC10980q6.m11685g(j10, obj)) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 7:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q7 = AbstractC10982r0.f33089d;
                        if (abstractC10980q7.mo11674c(j10, abstractC10987u) != abstractC10980q7.mo11674c(j10, obj)) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 8:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q8 = AbstractC10982r0.f33089d;
                        if (!AbstractC10950b0.m11527C(abstractC10980q8.m11687i(j10, abstractC10987u), abstractC10980q8.m11687i(j10, obj))) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 9:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q9 = AbstractC10982r0.f33089d;
                        if (!AbstractC10950b0.m11527C(abstractC10980q9.m11687i(j10, abstractC10987u), abstractC10980q9.m11687i(j10, obj))) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 10:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q10 = AbstractC10982r0.f33089d;
                        if (!AbstractC10950b0.m11527C(abstractC10980q10.m11687i(j10, abstractC10987u), abstractC10980q10.m11687i(j10, obj))) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 11:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q11 = AbstractC10982r0.f33089d;
                        if (abstractC10980q11.m11685g(j10, abstractC10987u) != abstractC10980q11.m11685g(j10, obj)) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 12:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q12 = AbstractC10982r0.f33089d;
                        if (abstractC10980q12.m11685g(j10, abstractC10987u) != abstractC10980q12.m11685g(j10, obj)) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 13:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q13 = AbstractC10982r0.f33089d;
                        if (abstractC10980q13.m11685g(j10, abstractC10987u) != abstractC10980q13.m11685g(j10, obj)) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 14:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q14 = AbstractC10982r0.f33089d;
                        if (abstractC10980q14.m11686h(j10, abstractC10987u) != abstractC10980q14.m11686h(j10, obj)) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 15:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q15 = AbstractC10982r0.f33089d;
                        if (abstractC10980q15.m11685g(j10, abstractC10987u) != abstractC10980q15.m11685g(j10, obj)) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 16:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q16 = AbstractC10982r0.f33089d;
                        if (abstractC10980q16.m11686h(j10, abstractC10987u) != abstractC10980q16.m11686h(j10, obj)) {
                            zM11527C = false;
                        }
                    }
                    break;
                case 17:
                    if (!m11502j(abstractC10987u, obj, i10)) {
                        zM11527C = false;
                    } else {
                        AbstractC10980q0 abstractC10980q17 = AbstractC10982r0.f33089d;
                        if (!AbstractC10950b0.m11527C(abstractC10980q17.m11687i(j10, abstractC10987u), abstractC10980q17.m11687i(j10, obj))) {
                            zM11527C = false;
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
                    AbstractC10980q0 abstractC10980q18 = AbstractC10982r0.f33089d;
                    zM11527C = AbstractC10950b0.m11527C(abstractC10980q18.m11687i(j10, abstractC10987u), abstractC10980q18.m11687i(j10, obj));
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    AbstractC10980q0 abstractC10980q19 = AbstractC10982r0.f33089d;
                    zM11527C = AbstractC10950b0.m11527C(abstractC10980q19.m11687i(j10, abstractC10987u), abstractC10980q19.m11687i(j10, obj));
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
                    AbstractC10980q0 abstractC10980q20 = AbstractC10982r0.f33089d;
                    if (abstractC10980q20.m11685g(j11, abstractC10987u) != abstractC10980q20.m11685g(j11, obj) || !AbstractC10950b0.m11527C(abstractC10980q20.m11687i(j10, abstractC10987u), abstractC10980q20.m11687i(j10, obj))) {
                        zM11527C = false;
                    }
                    break;
            }
            if (!zM11527C) {
                return false;
            }
            i10 += 3;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11502j(AbstractC10987u abstractC10987u, Object obj, int i10) {
        return m11509q(i10, abstractC10987u) == m11509q(i10, obj);
    }

    /* JADX INFO: renamed from: k */
    public final void m11503k(Object obj, int i10, Object obj2) {
        int i11 = this.f32984a[i10];
        if (AbstractC10982r0.f33089d.m11687i(m11490L(i10) & 1048575, obj) == null) {
            return;
        }
        m11504l(i10);
    }

    /* JADX INFO: renamed from: l */
    public final void m11504l(int i10) {
        if (this.f32985b[AbstractC10763a.m11068z(i10, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: m */
    public final Object m11505m(int i10) {
        return this.f32985b[(i10 / 3) * 2];
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC10948a0 m11506n(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f32985b;
        InterfaceC10948a0 interfaceC10948a0 = (InterfaceC10948a0) objArr[i11];
        if (interfaceC10948a0 != null) {
            return interfaceC10948a0;
        }
        InterfaceC10948a0 interfaceC10948a0M11515a = C10944X.f33003c.m11515a((Class) objArr[i11 + 1]);
        objArr[i11] = interfaceC10948a0M11515a;
        return interfaceC10948a0M11515a;
    }

    /* JADX INFO: renamed from: o */
    public final int m11507o(AbstractC10947a abstractC10947a) {
        int i10;
        int iM11634v;
        int iM11632t;
        Unsafe unsafe = f32983p;
        int i11 = -1;
        int i12 = 0;
        int iM11046d = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f32984a;
            if (i12 >= iArr.length) {
                this.f32996m.getClass();
                return ((AbstractC10987u) abstractC10947a).unknownFields.m11665a() + iM11046d;
            }
            int iM11490L = m11490L(i12);
            int i14 = iArr[i12];
            int iM11477K = m11477K(iM11490L);
            if (iM11477K <= 17) {
                int i15 = iArr[i12 + 2];
                int i16 = i15 & 1048575;
                i10 = 1 << (i15 >>> 20);
                if (i16 != i11) {
                    i13 = unsafe.getInt(abstractC10947a, i16);
                    i11 = i16;
                }
            } else {
                i10 = 0;
            }
            long j10 = iM11490L & 1048575;
            switch (iM11477K) {
                case 0:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11634v(i14);
                        iM11046d += iM11634v;
                    }
                    break;
                case 1:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11638z(i14);
                        iM11046d += iM11634v;
                    }
                    break;
                case 2:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11619D(i14, unsafe.getLong(abstractC10947a, j10));
                        iM11046d += iM11634v;
                    }
                    break;
                case 3:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11629N(i14, unsafe.getLong(abstractC10947a, j10));
                        iM11046d += iM11634v;
                    }
                    break;
                case 4:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11617B(i14, unsafe.getInt(abstractC10947a, j10));
                        iM11046d += iM11634v;
                    }
                    break;
                case 5:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11637y(i14);
                        iM11046d += iM11634v;
                    }
                    break;
                case 6:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11636x(i14);
                        iM11046d += iM11634v;
                    }
                    break;
                case 7:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11631s(i14);
                        iM11046d += iM11634v;
                    }
                    break;
                case 8:
                    if ((i10 & i13) != 0) {
                        Object object = unsafe.getObject(abstractC10947a, j10);
                        iM11632t = object instanceof C10957f ? C10963i.m11632t(i14, (C10957f) object) : C10963i.m11624I(i14, (String) object);
                        iM11046d = iM11632t + iM11046d;
                    }
                    break;
                case 9:
                    if ((i10 & i13) != 0) {
                        iM11634v = AbstractC10950b0.m11560o(i14, unsafe.getObject(abstractC10947a, j10), m11506n(i12));
                        iM11046d += iM11634v;
                    }
                    break;
                case 10:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11632t(i14, (C10957f) unsafe.getObject(abstractC10947a, j10));
                        iM11046d += iM11634v;
                    }
                    break;
                case 11:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11627L(i14, unsafe.getInt(abstractC10947a, j10));
                        iM11046d += iM11634v;
                    }
                    break;
                case 12:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11635w(i14, unsafe.getInt(abstractC10947a, j10));
                        iM11046d += iM11634v;
                    }
                    break;
                case 13:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11620E(i14);
                        iM11046d += iM11634v;
                    }
                    break;
                case 14:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11621F(i14);
                        iM11046d += iM11634v;
                    }
                    break;
                case 15:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11622G(i14, unsafe.getInt(abstractC10947a, j10));
                        iM11046d += iM11634v;
                    }
                    break;
                case 16:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11623H(i14, unsafe.getLong(abstractC10947a, j10));
                        iM11046d += iM11634v;
                    }
                    break;
                case 17:
                    if ((i10 & i13) != 0) {
                        iM11634v = C10963i.m11616A(i14, (AbstractC10947a) unsafe.getObject(abstractC10947a, j10), m11506n(i12));
                        iM11046d += iM11634v;
                    }
                    break;
                case 18:
                    iM11634v = AbstractC10950b0.m11553h(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 19:
                    iM11634v = AbstractC10950b0.m11551f(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 20:
                    iM11634v = AbstractC10950b0.m11558m(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 21:
                    iM11634v = AbstractC10950b0.m11569x(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 22:
                    iM11634v = AbstractC10950b0.m11556k(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 23:
                    iM11634v = AbstractC10950b0.m11553h(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 24:
                    iM11634v = AbstractC10950b0.m11551f(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 25:
                    iM11634v = AbstractC10950b0.m11546a(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 26:
                    iM11634v = AbstractC10950b0.m11566u(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 27:
                    iM11634v = AbstractC10950b0.m11561p(i14, (List) unsafe.getObject(abstractC10947a, j10), m11506n(i12));
                    iM11046d += iM11634v;
                    break;
                case 28:
                    iM11634v = AbstractC10950b0.m11548c(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 29:
                    iM11634v = AbstractC10950b0.m11567v(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 30:
                    iM11634v = AbstractC10950b0.m11549d(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 31:
                    iM11634v = AbstractC10950b0.m11551f(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 32:
                    iM11634v = AbstractC10950b0.m11553h(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 33:
                    iM11634v = AbstractC10950b0.m11562q(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 34:
                    iM11634v = AbstractC10950b0.m11564s(i14, (List) unsafe.getObject(abstractC10947a, j10));
                    iM11046d += iM11634v;
                    break;
                case 35:
                    int iM11554i = AbstractC10950b0.m11554i((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11554i > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11554i, C10963i.m11626K(i14), iM11554i, iM11046d);
                    }
                    break;
                case 36:
                    int iM11552g = AbstractC10950b0.m11552g((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11552g > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11552g, C10963i.m11626K(i14), iM11552g, iM11046d);
                    }
                    break;
                case 37:
                    int iM11559n = AbstractC10950b0.m11559n((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11559n > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11559n, C10963i.m11626K(i14), iM11559n, iM11046d);
                    }
                    break;
                case 38:
                    int iM11570y = AbstractC10950b0.m11570y((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11570y > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11570y, C10963i.m11626K(i14), iM11570y, iM11046d);
                    }
                    break;
                case 39:
                    int iM11557l = AbstractC10950b0.m11557l((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11557l > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11557l, C10963i.m11626K(i14), iM11557l, iM11046d);
                    }
                    break;
                case 40:
                    int iM11554i2 = AbstractC10950b0.m11554i((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11554i2 > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11554i2, C10963i.m11626K(i14), iM11554i2, iM11046d);
                    }
                    break;
                case 41:
                    int iM11552g2 = AbstractC10950b0.m11552g((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11552g2 > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11552g2, C10963i.m11626K(i14), iM11552g2, iM11046d);
                    }
                    break;
                case 42:
                    int iM11547b = AbstractC10950b0.m11547b((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11547b > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11547b, C10963i.m11626K(i14), iM11547b, iM11046d);
                    }
                    break;
                case 43:
                    int iM11568w = AbstractC10950b0.m11568w((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11568w > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11568w, C10963i.m11626K(i14), iM11568w, iM11046d);
                    }
                    break;
                case 44:
                    int iM11550e = AbstractC10950b0.m11550e((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11550e > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11550e, C10963i.m11626K(i14), iM11550e, iM11046d);
                    }
                    break;
                case 45:
                    int iM11552g3 = AbstractC10950b0.m11552g((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11552g3 > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11552g3, C10963i.m11626K(i14), iM11552g3, iM11046d);
                    }
                    break;
                case 46:
                    int iM11554i3 = AbstractC10950b0.m11554i((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11554i3 > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11554i3, C10963i.m11626K(i14), iM11554i3, iM11046d);
                    }
                    break;
                case 47:
                    int iM11563r = AbstractC10950b0.m11563r((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11563r > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11563r, C10963i.m11626K(i14), iM11563r, iM11046d);
                    }
                    break;
                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                    int iM11565t = AbstractC10950b0.m11565t((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11565t > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11565t, C10963i.m11626K(i14), iM11565t, iM11046d);
                    }
                    break;
                case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                    iM11634v = AbstractC10950b0.m11555j(i14, (List) unsafe.getObject(abstractC10947a, j10), m11506n(i12));
                    iM11046d += iM11634v;
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    Object object2 = unsafe.getObject(abstractC10947a, j10);
                    Object objM11505m = m11505m(i12);
                    this.f32997n.getClass();
                    iM11634v = C10934M.m11459a(object2, i14, objM11505m);
                    iM11046d += iM11634v;
                    break;
                case 51:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11634v(i14);
                        iM11046d += iM11634v;
                    }
                    break;
                case 52:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11638z(i14);
                        iM11046d += iM11634v;
                    }
                    break;
                case 53:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11619D(i14, m11475B(j10, abstractC10947a));
                        iM11046d += iM11634v;
                    }
                    break;
                case 54:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11629N(i14, m11475B(j10, abstractC10947a));
                        iM11046d += iM11634v;
                    }
                    break;
                case 55:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11617B(i14, m11474A(j10, abstractC10947a));
                        iM11046d += iM11634v;
                    }
                    break;
                case 56:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11637y(i14);
                        iM11046d += iM11634v;
                    }
                    break;
                case 57:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11636x(i14);
                        iM11046d += iM11634v;
                    }
                    break;
                case 58:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11631s(i14);
                        iM11046d += iM11634v;
                    }
                    break;
                case 59:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        Object object3 = unsafe.getObject(abstractC10947a, j10);
                        iM11632t = object3 instanceof C10957f ? C10963i.m11632t(i14, (C10957f) object3) : C10963i.m11624I(i14, (String) object3);
                        iM11046d = iM11632t + iM11046d;
                    }
                    break;
                case 60:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = AbstractC10950b0.m11560o(i14, unsafe.getObject(abstractC10947a, j10), m11506n(i12));
                        iM11046d += iM11634v;
                    }
                    break;
                case 61:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11632t(i14, (C10957f) unsafe.getObject(abstractC10947a, j10));
                        iM11046d += iM11634v;
                    }
                    break;
                case 62:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11627L(i14, m11474A(j10, abstractC10947a));
                        iM11046d += iM11634v;
                    }
                    break;
                case 63:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11635w(i14, m11474A(j10, abstractC10947a));
                        iM11046d += iM11634v;
                    }
                    break;
                case 64:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11620E(i14);
                        iM11046d += iM11634v;
                    }
                    break;
                case 65:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11621F(i14);
                        iM11046d += iM11634v;
                    }
                    break;
                case 66:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11622G(i14, m11474A(j10, abstractC10947a));
                        iM11046d += iM11634v;
                    }
                    break;
                case 67:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11623H(i14, m11475B(j10, abstractC10947a));
                        iM11046d += iM11634v;
                    }
                    break;
                case 68:
                    if (m11510r(i14, abstractC10947a, i12)) {
                        iM11634v = C10963i.m11616A(i14, (AbstractC10947a) unsafe.getObject(abstractC10947a, j10), m11506n(i12));
                        iM11046d += iM11634v;
                    }
                    break;
            }
            i12 += 3;
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m11508p(AbstractC10947a abstractC10947a) {
        int iM11634v;
        Unsafe unsafe = f32983p;
        int i10 = 0;
        int iM11046d = 0;
        while (true) {
            int[] iArr = this.f32984a;
            if (i10 >= iArr.length) {
                this.f32996m.getClass();
                return ((AbstractC10987u) abstractC10947a).unknownFields.m11665a() + iM11046d;
            }
            int iM11490L = m11490L(i10);
            int iM11477K = m11477K(iM11490L);
            int i11 = iArr[i10];
            long j10 = iM11490L & 1048575;
            if (iM11477K >= EnumC10977p.f33078Z.m11682a() && iM11477K <= EnumC10977p.f33079o0.m11682a()) {
                int i12 = iArr[i10 + 2];
            }
            switch (iM11477K) {
                case 0:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11634v(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 1:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11638z(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 2:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11619D(i11, AbstractC10982r0.m11701j(abstractC10947a, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 3:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11629N(i11, AbstractC10982r0.m11701j(abstractC10947a, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 4:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11617B(i11, AbstractC10982r0.m11700i(abstractC10947a, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 5:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11637y(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 6:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11636x(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 7:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11631s(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 8:
                    if (m11509q(i10, abstractC10947a)) {
                        Object objM11702k = AbstractC10982r0.m11702k(j10, abstractC10947a);
                        iM11634v = !(objM11702k instanceof C10957f) ? C10963i.m11624I(i11, (String) objM11702k) : C10963i.m11632t(i11, (C10957f) objM11702k);
                        break;
                    }
                    i10 += 3;
                    break;
                case 9:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = AbstractC10950b0.m11560o(i11, AbstractC10982r0.m11702k(j10, abstractC10947a), m11506n(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 10:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11632t(i11, (C10957f) AbstractC10982r0.m11702k(j10, abstractC10947a));
                        break;
                    }
                    i10 += 3;
                    break;
                case 11:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11627L(i11, AbstractC10982r0.m11700i(abstractC10947a, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 12:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11635w(i11, AbstractC10982r0.m11700i(abstractC10947a, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 13:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11620E(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 14:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11621F(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 15:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11622G(i11, AbstractC10982r0.m11700i(abstractC10947a, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 16:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11623H(i11, AbstractC10982r0.m11701j(abstractC10947a, j10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 17:
                    if (m11509q(i10, abstractC10947a)) {
                        iM11634v = C10963i.m11616A(i11, (AbstractC10947a) AbstractC10982r0.m11702k(j10, abstractC10947a), m11506n(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 18:
                    iM11634v = AbstractC10950b0.m11553h(i11, m11479s(abstractC10947a, j10));
                    break;
                case 19:
                    iM11634v = AbstractC10950b0.m11551f(i11, m11479s(abstractC10947a, j10));
                    break;
                case 20:
                    iM11634v = AbstractC10950b0.m11558m(i11, m11479s(abstractC10947a, j10));
                    break;
                case 21:
                    iM11634v = AbstractC10950b0.m11569x(i11, m11479s(abstractC10947a, j10));
                    break;
                case 22:
                    iM11634v = AbstractC10950b0.m11556k(i11, m11479s(abstractC10947a, j10));
                    break;
                case 23:
                    iM11634v = AbstractC10950b0.m11553h(i11, m11479s(abstractC10947a, j10));
                    break;
                case 24:
                    iM11634v = AbstractC10950b0.m11551f(i11, m11479s(abstractC10947a, j10));
                    break;
                case 25:
                    iM11634v = AbstractC10950b0.m11546a(i11, m11479s(abstractC10947a, j10));
                    break;
                case 26:
                    iM11634v = AbstractC10950b0.m11566u(i11, m11479s(abstractC10947a, j10));
                    break;
                case 27:
                    iM11634v = AbstractC10950b0.m11561p(i11, m11479s(abstractC10947a, j10), m11506n(i10));
                    break;
                case 28:
                    iM11634v = AbstractC10950b0.m11548c(i11, m11479s(abstractC10947a, j10));
                    break;
                case 29:
                    iM11634v = AbstractC10950b0.m11567v(i11, m11479s(abstractC10947a, j10));
                    break;
                case 30:
                    iM11634v = AbstractC10950b0.m11549d(i11, m11479s(abstractC10947a, j10));
                    break;
                case 31:
                    iM11634v = AbstractC10950b0.m11551f(i11, m11479s(abstractC10947a, j10));
                    break;
                case 32:
                    iM11634v = AbstractC10950b0.m11553h(i11, m11479s(abstractC10947a, j10));
                    break;
                case 33:
                    iM11634v = AbstractC10950b0.m11562q(i11, m11479s(abstractC10947a, j10));
                    break;
                case 34:
                    iM11634v = AbstractC10950b0.m11564s(i11, m11479s(abstractC10947a, j10));
                    break;
                case 35:
                    int iM11554i = AbstractC10950b0.m11554i((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11554i > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11554i, C10963i.m11626K(i11), iM11554i, iM11046d);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 36:
                    int iM11552g = AbstractC10950b0.m11552g((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11552g > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11552g, C10963i.m11626K(i11), iM11552g, iM11046d);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 37:
                    int iM11559n = AbstractC10950b0.m11559n((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11559n > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11559n, C10963i.m11626K(i11), iM11559n, iM11046d);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 38:
                    int iM11570y = AbstractC10950b0.m11570y((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11570y > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11570y, C10963i.m11626K(i11), iM11570y, iM11046d);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 39:
                    int iM11557l = AbstractC10950b0.m11557l((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11557l > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11557l, C10963i.m11626K(i11), iM11557l, iM11046d);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 40:
                    int iM11554i2 = AbstractC10950b0.m11554i((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11554i2 > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11554i2, C10963i.m11626K(i11), iM11554i2, iM11046d);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 41:
                    int iM11552g2 = AbstractC10950b0.m11552g((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11552g2 > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11552g2, C10963i.m11626K(i11), iM11552g2, iM11046d);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 42:
                    int iM11547b = AbstractC10950b0.m11547b((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11547b > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11547b, C10963i.m11626K(i11), iM11547b, iM11046d);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 43:
                    int iM11568w = AbstractC10950b0.m11568w((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11568w > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11568w, C10963i.m11626K(i11), iM11568w, iM11046d);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 44:
                    int iM11550e = AbstractC10950b0.m11550e((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11550e > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11550e, C10963i.m11626K(i11), iM11550e, iM11046d);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 45:
                    int iM11552g3 = AbstractC10950b0.m11552g((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11552g3 > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11552g3, C10963i.m11626K(i11), iM11552g3, iM11046d);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 46:
                    int iM11554i3 = AbstractC10950b0.m11554i((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11554i3 > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11554i3, C10963i.m11626K(i11), iM11554i3, iM11046d);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case 47:
                    int iM11563r = AbstractC10950b0.m11563r((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11563r > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11563r, C10963i.m11626K(i11), iM11563r, iM11046d);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                    int iM11565t = AbstractC10950b0.m11565t((List) unsafe.getObject(abstractC10947a, j10));
                    if (iM11565t > 0) {
                        iM11046d = AbstractC10763a.m11046d(iM11565t, C10963i.m11626K(i11), iM11565t, iM11046d);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    break;
                case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                    iM11634v = AbstractC10950b0.m11555j(i11, m11479s(abstractC10947a, j10), m11506n(i10));
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    Object objM11702k2 = AbstractC10982r0.m11702k(j10, abstractC10947a);
                    Object objM11505m = m11505m(i10);
                    this.f32997n.getClass();
                    iM11634v = C10934M.m11459a(objM11702k2, i11, objM11505m);
                    break;
                case 51:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11634v(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 52:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11638z(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 53:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11619D(i11, m11475B(j10, abstractC10947a));
                        break;
                    }
                    i10 += 3;
                    break;
                case 54:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11629N(i11, m11475B(j10, abstractC10947a));
                        break;
                    }
                    i10 += 3;
                    break;
                case 55:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11617B(i11, m11474A(j10, abstractC10947a));
                        break;
                    }
                    i10 += 3;
                    break;
                case 56:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11637y(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 57:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11636x(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 58:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11631s(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 59:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        Object objM11702k3 = AbstractC10982r0.m11702k(j10, abstractC10947a);
                        iM11634v = !(objM11702k3 instanceof C10957f) ? C10963i.m11624I(i11, (String) objM11702k3) : C10963i.m11632t(i11, (C10957f) objM11702k3);
                        break;
                    }
                    i10 += 3;
                    break;
                case 60:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = AbstractC10950b0.m11560o(i11, AbstractC10982r0.m11702k(j10, abstractC10947a), m11506n(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                case 61:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11632t(i11, (C10957f) AbstractC10982r0.m11702k(j10, abstractC10947a));
                        break;
                    }
                    i10 += 3;
                    break;
                case 62:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11627L(i11, m11474A(j10, abstractC10947a));
                        break;
                    }
                    i10 += 3;
                    break;
                case 63:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11635w(i11, m11474A(j10, abstractC10947a));
                        break;
                    }
                    i10 += 3;
                    break;
                case 64:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11620E(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 65:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11621F(i11);
                        break;
                    }
                    i10 += 3;
                    break;
                case 66:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11622G(i11, m11474A(j10, abstractC10947a));
                        break;
                    }
                    i10 += 3;
                    break;
                case 67:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11623H(i11, m11475B(j10, abstractC10947a));
                        break;
                    }
                    i10 += 3;
                    break;
                case 68:
                    if (m11510r(i11, abstractC10947a, i10)) {
                        iM11634v = C10963i.m11616A(i11, (AbstractC10947a) AbstractC10982r0.m11702k(j10, abstractC10947a), m11506n(i10));
                        break;
                    }
                    i10 += 3;
                    break;
                default:
                    continue;
                    i10 += 3;
                    break;
            }
            iM11046d = iM11634v + iM11046d;
            i10 += 3;
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m11509q(int i10, Object obj) {
        if (!this.f32990g) {
            int i11 = this.f32984a[i10 + 2];
            return (AbstractC10982r0.f33089d.m11685g((long) (i11 & 1048575), obj) & (1 << (i11 >>> 20))) != 0;
        }
        int iM11490L = m11490L(i10);
        long j10 = iM11490L & 1048575;
        switch (m11477K(iM11490L)) {
            case 0:
                return AbstractC10982r0.f33089d.mo11676e(j10, obj) != 0.0d;
            case 1:
                return AbstractC10982r0.f33089d.mo11677f(j10, obj) != 0.0f;
            case 2:
                return AbstractC10982r0.f33089d.m11686h(j10, obj) != 0;
            case 3:
                return AbstractC10982r0.f33089d.m11686h(j10, obj) != 0;
            case 4:
                return AbstractC10982r0.f33089d.m11685g(j10, obj) != 0;
            case 5:
                return AbstractC10982r0.f33089d.m11686h(j10, obj) != 0;
            case 6:
                return AbstractC10982r0.f33089d.m11685g(j10, obj) != 0;
            case 7:
                return AbstractC10982r0.f33089d.mo11674c(j10, obj);
            case 8:
                Object objM11687i = AbstractC10982r0.f33089d.m11687i(j10, obj);
                if (objM11687i instanceof String) {
                    return !((String) objM11687i).isEmpty();
                }
                if (objM11687i instanceof C10957f) {
                    return !C10957f.f33028o0.equals(objM11687i);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC10982r0.f33089d.m11687i(j10, obj) != null;
            case 10:
                return !C10957f.f33028o0.equals(AbstractC10982r0.f33089d.m11687i(j10, obj));
            case 11:
                return AbstractC10982r0.f33089d.m11685g(j10, obj) != 0;
            case 12:
                return AbstractC10982r0.f33089d.m11685g(j10, obj) != 0;
            case 13:
                return AbstractC10982r0.f33089d.m11685g(j10, obj) != 0;
            case 14:
                return AbstractC10982r0.f33089d.m11686h(j10, obj) != 0;
            case 15:
                return AbstractC10982r0.f33089d.m11685g(j10, obj) != 0;
            case 16:
                return AbstractC10982r0.f33089d.m11686h(j10, obj) != 0;
            case 17:
                return AbstractC10982r0.f33089d.m11687i(j10, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m11510r(int i10, Object obj, int i11) {
        return AbstractC10982r0.f33089d.m11685g((long) (this.f32984a[i11 + 2] & 1048575), obj) == i10;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x05f1 A[Catch: all -> 0x024d, TryCatch #3 {all -> 0x024d, blocks: (B:132:0x05ec, B:134:0x05f1, B:136:0x05f8, B:138:0x05ff, B:73:0x0248, B:76:0x0250, B:77:0x0260, B:78:0x0270, B:79:0x0280, B:80:0x0290, B:81:0x02a6, B:82:0x02b6, B:83:0x02c6, B:84:0x02d6, B:85:0x02e6, B:86:0x02f6, B:87:0x0306, B:88:0x0316, B:89:0x0326, B:90:0x0336, B:91:0x0346, B:92:0x0356, B:93:0x0366, B:94:0x0376, B:95:0x038c, B:96:0x039c, B:97:0x03ac, B:98:0x03c0, B:99:0x03c8, B:100:0x03d8, B:101:0x03e8, B:102:0x03f8, B:103:0x0408, B:104:0x0418, B:105:0x0428, B:106:0x0438, B:107:0x0448, B:109:0x0451, B:110:0x046e, B:111:0x0482, B:112:0x0495, B:113:0x04a8, B:114:0x04bb, B:115:0x04ce, B:116:0x04e4, B:117:0x04f7, B:118:0x050a, B:120:0x0513, B:121:0x0530, B:122:0x0544, B:123:0x054f, B:124:0x0564, B:125:0x0577, B:126:0x058a, B:127:0x059d, B:128:0x05b0, B:129:0x05c2, B:130:0x05d6), top: B:160:0x05ec }] */
    /* JADX WARN: Code duplicated, block: B:136:0x05f8 A[Catch: all -> 0x024d, TryCatch #3 {all -> 0x024d, blocks: (B:132:0x05ec, B:134:0x05f1, B:136:0x05f8, B:138:0x05ff, B:73:0x0248, B:76:0x0250, B:77:0x0260, B:78:0x0270, B:79:0x0280, B:80:0x0290, B:81:0x02a6, B:82:0x02b6, B:83:0x02c6, B:84:0x02d6, B:85:0x02e6, B:86:0x02f6, B:87:0x0306, B:88:0x0316, B:89:0x0326, B:90:0x0336, B:91:0x0346, B:92:0x0356, B:93:0x0366, B:94:0x0376, B:95:0x038c, B:96:0x039c, B:97:0x03ac, B:98:0x03c0, B:99:0x03c8, B:100:0x03d8, B:101:0x03e8, B:102:0x03f8, B:103:0x0408, B:104:0x0418, B:105:0x0428, B:106:0x0438, B:107:0x0448, B:109:0x0451, B:110:0x046e, B:111:0x0482, B:112:0x0495, B:113:0x04a8, B:114:0x04bb, B:115:0x04ce, B:116:0x04e4, B:117:0x04f7, B:118:0x050a, B:120:0x0513, B:121:0x0530, B:122:0x0544, B:123:0x054f, B:124:0x0564, B:125:0x0577, B:126:0x058a, B:127:0x059d, B:128:0x05b0, B:129:0x05c2, B:130:0x05d6), top: B:160:0x05ec }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0609 A[LOOP:2: B:141:0x0607->B:142:0x0609, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x0613  */
    /* JADX WARN: Code duplicated, block: B:169:0x0605 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    public final void m11511t(C10966j0 c10966j0, Object obj, C6277D c6277d, C10969l c10969l) throws Throwable {
        int i10;
        C10964i0 c10964i0;
        int i11;
        AbstractC10987u abstractC10987u;
        C10964i0 c10964i0M11664b;
        int[] iArr = this.f32991h;
        int i12 = this.f32993j;
        int i13 = this.f32992i;
        C10964i0 c10964i0M11669b = null;
        while (true) {
            try {
                int iM6794b = c6277d.m6794b();
                int iM11483C = m11483C(iM6794b);
                C10964i0 c10964i1 = C10964i0.f33059f;
                if (iM11483C >= 0) {
                    int iM11490L = m11490L(iM11483C);
                    try {
                        int iM11477K = m11477K(iM11490L);
                        AbstractC10927F abstractC10927F = this.f32995l;
                        switch (iM11477K) {
                            case 0:
                                i10 = i13;
                                AbstractC10982r0.f33089d.mo11680m(obj, m11482z(iM11490L), c6277d.m6826r());
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 1:
                                i10 = i13;
                                AbstractC10982r0.f33089d.mo11681n(obj, m11482z(iM11490L), c6277d.m6771F());
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 2:
                                i10 = i13;
                                AbstractC10982r0.m11708q(obj, m11482z(iM11490L), c6277d.m6779N());
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 3:
                                i10 = i13;
                                AbstractC10982r0.m11708q(obj, m11482z(iM11490L), c6277d.m6817m0());
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 4:
                                i10 = i13;
                                AbstractC10982r0.m11707p(m11482z(iM11490L), obj, c6277d.m6776K());
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 5:
                                i10 = i13;
                                AbstractC10982r0.m11708q(obj, m11482z(iM11490L), c6277d.m6768C());
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 6:
                                i10 = i13;
                                AbstractC10982r0.m11707p(m11482z(iM11490L), obj, c6277d.m6838z());
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 7:
                                i10 = i13;
                                AbstractC10982r0.f33089d.mo11678k(obj, m11482z(iM11490L), c6277d.m6810j());
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 8:
                                i10 = i13;
                                m11486F(iM11490L, c6277d, obj);
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 9:
                                i10 = i13;
                                if (m11509q(iM11483C, obj)) {
                                    AbstractC10982r0.m11709r(m11482z(iM11490L), obj, AbstractC10993x.m11725c(AbstractC10982r0.m11702k(m11482z(iM11490L), obj), c6277d.m6784S(m11506n(iM11483C), c10969l)));
                                } else {
                                    AbstractC10982r0.m11709r(m11482z(iM11490L), obj, c6277d.m6784S(m11506n(iM11483C), c10969l));
                                    m11488I(iM11483C, obj);
                                }
                                i13 = i10;
                                break;
                            case 10:
                                i10 = i13;
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, c6277d.m6816m());
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 11:
                                i10 = i13;
                                AbstractC10982r0.m11707p(m11482z(iM11490L), obj, c6277d.m6811j0());
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 12:
                                i10 = i13;
                                int iM6832u = c6277d.m6832u();
                                m11504l(iM11483C);
                                AbstractC10982r0.m11707p(m11482z(iM11490L), obj, iM6832u);
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 13:
                                i10 = i13;
                                AbstractC10982r0.m11707p(m11482z(iM11490L), obj, c6277d.m6785T());
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 14:
                                i10 = i13;
                                AbstractC10982r0.m11708q(obj, m11482z(iM11490L), c6277d.m6788W());
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 15:
                                i10 = i13;
                                AbstractC10982r0.m11707p(m11482z(iM11490L), obj, c6277d.m6791Z());
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 16:
                                i10 = i13;
                                AbstractC10982r0.m11708q(obj, m11482z(iM11490L), c6277d.m6797c0());
                                m11488I(iM11483C, obj);
                                i13 = i10;
                                break;
                            case 17:
                                i10 = i13;
                                if (m11509q(iM11483C, obj)) {
                                    AbstractC10982r0.m11709r(m11482z(iM11490L), obj, AbstractC10993x.m11725c(AbstractC10982r0.m11702k(m11482z(iM11490L), obj), c6277d.m6775J(m11506n(iM11483C), c10969l)));
                                } else {
                                    AbstractC10982r0.m11709r(m11482z(iM11490L), obj, c6277d.m6775J(m11506n(iM11483C), c10969l));
                                    m11488I(iM11483C, obj);
                                }
                                i13 = i10;
                                break;
                            case 18:
                                i10 = i13;
                                c6277d.m6830t(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 19:
                                i10 = i13;
                                c6277d.m6773H(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 20:
                                i10 = i13;
                                c6277d.m6781P(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 21:
                                i10 = i13;
                                c6277d.m6821o0(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 22:
                                i10 = i13;
                                c6277d.m6778M(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 23:
                                i10 = i13;
                                c6277d.m6770E(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 24:
                                i10 = i13;
                                c6277d.m6767B(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 25:
                                i10 = i13;
                                c6277d.m6814l(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 26:
                                i10 = i13;
                                m11487G(iM11490L, c6277d, obj);
                                i13 = i10;
                                break;
                            case 27:
                                i10 = i13;
                                m11485E(obj, iM11490L, c6277d, m11506n(iM11483C), c10969l);
                                i13 = i10;
                                break;
                            case 28:
                                i10 = i13;
                                c6277d.m6824q(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 29:
                                i10 = i13;
                                c6277d.m6815l0(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 30:
                                i10 = i13;
                                List listMo11437c = abstractC10927F.mo11437c(m11482z(iM11490L), obj);
                                c6277d.m6835w(listMo11437c);
                                m11504l(iM11483C);
                                AbstractC10950b0.m11571z(iM6794b, listMo11437c, c10964i0M11669b, c10966j0);
                                i13 = i10;
                                break;
                            case 31:
                                i10 = i13;
                                c6277d.m6787V(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 32:
                                i10 = i13;
                                c6277d.m6790Y(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 33:
                                i10 = i13;
                                c6277d.m6795b0(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 34:
                                i10 = i13;
                                c6277d.m6801e0(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 35:
                                i10 = i13;
                                c6277d.m6830t(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 36:
                                i10 = i13;
                                c6277d.m6773H(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 37:
                                i10 = i13;
                                c6277d.m6781P(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 38:
                                i10 = i13;
                                c6277d.m6821o0(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 39:
                                i10 = i13;
                                c6277d.m6778M(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 40:
                                i10 = i13;
                                c6277d.m6770E(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 41:
                                i10 = i13;
                                c6277d.m6767B(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 42:
                                i10 = i13;
                                c6277d.m6814l(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 43:
                                i10 = i13;
                                c6277d.m6815l0(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 44:
                                i10 = i13;
                                List listMo11437c2 = abstractC10927F.mo11437c(m11482z(iM11490L), obj);
                                c6277d.m6835w(listMo11437c2);
                                m11504l(iM11483C);
                                AbstractC10950b0.m11571z(iM6794b, listMo11437c2, c10964i0M11669b, c10966j0);
                                i13 = i10;
                                break;
                            case 45:
                                i10 = i13;
                                c6277d.m6787V(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 46:
                                i10 = i13;
                                c6277d.m6790Y(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case 47:
                                i10 = i13;
                                c6277d.m6795b0(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                                i10 = i13;
                                c6277d.m6801e0(abstractC10927F.mo11437c(m11482z(iM11490L), obj));
                                i13 = i10;
                                break;
                            case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                                i10 = i13;
                                c10964i0 = c10964i1;
                                try {
                                    m11484D(obj, m11482z(iM11490L), c6277d, m11506n(iM11483C), c10969l);
                                    break;
                                } catch (C10995y unused) {
                                    try {
                                        c10966j0.getClass();
                                        if (c10964i0M11669b == null) {
                                            abstractC10987u = (AbstractC10987u) obj;
                                            c10964i0M11664b = abstractC10987u.unknownFields;
                                            if (c10964i0M11664b == c10964i0) {
                                                c10964i0M11664b = C10964i0.m11664b();
                                                abstractC10987u.unknownFields = c10964i0M11664b;
                                            }
                                            c10964i0M11669b = c10964i0M11664b;
                                        }
                                        if (!C10966j0.m11668a(c10964i0M11669b, c6277d)) {
                                            for (i11 = i10; i11 < i12; i11++) {
                                                m11503k(obj, iArr[i11], c10964i0M11669b);
                                            }
                                            if (c10964i0M11669b != null) {
                                                ((AbstractC10987u) obj).unknownFields = c10964i0M11669b;
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        for (int i14 = i10; i14 < i12; i14++) {
                                            m11503k(obj, iArr[i14], c10964i0M11669b);
                                        }
                                        if (c10964i0M11669b != null) {
                                            c10966j0.getClass();
                                            ((AbstractC10987u) obj).unknownFields = c10964i0M11669b;
                                        }
                                        throw th;
                                    }
                                }
                                i13 = i10;
                                break;
                            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                try {
                                    m11512u(obj, iM11483C, m11505m(iM11483C), c10969l, c6277d);
                                    i10 = i13;
                                } catch (C10995y unused2) {
                                    i10 = i13;
                                    c10964i0 = c10964i1;
                                    c10966j0.getClass();
                                    if (c10964i0M11669b == null) {
                                        abstractC10987u = (AbstractC10987u) obj;
                                        c10964i0M11664b = abstractC10987u.unknownFields;
                                        if (c10964i0M11664b == c10964i0) {
                                            c10964i0M11664b = C10964i0.m11664b();
                                            abstractC10987u.unknownFields = c10964i0M11664b;
                                        }
                                        c10964i0M11669b = c10964i0M11664b;
                                    }
                                    if (!C10966j0.m11668a(c10964i0M11669b, c6277d)) {
                                        while (i11 < i12) {
                                            m11503k(obj, iArr[i11], c10964i0M11669b);
                                        }
                                        if (c10964i0M11669b != null) {
                                            ((AbstractC10987u) obj).unknownFields = c10964i0M11669b;
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i13 = i10;
                                break;
                            case 51:
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, Double.valueOf(c6277d.m6826r()));
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 52:
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, Float.valueOf(c6277d.m6771F()));
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 53:
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, Long.valueOf(c6277d.m6779N()));
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 54:
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, Long.valueOf(c6277d.m6817m0()));
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 55:
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, Integer.valueOf(c6277d.m6776K()));
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 56:
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, Long.valueOf(c6277d.m6768C()));
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 57:
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, Integer.valueOf(c6277d.m6838z()));
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 58:
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, Boolean.valueOf(c6277d.m6810j()));
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 59:
                                m11486F(iM11490L, c6277d, obj);
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 60:
                                if (m11510r(iM6794b, obj, iM11483C)) {
                                    AbstractC10982r0.m11709r(m11482z(iM11490L), obj, AbstractC10993x.m11725c(AbstractC10982r0.m11702k(m11482z(iM11490L), obj), c6277d.m6784S(m11506n(iM11483C), c10969l)));
                                } else {
                                    AbstractC10982r0.m11709r(m11482z(iM11490L), obj, c6277d.m6784S(m11506n(iM11483C), c10969l));
                                    m11488I(iM11483C, obj);
                                }
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 61:
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, c6277d.m6816m());
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 62:
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, Integer.valueOf(c6277d.m6811j0()));
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 63:
                                int iM6832u2 = c6277d.m6832u();
                                m11504l(iM11483C);
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, Integer.valueOf(iM6832u2));
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 64:
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, Integer.valueOf(c6277d.m6785T()));
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 65:
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, Long.valueOf(c6277d.m6788W()));
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 66:
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, Integer.valueOf(c6277d.m6791Z()));
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 67:
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, Long.valueOf(c6277d.m6797c0()));
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            case 68:
                                AbstractC10982r0.m11709r(m11482z(iM11490L), obj, c6277d.m6775J(m11506n(iM11483C), c10969l));
                                m11489J(iM6794b, obj, iM11483C);
                                i10 = i13;
                                i13 = i10;
                                break;
                            default:
                                if (c10964i0M11669b == null) {
                                    c10966j0.getClass();
                                    c10964i0M11669b = C10966j0.m11669b();
                                }
                                c10966j0.getClass();
                                if (!C10966j0.m11668a(c10964i0M11669b, c6277d)) {
                                    while (i13 < i12) {
                                        m11503k(obj, iArr[i13], c10964i0M11669b);
                                        i13++;
                                    }
                                    ((AbstractC10987u) obj).unknownFields = c10964i0M11669b;
                                    return;
                                }
                                i10 = i13;
                                i13 = i10;
                                break;
                        }
                    } catch (C10995y unused3) {
                        i10 = i13;
                        c10964i0 = c10964i1;
                    }
                } else {
                    if (iM6794b == Integer.MAX_VALUE) {
                        while (i13 < i12) {
                            m11503k(obj, iArr[i13], c10964i0M11669b);
                            i13++;
                        }
                        if (c10964i0M11669b != null) {
                            c10966j0.getClass();
                            ((AbstractC10987u) obj).unknownFields = c10964i0M11669b;
                            return;
                        }
                        return;
                    }
                    c10966j0.getClass();
                    if (c10964i0M11669b == null) {
                        AbstractC10987u abstractC10987u2 = (AbstractC10987u) obj;
                        C10964i0 c10964i0M11664b2 = abstractC10987u2.unknownFields;
                        if (c10964i0M11664b2 == c10964i1) {
                            c10964i0M11664b2 = C10964i0.m11664b();
                            abstractC10987u2.unknownFields = c10964i0M11664b2;
                        }
                        c10964i0M11669b = c10964i0M11664b2;
                    }
                    if (!C10966j0.m11668a(c10964i0M11669b, c6277d)) {
                        while (i13 < i12) {
                            m11503k(obj, iArr[i13], c10964i0M11669b);
                            i13++;
                        }
                        if (c10964i0M11669b != null) {
                            ((AbstractC10987u) obj).unknownFields = c10964i0M11669b;
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                i10 = i13;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m11512u(Object obj, int i10, Object obj2, C10969l c10969l, C6277D c6277d) throws C10995y {
        long jM11490L = m11490L(i10) & 1048575;
        Object objM11687i = AbstractC10982r0.f33089d.m11687i(jM11490L, obj);
        C10934M c10934m = this.f32997n;
        if (objM11687i == null) {
            c10934m.getClass();
            objM11687i = C10933L.f32976Z.m11458b();
            AbstractC10982r0.m11709r(jM11490L, obj, objM11687i);
        } else {
            c10934m.getClass();
            if (!((C10933L) objM11687i).f32977Y) {
                C10933L c10933lM11458b = C10933L.f32976Z.m11458b();
                C10934M.m11460b(c10933lM11458b, objM11687i);
                AbstractC10982r0.m11709r(jM11490L, obj, c10933lM11458b);
                objM11687i = c10933lM11458b;
            }
        }
        c10934m.getClass();
        C10933L c10933l = (C10933L) objM11687i;
        C10931J c10931j = ((C10932K) obj2).f32975a;
        c6277d.m6831t0(2);
        C10959g c10959g = (C10959g) c6277d.f20385e;
        int iM11593e = c10959g.m11593e(c10959g.m11582A());
        Object objM6837y = "";
        C6569i c6569i = c10931j.f32974c;
        Object objM6837y2 = c6569i;
        while (true) {
            try {
                int iM6794b = c6277d.m6794b();
                if (iM6794b == Integer.MAX_VALUE || c10959g.m11591c()) {
                    break;
                }
                if (iM6794b == 1) {
                    objM6837y = c6277d.m6837y(c10931j.f32972a, null, null);
                } else if (iM6794b != 2) {
                    try {
                        if (!c6277d.m6833u0()) {
                            throw new C10997z("Unable to parse map entry.");
                        }
                    } catch (C10995y unused) {
                        if (!c6277d.m6833u0()) {
                            throw new C10997z("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM6837y2 = c6277d.m6837y(c10931j.f32973b, c6569i.getClass(), c10969l);
                }
            } catch (Throwable th2) {
                c10959g.m11592d(iM11593e);
                throw th2;
            }
        }
        c10933l.put(objM6837y, objM6837y2);
        c10959g.m11592d(iM11593e);
    }

    /* JADX INFO: renamed from: v */
    public final void m11513v(AbstractC10987u abstractC10987u, AbstractC10987u abstractC10987u2, int i10) {
        long jM11490L = m11490L(i10) & 1048575;
        if (m11509q(i10, abstractC10987u2)) {
            AbstractC10980q0 abstractC10980q0 = AbstractC10982r0.f33089d;
            Object objM11687i = abstractC10980q0.m11687i(jM11490L, abstractC10987u);
            Object objM11687i2 = abstractC10980q0.m11687i(jM11490L, abstractC10987u2);
            if (objM11687i != null && objM11687i2 != null) {
                AbstractC10982r0.m11709r(jM11490L, abstractC10987u, AbstractC10993x.m11725c(objM11687i, objM11687i2));
                m11488I(i10, abstractC10987u);
            } else if (objM11687i2 != null) {
                AbstractC10982r0.m11709r(jM11490L, abstractC10987u, objM11687i2);
                m11488I(i10, abstractC10987u);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m11514w(AbstractC10987u abstractC10987u, AbstractC10987u abstractC10987u2, int i10) {
        int iM11490L = m11490L(i10);
        int i11 = this.f32984a[i10];
        long j10 = iM11490L & 1048575;
        if (m11510r(i11, abstractC10987u2, i10)) {
            AbstractC10980q0 abstractC10980q0 = AbstractC10982r0.f33089d;
            Object objM11687i = abstractC10980q0.m11687i(j10, abstractC10987u);
            Object objM11687i2 = abstractC10980q0.m11687i(j10, abstractC10987u2);
            if (objM11687i != null && objM11687i2 != null) {
                AbstractC10982r0.m11709r(j10, abstractC10987u, AbstractC10993x.m11725c(objM11687i, objM11687i2));
                m11489J(i11, abstractC10987u, i10);
            } else if (objM11687i2 != null) {
                AbstractC10982r0.m11709r(j10, abstractC10987u, objM11687i2);
                m11489J(i11, abstractC10987u, i10);
            }
        }
    }
}
