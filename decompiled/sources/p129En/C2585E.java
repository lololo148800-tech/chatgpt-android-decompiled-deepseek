package p129En;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0625m0;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p153Fn.C2939q;
import p228J.AbstractC3812N;
import p485Tk.AbstractC7501j;
import p791hj.C14522e;
import p857kl.AbstractC16435B;
import p857kl.C16447N;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18775h;

/* JADX INFO: renamed from: En.E */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2585E implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8023Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f8024Z;

    public /* synthetic */ C2585E(Object obj, int i10) {
        this.f8023Y = i10;
        this.f8024Z = obj;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17296C c17296c = C17296C.f55119a;
        Object obj3 = this.f8024Z;
        switch (this.f8023Y) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                InterfaceC18774g interfaceC18774g = (InterfaceC18774g) obj2;
                InterfaceC18775h key = interfaceC18774g.getKey();
                InterfaceC18774g interfaceC18774g2 = ((C2582B) obj3).f8017Z.get(key);
                if (key == C0625m0.f1875Y) {
                    InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) interfaceC18774g2;
                    InterfaceC0627n0 parent = (InterfaceC0627n0) interfaceC18774g;
                    while (true) {
                        if (parent == null) {
                            parent = null;
                        } else if (parent != interfaceC0627n0 && (parent instanceof C2939q)) {
                            parent = ((C2939q) parent).getParent();
                        }
                    }
                    if (parent != interfaceC0627n0) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + interfaceC0627n0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (interfaceC0627n0 != null) {
                        iIntValue++;
                    }
                } else if (interfaceC18774g != interfaceC18774g2) {
                    iIntValue = Integer.MIN_VALUE;
                } else {
                    iIntValue++;
                }
                return Integer.valueOf(iIntValue);
            case 1:
                String key2 = (String) obj;
                List values = (List) obj2;
                AbstractC16544l.m18094g(key2, "key");
                AbstractC16544l.m18094g(values, "values");
                List list = AbstractC16435B.f50983a;
                if (!SIPHeaderNames.CONTENT_LENGTH.equals(key2) && !SIPHeaderNames.CONTENT_TYPE.equals(key2)) {
                    C2585E c2585e = (C2585E) obj3;
                    if (AbstractC7501j.f23804a.contains(key2)) {
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            c2585e.invoke(key2, (String) it.next());
                        }
                    } else {
                        c2585e.invoke(key2, AbstractC17680n.m19349Y(values, "Cookie".equals(key2) ? "; " : Separators.COMMA, null, null, 0, null, null, 62));
                    }
                }
                return c17296c;
            case 2:
                String key3 = (String) obj;
                String value = (String) obj2;
                AbstractC16544l.m18094g(key3, "key");
                AbstractC16544l.m18094g(value, "value");
                List list2 = AbstractC16435B.f50983a;
                if (!key3.equals(SIPHeaderNames.CONTENT_LENGTH)) {
                    ((C14522e) obj3).m16012b(key3, value);
                }
                return c17296c;
            case 3:
                String key4 = (String) obj;
                List values2 = (List) obj2;
                AbstractC16544l.m18094g(key4, "key");
                AbstractC16544l.m18094g(values2, "values");
                ((C16447N) obj3).f51026i.mo4533m(key4, values2);
                return c17296c;
            default:
                String name = (String) obj;
                List values3 = (List) obj2;
                AbstractC16544l.m18094g(name, "name");
                AbstractC16544l.m18094g(values3, "values");
                ((AbstractC3812N) obj3).mo4533m(name, values3);
                return c17296c;
        }
    }
}
