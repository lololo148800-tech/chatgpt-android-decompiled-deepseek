package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import mm.C17296C;

/* JADX INFO: renamed from: Lm.J */
/* JADX INFO: loaded from: classes2.dex */
public final class C5146J extends C5170d {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object visitConstructorDescriptor(ConstructorDescriptor descriptor, Object obj) {
        C17296C data = (C17296C) obj;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(data, "data");
        throw new IllegalStateException("No constructors should appear here: " + descriptor);
    }
}
