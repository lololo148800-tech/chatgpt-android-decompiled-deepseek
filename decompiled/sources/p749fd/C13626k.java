package p749fd;

import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;
import p562X0.C9008c;
import p586Y0.C9566r;
import p586Y0.C9572x;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: fd.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C13626k extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C13626k f43057Y = new C13626k(2);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C9008c Saver = (C9008c) obj;
        C13625j state = (C13625j) obj2;
        AbstractC16544l.m18094g(Saver, "$this$Saver");
        AbstractC16544l.m18094g(state, "state");
        C9566r c9566r = state.f43049b;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c9566r, 10));
        ListIterator listIterator = c9566r.listIterator();
        while (true) {
            C9572x c9572x = (C9572x) listIterator;
            if (!c9572x.hasNext()) {
                break;
            }
            arrayList.add(AbstractC13627l.m15150b((C13621f) c9572x.next(), state.f43056i));
        }
        C9566r c9566r2 = state.f43051d;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(c9566r2, 10));
        ListIterator listIterator2 = c9566r2.listIterator();
        while (true) {
            C9572x c9572x2 = (C9572x) listIterator2;
            if (!c9572x2.hasNext()) {
                break;
            }
            arrayList2.add(AbstractC13627l.m15150b((C13621f) c9572x2.next(), state.f43056i));
        }
        C9566r c9566r3 = state.f43050c;
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(c9566r3, 10));
        ListIterator listIterator3 = c9566r3.listIterator();
        while (true) {
            C9572x c9572x3 = (C9572x) listIterator3;
            if (!c9572x3.hasNext()) {
                return AbstractC17681o.m19382k(state.f43048a, Float.valueOf(state.f43052e.m6409g()), Float.valueOf(state.f43053f.m6409g()), Integer.valueOf(AbstractC14334L.m15617F(((C14365u) state.f43054g.getValue()).f45062a)), arrayList, arrayList2, arrayList3, Integer.valueOf((int) (state.f43056i >> 32)), Integer.valueOf((int) (state.f43056i & 4294967295L)), Integer.valueOf((int) (state.f43055h >> 32)), Integer.valueOf((int) (state.f43055h & 4294967295L)));
            }
            arrayList3.add(AbstractC13627l.m15150b((C13621f) c9572x3.next(), state.f43056i));
        }
    }
}
