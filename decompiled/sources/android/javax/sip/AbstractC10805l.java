package android.javax.sip;

import android.gov.nist.javax.sip.ClientTransactionExt;
import java.util.EventObject;
import p735f.InterfaceC13462c;

/* JADX INFO: renamed from: android.javax.sip.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10805l extends EventObject {
    private InterfaceC10795b m_dialog;
    private InterfaceC13462c m_response;
    private InterfaceC10794a m_transaction;

    public AbstractC10805l(Object obj, ClientTransactionExt clientTransactionExt, InterfaceC10795b interfaceC10795b, InterfaceC13462c interfaceC13462c) {
        super(obj);
        this.m_response = interfaceC13462c;
        this.m_transaction = clientTransactionExt;
        this.m_dialog = interfaceC10795b;
    }

    public InterfaceC10794a getClientTransaction() {
        return this.m_transaction;
    }

    public InterfaceC10795b getDialog() {
        return this.m_dialog;
    }

    public InterfaceC13462c getResponse() {
        return this.m_response;
    }
}
