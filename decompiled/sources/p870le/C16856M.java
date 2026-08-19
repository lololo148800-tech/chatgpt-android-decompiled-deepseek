package p870le;

import ge.C14111x0;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1155zi.EnumC21974X0;
import p544W9.AbstractC8614c3;
import p553Wh.C8870f;
import p948pi.C18418a;

/* JADX INFO: renamed from: le.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C16856M extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54073Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18418a f54074Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8870f f54075o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f54076p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C14111x0 f54077q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16856M(C18418a c18418a, C8870f c8870f, InterfaceC1436k interfaceC1436k, C14111x0 c14111x0, int i10) {
        super(0);
        this.f54073Y = i10;
        this.f54074Z = c18418a;
        this.f54075o0 = c8870f;
        this.f54076p0 = interfaceC1436k;
        this.f54077q0 = c14111x0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f54073Y) {
            case 0:
                AbstractC8614c3.m9262a(this.f54074Z, this.f54075o0, EnumC21974X0.f69556p0, new C16855L(this.f54076p0, this.f54077q0, 0));
                break;
            default:
                AbstractC8614c3.m9262a(this.f54074Z, this.f54075o0, EnumC21974X0.f69556p0, new C16855L(this.f54076p0, this.f54077q0, 1));
                break;
        }
        return C17296C.f55119a;
    }
}
