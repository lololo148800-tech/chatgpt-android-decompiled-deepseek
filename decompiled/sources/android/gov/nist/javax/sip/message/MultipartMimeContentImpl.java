package android.gov.nist.javax.sip.message;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.HeaderFactoryExt;
import android.gov.nist.javax.sip.header.HeaderFactoryImpl;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import p713e.InterfaceC13239m;
import p713e.InterfaceC13243q;
import p713e.InterfaceC13250x;

/* JADX INFO: loaded from: classes.dex */
public class MultipartMimeContentImpl implements MultipartMimeContent {
    public static final String BOUNDARY = "boundary";
    private String boundary;
    private List<Content> contentList = new LinkedList();
    private HeaderFactoryExt headerFactory = new HeaderFactoryImpl();
    private InterfaceC13243q multipartMimeContentTypeHeader;

    public MultipartMimeContentImpl(InterfaceC13243q interfaceC13243q) {
        this.multipartMimeContentTypeHeader = interfaceC13243q;
        this.boundary = interfaceC13243q.getParameter(BOUNDARY);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    private ContentImpl parseBodyPart(String str) {
        String[] strArrSplit;
        if (str.startsWith(Separators.RETURN) || str.startsWith(Separators.NEWLINE)) {
            strArrSplit = null;
        } else {
            String[] strArrSplit2 = str.split("\r?\n\r?\n", 2);
            if (strArrSplit2.length == 2) {
                strArrSplit = strArrSplit2[0].split("\r?\n");
                if (strArrSplit[0].indexOf(":") > 0) {
                    str = strArrSplit2[1];
                } else {
                    strArrSplit = null;
                }
            } else {
                strArrSplit = null;
            }
        }
        ContentImpl contentImpl = new ContentImpl(str);
        if (strArrSplit != null) {
            for (String str2 : strArrSplit) {
                InterfaceC13250x interfaceC13250xCreateHeader = this.headerFactory.createHeader(str2);
                if (interfaceC13250xCreateHeader instanceof InterfaceC13243q) {
                    contentImpl.setContentTypeHeader((InterfaceC13243q) interfaceC13250xCreateHeader);
                } else if (interfaceC13250xCreateHeader instanceof InterfaceC13239m) {
                    contentImpl.setContentDispositionHeader((InterfaceC13239m) interfaceC13250xCreateHeader);
                } else {
                    contentImpl.addExtensionHeader(interfaceC13250xCreateHeader);
                }
            }
        }
        return contentImpl;
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public boolean add(Content content) {
        return this.contentList.add((ContentImpl) content);
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public void addContent(Content content) {
        add(content);
    }

    public void createContentList(String str) {
        if (this.boundary == null) {
            ContentImpl bodyPart = parseBodyPart(str);
            bodyPart.setContentTypeHeader(getContentTypeHeader());
            this.contentList.add(bodyPart);
            return;
        }
        Scanner scanner = new Scanner(str);
        scanner.useDelimiter("\r?\n?--" + this.boundary + "(--)?\r?\n?");
        while (scanner.hasNext()) {
            try {
                this.contentList.add(parseBodyPart(scanner.next()));
            } catch (NoSuchElementException unused) {
            }
        }
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public int getContentCount() {
        return this.contentList.size();
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public InterfaceC13243q getContentTypeHeader() {
        return this.multipartMimeContentTypeHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public Iterator<Content> getContents() {
        return this.contentList.iterator();
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (Content content : this.contentList) {
            sb2.append("--" + this.boundary + Separators.NEWLINE);
            sb2.append(content.toString());
            sb2.append(Separators.NEWLINE);
        }
        if (!this.contentList.isEmpty()) {
            sb2.append("--" + this.boundary + "--");
        }
        return sb2.toString();
    }
}
