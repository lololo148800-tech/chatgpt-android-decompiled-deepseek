package p345Nm;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Nm.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C5859e implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19162Y;

    /* JADX INFO: renamed from: Z */
    public final PrimitiveType f19163Z;

    public /* synthetic */ C5859e(PrimitiveType primitiveType, int i10) {
        this.f19162Y = i10;
        this.f19163Z = primitiveType;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        PrimitiveType primitiveType = this.f19163Z;
        switch (this.f19162Y) {
            case 0:
                PrimitiveType.Companion companion = PrimitiveType.Companion;
                return StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.f51301Y);
            default:
                PrimitiveType.Companion companion2 = PrimitiveType.Companion;
                return StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.f51302Z);
        }
    }
}
