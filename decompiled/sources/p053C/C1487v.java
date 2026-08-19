package p053C;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001A.C0069j0;
import p003A1.AbstractC0224Z;
import p277L.ExecutorC4836i;

/* JADX INFO: renamed from: C.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1487v {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1486u f3907a;

    public C1487v(ArrayList arrayList, ExecutorC4836i executorC4836i, C0069j0 c0069j0) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f3907a = new C1485t(arrayList, executorC4836i, c0069j0);
        } else {
            this.f3907a = new C1484s(arrayList, executorC4836i, c0069j0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m2131a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0224Z.m702d(((C1474i) it.next()).f3883a.mo2114c()));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1487v)) {
            return false;
        }
        return this.f3907a.equals(((C1487v) obj).f3907a);
    }

    public final int hashCode() {
        return this.f3907a.hashCode();
    }
}
