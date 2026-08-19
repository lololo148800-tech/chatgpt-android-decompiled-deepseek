package p708dh;

import gh.C14144l;
import gh.C14146n;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p072Ci.EnumC1702g;
import p1111xl.C21296a;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: dh.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C13138P extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Iterator f41708Y;

    /* JADX INFO: renamed from: Z */
    public int f41709Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f41710o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13141T f41711p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13138P(C13141T c13141t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41711p0 = c13141t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C13138P c13138p = new C13138P(this.f41711p0, interfaceC18770c);
        c13138p.f41710o0 = obj;
        return c13138p;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13138P) create((Map) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:33|14|29|15|18|(1:20)) */
    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:13:0x004d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x002f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0077 -> B:21:0x007a). Please report as a decompilation issue!!! */
    @Override // sm.AbstractC19685a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C13141T c13141t;
        Iterator it;
        boolean z6;
        boolean z10;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f41709Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            Iterator it2 = ((Map) this.f41710o0).entrySet().iterator();
            c13141t = this.f41711p0;
            it = it2;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                EnumC1702g enumC1702g = (EnumC1702g) entry.getKey();
                C13139Q c13139q = (C13139Q) entry.getValue();
                z6 = c13139q.f41714c;
                z10 = c13139q.f41713b;
                if (!z6 && !z10) {
                    C14146n c14146n = c13141t.f41718a;
                    String str = enumC1702g.f4863Y;
                    this.f41710o0 = c13141t;
                    this.f41708Y = it;
                    this.f41709Z = 1;
                    C14144l c14144l = new C14144l(str, null);
                    InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                    InterfaceC3777y interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
                    obj = AbstractC9144I.m9690b(c14146n.f44506a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c14144l, this);
                    if (obj == enumC19250a) {
                        return enumC19250a;
                    }
                } else if (!z10 && !z6) {
                    c13141t.f41719b.m14817a(new C13137O(enumC1702g, 0));
                }
                while (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    EnumC1702g enumC1702g2 = (EnumC1702g) entry2.getKey();
                    C13139Q c13139q2 = (C13139Q) entry2.getValue();
                    z6 = c13139q2.f41714c;
                    z10 = c13139q2.f41713b;
                    if (!z6) {
                    }
                    if (!z10) {
                    }
                }
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = this.f41708Y;
        c13141t = (C13141T) this.f41710o0;
        AbstractC9233X.m9807c(obj);
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) obj).m6735b();
        if (abstractC21955Q1M6735b instanceof AbstractC21933K1) {
            AbstractC8160o6.m8731f(c13141t.f41720c, "Failed to update announcement", ((AbstractC21933K1) abstractC21955Q1M6735b).f69485a, null, 4);
        }
        while (it.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it.next();
            EnumC1702g enumC1702g3 = (EnumC1702g) entry3.getKey();
            C13139Q c13139q3 = (C13139Q) entry3.getValue();
            z6 = c13139q3.f41714c;
            z10 = c13139q3.f41713b;
            if (!z6) {
            }
            if (!z10) {
            }
        }
        return C17296C.f55119a;
    }
}
