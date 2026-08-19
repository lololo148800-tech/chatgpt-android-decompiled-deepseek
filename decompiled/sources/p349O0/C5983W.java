package p349O0;

import kotlin.jvm.internal.AbstractC16544l;
import p692d0.C12951D;

/* JADX INFO: renamed from: O0.W */
/* JADX INFO: loaded from: classes.dex */
public final class C5983W {

    /* JADX INFO: renamed from: a */
    public final C12951D f19462a;

    public final boolean equals(Object obj) {
        if (obj instanceof C5983W) {
            return AbstractC16544l.m18089b(this.f19462a, ((C5983W) obj).f19462a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19462a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.f19462a + ')';
    }
}
