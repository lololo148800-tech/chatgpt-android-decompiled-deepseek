package p466T0;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1727e;
import p415R0.InterfaceC6785c;
import p515V0.C7735a;
import p515V0.C7736b;
import p817j$.util.Map;

/* JADX INFO: renamed from: T0.e */
/* JADX INFO: loaded from: classes.dex */
public class C7178e extends AbstractMap implements InterfaceC6785c, Map, java.util.Map, InterfaceC1727e {

    /* JADX INFO: renamed from: Y */
    public C7176c f22816Y;

    /* JADX INFO: renamed from: Z */
    public C7736b f22817Z = new C7736b();

    /* JADX INFO: renamed from: o0 */
    public C7187n f22818o0;

    /* JADX INFO: renamed from: p0 */
    public Object f22819p0;

    /* JADX INFO: renamed from: q0 */
    public int f22820q0;

    /* JADX INFO: renamed from: r0 */
    public int f22821r0;

    public C7178e(C7176c c7176c) {
        this.f22816Y = c7176c;
        this.f22818o0 = c7176c.f22811Y;
        c7176c.getClass();
        this.f22821r0 = c7176c.f22812Z;
    }

    @Override // p415R0.InterfaceC6785c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C7176c build() {
        C7187n c7187n = this.f22818o0;
        C7176c c7176c = this.f22816Y;
        if (c7187n != c7176c.f22811Y) {
            this.f22817Z = new C7736b();
            c7176c = new C7176c(this.f22818o0, this.f22821r0);
        }
        this.f22816Y = c7176c;
        return c7176c;
    }

    /* JADX INFO: renamed from: b */
    public final void m7559b(int i10) {
        this.f22821r0 = i10;
        this.f22820q0++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f22818o0 = C7187n.f22836e;
        m7559b(0);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f22818o0.m7566d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C7180g(0, this);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f22818o0.m7569g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map, p817j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new C7180g(1, this);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f22819p0 = null;
        this.f22818o0 = this.f22818o0.m7573l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f22819p0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        C7176c c7176cBuild = null;
        C7176c c7176c = map instanceof C7176c ? (C7176c) map : null;
        if (c7176c == null) {
            C7178e c7178e = map instanceof C7178e ? (C7178e) map : null;
            if (c7178e != null) {
                c7176cBuild = c7178e.build();
            }
        } else {
            c7176cBuild = c7176c;
        }
        if (c7176cBuild == null) {
            super.putAll(map);
            return;
        }
        C7735a c7735a = new C7735a();
        c7735a.f24401a = 0;
        int i10 = this.f22821r0;
        C7187n c7187n = this.f22818o0;
        C7187n c7187n2 = c7176cBuild.f22811Y;
        AbstractC16544l.m18092e(c7187n2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f22818o0 = c7187n.m7574m(c7187n2, 0, c7735a, this);
        int i11 = (c7176cBuild.f22812Z + i10) - c7735a.f24401a;
        if (i10 != i11) {
            m7559b(i11);
        }
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i10 = this.f22821r0;
        C7187n c7187nM7576o = this.f22818o0.m7576o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (c7187nM7576o == null) {
            c7187nM7576o = C7187n.f22836e;
        }
        this.f22818o0 = c7187nM7576o;
        return i10 != this.f22821r0;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f22821r0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new C7183j(this);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f22819p0 = null;
        C7187n c7187nM7575n = this.f22818o0.m7575n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (c7187nM7575n == null) {
            c7187nM7575n = C7187n.f22836e;
        }
        this.f22818o0 = c7187nM7575n;
        return this.f22819p0;
    }
}
