package p298Lm;

import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p049Bm.InterfaceC1439n;
import p1113xn.C21319m;

/* JADX INFO: renamed from: Lm.F */
/* JADX INFO: loaded from: classes2.dex */
public final class C5138F implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C5138F f16775Y = new C5138F();

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21319m c21319m = AbstractC5148K.f16787Y;
        Integer numCompare = DescriptorVisibilities.compare((DescriptorVisibility) obj, (DescriptorVisibility) obj2);
        return Integer.valueOf(numCompare != null ? numCompare.intValue() : 0);
    }
}
