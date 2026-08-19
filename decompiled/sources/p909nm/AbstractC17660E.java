package p909nm;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p571X9.AbstractC9405z3;

/* JADX INFO: renamed from: nm.E */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17660E extends AbstractC9405z3 {
    /* JADX INFO: renamed from: b */
    public static int m19257b(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: c */
    public static Map m19258c(C17309l pair) {
        AbstractC16544l.m18094g(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f55136Y, pair.f55137Z);
        AbstractC16544l.m18093f(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: d */
    public static final Map m19259d(Map map) {
        AbstractC16544l.m18094g(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC16544l.m18093f(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
