package af;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: af.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C10593u implements InterfaceC10597y {

    /* JADX INFO: renamed from: a */
    public final Integer f31444a;

    public C10593u(Integer num) {
        this.f31444a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10593u) && AbstractC16544l.m18089b(this.f31444a, ((C10593u) obj).f31444a);
    }

    public final int hashCode() {
        Integer num = this.f31444a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
