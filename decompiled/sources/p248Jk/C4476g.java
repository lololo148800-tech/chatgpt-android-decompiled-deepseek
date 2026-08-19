package p248Jk;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: Jk.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C4476g extends AbstractC4470a {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f14618b = 0;

    static {
        C4474e.m5206a(Collections.emptyMap());
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Map map = this.f14612a;
        int size = map.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((InterfaceC4478i) entry.getValue()).get());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }
}
