package android.javax.sip;

import java.util.EventListener;

/* JADX INFO: renamed from: android.javax.sip.p */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC10809p extends EventListener {
    void processDialogTerminated(C10798e c10798e);

    void processIOException(C10799f c10799f);

    void processRequest(AbstractC10804k abstractC10804k);

    void processResponse(AbstractC10805l abstractC10805l);

    void processTimeout(C10813t c10813t);

    void processTransactionTerminated(C10816w c10816w);
}
