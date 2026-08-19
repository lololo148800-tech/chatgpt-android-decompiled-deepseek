package p951pp;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: pp.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C18531a extends InheritableThreadLocal {
    @Override // java.lang.InheritableThreadLocal
    public final Object childValue(Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }
}
