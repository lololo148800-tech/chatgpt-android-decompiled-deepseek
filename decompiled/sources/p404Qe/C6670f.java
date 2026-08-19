package p404Qe;

import kotlin.jvm.internal.AbstractC16544l;
import p968qi.C18739v;

/* JADX INFO: renamed from: Qe.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6670f implements InterfaceC6672h {

    /* JADX INFO: renamed from: a */
    public final C18739v f21444a;

    public C6670f(C18739v selectionState) {
        AbstractC16544l.m18094g(selectionState, "selectionState");
        this.f21444a = selectionState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6670f) && AbstractC16544l.m18089b(this.f21444a, ((C6670f) obj).f21444a);
    }

    public final int hashCode() {
        return this.f21444a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
