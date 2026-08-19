package io.ktor.client.plugins.auth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1441p;
import p059C5.C1601s;
import p432Rh.C6894g;
import p571X9.AbstractC9233X;
import p754fl.C13693c;
import p817j$.util.concurrent.ConcurrentMap$EL;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sl.C19666a;
import sm.AbstractC19694j;
import tl.C20001a;
import tl.C20002b;
import tl.C20003c;

/* JADX INFO: renamed from: io.ktor.client.plugins.auth.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C15060e extends AbstractC19694j implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public C20003c f46789Y;

    /* JADX INFO: renamed from: Z */
    public C19666a f46790Z;

    /* JADX INFO: renamed from: o0 */
    public Iterator f46791o0;

    /* JADX INFO: renamed from: p0 */
    public int f46792p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ C13693c f46793q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ List f46794r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C20003c f46795s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C19666a f46796t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15060e(List list, C20003c c20003c, C19666a c19666a, InterfaceC18770c interfaceC18770c) {
        super(4, interfaceC18770c);
        this.f46794r0 = list;
        this.f46795s0 = c20003c;
        this.f46796t0 = c19666a;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C19666a c19666a = this.f46796t0;
        C15060e c15060e = new C15060e(this.f46794r0, this.f46795s0, c19666a, (InterfaceC18770c) obj4);
        c15060e.f46793q0 = (C13693c) obj2;
        return c15060e.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C13693c c13693c;
        C20003c c20003c;
        Iterator it;
        C19666a c19666a;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f46792p0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13693c request = this.f46793q0;
            List list = this.f46794r0;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                ((C6894g) obj2).getClass();
                AbstractC16544l.m18094g(request, "request");
                arrayList.add(obj2);
            }
            C20003c c20003c2 = this.f46795s0;
            C19666a c19666a2 = this.f46796t0;
            c13693c = request;
            c20003c = c20003c2;
            it = arrayList.iterator();
            c19666a = c19666a2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f46791o0;
            c19666a = this.f46790Z;
            c20003c = this.f46789Y;
            c13693c = this.f46793q0;
            AbstractC9233X.m9807c(obj);
        }
        while (it.hasNext()) {
            C6894g c6894g = (C6894g) it.next();
            AbstractC15064i.f46817a.mo19442g("Adding auth headers for " + c13693c.f43195a + " from provider " + c6894g);
            ((Map) c13693c.f43200f.m20647a(c19666a, new C1601s(23))).put(c6894g, new Integer(((C15056a) ConcurrentMap$EL.computeIfAbsent(c20003c.f63323Y, c6894g, new C20002b(0, new C20001a(0, new C1601s(22))))).atomic));
            this.f46793q0 = c13693c;
            this.f46789Y = c20003c;
            this.f46790Z = c19666a;
            this.f46791o0 = it;
            this.f46792p0 = 1;
            if (c6894g.m7288a(c13693c, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
