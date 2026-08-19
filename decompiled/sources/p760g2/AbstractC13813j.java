package p760g2;

import java.util.ArrayList;
import p655b2.C11218b;
import p655b2.C11219c;
import p655b2.C11221e;

/* JADX INFO: renamed from: g2.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13813j {

    /* JADX INFO: renamed from: a */
    public static final boolean[] f43782a = new boolean[3];

    /* JADX WARN: Code duplicated, block: B:184:0x0285  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:203:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:205:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:207:0x0303  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:408:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:409:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:412:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:413:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:416:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:417:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:419:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:421:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:424:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:426:0x06ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:436:0x0707 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x010b  */
    /* JADX INFO: renamed from: a */
    public static void m15417a(C13808e c13808e, C11219c c11219c, ArrayList arrayList, int i10) {
        int i11;
        C13805b[] c13805bArr;
        int i12;
        int i13;
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        C13806c[] c13806cArr;
        int i14;
        C13805b[] c13805bArr2;
        C13807d c13807d;
        int i15;
        int i16;
        int i17;
        C13807d c13807d2;
        C11221e c11221e;
        C11221e c11221e2;
        C13806c c13806c;
        C13806c c13806c2;
        C11221e c11221e3;
        C13807d c13807d3;
        C13806c[] c13806cArr2;
        C13807d c13807d4;
        int i18;
        C13806c c13806c3;
        C13806c c13806c4;
        C11221e c11221e4;
        C13806c c13806c5;
        C11221e c11221e5;
        int size;
        boolean z13;
        C13806c c13806c6;
        C13807d c13807d5;
        int i19;
        C13807d c13807d6;
        C13808e c13808e2 = c13808e;
        int i20 = 2;
        if (i10 == 0) {
            i11 = c13808e2.f43698A0;
            c13805bArr = c13808e2.f43701D0;
            i12 = 0;
        } else {
            i11 = c13808e2.f43699B0;
            c13805bArr = c13808e2.f43700C0;
            i12 = 2;
        }
        int i21 = 0;
        while (i21 < i11) {
            C13805b c13805b = c13805bArr[i21];
            boolean z14 = c13805b.f43619q;
            C13807d c13807d7 = c13805b.f43603a;
            int i22 = 3;
            int i23 = 1;
            int i24 = 8;
            if (z14) {
                i13 = i21;
                z6 = true;
            } else {
                int i25 = c13805b.f43614l;
                int i26 = i25 * 2;
                C13807d c13807d8 = c13807d7;
                C13807d c13807d9 = c13807d8;
                boolean z15 = false;
                while (!z15) {
                    c13805b.f43611i += i23;
                    c13807d8.f43682n0[i25] = null;
                    c13807d8.f43680m0[i25] = null;
                    int i27 = c13807d8.f43670h0;
                    C13806c[] c13806cArr3 = c13807d8.f43646R;
                    if (i27 != i24) {
                        c13807d8.m15382k(i25);
                        c13806cArr3[i26].m15346e();
                        int i28 = i26 + 1;
                        c13806cArr3[i28].m15346e();
                        c13806cArr3[i26].m15346e();
                        c13806cArr3[i28].m15346e();
                        if (c13805b.f43604b == null) {
                            c13805b.f43604b = c13807d8;
                        }
                        c13805b.f43606d = c13807d8;
                        int i29 = c13807d8.f43688q0[i25];
                        if (i29 == i22) {
                            int i30 = c13807d8.f43692u[i25];
                            if (i30 == 0 || i30 == i22 || i30 == i20) {
                                c13805b.f43612j++;
                                float f10 = c13807d8.f43678l0[i25];
                                if (f10 > 0.0f) {
                                    c13805b.f43613k += f10;
                                }
                                if (c13807d8.f43670h0 != 8 && i29 == 3 && (i30 == 0 || i30 == 3)) {
                                    if (f10 < 0.0f) {
                                        c13805b.f43616n = true;
                                    } else {
                                        c13805b.f43617o = true;
                                    }
                                    if (c13805b.f43610h == null) {
                                        c13805b.f43610h = new ArrayList();
                                    }
                                    c13805b.f43610h.add(c13807d8);
                                }
                                if (c13805b.f43608f == null) {
                                    c13805b.f43608f = c13807d8;
                                }
                                C13807d c13807d10 = c13805b.f43609g;
                                if (c13807d10 != null) {
                                    c13807d10.f43680m0[i25] = c13807d8;
                                }
                                c13805b.f43609g = c13807d8;
                            }
                            if (i25 == 0) {
                                if (c13807d8.f43690s == 0 && c13807d8.f43693v == 0) {
                                    int i31 = c13807d8.f43694w;
                                }
                            } else if (c13807d8.f43691t == 0 && c13807d8.f43696y == 0) {
                                int i32 = c13807d8.f43697z;
                            }
                        } else {
                            i21 = i21;
                        }
                    } else {
                        i21 = i21;
                    }
                    C13807d c13807d11 = c13807d9;
                    if (c13807d11 != c13807d8) {
                        c13807d11.f43682n0[i25] = c13807d8;
                    }
                    C13806c c13806c7 = c13806cArr3[i26 + 1].f43625f;
                    if (c13806c7 != null) {
                        c13807d6 = c13806c7.f43623d;
                        C13806c c13806c8 = c13807d6.f43646R[i26].f43625f;
                        if (c13806c8 == null || c13806c8.f43623d != c13807d8) {
                            c13807d6 = null;
                        }
                    } else {
                        c13807d6 = null;
                    }
                    if (c13807d6 == null) {
                        c13807d6 = c13807d8;
                        z15 = true;
                    }
                    c13807d9 = c13807d8;
                    i21 = i21;
                    i23 = 1;
                    i24 = 8;
                    i20 = 2;
                    c13807d8 = c13807d6;
                    i22 = 3;
                }
                i13 = i21;
                C13807d c13807d12 = c13805b.f43604b;
                if (c13807d12 != null) {
                    c13807d12.f43646R[i26].m15346e();
                }
                C13807d c13807d13 = c13805b.f43606d;
                if (c13807d13 != null) {
                    c13807d13.f43646R[i26 + 1].m15346e();
                }
                c13805b.f43605c = c13807d8;
                if (i25 == 0 && c13805b.f43615m) {
                    c13805b.f43607e = c13807d8;
                } else {
                    c13805b.f43607e = c13807d7;
                }
                c13805b.f43618p = c13805b.f43617o && c13805b.f43616n;
                z6 = true;
            }
            c13805b.f43619q = z6;
            if (arrayList == 0 || arrayList.contains(c13807d7)) {
                C13807d c13807d14 = c13805b.f43605c;
                C13807d c13807d15 = c13805b.f43604b;
                C13807d c13807d16 = c13805b.f43606d;
                C13807d c13807d17 = c13805b.f43607e;
                float f11 = c13805b.f43613k;
                boolean z16 = c13808e2.f43688q0[i10] == 2;
                if (i10 == 0) {
                    int i33 = c13807d17.f43674j0;
                    boolean z17 = i33 == 0;
                    z12 = i33 == 1;
                    z10 = i33 == 2;
                    z11 = z17;
                } else {
                    int i34 = c13807d17.f43676k0;
                    boolean z18 = i34 == 0;
                    boolean z19 = i34 == 1;
                    z10 = i34 == 2;
                    z11 = z18;
                    z12 = z19;
                }
                boolean z20 = false;
                while (true) {
                    c13806cArr = c13808e2.f43646R;
                    if (z20) {
                        break;
                    }
                    C13806c c13806c9 = c13807d7.f43646R[i12];
                    int i35 = z10 ? 1 : 4;
                    int iM15346e = c13806c9.m15346e();
                    boolean z21 = z20;
                    int[] iArr = c13807d7.f43688q0;
                    int i36 = i11;
                    C13805b[] c13805bArr3 = c13805bArr;
                    boolean z22 = iArr[i10] == 3 && c13807d7.f43692u[i10] == 0;
                    C13806c c13806c10 = c13806c9.f43625f;
                    if (c13806c10 != null && c13807d7 != c13807d7) {
                        iM15346e = c13806c10.m15346e() + iM15346e;
                    }
                    int i37 = iM15346e;
                    if (z10 && c13807d7 != c13807d7 && c13807d7 != c13807d15) {
                        i35 = 8;
                    }
                    C13806c c13806c11 = c13806c9.f43625f;
                    if (c13806c11 != null) {
                        if (c13807d7 == c13807d15) {
                            c11219c.m12462f(c13806c9.f43628i, c13806c11.f43628i, i37, 6);
                        } else {
                            c11219c.m12462f(c13806c9.f43628i, c13806c11.f43628i, i37, 8);
                        }
                        if (z22 && !z10) {
                            i35 = 5;
                        }
                        c11219c.m12461e(c13806c9.f43628i, c13806c9.f43625f.f43628i, i37, (c13807d7 == c13807d15 && z10 && c13807d7.f43648T[i10]) ? 5 : i35);
                    } else {
                        c13805b = c13805b;
                        c13807d7 = c13807d7;
                    }
                    C13806c[] c13806cArr4 = c13807d7.f43646R;
                    if (z16) {
                        if (c13807d7.f43670h0 == 8 || iArr[i10] != 3) {
                            i19 = 0;
                        } else {
                            i19 = 0;
                            c11219c.m12462f(c13806cArr4[i12 + 1].f43628i, c13806cArr4[i12].f43628i, 0, 5);
                        }
                        c11219c.m12462f(c13806cArr4[i12].f43628i, c13806cArr[i12].f43628i, i19, 8);
                    }
                    C13806c c13806c12 = c13806cArr4[i12 + 1].f43625f;
                    if (c13806c12 != null) {
                        c13807d5 = c13806c12.f43623d;
                        C13806c c13806c13 = c13807d5.f43646R[i12].f43625f;
                        if (c13806c13 == null || c13806c13.f43623d != c13807d7) {
                            c13807d5 = null;
                        }
                    } else {
                        c13807d5 = null;
                    }
                    if (c13807d5 != null) {
                        c13807d7 = c13807d5;
                        z20 = z21;
                    } else {
                        z20 = true;
                    }
                    c13807d17 = c13807d17;
                    i11 = i36;
                    c13805bArr = c13805bArr3;
                    c13807d7 = c13807d7;
                    c13805b = c13805b;
                }
                C13805b c13805b2 = c13805b;
                C13807d c13807d18 = c13807d17;
                C13807d c13807d19 = c13807d7;
                i14 = i11;
                c13805bArr2 = c13805bArr;
                if (c13807d16 != null) {
                    int i38 = i12 + 1;
                    if (c13807d14.f43646R[i38].f43625f != null) {
                        C13806c c13806c14 = c13807d16.f43646R[i38];
                        if (c13807d16.f43688q0[i10] == 3 && c13807d16.f43692u[i10] == 0 && !z10) {
                            C13806c c13806c15 = c13806c14.f43625f;
                            if (c13806c15.f43623d == c13808e2) {
                                c11219c.m12461e(c13806c14.f43628i, c13806c15.f43628i, -c13806c14.m15346e(), 5);
                            } else if (z10) {
                                c13806c6 = c13806c14.f43625f;
                                if (c13806c6.f43623d == c13808e2) {
                                    c11219c.m12461e(c13806c14.f43628i, c13806c6.f43628i, -c13806c14.m15346e(), 4);
                                }
                            }
                        } else if (z10) {
                            c13806c6 = c13806c14.f43625f;
                            if (c13806c6.f43623d == c13808e2) {
                                c11219c.m12461e(c13806c14.f43628i, c13806c6.f43628i, -c13806c14.m15346e(), 4);
                            }
                        }
                        c11219c.m12463g(c13806c14.f43628i, c13807d14.f43646R[i38].f43625f.f43628i, -c13806c14.m15346e(), 6);
                    }
                }
                if (z16) {
                    int i39 = i12 + 1;
                    C11221e c11221e6 = c13806cArr[i39].f43628i;
                    C13806c c13806c16 = c13807d14.f43646R[i39];
                    c11219c.m12462f(c11221e6, c13806c16.f43628i, c13806c16.m15346e(), 8);
                }
                ArrayList arrayList2 = c13805b2.f43610h;
                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                    float f12 = (!c13805b2.f43616n || c13805b2.f43618p) ? f11 : c13805b2.f43612j;
                    C13807d c13807d20 = null;
                    float f13 = 0.0f;
                    int i40 = 0;
                    while (i40 < size) {
                        C13807d c13807d21 = (C13807d) arrayList2.get(i40);
                        float f14 = c13807d21.f43678l0[i10];
                        C13806c[] c13806cArr5 = c13807d21.f43646R;
                        if (f14 < 0.0f) {
                            if (c13805b2.f43618p) {
                                C11221e c11221e7 = c13806cArr5[i12 + 1].f43628i;
                                C11221e c11221e8 = c13806cArr5[i12].f43628i;
                                z13 = false;
                                c11219c.m12461e(c11221e7, c11221e8, 0, 4);
                            } else {
                                f14 = 1.0f;
                            }
                            arrayList2 = arrayList2;
                            size = size;
                            i40++;
                            size = size;
                            arrayList2 = arrayList2;
                        }
                        if (f14 == 0.0f) {
                            C11221e c11221e9 = c13806cArr5[i12 + 1].f43628i;
                            C11221e c11221e10 = c13806cArr5[i12].f43628i;
                            z13 = false;
                            c11219c.m12461e(c11221e9, c11221e10, 0, 8);
                            arrayList2 = arrayList2;
                            size = size;
                        } else {
                            if (c13807d20 != null) {
                                C13806c[] c13806cArr6 = c13807d20.f43646R;
                                C11221e c11221e11 = c13806cArr6[i12].f43628i;
                                int i41 = i12 + 1;
                                C11221e c11221e12 = c13806cArr6[i41].f43628i;
                                C11221e c11221e13 = c13806cArr5[i12].f43628i;
                                C11221e c11221e14 = c13806cArr5[i41].f43628i;
                                C11218b c11218bM12468l = c11219c.m12468l();
                                c11218bM12468l.f33942b = 0.0f;
                                if (f12 == 0.0f || f13 == f14) {
                                    c11218bM12468l.f33944d.m12445g(c11221e11, 1.0f);
                                    c11218bM12468l.f33944d.m12445g(c11221e12, -1.0f);
                                    c11218bM12468l.f33944d.m12445g(c11221e14, 1.0f);
                                    c11218bM12468l.f33944d.m12445g(c11221e13, -1.0f);
                                } else if (f13 == 0.0f) {
                                    c11218bM12468l.f33944d.m12445g(c11221e11, 1.0f);
                                    c11218bM12468l.f33944d.m12445g(c11221e12, -1.0f);
                                } else if (f14 == 0.0f) {
                                    c11218bM12468l.f33944d.m12445g(c11221e13, 1.0f);
                                    c11218bM12468l.f33944d.m12445g(c11221e14, -1.0f);
                                } else {
                                    float f15 = (f13 / f12) / (f14 / f12);
                                    c11218bM12468l.f33944d.m12445g(c11221e11, 1.0f);
                                    c11218bM12468l.f33944d.m12445g(c11221e12, -1.0f);
                                    c11218bM12468l.f33944d.m12445g(c11221e14, f15);
                                    c11218bM12468l.f33944d.m12445g(c11221e13, -f15);
                                }
                                c11219c.m12459c(c11218bM12468l);
                            } else {
                                f14 = f14;
                            }
                            f13 = f14;
                            c13807d20 = c13807d21;
                        }
                        i40++;
                        size = size;
                        arrayList2 = arrayList2;
                    }
                }
                if (c13807d15 == null || !(c13807d15 == c13807d16 || z10)) {
                    c13807d = c13807d16;
                    i15 = i13;
                    if (!z11 || c13807d15 == null) {
                        int i42 = 8;
                        if (z12 && c13807d15 != null) {
                            int i43 = c13805b2.f43612j;
                            boolean z23 = i43 > 0 && c13805b2.f43611i == i43;
                            C13807d c13807d22 = c13807d15;
                            C13807d c13807d23 = c13807d22;
                            while (c13807d23 != null) {
                                C13807d c13807d24 = c13807d23.f43682n0[i10];
                                while (c13807d24 != null && c13807d24.f43670h0 == i42) {
                                    c13807d24 = c13807d24.f43682n0[i10];
                                }
                                if (c13807d23 == c13807d15 || c13807d23 == c13807d || c13807d24 == null) {
                                    c13807d22 = c13807d22;
                                    i15 = i15;
                                    i17 = i42;
                                } else {
                                    C13807d c13807d25 = c13807d24 == c13807d ? null : c13807d24;
                                    C13806c[] c13806cArr7 = c13807d23.f43646R;
                                    C13806c c13806c17 = c13806cArr7[i12];
                                    C11221e c11221e15 = c13806c17.f43628i;
                                    int i44 = i12 + 1;
                                    C11221e c11221e16 = c13807d22.f43646R[i44].f43628i;
                                    int iM15346e2 = c13806c17.m15346e();
                                    int iM15346e3 = c13806cArr7[i44].m15346e();
                                    if (c13807d25 != null) {
                                        c13806c = c13807d25.f43646R[i12];
                                        c11221e = c13806c.f43628i;
                                        c13807d2 = c13807d25;
                                        C13806c c13806c18 = c13806c.f43625f;
                                        c11221e2 = c13806c18 != null ? c13806c18.f43628i : null;
                                    } else {
                                        c13807d2 = c13807d25;
                                        C13806c c13806c19 = c13807d.f43646R[i12];
                                        c11221e = c13806c19 != null ? c13806c19.f43628i : null;
                                        c11221e2 = c13806cArr7[i44].f43628i;
                                        c13806c = c13806c19;
                                    }
                                    int iM15346e4 = c13806c != null ? c13806c.m15346e() + iM15346e3 : iM15346e3;
                                    int iM15346e5 = c13807d22.f43646R[i44].m15346e() + iM15346e2;
                                    int i45 = z23 ? 8 : 4;
                                    if (c11221e15 == null || c11221e16 == null || c11221e == null || c11221e2 == null) {
                                        i17 = 8;
                                    } else {
                                        i17 = 8;
                                        c11219c.m12458b(c11221e15, c11221e16, iM15346e5, 0.5f, c11221e, c11221e2, iM15346e4, i45);
                                    }
                                    c13807d24 = c13807d2;
                                }
                                c13807d22 = c13807d23.f43670h0 != i17 ? c13807d23 : c13807d22;
                                c13807d23 = c13807d24;
                                i42 = i17;
                                i15 = i15;
                            }
                            i16 = i15;
                            C13806c c13806c20 = c13807d15.f43646R[i12];
                            C13806c c13806c21 = c13807d19.f43646R[i12].f43625f;
                            int i46 = i12 + 1;
                            C13806c c13806c22 = c13807d.f43646R[i46];
                            C13806c c13806c23 = c13807d14.f43646R[i46].f43625f;
                            if (c13806c21 != null) {
                                if (c13807d15 != c13807d) {
                                    c11219c.m12461e(c13806c20.f43628i, c13806c21.f43628i, c13806c20.m15346e(), 5);
                                } else if (c13806c23 != null) {
                                    c11219c.m12458b(c13806c20.f43628i, c13806c21.f43628i, c13806c20.m15346e(), 0.5f, c13806c22.f43628i, c13806c23.f43628i, c13806c22.m15346e(), 5);
                                }
                            }
                            if (c13806c23 != null && c13807d15 != c13807d) {
                                c11219c.m12461e(c13806c22.f43628i, c13806c23.f43628i, -c13806c22.m15346e(), 5);
                            }
                        }
                        if ((z11 || z12) && c13807d15 != null && c13807d15 != c13807d) {
                            c13806cArr2 = c13807d15.f43646R;
                            C13806c c13806c24 = c13806cArr2[i12];
                            if (c13807d == null) {
                                c13807d4 = c13807d15;
                            } else {
                                c13807d4 = c13807d;
                            }
                            i18 = i12 + 1;
                            C13806c[] c13806cArr8 = c13807d4.f43646R;
                            c13806c3 = c13806cArr8[i18];
                            c13806c4 = c13806c24.f43625f;
                            if (c13806c4 != null) {
                                c11221e4 = c13806c4.f43628i;
                            } else {
                                c11221e4 = null;
                            }
                            c13806c5 = c13806c3.f43625f;
                            if (c13806c5 != null) {
                                c11221e5 = c13806c5.f43628i;
                            } else {
                                c11221e5 = null;
                            }
                            if (c13807d14 != c13807d4) {
                                C13806c c13806c25 = c13807d14.f43646R[i18].f43625f;
                                c11221e5 = c13806c25 != null ? c13806c25.f43628i : null;
                            }
                            if (c13807d15 == c13807d4) {
                                c13806c3 = c13806cArr2[i18];
                            }
                            if (c11221e4 == null && c11221e5 != null) {
                                c11219c.m12458b(c13806c24.f43628i, c11221e4, c13806c24.m15346e(), 0.5f, c11221e5, c13806c3.f43628i, c13806cArr8[i18].m15346e(), 5);
                            }
                        }
                    } else {
                        int i47 = c13805b2.f43612j;
                        boolean z24 = i47 > 0 && c13805b2.f43611i == i47;
                        C13807d c13807d26 = c13807d15;
                        C13807d c13807d27 = c13807d26;
                        while (c13807d27 != null) {
                            C13807d c13807d28 = c13807d27.f43682n0[i10];
                            while (c13807d28 != null && c13807d28.f43670h0 == 8) {
                                c13807d28 = c13807d28.f43682n0[i10];
                            }
                            if (c13807d28 != null || c13807d27 == c13807d) {
                                C13806c[] c13806cArr9 = c13807d27.f43646R;
                                C13806c c13806c26 = c13806cArr9[i12];
                                C11221e c11221e17 = c13806c26.f43628i;
                                C13806c c13806c27 = c13806c26.f43625f;
                                C11221e c11221e18 = c13806c27 != null ? c13806c27.f43628i : null;
                                if (c13807d26 != c13807d27) {
                                    c11221e18 = c13807d26.f43646R[i12 + 1].f43628i;
                                } else if (c13807d27 == c13807d15) {
                                    C13806c c13806c28 = c13807d19.f43646R[i12].f43625f;
                                    c11221e18 = c13806c28 != null ? c13806c28.f43628i : null;
                                }
                                int iM15346e6 = c13806c26.m15346e();
                                int i48 = i12 + 1;
                                int iM15346e7 = c13806cArr9[i48].m15346e();
                                if (c13807d28 != null) {
                                    c13806c2 = c13807d28.f43646R[i12];
                                    c11221e3 = c13806c2.f43628i;
                                } else {
                                    c13806c2 = c13807d14.f43646R[i48].f43625f;
                                    c11221e3 = c13806c2 != null ? c13806c2.f43628i : null;
                                }
                                C11221e c11221e19 = c13806cArr9[i48].f43628i;
                                if (c13806c2 != null) {
                                    iM15346e7 = c13806c2.m15346e() + iM15346e7;
                                }
                                int iM15346e8 = c13807d26.f43646R[i48].m15346e() + iM15346e6;
                                if (c11221e17 == null || c11221e18 == null || c11221e3 == null || c11221e19 == null) {
                                    c13807d3 = c13807d28;
                                } else {
                                    if (c13807d27 == c13807d15) {
                                        iM15346e8 = c13807d15.f43646R[i12].m15346e();
                                    }
                                    if (c13807d27 == c13807d) {
                                        iM15346e7 = c13807d.f43646R[i48].m15346e();
                                    }
                                    int i49 = iM15346e7;
                                    c13807d3 = c13807d28;
                                    c11219c.m12458b(c11221e17, c11221e18, iM15346e8, 0.5f, c11221e3, c11221e19, i49, z24 ? 8 : 5);
                                }
                            } else {
                                c13807d3 = c13807d28;
                            }
                            c13807d26 = c13807d27.f43670h0 != 8 ? c13807d27 : c13807d26;
                            c13807d27 = c13807d3;
                        }
                    }
                } else {
                    C13806c c13806c29 = c13807d19.f43646R[i12];
                    int i50 = i12 + 1;
                    C13806c c13806c30 = c13807d14.f43646R[i50];
                    C13806c c13806c31 = c13806c29.f43625f;
                    C11221e c11221e20 = c13806c31 != null ? c13806c31.f43628i : null;
                    C13806c c13806c32 = c13806c30.f43625f;
                    C11221e c11221e21 = c13806c32 != null ? c13806c32.f43628i : null;
                    C13806c c13806c33 = c13807d15.f43646R[i12];
                    if (c13807d16 != null) {
                        c13806c30 = c13807d16.f43646R[i50];
                    }
                    if (c11221e20 == null || c11221e21 == null) {
                        c13807d = c13807d16;
                        i15 = i13;
                    } else {
                        c13807d = c13807d16;
                        i15 = i13;
                        c11219c.m12458b(c13806c33.f43628i, c11221e20, c13806c33.m15346e(), i10 == 0 ? c13807d18.f43664e0 : c13807d18.f43666f0, c11221e21, c13806c30.f43628i, c13806c30.m15346e(), 7);
                    }
                }
                i16 = i15;
                if (z11) {
                    c13806cArr2 = c13807d15.f43646R;
                    C13806c c13806c210 = c13806cArr2[i12];
                    if (c13807d == null) {
                        c13807d4 = c13807d15;
                    } else {
                        c13807d4 = c13807d;
                    }
                    i18 = i12 + 1;
                    C13806c[] c13806cArr10 = c13807d4.f43646R;
                    c13806c3 = c13806cArr10[i18];
                    c13806c4 = c13806c210.f43625f;
                    if (c13806c4 != null) {
                        c11221e4 = c13806c4.f43628i;
                    } else {
                        c11221e4 = null;
                    }
                    c13806c5 = c13806c3.f43625f;
                    if (c13806c5 != null) {
                        c11221e5 = c13806c5.f43628i;
                    } else {
                        c11221e5 = null;
                    }
                    if (c13807d14 != c13807d4) {
                        C13806c c13806c211 = c13807d14.f43646R[i18].f43625f;
                        c11221e5 = c13806c211 != null ? c13806c211.f43628i : null;
                    }
                    if (c13807d15 == c13807d4) {
                        c13806c3 = c13806cArr2[i18];
                    }
                    if (c11221e4 == null) {
                    }
                } else {
                    c13806cArr2 = c13807d15.f43646R;
                    C13806c c13806c212 = c13806cArr2[i12];
                    if (c13807d == null) {
                        c13807d4 = c13807d15;
                    } else {
                        c13807d4 = c13807d;
                    }
                    i18 = i12 + 1;
                    C13806c[] c13806cArr11 = c13807d4.f43646R;
                    c13806c3 = c13806cArr11[i18];
                    c13806c4 = c13806c212.f43625f;
                    if (c13806c4 != null) {
                        c11221e4 = c13806c4.f43628i;
                    } else {
                        c11221e4 = null;
                    }
                    c13806c5 = c13806c3.f43625f;
                    if (c13806c5 != null) {
                        c11221e5 = c13806c5.f43628i;
                    } else {
                        c11221e5 = null;
                    }
                    if (c13807d14 != c13807d4) {
                        C13806c c13806c213 = c13807d14.f43646R[i18].f43625f;
                        c11221e5 = c13806c213 != null ? c13806c213.f43628i : null;
                    }
                    if (c13807d15 == c13807d4) {
                        c13806c3 = c13806cArr2[i18];
                    }
                    if (c11221e4 == null) {
                    }
                }
            } else {
                i14 = i11;
                c13805bArr2 = c13805bArr;
                i16 = i13;
            }
            i21 = i16 + 1;
            i20 = 2;
            c13808e2 = c13808e;
            i11 = i14;
            c13805bArr = c13805bArr2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m15418b(C13808e c13808e, C11219c c11219c, C13807d c13807d) {
        c13807d.f43685p = -1;
        c13807d.f43687q = -1;
        int i10 = c13808e.f43688q0[0];
        int[] iArr = c13807d.f43688q0;
        if (i10 != 2 && iArr[0] == 4) {
            C13806c c13806c = c13807d.f43638J;
            int i11 = c13806c.f43626g;
            int iM15387r = c13808e.m15387r();
            C13806c c13806c2 = c13807d.f43640L;
            int i12 = iM15387r - c13806c2.f43626g;
            c13806c.f43628i = c11219c.m12467k(c13806c);
            c13806c2.f43628i = c11219c.m12467k(c13806c2);
            c11219c.m12460d(c13806c.f43628i, i11);
            c11219c.m12460d(c13806c2.f43628i, i12);
            c13807d.f43685p = 2;
            c13807d.f43654Z = i11;
            int i13 = i12 - i11;
            c13807d.f43650V = i13;
            int i14 = c13807d.f43660c0;
            if (i13 < i14) {
                c13807d.f43650V = i14;
            }
        }
        if (c13808e.f43688q0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C13806c c13806c3 = c13807d.f43639K;
        int i15 = c13806c3.f43626g;
        int iM15383l = c13808e.m15383l();
        C13806c c13806c4 = c13807d.f43641M;
        int i16 = iM15383l - c13806c4.f43626g;
        c13806c3.f43628i = c11219c.m12467k(c13806c3);
        c13806c4.f43628i = c11219c.m12467k(c13806c4);
        c11219c.m12460d(c13806c3.f43628i, i15);
        c11219c.m12460d(c13806c4.f43628i, i16);
        if (c13807d.f43658b0 > 0 || c13807d.f43670h0 == 8) {
            C13806c c13806c5 = c13807d.f43642N;
            C11221e c11221eM12467k = c11219c.m12467k(c13806c5);
            c13806c5.f43628i = c11221eM12467k;
            c11219c.m12460d(c11221eM12467k, c13807d.f43658b0 + i15);
        }
        c13807d.f43687q = 2;
        c13807d.f43656a0 = i15;
        int i17 = i16 - i15;
        c13807d.f43651W = i17;
        int i18 = c13807d.f43662d0;
        if (i17 < i18) {
            c13807d.f43651W = i18;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m15419c(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
