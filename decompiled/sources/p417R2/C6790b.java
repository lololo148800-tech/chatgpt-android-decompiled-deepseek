package p417R2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import p817j$.util.DesugarCollections;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: R2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6790b {

    /* JADX INFO: renamed from: a */
    public final Map f21795a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f21796b;

    public C6790b(Map preferencesMap, boolean z6) {
        AbstractC16544l.m18094g(preferencesMap, "preferencesMap");
        this.f21795a = preferencesMap;
        this.f21796b = new AtomicBoolean(z6);
    }

    /* JADX INFO: renamed from: a */
    public final void m7233a() {
        if (this.f21796b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7234b(C6795g key, Object obj) {
        AbstractC16544l.m18094g(key, "key");
        m7233a();
        Map map = this.f21795a;
        if (obj == null) {
            m7233a();
            map.remove(key);
        } else {
            if (!(obj instanceof Set)) {
                map.put(key, obj);
                return;
            }
            Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(AbstractC17680n.m19328G0((Iterable) obj));
            AbstractC16544l.m18093f(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(key, setUnmodifiableSet);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6790b)) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f21795a, ((C6790b) obj).f21795a);
    }

    public final int hashCode() {
        return this.f21795a.hashCode();
    }

    public final String toString() {
        return AbstractC17680n.m19349Y(this.f21795a.entrySet(), ",\n", "{\n", "\n}", 0, null, C6789a.f21794Y, 24);
    }

    public /* synthetic */ C6790b(boolean z6) {
        this(new LinkedHashMap(), z6);
    }
}
