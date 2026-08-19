package tf;

import kotlin.jvm.internal.AbstractC16544l;
import p991rh.AbstractC19000i;

/* JADX INFO: renamed from: tf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C19922g implements InterfaceC19923h {

    /* JADX INFO: renamed from: a */
    public final AbstractC19000i f63180a;

    static {
        int i10 = AbstractC19000i.f60578Y;
    }

    public C19922g(AbstractC19000i error) {
        AbstractC16544l.m18094g(error, "error");
        this.f63180a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19922g) && AbstractC16544l.m18089b(this.f63180a, ((C19922g) obj).f63180a);
    }

    public final int hashCode() {
        return this.f63180a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
