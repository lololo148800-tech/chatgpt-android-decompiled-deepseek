package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaDescriptorResolver {

    /* JADX INFO: renamed from: a */
    public final LazyJavaPackageFragmentProvider f52897a;

    /* JADX INFO: renamed from: b */
    public final JavaResolverCache f52898b;

    public JavaDescriptorResolver(LazyJavaPackageFragmentProvider packageFragmentProvider, JavaResolverCache javaResolverCache) {
        AbstractC16544l.m18094g(packageFragmentProvider, "packageFragmentProvider");
        AbstractC16544l.m18094g(javaResolverCache, "javaResolverCache");
        this.f52897a = packageFragmentProvider;
        this.f52898b = javaResolverCache;
    }

    public final LazyJavaPackageFragmentProvider getPackageFragmentProvider() {
        return this.f52897a;
    }

    public final ClassDescriptor resolveClass(JavaClass javaClass) {
        LazyJavaPackageFragment lazyJavaPackageFragment;
        AbstractC16544l.m18094g(javaClass, "javaClass");
        FqName fqName = javaClass.getFqName();
        if (fqName != null && javaClass.getLightClassOriginKind() == LightClassOriginKind.SOURCE) {
            return this.f52898b.getClassResolvedFromSource(fqName);
        }
        JavaClass outerClass = javaClass.getOuterClass();
        if (outerClass == null) {
            if (fqName == null || (lazyJavaPackageFragment = (LazyJavaPackageFragment) AbstractC17680n.m19343S(this.f52897a.getPackageFragments(fqName.parent()))) == null) {
                return null;
            }
            return lazyJavaPackageFragment.findClassifierByJavaClass$descriptors_jvm(javaClass);
        }
        ClassDescriptor classDescriptorResolveClass = resolveClass(outerClass);
        MemberScope unsubstitutedInnerClassesScope = classDescriptorResolveClass != null ? classDescriptorResolveClass.getUnsubstitutedInnerClassesScope() : null;
        ClassifierDescriptor classifierDescriptorMo22590getContributedClassifier = unsubstitutedInnerClassesScope != null ? unsubstitutedInnerClassesScope.mo22590getContributedClassifier(javaClass.getName(), NoLookupLocation.FROM_JAVA_LOADER) : null;
        if (classifierDescriptorMo22590getContributedClassifier instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo22590getContributedClassifier;
        }
        return null;
    }
}
