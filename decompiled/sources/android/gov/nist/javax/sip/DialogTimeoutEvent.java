package android.gov.nist.javax.sip;

import android.javax.sip.InterfaceC10794a;
import android.javax.sip.InterfaceC10795b;
import java.util.EventObject;

/* JADX INFO: loaded from: classes.dex */
public class DialogTimeoutEvent extends EventObject {
    private static final long serialVersionUID = -2514000059989311925L;
    private InterfaceC10795b m_dialog;
    private InterfaceC10794a m_reInviteTransaction;
    private Reason m_reason;

    public enum Reason {
        AckNotReceived,
        AckNotSent,
        ReInviteTimeout,
        EarlyStateTimeout,
        CannotAcquireAckSemaphoreForOk
    }

    public DialogTimeoutEvent(Object obj, InterfaceC10795b interfaceC10795b, Reason reason) {
        super(obj);
        this.m_reInviteTransaction = null;
        this.m_dialog = interfaceC10795b;
        this.m_reason = reason;
    }

    public InterfaceC10794a getClientTransaction() {
        return this.m_reInviteTransaction;
    }

    public InterfaceC10795b getDialog() {
        return this.m_dialog;
    }

    public Reason getReason() {
        return this.m_reason;
    }

    public void setClientTransaction(InterfaceC10794a interfaceC10794a) {
        this.m_reInviteTransaction = interfaceC10794a;
    }
}
