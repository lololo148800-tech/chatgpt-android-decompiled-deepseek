package android.gov.nist.javax.sip;

import android.gov.nist.core.net.AddressResolver;
import android.gov.nist.javax.sip.stack.HopImpl;
import android.gov.nist.javax.sip.stack.MessageProcessor;
import p691d.InterfaceC12943b;

/* JADX INFO: loaded from: classes.dex */
public class DefaultAddressResolver implements AddressResolver {
    @Override // android.gov.nist.core.net.AddressResolver
    public InterfaceC12943b resolveAddress(InterfaceC12943b interfaceC12943b) {
        return interfaceC12943b.getPort() != -1 ? interfaceC12943b : new HopImpl(interfaceC12943b.getHost(), MessageProcessor.getDefaultPort(interfaceC12943b.getTransport()), interfaceC12943b.getTransport());
    }
}
