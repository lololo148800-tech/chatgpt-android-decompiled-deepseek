package android.javax.sip;

import java.io.Serializable;

/* JADX INFO: renamed from: android.javax.sip.s */
/* JADX INFO: loaded from: classes.dex */
public final class C10812s implements Serializable {

    /* JADX INFO: renamed from: Z */
    public static final C10812s[] f32041Z = new C10812s[2];

    /* JADX INFO: renamed from: Y */
    public final int f32042Y;

    static {
        new C10812s(0);
        new C10812s(1);
    }

    public C10812s(int i10) {
        this.f32042Y = i10;
        f32041Z[i10] = this;
    }

    public final String toString() {
        int i10 = this.f32042Y;
        if (i10 != 0) {
            return i10 != 1 ? "Error while printing Timeout" : "Transaction Timeout";
        }
        return "Retransmission Timeout";
    }
}
