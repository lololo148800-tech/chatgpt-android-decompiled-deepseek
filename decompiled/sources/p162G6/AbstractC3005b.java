package p162G6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import mo.C17348o;
import p059C5.C1601s;
import p1113xn.AbstractC21322p;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9276e0;
import p942p6.C18299c;

/* JADX INFO: renamed from: G6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3005b {

    /* JADX INFO: renamed from: a */
    public static final C17314q f9031a = AbstractC9227W.m9800c(new C1601s(4));

    /* JADX INFO: renamed from: a */
    public static final C17348o m3830a(List list) {
        AbstractC16544l.m18094g(list, "<this>");
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18299c c18299c = (C18299c) it.next();
            String name = c18299c.f58411a;
            AbstractC16544l.m18094g(name, "name");
            String value = c18299c.f58412b;
            AbstractC16544l.m18094g(value, "value");
            AbstractC9276e0.m9845b(name);
            AbstractC9276e0.m9846c(value, name);
            arrayList.add(name);
            arrayList.add(AbstractC21322p.m21711s0(value).toString());
        }
        return new C17348o((String[]) arrayList.toArray(new String[0]));
    }
}
