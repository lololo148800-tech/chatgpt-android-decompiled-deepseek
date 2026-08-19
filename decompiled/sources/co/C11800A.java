package co;

import java.util.LinkedHashMap;
import mm.C17299b;
import sm.AbstractC19685a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: co.A */
/* JADX INFO: loaded from: classes2.dex */
public final class C11800A extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C17299b f35763Y;

    /* JADX INFO: renamed from: Z */
    public C11801B f35764Z;

    /* JADX INFO: renamed from: o0 */
    public LinkedHashMap f35765o0;

    /* JADX INFO: renamed from: p0 */
    public String f35766p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f35767q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C11801B f35768r0;

    /* JADX INFO: renamed from: s0 */
    public int f35769s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11800A(C11801B c11801b, AbstractC19685a abstractC19685a) {
        super(abstractC19685a);
        this.f35768r0 = c11801b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f35767q0 = obj;
        this.f35769s0 |= Integer.MIN_VALUE;
        return C11801B.m13063a(this.f35768r0, null, this);
    }
}
