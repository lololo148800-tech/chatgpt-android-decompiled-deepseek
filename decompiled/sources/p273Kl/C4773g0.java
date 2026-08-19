package p273Kl;

import io.livekit.android.room.C15102a;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitRtc$SessionDescription;
import livekit.LivekitRtc$SignalRequest;
import livekit.org.webrtc.SessionDescription;
import mm.C17296C;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8394f;
import p533Vl.AbstractC8396h;
import p533Vl.C8392d;
import p533Vl.C8393e;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p557Wl.AbstractC8959o;
import p571X9.AbstractC9233X;
import p793ho.C14720c4;
import p867l8.C16831c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4773g0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15564Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15565Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C15102a f15566o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ SessionDescription f15567p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4773g0(C15102a c15102a, SessionDescription sessionDescription, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15566o0 = c15102a;
        this.f15567p0 = sessionDescription;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4773g0 c4773g0 = new C4773g0(this.f15566o0, this.f15567p0, interfaceC18770c);
        c4773g0.f15565Z = obj;
        return c4773g0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4773g0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:67:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x010d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0133  */
    /* JADX WARN: Code duplicated, block: B:72:0x0137  */
    /* JADX WARN: Code duplicated, block: B:74:0x0148  */
    /* JADX WARN: Code duplicated, block: B:78:0x015f  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        AbstractC8394f c8393e;
        C4808y c4808y;
        AbstractC8394f c8393e2;
        EnumC8397i enumC8397i;
        EnumC8397i enumC8397i2;
        SessionDescription answer;
        C4808y c4808y2;
        Object objM5444h;
        SessionDescription sessionDescription;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15564Y;
        C17296C c17296c = C17296C.f55119a;
        C15102a c15102a = this.f15566o0;
        AbstractC8394f c8393e3 = null;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f15565Z;
            C4808y c4808y3 = c15102a.f46959s;
            if (c4808y3 != null) {
                this.f15565Z = interfaceC0571F;
                this.f15564Y = 1;
                obj = c4808y3.m5442f(this.f15567p0, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                c8393e = null;
            }
            if (c8393e == null) {
                c8393e = new C8393e("null");
            }
            if (c8393e instanceof C8393e) {
                C8395g c8395g = AbstractC8396h.Companion;
                enumC8397i = EnumC8397i.f26120q0;
                AbstractC8396h.Companion.getClass();
                if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18568f(new Object[0]);
                }
                return c17296c;
            }
            if (c15102a.f46965y) {
                return c17296c;
            }
            c4808y = c15102a.f46959s;
            if (c4808y != null) {
                C4771f0 c4771f0 = new C4771f0(2, null);
                this.f15565Z = null;
                this.f15564Y = 2;
                obj = c4808y.m5444h(c4771f0, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
                c8393e2 = (AbstractC8394f) obj;
            } else {
                c8393e2 = null;
            }
            if (c8393e2 == null) {
                c8393e2 = new C8393e("null");
            }
            if (!(c8393e2 instanceof C8392d)) {
                if (!(c8393e2 instanceof C8393e)) {
                    throw new C0644w();
                }
                C8395g c8395g2 = AbstractC8396h.Companion;
                enumC8397i2 = EnumC8397i.f26120q0;
                AbstractC8396h.Companion.getClass();
                if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0) {
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18568f(new Object[0]);
                }
                return c17296c;
            }
            answer = (SessionDescription) ((C8392d) c8393e2).f26113a;
            if (c15102a.f46965y) {
                return c17296c;
            }
            c4808y2 = c15102a.f46959s;
            if (c4808y2 != null) {
                C4769e0 c4769e0 = new C4769e0(answer, null);
                this.f15565Z = answer;
                this.f15564Y = 3;
                objM5444h = c4808y2.m5444h(c4769e0, this);
                if (objM5444h == enumC19250a) {
                    return enumC19250a;
                }
                sessionDescription = answer;
                obj = objM5444h;
                c8393e3 = (AbstractC8394f) obj;
                answer = sessionDescription;
            }
            if (c8393e3 == null) {
                c8393e3 = new C8393e("null");
            }
            if (c8393e3 instanceof C8392d) {
            }
            if (c15102a.f46965y) {
                return c17296c;
            }
            C4750V0 c4750v0 = c15102a.f46941a;
            c4750v0.getClass();
            AbstractC16544l.m18094g(answer, "answer");
            LivekitRtc$SessionDescription livekitRtc$SessionDescriptionM9572a = AbstractC8959o.m9572a(answer);
            C14720c4 c14720c4NewBuilder = LivekitRtc$SignalRequest.newBuilder();
            c14720c4NewBuilder.m13863d();
            ((LivekitRtc$SignalRequest) c14720c4NewBuilder.f36981Z).setAnswer(livekitRtc$SessionDescriptionM9572a);
            c4750v0.m5430t((LivekitRtc$SignalRequest) c14720c4NewBuilder.m13861b());
            return c17296c;
        }
        if (i10 == 1) {
            AbstractC9233X.m9807c(obj);
        } else {
            if (i10 == 2) {
                AbstractC9233X.m9807c(obj);
                c8393e2 = (AbstractC8394f) obj;
                if (c8393e2 == null) {
                    c8393e2 = new C8393e("null");
                }
                if (!(c8393e2 instanceof C8392d)) {
                    if (!(c8393e2 instanceof C8393e)) {
                        throw new C0644w();
                    }
                    C8395g c8395g3 = AbstractC8396h.Companion;
                    enumC8397i2 = EnumC8397i.f26120q0;
                    AbstractC8396h.Companion.getClass();
                    if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18568f(new Object[0]);
                    }
                    return c17296c;
                }
                answer = (SessionDescription) ((C8392d) c8393e2).f26113a;
                if (c15102a.f46965y) {
                    return c17296c;
                }
                c4808y2 = c15102a.f46959s;
                if (c4808y2 != null) {
                    C4769e0 c4769e1 = new C4769e0(answer, null);
                    this.f15565Z = answer;
                    this.f15564Y = 3;
                    objM5444h = c4808y2.m5444h(c4769e1, this);
                    if (objM5444h == enumC19250a) {
                        return enumC19250a;
                    }
                    sessionDescription = answer;
                    obj = objM5444h;
                }
                if (c8393e3 == null) {
                    c8393e3 = new C8393e("null");
                }
                if ((c8393e3 instanceof C8392d) && (c8393e3 instanceof C8393e)) {
                    C8395g c8395g4 = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i3 = EnumC8397i.f26120q0;
                    AbstractC8396h.Companion.getClass();
                    if (enumC8397i3.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18568f(new Object[0]);
                    }
                    return c17296c;
                }
                if (c15102a.f46965y) {
                    return c17296c;
                }
                C4750V0 c4750v1 = c15102a.f46941a;
                c4750v1.getClass();
                AbstractC16544l.m18094g(answer, "answer");
                LivekitRtc$SessionDescription livekitRtc$SessionDescriptionM9572a2 = AbstractC8959o.m9572a(answer);
                C14720c4 c14720c4NewBuilder2 = LivekitRtc$SignalRequest.newBuilder();
                c14720c4NewBuilder2.m13863d();
                ((LivekitRtc$SignalRequest) c14720c4NewBuilder2.f36981Z).setAnswer(livekitRtc$SessionDescriptionM9572a2);
                c4750v1.m5430t((LivekitRtc$SignalRequest) c14720c4NewBuilder2.m13861b());
                return c17296c;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sessionDescription = (SessionDescription) this.f15565Z;
            AbstractC9233X.m9807c(obj);
        }
        c8393e3 = (AbstractC8394f) obj;
        answer = sessionDescription;
        if (c8393e3 == null) {
            c8393e3 = new C8393e("null");
        }
        if (c8393e3 instanceof C8392d) {
        }
        if (c15102a.f46965y) {
            return c17296c;
        }
        C4750V0 c4750v2 = c15102a.f46941a;
        c4750v2.getClass();
        AbstractC16544l.m18094g(answer, "answer");
        LivekitRtc$SessionDescription livekitRtc$SessionDescriptionM9572a3 = AbstractC8959o.m9572a(answer);
        C14720c4 c14720c4NewBuilder3 = LivekitRtc$SignalRequest.newBuilder();
        c14720c4NewBuilder3.m13863d();
        ((LivekitRtc$SignalRequest) c14720c4NewBuilder3.f36981Z).setAnswer(livekitRtc$SessionDescriptionM9572a3);
        c4750v2.m5430t((LivekitRtc$SignalRequest) c14720c4NewBuilder3.m13861b());
        return c17296c;
        c8393e = (AbstractC8394f) obj;
        if (c8393e == null) {
            c8393e = new C8393e("null");
        }
        if (c8393e instanceof C8393e) {
            C8395g c8395g5 = AbstractC8396h.Companion;
            enumC8397i = EnumC8397i.f26120q0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18568f(new Object[0]);
            }
            return c17296c;
        }
        if (c15102a.f46965y) {
            return c17296c;
        }
        c4808y = c15102a.f46959s;
        if (c4808y != null) {
            C4771f0 c4771f1 = new C4771f0(2, null);
            this.f15565Z = null;
            this.f15564Y = 2;
            obj = c4808y.m5444h(c4771f1, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            c8393e2 = (AbstractC8394f) obj;
        } else {
            c8393e2 = null;
        }
        if (c8393e2 == null) {
            c8393e2 = new C8393e("null");
        }
        if (!(c8393e2 instanceof C8392d)) {
            if (!(c8393e2 instanceof C8393e)) {
                throw new C0644w();
            }
            C8395g c8395g6 = AbstractC8396h.Companion;
            enumC8397i2 = EnumC8397i.f26120q0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18568f(new Object[0]);
            }
            return c17296c;
        }
        answer = (SessionDescription) ((C8392d) c8393e2).f26113a;
        if (c15102a.f46965y) {
            return c17296c;
        }
        c4808y2 = c15102a.f46959s;
        if (c4808y2 != null) {
            C4769e0 c4769e2 = new C4769e0(answer, null);
            this.f15565Z = answer;
            this.f15564Y = 3;
            objM5444h = c4808y2.m5444h(c4769e2, this);
            if (objM5444h == enumC19250a) {
                return enumC19250a;
            }
            sessionDescription = answer;
            obj = objM5444h;
            c8393e3 = (AbstractC8394f) obj;
            answer = sessionDescription;
        }
        if (c8393e3 == null) {
            c8393e3 = new C8393e("null");
        }
        if (c8393e3 instanceof C8392d) {
        }
        if (c15102a.f46965y) {
            return c17296c;
        }
        C4750V0 c4750v3 = c15102a.f46941a;
        c4750v3.getClass();
        AbstractC16544l.m18094g(answer, "answer");
        LivekitRtc$SessionDescription livekitRtc$SessionDescriptionM9572a4 = AbstractC8959o.m9572a(answer);
        C14720c4 c14720c4NewBuilder4 = LivekitRtc$SignalRequest.newBuilder();
        c14720c4NewBuilder4.m13863d();
        ((LivekitRtc$SignalRequest) c14720c4NewBuilder4.f36981Z).setAnswer(livekitRtc$SessionDescriptionM9572a4);
        c4750v3.m5430t((LivekitRtc$SignalRequest) c14720c4NewBuilder4.m13861b());
        return c17296c;
    }
}
