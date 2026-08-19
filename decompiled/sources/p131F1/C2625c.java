package p131F1;

import p492U1.C7544i;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: F1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2625c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ScrollCaptureCallbackC2628f f8119Y;

    /* JADX INFO: renamed from: Z */
    public Object f8120Z;

    /* JADX INFO: renamed from: o0 */
    public C7544i f8121o0;

    /* JADX INFO: renamed from: p0 */
    public int f8122p0;

    /* JADX INFO: renamed from: q0 */
    public int f8123q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f8124r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ ScrollCaptureCallbackC2628f f8125s0;

    /* JADX INFO: renamed from: t0 */
    public int f8126t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2625c(ScrollCaptureCallbackC2628f scrollCaptureCallbackC2628f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f8125s0 = scrollCaptureCallbackC2628f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f8124r0 = obj;
        this.f8126t0 |= Integer.MIN_VALUE;
        return ScrollCaptureCallbackC2628f.m3620a(this.f8125s0, null, null, this);
    }
}
