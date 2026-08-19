package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class CompanionObjectMapping {
    public static final CompanionObjectMapping INSTANCE = new CompanionObjectMapping();

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f51293a;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(StandardNames.getPrimitiveFqName((PrimitiveType) it.next()));
        }
        ArrayList arrayListM19362l0 = AbstractC17680n.m19362l0(AbstractC17680n.m19362l0(AbstractC17680n.m19362l0(arrayList, StandardNames.FqNames.string.toSafe()), StandardNames.FqNames._boolean.toSafe()), StandardNames.FqNames._enum.toSafe());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ClassId.Companion companion = ClassId.Companion;
        Iterator it2 = arrayListM19362l0.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(companion.topLevel((FqName) it2.next()));
        }
        f51293a = linkedHashSet;
    }

    public final Set<ClassId> allClassesWithIntrinsicCompanions() {
        return f51293a;
    }

    public final Set<ClassId> getClassIds() {
        return f51293a;
    }
}
