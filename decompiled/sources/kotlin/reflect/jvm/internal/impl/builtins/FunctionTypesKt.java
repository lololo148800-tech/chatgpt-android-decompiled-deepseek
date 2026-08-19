package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import mm.C17309l;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17690x;
import p926of.yRae.sVDIzpC;

/* JADX INFO: loaded from: classes2.dex */
public final class FunctionTypesKt {
    public static final int contextFunctionTypeParamsCount(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        AnnotationDescriptor annotationDescriptorMo22585findAnnotation = kotlinType.getAnnotations().mo22585findAnnotation(StandardNames.FqNames.contextFunctionTypeParams);
        if (annotationDescriptorMo22585findAnnotation == null) {
            return 0;
        }
        ConstantValue constantValue = (ConstantValue) AbstractC17659D.m19243e(annotationDescriptorMo22585findAnnotation.getAllValueArguments(), StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME);
        AbstractC16544l.m18092e(constantValue, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((IntValue) constantValue).getValue().intValue();
    }

    public static final SimpleType createFunctionType(KotlinBuiltIns builtIns, Annotations annotations, KotlinType kotlinType, List<? extends KotlinType> contextReceiverTypes, List<? extends KotlinType> parameterTypes, List<Name> list, KotlinType returnType, boolean z6) {
        AbstractC16544l.m18094g(builtIns, "builtIns");
        AbstractC16544l.m18094g(annotations, "annotations");
        AbstractC16544l.m18094g(contextReceiverTypes, "contextReceiverTypes");
        AbstractC16544l.m18094g(parameterTypes, "parameterTypes");
        AbstractC16544l.m18094g(returnType, "returnType");
        List<TypeProjection> functionTypeArgumentProjections = getFunctionTypeArgumentProjections(kotlinType, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        ClassDescriptor functionDescriptor = getFunctionDescriptor(builtIns, contextReceiverTypes.size() + parameterTypes.size() + (kotlinType == null ? 0 : 1), z6);
        if (kotlinType != null) {
            annotations = withExtensionFunctionAnnotation(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = withContextReceiversFunctionAnnotation(annotations, builtIns, contextReceiverTypes.size());
        }
        return KotlinTypeFactory.simpleNotNullType(TypeAttributesKt.toDefaultAttributes(annotations), functionDescriptor, functionTypeArgumentProjections);
    }

    public static final List<KotlinType> getContextReceiverTypesFromFunctionType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        int iContextFunctionTypeParamsCount = contextFunctionTypeParamsCount(kotlinType);
        if (iContextFunctionTypeParamsCount == 0) {
            return C17689w.f56480Y;
        }
        List<TypeProjection> listSubList = kotlinType.getArguments().subList(0, iContextFunctionTypeParamsCount);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return arrayList;
    }

    public static final ClassDescriptor getFunctionDescriptor(KotlinBuiltIns builtIns, int i10, boolean z6) {
        AbstractC16544l.m18094g(builtIns, "builtIns");
        ClassDescriptor suspendFunction = z6 ? builtIns.getSuspendFunction(i10) : builtIns.getFunction(i10);
        AbstractC16544l.m18091d(suspendFunction);
        return suspendFunction;
    }

    public static final List<TypeProjection> getFunctionTypeArgumentProjections(KotlinType kotlinType, List<? extends KotlinType> contextReceiverTypes, List<? extends KotlinType> parameterTypes, List<Name> list, KotlinType returnType, KotlinBuiltIns builtIns) {
        Name name;
        AbstractC16544l.m18094g(contextReceiverTypes, "contextReceiverTypes");
        AbstractC16544l.m18094g(parameterTypes, "parameterTypes");
        AbstractC16544l.m18094g(returnType, "returnType");
        AbstractC16544l.m18094g(builtIns, "builtIns");
        int i10 = 0;
        ArrayList arrayList = new ArrayList(contextReceiverTypes.size() + parameterTypes.size() + (kotlinType != null ? 1 : 0) + 1);
        List<? extends KotlinType> list2 = contextReceiverTypes;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(TypeUtilsKt.asTypeProjection((KotlinType) it.next()));
        }
        arrayList.addAll(arrayList2);
        CollectionsKt.addIfNotNull(arrayList, kotlinType != null ? TypeUtilsKt.asTypeProjection(kotlinType) : null);
        for (Object obj : parameterTypes) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            KotlinType kotlinTypeReplaceAnnotations = (KotlinType) obj;
            if (list == null || (name = list.get(i10)) == null || name.isSpecial()) {
                name = null;
            }
            if (name != null) {
                FqName fqName = StandardNames.FqNames.parameterName;
                Name name2 = StandardNames.NAME;
                String strAsString = name.asString();
                AbstractC16544l.m18093f(strAsString, "asString(...)");
                kotlinTypeReplaceAnnotations = TypeUtilsKt.replaceAnnotations(kotlinTypeReplaceAnnotations, Annotations.Companion.create(AbstractC17680n.m19360j0(kotlinTypeReplaceAnnotations.getAnnotations(), new BuiltInAnnotationDescriptor(builtIns, fqName, AbstractC17660E.m19258c(new C17309l(name2, new StringValue(strAsString))), false, 8, null))));
            }
            arrayList.add(TypeUtilsKt.asTypeProjection(kotlinTypeReplaceAnnotations));
            i10 = i11;
        }
        arrayList.add(TypeUtilsKt.asTypeProjection(returnType));
        return arrayList;
    }

