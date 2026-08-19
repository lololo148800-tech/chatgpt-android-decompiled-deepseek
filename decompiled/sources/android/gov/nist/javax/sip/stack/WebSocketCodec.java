package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p926of.yRae.sVDIzpC;

/* JADX INFO: loaded from: classes.dex */
public class WebSocketCodec {
    private static final byte OPCODE_BINARY = 2;
    private static final byte OPCODE_CLOSE = 8;
    private static final byte OPCODE_CONT = 0;
    private static final byte OPCODE_PING = 9;
    private static final byte OPCODE_PONG = 10;
    private final boolean allowExtensions;
    private boolean closeOpcodeReceived;
    private int fragmentedFramesCount;
    private boolean frameFinalFlag;
    private int frameOpcode;
    private long framePayloadLength;
    private int frameRsv;
    private final boolean maskedPayload;
    private int readIndex;
    private static StackLogger logger = CommonLogger.getLogger(WebSocketCodec.class);
    private static final byte OPCODE_TEXT = 1;
    private static final byte[] trivialMask = {OPCODE_TEXT, OPCODE_TEXT, OPCODE_TEXT, OPCODE_TEXT};
    private byte[] maskingKey = new byte[4];
    private int payloadStartIndex = -1;
    private byte[] decodeBuffer = new byte[2048];
    private int writeIndex = 0;
    private long totalPacketLength = -1;

    public WebSocketCodec(boolean z6, boolean z10) {
        this.maskedPayload = z6;
        this.allowExtensions = z10;
    }

