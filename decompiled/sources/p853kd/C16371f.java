package p853kd;

import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: kd.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C16371f {
    public static final C16370e Companion = new C16370e();

    /* JADX INFO: renamed from: a */
    public final int f50845a;

    public C16371f(int i10) {
        this.f50845a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16371f) && this.f50845a == ((C16371f) obj).f50845a;
    }

    public final int hashCode() {
        return this.f50845a;
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C16371f(int i10, int i11) {
        if ((i10 & 1) == 0) {
            this.f50845a = 0;
        } else {
            this.f50845a = i11;
        }
    }
}
