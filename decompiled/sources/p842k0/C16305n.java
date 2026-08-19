package p842k0;

import kotlin.jvm.internal.AbstractC16544l;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;

/* JADX INFO: renamed from: k0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C16305n {

    /* JADX INFO: renamed from: a */
    public final C6002f0 f50513a = C5997d.m6430Q(C16302k.f50511a, C5975S.f19448r0);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16305n) {
            return AbstractC16544l.m18089b((AbstractC16304m) ((C16305n) obj).f50513a.getValue(), (AbstractC16304m) this.f50513a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC16304m) this.f50513a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((AbstractC16304m) this.f50513a.getValue()) + ')';
    }
}
