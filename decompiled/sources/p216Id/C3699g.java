package p216Id;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Id.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C3699g implements InterfaceC3702j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3702j f11232a;

    /* JADX INFO: renamed from: b */
    public final boolean f11233b;

    public C3699g(InterfaceC3702j lastState, boolean z6, int i10) {
        lastState = (i10 & 1) != 0 ? new C3700h(false) : lastState;
        z6 = (i10 & 2) != 0 ? false : z6;
        AbstractC16544l.m18094g(lastState, "lastState");
        this.f11232a = lastState;
        this.f11233b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3699g)) {
            return false;
        }
        C3699g c3699g = (C3699g) obj;
        return AbstractC16544l.m18089b(this.f11232a, c3699g.f11232a) && this.f11233b == c3699g.f11233b;
    }

    public final int hashCode() {
        return (this.f11232a.hashCode() * 31) + (this.f11233b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
