package p670c1;

import p077Cn.C1736d;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: c1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11559c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ViewOnAttachStateChangeListenerC11560d f34933Y;

    /* JADX INFO: renamed from: Z */
    public C1736d f34934Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f34935o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC11560d f34936p0;

    /* JADX INFO: renamed from: q0 */
    public int f34937q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11559c(ViewOnAttachStateChangeListenerC11560d viewOnAttachStateChangeListenerC11560d, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f34936p0 = viewOnAttachStateChangeListenerC11560d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f34935o0 = obj;
        this.f34937q0 |= Integer.MIN_VALUE;
        return this.f34936p0.m12955a(this);
    }
}
