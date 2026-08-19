package p806ia;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: ia.e */
/* JADX INFO: loaded from: classes.dex */
public final class C14955e {

    /* JADX INFO: renamed from: a */
    public long f46578a;

    /* JADX INFO: renamed from: c */
    public TimeInterpolator f46580c = null;

    /* JADX INFO: renamed from: d */
    public int f46581d = 0;

    /* JADX INFO: renamed from: e */
    public int f46582e = 1;

    /* JADX INFO: renamed from: b */
    public long f46579b = 150;

    public C14955e(long j10) {
        this.f46578a = j10;
    }

    /* JADX INFO: renamed from: a */
    public final void m16120a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f46578a);
        objectAnimator.setDuration(this.f46579b);
        objectAnimator.setInterpolator(m16121b());
        objectAnimator.setRepeatCount(this.f46581d);
        objectAnimator.setRepeatMode(this.f46582e);
    }

    /* JADX INFO: renamed from: b */
    public final TimeInterpolator m16121b() {
        TimeInterpolator timeInterpolator = this.f46580c;
        return timeInterpolator != null ? timeInterpolator : AbstractC14951a.f46572b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14955e)) {
            return false;
        }
        C14955e c14955e = (C14955e) obj;
        if (this.f46578a == c14955e.f46578a && this.f46579b == c14955e.f46579b && this.f46581d == c14955e.f46581d && this.f46582e == c14955e.f46582e) {
            return m16121b().getClass().equals(c14955e.m16121b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46578a;
        long j11 = this.f46579b;
        return ((((m16121b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31)) * 31) + this.f46581d) * 31) + this.f46582e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Separators.RETURN);
        sb2.append(C14955e.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f46578a);
        sb2.append(" duration: ");
        sb2.append(this.f46579b);
        sb2.append(" interpolator: ");
        sb2.append(m16121b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f46581d);
        sb2.append(" repeatMode: ");
        return AbstractC10763a.m11056n(sb2, this.f46582e, "}\n");
    }
}
