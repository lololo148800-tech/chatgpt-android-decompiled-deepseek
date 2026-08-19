package p571X9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p784hb.C14438g;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p917o6.C17861n;
import p917o6.C17862o;
import p917o6.C17864q;
import p917o6.C17866s;

/* JADX INFO: renamed from: X9.G3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9136G3 {
    /* JADX INFO: renamed from: a */
    public static final C17862o m9675a(AbstractC9154J3 abstractC9154J3) {
        AbstractC16544l.m18094g(abstractC9154J3, "<this>");
        return new C17862o(abstractC9154J3);
    }

    /* JADX INFO: renamed from: b */
    public static final C17864q m9676b(AbstractC9154J3 abstractC9154J3) {
        AbstractC16544l.m18094g(abstractC9154J3, "<this>");
        return new C17864q(abstractC9154J3);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m9677c(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: d */
    public static final Object m9678d(Object obj, C14438g c14438g) {
        Object objM9678d;
        C17309l c17309l;
        if (obj == null) {
            return null;
        }
        if (obj instanceof C17866s) {
            throw new IllegalStateException("must be checked by the caller");
        }
        boolean z6 = obj instanceof Map;
        Map map = (Map) c14438g.f45414Y;
        if (z6) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object value = entry.getValue();
                if (value instanceof C17866s) {
                    C17866s c17866s = (C17866s) value;
                    c17309l = map.containsKey(c17866s.f56958a) ? new C17309l(entry.getKey(), map.get(c17866s.f56958a)) : null;
                } else {
                    c17309l = new C17309l(entry.getKey(), m9678d(value, c14438g));
                }
                if (c17309l != null) {
                    arrayList.add(c17309l);
                }
            }
            return AbstractC17659D.m19253o(AbstractC17680n.m19370t0(AbstractC17680n.m19322C0(arrayList), new C17861n()));
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
        for (Object obj2 : iterable) {
            if (obj2 instanceof C17866s) {
                C17866s c17866s2 = (C17866s) obj2;
                objM9678d = map.containsKey(c17866s2.f56958a) ? map.get(c17866s2.f56958a) : null;
            } else {
                objM9678d = m9678d(obj2, c14438g);
            }
            arrayList2.add(objM9678d);
        }
        return arrayList2;
    }
}
