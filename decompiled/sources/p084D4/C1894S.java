package p084D4;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: D4.S */
/* JADX INFO: loaded from: classes.dex */
public final class C1894S extends Observable {
    /* JADX INFO: renamed from: a */
    public final boolean m2903a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public final void m2904b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C1915g0) ((Observable) this).mObservers.get(size)).f5604a;
            recyclerView.m12290k(null);
            recyclerView.f33647r1.f5641f = true;
            recyclerView.m12275Y(true);
            if (!recyclerView.f33648s0.m3002j()) {
                recyclerView.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2905c(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C1915g0 c1915g0 = (C1915g0) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c1915g0.f5604a;
            recyclerView.m12290k(null);
            C1904b c1904b = recyclerView.f33648s0;
            c1904b.getClass();
            if (i10 != i11) {
                ArrayList arrayList = (ArrayList) c1904b.f5567c;
                arrayList.add(c1904b.m3004l(null, 8, i10, i11));
                c1904b.f5565a |= 8;
                if (arrayList.size() == 1) {
                    c1915g0.m3040a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2906d(int i10, Object obj, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C1915g0 c1915g0 = (C1915g0) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c1915g0.f5604a;
            recyclerView.m12290k(null);
            C1904b c1904b = recyclerView.f33648s0;
            if (i11 < 1) {
                c1904b.getClass();
            } else {
                ArrayList arrayList = (ArrayList) c1904b.f5567c;
                arrayList.add(c1904b.m3004l(obj, 4, i10, i11));
                c1904b.f5565a = 4 | c1904b.f5565a;
                if (arrayList.size() == 1) {
                    c1915g0.m3040a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2907e(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C1915g0 c1915g0 = (C1915g0) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c1915g0.f5604a;
            recyclerView.m12290k(null);
            C1904b c1904b = recyclerView.f33648s0;
            if (i11 < 1) {
                c1904b.getClass();
            } else {
                ArrayList arrayList = (ArrayList) c1904b.f5567c;
                arrayList.add(c1904b.m3004l(null, 1, i10, i11));
                c1904b.f5565a |= 1;
                if (arrayList.size() == 1) {
                    c1915g0.m3040a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2908f(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C1915g0 c1915g0 = (C1915g0) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c1915g0.f5604a;
            recyclerView.m12290k(null);
            C1904b c1904b = recyclerView.f33648s0;
            if (i11 < 1) {
                c1904b.getClass();
            } else {
                ArrayList arrayList = (ArrayList) c1904b.f5567c;
                arrayList.add(c1904b.m3004l(null, 2, i10, i11));
                c1904b.f5565a |= 2;
                if (arrayList.size() == 1) {
                    c1915g0.m3040a();
                }
            }
        }
    }
}
