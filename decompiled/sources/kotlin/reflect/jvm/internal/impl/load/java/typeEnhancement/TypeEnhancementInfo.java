package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17660E;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeEnhancementInfo {

    /* JADX INFO: renamed from: a */
    public final Map f52006a;

    public TypeEnhancementInfo(Map<Integer, JavaTypeQualifiers> map) {
        AbstractC16544l.m18094g(map, "map");
        this.f52006a = map;
    }

    public final TypeEnhancementInfo copyForWarnings() {
        Map map = this.f52006a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), JavaTypeQualifiers.copy$default((JavaTypeQualifiers) entry.getValue(), null, null, false, true, 7, null));
        }
        return new TypeEnhancementInfo(linkedHashMap);
    }

    public final Map<Integer, JavaTypeQualifiers> getMap() {
        return this.f52006a;
    }
}
