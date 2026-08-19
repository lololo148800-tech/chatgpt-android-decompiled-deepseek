package p1089wl;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: wl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C21008b extends AbstractC21011e {

    /* JADX INFO: renamed from: Z */
    public final List f66859Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC18776i f66860o0;

    /* JADX INFO: renamed from: p0 */
    public Object f66861p0;

    /* JADX INFO: renamed from: q0 */
    public int f66862q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21008b(Object context, List interceptors, Object subject, InterfaceC18776i interfaceC18776i) {
        super(context);
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(interceptors, "interceptors");
        AbstractC16544l.m18094g(subject, "subject");
        this.f66859Z = interceptors;
        this.f66860o0 = interfaceC18776i;
        this.f66861p0 = subject;
    }

    @Override // p1089wl.AbstractC21011e
    /* JADX INFO: renamed from: a */
    public final Object mo21462a(Object obj, AbstractC19687c abstractC19687c) {
        this.f66862q0 = 0;
        AbstractC16544l.m18094g(obj, "<set-?>");
        this.f66861p0 = obj;
        return mo21464c(abstractC19687c);
    }

    @Override // p1089wl.AbstractC21011e
    /* JADX INFO: renamed from: b */
    public final Object mo21463b() {
        return this.f66861p0;
    }

    @Override // p1089wl.AbstractC21011e
    /* JADX INFO: renamed from: c */
    public final Object mo21464c(InterfaceC18770c interfaceC18770c) {
        int i10 = this.f66862q0;
        if (i10 < 0) {
            return this.f66861p0;
        }
        if (i10 < this.f66859Z.size()) {
            return m21466e(interfaceC18770c);
        }
        this.f66862q0 = -1;
        return this.f66861p0;
    }

    @Override // p1089wl.AbstractC21011e
    /* JADX INFO: renamed from: d */
    public final Object mo21465d(Object obj, InterfaceC18770c interfaceC18770c) {
        AbstractC16544l.m18094g(obj, "<set-?>");
        this.f66861p0 = obj;
        return mo21464c(interfaceC18770c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m21466e(InterfaceC18770c interfaceC18770c) {
        C21007a c21007a;
        C21008b c21008b;
        InterfaceC1440o interfaceC1440o;
        Object obj;
        if (interfaceC18770c instanceof C21007a) {
            c21007a = (C21007a) interfaceC18770c;
            int i10 = c21007a.f66858p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21007a.f66858p0 = i10 - Integer.MIN_VALUE;
            } else {
                c21007a = new C21007a(this, interfaceC18770c);
            }
        } else {
            c21007a = new C21007a(this, interfaceC18770c);
        }
        Object obj2 = c21007a.f66856Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c21007a.f66858p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj2);
            c21008b = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c21008b = c21007a.f66855Y;
            AbstractC9233X.m9807c(obj2);
        }
        do {
            int i12 = c21008b.f66862q0;
            if (i12 != -1) {
                List list = c21008b.f66859Z;
                if (i12 >= list.size()) {
                    c21008b.f66862q0 = -1;
                } else {
                    interfaceC1440o = (InterfaceC1440o) list.get(i12);
                    c21008b.f66862q0 = i12 + 1;
                    obj = c21008b.f66861p0;
                    c21007a.f66855Y = c21008b;
                    c21007a.f66858p0 = 1;
                }
            }
            return c21008b.f66861p0;
        } while (interfaceC1440o.invoke(c21008b, obj, c21007a) != enumC19250a);
        return enumC19250a;
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f66860o0;
    }
}
