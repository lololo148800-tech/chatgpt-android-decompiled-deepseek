package p925oe;

import gd.C13969n2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p1155zi.C22011h0;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: oe.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C18107d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f57756Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ LinkedHashMap f57757Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18127p f57758o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18077B f57759p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C13969n2 f57760q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18107d(LinkedHashMap linkedHashMap, C18127p c18127p, C18077B c18077b, C13969n2 c13969n2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f57757Z = linkedHashMap;
        this.f57758o0 = c18127p;
        this.f57759p0 = c18077b;
        this.f57760q0 = c13969n2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C18107d c18107d = new C18107d(this.f57757Z, this.f57758o0, this.f57759p0, this.f57760q0, interfaceC18770c);
        c18107d.f57756Y = obj;
        return c18107d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18107d c18107d = (C18107d) create((List) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c18107d.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        List list = (List) this.f57756Y;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.f57757Z;
            if (!zHasNext) {
                break;
            }
            String str = ((C22011h0) it.next()).f69652a;
            if (linkedHashMap.get(new C22011h0(str)) == null) {
                linkedHashMap.put(new C22011h0(str), AbstractC0575H.m1156D(this.f57758o0.f57818a, null, null, new C18105c(this.f57759p0, str, this.f57760q0, null), 3));
            }
        }
        Iterator it2 = AbstractC17665J.m19264d(linkedHashMap.keySet(), AbstractC17680n.m19328G0(list)).iterator();
        while (it2.hasNext()) {
            String str2 = ((C22011h0) it2.next()).f69652a;
            InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) linkedHashMap.get(new C22011h0(str2));
            if (interfaceC0627n0 != null) {
                interfaceC0627n0.mo1275e(null);
            }
            linkedHashMap.remove(new C22011h0(str2));
        }
        return C17296C.f55119a;
    }
}
