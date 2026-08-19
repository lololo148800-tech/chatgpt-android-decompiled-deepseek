package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionNInfo;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p077Cn.C1756x;
import p1113xn.AbstractC21329w;
import p648an.C10759g;
import p648an.C10761i;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class SignatureEnhancement {

    /* JADX INFO: renamed from: a */
    public final JavaTypeEnhancement f51997a;

    public SignatureEnhancement(JavaTypeEnhancement typeEnhancement) {
        AbstractC16544l.m18094g(typeEnhancement, "typeEnhancement");
        this.f51997a = typeEnhancement;
    }

    /* JADX INFO: renamed from: a */
    public final KotlinType m18232a(JavaCallableMemberDescriptor javaCallableMemberDescriptor, CallableDescriptor callableDescriptor, boolean z6, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z10, InterfaceC1436k interfaceC1436k) {
        C10761i c10761i = new C10761i(callableDescriptor, z6, lazyJavaResolverContext, annotationQualifierApplicabilityType, false);
        KotlinType kotlinType = (KotlinType) interfaceC1436k.invoke(javaCallableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = javaCallableMemberDescriptor.getOverriddenDescriptors();
        AbstractC16544l.m18093f(overriddenDescriptors, "getOverriddenDescriptors(...)");
        Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collection, 10));
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            AbstractC16544l.m18091d(callableMemberDescriptor);
            arrayList.add((KotlinType) interfaceC1436k.invoke(callableMemberDescriptor));
        }
        return this.f51997a.enhance(kotlinType, c10761i.computeIndexedQualifiers(kotlinType, arrayList, typeEnhancementInfo, z10), c10761i.f31977e);
    }

    /* JADX WARN: Code duplicated, block: B:146:0x029f  */
    /* JADX WARN: Code duplicated, block: B:167:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:169:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:171:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:176:0x0306  */
    /* JADX WARN: Code duplicated, block: B:178:0x030e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0312  */
    /* JADX WARN: Code duplicated, block: B:185:0x032f  */
    /* JADX WARN: Code duplicated, block: B:192:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0166  */
    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(LazyJavaResolverContext c9, Collection<? extends D> platformSignatures) {
        Annotations annotations;
        CallableDescriptor callableDescriptor;
        KotlinType type;
        PredefinedFunctionEnhancementInfo warningModeClone;
        boolean z6;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        KotlinType type2;
        ReceiverParameterDescriptor extensionReceiverParameter;
        boolean z10;
        KotlinType type3;
        LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers;
        List<TypeEnhancementInfo> parametersInfo;
        String errorsSinceLanguageVersion;
        LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers2;
        PropertyDescriptorImpl propertyDescriptorImpl;
        PropertyGetterDescriptorImpl getter;
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(platformSignatures, "platformSignatures");
        Collection<? extends D> collection = platformSignatures;
        int i13 = 10;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            CallableMemberDescriptor callableMemberDescriptorEnhance = (CallableMemberDescriptor) it.next();
            if (callableMemberDescriptorEnhance instanceof JavaCallableMemberDescriptor) {
                boolean z11 = true;
                if (callableMemberDescriptorEnhance.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && callableMemberDescriptorEnhance.getOriginal().getOverriddenDescriptors().size() == 1) {
                    i10 = i13;
                } else {
                    ClassifierDescriptor topLevelContainingClassifier = DescriptorUtilKt.getTopLevelContainingClassifier(callableMemberDescriptorEnhance);
                    if (topLevelContainingClassifier == null) {
                        annotations = callableMemberDescriptorEnhance.getAnnotations();
                    } else {
                        LazyJavaClassDescriptor lazyJavaClassDescriptor = topLevelContainingClassifier instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) topLevelContainingClassifier : null;
                        List<JavaAnnotation> moduleAnnotations = lazyJavaClassDescriptor != null ? lazyJavaClassDescriptor.getModuleAnnotations() : null;
                        List<JavaAnnotation> list = moduleAnnotations;
                        if (list == null || list.isEmpty()) {
                            annotations = callableMemberDescriptorEnhance.getAnnotations();
                        } else {
                            List<JavaAnnotation> list2 = moduleAnnotations;
                            ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list2, i13));
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(new LazyJavaAnnotationDescriptor(c9, (JavaAnnotation) it2.next(), true));
                            }
                            annotations = Annotations.Companion.create(AbstractC17680n.m19359i0(callableMemberDescriptorEnhance.getAnnotations(), arrayList3));
                        }
                    }
                    LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers3 = ContextKt.copyWithNewDefaultTypeQualifiers(c9, annotations);
                    if (!(callableMemberDescriptorEnhance instanceof JavaPropertyDescriptor) || (getter = (propertyDescriptorImpl = (PropertyDescriptorImpl) callableMemberDescriptorEnhance).getGetter()) == null || getter.isDefault()) {
                        callableDescriptor = callableMemberDescriptorEnhance;
                    } else {
                        CallableDescriptor getter2 = propertyDescriptorImpl.getGetter();
                        AbstractC16544l.m18091d(getter2);
                        callableDescriptor = getter2;
                    }
                    if (callableMemberDescriptorEnhance.getExtensionReceiverParameter() != null) {
                        FunctionDescriptor functionDescriptor = callableDescriptor instanceof FunctionDescriptor ? (FunctionDescriptor) callableDescriptor : null;
                        CallableDescriptor callableDescriptor2 = functionDescriptor != null ? (ValueParameterDescriptor) functionDescriptor.getUserData(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER) : null;
                        type = m18232a((JavaCallableMemberDescriptor) callableMemberDescriptorEnhance, callableDescriptor2, false, (callableDescriptor2 == null || (lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers2 = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers3, callableDescriptor2.getAnnotations())) == null) ? lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers3 : lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers2, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, null, false, C10759g.f31967Z);
                    } else {
                        type = null;
                    }
                    JavaMethodDescriptor javaMethodDescriptor = callableMemberDescriptorEnhance instanceof JavaMethodDescriptor ? (JavaMethodDescriptor) callableMemberDescriptorEnhance : null;
                    if (javaMethodDescriptor != null) {
                        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                        DeclarationDescriptor containingDeclaration = javaMethodDescriptor.getContainingDeclaration();
                        AbstractC16544l.m18092e(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        String strSignature = MethodSignatureBuildingUtilsKt.signature(signatureBuildingComponents, (ClassDescriptor) containingDeclaration, MethodSignatureMappingKt.computeJvmDescriptor$default(javaMethodDescriptor, false, false, 3, null));
                        if (strSignature == null || (warningModeClone = PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE().get(strSignature)) == null) {
                            warningModeClone = null;
                        } else {
                            if (warningModeClone.getErrorsSinceLanguageVersion() != null && ((errorsSinceLanguageVersion = warningModeClone.getErrorsSinceLanguageVersion()) == null || !AbstractC21329w.m21734u(errorsSinceLanguageVersion, "2.", false))) {
                                throw new IllegalStateException("Check failed.");
                            }
                            if (warningModeClone.getErrorsSinceLanguageVersion() != null) {
                                warningModeClone = warningModeClone.getWarningModeClone();
                            }
                        }
                    } else {
                        warningModeClone = null;
                    }
                    if (warningModeClone != null) {
                        warningModeClone.getParametersInfo().size();
                        ((JavaMethodDescriptor) callableMemberDescriptorEnhance).getValueParameters().size();
                    }
                    boolean z12 = (UtilsKt.isJspecifyEnabledInStrictMode(c9.getComponents().getJavaTypeEnhancementState()) || lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers3.getComponents().getSettings().getIgnoreNullabilityForErasedValueParameters()) && UtilsKt.hasErasedValueParameters(callableMemberDescriptorEnhance);
                    List<ValueParameterDescriptor> valueParameters = callableDescriptor.getValueParameters();
                    AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
                    List<ValueParameterDescriptor> list3 = valueParameters;
                    ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(list3, i13));
                    for (ValueParameterDescriptor valueParameterDescriptor : list3) {
                        arrayList4.add(m18232a((JavaCallableMemberDescriptor) callableMemberDescriptorEnhance, valueParameterDescriptor, false, (valueParameterDescriptor == null || (lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers3, valueParameterDescriptor.getAnnotations())) == null) ? lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers3 : lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, (warningModeClone == null || (parametersInfo = warningModeClone.getParametersInfo()) == null) ? null : (TypeEnhancementInfo) AbstractC17680n.m19344T(valueParameterDescriptor.getIndex(), parametersInfo), z12, new C1756x(valueParameterDescriptor, 18)));
                    }
                    PropertyDescriptor propertyDescriptor = callableMemberDescriptorEnhance instanceof PropertyDescriptor ? (PropertyDescriptor) callableMemberDescriptorEnhance : null;
                    KotlinType kotlinTypeM18232a = m18232a((JavaCallableMemberDescriptor) callableMemberDescriptorEnhance, callableDescriptor, true, lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers3, (propertyDescriptor == null || !JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) ? AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE : AnnotationQualifierApplicabilityType.FIELD, warningModeClone != null ? warningModeClone.getReturnTypeInfo() : null, false, C10759g.f31968o0);
                    KotlinType returnType = callableMemberDescriptorEnhance.getReturnType();
                    AbstractC16544l.m18091d(returnType);
                    C10759g c10759g = C10759g.f31970q0;
                    if (TypeUtils.contains(returnType, c10759g)) {
                        z6 = true;
                    } else {
                        ReceiverParameterDescriptor extensionReceiverParameter2 = callableMemberDescriptorEnhance.getExtensionReceiverParameter();
                        if ((extensionReceiverParameter2 == null || (type3 = extensionReceiverParameter2.getType()) == null) ? false : TypeUtils.contains(type3, c10759g)) {
                            z6 = true;
                        } else {
                            List<ValueParameterDescriptor> valueParameters2 = callableMemberDescriptorEnhance.getValueParameters();
                            AbstractC16544l.m18093f(valueParameters2, "getValueParameters(...)");
                            List<ValueParameterDescriptor> list4 = valueParameters2;
                            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                Iterator<T> it3 = list4.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z10 = false;
                                        break;
                                    }
                                    KotlinType type4 = ((ValueParameterDescriptor) it3.next()).getType();
                                    AbstractC16544l.m18093f(type4, "getType(...)");
                                    if (TypeUtils.contains(type4, c10759g)) {
                                        z10 = true;
                                        break;
                                    }
                                }
                            } else {
                                z10 = false;
                                break;
                            }
                            if (z10) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                    }
                    C17309l c17309l = z6 ? new C17309l(DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionNInfo(callableMemberDescriptorEnhance)) : null;
                    if (type == null && kotlinTypeM18232a == null) {
                        if (arrayList4.isEmpty()) {
                            z11 = false;
                            break;
                        }
                        Iterator it4 = arrayList4.iterator();
                        do {
                            if (!it4.hasNext()) {
                                z11 = false;
                                break;
                            }
                        } while (!(((KotlinType) it4.next()) != null));
                        if (z11 || c17309l != null) {
                            JavaCallableMemberDescriptor javaCallableMemberDescriptor = (JavaCallableMemberDescriptor) callableMemberDescriptorEnhance;
                            if (type == null) {
                                extensionReceiverParameter = callableMemberDescriptorEnhance.getExtensionReceiverParameter();
                                if (extensionReceiverParameter != null) {
                                    type = extensionReceiverParameter.getType();
                                } else {
                                    type = null;
                                }
                            }
                            i10 = 10;
                            arrayList = new ArrayList(AbstractC17682p.m19389r(arrayList4, 10));
                            i11 = 0;
                            for (Object obj : arrayList4) {
                                i12 = i11 + 1;
                                if (i11 >= 0) {
                                    AbstractC17681o.m19388q();
                                    throw null;
                                }
                                type2 = (KotlinType) obj;
                                if (type2 == null) {
                                    type2 = callableMemberDescriptorEnhance.getValueParameters().get(i11).getType();
                                    AbstractC16544l.m18093f(type2, "getType(...)");
                                }
                                arrayList.add(type2);
                                i11 = i12;
                            }
                            if (kotlinTypeM18232a == null) {
                                kotlinTypeM18232a = callableMemberDescriptorEnhance.getReturnType();
                                AbstractC16544l.m18091d(kotlinTypeM18232a);
                            }
                            callableMemberDescriptorEnhance = javaCallableMemberDescriptor.enhance(type, arrayList, kotlinTypeM18232a, c17309l);
                            AbstractC16544l.m18092e(callableMemberDescriptorEnhance, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                        } else {
                            i10 = 10;
                        }
                    } else {
                        JavaCallableMemberDescriptor javaCallableMemberDescriptor2 = (JavaCallableMemberDescriptor) callableMemberDescriptorEnhance;
                        if (type == null) {
                            extensionReceiverParameter = callableMemberDescriptorEnhance.getExtensionReceiverParameter();
                            if (extensionReceiverParameter != null) {
                                type = extensionReceiverParameter.getType();
                            } else {
                                type = null;
                            }
                        }
                        i10 = 10;
                        arrayList = new ArrayList(AbstractC17682p.m19389r(arrayList4, 10));
                        i11 = 0;
                        while (r12.hasNext()) {
                            i12 = i11 + 1;
                            if (i11 >= 0) {
                                AbstractC17681o.m19388q();
                                throw null;
                            }
                            type2 = (KotlinType) obj;
                            if (type2 == null) {
                                type2 = callableMemberDescriptorEnhance.getValueParameters().get(i11).getType();
                                AbstractC16544l.m18093f(type2, "getType(...)");
                            }
                            arrayList.add(type2);
                            i11 = i12;
                        }
                        if (kotlinTypeM18232a == null) {
                            kotlinTypeM18232a = callableMemberDescriptorEnhance.getReturnType();
                            AbstractC16544l.m18091d(kotlinTypeM18232a);
                        }
                        callableMemberDescriptorEnhance = javaCallableMemberDescriptor2.enhance(type, arrayList, kotlinTypeM18232a, c17309l);
                        AbstractC16544l.m18092e(callableMemberDescriptorEnhance, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                    }
                }
            } else {
                i10 = i13;
            }
            arrayList2.add(callableMemberDescriptorEnhance);
            i13 = i10;
        }
        return arrayList2;
    }

    public final KotlinType enhanceSuperType(KotlinType type, LazyJavaResolverContext context) {
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(context, "context");
        C10761i c10761i = new C10761i(null, false, context, AnnotationQualifierApplicabilityType.TYPE_USE, true);
        KotlinType kotlinTypeEnhance = this.f51997a.enhance(type, c10761i.computeIndexedQualifiers(type, C17689w.f56480Y, null, false), c10761i.f31977e);
        return kotlinTypeEnhance == null ? type : kotlinTypeEnhance;
    }

    public final List<KotlinType> enhanceTypeParameterBounds(TypeParameterDescriptor typeParameter, List<? extends KotlinType> bounds, LazyJavaResolverContext context) {
        AbstractC16544l.m18094g(typeParameter, "typeParameter");
        AbstractC16544l.m18094g(bounds, "bounds");
        AbstractC16544l.m18094g(context, "context");
        List<? extends KotlinType> list = bounds;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (KotlinType kotlinType : list) {
            if (!TypeUtilsKt.contains(kotlinType, C10759g.f31969p0)) {
                C10761i c10761i = new C10761i(typeParameter, false, context, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false);
                KotlinType kotlinTypeEnhance = this.f51997a.enhance(kotlinType, c10761i.computeIndexedQualifiers(kotlinType, C17689w.f56480Y, null, false), c10761i.f31977e);
                if (kotlinTypeEnhance != null) {
                    kotlinType = kotlinTypeEnhance;
                }
            }
            arrayList.add(kotlinType);
        }
        return arrayList;
    }
}
