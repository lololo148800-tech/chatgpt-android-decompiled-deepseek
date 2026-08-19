package p544W9;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p346Nn.InterfaceC5888b;
import p389Pn.C6517b;
import p389Pn.C6518c;
import p389Pn.C6520e;
import p389Pn.C6522g;
import p389Pn.C6524i;
import p389Pn.C6532q;
import p857kl.C16450Q;

/* JADX INFO: renamed from: W9.p4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8693p4 {
    /* JADX INFO: renamed from: a */
    public static void m9389a(InterfaceC5888b interfaceC5888b, InterfaceC1436k[] otherFormats, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(otherFormats, "otherFormats");
        ArrayList arrayList = new ArrayList(otherFormats.length);
        for (InterfaceC1436k interfaceC1436k2 : otherFormats) {
            InterfaceC5888b interfaceC5888bMo6299r = interfaceC5888b.mo6299r();
            interfaceC1436k2.invoke(interfaceC5888bMo6299r);
            arrayList.add(new C6522g(interfaceC5888bMo6299r.mo6291a().f21127a));
        }
        InterfaceC5888b interfaceC5888bMo6299r2 = interfaceC5888b.mo6299r();
        interfaceC1436k.invoke(interfaceC5888bMo6299r2);
        interfaceC5888b.mo6291a().m7087a(new C6517b(new C6522g(interfaceC5888bMo6299r2.mo6291a().f21127a), arrayList));
    }

    /* JADX INFO: renamed from: b */
    public static void m9390b(InterfaceC5888b interfaceC5888b, String onZero, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(onZero, "onZero");
        C6518c c6518cMo6291a = interfaceC5888b.mo6291a();
        InterfaceC5888b interfaceC5888bMo6299r = interfaceC5888b.mo6299r();
        interfaceC1436k.invoke(interfaceC5888bMo6299r);
        c6518cMo6291a.m7087a(new C6532q(onZero, new C6522g(interfaceC5888bMo6299r.mo6291a().f21127a)));
    }

    /* JADX INFO: renamed from: c */
    public static C6520e m9391c(InterfaceC5888b interfaceC5888b) {
        ArrayList formats = interfaceC5888b.mo6291a().f21127a;
        AbstractC16544l.m18094g(formats, "formats");
        return new C6520e(formats);
    }

    /* JADX INFO: renamed from: d */
    public static void m9392d(InterfaceC5888b interfaceC5888b, String value) {
        AbstractC16544l.m18094g(value, "value");
        interfaceC5888b.mo6291a().m7087a(new C6524i(value));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m9393e(C16450Q c16450q) {
        AbstractC16544l.m18094g(c16450q, "<this>");
        String str = c16450q.f51031a;
        return AbstractC16544l.m18089b(str, "https") || AbstractC16544l.m18089b(str, "wss");
    }
}
