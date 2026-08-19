package p025An;

import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: An.O */
/* JADX INFO: loaded from: classes2.dex */
public final class C0589O extends Exception {

    /* JADX INFO: renamed from: Y */
    public final Throwable f1820Y;

    public C0589O(Throwable th2, AbstractC0563B abstractC0563B, InterfaceC18776i interfaceC18776i) {
        super("Coroutine dispatcher " + abstractC0563B + " threw an exception, context = " + interfaceC18776i, th2);
        this.f1820Y = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f1820Y;
    }
}
