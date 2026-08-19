package p887m7;

import bb.AbstractC11330w;
import java.util.LinkedList;
import kotlin.jvm.internal.AbstractC16544l;
import p1007s7.C19462a;
import p1007s7.InterfaceC19469h;
import p676c7.C11682a;
import p765g7.InterfaceC13823a;
import p849k7.C16360m;
import p943p7.C18307e;

/* JADX INFO: renamed from: m7.u */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC17195u implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final LinkedList f54891Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC13823a f54892Z;

    /* JADX INFO: renamed from: o0 */
    public final C16360m f54893o0;

    public RunnableC17195u(LinkedList linkedList, InterfaceC13823a interfaceC13823a, C16360m feature) {
        AbstractC16544l.m18094g(feature, "feature");
        this.f54891Y = linkedList;
        this.f54892Z = interfaceC13823a;
        this.f54893o0 = feature;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC13823a interfaceC13823a = this.f54892Z;
        C11682a c11682aMo15466v = interfaceC13823a.mo15466v();
        if (c11682aMo15466v == null) {
            return;
        }
        C16360m c16360m = this.f54893o0;
        InterfaceC19469h interfaceC19469h = c16360m.f50813g;
        InterfaceC17178d interfaceC17178d = c16360m.f50814h;
        C19462a c19462aMo18918g = interfaceC19469h.mo18918g();
        if (c19462aMo18918g != null) {
            AbstractC11330w abstractC11330wMo10840b = interfaceC17178d.mo10840b(c11682aMo15466v, c19462aMo18918g.f61763b, c19462aMo18918g.f61764c);
            interfaceC19469h.mo18916e(c19462aMo18918g.f61762a, new C18307e(abstractC11330wMo10840b.f34261b), !abstractC11330wMo10840b.f34262c);
            if (abstractC11330wMo10840b instanceof C17191q) {
                LinkedList linkedList = this.f54891Y;
                linkedList.offer(new RunnableC17195u(linkedList, interfaceC13823a, c16360m));
            }
        }
    }
}
