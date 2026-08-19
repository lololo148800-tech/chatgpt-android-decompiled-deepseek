package android.javax.sip;

import android.gov.nist.javax.sip.SipProviderImpl;
import java.util.EventObject;

/* JADX INFO: renamed from: android.javax.sip.t */
/* JADX INFO: loaded from: classes.dex */
public final class C10813t extends EventObject {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC10806m f32043Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC10794a f32044Z;

    public C10813t(SipProviderImpl sipProviderImpl, InterfaceC10806m interfaceC10806m) {
        super(sipProviderImpl);
        this.f32043Y = interfaceC10806m;
    }

    public C10813t(SipProviderImpl sipProviderImpl, InterfaceC10794a interfaceC10794a) {
        super(sipProviderImpl);
        this.f32044Z = interfaceC10794a;
    }
}
