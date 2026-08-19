package p316Mf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1150zd.EnumC21875k;
import p586Y0.C9566r;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Mf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C5339f extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C5339f f17558Y = new C5339f(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        List names = (List) obj;
        AbstractC16544l.m18094g(names, "names");
        List list = names;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(EnumC21875k.valueOf((String) it.next()));
        }
        C9566r c9566r = new C9566r();
        c9566r.addAll(arrayList);
        return c9566r;
    }
}
