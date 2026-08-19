package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public interface SyntheticJavaPartsProvider {
    public static final Companion Companion = Companion.f52910a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f52910a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final CompositeSyntheticJavaPartsProvider f52911b = new CompositeSyntheticJavaPartsProvider(C17689w.f56480Y);

        public final CompositeSyntheticJavaPartsProvider getEMPTY() {
            return f52911b;
        }
    }

    void generateConstructors(ClassDescriptor classDescriptor, List<ClassConstructorDescriptor> list, LazyJavaResolverContext lazyJavaResolverContext);

    void generateMethods(ClassDescriptor classDescriptor, Name name, Collection<SimpleFunctionDescriptor> collection, LazyJavaResolverContext lazyJavaResolverContext);

    void generateNestedClass(ClassDescriptor classDescriptor, Name name, List<ClassDescriptor> list, LazyJavaResolverContext lazyJavaResolverContext);

    void generateStaticFunctions(ClassDescriptor classDescriptor, Name name, Collection<SimpleFunctionDescriptor> collection, LazyJavaResolverContext lazyJavaResolverContext);

    List<Name> getMethodNames(ClassDescriptor classDescriptor, LazyJavaResolverContext lazyJavaResolverContext);

    List<Name> getNestedClassNames(ClassDescriptor classDescriptor, LazyJavaResolverContext lazyJavaResolverContext);

    List<Name> getStaticFunctionNames(ClassDescriptor classDescriptor, LazyJavaResolverContext lazyJavaResolverContext);

    PropertyDescriptorImpl modifyField(ClassDescriptor classDescriptor, PropertyDescriptorImpl propertyDescriptorImpl, LazyJavaResolverContext lazyJavaResolverContext);
}
