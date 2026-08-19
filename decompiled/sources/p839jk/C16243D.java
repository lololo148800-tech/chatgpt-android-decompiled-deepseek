package p839jk;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8554S3;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: jk.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C16243D extends AbstractC8554S3 {

    /* JADX INFO: renamed from: a */
    public final String f50368a;

    public C16243D(String str) {
        this.f50368a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16243D) && AbstractC16544l.m18089b(this.f50368a, ((C16243D) obj).f50368a);
    }

    public final int hashCode() {
        String str = this.f50368a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f50368a, Separators.RPAREN, new StringBuilder("TakePhoto(pose="));
    }
}
