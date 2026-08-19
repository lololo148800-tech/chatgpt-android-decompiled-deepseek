package p006A4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1143z4.C21778h;
import p349O0.C6002f0;
import p349O0.InterfaceC5982V0;
import p571X9.AbstractC9233X;
import p758g0.C13771k0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A4.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0365z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C13771k0 f1249Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Map f1250Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5982V0 f1251o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0347h f1252p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0365z(C13771k0 c13771k0, Map map, InterfaceC5982V0 interfaceC5982V0, C0347h c0347h, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f1249Y = c13771k0;
        this.f1250Z = map;
        this.f1251o0 = interfaceC5982V0;
        this.f1252p0 = c0347h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0365z(this.f1249Y, this.f1250Z, this.f1251o0, this.f1252p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C0365z c0365z = (C0365z) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c0365z.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C13771k0 c13771k0 = this.f1249Y;
        Object objM15272c = c13771k0.m15272c();
        C6002f0 c6002f0 = c13771k0.f43492d;
        if (AbstractC16544l.m18089b(objM15272c, c6002f0.getValue())) {
            Iterator it = ((List) this.f1251o0.getValue()).iterator();
            while (it.hasNext()) {
                this.f1252p0.m22258b().m22268b((C21778h) it.next());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f1250Z;
            for (Map.Entry entry : map.entrySet()) {
                if (!AbstractC16544l.m18089b(entry.getKey(), ((C21778h) c6002f0.getValue()).f69078r0)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                map.remove(((Map.Entry) it2.next()).getKey());
            }
        }
        return C17296C.f55119a;
    }
}
