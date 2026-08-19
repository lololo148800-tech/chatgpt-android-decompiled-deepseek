package p605Ym;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Ym.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C10089c extends AbstractClassTypeConstructor {

    /* JADX INFO: renamed from: c */
    public final NotNullLazyValue f29870c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LazyJavaClassDescriptor f29871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10089c(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(lazyJavaClassDescriptor.f51905w0.getStorageManager());
        this.f29871d = lazyJavaClassDescriptor;
        this.f29870c = lazyJavaClassDescriptor.f51905w0.getStorageManager().createLazyValue(new C10088b(lazyJavaClassDescriptor, 2));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:4:0x002b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0124  */
    /* JADX WARN: Code duplicated, block: B:54:0x0161  */
    /* JADX WARN: Code duplicated, block: B:57:0x016a  */
    /* JADX WARN: Code duplicated, block: B:58:0x016f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0187  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c4 A[LOOP:1: B:71:0x01be->B:73:0x01c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e9  */
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: b */
    public final Collection mo7319b() {
        String value;
        FqName fqName;
        FqName purelyImplementedInterface;
        ArrayList arrayList;
        SimpleType simpleTypeSimpleNotNullType;
        List listM9974d;
        ArrayList arrayList2;
        KotlinType kotlinTypeEnhanceSuperType;
        TypeConstructor constructor;
        TypeConstructor constructor2;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f29871d;
        Collection<JavaClassifierType> supertypes = lazyJavaClassDescriptor.getJClass().getSupertypes();
        ArrayList arrayList3 = new ArrayList(supertypes.size());
        ArrayList<JavaType> arrayList4 = new ArrayList(0);
        Annotations annotations = lazyJavaClassDescriptor.getAnnotations();
        FqName PURELY_IMPLEMENTS_ANNOTATION = JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION;
        AbstractC16544l.m18093f(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
        AnnotationDescriptor annotationDescriptorMo22585findAnnotation = annotations.mo22585findAnnotation(PURELY_IMPLEMENTS_ANNOTATION);
        if (annotationDescriptorMo22585findAnnotation == null) {
            fqName = null;
        } else {
            Object objM19366p0 = AbstractC17680n.m19366p0(annotationDescriptorMo22585findAnnotation.getAllValueArguments().values());
            StringValue stringValue = objM19366p0 instanceof StringValue ? (StringValue) objM19366p0 : null;
            if (stringValue == null || (value = stringValue.getValue()) == null || !FqNamesUtilKt.isValidJavaFqName(value)) {
                fqName = null;
            } else {
                fqName = new FqName(value);
            }
        }
        if (fqName == null || fqName.isRoot() || !fqName.startsWith(StandardNames.BUILT_INS_PACKAGE_NAME)) {
            fqName = null;
        }
        if (fqName == null) {
            purelyImplementedInterface = FakePureImplementationsProvider.INSTANCE.getPurelyImplementedInterface(DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptor));
            if (purelyImplementedInterface == null) {
                simpleTypeSimpleNotNullType = null;
            }
            for (JavaClassifierType javaClassifierType : supertypes) {
                kotlinTypeEnhanceSuperType = lazyJavaClassDescriptor.f51905w0.getComponents().getSignatureEnhancement().enhanceSuperType(lazyJavaClassDescriptor.f51905w0.getTypeResolver().transformJavaType(javaClassifierType, JavaTypeAttributesKt.toAttributes$default(TypeUsage.SUPERTYPE, false, false, null, 7, null)), lazyJavaClassDescriptor.f51905w0);
                if (kotlinTypeEnhanceSuperType.getConstructor().mo22589getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor) {
                    arrayList4.add(javaClassifierType);
                }
                constructor = kotlinTypeEnhanceSuperType.getConstructor();
                if (simpleTypeSimpleNotNullType != null) {
                    constructor2 = simpleTypeSimpleNotNullType.getConstructor();
                } else {
                    constructor2 = null;
                }
                if (!AbstractC16544l.m18089b(constructor, constructor2) && !KotlinBuiltIns.isAnyOrNullableAny(kotlinTypeEnhanceSuperType)) {
                    arrayList3.add(kotlinTypeEnhanceSuperType);
                }
            }
            ClassDescriptor classDescriptor = lazyJavaClassDescriptor.f51904v0;
            CollectionsKt.addIfNotNull(arrayList3, classDescriptor != null ? MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptor, lazyJavaClassDescriptor).buildSubstitutor().substitute(classDescriptor.getDefaultType(), Variance.INVARIANT) : null);
            CollectionsKt.addIfNotNull(arrayList3, simpleTypeSimpleNotNullType);
            if (!arrayList4.isEmpty()) {
                ErrorReporter errorReporter = lazyJavaClassDescriptor.f51905w0.getComponents().getErrorReporter();
                arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList4, 10));
                for (JavaType javaType : arrayList4) {
                    AbstractC16544l.m18092e(javaType, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList2.add(((JavaClassifierType) javaType).getPresentableText());
                }
                errorReporter.reportIncompleteHierarchy(lazyJavaClassDescriptor, arrayList2);
            }
            if (arrayList3.isEmpty()) {
                listM9974d = AbstractC9393x3.m9974d(lazyJavaClassDescriptor.f51905w0.getModule().getBuiltIns().getAnyType());
            } else {
                listM9974d = AbstractC17680n.m19322C0(arrayList3);
            }
            return listM9974d;
        }
        purelyImplementedInterface = fqName;
        ClassDescriptor classDescriptorResolveTopLevelClass = DescriptorUtilsKt.resolveTopLevelClass(lazyJavaClassDescriptor.f51905w0.getModule(), purelyImplementedInterface, NoLookupLocation.FROM_JAVA_LOADER);
        if (classDescriptorResolveTopLevelClass == null) {
            simpleTypeSimpleNotNullType = null;
        } else {
            int size = classDescriptorResolveTopLevelClass.getTypeConstructor().getParameters().size();
            List<TypeParameterDescriptor> parameters = lazyJavaClassDescriptor.getTypeConstructor().getParameters();
            AbstractC16544l.m18093f(parameters, "getParameters(...)");
            int size2 = parameters.size();
            if (size2 == size) {
                List<TypeParameterDescriptor> list = parameters;
                arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new TypeProjectionImpl(Variance.INVARIANT, ((TypeParameterDescriptor) it.next()).getDefaultType()));
                }
            } else if (size2 == 1 && size > 1 && fqName == null) {
                TypeProjectionImpl typeProjectionImpl = new TypeProjectionImpl(Variance.INVARIANT, ((TypeParameterDescriptor) AbstractC17680n.m19365o0(parameters)).getDefaultType());
                C3508g c3508g = new C3508g(1, size, 1);
                ArrayList arrayList5 = new ArrayList(AbstractC17682p.m19389r(c3508g, 10));
                C3507f it2 = c3508g.iterator();
                while (it2.f10596o0) {
                    it2.mo4199a();
                    arrayList5.add(typeProjectionImpl);
                }
                arrayList = arrayList5;
            } else {
                simpleTypeSimpleNotNullType = null;
            }
            simpleTypeSimpleNotNullType = KotlinTypeFactory.simpleNotNullType(TypeAttributes.Companion.getEmpty(), classDescriptorResolveTopLevelClass, arrayList);
        }
        while (r1.hasNext()) {
            kotlinTypeEnhanceSuperType = lazyJavaClassDescriptor.f51905w0.getComponents().getSignatureEnhancement().enhanceSuperType(lazyJavaClassDescriptor.f51905w0.getTypeResolver().transformJavaType(javaClassifierType, JavaTypeAttributesKt.toAttributes$default(TypeUsage.SUPERTYPE, false, false, null, 7, null)), lazyJavaClassDescriptor.f51905w0);
            if (kotlinTypeEnhanceSuperType.getConstructor().mo22589getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor) {
                arrayList4.add(javaClassifierType);
            }
            constructor = kotlinTypeEnhanceSuperType.getConstructor();
            if (simpleTypeSimpleNotNullType != null) {
                constructor2 = simpleTypeSimpleNotNullType.getConstructor();
            } else {
                constructor2 = null;
            }
            if (!AbstractC16544l.m18089b(constructor, constructor2)) {
                arrayList3.add(kotlinTypeEnhanceSuperType);
            }
        }
        ClassDescriptor classDescriptor2 = lazyJavaClassDescriptor.f51904v0;
        CollectionsKt.addIfNotNull(arrayList3, classDescriptor2 != null ? MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptor2, lazyJavaClassDescriptor).buildSubstitutor().substitute(classDescriptor2.getDefaultType(), Variance.INVARIANT) : null);
        CollectionsKt.addIfNotNull(arrayList3, simpleTypeSimpleNotNullType);
        if (!arrayList4.isEmpty()) {
            ErrorReporter errorReporter2 = lazyJavaClassDescriptor.f51905w0.getComponents().getErrorReporter();
            arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList4, 10));
            while (r3.hasNext()) {
                AbstractC16544l.m18092e(javaType, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                arrayList2.add(((JavaClassifierType) javaType).getPresentableText());
            }
            errorReporter2.reportIncompleteHierarchy(lazyJavaClassDescriptor, arrayList2);
        }
        if (arrayList3.isEmpty()) {
            listM9974d = AbstractC17680n.m19322C0(arrayList3);
        } else {
            listM9974d = AbstractC9393x3.m9974d(lazyJavaClassDescriptor.f51905w0.getModule().getBuiltIns().getAnyType());
        }
        return listM9974d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: e */
    public final SupertypeLoopChecker mo7321e() {
        return this.f29871d.f51905w0.getComponents().getSupertypeLoopChecker();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public final ClassifierDescriptor mo22589getDeclarationDescriptor() {
        return this.f29871d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return (List) this.f29870c.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return true;
    }

    public final String toString() {
        String strAsString = this.f29871d.getName().asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        return strAsString;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public final ClassDescriptor mo22589getDeclarationDescriptor() {
        return this.f29871d;
    }
}