    public static final FunctionTypeKind getFunctionTypeKind(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor != null) {
            return getFunctionTypeKind(classifierDescriptorMo22589getDeclarationDescriptor);
        }
        return null;
    }

    public static final KotlinType getReceiverTypeFromFunctionType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        if (kotlinType.getAnnotations().mo22585findAnnotation(StandardNames.FqNames.extensionFunctionType) != null) {
            return kotlinType.getArguments().get(contextFunctionTypeParamsCount(kotlinType)).getType();
        }
        return null;
    }

    public static final KotlinType getReturnTypeFromFunctionType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        KotlinType type = ((TypeProjection) AbstractC17680n.m19351a0(kotlinType.getArguments())).getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        return type;
    }

    public static final List<TypeProjection> getValueParameterTypesFromFunctionType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        List<TypeProjection> arguments = kotlinType.getArguments();
        return arguments.subList((isBuiltinExtensionFunctionalType(kotlinType) ? 1 : 0) + contextFunctionTypeParamsCount(kotlinType), arguments.size() - 1);
    }

    public static final boolean isBuiltinExtensionFunctionalType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return isBuiltinFunctionalType(kotlinType) && kotlinType.getAnnotations().mo22585findAnnotation(StandardNames.FqNames.extensionFunctionType) != null;
    }

    public static final boolean isBuiltinFunctionalClassDescriptor(DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(declarationDescriptor, "<this>");
        FunctionTypeKind functionTypeKind = getFunctionTypeKind(declarationDescriptor);
        return AbstractC16544l.m18089b(functionTypeKind, FunctionTypeKind.Function.INSTANCE) || AbstractC16544l.m18089b(functionTypeKind, FunctionTypeKind.SuspendFunction.INSTANCE);
    }

    public static final boolean isBuiltinFunctionalType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        return classifierDescriptorMo22589getDeclarationDescriptor != null && isBuiltinFunctionalClassDescriptor(classifierDescriptorMo22589getDeclarationDescriptor);
    }

    public static final boolean isFunctionType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return AbstractC16544l.m18089b(getFunctionTypeKind(kotlinType), FunctionTypeKind.Function.INSTANCE);
    }

    public static final boolean isSuspendFunctionType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return AbstractC16544l.m18089b(getFunctionTypeKind(kotlinType), FunctionTypeKind.SuspendFunction.INSTANCE);
    }

    public static final Annotations withContextReceiversFunctionAnnotation(Annotations annotations, KotlinBuiltIns builtIns, int i10) {
        AbstractC16544l.m18094g(annotations, "<this>");
        AbstractC16544l.m18094g(builtIns, "builtIns");
        FqName fqName = StandardNames.FqNames.contextFunctionTypeParams;
        if (annotations.hasAnnotation(fqName)) {
            return annotations;
        }
        return Annotations.Companion.create(AbstractC17680n.m19360j0(annotations, new BuiltInAnnotationDescriptor(builtIns, fqName, AbstractC17660E.m19258c(new C17309l(StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME, new IntValue(i10))), false, 8, null)));
    }

    public static final Annotations withExtensionFunctionAnnotation(Annotations annotations, KotlinBuiltIns builtIns) {
        AbstractC16544l.m18094g(annotations, "<this>");
        AbstractC16544l.m18094g(builtIns, "builtIns");
        FqName fqName = StandardNames.FqNames.extensionFunctionType;
        if (annotations.hasAnnotation(fqName)) {
            return annotations;
        }
        return Annotations.Companion.create(AbstractC17680n.m19360j0(annotations, new BuiltInAnnotationDescriptor(builtIns, fqName, C17690x.f56481Y, false, 8, null)));
    }

    public static final Name extractParameterNameFromFunctionTypeArgument(KotlinType kotlinType) {
        String value;
        AbstractC16544l.m18094g(kotlinType, sVDIzpC.DTxFG);
        AnnotationDescriptor annotationDescriptorMo22585findAnnotation = kotlinType.getAnnotations().mo22585findAnnotation(StandardNames.FqNames.parameterName);
        if (annotationDescriptorMo22585findAnnotation == null) {
            return null;
        }
        Object objM19366p0 = AbstractC17680n.m19366p0(annotationDescriptorMo22585findAnnotation.getAllValueArguments().values());
        StringValue stringValue = objM19366p0 instanceof StringValue ? (StringValue) objM19366p0 : null;
        if (stringValue != null && (value = stringValue.getValue()) != null) {
            if (!Name.isValidIdentifier(value)) {
                value = null;
            }
            if (value != null) {
                return Name.identifier(value);
            }
        }
        return null;
    }

    public static final FunctionTypeKind getFunctionTypeKind(DeclarationDescriptor declarationDescriptor) {
        AbstractC16544l.m18094g(declarationDescriptor, "<this>");
        if (!(declarationDescriptor instanceof ClassDescriptor) || !KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor);
        if (!fqNameUnsafe.isSafe() || fqNameUnsafe.isRoot()) {
            return null;
        }
        FunctionTypeKindExtractor functionTypeKindExtractor = FunctionTypeKindExtractor.Companion.getDefault();
        FqName fqNameParent = fqNameUnsafe.toSafe().parent();
        String strAsString = fqNameUnsafe.shortName().asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        return functionTypeKindExtractor.getFunctionalClassKind(fqNameParent, strAsString);
    }
}
