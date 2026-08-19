package p1025te;

import kotlin.jvm.internal.AbstractC16544l;
import p1040ue.InterfaceC20204b;

/* JADX INFO: renamed from: te.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C19890u implements InterfaceC19862M {

    /* JADX INFO: renamed from: a */
    public final String f63035a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC20204b f63036b;

    public C19890u(String id2, InterfaceC20204b action) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(action, "action");
        this.f63035a = id2;
        this.f63036b = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19890u)) {
            return false;
        }
        C19890u c19890u = (C19890u) obj;
        return AbstractC16544l.m18089b(this.f63035a, c19890u.f63035a) && AbstractC16544l.m18089b(this.f63036b, c19890u.f63036b);
    }

    public final int hashCode() {
        return this.f63036b.hashCode() + (this.f63035a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
