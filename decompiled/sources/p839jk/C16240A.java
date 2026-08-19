package p839jk;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8554S3;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: jk.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C16240A extends AbstractC8554S3 {

    /* JADX INFO: renamed from: a */
    public final String f50365a;

    public C16240A(String str) {
        this.f50365a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16240A) && AbstractC16544l.m18089b(this.f50365a, ((C16240A) obj).f50365a);
    }

    public final int hashCode() {
        String str = this.f50365a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f50365a, Separators.RPAREN, new StringBuilder("LeadInAnimation(pose="));
    }
}
