package p677c8;

import kotlin.jvm.internal.AbstractC16544l;
import p140Fa.C2685e;
import p523V9.AbstractC8230x4;
import p658b5.C11248s;
import p700d8.C13044e;
import p743f7.C13579e;
import p743f7.InterfaceC13575a;
import p743f7.InterfaceC13576b;
import p765g7.InterfaceC13823a;
import p775h2.AbstractC14376f;
import p919o8.C17946W1;

/* JADX INFO: renamed from: c8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C11690b implements InterfaceC13575a {

    /* JADX INFO: renamed from: p0 */
    public static final byte[] f35472p0 = new byte[0];

    /* JADX INFO: renamed from: Y */
    public final C11248s f35473Y;

    /* JADX INFO: renamed from: Z */
    public final C2685e f35474Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC13823a f35475o0;

    public C11690b(C11248s c11248s, C2685e c2685e, InterfaceC13823a interfaceC13823a) {
        this.f35473Y = c11248s;
        this.f35474Z = c2685e;
        this.f35475o0 = interfaceC13823a;
    }

    @Override // p743f7.InterfaceC13575a
    /* JADX INFO: renamed from: a */
    public final boolean mo12662a(InterfaceC13576b writer, Object element, int i10) {
        C13579e c13579e;
        boolean zMo15101a;
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(element, "element");
        AbstractC14376f.m15825D(i10, "eventType");
        byte[] bArrM8864b = AbstractC8230x4.m8864b(this.f35473Y, element, this.f35475o0.mo15463s());
        if (bArrM8864b == null) {
            return false;
        }
        if (element instanceof C17946W1) {
            C17946W1 c17946w1 = (C17946W1) element;
            byte[] bArrM8864b2 = AbstractC8230x4.m8864b(this.f35474Z, new C13044e(c17946w1.f57250q.f57553d, c17946w1.f57242i.f57197a), this.f35475o0.mo15463s());
            if (bArrM8864b2 == null) {
                bArrM8864b2 = f35472p0;
            }
            c13579e = new C13579e(bArrM8864b, bArrM8864b2);
        } else {
            c13579e = new C13579e(bArrM8864b, C13579e.f42928c);
        }
        synchronized (this) {
            zMo15101a = writer.mo15101a(c13579e, i10);
            if (zMo15101a && (element instanceof C17946W1)) {
                this.f35475o0.mo15461q(bArrM8864b);
            }
        }
        return zMo15101a;
    }
}
