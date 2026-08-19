package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
public class FrameCryptor {
    private long nativeFrameCryptor;
    private long observerPtr = 0;

    public enum FrameCryptionState {
        NEW,
        OK,
        ENCRYPTIONFAILED,
        DECRYPTIONFAILED,
        MISSINGKEY,
        KEYRATCHETED,
        INTERNALERROR;

        public static FrameCryptionState fromNativeIndex(int i10) {
            return values()[i10];
        }
    }

    public interface Observer {
        void onFrameCryptionStateChanged(String str, FrameCryptionState frameCryptionState);
    }

    public FrameCryptor(long j10) {
        this.nativeFrameCryptor = j10;
    }

    private void checkFrameCryptorExists() {
        if (this.nativeFrameCryptor == 0) {
            throw new IllegalStateException("FrameCryptor has been disposed.");
        }
    }

    private static native int nativeGetKeyIndex(long j10);

    private static native boolean nativeIsEnabled(long j10);

    private static native void nativeSetEnabled(long j10, boolean z6);

    private static native void nativeSetKeyIndex(long j10, int i10);

    private static native long nativeSetObserver(long j10, Observer observer);

    private static native void nativeUnSetObserver(long j10);

    public void dispose() {
        checkFrameCryptorExists();
        nativeUnSetObserver(this.nativeFrameCryptor);
        JniCommon.nativeReleaseRef(this.nativeFrameCryptor);
        this.nativeFrameCryptor = 0L;
        long j10 = this.observerPtr;
        if (j10 != 0) {
            JniCommon.nativeReleaseRef(j10);
            this.observerPtr = 0L;
        }
    }

    public int getKeyIndex() {
        checkFrameCryptorExists();
        return nativeGetKeyIndex(this.nativeFrameCryptor);
    }

    public long getNativeFrameCryptor() {
        return this.nativeFrameCryptor;
    }

    public boolean isEnabled() {
        checkFrameCryptorExists();
        return nativeIsEnabled(this.nativeFrameCryptor);
    }

    public void setEnabled(boolean z6) {
        checkFrameCryptorExists();
        nativeSetEnabled(this.nativeFrameCryptor, z6);
    }

    public void setKeyIndex(int i10) {
        checkFrameCryptorExists();
        nativeSetKeyIndex(this.nativeFrameCryptor, i10);
    }

    public void setObserver(Observer observer) {
        checkFrameCryptorExists();
        nativeSetObserver(this.nativeFrameCryptor, observer);
        long j10 = this.observerPtr;
        if (j10 != 0) {
            JniCommon.nativeReleaseRef(j10);
            this.observerPtr = 0L;
        }
    }
}
