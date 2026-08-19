package p795i;

import mm.C17296C;
import p349O0.InterfaceC5985X;
import p841k.AbstractC16283c;
import p841k.C16288h;
import p859l.AbstractC16651b;

/* JADX INFO: renamed from: i.g */
/* JADX INFO: loaded from: classes.dex */
public final class C14893g extends AbstractC16283c {

    /* JADX INFO: renamed from: a */
    public final C14887a f46382a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5985X f46383b;

    public C14893g(C14887a c14887a, InterfaceC5985X interfaceC5985X) {
        this.f46382a = c14887a;
        this.f46383b = interfaceC5985X;
    }

    @Override // p841k.AbstractC16283c
    /* JADX INFO: renamed from: a */
    public final AbstractC16651b mo10187a() {
        return (AbstractC16651b) this.f46383b.getValue();
    }

    @Override // p841k.AbstractC16283c
    /* JADX INFO: renamed from: b */
    public final void mo10188b(Object obj) {
        C17296C c17296c;
        C16288h c16288h = this.f46382a.f46373a;
        if (c16288h != null) {
            c16288h.mo10188b(obj);
            c17296c = C17296C.f55119a;
        } else {
            c17296c = null;
        }
        if (c17296c == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
