package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import android.javax.sip.C10808o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import mm.C17309l;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3776x;
import p228J.AbstractC3794B0;
import p298Lm.C5150L;
import p368Om.C6265a;
import p368Om.C6268d;
import p368Om.C6269e;
import p368Om.C6270f;
import p368Om.EnumC6271g;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmBuiltInsCustomizer implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ InterfaceC3776x[] f51371i;

    /* JADX INFO: renamed from: a */
    public final ModuleDescriptor f51372a;

    /* JADX INFO: renamed from: b */
    public final JavaToKotlinClassMapper f51373b;

    /* JADX INFO: renamed from: c */
    public final NotNullLazyValue f51374c;

    /* JADX INFO: renamed from: d */
    public final SimpleType f51375d;

    /* JADX INFO: renamed from: e */
    public final NotNullLazyValue f51376e;

    /* JADX INFO: renamed from: f */
    public final CacheWithNotNullValues f51377f;

    /* JADX INFO: renamed from: g */
    public final NotNullLazyValue f51378g;

    /* JADX INFO: renamed from: h */
    public final MemoizedFunctionToNotNull f51379h;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC6271g.values().length];
            try {
                EnumC6271g enumC6271g = EnumC6271g.f20368Y;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC6271g enumC6271g2 = EnumC6271g.f20368Y;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC6271g enumC6271g3 = EnumC6271g.f20368Y;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EnumC6271g enumC6271g4 = EnumC6271g.f20368Y;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EnumC6271g enumC6271g5 = EnumC6271g.f20368Y;
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        C16553u c16553u = new C16553u(JvmBuiltInsCustomizer.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f51371i = new InterfaceC3776x[]{c16527d.mo5699h(c16553u), AbstractC3794B0.m4493r(JvmBuiltInsCustomizer.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, c16527d), AbstractC3794B0.m4493r(JvmBuiltInsCustomizer.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0, c16527d)};
    }

    public JvmBuiltInsCustomizer(ModuleDescriptor moduleDescriptor, StorageManager storageManager, InterfaceC1426a settingsComputation) {
        AbstractC16544l.m18094g(moduleDescriptor, "moduleDescriptor");
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(settingsComputation, "settingsComputation");
        this.f51372a = moduleDescriptor;
        this.f51373b = JavaToKotlinClassMapper.INSTANCE;
        this.f51374c = storageManager.createLazyValue(settingsComputation);
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new C16561x4cb45058(moduleDescriptor, new FqName("java.io")), Name.identifier("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, AbstractC9393x3.m9974d(new LazyWrappedType(storageManager, new C6268d(this, 1))), SourceElement.NO_SOURCE, false, storageManager);
        classDescriptorImpl.initialize(MemberScope.Empty.INSTANCE, C17691y.f56482Y, null);
        SimpleType defaultType = classDescriptorImpl.getDefaultType();
        AbstractC16544l.m18093f(defaultType, "getDefaultType(...)");
        this.f51375d = defaultType;
        this.f51376e = storageManager.createLazyValue(new C5150L(this, 6, storageManager));
        this.f51377f = storageManager.createCacheWithNotNullValues();
        int i10 = 0;
        this.f51378g = storageManager.createLazyValue(new C6268d(this, i10));
        this.f51379h = storageManager.createMemoizedFunction(new C6269e(this, i10));
    }

    /* JADX INFO: renamed from: a */
    public final LazyJavaClassDescriptor m18121a(ClassDescriptor classDescriptor) {
        ClassId classIdMapKotlinToJava;
        FqName fqNameAsSingleFqName;
        if (KotlinBuiltIns.isAny(classDescriptor) || !KotlinBuiltIns.isUnderKotlinPackage(classDescriptor)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        if (!fqNameUnsafe.isSafe() || (classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe)) == null || (fqNameAsSingleFqName = classIdMapKotlinToJava.asSingleFqName()) == null) {
            return null;
        }
        ClassDescriptor classDescriptorResolveClassByFqName = DescriptorUtilKt.resolveClassByFqName(m18122b().getOwnerModuleDescriptor(), fqNameAsSingleFqName, NoLookupLocation.FROM_BUILTINS);
        if (classDescriptorResolveClassByFqName instanceof LazyJavaClassDescriptor) {
            return (LazyJavaClassDescriptor) classDescriptorResolveClassByFqName;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final JvmBuiltIns.Settings m18122b() {
        return (JvmBuiltIns.Settings) StorageKt.getValue(this.f51374c, this, f51371i[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Collection<ClassConstructorDescriptor> getConstructors(ClassDescriptor classDescriptor) {
        LazyJavaClassDescriptor lazyJavaClassDescriptorM18121a;
        AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
        ClassKind kind = classDescriptor.getKind();
        ClassKind classKind = ClassKind.CLASS;
        C17689w c17689w = C17689w.f56480Y;
        if (kind != classKind || !m18122b().isAdditionalBuiltInsFeatureSupported() || (lazyJavaClassDescriptorM18121a = m18121a(classDescriptor)) == null) {
            return c17689w;
        }
        ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(this.f51373b, DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptorM18121a), C6265a.f20358f.getInstance(), null, 4, null);
        if (classDescriptorMapJavaToKotlin$default == null) {
            return c17689w;
        }
        TypeSubstitutor typeSubstitutorBuildSubstitutor = MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptorMapJavaToKotlin$default, lazyJavaClassDescriptorM18121a).buildSubstitutor();
        List<ClassConstructorDescriptor> constructors = lazyJavaClassDescriptorM18121a.getConstructors();
        ArrayList<ClassConstructorDescriptor> arrayList = new ArrayList();
        for (Object obj : constructors) {
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) obj;
            if (classConstructorDescriptor.getVisibility().isPublicAPI()) {
                Collection<ClassConstructorDescriptor> constructors2 = classDescriptorMapJavaToKotlin$default.getConstructors();
                AbstractC16544l.m18093f(constructors2, "getConstructors(...)");
                Collection<ClassConstructorDescriptor> collection = constructors2;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ClassConstructorDescriptor classConstructorDescriptor2 = (ClassConstructorDescriptor) it.next();
                            AbstractC16544l.m18091d(classConstructorDescriptor2);
                            if (OverridingUtil.getBothWaysOverridability(classConstructorDescriptor2, classConstructorDescriptor.substitute(typeSubstitutorBuildSubstitutor)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                            }
                        }
                    }
                }
                if (classConstructorDescriptor.getValueParameters().size() == 1) {
                    List<ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
                    AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
                    ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((ValueParameterDescriptor) AbstractC17680n.m19365o0(valueParameters)).getType().getConstructor().mo22589getDeclarationDescriptor();
                    if (AbstractC16544l.m18089b(classifierDescriptorMo22589getDeclarationDescriptor != null ? DescriptorUtilsKt.getFqNameUnsafe(classifierDescriptorMo22589getDeclarationDescriptor) : null, DescriptorUtilsKt.getFqNameUnsafe(classDescriptor))) {
                    }
                }
                if (!KotlinBuiltIns.isDeprecated(classConstructorDescriptor) && !JvmBuiltInsSignatures.INSTANCE.getHIDDEN_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptorM18121a, MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        for (ClassConstructorDescriptor classConstructorDescriptor3 : arrayList) {
            FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> copyBuilderNewCopyBuilder = classConstructorDescriptor3.newCopyBuilder();
            copyBuilderNewCopyBuilder.setOwner(classDescriptor);
            copyBuilderNewCopyBuilder.setReturnType(classDescriptor.getDefaultType());
            copyBuilderNewCopyBuilder.setPreserveSourceElement();
            copyBuilderNewCopyBuilder.setSubstitution(typeSubstitutorBuildSubstitutor.getSubstitution());
            if (!JvmBuiltInsSignatures.INSTANCE.getVISIBLE_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptorM18121a, MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor3, false, false, 3, null)))) {
                copyBuilderNewCopyBuilder.setAdditionalAnnotations((Annotations) StorageKt.getValue(this.f51378g, this, f51371i[2]));
            }
            FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
            AbstractC16544l.m18092e(functionDescriptorBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((ClassConstructorDescriptor) functionDescriptorBuild);
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Collection<KotlinType> getSupertypes(ClassDescriptor classDescriptor) {
        AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
        boolean zIsArrayOrPrimitiveArray = jvmBuiltInsSignatures.isArrayOrPrimitiveArray(fqNameUnsafe);
        SimpleType simpleType = this.f51375d;
        if (zIsArrayOrPrimitiveArray) {
            return AbstractC17681o.m19382k((SimpleType) StorageKt.getValue(this.f51376e, this, f51371i[1]), simpleType);
        }
        return jvmBuiltInsSignatures.isSerializableInJava(fqNameUnsafe) ? AbstractC9393x3.m9974d(simpleType) : C17689w.f56480Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    public boolean isFunctionAvailable(ClassDescriptor classDescriptor, SimpleFunctionDescriptor functionDescriptor) {
        AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
        AbstractC16544l.m18094g(functionDescriptor, "functionDescriptor");
        LazyJavaClassDescriptor lazyJavaClassDescriptorM18121a = m18121a(classDescriptor);
        if (lazyJavaClassDescriptorM18121a == null || !functionDescriptor.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME())) {
            return true;
        }
        if (!m18122b().isAdditionalBuiltInsFeatureSupported()) {
            return false;
        }
        String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 3, null);
        LazyJavaClassMemberScope unsubstitutedMemberScope = lazyJavaClassDescriptorM18121a.getUnsubstitutedMemberScope();
        Name name = functionDescriptor.getName();
        AbstractC16544l.m18093f(name, "getName(...)");
        Collection<SimpleFunctionDescriptor> contributedFunctions = unsubstitutedMemberScope.getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS);
        if (!(contributedFunctions instanceof Collection) || !contributedFunctions.isEmpty()) {
            Iterator<T> it = contributedFunctions.iterator();
            while (it.hasNext()) {
                if (AbstractC16544l.m18089b(MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) it.next(), false, false, 3, null), strComputeJvmDescriptor$default)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f6  */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Collection<SimpleFunctionDescriptor> getFunctions(Name name, ClassDescriptor classDescriptor) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Annotations annotations;
        DeclarationDescriptor containingDeclaration;
        boolean zBooleanValue;
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
        boolean zEquals = name.equals(CloneableClassScope.Companion.getCLONE_NAME());
        List<SimpleFunctionDescriptor> list = C17689w.f56480Y;
        InterfaceC3776x[] interfaceC3776xArr = f51371i;
        if (zEquals && (classDescriptor instanceof DeserializedClassDescriptor) && KotlinBuiltIns.isArrayOrPrimitiveArray(classDescriptor)) {
            DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptor;
            List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
            AbstractC16544l.m18093f(functionList, "getFunctionList(...)");
            List<ProtoBuf.Function> list2 = functionList;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (AbstractC16544l.m18089b(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Function) it.next()).getName()), CloneableClassScope.Companion.getCLONE_NAME())) {
                        return list;
                    }
                }
            }
            FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = ((SimpleFunctionDescriptor) AbstractC17680n.m19364n0(((SimpleType) StorageKt.getValue(this.f51376e, this, interfaceC3776xArr[1])).getMemberScope().getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS))).newCopyBuilder();
            copyBuilderNewCopyBuilder.setOwner(deserializedClassDescriptor);
            copyBuilderNewCopyBuilder.setVisibility(DescriptorVisibilities.PUBLIC);
            copyBuilderNewCopyBuilder.setReturnType(deserializedClassDescriptor.getDefaultType());
            copyBuilderNewCopyBuilder.setDispatchReceiverParameter(deserializedClassDescriptor.getThisAsReceiverParameter());
            FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
            AbstractC16544l.m18091d(functionDescriptorBuild);
            return AbstractC9393x3.m9974d((SimpleFunctionDescriptor) functionDescriptorBuild);
        }
        if (!m18122b().isAdditionalBuiltInsFeatureSupported()) {
            return list;
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorM18121a = m18121a(classDescriptor);
        boolean z6 = false;
        if (lazyJavaClassDescriptorM18121a != null) {
            FqName fqNameSafe = DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptorM18121a);
            KotlinBuiltIns fallbackBuiltIns$Companion = C6265a.f20358f.getInstance();
            JavaToKotlinClassMapper javaToKotlinClassMapper = this.f51373b;
            Collection<ClassDescriptor> collectionMapPlatformClass = javaToKotlinClassMapper.mapPlatformClass(fqNameSafe, fallbackBuiltIns$Companion);
            ClassDescriptor classDescriptor2 = (ClassDescriptor) AbstractC17680n.m19352b0(collectionMapPlatformClass);
            if (classDescriptor2 != null) {
                SmartSet.Companion companion = SmartSet.Companion;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collectionMapPlatformClass, 10));
                Iterator<T> it2 = collectionMapPlatformClass.iterator();
                while (it2.hasNext()) {
                    arrayList.add(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) it2.next()));
                }
                SmartSet smartSetCreate = companion.create(arrayList);
                boolean zIsMutable = javaToKotlinClassMapper.isMutable(classDescriptor);
                MemberScope unsubstitutedMemberScope = ((ClassDescriptor) this.f51377f.computeIfAbsent(DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptorM18121a), new C5150L(lazyJavaClassDescriptorM18121a, 7, classDescriptor2))).getUnsubstitutedMemberScope();
                AbstractC16544l.m18093f(unsubstitutedMemberScope, "getUnsubstitutedMemberScope(...)");
                Collection<? extends SimpleFunctionDescriptor> contributedFunctions = unsubstitutedMemberScope.getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : contributedFunctions) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) obj;
                    if (simpleFunctionDescriptor2.getKind() == CallableMemberDescriptor.Kind.DECLARATION && simpleFunctionDescriptor2.getVisibility().isPublicAPI() && !KotlinBuiltIns.isDeprecated(simpleFunctionDescriptor2)) {
                        Collection<? extends FunctionDescriptor> overriddenDescriptors = simpleFunctionDescriptor2.getOverriddenDescriptors();
                        AbstractC16544l.m18093f(overriddenDescriptors, HJrCuD.djwOEXkNJ);
                        Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
                        if ((collection instanceof Collection) && collection.isEmpty()) {
                            containingDeclaration = simpleFunctionDescriptor2.getContainingDeclaration();
                            AbstractC16544l.m18092e(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            if (JvmBuiltInsSignatures.INSTANCE.getMUTABLE_METHOD_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, (ClassDescriptor) containingDeclaration, MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor2, z6, z6, 3, null))) ^ zIsMutable) {
                                zBooleanValue = true;
                            } else {
                                Boolean boolIfAny = DFS.ifAny(AbstractC9393x3.m9974d(simpleFunctionDescriptor2), C6270f.f20367Y, new C6269e(this, 1));
                                AbstractC16544l.m18093f(boolIfAny, "ifAny(...)");
                                zBooleanValue = boolIfAny.booleanValue();
                            }
                            if (zBooleanValue) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                        } else {
                            Iterator<T> it3 = collection.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    DeclarationDescriptor containingDeclaration2 = ((FunctionDescriptor) it3.next()).getContainingDeclaration();
                                    AbstractC16544l.m18093f(containingDeclaration2, "getContainingDeclaration(...)");
                                    if (smartSetCreate.contains(DescriptorUtilsKt.getFqNameSafe(containingDeclaration2))) {
                                    }
                                } else {
                                    containingDeclaration = simpleFunctionDescriptor2.getContainingDeclaration();
                                    AbstractC16544l.m18092e(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                    if (JvmBuiltInsSignatures.INSTANCE.getMUTABLE_METHOD_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, (ClassDescriptor) containingDeclaration, MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor2, z6, z6, 3, null))) ^ zIsMutable) {
                                        zBooleanValue = true;
                                    } else {
                                        Boolean boolIfAny2 = DFS.ifAny(AbstractC9393x3.m9974d(simpleFunctionDescriptor2), C6270f.f20367Y, new C6269e(this, 1));
                                        AbstractC16544l.m18093f(boolIfAny2, "ifAny(...)");
                                        zBooleanValue = boolIfAny2.booleanValue();
                                    }
                                    if (zBooleanValue) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                }
                            }
                        }
                    }
                    if (z6) {
                        arrayList2.add(obj);
                    }
                    z6 = false;
                }
                list = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (SimpleFunctionDescriptor simpleFunctionDescriptor3 : list) {
            DeclarationDescriptor containingDeclaration3 = simpleFunctionDescriptor3.getContainingDeclaration();
            AbstractC16544l.m18092e(containingDeclaration3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            FunctionDescriptor functionDescriptorSubstitute = simpleFunctionDescriptor3.substitute(MappingUtilKt.createMappedTypeParametersSubstitution((ClassDescriptor) containingDeclaration3, classDescriptor).buildSubstitutor());
            AbstractC16544l.m18092e(functionDescriptorSubstitute, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder2 = ((SimpleFunctionDescriptor) functionDescriptorSubstitute).newCopyBuilder();
            copyBuilderNewCopyBuilder2.setOwner(classDescriptor);
            copyBuilderNewCopyBuilder2.setDispatchReceiverParameter(classDescriptor.getThisAsReceiverParameter());
            copyBuilderNewCopyBuilder2.setPreserveSourceElement();
            DeclarationDescriptor containingDeclaration4 = simpleFunctionDescriptor3.getContainingDeclaration();
            AbstractC16544l.m18092e(containingDeclaration4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            final String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor3, false, false, 3, null);
            final C16525B c16525b = new C16525B();
            Object objDfs = DFS.dfs(AbstractC9393x3.m9974d((ClassDescriptor) containingDeclaration4), new C10808o(this, 19), new DFS.AbstractNodeHandler<ClassDescriptor, EnumC6271g>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getJdkMethodStatus$2
                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
                public boolean beforeChildren(ClassDescriptor javaClassDescriptor) {
                    AbstractC16544l.m18094g(javaClassDescriptor, "javaClassDescriptor");
                    String strSignature = MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, javaClassDescriptor, strComputeJvmDescriptor$default);
                    JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
                    boolean zContains = jvmBuiltInsSignatures.getHIDDEN_METHOD_SIGNATURES().contains(strSignature);
                    C16525B c16525b2 = c16525b;
                    if (zContains) {
                        c16525b2.f51262Y = EnumC6271g.f20368Y;
                    } else if (jvmBuiltInsSignatures.getVISIBLE_METHOD_SIGNATURES().contains(strSignature)) {
                        c16525b2.f51262Y = EnumC6271g.f20369Z;
                    } else if (jvmBuiltInsSignatures.getDEPRECATED_LIST_METHODS().contains(strSignature)) {
                        c16525b2.f51262Y = EnumC6271g.f20370o0;
                    } else if (jvmBuiltInsSignatures.getDROP_LIST_METHOD_SIGNATURES().contains(strSignature)) {
                        c16525b2.f51262Y = EnumC6271g.f20372q0;
                    }
                    return c16525b2.f51262Y == null;
                }

                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
                public EnumC6271g result() {
                    EnumC6271g enumC6271g = (EnumC6271g) c16525b.f51262Y;
                    return enumC6271g == null ? EnumC6271g.f20371p0 : enumC6271g;
                }
            });
            AbstractC16544l.m18093f(objDfs, "dfs(...)");
            int iOrdinal = ((EnumC6271g) objDfs).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        Name name2 = simpleFunctionDescriptor3.getName();
                        boolean zM18089b = AbstractC16544l.m18089b(name2, JvmBuiltInsCustomizerKt.f51382a);
                        MemoizedFunctionToNotNull memoizedFunctionToNotNull = this.f51379h;
                        if (zM18089b) {
                            annotations = (Annotations) memoizedFunctionToNotNull.invoke(new C17309l(simpleFunctionDescriptor3.getName().asString(), "first"));
                        } else {
                            if (!AbstractC16544l.m18089b(name2, JvmBuiltInsCustomizerKt.f51383b)) {
                                throw new IllegalStateException(("Unexpected name: " + simpleFunctionDescriptor3.getName()).toString());
                            }
                            annotations = (Annotations) memoizedFunctionToNotNull.invoke(new C17309l(simpleFunctionDescriptor3.getName().asString(), "last"));
                        }
                        copyBuilderNewCopyBuilder2.setAdditionalAnnotations(annotations);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new C0644w();
                        }
                        simpleFunctionDescriptor = null;
                    } else {
                        copyBuilderNewCopyBuilder2.setAdditionalAnnotations((Annotations) StorageKt.getValue(this.f51378g, this, interfaceC3776xArr[2]));
                    }
                }
                FunctionDescriptor functionDescriptorBuild2 = copyBuilderNewCopyBuilder2.build();
                AbstractC16544l.m18091d(functionDescriptorBuild2);
                simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptorBuild2;
            } else if (ModalityUtilsKt.isFinalClass(classDescriptor)) {
                simpleFunctionDescriptor = null;
            } else {
                copyBuilderNewCopyBuilder2.setHiddenForResolutionEverywhereBesideSupercalls();
                FunctionDescriptor functionDescriptorBuild3 = copyBuilderNewCopyBuilder2.build();
                AbstractC16544l.m18091d(functionDescriptorBuild3);
                simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptorBuild3;
            }
            if (simpleFunctionDescriptor != null) {
                arrayList3.add(simpleFunctionDescriptor);
            }
        }
        return arrayList3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Set<Name> getFunctionsNames(ClassDescriptor classDescriptor) {
        LazyJavaClassDescriptor lazyJavaClassDescriptorM18121a;
        LazyJavaClassMemberScope unsubstitutedMemberScope;
        Set<Name> functionNames;
        AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
        boolean zIsAdditionalBuiltInsFeatureSupported = m18122b().isAdditionalBuiltInsFeatureSupported();
        C17691y c17691y = C17691y.f56482Y;
        return (!zIsAdditionalBuiltInsFeatureSupported || (lazyJavaClassDescriptorM18121a = m18121a(classDescriptor)) == null || (unsubstitutedMemberScope = lazyJavaClassDescriptorM18121a.getUnsubstitutedMemberScope()) == null || (functionNames = unsubstitutedMemberScope.getFunctionNames()) == null) ? c17691y : functionNames;
    }
}
