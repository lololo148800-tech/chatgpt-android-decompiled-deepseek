package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12208y0 implements InterfaceC12085E0 {

    /* JADX INFO: renamed from: a */
    public InterfaceC12085E0[] f37121a;

    @Override // com.google.protobuf.InterfaceC12085E0
    /* JADX INFO: renamed from: a */
    public final C12132Y0 mo13735a(Class cls) {
        for (InterfaceC12085E0 interfaceC12085E0 : this.f37121a) {
            if (interfaceC12085E0.mo13736b(cls)) {
                return interfaceC12085E0.mo13735a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.InterfaceC12085E0
    /* JADX INFO: renamed from: b */
    public final boolean mo13736b(Class cls) {
        for (InterfaceC12085E0 interfaceC12085E0 : this.f37121a) {
            if (interfaceC12085E0.mo13736b(cls)) {
                return true;
            }
        }
        return false;
    }
}
