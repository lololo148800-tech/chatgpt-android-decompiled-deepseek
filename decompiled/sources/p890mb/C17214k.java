package p890mb;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p1037ub.InterfaceC20181a;
import p1037ub.InterfaceC20182b;
import p117Eb.C2385o;
import p817j$.util.concurrent.ConcurrentHashMap;
import p832jb.AbstractC16182b;

/* JADX INFO: renamed from: mb.k */
/* JADX INFO: loaded from: classes.dex */
public final class C17214k implements InterfaceC20182b, InterfaceC20181a {

    /* JADX INFO: renamed from: a */
    public final HashMap f54946a = new HashMap();

    /* JADX INFO: renamed from: b */
    public ArrayDeque f54947b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final Executor f54948c;

    public C17214k(Executor executor) {
        this.f54948c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m18951a(C2385o c2385o) {
        Executor executor = this.f54948c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f54946a.containsKey(AbstractC16182b.class)) {
                    this.f54946a.put(AbstractC16182b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f54946a.get(AbstractC16182b.class)).put(c2385o, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
