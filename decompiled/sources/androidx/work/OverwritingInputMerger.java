package androidx.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p114E8.C2354a;
import p444S4.AbstractC7003i;
import p444S4.C7001g;
import p817j$.util.DesugarCollections;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Landroidx/work/OverwritingInputMerger;", "LS4/i;", "<init>", "()V", "work-runtime_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class OverwritingInputMerger extends AbstractC7003i {
    @Override // p444S4.AbstractC7003i
    /* JADX INFO: renamed from: a */
    public final C7001g mo7403a(ArrayList arrayList) throws Throwable {
        C2354a c2354a = new C2354a(1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((C7001g) it.next()).f22408a);
            AbstractC16544l.m18093f(mapUnmodifiableMap, "input.keyValueMap");
            linkedHashMap.putAll(mapUnmodifiableMap);
        }
        c2354a.m3441d(linkedHashMap);
        C7001g c7001g = new C7001g(c2354a.f7308b);
        C7001g.m7402b(c7001g);
        return c7001g;
    }
}
