package p890mb;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p1104xb.InterfaceC21170a;
import p817j$.util.DesugarCollections;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: mb.n */
/* JADX INFO: loaded from: classes.dex */
public final class C17217n implements InterfaceC21170a {

    /* JADX INFO: renamed from: a */
    public volatile Set f54952a;

    /* JADX INFO: renamed from: b */
    public volatile Set f54953b;

    /* JADX INFO: renamed from: a */
    public final synchronized void m18952a() {
        try {
            Iterator it = this.f54952a.iterator();
            while (it.hasNext()) {
                this.f54953b.add(((InterfaceC21170a) it.next()).get());
            }
            this.f54952a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p1104xb.InterfaceC21170a
    public final Object get() {
        if (this.f54953b == null) {
            synchronized (this) {
                try {
                    if (this.f54953b == null) {
                        this.f54953b = Collections.newSetFromMap(new ConcurrentHashMap());
                        m18952a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f54953b);
    }
}
