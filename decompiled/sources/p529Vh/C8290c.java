package p529Vh;

import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Vh.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C8290c {
    public static final C8289b Companion = new C8289b();

    /* JADX INFO: renamed from: a */
    public final boolean f25842a;

    public /* synthetic */ C8290c(int i10, boolean z6) {
        if ((i10 & 1) == 0) {
            this.f25842a = true;
        } else {
            this.f25842a = z6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8290c) && this.f25842a == ((C8290c) obj).f25842a;
    }

    public final int hashCode() {
        return this.f25842a ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }

    public C8290c(boolean z6) {
        this.f25842a = z6;
    }
}
