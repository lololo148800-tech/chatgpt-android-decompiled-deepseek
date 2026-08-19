package p442S2;

import android.os.SystemClock;
import android.view.Choreographer;
import fo.C13711h;
import java.util.ArrayList;
import p179H0.C3183a;
import p692d0.C12959L;
import p775h2.AbstractC14376f;
import p960q9.C18655i;

/* JADX INFO: renamed from: S2.a */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC6987a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C13711h f22337Y;

    public ChoreographerFrameCallbackC6987a(C13711h c13711h) {
        this.f22337Y = c13711h;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:36:0x0138  */
    /* JADX WARN: Code duplicated, block: B:38:0x0143  */
    /* JADX WARN: Code duplicated, block: B:41:0x015e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0175  */
    /* JADX WARN: Code duplicated, block: B:47:0x017b A[LOOP:1: B:43:0x016d->B:47:0x017b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x018b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0191  */
    /* JADX WARN: Code duplicated, block: B:74:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0194 A[SYNTHETIC] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        long j11;
        long j12;
        float f10;
        float f11;
        C6991e c6991e;
        boolean z6;
        ThreadLocal threadLocal;
        C6988b c6988b;
        ArrayList arrayList;
        int iIndexOf;
        int i10;
        ArrayList arrayList2;
        int size;
        float f12;
        C18655i c18655i = (C18655i) this.f22337Y.f43259Z;
        c18655i.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        C6988b c6988b2 = (C6988b) c18655i.f59414Z;
        c6988b2.getClass();
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList3 = c6988b2.f22340b;
            if (i11 >= arrayList3.size()) {
                if (c6988b2.f22343e) {
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        if (arrayList3.get(size2) == null) {
                            arrayList3.remove(size2);
                        }
                    }
                    c6988b2.f22343e = false;
                }
                if (arrayList3.size() > 0) {
                    if (c6988b2.f22342d == null) {
                        c6988b2.f22342d = new C13711h(c6988b2.f22341c);
                    }
                    C13711h c13711h = c6988b2.f22342d;
                    ((Choreographer) c13711h.f43260o0).postFrameCallback((ChoreographerFrameCallbackC6987a) c13711h.f43261p0);
                    return;
                }
                return;
            }
            C6990d c6990d = (C6990d) arrayList3.get(i11);
            if (c6990d == null) {
                i11 = i11;
            } else {
                C12959L c12959l = c6988b2.f22339a;
                Long l4 = (Long) c12959l.get(c6990d);
                if (l4 == null) {
                    j11 = c6990d.f22356g;
                    if (j11 == 0) {
                        c6990d.f22356g = jUptimeMillis;
                        c6990d.m7389a(c6990d.f22351b);
                        i11 = i11;
                    } else {
                        j12 = jUptimeMillis - j11;
                        c6990d.f22356g = jUptimeMillis;
                        if (c6990d.f22362m) {
                            f12 = c6990d.f22361l;
                            if (f12 != Float.MAX_VALUE) {
                                c6990d.f22360k.f22371i = f12;
                                c6990d.f22361l = Float.MAX_VALUE;
                            }
                            c6990d.f22351b = (float) c6990d.f22360k.f22371i;
                            c6990d.f22350a = 0.0f;
                            c6990d.f22362m = z10;
                            i11 = i11;
                        } else {
                            if (c6990d.f22361l != Float.MAX_VALUE) {
                                C6991e c6991e2 = c6990d.f22360k;
                                double d10 = c6991e2.f22371i;
                                long j13 = j12 / 2;
                                C3183a c3183aM7391a = c6991e2.m7391a(c6990d.f22351b, c6990d.f22350a, j13);
                                C6991e c6991e3 = c6990d.f22360k;
                                c6991e3.f22371i = c6990d.f22361l;
                                c6990d.f22361l = Float.MAX_VALUE;
                                C3183a c3183aM7391a2 = c6991e3.m7391a(c3183aM7391a.f9593Y, c3183aM7391a.f9594Z, j13);
                                c6990d.f22351b = c3183aM7391a2.f9593Y;
                                c6990d.f22350a = c3183aM7391a2.f9594Z;
                                f10 = 0.0f;
                            } else {
                                f10 = 0.0f;
                                C3183a c3183aM7391a3 = c6990d.f22360k.m7391a(c6990d.f22351b, c6990d.f22350a, j12);
                                c6990d.f22351b = c3183aM7391a3.f9593Y;
                                c6990d.f22350a = c3183aM7391a3.f9594Z;
                            }
                            float fMax = Math.max(c6990d.f22351b, -3.4028235E38f);
                            c6990d.f22351b = fMax;
                            float fMin = Math.min(fMax, Float.MAX_VALUE);
                            c6990d.f22351b = fMin;
                            f11 = c6990d.f22350a;
                            c6991e = c6990d.f22360k;
                            c6991e.getClass();
                            if (Math.abs(f11) < c6991e.f22367e) {
                            }
                            z6 = false;
                            float fMin2 = Math.min(c6990d.f22351b, Float.MAX_VALUE);
                            c6990d.f22351b = fMin2;
                            float fMax2 = Math.max(fMin2, -3.4028235E38f);
                            c6990d.f22351b = fMax2;
                            c6990d.m7389a(fMax2);
                            if (z6) {
                                c6990d.f22355f = false;
                                threadLocal = C6988b.f22338f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new C6988b());
                                }
                                c6988b = (C6988b) threadLocal.get();
                                c6988b.f22339a.remove(c6990d);
                                arrayList = c6988b.f22340b;
                                iIndexOf = arrayList.indexOf(c6990d);
                                if (iIndexOf >= 0) {
                                    arrayList.set(iIndexOf, null);
                                    c6988b.f22343e = true;
                                }
                                c6990d.f22356g = 0L;
                                c6990d.f22352c = false;
                                i10 = 0;
                                while (true) {
                                    arrayList2 = c6990d.f22358i;
                                    if (i10 < arrayList2.size()) {
                                        for (size = arrayList2.size() - 1; size >= 0; size--) {
                                            if (arrayList2.get(size) == null) {
                                                arrayList2.remove(size);
                                            }
                                        }
                                        break;
                                        break;
                                    }
                                    if (arrayList2.get(i10) == null) {
                                        throw AbstractC14376f.m15860z(i10, arrayList2);
                                    }
                                    i10++;
                                }
                            } else {
                                continue;
                            }
                        }
                        z6 = true;
                        float fMin3 = Math.min(c6990d.f22351b, Float.MAX_VALUE);
                        c6990d.f22351b = fMin3;
                        float fMax3 = Math.max(fMin3, -3.4028235E38f);
                        c6990d.f22351b = fMax3;
                        c6990d.m7389a(fMax3);
                        if (z6) {
                            c6990d.f22355f = false;
                            threadLocal = C6988b.f22338f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new C6988b());
                            }
                            c6988b = (C6988b) threadLocal.get();
                            c6988b.f22339a.remove(c6990d);
                            arrayList = c6988b.f22340b;
                            iIndexOf = arrayList.indexOf(c6990d);
                            if (iIndexOf >= 0) {
                                arrayList.set(iIndexOf, null);
                                c6988b.f22343e = true;
                            }
                            c6990d.f22356g = 0L;
                            c6990d.f22352c = false;
                            i10 = 0;
                            while (true) {
                                arrayList2 = c6990d.f22358i;
                                if (i10 < arrayList2.size()) {
                                    while (size >= 0) {
                                        if (arrayList2.get(size) == null) {
                                            arrayList2.remove(size);
                                        }
                                    }
                                    break;
                                    break;
                                }
                                if (arrayList2.get(i10) == null) {
                                    throw AbstractC14376f.m15860z(i10, arrayList2);
                                }
                                i10++;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (l4.longValue() < jUptimeMillis2) {
                    c12959l.remove(c6990d);
                    j11 = c6990d.f22356g;
                    if (j11 == 0) {
                        c6990d.f22356g = jUptimeMillis;
                        c6990d.m7389a(c6990d.f22351b);
                        i11 = i11;
                    } else {
                        j12 = jUptimeMillis - j11;
                        c6990d.f22356g = jUptimeMillis;
                        if (c6990d.f22362m) {
                            f12 = c6990d.f22361l;
                            if (f12 != Float.MAX_VALUE) {
                                c6990d.f22360k.f22371i = f12;
                                c6990d.f22361l = Float.MAX_VALUE;
                            }
                            c6990d.f22351b = (float) c6990d.f22360k.f22371i;
                            c6990d.f22350a = 0.0f;
                            c6990d.f22362m = z10;
                            i11 = i11;
                        } else {
                            if (c6990d.f22361l != Float.MAX_VALUE) {
                                C6991e c6991e4 = c6990d.f22360k;
                                double d11 = c6991e4.f22371i;
                                long j14 = j12 / 2;
                                C3183a c3183aM7391a4 = c6991e4.m7391a(c6990d.f22351b, c6990d.f22350a, j14);
                                C6991e c6991e5 = c6990d.f22360k;
                                c6991e5.f22371i = c6990d.f22361l;
                                c6990d.f22361l = Float.MAX_VALUE;
                                C3183a c3183aM7391a5 = c6991e5.m7391a(c3183aM7391a4.f9593Y, c3183aM7391a4.f9594Z, j14);
                                c6990d.f22351b = c3183aM7391a5.f9593Y;
                                c6990d.f22350a = c3183aM7391a5.f9594Z;
                                f10 = 0.0f;
                            } else {
                                f10 = 0.0f;
                                C3183a c3183aM7391a6 = c6990d.f22360k.m7391a(c6990d.f22351b, c6990d.f22350a, j12);
                                c6990d.f22351b = c3183aM7391a6.f9593Y;
                                c6990d.f22350a = c3183aM7391a6.f9594Z;
                            }
                            float fMax4 = Math.max(c6990d.f22351b, -3.4028235E38f);
                            c6990d.f22351b = fMax4;
                            float fMin4 = Math.min(fMax4, Float.MAX_VALUE);
                            c6990d.f22351b = fMin4;
                            f11 = c6990d.f22350a;
                            c6991e = c6990d.f22360k;
                            c6991e.getClass();
                            if (Math.abs(f11) < c6991e.f22367e || Math.abs(fMin4 - ((float) c6991e.f22371i)) >= c6991e.f22366d) {
                                z6 = false;
                            } else {
                                c6990d.f22351b = (float) c6990d.f22360k.f22371i;
                                c6990d.f22350a = f10;
                            }
                            float fMin5 = Math.min(c6990d.f22351b, Float.MAX_VALUE);
                            c6990d.f22351b = fMin5;
                            float fMax5 = Math.max(fMin5, -3.4028235E38f);
                            c6990d.f22351b = fMax5;
                            c6990d.m7389a(fMax5);
                            if (z6) {
                                c6990d.f22355f = false;
                                threadLocal = C6988b.f22338f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new C6988b());
                                }
                                c6988b = (C6988b) threadLocal.get();
                                c6988b.f22339a.remove(c6990d);
                                arrayList = c6988b.f22340b;
                                iIndexOf = arrayList.indexOf(c6990d);
                                if (iIndexOf >= 0) {
                                    arrayList.set(iIndexOf, null);
                                    c6988b.f22343e = true;
                                }
                                c6990d.f22356g = 0L;
                                c6990d.f22352c = false;
                                i10 = 0;
                                while (true) {
                                    arrayList2 = c6990d.f22358i;
                                    if (i10 < arrayList2.size()) {
                                        while (size >= 0) {
                                            if (arrayList2.get(size) == null) {
                                                arrayList2.remove(size);
                                            }
                                        }
                                        break;
                                    }
                                    if (arrayList2.get(i10) == null) {
                                        throw AbstractC14376f.m15860z(i10, arrayList2);
                                    }
                                    i10++;
                                }
                            } else {
                                continue;
                            }
                        }
                        z6 = true;
                        float fMin6 = Math.min(c6990d.f22351b, Float.MAX_VALUE);
                        c6990d.f22351b = fMin6;
                        float fMax6 = Math.max(fMin6, -3.4028235E38f);
                        c6990d.f22351b = fMax6;
                        c6990d.m7389a(fMax6);
                        if (z6) {
                            c6990d.f22355f = false;
                            threadLocal = C6988b.f22338f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new C6988b());
                            }
                            c6988b = (C6988b) threadLocal.get();
                            c6988b.f22339a.remove(c6990d);
                            arrayList = c6988b.f22340b;
                            iIndexOf = arrayList.indexOf(c6990d);
                            if (iIndexOf >= 0) {
                                arrayList.set(iIndexOf, null);
                                c6988b.f22343e = true;
                            }
                            c6990d.f22356g = 0L;
                            c6990d.f22352c = false;
                            i10 = 0;
                            while (true) {
                                arrayList2 = c6990d.f22358i;
                                if (i10 < arrayList2.size()) {
                                    while (size >= 0) {
                                        if (arrayList2.get(size) == null) {
                                            arrayList2.remove(size);
                                        }
                                    }
                                    break;
                                    break;
                                }
                                if (arrayList2.get(i10) == null) {
                                    throw AbstractC14376f.m15860z(i10, arrayList2);
                                }
                                i10++;
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    i11 = i11;
                }
            }
            i11++;
            z10 = false;
        }
    }
}
