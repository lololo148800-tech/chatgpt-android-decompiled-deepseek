package p288Lb;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p214Ib.AbstractC3656B;
import p214Ib.C3679v;
import p379Pb.C6381b;
import p379Pb.C6382c;

/* JADX INFO: renamed from: Lb.w */
/* JADX INFO: loaded from: classes.dex */
public final class C4990w extends AbstractC3656B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16268a;

    public /* synthetic */ C4990w(int i10) {
        this.f16268a = i10;
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: a */
    public final Object mo4358a(C6381b c6381b) {
        switch (this.f16268a) {
            case 0:
                return new AtomicBoolean(c6381b.mo5619S0());
            default:
                try {
                    return new AtomicInteger(c6381b.mo5630g0());
                } catch (NumberFormatException e10) {
                    throw new C3679v(e10);
                }
        }
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: b */
    public final void mo4359b(C6382c c6382c, Object obj) throws IOException {
        switch (this.f16268a) {
            case 0:
                c6382c.m7011N0(((AtomicBoolean) obj).get());
                break;
            default:
                c6382c.m7007C0(((AtomicInteger) obj).get());
                break;
        }
    }
}
