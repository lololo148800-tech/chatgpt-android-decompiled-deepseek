package p537W0;

import p349O0.AbstractC6012k0;
import p349O0.InterfaceC5988Y0;
import p466T0.C7178e;
import p466T0.C7187n;
import p515V0.C7736b;
import p817j$.util.Map;

/* JADX INFO: renamed from: W0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8413e extends C7178e {

    /* JADX INFO: renamed from: s0 */
    public C8414f f26159s0;

    @Override // p466T0.C7178e, p415R0.InterfaceC6785c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C8414f build() {
        C7187n c7187n = this.f22818o0;
        C8414f c8414f = this.f26159s0;
        if (c7187n != c8414f.f22811Y) {
            this.f22817Z = new C7736b();
            c8414f = new C8414f(this.f22818o0, this.f22821r0);
        }
        this.f26159s0 = c8414f;
        return c8414f;
    }

    @Override // p466T0.C7178e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC6012k0) {
            return super.containsKey((AbstractC6012k0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC5988Y0) {
            return super.containsValue((InterfaceC5988Y0) obj);
        }
        return false;
    }

    @Override // p466T0.C7178e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC6012k0) {
            return (InterfaceC5988Y0) super.get((AbstractC6012k0) obj);
        }
        return null;
    }

    @Override // p466T0.C7178e, java.util.Map, p817j$.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC6012k0) ? obj2 : (InterfaceC5988Y0) Map.CC.$default$getOrDefault(this, (AbstractC6012k0) obj, (InterfaceC5988Y0) obj2);
    }

    @Override // p466T0.C7178e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC6012k0) {
            return (InterfaceC5988Y0) super.remove((AbstractC6012k0) obj);
        }
        return null;
    }
}
