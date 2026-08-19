package p283L5;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: L5.r */
/* JADX INFO: loaded from: classes.dex */
public final class C4952r {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f16155a;

    public C4952r(C4953s c4953s) {
        Map map = c4953s.f16157a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), AbstractC17680n.m19323D0((Collection) entry.getValue()));
        }
        this.f16155a = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public void m5600a(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
        this.f16155a.put(lowerCase, AbstractC17681o.m19384m(str));
    }

    public C4952r(LinkedHashMap linkedHashMap) {
        this.f16155a = linkedHashMap;
    }
}
