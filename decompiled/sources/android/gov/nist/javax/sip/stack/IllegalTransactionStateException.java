package android.gov.nist.javax.sip.stack;

import android.javax.sip.C10807n;

/* JADX INFO: loaded from: classes.dex */
public class IllegalTransactionStateException extends C10807n {
    Reason reason;

    public enum Reason {
        RequestAlreadySent,
        MissingRequiredHeader,
        UnmatchingCSeq,
        ExpiresHeaderMandatory,
        ContactHeaderMandatory,
        GenericReason
    }

    public IllegalTransactionStateException(Reason reason) {
        Reason reason2 = Reason.RequestAlreadySent;
        this.reason = reason;
    }

    public Reason getReason() {
        return this.reason;
    }

    public IllegalTransactionStateException(String str, Reason reason) {
        super(str);
        Reason reason2 = Reason.RequestAlreadySent;
        this.reason = reason;
    }

    public IllegalTransactionStateException(String str, Throwable th2, Reason reason) {
        super(str, th2);
        Reason reason2 = Reason.RequestAlreadySent;
        this.reason = reason;
    }
}
