package p273Kl;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Kl.a1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4761a1 {

    /* JADX INFO: renamed from: a */
    public final String f15537a;

    public C4761a1(String str) {
        this.f15537a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4761a1) && AbstractC16544l.m18089b(this.f15537a, ((C4761a1) obj).f15537a);
    }

    public final int hashCode() {
        return this.f15537a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("Cid(value="), this.f15537a, ')');
    }
}
