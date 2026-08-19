package p520V5;

import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import p003A1.C0284r0;
import p779h6.AbstractC14413b;
import p779h6.AbstractC14418g;

/* JADX INFO: renamed from: V5.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7775d implements InterfaceC7797z {
    @Override // p520V5.InterfaceC7797z
    public final void onResult(Object obj) {
        Throwable th2 = (Throwable) obj;
        C7775d c7775d = LottieAnimationView.f35927E0;
        C0284r0 c0284r0 = AbstractC14418g.f45308a;
        if (!(th2 instanceof SocketException) && !(th2 instanceof ClosedChannelException) && !(th2 instanceof InterruptedIOException) && !(th2 instanceof ProtocolException) && !(th2 instanceof SSLException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        AbstractC14413b.m15914c("Unable to load composition.", th2);
    }
}
