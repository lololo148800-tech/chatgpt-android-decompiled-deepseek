package android.gov.nist.javax.sip.parser;

import android.gov.nist.javax.sip.message.SIPMessage;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public interface ParseExceptionListener {
    void handleException(ParseException parseException, SIPMessage sIPMessage, Class cls, String str, String str2);
}
