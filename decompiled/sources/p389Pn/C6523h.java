package p389Pn;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Pn.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C6523h implements InterfaceC6533r {

    /* JADX INFO: renamed from: a */
    public final ArrayList f21134a;

    public C6523h(ArrayList arrayList) {
        this.f21134a = arrayList;
    }

    @Override // p389Pn.InterfaceC6533r
    public final boolean test(Object obj) {
        ArrayList arrayList = this.f21134a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC6533r) it.next()).test(obj)) {
                return false;
            }
        }
        return true;
    }
}
