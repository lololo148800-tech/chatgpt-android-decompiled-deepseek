package p534Vm;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: renamed from: Vm.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C8403d implements JavaResolverCache {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8947a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "member";
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                objArr[0] = "descriptor";
                break;
            case 3:
                objArr[0] = "element";
                break;
            case 5:
                objArr[0] = "field";
                break;
            case 7:
                objArr[0] = "javaClass";
                break;
            default:
                objArr[0] = "fqName";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
        switch (i10) {
            case 1:
            case 2:
                objArr[2] = "recordMethod";
                break;
            case 3:
            case 4:
                objArr[2] = "recordConstructor";
                break;
            case 5:
            case 6:
                objArr[2] = "recordField";
                break;
            case 7:
            case 8:
                objArr[2] = "recordClass";
                break;
            default:
                objArr[2] = "getClassResolvedFromSource";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
    public final ClassDescriptor getClassResolvedFromSource(FqName fqName) {
        if (fqName != null) {
            return null;
        }
        m8947a(0);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
    public final void recordClass(JavaClass javaClass, ClassDescriptor classDescriptor) {
        if (javaClass == null) {
            m8947a(7);
            throw null;
        }
        if (classDescriptor != null) {
            return;
        }
        m8947a(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
    public final void recordConstructor(JavaElement javaElement, ConstructorDescriptor constructorDescriptor) {
        if (javaElement == null) {
            m8947a(3);
            throw null;
        }
        if (constructorDescriptor != null) {
            return;
        }
        m8947a(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
    public final void recordField(JavaField javaField, PropertyDescriptor propertyDescriptor) {
        if (javaField == null) {
            m8947a(5);
            throw null;
        }
        if (propertyDescriptor != null) {
            return;
        }
        m8947a(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
    public final void recordMethod(JavaMember javaMember, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        if (javaMember == null) {
            m8947a(1);
            throw null;
        }
        if (simpleFunctionDescriptor != null) {
            return;
        }
        m8947a(2);
        throw null;
    }
}
