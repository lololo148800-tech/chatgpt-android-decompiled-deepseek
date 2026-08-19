package kotlin.reflect.jvm.internal.impl.name;

import io.sentry.protocol.DebugImage;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardClassIds {
    public static final StandardClassIds INSTANCE = new StandardClassIds();

    /* JADX INFO: renamed from: a */
    public static final FqName f52685a;

    /* JADX INFO: renamed from: b */
    public static final FqName f52686b;

    /* JADX INFO: renamed from: c */
    public static final FqName f52687c;

    /* JADX INFO: renamed from: d */
    public static final FqName f52688d;

    /* JADX INFO: renamed from: e */
    public static final FqName f52689e;

    /* JADX INFO: renamed from: f */
    public static final FqName f52690f;

    /* JADX INFO: renamed from: g */
    public static final FqName f52691g;

    /* JADX INFO: renamed from: h */
    public static final ClassId f52692h;

    /* JADX INFO: renamed from: i */
    public static final ClassId f52693i;

    /* JADX INFO: renamed from: j */
    public static final ClassId f52694j;

    /* JADX INFO: renamed from: k */
    public static final ClassId f52695k;

    /* JADX INFO: renamed from: l */
    public static final ClassId f52696l;

    /* JADX INFO: renamed from: m */
    public static final ClassId f52697m;

    /* JADX INFO: renamed from: n */
    public static final ClassId f52698n;

    /* JADX INFO: renamed from: o */
    public static final ClassId f52699o;

    /* JADX INFO: renamed from: p */
    public static final ClassId f52700p;

    /* JADX INFO: renamed from: q */
    public static final ClassId f52701q;

    /* JADX INFO: renamed from: r */
    public static final ClassId f52702r;

    /* JADX INFO: renamed from: s */
    public static final Set f52703s;

    /* JADX INFO: renamed from: t */
    public static final Map f52704t;

    /* JADX INFO: renamed from: u */
    public static final Set f52705u;

    /* JADX INFO: renamed from: v */
    public static final Map f52706v;

    /* JADX INFO: renamed from: w */
    public static final ClassId f52707w;

    /* JADX INFO: renamed from: x */
    public static final ClassId f52708x;

    /* JADX INFO: renamed from: y */
    public static final ClassId f52709y;

    /* JADX INFO: renamed from: z */
    public static final ClassId f52710z;

    static {
        FqName fqName = new FqName("kotlin");
        f52685a = fqName;
        Name nameIdentifier = Name.identifier("reflect");
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        FqName fqNameChild = fqName.child(nameIdentifier);
        f52686b = fqNameChild;
        Name nameIdentifier2 = Name.identifier("collections");
        AbstractC16544l.m18093f(nameIdentifier2, "identifier(...)");
        FqName fqNameChild2 = fqName.child(nameIdentifier2);
        f52687c = fqNameChild2;
        Name nameIdentifier3 = Name.identifier("ranges");
        AbstractC16544l.m18093f(nameIdentifier3, "identifier(...)");
        FqName fqNameChild3 = fqName.child(nameIdentifier3);
        f52688d = fqNameChild3;
        Name nameIdentifier4 = Name.identifier(DebugImage.JVM);
        AbstractC16544l.m18093f(nameIdentifier4, "identifier(...)");
        FqName fqNameChild4 = fqName.child(nameIdentifier4);
        Name nameIdentifier5 = Name.identifier("annotations");
        AbstractC16544l.m18093f(nameIdentifier5, "identifier(...)");
        FqName fqNameChild5 = fqName.child(nameIdentifier5);
        Name nameIdentifier6 = Name.identifier(DebugImage.JVM);
        AbstractC16544l.m18093f(nameIdentifier6, "identifier(...)");
        fqNameChild5.child(nameIdentifier6);
        Name nameIdentifier7 = Name.identifier("internal");
        AbstractC16544l.m18093f(nameIdentifier7, "identifier(...)");
        fqNameChild4.child(nameIdentifier7);
        Name nameIdentifier8 = Name.identifier("functions");
        AbstractC16544l.m18093f(nameIdentifier8, "identifier(...)");
        fqNameChild4.child(nameIdentifier8);
        Name nameIdentifier9 = Name.identifier(QzvfuIgrngtl.ziukEgg);
        AbstractC16544l.m18093f(nameIdentifier9, "identifier(...)");
        FqName fqNameChild6 = fqName.child(nameIdentifier9);
        f52689e = fqNameChild6;
        Name nameIdentifier10 = Name.identifier("internal");
        AbstractC16544l.m18093f(nameIdentifier10, "identifier(...)");
        FqName fqNameChild7 = fqName.child(nameIdentifier10);
        Name nameIdentifier11 = Name.identifier("ir");
        AbstractC16544l.m18093f(nameIdentifier11, "identifier(...)");
        fqNameChild7.child(nameIdentifier11);
        Name nameIdentifier12 = Name.identifier("coroutines");
        AbstractC16544l.m18093f(nameIdentifier12, "identifier(...)");
        FqName fqNameChild8 = fqName.child(nameIdentifier12);
        f52690f = fqNameChild8;
        Name nameIdentifier13 = Name.identifier("enums");
        AbstractC16544l.m18093f(nameIdentifier13, "identifier(...)");
        f52691g = fqName.child(nameIdentifier13);
        Name nameIdentifier14 = Name.identifier("contracts");
        AbstractC16544l.m18093f(nameIdentifier14, "identifier(...)");
        fqName.child(nameIdentifier14);
        Name nameIdentifier15 = Name.identifier("concurrent");
        AbstractC16544l.m18093f(nameIdentifier15, "identifier(...)");
        fqName.child(nameIdentifier15);
        Name nameIdentifier16 = Name.identifier("test");
        AbstractC16544l.m18093f(nameIdentifier16, "identifier(...)");
        fqName.child(nameIdentifier16);
        AbstractC17678l.m19293P(new FqName[]{fqName, fqNameChild2, fqNameChild3, fqNameChild6});
        AbstractC17678l.m19293P(new FqName[]{fqName, fqNameChild2, fqNameChild3, fqNameChild6, fqNameChild, fqNameChild7, fqNameChild8});
        StandardClassIdsKt.access$baseId("Nothing");
        f52692h = StandardClassIdsKt.access$baseId("Unit");
        f52693i = StandardClassIdsKt.access$baseId("Any");
        f52694j = StandardClassIdsKt.access$baseId("Enum");
        StandardClassIdsKt.access$baseId("Annotation");
        f52695k = StandardClassIdsKt.access$baseId("Array");
        ClassId classIdAccess$baseId = StandardClassIdsKt.access$baseId("Boolean");
        ClassId classIdAccess$baseId2 = StandardClassIdsKt.access$baseId("Char");
        ClassId classIdAccess$baseId3 = StandardClassIdsKt.access$baseId("Byte");
        ClassId classIdAccess$baseId4 = StandardClassIdsKt.access$baseId("Short");
        ClassId classIdAccess$baseId5 = StandardClassIdsKt.access$baseId("Int");
        ClassId classIdAccess$baseId6 = StandardClassIdsKt.access$baseId("Long");
        ClassId classIdAccess$baseId7 = StandardClassIdsKt.access$baseId("Float");
        ClassId classIdAccess$baseId8 = StandardClassIdsKt.access$baseId("Double");
        f52696l = StandardClassIdsKt.access$unsignedId(classIdAccess$baseId3);
        f52697m = StandardClassIdsKt.access$unsignedId(classIdAccess$baseId4);
        f52698n = StandardClassIdsKt.access$unsignedId(classIdAccess$baseId5);
        f52699o = StandardClassIdsKt.access$unsignedId(classIdAccess$baseId6);
        StandardClassIdsKt.access$baseId("CharSequence");
        f52700p = StandardClassIdsKt.access$baseId("String");
        StandardClassIdsKt.access$baseId("Throwable");
        StandardClassIdsKt.access$baseId("Cloneable");
        StandardClassIdsKt.access$reflectId("KProperty");
        StandardClassIdsKt.access$reflectId("KMutableProperty");
        StandardClassIdsKt.access$reflectId("KProperty0");
        StandardClassIdsKt.access$reflectId("KMutableProperty0");
        StandardClassIdsKt.access$reflectId("KProperty1");
        StandardClassIdsKt.access$reflectId("KMutableProperty1");
        StandardClassIdsKt.access$reflectId("KProperty2");
        StandardClassIdsKt.access$reflectId("KMutableProperty2");
        f52701q = StandardClassIdsKt.access$reflectId("KFunction");
        f52702r = StandardClassIdsKt.access$reflectId("KClass");
        StandardClassIdsKt.access$reflectId("KCallable");
        StandardClassIdsKt.access$reflectId("KType");
        StandardClassIdsKt.access$baseId("Comparable");
        StandardClassIdsKt.access$baseId("Number");
        StandardClassIdsKt.access$baseId("Function");
        Set setM19293P = AbstractC17678l.m19293P(new ClassId[]{classIdAccess$baseId, classIdAccess$baseId2, classIdAccess$baseId3, classIdAccess$baseId4, classIdAccess$baseId5, classIdAccess$baseId6, classIdAccess$baseId7, classIdAccess$baseId8});
        f52703s = setM19293P;
        AbstractC17678l.m19293P(new ClassId[]{classIdAccess$baseId3, classIdAccess$baseId4, classIdAccess$baseId5, classIdAccess$baseId6});
        Set set = setM19293P;
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(set, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (Object obj : set) {
            linkedHashMap.put(obj, StandardClassIdsKt.access$primitiveArrayId(((ClassId) obj).getShortClassName()));
        }
        f52704t = StandardClassIdsKt.access$inverseMap(linkedHashMap);
        Set setM19293P2 = AbstractC17678l.m19293P(new ClassId[]{f52696l, f52697m, f52698n, f52699o});
        f52705u = setM19293P2;
        Set set2 = setM19293P2;
        int iM19257b2 = AbstractC17660E.m19257b(AbstractC17682p.m19389r(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM19257b2 >= 16 ? iM19257b2 : 16);
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, StandardClassIdsKt.access$primitiveArrayId(((ClassId) obj2).getShortClassName()));
        }
        f52706v = StandardClassIdsKt.access$inverseMap(linkedHashMap2);
        Set set3 = f52703s;
        Set set4 = f52705u;
        LinkedHashSet linkedHashSetM19266f = AbstractC17665J.m19266f(set3, set4);
        ClassId classId = f52700p;
        AbstractC17665J.m19267g(linkedHashSetM19266f, classId);
        StandardClassIdsKt.access$coroutinesId("Continuation");
        StandardClassIdsKt.access$collectionsId("Iterator");
        StandardClassIdsKt.access$collectionsId("Iterable");
        StandardClassIdsKt.access$collectionsId("Collection");
        StandardClassIdsKt.access$collectionsId("List");
        StandardClassIdsKt.access$collectionsId("ListIterator");
        StandardClassIdsKt.access$collectionsId("Set");
        ClassId classIdAccess$collectionsId = StandardClassIdsKt.access$collectionsId("Map");
        StandardClassIdsKt.access$collectionsId("MutableIterator");
        StandardClassIdsKt.access$collectionsId("CharIterator");
        StandardClassIdsKt.access$collectionsId("MutableIterable");
        StandardClassIdsKt.access$collectionsId("MutableCollection");
        f52707w = StandardClassIdsKt.access$collectionsId("MutableList");
        StandardClassIdsKt.access$collectionsId("MutableListIterator");
        f52708x = StandardClassIdsKt.access$collectionsId("MutableSet");
        ClassId classIdAccess$collectionsId2 = StandardClassIdsKt.access$collectionsId("MutableMap");
        f52709y = classIdAccess$collectionsId2;
        Name nameIdentifier17 = Name.identifier("Entry");
        AbstractC16544l.m18093f(nameIdentifier17, "identifier(...)");
        classIdAccess$collectionsId.createNestedClassId(nameIdentifier17);
        Name nameIdentifier18 = Name.identifier("MutableEntry");
        AbstractC16544l.m18093f(nameIdentifier18, "identifier(...)");
        classIdAccess$collectionsId2.createNestedClassId(nameIdentifier18);
        StandardClassIdsKt.access$baseId("Result");
        StandardClassIdsKt.access$rangesId("IntRange");
        StandardClassIdsKt.access$rangesId("LongRange");
        StandardClassIdsKt.access$rangesId("CharRange");
        StandardClassIdsKt.access$annotationId("AnnotationRetention");
        StandardClassIdsKt.access$annotationId("AnnotationTarget");
        StandardClassIdsKt.access$baseId("DeprecationLevel");
        f52710z = StandardClassIdsKt.access$enumsId("EnumEntries");
        AbstractC17665J.m19267g(AbstractC17665J.m19267g(AbstractC17665J.m19267g(AbstractC17665J.m19267g(AbstractC17665J.m19266f(set3, set4), classId), f52692h), f52693i), f52694j);
    }

    public final ClassId getArray() {
        return f52695k;
    }

    public final FqName getBASE_ANNOTATION_PACKAGE() {
        return f52689e;
    }

    public final FqName getBASE_COLLECTIONS_PACKAGE() {
        return f52687c;
    }

    public final FqName getBASE_COROUTINES_PACKAGE() {
        return f52690f;
    }

    public final FqName getBASE_ENUMS_PACKAGE() {
        return f52691g;
    }

    public final FqName getBASE_KOTLIN_PACKAGE() {
        return f52685a;
    }

    public final FqName getBASE_RANGES_PACKAGE() {
        return f52688d;
    }

    public final FqName getBASE_REFLECT_PACKAGE() {
        return f52686b;
    }

    public final ClassId getEnumEntries() {
        return f52710z;
    }

    public final ClassId getKClass() {
        return f52702r;
    }

    public final ClassId getKFunction() {
        return f52701q;
    }

    public final ClassId getMutableList() {
        return f52707w;
    }

    public final ClassId getMutableMap() {
        return f52709y;
    }

    public final ClassId getMutableSet() {
        return f52708x;
    }
}
