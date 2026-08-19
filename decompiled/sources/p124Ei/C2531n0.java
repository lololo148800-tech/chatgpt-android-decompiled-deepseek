package p124Ei;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ei.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2531n0 implements InterfaceC2548v0 {

    /* JADX INFO: renamed from: a */
    public final Intent f7868a;

    public C2531n0(Intent data) {
        AbstractC16544l.m18094g(data, "data");
        this.f7868a = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2531n0) && AbstractC16544l.m18089b(this.f7868a, ((C2531n0) obj).f7868a);
    }

    public final int hashCode() {
        return this.f7868a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
