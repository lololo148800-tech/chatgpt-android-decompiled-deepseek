package id;

import gd.C13985r2;
import kotlin.jvm.internal.AbstractC16544l;
import p018Ag.C0503h;
import p046Bk.C1342O;
import p103Dn.InterfaceC2211v0;
import p1081wc.C20879Z;
import p1081wc.C20881a0;
import p1081wc.C20884c;
import p1153zg.C21889f;
import p1155zi.EnumC21895B;
import p223Ik.InterfaceC3740a;
import p248Jk.C4472c;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p530Vi.C8312h;
import p544W9.AbstractC8452B2;
import p853kd.C16371f;
import p853kd.C16372g;
import p902n8.C17514a;
import p949pj.C18438K;
import p949pj.C18470i0;
import sj.C19661b;
import sk.C19662a;
import vi.C20620b;

/* JADX INFO: renamed from: id.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C14970i implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46624a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4478i f46625b;

    public /* synthetic */ C14970i(InterfaceC4478i interfaceC4478i, int i10) {
        this.f46624a = i10;
        this.f46625b = interfaceC4478i;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f46624a) {
            case 0:
                Object obj = this.f46625b.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                return new C14969h((C14971j) obj);
            case 1:
                Object obj2 = this.f46625b.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                return new C16372g((C20620b) obj2, "app_review_coordinator", new C19662a(C16371f.Companion.serializer()), new C16371f(0));
            case 2:
                InterfaceC4478i interfaceC4478iM9063b = AbstractC8452B2.m9063b(this.f46625b);
                Object obj3 = (interfaceC4478iM9063b instanceof InterfaceC3740a ? (InterfaceC3740a) interfaceC4478iM9063b : new C4472c(interfaceC4478iM9063b)).get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                return (C19661b) obj3;
            case 3:
                return new C18438K((InterfaceC2211v0) this.f46625b.get());
            case 4:
                return new C18470i0(new C17514a(1), (InterfaceC2211v0) this.f46625b.get());
            case 5:
                Object obj4 = this.f46625b.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C20879Z((C8312h) obj4, EnumC21895B.f69419Z);
            case 6:
                Object obj5 = this.f46625b.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                return new C20881a0((C13985r2) obj5);
            default:
                Object obj6 = this.f46625b.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C21889f((C0503h) obj6);
        }
    }

    public /* synthetic */ C14970i(Object obj, InterfaceC4478i interfaceC4478i, int i10) {
        this.f46624a = i10;
        this.f46625b = interfaceC4478i;
    }

    public C14970i(C20884c c20884c, InterfaceC4478i interfaceC4478i, C1342O c1342o) {
        this.f46624a = 5;
        this.f46625b = interfaceC4478i;
    }
}
