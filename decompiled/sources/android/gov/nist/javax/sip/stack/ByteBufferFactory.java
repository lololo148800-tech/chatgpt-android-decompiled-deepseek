package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ByteBufferFactory {
    private boolean useDirect = true;
    private static StackLogger logger = CommonLogger.getLogger(ByteBufferFactory.class);
    private static ByteBufferFactory instance = new ByteBufferFactory();

    public static ByteBufferFactory getInstance() {
        return instance;
    }

    public ByteBuffer allocate(int i10) {
        if (logger.isLoggingEnabled(32)) {
            logger.logTrace("Allocating buffer " + i10);
        }
        return ByteBuffer.allocate(i10);
    }

    public ByteBuffer allocateDirect(int i10) {
        if (logger.isLoggingEnabled(32)) {
            logger.logTrace("Allocating direct buffer " + i10);
        }
        return this.useDirect ? ByteBuffer.allocateDirect(i10) : ByteBuffer.allocate(i10);
    }

    public void setUseDirect(boolean z6) {
        if (logger.isLoggingEnabled(32)) {
            logger.logTrace("Direct buffers are ".concat(z6 ? "enabled" : "disabled"));
        }
        this.useDirect = z6;
    }
}
