package ni;

import java.util.ArrayList;
import java.util.Iterator;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: ni.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C17632f {

    /* JADX INFO: renamed from: a */
    public static final C17632f f56419a = new C17632f();

    /* JADX INFO: renamed from: b */
    public static final ArrayList f56420b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static String m19233c() {
        ArrayList arrayList = f56420b;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getClass().getSimpleName());
        }
        return String.valueOf(arrayList2);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m19234a(Object obj) {
        f56420b.add(obj);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Object m19235b(Class cls) {
        Object objM19351a0;
        try {
            ArrayList arrayListM19338N = AbstractC17680n.m19338N(f56420b, cls);
            int size = arrayListM19338N.size();
            if (size != 0) {
                objM19351a0 = size != 1 ? AbstractC17680n.m19351a0(arrayListM19338N) : AbstractC17680n.m19365o0(arrayListM19338N);
            } else {
                objM19351a0 = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return objM19351a0;
    }
}
