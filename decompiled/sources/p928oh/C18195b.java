package p928oh;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import gl.C14189a;
import gl.C14192d;
import gl.C14194f;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mh.EnumC17264l;
import ml.AbstractC17292j;
import ml.C17290h;
import ml.C17291i;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p059C5.C1601s;
import p409Qk.C6752c;
import p488Tn.C7518a;
import p488Tn.InterfaceC7526i;
import p544W9.AbstractC8694q;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.AbstractC16435B;
import p857kl.AbstractC16474v;
import p857kl.C16438E;
import p857kl.C16477y;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: oh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18195b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f58021Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f58022Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ EnumC17264l f58023o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ File f58024p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18195b(EnumC17264l enumC17264l, File file, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58023o0 = enumC17264l;
        this.f58024p0 = file;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C18195b c18195b = new C18195b(this.f58023o0, this.f58024p0, interfaceC18770c);
        c18195b.f58022Z = obj;
        return c18195b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18195b) create((C6752c) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC17292j c17290h;
        final int i10 = 0;
        final int i11 = 1;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = this.f58021Y;
        if (i12 == 0) {
            AbstractC9233X.m9807c(obj);
            C6752c c6752c = (C6752c) this.f58022Z;
            C18194a c18194a = new C18194a(this.f58023o0, i10, this.f58024p0);
            C14189a c14189a = new C14189a();
            c18194a.invoke(c14189a);
            C14192d[] c14192dArr = (C14192d[]) c14189a.f44583a.toArray(new C14192d[0]);
            C14192d[] values = (C14192d[]) Arrays.copyOf(c14192dArr, c14192dArr.length);
            AbstractC16544l.m18094g(values, "values");
            ArrayList arrayList = new ArrayList();
            for (C14192d c14192d : values) {
                String strM18046b = c14192d.f44587a;
                C16477y c16477y = new C16477y();
                List list = AbstractC16435B.f50983a;
                Set set = AbstractC16474v.f51114a;
                if (AbstractC16474v.m18045a(strM18046b)) {
                    strM18046b = AbstractC16474v.m18046b(strM18046b);
                }
                c16477y.m4529e(SIPHeaderNames.CONTENT_DISPOSITION, "form-data; name=".concat(strM18046b));
                c16477y.m4530h(c14192d.f44589c);
                final Serializable serializable = c14192d.f44588b;
                if (serializable instanceof String) {
                    c17290h = new C17291i((String) serializable, new C1601s(11), c16477y.m18047Q());
                } else if (serializable instanceof Number) {
                    c17290h = new C17291i(serializable.toString(), new C1601s(11), c16477y.m18047Q());
                } else if (serializable instanceof Boolean) {
                    c17290h = new C17291i(String.valueOf(((Boolean) serializable).booleanValue()), new C1601s(11), c16477y.m18047Q());
                } else if (serializable instanceof byte[]) {
                    c16477y.m4529e(SIPHeaderNames.CONTENT_LENGTH, String.valueOf(((byte[]) serializable).length));
                    c17290h = new C17290h(new InterfaceC1426a() { // from class: gl.c
                        @Override // p049Bm.InterfaceC1426a
                        public final Object invoke() throws Exception {
                            switch (i10) {
                                case 0:
                                    byte[] bArr = (byte[]) serializable;
                                    int length = bArr.length;
                                    C7518a c7518a = new C7518a();
                                    c7518a.m7815P(bArr, 0, length);
                                    return c7518a;
                                case 1:
                                    return AbstractC8694q.m9394a((InterfaceC7526i) serializable);
                                default:
                                    ((InterfaceC7526i) serializable).close();
                                    return C17296C.f55119a;
                            }
                        }
                    }, new C1601s(11), c16477y.m18047Q());
                } else {
                    if (!(serializable instanceof InterfaceC7526i)) {
                        throw new IllegalStateException(("Unknown form content type: " + serializable).toString());
                    }
                    c16477y.m4529e(SIPHeaderNames.CONTENT_LENGTH, String.valueOf(AbstractC8694q.m9397d((InterfaceC7526i) serializable)));
                    final int i13 = 2;
                    c17290h = new C17290h(new InterfaceC1426a() { // from class: gl.c
                        @Override // p049Bm.InterfaceC1426a
                        public final Object invoke() throws Exception {
                            switch (i11) {
                                case 0:
                                    byte[] bArr = (byte[]) serializable;
                                    int length = bArr.length;
                                    C7518a c7518a = new C7518a();
                                    c7518a.m7815P(bArr, 0, length);
                                    return c7518a;
                                case 1:
                                    return AbstractC8694q.m9394a((InterfaceC7526i) serializable);
                                default:
                                    ((InterfaceC7526i) serializable).close();
                                    return C17296C.f55119a;
                            }
                        }
                    }, new InterfaceC1426a() { // from class: gl.c
                        @Override // p049Bm.InterfaceC1426a
                        public final Object invoke() throws Exception {
                            switch (i13) {
                                case 0:
                                    byte[] bArr = (byte[]) serializable;
                                    int length = bArr.length;
                                    C7518a c7518a = new C7518a();
                                    c7518a.m7815P(bArr, 0, length);
                                    return c7518a;
                                case 1:
                                    return AbstractC8694q.m9394a((InterfaceC7526i) serializable);
                                default:
                                    ((InterfaceC7526i) serializable).close();
                                    return C17296C.f55119a;
                            }
                        }
                    }, c16477y.m18047Q());
                }
                arrayList.add(c17290h);
            }
            C13693c c13693c = new C13693c();
            c13693c.m15168c(C16438E.f50985c);
            c13693c.f43198d = new C14194f(arrayList);
            c13693c.m15167b(null);
            AbstractC13695e.m15172b(c13693c, "transcribe");
            C14535j c14535j = new C14535j(c13693c, c6752c);
            this.f58021Y = 1;
            obj = c14535j.m16038c(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
