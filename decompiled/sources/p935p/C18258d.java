package p935p;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: p.d */
/* JADX INFO: loaded from: classes.dex */
public final class C18258d implements TimeInterpolator {

    /* JADX INFO: renamed from: a */
    public int[] f58184a;

    /* JADX INFO: renamed from: b */
    public int f58185b;

    /* JADX INFO: renamed from: c */
    public int f58186c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        int i10 = (int) ((f10 * this.f58186c) + 0.5f);
        int i11 = this.f58185b;
        int[] iArr = this.f58184a;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr[i12];
            if (i10 < i13) {
                break;
            }
            i10 -= i13;
            i12++;
        }
        return (i12 / i11) + (i12 < i11 ? i10 / this.f58186c : 0.0f);
    }
}
