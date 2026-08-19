package p084D4;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p1033u5.C20116a;
import p525Vb.C8258a;
import p714e0.AbstractC13253a;
import p714e0.C13254b;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: D4.x0 */
/* JADX INFO: loaded from: classes.dex */
public class C1949x0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5767a;

    /* JADX INFO: renamed from: b */
    public int f5768b;

    /* JADX INFO: renamed from: c */
    public int f5769c;

    /* JADX INFO: renamed from: d */
    public int f5770d;

    /* JADX INFO: renamed from: e */
    public int f5771e;

    /* JADX INFO: renamed from: f */
    public final Object f5772f;

    /* JADX INFO: renamed from: g */
    public final Object f5773g;

    public C1949x0(int i10) {
        this.f5767a = 1;
        this.f5768b = i10;
        if (i10 <= 0) {
            AbstractC13253a.m14850c("maxSize <= 0");
            throw null;
        }
        C13254b c13254b = new C13254b();
        c13254b.f41868a = new LinkedHashMap(0, 0.75f, true);
        this.f5772f = c13254b;
        this.f5773g = new C8258a();
    }

    /* JADX INFO: renamed from: a */
    public void m3116a() {
        View view = (View) AbstractC17792x.m19532o(1, (ArrayList) this.f5772f);
        C1943u0 c1943u0 = (C1943u0) view.getLayoutParams();
        this.f5769c = ((StaggeredGridLayoutManager) this.f5773g).f33677r.mo2876b(view);
        c1943u0.getClass();
    }

    /* JADX INFO: renamed from: b */
    public void m3117b() {
        ((ArrayList) this.f5772f).clear();
        this.f5768b = Integer.MIN_VALUE;
        this.f5769c = Integer.MIN_VALUE;
        this.f5770d = 0;
    }

    /* JADX INFO: renamed from: c */
    public void mo3118c(Object key, Object oldValue, Object obj) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(oldValue, "oldValue");
    }

    /* JADX INFO: renamed from: d */
    public int m3119d() {
        boolean z6 = ((StaggeredGridLayoutManager) this.f5773g).f33682w;
        ArrayList arrayList = (ArrayList) this.f5772f;
        return z6 ? m3121f(arrayList.size() - 1, -1) : m3121f(0, arrayList.size());
    }

    /* JADX INFO: renamed from: e */
    public int m3120e() {
        boolean z6 = ((StaggeredGridLayoutManager) this.f5773g).f33682w;
        ArrayList arrayList = (ArrayList) this.f5772f;
        return z6 ? m3121f(0, arrayList.size()) : m3121f(arrayList.size() - 1, -1);
    }

    /* JADX INFO: renamed from: f */
    public int m3121f(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f5773g;
        int iMo2885k = staggeredGridLayoutManager.f33677r.mo2885k();
        int iMo2881g = staggeredGridLayoutManager.f33677r.mo2881g();
        int i12 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View view = (View) ((ArrayList) this.f5772f).get(i10);
            int iMo2879e = staggeredGridLayoutManager.f33677r.mo2879e(view);
            int iMo2876b = staggeredGridLayoutManager.f33677r.mo2876b(view);
            boolean z6 = iMo2879e <= iMo2881g;
            boolean z10 = iMo2876b >= iMo2885k;
            if (z6 && z10 && (iMo2879e < iMo2885k || iMo2876b > iMo2881g)) {
                return AbstractC1900Y.m2917F(view);
            }
            i10 += i12;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public Object m3122g(Object key) {
        AbstractC16544l.m18094g(key, "key");
        synchronized (((C8258a) this.f5773g)) {
            C13254b c13254b = (C13254b) this.f5772f;
            c13254b.getClass();
            Object obj = c13254b.f41868a.get(key);
            if (obj != null) {
                this.f5770d++;
                return obj;
            }
            this.f5771e++;
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public int m3123h(int i10) {
        int i11 = this.f5769c;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (((ArrayList) this.f5772f).size() == 0) {
            return i10;
        }
        m3116a();
        return this.f5769c;
    }

    /* JADX INFO: renamed from: i */
    public View m3124i(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f5772f;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f5773g;
        View view = null;
        if (i11 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f33682w && AbstractC1900Y.m2917F(view2) >= i10) || ((!staggeredGridLayoutManager.f33682w && AbstractC1900Y.m2917F(view2) <= i10) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = (View) arrayList.get(i12);
                if ((staggeredGridLayoutManager.f33682w && AbstractC1900Y.m2917F(view3) <= i10) || ((!staggeredGridLayoutManager.f33682w && AbstractC1900Y.m2917F(view3) >= i10) || !view3.hasFocusable())) {
                    break;
                }
                i12++;
                view = view3;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: j */
    public int m3125j(int i10) {
        int i11 = this.f5768b;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (((ArrayList) this.f5772f).size() == 0) {
            return i10;
        }
        View view = (View) ((ArrayList) this.f5772f).get(0);
        C1943u0 c1943u0 = (C1943u0) view.getLayoutParams();
        this.f5768b = ((StaggeredGridLayoutManager) this.f5773g).f33677r.mo2879e(view);
        c1943u0.getClass();
        return this.f5768b;
    }

    /* JADX INFO: renamed from: k */
    public Object m3126k(Object key, Object value) {
        Object objPut;
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(value, "value");
        synchronized (((C8258a) this.f5773g)) {
            this.f5769c += m3128m(key, value);
            C13254b c13254b = (C13254b) this.f5772f;
            c13254b.getClass();
            objPut = c13254b.f41868a.put(key, value);
            if (objPut != null) {
                this.f5769c -= m3128m(key, objPut);
            }
        }
        if (objPut != null) {
            mo3118c(key, objPut, value);
        }
        m3130o(this.f5768b);
        return objPut;
    }

    /* JADX INFO: renamed from: l */
    public void m3127l(C20116a c20116a) {
        Object objRemove;
        synchronized (((C8258a) this.f5773g)) {
            C13254b c13254b = (C13254b) this.f5772f;
            c13254b.getClass();
            objRemove = c13254b.f41868a.remove(c20116a);
            if (objRemove != null) {
                this.f5769c -= m3128m(c20116a, objRemove);
            }
        }
        if (objRemove != null) {
            mo3118c(c20116a, objRemove, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public int m3128m(Object obj, Object obj2) {
        int iMo3129n = mo3129n(obj, obj2);
        if (iMo3129n >= 0) {
            return iMo3129n;
        }
        String message = "Negative size: " + obj + '=' + obj2;
        AbstractC16544l.m18094g(message, "message");
        throw new IllegalStateException(message);
    }

    /* JADX INFO: renamed from: n */
    public int mo3129n(Object key, Object value) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(value, "value");
        return 1;
    }

    /* JADX INFO: renamed from: o */
    public void m3130o(int i10) {
        Object key;
        Object value;
        while (true) {
            synchronized (((C8258a) this.f5773g)) {
                try {
                    if (!(this.f5769c >= 0 && (!((C13254b) this.f5772f).f41868a.isEmpty() || this.f5769c == 0))) {
                        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.f5769c > i10 && !((C13254b) this.f5772f).f41868a.isEmpty()) {
                        Set setEntrySet = ((C13254b) this.f5772f).f41868a.entrySet();
                        AbstractC16544l.m18093f(setEntrySet, "map.entries");
                        Map.Entry entry = (Map.Entry) AbstractC17680n.m19342R(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        C13254b c13254b = (C13254b) this.f5772f;
                        c13254b.getClass();
                        AbstractC16544l.m18094g(key, "key");
                        c13254b.f41868a.remove(key);
                        this.f5769c -= m3128m(key, value);
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            mo3118c(key, value, null);
        }
    }

    public String toString() {
        String str;
        switch (this.f5767a) {
            case 1:
                synchronized (((C8258a) this.f5773g)) {
                    try {
                        int i10 = this.f5770d;
                        int i11 = this.f5771e + i10;
                        str = "LruCache[maxSize=" + this.f5768b + ",hits=" + this.f5770d + ",misses=" + this.f5771e + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public C1949x0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.f5767a = 0;
        this.f5773g = staggeredGridLayoutManager;
        this.f5772f = new ArrayList();
        this.f5768b = Integer.MIN_VALUE;
        this.f5769c = Integer.MIN_VALUE;
        this.f5770d = 0;
        this.f5771e = i10;
    }
}
