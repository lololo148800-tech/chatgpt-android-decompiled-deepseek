package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import p007A5.C0372g;
import p011A9.p012Ra.ahZQMZ;
import p049Bm.InterfaceC1436k;
import p482Tg.C7445b0;
import p605Ym.C10090d;
import p605Ym.C10091e;
import p605Ym.C10092f;
import p605Ym.C10093g;
import p806ia.nJAW.FpwNpGDhomXHZ;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaClassMemberScope extends LazyJavaScope {

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ int f51909u = 0;

    /* JADX INFO: renamed from: m */
    public final ClassDescriptor f51910m;

    /* JADX INFO: renamed from: n */
    public final JavaClass f51911n;

    /* JADX INFO: renamed from: o */
    public final boolean f51912o;

    /* JADX INFO: renamed from: p */
    public final NotNullLazyValue f51913p;

    /* JADX INFO: renamed from: q */
    public final NotNullLazyValue f51914q;

    /* JADX INFO: renamed from: r */
    public final NotNullLazyValue f51915r;

    /* JADX INFO: renamed from: s */
    public final NotNullLazyValue f51916s;

    /* JADX INFO: renamed from: t */
    public final MemoizedFunctionToNullable f51917t;

    public /* synthetic */ LazyJavaClassMemberScope(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, JavaClass javaClass, boolean z6, LazyJavaClassMemberScope lazyJavaClassMemberScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, classDescriptor, javaClass, z6, (i10 & 16) != 0 ? null : lazyJavaClassMemberScope);
    }

    /* JADX INFO: renamed from: q */
    public static SimpleFunctionDescriptor m18188q(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return simpleFunctionDescriptor;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (!simpleFunctionDescriptor.equals(simpleFunctionDescriptor2) && simpleFunctionDescriptor2.getInitialSignatureDescriptor() == null && m18190t(simpleFunctionDescriptor2, functionDescriptor)) {
                FunctionDescriptor functionDescriptorBuild = simpleFunctionDescriptor.newCopyBuilder().setHiddenToOvercomeSignatureClash().build();
                AbstractC16544l.m18091d(functionDescriptorBuild);
                return (SimpleFunctionDescriptor) functionDescriptorBuild;
            }
        }
        return simpleFunctionDescriptor;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX INFO: renamed from: r */
    public static SimpleFunctionDescriptor m18189r(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        FqName safe;
        FqNameUnsafe fqNameUnsafe;
        List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor.getValueParameters();
        AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) AbstractC17680n.m19353c0(valueParameters);
        if (valueParameterDescriptor != null) {
            ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = valueParameterDescriptor.getType().getConstructor().mo22589getDeclarationDescriptor();
            if (classifierDescriptorMo22589getDeclarationDescriptor == null || (fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classifierDescriptorMo22589getDeclarationDescriptor)) == null) {
                safe = null;
            } else {
                if (!fqNameUnsafe.isSafe()) {
                    fqNameUnsafe = null;
                }
                if (fqNameUnsafe != null) {
                    safe = fqNameUnsafe.toSafe();
                } else {
                    safe = null;
                }
            }
            if (!AbstractC16544l.m18089b(safe, StandardNames.CONTINUATION_INTERFACE_FQ_NAME)) {
                valueParameterDescriptor = null;
            }
            if (valueParameterDescriptor != null) {
                FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
                List<ValueParameterDescriptor> valueParameters2 = simpleFunctionDescriptor.getValueParameters();
                AbstractC16544l.m18093f(valueParameters2, "getValueParameters(...)");
                SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) copyBuilderNewCopyBuilder.setValueParameters(AbstractC17680n.m19337M(1, valueParameters2)).setReturnType(valueParameterDescriptor.getType().getArguments().get(0).getType()).build();
                SimpleFunctionDescriptorImpl simpleFunctionDescriptorImpl = (SimpleFunctionDescriptorImpl) simpleFunctionDescriptor2;
                if (simpleFunctionDescriptorImpl != null) {
                    simpleFunctionDescriptorImpl.setSuspend(true);
                }
                return simpleFunctionDescriptor2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m18190t(FunctionDescriptor functionDescriptor, FunctionDescriptor functionDescriptor2) {
        OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(functionDescriptor2, functionDescriptor, true).getResult();
        AbstractC16544l.m18093f(result, "getResult(...)");
        return result == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !JavaIncompatibilityRulesOverridabilityCondition.Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(functionDescriptor2, functionDescriptor);
    }

    /* JADX INFO: renamed from: u */
    public static SimpleFunctionDescriptor m18191u(PropertyDescriptor propertyDescriptor, String str, InterfaceC1436k interfaceC1436k) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Name nameIdentifier = Name.identifier(str);
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        Iterator it = ((Iterable) interfaceC1436k.invoke(nameIdentifier)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 0) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType == null ? false : kotlinTypeChecker.isSubtypeOf(returnType, propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    /* JADX INFO: renamed from: w */
    public static SimpleFunctionDescriptor m18192w(PropertyDescriptor propertyDescriptor, InterfaceC1436k interfaceC1436k) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        KotlinType returnType;
        String strAsString = propertyDescriptor.getName().asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        Name nameIdentifier = Name.identifier(JvmAbi.setterName(strAsString));
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        Iterator it = ((Iterable) interfaceC1436k.invoke(nameIdentifier)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null && KotlinBuiltIns.isUnit(returnType)) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor2.getValueParameters();
                AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
                if (kotlinTypeChecker.equalTypes(((ValueParameterDescriptor) AbstractC17680n.m19365o0(valueParameters)).getType(), propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m18193z(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 2, null);
        FunctionDescriptor original = functionDescriptor.getOriginal();
        AbstractC16544l.m18093f(original, "getOriginal(...)");
        return AbstractC16544l.m18089b(strComputeJvmDescriptor$default, MethodSignatureMappingKt.computeJvmDescriptor$default(original, false, false, 2, null)) && !m18190t(simpleFunctionDescriptor, functionDescriptor);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m18194A(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Name name = simpleFunctionDescriptor.getName();
        AbstractC16544l.m18093f(name, "getName(...)");
        List<Name> propertyNamesCandidatesByAccessorName = PropertiesConventionUtilKt.getPropertyNamesCandidatesByAccessorName(name);
        if (!(propertyNamesCandidatesByAccessorName instanceof Collection) || !propertyNamesCandidatesByAccessorName.isEmpty()) {
            Iterator<T> it = propertyNamesCandidatesByAccessorName.iterator();
            while (it.hasNext()) {
                Set<PropertyDescriptor> setM18213y = m18213y((Name) it.next());
                if (!(setM18213y instanceof Collection) || !setM18213y.isEmpty()) {
                    for (PropertyDescriptor propertyDescriptor : setM18213y) {
                        if (m18210s(propertyDescriptor, new C0372g(simpleFunctionDescriptor, 2, this))) {
                            if (!propertyDescriptor.isVar()) {
                                String strAsString = simpleFunctionDescriptor.getName().asString();
                                AbstractC16544l.m18093f(strAsString, "asString(...)");
                                if (!JvmAbi.isSetterName(strAsString)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
        Name name2 = simpleFunctionDescriptor.getName();
        AbstractC16544l.m18093f(name2, "getName(...)");
        Name builtinFunctionNamesByJvmName = companion.getBuiltinFunctionNamesByJvmName(name2);
        if (builtinFunctionNamesByJvmName != null) {
            LinkedHashSet linkedHashSetM18212x = m18212x(builtinFunctionNamesByJvmName);
            ArrayList<SimpleFunctionDescriptor> arrayList = new ArrayList();
            for (Object obj : linkedHashSetM18212x) {
                if (SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName((SimpleFunctionDescriptor) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
                copyBuilderNewCopyBuilder.setName(builtinFunctionNamesByJvmName);
                copyBuilderNewCopyBuilder.setSignatureChange();
                copyBuilderNewCopyBuilder.setPreserveSourceElement();
                FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
                AbstractC16544l.m18091d(functionDescriptorBuild);
                SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) functionDescriptorBuild;
                if (!arrayList.isEmpty()) {
                    for (SimpleFunctionDescriptor simpleFunctionDescriptor3 : arrayList) {
                        FunctionDescriptor original = BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor3) ? simpleFunctionDescriptor2.getOriginal() : simpleFunctionDescriptor2;
                        AbstractC16544l.m18091d(original);
                        if (m18190t(original, simpleFunctionDescriptor3)) {
                            return false;
                        }
                    }
                }
            }
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name3 = simpleFunctionDescriptor.getName();
        AbstractC16544l.m18093f(name3, "getName(...)");
        if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name3)) {
            Name name4 = simpleFunctionDescriptor.getName();
            AbstractC16544l.m18093f(name4, "getName(...)");
            LinkedHashSet linkedHashSetM18212x2 = m18212x(name4);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = linkedHashSetM18212x2.iterator();
            while (it2.hasNext()) {
                FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((SimpleFunctionDescriptor) it2.next());
                if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null) {
                    arrayList2.add(overriddenBuiltinFunctionWithErasedValueParametersInJava);
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    if (m18193z(simpleFunctionDescriptor, (FunctionDescriptor) it3.next())) {
                        return false;
                    }
                }
            }
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorM18189r = m18189r(simpleFunctionDescriptor);
        if (simpleFunctionDescriptorM18189r != null) {
            Name name5 = simpleFunctionDescriptor.getName();
            AbstractC16544l.m18093f(name5, "getName(...)");
            LinkedHashSet<SimpleFunctionDescriptor> linkedHashSetM18212x3 = m18212x(name5);
            if (!linkedHashSetM18212x3.isEmpty()) {
                for (SimpleFunctionDescriptor simpleFunctionDescriptor4 : linkedHashSetM18212x3) {
                    if (simpleFunctionDescriptor4.isSuspend() && m18190t(simpleFunctionDescriptorM18189r, simpleFunctionDescriptor4)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public final ArrayList m18195B(Name name) {
        Collection<JavaMethod> collectionFindMethodsByName = ((DeclaredMemberIndex) this.f51937d.invoke()).findMethodsByName(name);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collectionFindMethodsByName, 10));
        Iterator<T> it = collectionFindMethodsByName.iterator();
        while (it.hasNext()) {
            arrayList.add(m18218j((JavaMethod) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public final ArrayList m18196C(Name name) {
        LinkedHashSet linkedHashSetM18212x = m18212x(name);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetM18212x) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            if (!SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName(simpleFunctionDescriptor) && BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: a */
    public final Set mo18197a(DescriptorKindFilter kindFilter, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        return AbstractC17665J.m19266f((Set) this.f51914q.invoke(), ((Map) this.f51916s.invoke()).keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: b */
    public final void mo18198b(Name name, ArrayList arrayList) {
        AbstractC16544l.m18094g(name, "name");
        boolean zIsRecord = this.f51911n.isRecord();
        ClassDescriptor classDescriptor = this.f51910m;
        LazyJavaResolverContext lazyJavaResolverContext = this.f51934a;
        if (zIsRecord) {
            NotNullLazyValue notNullLazyValue = this.f51937d;
            if (((DeclaredMemberIndex) notNullLazyValue.invoke()).findRecordComponentByName(name) != null) {
                if (arrayList.isEmpty()) {
                    JavaRecordComponent javaRecordComponentFindRecordComponentByName = ((DeclaredMemberIndex) notNullLazyValue.invoke()).findRecordComponentByName(name);
                    AbstractC16544l.m18091d(javaRecordComponentFindRecordComponentByName);
                    JavaMethodDescriptor javaMethodDescriptorCreateJavaMethod = JavaMethodDescriptor.createJavaMethod(classDescriptor, LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaRecordComponentFindRecordComponentByName), javaRecordComponentFindRecordComponentByName.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaRecordComponentFindRecordComponentByName), true);
                    AbstractC16544l.m18093f(javaMethodDescriptorCreateJavaMethod, "createJavaMethod(...)");
                    KotlinType kotlinTypeTransformJavaType = lazyJavaResolverContext.getTypeResolver().transformJavaType(javaRecordComponentFindRecordComponentByName.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null));
                    ReceiverParameterDescriptor dispatchReceiverParameterIfNeeded = DescriptorUtils.getDispatchReceiverParameterIfNeeded(classDescriptor);
                    C17689w c17689w = C17689w.f56480Y;
                    javaMethodDescriptorCreateJavaMethod.initialize(null, dispatchReceiverParameterIfNeeded, c17689w, c17689w, c17689w, kotlinTypeTransformJavaType, Modality.Companion.convertFromFlags(false, false, true), DescriptorVisibilities.PUBLIC, null);
                    javaMethodDescriptorCreateJavaMethod.setParameterNamesStatus(false, false);
                    lazyJavaResolverContext.getComponents().getJavaResolverCache().recordMethod(javaRecordComponentFindRecordComponentByName, javaMethodDescriptorCreateJavaMethod);
                    arrayList.add(javaMethodDescriptorCreateJavaMethod);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((SimpleFunctionDescriptor) it.next()).getValueParameters().isEmpty()) {
                        }
                    }
                    JavaRecordComponent javaRecordComponentFindRecordComponentByName2 = ((DeclaredMemberIndex) notNullLazyValue.invoke()).findRecordComponentByName(name);
                    AbstractC16544l.m18091d(javaRecordComponentFindRecordComponentByName2);
                    JavaMethodDescriptor javaMethodDescriptorCreateJavaMethod2 = JavaMethodDescriptor.createJavaMethod(classDescriptor, LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaRecordComponentFindRecordComponentByName2), javaRecordComponentFindRecordComponentByName2.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaRecordComponentFindRecordComponentByName2), true);
                    AbstractC16544l.m18093f(javaMethodDescriptorCreateJavaMethod2, "createJavaMethod(...)");
                    KotlinType kotlinTypeTransformJavaType2 = lazyJavaResolverContext.getTypeResolver().transformJavaType(javaRecordComponentFindRecordComponentByName2.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null));
                    ReceiverParameterDescriptor dispatchReceiverParameterIfNeeded2 = DescriptorUtils.getDispatchReceiverParameterIfNeeded(classDescriptor);
                    C17689w c17689w2 = C17689w.f56480Y;
                    javaMethodDescriptorCreateJavaMethod2.initialize(null, dispatchReceiverParameterIfNeeded2, c17689w2, c17689w2, c17689w2, kotlinTypeTransformJavaType2, Modality.Companion.convertFromFlags(false, false, true), DescriptorVisibilities.PUBLIC, null);
                    javaMethodDescriptorCreateJavaMethod2.setParameterNamesStatus(false, false);
                    lazyJavaResolverContext.getComponents().getJavaResolverCache().recordMethod(javaRecordComponentFindRecordComponentByName2, javaMethodDescriptorCreateJavaMethod2);
                    arrayList.add(javaMethodDescriptorCreateJavaMethod2);
                }
            }
        }
        lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateMethods(classDescriptor, name, arrayList, lazyJavaResolverContext);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set computeFunctionNames(DescriptorKindFilter kindFilter, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        ClassDescriptor classDescriptor = this.f51910m;
        Collection<KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
        AbstractC16544l.m18093f(supertypes, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(((KotlinType) it.next()).getMemberScope().getFunctionNames(), linkedHashSet);
        }
        NotNullLazyValue notNullLazyValue = this.f51937d;
        linkedHashSet.addAll(((DeclaredMemberIndex) notNullLazyValue.invoke()).getMethodNames());
        linkedHashSet.addAll(((DeclaredMemberIndex) notNullLazyValue.invoke()).getRecordComponentNames());
        linkedHashSet.addAll(mo18197a(kindFilter, interfaceC1436k));
        LazyJavaResolverContext lazyJavaResolverContext = this.f51934a;
        linkedHashSet.addAll(lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().getMethodNames(classDescriptor, lazyJavaResolverContext));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.f51911n, C10092f.f29877Z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: d */
    public final void mo18199d(LinkedHashSet linkedHashSet, Name name) {
        AbstractC16544l.m18094g(name, "name");
        LinkedHashSet linkedHashSetM18212x = m18212x(name);
        if (!SpecialGenericSignatures.Companion.getSameAsRenamedInJvmBuiltin(name) && !BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            if (!linkedHashSetM18212x.isEmpty()) {
                Iterator it = linkedHashSetM18212x.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((FunctionDescriptor) it.next()).isSuspend()) {
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : linkedHashSetM18212x) {
                if (m18194A((SimpleFunctionDescriptor) obj)) {
                    arrayList.add(obj);
                }
            }
            m18206m(linkedHashSet, name, arrayList, false);
            return;
        }
        SmartSet smartSetCreate = SmartSet.Companion.create();
        Collection collectionResolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, linkedHashSetM18212x, C17689w.f56480Y, this.f51910m, ErrorReporter.DO_NOTHING, this.f51934a.getComponents().getKotlinTypeChecker().getOverridingUtil());
        AbstractC16544l.m18093f(collectionResolveOverridesForNonStaticMembers, "resolveOverridesForNonStaticMembers(...)");
        m18207n(name, linkedHashSet, collectionResolveOverridesForNonStaticMembers, linkedHashSet, new C7445b0(1, this, LazyJavaClassMemberScope.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 6));
        m18207n(name, linkedHashSet, collectionResolveOverridesForNonStaticMembers, smartSetCreate, new C7445b0(1, this, LazyJavaClassMemberScope.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 7));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : linkedHashSetM18212x) {
            if (m18194A((SimpleFunctionDescriptor) obj2)) {
                arrayList2.add(obj2);
            }
        }
        m18206m(linkedHashSet, name, AbstractC17680n.m19361k0(smartSetCreate, arrayList2), true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: e */
    public final void mo18200e(Name name, ArrayList arrayList) {
        JavaMethod javaMethod;
        AbstractC16544l.m18094g(name, "name");
        boolean zIsAnnotationType = this.f51911n.isAnnotationType();
        LazyJavaResolverContext lazyJavaResolverContext = this.f51934a;
        if (zIsAnnotationType && (javaMethod = (JavaMethod) AbstractC17680n.m19366p0(((DeclaredMemberIndex) this.f51937d.invoke()).findMethodsByName(name))) != null) {
            JavaPropertyDescriptor javaPropertyDescriptorCreate = JavaPropertyDescriptor.create(this.f51910m, LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaMethod), Modality.FINAL, UtilsKt.toDescriptorVisibility(javaMethod.getVisibility()), false, javaMethod.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaMethod), false);
            AbstractC16544l.m18093f(javaPropertyDescriptorCreate, "create(...)");
            PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(javaPropertyDescriptorCreate, Annotations.Companion.getEMPTY());
            AbstractC16544l.m18093f(propertyGetterDescriptorImplCreateDefaultGetter, "createDefaultGetter(...)");
            javaPropertyDescriptorCreate.initialize(propertyGetterDescriptorImplCreateDefaultGetter, null);
            KotlinType kotlinTypeM18216c = LazyJavaScope.m18216c(javaMethod, ContextKt.childForMethod$default(this.f51934a, javaPropertyDescriptorCreate, javaMethod, 0, 4, null));
            C17689w c17689w = C17689w.f56480Y;
            javaPropertyDescriptorCreate.setType(kotlinTypeM18216c, c17689w, DescriptorUtils.getDispatchReceiverParameterIfNeeded(this.f51910m), null, c17689w);
            propertyGetterDescriptorImplCreateDefaultGetter.initialize(kotlinTypeM18216c);
            arrayList.add(javaPropertyDescriptorCreate);
        }
        Set setM18213y = m18213y(name);
        if (setM18213y.isEmpty()) {
            return;
        }
        SmartSet.Companion companion = SmartSet.Companion;
        SmartSet smartSetCreate = companion.create();
        SmartSet smartSetCreate2 = companion.create();
        m18208o(setM18213y, arrayList, smartSetCreate, new C10093g(this, 0));
        m18208o(AbstractC17665J.m19264d(setM18213y, smartSetCreate), smartSetCreate2, null, new C10093g(this, 1));
        Collection collectionResolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, AbstractC17665J.m19266f(setM18213y, smartSetCreate2), arrayList, this.f51910m, lazyJavaResolverContext.getComponents().getErrorReporter(), lazyJavaResolverContext.getComponents().getKotlinTypeChecker().getOverridingUtil());
        AbstractC16544l.m18093f(collectionResolveOverridesForNonStaticMembers, "resolveOverridesForNonStaticMembers(...)");
        arrayList.addAll(collectionResolveOverridesForNonStaticMembers);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: g */
    public final ReceiverParameterDescriptor mo18202g() {
        return DescriptorUtils.getDispatchReceiverParameterIfNeeded(this.f51910m);
    }

    public final NotNullLazyValue<List<ClassConstructorDescriptor>> getConstructors$descriptors_jvm() {
        return this.f51913p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo22590getContributedClassifier(Name name, LookupLocation location) {
        MemoizedFunctionToNullable memoizedFunctionToNullable;
        ClassDescriptor classDescriptor;
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        mo22593recordLookup(name, location);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) this.f51935b;
        return (lazyJavaClassMemberScope == null || (memoizedFunctionToNullable = lazyJavaClassMemberScope.f51917t) == null || (classDescriptor = (ClassDescriptor) memoizedFunctionToNullable.invoke(name)) == null) ? (ClassifierDescriptor) this.f51917t.invoke(name) : classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        mo22593recordLookup(name, location);
        return super.getContributedFunctions(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        mo22593recordLookup(name, location);
        return super.getContributedVariables(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclarationDescriptor getOwnerDescriptor() {
        return this.f51910m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: h */
    public final boolean mo18203h(JavaMethodDescriptor javaMethodDescriptor) {
        if (this.f51911n.isAnnotationType()) {
            return false;
        }
        return m18194A(javaMethodDescriptor);
    }

    /* JADX INFO: renamed from: l */
    public final void m18205l(ArrayList arrayList, JavaClassConstructorDescriptor javaClassConstructorDescriptor, int i10, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        Annotations empty = Annotations.Companion.getEMPTY();
        Name name = javaMethod.getName();
        KotlinType kotlinTypeMakeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        AbstractC16544l.m18093f(kotlinTypeMakeNotNullable, "makeNotNullable(...)");
        arrayList.add(new ValueParameterDescriptorImpl(javaClassConstructorDescriptor, null, i10, empty, name, kotlinTypeMakeNotNullable, javaMethod.getHasAnnotationParameterDefaultValue(), false, false, kotlinType2 != null ? TypeUtils.makeNotNullable(kotlinType2) : null, this.f51934a.getComponents().getSourceElementFactory().source(javaMethod)));
    }

    /* JADX INFO: renamed from: m */
    public final void m18206m(LinkedHashSet linkedHashSet, Name name, ArrayList arrayList, boolean z6) {
        LazyJavaResolverContext lazyJavaResolverContext = this.f51934a;
        Collection collectionResolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, arrayList, linkedHashSet, this.f51910m, lazyJavaResolverContext.getComponents().getErrorReporter(), lazyJavaResolverContext.getComponents().getKotlinTypeChecker().getOverridingUtil());
        AbstractC16544l.m18093f(collectionResolveOverridesForNonStaticMembers, "resolveOverridesForNonStaticMembers(...)");
        if (!z6) {
            linkedHashSet.addAll(collectionResolveOverridesForNonStaticMembers);
            return;
        }
        Collection<SimpleFunctionDescriptor> collection = collectionResolveOverridesForNonStaticMembers;
        ArrayList arrayListM19361k0 = AbstractC17680n.m19361k0(collection, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(collection, 10));
        for (SimpleFunctionDescriptor simpleFunctionDescriptorM18188q : collection) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenSpecialBuiltin(simpleFunctionDescriptorM18188q);
            if (simpleFunctionDescriptor == null) {
                AbstractC16544l.m18091d(simpleFunctionDescriptorM18188q);
            } else {
                AbstractC16544l.m18091d(simpleFunctionDescriptorM18188q);
                simpleFunctionDescriptorM18188q = m18188q(simpleFunctionDescriptorM18188q, simpleFunctionDescriptor, arrayListM19361k0);
            }
            arrayList2.add(simpleFunctionDescriptorM18188q);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    /* JADX INFO: renamed from: n */
    public final void m18207n(Name name, LinkedHashSet linkedHashSet, Collection collection, AbstractSet abstractSet, InterfaceC1436k interfaceC1436k) {
        SimpleFunctionDescriptor simpleFunctionDescriptorM18188q;
        Object next;
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        SimpleFunctionDescriptor simpleFunctionDescriptorM18188q2;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            SimpleFunctionDescriptor simpleFunctionDescriptor3 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(simpleFunctionDescriptor2);
            SimpleFunctionDescriptor simpleFunctionDescriptor4 = null;
            if (simpleFunctionDescriptor3 != null) {
                String jvmMethodNameIfSpecial = SpecialBuiltinMembers.getJvmMethodNameIfSpecial(simpleFunctionDescriptor3);
                AbstractC16544l.m18091d(jvmMethodNameIfSpecial);
                Name nameIdentifier = Name.identifier(jvmMethodNameIfSpecial);
                AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
                Iterator it2 = ((Collection) interfaceC1436k.invoke(nameIdentifier)).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        simpleFunctionDescriptorM18188q = null;
                        break;
                    }
                    FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = ((SimpleFunctionDescriptor) it2.next()).newCopyBuilder();
                    copyBuilderNewCopyBuilder.setName(name);
                    copyBuilderNewCopyBuilder.setSignatureChange();
                    copyBuilderNewCopyBuilder.setPreserveSourceElement();
                    FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
                    AbstractC16544l.m18091d(functionDescriptorBuild);
                    SimpleFunctionDescriptor simpleFunctionDescriptor5 = (SimpleFunctionDescriptor) functionDescriptorBuild;
                    FunctionDescriptor original = BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor3) ? simpleFunctionDescriptor5.getOriginal() : simpleFunctionDescriptor5;
                    AbstractC16544l.m18091d(original);
                    if (m18190t(original, simpleFunctionDescriptor3)) {
                        simpleFunctionDescriptorM18188q = m18188q(simpleFunctionDescriptor5, simpleFunctionDescriptor3, linkedHashSet);
                        break;
                    }
                }
            } else {
                simpleFunctionDescriptorM18188q = null;
                break;
            }
            CollectionsKt.addIfNotNull(abstractSet, simpleFunctionDescriptorM18188q);
            FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor2);
            if (overriddenBuiltinFunctionWithErasedValueParametersInJava == null) {
                simpleFunctionDescriptorM18188q2 = null;
            } else {
                Name name2 = overriddenBuiltinFunctionWithErasedValueParametersInJava.getName();
                AbstractC16544l.m18093f(name2, "getName(...)");
                Iterator it3 = ((Iterable) interfaceC1436k.invoke(name2)).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!m18193z((SimpleFunctionDescriptor) next, overriddenBuiltinFunctionWithErasedValueParametersInJava));
                SimpleFunctionDescriptor simpleFunctionDescriptor6 = (SimpleFunctionDescriptor) next;
                if (simpleFunctionDescriptor6 != null) {
                    FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder2 = simpleFunctionDescriptor6.newCopyBuilder();
                    List<ValueParameterDescriptor> valueParameters = overriddenBuiltinFunctionWithErasedValueParametersInJava.getValueParameters();
                    AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
                    List<ValueParameterDescriptor> list = valueParameters;
                    ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                    Iterator<T> it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((ValueParameterDescriptor) it4.next()).getType());
                    }
                    List<ValueParameterDescriptor> valueParameters2 = simpleFunctionDescriptor6.getValueParameters();
                    AbstractC16544l.m18093f(valueParameters2, "getValueParameters(...)");
                    copyBuilderNewCopyBuilder2.setValueParameters(UtilKt.copyValueParameters(arrayList, valueParameters2, overriddenBuiltinFunctionWithErasedValueParametersInJava));
                    copyBuilderNewCopyBuilder2.setSignatureChange();
                    copyBuilderNewCopyBuilder2.setPreserveSourceElement();
                    copyBuilderNewCopyBuilder2.putUserData(JavaMethodDescriptor.HAS_ERASED_VALUE_PARAMETERS, Boolean.TRUE);
                    simpleFunctionDescriptor = (SimpleFunctionDescriptor) copyBuilderNewCopyBuilder2.build();
                } else {
                    simpleFunctionDescriptor = null;
                }
                if (simpleFunctionDescriptor == null) {
                    simpleFunctionDescriptorM18188q2 = null;
                } else {
                    if (!m18194A(simpleFunctionDescriptor)) {
                        simpleFunctionDescriptor = null;
                    }
                    if (simpleFunctionDescriptor != null) {
                        simpleFunctionDescriptorM18188q2 = m18188q(simpleFunctionDescriptor, overriddenBuiltinFunctionWithErasedValueParametersInJava, linkedHashSet);
                    } else {
                        simpleFunctionDescriptorM18188q2 = null;
                    }
                }
            }
            CollectionsKt.addIfNotNull(abstractSet, simpleFunctionDescriptorM18188q2);
            if (simpleFunctionDescriptor2.isSuspend()) {
                Name name3 = simpleFunctionDescriptor2.getName();
                AbstractC16544l.m18093f(name3, "getName(...)");
                Iterator it5 = ((Iterable) interfaceC1436k.invoke(name3)).iterator();
                while (it5.hasNext()) {
                    SimpleFunctionDescriptor simpleFunctionDescriptorM18189r = m18189r((SimpleFunctionDescriptor) it5.next());
                    if (simpleFunctionDescriptorM18189r == null || !m18190t(simpleFunctionDescriptorM18189r, simpleFunctionDescriptor2)) {
                        simpleFunctionDescriptorM18189r = null;
                    }
                    if (simpleFunctionDescriptorM18189r != null) {
                        simpleFunctionDescriptor4 = simpleFunctionDescriptorM18189r;
                        break;
                    }
                }
            }
            CollectionsKt.addIfNotNull(abstractSet, simpleFunctionDescriptor4);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m18208o(Set set, AbstractCollection abstractCollection, SmartSet smartSet, InterfaceC1436k interfaceC1436k) {
        SimpleFunctionDescriptor simpleFunctionDescriptorM18192w;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) it.next();
            JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor = null;
            PropertySetterDescriptorImpl propertySetterDescriptorImplCreateSetter = null;
            if (m18210s(propertyDescriptor, interfaceC1436k)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorM18211v = m18211v(propertyDescriptor, interfaceC1436k);
                AbstractC16544l.m18091d(simpleFunctionDescriptorM18211v);
                if (propertyDescriptor.isVar()) {
                    simpleFunctionDescriptorM18192w = m18192w(propertyDescriptor, interfaceC1436k);
                    AbstractC16544l.m18091d(simpleFunctionDescriptorM18192w);
                } else {
                    simpleFunctionDescriptorM18192w = null;
                }
                if (simpleFunctionDescriptorM18192w != null) {
                    simpleFunctionDescriptorM18192w.getModality();
                    simpleFunctionDescriptorM18211v.getModality();
                }
                ClassDescriptor classDescriptor = this.f51910m;
                JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor2 = new JavaForKotlinOverridePropertyDescriptor(classDescriptor, simpleFunctionDescriptorM18211v, simpleFunctionDescriptorM18192w, propertyDescriptor);
                KotlinType returnType = simpleFunctionDescriptorM18211v.getReturnType();
                AbstractC16544l.m18091d(returnType);
                C17689w c17689w = C17689w.f56480Y;
                javaForKotlinOverridePropertyDescriptor2.setType(returnType, c17689w, DescriptorUtils.getDispatchReceiverParameterIfNeeded(classDescriptor), null, c17689w);
                PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateGetter = DescriptorFactory.createGetter(javaForKotlinOverridePropertyDescriptor2, simpleFunctionDescriptorM18211v.getAnnotations(), false, false, false, simpleFunctionDescriptorM18211v.getSource());
                propertyGetterDescriptorImplCreateGetter.setInitialSignatureDescriptor(simpleFunctionDescriptorM18211v);
                propertyGetterDescriptorImplCreateGetter.initialize(javaForKotlinOverridePropertyDescriptor2.getType());
                if (simpleFunctionDescriptorM18192w != null) {
                    List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptorM18192w.getValueParameters();
                    AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) AbstractC17680n.m19343S(valueParameters);
                    if (valueParameterDescriptor == null) {
                        throw new AssertionError("No parameter found for " + simpleFunctionDescriptorM18192w);
                    }
                    propertySetterDescriptorImplCreateSetter = DescriptorFactory.createSetter(javaForKotlinOverridePropertyDescriptor2, simpleFunctionDescriptorM18192w.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, false, false, simpleFunctionDescriptorM18192w.getVisibility(), simpleFunctionDescriptorM18192w.getSource());
                    propertySetterDescriptorImplCreateSetter.setInitialSignatureDescriptor(simpleFunctionDescriptorM18192w);
                    propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateGetter;
                } else {
                    propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateGetter;
                }
                javaForKotlinOverridePropertyDescriptor2.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImplCreateSetter);
                javaForKotlinOverridePropertyDescriptor = javaForKotlinOverridePropertyDescriptor2;
            }
            if (javaForKotlinOverridePropertyDescriptor != null) {
                abstractCollection.add(javaForKotlinOverridePropertyDescriptor);
                if (smartSet != null) {
                    smartSet.add(propertyDescriptor);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final Collection m18209p() {
        boolean z6 = this.f51912o;
        ClassDescriptor classDescriptor = this.f51910m;
        if (!z6) {
            return this.f51934a.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner().refineSupertypes(classDescriptor);
        }
        Collection<KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
        AbstractC16544l.m18093f(supertypes, "getSupertypes(...)");
        return supertypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo22593recordLookup(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.record(this.f51934a.getComponents().getLookupTracker(), location, this.f51910m, name);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m18210s(PropertyDescriptor propertyDescriptor, InterfaceC1436k interfaceC1436k) {
        if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorM18211v = m18211v(propertyDescriptor, interfaceC1436k);
        SimpleFunctionDescriptor simpleFunctionDescriptorM18192w = m18192w(propertyDescriptor, interfaceC1436k);
        if (simpleFunctionDescriptorM18211v == null) {
            return false;
        }
        if (propertyDescriptor.isVar()) {
            return simpleFunctionDescriptorM18192w != null && simpleFunctionDescriptorM18192w.getModality() == simpleFunctionDescriptorM18211v.getModality();
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public String toString() {
        return "Lazy Java member scope for " + this.f51911n.getFqName();
    }

    /* JADX INFO: renamed from: v */
    public final SimpleFunctionDescriptor m18211v(PropertyDescriptor propertyDescriptor, InterfaceC1436k interfaceC1436k) {
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        PropertyGetterDescriptor propertyGetterDescriptor = getter != null ? (PropertyGetterDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(getter) : null;
        String builtinSpecialPropertyGetterName = propertyGetterDescriptor != null ? ClassicBuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyGetterDescriptor) : null;
        if (builtinSpecialPropertyGetterName != null && !SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(this.f51910m, propertyGetterDescriptor)) {
            return m18191u(propertyDescriptor, builtinSpecialPropertyGetterName, interfaceC1436k);
        }
        String strAsString = propertyDescriptor.getName().asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        return m18191u(propertyDescriptor, JvmAbi.getterName(strAsString), interfaceC1436k);
    }

    /* JADX INFO: renamed from: x */
    public final LinkedHashSet m18212x(Name name) {
        Collection collectionM18209p = m18209p();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionM18209p.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(((KotlinType) it.next()).getMemberScope().getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS), linkedHashSet);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: y */
    public final Set m18213y(Name name) {
        Collection collectionM18209p = m18209p();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionM18209p.iterator();
        while (it.hasNext()) {
            Collection<? extends PropertyDescriptor> contributedVariables = ((KotlinType) it.next()).getMemberScope().getContributedVariables(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(contributedVariables, 10));
            Iterator<T> it2 = contributedVariables.iterator();
            while (it2.hasNext()) {
                arrayList2.add((PropertyDescriptor) it2.next());
            }
            AbstractC17686t.m19398v(arrayList2, arrayList);
        }
        return AbstractC17680n.m19328G0(arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(LazyJavaResolverContext c9, ClassDescriptor ownerDescriptor, JavaClass jClass, boolean z6, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(c9, lazyJavaClassMemberScope);
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(ownerDescriptor, "ownerDescriptor");
        AbstractC16544l.m18094g(jClass, "jClass");
        this.f51910m = ownerDescriptor;
        this.f51911n = jClass;
        this.f51912o = z6;
        this.f51913p = c9.getStorageManager().createLazyValue(new C10090d(this, c9));
        this.f51914q = c9.getStorageManager().createLazyValue(new C10091e(this, 0));
        this.f51915r = c9.getStorageManager().createLazyValue(new C10090d(c9, this));
        int i10 = 1;
        this.f51916s = c9.getStorageManager().createLazyValue(new C10091e(this, i10));
        this.f51917t = c9.getStorageManager().createMemoizedFunctionWithNullableValues(new C0372g(this, i10, c9));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: f */
    public final Set mo18201f(DescriptorKindFilter kindFilter) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        if (this.f51911n.isAnnotationType()) {
            return getFunctionNames();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((DeclaredMemberIndex) this.f51937d.invoke()).getFieldNames());
        Collection<KotlinType> supertypes = this.f51910m.getTypeConstructor().getSupertypes();
        AbstractC16544l.m18093f(supertypes, FpwNpGDhomXHZ.iUD);
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(((KotlinType) it.next()).getMemberScope().getVariableNames(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: i */
    public final LazyJavaScope.MethodSignatureData mo18204i(JavaMethod method, ArrayList arrayList, KotlinType returnType, List valueParameters) {
        AbstractC16544l.m18094g(method, "method");
        AbstractC16544l.m18094g(returnType, "returnType");
        AbstractC16544l.m18094g(valueParameters, "valueParameters");
        SignaturePropagator.PropagatedSignature propagatedSignatureResolvePropagatedSignature = this.f51934a.getComponents().getSignaturePropagator().resolvePropagatedSignature(method, this.f51910m, returnType, null, valueParameters, arrayList);
        AbstractC16544l.m18093f(propagatedSignatureResolvePropagatedSignature, ahZQMZ.SVaiHgiGHuIw);
        KotlinType returnType2 = propagatedSignatureResolvePropagatedSignature.getReturnType();
        AbstractC16544l.m18093f(returnType2, "getReturnType(...)");
        KotlinType receiverType = propagatedSignatureResolvePropagatedSignature.getReceiverType();
        List<ValueParameterDescriptor> valueParameters2 = propagatedSignatureResolvePropagatedSignature.getValueParameters();
        AbstractC16544l.m18093f(valueParameters2, "getValueParameters(...)");
        List<TypeParameterDescriptor> typeParameters = propagatedSignatureResolvePropagatedSignature.getTypeParameters();
        AbstractC16544l.m18093f(typeParameters, "getTypeParameters(...)");
        boolean zHasStableParameterNames = propagatedSignatureResolvePropagatedSignature.hasStableParameterNames();
        List<String> errors = propagatedSignatureResolvePropagatedSignature.getErrors();
        AbstractC16544l.m18093f(errors, "getErrors(...)");
        return new LazyJavaScope.MethodSignatureData(returnType2, receiverType, valueParameters2, typeParameters, zHasStableParameterNames, errors);
    }
}
