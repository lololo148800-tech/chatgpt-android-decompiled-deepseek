package pf;

/* JADX INFO: renamed from: pf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C18392h implements InterfaceC18393i {

    /* JADX INFO: renamed from: a */
    public final long f58673a;

    public C18392h(long j10) {
        this.f58673a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18392h) && this.f58673a == ((C18392h) obj).f58673a;
    }

    public final int hashCode() {
        long j10 = this.f58673a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return "█";
    }
}
