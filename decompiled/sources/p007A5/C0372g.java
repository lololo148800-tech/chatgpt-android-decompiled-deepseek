package p007A5;

import android.app.Activity;
import fo.C13711h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$Found;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$NotFound;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$SyntheticClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import mm.C17296C;
import mo.C17327D;
import mo.InterfaceC17338e;
import om.C18235b;
import p025An.C0624m;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p298Lm.C5150L;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p605Ym.C10091e;
import p605Ym.C10095i;
import p633a.AbstractC10441a;
import p648an.C10753a;
import p654b1.AbstractC11212f;
import p771go.FragmentManagerFragmentLifecycleCallbacksC14202a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p910nn.C17697e;
import p974qo.C18792h;

/* JADX INFO: renamed from: A5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0372g implements InterfaceC17338e, InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1264Y;

    /* JADX INFO: renamed from: Z */
    public final Object f1265Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f1266o0;

    public /* synthetic */ C0372g(Object obj, int i10, Object obj2) {
        this.f1264Y = i10;
        this.f1265Z = obj;
        this.f1266o0 = obj2;
    }

    @Override // mo.InterfaceC17338e
    /* JADX INFO: renamed from: b */
    public void mo1006b(C18792h c18792h, C17327D c17327d) {
        ((C0624m) this.f1266o0).resumeWith(c17327d);
    }

    @Override // mo.InterfaceC17338e
    /* JADX INFO: renamed from: h */
    public void mo1007h(C18792h c18792h, IOException iOException) {
        if (c18792h.f59718A0) {
            return;
        }
        ((C0624m) this.f1266o0).resumeWith(AbstractC9233X.m9806b(iOException));
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object extractNullability) {
        AbstractC10441a abstractC10441a;
        Map<Integer, JavaTypeQualifiers> map;
        JavaTypeQualifiers javaTypeQualifiers;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor;
        List<TypeParameterMarker> parameters;
        C17296C c17296c = C17296C.f55119a;
        Object obj = this.f1266o0;
        Object obj2 = this.f1265Z;
        switch (this.f1264Y) {
            case 0:
                try {
                    ((C18792h) obj2).cancel();
                    break;
                } catch (Throwable unused) {
                }
                return c17296c;
            case 1:
                Name name = (Name) extractNullability;
                int i10 = LazyJavaClassMemberScope.f51909u;
                AbstractC16544l.m18094g(name, "name");
                LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) obj2;
                boolean zContains = ((Set) lazyJavaClassMemberScope.f51914q.invoke()).contains(name);
                LazyJavaResolverContext lazyJavaResolverContext = (LazyJavaResolverContext) obj;
                ClassDescriptor classDescriptor = lazyJavaClassMemberScope.f51910m;
                if (zContains) {
                    JavaClassFinder finder = lazyJavaResolverContext.getComponents().getFinder();
                    ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
                    AbstractC16544l.m18091d(classId);
                    JavaClass javaClassFindClass = finder.findClass(new JavaClassFinder.Request(classId.createNestedClassId(name), null, lazyJavaClassMemberScope.f51911n, 2, null));
                    if (javaClassFindClass == null) {
                        return null;
                    }
                    LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, lazyJavaClassMemberScope.f51910m, javaClassFindClass, null, 8, null);
                    lazyJavaResolverContext.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                    return lazyJavaClassDescriptor;
                }
                if (!((Set) lazyJavaClassMemberScope.f51915r.invoke()).contains(name)) {
                    JavaField javaField = (JavaField) ((Map) lazyJavaClassMemberScope.f51916s.invoke()).get(name);
                    if (javaField != null) {
                        return EnumEntrySyntheticClassDescriptor.create(lazyJavaResolverContext.getStorageManager(), lazyJavaClassMemberScope.f51910m, name, lazyJavaResolverContext.getStorageManager().createLazyValue(new C10091e(lazyJavaClassMemberScope, 2)), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaField), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaField));
                    }
                    return null;
                }
                C18235b c18235bM9972b = AbstractC9393x3.m9972b();
                lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateNestedClass(classDescriptor, name, c18235bM9972b, lazyJavaResolverContext);
                C18235b c18235bM9971a = AbstractC9393x3.m9971a(c18235bM9972b);
                int iMo7371f = c18235bM9971a.mo7371f();
                if (iMo7371f == 0) {
                    return null;
                }
                if (iMo7371f == 1) {
                    return (ClassDescriptor) AbstractC17680n.m19365o0(c18235bM9971a);
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + c18235bM9971a).toString());
            case 2:
                Name accessorName = (Name) extractNullability;
                int i11 = LazyJavaClassMemberScope.f51909u;
                AbstractC16544l.m18094g(accessorName, "accessorName");
                SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj2;
                if (AbstractC16544l.m18089b(simpleFunctionDescriptor.getName(), accessorName)) {
                    return AbstractC9393x3.m9974d(simpleFunctionDescriptor);
                }
                LazyJavaClassMemberScope lazyJavaClassMemberScope2 = (LazyJavaClassMemberScope) obj;
                return AbstractC17680n.m19361k0(lazyJavaClassMemberScope2.m18196C(accessorName), lazyJavaClassMemberScope2.m18195B(accessorName));
            case 3:
                C10095i request = (C10095i) extractNullability;
                int i12 = LazyJavaPackageScope.f51927q;
                AbstractC16544l.m18094g(request, "request");
                LazyJavaPackageScope lazyJavaPackageScope = (LazyJavaPackageScope) obj2;
                ClassId classId2 = new ClassId(lazyJavaPackageScope.f51929n.getFqName(), request.f29887a);
                LazyJavaResolverContext lazyJavaResolverContext2 = (LazyJavaResolverContext) obj;
                JavaClass javaClassFindClass2 = request.f29888b;
                KotlinClassFinder.Result resultFindKotlinClassOrContent = javaClassFindClass2 != null ? lazyJavaResolverContext2.getComponents().getKotlinClassFinder().findKotlinClassOrContent(javaClassFindClass2, lazyJavaPackageScope.m18215m()) : lazyJavaResolverContext2.getComponents().getKotlinClassFinder().findKotlinClassOrContent(classId2, lazyJavaPackageScope.m18215m());
                KotlinJvmBinaryClass kotlinJvmBinaryClass = resultFindKotlinClassOrContent != null ? resultFindKotlinClassOrContent.toKotlinJvmBinaryClass() : null;
                ClassId classId3 = kotlinJvmBinaryClass != null ? kotlinJvmBinaryClass.getClassId() : null;
                if (classId3 != null && (classId3.isNestedClass() || classId3.isLocal())) {
                    return null;
                }
                if (kotlinJvmBinaryClass == null) {
                    abstractC10441a = LazyJavaPackageScope$KotlinClassLookupResult$NotFound.INSTANCE;
                } else if (kotlinJvmBinaryClass.getClassHeader().getKind() == KotlinClassHeader.Kind.CLASS) {
                    final ClassDescriptor classDescriptorResolveClass = lazyJavaPackageScope.f51934a.getComponents().getDeserializedDescriptorResolver().resolveClass(kotlinJvmBinaryClass);
                    abstractC10441a = classDescriptorResolveClass != null ? new AbstractC10441a(classDescriptorResolveClass) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$Found

                        /* JADX INFO: renamed from: a */
                        public final ClassDescriptor f51932a;

                        {
                            AbstractC16544l.m18094g(classDescriptorResolveClass, "descriptor");
                            this.f51932a = classDescriptorResolveClass;
                        }

                        public final ClassDescriptor getDescriptor() {
                            return this.f51932a;
                        }
                    } : LazyJavaPackageScope$KotlinClassLookupResult$NotFound.INSTANCE;
                } else {
                    abstractC10441a = LazyJavaPackageScope$KotlinClassLookupResult$SyntheticClass.INSTANCE;
                }
                if (abstractC10441a instanceof LazyJavaPackageScope$KotlinClassLookupResult$Found) {
                    return ((LazyJavaPackageScope$KotlinClassLookupResult$Found) abstractC10441a).getDescriptor();
                }
                if (abstractC10441a instanceof LazyJavaPackageScope$KotlinClassLookupResult$SyntheticClass) {
                    return null;
                }
                if (!(abstractC10441a instanceof LazyJavaPackageScope$KotlinClassLookupResult$NotFound)) {
                    throw new C0644w();
                }
                if (javaClassFindClass2 == null) {
                    JavaClassFinder finder2 = lazyJavaResolverContext2.getComponents().getFinder();
                    KotlinClassFinder.Result.ClassFileContent classFileContent = resultFindKotlinClassOrContent instanceof KotlinClassFinder.Result.ClassFileContent ? (KotlinClassFinder.Result.ClassFileContent) resultFindKotlinClassOrContent : null;
                    javaClassFindClass2 = finder2.findClass(new JavaClassFinder.Request(classId2, classFileContent != null ? classFileContent.getContent() : null, null, 4, null));
                }
                JavaClass javaClass = javaClassFindClass2;
                if ((javaClass != null ? javaClass.getLightClassOriginKind() : null) != LightClassOriginKind.BINARY) {
                    FqName fqName = javaClass != null ? javaClass.getFqName() : null;
                    if (fqName == null || fqName.isRoot() || !AbstractC16544l.m18089b(fqName.parent(), lazyJavaPackageScope.f51929n.getFqName())) {
                        return null;
                    }
                    LazyJavaClassDescriptor lazyJavaClassDescriptor2 = new LazyJavaClassDescriptor(lazyJavaResolverContext2, lazyJavaPackageScope.f51929n, javaClass, null, 8, null);
                    lazyJavaResolverContext2.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor2);
                    return lazyJavaClassDescriptor2;
                }
                throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + javaClass + "\nClassId: " + classId2 + "\nfindKotlinClass(JavaClass) = " + KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext2.getComponents().getKotlinClassFinder(), javaClass, lazyJavaPackageScope.m18215m()) + "\nfindKotlinClass(ClassId) = " + KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext2.getComponents().getKotlinClassFinder(), classId2, lazyJavaPackageScope.m18215m()) + '\n');
            case 4:
                AbstractC16544l.m18094g(extractNullability, "$this$extractNullability");
                return Boolean.valueOf(((AbstractSignatureParts) obj2).forceWarning(extractNullability, ((C10753a) obj).f31955a));
            case 5:
                int iIntValue = ((Number) extractNullability).intValue();
                TypeEnhancementInfo typeEnhancementInfo = (TypeEnhancementInfo) obj2;
                if (typeEnhancementInfo != null && (map = typeEnhancementInfo.getMap()) != null && (javaTypeQualifiers = map.get(Integer.valueOf(iIntValue))) != null) {
                    return javaTypeQualifiers;
                }
                if (iIntValue >= 0) {
                    JavaTypeQualifiers[] javaTypeQualifiersArr = (JavaTypeQualifiers[]) obj;
                    if (iIntValue < javaTypeQualifiersArr.length) {
                        return javaTypeQualifiersArr[iIntValue];
                    }
                }
                return JavaTypeQualifiers.Companion.getNONE();
            case 6:
                C10753a it = (C10753a) extractNullability;
                AbstractC16544l.m18094g(it, "it");
                AbstractSignatureParts abstractSignatureParts = (AbstractSignatureParts) obj2;
                boolean skipRawTypeArguments = abstractSignatureParts.getSkipRawTypeArguments();
                TypeSystemContext typeSystemContext = (TypeSystemContext) obj;
                KotlinTypeMarker kotlinTypeMarker = it.f31955a;
                if ((skipRawTypeArguments && kotlinTypeMarker != null && typeSystemContext.isRawType(kotlinTypeMarker)) || kotlinTypeMarker == null || (typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(kotlinTypeMarker)) == null || (parameters = typeSystemContext.getParameters(typeConstructorMarkerTypeConstructor)) == null) {
                    return null;
                }
                List<TypeParameterMarker> list = parameters;
                List<TypeArgumentMarker> arguments = typeSystemContext.getArguments(kotlinTypeMarker);
                Iterator<T> it2 = list.iterator();
                Iterator<T> it3 = arguments.iterator();
                ArrayList arrayList = new ArrayList(Math.min(AbstractC17682p.m19389r(list, 10), AbstractC17682p.m19389r(arguments, 10)));
                while (it2.hasNext() && it3.hasNext()) {
                    TypeParameterMarker typeParameterMarker = (TypeParameterMarker) it2.next();
                    KotlinTypeMarker type = typeSystemContext.getType((TypeArgumentMarker) it3.next());
                    JavaTypeQualifiersByElementType javaTypeQualifiersByElementType = it.f31956b;
                    arrayList.add(type == null ? new C10753a(null, javaTypeQualifiersByElementType, typeParameterMarker) : new C10753a(type, abstractSignatureParts.getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(javaTypeQualifiersByElementType, abstractSignatureParts.getAnnotations(type)), typeParameterMarker));
                }
                return arrayList;
            case 7:
                ((OverridingStrategy) obj2).inheritanceConflict((CallableMemberDescriptor) obj, (CallableMemberDescriptor) extractNullability);
                return c17296c;
            case 8:
                Activity activity = (Activity) extractNullability;
                AbstractC16544l.m18095h(activity, "activity");
                activity.getFragmentManager().registerFragmentLifecycleCallbacks(AbstractC11212f.m12414d((FragmentManagerFragmentLifecycleCallbacksC14202a) obj2), true);
                return c17296c;
            default:
                Name name2 = (Name) extractNullability;
                AbstractC16544l.m18094g(name2, "name");
                C17697e c17697e = (C17697e) obj2;
                ProtoBuf.EnumEntry enumEntry = (ProtoBuf.EnumEntry) c17697e.f56495a.get(name2);
                if (enumEntry == null) {
                    return null;
                }
                DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) obj;
                return EnumEntrySyntheticClassDescriptor.create(deserializedClassDescriptor.getC().getStorageManager(), deserializedClassDescriptor, name2, c17697e.f56497c, new DeserializedAnnotations(deserializedClassDescriptor.getC().getStorageManager(), new C5150L(deserializedClassDescriptor, 16, enumEntry)), SourceElement.NO_SOURCE);
        }
    }

    public C0372g(C13711h reachabilityWatcher) {
        this.f1264Y = 8;
        AbstractC16544l.m18095h(reachabilityWatcher, "reachabilityWatcher");
        this.f1266o0 = reachabilityWatcher;
        this.f1265Z = new FragmentManagerFragmentLifecycleCallbacksC14202a(this);
    }
}
