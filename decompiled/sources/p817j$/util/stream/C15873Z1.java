package p817j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.Z1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15873Z1 extends AbstractC15879a2 {
    @Override // p817j$.util.stream.AbstractC15853V1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f49224b);
    }

    @Override // p817j$.util.stream.InterfaceC15848U1
    /* JADX INFO: renamed from: g */
    public final void mo17361g(InterfaceC15848U1 interfaceC15848U1) {
        this.f49224b += ((AbstractC15879a2) interfaceC15848U1).f49224b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f49224b++;
    }
}
