package p167Gb;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: Gb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3031b {

    /* JADX INFO: renamed from: a */
    public final String f9123a;

    /* JADX INFO: renamed from: b */
    public final C3032c f9124b;

    public C3031b(Set set, C3032c c3032c) {
        this.f9123a = m3907b(set);
        this.f9124b = c3032c;
    }

    /* JADX INFO: renamed from: b */
    public static String m3907b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C3030a c3030a = (C3030a) it.next();
            sb2.append(c3030a.f9121a);
            sb2.append('/');
            sb2.append(c3030a.f9122b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public final String m3908a() {
        Set setUnmodifiableSet;
        C3032c c3032c = this.f9124b;
        synchronized (((HashSet) c3032c.f9127Z)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) c3032c.f9127Z);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f9123a;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + m3907b(c3032c.m3920j());
    }
}
