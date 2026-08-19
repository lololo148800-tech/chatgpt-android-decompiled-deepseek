package p910nn;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17665J;

/* JADX INFO: renamed from: nn.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C17705m implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56521Y;

    /* JADX INFO: renamed from: Z */
    public final C17706n f56522Z;

    /* JADX INFO: renamed from: o0 */
    public final DeserializedMemberScope f56523o0;

    public /* synthetic */ C17705m(C17706n c17706n, DeserializedMemberScope deserializedMemberScope, int i10) {
        this.f56521Y = i10;
        this.f56522Z = c17706n;
        this.f56523o0 = deserializedMemberScope;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f56521Y) {
            case 0:
                return AbstractC17665J.m19266f(this.f56522Z.f56525a.keySet(), this.f56523o0.mo18387g());
            default:
                return AbstractC17665J.m19266f(this.f56522Z.f56526b.keySet(), this.f56523o0.mo18388h());
        }
    }
}
