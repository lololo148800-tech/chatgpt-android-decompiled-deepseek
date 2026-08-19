package p084D4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p720e6.C13288c;

/* JADX INFO: renamed from: D4.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1938s {

    /* JADX INFO: renamed from: a */
    public final ArrayList f5719a;

    /* JADX INFO: renamed from: b */
    public final int[] f5720b;

    /* JADX INFO: renamed from: c */
    public final int[] f5721c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1906c f5722d;

    /* JADX INFO: renamed from: e */
    public final int f5723e;

    /* JADX INFO: renamed from: f */
    public final int f5724f;

    /* JADX INFO: renamed from: g */
    public final boolean f5725g;

    public C1938s(AbstractC1906c abstractC1906c, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int[] iArr3;
        int[] iArr4;
        AbstractC1906c abstractC1906c2;
        int i10;
        int i11;
        this.f5719a = arrayList;
        this.f5720b = iArr;
        this.f5721c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f5722d = abstractC1906c;
        int iMo3024i = abstractC1906c.mo3024i();
        this.f5723e = iMo3024i;
        int iMo3023h = abstractC1906c.mo3023h();
        this.f5724f = iMo3023h;
        this.f5725g = true;
        C1936r c1936r = arrayList.isEmpty() ? null : (C1936r) arrayList.get(0);
        if (c1936r == null || c1936r.f5714a != 0 || c1936r.f5715b != 0) {
            arrayList.add(0, new C1936r(0, 0, 0));
        }
        arrayList.add(new C1936r(iMo3024i, iMo3023h, 0));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            iArr3 = this.f5721c;
            iArr4 = this.f5720b;
            abstractC1906c2 = this.f5722d;
            if (!zHasNext) {
                break;
            }
            C1936r c1936r2 = (C1936r) it.next();
            for (int i12 = 0; i12 < c1936r2.f5716c; i12++) {
                int i13 = c1936r2.f5714a + i12;
                int i14 = c1936r2.f5715b + i12;
                int i15 = abstractC1906c2.mo3020a(i13, i14) ? 1 : 2;
                iArr4[i13] = (i14 << 4) | i15;
                iArr3[i14] = (i13 << 4) | i15;
            }
        }
        if (this.f5725g) {
            Iterator it2 = arrayList.iterator();
            int i16 = 0;
            while (it2.hasNext()) {
                C1936r c1936r3 = (C1936r) it2.next();
                while (true) {
                    i10 = c1936r3.f5714a;
                    if (i16 < i10) {
                        if (iArr4[i16] == 0) {
                            int size = arrayList.size();
                            int i17 = 0;
                            for (int i18 = 0; i18 < size; i18++) {
                                C1936r c1936r4 = (C1936r) arrayList.get(i18);
                                while (true) {
                                    i11 = c1936r4.f5715b;
                                    if (i17 < i11) {
                                        if (iArr3[i17] == 0 && abstractC1906c2.mo3021b(i16, i17)) {
                                            int i19 = abstractC1906c2.mo3020a(i16, i17) ? 8 : 4;
                                            iArr4[i16] = (i17 << 4) | i19;
                                            iArr3[i17] = i19 | (i16 << 4);
                                            break;
                                        }
                                        i17++;
                                    }
                                }
                                i17 = c1936r4.f5716c + i11;
                            }
                        }
                        i16++;
                    }
                }
                i16 = c1936r3.f5716c + i10;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1940t m3110b(ArrayDeque arrayDeque, int i10, boolean z6) {
        C1940t c1940t;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c1940t = null;
                break;
            }
            c1940t = (C1940t) it.next();
            if (c1940t.f5728a == i10 && c1940t.f5730c == z6) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C1940t c1940t2 = (C1940t) it.next();
            if (z6) {
                c1940t2.f5729b--;
            } else {
                c1940t2.f5729b++;
            }
        }
        return c1940t;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX INFO: renamed from: a */
    public final void m3111a(C13288c c13288c) {
        int[] iArr;
        AbstractC1906c abstractC1906c;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        int i14;
        C1938s c1938s = this;
        C1916h c1916h = new C1916h(c13288c);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = c1938s.f5719a;
        int size = arrayList2.size() - 1;
        int i15 = c1938s.f5723e;
        int i16 = c1938s.f5724f;
        int i17 = i15;
        while (size >= 0) {
            C1936r c1936r = (C1936r) arrayList2.get(size);
            int i18 = c1936r.f5714a;
            int i19 = c1936r.f5716c;
            int i20 = i18 + i19;
            int i21 = c1936r.f5715b;
            int i22 = i21 + i19;
            while (true) {
                iArr = c1938s.f5720b;
                abstractC1906c = c1938s.f5722d;
                i10 = 0;
                if (i17 <= i20) {
                    break;
                }
                i17--;
                int i23 = iArr[i17];
                if ((i23 & 12) != 0) {
                    arrayList = arrayList2;
                    int i24 = i23 >> 4;
                    C1940t c1940tM3110b = m3110b(arrayDeque, i24, false);
                    if (c1940tM3110b != null) {
                        i13 = i16;
                        int i25 = (i15 - c1940tM3110b.f5729b) - 1;
                        c1916h.m3043c(i17, i25);
                        if ((i23 & 4) != 0) {
                            abstractC1906c.mo3022g(i17, i24);
                            c1916h.m3042b(i25, null, 1);
                        }
                    } else {
                        i13 = i16;
                        arrayDeque.add(new C1940t(i17, (i15 - i17) - 1, true));
                    }
                } else {
                    arrayList = arrayList2;
                    i13 = i16;
                    if (c1916h.f5606b != 2 || (i14 = c1916h.f5607c) < i17 || i14 > i17 + 1) {
                        c1916h.m3041a();
                        c1916h.f5607c = i17;
                        c1916h.f5608d = 1;
                        c1916h.f5606b = 2;
                    } else {
                        c1916h.f5608d++;
                        c1916h.f5607c = i17;
                    }
                    i15--;
                }
                arrayList2 = arrayList;
                i16 = i13;
            }
            ArrayList arrayList3 = arrayList2;
            while (i16 > i22) {
                i16--;
                int i26 = c1938s.f5721c[i16];
                if ((i26 & 12) != 0) {
                    int i27 = i26 >> 4;
                    C1940t c1940tM3110b2 = m3110b(arrayDeque, i27, true);
                    if (c1940tM3110b2 == null) {
                        arrayDeque.add(new C1940t(i16, i15 - i17, false));
                        i11 = 0;
                    } else {
                        i11 = 0;
                        c1916h.m3043c((i15 - c1940tM3110b2.f5729b) - 1, i17);
                        if ((i26 & 4) != 0) {
                            abstractC1906c.mo3022g(i27, i16);
                            c1916h.m3042b(i17, null, 1);
                        }
                    }
                } else {
                    i11 = i10;
                    if (c1916h.f5606b != 1 || i17 < (i12 = c1916h.f5607c)) {
                        c1916h.m3041a();
                        c1916h.f5607c = i17;
                        c1916h.f5608d = 1;
                        c1916h.f5606b = 1;
                    } else {
                        int i28 = c1916h.f5608d;
                        if (i17 <= i12 + i28) {
                            c1916h.f5608d = i28 + 1;
                            c1916h.f5607c = Math.min(i17, i12);
                        } else {
                            c1916h.m3041a();
                            c1916h.f5607c = i17;
                            c1916h.f5608d = 1;
                            c1916h.f5606b = 1;
                        }
                    }
                    i15++;
                }
                c1938s = this;
                i10 = i11;
            }
            i17 = c1936r.f5714a;
            int i29 = i17;
            int i30 = i21;
            while (i10 < i19) {
                if ((iArr[i29] & 15) == 2) {
                    abstractC1906c.mo3022g(i29, i30);
                    c1916h.m3042b(i29, null, 1);
                }
                i29++;
                i30++;
                i10++;
            }
            size--;
            c1938s = this;
            i16 = i21;
            arrayList2 = arrayList3;
        }
        c1916h.m3041a();
    }
}
