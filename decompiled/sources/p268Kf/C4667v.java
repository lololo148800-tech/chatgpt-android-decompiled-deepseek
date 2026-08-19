package p268Kf;

import android.location.Geocoder;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kf.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C4667v extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C4668w f15201Y;

    /* JADX INFO: renamed from: Z */
    public Geocoder f15202Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f15203o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4668w f15204p0;

    /* JADX INFO: renamed from: q0 */
    public int f15205q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4667v(C4668w c4668w, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f15204p0 = c4668w;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f15203o0 = obj;
        this.f15205q0 |= Integer.MIN_VALUE;
        return this.f15204p0.m5392b(this);
    }
}
