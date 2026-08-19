package p857kl;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import p909nm.C17689w;

/* JADX INFO: renamed from: kl.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16457e {

    /* JADX INFO: renamed from: a */
    public static final C16460h f51060a;

    /* JADX INFO: renamed from: b */
    public static final C16460h f51061b;

    static {
        C17689w c17689w = C17689w.f56480Y;
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, Separators.STAR, c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "atom+xml", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "cbor", c17689w);
        f51060a = new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "json", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "hal+json", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "javascript", c17689w);
        f51061b = new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "octet-stream", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "rss+xml", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "soap+xml", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "xml", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "xml-dtd", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "zip", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "gzip", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "x-www-form-urlencoded", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "pdf", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.spreadsheetml.sheet", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.wordprocessingml.document", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.presentationml.presentation", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "protobuf", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "wasm", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "problem+json", c17689w);
        new C16460h(SIPServerTransaction.CONTENT_TYPE_APPLICATION, "problem+xml", c17689w);
    }
}
