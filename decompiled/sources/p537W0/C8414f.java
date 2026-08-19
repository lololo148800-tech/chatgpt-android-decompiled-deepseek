package p537W0;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import p349O0.AbstractC6012k0;
import p349O0.InterfaceC5988Y0;
import p349O0.InterfaceC6008i0;
import p415R0.InterfaceC6785c;
import p466T0.C7176c;
import p466T0.C7178e;
import p466T0.C7187n;
import p817j$.util.Map;

/* JADX INFO: renamed from: W0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8414f extends C7176c implements InterfaceC6008i0, Map {

    /* JADX INFO: renamed from: p0 */
    public static final C8414f f26160p0 = new C8414f(C7187n.f22836e, 0);

    @Override // p466T0.C7176c
    /* JADX INFO: renamed from: a */
    public final C7178e builder() {
        C8413e c8413e = new C8413e(this);
        c8413e.f26159s0 = this;
        return c8413e;
    }

    @Override // p466T0.C7176c, p415R0.InterfaceC6786d
    public final InterfaceC6785c builder() {
        C8413e c8413e = new C8413e(this);
        c8413e.f26159s0 = this;
        return c8413e;
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

    @Override // p466T0.C7176c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC6012k0) {
            return super.containsKey((AbstractC6012k0) obj);
        }
        return false;
    }

    @Override // p909nm.AbstractC17672f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC5988Y0) {
            return super.containsValue((InterfaceC5988Y0) obj);
        }
        return false;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // p466T0.C7176c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC6012k0) {
            return (InterfaceC5988Y0) super.get((AbstractC6012k0) obj);
        }
        return null;
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC6012k0) ? obj2 : (InterfaceC5988Y0) Map.CC.$default$getOrDefault(this, (AbstractC6012k0) obj, (InterfaceC5988Y0) obj2);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, p817j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
