package p963qd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1439n;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p527Ve.C8269f;
import p594Y9.AbstractC9740H4;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: qd.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C18680i extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59461Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f59462Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18680i(int i10, List list) {
        super(2);
        this.f59461Y = i10;
        this.f59462Z = list;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f59461Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    c6021p.m6524S(1978487460);
                    List list = this.f59462Z;
                    ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AbstractC8142m4.m8676d(((C8269f) it.next()).f25777a, c6021p));
                    }
                    c6021p.m6553p(false);
                    AbstractC4124r4.m4769c(AbstractC9740H4.m10330e(arrayList), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c6021p, 0, 0, 262142);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    List list2 = this.f59462Z;
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        InterfaceC1439n interfaceC1439n = (InterfaceC1439n) list2.get(i10);
                        int i11 = c6021p2.f19564P;
                        InterfaceC21700k.f68875m0.getClass();
                        C21696i c21696i = C21698j.f68870c;
                        c6021p2.m6528W();
                        if (c6021p2.f19563O) {
                            c6021p2.m6549l(c21696i);
                        } else {
                            c6021p2.m6543f0();
                        }
                        C21694h c21694h = C21698j.f68874g;
                        if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i11))) {
                            AbstractC0168G.m537z(i11, c6021p2, i11, c21694h);
                        }
                        interfaceC1439n.invoke(c6021p2, 0);
                        c6021p2.m6553p(true);
                    }
                }
                break;
        }
        return C17296C.f55119a;
    }
}
