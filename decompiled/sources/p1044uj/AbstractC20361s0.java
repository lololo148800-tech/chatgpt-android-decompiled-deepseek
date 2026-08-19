package p1044uj;

import java.util.ArrayList;
import java.util.Iterator;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: uj.s0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20361s0 {
    /* JADX INFO: renamed from: a */
    public static final ArrayList m21044a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C20336g((String) it.next(), EnumC20324a.UPLOAD, 0));
        }
        return arrayList2;
    }
}
