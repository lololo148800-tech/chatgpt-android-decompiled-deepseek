package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p049Bm.InterfaceC1436k;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaPackage extends ReflectJavaElement implements JavaPackage {

    /* JADX INFO: renamed from: a */
    public final FqName f51700a;

    public ReflectJavaPackage(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        this.f51700a = fqName;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaPackage) && AbstractC16544l.m18089b(getFqName(), ((ReflectJavaPackage) obj).getFqName());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public JavaAnnotation findAnnotation(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    public Collection<JavaClass> getClasses(InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        return C17689w.f56480Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    public FqName getFqName() {
        return this.f51700a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    public Collection<JavaPackage> getSubPackages() {
        return C17689w.f56480Y;
    }

    public int hashCode() {
        return getFqName().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    public String toString() {
        return ReflectJavaPackage.class.getName() + ": " + getFqName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public List<JavaAnnotation> getAnnotations() {
        return C17689w.f56480Y;
    }
}
