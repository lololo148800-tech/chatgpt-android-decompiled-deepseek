package p1151ze;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p040Bd.AbstractC1098i;
import p1081wc.C20886e;
import p1081wc.InterfaceC20904w;
import p1155zi.C21984a1;
import p479Td.C7351f0;
import p787he.C14459O;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: ze.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C21878b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20904w f69367a;

    /* JADX INFO: renamed from: b */
    public final C14459O f69368b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f69369c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public String f69370d;

    public C21878b(InterfaceC20904w interfaceC20904w, C14459O c14459o) {
        this.f69367a = interfaceC20904w;
        this.f69368b = c14459o;
    }

    /* JADX INFO: renamed from: a */
    public static final void m22318a(C21878b c21878b, C7351f0 c7351f0) {
        boolean z6;
        boolean z10;
        c21878b.f69370d = null;
        LinkedHashSet linkedHashSet = c21878b.f69369c;
        String str = c7351f0.f23286a;
        linkedHashSet.add(new C21984a1(str));
        C20886e c20886e = C20886e.f66518f;
        C17309l c17309l = new C17309l("message_id", str);
        List list = c7351f0.f23268D;
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC1098i) it.next()).mo1968a());
        }
        C17309l c17309l2 = new C17309l("visualizations", arrayList);
        boolean z11 = list2 instanceof Collection;
        if (!z11 || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z6 = false;
                    break;
                } else if (AbstractC16544l.m18089b(((AbstractC1098i) it2.next()).mo1968a(), "chart")) {
                    z6 = true;
                    break;
                }
            }
        } else {
            z6 = false;
            break;
        }
        C17309l c17309l3 = new C17309l("has_chart", Boolean.valueOf(z6));
        if (z11 && list2.isEmpty()) {
            z10 = false;
        } else {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                if (AbstractC16544l.m18089b(((AbstractC1098i) it3.next()).mo1968a(), "table")) {
                    z10 = true;
                }
            }
            z10 = false;
        }
        c21878b.f69367a.mo21447a(c20886e, AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, new C17309l("has_table", Boolean.valueOf(z10)), new C17309l("count", Integer.valueOf(list.size()))));
    }
}
