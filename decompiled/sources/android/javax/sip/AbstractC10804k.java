package android.javax.sip;

import java.util.EventObject;
import p735f.InterfaceC13461b;

/* JADX INFO: renamed from: android.javax.sip.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10804k extends EventObject {
    private InterfaceC10795b m_dialog;
    private InterfaceC13461b m_request;
    private InterfaceC10806m m_transaction;

    public AbstractC10804k(Object obj, InterfaceC10806m interfaceC10806m, InterfaceC10795b interfaceC10795b, InterfaceC13461b interfaceC13461b) {
        super(obj);
        this.m_transaction = interfaceC10806m;
        this.m_request = interfaceC13461b;
        this.m_dialog = interfaceC10795b;
    }

    public InterfaceC10795b getDialog() {
        return this.m_dialog;
    }

    public InterfaceC13461b getRequest() {
        return this.m_request;
    }

    public InterfaceC10806m getServerTransaction() {
        return this.m_transaction;
    }
}
