package p630Zm;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Zm.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C10425a implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final JavaTypeResolver f30892Y;

    /* JADX INFO: renamed from: Z */
    public final TypeParameterDescriptor f30893Z;

    /* JADX INFO: renamed from: o0 */
    public final JavaTypeAttributes f30894o0;

    /* JADX INFO: renamed from: p0 */
    public final TypeConstructor f30895p0;

    /* JADX INFO: renamed from: q0 */
    public final JavaClassifierType f30896q0;

    public C10425a(JavaTypeResolver javaTypeResolver, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor, JavaClassifierType javaClassifierType) {
        this.f30892Y = javaTypeResolver;
        this.f30893Z = typeParameterDescriptor;
        this.f30894o0 = javaTypeAttributes;
        this.f30895p0 = typeConstructor;
        this.f30896q0 = javaClassifierType;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.f30892Y.f51971d;
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = this.f30895p0.mo22589getDeclarationDescriptor();
        return typeParameterUpperBoundEraser.getErasedUpperBound(this.f30893Z, this.f30894o0.withDefaultType(classifierDescriptorMo22589getDeclarationDescriptor != null ? classifierDescriptorMo22589getDeclarationDescriptor.getDefaultType() : null).markIsRaw(this.f30896q0.isRaw()));
    }
}
