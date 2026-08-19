package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import mm.C17309l;
import p571X9.AbstractC9393x3;
import p877ln.C17071c;
import p877ln.C17072d;
import p877ln.C17073e;
import p877ln.C17074f;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes2.dex */
public final class MemberDeserializer {

    /* JADX INFO: renamed from: a */
    public final DeserializationContext f53038a;

    /* JADX INFO: renamed from: b */
    public final AnnotationDeserializer f53039b;

    public MemberDeserializer(DeserializationContext c9) {
        AbstractC16544l.m18094g(c9, "c");
        this.f53038a = c9;
        this.f53039b = new AnnotationDeserializer(c9.getComponents().getModuleDescriptor(), c9.getComponents().getNotFoundClasses());
    }

    /* JADX INFO: renamed from: a */
    public final ProtoContainer m18369a(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            FqName fqName = ((PackageFragmentDescriptor) declarationDescriptor).getFqName();
            DeserializationContext deserializationContext = this.f53038a;
            return new ProtoContainer.Package(fqName, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getContainerSource());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Annotations m18370b(GeneratedMessageLite.ExtendableMessage extendableMessage, int i10, AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.HAS_ANNOTATIONS.get(i10).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f53038a.getStorageManager(), new C17072d(this, extendableMessage, annotatedCallableKind, 0));
    }

