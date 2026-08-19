package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.LogRecord;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes.dex */
class MessageLog implements LogRecord {
    private String callId;
    private String destination;
    private String firstLine;
    private boolean isSender;
    private String message;
    private String source;
    private String tid;
    private long timeStamp;
    private long timeStampHeaderValue;

    public MessageLog(String str, String str2, String str3, String str4, boolean z6, String str5, String str6, String str7, long j10) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("null msg");
        }
        this.message = str;
        this.source = str2;
        this.destination = str3;
        try {
            long j11 = Long.parseLong(str4);
            if (j11 < 0) {
                throw new IllegalArgumentException("Bad time stamp ");
            }
            this.timeStamp = j11;
            this.isSender = z6;
            this.firstLine = str5;
            this.tid = str6;
            this.callId = str7;
            this.timeStampHeaderValue = j10;
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(AbstractC9306j0.m9889h("Bad number format ", str4));
        }
    }

    @Override // android.gov.nist.javax.sip.LogRecord
    public boolean equals(Object obj) {
        if (!(obj instanceof MessageLog)) {
            return false;
        }
        MessageLog messageLog = (MessageLog) obj;
        return messageLog.message.equals(this.message) && messageLog.timeStamp == this.timeStamp;
    }

    @Override // android.gov.nist.javax.sip.LogRecord
    public String toString() {
        String strM11050h;
        StringBuilder sb2 = new StringBuilder("<message\nfrom=\"");
        sb2.append(this.source);
        sb2.append("\" \nto=\"");
        sb2.append(this.destination);
        sb2.append("\" \ntime=\"");
        sb2.append(this.timeStamp);
        sb2.append(Separators.DOUBLE_QUOTE);
        if (this.timeStampHeaderValue != 0) {
            strM11050h = AbstractC10763a.m11050h(this.timeStampHeaderValue, Separators.DOUBLE_QUOTE, new StringBuilder("\ntimeStamp = \""));
        } else {
            strM11050h = "";
        }
        sb2.append(strM11050h);
        sb2.append("\nisSender=\"");
        sb2.append(this.isSender);
        sb2.append("\" \ntransactionId=\"");
        sb2.append(this.tid);
        sb2.append("\" \ncallId=\"");
        sb2.append(this.callId);
        sb2.append("\" \nfirstLine=\"");
        sb2.append(this.firstLine.trim());
        sb2.append("\" \n>\n");
        StringBuilder sbM9893l = AbstractC9306j0.m9893l(AbstractC10763a.m11052j(sb2.toString(), "<![CDATA["));
        sbM9893l.append(this.message);
        return AbstractC10763a.m11052j(AbstractC10763a.m11052j(sbM9893l.toString(), "]]>\n"), "</message>\n");
    }

    public MessageLog(String str, String str2, String str3, long j10, boolean z6, String str4, String str5, String str6, long j11) {
        if (str != null && !str.equals("")) {
            this.message = str;
            this.source = str2;
            this.destination = str3;
            if (j10 >= 0) {
                this.timeStamp = j10;
                this.isSender = z6;
                this.firstLine = str4;
                this.tid = str5;
                this.callId = str6;
                this.timeStampHeaderValue = j11;
                return;
            }
            throw new IllegalArgumentException("negative ts");
        }
        throw new IllegalArgumentException("null msg");
    }
}
