package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.Map;
import p379Pb.LVf.efyhmdM;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConnectionOrientedMessageProcessor extends MessageProcessor {
    private static StackLogger logger = CommonLogger.getLogger(ConnectionOrientedMessageProcessor.class);
    protected final Map<String, ConnectionOrientedMessageChannel> incomingMessageChannels;
    protected boolean isRunning;
    protected final Map<String, ConnectionOrientedMessageChannel> messageChannels;
    protected int nConnections;
    protected ServerSocket sock;
    protected int useCount;

    public ConnectionOrientedMessageProcessor(InetAddress inetAddress, int i10, String str, SIPTransactionStack sIPTransactionStack) {
        super(inetAddress, i10, str, sIPTransactionStack);
        this.sipStack = sIPTransactionStack;
        this.messageChannels = new ConcurrentHashMap();
        this.incomingMessageChannels = new ConcurrentHashMap();
    }

    public synchronized void cacheMessageChannel(ConnectionOrientedMessageChannel connectionOrientedMessageChannel) {
        try {
            String key = connectionOrientedMessageChannel.getKey();
            ConnectionOrientedMessageChannel connectionOrientedMessageChannel2 = this.messageChannels.get(key);
            if (connectionOrientedMessageChannel2 != null) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Closing " + key);
                }
                connectionOrientedMessageChannel2.close();
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Caching " + key);
            }
            this.messageChannels.put(key, connectionOrientedMessageChannel);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean closeReliableConnection(String str, int i10) {
        validatePortInRange(i10);
        HostPort hostPort = new HostPort();
        hostPort.setHost(new Host(str));
        hostPort.setPort(i10);
        String key = MessageChannel.getKey(hostPort, "TCP");
        synchronized (this) {
            try {
                ConnectionOrientedMessageChannel connectionOrientedMessageChannel = this.messageChannels.get(key);
                if (connectionOrientedMessageChannel != null) {
                    connectionOrientedMessageChannel.close();
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug(Thread.currentThread() + " Removing channel " + key + " for processor " + getIpAddress() + ":" + getPort() + Separators.SLASH + getTransport());
                    }
                    this.incomingMessageChannels.remove(key);
                    this.messageChannels.remove(key);
                    return true;
                }
                ConnectionOrientedMessageChannel connectionOrientedMessageChannel2 = this.incomingMessageChannels.get(key);
                if (connectionOrientedMessageChannel2 == null) {
                    return false;
                }
                connectionOrientedMessageChannel2.close();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug(Thread.currentThread() + " Removing incoming channel " + key + " for processor " + getIpAddress() + ":" + getPort() + Separators.SLASH + getTransport());
                }
                this.incomingMessageChannels.remove(key);
                this.messageChannels.remove(key);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public int getMaximumMessageSize() {
        return Integer.MAX_VALUE;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public SIPTransactionStack getSIPStack() {
        return this.sipStack;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public boolean inUse() {
        return this.useCount != 0;
    }

    public synchronized void remove(ConnectionOrientedMessageChannel connectionOrientedMessageChannel) {
        try {
            String key = connectionOrientedMessageChannel.getKey();
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug(Thread.currentThread() + " removing " + key + " for processor " + getIpAddress() + ":" + getPort() + Separators.SLASH + getTransport());
            }
            if (this.messageChannels.get(key) == connectionOrientedMessageChannel) {
                this.messageChannels.remove(key);
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug(Thread.currentThread() + " Removing incoming channel " + key + " for processor " + getIpAddress() + ":" + getPort() + Separators.SLASH + getTransport());
            }
            this.incomingMessageChannels.remove(key);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void validatePortInRange(int i10) {
        if (i10 < 1 || i10 > 65535) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Peer port should be greater than 0 and less 65535, port = "));
        }
    }

    public boolean setKeepAliveTimeout(String str, int i10, long j10) {
        validatePortInRange(i10);
        HostPort hostPort = new HostPort();
        hostPort.setHost(new Host(str));
        hostPort.setPort(i10);
        String key = MessageChannel.getKey(hostPort, "TCP");
        ConnectionOrientedMessageChannel connectionOrientedMessageChannel = this.messageChannels.get(key);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug(Thread.currentThread() + efyhmdM.PUzFogpQRBWb + key + " : " + connectionOrientedMessageChannel + " for processor " + getIpAddress() + ":" + getPort() + Separators.SLASH + getTransport());
        }
        if (connectionOrientedMessageChannel != null) {
            connectionOrientedMessageChannel.setKeepAliveTimeout(j10);
            return true;
        }
        ConnectionOrientedMessageChannel connectionOrientedMessageChannel2 = this.incomingMessageChannels.get(key);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug(Thread.currentThread() + " checking incoming channel with key " + key + " : " + connectionOrientedMessageChannel2 + " for processor " + getIpAddress() + ":" + getPort() + Separators.SLASH + getTransport());
        }
        if (connectionOrientedMessageChannel2 != null) {
            connectionOrientedMessageChannel2.setKeepAliveTimeout(j10);
            return true;
        }
        return false;
    }
}
