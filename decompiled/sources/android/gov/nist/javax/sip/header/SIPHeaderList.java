package android.gov.nist.javax.sip.header;

import android.gov.nist.core.GenericObject;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeader;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import p571X9.AbstractC9306j0;
import p713e.InterfaceC13250x;

/* JADX INFO: loaded from: classes.dex */
public abstract class SIPHeaderList<HDR extends SIPHeader> extends SIPHeader implements List<HDR> {
    private static boolean prettyEncode = false;
    protected List<HDR> hlist;
    private Class<HDR> myClass;

    private SIPHeaderList() {
        this.hlist = new LinkedList();
    }

    public static void setPrettyEncode(boolean z6) {
        prettyEncode = z6;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends HDR> collection) {
        return this.hlist.addAll(collection);
    }

    public void addFirst(HDR hdr) {
        this.hlist.add(0, hdr);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.hlist.clear();
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        try {
            SIPHeaderList sIPHeaderList = (SIPHeaderList) getClass().getConstructor(null).newInstance(null);
            sIPHeaderList.headerName = this.headerName;
            sIPHeaderList.myClass = this.myClass;
            return sIPHeaderList.clonehlist(this.hlist);
        } catch (Exception e10) {
            throw new RuntimeException("Could not clone!", e10);
        }
    }

    public final SIPHeaderList<HDR> clonehlist(List<HDR> list) {
        if (list != null) {
            Iterator<HDR> it = list.iterator();
            while (it.hasNext()) {
                this.hlist.add((HDR) ((SIPHeader) it.next().clone()));
            }
        }
        return this;
    }

