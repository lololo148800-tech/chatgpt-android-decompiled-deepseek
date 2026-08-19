package p576Xe;

import java.util.ArrayList;
import java.util.Iterator;
import mm.C17296C;
import p025An.C0644w;
import p103Dn.InterfaceC2186j;
import p1042uh.C20263a0;
import p1107xh.EnumC21219I;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17682p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sh.C19644v;
import sh.C19646x;

/* JADX INFO: renamed from: Xe.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C9477b implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC2186j f28525Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f28526Z;

    public C9477b(InterfaceC2186j interfaceC2186j, boolean z6) {
        this.f28525Y = interfaceC2186j;
        this.f28526Z = z6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C9476a c9476a;
        Object objM6734a;
        if (interfaceC18770c instanceof C9476a) {
            c9476a = (C9476a) interfaceC18770c;
            int i10 = c9476a.f28523Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c9476a.f28523Z = i10 - Integer.MIN_VALUE;
            } else {
                c9476a = new C9476a(this, interfaceC18770c);
            }
        } else {
            c9476a = new C9476a(this, interfaceC18770c);
        }
        Object obj2 = c9476a.f28522Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c9476a.f28523Z;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj2);
            AbstractC6224C abstractC6224C = (AbstractC6224C) obj;
            if (abstractC6224C instanceof C6223B) {
                ArrayList arrayList = ((C19644v) ((C6223B) abstractC6224C).f20258a).f62295a;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C19646x) it.next()).f62298a.f62297b);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    C20263a0 c20263a0 = (C20263a0) obj3;
                    if (!this.f28526Z || c20263a0.f64087d.contains(EnumC21219I.PINNED)) {
                        arrayList3.add(obj3);
                    }
                }
                objM6734a = new C21952P1(arrayList3);
            } else if (abstractC6224C instanceof C6248v) {
                objM6734a = C21929J1.f69476a;
            } else {
                if (!(abstractC6224C instanceof AbstractC6249w)) {
                    throw new C0644w();
                }
                abstractC6224C.getClass();
                objM6734a = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
            }
            c9476a.f28523Z = 1;
            if (this.f28525Y.mo395a(objM6734a, c9476a) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj2);
        }
        return C17296C.f55119a;
    }
}
