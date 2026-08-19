package p077Cn;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLoadingKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder$ClassEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AnnotationsContainerWithConstants;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import mm.C17296C;
import om.C18240g;
import p025An.C0624m;
import p025An.C0631p0;
import p025An.InterfaceC0595V;
import p049Bm.InterfaceC1436k;
import p436Rm.C6935a;
import p534Vm.C8400a;
import p877ln.C17069a;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import pn.C18524k;

/* JADX INFO: renamed from: Cn.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C1756x implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5028Y;

    /* JADX INFO: renamed from: Z */
    public final Object f5029Z;

    public /* synthetic */ C1756x(Object obj, int i10) {
        this.f5028Y = i10;
        this.f5029Z = obj;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:152:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:187:0x0477  */
    /* JADX WARN: Code duplicated, block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f4  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        boolean zEquals;
        Object next;
        PackageFragmentDescriptor packageFragmentDescriptor;
        DeserializationContext deserializationContextCreateContext;
        PackageFragmentDescriptor packageFragmentDescriptor2;
        ClassDescriptor classDescriptorCreateClass;
        TypeProjection typeProjectionComputeProjection;
        C17296C c17296c = C17296C.f55119a;
        boolean z6 = true;
        Object obj2 = this.f5029Z;
        switch (this.f5028Y) {
            case 0:
                ((C0624m) obj2).resumeWith(c17296c);
                return c17296c;
            case 1:
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
                C6935a c6935a = (C6935a) obj2;
                ClassifierDescriptor classifierDescriptorRefineDescriptor = kotlinTypeRefiner.refineDescriptor(c6935a.f22216Z);
                if (classifierDescriptorRefineDescriptor == null) {
                    return (SimpleType) c6935a.f22216Z.f51466Z.invoke();
                }
                if (classifierDescriptorRefineDescriptor instanceof TypeAliasDescriptor) {
                    return KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) classifierDescriptorRefineDescriptor, TypeUtils.getDefaultTypeProjections(classifierDescriptorRefineDescriptor.getTypeConstructor().getParameters()));
                }
                return classifierDescriptorRefineDescriptor instanceof ModuleAwareClassDescriptor ? TypeUtils.makeUnsubstitutedType(classifierDescriptorRefineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner), ((ModuleAwareClassDescriptor) classifierDescriptorRefineDescriptor).getUnsubstitutedMemberScope(kotlinTypeRefiner), this) : classifierDescriptorRefineDescriptor.getDefaultType();
            case 2:
                UnwrappedType unwrappedType = (UnwrappedType) obj;
                int i10 = AbstractTypeAliasDescriptor.f51469v0;
                AbstractC16544l.m18091d(unwrappedType);
                if (!KotlinTypeKt.isError(unwrappedType)) {
                    ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = unwrappedType.getConstructor().mo22589getDeclarationDescriptor();
                    z6 = (classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptor) && !AbstractC16544l.m18089b(((TypeParameterDescriptor) classifierDescriptorMo22589getDeclarationDescriptor).getContainingDeclaration(), (AbstractTypeAliasDescriptor) obj2);
                }
                return Boolean.valueOf(z6);
            case 3:
                int i11 = AbstractTypeAliasDescriptor.f51469v0;
                ClassifierDescriptor classifierDescriptorRefineDescriptor2 = ((KotlinTypeRefiner) obj).refineDescriptor((DeserializedTypeAliasDescriptor) obj2);
                if (classifierDescriptorRefineDescriptor2 != null) {
                    return classifierDescriptorRefineDescriptor2.getDefaultType();
                }
                return null;
            case 4:
                SimpleType simpleType = (SimpleType) obj;
                LazySubstitutingClassDescriptor lazySubstitutingClassDescriptor = (LazySubstitutingClassDescriptor) obj2;
                if (simpleType != null) {
                    return lazySubstitutingClassDescriptor.f51562Z.isEmpty() ? simpleType : (SimpleType) lazySubstitutingClassDescriptor.m18147b().substitute(simpleType, Variance.INVARIANT);
                }
                int i12 = LazySubstitutingClassDescriptor.f51560s0;
                lazySubstitutingClassDescriptor.getClass();
                return simpleType;
            case 5:
                FqName fqName = (FqName) obj;
                AbstractC16544l.m18094g(fqName, "fqName");
                ModuleDescriptorImpl moduleDescriptorImpl = (ModuleDescriptorImpl) obj2;
                return moduleDescriptorImpl.f51573r0.compute(moduleDescriptorImpl, fqName, moduleDescriptorImpl.f51570o0);
            case 6:
                ((InterfaceC0595V) obj2).dispose();
                return c17296c;
            case 7:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((C0631p0) obj2).mo1311w(new CancellationException(th2.getMessage()));
                }
                return c17296c;
            case 8:
                Method method = (Method) obj;
                if (method.isSynthetic()) {
                    z6 = false;
                } else if (((ReflectJavaClass) obj2).isEnum()) {
                    String name = method.getName();
                    if (AbstractC16544l.m18089b(name, "values")) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        AbstractC16544l.m18093f(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (AbstractC16544l.m18089b(name, "valueOf")) {
                        zEquals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                    } else {
                        zEquals = false;
                    }
                    if (zEquals) {
                        z6 = false;
                    }
                }
                return Boolean.valueOf(z6);
            case 9:
                CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
                BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName = BuiltinMethodsWithDifferentJvmName.INSTANCE;
                AbstractC16544l.m18094g(it, "it");
                return Boolean.valueOf(SpecialGenericSignatures.Companion.getSIGNATURE_TO_JVM_REPRESENTATION_NAME().containsKey(MethodSignatureMappingKt.computeJvmSignature((SimpleFunctionDescriptor) obj2)));
            case 10:
                FqName fqName2 = (FqName) obj;
                AbstractC16544l.m18091d(fqName2);
                return FqNamesUtilKt.findValueForMostSpecificFqname(fqName2, ((NullabilityAnnotationStatesImpl) obj2).f51777a);
            case 11:
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
                if (callableMemberDescriptor == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                }
                ((C8400a) obj2).f26126a.reportCannotInferVisibility(callableMemberDescriptor);
                return c17296c;
            case 12:
                JavaAnnotation annotation = (JavaAnnotation) obj;
                AbstractC16544l.m18094g(annotation, "annotation");
                LazyJavaAnnotations lazyJavaAnnotations = (LazyJavaAnnotations) obj2;
                return JavaAnnotationMapper.INSTANCE.mapOrResolveJavaAnnotation(annotation, lazyJavaAnnotations.f51858Y, lazyJavaAnnotations.f51860o0);
            case 13:
                JavaTypeParameter typeParameter = (JavaTypeParameter) obj;
                AbstractC16544l.m18094g(typeParameter, "typeParameter");
                LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = (LazyJavaTypeParameterResolver) obj2;
                Integer num = (Integer) lazyJavaTypeParameterResolver.f51871d.get(typeParameter);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                LazyJavaResolverContext lazyJavaResolverContextChild = ContextKt.child(lazyJavaTypeParameterResolver.f51868a, lazyJavaTypeParameterResolver);
                DeclarationDescriptor declarationDescriptor = lazyJavaTypeParameterResolver.f51869b;
                return new LazyJavaTypeParameterDescriptor(ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContextChild, declarationDescriptor.getAnnotations()), typeParameter, lazyJavaTypeParameterResolver.f51870c + iIntValue, declarationDescriptor);
            case 14:
                JavaMethod m6 = (JavaMethod) obj;
                AbstractC16544l.m18094g(m6, "m");
                return Boolean.valueOf(((Boolean) ((ClassDeclaredMemberIndex) obj2).f51874b.invoke(m6)).booleanValue() && !JavaLoadingKt.isObjectMethodInInterface(m6));
            case 15:
                KotlinTypeRefiner it2 = (KotlinTypeRefiner) obj;
                LazyJavaClassDescriptor.Companion companion = LazyJavaClassDescriptor.Companion;
                AbstractC16544l.m18094g(it2, "it");
                LazyJavaClassDescriptor lazyJavaClassDescriptor = (LazyJavaClassDescriptor) obj2;
                return new LazyJavaClassMemberScope(lazyJavaClassDescriptor.f51905w0, lazyJavaClassDescriptor, lazyJavaClassDescriptor.f51903u0, lazyJavaClassDescriptor.f51904v0 != null, lazyJavaClassDescriptor.f51896D0);
            case 16:
                MemberScope it3 = (MemberScope) obj;
                int i13 = LazyJavaStaticClassScope.f51953o;
                AbstractC16544l.m18094g(it3, "it");
                return it3.getContributedVariables((Name) obj2, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            case 17:
                SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder$ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f51989a;
                AbstractC16544l.m18094g(function, "$this$function");
                String strJavaUtil = ((SignatureBuildingComponents) obj2).javaUtil("Spliterator");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.f51990b;
                function.returns(strJavaUtil, javaTypeQualifiers2, javaTypeQualifiers2);
                return c17296c;
            case 18:
                CallableMemberDescriptor it4 = (CallableMemberDescriptor) obj;
                AbstractC16544l.m18094g(it4, "it");
                KotlinType type = it4.getValueParameters().get(((ValueParameterDescriptor) obj2).getIndex()).getType();
                AbstractC16544l.m18093f(type, "getType(...)");
                return type;
            case 19:
                final KotlinJvmBinaryClass kotlinClass = (KotlinJvmBinaryClass) obj;
                int i14 = AbstractBinaryClassAnnotationAndConstantLoader.f52009c;
                AbstractC16544l.m18094g(kotlinClass, "kotlinClass");
                final AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader = (AbstractBinaryClassAnnotationAndConstantLoader) obj2;
                abstractBinaryClassAnnotationAndConstantLoader.getClass();
                final HashMap map = new HashMap();
                final HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                kotlinClass.visitMembers(new KotlinJvmBinaryClass.MemberVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1

                    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1$AnnotationVisitorForMethod */
                    public final class AnnotationVisitorForMethod extends MemberAnnotationVisitor implements KotlinJvmBinaryClass.MethodAnnotationVisitor {

                        /* JADX INFO: renamed from: d */
                        public final /* synthetic */ C16565x2cf49cf1 f52015d;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnnotationVisitorForMethod(C16565x2cf49cf1 c16565x2cf49cf1, MemberSignature signature) {
                            super(c16565x2cf49cf1, signature);
                            AbstractC16544l.m18094g(signature, "signature");
                            this.f52015d = c16565x2cf49cf1;
                        }

                        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor
                        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation(int i10, ClassId classId, SourceElement source) {
                            AbstractC16544l.m18094g(classId, "classId");
                            AbstractC16544l.m18094g(source, "source");
                            MemberSignature memberSignatureFromMethodSignatureAndParameterIndex = MemberSignature.Companion.fromMethodSignatureAndParameterIndex(this.f52016a, i10);
                            C16565x2cf49cf1 c16565x2cf49cf1 = this.f52015d;
                            List arrayList = (List) map.get(memberSignatureFromMethodSignatureAndParameterIndex);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                map.put(memberSignatureFromMethodSignatureAndParameterIndex, arrayList);
                            }
                            return abstractBinaryClassAnnotationAndConstantLoader.m18240f(classId, source, arrayList);
                        }
                    }

                    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1$MemberAnnotationVisitor */
                    public class MemberAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

                        /* JADX INFO: renamed from: a */
                        public final MemberSignature f52016a;

                        /* JADX INFO: renamed from: b */
                        public final ArrayList f52017b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ C16565x2cf49cf1 f52018c;

                        public MemberAnnotationVisitor(C16565x2cf49cf1 c16565x2cf49cf1, MemberSignature signature) {
                            AbstractC16544l.m18094g(signature, "signature");
                            this.f52018c = c16565x2cf49cf1;
                            this.f52016a = signature;
                            this.f52017b = new ArrayList();
                        }

                        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement source) {
                            AbstractC16544l.m18094g(classId, "classId");
                            AbstractC16544l.m18094g(source, "source");
                            return abstractBinaryClassAnnotationAndConstantLoader.m18240f(classId, source, this.f52017b);
                        }

                        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                        public void visitEnd() {
                            ArrayList arrayList = this.f52017b;
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            map.put(this.f52016a, arrayList);
                        }
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
                    public KotlinJvmBinaryClass.AnnotationVisitor visitField(Name name2, String desc, Object obj3) {
                        Object objLoadConstant;
                        AbstractC16544l.m18094g(name2, "name");
                        AbstractC16544l.m18094g(desc, "desc");
                        MemberSignature.Companion companion2 = MemberSignature.Companion;
                        String strAsString = name2.asString();
                        AbstractC16544l.m18093f(strAsString, "asString(...)");
                        MemberSignature memberSignatureFromFieldNameAndDesc = companion2.fromFieldNameAndDesc(strAsString, desc);
                        if (obj3 != null && (objLoadConstant = abstractBinaryClassAnnotationAndConstantLoader.loadConstant(desc, obj3)) != null) {
                            map2.put(memberSignatureFromFieldNameAndDesc, objLoadConstant);
                        }
                        return new MemberAnnotationVisitor(this, memberSignatureFromFieldNameAndDesc);
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
                    public KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod(Name name2, String desc) {
                        AbstractC16544l.m18094g(name2, "name");
                        AbstractC16544l.m18094g(desc, "desc");
                        MemberSignature.Companion companion2 = MemberSignature.Companion;
                        String strAsString = name2.asString();
                        AbstractC16544l.m18093f(strAsString, "asString(...)");
                        return new AnnotationVisitorForMethod(this, companion2.fromMethodNameAndDesc(strAsString, desc));
                    }
                }, null);
                return new AnnotationsContainerWithConstants(map, map2, map3);
            case 20:
                AbstractC16544l.m18091d(obj);
                ((SmartSet) obj2).add(obj);
                return c17296c;
            case 21:
                ModuleDescriptor it5 = (ModuleDescriptor) obj;
                AbstractC16544l.m18094g(it5, "it");
                SimpleType primitiveArrayKotlinType = it5.getBuiltIns().getPrimitiveArrayKotlinType((PrimitiveType) obj2);
                AbstractC16544l.m18093f(primitiveArrayKotlinType, "getPrimitiveArrayKotlinType(...)");
                return primitiveArrayKotlinType;
            case 22:
                ModuleDescriptor it6 = (ModuleDescriptor) obj;
                AbstractC16544l.m18094g(it6, "it");
                return (KotlinType) obj2;
            case 23:
                FqName fqName3 = (FqName) obj;
                AbstractC16544l.m18094g(fqName3, "fqName");
                AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider = (AbstractDeserializedPackageFragmentProvider) obj2;
                BuiltInsPackageFragmentImpl builtInsPackageFragmentImplMo18123a = abstractDeserializedPackageFragmentProvider.mo18123a(fqName3);
                if (builtInsPackageFragmentImplMo18123a == null) {
                    return null;
                }
                DeserializationComponents deserializationComponents = abstractDeserializedPackageFragmentProvider.f52979d;
                if (deserializationComponents != null) {
                    builtInsPackageFragmentImplMo18123a.initialize(deserializationComponents);
                    return builtInsPackageFragmentImplMo18123a;
                }
                AbstractC16544l.m18103p("components");
                throw null;
            case 24:
                C17069a key = (C17069a) obj;
                ClassDeserializer.Companion companion2 = ClassDeserializer.Companion;
                AbstractC16544l.m18094g(key, "key");
                ClassDeserializer classDeserializer = (ClassDeserializer) obj2;
                classDeserializer.getClass();
                DeserializationComponents deserializationComponents2 = classDeserializer.f52990a;
                Iterator<ClassDescriptorFactory> it7 = deserializationComponents2.getFictitiousClassDescriptorFactories().iterator();
                do {
                    boolean zHasNext = it7.hasNext();
                    ClassId classId = key.f54546a;
                    if (!zHasNext) {
                        if (ClassDeserializer.f52989c.contains(classId)) {
                            return null;
                        }
                        ClassData classDataFindClassData = key.f54547b;
                        if (classDataFindClassData == null && (classDataFindClassData = deserializationComponents2.getClassDataFinder().findClassData(classId)) == null) {
                            return null;
                        }
                        NameResolver nameResolverComponent1 = classDataFindClassData.component1();
                        ProtoBuf.Class classComponent2 = classDataFindClassData.component2();
                        BinaryVersion binaryVersionComponent3 = classDataFindClassData.component3();
                        SourceElement sourceElementComponent4 = classDataFindClassData.component4();
                        ClassId outerClassId = classId.getOuterClassId();
                        if (outerClassId != null) {
                            ClassDescriptor classDescriptorDeserializeClass$default = ClassDeserializer.deserializeClass$default(classDeserializer, outerClassId, null, 2, null);
                            DeserializedClassDescriptor deserializedClassDescriptor = classDescriptorDeserializeClass$default instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) classDescriptorDeserializeClass$default : null;
                            if (deserializedClassDescriptor == null || !deserializedClassDescriptor.hasNestedClass$deserialization(classId.getShortClassName())) {
                                return null;
                            }
                            deserializationContextCreateContext = deserializedClassDescriptor.getC();
                        } else {
                            Iterator<T> it8 = PackageFragmentProviderKt.packageFragments(deserializationComponents2.getPackageFragmentProvider(), classId.getPackageFqName()).iterator();
                            do {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    packageFragmentDescriptor2 = (PackageFragmentDescriptor) next;
                                    if (packageFragmentDescriptor2 instanceof DeserializedPackageFragment) {
                                    }
                                } else {
                                    next = null;
                                }
                                packageFragmentDescriptor = (PackageFragmentDescriptor) next;
                                if (packageFragmentDescriptor == null) {
                                    return null;
                                }
                                ProtoBuf.TypeTable typeTable = classComponent2.getTypeTable();
                                AbstractC16544l.m18093f(typeTable, "getTypeTable(...)");
                                TypeTable typeTable2 = new TypeTable(typeTable);
                                VersionRequirementTable.Companion companion3 = VersionRequirementTable.Companion;
                                ProtoBuf.VersionRequirementTable versionRequirementTable = classComponent2.getVersionRequirementTable();
                                AbstractC16544l.m18093f(versionRequirementTable, "getVersionRequirementTable(...)");
                                deserializationContextCreateContext = classDeserializer.f52990a.createContext(packageFragmentDescriptor, nameResolverComponent1, typeTable2, companion3.create(versionRequirementTable), binaryVersionComponent3, null);
                            } while (!((DeserializedPackageFragment) packageFragmentDescriptor2).hasTopLevelClass(classId.getShortClassName()));
                            packageFragmentDescriptor = (PackageFragmentDescriptor) next;
                            if (packageFragmentDescriptor == null) {
                                return null;
                            }
                            ProtoBuf.TypeTable typeTable3 = classComponent2.getTypeTable();
                            AbstractC16544l.m18093f(typeTable3, "getTypeTable(...)");
                            TypeTable typeTable4 = new TypeTable(typeTable3);
                            VersionRequirementTable.Companion companion4 = VersionRequirementTable.Companion;
                            ProtoBuf.VersionRequirementTable versionRequirementTable2 = classComponent2.getVersionRequirementTable();
                            AbstractC16544l.m18093f(versionRequirementTable2, "getVersionRequirementTable(...)");
                            deserializationContextCreateContext = classDeserializer.f52990a.createContext(packageFragmentDescriptor, nameResolverComponent1, typeTable4, companion4.create(versionRequirementTable2), binaryVersionComponent3, null);
                        }
                        return new DeserializedClassDescriptor(deserializationContextCreateContext, classComponent2, nameResolverComponent1, binaryVersionComponent3, sourceElementComponent4);
                    }
                    classDescriptorCreateClass = it7.next().createClass(classId);
                } while (classDescriptorCreateClass == null);
                return classDescriptorCreateClass;
            case 25:
                ClassId it9 = (ClassId) obj;
                AbstractC16544l.m18094g(it9, "it");
                DeserializedContainerSource deserializedContainerSource = ((DeserializedPackageFragmentImpl) obj2).f53027u0;
                if (deserializedContainerSource != null) {
                    return deserializedContainerSource;
                }
                SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
                AbstractC16544l.m18093f(NO_SOURCE, "NO_SOURCE");
                return NO_SOURCE;
            case 26:
                KotlinType kotlinType = (KotlinType) obj;
                AbstractC16544l.m18091d(kotlinType);
                return ((InterfaceC1436k) obj2).invoke(kotlinType).toString();
            case 27:
                KotlinTypeRefiner kotlinTypeRefiner2 = (KotlinTypeRefiner) obj;
                AbstractC16544l.m18094g(kotlinTypeRefiner2, "kotlinTypeRefiner");
                return ((IntersectionTypeConstructor) obj2).refine(kotlinTypeRefiner2).createType();
            default:
                C18524k c18524k = (C18524k) obj;
                TypeParameterUpperBoundEraser.Companion companion5 = TypeParameterUpperBoundEraser.Companion;
                TypeParameterDescriptor typeParameterDescriptor = c18524k.f59025a;
                TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = (TypeParameterUpperBoundEraser) obj2;
                typeParameterUpperBoundEraser.getClass();
                ErasureTypeAttributes erasureTypeAttributes = c18524k.f59026b;
                Set<TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
                if (visitedTypeParameters != null && visitedTypeParameters.contains(typeParameterDescriptor.getOriginal())) {
                    return typeParameterUpperBoundEraser.m18425a(erasureTypeAttributes);
                }
                SimpleType defaultType = typeParameterDescriptor.getDefaultType();
                AbstractC16544l.m18093f(defaultType, "getDefaultType(...)");
                Set<TypeParameterDescriptor> setExtractTypeParametersFromUpperBounds = TypeUtilsKt.extractTypeParametersFromUpperBounds(defaultType, visitedTypeParameters);
                int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(setExtractTypeParametersFromUpperBounds, 10));
                if (iM19257b < 16) {
                    iM19257b = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
                for (TypeParameterDescriptor typeParameterDescriptor2 : setExtractTypeParametersFromUpperBounds) {
                    if (visitedTypeParameters == null || !visitedTypeParameters.contains(typeParameterDescriptor2)) {
                        typeProjectionComputeProjection = typeParameterUpperBoundEraser.f53208a.computeProjection(typeParameterDescriptor2, erasureTypeAttributes, typeParameterUpperBoundEraser, typeParameterUpperBoundEraser.getErasedUpperBound(typeParameterDescriptor2, erasureTypeAttributes.withNewVisitedTypeParameter(typeParameterDescriptor)));
                    } else {
                        typeProjectionComputeProjection = TypeUtils.makeStarProjection(typeParameterDescriptor2, erasureTypeAttributes);
                        AbstractC16544l.m18093f(typeProjectionComputeProjection, "makeStarProjection(...)");
                    }
                    linkedHashMap.put(typeParameterDescriptor2.getTypeConstructor(), typeProjectionComputeProjection);
                }
                TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(TypeConstructorSubstitution.Companion.createByConstructorsMap$default(TypeConstructorSubstitution.Companion, linkedHashMap, false, 2, null));
                AbstractC16544l.m18093f(typeSubstitutorCreate, "create(...)");
                List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
                AbstractC16544l.m18093f(upperBounds, "getUpperBounds(...)");
                C18240g c18240gM18426b = typeParameterUpperBoundEraser.m18426b(typeSubstitutorCreate, upperBounds, erasureTypeAttributes);
                if (c18240gM18426b.f58127Y.isEmpty()) {
                    return typeParameterUpperBoundEraser.m18425a(erasureTypeAttributes);
                }
                if (!typeParameterUpperBoundEraser.f53209b.getIntersectUpperBounds()) {
                    if (c18240gM18426b.size() == 1) {
                        return (KotlinType) AbstractC17680n.m19364n0(c18240gM18426b);
                    }
                    throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
                }
                List listM19322C0 = AbstractC17680n.m19322C0(c18240gM18426b);
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM19322C0, 10));
                Iterator it10 = listM19322C0.iterator();
                while (it10.hasNext()) {
                    arrayList.add(((KotlinType) it10.next()).unwrap());
                }
                return IntersectionTypeKt.intersectTypes(arrayList);
        }
    }
}
