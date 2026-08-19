package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import p582Xk.HXHG.TfazcFv;

/* JADX INFO: loaded from: classes.dex */
public class WebSocketHttpHandshake {
    private static StackLogger logger = CommonLogger.getLogger(WebSocketHttpHandshake.class);
    private HashMap<String, String> headers = new HashMap<>();

    public static String computeRev13Response(String str) {
        String strM11052j = AbstractC10763a.m11052j(str, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.reset();
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
        }
        byte[] bArrDigest = messageDigest.digest(strM11052j.getBytes());
        new ByteArrayOutputStream();
        return Base64.encodeBytes(bArrDigest);
    }

    private String readLine(InputStream inputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        boolean z6 = false;
        while (true) {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            if (i10 == 13) {
                z6 = true;
            } else {
                if (i10 == 10 && z6) {
                    return sb2.toString();
                }
                if (i10 == 10) {
                    return null;
                }
                sb2.append((char) i10);
            }
        }
    }

    public byte[] createHttpResponse(String str) throws IOException {
        if (logger.isLoggingEnabled(32)) {
            AbstractC10763a.m11065w("Request=", str, logger);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        String line = readLine(byteArrayInputStream);
        if (line == null) {
            return null;
        }
        String[] strArrSplit = line.split(Separators.f31991SP);
        if (strArrSplit.length >= 3) {
            this.headers.put("ctx", strArrSplit[1]);
        }
        boolean z6 = false;
        while (!line.isEmpty()) {
            line = readLine(byteArrayInputStream);
            if (line != null && !line.isEmpty()) {
                String[] strArrSplit2 = line.split(":", 2);
                if (strArrSplit2.length == 2) {
                    if (strArrSplit2[0].toLowerCase().startsWith("sec-websocket-key")) {
                        z6 = true;
                    }
                    this.headers.put(strArrSplit2[0].trim(), strArrSplit2[1].trim());
                }
            }
        }
        if (z6) {
            byteArrayInputStream.read(new byte[8]);
        }
        StringBuilder sb2 = new StringBuilder("HTTP/1.1 101 Web Socket Protocol Handshake\r\nUpgrade: WebSocket\r\nConnection: Upgrade\r\n");
        String str2 = TfazcFv.DejvQAtF;
        if (z6) {
            sb2.append(str2);
        }
        sb2.append("WebSocket-Origin: ");
        sb2.append(this.headers.get("Origin"));
        sb2.append(Separators.NEWLINE);
        if (z6) {
            sb2.append(str2);
        }
        sb2.append("WebSocket-Location: ws://");
        sb2.append(this.headers.get("Host"));
        sb2.append(this.headers.get("ctx"));
        sb2.append("\r\nSec-WebSocket-Accept: ");
        sb2.append(computeRev13Response(this.headers.get("Sec-WebSocket-Key")));
        sb2.append(Separators.NEWLINE);
        if (this.headers.get("Protocol") != null) {
            if (z6) {
                sb2.append(str2);
            }
            sb2.append("Protocol: ");
            sb2.append(this.headers.get("Protocol"));
            sb2.append(Separators.NEWLINE);
        }
        if (this.headers.get("Sec-WebSocket-Protocol") != null) {
            sb2.append("Sec-WebSocket-Protocol: ");
            sb2.append(this.headers.get("Sec-WebSocket-Protocol"));
            sb2.append(Separators.NEWLINE);
        }
        sb2.append(Separators.NEWLINE);
        String string = sb2.toString();
        if (logger.isLoggingEnabled(32)) {
            AbstractC10763a.m11065w("Response=", string, logger);
        }
        return sb2.toString().getBytes();
    }
}
