package kotlin.reflect.jvm.internal.impl.load.kotlin;

import bn.EnumC11510b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import p009A7.FlM.nkFZpTrMPpn;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p509Uk.lpqL.SfpOlmlMATQ;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends AnnotationsContainer<? extends A>> implements AnnotationLoader<A> {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final KotlinClassFinder f52019a;

    public static abstract class AnnotationsContainer<A> {
        public abstract Map<MemberSignature, List<A>> getMemberAnnotations();
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final KotlinJvmBinaryClass getSpecialCaseContainerClass(ProtoContainer container, boolean z6, boolean z10, Boolean bool, boolean z11, KotlinClassFinder kotlinClassFinder, JvmMetadataVersion jvmMetadataVersion) {
            ProtoContainer.Class outerClass;
            AbstractC16544l.m18094g(container, "container");
            AbstractC16544l.m18094g(kotlinClassFinder, "kotlinClassFinder");
            AbstractC16544l.m18094g(jvmMetadataVersion, "jvmMetadataVersion");
            if (z6) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
                }
                if (container instanceof ProtoContainer.Class) {
                    ProtoContainer.Class r6 = (ProtoContainer.Class) container;
                    if (r6.getKind() == ProtoBuf.Class.Kind.INTERFACE) {
                        ClassId classId = r6.getClassId();
                        Name nameIdentifier = Name.identifier("DefaultImpls");
                        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
                        return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, classId.createNestedClassId(nameIdentifier), jvmMetadataVersion);
                    }
                }
                if (bool.booleanValue() && (container instanceof ProtoContainer.Package)) {
                    SourceElement source = container.getSource();
                    JvmPackagePartSource jvmPackagePartSource = source instanceof JvmPackagePartSource ? (JvmPackagePartSource) source : null;
                    JvmClassName facadeClassName = jvmPackagePartSource != null ? jvmPackagePartSource.getFacadeClassName() : null;
                    if (facadeClassName != null) {
                        ClassId.Companion companion = ClassId.Companion;
                        String internalName = facadeClassName.getInternalName();
                        AbstractC16544l.m18093f(internalName, "getInternalName(...)");
                        return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, companion.topLevel(new FqName(AbstractC21329w.m21730q(internalName, '/', '.'))), jvmMetadataVersion);
                    }
                }
            }
            if (z10 && (container instanceof ProtoContainer.Class)) {
                ProtoContainer.Class r10 = (ProtoContainer.Class) container;
                if (r10.getKind() == ProtoBuf.Class.Kind.COMPANION_OBJECT && (outerClass = r10.getOuterClass()) != null && (outerClass.getKind() == ProtoBuf.Class.Kind.CLASS || outerClass.getKind() == ProtoBuf.Class.Kind.ENUM_CLASS || (z11 && (outerClass.getKind() == ProtoBuf.Class.Kind.INTERFACE || outerClass.getKind() == ProtoBuf.Class.Kind.ANNOTATION_CLASS)))) {
                    SourceElement source2 = outerClass.getSource();
                    KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source2 instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) source2 : null;
                    if (kotlinJvmBinarySourceElement != null) {
                        return kotlinJvmBinarySourceElement.getBinaryClass();
                    }
                    return null;
                }
            }
            if (!(container instanceof ProtoContainer.Package) || !(container.getSource() instanceof JvmPackagePartSource)) {
                return null;
            }
            SourceElement source3 = container.getSource();
            AbstractC16544l.m18092e(source3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            JvmPackagePartSource jvmPackagePartSource2 = (JvmPackagePartSource) source3;
            KotlinJvmBinaryClass knownJvmBinaryClass = jvmPackagePartSource2.getKnownJvmBinaryClass();
            return knownJvmBinaryClass == null ? KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, jvmPackagePartSource2.getClassId(), jvmMetadataVersion) : knownJvmBinaryClass;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AbstractBinaryClassAnnotationLoader(KotlinClassFinder kotlinClassFinder) {
        AbstractC16544l.m18094g(kotlinClassFinder, "kotlinClassFinder");
        this.f52019a = kotlinClassFinder;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m18235b(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoContainer protoContainer, MemberSignature memberSignature, boolean z6, Boolean bool, boolean z10, int i10) {
        boolean z11 = (i10 & 4) != 0 ? false : z6;
        if ((i10 & 16) != 0) {
            bool = null;
        }
        return abstractBinaryClassAnnotationLoader.m18237a(protoContainer, memberSignature, z11, false, bool, (i10 & 32) != 0 ? false : z10);
    }

    /* JADX INFO: renamed from: c */
    public static MemberSignature m18236c(MessageLite proto, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind kind, boolean z6) {
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        AbstractC16544l.m18094g(kind, "kind");
        if (proto instanceof ProtoBuf.Constructor) {
            MemberSignature.Companion companion = MemberSignature.Companion;
            JvmMemberSignature.Method jvmConstructorSignature = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((ProtoBuf.Constructor) proto, nameResolver, typeTable);
            if (jvmConstructorSignature == null) {
                return null;
            }
            return companion.fromJvmMemberSignature(jvmConstructorSignature);
        }
        if (proto instanceof ProtoBuf.Function) {
            MemberSignature.Companion companion2 = MemberSignature.Companion;
            JvmMemberSignature.Method jvmMethodSignature = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((ProtoBuf.Function) proto, nameResolver, typeTable);
            if (jvmMethodSignature == null) {
                return null;
            }
            return companion2.fromJvmMemberSignature(jvmMethodSignature);
        }
        if (!(proto instanceof ProtoBuf.Property)) {
            return null;
        }
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.propertySignature;
        AbstractC16544l.m18093f(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull((GeneratedMessageLite.ExtendableMessage) proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i10 == 1) {
            if (!jvmPropertySignature.hasGetter()) {
                return null;
            }
            MemberSignature.Companion companion3 = MemberSignature.Companion;
            JvmProtoBuf.JvmMethodSignature getter = jvmPropertySignature.getGetter();
            AbstractC16544l.m18093f(getter, "getGetter(...)");
            return companion3.fromMethod(nameResolver, getter);
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            return AbstractBinaryClassAnnotationLoaderKt.getPropertySignature((ProtoBuf.Property) proto, nameResolver, typeTable, true, true, z6);
        }
        if (!jvmPropertySignature.hasSetter()) {
            return null;
        }
        MemberSignature.Companion companion4 = MemberSignature.Companion;
        JvmProtoBuf.JvmMethodSignature setter = jvmPropertySignature.getSetter();
        AbstractC16544l.m18093f(setter, "getSetter(...)");
        return companion4.fromMethod(nameResolver, setter);
    }

    public static /* synthetic */ MemberSignature getCallableSignature$default(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i10 & 16) != 0) {
            z6 = false;
        }
        abstractBinaryClassAnnotationLoader.getClass();
        return m18236c(messageLite, nameResolver, typeTable, annotatedCallableKind, z6);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX INFO: renamed from: a */
    public final List m18237a(ProtoContainer container, MemberSignature memberSignature, boolean z6, boolean z10, Boolean bool, boolean z11) {
        List<A> list;
        KotlinJvmBinaryClass specialCaseContainerClass = Companion.getSpecialCaseContainerClass(container, z6, z10, bool, z11, this.f52019a, getJvmMetadataVersion());
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
        C17689w c17689w = C17689w.f56480Y;
        return (specialCaseContainerClass == null || (list = getAnnotationsContainer(specialCaseContainerClass).getMemberAnnotations().get(memberSignature)) == null) ? c17689w : list;
    }

    /* JADX INFO: renamed from: e */
    public abstract BinaryClassAnnotationAndConstantLoaderImpl.C165701 mo18239e(ClassId classId, SourceElement sourceElement, List list);

    /* JADX INFO: renamed from: f */
    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor m18240f(ClassId annotationClassId, SourceElement source, List result) {
        AbstractC16544l.m18094g(annotationClassId, "annotationClassId");
        AbstractC16544l.m18094g(source, "source");
        AbstractC16544l.m18094g(result, "result");
        if (SpecialJvmAnnotations.INSTANCE.getSPECIAL_ANNOTATIONS().contains(annotationClassId)) {
            return null;
        }
        return mo18239e(annotationClassId, source, result);
    }

    /* JADX INFO: renamed from: g */
    public final List m18241g(ProtoContainer protoContainer, ProtoBuf.Property property, EnumC11510b enumC11510b) {
        Boolean bool = Flags.IS_CONST.get(property.getFlags());
        AbstractC16544l.m18093f(bool, "get(...)");
        boolean zIsMovedFromInterfaceCompanion = JvmProtoBufUtil.isMovedFromInterfaceCompanion(property);
        EnumC11510b enumC11510b2 = EnumC11510b.f34830Y;
        C17689w c17689w = C17689w.f56480Y;
        if (enumC11510b == enumC11510b2) {
            MemberSignature propertySignature$default = AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), false, true, false, 40, null);
            return propertySignature$default == null ? c17689w : m18235b(this, protoContainer, propertySignature$default, true, bool, zIsMovedFromInterfaceCompanion, 8);
        }
        MemberSignature propertySignature$default2 = AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), true, false, false, 48, null);
        if (propertySignature$default2 == null) {
            return c17689w;
        }
        return AbstractC21322p.m21667A(propertySignature$default2.getSignature(), "$delegate", false) != (enumC11510b == EnumC11510b.f34832o0) ? c17689w : m18237a(protoContainer, propertySignature$default2, true, true, bool, zIsMovedFromInterfaceCompanion);
    }

    public abstract AnnotationsContainer getAnnotationsContainer(KotlinJvmBinaryClass kotlinJvmBinaryClass);

    public abstract JvmMetadataVersion getJvmMetadataVersion();

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public abstract A loadAnnotation(ProtoBuf.Annotation annotation, NameResolver nameResolver);

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadClassAnnotations(ProtoContainer.Class container) {
        AbstractC16544l.m18094g(container, "container");
        SourceElement source = container.getSource();
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) source : null;
        KotlinJvmBinaryClass binaryClass = kotlinJvmBinarySourceElement != null ? kotlinJvmBinarySourceElement.getBinaryClass() : null;
        if (binaryClass != null) {
            final ArrayList arrayList = new ArrayList(1);
            binaryClass.loadClassAnnotations(new KotlinJvmBinaryClass.AnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.loadClassAnnotations.1
                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement source2) {
                    AbstractC16544l.m18094g(classId, "classId");
                    AbstractC16544l.m18094g(source2, "source");
                    return AbstractBinaryClassAnnotationLoader.this.m18240f(classId, source2, arrayList);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public void visitEnd() {
                }
            }, null);
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.debugFqName()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadEnumEntryAnnotations(ProtoContainer container, ProtoBuf.EnumEntry proto) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(proto, "proto");
        return m18235b(this, container, MemberSignature.Companion.fromFieldNameAndDesc(container.getNameResolver().getString(proto.getName()), ClassMapperLite.mapClass(((ProtoContainer.Class) container).getClassId().asString())), false, null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadExtensionReceiverParameterAnnotations(ProtoContainer container, MessageLite proto, AnnotatedCallableKind kind) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(kind, "kind");
        MemberSignature callableSignature$default = getCallableSignature$default(this, proto, container.getNameResolver(), container.getTypeTable(), kind, false, 16, null);
        return callableSignature$default != null ? m18235b(this, container, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, 0), false, null, false, 60) : C17689w.f56480Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyBackingFieldAnnotations(ProtoContainer container, ProtoBuf.Property proto) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(proto, "proto");
        return m18241g(container, proto, EnumC11510b.f34831Z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyDelegateFieldAnnotations(ProtoContainer container, ProtoBuf.Property proto) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(proto, "proto");
        return m18241g(container, proto, EnumC11510b.f34832o0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeAnnotations(ProtoBuf.Type proto, NameResolver nameResolver) {
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        Object extension = proto.getExtension(JvmProtoBuf.typeAnnotation);
        AbstractC16544l.m18093f(extension, "getExtension(...)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            AbstractC16544l.m18091d(annotation);
            arrayList.add(loadAnnotation(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeParameterAnnotations(ProtoBuf.TypeParameter proto, NameResolver nameResolver) {
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        Object extension = proto.getExtension(JvmProtoBuf.typeParameterAnnotation);
        AbstractC16544l.m18093f(extension, "getExtension(...)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            AbstractC16544l.m18091d(annotation);
            arrayList.add(loadAnnotation(annotation, nameResolver));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0037  */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadValueParameterAnnotations(ProtoContainer container, MessageLite callableProto, AnnotatedCallableKind kind, int i10, ProtoBuf.ValueParameter proto) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(callableProto, "callableProto");
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(proto, "proto");
        MemberSignature callableSignature$default = getCallableSignature$default(this, callableProto, container.getNameResolver(), container.getTypeTable(), kind, false, 16, null);
        if (callableSignature$default == null) {
            return C17689w.f56480Y;
        }
        int i11 = 0;
        if (callableProto instanceof ProtoBuf.Function) {
            if (ProtoTypeTableUtilKt.hasReceiver((ProtoBuf.Function) callableProto)) {
                i11 = 1;
            }
        } else if (callableProto instanceof ProtoBuf.Property) {
            if (ProtoTypeTableUtilKt.hasReceiver((ProtoBuf.Property) callableProto)) {
                i11 = 1;
            }
        } else {
            if (!(callableProto instanceof ProtoBuf.Constructor)) {
                throw new UnsupportedOperationException("Unsupported message: " + callableProto.getClass());
            }
            ProtoContainer.Class r11 = (ProtoContainer.Class) container;
            if (r11.getKind() == ProtoBuf.Class.Kind.ENUM_CLASS) {
                i11 = 2;
            } else if (r11.isInner()) {
                i11 = 1;
            }
        }
        return m18235b(this, container, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, i10 + i11), false, null, false, 60);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m18238d(ClassId classId) {
        KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass;
        AbstractC16544l.m18094g(classId, "classId");
        return classId.getOuterClassId() != null && AbstractC16544l.m18089b(classId.getShortClassName().asString(), nkFZpTrMPpn.OQQxyCo) && (kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(this.f52019a, classId, getJvmMetadataVersion())) != null && SpecialJvmAnnotations.INSTANCE.isAnnotatedWithContainerMetaAnnotation(kotlinJvmBinaryClassFindKotlinClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadCallableAnnotations(ProtoContainer container, MessageLite proto, AnnotatedCallableKind annotatedCallableKind) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(annotatedCallableKind, SfpOlmlMATQ.qnxcqrpj);
        if (annotatedCallableKind == AnnotatedCallableKind.PROPERTY) {
            return m18241g(container, (ProtoBuf.Property) proto, EnumC11510b.f34830Y);
        }
        MemberSignature callableSignature$default = getCallableSignature$default(this, proto, container.getNameResolver(), container.getTypeTable(), annotatedCallableKind, false, 16, null);
        return callableSignature$default == null ? C17689w.f56480Y : m18235b(this, container, callableSignature$default, false, null, false, 60);
    }
}
