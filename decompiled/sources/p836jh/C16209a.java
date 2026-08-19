package p836jh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p1155zi.C22038o;
import p407Qh.InterfaceC6733c;
import p571X9.AbstractC9233X;
import p754fl.C13693c;
import p857kl.C16477y;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sl.C19666a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: jh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C16209a extends AbstractC19694j implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f50292Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ C13693c f50293Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC6733c f50294o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16209a(InterfaceC6733c interfaceC6733c, InterfaceC18770c interfaceC18770c, int i10) {
        super(4, interfaceC18770c);
        this.f50292Y = i10;
        this.f50294o0 = interfaceC6733c;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C13693c c13693c = (C13693c) obj2;
        InterfaceC18770c interfaceC18770c = (InterfaceC18770c) obj4;
        switch (this.f50292Y) {
            case 0:
                C16209a c16209a = new C16209a((C16210b) this.f50294o0, interfaceC18770c, 0);
                c16209a.f50293Z = c13693c;
                C17296C c17296c = C17296C.f55119a;
                c16209a.invokeSuspend(c17296c);
                return c17296c;
            default:
                C16209a c16209a2 = new C16209a((C16211c) this.f50294o0, interfaceC18770c, 1);
                c16209a2.f50293Z = c13693c;
                C17296C c17296c2 = C17296C.f55119a;
                c16209a2.invokeSuspend(c17296c2);
                return c17296c2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C16210b c16210b;
        InterfaceC1436k interfaceC1436k;
        C16477y c16477y;
        String str;
        InterfaceC1436k interfaceC1436k2;
        C22038o c22038o;
        C16477y c16477y2;
        String str2;
        InterfaceC6733c interfaceC6733c = this.f50294o0;
        C17296C c17296c = C17296C.f55119a;
        switch (this.f50292Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                C13693c c13693c = this.f50293Z;
                Set set = C16210b.f50295e;
                if ((set instanceof Collection) && set.isEmpty()) {
                    c16210b = (C16210b) interfaceC6733c;
                    interfaceC1436k = c16210b.f50296a.f20276h;
                    AbstractC16544l.m18094g(c13693c, "<this>");
                    if (((Boolean) interfaceC1436k.invoke(c13693c.f43195a.f51018a)).booleanValue()) {
                        c16477y = c13693c.f43197c;
                        c16477y.m4529e("ChatGPT-Account-ID", c16210b.f50297b);
                        str = c16210b.f50298c;
                        if (str != null) {
                            c16477y.m4529e("ChatGPT-Residency-Region", str);
                        }
                    }
                } else {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (c13693c.f43200f.m20648b((C19666a) it.next())) {
                            break;
                        }
                    }
                    c16210b = (C16210b) interfaceC6733c;
                    interfaceC1436k = c16210b.f50296a.f20276h;
                    AbstractC16544l.m18094g(c13693c, "<this>");
                    if (((Boolean) interfaceC1436k.invoke(c13693c.f43195a.f51018a)).booleanValue()) {
                        c16477y = c13693c.f43197c;
                        c16477y.m4529e("ChatGPT-Account-ID", c16210b.f50297b);
                        str = c16210b.f50298c;
                        if (str != null) {
                            c16477y.m4529e("ChatGPT-Residency-Region", str);
                        }
                    }
                }
                break;
            default:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                C13693c c13693c2 = this.f50293Z;
                Set set2 = C16211c.f50300d;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    C16211c c16211c = (C16211c) interfaceC6733c;
                    interfaceC1436k2 = c16211c.f50301a.f20276h;
                    AbstractC16544l.m18094g(c13693c2, "<this>");
                    if (((Boolean) interfaceC1436k2.invoke(c13693c2.f43195a.f51018a)).booleanValue()) {
                        String str3 = c22038o.f69711a;
                        c16477y2 = c13693c2.f43197c;
                        c16477y2.m4529e("ChatGPT-Account-ID", str3);
                        str2 = c22038o.f69713c;
                        if (str2 != null) {
                            c16477y2.m4529e("ChatGPT-Residency-Region", str2);
                        }
                    }
                } else {
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        if (c13693c2.f43200f.m20648b((C19666a) it2.next())) {
                            break;
                        }
                    }
                    C16211c c16211c2 = (C16211c) interfaceC6733c;
                    interfaceC1436k2 = c16211c2.f50301a.f20276h;
                    AbstractC16544l.m18094g(c13693c2, "<this>");
                    if (((Boolean) interfaceC1436k2.invoke(c13693c2.f43195a.f51018a)).booleanValue() && (c22038o = c16211c2.f50302b) != null) {
                        String str4 = c22038o.f69711a;
                        c16477y2 = c13693c2.f43197c;
                        c16477y2.m4529e("ChatGPT-Account-ID", str4);
                        str2 = c22038o.f69713c;
                        if (str2 != null) {
                            c16477y2.m4529e("ChatGPT-Residency-Region", str2);
                        }
                    }
                }
                break;
        }
        return c17296c;
    }
}
