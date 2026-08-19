package kotlin.reflect.jvm.internal.impl.load.java;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import mm.C17309l;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltinSpecialProperties {
    public static final BuiltinSpecialProperties INSTANCE = new BuiltinSpecialProperties();

    /* JADX INFO: renamed from: a */
    public static final Object f51721a;

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f51722b;

    /* JADX INFO: renamed from: c */
    public static final Set f51723c;

    /* JADX INFO: renamed from: d */
    public static final Set f51724d;

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.Map] */
    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames._enum;
        C17309l c17309l = new C17309l(BuiltinSpecialPropertiesKt.access$childSafe(fqNameUnsafe, DiagnosticsEntry.NAME_KEY), StandardNames.NAME);
        C17309l c17309l2 = new C17309l(BuiltinSpecialPropertiesKt.access$childSafe(fqNameUnsafe, "ordinal"), Name.identifier("ordinal"));
        C17309l c17309l3 = new C17309l(BuiltinSpecialPropertiesKt.access$child(StandardNames.FqNames.collection, "size"), Name.identifier("size"));
        FqName fqName = StandardNames.FqNames.map;
        Map mapM19244f = AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, new C17309l(BuiltinSpecialPropertiesKt.access$child(fqName, "size"), Name.identifier("size")), new C17309l(BuiltinSpecialPropertiesKt.access$childSafe(StandardNames.FqNames.charSequence, "length"), Name.identifier("length")), new C17309l(BuiltinSpecialPropertiesKt.access$child(fqName, "keys"), Name.identifier("keySet")), new C17309l(BuiltinSpecialPropertiesKt.access$child(fqName, "values"), Name.identifier("values")), new C17309l(BuiltinSpecialPropertiesKt.access$child(fqName, "entries"), Name.identifier("entrySet")));
        f51721a = mapM19244f;
        Set<Map.Entry> setEntrySet = mapM19244f.entrySet();
        ArrayList<C17309l> arrayList = new ArrayList(AbstractC17682p.m19389r(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new C17309l(((FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C17309l c17309l4 : arrayList) {
            Name name = (Name) c17309l4.f55137Z;
            Object arrayList2 = linkedHashMap.get(name);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(name, arrayList2);
            }
            ((List) arrayList2).add((Name) c17309l4.f55136Y);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC17660E.m19257b(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), AbstractC17680n.m19335K((Iterable) entry2.getValue()));
        }
        f51722b = linkedHashMap2;
        ?? r6 = f51721a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r6.entrySet()) {
            ClassId classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(((FqName) entry3.getKey()).parent().toUnsafe());
            AbstractC16544l.m18091d(classIdMapKotlinToJava);
            linkedHashSet.add(classIdMapKotlinToJava.asSingleFqName().child((Name) entry3.getValue()));
        }
        Set setKeySet = f51721a.keySet();
        f51723c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((FqName) it.next()).shortName());
        }
        f51724d = AbstractC17680n.m19328G0(arrayList3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.Name>] */
    public final Map<FqName, Name> getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP() {
        return f51721a;
    }

    public final List<Name> getPropertyNameCandidatesBySpecialGetterName(Name name1) {
        AbstractC16544l.m18094g(name1, "name1");
        List<Name> list = (List) f51722b.get(name1);
        return list == null ? C17689w.f56480Y : list;
    }

    public final Set<FqName> getSPECIAL_FQ_NAMES() {
        return f51723c;
    }

    public final Set<Name> getSPECIAL_SHORT_NAMES() {
        return f51724d;
    }
}
