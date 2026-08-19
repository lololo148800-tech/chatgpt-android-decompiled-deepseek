package p298Lm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.constants.PrimitiveTypeUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import mm.C17309l;
import om.C18235b;
import p049Bm.InterfaceC1426a;
import p211I8.lPE.sRXLFOsOgS;
import p225Im.InterfaceC3776x;
import p436Rm.C6936b;
import p436Rm.C6940f;
import p571X9.AbstractC9393x3;
import p755fn.C13700a;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import p909nm.C17690x;
import p910nn.C17697e;

/* JADX INFO: renamed from: Lm.G */
/* JADX INFO: loaded from: classes2.dex */
public final class C5140G implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16776Y;

    /* JADX INFO: renamed from: Z */
    public final Object f16777Z;

    public /* synthetic */ C5140G(Object obj, int i10) {
        this.f16776Y = i10;
        this.f16777Z = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r8v5, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        int iHashCode;
        Map mapM19258c;
        ?? arrayList;
        C17690x c17690x = C17690x.f56481Y;
        int iHashCode2 = 0;
        Object obj = this.f16777Z;
        switch (this.f16776Y) {
            case 0:
                return AbstractC5133C0.m5682a(((AbstractC5148K) obj).mo5684d());
            case 1:
                return new C5153O((C5154P) obj);
            case 2:
                return new C5155Q((C5156S) obj);
            case 3:
                return new C5157T((C5158U) obj);
            case 4:
                List<KotlinType> upperBounds = ((C5129A0) obj).f16764Y.getUpperBounds();
                AbstractC16544l.m18093f(upperBounds, "getUpperBounds(...)");
                List<KotlinType> list = upperBounds;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C5213y0((KotlinType) it.next(), null));
                }
                return arrayList2;
            case 5:
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            case 6:
                ReflectionTypes.Companion companion = ReflectionTypes.Companion;
                return ((ModuleDescriptor) obj).getPackage(StandardNames.KOTLIN_REFLECT_FQ_NAME).getMemberScope();
            case 7:
                JvmBuiltIns jvmBuiltIns = (JvmBuiltIns) obj;
                InterfaceC1426a interfaceC1426a = jvmBuiltIns.f51366f;
                if (interfaceC1426a == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                JvmBuiltIns.Settings settings = (JvmBuiltIns.Settings) interfaceC1426a.invoke();
                jvmBuiltIns.f51366f = null;
                return settings;
            case 8:
                ScopesHolderForClass scopesHolderForClass = (ScopesHolderForClass) obj;
                return (MemberScope) scopesHolderForClass.f51418b.invoke(scopesHolderForClass.f51419c);
            case 9:
                BuiltInAnnotationDescriptor builtInAnnotationDescriptor = (BuiltInAnnotationDescriptor) obj;
                return builtInAnnotationDescriptor.f51438a.getBuiltInClassByFqName(builtInAnnotationDescriptor.getFqName()).getDefaultType();
            case 10:
                int i10 = AbstractTypeAliasDescriptor.f51469v0;
                return ((AbstractTypeAliasDescriptor) obj).getTypeAliasConstructors();
            case 11:
                StringBuilder sb2 = new StringBuilder("Scope for type parameter ");
                C6936b c6936b = (C6936b) obj;
                sb2.append(c6936b.f22217Y.asString());
                return TypeIntersectionScope.create(sb2.toString(), c6936b.f22218Z.getUpperBounds());
            case 12:
                C6940f c6940f = (C6940f) obj;
                c6940f.getClass();
                HashSet hashSet = new HashSet();
                for (Name name : (Set) c6940f.f22227d.f51499v0.invoke()) {
                    NoLookupLocation noLookupLocation = NoLookupLocation.FOR_NON_TRACKED_SCOPE;
                    hashSet.addAll(c6940f.getContributedFunctions(name, noLookupLocation));
                    hashSet.addAll(c6940f.getContributedVariables(name, noLookupLocation));
                }
                return hashSet;
            case 13:
                ModuleDescriptorImpl moduleDescriptorImpl = (ModuleDescriptorImpl) obj;
                ModuleDependencies moduleDependencies = moduleDescriptorImpl.f51574s0;
                if (moduleDependencies == null) {
                    StringBuilder sb3 = new StringBuilder("Dependencies of module ");
                    String string = moduleDescriptorImpl.getName().toString();
                    AbstractC16544l.m18093f(string, "toString(...)");
                    sb3.append(string);
                    sb3.append(" were not set before querying module content");
                    throw new AssertionError(sb3.toString());
                }
                List<ModuleDescriptorImpl> allDependencies = moduleDependencies.getAllDependencies();
                moduleDescriptorImpl.assertValid();
                allDependencies.contains(moduleDescriptorImpl);
                List<ModuleDescriptorImpl> list2 = allDependencies;
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((ModuleDescriptorImpl) it2.next()).getClass();
                }
                ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    PackageFragmentProvider packageFragmentProvider = ((ModuleDescriptorImpl) it3.next()).f51575t0;
                    AbstractC16544l.m18091d(packageFragmentProvider);
                    arrayList3.add(packageFragmentProvider);
                }
                return new CompositePackageFragmentProvider(arrayList3, "CompositeProvider@ModuleDescriptor for " + moduleDescriptorImpl.getName());
            case 14:
                int i11 = ValueParameterDescriptorImpl.WithDestructuringDeclaration.f51651y0;
                return ((ValueParameterDescriptorImpl.WithDestructuringDeclaration) obj).getDestructuringVariables();
            case 15:
                C18235b c18235bM9972b = AbstractC9393x3.m9972b();
                Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
                c18235bM9972b.add(jsr305Settings.f51753a.getDescription());
                ReportLevel reportLevel = jsr305Settings.f51754b;
                if (reportLevel != null) {
                    c18235bM9972b.add("under-migration:" + reportLevel.getDescription());
                }
                for (Map.Entry entry2 : jsr305Settings.f51755c.entrySet()) {
                    c18235bM9972b.add(sRXLFOsOgS.ebotlvEz + entry2.getKey() + ':' + ((ReportLevel) entry2.getValue()).getDescription());
                }
                return (String[]) AbstractC9393x3.m9971a(c18235bM9972b).toArray(new String[0]);
            case 16:
                InterfaceC3776x[] interfaceC3776xArr = JavaRetentionAnnotationDescriptor.f51814h;
                ConstantValue<?> constantValueMapJavaRetentionArgument$descriptors_jvm = JavaAnnotationTargetMapper.INSTANCE.mapJavaRetentionArgument$descriptors_jvm(((JavaRetentionAnnotationDescriptor) obj).f51804d);
                mapM19258c = constantValueMapJavaRetentionArgument$descriptors_jvm != null ? AbstractC17660E.m19258c(new C17309l(JavaAnnotationMapper.INSTANCE.getRETENTION_ANNOTATION_VALUE$descriptors_jvm(), constantValueMapJavaRetentionArgument$descriptors_jvm)) : null;
                return mapM19258c == null ? c17690x : mapM19258c;
            case 17:
                InterfaceC3776x[] interfaceC3776xArr2 = JavaTargetAnnotationDescriptor.f51816h;
                JavaAnnotationArgument javaAnnotationArgument = ((JavaTargetAnnotationDescriptor) obj).f51804d;
                ConstantValue<?> constantValueMapJavaTargetArguments$descriptors_jvm = javaAnnotationArgument instanceof JavaArrayAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(((JavaArrayAnnotationArgument) javaAnnotationArgument).getElements()) : javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(AbstractC9393x3.m9974d(javaAnnotationArgument)) : null;
                mapM19258c = constantValueMapJavaTargetArguments$descriptors_jvm != null ? AbstractC17660E.m19258c(new C17309l(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), constantValueMapJavaTargetArguments$descriptors_jvm)) : null;
                return mapM19258c == null ? c17690x : mapM19258c;
            case 18:
                JvmPackageScope jvmPackageScope = (JvmPackageScope) obj;
                Collection<KotlinJvmBinaryClass> collectionValues = jvmPackageScope.f51881b.getBinaryClasses$descriptors_jvm().values();
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = collectionValues.iterator();
                while (it4.hasNext()) {
                    MemberScope memberScopeCreateKotlinPackagePartScope = jvmPackageScope.f51880a.getComponents().getDeserializedDescriptorResolver().createKotlinPackagePartScope(jvmPackageScope.f51881b, (KotlinJvmBinaryClass) it4.next());
                    if (memberScopeCreateKotlinPackagePartScope != null) {
                        arrayList4.add(memberScopeCreateKotlinPackagePartScope);
                    }
                }
                return (MemberScope[]) ScopeUtilsKt.listOfNonEmptyScopes(arrayList4).toArray(new MemberScope[0]);
            case 19:
                int i12 = DescriptorRendererImpl.f52783c;
                DescriptorRenderer descriptorRendererWithOptions = ((DescriptorRendererImpl) obj).withOptions(C13700a.f43229A0);
                AbstractC16544l.m18092e(descriptorRendererWithOptions, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
                return (DescriptorRendererImpl) descriptorRendererWithOptions;
            case 20:
                KotlinType type = ((TypeProjection) obj).getType();
                AbstractC16544l.m18093f(type, "getType(...)");
                return type;
            case 21:
                IntegerLiteralTypeConstructor.Companion companion2 = IntegerLiteralTypeConstructor.Companion;
                IntegerLiteralTypeConstructor integerLiteralTypeConstructor = (IntegerLiteralTypeConstructor) obj;
                SimpleType defaultType = integerLiteralTypeConstructor.getBuiltIns().getComparable().getDefaultType();
                AbstractC16544l.m18093f(defaultType, "getDefaultType(...)");
                ArrayList arrayListM19384m = AbstractC17681o.m19384m(TypeSubstitutionKt.replace$default(defaultType, AbstractC9393x3.m9974d(new TypeProjectionImpl(Variance.IN_VARIANCE, integerLiteralTypeConstructor.f52885d)), null, 2, null));
                Collection<KotlinType> allSignedLiteralTypes = PrimitiveTypeUtilKt.getAllSignedLiteralTypes(integerLiteralTypeConstructor.f52883b);
                if (!(allSignedLiteralTypes instanceof Collection) || !allSignedLiteralTypes.isEmpty()) {
                    Iterator it5 = allSignedLiteralTypes.iterator();
                    while (it5.hasNext()) {
                        if (integerLiteralTypeConstructor.f52884c.contains((KotlinType) it5.next())) {
                            arrayListM19384m.add(integerLiteralTypeConstructor.getBuiltIns().getNumberType());
                        }
                    }
                }
                return arrayListM19384m;
            case 22:
                InterfaceC3776x[] interfaceC3776xArr3 = GivenFunctionsMemberScope.f52930c;
                final GivenFunctionsMemberScope givenFunctionsMemberScope = (GivenFunctionsMemberScope) obj;
                List listMo5681a = givenFunctionsMemberScope.mo5681a();
                List list3 = listMo5681a;
                final ArrayList arrayList5 = new ArrayList(3);
                Collection<KotlinType> supertypes = givenFunctionsMemberScope.f52931a.getTypeConstructor().getSupertypes();
                AbstractC16544l.m18093f(supertypes, "getSupertypes(...)");
                ArrayList arrayList6 = new ArrayList();
                Iterator it6 = supertypes.iterator();
                while (it6.hasNext()) {
                    AbstractC17686t.m19398v(ResolutionScope.DefaultImpls.getContributedDescriptors$default(((KotlinType) it6.next()).getMemberScope(), null, null, 3, null), arrayList6);
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj2 : arrayList6) {
                    if (obj2 instanceof CallableMemberDescriptor) {
                        arrayList7.add(obj2);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList7) {
                    Name name2 = ((CallableMemberDescriptor) obj3).getName();
                    Object arrayList8 = linkedHashMap.get(name2);
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                        linkedHashMap.put(name2, arrayList8);
                    }
                    ((List) arrayList8).add(obj3);
                }
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    Object key = entry3.getKey();
                    AbstractC16544l.m18093f(key, "component1(...)");
                    Name name3 = (Name) key;
                    List list4 = (List) entry3.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj4 : list4) {
                        Boolean boolValueOf = Boolean.valueOf(((CallableMemberDescriptor) obj4) instanceof FunctionDescriptor);
                        Object arrayList9 = linkedHashMap2.get(boolValueOf);
                        if (arrayList9 == null) {
                            arrayList9 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList9);
                        }
                        ((List) arrayList9).add(obj4);
                    }
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry4.getKey()).booleanValue();
                        List list5 = (List) entry4.getValue();
                        OverridingUtil overridingUtil = OverridingUtil.DEFAULT;
                        List list6 = list5;
                        if (zBooleanValue) {
                            arrayList = new ArrayList();
                            for (Object obj5 : listMo5681a) {
                                if (AbstractC16544l.m18089b(((FunctionDescriptor) obj5).getName(), name3)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            arrayList = C17689w.f56480Y;
                        }
                        overridingUtil.generateOverridesInFunctionGroup(name3, list6, (Collection) arrayList, givenFunctionsMemberScope.f52931a, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$createFakeOverrides$4
                            @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                            /* JADX INFO: renamed from: a */
                            public final void mo7325a(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
                                AbstractC16544l.m18094g(fromSuper, "fromSuper");
                                AbstractC16544l.m18094g(fromCurrent, "fromCurrent");
                                throw new IllegalStateException(("Conflict in scope of " + givenFunctionsMemberScope.f52931a + ": " + fromSuper + " vs " + fromCurrent).toString());
                            }

                            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                            public void addFakeOverride(CallableMemberDescriptor fakeOverride) {
                                AbstractC16544l.m18094g(fakeOverride, "fakeOverride");
                                OverridingUtil.resolveUnknownVisibilityForMember(fakeOverride, null);
                                arrayList5.add(fakeOverride);
                            }
                        });
                    }
                }
                return AbstractC17680n.m19361k0(CollectionsKt.compact(arrayList5), list3);
            case 23:
                return ((TypeSubstitutor) obj).getSubstitution().buildSubstitutor();
            case 24:
                SubstitutingScope substitutingScope = (SubstitutingScope) obj;
                return substitutingScope.m18364a(ResolutionScope.DefaultImpls.getContributedDescriptors$default(substitutingScope.f52943a, null, null, 3, null));
            case 25:
                Collection<ClassId> allClassIds = ((DeserializedPackageFragmentImpl) obj).getClassDataFinder().getAllClassIds();
                ArrayList arrayList10 = new ArrayList();
                for (Object obj6 : allClassIds) {
                    ClassId classId = (ClassId) obj6;
                    if (!classId.isNestedClass() && !ClassDeserializer.Companion.getBLACK_LIST().contains(classId)) {
                        arrayList10.add(obj6);
                    }
                }
                ArrayList arrayList11 = new ArrayList(AbstractC17682p.m19389r(arrayList10, 10));
                Iterator it7 = arrayList10.iterator();
                while (it7.hasNext()) {
                    arrayList11.add(((ClassId) it7.next()).getShortClassName());
                }
                return arrayList11;
            case 26:
                return (ArrayList) obj;
            case 27:
                C17697e c17697e = (C17697e) obj;
                c17697e.getClass();
                HashSet hashSet2 = new HashSet();
                DeserializedClassDescriptor deserializedClassDescriptor = c17697e.f56498d;
                Iterator<KotlinType> it8 = deserializedClassDescriptor.getTypeConstructor().getSupertypes().iterator();
                while (it8.hasNext()) {
                    for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.getContributedDescriptors$default(it8.next().getMemberScope(), null, null, 3, null)) {
                        if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                            hashSet2.add(((CallableMemberDescriptor) declarationDescriptor).getName());
                        }
                    }
                }
                List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
                AbstractC16544l.m18093f(functionList, "getFunctionList(...)");
                Iterator it9 = functionList.iterator();
                while (it9.hasNext()) {
                    hashSet2.add(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Function) it9.next()).getName()));
                }
                List<ProtoBuf.Property> propertyList = deserializedClassDescriptor.getClassProto().getPropertyList();
                AbstractC16544l.m18093f(propertyList, "getPropertyList(...)");
                Iterator it10 = propertyList.iterator();
                while (it10.hasNext()) {
                    hashSet2.add(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Property) it10.next()).getName()));
                }
                return AbstractC17665J.m19266f(hashSet2, hashSet2);
            case 28:
                InterfaceC3776x[] interfaceC3776xArr4 = DeserializedMemberScope.f53092e;
                DeserializedMemberScope deserializedMemberScope = (DeserializedMemberScope) obj;
                Set setMo18386f = deserializedMemberScope.mo18386f();
                if (setMo18386f == null) {
                    return null;
                }
                return AbstractC17665J.m19266f(AbstractC17665J.m19266f(deserializedMemberScope.getClassNames$deserialization(), deserializedMemberScope.f53094b.mo19404a()), setMo18386f);
            default:
                DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor = (DeserializedTypeParameterDescriptor) obj;
                return AbstractC17680n.m19322C0(deserializedTypeParameterDescriptor.f53122w0.getComponents().getAnnotationAndConstantLoader().loadTypeParameterAnnotations(deserializedTypeParameterDescriptor.f53123x0, deserializedTypeParameterDescriptor.f53122w0.getNameResolver()));
        }
    }
}
