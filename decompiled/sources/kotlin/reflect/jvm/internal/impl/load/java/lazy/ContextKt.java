package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import mm.EnumC17307j;
import p298Lm.C5150L;
import p571X9.AbstractC9227W;

/* JADX INFO: loaded from: classes2.dex */
public final class ContextKt {
    public static final LazyJavaResolverContext child(LazyJavaResolverContext lazyJavaResolverContext, TypeParameterResolver typeParameterResolver) {
        AbstractC16544l.m18094g(lazyJavaResolverContext, "<this>");
        AbstractC16544l.m18094g(typeParameterResolver, "typeParameterResolver");
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), typeParameterResolver, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static final LazyJavaResolverContext childForClassOrPackage(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor containingDeclaration, JavaTypeParameterListOwner javaTypeParameterListOwner, int i10) {
        AbstractC16544l.m18094g(lazyJavaResolverContext, "<this>");
        AbstractC16544l.m18094g(containingDeclaration, "containingDeclaration");
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), javaTypeParameterListOwner != null ? new LazyJavaTypeParameterResolver(lazyJavaResolverContext, containingDeclaration, javaTypeParameterListOwner, i10) : lazyJavaResolverContext.getTypeParameterResolver(), AbstractC9227W.m9799b(EnumC17307j.f55134Z, new C5150L(lazyJavaResolverContext, 11, containingDeclaration)));
    }

    public static /* synthetic */ LazyJavaResolverContext childForClassOrPackage$default(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            javaTypeParameterListOwner = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return childForClassOrPackage(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i10);
    }

    public static final LazyJavaResolverContext childForMethod(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor containingDeclaration, JavaTypeParameterListOwner typeParameterOwner, int i10) {
        AbstractC16544l.m18094g(lazyJavaResolverContext, "<this>");
        AbstractC16544l.m18094g(containingDeclaration, "containingDeclaration");
        AbstractC16544l.m18094g(typeParameterOwner, "typeParameterOwner");
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), new LazyJavaTypeParameterResolver(lazyJavaResolverContext, containingDeclaration, typeParameterOwner, i10), lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static /* synthetic */ LazyJavaResolverContext childForMethod$default(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return childForMethod(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i10);
    }

    public static final JavaTypeQualifiersByElementType computeNewDefaultTypeQualifiers(LazyJavaResolverContext lazyJavaResolverContext, Annotations additionalAnnotations) {
        AbstractC16544l.m18094g(lazyJavaResolverContext, "<this>");
        AbstractC16544l.m18094g(additionalAnnotations, "additionalAnnotations");
        return lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(lazyJavaResolverContext.getDefaultTypeQualifiers(), additionalAnnotations);
    }

    public static final LazyJavaResolverContext copyWithNewDefaultTypeQualifiers(LazyJavaResolverContext lazyJavaResolverContext, Annotations additionalAnnotations) {
        AbstractC16544l.m18094g(lazyJavaResolverContext, "<this>");
        AbstractC16544l.m18094g(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? lazyJavaResolverContext : new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), lazyJavaResolverContext.getTypeParameterResolver(), AbstractC9227W.m9799b(EnumC17307j.f55134Z, new C5150L(lazyJavaResolverContext, 12, additionalAnnotations)));
    }

    public static final LazyJavaResolverContext replaceComponents(LazyJavaResolverContext lazyJavaResolverContext, JavaResolverComponents components) {
        AbstractC16544l.m18094g(lazyJavaResolverContext, "<this>");
        AbstractC16544l.m18094g(components, "components");
        return new LazyJavaResolverContext(components, lazyJavaResolverContext.getTypeParameterResolver(), lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }
}
