package p1099x6;

import kotlin.jvm.internal.C16525B;
import p917o6.C17853f;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: x6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21133a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C21134b f67141Y;

    /* JADX INFO: renamed from: Z */
    public C17853f f67142Z;

    /* JADX INFO: renamed from: o0 */
    public C16525B f67143o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f67144p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C21134b f67145q0;

    /* JADX INFO: renamed from: r0 */
    public int f67146r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21133a(C21134b c21134b, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f67145q0 = c21134b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f67144p0 = obj;
        this.f67146r0 |= Integer.MIN_VALUE;
        return this.f67145q0.mo395a(null, this);
    }
}
