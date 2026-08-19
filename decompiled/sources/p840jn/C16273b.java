package p840jn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: jn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C16273b implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C16273b f50402Y = new C16273b();

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        DeclarationDescriptor it = (DeclarationDescriptor) obj;
        int i10 = DescriptorUtilsKt.f52893a;
        AbstractC16544l.m18094g(it, "it");
        return it.getContainingDeclaration();
    }
}
