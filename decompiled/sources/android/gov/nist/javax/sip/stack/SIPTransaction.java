package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.ReleaseReferencesStrategy;
import android.gov.nist.javax.sip.SipProviderImpl;
import android.gov.nist.javax.sip.TransactionExt;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.javax.sip.C10815v;
import android.javax.sip.InterfaceC10795b;
import java.net.InetAddress;
import java.security.cert.Certificate;
import java.util.List;
import p735f.InterfaceC13461b;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
public interface SIPTransaction extends TransactionExt {
    public static final C10815v INITIAL_STATE = null;

    /* JADX INFO: renamed from: T1 */
    public static final int f32029T1 = 1;
    public static final int TIMER_A = 1;
    public static final int TIMER_B = 64;
    public static final int TIMER_F = 64;
    public static final int TIMER_H = 64;
    public static final int TIMER_J = 64;
    public static final C10815v TRYING_STATE = C10815v.f32047p0;
    public static final C10815v CALLING_STATE = C10815v.f32046o0;
    public static final C10815v PROCEEDING_STATE = C10815v.f32048q0;
    public static final C10815v COMPLETED_STATE = C10815v.f32049r0;
    public static final C10815v CONFIRMED_STATE = C10815v.f32050s0;
    public static final C10815v TERMINATED_STATE = C10815v.f32051t0;

    boolean acquireSem();

    void addEventListener(SIPTransactionEventListener sIPTransactionEventListener);

    void cancelMaxTxLifeTimeTimer();

    void cleanUp();

    void close();

    void disableRetransmissionTimer();

    void disableTimeoutTimer();

    boolean doesCancelMatchTransaction(SIPRequest sIPRequest);

    @Override // android.gov.nist.javax.sip.TransactionExt
    List<String> extractCertIdentities();

    void fireRetransmissionTimer();

    void fireTimeoutTimer();

    void fireTimer();

    @Override // android.gov.nist.javax.sip.TransactionExt
    Object getApplicationData();

    long getAuditTag();

    int getBaseTimerInterval();

    String getBranch();

    @Override // android.gov.nist.javax.sip.TransactionExt
    String getBranchId();

    long getCSeq();

    @Override // android.gov.nist.javax.sip.TransactionExt
    String getCipherSuite();

    @Override // android.gov.nist.javax.sip.TransactionExt
    InterfaceC10795b getDialog();

    String getForkId();

    @Override // android.gov.nist.javax.sip.TransactionExt
    String getHost();

    int getInternalState();

    String getKey();

    SIPResponse getLastResponse();

    @Override // android.gov.nist.javax.sip.TransactionExt
    Certificate[] getLocalCertificates();

    String getMergeId();

    MessageChannel getMessageChannel();

    MessageProcessor getMessageProcessor();

    String getMethod();

    SIPRequest getOriginalRequest();

    @Override // android.gov.nist.javax.sip.TransactionExt
    String getPeerAddress();

    @Override // android.gov.nist.javax.sip.TransactionExt
    Certificate[] getPeerCertificates();

    InetAddress getPeerPacketSourceAddress();

    int getPeerPacketSourcePort();

    @Override // android.gov.nist.javax.sip.TransactionExt
    int getPeerPort();

    String getPeerProtocol();

    @Override // android.gov.nist.javax.sip.TransactionExt
    int getPort();

    @Override // android.gov.nist.javax.sip.TransactionExt
    ReleaseReferencesStrategy getReleaseReferencesStrategy();

    @Override // android.gov.nist.javax.sip.TransactionExt
    InterfaceC13461b getRequest();

    InterfaceC13462c getResponse();

    @Override // android.gov.nist.javax.sip.TransactionExt
    int getRetransmitTimer();

    SIPTransactionStack getSIPStack();

    @Override // android.gov.nist.javax.sip.TransactionExt
    SipProviderImpl getSipProvider();

    @Override // android.gov.nist.javax.sip.TransactionExt
    C10815v getState();

    int getT2();

    int getT4();

    @Override // android.gov.nist.javax.sip.TransactionExt
    int getTimerD();

    int getTimerI();

    int getTimerK();

    @Override // android.gov.nist.javax.sip.TransactionExt
    int getTimerT2();

    @Override // android.gov.nist.javax.sip.TransactionExt
    int getTimerT4();

    String getTransactionId();

    @Override // android.gov.nist.javax.sip.TransactionExt
    String getTransport();

    Via getViaHeader();

    String getViaHost();

    int getViaPort();

    int hashCode();

    boolean isByeTransaction();

    boolean isCancelTransaction();

    boolean isDialogCreatingTransaction();

    boolean isInviteTransaction();

    boolean isMessagePartOfTransaction(SIPMessage sIPMessage);

    boolean isReliable();

    boolean isSecure();

    boolean isServerTransaction();

    boolean isTerminated();

    boolean isTransactionMapped();

    boolean passToListener();

    void raiseErrorEvent(int i10);

    void raiseIOExceptionEvent();

    void releaseSem();

    void removeEventListener(SIPTransactionEventListener sIPTransactionEventListener);

    void scheduleMaxTxLifeTimeTimer();

    void semRelease();

    void sendMessage(SIPMessage sIPMessage);

    @Override // android.gov.nist.javax.sip.TransactionExt
    void setApplicationData(Object obj);

    void setAuditTag(long j10);

    void setBranch(String str);

    void setCollectionTime(int i10);

    void setDialog(SIPDialog sIPDialog, String str);

    void setEncapsulatedChannel(MessageChannel messageChannel);

    void setForkId(String str);

    void setOriginalRequest(SIPRequest sIPRequest);

    void setPassToListener();

    @Override // android.gov.nist.javax.sip.TransactionExt
    void setReleaseReferencesStrategy(ReleaseReferencesStrategy releaseReferencesStrategy);

    @Override // android.gov.nist.javax.sip.TransactionExt
    void setRetransmitTimer(int i10);

    void setState(int i10);

    @Override // android.gov.nist.javax.sip.TransactionExt
    void setTimerD(int i10);

    @Override // android.gov.nist.javax.sip.TransactionExt
    void setTimerT2(int i10);

    @Override // android.gov.nist.javax.sip.TransactionExt
    void setTimerT4(int i10);

    void setTransactionMapped(boolean z6);

    void startTransactionTimer();

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ void terminate();

    boolean testAndSetTransactionTerminatedEvent();
}
