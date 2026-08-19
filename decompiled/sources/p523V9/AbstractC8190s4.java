package p523V9;

import android.net.Uri;
import cd.C11701a;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p229J0.AbstractC4101o;
import p229J0.AbstractC4141u3;
import p229J0.C4135t3;
import p349O0.C6018n0;
import p349O0.C6021p;
import p478Tc.AbstractC7306j;
import p537W0.C8410b;
import p544W9.AbstractC8479G;
import p571X9.AbstractC9400y4;
import p587Y1.C9596v;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p773h0.C14322z0;

/* JADX INFO: renamed from: V9.s4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8190s4 {
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x013d  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m8770a(boolean z6, InterfaceC1426a onDismissRequest, InterfaceC10459q interfaceC10459q, long j10, C14322z0 c14322z0, C9596v c9596v, C8410b c8410b, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        int i14;
        C9596v c9596v2;
        int i15;
        InterfaceC10459q interfaceC10459q3;
        C14322z0 c14322z0M9124e;
        int i16;
        C9596v c9596v3;
        long j11;
        InterfaceC10459q interfaceC10459q4;
        long j12;
        C14322z0 c14322z1;
        C9596v c9596v4;
        C6018n0 c6018n0M6555r;
        int i17;
        AbstractC16544l.m18094g(onDismissRequest, "onDismissRequest");
        c6021p.m6526U(1836845031);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(onDismissRequest) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & 384) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 256 : 128;
            }
            i13 = i12 | 3072;
            if ((i10 & 24576) == 0) {
                i13 = i12 | 11264;
            }
            i14 = i11 & 32;
            if (i14 != 0) {
                if ((196608 & i10) == 0) {
                    c9596v2 = c9596v;
                    if (c6021p.m6542f(c9596v2)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i13 |= i15;
                }
                if ((1572864 & i10) != 0) {
                    if (c6021p.m6545h(c8410b)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i13 |= i17;
                }
                if ((599187 & i13) == 599186 || !c6021p.m6562y()) {
                    c6021p.m6519N();
                    if ((i10 & 1) != 0 || c6021p.m6561x()) {
                        if (i18 != 0) {
                            interfaceC10459q3 = C10456n.f30959Y;
                        } else {
                            interfaceC10459q3 = interfaceC10459q2;
                        }
                        float f10 = 0;
                        long jM9978a = AbstractC9400y4.m9978a(f10, f10);
                        c14322z0M9124e = AbstractC8479G.m9124e(c6021p);
                        i16 = i13 & (-57345);
                        if (i14 != 0) {
                            c9596v3 = new C9596v(true, 14);
                        } else {
                            c9596v3 = c9596v2;
                        }
                        j11 = jM9978a;
                    } else {
                        c6021p.m6517L();
                        i16 = i13 & (-57345);
                        j11 = j10;
                        c14322z0M9124e = c14322z0;
                        interfaceC10459q3 = interfaceC10459q2;
                        c9596v3 = c9596v2;
                    }
                    c6021p.m6554q();
                    AbstractC4101o.m4760a(z6, onDismissRequest, interfaceC10459q3, j11, c14322z0M9124e, c9596v3, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13378b, 0L, 0.0f, AbstractC7306j.f23143a, null, c8410b, c6021p, (i16 & 14) | 805306368 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (458752 & i16), (i16 >> 15) & 112);
                    interfaceC10459q4 = interfaceC10459q3;
                    j12 = j11;
                    c14322z1 = c14322z0M9124e;
                    c9596v4 = c9596v3;
                } else {
                    c6021p.m6517L();
                    c14322z1 = c14322z0;
                    interfaceC10459q4 = interfaceC10459q2;
                    c9596v4 = c9596v2;
                    j12 = j10;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C11701a(z6, onDismissRequest, interfaceC10459q4, j12, c14322z1, c9596v4, c8410b, i10, i11);
                }
            }
            i13 |= 196608;
            c9596v2 = c9596v;
            if ((1572864 & i10) != 0) {
                if (c6021p.m6545h(c8410b)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i13 |= i17;
            }
            if ((599187 & i13) == 599186) {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    float f11 = 0;
                    long jM9978a2 = AbstractC9400y4.m9978a(f11, f11);
                    c14322z0M9124e = AbstractC8479G.m9124e(c6021p);
                    i16 = i13 & (-57345);
                    if (i14 != 0) {
                        c9596v3 = new C9596v(true, 14);
                    } else {
                        c9596v3 = c9596v2;
                    }
                    j11 = jM9978a2;
                } else {
                    if (i18 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    float f12 = 0;
                    long jM9978a3 = AbstractC9400y4.m9978a(f12, f12);
                    c14322z0M9124e = AbstractC8479G.m9124e(c6021p);
                    i16 = i13 & (-57345);
                    if (i14 != 0) {
                        c9596v3 = new C9596v(true, 14);
                    } else {
                        c9596v3 = c9596v2;
                    }
                    j11 = jM9978a3;
                }
                c6021p.m6554q();
                AbstractC4101o.m4760a(z6, onDismissRequest, interfaceC10459q3, j11, c14322z0M9124e, c9596v3, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13378b, 0L, 0.0f, AbstractC7306j.f23143a, null, c8410b, c6021p, (i16 & 14) | 805306368 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (458752 & i16), (i16 >> 15) & 112);
                interfaceC10459q4 = interfaceC10459q3;
                j12 = j11;
                c14322z1 = c14322z0M9124e;
                c9596v4 = c9596v3;
            } else {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    float f13 = 0;
                    long jM9978a4 = AbstractC9400y4.m9978a(f13, f13);
                    c14322z0M9124e = AbstractC8479G.m9124e(c6021p);
                    i16 = i13 & (-57345);
                    if (i14 != 0) {
                        c9596v3 = new C9596v(true, 14);
                    } else {
                        c9596v3 = c9596v2;
                    }
                    j11 = jM9978a4;
                } else {
                    if (i18 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    float f14 = 0;
                    long jM9978a5 = AbstractC9400y4.m9978a(f14, f14);
                    c14322z0M9124e = AbstractC8479G.m9124e(c6021p);
                    i16 = i13 & (-57345);
                    if (i14 != 0) {
                        c9596v3 = new C9596v(true, 14);
                    } else {
                        c9596v3 = c9596v2;
                    }
                    j11 = jM9978a5;
                }
                c6021p.m6554q();
                AbstractC4101o.m4760a(z6, onDismissRequest, interfaceC10459q3, j11, c14322z0M9124e, c9596v3, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13378b, 0L, 0.0f, AbstractC7306j.f23143a, null, c8410b, c6021p, (i16 & 14) | 805306368 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (458752 & i16), (i16 >> 15) & 112);
                interfaceC10459q4 = interfaceC10459q3;
                j12 = j11;
                c14322z1 = c14322z0M9124e;
                c9596v4 = c9596v3;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C11701a(z6, onDismissRequest, interfaceC10459q4, j12, c14322z1, c9596v4, c8410b, i10, i11);
            }
        }
        i12 |= 384;
        interfaceC10459q2 = interfaceC10459q;
        i13 = i12 | 3072;
        if ((i10 & 24576) == 0) {
            i13 = i12 | 11264;
        }
        i14 = i11 & 32;
        if (i14 != 0) {
            if ((196608 & i10) == 0) {
                c9596v2 = c9596v;
                if (c6021p.m6542f(c9596v2)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i13 |= i15;
            }
            if ((1572864 & i10) != 0) {
                if (c6021p.m6545h(c8410b)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i13 |= i17;
            }
            if ((599187 & i13) == 599186) {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    float f15 = 0;
                    long jM9978a6 = AbstractC9400y4.m9978a(f15, f15);
                    c14322z0M9124e = AbstractC8479G.m9124e(c6021p);
                    i16 = i13 & (-57345);
                    if (i14 != 0) {
                        c9596v3 = new C9596v(true, 14);
                    } else {
                        c9596v3 = c9596v2;
                    }
                    j11 = jM9978a6;
                } else {
                    if (i18 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    float f16 = 0;
                    long jM9978a7 = AbstractC9400y4.m9978a(f16, f16);
                    c14322z0M9124e = AbstractC8479G.m9124e(c6021p);
                    i16 = i13 & (-57345);
                    if (i14 != 0) {
                        c9596v3 = new C9596v(true, 14);
                    } else {
                        c9596v3 = c9596v2;
                    }
                    j11 = jM9978a7;
                }
                c6021p.m6554q();
                AbstractC4101o.m4760a(z6, onDismissRequest, interfaceC10459q3, j11, c14322z0M9124e, c9596v3, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13378b, 0L, 0.0f, AbstractC7306j.f23143a, null, c8410b, c6021p, (i16 & 14) | 805306368 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (458752 & i16), (i16 >> 15) & 112);
                interfaceC10459q4 = interfaceC10459q3;
                j12 = j11;
                c14322z1 = c14322z0M9124e;
                c9596v4 = c9596v3;
            } else {
                c6021p.m6519N();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    float f17 = 0;
                    long jM9978a8 = AbstractC9400y4.m9978a(f17, f17);
                    c14322z0M9124e = AbstractC8479G.m9124e(c6021p);
                    i16 = i13 & (-57345);
                    if (i14 != 0) {
                        c9596v3 = new C9596v(true, 14);
                    } else {
                        c9596v3 = c9596v2;
                    }
                    j11 = jM9978a8;
                } else {
                    if (i18 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    float f18 = 0;
                    long jM9978a9 = AbstractC9400y4.m9978a(f18, f18);
                    c14322z0M9124e = AbstractC8479G.m9124e(c6021p);
                    i16 = i13 & (-57345);
                    if (i14 != 0) {
                        c9596v3 = new C9596v(true, 14);
                    } else {
                        c9596v3 = c9596v2;
                    }
                    j11 = jM9978a9;
                }
                c6021p.m6554q();
                AbstractC4101o.m4760a(z6, onDismissRequest, interfaceC10459q3, j11, c14322z0M9124e, c9596v3, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13378b, 0L, 0.0f, AbstractC7306j.f23143a, null, c8410b, c6021p, (i16 & 14) | 805306368 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (458752 & i16), (i16 >> 15) & 112);
                interfaceC10459q4 = interfaceC10459q3;
                j12 = j11;
                c14322z1 = c14322z0M9124e;
                c9596v4 = c9596v3;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C11701a(z6, onDismissRequest, interfaceC10459q4, j12, c14322z1, c9596v4, c8410b, i10, i11);
            }
        }
        i13 |= 196608;
        c9596v2 = c9596v;
        if ((1572864 & i10) != 0) {
            if (c6021p.m6545h(c8410b)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i13 |= i17;
        }
        if ((599187 & i13) == 599186) {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                float f19 = 0;
                long jM9978a10 = AbstractC9400y4.m9978a(f19, f19);
                c14322z0M9124e = AbstractC8479G.m9124e(c6021p);
                i16 = i13 & (-57345);
                if (i14 != 0) {
                    c9596v3 = new C9596v(true, 14);
                } else {
                    c9596v3 = c9596v2;
                }
                j11 = jM9978a10;
            } else {
                if (i18 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                float f110 = 0;
                long jM9978a11 = AbstractC9400y4.m9978a(f110, f110);
                c14322z0M9124e = AbstractC8479G.m9124e(c6021p);
                i16 = i13 & (-57345);
                if (i14 != 0) {
                    c9596v3 = new C9596v(true, 14);
                } else {
                    c9596v3 = c9596v2;
                }
                j11 = jM9978a11;
            }
            c6021p.m6554q();
            AbstractC4101o.m4760a(z6, onDismissRequest, interfaceC10459q3, j11, c14322z0M9124e, c9596v3, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13378b, 0L, 0.0f, AbstractC7306j.f23143a, null, c8410b, c6021p, (i16 & 14) | 805306368 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (458752 & i16), (i16 >> 15) & 112);
            interfaceC10459q4 = interfaceC10459q3;
            j12 = j11;
            c14322z1 = c14322z0M9124e;
            c9596v4 = c9596v3;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                float f111 = 0;
                long jM9978a12 = AbstractC9400y4.m9978a(f111, f111);
                c14322z0M9124e = AbstractC8479G.m9124e(c6021p);
                i16 = i13 & (-57345);
                if (i14 != 0) {
                    c9596v3 = new C9596v(true, 14);
                } else {
                    c9596v3 = c9596v2;
                }
                j11 = jM9978a12;
            } else {
                if (i18 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                float f112 = 0;
                long jM9978a13 = AbstractC9400y4.m9978a(f112, f112);
                c14322z0M9124e = AbstractC8479G.m9124e(c6021p);
                i16 = i13 & (-57345);
                if (i14 != 0) {
                    c9596v3 = new C9596v(true, 14);
                } else {
                    c9596v3 = c9596v2;
                }
                j11 = jM9978a13;
            }
            c6021p.m6554q();
            AbstractC4101o.m4760a(z6, onDismissRequest, interfaceC10459q3, j11, c14322z0M9124e, c9596v3, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13378b, 0L, 0.0f, AbstractC7306j.f23143a, null, c8410b, c6021p, (i16 & 14) | 805306368 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (458752 & i16), (i16 >> 15) & 112);
            interfaceC10459q4 = interfaceC10459q3;
            j12 = j11;
            c14322z1 = c14322z0M9124e;
            c9596v4 = c9596v3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C11701a(z6, onDismissRequest, interfaceC10459q4, j12, c14322z1, c9596v4, c8410b, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m8771b(String tableName, String triggerType) {
        AbstractC16544l.m18094g(tableName, "tableName");
        AbstractC16544l.m18094g(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }

    /* JADX INFO: renamed from: c */
    public static int m8772c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }
}
