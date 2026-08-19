package de;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1081wc.C20902u;
import p1081wc.InterfaceC20904w;
import p1155zi.C21987b0;
import p1155zi.EnumC21973X;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: de.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C13079g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f41551Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21987b0 f41552Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13079g(InterfaceC20904w interfaceC20904w, C21987b0 c21987b0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41551Y = interfaceC20904w;
        this.f41552Z = c21987b0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13079g(this.f41551Y, this.f41552Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C13079g c13079g = (C13079g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c13079g.invokeSuspend(c17296c);
        return c17296c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C20902u c20902u = C20902u.f66625f;
        C17309l c17309l = new C17309l("location", "banner_description");
        C21987b0 c21987b0 = this.f41552Z;
        C17309l c17309l2 = new C17309l("type", c21987b0.f69611c);
        C17309l c17309l3 = new C17309l("isHardBlock", Boolean.valueOf(AbstractC16544l.m18089b(c21987b0.f69614f, Boolean.FALSE)));
        List list = c21987b0.f69612d;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((EnumC21973X) it.next()).f69554Y);
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = C17689w.f56480Y;
        }
        this.f41551Y.mo21447a(c20902u, AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, new C17309l("actions", arrayList)));
        return C17296C.f55119a;
    }
}
