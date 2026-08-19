package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.javax.sip.InterfaceC10811r;
import java.io.IOException;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
public class CongestionControlMessageValve implements SIPMessageValve {
    private static StackLogger logger = CommonLogger.getLogger(CongestionControlMessageValve.class);
    protected int dropResponseStatus;
    protected int serverTransactionTableHighwaterMark;
    protected SipStackImpl sipStack;

    @Override // android.gov.nist.javax.sip.stack.SIPMessageValve
    public void destroy() {
        logger.logInfo("Destorying the congestion control valve " + this);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPMessageValve
    public void init(InterfaceC10811r interfaceC10811r) {
        this.sipStack = (SipStackImpl) interfaceC10811r;
        logger.logInfo("Initializing congestion control valve");
        this.serverTransactionTableHighwaterMark = new Integer(this.sipStack.getConfigurationProperties().getProperty("android.gov.nist.javax.sip.MAX_SERVER_TRANSACTIONS", "10000")).intValue();
        this.dropResponseStatus = new Integer(this.sipStack.getConfigurationProperties().getProperty("DROP_RESPONSE_STATUS", "503")).intValue();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPMessageValve
    public boolean processRequest(SIPRequest sIPRequest, MessageChannel messageChannel) {
        String method = sIPRequest.getMethod();
        if (method.equals(TokenNames.BYE) || method.equals(TokenNames.ACK) || method.equals("PRACK") || method.equals("CANCEL") || this.serverTransactionTableHighwaterMark > this.sipStack.getServerTransactionTableSize() || sIPRequest.getToTag() != null) {
            return true;
        }
        int i10 = this.dropResponseStatus;
        if (i10 <= 0) {
            return false;
        }
        SIPResponse sIPResponseCreateResponse = sIPRequest.createResponse(i10);
        try {
            messageChannel.sendMessage(sIPResponseCreateResponse);
            return false;
        } catch (IOException e10) {
            logger.logError("Failed to send congestion control error response" + sIPResponseCreateResponse, e10);
            return false;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPMessageValve
    public boolean processResponse(InterfaceC13462c interfaceC13462c, MessageChannel messageChannel) {
        return true;
    }
}
