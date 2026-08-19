package p1021t8;

import hm.InterfaceC14537b;
import hm.InterfaceC14538c;
import java.math.BigInteger;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p164G8.C3008b;
import p318Mh.C5429v;
import p571X9.AbstractC9306j0;
import p765g7.InterfaceC13823a;

/* JADX INFO: renamed from: t8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C19810a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C19813d f62846a;

    public C19810a(C19813d c19813d) {
        this.f62846a = c19813d;
    }

    /* JADX INFO: renamed from: a */
    public final void m20767a() {
        String strM21686T;
        BigInteger bigInteger;
        String string;
        C19813d c19813d = this.f62846a;
        InterfaceC14537b interfaceC14537bM5318b = c19813d.f9067p0.m5318b();
        InterfaceC14538c interfaceC14538cMo3833c = interfaceC14537bM5318b != null ? interfaceC14537bM5318b.mo3833c() : null;
        if (interfaceC14538cMo3833c != null) {
            String activeSpanId = interfaceC14538cMo3833c.mo3838a();
            C3008b c3008b = interfaceC14538cMo3833c instanceof C3008b ? (C3008b) interfaceC14538cMo3833c : null;
            if (c3008b == null || (bigInteger = c3008b.f9041d) == null || (string = bigInteger.toString(16)) == null || (strM21686T = AbstractC21322p.m21686T(32, string)) == null) {
                strM21686T = "";
            }
            AbstractC16544l.m18093f(activeSpanId, "activeSpanId");
            InterfaceC13823a interfaceC13823a = c19813d.f62860E0;
            AbstractC16544l.m18094g(interfaceC13823a, "<this>");
            interfaceC13823a.mo15460p("tracing", new C5429v(AbstractC9306j0.m9889h("context@", Thread.currentThread().getName()), activeSpanId, strM21686T, 1));
        }
    }
}
