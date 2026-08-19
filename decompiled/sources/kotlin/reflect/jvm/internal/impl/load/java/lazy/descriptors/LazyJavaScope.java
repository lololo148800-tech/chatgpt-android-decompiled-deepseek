package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16553u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3776x;
import p228J.AbstractC3794B0;
import p605Ym.C10096j;
import p605Ym.C10098l;
import p606Yn.C10107h;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17656A;
import p909nm.C17689w;
import p909nm.C17690x;
import p909nm.C17692z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LazyJavaScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ InterfaceC3776x[] f51933l;

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f51934a;

    /* JADX INFO: renamed from: b */
    public final LazyJavaScope f51935b;

    /* JADX INFO: renamed from: c */
    public final NotNullLazyValue f51936c;

    /* JADX INFO: renamed from: d */
    public final NotNullLazyValue f51937d;

    /* JADX INFO: renamed from: e */
    public final MemoizedFunctionToNotNull f51938e;

    /* JADX INFO: renamed from: f */
    public final MemoizedFunctionToNullable f51939f;

    /* JADX INFO: renamed from: g */
    public final MemoizedFunctionToNotNull f51940g;

    /* JADX INFO: renamed from: h */
    public final NotNullLazyValue f51941h;

    /* JADX INFO: renamed from: i */
    public final NotNullLazyValue f51942i;

    /* JADX INFO: renamed from: j */
    public final NotNullLazyValue f51943j;

    /* JADX INFO: renamed from: k */
    public final MemoizedFunctionToNotNull f51944k;

    public static final class MethodSignatureData {

        /* JADX INFO: renamed from: a */
        public final KotlinType f51945a;

        /* JADX INFO: renamed from: b */
        public final KotlinType f51946b;

        /* JADX INFO: renamed from: c */
        public final List f51947c;

        /* JADX INFO: renamed from: d */
        public final List f51948d;

        /* JADX INFO: renamed from: e */
        public final boolean f51949e;

        /* JADX INFO: renamed from: f */
        public final List f51950f;

        public MethodSignatureData(KotlinType returnType, KotlinType kotlinType, List<? extends ValueParameterDescriptor> valueParameters, List<? extends TypeParameterDescriptor> typeParameters, boolean z6, List<String> errors) {
            AbstractC16544l.m18094g(returnType, "returnType");
            AbstractC16544l.m18094g(valueParameters, "valueParameters");
            AbstractC16544l.m18094g(typeParameters, "typeParameters");
            AbstractC16544l.m18094g(errors, "errors");
            this.f51945a = returnType;
            this.f51946b = kotlinType;
            this.f51947c = valueParameters;
            this.f51948d = typeParameters;
            this.f51949e = z6;
            this.f51950f = errors;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodSignatureData)) {
                return false;
            }
            MethodSignatureData methodSignatureData = (MethodSignatureData) obj;
            return AbstractC16544l.m18089b(this.f51945a, methodSignatureData.f51945a) && AbstractC16544l.m18089b(this.f51946b, methodSignatureData.f51946b) && AbstractC16544l.m18089b(this.f51947c, methodSignatureData.f51947c) && AbstractC16544l.m18089b(this.f51948d, methodSignatureData.f51948d) && this.f51949e == methodSignatureData.f51949e && AbstractC16544l.m18089b(this.f51950f, methodSignatureData.f51950f);
        }

        public final List<String> getErrors() {
            return this.f51950f;
        }

        public final boolean getHasStableParameterNames() {
            return this.f51949e;
        }

        public final KotlinType getReceiverType() {
            return this.f51946b;
        }

        public final KotlinType getReturnType() {
            return this.f51945a;
        }

        public final List<TypeParameterDescriptor> getTypeParameters() {
            return this.f51948d;
        }

        public final List<ValueParameterDescriptor> getValueParameters() {
            return this.f51947c;
        }

        public int hashCode() {
            int iHashCode = this.f51945a.hashCode() * 31;
            KotlinType kotlinType = this.f51946b;
            return this.f51950f.hashCode() + ((AbstractC14376f.m15858x(this.f51948d, AbstractC14376f.m15858x(this.f51947c, (iHashCode + (kotlinType == null ? 0 : kotlinType.hashCode())) * 31, 31), 31) + (this.f51949e ? 1231 : 1237)) * 31);
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f51945a + ", receiverType=" + this.f51946b + ", valueParameters=" + this.f51947c + ", typeParameters=" + this.f51948d + ", hasStableParameterNames=" + this.f51949e + ", errors=" + this.f51950f + ')';
        }
    }

    public static final class ResolvedValueParameters {

        /* JADX INFO: renamed from: a */
        public final List f51951a;

        /* JADX INFO: renamed from: b */
        public final boolean f51952b;

        public ResolvedValueParameters(List<? extends ValueParameterDescriptor> descriptors, boolean z6) {
            AbstractC16544l.m18094g(descriptors, "descriptors");
            this.f51951a = descriptors;
            this.f51952b = z6;
        }

        public final List<ValueParameterDescriptor> getDescriptors() {
            return this.f51951a;
        }

        public final boolean getHasSynthesizedNames() {
            return this.f51952b;
        }
    }

    static {
        C16553u c16553u = new C16553u(LazyJavaScope.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f51933l = new InterfaceC3776x[]{c16527d.mo5699h(c16553u), AbstractC3794B0.m4493r(LazyJavaScope.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0, c16527d), AbstractC3794B0.m4493r(LazyJavaScope.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0, c16527d)};
    }

    public /* synthetic */ LazyJavaScope(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaScope lazyJavaScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, (i10 & 2) != 0 ? null : lazyJavaScope);
    }

    /* JADX INFO: renamed from: c */
    public static KotlinType m18216c(JavaMethod method, LazyJavaResolverContext c9) {
        AbstractC16544l.m18094g(method, "method");
        AbstractC16544l.m18094g(c9, "c");
        return c9.getTypeResolver().transformJavaType(method.getReturnType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, method.getContainingClass().isAnnotationType(), false, null, 6, null));
    }

    /* JADX INFO: renamed from: k */
    public static ResolvedValueParameters m18217k(LazyJavaResolverContext c9, FunctionDescriptorImpl functionDescriptorImpl, List jValueParameters) {
        C17309l c17309l;
        Name name;
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(jValueParameters, "jValueParameters");
        C10107h c10107hM19332I0 = AbstractC17680n.m19332I0(jValueParameters);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c10107hM19332I0, 10));
        Iterator it = c10107hM19332I0.iterator();
        boolean z6 = false;
        while (true) {
            C17656A c17656a = (C17656A) it;
            if (!c17656a.f56445Z.hasNext()) {
                return new ResolvedValueParameters(AbstractC17680n.m19322C0(arrayList), z6);
            }
            C17692z c17692z = (C17692z) c17656a.next();
            int i10 = c17692z.f56483a;
            JavaValueParameter javaValueParameter = (JavaValueParameter) c17692z.f56484b;
            Annotations annotationsResolveAnnotations = LazyJavaAnnotationsKt.resolveAnnotations(c9, javaValueParameter);
            JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
            if (javaValueParameter.isVararg()) {
                JavaType type = javaValueParameter.getType();
                JavaArrayType javaArrayType = type instanceof JavaArrayType ? (JavaArrayType) type : null;
                if (javaArrayType == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + javaValueParameter);
                }
                KotlinType kotlinTypeTransformArrayType = c9.getTypeResolver().transformArrayType(javaArrayType, attributes$default, true);
                c17309l = new C17309l(kotlinTypeTransformArrayType, c9.getModule().getBuiltIns().getArrayElementType(kotlinTypeTransformArrayType));
            } else {
                c17309l = new C17309l(c9.getTypeResolver().transformJavaType(javaValueParameter.getType(), attributes$default), null);
            }
            KotlinType kotlinType = (KotlinType) c17309l.f55136Y;
            KotlinType kotlinType2 = (KotlinType) c17309l.f55137Z;
            if (AbstractC16544l.m18089b(functionDescriptorImpl.getName().asString(), "equals") && jValueParameters.size() == 1 && AbstractC16544l.m18089b(c9.getModule().getBuiltIns().getNullableAnyType(), kotlinType)) {
                name = Name.identifier("other");
            } else {
                name = javaValueParameter.getName();
                if (name == null) {
                    z6 = true;
                }
                if (name == null) {
                    name = Name.identifier("p" + i10);
                    AbstractC16544l.m18093f(name, "identifier(...)");
                }
            }
            Name name2 = name;
            AbstractC16544l.m18091d(name2);
            arrayList.add(new ValueParameterDescriptorImpl(functionDescriptorImpl, null, i10, annotationsResolveAnnotations, name2, kotlinType, false, false, false, kotlinType2, c9.getComponents().getSourceElementFactory().source(javaValueParameter)));
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Set mo18197a(DescriptorKindFilter descriptorKindFilter, InterfaceC1436k interfaceC1436k);

    /* JADX INFO: renamed from: b */
    public void mo18198b(Name name, ArrayList arrayList) {
        AbstractC16544l.m18094g(name, "name");
    }

    public abstract Set computeFunctionNames(DescriptorKindFilter descriptorKindFilter, InterfaceC1436k interfaceC1436k);

    public abstract DeclaredMemberIndex computeMemberIndex();

    /* JADX INFO: renamed from: d */
    public abstract void mo18199d(LinkedHashSet linkedHashSet, Name name);

    /* JADX INFO: renamed from: e */
    public abstract void mo18200e(Name name, ArrayList arrayList);

    /* JADX INFO: renamed from: f */
    public abstract Set mo18201f(DescriptorKindFilter descriptorKindFilter);

    /* JADX INFO: renamed from: g */
    public abstract ReceiverParameterDescriptor mo18202g();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return (Set) StorageKt.getValue(this.f51943j, this, f51933l[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        return (Collection) this.f51936c.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return !getFunctionNames().contains(name) ? C17689w.f56480Y : (Collection) this.f51940g.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return !getVariableNames().contains(name) ? C17689w.f56480Y : (Collection) this.f51944k.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return (Set) StorageKt.getValue(this.f51941h, this, f51933l[0]);
    }

    public abstract DeclarationDescriptor getOwnerDescriptor();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return (Set) StorageKt.getValue(this.f51942i, this, f51933l[1]);
    }

    /* JADX INFO: renamed from: h */
    public boolean mo18203h(JavaMethodDescriptor javaMethodDescriptor) {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public abstract MethodSignatureData mo18204i(JavaMethod javaMethod, ArrayList arrayList, KotlinType kotlinType, List list);

    /* JADX INFO: renamed from: j */
    public final JavaMethodDescriptor m18218j(JavaMethod method) {
        AbstractC16544l.m18094g(method, "method");
        LazyJavaResolverContext lazyJavaResolverContext = this.f51934a;
        JavaMethodDescriptor javaMethodDescriptorCreateJavaMethod = JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, method), method.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(method), ((DeclaredMemberIndex) this.f51937d.invoke()).findRecordComponentByName(method.getName()) != null && method.getValueParameters().isEmpty());
        AbstractC16544l.m18093f(javaMethodDescriptorCreateJavaMethod, "createJavaMethod(...)");
        LazyJavaResolverContext lazyJavaResolverContextChildForMethod$default = ContextKt.childForMethod$default(this.f51934a, javaMethodDescriptorCreateJavaMethod, method, 0, 4, null);
        List<JavaTypeParameter> typeParameters = method.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = lazyJavaResolverContextChildForMethod$default.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it.next());
            AbstractC16544l.m18091d(typeParameterDescriptorResolveTypeParameter);
            arrayList.add(typeParameterDescriptorResolveTypeParameter);
        }
        ResolvedValueParameters resolvedValueParametersM18217k = m18217k(lazyJavaResolverContextChildForMethod$default, javaMethodDescriptorCreateJavaMethod, method.getValueParameters());
        MethodSignatureData methodSignatureDataMo18204i = mo18204i(method, arrayList, m18216c(method, lazyJavaResolverContextChildForMethod$default), resolvedValueParametersM18217k.getDescriptors());
        KotlinType receiverType = methodSignatureDataMo18204i.getReceiverType();
        javaMethodDescriptorCreateJavaMethod.initialize(receiverType != null ? DescriptorFactory.createExtensionReceiverParameterForCallable(javaMethodDescriptorCreateJavaMethod, receiverType, Annotations.Companion.getEMPTY()) : null, mo18202g(), C17689w.f56480Y, methodSignatureDataMo18204i.getTypeParameters(), methodSignatureDataMo18204i.getValueParameters(), methodSignatureDataMo18204i.getReturnType(), Modality.Companion.convertFromFlags(false, method.isAbstract(), true ^ method.isFinal()), UtilsKt.toDescriptorVisibility(method.getVisibility()), methodSignatureDataMo18204i.getReceiverType() != null ? AbstractC17660E.m19258c(new C17309l(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER, AbstractC17680n.m19341Q(resolvedValueParametersM18217k.getDescriptors()))) : C17690x.f56481Y);
        javaMethodDescriptorCreateJavaMethod.setParameterNamesStatus(methodSignatureDataMo18204i.getHasStableParameterNames(), resolvedValueParametersM18217k.getHasSynthesizedNames());
        if (!methodSignatureDataMo18204i.getErrors().isEmpty()) {
            lazyJavaResolverContextChildForMethod$default.getComponents().getSignaturePropagator().reportSignatureErrors(javaMethodDescriptorCreateJavaMethod, methodSignatureDataMo18204i.getErrors());
        }
        return javaMethodDescriptorCreateJavaMethod;
    }

    public String toString() {
        return "Lazy scope for " + getOwnerDescriptor();
    }

    public LazyJavaScope(LazyJavaResolverContext c9, LazyJavaScope lazyJavaScope) {
        AbstractC16544l.m18094g(c9, "c");
        this.f51934a = c9;
        this.f51935b = lazyJavaScope;
        this.f51936c = c9.getStorageManager().createRecursionTolerantLazyValue(new C10096j(this, 0), C17689w.f56480Y);
        this.f51937d = c9.getStorageManager().createLazyValue(new C10096j(this, 1));
        this.f51938e = c9.getStorageManager().createMemoizedFunction(new C10098l(this, 0));
        this.f51939f = c9.getStorageManager().createMemoizedFunctionWithNullableValues(new C10098l(this, 1));
        int i10 = 2;
        this.f51940g = c9.getStorageManager().createMemoizedFunction(new C10098l(this, i10));
        this.f51941h = c9.getStorageManager().createLazyValue(new C10096j(this, i10));
        this.f51942i = c9.getStorageManager().createLazyValue(new C10096j(this, 3));
        this.f51943j = c9.getStorageManager().createLazyValue(new C10096j(this, 4));
        this.f51944k = c9.getStorageManager().createMemoizedFunction(new C10098l(this, 3));
    }
}
