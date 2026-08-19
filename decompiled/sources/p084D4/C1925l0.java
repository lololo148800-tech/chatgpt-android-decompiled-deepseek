package p084D4;

import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: D4.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1925l0 {

    /* JADX INFO: renamed from: a */
    public int f5636a;

    /* JADX INFO: renamed from: b */
    public int f5637b;

    /* JADX INFO: renamed from: c */
    public int f5638c;

    /* JADX INFO: renamed from: d */
    public int f5639d;

    /* JADX INFO: renamed from: e */
    public int f5640e;

    /* JADX INFO: renamed from: f */
    public boolean f5641f;

    /* JADX INFO: renamed from: g */
    public boolean f5642g;

    /* JADX INFO: renamed from: h */
    public boolean f5643h;

    /* JADX INFO: renamed from: i */
    public boolean f5644i;

    /* JADX INFO: renamed from: j */
    public boolean f5645j;

    /* JADX INFO: renamed from: k */
    public boolean f5646k;

    /* JADX INFO: renamed from: l */
    public int f5647l;

    /* JADX INFO: renamed from: m */
    public long f5648m;

    /* JADX INFO: renamed from: n */
    public int f5649n;

    /* JADX INFO: renamed from: a */
    public final void m3081a(int i10) {
        if ((this.f5639d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f5639d));
    }

    /* JADX INFO: renamed from: b */
    public final int m3082b() {
        return this.f5642g ? this.f5637b - this.f5638c : this.f5640e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
        sb2.append(this.f5636a);
        sb2.append(", mData=null, mItemCount=");
        sb2.append(this.f5640e);
        sb2.append(", mIsMeasuring=");
        sb2.append(this.f5644i);
        sb2.append(", mPreviousLayoutItemCount=");
        sb2.append(this.f5637b);
        sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb2.append(this.f5638c);
        sb2.append(", mStructureChanged=");
        sb2.append(this.f5641f);
        sb2.append(", mInPreLayout=");
        sb2.append(this.f5642g);
        sb2.append(", mRunSimpleAnimations=");
        sb2.append(this.f5645j);
        sb2.append(", mRunPredictiveAnimations=");
        return AbstractC3794B0.m4499x(sb2, this.f5646k, '}');
    }
}
