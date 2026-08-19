package p544W9;

import android.widget.EditText;
import androidx.compose.p650ui.draw.AbstractC10861a;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p1095x1.C21089j;
import p1095x1.InterfaceC21090k;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p156G1.AbstractC2965l;
import p291Lf.C5012i;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p404Qe.C6665a;
import p523V9.AbstractC8079e5;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10446d;
import p635a1.InterfaceC10459q;
import p773h0.C14266V;
import p774h1.C14356l;
import p882m1.AbstractC17140a;

/* JADX INFO: renamed from: W9.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8473F {
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x0110  */
    /* JADX WARN: Code duplicated, block: B:73:0x0114  */
    /* JADX WARN: Code duplicated, block: B:76:0x012c  */
    /* JADX WARN: Code duplicated, block: B:78:0x013a  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m9106a(AbstractC17140a abstractC17140a, String str, InterfaceC10459q interfaceC10459q, InterfaceC10446d interfaceC10446d, InterfaceC21090k interfaceC21090k, float f10, C14356l c14356l, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC21090k interfaceC21090k2;
        int i13;
        int i14;
        C14356l c14356l2;
        int i15;
        InterfaceC10459q interfaceC10459qM3789a;
        int i16;
        C21696i c21696i;
        C21694h c21694h;
        C14356l c14356l3;
        float f11;
        InterfaceC21090k interfaceC21090k3;
        InterfaceC10446d interfaceC10446d2;
        boolean z6;
        Object objM6514H;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(1142754848);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(abstractC17140a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        int i17 = i12 | 3072;
        int i18 = i11 & 16;
        if (i18 == 0) {
            if ((i10 & 24576) == 0) {
                interfaceC21090k2 = interfaceC21090k;
                i17 |= c6021p.m6542f(interfaceC21090k2) ? 16384 : 8192;
            }
            i13 = 196608 | i17;
            i14 = i11 & 64;
            if (i14 != 0) {
                if ((1572864 & i10) == 0) {
                    c14356l2 = c14356l;
                    if (c6021p.m6542f(c14356l2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i13 |= i15;
                }
                if ((599187 & i13) == 599186 || !c6021p.m6562y()) {
                    interfaceC10459qM3789a = C10456n.f30959Y;
                    C10451i c10451i = C10444b.f30938q0;
                    if (i18 != 0) {
                        interfaceC21090k2 = C21089j.f67012o0;
                    }
                    if (i14 != 0) {
                        c14356l2 = null;
                    }
                    if (str != null) {
                        c6021p.m6524S(1040258775);
                        if ((i13 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objM6514H = c6021p.m6514H();
                        if (z6 || objM6514H == C6013l.f19514a) {
                            objM6514H = new C6665a(str, 11);
                            c6021p.m6537c0(objM6514H);
                        }
                        interfaceC10459qM3789a = AbstractC2965l.m3789a(interfaceC10459qM3789a, false, (InterfaceC1436k) objM6514H);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(1040398089);
                        c6021p.m6553p(false);
                    }
                    InterfaceC10459q interfaceC10459qM11298d = AbstractC10861a.m11298d(AbstractC8079e5.m8502b(interfaceC10459q.mo428M(interfaceC10459qM3789a)), abstractC17140a, c10451i, interfaceC21090k2, 1.0f, c14356l2, 2);
                    C14266V c14266v = C14266V.f44767a;
                    i16 = c6021p.f19564P;
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11298d);
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC21700k.f68875m0.getClass();
                    c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c14266v);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                        AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                    }
                    c6021p.m6553p(true);
                    c14356l3 = c14356l2;
                    f11 = 1.0f;
                    interfaceC21090k3 = interfaceC21090k2;
                    interfaceC10446d2 = c10451i;
                } else {
                    c6021p.m6517L();
                    f11 = f10;
                    c14356l3 = c14356l2;
                    interfaceC21090k3 = interfaceC21090k2;
                    interfaceC10446d2 = interfaceC10446d;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C5012i(abstractC17140a, str, interfaceC10459q, interfaceC10446d2, interfaceC21090k3, f11, c14356l3, i10, i11);
                }
            }
            i13 = 1769472 | i17;
            c14356l2 = c14356l;
            if ((599187 & i13) == 599186) {
                interfaceC10459qM3789a = C10456n.f30959Y;
                C10451i c10451i2 = C10444b.f30938q0;
                if (i18 != 0) {
                    interfaceC21090k2 = C21089j.f67012o0;
                }
                if (i14 != 0) {
                    c14356l2 = null;
                }
                if (str != null) {
                    c6021p.m6524S(1040258775);
                    if ((i13 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objM6514H = c6021p.m6514H();
                    if (z6) {
                        objM6514H = new C6665a(str, 11);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C6665a(str, 11);
                        c6021p.m6537c0(objM6514H);
                    }
                    interfaceC10459qM3789a = AbstractC2965l.m3789a(interfaceC10459qM3789a, false, (InterfaceC1436k) objM6514H);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(1040398089);
                    c6021p.m6553p(false);
                }
                InterfaceC10459q interfaceC10459qM11298d2 = AbstractC10861a.m11298d(AbstractC8079e5.m8502b(interfaceC10459q.mo428M(interfaceC10459qM3789a)), abstractC17140a, c10451i2, interfaceC21090k2, 1.0f, c14356l2, 2);
                C14266V c14266v2 = C14266V.f44767a;
                i16 = c6021p.f19564P;
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11298d2);
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c14266v2);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                } else {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                }
                c6021p.m6553p(true);
                c14356l3 = c14356l2;
                f11 = 1.0f;
                interfaceC21090k3 = interfaceC21090k2;
                interfaceC10446d2 = c10451i2;
            } else {
                interfaceC10459qM3789a = C10456n.f30959Y;
                C10451i c10451i3 = C10444b.f30938q0;
                if (i18 != 0) {
                    interfaceC21090k2 = C21089j.f67012o0;
                }
                if (i14 != 0) {
                    c14356l2 = null;
                }
                if (str != null) {
                    c6021p.m6524S(1040258775);
                    if ((i13 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objM6514H = c6021p.m6514H();
                    if (z6) {
                        objM6514H = new C6665a(str, 11);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C6665a(str, 11);
                        c6021p.m6537c0(objM6514H);
                    }
                    interfaceC10459qM3789a = AbstractC2965l.m3789a(interfaceC10459qM3789a, false, (InterfaceC1436k) objM6514H);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(1040398089);
                    c6021p.m6553p(false);
                }
                InterfaceC10459q interfaceC10459qM11298d3 = AbstractC10861a.m11298d(AbstractC8079e5.m8502b(interfaceC10459q.mo428M(interfaceC10459qM3789a)), abstractC17140a, c10451i3, interfaceC21090k2, 1.0f, c14356l2, 2);
                C14266V c14266v3 = C14266V.f44767a;
                i16 = c6021p.f19564P;
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11298d3);
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c14266v3);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m3);
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d3);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                } else {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                }
                c6021p.m6553p(true);
                c14356l3 = c14356l2;
                f11 = 1.0f;
                interfaceC21090k3 = interfaceC21090k2;
                interfaceC10446d2 = c10451i3;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C5012i(abstractC17140a, str, interfaceC10459q, interfaceC10446d2, interfaceC21090k3, f11, c14356l3, i10, i11);
            }
        }
        i17 = i12 | 27648;
        interfaceC21090k2 = interfaceC21090k;
        i13 = 196608 | i17;
        i14 = i11 & 64;
        if (i14 != 0) {
            if ((1572864 & i10) == 0) {
                c14356l2 = c14356l;
                if (c6021p.m6542f(c14356l2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i13 |= i15;
            }
            if ((599187 & i13) == 599186) {
                interfaceC10459qM3789a = C10456n.f30959Y;
                C10451i c10451i4 = C10444b.f30938q0;
                if (i18 != 0) {
                    interfaceC21090k2 = C21089j.f67012o0;
                }
                if (i14 != 0) {
                    c14356l2 = null;
                }
                if (str != null) {
                    c6021p.m6524S(1040258775);
                    if ((i13 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objM6514H = c6021p.m6514H();
                    if (z6) {
                        objM6514H = new C6665a(str, 11);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C6665a(str, 11);
                        c6021p.m6537c0(objM6514H);
                    }
                    interfaceC10459qM3789a = AbstractC2965l.m3789a(interfaceC10459qM3789a, false, (InterfaceC1436k) objM6514H);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(1040398089);
                    c6021p.m6553p(false);
                }
                InterfaceC10459q interfaceC10459qM11298d4 = AbstractC10861a.m11298d(AbstractC8079e5.m8502b(interfaceC10459q.mo428M(interfaceC10459qM3789a)), abstractC17140a, c10451i4, interfaceC21090k2, 1.0f, c14356l2, 2);
                C14266V c14266v4 = C14266V.f44767a;
                i16 = c6021p.f19564P;
                InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11298d4);
                InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c14266v4);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m4);
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d4);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                } else {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                }
                c6021p.m6553p(true);
                c14356l3 = c14356l2;
                f11 = 1.0f;
                interfaceC21090k3 = interfaceC21090k2;
                interfaceC10446d2 = c10451i4;
            } else {
                interfaceC10459qM3789a = C10456n.f30959Y;
                C10451i c10451i5 = C10444b.f30938q0;
                if (i18 != 0) {
                    interfaceC21090k2 = C21089j.f67012o0;
                }
                if (i14 != 0) {
                    c14356l2 = null;
                }
                if (str != null) {
                    c6021p.m6524S(1040258775);
                    if ((i13 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objM6514H = c6021p.m6514H();
                    if (z6) {
                        objM6514H = new C6665a(str, 11);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C6665a(str, 11);
                        c6021p.m6537c0(objM6514H);
                    }
                    interfaceC10459qM3789a = AbstractC2965l.m3789a(interfaceC10459qM3789a, false, (InterfaceC1436k) objM6514H);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(1040398089);
                    c6021p.m6553p(false);
                }
                InterfaceC10459q interfaceC10459qM11298d5 = AbstractC10861a.m11298d(AbstractC8079e5.m8502b(interfaceC10459q.mo428M(interfaceC10459qM3789a)), abstractC17140a, c10451i5, interfaceC21090k2, 1.0f, c14356l2, 2);
                C14266V c14266v5 = C14266V.f44767a;
                i16 = c6021p.f19564P;
                InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11298d5);
                InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c14266v5);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m5);
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d5);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                } else {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                }
                c6021p.m6553p(true);
                c14356l3 = c14356l2;
                f11 = 1.0f;
                interfaceC21090k3 = interfaceC21090k2;
                interfaceC10446d2 = c10451i5;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C5012i(abstractC17140a, str, interfaceC10459q, interfaceC10446d2, interfaceC21090k3, f11, c14356l3, i10, i11);
            }
        }
        i13 = 1769472 | i17;
        c14356l2 = c14356l;
        if ((599187 & i13) == 599186) {
            interfaceC10459qM3789a = C10456n.f30959Y;
            C10451i c10451i6 = C10444b.f30938q0;
            if (i18 != 0) {
                interfaceC21090k2 = C21089j.f67012o0;
            }
            if (i14 != 0) {
                c14356l2 = null;
            }
            if (str != null) {
                c6021p.m6524S(1040258775);
                if ((i13 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM6514H = c6021p.m6514H();
                if (z6) {
                    objM6514H = new C6665a(str, 11);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C6665a(str, 11);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC10459qM3789a = AbstractC2965l.m3789a(interfaceC10459qM3789a, false, (InterfaceC1436k) objM6514H);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(1040398089);
                c6021p.m6553p(false);
            }
            InterfaceC10459q interfaceC10459qM11298d6 = AbstractC10861a.m11298d(AbstractC8079e5.m8502b(interfaceC10459q.mo428M(interfaceC10459qM3789a)), abstractC17140a, c10451i6, interfaceC21090k2, 1.0f, c14356l2, 2);
            C14266V c14266v6 = C14266V.f44767a;
            i16 = c6021p.f19564P;
            InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11298d6);
            InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p.m6550m();
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c14266v6);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m6);
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d6);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            } else {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            }
            c6021p.m6553p(true);
            c14356l3 = c14356l2;
            f11 = 1.0f;
            interfaceC21090k3 = interfaceC21090k2;
            interfaceC10446d2 = c10451i6;
        } else {
            interfaceC10459qM3789a = C10456n.f30959Y;
            C10451i c10451i7 = C10444b.f30938q0;
            if (i18 != 0) {
                interfaceC21090k2 = C21089j.f67012o0;
            }
            if (i14 != 0) {
                c14356l2 = null;
            }
            if (str != null) {
                c6021p.m6524S(1040258775);
                if ((i13 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM6514H = c6021p.m6514H();
                if (z6) {
                    objM6514H = new C6665a(str, 11);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C6665a(str, 11);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC10459qM3789a = AbstractC2965l.m3789a(interfaceC10459qM3789a, false, (InterfaceC1436k) objM6514H);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(1040398089);
                c6021p.m6553p(false);
            }
            InterfaceC10459q interfaceC10459qM11298d7 = AbstractC10861a.m11298d(AbstractC8079e5.m8502b(interfaceC10459q.mo428M(interfaceC10459qM3789a)), abstractC17140a, c10451i7, interfaceC21090k2, 1.0f, c14356l2, 2);
            C14266V c14266v7 = C14266V.f44767a;
            i16 = c6021p.f19564P;
            InterfaceC10459q interfaceC10459qM10923d7 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11298d7);
            InterfaceC6008i0 interfaceC6008i0M6550m7 = c6021p.m6550m();
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c14266v7);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m7);
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d7);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            } else {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            }
            c6021p.m6553p(true);
            c14356l3 = c14356l2;
            f11 = 1.0f;
            interfaceC21090k3 = interfaceC21090k2;
            interfaceC10446d2 = c10451i7;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5012i(abstractC17140a, str, interfaceC10459q, interfaceC10446d2, interfaceC21090k3, f11, c14356l3, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9107b(EditText editText) {
        return editText.getInputType() != 0;
    }
}
