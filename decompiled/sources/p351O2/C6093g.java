package p351O2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6093g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Iterator f19831Y;

    /* JADX INFO: renamed from: Z */
    public Object f19832Z;

    /* JADX INFO: renamed from: o0 */
    public int f19833o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f19834p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ List f19835q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ ArrayList f19836r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6093g(List list, ArrayList arrayList, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19835q0 = list;
        this.f19836r0 = arrayList;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6093g c6093g = new C6093g(this.f19835q0, this.f19836r0, interfaceC18770c);
        c6093g.f19834p0 = obj;
        return c6093g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6093g) create(obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f19833o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            obj = this.f19834p0;
            it = this.f19835q0.iterator();
            list = this.f19836r0;
        } else if (i10 == 1) {
            Object obj2 = this.f19832Z;
            Iterator it2 = this.f19831Y;
            List list2 = (List) this.f19834p0;
            AbstractC9233X.m9807c(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C6092f(1, null));
                this.f19834p0 = list2;
                this.f19831Y = it2;
                this.f19832Z = null;
                this.f19833o0 = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f19831Y;
            list = (List) this.f19834p0;
            AbstractC9233X.m9807c(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f19834p0 = list;
        this.f19831Y = it;
        this.f19832Z = obj;
        this.f19833o0 = 1;
        throw null;
    }
}
