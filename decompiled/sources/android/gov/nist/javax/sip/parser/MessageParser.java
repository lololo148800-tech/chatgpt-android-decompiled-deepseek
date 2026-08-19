package android.gov.nist.javax.sip.parser;

import android.gov.nist.javax.sip.message.SIPMessage;

/* JADX INFO: loaded from: classes.dex */
public interface MessageParser {
    SIPMessage parseSIPMessage(byte[] bArr, boolean z6, boolean z10, ParseExceptionListener parseExceptionListener);
}
