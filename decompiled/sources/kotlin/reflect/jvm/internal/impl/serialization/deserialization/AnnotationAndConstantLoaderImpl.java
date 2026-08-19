package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationAndConstantLoaderImpl extends AbstractAnnotationLoader<AnnotationDescriptor> implements AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    /* JADX INFO: renamed from: b */
    public final AnnotationDeserializer f52982b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationAndConstantLoaderImpl(ModuleDescriptor module, NotFoundClasses notFoundClasses, SerializerExtensionProtocol protocol) {
        super(protocol);
        AbstractC16544l.m18094g(module, "module");
        AbstractC16544l.m18094g(notFoundClasses, "notFoundClasses");
        AbstractC16544l.m18094g(protocol, "protocol");
        this.f52982b = new AnnotationDeserializer(module, notFoundClasses);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public ConstantValue<?> loadAnnotationDefaultValue(ProtoContainer container, ProtoBuf.Property proto, KotlinType expectedType) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(expectedType, "expectedType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public AnnotationDescriptor loadAnnotation(ProtoBuf.Annotation proto, NameResolver nameResolver) {
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        return this.f52982b.deserializeAnnotation(proto, nameResolver);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public ConstantValue<?> loadPropertyConstant(ProtoContainer container, ProtoBuf.Property proto, KotlinType expectedType) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(expectedType, "expectedType");
        ProtoBuf.Annotation.Argument.Value value = (ProtoBuf.Annotation.Argument.Value) ProtoBufUtilKt.getExtensionOrNull(proto, this.f52975a.getCompileTimeValue());
        if (value == null) {
            return null;
        }
        return this.f52982b.resolveValue(expectedType, value, container.getNameResolver());
    }
}
