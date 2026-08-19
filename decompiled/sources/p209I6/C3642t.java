package p209I6;

import java.util.Map;
import kotlin.jvm.internal.C16525B;
import p025An.InterfaceC0571F;
import p235J6.InterfaceC4269f;
import p477Tb.C7296c;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: I6.t */
/* JADX INFO: loaded from: classes.dex */
public final class C3642t extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3645w f11099Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC0571F f11100Z;

    /* JADX INFO: renamed from: o0 */
    public C16525B f11101o0;

    /* JADX INFO: renamed from: p0 */
    public C16525B f11102p0;

    /* JADX INFO: renamed from: q0 */
    public C16525B f11103q0;

    /* JADX INFO: renamed from: r0 */
    public Map f11104r0;

    /* JADX INFO: renamed from: s0 */
    public InterfaceC4269f f11105s0;

    /* JADX INFO: renamed from: t0 */
    public C7296c f11106t0;

    /* JADX INFO: renamed from: u0 */
    public long f11107u0;

    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ Object f11108v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ C3645w f11109w0;

    /* JADX INFO: renamed from: x0 */
    public int f11110x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3642t(C3645w c3645w, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f11109w0 = c3645w;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f11108v0 = obj;
        this.f11110x0 |= Integer.MIN_VALUE;
        return C3645w.m4354b(this.f11109w0, null, this);
    }
}
