package p109E3;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p1016t3.C19788o;

/* JADX INFO: renamed from: E3.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2293q extends Exception {

    /* JADX INFO: renamed from: Y */
    public final int f7082Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f7083Z;

    /* JADX INFO: renamed from: o0 */
    public final C19788o f7084o0;

    public C2293q(int i10, C19788o c19788o, boolean z6) {
        super(AbstractC10763a.m11048f(i10, "AudioTrack write failed: "));
        this.f7083Z = z6;
        this.f7082Y = i10;
        this.f7084o0 = c19788o;
    }
}
