package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies;
import mm.C17296C;
import p024Am.C0560a;

/* JADX INFO: renamed from: Lm.d */
/* JADX INFO: loaded from: classes2.dex */
public class C5170d extends DeclarationDescriptorVisitorEmptyBodies {

    /* JADX INFO: renamed from: Y */
    public final AbstractC5148K f16846Y;

    public C5170d(AbstractC5148K container) {
        AbstractC16544l.m18094g(container, "container");
        this.f16846Y = container;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object visitFunctionDescriptor(FunctionDescriptor descriptor, Object obj) {
        C17296C data = (C17296C) obj;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(data, "data");
        return new C5152N(this.f16846Y, descriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object visitPropertyDescriptor(PropertyDescriptor descriptor, Object obj) {
        C17296C data = (C17296C) obj;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(data, "data");
        int i10 = (descriptor.getDispatchReceiverParameter() != null ? 1 : 0) + (descriptor.getExtensionReceiverParameter() != null ? 1 : 0);
        boolean zIsVar = descriptor.isVar();
        AbstractC5148K abstractC5148K = this.f16846Y;
        if (zIsVar) {
            if (i10 == 0) {
                return new C5154P(abstractC5148K, descriptor);
            }
            if (i10 == 1) {
                return new C5156S(abstractC5148K, descriptor);
            }
            if (i10 == 2) {
                return new C5158U(abstractC5148K, descriptor);
            }
        } else {
            if (i10 == 0) {
                return new C5177g0(abstractC5148K, descriptor);
            }
            if (i10 == 1) {
                return new C5183j0(abstractC5148K, descriptor);
            }
            if (i10 == 2) {
                return new C5189m0(abstractC5148K, descriptor);
            }
        }
        throw new C0560a("Unsupported property: " + descriptor);
    }
}