    public static void applyMask(byte[] bArr, int i10, int i11, byte[] bArr2) {
        for (int i12 = 0; i12 < i11 - i10; i12++) {
            int i13 = i10 + i12;
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i12 % 4]);
        }
    }

    public static byte[] encode(byte[] bArr, int i10, boolean z6, boolean z10) {
        return encode(bArr, i10, z6, z10, OPCODE_TEXT);
    }

    private void protocolChecks() {
        int i10;
        int i11 = this.frameOpcode;
        if (i11 > 7) {
            if (!this.frameFinalFlag) {
                protocolViolation("fragmented control frame");
            }
            int i12 = this.frameOpcode;
            if (i12 == 8 || i12 == 9 || i12 == 10) {
                return;
            }
            protocolViolation("control frame using reserved opcode " + this.frameOpcode);
            return;
        }
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            protocolViolation("data frame using reserved opcode " + this.frameOpcode);
        }
        if (this.fragmentedFramesCount == 0 && this.frameOpcode == 0) {
            protocolViolation("received continuation data frame outside fragmented message");
        }
        if (this.fragmentedFramesCount == 0 || (i10 = this.frameOpcode) == 0 || i10 == 9) {
            return;
        }
        protocolViolation("received non-continuation data frame while inside fragmented message");
    }

    private void protocolViolation(String str) {
        throw new RuntimeException(str);
    }

    private byte readNextByte() {
        int i10 = this.readIndex;
        if (i10 >= this.writeIndex) {
            throw new IllegalStateException();
        }
        byte[] bArr = this.decodeBuffer;
        this.readIndex = i10 + 1;
        return bArr[i10];
    }

    private void unmask(byte[] bArr, int i10, int i11) {
        applyMask(bArr, i10, i11, this.maskingKey);
    }

    public boolean isCloseOpcodeReceived() {
        return this.closeOpcodeReceived;
    }

    public static byte[] encode(byte[] bArr, int i10, boolean z6, boolean z10, byte b) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long length = bArr.length;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Encoding WebSocket Frame opCode=" + ((int) b) + " length=" + length);
        }
        int i11 = ((i10 % 8) << 4) | (z6 ? 128 : 0) | (b % 128);
        if (length <= 125) {
            byteArrayOutputStream.write(i11);
            int i12 = (byte) length;
            if (z10) {
                i12 |= 128;
            }
            byteArrayOutputStream.write((byte) i12);
        } else if (length <= 65535) {
            byteArrayOutputStream.write(i11);
            byteArrayOutputStream.write(z10 ? 254 : 126);
            byteArrayOutputStream.write((byte) (length >>> 8));
            byteArrayOutputStream.write((byte) length);
        } else {
            byteArrayOutputStream.write(i11);
            byteArrayOutputStream.write(z10 ? 255 : 127);
            for (int i13 = 0; i13 < 8; i13++) {
                byteArrayOutputStream.write((byte) (length >>> ((7 - i13) * 8)));
            }
        }
        if (z10) {
            byte[] bArr2 = trivialMask;
            byteArrayOutputStream.write(bArr2);
            applyMask(bArr, 0, bArr.length, bArr2);
        }
        byteArrayOutputStream.write(bArr);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] decode(InputStream inputStream) throws IOException {
        int i10;
        long j10;
        do {
            int length = this.decodeBuffer.length - this.writeIndex;
            int iAvailable = inputStream.available();
            if (iAvailable > length - 1) {
                int iMax = Math.max(this.decodeBuffer.length * 2, iAvailable * 4);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Increasing buffer size from " + this.decodeBuffer.length + " avail " + iAvailable + " newSize " + iMax);
                }
                byte[] bArr = new byte[iMax];
                System.arraycopy(this.decodeBuffer, 0, bArr, 0, this.writeIndex);
                this.decodeBuffer = bArr;
            }
            int i11 = inputStream.read(this.decodeBuffer, this.writeIndex, length);
            if (i11 < 0) {
                i11 = 0;
            }
            this.writeIndex += i11;
        } while (inputStream.available() > 0);
        this.readIndex = 0;
        if (this.writeIndex < 4) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Abort decode. Write index is at " + this.writeIndex);
            }
            return null;
        }
        byte nextByte = readNextByte();
        int i12 = 1;
        this.frameFinalFlag = (nextByte & 128) != 0;
        this.frameRsv = (nextByte & 112) >> 4;
        this.frameOpcode = nextByte & 15;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Decoding WebSocket Frame opCode=" + this.frameOpcode);
        }
        if (this.frameOpcode == 8) {
            this.closeOpcodeReceived = true;
        }
        byte nextByte2 = readNextByte();
        boolean z6 = (nextByte2 & 128) != 0;
        int i13 = nextByte2 & 127;
        if (this.frameRsv != 0 && !this.allowExtensions) {
            protocolViolation("RSV != 0 and no extension negotiated, RSV:" + this.frameRsv);
            return null;
        }
        if (this.maskedPayload && !z6) {
            protocolViolation("unmasked client to server frame");
            return null;
        }
        protocolChecks();
        try {
            if (i13 == 126) {
                this.framePayloadLength = ((readNextByte() & 255) << 8) | (readNextByte() & 255);
            } else if (i13 == 127) {
                long nextByte3 = 0;
                for (int i14 = 0; i14 < 8; i14++) {
                    nextByte3 |= ((long) (readNextByte() & 255)) << ((7 - i14) * 8);
                }
                this.framePayloadLength = nextByte3;
                if (nextByte3 < 65536) {
                    protocolViolation("invalid data frame length (not using minimal length encoding): " + this.framePayloadLength);
                    return null;
                }
            } else {
                this.framePayloadLength = i13;
            }
            if (this.framePayloadLength < 0) {
                protocolViolation("Negative payload size: " + this.framePayloadLength);
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Decoding WebSocket Frame length=" + this.framePayloadLength);
            }
            if (z6) {
                for (int i15 = 0; i15 < 4; i15++) {
                    this.maskingKey[i15] = readNextByte();
                }
            }
            int i16 = this.readIndex;
            this.payloadStartIndex = i16;
            long j11 = this.framePayloadLength;
            long j12 = ((long) i16) + j11;
            this.totalPacketLength = j12;
            if (this.writeIndex < j12) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Abort decode. Write index is at " + this.writeIndex + sVDIzpC.YKiQ + this.totalPacketLength);
                }
                return null;
            }
            if (z6) {
                unmask(this.decodeBuffer, i16, (int) (((long) i16) + j11));
            }
            long j13 = this.framePayloadLength;
            byte[] bArr2 = new byte[(int) j13];
            System.arraycopy(this.decodeBuffer, this.payloadStartIndex, bArr2, 0, (int) j13);
            while (true) {
                long j14 = i12;
                i10 = this.writeIndex;
                j10 = this.totalPacketLength;
                if (j14 >= ((long) i10) - j10) {
                    break;
                }
                byte[] bArr3 = this.decodeBuffer;
                bArr3[i12] = bArr3[((int) j10) + i12];
                i12++;
            }
            this.writeIndex = (int) (((long) i10) - j10);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("writeIndex = " + this.writeIndex + Separators.f31991SP + this.totalPacketLength);
            }
            return bArr2;
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
