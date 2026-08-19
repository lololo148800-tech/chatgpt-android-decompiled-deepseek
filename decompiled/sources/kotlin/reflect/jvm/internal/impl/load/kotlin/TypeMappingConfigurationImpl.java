package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeMappingConfigurationImpl implements TypeMappingConfiguration<JvmType> {
    public static final TypeMappingConfigurationImpl INSTANCE = new TypeMappingConfigurationImpl();

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public KotlinType commonSupertype(Collection<? extends KotlinType> types) {
        AbstractC16544l.m18094g(types, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + AbstractC17680n.m19349Y(types, null, null, null, 0, null, null, 63));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public String getPredefinedFullInternalNameForClass(ClassDescriptor classDescriptor) {
        AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public String getPredefinedInternalNameForClass(ClassDescriptor classDescriptor) {
        AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public JvmType getPredefinedTypeForClass(ClassDescriptor classDescriptor) {
        AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public KotlinType preprocessType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "kotlinType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public void processErrorType(KotlinType kotlinType, ClassDescriptor descriptor) {
        AbstractC16544l.m18094g(kotlinType, "kotlinType");
        AbstractC16544l.m18094g(descriptor, "descriptor");
    }
}
