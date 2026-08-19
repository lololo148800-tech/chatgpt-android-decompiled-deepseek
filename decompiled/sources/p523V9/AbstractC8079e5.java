package p523V9;

import androidx.compose.p650ui.graphics.AbstractC10864a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p1062vd.C20541V;
import p1062vd.C20571u;
import p1062vd.EnumC20540U;
import p1062vd.EnumC20570t;
import p1113xn.AbstractC21322p;
import p1155zi.C22011h0;
import p257K3.C4535c;
import p381Pe.C6394e;
import p381Pe.C6397h;
import p403Qd.C6636i;
import p479Td.AbstractC7343b0;
import p479Td.C7320F;
import p479Td.C7323I;
import p479Td.C7326L;
import p479Td.C7351f0;
import p479Td.EnumC7359j0;
import p571X9.AbstractC9280e4;
import p571X9.AbstractC9393x3;
import p635a1.InterfaceC10459q;
import p774h1.C14341T;
import p774h1.C14365u;
import p774h1.InterfaceC14339Q;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: V9.e5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8079e5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25395a;

    /* JADX INFO: renamed from: a */
    public static final InterfaceC10459q m8501a(InterfaceC10459q interfaceC10459q, InterfaceC14339Q interfaceC14339Q) {
        return AbstractC10864a.m11306b(interfaceC10459q, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, interfaceC14339Q, true, 0, 124927);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10459q m8502b(InterfaceC10459q interfaceC10459q) {
        return AbstractC10864a.m11306b(interfaceC10459q, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 126975);
    }

    /* JADX INFO: renamed from: c */
    public static final C17425e m8503c() {
        C17425e c17425e = f25395a;
        if (c17425e != null) {
            return c17425e;
        }
        C17424d c17424d = new C17424d("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC17418F.f55636a;
        C14341T c14341t = new C14341T(C14365u.f45052b);
        C4535c c4535c = new C4535c(3);
        c4535c.m5290p(19.0f, 6.41f);
        c4535c.m5288n(17.59f, 5.0f);
        c4535c.m5288n(12.0f, 10.59f);
        c4535c.m5288n(6.41f, 5.0f);
        c4535c.m5288n(5.0f, 6.41f);
        c4535c.m5288n(10.59f, 12.0f);
        c4535c.m5288n(5.0f, 17.59f);
        c4535c.m5288n(6.41f, 19.0f);
        c4535c.m5288n(12.0f, 13.41f);
        c4535c.m5288n(17.59f, 19.0f);
        c4535c.m5288n(19.0f, 17.59f);
        c4535c.m5288n(13.41f, 12.0f);
        c4535c.m5282h();
        C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
        C17425e c17425eM19122b = c17424d.m19122b();
        f25395a = c17425eM19122b;
        return c17425eM19122b;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:66:0x014e  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x015d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final ArrayList m8504d(List toHistoryItemList, String query, String str, Set unreadConversationIds, Set activelyStreamingConversationIds) {
        Object objPrevious;
        C7351f0 c7351f0;
        boolean z6;
        String strM9853e;
        EnumC20540U enumC20540U;
        C20541V c20541v;
        String str2;
        Object objPrevious2;
        boolean z10 = true;
        char c9 = 0;
        AbstractC16544l.m18094g(toHistoryItemList, "$this$toHistoryItemList");
        AbstractC16544l.m18094g(query, "query");
        AbstractC16544l.m18094g(unreadConversationIds, "unreadConversationIds");
        AbstractC16544l.m18094g(activelyStreamingConversationIds, "activelyStreamingConversationIds");
        ArrayList arrayList = new ArrayList();
        Iterator it = toHistoryItemList.iterator();
        while (it.hasNext()) {
            C6636i c6636i = (C6636i) it.next();
            boolean zM18089b = str == null ? c9 : AbstractC16544l.m18089b(c6636i.f21379a, str);
            String str3 = c6636i.f21379a;
            boolean zContains = unreadConversationIds.contains(new C22011h0(str3));
            boolean zContains2 = activelyStreamingConversationIds.contains(new C22011h0(str3));
            boolean zM21681O = AbstractC21322p.m21681O(query);
            C6394e c6394e = c6636i.f21399u;
            if (zM21681O || ((str2 = c6636i.f21384f) != null && AbstractC21322p.m21667A(str2, query, z10) == z10)) {
                ArrayList arrayListM7028c = c6394e.m7028c(c6394e.f20813a);
                ListIterator listIterator = arrayListM7028c.listIterator(arrayListM7028c.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    C7351f0 c7351f1 = (C7351f0) ((C6397h) objPrevious).f20822d;
                    if (!c7351f1.f23303r) {
                        AbstractC7343b0 abstractC7343b0 = c7351f1.f23291f;
                        AbstractC16544l.m18094g(abstractC7343b0, "<this>");
                        if (abstractC7343b0 instanceof C7326L ? true : abstractC7343b0 instanceof C7320F ? true : abstractC7343b0 instanceof C7323I) {
                            break;
                        }
                    }
                }
                C6397h c6397h = (C6397h) objPrevious;
                if (c6397h != null) {
                    c7351f0 = (C7351f0) c6397h.f20822d;
                } else {
                    c7351f0 = null;
                }
            } else {
                ArrayList arrayListM7028c2 = c6394e.m7028c(c6636i.m7164c().f20819a);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayListM7028c2) {
                    C6397h c6397h2 = (C6397h) obj;
                    EnumC7359j0[] enumC7359j0Arr = new EnumC7359j0[2];
                    enumC7359j0Arr[c9] = EnumC7359j0.f23343Z;
                    enumC7359j0Arr[1] = EnumC7359j0.f23344o0;
                    if (AbstractC17681o.m19382k(enumC7359j0Arr).contains(((C7351f0) c6397h2.f20822d).f23290e) && !((C7351f0) c6397h2.f20822d).f23303r) {
                        arrayList2.add(obj);
                    }
                    c9 = 0;
                }
                ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious2 = null;
                        break;
                    }
                    objPrevious2 = listIterator2.previous();
                } while (!AbstractC21322p.m21667A(AbstractC9280e4.m9853e(((C7351f0) ((C6397h) objPrevious2).f20822d).f23291f), query, true));
                C6397h c6397h3 = (C6397h) objPrevious2;
                if (c6397h3 != null) {
                    c7351f0 = (C7351f0) c6397h3.f20822d;
                } else {
                    c7351f0 = null;
                }
            }
            if (c7351f0 == null) {
                c20541v = null;
                z6 = true;
            } else {
                if (!AbstractC21322p.m21681O(query) || (strM9853e = c6636i.f21394p) == null) {
                    z6 = true;
                } else {
                    z6 = true;
                    if (!(!AbstractC21322p.m21681O(strM9853e))) {
                    }
                    if (strM9853e == null) {
                        strM9853e = "";
                    }
                    String str4 = strM9853e;
                    if (!zContains && zM18089b == 0) {
                        enumC20540U = EnumC20540U.f65166Z;
                    } else if (zContains2) {
                        enumC20540U = EnumC20540U.f65167o0;
                    } else {
                        enumC20540U = EnumC20540U.f65165Y;
                    }
                    c20541v = new C20541V(c6636i, str4, c7351f0.f23286a, zM18089b, enumC20540U);
                }
                strM9853e = AbstractC9280e4.m9853e(c7351f0.f23291f);
                if (strM9853e == null) {
                    strM9853e = "";
                }
                String str5 = strM9853e;
                if (!zContains) {
                    if (zContains2) {
                        enumC20540U = EnumC20540U.f65167o0;
                    } else {
                        enumC20540U = EnumC20540U.f65165Y;
                    }
                } else if (zContains2) {
                    enumC20540U = EnumC20540U.f65167o0;
                } else {
                    enumC20540U = EnumC20540U.f65165Y;
                }
                c20541v = new C20541V(c6636i, str5, c7351f0.f23286a, zM18089b, enumC20540U);
            }
            if (c20541v != null) {
                arrayList.add(c20541v);
            }
            z10 = z6;
            c9 = 0;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static final List m8505e(List list, EnumC20570t enumC20570t) {
        AbstractC16544l.m18094g(list, "<this>");
        boolean zIsEmpty = list.isEmpty();
        if (!zIsEmpty) {
            return AbstractC17680n.m19361k0(list, AbstractC9393x3.m9974d(new C20571u(enumC20570t)));
        }
        if (zIsEmpty) {
            return list;
        }
        throw new C0644w();
    }
}
