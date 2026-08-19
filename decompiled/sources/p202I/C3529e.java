package p202I;

import p178H.C3124Q;

/* JADX INFO: renamed from: I.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3529e {

    /* JADX INFO: renamed from: a */
    public final int f10670a;

    /* JADX INFO: renamed from: b */
    public final C3124Q f10671b;

    public C3529e(int i10, C3124Q c3124q) {
        this.f10670a = i10;
        this.f10671b = c3124q;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3529e)) {
            return false;
        }
        C3529e c3529e = (C3529e) obj;
        return this.f10670a == c3529e.f10670a && this.f10671b.equals(c3529e.f10671b);
    }

    public final int hashCode() {
        return ((this.f10670a ^ 1000003) * 1000003) ^ this.f10671b.hashCode();
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.f10670a + ", imageCaptureException=" + this.f10671b + "}";
    }
}
