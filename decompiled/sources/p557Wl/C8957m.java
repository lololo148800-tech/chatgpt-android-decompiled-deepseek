package p557Wl;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Wl.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C8957m {

    /* JADX INFO: renamed from: a */
    public final String f27382a;

    public C8957m(String str) {
        this.f27382a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8957m) && AbstractC16544l.m18089b(this.f27382a, ((C8957m) obj).f27382a);
    }

    public final int hashCode() {
        return this.f27382a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("SdpMsid(value="), this.f27382a, ')');
    }
}
