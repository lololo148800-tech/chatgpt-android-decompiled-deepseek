package android.gov.nist.javax.sip.clientauthutils;

import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.security.MessageDigest;
import java.util.Date;
import java.util.Random;
import p571X9.AbstractC9306j0;
import p691d.InterfaceC12947f;
import p713e.InterfaceC13202J;
import p713e.InterfaceC13203K;
import p713e.InterfaceC13252z;
import p735f.InterfaceC13461b;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
public class DigestServerAuthenticationHelper {
    public static final String DEFAULT_ALGORITHM = "MD5";
    public static final String DEFAULT_SCHEME = "Digest";
    private static final char[] toHex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private MessageDigest messageDigest = MessageDigest.getInstance(DEFAULT_ALGORITHM);

    private String generateNonce() {
        return toHexString(this.messageDigest.digest((new Long(new Date().getTime()).toString() + new Long(new Random().nextLong()).toString()).getBytes()));
    }

    public static String toHexString(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = toHex;
            cArr[i10] = cArr2[(b >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean doAuthenticateHashedPassword(InterfaceC13461b interfaceC13461b, String str) {
        InterfaceC13203K interfaceC13203K = (InterfaceC13203K) interfaceC13461b.getHeader(SIPHeaderNames.PROXY_AUTHORIZATION);
        if (interfaceC13203K == null) {
            return false;
        }
        String realm = interfaceC13203K.getRealm();
        if (interfaceC13203K.getUsername() == null || realm == null) {
            return false;
        }
        String nonce = interfaceC13203K.getNonce();
        InterfaceC12947f uri = interfaceC13203K.getURI();
        if (uri == null) {
            return false;
        }
        String hexString = toHexString(this.messageDigest.digest((interfaceC13461b.getMethod().toUpperCase() + ":" + uri.toString()).getBytes()));
        String cNonce = interfaceC13203K.getCNonce();
        String strM9890i = AbstractC9306j0.m9890i(str, ":", nonce);
        if (cNonce != null) {
            strM9890i = AbstractC9306j0.m9890i(strM9890i, ":", cNonce);
        }
        return toHexString(this.messageDigest.digest(AbstractC9306j0.m9890i(strM9890i, ":", hexString).getBytes())).equals(interfaceC13203K.getResponse());
    }

    public boolean doAuthenticatePlainTextPassword(InterfaceC13461b interfaceC13461b, String str) {
        InterfaceC13203K interfaceC13203K = (InterfaceC13203K) interfaceC13461b.getHeader(SIPHeaderNames.PROXY_AUTHORIZATION);
        if (interfaceC13203K == null) {
            return false;
        }
        String realm = interfaceC13203K.getRealm();
        String username = interfaceC13203K.getUsername();
        if (username == null || realm == null) {
            return false;
        }
        String nonce = interfaceC13203K.getNonce();
        InterfaceC12947f uri = interfaceC13203K.getURI();
        if (uri == null) {
            return false;
        }
        String str2 = interfaceC13461b.getMethod().toUpperCase() + ":" + uri.toString();
        String hexString = toHexString(this.messageDigest.digest((username + ":" + realm + ":" + str).getBytes()));
        String hexString2 = toHexString(this.messageDigest.digest(str2.getBytes()));
        String cNonce = interfaceC13203K.getCNonce();
        String strM9890i = AbstractC9306j0.m9890i(hexString, ":", nonce);
        if (cNonce != null) {
            strM9890i = AbstractC9306j0.m9890i(strM9890i, ":", cNonce);
        }
        return toHexString(this.messageDigest.digest(AbstractC9306j0.m9890i(strM9890i, ":", hexString2).getBytes())).equals(interfaceC13203K.getResponse());
    }

    public void generateChallenge(InterfaceC13252z interfaceC13252z, InterfaceC13462c interfaceC13462c, String str) {
        try {
            InterfaceC13202J interfaceC13202JCreateProxyAuthenticateHeader = interfaceC13252z.createProxyAuthenticateHeader("Digest");
            interfaceC13202JCreateProxyAuthenticateHeader.setParameter("realm", str);
            interfaceC13202JCreateProxyAuthenticateHeader.setParameter("nonce", generateNonce());
            interfaceC13202JCreateProxyAuthenticateHeader.setParameter("opaque", "");
            interfaceC13202JCreateProxyAuthenticateHeader.setParameter("stale", "FALSE");
            interfaceC13202JCreateProxyAuthenticateHeader.setParameter("algorithm", DEFAULT_ALGORITHM);
            interfaceC13462c.setHeader(interfaceC13202JCreateProxyAuthenticateHeader);
        } catch (Exception e10) {
            InternalErrorHandler.handleException(e10);
        }
    }
}
