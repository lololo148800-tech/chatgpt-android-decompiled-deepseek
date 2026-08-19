package p259K5;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p033B5.InterfaceC0829m;
import p1033u5.C20116a;
import p1033u5.C20121f;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: K5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4544f {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f14853a;

    /* JADX INFO: renamed from: b */
    public int f14854b;

    public C4544f(int i10) {
        switch (i10) {
            case 1:
                this.f14853a = new LinkedHashMap();
                break;
            default:
                this.f14853a = new LinkedHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5307a() {
        WeakReference weakReference;
        this.f14854b = 0;
        Iterator it = this.f14853a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                C20121f c20121f = (C20121f) AbstractC17680n.m19343S(arrayList);
                if (((c20121f == null || (weakReference = c20121f.f63749b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (((C20121f) arrayList.get(i12)).f63749b.get() == null) {
                        arrayList.remove(i12);
                        i10++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5308b() {
        WeakReference weakReference;
        int i10 = this.f14854b;
        this.f14854b = i10 + 1;
        if (i10 >= 10) {
            this.f14854b = 0;
            Iterator it = this.f14853a.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    C4543e c4543e = (C4543e) AbstractC17680n.m19343S(arrayList);
                    if (((c4543e == null || (weakReference = c4543e.f14850a) == null) ? null : (InterfaceC0829m) weakReference.get()) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i11 = 0;
                    for (int i12 = 0; i12 < size; i12++) {
                        int i13 = i12 - i11;
                        if (((C4543e) arrayList.get(i13)).f14850a.get() == null) {
                            arrayList.remove(i13);
                            i11++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m5309c(C4539a c4539a, InterfaceC0829m interfaceC0829m, Map map, long j10) {
        LinkedHashMap linkedHashMap = this.f14853a;
        Object arrayList = linkedHashMap.get(c4539a);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(c4539a, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        C4543e c4543e = new C4543e(new WeakReference(interfaceC0829m), map, j10);
        if (arrayList2.isEmpty()) {
            arrayList2.add(c4543e);
        } else {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                C4543e c4543e2 = (C4543e) arrayList2.get(i10);
                if (j10 >= c4543e2.f14852c) {
                    if (c4543e2.f14850a.get() == interfaceC0829m) {
                        arrayList2.set(i10, c4543e);
                        break;
                    } else {
                        arrayList2.add(i10, c4543e);
                        break;
                    }
                }
            }
        }
        m5308b();
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m5310d(C20116a c20116a, Bitmap bitmap, Map map, int i10) {
        try {
            LinkedHashMap linkedHashMap = this.f14853a;
            Object arrayList = linkedHashMap.get(c20116a);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c20116a, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            C20121f c20121f = new C20121f(iIdentityHashCode, new WeakReference(bitmap), map, i10);
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    arrayList2.add(c20121f);
                    break;
                }
                C20121f c20121f2 = (C20121f) arrayList2.get(i11);
                if (i10 >= c20121f2.f63751d) {
                    if (c20121f2.f63748a != iIdentityHashCode || c20121f2.f63749b.get() != bitmap) {
                        arrayList2.add(i11, c20121f);
                        break;
                    } else {
                        arrayList2.set(i11, c20121f);
                        break;
                    }
                }
                i11++;
            }
            int i12 = this.f14854b;
            this.f14854b = i12 + 1;
            if (i12 >= 10) {
                m5307a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m5311e(int i10) {
        if (i10 >= 10 && i10 != 20) {
            m5307a();
        }
    }
}
