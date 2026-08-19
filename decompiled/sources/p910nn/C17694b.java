package p910nn;

import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: nn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C17694b implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56487Y;

    /* JADX INFO: renamed from: Z */
    public final C17695c f56488Z;

    public /* synthetic */ C17694b(C17695c c17695c, int i10) {
        this.f56487Y = i10;
        this.f56488Z = c17695c;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f56487Y) {
            case 0:
                return this.f56488Z.m18382b(DescriptorKindFilter.ALL, MemberScope.Companion.getALL_NAME_FILTER(), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
            default:
                C17695c c17695c = this.f56488Z;
                return c17695c.f56489f.refineSupertypes(c17695c.f56492i);
        }
    }
}
