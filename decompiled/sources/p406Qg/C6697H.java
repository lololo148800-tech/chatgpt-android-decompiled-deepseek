package p406Qg;

import kotlin.jvm.internal.AbstractC16544l;
import p1042uh.C20263a0;

/* JADX INFO: renamed from: Qg.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C6697H implements InterfaceC6699J {

    /* JADX INFO: renamed from: a */
    public final C20263a0 f21526a;

    public C6697H(C20263a0 c20263a0) {
        this.f21526a = c20263a0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6697H) && AbstractC16544l.m18089b(this.f21526a, ((C6697H) obj).f21526a);
    }

    public final int hashCode() {
        C20263a0 c20263a0 = this.f21526a;
        if (c20263a0 == null) {
            return 0;
        }
        return c20263a0.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
