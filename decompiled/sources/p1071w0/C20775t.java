package p1071w0;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p080D0.C1821o0;
import p080D0.InterfaceC1815l0;

/* JADX INFO: renamed from: w0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C20775t extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65979Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1815l0 f65980Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20775t(InterfaceC1815l0 interfaceC1815l0, int i10) {
        super(0);
        this.f65979Y = i10;
        this.f65980Z = interfaceC1815l0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f65979Y) {
            case 0:
                AtomicLong atomicLong = ((C1821o0) this.f65980Z).f5245d;
                long andIncrement = atomicLong.getAndIncrement();
                while (andIncrement == 0) {
                    andIncrement = atomicLong.getAndIncrement();
                }
                return Long.valueOf(andIncrement);
            default:
                AtomicLong atomicLong2 = ((C1821o0) this.f65980Z).f5245d;
                long andIncrement2 = atomicLong2.getAndIncrement();
                while (andIncrement2 == 0) {
                    andIncrement2 = atomicLong2.getAndIncrement();
                }
                return Long.valueOf(andIncrement2);
        }
    }
}