    public void concatenate(SIPHeaderList<HDR> sIPHeaderList, boolean z6) {
        if (z6) {
            addAll(0, sIPHeaderList);
        } else {
            addAll(sIPHeaderList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.hlist.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.hlist.containsAll(collection);
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String debugDump(int i10) {
        this.stringRepresentation = "";
        String indentation = new Indentation(i10).getIndentation();
        sprint(indentation + getClass().getName());
        sprint(indentation + "{");
        for (HDR hdr : this.hlist) {
            StringBuilder sbM9893l = AbstractC9306j0.m9893l(indentation);
            sbM9893l.append(hdr.debugDump());
            sprint(sbM9893l.toString());
        }
        sprint(indentation + "}");
        return this.stringRepresentation;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SIPHeaderList)) {
            return false;
        }
        List<HDR> list = this.hlist;
        List<HDR> list2 = ((SIPHeaderList) obj).hlist;
        if (list == list2) {
            return true;
        }
        if (list == null) {
            return list2 == null || list2.size() == 0;
        }
        return list.equals(list2);
    }

    public InterfaceC13250x getFirst() {
        List<HDR> list = this.hlist;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.hlist.get(0);
    }

    public List<HDR> getHeaderList() {
        return this.hlist;
    }

    public List<String> getHeadersAsEncodedStrings() {
        LinkedList linkedList = new LinkedList();
        ListIterator<HDR> listIterator = this.hlist.listIterator();
        while (listIterator.hasNext()) {
            linkedList.add(listIterator.next().toString());
        }
        return linkedList;
    }

    public InterfaceC13250x getLast() {
        List<HDR> list = this.hlist;
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<HDR> list2 = this.hlist;
        return list2.get(list2.size() - 1);
    }

    public Class<HDR> getMyClass() {
        return this.myClass;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.HeaderExt
    public String getName() {
        return this.headerName;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public int hashCode() {
        return this.headerName.hashCode();
    }

    public int indexOf(GenericObject genericObject) {
        return this.hlist.indexOf(genericObject);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.hlist.isEmpty();
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public boolean isHeaderList() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<HDR> iterator() {
        return this.hlist.listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.hlist.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<HDR> listIterator() {
        return this.hlist.listIterator(0);
    }

    public boolean match(SIPHeaderList<?> sIPHeaderList) {
        if (sIPHeaderList == null) {
            return true;
        }
        if (!getClass().equals(sIPHeaderList.getClass())) {
            return false;
        }
        List<HDR> list = this.hlist;
        List<HDR> list2 = sIPHeaderList.hlist;
        if (list == list2) {
            return true;
        }
        if (list == null) {
            return false;
        }
        for (HDR hdr : list2) {
            Iterator<HDR> it = this.hlist.iterator();
            boolean zMatch = false;
            while (it.hasNext() && !zMatch) {
                zMatch = it.next().match(hdr);
            }
            if (!zMatch) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.hlist.removeAll(collection);
    }

    public void removeFirst() {
        if (this.hlist.size() != 0) {
            this.hlist.remove(0);
        }
    }

    public void removeLast() {
        if (this.hlist.size() != 0) {
            List<HDR> list = this.hlist;
            list.remove(list.size() - 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.hlist.retainAll(collection);
    }

    public void setMyClass(Class<HDR> cls) {
        this.myClass = cls;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.hlist.size();
    }

    @Override // java.util.List
    public List<HDR> subList(int i10, int i11) {
        return this.hlist.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.hlist.toArray();
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends HDR> collection) {
        return this.hlist.addAll(i10, collection);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb2) {
        if (this.hlist.isEmpty()) {
            sb2.append(this.headerName);
            sb2.append(':');
            sb2.append(Separators.NEWLINE);
        } else if (this.headerName.equals(SIPHeaderNames.WWW_AUTHENTICATE) || this.headerName.equals(SIPHeaderNames.PROXY_AUTHENTICATE) || this.headerName.equals(SIPHeaderNames.AUTHORIZATION) || this.headerName.equals(SIPHeaderNames.PROXY_AUTHORIZATION) || ((prettyEncode && (this.headerName.equals(SIPHeaderNames.VIA) || this.headerName.equals(SIPHeaderNames.ROUTE) || this.headerName.equals(SIPHeaderNames.RECORD_ROUTE))) || getClass().equals(ExtensionHeaderList.class))) {
            ListIterator<HDR> listIterator = this.hlist.listIterator();
            while (listIterator.hasNext()) {
                listIterator.next().encode(sb2);
            }
        } else {
            sb2.append(this.headerName);
            sb2.append(":");
            sb2.append(Separators.f31991SP);
            encodeBody(sb2);
            sb2.append(Separators.NEWLINE);
        }
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        ListIterator<HDR> listIterator = listIterator();
        while (true) {
            HDR next = listIterator.next();
            if (next == this) {
                throw new RuntimeException("Unexpected circularity in SipHeaderList");
            }
            next.encodeBody(sb2);
            if (!listIterator.hasNext()) {
                return sb2;
            }
            if (this.headerName.equals("Privacy")) {
                sb2.append(Separators.SEMICOLON);
            } else {
                sb2.append(Separators.COMMA);
            }
        }
    }

    @Override // java.util.List
    public HDR get(int i10) {
        return this.hlist.get(i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.hlist.indexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<HDR> listIterator(int i10) {
        return this.hlist.listIterator(i10);
    }

    public boolean remove(HDR hdr) {
        if (this.hlist.size() == 0) {
            return false;
        }
        return this.hlist.remove(hdr);
    }

    @Override // java.util.List
    public HDR set(int i10, HDR hdr) {
        return this.hlist.set(i10, hdr);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.hlist.toArray(tArr);
    }

    public SIPHeaderList(Class<HDR> cls, String str) {
        this();
        this.headerName = str;
        this.myClass = cls;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(HDR hdr) {
        this.hlist.add(hdr);
        return true;
    }

    public void add(HDR hdr, boolean z6) {
        if (z6) {
            addFirst(hdr);
        } else {
            add((SIPHeader) hdr);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.hlist.remove(obj);
    }

    @Override // java.util.List
    public HDR remove(int i10) {
        return this.hlist.remove(i10);
    }

    @Override // java.util.List
    public void add(int i10, HDR hdr) {
        this.hlist.add(i10, hdr);
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String debugDump() {
        return debugDump(0);
    }
}
