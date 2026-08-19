package p622Ze;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ze.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C10294l implements InterfaceC10297o {

    /* JADX INFO: renamed from: a */
    public final String f30577a;

    public C10294l(String actionId) {
        AbstractC16544l.m18094g(actionId, "actionId");
        this.f30577a = actionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10294l) && AbstractC16544l.m18089b(this.f30577a, ((C10294l) obj).f30577a);
    }

    public final int hashCode() {
        return this.f30577a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
