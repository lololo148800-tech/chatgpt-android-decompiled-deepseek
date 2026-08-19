package sl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p008A6.C0383c;
import p482Tg.C7445b0;

/* JADX INFO: renamed from: sl.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C19678m extends LinkedHashMap {

    /* JADX INFO: renamed from: Y */
    public final C7445b0 f62370Y;

    /* JADX INFO: renamed from: Z */
    public final C0383c f62371Z;

    /* JADX INFO: renamed from: o0 */
    public final int f62372o0;

    public C19678m(C7445b0 c7445b0, C0383c c0383c, int i10) {
        super(10, 0.75f, true);
        this.f62370Y = c7445b0;
        this.f62371Z = c0383c;
        this.f62372o0 = i10;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (this.f62372o0 == 0) {
            return this.f62370Y.invoke(obj);
        }
        synchronized (this) {
            Object obj2 = super.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object objInvoke = this.f62370Y.invoke(obj);
            put(obj, objInvoke);
            return objInvoke;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry eldest) {
        AbstractC16544l.m18094g(eldest, "eldest");
        boolean z6 = super.size() > this.f62372o0;
        if (z6) {
            this.f62371Z.invoke(eldest.getValue());
        }
        return z6;
    }
}
