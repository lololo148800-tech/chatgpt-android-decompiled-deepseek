package p1125yb;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: renamed from: yb.h */
/* JADX INFO: loaded from: classes.dex */
public final class C21402h {

    /* JADX INFO: renamed from: a */
    public static final byte f67943a = Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: b */
    public static final byte f67944b = Byte.parseByte("00001111", 2);

    /* JADX INFO: renamed from: a */
    public static String m21792a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        byte b = bArrArray[0];
        bArrArray[16] = b;
        bArrArray[0] = (byte) ((b & f67944b) | f67943a);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
