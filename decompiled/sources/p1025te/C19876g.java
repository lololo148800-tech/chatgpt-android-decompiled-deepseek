package p1025te;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.InterfaceC21915G;

/* JADX INFO: renamed from: te.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C19876g implements InterfaceC19878i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21915G f63017a;

    public C19876g(InterfaceC21915G result) {
        AbstractC16544l.m18094g(result, "result");
        this.f63017a = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19876g) && AbstractC16544l.m18089b(this.f63017a, ((C19876g) obj).f63017a);
    }

    public final int hashCode() {
        return this.f63017a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
