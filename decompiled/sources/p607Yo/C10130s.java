package p607Yo;

import gp.InterfaceC14208a;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: renamed from: Yo.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C10130s implements InterfaceC14208a {

    /* JADX INFO: renamed from: a */
    public final char f30033a;

    /* JADX INFO: renamed from: b */
    public int f30034b = 0;

    /* JADX INFO: renamed from: c */
    public final LinkedList f30035c = new LinkedList();

    public C10130s(char c9) {
        this.f30033a = c9;
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: a */
    public final char mo8901a() {
        return this.f30033a;
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: b */
    public final int mo8902b(C10116e c10116e, C10116e c10116e2) {
        int size = c10116e.f29956a.size();
        LinkedList<InterfaceC14208a> linkedList = this.f30035c;
        for (InterfaceC14208a interfaceC14208a : linkedList) {
            if (interfaceC14208a.mo8903c() <= size) {
                return interfaceC14208a.mo8902b(c10116e, c10116e2);
            }
        }
        interfaceC14208a = (InterfaceC14208a) linkedList.getFirst();
        return interfaceC14208a.mo8902b(c10116e, c10116e2);
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: c */
    public final int mo8903c() {
        return this.f30034b;
    }

    @Override // gp.InterfaceC14208a
    /* JADX INFO: renamed from: d */
    public final char mo8904d() {
        return this.f30033a;
    }

    /* JADX INFO: renamed from: e */
    public final void m10725e(InterfaceC14208a interfaceC14208a) {
        int iMo8903c = interfaceC14208a.mo8903c();
        LinkedList linkedList = this.f30035c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            InterfaceC14208a interfaceC14208a2 = (InterfaceC14208a) listIterator.next();
            int iMo8903c2 = interfaceC14208a2.mo8903c();
            if (iMo8903c > iMo8903c2) {
                listIterator.previous();
                listIterator.add(interfaceC14208a);
                return;
            } else if (iMo8903c == iMo8903c2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f30033a + "' and minimum length " + iMo8903c + "; conflicting processors: " + interfaceC14208a2 + ", " + interfaceC14208a);
            }
        }
        linkedList.add(interfaceC14208a);
        this.f30034b = iMo8903c;
    }
}
