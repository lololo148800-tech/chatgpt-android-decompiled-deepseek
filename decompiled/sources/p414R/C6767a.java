package p414R;

import p610Z1.C10142i;

/* JADX INFO: renamed from: R.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6767a {

    /* JADX INFO: renamed from: a */
    public final int f21705a;

    /* JADX INFO: renamed from: b */
    public final int f21706b;

    /* JADX INFO: renamed from: c */
    public final C10142i f21707c;

    public C6767a(int i10, int i11, C10142i c10142i) {
        this.f21705a = i10;
        this.f21706b = i11;
        this.f21707c = c10142i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6767a)) {
            return false;
        }
        C6767a c6767a = (C6767a) obj;
        return this.f21705a == c6767a.f21705a && this.f21706b == c6767a.f21706b && this.f21707c.equals(c6767a.f21707c);
    }

    public final int hashCode() {
        return ((((this.f21705a ^ 1000003) * 1000003) ^ this.f21706b) * 1000003) ^ this.f21707c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f21705a + ", rotationDegrees=" + this.f21706b + ", completer=" + this.f21707c + "}";
    }
}
