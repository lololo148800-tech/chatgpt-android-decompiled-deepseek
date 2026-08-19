package p951pp;

import java.util.concurrent.LinkedBlockingQueue;
import np.InterfaceC17709a;
import np.InterfaceC17710b;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: pp.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C18537g implements InterfaceC17709a {

    /* JADX INFO: renamed from: a */
    public volatile boolean f59061a = false;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f59062b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedBlockingQueue f59063c = new LinkedBlockingQueue();

    @Override // np.InterfaceC17709a
    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC17710b mo19435a(String str) {
        C18536f c18536f;
        c18536f = (C18536f) this.f59062b.get(str);
        if (c18536f == null) {
            c18536f = new C18536f(str, this.f59063c, this.f59061a);
            this.f59062b.put(str, c18536f);
        }
        return c18536f;
    }
}
