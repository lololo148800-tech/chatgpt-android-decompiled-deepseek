package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p534Vm.C8403d;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaResolverCache {
    public static final JavaResolverCache EMPTY = new C8403d();

    ClassDescriptor getClassResolvedFromSource(FqName fqName);

    void recordClass(JavaClass javaClass, ClassDescriptor classDescriptor);

    void recordConstructor(JavaElement javaElement, ConstructorDescriptor constructorDescriptor);

    void recordField(JavaField javaField, PropertyDescriptor propertyDescriptor);

    void recordMethod(JavaMember javaMember, SimpleFunctionDescriptor simpleFunctionDescriptor);
}
