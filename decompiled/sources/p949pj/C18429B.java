package p949pj;

import android.gov.nist.core.Separators;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: pj.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C18429B implements InterfaceC18431D {

    /* JADX INFO: renamed from: a */
    public final boolean f58795a;

    public C18429B(boolean z6) {
        this.f58795a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18429B) && this.f58795a == ((C18429B) obj).f58795a;
    }

    public final int hashCode() {
        boolean z6 = this.f58795a;
        if (z6) {
            return 1;
        }
        return z6 ? 1 : 0;
    }

    public final String toString() {
        return AbstractC14376f.m15823B(new StringBuilder("Closed(wasRecordingInterrupted="), this.f58795a, Separators.RPAREN);
    }
}
