package p339Nf;

import com.openai.feature.messages.MessagesViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p040Bd.C0928G4;
import p040Bd.C1054b4;
import p040Bd.C1075e4;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;
import p926of.C18139B;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Nf.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C5731m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ List f18604Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f18605Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ MessagesViewModel f18606o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5731m(List list, List list2, MessagesViewModel messagesViewModel, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18604Y = list;
        this.f18605Z = list2;
        this.f18606o0 = messagesViewModel;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5731m(this.f18604Y, this.f18605Z, this.f18606o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C5731m c5731m = (C5731m) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c5731m.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        List list = this.f18604Y;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = ((C1075e4) it.next()).f2928b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String str = ((C1054b4) it2.next()).f2887e;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            AbstractC17686t.m19398v(arrayList2, arrayList);
        }
        List list3 = this.f18605Z;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            String str2 = ((C0928G4) it3.next()).f2678e;
            if (str2 != null) {
                arrayList3.add(str2);
            }
        }
        this.f18606o0.m14395k(new C18139B(AbstractC17680n.m19328G0(AbstractC17680n.m19361k0(arrayList3, arrayList))));
        return C17296C.f55119a;
    }
}
