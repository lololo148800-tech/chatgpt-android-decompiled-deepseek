package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p909nm.AbstractC17681o;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaToKotlinClassMap {
    public static final JavaToKotlinClassMap INSTANCE = new JavaToKotlinClassMap();

    /* JADX INFO: renamed from: a */
    public static final String f51341a;

    /* JADX INFO: renamed from: b */
    public static final String f51342b;

    /* JADX INFO: renamed from: c */
    public static final String f51343c;

    /* JADX INFO: renamed from: d */
    public static final String f51344d;

    /* JADX INFO: renamed from: e */
    public static final ClassId f51345e;

    /* JADX INFO: renamed from: f */
    public static final FqName f51346f;

    /* JADX INFO: renamed from: g */
    public static final ClassId f51347g;

    /* JADX INFO: renamed from: h */
    public static final HashMap f51348h;

    /* JADX INFO: renamed from: i */
    public static final HashMap f51349i;

    /* JADX INFO: renamed from: j */
    public static final HashMap f51350j;

    /* JADX INFO: renamed from: k */
    public static final HashMap f51351k;

    /* JADX INFO: renamed from: l */
    public static final HashMap f51352l;

    /* JADX INFO: renamed from: m */
    public static final HashMap f51353m;

    /* JADX INFO: renamed from: n */
    public static final List f51354n;

    public static final class PlatformMutabilityMapping {

        /* JADX INFO: renamed from: a */
        public final ClassId f51355a;

        /* JADX INFO: renamed from: b */
        public final ClassId f51356b;

        /* JADX INFO: renamed from: c */
        public final ClassId f51357c;

        public PlatformMutabilityMapping(ClassId javaClass, ClassId kotlinReadOnly, ClassId kotlinMutable) {
            AbstractC16544l.m18094g(javaClass, "javaClass");
            AbstractC16544l.m18094g(kotlinReadOnly, "kotlinReadOnly");
            AbstractC16544l.m18094g(kotlinMutable, "kotlinMutable");
            this.f51355a = javaClass;
            this.f51356b = kotlinReadOnly;
            this.f51357c = kotlinMutable;
        }

        public final ClassId component1() {
            return this.f51355a;
        }

        public final ClassId component2() {
            return this.f51356b;
        }

        public final ClassId component3() {
            return this.f51357c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return AbstractC16544l.m18089b(this.f51355a, platformMutabilityMapping.f51355a) && AbstractC16544l.m18089b(this.f51356b, platformMutabilityMapping.f51356b) && AbstractC16544l.m18089b(this.f51357c, platformMutabilityMapping.f51357c);
        }

        public final ClassId getJavaClass() {
            return this.f51355a;
        }

        public int hashCode() {
            return this.f51357c.hashCode() + ((this.f51356b.hashCode() + (this.f51355a.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f51355a + ", kotlinReadOnly=" + this.f51356b + ", kotlinMutable=" + this.f51357c + ')';
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
        sb2.append(function.getPackageFqName());
        sb2.append('.');
        sb2.append(function.getClassNamePrefix());
        f51341a = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionTypeKind.KFunction kFunction = FunctionTypeKind.KFunction.INSTANCE;
        sb3.append(kFunction.getPackageFqName());
        sb3.append('.');
        sb3.append(kFunction.getClassNamePrefix());
        f51342b = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
        sb4.append(suspendFunction.getPackageFqName());
        sb4.append('.');
        sb4.append(suspendFunction.getClassNamePrefix());
        f51343c = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        FunctionTypeKind.KSuspendFunction kSuspendFunction = FunctionTypeKind.KSuspendFunction.INSTANCE;
        sb5.append(kSuspendFunction.getPackageFqName());
        sb5.append('.');
        sb5.append(kSuspendFunction.getClassNamePrefix());
        f51344d = sb5.toString();
        ClassId.Companion companion = ClassId.Companion;
        ClassId classId = companion.topLevel(new FqName("kotlin.jvm.functions.FunctionN"));
        f51345e = classId;
        f51346f = classId.asSingleFqName();
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        f51347g = standardClassIds.getKFunction();
        standardClassIds.getKClass();
        m18119c(Class.class);
        f51348h = new HashMap();
        f51349i = new HashMap();
        f51350j = new HashMap();
        f51351k = new HashMap();
        f51352l = new HashMap();
        f51353m = new HashMap();
        ClassId classId2 = companion.topLevel(StandardNames.FqNames.iterable);
        PlatformMutabilityMapping platformMutabilityMapping = new PlatformMutabilityMapping(m18119c(Iterable.class), classId2, new ClassId(classId2.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableIterable, classId2.getPackageFqName()), false));
        ClassId classId3 = companion.topLevel(StandardNames.FqNames.iterator);
        PlatformMutabilityMapping platformMutabilityMapping2 = new PlatformMutabilityMapping(m18119c(Iterator.class), classId3, new ClassId(classId3.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableIterator, classId3.getPackageFqName()), false));
        ClassId classId4 = companion.topLevel(StandardNames.FqNames.collection);
        PlatformMutabilityMapping platformMutabilityMapping3 = new PlatformMutabilityMapping(m18119c(Collection.class), classId4, new ClassId(classId4.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableCollection, classId4.getPackageFqName()), false));
        ClassId classId5 = companion.topLevel(StandardNames.FqNames.list);
        PlatformMutabilityMapping platformMutabilityMapping4 = new PlatformMutabilityMapping(m18119c(List.class), classId5, new ClassId(classId5.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableList, classId5.getPackageFqName()), false));
        ClassId classId6 = companion.topLevel(StandardNames.FqNames.set);
        PlatformMutabilityMapping platformMutabilityMapping5 = new PlatformMutabilityMapping(m18119c(Set.class), classId6, new ClassId(classId6.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableSet, classId6.getPackageFqName()), false));
        ClassId classId7 = companion.topLevel(StandardNames.FqNames.listIterator);
        PlatformMutabilityMapping platformMutabilityMapping6 = new PlatformMutabilityMapping(m18119c(ListIterator.class), classId7, new ClassId(classId7.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableListIterator, classId7.getPackageFqName()), false));
        FqName fqName = StandardNames.FqNames.map;
        ClassId classId8 = companion.topLevel(fqName);
        PlatformMutabilityMapping platformMutabilityMapping7 = new PlatformMutabilityMapping(m18119c(Map.class), classId8, new ClassId(classId8.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableMap, classId8.getPackageFqName()), false));
        ClassId classIdCreateNestedClassId = companion.topLevel(fqName).createNestedClassId(StandardNames.FqNames.mapEntry.shortName());
        List<PlatformMutabilityMapping> listM19382k = AbstractC17681o.m19382k(platformMutabilityMapping, platformMutabilityMapping2, platformMutabilityMapping3, platformMutabilityMapping4, platformMutabilityMapping5, platformMutabilityMapping6, platformMutabilityMapping7, new PlatformMutabilityMapping(m18119c(Map.Entry.class), classIdCreateNestedClassId, new ClassId(classIdCreateNestedClassId.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableMapEntry, classIdCreateNestedClassId.getPackageFqName()), false)));
        f51354n = listM19382k;
        m18118b(Object.class, StandardNames.FqNames.any);
        m18118b(String.class, StandardNames.FqNames.string);
        m18118b(CharSequence.class, StandardNames.FqNames.charSequence);
        m18117a(m18119c(Throwable.class), companion.topLevel(StandardNames.FqNames.throwable));
        m18118b(Cloneable.class, StandardNames.FqNames.cloneable);
        m18118b(Number.class, StandardNames.FqNames.number);
        m18117a(m18119c(Comparable.class), companion.topLevel(StandardNames.FqNames.comparable));
        m18118b(Enum.class, StandardNames.FqNames._enum);
        m18117a(m18119c(Annotation.class), companion.topLevel(StandardNames.FqNames.annotation));
        for (PlatformMutabilityMapping platformMutabilityMapping8 : listM19382k) {
            INSTANCE.getClass();
            ClassId classIdComponent1 = platformMutabilityMapping8.component1();
            ClassId classIdComponent2 = platformMutabilityMapping8.component2();
            ClassId classIdComponent3 = platformMutabilityMapping8.component3();
            m18117a(classIdComponent1, classIdComponent2);
            f51349i.put(classIdComponent3.asSingleFqName().toUnsafe(), classIdComponent1);
            f51352l.put(classIdComponent3, classIdComponent2);
            f51353m.put(classIdComponent2, classIdComponent3);
            FqName fqNameAsSingleFqName = classIdComponent2.asSingleFqName();
            FqName fqNameAsSingleFqName2 = classIdComponent3.asSingleFqName();
            f51350j.put(classIdComponent3.asSingleFqName().toUnsafe(), fqNameAsSingleFqName);
            f51351k.put(fqNameAsSingleFqName.toUnsafe(), fqNameAsSingleFqName2);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            JavaToKotlinClassMap javaToKotlinClassMap = INSTANCE;
            ClassId.Companion companion2 = ClassId.Companion;
            FqName wrapperFqName = jvmPrimitiveType.getWrapperFqName();
            AbstractC16544l.m18093f(wrapperFqName, "getWrapperFqName(...)");
            ClassId classId9 = companion2.topLevel(wrapperFqName);
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            AbstractC16544l.m18093f(primitiveType, "getPrimitiveType(...)");
            ClassId classId10 = companion2.topLevel(StandardNames.getPrimitiveFqName(primitiveType));
            javaToKotlinClassMap.getClass();
            m18117a(classId9, classId10);
        }
        for (ClassId classId11 : CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
            ClassId classId12 = ClassId.Companion.topLevel(new FqName("kotlin.jvm.internal." + classId11.getShortClassName().asString() + "CompanionObject"));
            ClassId classIdCreateNestedClassId2 = classId11.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT);
            javaToKotlinClassMap2.getClass();
            m18117a(classId12, classIdCreateNestedClassId2);
        }
        for (int i10 = 0; i10 < 23; i10++) {
            JavaToKotlinClassMap javaToKotlinClassMap3 = INSTANCE;
            ClassId classId13 = ClassId.Companion.topLevel(new FqName(AbstractC10763a.m11048f(i10, "kotlin.jvm.functions.Function")));
            ClassId functionClassId = StandardNames.getFunctionClassId(i10);
            javaToKotlinClassMap3.getClass();
            m18117a(classId13, functionClassId);
            f51349i.put(new FqName(f51342b + i10).toUnsafe(), f51347g);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            FunctionTypeKind.KSuspendFunction kSuspendFunction2 = FunctionTypeKind.KSuspendFunction.INSTANCE;
            String str = kSuspendFunction2.getPackageFqName() + '.' + kSuspendFunction2.getClassNamePrefix();
            JavaToKotlinClassMap javaToKotlinClassMap4 = INSTANCE;
            FqName fqName2 = new FqName(str + i11);
            ClassId classId14 = f51347g;
            javaToKotlinClassMap4.getClass();
            f51349i.put(fqName2.toUnsafe(), classId14);
        }
        JavaToKotlinClassMap javaToKotlinClassMap5 = INSTANCE;
        FqName safe = StandardNames.FqNames.nothing.toSafe();
        javaToKotlinClassMap5.getClass();
        f51349i.put(safe.toUnsafe(), m18119c(Void.class));
    }

    /* JADX INFO: renamed from: a */
    public static void m18117a(ClassId classId, ClassId classId2) {
        f51348h.put(classId.asSingleFqName().toUnsafe(), classId2);
        f51349i.put(classId2.asSingleFqName().toUnsafe(), classId);
    }

    /* JADX INFO: renamed from: b */
    public static void m18118b(Class cls, FqNameUnsafe fqNameUnsafe) {
        m18117a(m18119c(cls), ClassId.Companion.topLevel(fqNameUnsafe.toSafe()));
    }

    /* JADX INFO: renamed from: c */
    public static ClassId m18119c(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ClassId.Companion companion = ClassId.Companion;
            String canonicalName = cls.getCanonicalName();
            AbstractC16544l.m18093f(canonicalName, "getCanonicalName(...)");
            return companion.topLevel(new FqName(canonicalName));
        }
        ClassId classIdM18119c = m18119c(declaringClass);
        Name nameIdentifier = Name.identifier(cls.getSimpleName());
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return classIdM18119c.createNestedClassId(nameIdentifier);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m18120d(FqNameUnsafe fqNameUnsafe, String str) {
        Integer numM21736w;
        String strAsString = fqNameUnsafe.asString();
        if (!AbstractC21329w.m21734u(strAsString, str, false)) {
            return false;
        }
        String strSubstring = strAsString.substring(str.length());
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return (AbstractC21322p.m21698f0(strSubstring, '0') || (numM21736w = AbstractC21329w.m21736w(strSubstring)) == null || numM21736w.intValue() < 23) ? false : true;
    }

    public final FqName getFUNCTION_N_FQ_NAME() {
        return f51346f;
    }

    public final List<PlatformMutabilityMapping> getMutabilityMappings() {
        return f51354n;
    }

    public final boolean isMutable(FqNameUnsafe fqNameUnsafe) {
        return f51350j.containsKey(fqNameUnsafe);
    }

    public final boolean isReadOnly(FqNameUnsafe fqNameUnsafe) {
        return f51351k.containsKey(fqNameUnsafe);
    }

    public final ClassId mapJavaToKotlin(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        return (ClassId) f51348h.get(fqName.toUnsafe());
    }

    public final ClassId mapKotlinToJava(FqNameUnsafe kotlinFqName) {
        AbstractC16544l.m18094g(kotlinFqName, "kotlinFqName");
        boolean zM18120d = m18120d(kotlinFqName, f51341a);
        ClassId classId = f51345e;
        if (zM18120d || m18120d(kotlinFqName, f51343c)) {
            return classId;
        }
        boolean zM18120d2 = m18120d(kotlinFqName, f51342b);
        ClassId classId2 = f51347g;
        return (zM18120d2 || m18120d(kotlinFqName, f51344d)) ? classId2 : (ClassId) f51349i.get(kotlinFqName);
    }

    public final FqName mutableToReadOnly(FqNameUnsafe fqNameUnsafe) {
        return (FqName) f51350j.get(fqNameUnsafe);
    }

    public final FqName readOnlyToMutable(FqNameUnsafe fqNameUnsafe) {
        return (FqName) f51351k.get(fqNameUnsafe);
    }
}
