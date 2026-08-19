package p536W;

import androidx.lifecycle.InterfaceC11112u;
import p326N.C5559a;

/* JADX INFO: renamed from: W.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8405a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11112u f26131a;

    /* JADX INFO: renamed from: b */
    public final C5559a f26132b;

    public C8405a(InterfaceC11112u interfaceC11112u, C5559a c5559a) {
        if (interfaceC11112u == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f26131a = interfaceC11112u;
        if (c5559a == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f26132b = c5559a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8405a)) {
            return false;
        }
        C8405a c8405a = (C8405a) obj;
        return this.f26131a.equals(c8405a.f26131a) && this.f26132b.equals(c8405a.f26132b);
    }

    public final int hashCode() {
        return ((this.f26131a.hashCode() ^ 1000003) * 1000003) ^ this.f26132b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.f26131a + ", cameraId=" + this.f26132b + "}";
    }
}
