package p615Z6;

import org.xml.sax.Attributes;
import org.xml.sax.ext.DefaultHandler2;
import p239Ja.C4312o;
import p355O7.C6141c;

/* JADX INFO: renamed from: Z6.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10178F0 extends DefaultHandler2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6141c f30131a;

    public C10178F0(C6141c c6141c) {
        this.f30131a = c6141c;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i10, int i11) {
        this.f30131a.m6707H(new String(cArr, i10, i11));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
        this.f30131a.getClass();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.f30131a.m6711d(str, str2, str3);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) {
        C4312o c4312o = new C4312o(str2);
        this.f30131a.getClass();
        C6141c.m6701z(c4312o);
        str.equals("xml-stylesheet");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        this.f30131a.m6705F();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws C10168A0 {
        this.f30131a.m6706G(str, str2, str3, attributes);
    }
}
