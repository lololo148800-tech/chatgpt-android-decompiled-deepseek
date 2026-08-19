package p351O2;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: O2.q */
/* JADX INFO: loaded from: classes.dex */
public final class C6103q extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C6103q f19848Y = new C6103q(2);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC6101o msg = (AbstractC6101o) obj;
        Throwable cancellationException = (Throwable) obj2;
        AbstractC16544l.m18094g(msg, "msg");
        if (msg instanceof C6100n) {
            C6100n c6100n = (C6100n) msg;
            if (cancellationException == null) {
                cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            c6100n.f19844b.m1281g0(cancellationException);
        }
        return C17296C.f55119a;
    }
}
