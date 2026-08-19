package p995rl;

import io.ktor.utils.p815io.InterfaceC15066B;
import java.nio.charset.Charset;
import kotlinx.serialization.KSerializer;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: rl.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C19248h extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f61025Y;

    /* JADX INFO: renamed from: Z */
    public Object f61026Z;

    /* JADX INFO: renamed from: o0 */
    public KSerializer f61027o0;

    /* JADX INFO: renamed from: p0 */
    public Charset f61028p0;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC15066B f61029q0;

    /* JADX INFO: renamed from: r0 */
    public C19241a f61030r0;

    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ Object f61031s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C19249i f61032t0;

    /* JADX INFO: renamed from: u0 */
    public int f61033u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19248h(C19249i c19249i, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f61032t0 = c19249i;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f61031s0 = obj;
        this.f61033u0 |= Integer.MIN_VALUE;
        return C19249i.m20330a(this.f61032t0, null, null, null, null, this);
    }
}
