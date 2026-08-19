package p318Mh;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.List;
import p228J.AbstractC3812N;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: renamed from: Mh.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C5403i extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f17668o0;

    /* JADX INFO: renamed from: p0 */
    public final List f17669p0;

    /* JADX INFO: renamed from: q0 */
    public final List f17670q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5403i(int i10) {
        super(3, (byte) 0);
        this.f17668o0 = i10;
        switch (i10) {
            case 1:
                super(3, (byte) 0);
                this.f17669p0 = AbstractC9393x3.m9974d("subscription");
                this.f17670q0 = C17689w.f56480Y;
                break;
            case 2:
                super(3, (byte) 0);
                C5356C0 c5356c0 = C5356C0.f17585g;
                c5356c0.getClass();
                C5370J0 c5370j0 = C5356C0.f17586h;
                String str = "share/" + c5370j0.f17618e;
                c5356c0.getClass();
                this.f17669p0 = AbstractC17681o.m19382k(str, AbstractC10763a.m11054l("share/", c5370j0.f17618e, "/continue"));
                this.f17670q0 = AbstractC9393x3.m9974d("share/6fc2aac8-1625-412e-b9aa-3d65545198da");
                break;
            default:
                C5405j.f17672g.getClass();
                this.f17669p0 = AbstractC9393x3.m9974d("aip/" + C5405j.f17673h.f17618e + "/oauth/callback");
                this.f17670q0 = C17689w.f56480Y;
                break;
        }
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: D */
    public final List mo4514D() {
        switch (this.f17668o0) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f17669p0;
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: F */
    public final List mo4515F() {
        switch (this.f17668o0) {
            case 0:
                return (C17689w) this.f17670q0;
            case 1:
                return (C17689w) this.f17670q0;
            default:
                return this.f17670q0;
        }
    }
}
