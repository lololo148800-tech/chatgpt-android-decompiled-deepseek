package p890mb;

/* JADX INFO: renamed from: mb.h */
/* JADX INFO: loaded from: classes.dex */
public final class C17211h {

    /* JADX INFO: renamed from: a */
    public final C17220q f54941a;

    /* JADX INFO: renamed from: b */
    public final boolean f54942b;

    public C17211h(C17220q c17220q, boolean z6) {
        this.f54941a = c17220q;
        this.f54942b = z6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17211h)) {
            return false;
        }
        C17211h c17211h = (C17211h) obj;
        return c17211h.f54941a.equals(this.f54941a) && c17211h.f54942b == this.f54942b;
    }

    public final int hashCode() {
        return ((this.f54941a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f54942b).hashCode();
    }
}
