package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import mm.InterfaceC17306i;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaResolverContext {

    /* JADX INFO: renamed from: a */
    public final JavaResolverComponents f51864a;

    /* JADX INFO: renamed from: b */
    public final TypeParameterResolver f51865b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17306i f51866c;

    /* JADX INFO: renamed from: d */
    public final JavaTypeResolver f51867d;

    public LazyJavaResolverContext(JavaResolverComponents components, TypeParameterResolver typeParameterResolver, InterfaceC17306i delegateForDefaultTypeQualifiers) {
        AbstractC16544l.m18094g(components, "components");
        AbstractC16544l.m18094g(typeParameterResolver, "typeParameterResolver");
        AbstractC16544l.m18094g(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f51864a = components;
        this.f51865b = typeParameterResolver;
        this.f51866c = delegateForDefaultTypeQualifiers;
        this.f51867d = new JavaTypeResolver(this, typeParameterResolver);
    }

    public final JavaResolverComponents getComponents() {
        return this.f51864a;
    }

    public final JavaTypeQualifiersByElementType getDefaultTypeQualifiers() {
        return (JavaTypeQualifiersByElementType) this.f51866c.getValue();
    }

    public final InterfaceC17306i getDelegateForDefaultTypeQualifiers$descriptors_jvm() {
        return this.f51866c;
    }

    public final ModuleDescriptor getModule() {
        return this.f51864a.getModule();
    }

    public final StorageManager getStorageManager() {
        return this.f51864a.getStorageManager();
    }

    public final TypeParameterResolver getTypeParameterResolver() {
        return this.f51865b;
    }

    public final JavaTypeResolver getTypeResolver() {
        return this.f51867d;
    }
}
