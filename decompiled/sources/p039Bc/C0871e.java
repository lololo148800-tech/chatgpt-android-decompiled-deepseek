package p039Bc;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16546n;
import ni.C17632f;
import ni.C17633g;
import p049Bm.InterfaceC1426a;
import p092Dc.C1998o;
import p1155zi.C22007g0;
import p1155zi.C22011h0;
import p349O0.C5975S;
import p349O0.C5997d;
import p547Wc.C8775T;
import p547Wc.EnumC8776U;

/* JADX INFO: renamed from: Bc.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C0871e extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C0871e f2557Z = new C0871e(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C0871e f2558o0 = new C0871e(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C0871e f2559p0 = new C0871e(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C0871e f2560q0 = new C0871e(0, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2561Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0871e(int i10, int i11) {
        super(i10);
        this.f2561Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() throws C17633g {
        switch (this.f2561Y) {
            case 0:
                Object objM19235b = C17632f.f56419a.m19235b(C1998o.class);
                if (objM19235b != null) {
                    return (C1998o) objM19235b;
                }
                throw new C17633g(AbstractC10763a.m11055m("No ", C1998o.class.getName(), " in ", C17632f.m19233c()));
            case 1:
                C22011h0.Companion.getClass();
                return C5997d.m6430Q(new C22011h0(C22007g0.m22342a()), C5975S.f19448r0);
            case 2:
                Object objM19235b2 = C17632f.f56419a.m19235b(C1998o.class);
                if (objM19235b2 != null) {
                    return (C1998o) objM19235b2;
                }
                throw new C17633g(AbstractC10763a.m11055m("No ", C1998o.class.getName(), " in ", C17632f.m19233c()));
            default:
                return C5997d.m6430Q(new C8775T(EnumC8776U.f26769Y), C5975S.f19448r0);
        }
    }
}
