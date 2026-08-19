package p523V9;

import ad.C10543d;
import ad.C10544e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p067Cd.C1632f;
import p1155zi.C21984a1;
import p204I1.C3582M;
import p229J0.AbstractC3947L4;
import p229J0.C3941K4;
import p236J7.AbstractC4283g;
import p236J7.C4277a;
import p236J7.C4278b;
import p236J7.C4279c;
import p236J7.C4280d;
import p236J7.C4282f;
import p349O0.C6018n0;
import p349O0.C6021p;
import p381Pe.C6394e;
import p381Pe.C6397h;
import p403Qd.C6636i;
import p403Qd.EnumC6606L;
import p479Td.C7330P;
import p479Td.C7351f0;
import p479Td.EnumC7355h0;
import p479Td.EnumC7359j0;
import p502Uc.AbstractC7622f;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9393x3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p984r8.C18890d;

/* JADX INFO: renamed from: V9.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8042a0 {
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd A[PHI: r2 r3 r6 r10
      0x00bd: PHI (r2v17 int) = (r2v11 int), (r2v18 int) binds: [B:78:0x00d1, B:68:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r3v6 a1.q) = (r3v2 a1.q), (r3v8 a1.q) binds: [B:78:0x00d1, B:68:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r6v6 long) = (r6v3 long), (r6v2 long) binds: [B:78:0x00d1, B:68:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r10v6 long) = (r10v3 long), (r10v2 long) binds: [B:78:0x00d1, B:68:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x0109  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m8413a(String text, InterfaceC10459q interfaceC10459q, long j10, long j11, C3582M c3582m, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        long j12;
        int i14;
        int i15;
        long j13;
        int i16;
        C3582M c3582m2;
        InterfaceC10459q interfaceC10459q3;
        C3582M c3582m3;
        InterfaceC10459q interfaceC10459q4;
        C3582M c3582m4;
        long j14;
        long j15;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(text, "text");
        c6021p.m6526U(293833305);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 48) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    j12 = j10;
                    if (c6021p.m6540e(j12)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        j13 = j11;
                        if (c6021p.m6540e(j13)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        if ((i11 & 16) == 0) {
                            c3582m2 = c3582m;
                            int i18 = c6021p.m6542f(c3582m2) ? 16384 : 8192;
                            i12 |= i18;
                        } else {
                            c3582m2 = c3582m;
                        }
                        i12 |= i18;
                    } else {
                        c3582m2 = c3582m;
                    }
                    if ((i12 & 9363) == 9362 || !c6021p.m6562y()) {
                        c6021p.m6519N();
                        if ((i10 & 1) != 0 || c6021p.m6561x()) {
                            if (i17 != 0) {
                                interfaceC10459q3 = C10456n.f30959Y;
                            } else {
                                interfaceC10459q3 = interfaceC10459q2;
                            }
                            if (i13 != 0) {
                                j12 = C14365u.f45060j;
                            }
                            if (i15 != 0) {
                                j13 = C14365u.f45060j;
                            }
                            if ((i11 & 16) != 0) {
                                c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                                i12 &= -57345;
                            }
                            c6021p.m6554q();
                            AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
                            interfaceC10459q4 = interfaceC10459q3;
                            c3582m4 = c3582m3;
                            j14 = j12;
                            j15 = j13;
                        } else {
                            c6021p.m6517L();
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        c3582m3 = c3582m2;
                        c6021p.m6554q();
                        AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
                        interfaceC10459q4 = interfaceC10459q3;
                        c3582m4 = c3582m3;
                        j14 = j12;
                        j15 = j13;
                    } else {
                        c6021p.m6517L();
                        interfaceC10459q4 = interfaceC10459q2;
                        j14 = j12;
                        j15 = j13;
                        c3582m4 = c3582m2;
                    }
                    c6018n0M6555r = c6021p.m6555r();
                    if (c6018n0M6555r != null) {
                        c6018n0M6555r.f19536d = new C10544e(text, interfaceC10459q4, j14, j15, c3582m4, i10, i11);
                    }
                }
                i12 |= 3072;
                j13 = j11;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        c3582m2 = c3582m;
                        if (c6021p.m6542f(c3582m2)) {
                        }
                        i12 |= i18;
                    } else {
                        c3582m2 = c3582m;
                    }
                    i12 |= i18;
                } else {
                    c3582m2 = c3582m;
                }
                if ((i12 & 9363) == 9362) {
                    c6021p.m6519N();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            j12 = C14365u.f45060j;
                        }
                        if (i15 != 0) {
                            j13 = C14365u.f45060j;
                        }
                        if ((i11 & 16) != 0) {
                            c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                            i12 &= -57345;
                        } else {
                            c3582m3 = c3582m2;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            j12 = C14365u.f45060j;
                        }
                        if (i15 != 0) {
                            j13 = C14365u.f45060j;
                        }
                        if ((i11 & 16) != 0) {
                            c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                            i12 &= -57345;
                        } else {
                            c3582m3 = c3582m2;
                        }
                    }
                    c6021p.m6554q();
                    AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
                    interfaceC10459q4 = interfaceC10459q3;
                    c3582m4 = c3582m3;
                    j14 = j12;
                    j15 = j13;
                } else {
                    c6021p.m6519N();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            j12 = C14365u.f45060j;
                        }
                        if (i15 != 0) {
                            j13 = C14365u.f45060j;
                        }
                        if ((i11 & 16) != 0) {
                            c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                            i12 &= -57345;
                        } else {
                            c3582m3 = c3582m2;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            j12 = C14365u.f45060j;
                        }
                        if (i15 != 0) {
                            j13 = C14365u.f45060j;
                        }
                        if ((i11 & 16) != 0) {
                            c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                            i12 &= -57345;
                        } else {
                            c3582m3 = c3582m2;
                        }
                    }
                    c6021p.m6554q();
                    AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
                    interfaceC10459q4 = interfaceC10459q3;
                    c3582m4 = c3582m3;
                    j14 = j12;
                    j15 = j13;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C10544e(text, interfaceC10459q4, j14, j15, c3582m4, i10, i11);
                }
            }
            i12 |= 384;
            j12 = j10;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    j13 = j11;
                    if (c6021p.m6540e(j13)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        c3582m2 = c3582m;
                        if (c6021p.m6542f(c3582m2)) {
                        }
                        i12 |= i18;
                    } else {
                        c3582m2 = c3582m;
                    }
                    i12 |= i18;
                } else {
                    c3582m2 = c3582m;
                }
                if ((i12 & 9363) == 9362) {
                    c6021p.m6519N();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            j12 = C14365u.f45060j;
                        }
                        if (i15 != 0) {
                            j13 = C14365u.f45060j;
                        }
                        if ((i11 & 16) != 0) {
                            c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                            i12 &= -57345;
                        } else {
                            c3582m3 = c3582m2;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            j12 = C14365u.f45060j;
                        }
                        if (i15 != 0) {
                            j13 = C14365u.f45060j;
                        }
                        if ((i11 & 16) != 0) {
                            c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                            i12 &= -57345;
                        } else {
                            c3582m3 = c3582m2;
                        }
                    }
                    c6021p.m6554q();
                    AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
                    interfaceC10459q4 = interfaceC10459q3;
                    c3582m4 = c3582m3;
                    j14 = j12;
                    j15 = j13;
                } else {
                    c6021p.m6519N();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            j12 = C14365u.f45060j;
                        }
                        if (i15 != 0) {
                            j13 = C14365u.f45060j;
                        }
                        if ((i11 & 16) != 0) {
                            c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                            i12 &= -57345;
                        } else {
                            c3582m3 = c3582m2;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            j12 = C14365u.f45060j;
                        }
                        if (i15 != 0) {
                            j13 = C14365u.f45060j;
                        }
                        if ((i11 & 16) != 0) {
                            c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                            i12 &= -57345;
                        } else {
                            c3582m3 = c3582m2;
                        }
                    }
                    c6021p.m6554q();
                    AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
                    interfaceC10459q4 = interfaceC10459q3;
                    c3582m4 = c3582m3;
                    j14 = j12;
                    j15 = j13;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C10544e(text, interfaceC10459q4, j14, j15, c3582m4, i10, i11);
                }
            }
            i12 |= 3072;
            j13 = j11;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    c3582m2 = c3582m;
                    if (c6021p.m6542f(c3582m2)) {
                    }
                    i12 |= i18;
                } else {
                    c3582m2 = c3582m;
                }
                i12 |= i18;
            } else {
                c3582m2 = c3582m;
            }
            if ((i12 & 9363) == 9362) {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        j12 = C14365u.f45060j;
                    }
                    if (i15 != 0) {
                        j13 = C14365u.f45060j;
                    }
                    if ((i11 & 16) != 0) {
                        c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                        i12 &= -57345;
                    } else {
                        c3582m3 = c3582m2;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        j12 = C14365u.f45060j;
                    }
                    if (i15 != 0) {
                        j13 = C14365u.f45060j;
                    }
                    if ((i11 & 16) != 0) {
                        c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                        i12 &= -57345;
                    } else {
                        c3582m3 = c3582m2;
                    }
                }
                c6021p.m6554q();
                AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
                interfaceC10459q4 = interfaceC10459q3;
                c3582m4 = c3582m3;
                j14 = j12;
                j15 = j13;
            } else {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        j12 = C14365u.f45060j;
                    }
                    if (i15 != 0) {
                        j13 = C14365u.f45060j;
                    }
                    if ((i11 & 16) != 0) {
                        c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                        i12 &= -57345;
                    } else {
                        c3582m3 = c3582m2;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        j12 = C14365u.f45060j;
                    }
                    if (i15 != 0) {
                        j13 = C14365u.f45060j;
                    }
                    if ((i11 & 16) != 0) {
                        c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                        i12 &= -57345;
                    } else {
                        c3582m3 = c3582m2;
                    }
                }
                c6021p.m6554q();
                AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
                interfaceC10459q4 = interfaceC10459q3;
                c3582m4 = c3582m3;
                j14 = j12;
                j15 = j13;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C10544e(text, interfaceC10459q4, j14, j15, c3582m4, i10, i11);
            }
        }
        i12 |= 48;
        interfaceC10459q2 = interfaceC10459q;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                j12 = j10;
                if (c6021p.m6540e(j12)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    j13 = j11;
                    if (c6021p.m6540e(j13)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        c3582m2 = c3582m;
                        if (c6021p.m6542f(c3582m2)) {
                        }
                        i12 |= i18;
                    } else {
                        c3582m2 = c3582m;
                    }
                    i12 |= i18;
                } else {
                    c3582m2 = c3582m;
                }
                if ((i12 & 9363) == 9362) {
                    c6021p.m6519N();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            j12 = C14365u.f45060j;
                        }
                        if (i15 != 0) {
                            j13 = C14365u.f45060j;
                        }
                        if ((i11 & 16) != 0) {
                            c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                            i12 &= -57345;
                        } else {
                            c3582m3 = c3582m2;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            j12 = C14365u.f45060j;
                        }
                        if (i15 != 0) {
                            j13 = C14365u.f45060j;
                        }
                        if ((i11 & 16) != 0) {
                            c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                            i12 &= -57345;
                        } else {
                            c3582m3 = c3582m2;
                        }
                    }
                    c6021p.m6554q();
                    AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
                    interfaceC10459q4 = interfaceC10459q3;
                    c3582m4 = c3582m3;
                    j14 = j12;
                    j15 = j13;
                } else {
                    c6021p.m6519N();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            j12 = C14365u.f45060j;
                        }
                        if (i15 != 0) {
                            j13 = C14365u.f45060j;
                        }
                        if ((i11 & 16) != 0) {
                            c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                            i12 &= -57345;
                        } else {
                            c3582m3 = c3582m2;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        if (i13 != 0) {
                            j12 = C14365u.f45060j;
                        }
                        if (i15 != 0) {
                            j13 = C14365u.f45060j;
                        }
                        if ((i11 & 16) != 0) {
                            c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                            i12 &= -57345;
                        } else {
                            c3582m3 = c3582m2;
                        }
                    }
                    c6021p.m6554q();
                    AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
                    interfaceC10459q4 = interfaceC10459q3;
                    c3582m4 = c3582m3;
                    j14 = j12;
                    j15 = j13;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C10544e(text, interfaceC10459q4, j14, j15, c3582m4, i10, i11);
                }
            }
            i12 |= 3072;
            j13 = j11;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    c3582m2 = c3582m;
                    if (c6021p.m6542f(c3582m2)) {
                    }
                    i12 |= i18;
                } else {
                    c3582m2 = c3582m;
                }
                i12 |= i18;
            } else {
                c3582m2 = c3582m;
            }
            if ((i12 & 9363) == 9362) {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        j12 = C14365u.f45060j;
                    }
                    if (i15 != 0) {
                        j13 = C14365u.f45060j;
                    }
                    if ((i11 & 16) != 0) {
                        c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                        i12 &= -57345;
                    } else {
                        c3582m3 = c3582m2;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        j12 = C14365u.f45060j;
                    }
                    if (i15 != 0) {
                        j13 = C14365u.f45060j;
                    }
                    if ((i11 & 16) != 0) {
                        c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                        i12 &= -57345;
                    } else {
                        c3582m3 = c3582m2;
                    }
                }
                c6021p.m6554q();
                AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
                interfaceC10459q4 = interfaceC10459q3;
                c3582m4 = c3582m3;
                j14 = j12;
                j15 = j13;
            } else {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        j12 = C14365u.f45060j;
                    }
                    if (i15 != 0) {
                        j13 = C14365u.f45060j;
                    }
                    if ((i11 & 16) != 0) {
                        c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                        i12 &= -57345;
                    } else {
                        c3582m3 = c3582m2;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        j12 = C14365u.f45060j;
                    }
                    if (i15 != 0) {
                        j13 = C14365u.f45060j;
                    }
                    if ((i11 & 16) != 0) {
                        c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                        i12 &= -57345;
                    } else {
                        c3582m3 = c3582m2;
                    }
                }
                c6021p.m6554q();
                AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
                interfaceC10459q4 = interfaceC10459q3;
                c3582m4 = c3582m3;
                j14 = j12;
                j15 = j13;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C10544e(text, interfaceC10459q4, j14, j15, c3582m4, i10, i11);
            }
        }
        i12 |= 384;
        j12 = j10;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                j13 = j11;
                if (c6021p.m6540e(j13)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    c3582m2 = c3582m;
                    if (c6021p.m6542f(c3582m2)) {
                    }
                    i12 |= i18;
                } else {
                    c3582m2 = c3582m;
                }
                i12 |= i18;
            } else {
                c3582m2 = c3582m;
            }
            if ((i12 & 9363) == 9362) {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        j12 = C14365u.f45060j;
                    }
                    if (i15 != 0) {
                        j13 = C14365u.f45060j;
                    }
                    if ((i11 & 16) != 0) {
                        c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                        i12 &= -57345;
                    } else {
                        c3582m3 = c3582m2;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        j12 = C14365u.f45060j;
                    }
                    if (i15 != 0) {
                        j13 = C14365u.f45060j;
                    }
                    if ((i11 & 16) != 0) {
                        c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                        i12 &= -57345;
                    } else {
                        c3582m3 = c3582m2;
                    }
                }
                c6021p.m6554q();
                AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
                interfaceC10459q4 = interfaceC10459q3;
                c3582m4 = c3582m3;
                j14 = j12;
                j15 = j13;
            } else {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        j12 = C14365u.f45060j;
                    }
                    if (i15 != 0) {
                        j13 = C14365u.f45060j;
                    }
                    if ((i11 & 16) != 0) {
                        c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                        i12 &= -57345;
                    } else {
                        c3582m3 = c3582m2;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        j12 = C14365u.f45060j;
                    }
                    if (i15 != 0) {
                        j13 = C14365u.f45060j;
                    }
                    if ((i11 & 16) != 0) {
                        c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                        i12 &= -57345;
                    } else {
                        c3582m3 = c3582m2;
                    }
                }
                c6021p.m6554q();
                AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
                interfaceC10459q4 = interfaceC10459q3;
                c3582m4 = c3582m3;
                j14 = j12;
                j15 = j13;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C10544e(text, interfaceC10459q4, j14, j15, c3582m4, i10, i11);
            }
        }
        i12 |= 3072;
        j13 = j11;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                c3582m2 = c3582m;
                if (c6021p.m6542f(c3582m2)) {
                }
                i12 |= i18;
            } else {
                c3582m2 = c3582m;
            }
            i12 |= i18;
        } else {
            c3582m2 = c3582m;
        }
        if ((i12 & 9363) == 9362) {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    j12 = C14365u.f45060j;
                }
                if (i15 != 0) {
                    j13 = C14365u.f45060j;
                }
                if ((i11 & 16) != 0) {
                    c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                    i12 &= -57345;
                } else {
                    c3582m3 = c3582m2;
                }
            } else {
                if (i17 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    j12 = C14365u.f45060j;
                }
                if (i15 != 0) {
                    j13 = C14365u.f45060j;
                }
                if ((i11 & 16) != 0) {
                    c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                    i12 &= -57345;
                } else {
                    c3582m3 = c3582m2;
                }
            }
            c6021p.m6554q();
            AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
            interfaceC10459q4 = interfaceC10459q3;
            c3582m4 = c3582m3;
            j14 = j12;
            j15 = j13;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    j12 = C14365u.f45060j;
                }
                if (i15 != 0) {
                    j13 = C14365u.f45060j;
                }
                if ((i11 & 16) != 0) {
                    c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                    i12 &= -57345;
                } else {
                    c3582m3 = c3582m2;
                }
            } else {
                if (i17 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    j12 = C14365u.f45060j;
                }
                if (i15 != 0) {
                    j13 = C14365u.f45060j;
                }
                if ((i11 & 16) != 0) {
                    c3582m3 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                    i12 &= -57345;
                } else {
                    c3582m3 = c3582m2;
                }
            }
            c6021p.m6554q();
            AbstractC7622f.m7962a(text, true, AbstractC8411c.m8969c(-144790613, c6021p, new C10543d(interfaceC10459q3, j12, c3582m3, j13)), c6021p, (i12 & 14) | 432);
            interfaceC10459q4 = interfaceC10459q3;
            c3582m4 = c3582m3;
            j14 = j12;
            j15 = j13;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10544e(text, interfaceC10459q4, j14, j15, c3582m4, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m8414b(C6636i childMessageLists, String str) {
        AbstractC16544l.m18094g(childMessageLists, "$this$childMessageLists");
        C6394e c6394e = childMessageLists.f21399u;
        Collection collectionValues = c6394e.f20814b.values();
        ArrayList<C6397h> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            String str2 = ((C7351f0) ((C6397h) obj).f20822d).f23287b;
            if (str2 == null ? false : str2.equals(str)) {
                arrayList.add(obj);
            }
        }
        ArrayList<List> arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        for (C6397h c6397h : arrayList) {
            arrayList2.add(AbstractC17680n.m19361k0(C6394e.m7024b(c6394e, c6397h.f20819a), AbstractC9393x3.m9974d(c6397h)));
        }
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
        for (List list : arrayList2) {
            ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList4.add((C7351f0) ((C6397h) it.next()).f20822d);
            }
            arrayList3.add(arrayList4);
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: c */
    public static final EnumC6606L m8415c(ArrayList arrayList) {
        AbstractC16544l.m18094g(arrayList, "<this>");
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C7351f0 c7351f0 = (C7351f0) it.next();
                AbstractC16544l.m18094g(c7351f0, "<this>");
                if (c7351f0.f23291f instanceof C7330P) {
                    return EnumC6606L.f21330p0;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (m8419g((C7351f0) it2.next())) {
                    return EnumC6606L.f21328Z;
                }
            }
        }
        C7351f0 c7351f1 = (C7351f0) AbstractC17680n.m19353c0(arrayList);
        return (c7351f1 == null || !c7351f1.f23284T) ? EnumC6606L.f21327Y : EnumC6606L.f21329o0;
    }

    /* JADX INFO: renamed from: d */
    public static final C18890d m8416d(AbstractC4283g abstractC4283g) {
        AbstractC16544l.m18094g(abstractC4283g, "<this>");
        if (!(abstractC4283g instanceof C4280d)) {
            return abstractC4283g instanceof C4279c ? new C18890d(m8421i(abstractC4283g), ((C4279c) abstractC4283g).f13946a, null) : new C18890d(m8421i(abstractC4283g), "", null);
        }
        int iM8421i = m8421i(abstractC4283g);
        C4280d c4280d = (C4280d) abstractC4283g;
        return new C18890d(iM8421i, c4280d.f13946a, c4280d.f13945d);
    }

    /* JADX INFO: renamed from: e */
    public static final EnumC6606L m8417e(C7351f0 c7351f0) {
        AbstractC16544l.m18094g(c7351f0, "<this>");
        if (c7351f0.f23291f instanceof C7330P) {
            return EnumC6606L.f21330p0;
        }
        if (m8418f(c7351f0)) {
            return EnumC6606L.f21329o0;
        }
        return m8419g(c7351f0) ? EnumC6606L.f21328Z : EnumC6606L.f21327Y;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m8418f(C7351f0 c7351f0) {
        AbstractC16544l.m18094g(c7351f0, "<this>");
        if (c7351f0.f23293h != EnumC7355h0.f23320Z) {
            if (c7351f0.f23290e == EnumC7359j0.f23344o0 && c7351f0.f23284T) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m8419g(C7351f0 c7351f0) {
        AbstractC16544l.m18094g(c7351f0, "<this>");
        if (c7351f0.f23293h == EnumC7355h0.f23320Z) {
            if (c7351f0.f23290e == EnumC7359j0.f23344o0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList m8420h(C6636i messageList) {
        AbstractC16544l.m18094g(messageList, "$this$messageList");
        Object obj = messageList.m7164c().f20819a;
        C6394e c6394e = messageList.f21399u;
        C6397h c6397h = (C6397h) c6394e.f20814b.get(obj);
        if (c6397h == null) {
            c6394e.m7032i(obj);
            throw null;
        }
        ArrayList arrayListM19362l0 = AbstractC17680n.m19362l0(C6394e.m7025d(c6394e, obj), c6397h);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM19362l0, 10));
        int i10 = 0;
        for (Object obj2 : arrayListM19362l0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            C7351f0 c7351f0 = (C7351f0) ((C6397h) obj2).f20822d;
            arrayList.add(C7351f0.m7781a(c7351f0, null, null, null, (C1632f) messageList.f21385g.get(new C21984a1(c7351f0.f23286a)), null, false, i10 == arrayListM19362l0.size() - 1, -4097, 495));
            i10 = i11;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static final int m8421i(AbstractC4283g abstractC4283g) {
        AbstractC16544l.m18094g(abstractC4283g, "<this>");
        if (abstractC4283g instanceof C4279c) {
            return 1;
        }
        if (abstractC4283g instanceof C4280d) {
            return 2;
        }
        if (abstractC4283g instanceof C4277a) {
            return 3;
        }
        if (abstractC4283g instanceof C4282f) {
            return 6;
        }
        if (abstractC4283g instanceof C4278b) {
            return 4;
        }
        throw new C0644w();
    }
}
