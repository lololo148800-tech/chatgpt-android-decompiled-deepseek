package kotlin.reflect.jvm.internal.impl.load.kotlin;

import bn.C11509a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p049Bm.InterfaceC1439n;
import p077Cn.C1756x;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> extends AbstractBinaryClassAnnotationLoader<A, AnnotationsContainerWithConstants<? extends A, ? extends C>> implements AnnotationAndConstantLoader<A, C> {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f52009c = 0;

    /* JADX INFO: renamed from: b */
    public final MemoizedFunctionToNotNull f52010b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader(StorageManager storageManager, KotlinClassFinder kotlinClassFinder) {
        super(kotlinClassFinder);
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(kotlinClassFinder, "kotlinClassFinder");
        this.f52010b = storageManager.createMemoizedFunction(new C1756x(this, 19));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public AbstractBinaryClassAnnotationLoader.AnnotationsContainer getAnnotationsContainer(KotlinJvmBinaryClass binaryClass) {
        AbstractC16544l.m18094g(binaryClass, "binaryClass");
        return (AnnotationsContainerWithConstants) this.f52010b.invoke(binaryClass);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX INFO: renamed from: h */
    public final Object m18234h(ProtoContainer container, ProtoBuf.Property property, AnnotatedCallableKind annotatedCallableKind, KotlinType kotlinType, InterfaceC1439n interfaceC1439n) {
        Object objInvoke;
        KotlinJvmBinaryClass specialCaseContainerClass = AbstractBinaryClassAnnotationLoader.Companion.getSpecialCaseContainerClass(container, true, true, Flags.IS_CONST.get(property.getFlags()), JvmProtoBufUtil.isMovedFromInterfaceCompanion(property), this.f52019a, getJvmMetadataVersion());
        AbstractC16544l.m18094g(container, "container");
        if (specialCaseContainerClass == null) {
            if (container instanceof ProtoContainer.Class) {
                SourceElement source = ((ProtoContainer.Class) container).getSource();
                KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) source : null;
                if (kotlinJvmBinarySourceElement != null) {
                    specialCaseContainerClass = kotlinJvmBinarySourceElement.getBinaryClass();
                } else {
                    specialCaseContainerClass = null;
                }
            } else {
                specialCaseContainerClass = null;
            }
        }
        if (specialCaseContainerClass == null) {
            return null;
        }
        MemberSignature memberSignatureM18236c = AbstractBinaryClassAnnotationLoader.m18236c(property, container.getNameResolver(), container.getTypeTable(), annotatedCallableKind, specialCaseContainerClass.getClassHeader().getMetadataVersion().isAtLeast(DeserializedDescriptorResolver.Companion.getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm()));
        if (memberSignatureM18236c == null || (objInvoke = interfaceC1439n.invoke(this.f52010b.invoke(specialCaseContainerClass), memberSignatureM18236c)) == null) {
            return null;
        }
        return UnsignedTypes.isUnsignedType(kotlinType) ? transformToUnsignedConstant(objInvoke) : objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public C loadAnnotationDefaultValue(ProtoContainer container, ProtoBuf.Property proto, KotlinType expectedType) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(expectedType, "expectedType");
        return (C) m18234h(container, proto, AnnotatedCallableKind.PROPERTY_GETTER, expectedType, C11509a.f34827Z);
    }

    public abstract Object loadConstant(String str, Object obj);

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public C loadPropertyConstant(ProtoContainer container, ProtoBuf.Property proto, KotlinType expectedType) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(expectedType, "expectedType");
        return (C) m18234h(container, proto, AnnotatedCallableKind.PROPERTY, expectedType, C11509a.f34828o0);
    }

    public abstract Object transformToUnsignedConstant(Object obj);
}
