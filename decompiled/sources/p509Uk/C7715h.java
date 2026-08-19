package p509Uk;

import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import mm.C17311n;
import p025An.AbstractC0575H;
import p026Ao.InterfaceC0677k;
import p049Bm.InterfaceC1436k;
import p556Wk.AbstractC8910Y;
import p571X9.AbstractC9233X;
import p754fl.C13694d;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Uk.h */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7715h implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16558z f24311Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC0677k f24312Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13694d f24313o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC18776i f24314p0;

    public /* synthetic */ C7715h(C16558z c16558z, InterfaceC0677k interfaceC0677k, C13694d c13694d, InterfaceC18776i interfaceC18776i) {
        this.f24311Y = c16558z;
        this.f24312Z = interfaceC0677k;
        this.f24313o0 = c13694d;
        this.f24314p0 = interfaceC18776i;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Object objM9806b;
        InterfaceC0677k interfaceC0677k = this.f24312Z;
        try {
            this.f24311Y.f51287Y = interfaceC0677k.read((ByteBuffer) obj);
            return C17296C.f55119a;
        } catch (Throwable th2) {
            th = th2;
            try {
                objM9806b = AbstractC0575H.m1192u(this.f24314p0).mo1273T();
            } catch (Throwable th3) {
                objM9806b = AbstractC9233X.m9806b(th3);
            }
            if (objM9806b instanceof C17311n) {
                objM9806b = null;
            }
            CancellationException cancellationException = (CancellationException) objM9806b;
            if (cancellationException != null) {
                th = cancellationException;
            }
            if (th instanceof SocketTimeoutException) {
                throw AbstractC8910Y.m9564a(this.f24313o0, th);
            }
            throw th;
        }
    }
}