    /* JADX INFO: renamed from: c */
    public final Annotations m18371c(ProtoBuf.Property property, boolean z6) {
        return !Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f53038a.getStorageManager(), new C17073e(this, z6, property));
    }

    /* JADX INFO: renamed from: d */
    public final List m18372d(List list, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind) {
        DeserializationContext deserializationContext = this.f53038a;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        AbstractC16544l.m18092e(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        AbstractC16544l.m18093f(containingDeclaration2, "getContainingDeclaration(...)");
        ProtoContainer protoContainerM18369a = m18369a(containingDeclaration2);
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            Annotations empty = (protoContainerM18369a == null || !Flags.HAS_ANNOTATIONS.get(flags).booleanValue()) ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(deserializationContext.getStorageManager(), new C17074f(this, protoContainerM18369a, extendableMessage, annotatedCallableKind, i10, valueParameter));
            Name name = NameResolverUtilKt.getName(deserializationContext.getNameResolver(), valueParameter.getName());
            KotlinType kotlinTypeType = deserializationContext.getTypeDeserializer().type(ProtoTypeTableUtilKt.type(valueParameter, deserializationContext.getTypeTable()));
            Boolean bool = Flags.DECLARES_DEFAULT_VALUE.get(flags);
            AbstractC16544l.m18093f(bool, "get(...)");
            boolean zBooleanValue = bool.booleanValue();
            Boolean bool2 = Flags.IS_CROSSINLINE.get(flags);
            AbstractC16544l.m18093f(bool2, "get(...)");
            boolean zBooleanValue2 = bool2.booleanValue();
            Boolean bool3 = Flags.IS_NOINLINE.get(flags);
            AbstractC16544l.m18093f(bool3, "get(...)");
            boolean zBooleanValue3 = bool3.booleanValue();
            ProtoBuf.Type typeVarargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, deserializationContext.getTypeTable());
            KotlinType kotlinTypeType2 = typeVarargElementType != null ? deserializationContext.getTypeDeserializer().type(typeVarargElementType) : null;
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            AbstractC16544l.m18093f(NO_SOURCE, "NO_SOURCE");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ValueParameterDescriptorImpl(callableDescriptor, null, i10, empty, name, kotlinTypeType, zBooleanValue, zBooleanValue2, zBooleanValue3, kotlinTypeType2, NO_SOURCE));
            arrayList = arrayList2;
            i10 = i11;
        }
        return AbstractC17680n.m19322C0(arrayList);
    }

    public final ClassConstructorDescriptor loadConstructor(ProtoBuf.Constructor proto, boolean z6) {
        AbstractC16544l.m18094g(proto, "proto");
        DeserializationContext deserializationContext = this.f53038a;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        AbstractC16544l.m18092e(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        int flags = proto.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, m18370b(proto, flags, annotatedCallableKind), z6, CallableMemberDescriptor.Kind.DECLARATION, proto, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getVersionRequirementTable(), deserializationContext.getContainerSource(), null, 1024, null);
        MemberDeserializer memberDeserializer = DeserializationContext.childContext$default(this.f53038a, deserializedClassConstructorDescriptor, C17689w.f56480Y, null, null, null, null, 60, null).getMemberDeserializer();
        List valueParameterList = proto.getValueParameterList();
        AbstractC16544l.m18093f(valueParameterList, "getValueParameterList(...)");
        deserializedClassConstructorDescriptor.initialize(memberDeserializer.m18372d(valueParameterList, proto, annotatedCallableKind), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())));
        deserializedClassConstructorDescriptor.setReturnType(classDescriptor.getDefaultType());
        deserializedClassConstructorDescriptor.setExpect(classDescriptor.isExpect());
        deserializedClassConstructorDescriptor.setHasStableParameterNames(!Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(proto.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    public final SimpleFunctionDescriptor loadFunction(ProtoBuf.Function proto) {
        int flags;
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor;
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable;
        KotlinType kotlinTypeType;
        AbstractC16544l.m18094g(proto, "proto");
        if (proto.hasFlags()) {
            flags = proto.getFlags();
        } else {
            int oldFlags = proto.getOldFlags();
            flags = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        int i10 = flags;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotationsM18370b = m18370b(proto, i10, annotatedCallableKind);
        boolean zHasReceiver = ProtoTypeTableUtilKt.hasReceiver(proto);
        DeserializationContext deserializationContext = this.f53038a;
        Annotations deserializedAnnotations = zHasReceiver ? new DeserializedAnnotations(deserializationContext.getStorageManager(), new C17072d(this, proto, annotatedCallableKind, 1)) : Annotations.Companion.getEMPTY();
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor2 = new DeserializedSimpleFunctionDescriptor(deserializationContext.getContainingDeclaration(), null, annotationsM18370b, NameResolverUtilKt.getName(deserializationContext.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.memberKind(ProtoEnumFlags.INSTANCE, Flags.MEMBER_KIND.get(i10)), proto, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), AbstractC16544l.m18089b(DescriptorUtilsKt.getFqNameSafe(deserializationContext.getContainingDeclaration()).child(NameResolverUtilKt.getName(deserializationContext.getNameResolver(), proto.getName())), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? VersionRequirementTable.Companion.getEMPTY() : deserializationContext.getVersionRequirementTable(), deserializationContext.getContainerSource(), null, 1024, null);
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        AbstractC16544l.m18093f(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(this.f53038a, deserializedSimpleFunctionDescriptor2, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(proto, deserializationContext.getTypeTable());
        if (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) {
            deserializedSimpleFunctionDescriptor = deserializedSimpleFunctionDescriptor2;
            receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = null;
        } else {
            deserializedSimpleFunctionDescriptor = deserializedSimpleFunctionDescriptor2;
            receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, kotlinTypeType, deserializedAnnotations);
        }
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        ReceiverParameterDescriptor thisAsReceiverParameter = classDescriptor != null ? classDescriptor.getThisAsReceiverParameter() : null;
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(proto, deserializationContext.getTypeTable());
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : listContextReceiverTypes) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            ReceiverParameterDescriptor receiverParameterDescriptorCreateContextReceiverParameterForCallable = DescriptorFactory.createContextReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, deserializationContextChildContext$default.getTypeDeserializer().type((ProtoBuf.Type) obj), null, Annotations.Companion.getEMPTY(), i11);
            if (receiverParameterDescriptorCreateContextReceiverParameterForCallable != null) {
                arrayList.add(receiverParameterDescriptorCreateContextReceiverParameterForCallable);
            }
            i11 = i12;
        }
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        MemberDeserializer memberDeserializer = deserializationContextChildContext$default.getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        AbstractC16544l.m18093f(valueParameterList, "getValueParameterList(...)");
        List<ValueParameterDescriptor> listM18372d = memberDeserializer.m18372d(valueParameterList, proto, AnnotatedCallableKind.FUNCTION);
        KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(proto, deserializationContext.getTypeTable()));
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        deserializedSimpleFunctionDescriptor.initialize(receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, thisAsReceiverParameter, arrayList, ownTypeParameters, listM18372d, kotlinTypeType2, protoEnumFlags.modality(Flags.MODALITY.get(i10)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(i10)), C17690x.f56481Y);
        deserializedSimpleFunctionDescriptor.setOperator(Flags.IS_OPERATOR.get(i10).booleanValue());
        deserializedSimpleFunctionDescriptor.setInfix(Flags.IS_INFIX.get(i10).booleanValue());
        deserializedSimpleFunctionDescriptor.setExternal(Flags.IS_EXTERNAL_FUNCTION.get(i10).booleanValue());
        deserializedSimpleFunctionDescriptor.setInline(Flags.IS_INLINE.get(i10).booleanValue());
        deserializedSimpleFunctionDescriptor.setTailrec(Flags.IS_TAILREC.get(i10).booleanValue());
        deserializedSimpleFunctionDescriptor.setSuspend(Flags.IS_SUSPEND.get(i10).booleanValue());
        deserializedSimpleFunctionDescriptor.setExpect(Flags.IS_EXPECT_FUNCTION.get(i10).booleanValue());
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(!Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(i10).booleanValue());
        C17309l c17309lDeserializeContractFromFunction = deserializationContext.getComponents().getContractDeserializer().deserializeContractFromFunction(proto, deserializedSimpleFunctionDescriptor, deserializationContext.getTypeTable(), deserializationContextChildContext$default.getTypeDeserializer());
        if (c17309lDeserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap((CallableDescriptor.UserDataKey) c17309lDeserializeContractFromFunction.f55136Y, c17309lDeserializeContractFromFunction.f55137Z);
        }
        return deserializedSimpleFunctionDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorWithInitializerImpl, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor] */
    /* JADX WARN: Type inference failed for: r5v16, types: [kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor] */
    public final PropertyDescriptor loadProperty(ProtoBuf.Property proto) {
        int flags;
        ProtoBuf.Property property;
        Annotations empty;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor;
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable;
        ?? r6;
        ?? r14;
        ?? r10;
        Object kind;
        ClassDescriptor classDescriptor;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor2;
        KotlinType kotlinTypeType;
        AbstractC16544l.m18094g(proto, "proto");
        if (proto.hasFlags()) {
            flags = proto.getFlags();
        } else {
            int oldFlags = proto.getOldFlags();
            flags = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        int i10 = flags;
        DeserializationContext deserializationContext = this.f53038a;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        Annotations annotationsM18370b = m18370b(proto, i10, AnnotatedCallableKind.PROPERTY);
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        Modality modality = protoEnumFlags.modality(Flags.MODALITY.get(i10));
        DescriptorVisibility descriptorVisibility = ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(i10));
        Boolean bool = Flags.IS_VAR.get(i10);
        AbstractC16544l.m18093f(bool, "get(...)");
        boolean zBooleanValue = bool.booleanValue();
        Name name = NameResolverUtilKt.getName(deserializationContext.getNameResolver(), proto.getName());
        CallableMemberDescriptor.Kind kindMemberKind = ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags, Flags.MEMBER_KIND.get(i10));
        Boolean bool2 = Flags.IS_LATEINIT.get(i10);
        AbstractC16544l.m18093f(bool2, "get(...)");
        boolean zBooleanValue2 = bool2.booleanValue();
        Boolean bool3 = Flags.IS_CONST.get(i10);
        AbstractC16544l.m18093f(bool3, "get(...)");
        boolean zBooleanValue3 = bool3.booleanValue();
        Boolean bool4 = Flags.IS_EXTERNAL_PROPERTY.get(i10);
        AbstractC16544l.m18093f(bool4, "get(...)");
        boolean zBooleanValue4 = bool4.booleanValue();
        Boolean bool5 = Flags.IS_DELEGATED.get(i10);
        AbstractC16544l.m18093f(bool5, "get(...)");
        boolean zBooleanValue5 = bool5.booleanValue();
        Boolean bool6 = Flags.IS_EXPECT_PROPERTY.get(i10);
        AbstractC16544l.m18093f(bool6, "get(...)");
        DeserializedPropertyDescriptor deserializedPropertyDescriptor3 = new DeserializedPropertyDescriptor(containingDeclaration, null, annotationsM18370b, modality, descriptorVisibility, zBooleanValue, name, kindMemberKind, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, bool6.booleanValue(), proto, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getVersionRequirementTable(), deserializationContext.getContainerSource());
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        AbstractC16544l.m18093f(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(this.f53038a, deserializedPropertyDescriptor3, typeParameterList, null, null, null, null, 60, null);
        Boolean bool7 = Flags.HAS_GETTER.get(i10);
        AbstractC16544l.m18093f(bool7, "get(...)");
        boolean zBooleanValue6 = bool7.booleanValue();
        if (zBooleanValue6 && ProtoTypeTableUtilKt.hasReceiver(proto)) {
            property = proto;
            empty = new DeserializedAnnotations(deserializationContext.getStorageManager(), new C17072d(this, property, AnnotatedCallableKind.PROPERTY_GETTER, 1));
        } else {
            property = proto;
            empty = Annotations.Companion.getEMPTY();
        }
        KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(property, deserializationContext.getTypeTable()));
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        DeclarationDescriptor containingDeclaration2 = deserializationContext.getContainingDeclaration();
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = null;
        ClassDescriptor classDescriptor2 = containingDeclaration2 instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration2 : null;
        ReceiverParameterDescriptor thisAsReceiverParameter = classDescriptor2 != null ? classDescriptor2.getThisAsReceiverParameter() : null;
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(property, deserializationContext.getTypeTable());
        if (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) {
            deserializedPropertyDescriptor = deserializedPropertyDescriptor3;
            receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = null;
        } else {
            deserializedPropertyDescriptor = deserializedPropertyDescriptor3;
            receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, kotlinTypeType, empty);
        }
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(property, deserializationContext.getTypeTable());
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listContextReceiverTypes, 10));
        int i11 = 0;
        for (Object obj : listContextReceiverTypes) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            arrayList.add(DescriptorFactory.createContextReceiverParameterForCallable(deserializedPropertyDescriptor, deserializationContextChildContext$default.getTypeDeserializer().type((ProtoBuf.Type) obj), null, Annotations.Companion.getEMPTY(), i11));
            i11 = i12;
        }
        deserializedPropertyDescriptor.setType(kotlinTypeType2, ownTypeParameters, thisAsReceiverParameter, receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, arrayList);
        Boolean bool8 = Flags.HAS_ANNOTATIONS.get(i10);
        AbstractC16544l.m18093f(bool8, "get(...)");
        boolean zBooleanValue7 = bool8.booleanValue();
        Flags.FlagField<ProtoBuf.Visibility> flagField = Flags.VISIBILITY;
        ProtoBuf.Visibility visibility = flagField.get(i10);
        Flags.FlagField<ProtoBuf.Modality> flagField2 = Flags.MODALITY;
        int accessorFlags = Flags.getAccessorFlags(zBooleanValue7, visibility, flagField2.get(i10), false, false, false);
        if (zBooleanValue6) {
            int getterFlags = proto.hasGetterFlags() ? proto.getGetterFlags() : accessorFlags;
            Boolean bool9 = Flags.IS_NOT_DEFAULT.get(getterFlags);
            AbstractC16544l.m18093f(bool9, "get(...)");
            boolean zBooleanValue8 = bool9.booleanValue();
            Boolean bool10 = Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags);
            AbstractC16544l.m18093f(bool10, "get(...)");
            boolean zBooleanValue9 = bool10.booleanValue();
            Boolean bool11 = Flags.IS_INLINE_ACCESSOR.get(getterFlags);
            AbstractC16544l.m18093f(bool11, "get(...)");
            boolean zBooleanValue10 = bool11.booleanValue();
            Annotations annotationsM18370b2 = m18370b(property, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
            if (zBooleanValue8) {
                ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.INSTANCE;
                deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
                propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotationsM18370b2, protoEnumFlags2.modality(flagField2.get(getterFlags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField.get(getterFlags)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
            } else {
                DeserializedPropertyDescriptor deserializedPropertyDescriptor4 = deserializedPropertyDescriptor;
                PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor4, annotationsM18370b2);
                AbstractC16544l.m18091d(propertyGetterDescriptorImplCreateDefaultGetter);
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
                deserializedPropertyDescriptor2 = deserializedPropertyDescriptor4;
            }
            propertyGetterDescriptorImpl.initialize(deserializedPropertyDescriptor2.getReturnType());
            r6 = deserializedPropertyDescriptor2;
        } else {
            flagField2 = flagField2;
            flagField = flagField;
            r6 = deserializedPropertyDescriptor;
            propertyGetterDescriptorImpl = null;
        }
        if (Flags.HAS_SETTER.get(i10).booleanValue()) {
            if (proto.hasSetterFlags()) {
                accessorFlags = proto.getSetterFlags();
            }
            int i13 = accessorFlags;
            Boolean bool12 = Flags.IS_NOT_DEFAULT.get(i13);
            AbstractC16544l.m18093f(bool12, "get(...)");
            boolean zBooleanValue11 = bool12.booleanValue();
            Boolean bool13 = Flags.IS_EXTERNAL_ACCESSOR.get(i13);
            AbstractC16544l.m18093f(bool13, "get(...)");
            boolean zBooleanValue12 = bool13.booleanValue();
            Boolean bool14 = Flags.IS_INLINE_ACCESSOR.get(i13);
            AbstractC16544l.m18093f(bool14, "get(...)");
            boolean zBooleanValue13 = bool14.booleanValue();
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotationsM18370b3 = m18370b(property, i13, annotatedCallableKind);
            if (zBooleanValue11) {
                ProtoEnumFlags protoEnumFlags3 = ProtoEnumFlags.INSTANCE;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(r6, annotationsM18370b3, protoEnumFlags3.modality(flagField2.get(i13)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags3, flagField.get(i13)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, r6.getKind(), null, SourceElement.NO_SOURCE);
                propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) AbstractC17680n.m19365o0(DeserializationContext.childContext$default(deserializationContextChildContext$default, propertySetterDescriptorImpl, C17689w.f56480Y, null, null, null, null, 60, null).getMemberDeserializer().m18372d(AbstractC9393x3.m9974d(proto.getSetterValueParameter()), property, annotatedCallableKind)));
                r14 = propertySetterDescriptorImpl;
            } else {
                PropertySetterDescriptorImpl propertySetterDescriptorImplCreateDefaultSetter = DescriptorFactory.createDefaultSetter(r6, annotationsM18370b3, Annotations.Companion.getEMPTY());
                AbstractC16544l.m18091d(propertySetterDescriptorImplCreateDefaultSetter);
                r14 = propertySetterDescriptorImplCreateDefaultSetter;
            }
        } else {
            r14 = propertyGetterDescriptorImpl;
        }
        if (Flags.HAS_CONSTANT.get(i10).booleanValue()) {
            r6.setCompileTimeInitializerFactory(new C17071c(this, property, r6, 0));
        }
        DeclarationDescriptor containingDeclaration3 = deserializationContext.getContainingDeclaration();
        if (containingDeclaration3 instanceof ClassDescriptor) {
            classDescriptor = (ClassDescriptor) containingDeclaration3;
        } else {
            r10 = propertyGetterDescriptorImpl;
        }
        if (r10 != 0) {
            r10 = classDescriptor;
            kind = r10.getKind();
        } else {
            r10 = classDescriptor;
            kind = propertyGetterDescriptorImpl;
        }
        if (kind == ClassKind.ANNOTATION_CLASS) {
            r6.setCompileTimeInitializerFactory(new C17071c(this, property, r6, 1));
        }
        r6.initialize(propertyGetterDescriptorImpl, r14, new FieldDescriptorImpl(m18371c(property, false), r6), new FieldDescriptorImpl(m18371c(property, true), r6));
        return r6;
    }

    public final TypeAliasDescriptor loadTypeAlias(ProtoBuf.TypeAlias typeAlias) {
        AbstractC16544l.m18094g(typeAlias, VjclRfeKsMflo.vJbsISjKbyLbNsH);
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = typeAlias.getAnnotationList();
        AbstractC16544l.m18093f(annotationList, "getAnnotationList(...)");
        List<ProtoBuf.Annotation> list = annotationList;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            DeserializationContext deserializationContext = this.f53038a;
            if (!zHasNext) {
                DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(deserializationContext.getStorageManager(), deserializationContext.getContainingDeclaration(), companion.create(arrayList), NameResolverUtilKt.getName(deserializationContext.getNameResolver(), typeAlias.getName()), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(typeAlias.getFlags())), typeAlias, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), deserializationContext.getVersionRequirementTable(), deserializationContext.getContainerSource());
                List<ProtoBuf.TypeParameter> typeParameterList = typeAlias.getTypeParameterList();
                AbstractC16544l.m18093f(typeParameterList, "getTypeParameterList(...)");
                DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(this.f53038a, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
                deserializedTypeAliasDescriptor.initialize(deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters(), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(typeAlias, deserializationContext.getTypeTable()), false), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(typeAlias, deserializationContext.getTypeTable()), false));
                return deserializedTypeAliasDescriptor;
            }
            ProtoBuf.Annotation annotation = (ProtoBuf.Annotation) it.next();
            AbstractC16544l.m18091d(annotation);
            arrayList.add(this.f53039b.deserializeAnnotation(annotation, deserializationContext.getNameResolver()));
        }
    }
}
