package p692d0;

import androidx.datastore.preferences.protobuf.C10962h0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C12966e extends C12959L implements Map, p817j$.util.Map {

    /* JADX INFO: renamed from: p0 */
    public C10962h0 f41172p0;

    /* JADX INFO: renamed from: q0 */
    public C12963b f41173q0;

    /* JADX INFO: renamed from: r0 */
    public C12965d f41174r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12966e(C12959L c12959l) {
        super(0);
        int i10 = c12959l.f41154o0;
        m14642b(this.f41154o0 + i10);
        if (this.f41154o0 != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(c12959l.m14646f(i11), c12959l.m14649j(i11));
            }
        } else if (i10 > 0) {
            AbstractC17678l.m19303j(0, 0, i10, c12959l.f41152Y, this.f41152Y);
            AbstractC17678l.m19304k(0, 0, i10 << 1, c12959l.f41153Z, this.f41153Z);
            this.f41154o0 = i10;
        }
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return p817j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return p817j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return p817j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C10962h0 c10962h0 = this.f41172p0;
        if (c10962h0 != null) {
            return c10962h0;
        }
        C10962h0 c10962h1 = new C10962h0(2, this);
        this.f41172p0 = c10962h1;
        return c10962h1;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        p817j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m14657k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C12963b c12963b = this.f41173q0;
        if (c12963b != null) {
            return c12963b;
        }
        C12963b c12963b2 = new C12963b(this);
        this.f41173q0 = c12963b2;
        return c12963b2;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m14658l(Collection collection) {
        int i10 = this.f41154o0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.f41154o0;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return p817j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m14642b(map.size() + this.f41154o0);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        p817j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        C12965d c12965d = this.f41174r0;
        if (c12965d != null) {
            return c12965d;
        }
        C12965d c12965d2 = new C12965d(this);
        this.f41174r0 = c12965d2;
        return c12965d2;
    }
}
