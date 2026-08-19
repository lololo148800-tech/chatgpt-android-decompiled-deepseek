package gl;

import io.ktor.utils.p815io.InterfaceC15066B;
import java.util.Iterator;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: gl.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C14193e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f44590Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC15066B f44591Z;

    /* JADX INFO: renamed from: o0 */
    public Iterator f44592o0;

    /* JADX INFO: renamed from: p0 */
    public Object f44593p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f44594q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C14194f f44595r0;

    /* JADX INFO: renamed from: s0 */
    public int f44596s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14193e(C14194f c14194f, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f44595r0 = c14194f;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f44594q0 = obj;
        this.f44596s0 |= Integer.MIN_VALUE;
        return this.f44595r0.mo15508e(null, this);
    }
}
