package kotlin.reflect.jvm.internal.impl.name;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardClassIdsKt {
    public static final ClassId access$annotationId(String str) {
        FqName base_annotation_package = StandardClassIds.INSTANCE.getBASE_ANNOTATION_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return new ClassId(base_annotation_package, nameIdentifier);
    }

    public static final ClassId access$baseId(String str) {
        FqName base_kotlin_package = StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return new ClassId(base_kotlin_package, nameIdentifier);
    }

    public static final ClassId access$collectionsId(String str) {
        FqName base_collections_package = StandardClassIds.INSTANCE.getBASE_COLLECTIONS_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return new ClassId(base_collections_package, nameIdentifier);
    }

    public static final ClassId access$coroutinesId(String str) {
        FqName base_coroutines_package = StandardClassIds.INSTANCE.getBASE_COROUTINES_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return new ClassId(base_coroutines_package, nameIdentifier);
    }

    public static final ClassId access$enumsId(String str) {
        FqName base_enums_package = StandardClassIds.INSTANCE.getBASE_ENUMS_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return new ClassId(base_enums_package, nameIdentifier);
    }

    public static final Map access$inverseMap(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(setEntrySet, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap;
    }

    public static final ClassId access$primitiveArrayId(Name name) {
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        FqName packageFqName = standardClassIds.getArray().getPackageFqName();
        Name nameIdentifier = Name.identifier(name.getIdentifier() + standardClassIds.getArray().getShortClassName().getIdentifier());
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return new ClassId(packageFqName, nameIdentifier);
    }

    public static final ClassId access$rangesId(String str) {
        FqName base_ranges_package = StandardClassIds.INSTANCE.getBASE_RANGES_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return new ClassId(base_ranges_package, nameIdentifier);
    }

    public static final ClassId access$reflectId(String str) {
        FqName base_reflect_package = StandardClassIds.INSTANCE.getBASE_REFLECT_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return new ClassId(base_reflect_package, nameIdentifier);
    }

    public static final ClassId access$unsignedId(ClassId classId) {
        FqName base_kotlin_package = StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE();
        Name nameIdentifier = Name.identifier(TokenNames.f32020U + classId.getShortClassName().getIdentifier());
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return new ClassId(base_kotlin_package, nameIdentifier);
    }
}
