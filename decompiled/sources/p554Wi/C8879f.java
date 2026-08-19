package p554Wi;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p580Xi.C9519e;

/* JADX INFO: renamed from: Wi.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C8879f extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27179Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Throwable f27180Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC8882i f27181o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8879f(Throwable th2, InterfaceC8882i interfaceC8882i, int i10) {
        super(1);
        this.f27179Y = i10;
        this.f27180Z = th2;
        this.f27181o0 = interfaceC8882i;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:9:0x004e  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f27179Y) {
            case 0:
                Map it = (Map) obj;
                AbstractC16544l.m18094g(it, "it");
                Throwable th2 = this.f27180Z;
                it.put("error", th2.toString());
                InterfaceC8882i interfaceC8882i = this.f27181o0;
                if (interfaceC8882i instanceof C9519e) {
                    C9519e c9519e = (C9519e) interfaceC8882i;
                    if (AbstractC16544l.m18089b(c9519e.f28651r0, "")) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(interfaceC8882i.getType());
                        sb2.append('-');
                        sb2.append(interfaceC8882i.getClass());
                        it.put("plugin", sb2.toString());
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        ((C9519e) interfaceC8882i).getClass();
                        sb3.append(EnumC8881h.f27185o0);
                        sb3.append('-');
                        sb3.append(c9519e.f28651r0);
                        it.put("plugin", sb3.toString());
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(interfaceC8882i.getType());
                    sb4.append('-');
                    sb4.append(interfaceC8882i.getClass());
                    it.put("plugin", sb4.toString());
                }
                it.put("writekey", interfaceC8882i.mo7804c().f25902Y.f25915a);
                it.put("message", "Exception executing plugin");
                String string = th2.getStackTrace()[0].toString();
                AbstractC16544l.m18093f(string, "t.stackTrace[0].toString()");
                it.put("caller", string);
                break;
            default:
                Map it2 = (Map) obj;
                AbstractC16544l.m18094g(it2, "it");
                Throwable th3 = this.f27180Z;
                it2.put("error", th3.toString());
                InterfaceC8882i interfaceC8882i2 = this.f27181o0;
                if (interfaceC8882i2 instanceof C9519e) {
                    C9519e c9519e2 = (C9519e) interfaceC8882i2;
                    if (AbstractC16544l.m18089b(c9519e2.f28651r0, "")) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(interfaceC8882i2.getType());
                        sb5.append('-');
                        sb5.append(interfaceC8882i2.getClass());
                        it2.put("plugin", sb5.toString());
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        ((C9519e) interfaceC8882i2).getClass();
                        sb6.append(EnumC8881h.f27185o0);
                        sb6.append('-');
                        sb6.append(c9519e2.f28651r0);
                        it2.put("plugin", sb6.toString());
                    }
                } else {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(interfaceC8882i2.getType());
                    sb7.append('-');
                    sb7.append(interfaceC8882i2.getClass());
                    it2.put("plugin", sb7.toString());
                }
                it2.put("writekey", interfaceC8882i2.mo7804c().f25902Y.f25915a);
                it2.put("message", "Exception executing plugin");
                String string2 = th3.getStackTrace()[0].toString();
                AbstractC16544l.m18093f(string2, "t.stackTrace[0].toString()");
                it2.put("caller", string2);
                break;
        }
        return C17296C.f55119a;
    }
}
