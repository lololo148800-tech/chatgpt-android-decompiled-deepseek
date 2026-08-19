package p969qj;

import ac.C10539a;
import android.graphics.Rect;
import cc.C11696a;
import cc.InterfaceC11698c;
import ec.C13360b;
import ec.C13362d;
import ec.C13363e;
import ec.InterfaceC13364f;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p468T2.C7224p;
import p523V9.AbstractC7854B5;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p704dc.C13060a;
import p746fa.C13606o;
import p748fc.C13609a;
import p817j$.util.DesugarCollections;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p949pj.C18439L;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: qj.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C18756n implements InterfaceC18753k {

    /* JADX INFO: renamed from: a */
    public final C17314q f59642a = AbstractC9227W.m9800c(C18751i.f59625o0);

    /* JADX INFO: renamed from: b */
    public final C17314q f59643b = AbstractC9227W.m9800c(C18751i.f59626p0);

    @Override // p969qj.InterfaceC18753k
    /* JADX INFO: renamed from: a */
    public final Object mo20046a(C7224p c7224p, Rect rect, AbstractC19687c abstractC19687c) throws InterruptedException {
        AbstractList abstractList;
        C10539a c10539aM7619a = c7224p.m7619a();
        C13606o c13606oM12770k = ((C13060a) ((InterfaceC11698c) this.f59642a.getValue())).m12770k(c10539aM7619a);
        AbstractC16544l.m18093f(c13606oM12770k, "process(...)");
        C13606o c13606oM12770k2 = ((C13609a) ((InterfaceC13364f) this.f59643b.getValue())).m12770k(c10539aM7619a);
        AbstractC16544l.m18093f(c13606oM12770k2, "process(...)");
        try {
            AbstractC7854B5.m8113a(AbstractC7854B5.m8119g(c13606oM12770k, c13606oM12770k2));
            Object objM15130i = c13606oM12770k.m15130i();
            AbstractC16544l.m18093f(objM15130i, "getResult(...)");
            C11696a c11696a = (C11696a) AbstractC17680n.m19344T(0, (List) objM15130i);
            if (c11696a == null) {
                return C18744b.f59618a;
            }
            List listUnmodifiableList = DesugarCollections.unmodifiableList(((C13363e) c13606oM12770k2.m15130i()).f42403a);
            AbstractC16544l.m18093f(listUnmodifiableList, "getTextBlocks(...)");
            List<C13362d> list = listUnmodifiableList;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            for (C13362d c13362d : list) {
                synchronized (c13362d) {
                    abstractList = c13362d.f42402c;
                }
                AbstractC16544l.m18093f(abstractList, "getLines(...)");
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(abstractList, 10));
                Iterator it = abstractList.iterator();
                while (it.hasNext()) {
                    String str = ((C13360b) it.next()).f42400a;
                    if (str == null) {
                        str = "";
                    }
                    arrayList2.add(str);
                }
                arrayList.add(arrayList2);
            }
            if (AbstractC17682p.m19390s(arrayList).size() < 5) {
                return C18744b.f59618a;
            }
            Rect rect2 = new Rect(0, 0, c10539aM7619a.f31257d, c10539aM7619a.f31258e);
            rect2.inset(1, 1);
            if (!rect2.contains(c11696a.f35480a)) {
                return C18744b.f59618a;
            }
            String str2 = ((C13363e) c13606oM12770k2.m15130i()).f42404b;
            AbstractC16544l.m18093f(str2, "getText(...)");
            return new C18746d(new C18439L(str2));
        } catch (ExecutionException unused) {
            return AbstractC9233X.m9806b(new C18750h());
        }
    }
}
