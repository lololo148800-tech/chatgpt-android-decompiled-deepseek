package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinTypeRefinerKt {

    /* JADX INFO: renamed from: a */
    public static final ModuleCapability f53228a = new ModuleCapability("KotlinTypeRefiner");

    public static final ModuleCapability<Ref<TypeRefinementSupport>> getREFINER_CAPABILITY() {
        return f53228a;
    }

    public static final List<KotlinType> refineTypes(KotlinTypeRefiner kotlinTypeRefiner, Iterable<? extends KotlinType> types) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "<this>");
        AbstractC16544l.m18094g(types, "types");
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(types, 10));
        Iterator<? extends KotlinType> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinTypeRefiner.refineType((KotlinTypeMarker) it.next()));
        }
        return arrayList;
    }
}
