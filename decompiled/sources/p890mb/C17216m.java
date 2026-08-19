package p890mb;

import p1104xb.InterfaceC21170a;

/* JADX INFO: renamed from: mb.m */
/* JADX INFO: loaded from: classes.dex */
public final class C17216m implements InterfaceC21170a {

    /* JADX INFO: renamed from: c */
    public static final Object f54949c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile Object f54950a = f54949c;

    /* JADX INFO: renamed from: b */
    public volatile InterfaceC21170a f54951b;

    public C17216m(InterfaceC21170a interfaceC21170a) {
        this.f54951b = interfaceC21170a;
    }

    @Override // p1104xb.InterfaceC21170a
    public final Object get() {
        Object obj = this.f54950a;
        Object obj2 = f54949c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f54950a;
                    if (obj == obj2) {
                        obj = this.f54951b.get();
                        this.f54950a = obj;
                        this.f54951b = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj;
    }
}
