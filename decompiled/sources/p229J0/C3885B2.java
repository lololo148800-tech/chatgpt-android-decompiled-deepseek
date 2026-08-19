package p229J0;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C6021p;
import p635a1.C10456n;
import p774h1.InterfaceC14339Q;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: J0.B2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3885B2 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f11771Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f11772Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f11773o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC17406l f11774p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C4052f4 f11775q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC14339Q f11776r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3885B2(boolean z6, boolean z10, InterfaceC17406l interfaceC17406l, C4052f4 c4052f4, InterfaceC14339Q interfaceC14339Q, int i10) {
        super(2);
        this.f11771Y = i10;
        this.f11772Z = z6;
        this.f11773o0 = z10;
        this.f11774p0 = interfaceC17406l;
        this.f11775q0 = c4052f4;
        this.f11776r0 = interfaceC14339Q;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11771Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C3879A2.f11730a.m4599a(this.f11772Z, this.f11773o0, this.f11774p0, null, this.f11775q0, this.f11776r0, 0.0f, 0.0f, c6021p, 100663296, RCHTTPStatusCodes.SUCCESS);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C3879A2.f11730a.m4599a(this.f11772Z, this.f11773o0, this.f11774p0, null, this.f11775q0, this.f11776r0, 0.0f, 0.0f, c6021p2, 100663296, RCHTTPStatusCodes.SUCCESS);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C4082k4 c4082k4 = C4082k4.f13034a;
                    C10456n c10456n = C10456n.f30959Y;
                    float f10 = C4082k4.f13038e;
                    float f11 = C4082k4.f13037d;
                    c4082k4.m4750a(this.f11772Z, this.f11773o0, this.f11774p0, c10456n, this.f11775q0, this.f11776r0, f10, f11, c6021p3, 114822144);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
