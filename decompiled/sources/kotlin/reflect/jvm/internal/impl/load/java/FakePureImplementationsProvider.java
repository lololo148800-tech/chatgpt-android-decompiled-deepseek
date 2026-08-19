package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import mm.C17309l;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes2.dex */
public final class FakePureImplementationsProvider {
    public static final FakePureImplementationsProvider INSTANCE = new FakePureImplementationsProvider();

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f51726a;

    /* JADX INFO: renamed from: b */
    public static final Map f51727b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f51726a = linkedHashMap;
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        m18171b(standardClassIds.getMutableList(), m18170a("java.util.ArrayList", "java.util.LinkedList"));
        m18171b(standardClassIds.getMutableSet(), m18170a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        m18171b(standardClassIds.getMutableMap(), m18170a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        ClassId.Companion companion = ClassId.Companion;
        m18171b(companion.topLevel(new FqName("java.util.function.Function")), m18170a("java.util.function.UnaryOperator"));
        m18171b(companion.topLevel(new FqName("java.util.function.BiFunction")), m18170a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new C17309l(((ClassId) entry.getKey()).asSingleFqName(), ((ClassId) entry.getValue()).asSingleFqName()));
        }
        f51727b = AbstractC17659D.m19253o(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m18170a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ClassId.Companion.topLevel(new FqName(str)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m18171b(ClassId classId, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f51726a.put(obj, classId);
        }
    }

    public final FqName getPurelyImplementedInterface(FqName classFqName) {
        AbstractC16544l.m18094g(classFqName, "classFqName");
        return (FqName) f51727b.get(classFqName);
    }
}
