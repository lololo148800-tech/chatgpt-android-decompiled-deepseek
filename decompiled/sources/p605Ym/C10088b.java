package p605Ym;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Ym.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10088b implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29868Y;

    /* JADX INFO: renamed from: Z */
    public final LazyJavaClassDescriptor f29869Z;

    public /* synthetic */ C10088b(LazyJavaClassDescriptor lazyJavaClassDescriptor, int i10) {
        this.f29868Y = i10;
        this.f29869Z = lazyJavaClassDescriptor;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f29869Z;
        switch (this.f29868Y) {
            case 0:
                LazyJavaClassDescriptor.Companion companion = LazyJavaClassDescriptor.Companion;
                ClassId classId = DescriptorUtilsKt.getClassId(lazyJavaClassDescriptor);
                if (classId != null) {
                    return lazyJavaClassDescriptor.f51902t0.getComponents().getJavaModuleResolver().getAnnotationsForModuleOwnerOfClass(classId);
                }
                return null;
            case 1:
                List<JavaTypeParameter> typeParameters = lazyJavaClassDescriptor.f51903u0.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(typeParameters, 10));
                for (JavaTypeParameter javaTypeParameter : typeParameters) {
                    TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = lazyJavaClassDescriptor.f51905w0.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
                    if (typeParameterDescriptorResolveTypeParameter == null) {
                        throw new AssertionError("Parameter " + javaTypeParameter + " surely belongs to class " + lazyJavaClassDescriptor.f51903u0 + ", so it must be resolved");
                    }
                    arrayList.add(typeParameterDescriptorResolveTypeParameter);
                }
                return arrayList;
            default:
                return TypeParameterUtilsKt.computeConstructorTypeParameters(lazyJavaClassDescriptor);
        }
    }
}
