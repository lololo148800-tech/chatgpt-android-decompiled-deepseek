package kg;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p1155zi.InterfaceC21925I1;

/* JADX INFO: renamed from: kg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C16396b implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21925I1 f50909a;

    public C16396b(InterfaceC21925I1 interfaceC21925I1) {
        this.f50909a = interfaceC21925I1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16396b) && AbstractC16544l.m18089b(this.f50909a, ((C16396b) obj).f50909a);
    }

    public final int hashCode() {
        InterfaceC21925I1 interfaceC21925I1 = this.f50909a;
        if (interfaceC21925I1 == null) {
            return 0;
        }
        return interfaceC21925I1.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
