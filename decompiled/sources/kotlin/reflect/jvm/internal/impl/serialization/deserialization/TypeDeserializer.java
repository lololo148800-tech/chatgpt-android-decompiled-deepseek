package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import cn.UfGr.EhBykzn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p1091wn.AbstractC21031l;
import p1091wn.C21036q;
import p298Lm.C5150L;
import p877ln.C17075g;
import p877ln.C17076h;
import p877ln.C17077i;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeDeserializer {

    /* JADX INFO: renamed from: a */
    public final DeserializationContext f53053a;

    /* JADX INFO: renamed from: b */
    public final TypeDeserializer f53054b;

    /* JADX INFO: renamed from: c */
    public final String f53055c;

    /* JADX INFO: renamed from: d */
    public final String f53056d;

    /* JADX INFO: renamed from: e */
    public final MemoizedFunctionToNullable f53057e;

    /* JADX INFO: renamed from: f */
    public final MemoizedFunctionToNullable f53058f;

    /* JADX INFO: renamed from: g */
    public final Object f53059g;

    /* JADX INFO: renamed from: a */
    public static SimpleType m18373a(SimpleType simpleType, KotlinType kotlinType) {
        KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(simpleType);
        Annotations annotations = simpleType.getAnnotations();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(simpleType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(simpleType);
        List listM19337M = AbstractC17680n.m19337M(1, FunctionTypesKt.getValueParameterTypesFromFunctionType(simpleType));
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM19337M, 10));
        Iterator it = listM19337M.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, contextReceiverTypesFromFunctionType, arrayList, null, kotlinType, true).makeNullableAsSpecified(simpleType.isMarkedNullable());
    }

    /* JADX INFO: renamed from: c */
    public static final ArrayList m18374c(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        AbstractC16544l.m18093f(argumentList, "getArgumentList(...)");
        List<ProtoBuf.Type.Argument> list = argumentList;
        ProtoBuf.Type typeOuterType = ProtoTypeTableUtilKt.outerType(type, typeDeserializer.f53053a.getTypeTable());
        Iterable iterableM18374c = typeOuterType != null ? m18374c(typeOuterType, typeDeserializer) : null;
        if (iterableM18374c == null) {
            iterableM18374c = C17689w.f56480Y;
        }
        return AbstractC17680n.m19361k0(iterableM18374c, list);
    }

    /* JADX INFO: renamed from: d */
    public static TypeAttributes m18375d(List list, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeAttributeTranslator) it.next()).toAttributes(annotations, typeConstructor, declarationDescriptor));
        }
        return TypeAttributes.Companion.create(AbstractC17682p.m19390s(arrayList));
    }

    /* JADX INFO: renamed from: e */
    public static final ClassDescriptor m18376e(TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i10) {
        ClassId classId = NameResolverUtilKt.getClassId(typeDeserializer.f53053a.getNameResolver(), i10);
        C21036q c21036qM21495s = AbstractC21031l.m21495s(AbstractC21031l.m21492p(new C17075g(typeDeserializer, 2), type), C17076h.f54567Y);
        ArrayList arrayList = new ArrayList();
        Iterator it = c21036qM21495s.f66917a.iterator();
        while (it.hasNext()) {
            arrayList.add(c21036qM21495s.f66918b.invoke(it.next()));
        }
        int iM21485i = AbstractC21031l.m21485i(AbstractC21031l.m21492p(C17077i.f54568Y, classId));
        while (arrayList.size() < iM21485i) {
            arrayList.add(0);
        }
        return typeDeserializer.f53053a.getComponents().getNotFoundClasses().getClass(classId, arrayList);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeDeserializer typeDeserializer, ProtoBuf.Type type, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = true;
        }
        return typeDeserializer.simpleType(type, z6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final TypeParameterDescriptor m18377b(int i10) {
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) this.f53059g.get(Integer.valueOf(i10));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.f53054b;
        if (typeDeserializer != null) {
            return typeDeserializer.m18377b(i10);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final List<TypeParameterDescriptor> getOwnTypeParameters() {
        return AbstractC17680n.m19322C0(this.f53059g.values());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:116:0x031e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0321  */
    /* JADX WARN: Code duplicated, block: B:119:0x032c A[PHI: r4
      0x032c: PHI (r4v7 java.lang.Object) = (r4v5 java.lang.Object), (r4v14 java.lang.Object) binds: [B:123:0x035e, B:117:0x031f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x032e  */
    /* JADX WARN: Code duplicated, block: B:122:0x034e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0361  */
    /* JADX WARN: Code duplicated, block: B:12:0x0056  */
    /* JADX WARN: Code duplicated, block: B:135:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0138  */
    /* JADX WARN: Code duplicated, block: B:49:0x0149  */
    /* JADX WARN: Code duplicated, block: B:52:0x0183  */
    /* JADX WARN: Code duplicated, block: B:54:0x018b  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:59:0x01be  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:62:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:78:0x0249  */
    /* JADX WARN: Code duplicated, block: B:80:0x0259  */
    /* JADX WARN: Code duplicated, block: B:82:0x026c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0271  */
    /* JADX WARN: Code duplicated, block: B:87:0x0292  */
    /* JADX WARN: Code duplicated, block: B:90:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:97:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:98:0x02c9  */
    /* JADX WARN: Instruction removed from duplicated block: B:125:0x0361, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v39, types: [kotlin.reflect.jvm.internal.impl.types.SimpleType] */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    public final SimpleType simpleType(ProtoBuf.Type proto, boolean z6) {
        SimpleType replacementTypeForLocalClassifiers;
        TypeConstructor typeConstructorCreateErrorTypeConstructor;
        ClassifierDescriptor classifierDescriptorM18376e;
        Object next;
        TypeAttributes typeAttributesM18375d;
        ArrayList arrayList;
        int i10;
        List<? extends TypeProjection> listM19322C0;
        SimpleType simpleTypeSimpleType$default;
        ?? CreateErrorTypeWithArguments;
        boolean nullable;
        int size;
        List<? extends TypeProjection> list;
        SimpleType simpleTypeSimpleType$default2;
        TypeProjection typeProjection;
        KotlinType type;
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor;
        FqName fqNameSafe;
        int size2;
        SimpleType simpleTypeWithAbbreviation;
        int i11;
        ProtoBuf.Type.Argument argument;
        TypeParameterDescriptor typeParameterDescriptor;
        Variance variance;
        ProtoBuf.Type type2;
        TypeProjectionBase typeProjectionImpl;
        TypeProjectionBase typeProjectionImpl2;
        AbstractC16544l.m18094g(proto, "proto");
        boolean zHasClassName = proto.hasClassName();
        DeserializationContext deserializationContext = this.f53053a;
        Object objMakeDefinitelyNotNull$default = null;
        if (zHasClassName) {
            if (NameResolverUtilKt.getClassId(deserializationContext.getNameResolver(), proto.getClassName()).isLocal()) {
                replacementTypeForLocalClassifiers = deserializationContext.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
            } else {
                replacementTypeForLocalClassifiers = null;
            }
        } else if (!proto.hasTypeAliasName()) {
            replacementTypeForLocalClassifiers = null;
        } else if (NameResolverUtilKt.getClassId(deserializationContext.getNameResolver(), proto.getTypeAliasName()).isLocal()) {
            replacementTypeForLocalClassifiers = deserializationContext.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        } else {
            replacementTypeForLocalClassifiers = null;
        }
        if (replacementTypeForLocalClassifiers != null) {
            return replacementTypeForLocalClassifiers;
        }
        if (!proto.hasClassName()) {
            if (proto.hasTypeParameter()) {
                classifierDescriptorM18376e = m18377b(proto.getTypeParameter());
                if (classifierDescriptorM18376e == null) {
                    typeConstructorCreateErrorTypeConstructor = ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(proto.getTypeParameter()), this.f53056d);
                }
            } else if (proto.hasTypeParameterName()) {
                String string = deserializationContext.getNameResolver().getString(proto.getTypeParameterName());
                Iterator it = getOwnTypeParameters().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC16544l.m18089b(((TypeParameterDescriptor) next).getName().asString(), string));
                TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) next;
                if (typeParameterDescriptor2 == null) {
                    typeConstructorCreateErrorTypeConstructor = ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, deserializationContext.getContainingDeclaration().toString());
                } else {
                    classifierDescriptorM18376e = typeParameterDescriptor2;
                }
            } else if (proto.hasTypeAliasName()) {
                classifierDescriptorM18376e = (ClassifierDescriptor) this.f53058f.invoke(Integer.valueOf(proto.getTypeAliasName()));
                if (classifierDescriptorM18376e == null) {
                    classifierDescriptorM18376e = m18376e(this, proto, proto.getTypeAliasName());
                }
            } else {
                typeConstructorCreateErrorTypeConstructor = ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
            }
            if (ErrorUtils.isError(typeConstructorCreateErrorTypeConstructor.mo22589getDeclarationDescriptor())) {
                return ErrorUtils.INSTANCE.createErrorType(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, typeConstructorCreateErrorTypeConstructor, typeConstructorCreateErrorTypeConstructor.toString());
            }
            DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(deserializationContext.getStorageManager(), new C5150L(this, 15, proto));
            typeAttributesM18375d = m18375d(deserializationContext.getComponents().getTypeAttributeTranslators(), deserializedAnnotations, typeConstructorCreateErrorTypeConstructor, deserializationContext.getContainingDeclaration());
            ArrayList arrayListM18374c = m18374c(proto, this);
            arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM18374c, 10));
            i10 = 0;
            for (Object obj : arrayListM18374c) {
                i11 = i10 + 1;
                if (i10 >= 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                argument = (ProtoBuf.Type.Argument) obj;
                List<TypeParameterDescriptor> parameters = typeConstructorCreateErrorTypeConstructor.getParameters();
                AbstractC16544l.m18093f(parameters, "getParameters(...)");
                typeParameterDescriptor = (TypeParameterDescriptor) AbstractC17680n.m19344T(i10, parameters);
                if (argument.getProjection() == ProtoBuf.Type.Argument.Projection.STAR) {
                    ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
                    ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
                    AbstractC16544l.m18093f(projection, "getProjection(...)");
                    variance = protoEnumFlags.variance(projection);
                    type2 = ProtoTypeTableUtilKt.type(argument, deserializationContext.getTypeTable());
                    if (type2 == null) {
                        typeProjectionImpl2 = new TypeProjectionImpl(ErrorUtils.createErrorType(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString()));
                    } else {
                        typeProjectionImpl = new TypeProjectionImpl(variance, type(type2));
                        typeProjectionImpl2 = typeProjectionImpl;
                    }
                } else if (typeParameterDescriptor == null) {
                    typeProjectionImpl2 = new StarProjectionForAbsentTypeParameter(deserializationContext.getComponents().getModuleDescriptor().getBuiltIns());
                } else {
                    typeProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                    typeProjectionImpl2 = typeProjectionImpl;
                }
                arrayList.add(typeProjectionImpl2);
                i10 = i11;
            }
            listM19322C0 = AbstractC17680n.m19322C0(arrayList);
            ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor2 = typeConstructorCreateErrorTypeConstructor.mo22589getDeclarationDescriptor();
            boolean z10 = true;
            if (!z6 && (classifierDescriptorMo22589getDeclarationDescriptor2 instanceof TypeAliasDescriptor)) {
                SimpleType simpleTypeComputeExpandedType = KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) classifierDescriptorMo22589getDeclarationDescriptor2, listM19322C0);
                TypeAttributes typeAttributesM18375d2 = m18375d(deserializationContext.getComponents().getTypeAttributeTranslators(), Annotations.Companion.create(AbstractC17680n.m19359i0(deserializedAnnotations, simpleTypeComputeExpandedType.getAnnotations())), typeConstructorCreateErrorTypeConstructor, deserializationContext.getContainingDeclaration());
                if (!KotlinTypeKt.isNullable(simpleTypeComputeExpandedType) && !proto.getNullable()) {
                    z10 = false;
                }
                CreateErrorTypeWithArguments = simpleTypeComputeExpandedType.makeNullableAsSpecified(z10).replaceAttributes(typeAttributesM18375d2);
            } else if (Flags.SUSPEND_TYPE.get(proto.getFlags()).booleanValue()) {
                nullable = proto.getNullable();
                size = typeConstructorCreateErrorTypeConstructor.getParameters().size() - listM19322C0.size();
                if (size != 0) {
                    if (size == 1 && (size2 = listM19322C0.size() - 1) >= 0) {
                        TypeConstructor typeConstructor = typeConstructorCreateErrorTypeConstructor.getBuiltIns().getSuspendFunction(size2).getTypeConstructor();
                        AbstractC16544l.m18093f(typeConstructor, "getTypeConstructor(...)");
                        objMakeDefinitelyNotNull$default = KotlinTypeFactory.simpleType$default(typeAttributesM18375d, typeConstructor, listM19322C0, nullable, (KotlinTypeRefiner) null, 16, (Object) null);
                    }
                    list = listM19322C0;
                } else {
                    list = listM19322C0;
                    simpleTypeSimpleType$default2 = KotlinTypeFactory.simpleType$default(typeAttributesM18375d, typeConstructorCreateErrorTypeConstructor, listM19322C0, nullable, (KotlinTypeRefiner) null, 16, (Object) null);
                    if (FunctionTypesKt.isFunctionType(simpleTypeSimpleType$default2) && (typeProjection = (TypeProjection) AbstractC17680n.m19353c0(FunctionTypesKt.getValueParameterTypesFromFunctionType(simpleTypeSimpleType$default2))) != null && (type = typeProjection.getType()) != null) {
                        classifierDescriptorMo22589getDeclarationDescriptor = type.getConstructor().mo22589getDeclarationDescriptor();
                        if (classifierDescriptorMo22589getDeclarationDescriptor != null) {
                            fqNameSafe = DescriptorUtilsKt.getFqNameSafe(classifierDescriptorMo22589getDeclarationDescriptor);
                        } else {
                            fqNameSafe = null;
                        }
                        if (type.getArguments().size() == 1 || !(AbstractC16544l.m18089b(fqNameSafe, StandardNames.CONTINUATION_INTERFACE_FQ_NAME) || AbstractC16544l.m18089b(fqNameSafe, TypeDeserializerKt.f53060a))) {
                            objMakeDefinitelyNotNull$default = simpleTypeSimpleType$default2;
                        } else {
                            KotlinType type3 = ((TypeProjection) AbstractC17680n.m19365o0(type.getArguments())).getType();
                            AbstractC16544l.m18093f(type3, "getType(...)");
                            DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
                            CallableDescriptor callableDescriptor = containingDeclaration instanceof CallableDescriptor ? (CallableDescriptor) containingDeclaration : null;
                            objMakeDefinitelyNotNull$default = AbstractC16544l.m18089b(callableDescriptor != null ? DescriptorUtilsKt.fqNameOrNull(callableDescriptor) : null, SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? m18373a(simpleTypeSimpleType$default2, type3) : m18373a(simpleTypeSimpleType$default2, type3);
                        }
                    }
                }
                if (objMakeDefinitelyNotNull$default == null) {
                    CreateErrorTypeWithArguments = ErrorUtils.INSTANCE.createErrorTypeWithArguments(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list, typeConstructorCreateErrorTypeConstructor, new String[0]);
                } else {
                    CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                    CreateErrorTypeWithArguments = objMakeDefinitelyNotNull$default;
                }
            } else {
                simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(typeAttributesM18375d, typeConstructorCreateErrorTypeConstructor, listM19322C0, proto.getNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
                if (Flags.DEFINITELY_NOT_NULL_TYPE.get(proto.getFlags()).booleanValue()) {
                    objMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleTypeSimpleType$default, true, false, 4, null);
                    if (objMakeDefinitelyNotNull$default == null) {
                        CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeSimpleType$default + '\'').toString());
                    }
                    CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                    CreateErrorTypeWithArguments = objMakeDefinitelyNotNull$default;
                }
            }
            CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
            ProtoBuf.Type typeAbbreviatedType = ProtoTypeTableUtilKt.abbreviatedType(proto, deserializationContext.getTypeTable());
            return (typeAbbreviatedType == null || (simpleTypeWithAbbreviation = SpecialTypesKt.withAbbreviation(CreateErrorTypeWithArguments, simpleType(typeAbbreviatedType, false))) == null) ? CreateErrorTypeWithArguments : simpleTypeWithAbbreviation;
        }
        classifierDescriptorM18376e = (ClassifierDescriptor) this.f53057e.invoke(Integer.valueOf(proto.getClassName()));
        if (classifierDescriptorM18376e == null) {
            classifierDescriptorM18376e = m18376e(this, proto, proto.getClassName());
        }
        typeConstructorCreateErrorTypeConstructor = classifierDescriptorM18376e.getTypeConstructor();
        AbstractC16544l.m18093f(typeConstructorCreateErrorTypeConstructor, "getTypeConstructor(...)");
        if (ErrorUtils.isError(typeConstructorCreateErrorTypeConstructor.mo22589getDeclarationDescriptor())) {
            return ErrorUtils.INSTANCE.createErrorType(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, typeConstructorCreateErrorTypeConstructor, typeConstructorCreateErrorTypeConstructor.toString());
        }
        DeserializedAnnotations deserializedAnnotations2 = new DeserializedAnnotations(deserializationContext.getStorageManager(), new C5150L(this, 15, proto));
        typeAttributesM18375d = m18375d(deserializationContext.getComponents().getTypeAttributeTranslators(), deserializedAnnotations2, typeConstructorCreateErrorTypeConstructor, deserializationContext.getContainingDeclaration());
        ArrayList arrayListM18374c2 = m18374c(proto, this);
        arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM18374c2, 10));
        i10 = 0;
        while (r8.hasNext()) {
            i11 = i10 + 1;
            if (i10 >= 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            argument = (ProtoBuf.Type.Argument) obj;
            List<TypeParameterDescriptor> parameters2 = typeConstructorCreateErrorTypeConstructor.getParameters();
            AbstractC16544l.m18093f(parameters2, "getParameters(...)");
            typeParameterDescriptor = (TypeParameterDescriptor) AbstractC17680n.m19344T(i10, parameters2);
            if (argument.getProjection() == ProtoBuf.Type.Argument.Projection.STAR) {
                ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.INSTANCE;
                ProtoBuf.Type.Argument.Projection projection2 = argument.getProjection();
                AbstractC16544l.m18093f(projection2, "getProjection(...)");
                variance = protoEnumFlags2.variance(projection2);
                type2 = ProtoTypeTableUtilKt.type(argument, deserializationContext.getTypeTable());
                if (type2 == null) {
                    typeProjectionImpl2 = new TypeProjectionImpl(ErrorUtils.createErrorType(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString()));
                } else {
                    typeProjectionImpl = new TypeProjectionImpl(variance, type(type2));
                    typeProjectionImpl2 = typeProjectionImpl;
                }
            } else if (typeParameterDescriptor == null) {
                typeProjectionImpl2 = new StarProjectionForAbsentTypeParameter(deserializationContext.getComponents().getModuleDescriptor().getBuiltIns());
            } else {
                typeProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                typeProjectionImpl2 = typeProjectionImpl;
            }
            arrayList.add(typeProjectionImpl2);
            i10 = i11;
        }
        listM19322C0 = AbstractC17680n.m19322C0(arrayList);
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor3 = typeConstructorCreateErrorTypeConstructor.mo22589getDeclarationDescriptor();
        boolean z11 = true;
        if (!z6) {
            if (Flags.SUSPEND_TYPE.get(proto.getFlags()).booleanValue()) {
                nullable = proto.getNullable();
                size = typeConstructorCreateErrorTypeConstructor.getParameters().size() - listM19322C0.size();
                if (size != 0) {
                    if (size == 1) {
                        TypeConstructor typeConstructor2 = typeConstructorCreateErrorTypeConstructor.getBuiltIns().getSuspendFunction(size2).getTypeConstructor();
                        AbstractC16544l.m18093f(typeConstructor2, "getTypeConstructor(...)");
                        objMakeDefinitelyNotNull$default = KotlinTypeFactory.simpleType$default(typeAttributesM18375d, typeConstructor2, listM19322C0, nullable, (KotlinTypeRefiner) null, 16, (Object) null);
                    }
                    list = listM19322C0;
                } else {
                    list = listM19322C0;
                    simpleTypeSimpleType$default2 = KotlinTypeFactory.simpleType$default(typeAttributesM18375d, typeConstructorCreateErrorTypeConstructor, listM19322C0, nullable, (KotlinTypeRefiner) null, 16, (Object) null);
                    if (FunctionTypesKt.isFunctionType(simpleTypeSimpleType$default2)) {
                        classifierDescriptorMo22589getDeclarationDescriptor = type.getConstructor().mo22589getDeclarationDescriptor();
                        if (classifierDescriptorMo22589getDeclarationDescriptor != null) {
                            fqNameSafe = DescriptorUtilsKt.getFqNameSafe(classifierDescriptorMo22589getDeclarationDescriptor);
                        } else {
                            fqNameSafe = null;
                        }
                        if (type.getArguments().size() == 1) {
                            objMakeDefinitelyNotNull$default = simpleTypeSimpleType$default2;
                        } else {
                            objMakeDefinitelyNotNull$default = simpleTypeSimpleType$default2;
                        }
                    }
                }
                if (objMakeDefinitelyNotNull$default == null) {
                    CreateErrorTypeWithArguments = ErrorUtils.INSTANCE.createErrorTypeWithArguments(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list, typeConstructorCreateErrorTypeConstructor, new String[0]);
                } else {
                    CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                    CreateErrorTypeWithArguments = objMakeDefinitelyNotNull$default;
                }
            } else {
                simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(typeAttributesM18375d, typeConstructorCreateErrorTypeConstructor, listM19322C0, proto.getNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
                if (Flags.DEFINITELY_NOT_NULL_TYPE.get(proto.getFlags()).booleanValue()) {
                    objMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleTypeSimpleType$default, true, false, 4, null);
                    if (objMakeDefinitelyNotNull$default == null) {
                        CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeSimpleType$default + '\'').toString());
                    }
                    CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                    CreateErrorTypeWithArguments = objMakeDefinitelyNotNull$default;
                }
            }
        } else if (Flags.SUSPEND_TYPE.get(proto.getFlags()).booleanValue()) {
            nullable = proto.getNullable();
            size = typeConstructorCreateErrorTypeConstructor.getParameters().size() - listM19322C0.size();
            if (size != 0) {
                if (size == 1) {
                    TypeConstructor typeConstructor3 = typeConstructorCreateErrorTypeConstructor.getBuiltIns().getSuspendFunction(size2).getTypeConstructor();
                    AbstractC16544l.m18093f(typeConstructor3, "getTypeConstructor(...)");
                    objMakeDefinitelyNotNull$default = KotlinTypeFactory.simpleType$default(typeAttributesM18375d, typeConstructor3, listM19322C0, nullable, (KotlinTypeRefiner) null, 16, (Object) null);
                }
                list = listM19322C0;
            } else {
                list = listM19322C0;
                simpleTypeSimpleType$default2 = KotlinTypeFactory.simpleType$default(typeAttributesM18375d, typeConstructorCreateErrorTypeConstructor, listM19322C0, nullable, (KotlinTypeRefiner) null, 16, (Object) null);
                if (FunctionTypesKt.isFunctionType(simpleTypeSimpleType$default2)) {
                    classifierDescriptorMo22589getDeclarationDescriptor = type.getConstructor().mo22589getDeclarationDescriptor();
                    if (classifierDescriptorMo22589getDeclarationDescriptor != null) {
                        fqNameSafe = DescriptorUtilsKt.getFqNameSafe(classifierDescriptorMo22589getDeclarationDescriptor);
                    } else {
                        fqNameSafe = null;
                    }
                    if (type.getArguments().size() == 1) {
                        objMakeDefinitelyNotNull$default = simpleTypeSimpleType$default2;
                    } else {
                        objMakeDefinitelyNotNull$default = simpleTypeSimpleType$default2;
                    }
                }
            }
            if (objMakeDefinitelyNotNull$default == null) {
                CreateErrorTypeWithArguments = ErrorUtils.INSTANCE.createErrorTypeWithArguments(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list, typeConstructorCreateErrorTypeConstructor, new String[0]);
            } else {
                CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                CreateErrorTypeWithArguments = objMakeDefinitelyNotNull$default;
            }
        } else {
            simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(typeAttributesM18375d, typeConstructorCreateErrorTypeConstructor, listM19322C0, proto.getNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
            if (Flags.DEFINITELY_NOT_NULL_TYPE.get(proto.getFlags()).booleanValue()) {
                objMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleTypeSimpleType$default, true, false, 4, null);
                if (objMakeDefinitelyNotNull$default == null) {
                    CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeSimpleType$default + '\'').toString());
                }
                CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
                CreateErrorTypeWithArguments = objMakeDefinitelyNotNull$default;
            }
        }
        CreateErrorTypeWithArguments = simpleTypeSimpleType$default;
        ProtoBuf.Type typeAbbreviatedType2 = ProtoTypeTableUtilKt.abbreviatedType(proto, deserializationContext.getTypeTable());
        if (typeAbbreviatedType2 == null) {
            return CreateErrorTypeWithArguments;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f53055c);
        TypeDeserializer typeDeserializer = this.f53054b;
        if (typeDeserializer == null) {
            str = "";
        } else {
            str = ". Child of " + typeDeserializer.f53055c;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final KotlinType type(ProtoBuf.Type proto) {
        AbstractC16544l.m18094g(proto, "proto");
        if (!proto.hasFlexibleTypeCapabilitiesId()) {
            return simpleType(proto, true);
        }
        DeserializationContext deserializationContext = this.f53053a;
        String string = deserializationContext.getNameResolver().getString(proto.getFlexibleTypeCapabilitiesId());
        SimpleType simpleTypeSimpleType$default = simpleType$default(this, proto, false, 2, null);
        ProtoBuf.Type typeFlexibleUpperBound = ProtoTypeTableUtilKt.flexibleUpperBound(proto, deserializationContext.getTypeTable());
        AbstractC16544l.m18091d(typeFlexibleUpperBound);
        return deserializationContext.getComponents().getFlexibleTypeDeserializer().create(proto, string, simpleTypeSimpleType$default, simpleType$default(this, typeFlexibleUpperBound, false, 2, null));
    }

    public TypeDeserializer(DeserializationContext c9, TypeDeserializer typeDeserializer, List<ProtoBuf.TypeParameter> typeParameterProtos, String debugName, String str) {
        Map linkedHashMap;
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(typeParameterProtos, "typeParameterProtos");
        AbstractC16544l.m18094g(debugName, "debugName");
        AbstractC16544l.m18094g(str, EhBykzn.GNKLtjESLgA);
        this.f53053a = c9;
        this.f53054b = typeDeserializer;
        this.f53055c = debugName;
        this.f53056d = str;
        this.f53057e = c9.getStorageManager().createMemoizedFunctionWithNullableValues(new C17075g(this, 0));
        this.f53058f = c9.getStorageManager().createMemoizedFunctionWithNullableValues(new C17075g(this, 1));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = C17690x.f56481Y;
        } else {
            linkedHashMap = new LinkedHashMap();
            int i10 = 0;
            for (ProtoBuf.TypeParameter typeParameter : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(typeParameter.getId()), new DeserializedTypeParameterDescriptor(this.f53053a, typeParameter, i10));
                i10++;
            }
        }
        this.f53059g = linkedHashMap;
    }
}
