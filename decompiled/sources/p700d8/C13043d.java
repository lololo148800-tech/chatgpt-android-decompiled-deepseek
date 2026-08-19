package p700d8;

import android.gov.nist.core.Separators;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import kotlin.jvm.internal.AbstractC16544l;
import p009A7.C0392b;
import p1008s8.AbstractC19471B;
import p1008s8.C19470A;
import p1008s8.C19481j;
import p1008s8.C19489r;
import p210I7.InterfaceC3649a;
import p523V9.AbstractC7889G0;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p909nm.AbstractC17681o;
import p919o8.C17897G;
import p919o8.C17901H0;
import p919o8.C17946W1;
import p919o8.C17984k0;
import p919o8.C17994n1;

/* JADX INFO: renamed from: d8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13043d implements InterfaceC3649a {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC3649a f41446Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC3649a f41447Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC3649a f41448o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC3649a f41449p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC3649a f41450q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC3649a f41451r0;

    /* JADX INFO: renamed from: s0 */
    public final InterfaceC11256c f41452s0;

    public C13043d(InterfaceC3649a interfaceC3649a, InterfaceC3649a interfaceC3649a2, InterfaceC3649a interfaceC3649a3, InterfaceC3649a interfaceC3649a4, InterfaceC3649a interfaceC3649a5, InterfaceC3649a interfaceC3649a6, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f41446Y = interfaceC3649a;
        this.f41447Z = interfaceC3649a2;
        this.f41448o0 = interfaceC3649a3;
        this.f41449p0 = interfaceC3649a4;
        this.f41450q0 = interfaceC3649a5;
        this.f41451r0 = interfaceC3649a6;
        this.f41452s0 = internalLogger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13043d)) {
            return false;
        }
        C13043d c13043d = (C13043d) obj;
        return AbstractC16544l.m18089b(this.f41446Y, c13043d.f41446Y) && AbstractC16544l.m18089b(this.f41447Z, c13043d.f41447Z) && AbstractC16544l.m18089b(this.f41448o0, c13043d.f41448o0) && AbstractC16544l.m18089b(this.f41449p0, c13043d.f41449p0) && AbstractC16544l.m18089b(this.f41450q0, c13043d.f41450q0) && AbstractC16544l.m18089b(this.f41451r0, c13043d.f41451r0) && AbstractC16544l.m18089b(this.f41452s0, c13043d.f41452s0);
    }

    @Override // p210I7.InterfaceC3649a
    /* JADX INFO: renamed from: h */
    public final Object mo4356h(Object event) {
        Object obj;
        Object objMo4356h;
        Object objMo4356h2;
        Object objMo4356h3;
        C17984k0 c17984k0;
        C17984k0 c17984k1;
        Object objMo4356h4;
        Object objMo4356h5;
        AbstractC16544l.m18094g(event, "event");
        boolean z6 = event instanceof C17946W1;
        EnumC11255b enumC11255b = EnumC11255b.f34098Y;
        if (z6) {
            objMo4356h5 = this.f41446Y.mo4356h(event);
        } else if (event instanceof C17897G) {
            objMo4356h4 = this.f41449p0.mo4356h(event);
        } else if (event instanceof C17984k0) {
            c17984k0 = (C17984k0) event;
            boolean zM18089b = AbstractC16544l.m18089b(c17984k0.f57424u.f57260f, Boolean.TRUE);
            InterfaceC3649a interfaceC3649a = this.f41447Z;
            if (zM18089b) {
                C17984k0 c17984k2 = (C17984k0) interfaceC3649a.mo4356h(event);
                if (c17984k2 == null) {
                    AbstractC7889G0.m8184b(this.f41452s0, 4, enumC11255b, C13042c.f41443Z, null, false, 56);
                } else {
                    obj = c17984k2;
                }
            } else {
                c17984k1 = (C17984k0) interfaceC3649a.mo4356h(event);
            }
        } else if (event instanceof C17994n1) {
            objMo4356h3 = this.f41448o0.mo4356h(event);
        } else if (event instanceof C17901H0) {
            objMo4356h2 = this.f41450q0.mo4356h(event);
        } else if (event instanceof C19481j) {
            objMo4356h = this.f41451r0.mo4356h(event);
        } else {
            if (!(event instanceof C19489r ? true : event instanceof AbstractC19471B ? true : event instanceof C19470A)) {
                AbstractC7889G0.m8185c(this.f41452s0, 4, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), new C0392b(event, 7), null, 56);
            }
            obj = event;
        }
        if (z6 && (obj == null || obj != event)) {
            AbstractC7889G0.m8184b(this.f41452s0, 5, enumC11255b, new C0392b(event, 8), null, false, 56);
            return event;
        }
        obj = objMo4356h;
        obj = objMo4356h2;
        obj = objMo4356h3;
        obj = c17984k1;
        obj = c17984k0;
        obj = objMo4356h4;
        obj = objMo4356h5;
        if (obj == null) {
            AbstractC7889G0.m8184b(this.f41452s0, 3, enumC11255b, new C0392b(event, 9), null, false, 56);
        } else {
            if (obj == event) {
                return event;
            }
            AbstractC7889G0.m8184b(this.f41452s0, 4, enumC11255b, new C0392b(event, 10), null, false, 56);
        }
        return null;
    }

    public final int hashCode() {
        return this.f41452s0.hashCode() + ((this.f41451r0.hashCode() + ((this.f41450q0.hashCode() + ((this.f41449p0.hashCode() + ((this.f41448o0.hashCode() + ((this.f41447Z.hashCode() + (this.f41446Y.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RumEventMapper(viewEventMapper=" + this.f41446Y + wNrQXvwLiB.mvmMsdPH + this.f41447Z + ", resourceEventMapper=" + this.f41448o0 + ", actionEventMapper=" + this.f41449p0 + ", longTaskEventMapper=" + this.f41450q0 + ", telemetryConfigurationMapper=" + this.f41451r0 + ", internalLogger=" + this.f41452s0 + Separators.RPAREN;
    }
}
