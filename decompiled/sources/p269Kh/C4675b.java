package p269Kh;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1155zi.C22001e2;
import p1155zi.C22047q0;
import p1155zi.EnumC22004f1;

/* JADX INFO: renamed from: Kh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4675b {
    /* JADX WARN: Code duplicated, block: B:25:0x005d A[EDGE_INSN: B:25:0x005d->B:26:0x005e BREAK  A[LOOP:0: B:10:0x001d->B:48:0x001d]] */
    /* JADX WARN: Code duplicated, block: B:38:0x008e A[EDGE_INSN: B:38:0x008e->B:39:0x008f BREAK  A[LOOP:2: B:33:0x0074->B:57:?]] */
    /* JADX INFO: renamed from: a */
    public static boolean m5393a(C4679f c4679f, List list, List list2) {
        boolean z6;
        boolean z10;
        AbstractC16544l.m18094g(c4679f, "<this>");
        if (list == null) {
            z6 = false;
            break;
        }
        List list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    z6 = false;
                    break;
                }
                C22001e2 c22001e2 = (C22001e2) it.next();
                List list4 = c4679f.f15229b;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        if (AbstractC16544l.m18089b(((C4688o) it2.next()).f15253b, c22001e2.f69636a)) {
                            if (c22001e2.f69637b == EnumC22004f1.CONVERSATION) {
                                z6 = true;
                                break loop0;
                            }
                        }
                    }
                }
            }
        } else {
            z6 = false;
            break;
        }
        if (list2 == null) {
            z10 = false;
            break;
        }
        List list5 = list2;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it3 = list5.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z10 = false;
                    break;
                }
                if (AbstractC16544l.m18089b(((C22047q0) it3.next()).f69735a, c4679f.f15230c.f15253b)) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        return z6 || z10;
    }

    public final KSerializer serializer() {
        return C4674a.f15222a;
    }
}
