package p824j4;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import bb.AbstractC11278C;
import java.util.Arrays;
import p031B3.AbstractC0797a;
import p1071w0.AbstractC20734X;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p372P3.InterfaceC6314F;
import p372P3.InterfaceC6334p;
import p696d4.AbstractC13011i;
import p696d4.C13003a;
import p696d4.C13007e;
import p696d4.C13016n;
import p725eb.C13356a;

/* JADX INFO: renamed from: j4.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16119o {

    /* JADX INFO: renamed from: a */
    public static final int[] f49993a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: a */
    public static boolean m17670a(int i10, boolean z6) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z6) {
            return true;
        }
        int[] iArr = f49993a;
        for (int i11 = 0; i11 < 29; i11++) {
            if (iArr[i11] == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static C13007e m17671b(int i10, C20811m c20811m) {
        int iM21352g = c20811m.m21352g();
        if (c20811m.m21352g() == 1684108385) {
            c20811m.m21345G(8);
            String strM21361p = c20811m.m21361p(iM21352g - 16);
            return new C13007e("und", strM21361p, strM21361p);
        }
        AbstractC20800b.m21332t("MetadataUtil", "Failed to parse comment attribute: " + AbstractC0797a.m1821c(i10));
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static C13003a m17672c(C20811m c20811m) {
        String str;
        int iM21352g = c20811m.m21352g();
        if (c20811m.m21352g() != 1684108385) {
            AbstractC20800b.m21332t("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM21352g2 = c20811m.m21352g() & 16777215;
        if (iM21352g2 == 13) {
            str = "image/jpeg";
        } else {
            str = iM21352g2 == 14 ? "image/png" : null;
        }
        if (str == null) {
            AbstractC20734X.m21224A(iM21352g2, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        c20811m.m21345G(4);
        int i10 = iM21352g - 16;
        byte[] bArr = new byte[i10];
        c20811m.m21350e(bArr, 0, i10);
        return new C13003a(str, null, 3, bArr);
    }

    /* JADX INFO: renamed from: d */
    public static C13016n m17673d(int i10, String str, C20811m c20811m) {
        int iM21352g = c20811m.m21352g();
        if (c20811m.m21352g() == 1684108385 && iM21352g >= 22) {
            c20811m.m21345G(10);
            int iM21371z = c20811m.m21371z();
            if (iM21371z > 0) {
                String strM11048f = AbstractC10763a.m11048f(iM21371z, "");
                int iM21371z2 = c20811m.m21371z();
                if (iM21371z2 > 0) {
                    strM11048f = strM11048f + Separators.SLASH + iM21371z2;
                }
                return new C13016n(str, null, AbstractC11278C.m12695y(strM11048f));
            }
        }
        AbstractC20800b.m21332t("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC0797a.m1821c(i10));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static int m17674e(C20811m c20811m) {
        int iM21352g = c20811m.m21352g();
        if (c20811m.m21352g() == 1684108385) {
            c20811m.m21345G(8);
            int i10 = iM21352g - 16;
            if (i10 == 1) {
                return c20811m.m21365t();
            }
            if (i10 == 2) {
                return c20811m.m21371z();
            }
            if (i10 == 3) {
                return c20811m.m21368w();
            }
            if (i10 == 4 && (c20811m.f66092a[c20811m.f66093b] & 128) == 0) {
                return c20811m.m21369x();
            }
        }
        AbstractC20800b.m21332t("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC13011i m17675f(int i10, String str, C20811m c20811m, boolean z6, boolean z10) {
        int iM17674e = m17674e(c20811m);
        if (z10) {
            iM17674e = Math.min(1, iM17674e);
        }
        if (iM17674e >= 0) {
            return z6 ? new C13016n(str, null, AbstractC11278C.m12695y(Integer.toString(iM17674e))) : new C13007e("und", str, Integer.toString(iM17674e));
        }
        AbstractC20800b.m21332t("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC0797a.m1821c(i10));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static C13016n m17676g(int i10, String str, C20811m c20811m) {
        int iM21352g = c20811m.m21352g();
        if (c20811m.m21352g() == 1684108385) {
            c20811m.m21345G(8);
            return new C13016n(str, null, AbstractC11278C.m12695y(c20811m.m21361p(iM21352g - 16)));
        }
        AbstractC20800b.m21332t("MetadataUtil", "Failed to parse text attribute: " + AbstractC0797a.m1821c(i10));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0133  */
    /* JADX WARN: Code duplicated, block: B:85:0x0136  */
    /* JADX WARN: Code duplicated, block: B:87:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x013c  */
    /* JADX WARN: Code duplicated, block: B:89:0x013f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0142 A[RETURN] */
    /* JADX INFO: renamed from: h */
    public static InterfaceC6314F m17677h(InterfaceC6334p interfaceC6334p, boolean z6, boolean z10) {
        int i10;
        long jM21359n;
        int i11;
        int i12;
        boolean z11;
        int[] iArr;
        long j10;
        boolean z12 = true;
        long length = interfaceC6334p.getLength();
        long j11 = -1;
        long j12 = 4096;
        if (length != -1 && length <= 4096) {
            j12 = length;
        }
        int i13 = (int) j12;
        C20811m c20811m = new C20811m(64);
        int i14 = 0;
        int i15 = 0;
        boolean z13 = false;
        while (true) {
            if (i15 < i13) {
                c20811m.m21341C(8);
                if (interfaceC6334p.mo3047d(c20811m.f66092a, i14, 8, z12)) {
                    long jM21367v = c20811m.m21367v();
                    int iM21352g = c20811m.m21352g();
                    if (jM21367v == 1) {
                        interfaceC6334p.mo3053k(c20811m.f66092a, 8, 8);
                        i11 = 16;
                        c20811m.m21343E(16);
                        jM21359n = c20811m.m21359n();
                    } else {
                        if (jM21367v == 0) {
                            long length2 = interfaceC6334p.getLength();
                            if (length2 != j11) {
                                jM21367v = (length2 - interfaceC6334p.mo3048e()) + ((long) 8);
                            }
                        }
                        jM21359n = jM21367v;
                        i11 = 8;
                    }
                    long j13 = i11;
                    if (jM21359n < j13) {
                        return new C16114j();
                    }
                    i15 += i11;
                    if (iM21352g == 1836019574) {
                        i13 += (int) jM21359n;
                        if (length == -1 || i13 <= length) {
                            j10 = length;
                        } else {
                            j10 = length;
                            i13 = (int) j10;
                        }
                        length = j10;
                        z12 = true;
                    } else if (iM21352g == 1836019558 || iM21352g == 1836475768) {
                        i10 = 1;
                    } else {
                        if (iM21352g == 1835295092) {
                            z13 = true;
                        }
                        if ((((long) i15) + jM21359n) - j13 >= i13) {
                            i10 = 0;
                        } else {
                            int i16 = (int) (jM21359n - j13);
                            i15 += i16;
                            if (iM21352g != 1718909296) {
                                i12 = 0;
                                z11 = true;
                                if (i16 != 0) {
                                    interfaceC6334p.mo3049f(i16);
                                }
                            } else {
                                if (i16 < 8) {
                                    return new C16114j();
                                }
                                c20811m.m21341C(i16);
                                i12 = 0;
                                interfaceC6334p.mo3053k(c20811m.f66092a, 0, i16);
                                if (m17670a(c20811m.m21352g(), z10)) {
                                    z13 = true;
                                }
                                c20811m.m21345G(4);
                                int iM21346a = c20811m.m21346a() / 4;
                                if (!z13 && iM21346a > 0) {
                                    iArr = new int[iM21346a];
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= iM21346a) {
                                            z11 = true;
                                            break;
                                        }
                                        int iM21352g2 = c20811m.m21352g();
                                        iArr[i17] = iM21352g2;
                                        if (m17670a(iM21352g2, z10)) {
                                            z11 = true;
                                            z13 = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                } else {
                                    z11 = true;
                                    iArr = null;
                                }
                                if (!z13) {
                                    C16114j c16114j = new C16114j();
                                    if (iArr != null) {
                                        int i18 = C13356a.f42393o0;
                                        if (iArr.length != 0) {
                                            new C13356a(Arrays.copyOf(iArr, iArr.length));
                                        }
                                    } else {
                                        int i19 = C13356a.f42393o0;
                                    }
                                    return c16114j;
                                }
                            }
                            i14 = i12;
                            z12 = z11;
                            length = length;
                        }
                    }
                    j11 = -1;
                }
                if (!z13) {
                    return C16114j.f49953c;
                }
                if (z6 != i10) {
                    return i10 != 0 ? C16114j.f49951a : C16114j.f49952b;
                }
                return null;
            }
            i10 = i14;
            if (!z13) {
                return C16114j.f49953c;
            }
            if (z6 != i10) {
                if (i10 != 0) {
                }
            }
            return null;
        }
    }
}
