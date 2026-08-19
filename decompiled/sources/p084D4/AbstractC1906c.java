package p084D4;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import p033B5.C0842z;

/* JADX INFO: renamed from: D4.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1906c {

    /* JADX INFO: renamed from: b */
    public static ExecutorService f5572b;

    /* JADX INFO: renamed from: a */
    public static final Object f5571a = new Object();

    /* JADX INFO: renamed from: c */
    public static final C0842z f5573c = new C0842z(4);

    /* JADX INFO: renamed from: c */
    public static C1938s m3016c(AbstractC1906c abstractC1906c) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C1942u c1942u;
        C1944v c1944v;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i10;
        C1942u c1942u2;
        C1936r c1936r;
        int i11;
        int i12;
        C1944v c1944v2;
        C1944v c1944v3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iMo3024i = abstractC1906c.mo3024i();
        int iMo3023h = abstractC1906c.mo3023h();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C1942u c1942u3 = new C1942u();
        int i19 = 0;
        c1942u3.f5738a = 0;
        c1942u3.f5739b = iMo3024i;
        c1942u3.f5740c = 0;
        c1942u3.f5741d = iMo3023h;
        arrayList6.add(c1942u3);
        int i20 = iMo3024i + iMo3023h;
        int i21 = 1;
        int i22 = (((i20 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i22];
        int i23 = i22 / 2;
        int[] iArr2 = new int[i22];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            C1942u c1942u4 = (C1942u) arrayList6.remove(arrayList6.size() - i21);
            if (c1942u4.m3114b() >= i21 && c1942u4.m3113a() >= i21) {
                int iM3113a = ((c1942u4.m3113a() + c1942u4.m3114b()) + i21) / 2;
                int i24 = i21 + i23;
                iArr[i24] = c1942u4.f5738a;
                iArr2[i24] = c1942u4.f5739b;
                int i25 = i19;
                while (true) {
                    if (i25 >= iM3113a) {
                        arrayList = arrayList6;
                        arrayList2 = arrayList7;
                        c1942u = c1942u4;
                        c1944v = null;
                        break;
                    }
                    int i26 = Math.abs(c1942u4.m3114b() - c1942u4.m3113a()) % 2 == i21 ? i21 : i19;
                    int iM3114b = c1942u4.m3114b() - c1942u4.m3113a();
                    int i27 = -i25;
                    int i28 = i27;
                    while (true) {
                        if (i28 > i25) {
                            arrayList = arrayList6;
                            i11 = i19;
                            arrayList2 = arrayList7;
                            i12 = iM3113a;
                            c1944v2 = null;
                            break;
                        }
                        if (i28 == i27 || (i28 != i25 && iArr[i28 + 1 + i23] > iArr[(i28 - 1) + i23])) {
                            i16 = iArr[i28 + 1 + i23];
                            i17 = i16;
                        } else {
                            i16 = iArr[(i28 - 1) + i23];
                            i17 = i16 + 1;
                        }
                        i12 = iM3113a;
                        arrayList = arrayList6;
                        int i29 = ((i17 - c1942u4.f5738a) + c1942u4.f5740c) - i28;
                        int i30 = (i25 == 0 || i17 != i16) ? i29 : i29 - 1;
                        arrayList2 = arrayList7;
                        while (i17 < c1942u4.f5739b && i29 < c1942u4.f5741d && abstractC1906c.mo3021b(i17, i29)) {
                            i17++;
                            i29++;
                        }
                        iArr[i28 + i23] = i17;
                        if (i26 != 0) {
                            int i31 = iM3114b - i28;
                            i18 = i26;
                            if (i31 >= i27 + 1 && i31 <= i25 - 1 && iArr2[i31 + i23] <= i17) {
                                c1944v2 = new C1944v();
                                c1944v2.f5743a = i16;
                                c1944v2.f5744b = i30;
                                c1944v2.f5745c = i17;
                                c1944v2.f5746d = i29;
                                i11 = 0;
                                c1944v2.f5747e = false;
                                break;
                            }
                        } else {
                            i18 = i26;
                        }
                        i28 += 2;
                        i19 = 0;
                        iM3113a = i12;
                        arrayList6 = arrayList;
                        arrayList7 = arrayList2;
                        i26 = i18;
                    }
                    if (c1944v2 != null) {
                        c1944v = c1944v2;
                        c1942u = c1942u4;
                        break;
                    }
                    int i32 = (c1942u4.m3114b() - c1942u4.m3113a()) % 2 == 0 ? 1 : i11;
                    int iM3114b2 = c1942u4.m3114b() - c1942u4.m3113a();
                    int i33 = i27;
                    while (true) {
                        if (i33 > i25) {
                            c1942u = c1942u4;
                            c1944v3 = null;
                            break;
                        }
                        if (i33 == i27 || (i33 != i25 && iArr2[i33 + 1 + i23] < iArr2[(i33 - 1) + i23])) {
                            i13 = iArr2[i33 + 1 + i23];
                            i14 = i13;
                        } else {
                            i13 = iArr2[(i33 - 1) + i23];
                            i14 = i13 - 1;
                        }
                        int i34 = c1942u4.f5741d - ((c1942u4.f5739b - i14) - i33);
                        int i35 = (i25 == 0 || i14 != i13) ? i34 : i34 + 1;
                        while (true) {
                            if (i14 > c1942u4.f5738a && i34 > c1942u4.f5740c) {
                                c1942u = c1942u4;
                                if (!abstractC1906c.mo3021b(i14 - 1, i34 - 1)) {
                                    break;
                                }
                                i14--;
                                i34--;
                                c1942u4 = c1942u;
                            } else {
                                c1942u = c1942u4;
                                break;
                            }
                        }
                        iArr2[i33 + i23] = i14;
                        if (i32 != 0 && (i15 = iM3114b2 - i33) >= i27 && i15 <= i25 && iArr[i15 + i23] >= i14) {
                            c1944v3 = new C1944v();
                            c1944v3.f5743a = i14;
                            c1944v3.f5744b = i34;
                            c1944v3.f5745c = i13;
                            c1944v3.f5746d = i35;
                            c1944v3.f5747e = true;
                            break;
                        }
                        i33 += 2;
                        c1942u4 = c1942u;
                    }
                    if (c1944v3 != null) {
                        c1944v = c1944v3;
                        break;
                    }
                    i25++;
                    iM3113a = i12;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                    c1942u4 = c1942u;
                    i21 = 1;
                    i19 = 0;
                }
            } else {
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                c1942u = c1942u4;
                c1944v = null;
                break;
            }
            if (c1944v != null) {
                if (c1944v.m3115a() > 0) {
                    int i36 = c1944v.f5746d;
                    int i37 = c1944v.f5744b;
                    int i38 = i36 - i37;
                    int i39 = c1944v.f5745c;
                    int i40 = c1944v.f5743a;
                    int i41 = i39 - i40;
                    if (i38 == i41) {
                        c1936r = new C1936r(i40, i37, i41);
                    } else if (c1944v.f5747e) {
                        c1936r = new C1936r(i40, i37, c1944v.m3115a());
                    } else {
                        c1936r = i38 > i41 ? new C1936r(i40, i37 + 1, c1944v.m3115a()) : new C1936r(i40 + 1, i37, c1944v.m3115a());
                    }
                    arrayList5.add(c1936r);
                }
                if (arrayList2.isEmpty()) {
                    c1942u2 = new C1942u();
                    arrayList4 = arrayList2;
                    i10 = 1;
                } else {
                    i10 = 1;
                    arrayList4 = arrayList2;
                    c1942u2 = (C1942u) arrayList4.remove(arrayList2.size() - 1);
                }
                c1942u2.f5738a = c1942u.f5738a;
                c1942u2.f5740c = c1942u.f5740c;
                c1942u2.f5739b = c1944v.f5743a;
                c1942u2.f5741d = c1944v.f5744b;
                arrayList3 = arrayList;
                arrayList3.add(c1942u2);
                c1942u.f5739b = c1942u.f5739b;
                c1942u.f5741d = c1942u.f5741d;
                c1942u.f5738a = c1944v.f5745c;
                c1942u.f5740c = c1944v.f5746d;
                arrayList3.add(c1942u);
            } else {
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                i10 = 1;
                arrayList4.add(c1942u);
            }
            i21 = i10;
            arrayList6 = arrayList3;
            arrayList7 = arrayList4;
            i19 = 0;
        }
        Collections.sort(arrayList5, f5573c);
        return new C1938s(abstractC1906c, arrayList5, iArr, iArr2);
    }

    /* JADX INFO: renamed from: d */
    public static int m3017d(C1925l0 c1925l0, AbstractC1888L abstractC1888L, View view, View view2, AbstractC1900Y abstractC1900Y, boolean z6) {
        if (abstractC1900Y.m2985v() == 0 || c1925l0.m3082b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return Math.abs(AbstractC1900Y.m2917F(view) - AbstractC1900Y.m2917F(view2)) + 1;
        }
        return Math.min(abstractC1888L.mo2886l(), abstractC1888L.mo2876b(view2) - abstractC1888L.mo2879e(view));
    }

    /* JADX INFO: renamed from: e */
    public static int m3018e(C1925l0 c1925l0, AbstractC1888L abstractC1888L, View view, View view2, AbstractC1900Y abstractC1900Y, boolean z6, boolean z10) {
        if (abstractC1900Y.m2985v() == 0 || c1925l0.m3082b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z10 ? Math.max(0, (c1925l0.m3082b() - Math.max(AbstractC1900Y.m2917F(view), AbstractC1900Y.m2917F(view2))) - 1) : Math.max(0, Math.min(AbstractC1900Y.m2917F(view), AbstractC1900Y.m2917F(view2)));
        if (z6) {
            return Math.round((iMax * (Math.abs(abstractC1888L.mo2876b(view2) - abstractC1888L.mo2879e(view)) / (Math.abs(AbstractC1900Y.m2917F(view) - AbstractC1900Y.m2917F(view2)) + 1))) + (abstractC1888L.mo2885k() - abstractC1888L.mo2879e(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: f */
    public static int m3019f(C1925l0 c1925l0, AbstractC1888L abstractC1888L, View view, View view2, AbstractC1900Y abstractC1900Y, boolean z6) {
        if (abstractC1900Y.m2985v() == 0 || c1925l0.m3082b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return c1925l0.m3082b();
        }
        return (int) (((abstractC1888L.mo2876b(view2) - abstractC1888L.mo2879e(view)) / (Math.abs(AbstractC1900Y.m2917F(view) - AbstractC1900Y.m2917F(view2)) + 1)) * c1925l0.m3082b());
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo3020a(int i10, int i11);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo3021b(int i10, int i11);

    /* JADX INFO: renamed from: h */
    public abstract int mo3023h();

    /* JADX INFO: renamed from: i */
    public abstract int mo3024i();

    /* JADX INFO: renamed from: g */
    public void mo3022g(int i10, int i11) {
    }
}
