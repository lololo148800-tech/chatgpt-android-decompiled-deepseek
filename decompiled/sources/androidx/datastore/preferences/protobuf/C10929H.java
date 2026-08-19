package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.H */
/* JADX INFO: loaded from: classes.dex */
public final class C10929H implements InterfaceC10936O {

    /* JADX INFO: renamed from: a */
    public InterfaceC10936O[] f32969a;

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10936O
    /* JADX INFO: renamed from: a */
    public final C10946Z mo11438a(Class cls) {
        for (InterfaceC10936O interfaceC10936O : this.f32969a) {
            if (interfaceC10936O.mo11439b(cls)) {
                return interfaceC10936O.mo11438a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10936O
    /* JADX INFO: renamed from: b */
    public final boolean mo11439b(Class cls) {
        for (InterfaceC10936O interfaceC10936O : this.f32969a) {
            if (interfaceC10936O.mo11439b(cls)) {
                return true;
            }
        }
        return false;
    }
}
