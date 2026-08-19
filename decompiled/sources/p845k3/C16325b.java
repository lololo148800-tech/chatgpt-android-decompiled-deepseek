package p845k3;

import android.content.Context;
import p275Kn.InterfaceC4814a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: k3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C16325b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Context f50638Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC16330g f50639Z;

    /* JADX INFO: renamed from: o0 */
    public String f50640o0;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC4814a f50641p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f50642q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16329f f50643r0;

    /* JADX INFO: renamed from: s0 */
    public int f50644s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16325b(C16329f c16329f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f50643r0 = c16329f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f50642q0 = obj;
        this.f50644s0 |= Integer.MIN_VALUE;
        return this.f50643r0.m17919a(null, null, null, this);
    }
}
