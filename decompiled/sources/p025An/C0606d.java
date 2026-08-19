package p025An;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: An.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C0606d implements InterfaceC0618j {

    /* JADX INFO: renamed from: Y */
    public final C0604c[] f1845Y;

    public C0606d(C0604c[] c0604cArr) {
        this.f1845Y = c0604cArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m1236a() {
        for (C0604c c0604c : this.f1845Y) {
            InterfaceC0595V interfaceC0595V = c0604c.f1840r0;
            if (interfaceC0595V == null) {
                AbstractC16544l.m18103p("handle");
                throw null;
            }
            interfaceC0595V.dispose();
        }
    }

    @Override // p025An.InterfaceC0618j
    /* JADX INFO: renamed from: b */
    public final void mo1237b(Throwable th2) {
        m1236a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f1845Y + ']';
    }
}
