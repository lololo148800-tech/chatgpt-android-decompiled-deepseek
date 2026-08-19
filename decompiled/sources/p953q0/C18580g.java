package p953q0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: q0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C18580g {

    /* JADX INFO: renamed from: a */
    public final int f59182a;

    /* JADX INFO: renamed from: b */
    public final int f59183b;

    /* JADX INFO: renamed from: c */
    public final Object f59184c;

    public C18580g(int i10, Object obj, int i11) {
        this.f59182a = i10;
        this.f59183b = i11;
        this.f59184c = obj;
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "startIndex should be >= 0, but was ").toString());
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "size should be >0, but was ").toString());
        }
    }
}
