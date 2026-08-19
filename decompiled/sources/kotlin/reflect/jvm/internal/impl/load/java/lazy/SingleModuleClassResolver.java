package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleModuleClassResolver implements ModuleClassResolver {
    public JavaDescriptorResolver resolver;

    public final JavaDescriptorResolver getResolver() {
        JavaDescriptorResolver javaDescriptorResolver = this.resolver;
        if (javaDescriptorResolver != null) {
            return javaDescriptorResolver;
        }
        AbstractC16544l.m18103p("resolver");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver
    public ClassDescriptor resolveClass(JavaClass javaClass) {
        AbstractC16544l.m18094g(javaClass, "javaClass");
        return getResolver().resolveClass(javaClass);
    }

    public final void setResolver(JavaDescriptorResolver javaDescriptorResolver) {
        AbstractC16544l.m18094g(javaDescriptorResolver, "<set-?>");
        this.resolver = javaDescriptorResolver;
    }
}
