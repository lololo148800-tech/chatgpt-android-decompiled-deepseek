package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
public final class CryptoOptions {
    private final SFrame sframe;
    private final Srtp srtp;

    public static class Builder {
        private boolean enableAes128Sha1_32CryptoCipher;
        private boolean enableEncryptedRtpHeaderExtensions;
        private boolean enableGcmCryptoSuites;
        private boolean requireFrameEncryption;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        public CryptoOptions createCryptoOptions() {
            return new CryptoOptions(0, this.enableGcmCryptoSuites, this.enableAes128Sha1_32CryptoCipher, this.enableEncryptedRtpHeaderExtensions, this.requireFrameEncryption);
        }

        public Builder setEnableAes128Sha1_32CryptoCipher(boolean z6) {
            this.enableAes128Sha1_32CryptoCipher = z6;
            return this;
        }

        public Builder setEnableEncryptedRtpHeaderExtensions(boolean z6) {
            this.enableEncryptedRtpHeaderExtensions = z6;
            return this;
        }

        public Builder setEnableGcmCryptoSuites(boolean z6) {
            this.enableGcmCryptoSuites = z6;
            return this;
        }

        public Builder setRequireFrameEncryption(boolean z6) {
            this.requireFrameEncryption = z6;
            return this;
        }

        private Builder() {
        }
    }

    public final class SFrame {
        private final boolean requireFrameEncryption;

        public /* synthetic */ SFrame(CryptoOptions cryptoOptions, boolean z6, int i10) {
            this(z6);
        }

        public boolean getRequireFrameEncryption() {
            return this.requireFrameEncryption;
        }

        private SFrame(boolean z6) {
            this.requireFrameEncryption = z6;
        }
    }

    public final class Srtp {
        private final boolean enableAes128Sha1_32CryptoCipher;
        private final boolean enableEncryptedRtpHeaderExtensions;
        private final boolean enableGcmCryptoSuites;

        public /* synthetic */ Srtp(CryptoOptions cryptoOptions, boolean z6, boolean z10, boolean z11, int i10) {
            this(z6, z10, z11);
        }

        public boolean getEnableAes128Sha1_32CryptoCipher() {
            return this.enableAes128Sha1_32CryptoCipher;
        }

        public boolean getEnableEncryptedRtpHeaderExtensions() {
            return this.enableEncryptedRtpHeaderExtensions;
        }

        public boolean getEnableGcmCryptoSuites() {
            return this.enableGcmCryptoSuites;
        }

        private Srtp(boolean z6, boolean z10, boolean z11) {
            this.enableGcmCryptoSuites = z6;
            this.enableAes128Sha1_32CryptoCipher = z10;
            this.enableEncryptedRtpHeaderExtensions = z11;
        }
    }

    public /* synthetic */ CryptoOptions(int i10, boolean z6, boolean z10, boolean z11, boolean z12) {
        this(z6, z10, z11, z12);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public SFrame getSFrame() {
        return this.sframe;
    }

    public Srtp getSrtp() {
        return this.srtp;
    }

    private CryptoOptions(boolean z6, boolean z10, boolean z11, boolean z12) {
        this.srtp = new Srtp(this, z6, z10, z11, 0);
        this.sframe = new SFrame(this, z12, 0);
    }
}
