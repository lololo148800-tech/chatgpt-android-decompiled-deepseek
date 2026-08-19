package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p077Cn.C1756x;
import p1091wn.AbstractC21031l;
import p1091wn.C21025f;
import p1091wn.InterfaceC21029j;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaAnnotations implements Annotations {

    /* JADX INFO: renamed from: Y */
    public final LazyJavaResolverContext f51858Y;

    /* JADX INFO: renamed from: Z */
    public final JavaAnnotationOwner f51859Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f51860o0;

    /* JADX INFO: renamed from: p0 */
    public final MemoizedFunctionToNullable f51861p0;

    public LazyJavaAnnotations(LazyJavaResolverContext c9, JavaAnnotationOwner annotationOwner, boolean z6) {
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(annotationOwner, "annotationOwner");
        this.f51858Y = c9;
        this.f51859Z = annotationOwner;
        this.f51860o0 = z6;
        this.f51861p0 = c9.getComponents().getStorageManager().createMemoizedFunctionWithNullableValues(new C1756x(this, 12));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo22585findAnnotation(FqName fqName) {
        AnnotationDescriptor annotationDescriptor;
        AbstractC16544l.m18094g(fqName, "fqName");
        JavaAnnotationOwner javaAnnotationOwner = this.f51859Z;
        JavaAnnotation javaAnnotationFindAnnotation = javaAnnotationOwner.findAnnotation(fqName);
        return (javaAnnotationFindAnnotation == null || (annotationDescriptor = (AnnotationDescriptor) this.f51861p0.invoke(javaAnnotationFindAnnotation)) == null) ? JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(fqName, javaAnnotationOwner, this.f51858Y) : annotationDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        JavaAnnotationOwner javaAnnotationOwner = this.f51859Z;
        return javaAnnotationOwner.getAnnotations().isEmpty() && !javaAnnotationOwner.isDeprecatedInJavaDoc();
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        JavaAnnotationOwner javaAnnotationOwner = this.f51859Z;
        return new C21025f(AbstractC21031l.m21488l(AbstractC21031l.m21490n(AbstractC17678l.m19297d(new InterfaceC21029j[]{AbstractC21031l.m21495s(AbstractC17680n.m19329H(javaAnnotationOwner.getAnnotations()), this.f51861p0), AbstractC17678l.m19297d(new Object[]{JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(StandardNames.FqNames.deprecated, javaAnnotationOwner, this.f51858Y)})}))));
    }

    public /* synthetic */ LazyJavaAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner, boolean z6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotationOwner, (i10 & 4) != 0 ? false : z6);
    }
}
