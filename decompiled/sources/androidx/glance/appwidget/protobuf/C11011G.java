package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.G */
/* JADX INFO: loaded from: classes.dex */
public final class C11011G implements InterfaceC11016L {

    /* JADX INFO: renamed from: a */
    public InterfaceC11016L[] f33238a;

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11016L
    /* JADX INFO: renamed from: a */
    public final C11025V mo11851a(Class cls) {
        for (InterfaceC11016L interfaceC11016L : this.f33238a) {
            if (interfaceC11016L.mo11852b(cls)) {
                return interfaceC11016L.mo11851a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11016L
    /* JADX INFO: renamed from: b */
    public final boolean mo11852b(Class cls) {
        for (InterfaceC11016L interfaceC11016L : this.f33238a) {
            if (interfaceC11016L.mo11852b(cls)) {
                return true;
            }
        }
        return false;
    }
}
