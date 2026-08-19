package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16553u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import mm.EnumC17307j;
import p225Im.InterfaceC3776x;
import p228J.AbstractC3794B0;
import p298Lm.C5140G;
import p345Nm.C5860f;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectionTypes {
    public static final Companion Companion;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ InterfaceC3776x[] f51305d;

    /* JADX INFO: renamed from: a */
    public final NotFoundClasses f51306a;

    /* JADX INFO: renamed from: b */
    public final Object f51307b;

    /* JADX INFO: renamed from: c */
    public final C5860f f51308c;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final KotlinType createKPropertyStarType(ModuleDescriptor module) {
            AbstractC16544l.m18094g(module, "module");
            ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(module, StandardNames.FqNames.kProperty);
            if (classDescriptorFindClassAcrossModuleDependencies == null) {
                return null;
            }
            TypeAttributes empty = TypeAttributes.Companion.getEmpty();
            List<TypeParameterDescriptor> parameters = classDescriptorFindClassAcrossModuleDependencies.getTypeConstructor().getParameters();
            AbstractC16544l.m18093f(parameters, "getParameters(...)");
            Object objM19365o0 = AbstractC17680n.m19365o0(parameters);
            AbstractC16544l.m18093f(objM19365o0, "single(...)");
            return KotlinTypeFactory.simpleNotNullType(empty, classDescriptorFindClassAcrossModuleDependencies, AbstractC9393x3.m9974d(new StarProjectionImpl((TypeParameterDescriptor) objM19365o0)));
        }
    }

    static {
        C16553u c16553u = new C16553u(ReflectionTypes.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f51305d = new InterfaceC3776x[]{c16527d.mo5699h(c16553u), AbstractC3794B0.m4493r(ReflectionTypes.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, c16527d), AbstractC3794B0.m4493r(ReflectionTypes.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, c16527d), AbstractC3794B0.m4493r(ReflectionTypes.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, c16527d), AbstractC3794B0.m4493r(ReflectionTypes.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, c16527d), AbstractC3794B0.m4493r(ReflectionTypes.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, c16527d), AbstractC3794B0.m4493r(ReflectionTypes.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, c16527d), AbstractC3794B0.m4493r(ReflectionTypes.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0, c16527d)};
        Companion = new Companion(null);
    }

    public ReflectionTypes(ModuleDescriptor module, NotFoundClasses notFoundClasses) {
        AbstractC16544l.m18094g(module, "module");
        AbstractC16544l.m18094g(notFoundClasses, "notFoundClasses");
        this.f51306a = notFoundClasses;
        this.f51307b = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C5140G(module, 6));
        this.f51308c = new C5860f();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mm.i] */
    public static final ClassDescriptor access$find(ReflectionTypes reflectionTypes, String str, int i10) {
        reflectionTypes.getClass();
        Name nameIdentifier = Name.identifier(str);
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        ClassifierDescriptor classifierDescriptorMo22590getContributedClassifier = ((MemberScope) reflectionTypes.f51307b.getValue()).mo22590getContributedClassifier(nameIdentifier, NoLookupLocation.FROM_REFLECTION);
        ClassDescriptor classDescriptor = classifierDescriptorMo22590getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22590getContributedClassifier : null;
        if (classDescriptor == null) {
            return reflectionTypes.f51306a.getClass(new ClassId(StandardNames.KOTLIN_REFLECT_FQ_NAME, nameIdentifier), AbstractC9393x3.m9974d(Integer.valueOf(i10)));
        }
        return classDescriptor;
    }

    public final ClassDescriptor getKClass() {
        InterfaceC3776x property = f51305d[0];
        this.f51308c.getClass();
        AbstractC16544l.m18094g(property, "property");
        return access$find(this, CapitalizeDecapitalizeKt.capitalizeAsciiOnly(property.getName()), 1);
    }
}
