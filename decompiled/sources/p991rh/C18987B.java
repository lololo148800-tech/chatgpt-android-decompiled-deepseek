package p991rh;

import kotlin.jvm.internal.AbstractC16544l;
import p364Oh.AbstractC6224C;

/* JADX INFO: renamed from: rh.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C18987B implements InterfaceC18989D {

    /* JADX INFO: renamed from: a */
    public final AbstractC6224C f60561a;

    public C18987B(AbstractC6224C abstractC6224C) {
        this.f60561a = abstractC6224C;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18987B) && AbstractC16544l.m18089b(this.f60561a, ((C18987B) obj).f60561a);
    }

    public final int hashCode() {
        return this.f60561a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
