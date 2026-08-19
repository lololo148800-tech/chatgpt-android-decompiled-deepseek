package gn;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: gn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C14200e implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44612Y;

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f44612Y) {
            case 0:
                DescriptorRendererOptions descriptorRendererOptions = (DescriptorRendererOptions) obj;
                descriptorRendererOptions.setWithDefinedIn(false);
                descriptorRendererOptions.setVerbose(true);
                descriptorRendererOptions.setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
                descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL);
                return C17296C.f55119a;
            case 1:
                return (CallableMemberDescriptor) obj;
            default:
                return (CallableMemberDescriptor) obj;
        }
    }
}
