package p601Yh;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p556Wk.C8920e;

/* JADX INFO: renamed from: Yh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C10062a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C10062a f29802Y = new C10062a(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int i10;
        Throwable it = (Throwable) obj;
        AbstractC16544l.m18094g(it, "it");
        boolean z6 = false;
        if (!(it instanceof CancellationException) && (!(it instanceof C8920e) || 400 > (i10 = ((C8920e) it).f27285Y.mo7307f().f51013Y) || i10 >= 500)) {
            z6 = true;
        }
        return Boolean.valueOf(z6);
    }
}
