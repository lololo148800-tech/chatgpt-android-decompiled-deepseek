package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.address.ParameterNames;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Iterator;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLServerSocket;
import p037B9.MeDP.MpoABj;

/* JADX INFO: loaded from: classes.dex */
public class TLSMessageProcessor extends ConnectionOrientedMessageProcessor implements Runnable {
    private static StackLogger logger = CommonLogger.getLogger(TLSMessageProcessor.class);

    public TLSMessageProcessor(InetAddress inetAddress, SIPTransactionStack sIPTransactionStack, int i10) {
        super(inetAddress, i10, ParameterNames.TLS, sIPTransactionStack);
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public synchronized MessageChannel createMessageChannel(HostPort hostPort) {
        String key = MessageChannel.getKey(hostPort, "TLS");
        if (this.messageChannels.get(key) != null) {
            return (TLSMessageChannel) this.messageChannels.get(key);
        }
        TLSMessageChannel tLSMessageChannel = new TLSMessageChannel(hostPort.getInetAddress(), hostPort.getPort(), this.sipStack, this);
        this.messageChannels.put(key, tLSMessageChannel);
        tLSMessageChannel.isCached = true;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("key " + key);
            logger.logDebug("Creating " + tLSMessageChannel);
        }
        return tLSMessageChannel;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public int getDefaultTargetPort() {
        return SIPConstants.DEFAULT_TLS_PORT;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public boolean isSecure() {
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.isRunning) {
            Socket socketAccept = null;
            try {
                synchronized (this) {
                    while (true) {
                        try {
                            int i10 = this.sipStack.maxConnections;
                            if (i10 == -1 || this.nConnections < i10) {
                                break;
                            }
                            try {
                                wait();
                                if (!this.isRunning) {
                                    return;
                                }
                            } catch (InterruptedException unused) {
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    this.nConnections++;
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug(" waiting to accept new connection!");
                }
                socketAccept = this.sock.accept();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Accepting new connection!");
                }
            } catch (SocketException e10) {
                if (this.isRunning) {
                    logger.logError("Fatal - SocketException occured while Accepting connection", e10);
                    this.isRunning = false;
                    return;
                }
            } catch (SSLException e11) {
                this.isRunning = false;
                logger.logError("Fatal - SSSLException occured while Accepting connection", e11);
                return;
            } catch (IOException e12) {
                logger.logError("Problem Accepting Connection", e12);
            } catch (Exception e13) {
                logger.logError("Unexpected Exception!", e13);
            }
            if (this.isRunning) {
                try {
                    TLSMessageChannel tLSMessageChannel = new TLSMessageChannel(socketAccept, this.sipStack, this, "TLSMessageChannelThread-" + this.nConnections);
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug(Thread.currentThread() + " adding incoming channel " + tLSMessageChannel.getKey());
                    }
                    if (tLSMessageChannel.isHandshakeCompleted()) {
                        this.incomingMessageChannels.put(tLSMessageChannel.getKey(), tLSMessageChannel);
                    }
                } catch (Exception e14) {
                    logger.logError("A problem occured while Accepting connection", e14);
                }
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public void start() {
        Thread thread = new Thread(this);
        thread.setName("MessageProcessorThread-TLS-" + getIpAddress().getHostAddress() + '/' + getPort());
        thread.setPriority(this.sipStack.getThreadPriority());
        thread.setDaemon(true);
        this.sock = this.sipStack.getNetworkLayer().createSSLServerSocket(getPort(), 0, getIpAddress());
        ClientAuthType clientAuth = this.sipStack.getClientAuth();
        ClientAuthType clientAuthType = ClientAuthType.Want;
        if (clientAuth == clientAuthType || this.sipStack.getClientAuth() == ClientAuthType.Default) {
            ((SSLServerSocket) this.sock).setWantClientAuth(true);
        } else {
            ((SSLServerSocket) this.sock).setWantClientAuth(false);
        }
        if (this.sipStack.getClientAuth() == ClientAuthType.Enabled) {
            ((SSLServerSocket) this.sock).setNeedClientAuth(true);
        } else {
            ((SSLServerSocket) this.sock).setNeedClientAuth(false);
        }
        ((SSLServerSocket) this.sock).setUseClientMode(false);
        String[] enabledCipherSuites = ((SipStackImpl) this.sipStack).getEnabledCipherSuites();
        ((SSLServerSocket) this.sock).setEnabledProtocols(((SipStackImpl) this.sipStack).getEnabledProtocols());
        ((SSLServerSocket) this.sock).setEnabledCipherSuites(enabledCipherSuites);
        if (this.sipStack.getClientAuth() == clientAuthType || this.sipStack.getClientAuth() == ClientAuthType.Default) {
            ((SSLServerSocket) this.sock).setWantClientAuth(true);
        } else {
            ((SSLServerSocket) this.sock).setWantClientAuth(false);
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("SSLServerSocket want client auth " + ((SSLServerSocket) this.sock).getWantClientAuth());
            logger.logDebug("SSLServerSocket need client auth " + ((SSLServerSocket) this.sock).getNeedClientAuth());
        }
        this.isRunning = true;
        thread.start();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public synchronized void stop() {
        if (this.isRunning) {
            this.isRunning = false;
            try {
                this.sock.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            Iterator<ConnectionOrientedMessageChannel> it = this.messageChannels.values().iterator();
            while (it.hasNext()) {
                ((TLSMessageChannel) it.next()).close();
            }
            Iterator<ConnectionOrientedMessageChannel> it2 = this.incomingMessageChannels.values().iterator();
            while (it2.hasNext()) {
                ((TLSMessageChannel) it2.next()).close();
            }
            notify();
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public synchronized MessageChannel createMessageChannel(InetAddress inetAddress, int i10) {
        try {
            String key = MessageChannel.getKey(inetAddress, i10, MpoABj.NMEyKnbQ);
            if (this.messageChannels.get(key) != null) {
                return (TLSMessageChannel) this.messageChannels.get(key);
            }
            TLSMessageChannel tLSMessageChannel = new TLSMessageChannel(inetAddress, i10, this.sipStack, this);
            this.messageChannels.put(key, tLSMessageChannel);
            tLSMessageChannel.isCached = true;
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("key " + key);
                logger.logDebug("Creating " + tLSMessageChannel);
            }
            return tLSMessageChannel;
        } catch (UnknownHostException e10) {
            throw new IOException(e10.getMessage());
        }
    }
}
