package p810ig;

import androidx.compose.foundation.layout.AbstractC10842a;
import ge.C14089m0;
import java.io.IOException;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p002A0.C0148y;
import p003A1.AbstractC0168G;
import p017Af.C0468O;
import p042Bf.C1269k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1071w0.C20748f0;
import p229J0.AbstractC3927I2;
import p229J0.AbstractC4152w2;
import p229J0.C4027b3;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p382Pf.C6401d;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8098h0;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p654b1.EnumC11216j;
import p737f1.C13522n;
import p872lg.C16946f;
import p911o0.AbstractC17724E0;
import p911o0.AbstractC17731K;
import p911o0.AbstractC17770m;
import p911o0.C17718B0;
import p911o0.C17755e0;
import p911o0.C17756f;
import p936p0.AbstractC18283w;
import p936p0.C18280t;

/* JADX INFO: renamed from: ig.l */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14993l {

    /* JADX INFO: renamed from: a */
    public static final float f46670a = 12;

    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:80:0x010f  */
    /* JADX WARN: Code duplicated, block: B:83:0x011e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0120  */
    /* JADX WARN: Code duplicated, block: B:87:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0129  */
    /* JADX WARN: Code duplicated, block: B:92:0x0180  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m16130a(C16946f c16946f, String str, List countries, InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C6021p c6021p, int i10, int i11) {
        int i12;
        Object obj;
        int i13;
        InterfaceC1436k interfaceC1436k3;
        int i14;
        Object obj2;
        InterfaceC1436k interfaceC1436k4;
        int i15;
        boolean z6;
        Object objM6514H;
        C8410b c8410bM8969c;
        boolean z10;
        Object objM6514H2;
        InterfaceC1436k interfaceC1436k5;
        Object obj3;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(countries, "countries");
        c6021p.m6526U(-797084788);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c6021p.m6542f(c16946f) : c6021p.m6545h(c16946f) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(countries) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        int i16 = i11 & 16;
        if (i16 == 0) {
            if ((i10 & 24576) == 0) {
                obj = interfaceC1436k;
                i12 |= c6021p.m6545h(obj) ? 16384 : 8192;
            }
            i13 = i11 & 32;
            if (i13 != 0) {
                if ((196608 & i10) == 0) {
                    interfaceC1436k3 = interfaceC1436k2;
                    if (c6021p.m6545h(interfaceC1436k3)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                if ((74899 & i12) == 74898 || !c6021p.m6562y()) {
                    if (i16 != 0) {
                        obj2 = C14992k.f46667Z;
                    } else {
                        obj2 = obj;
                    }
                    if (i13 != 0) {
                        interfaceC1436k4 = C14992k.f46668o0;
                    } else {
                        interfaceC1436k4 = interfaceC1436k3;
                    }
                    EnumC11216j enumC11216j = EnumC11216j.f33906M0;
                    c6021p.m6524S(996653248);
                    i15 = 458752 & i12;
                    if (i15 == 131072) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objM6514H = c6021p.m6514H();
                    C5975S c5975s = C6013l.f19514a;
                    if (z6 || objM6514H == c5975s) {
                        objM6514H = new C14089m0(2, interfaceC1436k4);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    InterfaceC10459q interfaceC10459qM8577i = AbstractC8098h0.m8577i(interfaceC10459q, enumC11216j, (InterfaceC1436k) objM6514H);
                    C20748f0 c20748f0M21288a = C20748f0.m21288a(0, 4, 123);
                    c6021p.m6524S(996662078);
                    if (countries.isEmpty()) {
                        c8410bM8969c = null;
                    } else {
                        c8410bM8969c = AbstractC8411c.m8969c(-1402472602, c6021p, new C0148y(obj2, countries, c16946f, 29));
                    }
                    C8410b c8410b = c8410bM8969c;
                    c6021p.m6553p(false);
                    c6021p.m6524S(996655980);
                    if (i15 == 131072) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objM6514H2 = c6021p.m6514H();
                    if (z10 || objM6514H2 == c5975s) {
                        objM6514H2 = new C14089m0(3, interfaceC1436k4);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    AbstractC3927I2.m4629b(str, (InterfaceC1436k) objM6514H2, interfaceC10459qM8577i, false, false, null, AbstractC14986e.f46650a, null, c8410b, null, null, null, null, false, null, c20748f0M21288a, null, true, 0, 0, null, null, null, c6021p, ((i12 >> 3) & 14) | 1572864, 12582912, 0, 8224440);
                    interfaceC1436k5 = interfaceC1436k4;
                    obj3 = obj2;
                } else {
                    c6021p.m6517L();
                    obj3 = obj;
                    interfaceC1436k5 = interfaceC1436k3;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C4027b3(c16946f, str, countries, interfaceC10459q, obj3, interfaceC1436k5, i10, i11, 5);
                }
            }
            i12 |= 196608;
            interfaceC1436k3 = interfaceC1436k2;
            if ((74899 & i12) == 74898) {
                if (i16 != 0) {
                    obj2 = C14992k.f46667Z;
                } else {
                    obj2 = obj;
                }
                if (i13 != 0) {
                    interfaceC1436k4 = C14992k.f46668o0;
                } else {
                    interfaceC1436k4 = interfaceC1436k3;
                }
                EnumC11216j enumC11216j2 = EnumC11216j.f33906M0;
                c6021p.m6524S(996653248);
                i15 = 458752 & i12;
                if (i15 == 131072) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM6514H = c6021p.m6514H();
                C5975S c5975s2 = C6013l.f19514a;
                if (z6) {
                    objM6514H = new C14089m0(2, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C14089m0(2, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM8577i2 = AbstractC8098h0.m8577i(interfaceC10459q, enumC11216j2, (InterfaceC1436k) objM6514H);
                C20748f0 c20748f0M21288a2 = C20748f0.m21288a(0, 4, 123);
                c6021p.m6524S(996662078);
                if (countries.isEmpty()) {
                    c8410bM8969c = AbstractC8411c.m8969c(-1402472602, c6021p, new C0148y(obj2, countries, c16946f, 29));
                } else {
                    c8410bM8969c = null;
                }
                C8410b c8410b2 = c8410bM8969c;
                c6021p.m6553p(false);
                c6021p.m6524S(996655980);
                if (i15 == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objM6514H2 = c6021p.m6514H();
                if (z10) {
                    objM6514H2 = new C14089m0(3, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C14089m0(3, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC3927I2.m4629b(str, (InterfaceC1436k) objM6514H2, interfaceC10459qM8577i2, false, false, null, AbstractC14986e.f46650a, null, c8410b2, null, null, null, null, false, null, c20748f0M21288a2, null, true, 0, 0, null, null, null, c6021p, ((i12 >> 3) & 14) | 1572864, 12582912, 0, 8224440);
                interfaceC1436k5 = interfaceC1436k4;
                obj3 = obj2;
            } else {
                if (i16 != 0) {
                    obj2 = C14992k.f46667Z;
                } else {
                    obj2 = obj;
                }
                if (i13 != 0) {
                    interfaceC1436k4 = C14992k.f46668o0;
                } else {
                    interfaceC1436k4 = interfaceC1436k3;
                }
                EnumC11216j enumC11216j3 = EnumC11216j.f33906M0;
                c6021p.m6524S(996653248);
                i15 = 458752 & i12;
                if (i15 == 131072) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM6514H = c6021p.m6514H();
                C5975S c5975s3 = C6013l.f19514a;
                if (z6) {
                    objM6514H = new C14089m0(2, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C14089m0(2, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM8577i3 = AbstractC8098h0.m8577i(interfaceC10459q, enumC11216j3, (InterfaceC1436k) objM6514H);
                C20748f0 c20748f0M21288a3 = C20748f0.m21288a(0, 4, 123);
                c6021p.m6524S(996662078);
                if (countries.isEmpty()) {
                    c8410bM8969c = AbstractC8411c.m8969c(-1402472602, c6021p, new C0148y(obj2, countries, c16946f, 29));
                } else {
                    c8410bM8969c = null;
                }
                C8410b c8410b3 = c8410bM8969c;
                c6021p.m6553p(false);
                c6021p.m6524S(996655980);
                if (i15 == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objM6514H2 = c6021p.m6514H();
                if (z10) {
                    objM6514H2 = new C14089m0(3, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C14089m0(3, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC3927I2.m4629b(str, (InterfaceC1436k) objM6514H2, interfaceC10459qM8577i3, false, false, null, AbstractC14986e.f46650a, null, c8410b3, null, null, null, null, false, null, c20748f0M21288a3, null, true, 0, 0, null, null, null, c6021p, ((i12 >> 3) & 14) | 1572864, 12582912, 0, 8224440);
                interfaceC1436k5 = interfaceC1436k4;
                obj3 = obj2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4027b3(c16946f, str, countries, interfaceC10459q, obj3, interfaceC1436k5, i10, i11, 5);
            }
        }
        i12 |= 24576;
        obj = interfaceC1436k;
        i13 = i11 & 32;
        if (i13 != 0) {
            if ((196608 & i10) == 0) {
                interfaceC1436k3 = interfaceC1436k2;
                if (c6021p.m6545h(interfaceC1436k3)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            if ((74899 & i12) == 74898) {
                if (i16 != 0) {
                    obj2 = C14992k.f46667Z;
                } else {
                    obj2 = obj;
                }
                if (i13 != 0) {
                    interfaceC1436k4 = C14992k.f46668o0;
                } else {
                    interfaceC1436k4 = interfaceC1436k3;
                }
                EnumC11216j enumC11216j4 = EnumC11216j.f33906M0;
                c6021p.m6524S(996653248);
                i15 = 458752 & i12;
                if (i15 == 131072) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM6514H = c6021p.m6514H();
                C5975S c5975s4 = C6013l.f19514a;
                if (z6) {
                    objM6514H = new C14089m0(2, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C14089m0(2, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM8577i4 = AbstractC8098h0.m8577i(interfaceC10459q, enumC11216j4, (InterfaceC1436k) objM6514H);
                C20748f0 c20748f0M21288a4 = C20748f0.m21288a(0, 4, 123);
                c6021p.m6524S(996662078);
                if (countries.isEmpty()) {
                    c8410bM8969c = AbstractC8411c.m8969c(-1402472602, c6021p, new C0148y(obj2, countries, c16946f, 29));
                } else {
                    c8410bM8969c = null;
                }
                C8410b c8410b4 = c8410bM8969c;
                c6021p.m6553p(false);
                c6021p.m6524S(996655980);
                if (i15 == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objM6514H2 = c6021p.m6514H();
                if (z10) {
                    objM6514H2 = new C14089m0(3, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C14089m0(3, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC3927I2.m4629b(str, (InterfaceC1436k) objM6514H2, interfaceC10459qM8577i4, false, false, null, AbstractC14986e.f46650a, null, c8410b4, null, null, null, null, false, null, c20748f0M21288a4, null, true, 0, 0, null, null, null, c6021p, ((i12 >> 3) & 14) | 1572864, 12582912, 0, 8224440);
                interfaceC1436k5 = interfaceC1436k4;
                obj3 = obj2;
            } else {
                if (i16 != 0) {
                    obj2 = C14992k.f46667Z;
                } else {
                    obj2 = obj;
                }
                if (i13 != 0) {
                    interfaceC1436k4 = C14992k.f46668o0;
                } else {
                    interfaceC1436k4 = interfaceC1436k3;
                }
                EnumC11216j enumC11216j5 = EnumC11216j.f33906M0;
                c6021p.m6524S(996653248);
                i15 = 458752 & i12;
                if (i15 == 131072) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM6514H = c6021p.m6514H();
                C5975S c5975s5 = C6013l.f19514a;
                if (z6) {
                    objM6514H = new C14089m0(2, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C14089m0(2, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM8577i5 = AbstractC8098h0.m8577i(interfaceC10459q, enumC11216j5, (InterfaceC1436k) objM6514H);
                C20748f0 c20748f0M21288a5 = C20748f0.m21288a(0, 4, 123);
                c6021p.m6524S(996662078);
                if (countries.isEmpty()) {
                    c8410bM8969c = AbstractC8411c.m8969c(-1402472602, c6021p, new C0148y(obj2, countries, c16946f, 29));
                } else {
                    c8410bM8969c = null;
                }
                C8410b c8410b5 = c8410bM8969c;
                c6021p.m6553p(false);
                c6021p.m6524S(996655980);
                if (i15 == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objM6514H2 = c6021p.m6514H();
                if (z10) {
                    objM6514H2 = new C14089m0(3, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C14089m0(3, interfaceC1436k4);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC3927I2.m4629b(str, (InterfaceC1436k) objM6514H2, interfaceC10459qM8577i5, false, false, null, AbstractC14986e.f46650a, null, c8410b5, null, null, null, null, false, null, c20748f0M21288a5, null, true, 0, 0, null, null, null, c6021p, ((i12 >> 3) & 14) | 1572864, 12582912, 0, 8224440);
                interfaceC1436k5 = interfaceC1436k4;
                obj3 = obj2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4027b3(c16946f, str, countries, interfaceC10459q, obj3, interfaceC1436k5, i10, i11, 5);
            }
        }
        i12 |= 196608;
        interfaceC1436k3 = interfaceC1436k2;
        if ((74899 & i12) == 74898) {
            if (i16 != 0) {
                obj2 = C14992k.f46667Z;
            } else {
                obj2 = obj;
            }
            if (i13 != 0) {
                interfaceC1436k4 = C14992k.f46668o0;
            } else {
                interfaceC1436k4 = interfaceC1436k3;
            }
            EnumC11216j enumC11216j6 = EnumC11216j.f33906M0;
            c6021p.m6524S(996653248);
            i15 = 458752 & i12;
            if (i15 == 131072) {
                z6 = true;
            } else {
                z6 = false;
            }
            objM6514H = c6021p.m6514H();
            C5975S c5975s6 = C6013l.f19514a;
            if (z6) {
                objM6514H = new C14089m0(2, interfaceC1436k4);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C14089m0(2, interfaceC1436k4);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM8577i6 = AbstractC8098h0.m8577i(interfaceC10459q, enumC11216j6, (InterfaceC1436k) objM6514H);
            C20748f0 c20748f0M21288a6 = C20748f0.m21288a(0, 4, 123);
            c6021p.m6524S(996662078);
            if (countries.isEmpty()) {
                c8410bM8969c = AbstractC8411c.m8969c(-1402472602, c6021p, new C0148y(obj2, countries, c16946f, 29));
            } else {
                c8410bM8969c = null;
            }
            C8410b c8410b6 = c8410bM8969c;
            c6021p.m6553p(false);
            c6021p.m6524S(996655980);
            if (i15 == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            objM6514H2 = c6021p.m6514H();
            if (z10) {
                objM6514H2 = new C14089m0(3, interfaceC1436k4);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C14089m0(3, interfaceC1436k4);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC3927I2.m4629b(str, (InterfaceC1436k) objM6514H2, interfaceC10459qM8577i6, false, false, null, AbstractC14986e.f46650a, null, c8410b6, null, null, null, null, false, null, c20748f0M21288a6, null, true, 0, 0, null, null, null, c6021p, ((i12 >> 3) & 14) | 1572864, 12582912, 0, 8224440);
            interfaceC1436k5 = interfaceC1436k4;
            obj3 = obj2;
        } else {
            if (i16 != 0) {
                obj2 = C14992k.f46667Z;
            } else {
                obj2 = obj;
            }
            if (i13 != 0) {
                interfaceC1436k4 = C14992k.f46668o0;
            } else {
                interfaceC1436k4 = interfaceC1436k3;
            }
            EnumC11216j enumC11216j7 = EnumC11216j.f33906M0;
            c6021p.m6524S(996653248);
            i15 = 458752 & i12;
            if (i15 == 131072) {
                z6 = true;
            } else {
                z6 = false;
            }
            objM6514H = c6021p.m6514H();
            C5975S c5975s7 = C6013l.f19514a;
            if (z6) {
                objM6514H = new C14089m0(2, interfaceC1436k4);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C14089m0(2, interfaceC1436k4);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM8577i7 = AbstractC8098h0.m8577i(interfaceC10459q, enumC11216j7, (InterfaceC1436k) objM6514H);
            C20748f0 c20748f0M21288a7 = C20748f0.m21288a(0, 4, 123);
            c6021p.m6524S(996662078);
            if (countries.isEmpty()) {
                c8410bM8969c = AbstractC8411c.m8969c(-1402472602, c6021p, new C0148y(obj2, countries, c16946f, 29));
            } else {
                c8410bM8969c = null;
            }
            C8410b c8410b7 = c8410bM8969c;
            c6021p.m6553p(false);
            c6021p.m6524S(996655980);
            if (i15 == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            objM6514H2 = c6021p.m6514H();
            if (z10) {
                objM6514H2 = new C14089m0(3, interfaceC1436k4);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C14089m0(3, interfaceC1436k4);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC3927I2.m4629b(str, (InterfaceC1436k) objM6514H2, interfaceC10459qM8577i7, false, false, null, AbstractC14986e.f46650a, null, c8410b7, null, null, null, null, false, null, c20748f0M21288a7, null, true, 0, 0, null, null, null, c6021p, ((i12 >> 3) & 14) | 1572864, 12582912, 0, 8224440);
            interfaceC1436k5 = interfaceC1436k4;
            obj3 = obj2;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4027b3(c16946f, str, countries, interfaceC10459q, obj3, interfaceC1436k5, i10, i11, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m16131b(C16946f c16946f, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        int i12 = 19;
        c6021p.m6526U(234624079);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(c16946f) : c6021p.m6545h(c16946f) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(interfaceC10459q, AbstractC7313q.f23202g, AbstractC7313q.f23201f);
            C17756f c17756f = AbstractC17770m.f56724a;
            AbstractC17731K.m19460a(interfaceC10459qM11234l, AbstractC17770m.m19500g(AbstractC7313q.f23198c), null, 0, 0, null, AbstractC8411c.m8969c(1092998602, c6021p, new C0468O(c16946f, 28)), c6021p, 1572864, 60);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(c16946f, interfaceC10459q, i10, i12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m16132c(InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, List list, C16946f c16946f, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1523810933);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1436k) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(list) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? c6021p.m6542f(c16946f) : c6021p.m6545h(c16946f) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(996505533);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = C5997d.m6430Q("", C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            Object objM530s = AbstractC0168G.m530s(996507355, c6021p, false);
            if (objM530s == obj) {
                objM530s = new C13522n();
                c6021p.m6537c0(objM530s);
            }
            C13522n c13522n = (C13522n) objM530s;
            c6021p.m6553p(false);
            C18280t c18280tM19827a = AbstractC18283w.m19827a(0, c6021p, 0, 3);
            String str = (String) interfaceC5985X.getValue();
            c6021p.m6524S(996510587);
            boolean zM6542f = c6021p.m6542f(c18280tM19827a);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                objM6514H2 = new C14989h(c18280tM19827a, null);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, str);
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(996512355);
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == obj) {
                objM6514H3 = new C14990i(c13522n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, c17296c);
            C10456n c10456n = C10456n.f30959Y;
            WeakHashMap weakHashMap = C17718B0.f56555v;
            AbstractC4152w2.m4780a(interfaceC1426a, AbstractC17724E0.m19459a(c10456n, new C17755e0(C17756f.m19480f(c6021p).f56566k, 16)), AbstractC4152w2.m4785f(6, 2, c6021p, true), 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(1973601976, c6021p, new C14991j(c13522n, c18280tM19827a, list, c16946f, interfaceC1436k, interfaceC1426a, interfaceC5985X)), c6021p, (i12 >> 3) & 14, 384, 4088);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(interfaceC1436k, interfaceC1426a, list, c16946f, i10, 22);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m16133d(String str) throws IOException {
        AbstractC16544l.m18094g(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }
}
