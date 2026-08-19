package p544W9;

import io.ktor.client.plugins.auth.C15058c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0742X;
import p1045ul.AbstractC20384a;
import p1045ul.C20387d;
import p1045ul.EnumC20389f;
import p1113xn.AbstractC21329w;
import p200Hm.C3508g;
import p618Za.C10267f;
import p857kl.C16441H;
import p857kl.C16468p;
import tm.C20007b;

/* JADX INFO: renamed from: W9.f4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8633f4 {
    /* JADX INFO: renamed from: a */
    public static void m9285a(Object obj, String str, String str2) {
        if (obj == null) {
            throw new C16441H(str, "Could not find ".concat(str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0182 A[EDGE_INSN: B:103:0x0182->B:61:0x0182 BREAK  A[LOOP:2: B:44:0x0116->B:49:0x0122], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:42:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x010e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:49:0x0122 A[LOOP:2: B:44:0x0116->B:49:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0128 A[LOOP:3: B:51:0x0126->B:52:0x0128, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0147  */
    /* JADX INFO: renamed from: f */
    public static C20387d m9286f(String source) {
        C10267f c10267f;
        int i10;
        int i11;
        int i12;
        C10267f c10267f2;
        int i13;
        AbstractC16544l.m18094g(source, "source");
        C10267f c10267f3 = new C10267f(source);
        c10267f3.m10863b(new C15058c(1));
        Integer num = null;
        Integer num2 = null;
        Integer numValueOf = null;
        Integer numValueOf2 = null;
        Integer numValueOf3 = null;
        EnumC20389f enumC20389f = null;
        while (true) {
            int i14 = c10267f3.f30498b;
            String str = c10267f3.f30497a;
            if (i14 >= str.length()) {
                break;
            }
            if (c10267f3.m10865d(new C15058c(2))) {
                int i15 = c10267f3.f30498b;
                c10267f3.m10863b(new C15058c(3));
                String strSubstring = str.substring(i15, c10267f3.f30498b);
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                if (num == null || num2 == null || numValueOf == null) {
                    C10267f c10267f4 = new C10267f(strSubstring);
                    int i16 = c10267f4.f30498b;
                    if (c10267f4.m10862a(C16468p.f51100v0)) {
                        c10267f4.m10862a(C16468p.f51101w0);
                        String strSubstring2 = strSubstring.substring(i16, c10267f4.f30498b);
                        AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                        int i17 = Integer.parseInt(strSubstring2);
                        if (c10267f4.m10862a(C16468p.f51096r0)) {
                            int i18 = c10267f4.f30498b;
                            if (c10267f4.m10862a(C16468p.f51102x0)) {
                                c10267f4.m10862a(C16468p.f51103y0);
                                String strSubstring3 = strSubstring.substring(i18, c10267f4.f30498b);
                                AbstractC16544l.m18093f(strSubstring3, "substring(...)");
                                int i19 = Integer.parseInt(strSubstring3);
                                if (c10267f4.m10862a(C16468p.f51097s0)) {
                                    int i20 = c10267f4.f30498b;
                                    if (c10267f4.m10862a(C16468p.f51104z0)) {
                                        c10267f4.m10862a(C16468p.f51087A0);
                                        String strSubstring4 = strSubstring.substring(i20, c10267f4.f30498b);
                                        AbstractC16544l.m18093f(strSubstring4, "substring(...)");
                                        int i21 = Integer.parseInt(strSubstring4);
                                        if (c10267f4.m10862a(C16468p.f51098t0)) {
                                            c10267f4.m10863b(C16468p.f51099u0);
                                        }
                                        Integer numValueOf4 = Integer.valueOf(i17);
                                        Integer numValueOf5 = Integer.valueOf(i19);
                                        numValueOf = Integer.valueOf(i21);
                                        num = numValueOf4;
                                        num2 = numValueOf5;
                                    } else if (numValueOf2 == null) {
                                        c10267f2 = new C10267f(strSubstring);
                                        i13 = c10267f2.f30498b;
                                        if (!c10267f2.m10862a(C16468p.f51094p0)) {
                                            c10267f2.m10862a(C16468p.f51095q0);
                                            String strSubstring5 = strSubstring.substring(i13, c10267f2.f30498b);
                                            AbstractC16544l.m18093f(strSubstring5, "substring(...)");
                                            int i22 = Integer.parseInt(strSubstring5);
                                            if (c10267f2.m10862a(C16468p.f51092Z)) {
                                                c10267f2.m10863b(C16468p.f51093o0);
                                            }
                                            numValueOf2 = Integer.valueOf(i22);
                                        } else if (enumC20389f == null) {
                                            if (numValueOf3 == null) {
                                                c10267f = new C10267f(strSubstring);
                                                i10 = c10267f.f30498b;
                                                i11 = 0;
                                                while (true) {
                                                    if (i11 < 2) {
                                                        while (i12 < 2) {
                                                            c10267f.m10862a(C16468p.f51091E0);
                                                        }
                                                        String strSubstring6 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                                        AbstractC16544l.m18093f(strSubstring6, "substring(...)");
                                                        int i23 = Integer.parseInt(strSubstring6);
                                                        if (c10267f.m10862a(C16468p.f51088B0)) {
                                                            c10267f.m10863b(C16468p.f51089C0);
                                                        }
                                                        numValueOf3 = Integer.valueOf(i23);
                                                        break;
                                                    }
                                                    if (!c10267f.m10862a(C16468p.f51090D0)) {
                                                        break;
                                                        break;
                                                    }
                                                    i11++;
                                                }
                                            }
                                        } else if (numValueOf3 == null) {
                                            c10267f = new C10267f(strSubstring);
                                            i10 = c10267f.f30498b;
                                            i11 = 0;
                                            while (true) {
                                                if (i11 < 2) {
                                                    while (i12 < 2) {
                                                        c10267f.m10862a(C16468p.f51091E0);
                                                    }
                                                    String strSubstring7 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                                    AbstractC16544l.m18093f(strSubstring7, "substring(...)");
                                                    int i24 = Integer.parseInt(strSubstring7);
                                                    if (c10267f.m10862a(C16468p.f51088B0)) {
                                                        c10267f.m10863b(C16468p.f51089C0);
                                                    }
                                                    numValueOf3 = Integer.valueOf(i24);
                                                    break;
                                                }
                                                if (!c10267f.m10862a(C16468p.f51090D0)) {
                                                    break;
                                                    break;
                                                }
                                                i11++;
                                            }
                                        }
                                    } else if (enumC20389f == null) {
                                        if (numValueOf3 == null) {
                                            c10267f = new C10267f(strSubstring);
                                            i10 = c10267f.f30498b;
                                            i11 = 0;
                                            while (true) {
                                                if (i11 < 2) {
                                                    while (i12 < 2) {
                                                        c10267f.m10862a(C16468p.f51091E0);
                                                    }
                                                    String strSubstring8 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                                    AbstractC16544l.m18093f(strSubstring8, "substring(...)");
                                                    int i25 = Integer.parseInt(strSubstring8);
                                                    if (c10267f.m10862a(C16468p.f51088B0)) {
                                                        c10267f.m10863b(C16468p.f51089C0);
                                                    }
                                                    numValueOf3 = Integer.valueOf(i25);
                                                    break;
                                                }
                                                if (!c10267f.m10862a(C16468p.f51090D0)) {
                                                    break;
                                                    break;
                                                }
                                                i11++;
                                            }
                                        }
                                    } else if (numValueOf3 == null) {
                                        c10267f = new C10267f(strSubstring);
                                        i10 = c10267f.f30498b;
                                        i11 = 0;
                                        while (true) {
                                            if (i11 < 2) {
                                                while (i12 < 2) {
                                                    c10267f.m10862a(C16468p.f51091E0);
                                                }
                                                String strSubstring9 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                                AbstractC16544l.m18093f(strSubstring9, "substring(...)");
                                                int i26 = Integer.parseInt(strSubstring9);
                                                if (c10267f.m10862a(C16468p.f51088B0)) {
                                                    c10267f.m10863b(C16468p.f51089C0);
                                                }
                                                numValueOf3 = Integer.valueOf(i26);
                                                break;
                                            }
                                            if (!c10267f.m10862a(C16468p.f51090D0)) {
                                                break;
                                                break;
                                            }
                                            i11++;
                                        }
                                    }
                                } else if (numValueOf2 == null) {
                                    c10267f2 = new C10267f(strSubstring);
                                    i13 = c10267f2.f30498b;
                                    if (!c10267f2.m10862a(C16468p.f51094p0)) {
                                        c10267f2.m10862a(C16468p.f51095q0);
                                        String strSubstring10 = strSubstring.substring(i13, c10267f2.f30498b);
                                        AbstractC16544l.m18093f(strSubstring10, "substring(...)");
                                        int i27 = Integer.parseInt(strSubstring10);
                                        if (c10267f2.m10862a(C16468p.f51092Z)) {
                                            c10267f2.m10863b(C16468p.f51093o0);
                                        }
                                        numValueOf2 = Integer.valueOf(i27);
                                    } else if (enumC20389f == null) {
                                        if (numValueOf3 == null) {
                                            c10267f = new C10267f(strSubstring);
                                            i10 = c10267f.f30498b;
                                            i11 = 0;
                                            while (true) {
                                                if (i11 < 2) {
                                                    while (i12 < 2) {
                                                        c10267f.m10862a(C16468p.f51091E0);
                                                    }
                                                    String strSubstring11 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                                    AbstractC16544l.m18093f(strSubstring11, "substring(...)");
                                                    int i28 = Integer.parseInt(strSubstring11);
                                                    if (c10267f.m10862a(C16468p.f51088B0)) {
                                                        c10267f.m10863b(C16468p.f51089C0);
                                                    }
                                                    numValueOf3 = Integer.valueOf(i28);
                                                    break;
                                                }
                                                if (!c10267f.m10862a(C16468p.f51090D0)) {
                                                    break;
                                                    break;
                                                }
                                                i11++;
                                            }
                                        }
                                    } else if (numValueOf3 == null) {
                                        c10267f = new C10267f(strSubstring);
                                        i10 = c10267f.f30498b;
                                        i11 = 0;
                                        while (true) {
                                            if (i11 < 2) {
                                                while (i12 < 2) {
                                                    c10267f.m10862a(C16468p.f51091E0);
                                                }
                                                String strSubstring12 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                                AbstractC16544l.m18093f(strSubstring12, "substring(...)");
                                                int i29 = Integer.parseInt(strSubstring12);
                                                if (c10267f.m10862a(C16468p.f51088B0)) {
                                                    c10267f.m10863b(C16468p.f51089C0);
                                                }
                                                numValueOf3 = Integer.valueOf(i29);
                                                break;
                                            }
                                            if (!c10267f.m10862a(C16468p.f51090D0)) {
                                                break;
                                                break;
                                            }
                                            i11++;
                                        }
                                    }
                                } else if (enumC20389f == null) {
                                    if (numValueOf3 == null) {
                                        c10267f = new C10267f(strSubstring);
                                        i10 = c10267f.f30498b;
                                        i11 = 0;
                                        while (true) {
                                            if (i11 < 2) {
                                                while (i12 < 2) {
                                                    c10267f.m10862a(C16468p.f51091E0);
                                                }
                                                String strSubstring13 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                                AbstractC16544l.m18093f(strSubstring13, "substring(...)");
                                                int i210 = Integer.parseInt(strSubstring13);
                                                if (c10267f.m10862a(C16468p.f51088B0)) {
                                                    c10267f.m10863b(C16468p.f51089C0);
                                                }
                                                numValueOf3 = Integer.valueOf(i210);
                                                break;
                                            }
                                            if (!c10267f.m10862a(C16468p.f51090D0)) {
                                                break;
                                                break;
                                            }
                                            i11++;
                                        }
                                    }
                                } else if (numValueOf3 == null) {
                                    c10267f = new C10267f(strSubstring);
                                    i10 = c10267f.f30498b;
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < 2) {
                                            while (i12 < 2) {
                                                c10267f.m10862a(C16468p.f51091E0);
                                            }
                                            String strSubstring14 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                            AbstractC16544l.m18093f(strSubstring14, "substring(...)");
                                            int i211 = Integer.parseInt(strSubstring14);
                                            if (c10267f.m10862a(C16468p.f51088B0)) {
                                                c10267f.m10863b(C16468p.f51089C0);
                                            }
                                            numValueOf3 = Integer.valueOf(i211);
                                            break;
                                        }
                                        if (!c10267f.m10862a(C16468p.f51090D0)) {
                                            break;
                                            break;
                                        }
                                        i11++;
                                    }
                                }
                            } else if (numValueOf2 == null) {
                                c10267f2 = new C10267f(strSubstring);
                                i13 = c10267f2.f30498b;
                                if (!c10267f2.m10862a(C16468p.f51094p0)) {
                                    c10267f2.m10862a(C16468p.f51095q0);
                                    String strSubstring15 = strSubstring.substring(i13, c10267f2.f30498b);
                                    AbstractC16544l.m18093f(strSubstring15, "substring(...)");
                                    int i212 = Integer.parseInt(strSubstring15);
                                    if (c10267f2.m10862a(C16468p.f51092Z)) {
                                        c10267f2.m10863b(C16468p.f51093o0);
                                    }
                                    numValueOf2 = Integer.valueOf(i212);
                                } else if (enumC20389f == null) {
                                    if (numValueOf3 == null) {
                                        c10267f = new C10267f(strSubstring);
                                        i10 = c10267f.f30498b;
                                        i11 = 0;
                                        while (true) {
                                            if (i11 < 2) {
                                                while (i12 < 2) {
                                                    c10267f.m10862a(C16468p.f51091E0);
                                                }
                                                String strSubstring16 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                                AbstractC16544l.m18093f(strSubstring16, "substring(...)");
                                                int i213 = Integer.parseInt(strSubstring16);
                                                if (c10267f.m10862a(C16468p.f51088B0)) {
                                                    c10267f.m10863b(C16468p.f51089C0);
                                                }
                                                numValueOf3 = Integer.valueOf(i213);
                                                break;
                                            }
                                            if (!c10267f.m10862a(C16468p.f51090D0)) {
                                                break;
                                                break;
                                            }
                                            i11++;
                                        }
                                    }
                                } else if (numValueOf3 == null) {
                                    c10267f = new C10267f(strSubstring);
                                    i10 = c10267f.f30498b;
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < 2) {
                                            while (i12 < 2) {
                                                c10267f.m10862a(C16468p.f51091E0);
                                            }
                                            String strSubstring17 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                            AbstractC16544l.m18093f(strSubstring17, "substring(...)");
                                            int i214 = Integer.parseInt(strSubstring17);
                                            if (c10267f.m10862a(C16468p.f51088B0)) {
                                                c10267f.m10863b(C16468p.f51089C0);
                                            }
                                            numValueOf3 = Integer.valueOf(i214);
                                            break;
                                        }
                                        if (!c10267f.m10862a(C16468p.f51090D0)) {
                                            break;
                                            break;
                                        }
                                        i11++;
                                    }
                                }
                            } else if (enumC20389f == null) {
                                if (numValueOf3 == null) {
                                    c10267f = new C10267f(strSubstring);
                                    i10 = c10267f.f30498b;
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < 2) {
                                            while (i12 < 2) {
                                                c10267f.m10862a(C16468p.f51091E0);
                                            }
                                            String strSubstring18 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                            AbstractC16544l.m18093f(strSubstring18, "substring(...)");
                                            int i215 = Integer.parseInt(strSubstring18);
                                            if (c10267f.m10862a(C16468p.f51088B0)) {
                                                c10267f.m10863b(C16468p.f51089C0);
                                            }
                                            numValueOf3 = Integer.valueOf(i215);
                                            break;
                                        }
                                        if (!c10267f.m10862a(C16468p.f51090D0)) {
                                            break;
                                            break;
                                        }
                                        i11++;
                                    }
                                }
                            } else if (numValueOf3 == null) {
                                c10267f = new C10267f(strSubstring);
                                i10 = c10267f.f30498b;
                                i11 = 0;
                                while (true) {
                                    if (i11 < 2) {
                                        while (i12 < 2) {
                                            c10267f.m10862a(C16468p.f51091E0);
                                        }
                                        String strSubstring19 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                        AbstractC16544l.m18093f(strSubstring19, "substring(...)");
                                        int i216 = Integer.parseInt(strSubstring19);
                                        if (c10267f.m10862a(C16468p.f51088B0)) {
                                            c10267f.m10863b(C16468p.f51089C0);
                                        }
                                        numValueOf3 = Integer.valueOf(i216);
                                        break;
                                    }
                                    if (!c10267f.m10862a(C16468p.f51090D0)) {
                                        break;
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        } else if (numValueOf2 == null) {
                            c10267f2 = new C10267f(strSubstring);
                            i13 = c10267f2.f30498b;
                            if (!c10267f2.m10862a(C16468p.f51094p0)) {
                                c10267f2.m10862a(C16468p.f51095q0);
                                String strSubstring110 = strSubstring.substring(i13, c10267f2.f30498b);
                                AbstractC16544l.m18093f(strSubstring110, "substring(...)");
                                int i217 = Integer.parseInt(strSubstring110);
                                if (c10267f2.m10862a(C16468p.f51092Z)) {
                                    c10267f2.m10863b(C16468p.f51093o0);
                                }
                                numValueOf2 = Integer.valueOf(i217);
                            } else if (enumC20389f == null) {
                                if (numValueOf3 == null) {
                                    c10267f = new C10267f(strSubstring);
                                    i10 = c10267f.f30498b;
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < 2) {
                                            while (i12 < 2) {
                                                c10267f.m10862a(C16468p.f51091E0);
                                            }
                                            String strSubstring111 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                            AbstractC16544l.m18093f(strSubstring111, "substring(...)");
                                            int i218 = Integer.parseInt(strSubstring111);
                                            if (c10267f.m10862a(C16468p.f51088B0)) {
                                                c10267f.m10863b(C16468p.f51089C0);
                                            }
                                            numValueOf3 = Integer.valueOf(i218);
                                            break;
                                        }
                                        if (!c10267f.m10862a(C16468p.f51090D0)) {
                                            break;
                                            break;
                                        }
                                        i11++;
                                    }
                                }
                            } else if (numValueOf3 == null) {
                                c10267f = new C10267f(strSubstring);
                                i10 = c10267f.f30498b;
                                i11 = 0;
                                while (true) {
                                    if (i11 < 2) {
                                        while (i12 < 2) {
                                            c10267f.m10862a(C16468p.f51091E0);
                                        }
                                        String strSubstring112 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                        AbstractC16544l.m18093f(strSubstring112, "substring(...)");
                                        int i219 = Integer.parseInt(strSubstring112);
                                        if (c10267f.m10862a(C16468p.f51088B0)) {
                                            c10267f.m10863b(C16468p.f51089C0);
                                        }
                                        numValueOf3 = Integer.valueOf(i219);
                                        break;
                                    }
                                    if (!c10267f.m10862a(C16468p.f51090D0)) {
                                        break;
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        } else if (enumC20389f == null) {
                            if (numValueOf3 == null) {
                                c10267f = new C10267f(strSubstring);
                                i10 = c10267f.f30498b;
                                i11 = 0;
                                while (true) {
                                    if (i11 < 2) {
                                        while (i12 < 2) {
                                            c10267f.m10862a(C16468p.f51091E0);
                                        }
                                        String strSubstring113 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                        AbstractC16544l.m18093f(strSubstring113, "substring(...)");
                                        int i2110 = Integer.parseInt(strSubstring113);
                                        if (c10267f.m10862a(C16468p.f51088B0)) {
                                            c10267f.m10863b(C16468p.f51089C0);
                                        }
                                        numValueOf3 = Integer.valueOf(i2110);
                                        break;
                                    }
                                    if (!c10267f.m10862a(C16468p.f51090D0)) {
                                        break;
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        } else if (numValueOf3 == null) {
                            c10267f = new C10267f(strSubstring);
                            i10 = c10267f.f30498b;
                            i11 = 0;
                            while (true) {
                                if (i11 < 2) {
                                    while (i12 < 2) {
                                        c10267f.m10862a(C16468p.f51091E0);
                                    }
                                    String strSubstring114 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                    AbstractC16544l.m18093f(strSubstring114, "substring(...)");
                                    int i2111 = Integer.parseInt(strSubstring114);
                                    if (c10267f.m10862a(C16468p.f51088B0)) {
                                        c10267f.m10863b(C16468p.f51089C0);
                                    }
                                    numValueOf3 = Integer.valueOf(i2111);
                                    break;
                                }
                                if (!c10267f.m10862a(C16468p.f51090D0)) {
                                    break;
                                    break;
                                }
                                i11++;
                            }
                        }
                    } else if (numValueOf2 == null) {
                        c10267f2 = new C10267f(strSubstring);
                        i13 = c10267f2.f30498b;
                        if (!c10267f2.m10862a(C16468p.f51094p0)) {
                            c10267f2.m10862a(C16468p.f51095q0);
                            String strSubstring115 = strSubstring.substring(i13, c10267f2.f30498b);
                            AbstractC16544l.m18093f(strSubstring115, "substring(...)");
                            int i2112 = Integer.parseInt(strSubstring115);
                            if (c10267f2.m10862a(C16468p.f51092Z)) {
                                c10267f2.m10863b(C16468p.f51093o0);
                            }
                            numValueOf2 = Integer.valueOf(i2112);
                        } else if (enumC20389f == null && strSubstring.length() >= 3) {
                            C20007b c20007b = EnumC20389f.f64483p0;
                            c20007b.getClass();
                            C0742X c0742x = new C0742X(c20007b, 8);
                            while (true) {
                                if (c0742x.hasNext()) {
                                    EnumC20389f enumC20389f2 = (EnumC20389f) c0742x.next();
                                    if (AbstractC21329w.m21734u(strSubstring, enumC20389f2.f64484Y, true)) {
                                        enumC20389f = enumC20389f2;
                                    }
                                } else if (numValueOf3 == null) {
                                    c10267f = new C10267f(strSubstring);
                                    i10 = c10267f.f30498b;
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < 2) {
                                            while (i12 < 2) {
                                                c10267f.m10862a(C16468p.f51091E0);
                                            }
                                            String strSubstring116 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                            AbstractC16544l.m18093f(strSubstring116, "substring(...)");
                                            int i2113 = Integer.parseInt(strSubstring116);
                                            if (c10267f.m10862a(C16468p.f51088B0)) {
                                                c10267f.m10863b(C16468p.f51089C0);
                                            }
                                            numValueOf3 = Integer.valueOf(i2113);
                                            break;
                                        }
                                        if (!c10267f.m10862a(C16468p.f51090D0)) {
                                            break;
                                            break;
                                        }
                                        i11++;
                                    }
                                }
                            }
                        } else if (numValueOf3 == null) {
                            c10267f = new C10267f(strSubstring);
                            i10 = c10267f.f30498b;
                            i11 = 0;
                            while (true) {
                                if (i11 < 2) {
                                    while (i12 < 2) {
                                        c10267f.m10862a(C16468p.f51091E0);
                                    }
                                    String strSubstring117 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                    AbstractC16544l.m18093f(strSubstring117, "substring(...)");
                                    int i2114 = Integer.parseInt(strSubstring117);
                                    if (c10267f.m10862a(C16468p.f51088B0)) {
                                        c10267f.m10863b(C16468p.f51089C0);
                                    }
                                    numValueOf3 = Integer.valueOf(i2114);
                                    break;
                                }
                                if (!c10267f.m10862a(C16468p.f51090D0)) {
                                    break;
                                }
                                i11++;
                            }
                        }
                    } else if (enumC20389f == null) {
                        if (numValueOf3 == null) {
                            c10267f = new C10267f(strSubstring);
                            i10 = c10267f.f30498b;
                            i11 = 0;
                            while (true) {
                                if (i11 < 2) {
                                    while (i12 < 2) {
                                        c10267f.m10862a(C16468p.f51091E0);
                                    }
                                    String strSubstring118 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                    AbstractC16544l.m18093f(strSubstring118, "substring(...)");
                                    int i2115 = Integer.parseInt(strSubstring118);
                                    if (c10267f.m10862a(C16468p.f51088B0)) {
                                        c10267f.m10863b(C16468p.f51089C0);
                                    }
                                    numValueOf3 = Integer.valueOf(i2115);
                                    break;
                                }
                                if (!c10267f.m10862a(C16468p.f51090D0)) {
                                    break;
                                    break;
                                }
                                i11++;
                            }
                        }
                    } else if (numValueOf3 == null) {
                        c10267f = new C10267f(strSubstring);
                        i10 = c10267f.f30498b;
                        i11 = 0;
                        while (true) {
                            if (i11 < 2) {
                                while (i12 < 2) {
                                    c10267f.m10862a(C16468p.f51091E0);
                                }
                                String strSubstring119 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                AbstractC16544l.m18093f(strSubstring119, "substring(...)");
                                int i2116 = Integer.parseInt(strSubstring119);
                                if (c10267f.m10862a(C16468p.f51088B0)) {
                                    c10267f.m10863b(C16468p.f51089C0);
                                }
                                numValueOf3 = Integer.valueOf(i2116);
                                break;
                            }
                            if (!c10267f.m10862a(C16468p.f51090D0)) {
                                break;
                                break;
                            }
                            i11++;
                        }
                    }
                } else if (numValueOf2 == null) {
                    c10267f2 = new C10267f(strSubstring);
                    i13 = c10267f2.f30498b;
                    if (!c10267f2.m10862a(C16468p.f51094p0)) {
                        c10267f2.m10862a(C16468p.f51095q0);
                        String strSubstring1110 = strSubstring.substring(i13, c10267f2.f30498b);
                        AbstractC16544l.m18093f(strSubstring1110, "substring(...)");
                        int i2117 = Integer.parseInt(strSubstring1110);
                        if (c10267f2.m10862a(C16468p.f51092Z)) {
                            c10267f2.m10863b(C16468p.f51093o0);
                        }
                        numValueOf2 = Integer.valueOf(i2117);
                    } else if (enumC20389f == null) {
                        if (numValueOf3 == null) {
                            c10267f = new C10267f(strSubstring);
                            i10 = c10267f.f30498b;
                            i11 = 0;
                            while (true) {
                                if (i11 < 2) {
                                    while (i12 < 2) {
                                        c10267f.m10862a(C16468p.f51091E0);
                                    }
                                    String strSubstring1111 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                    AbstractC16544l.m18093f(strSubstring1111, "substring(...)");
                                    int i2118 = Integer.parseInt(strSubstring1111);
                                    if (c10267f.m10862a(C16468p.f51088B0)) {
                                        c10267f.m10863b(C16468p.f51089C0);
                                    }
                                    numValueOf3 = Integer.valueOf(i2118);
                                    break;
                                }
                                if (!c10267f.m10862a(C16468p.f51090D0)) {
                                    break;
                                    break;
                                }
                                i11++;
                            }
                        }
                    } else if (numValueOf3 == null) {
                        c10267f = new C10267f(strSubstring);
                        i10 = c10267f.f30498b;
                        i11 = 0;
                        while (true) {
                            if (i11 < 2) {
                                while (i12 < 2) {
                                    c10267f.m10862a(C16468p.f51091E0);
                                }
                                String strSubstring1112 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                AbstractC16544l.m18093f(strSubstring1112, "substring(...)");
                                int i2119 = Integer.parseInt(strSubstring1112);
                                if (c10267f.m10862a(C16468p.f51088B0)) {
                                    c10267f.m10863b(C16468p.f51089C0);
                                }
                                numValueOf3 = Integer.valueOf(i2119);
                                break;
                            }
                            if (!c10267f.m10862a(C16468p.f51090D0)) {
                                break;
                                break;
                            }
                            i11++;
                        }
                    }
                } else if (enumC20389f == null) {
                    if (numValueOf3 == null) {
                        c10267f = new C10267f(strSubstring);
                        i10 = c10267f.f30498b;
                        i11 = 0;
                        while (true) {
                            if (i11 < 2) {
                                for (i12 = 0; i12 < 2; i12++) {
                                    c10267f.m10862a(C16468p.f51091E0);
                                }
                                String strSubstring1113 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                                AbstractC16544l.m18093f(strSubstring1113, "substring(...)");
                                int i21110 = Integer.parseInt(strSubstring1113);
                                if (c10267f.m10862a(C16468p.f51088B0)) {
                                    c10267f.m10863b(C16468p.f51089C0);
                                }
                                numValueOf3 = Integer.valueOf(i21110);
                                break;
                            }
                            if (!c10267f.m10862a(C16468p.f51090D0)) {
                                break;
                                break;
                            }
                            i11++;
                        }
                    }
                } else if (numValueOf3 == null) {
                    c10267f = new C10267f(strSubstring);
                    i10 = c10267f.f30498b;
                    i11 = 0;
                    while (true) {
                        if (i11 < 2) {
                            while (i12 < 2) {
                                c10267f.m10862a(C16468p.f51091E0);
                            }
                            String strSubstring1114 = c10267f.f30497a.substring(i10, c10267f.f30498b);
                            AbstractC16544l.m18093f(strSubstring1114, "substring(...)");
                            int i21111 = Integer.parseInt(strSubstring1114);
                            if (c10267f.m10862a(C16468p.f51088B0)) {
                                c10267f.m10863b(C16468p.f51089C0);
                            }
                            numValueOf3 = Integer.valueOf(i21111);
                            break;
                        }
                        if (!c10267f.m10862a(C16468p.f51090D0)) {
                            break;
                            break;
                        }
                        i11++;
                    }
                }
                c10267f3.m10863b(new C15058c(4));
            }
        }
        C3508g c3508g = new C3508g(70, 99, 1);
        if (numValueOf3 == null || !c3508g.m4200j(numValueOf3.intValue())) {
            C3508g c3508g2 = new C3508g(0, 69, 1);
            if (numValueOf3 != null && c3508g2.m4200j(numValueOf3.intValue())) {
                numValueOf3 = Integer.valueOf(numValueOf3.intValue() + 2000);
            }
        } else {
            numValueOf3 = Integer.valueOf(numValueOf3.intValue() + 1900);
        }
        m9285a(numValueOf2, source, "day-of-month");
        m9285a(enumC20389f, source, "month");
        m9285a(numValueOf3, source, "year");
        m9285a(num, source, "time");
        m9285a(num2, source, "time");
        m9285a(numValueOf, source, "time");
        if (!new C3508g(1, 31, 1).m4200j(numValueOf2.intValue())) {
            throw new C16441H(source, "day-of-month not in [1,31]");
        }
        if (numValueOf3.intValue() < 1601) {
            throw new C16441H(source, "year >= 1601");
        }
        if (num.intValue() > 23) {
            throw new C16441H(source, "hours > 23");
        }
        if (num2.intValue() > 59) {
            throw new C16441H(source, "minutes > 59");
        }
        if (numValueOf.intValue() <= 59) {
            return AbstractC20384a.m21047a(numValueOf.intValue(), num2.intValue(), num.intValue(), numValueOf2.intValue(), enumC20389f, numValueOf3.intValue());
        }
        throw new C16441H(source, "seconds > 59");
    }

    /* JADX INFO: renamed from: b */
    public abstract Method mo6143b(Class cls, Field field);

    /* JADX INFO: renamed from: c */
    public abstract Constructor mo6144c(Class cls);

    /* JADX INFO: renamed from: d */
    public abstract String[] mo6145d(Class cls);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo6146e(Class cls);
}
