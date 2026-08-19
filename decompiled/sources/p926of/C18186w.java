package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p360Od.C6172d;
import p575Xd.InterfaceC9461t;

/* JADX INFO: renamed from: of.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C18186w implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final C6172d f58001a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9461t f58002b;

    public C18186w(C6172d data, InterfaceC9461t action) {
        AbstractC16544l.m18094g(data, "data");
        AbstractC16544l.m18094g(action, "action");
        this.f58001a = data;
        this.f58002b = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18186w)) {
            return false;
        }
        C18186w c18186w = (C18186w) obj;
        return AbstractC16544l.m18089b(this.f58001a, c18186w.f58001a) && AbstractC16544l.m18089b(this.f58002b, c18186w.f58002b);
    }

    public final int hashCode() {
        return this.f58002b.hashCode() + (this.f58001a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
