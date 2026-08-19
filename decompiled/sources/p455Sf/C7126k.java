package p455Sf;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p1155zi.InterfaceC21925I1;

/* JADX INFO: renamed from: Sf.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C7126k implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21925I1 f22678a;

    public C7126k(InterfaceC21925I1 notificationTasks) {
        AbstractC16544l.m18094g(notificationTasks, "notificationTasks");
        this.f22678a = notificationTasks;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7126k) && AbstractC16544l.m18089b(this.f22678a, ((C7126k) obj).f22678a);
    }

    public final int hashCode() {
        return this.f22678a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
