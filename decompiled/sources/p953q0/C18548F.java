package p953q0;

import androidx.compose.foundation.lazy.layout.C10846a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p1140z1.C21660F;
import p1140z1.InterfaceC21708o;
import p330N4.C5667r;
import p604Yk.C10077b;
import p635a1.AbstractC10458p;
import p821j1.C16037b;
import p843k1.C16308b;

/* JADX INFO: renamed from: q0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C18548F extends AbstractC10458p implements InterfaceC21708o {

    /* JADX INFO: renamed from: z0 */
    public C10846a f59100z0;

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        this.f59100z0.f32542j = this;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        this.f59100z0.m11268f();
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void mo427L() {
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: e */
    public final void mo430e(C21660F c21660f) {
        ArrayList arrayList = this.f59100z0.f32541i;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C18546D c18546d = (C18546D) arrayList.get(i10);
            C16308b c16308b = c18546d.f59094n;
            if (c16308b != null) {
                long j10 = c18546d.f59093m;
                long j11 = c16308b.f50537s;
                float f10 = ((int) (j10 >> 32)) - ((int) (j11 >> 32));
                float f11 = ((int) (j10 & 4294967295L)) - ((int) (4294967295L & j11));
                C16037b c16037b = c21660f.f68674Y;
                ((C10077b) c16037b.f49479Z.f43259Z).m10665M(f10, f11);
                try {
                    C5667r.m6091c(c21660f, c16308b);
                    ((C10077b) c16037b.f49479Z.f43259Z).m10665M(-f10, -f11);
                } catch (Throwable th2) {
                    ((C10077b) c16037b.f49479Z.f43259Z).m10665M(-f10, -f11);
                    throw th2;
                }
            }
        }
        c21660f.m22080a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18548F) && AbstractC16544l.m18089b(this.f59100z0, ((C18548F) obj).f59100z0);
    }

    public final int hashCode() {
        return this.f59100z0.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f59100z0 + ')';
    }
}
