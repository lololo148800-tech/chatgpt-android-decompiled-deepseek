package p025An;

import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: An.X */
/* JADX INFO: loaded from: classes2.dex */
public final class C0597X implements InterfaceC0617i0 {

    /* JADX INFO: renamed from: Y */
    public final boolean f1829Y;

    public C0597X(boolean z6) {
        this.f1829Y = z6;
    }

    @Override // p025An.InterfaceC0617i0
    /* JADX INFO: renamed from: a */
    public final boolean mo1220a() {
        return this.f1829Y;
    }

    @Override // p025An.InterfaceC0617i0
    /* JADX INFO: renamed from: c */
    public final C0645w0 mo1221c() {
        return null;
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("Empty{"), this.f1829Y ? "Active" : "New", '}');
    }
}
