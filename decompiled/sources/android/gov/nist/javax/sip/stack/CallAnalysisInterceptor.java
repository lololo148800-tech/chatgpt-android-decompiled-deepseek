package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.SipStackImpl;
import android.javax.sip.InterfaceC10811r;
import java.util.Properties;
import p735f.InterfaceC13460a;

/* JADX INFO: loaded from: classes.dex */
public class CallAnalysisInterceptor implements SIPEventInterceptor {
    private static final CallAnalyzer.MetricReference interceptorCheckpoint = new CallAnalyzer.MetricReference("ick");
    private CallAnalyzer callAnalyzer;

    @Override // android.gov.nist.javax.sip.stack.SIPEventInterceptor
    public void afterMessage(InterfaceC13460a interfaceC13460a) {
        this.callAnalyzer.leave(interceptorCheckpoint);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPEventInterceptor
    public void beforeMessage(InterfaceC13460a interfaceC13460a) {
        this.callAnalyzer.enter(interceptorCheckpoint);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPEventInterceptor
    public void destroy() {
        this.callAnalyzer.stop();
        this.callAnalyzer = null;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPEventInterceptor
    public void init(InterfaceC10811r interfaceC10811r) {
        SipStackImpl sipStackImpl = (SipStackImpl) interfaceC10811r;
        this.callAnalyzer = new CallAnalyzer(sipStackImpl);
        Properties configurationProperties = sipStackImpl.getConfigurationProperties();
        this.callAnalyzer.configure(interceptorCheckpoint, new CallAnalyzer.MetricAnalysisConfiguration(Long.valueOf(Long.parseLong(configurationProperties.getProperty(CallAnalysisInterceptor.class.getName().concat(".checkingInterval"), "1000"))), Long.valueOf(Long.parseLong(configurationProperties.getProperty(CallAnalysisInterceptor.class.getName().concat(".minTimeBetweenDumps"), "2000"))), Long.valueOf(Long.parseLong(configurationProperties.getProperty(CallAnalysisInterceptor.class.getName().concat(".minStuckTIme"), "4000")))));
    }
}
