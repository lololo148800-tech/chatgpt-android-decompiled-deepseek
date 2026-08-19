package p909nm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: nm.p */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17682p extends AbstractC17681o {
    /* JADX INFO: renamed from: r */
    public static int m19389r(Iterable iterable, int i10) {
        AbstractC16544l.m18094g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    /* JADX INFO: renamed from: s */
    public static ArrayList m19390s(Iterable iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
