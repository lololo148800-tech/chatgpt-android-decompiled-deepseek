package p229J0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.draw.AbstractC10861a;
import p017Af.C0491v;
import p049Bm.InterfaceC1436k;
import p1095x1.C21089j;
import p156G1.AbstractC2965l;
import p302M0.AbstractC5267s;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.C14356l;
import p774h1.C14358n;
import p774h1.C14365u;
import p882m1.AbstractC17140a;
import p895n1.AbstractC17421a;
import p895n1.C17425e;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: J0.A1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3878A1 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC10459q f11729a = AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC5267s.f17268a);

    /* JADX WARN: Code duplicated, block: B:101:0x0173  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:83:0x0107  */
    /* JADX WARN: Code duplicated, block: B:84:0x0109  */
    /* JADX WARN: Code duplicated, block: B:87:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0112  */
    /* JADX WARN: Code duplicated, block: B:90:0x0124  */
    /* JADX WARN: Code duplicated, block: B:93:0x0138  */
    /* JADX WARN: Code duplicated, block: B:95:0x0146  */
    /* JADX WARN: Code duplicated, block: B:97:0x0150  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX INFO: renamed from: a */
    public static final void m4596a(AbstractC17140a abstractC17140a, String str, InterfaceC10459q interfaceC10459q, long j10, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        long j11;
        int i13;
        InterfaceC10459q interfaceC10459q3;
        int i14;
        InterfaceC10459q interfaceC10459q4;
        long j12;
        boolean z6;
        Object objM6514H;
        C14356l c14356l;
        ColorFilter porterDuffColorFilter;
        ?? r6;
        InterfaceC10459q interfaceC10459qM3789a;
        long j13;
        long f38830r0;
        boolean z10;
        Object objM6514H2;
        C6018n0 c6018n0M6555r;
        int i15;
        c6021p.m6526U(-2142239481);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(abstractC17140a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(str) ? 32 : 16;
        }
        int i16 = i11 & 4;
        if (i16 == 0) {
            if ((i10 & 384) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                j11 = j10;
                if ((i11 & 8) == 0 || !c6021p.m6540e(j11)) {
                    i15 = 1024;
                } else {
                    i15 = 2048;
                }
                i12 |= i15;
            } else {
                j11 = j10;
            }
            if ((i12 & 1171) == 1170 || !c6021p.m6562y()) {
                c6021p.m6519N();
                i13 = i10 & 1;
                interfaceC10459q3 = C10456n.f30959Y;
                if (i13 != 0 || c6021p.m6561x()) {
                    if (i16 != 0) {
                        interfaceC10459q2 = interfaceC10459q3;
                    }
                    if ((i11 & 8) != 0) {
                        j11 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
                        i12 &= -7169;
                    }
                } else {
                    c6021p.m6517L();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                }
                i14 = i12;
                interfaceC10459q4 = interfaceC10459q2;
                j12 = j11;
                c6021p.m6554q();
                z6 = (((i14 & 7168) ^ 3072) <= 2048 && c6021p.m6540e(j12)) || (i14 & 3072) == 2048;
                objM6514H = c6021p.m6514H();
                C5975S c5975s = C6013l.f19514a;
                if (z6 || objM6514H == c5975s) {
                    if (C14365u.m15775c(j12, C14365u.f45060j)) {
                        c14356l = null;
                    } else {
                        if (Build.VERSION.SDK_INT >= 29) {
                            porterDuffColorFilter = C14358n.f45047a.m15769a(j12, 5);
                        } else {
                            porterDuffColorFilter = new PorterDuffColorFilter(AbstractC14334L.m15617F(j12), AbstractC14334L.m15621J(5));
                        }
                        c14356l = new C14356l(j12, 5, porterDuffColorFilter);
                    }
                    objM6514H = c14356l;
                    c6021p.m6537c0(objM6514H);
                }
                C14356l c14356l2 = (C14356l) objM6514H;
                c6021p.m6524S(-2144891392);
                if (str != null) {
                    if ((i14 & 112) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objM6514H2 = c6021p.m6514H();
                    if (z10 || objM6514H2 == c5975s) {
                        objM6514H2 = new C0491v(str, 16);
                        c6021p.m6537c0(objM6514H2);
                    }
                    r6 = 0;
                    interfaceC10459qM3789a = AbstractC2965l.m3789a(interfaceC10459q3, false, (InterfaceC1436k) objM6514H2);
                } else {
                    r6 = 0;
                    interfaceC10459qM3789a = interfaceC10459q3;
                }
                c6021p.m6553p(r6);
                if (C13803e.m15330b(abstractC17140a.getF38830r0(), 9205357640488583168L)) {
                    interfaceC10459q3 = f11729a;
                } else {
                    f38830r0 = abstractC17140a.getF38830r0();
                    if (Float.isInfinite(C13803e.m15333e(f38830r0)) && Float.isInfinite(C13803e.m15331c(f38830r0))) {
                        interfaceC10459q3 = f11729a;
                    }
                }
                AbstractC17780r.m19507a(AbstractC10861a.m11298d(interfaceC10459q4.mo428M(interfaceC10459q3), abstractC17140a, null, C21089j.f67012o0, 0.0f, c14356l2, 22).mo428M(interfaceC10459qM3789a), c6021p, r6);
                j13 = j12;
            } else {
                c6021p.m6517L();
                interfaceC10459q4 = interfaceC10459q2;
                j13 = j11;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4169z1(abstractC17140a, str, interfaceC10459q4, j13, i10, i11, 1);
            }
        }
        i12 |= 384;
        interfaceC10459q2 = interfaceC10459q;
        if ((i10 & 3072) == 0) {
            j11 = j10;
            if ((i11 & 8) == 0) {
                i15 = 1024;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        } else {
            j11 = j10;
        }
        if ((i12 & 1171) == 1170) {
            c6021p.m6519N();
            i13 = i10 & 1;
            interfaceC10459q3 = C10456n.f30959Y;
            if (i13 != 0) {
                if (i16 != 0) {
                    interfaceC10459q2 = interfaceC10459q3;
                }
                if ((i11 & 8) != 0) {
                    j11 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
                    i12 &= -7169;
                }
            } else {
                if (i16 != 0) {
                    interfaceC10459q2 = interfaceC10459q3;
                }
                if ((i11 & 8) != 0) {
                    j11 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
                    i12 &= -7169;
                }
            }
            i14 = i12;
            interfaceC10459q4 = interfaceC10459q2;
            j12 = j11;
            c6021p.m6554q();
            if (((i14 & 7168) ^ 3072) <= 2048) {
            }
            objM6514H = c6021p.m6514H();
            C5975S c5975s2 = C6013l.f19514a;
            if (z6) {
                if (C14365u.m15775c(j12, C14365u.f45060j)) {
                    c14356l = null;
                } else {
                    if (Build.VERSION.SDK_INT >= 29) {
                        porterDuffColorFilter = C14358n.f45047a.m15769a(j12, 5);
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(AbstractC14334L.m15617F(j12), AbstractC14334L.m15621J(5));
                    }
                    c14356l = new C14356l(j12, 5, porterDuffColorFilter);
                }
                objM6514H = c14356l;
                c6021p.m6537c0(objM6514H);
            } else {
                if (C14365u.m15775c(j12, C14365u.f45060j)) {
                    c14356l = null;
                } else {
                    if (Build.VERSION.SDK_INT >= 29) {
                        porterDuffColorFilter = C14358n.f45047a.m15769a(j12, 5);
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(AbstractC14334L.m15617F(j12), AbstractC14334L.m15621J(5));
                    }
                    c14356l = new C14356l(j12, 5, porterDuffColorFilter);
                }
                objM6514H = c14356l;
                c6021p.m6537c0(objM6514H);
            }
            C14356l c14356l3 = (C14356l) objM6514H;
            c6021p.m6524S(-2144891392);
            if (str != null) {
                if ((i14 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objM6514H2 = c6021p.m6514H();
                if (z10) {
                    objM6514H2 = new C0491v(str, 16);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C0491v(str, 16);
                    c6021p.m6537c0(objM6514H2);
                }
                r6 = 0;
                interfaceC10459qM3789a = AbstractC2965l.m3789a(interfaceC10459q3, false, (InterfaceC1436k) objM6514H2);
            } else {
                r6 = 0;
                interfaceC10459qM3789a = interfaceC10459q3;
            }
            c6021p.m6553p(r6);
            if (C13803e.m15330b(abstractC17140a.getF38830r0(), 9205357640488583168L)) {
                f38830r0 = abstractC17140a.getF38830r0();
                if (Float.isInfinite(C13803e.m15333e(f38830r0))) {
                    interfaceC10459q3 = f11729a;
                }
            } else {
                interfaceC10459q3 = f11729a;
            }
            AbstractC17780r.m19507a(AbstractC10861a.m11298d(interfaceC10459q4.mo428M(interfaceC10459q3), abstractC17140a, null, C21089j.f67012o0, 0.0f, c14356l3, 22).mo428M(interfaceC10459qM3789a), c6021p, r6);
            j13 = j12;
        } else {
            c6021p.m6519N();
            i13 = i10 & 1;
            interfaceC10459q3 = C10456n.f30959Y;
            if (i13 != 0) {
                if (i16 != 0) {
                    interfaceC10459q2 = interfaceC10459q3;
                }
                if ((i11 & 8) != 0) {
                    j11 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
                    i12 &= -7169;
                }
            } else {
                if (i16 != 0) {
                    interfaceC10459q2 = interfaceC10459q3;
                }
                if ((i11 & 8) != 0) {
                    j11 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
                    i12 &= -7169;
                }
            }
            i14 = i12;
            interfaceC10459q4 = interfaceC10459q2;
            j12 = j11;
            c6021p.m6554q();
            if (((i14 & 7168) ^ 3072) <= 2048) {
            }
            objM6514H = c6021p.m6514H();
            C5975S c5975s3 = C6013l.f19514a;
            if (z6) {
                if (C14365u.m15775c(j12, C14365u.f45060j)) {
                    c14356l = null;
                } else {
                    if (Build.VERSION.SDK_INT >= 29) {
                        porterDuffColorFilter = C14358n.f45047a.m15769a(j12, 5);
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(AbstractC14334L.m15617F(j12), AbstractC14334L.m15621J(5));
                    }
                    c14356l = new C14356l(j12, 5, porterDuffColorFilter);
                }
                objM6514H = c14356l;
                c6021p.m6537c0(objM6514H);
            } else {
                if (C14365u.m15775c(j12, C14365u.f45060j)) {
                    c14356l = null;
                } else {
                    if (Build.VERSION.SDK_INT >= 29) {
                        porterDuffColorFilter = C14358n.f45047a.m15769a(j12, 5);
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(AbstractC14334L.m15617F(j12), AbstractC14334L.m15621J(5));
                    }
                    c14356l = new C14356l(j12, 5, porterDuffColorFilter);
                }
                objM6514H = c14356l;
                c6021p.m6537c0(objM6514H);
            }
            C14356l c14356l4 = (C14356l) objM6514H;
            c6021p.m6524S(-2144891392);
            if (str != null) {
                if ((i14 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objM6514H2 = c6021p.m6514H();
                if (z10) {
                    objM6514H2 = new C0491v(str, 16);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C0491v(str, 16);
                    c6021p.m6537c0(objM6514H2);
                }
                r6 = 0;
                interfaceC10459qM3789a = AbstractC2965l.m3789a(interfaceC10459q3, false, (InterfaceC1436k) objM6514H2);
            } else {
                r6 = 0;
                interfaceC10459qM3789a = interfaceC10459q3;
            }
            c6021p.m6553p(r6);
            if (C13803e.m15330b(abstractC17140a.getF38830r0(), 9205357640488583168L)) {
                f38830r0 = abstractC17140a.getF38830r0();
                if (Float.isInfinite(C13803e.m15333e(f38830r0))) {
                    interfaceC10459q3 = f11729a;
                }
            } else {
                interfaceC10459q3 = f11729a;
            }
            AbstractC17780r.m19507a(AbstractC10861a.m11298d(interfaceC10459q4.mo428M(interfaceC10459q3), abstractC17140a, null, C21089j.f67012o0, 0.0f, c14356l4, 22).mo428M(interfaceC10459qM3789a), c6021p, r6);
            j13 = j12;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4169z1(abstractC17140a, str, interfaceC10459q4, j13, i10, i11, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m4597b(C17425e c17425e, String str, InterfaceC10459q interfaceC10459q, long j10, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        long j11;
        InterfaceC10459q interfaceC10459q3;
        InterfaceC10459q interfaceC10459q4;
        long j12;
        InterfaceC10459q interfaceC10459q5;
        long j13;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(-126890956);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(c17425e) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(str) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 == 0) {
            if ((i10 & 384) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    j11 = j10;
                    int i14 = c6021p.m6540e(j11) ? 2048 : 1024;
                    i12 |= i14;
                } else {
                    j11 = j10;
                }
                i12 |= i14;
            } else {
                j11 = j10;
            }
            if ((i12 & 1171) == 1170 || !c6021p.m6562y()) {
                c6021p.m6519N();
                if ((i10 & 1) != 0 || c6021p.m6561x()) {
                    if (i13 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        interfaceC10459q4 = interfaceC10459q3;
                        j12 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
                    } else {
                        interfaceC10459q4 = interfaceC10459q3;
                    }
                    c6021p.m6554q();
                    m4596a(AbstractC17421a.m19116c(c17425e, c6021p), str, interfaceC10459q4, j12, c6021p, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
                    interfaceC10459q5 = interfaceC10459q4;
                    j13 = j12;
                } else {
                    c6021p.m6517L();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    interfaceC10459q4 = interfaceC10459q2;
                }
                j12 = j11;
                c6021p.m6554q();
                m4596a(AbstractC17421a.m19116c(c17425e, c6021p), str, interfaceC10459q4, j12, c6021p, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
                interfaceC10459q5 = interfaceC10459q4;
                j13 = j12;
            } else {
                c6021p.m6517L();
                interfaceC10459q5 = interfaceC10459q2;
                j13 = j11;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4169z1(c17425e, str, interfaceC10459q5, j13, i10, i11, 0);
            }
        }
        i12 |= 384;
        interfaceC10459q2 = interfaceC10459q;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                j11 = j10;
                if (c6021p.m6540e(j11)) {
                }
                i12 |= i14;
            } else {
                j11 = j10;
            }
            i12 |= i14;
        } else {
            j11 = j10;
        }
        if ((i12 & 1171) == 1170) {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    interfaceC10459q4 = interfaceC10459q3;
                    j12 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
                } else {
                    interfaceC10459q4 = interfaceC10459q3;
                    j12 = j11;
                }
            } else {
                if (i13 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    interfaceC10459q4 = interfaceC10459q3;
                    j12 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
                } else {
                    interfaceC10459q4 = interfaceC10459q3;
                    j12 = j11;
                }
            }
            c6021p.m6554q();
            m4596a(AbstractC17421a.m19116c(c17425e, c6021p), str, interfaceC10459q4, j12, c6021p, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
            interfaceC10459q5 = interfaceC10459q4;
            j13 = j12;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    interfaceC10459q4 = interfaceC10459q3;
                    j12 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
                } else {
                    interfaceC10459q4 = interfaceC10459q3;
                    j12 = j11;
                }
            } else {
                if (i13 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    interfaceC10459q4 = interfaceC10459q3;
                    j12 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
                } else {
                    interfaceC10459q4 = interfaceC10459q3;
                    j12 = j11;
                }
            }
            c6021p.m6554q();
            m4596a(AbstractC17421a.m19116c(c17425e, c6021p), str, interfaceC10459q4, j12, c6021p, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168), 0);
            interfaceC10459q5 = interfaceC10459q4;
            j13 = j12;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4169z1(c17425e, str, interfaceC10459q5, j13, i10, i11, 0);
        }
    }
}
