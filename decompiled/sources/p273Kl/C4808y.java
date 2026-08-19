package p273Kl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.SessionDescription;
import mm.C17296C;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21322p;
import p1160zp.AbstractC22225a;
import p153Fn.C2925c;
import p482Tg.C7448e;
import p533Vl.AbstractC8394f;
import p533Vl.AbstractC8396h;
import p533Vl.C8392d;
import p533Vl.C8393e;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p571X9.AbstractC9233X;
import p583Xl.AbstractC9537d;
import p668c.C11548h;
import p817j$.util.Objects;
import p867l8.C16831c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C4808y {

    /* JADX INFO: renamed from: a */
    public final C4716E f15678a;

    /* JADX INFO: renamed from: b */
    public final C11548h f15679b;

    /* JADX INFO: renamed from: c */
    public final PeerConnection f15680c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f15681d;

    /* JADX INFO: renamed from: e */
    public boolean f15682e;

    /* JADX INFO: renamed from: f */
    public boolean f15683f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f15684g;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f15685h;

    /* JADX INFO: renamed from: i */
    public final C7448e f15686i;

    public C4808y(PeerConnection.RTCConfiguration config, PeerConnection.Observer pcObserver, C4716E c4716e, AbstractC0563B ioDispatcher, PeerConnectionFactory connectionFactory, C11548h sdpFactory) {
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(pcObserver, "pcObserver");
        AbstractC16544l.m18094g(ioDispatcher, "ioDispatcher");
        AbstractC16544l.m18094g(connectionFactory, "connectionFactory");
        AbstractC16544l.m18094g(sdpFactory, "sdpFactory");
        this.f15678a = c4716e;
        this.f15679b = sdpFactory;
        C2925c c2925cM1174c = AbstractC0575H.m1174c(ioDispatcher.plus(AbstractC0575H.m1176e()));
        Object objM10030a = AbstractC9537d.m10030a(new C4788o(connectionFactory, config, pcObserver));
        AbstractC16544l.m18093f(objM10030a, "executeBlockingOnRTCThread(...)");
        this.f15680c = (PeerConnection) objM10030a;
        this.f15681d = new ArrayList();
        this.f15684g = new LinkedHashMap();
        this.f15685h = new AtomicBoolean(false);
        this.f15686i = new C7448e(new C16525B(), c2925cM1174c, new C4786n(this, null));
    }

    /* JADX INFO: renamed from: a */
    public final Object m5437a(AbstractC19694j abstractC19694j) {
        C4768e c4768e = new C4768e(this, null);
        if (this.f15685h.get()) {
            return null;
        }
        return AbstractC9537d.m10032c(new C4784m(c4768e, this, null), abstractC19694j);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m5438b(MediaConstraints mediaConstraints, AbstractC19687c abstractC19687c) {
        C4772g c4772g;
        C16525B c16525b;
        C4808y c4808y;
        C16525B c16525b2;
        Object obj;
        if (abstractC19687c instanceof C4772g) {
            c4772g = (C4772g) abstractC19687c;
            int i10 = c4772g.f15563q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4772g.f15563q0 = i10 - Integer.MIN_VALUE;
            } else {
                c4772g = new C4772g(this, abstractC19687c);
            }
        } else {
            c4772g = new C4772g(this, abstractC19687c);
        }
        Object obj2 = c4772g.f15561o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4772g.f15563q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj2);
            if (this.f15678a == null) {
                return c17296c;
            }
            c16525b = new C16525B();
            C4774h c4774h = new C4774h(mediaConstraints, this, c16525b, null);
            if (this.f15685h.get()) {
                c4808y = this;
            } else {
                C4784m c4784m = new C4784m(c4774h, this, null);
                c4772g.f15559Y = this;
                c4772g.f15560Z = c16525b;
                c4772g.f15563q0 = 1;
                if (AbstractC9537d.m10032c(c4784m, c4772g) == enumC19250a) {
                    return enumC19250a;
                }
                c4808y = this;
                c16525b2 = c16525b;
            }
            obj = c16525b.f51262Y;
            if (obj != null) {
                C4716E c4716e = c4808y.f15678a;
                c4716e.getClass();
                AbstractC9537d.m10031b(new C4714D(c4716e, (SessionDescription) obj, false, 1));
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c16525b2 = c4772g.f15560Z;
        c4808y = c4772g.f15559Y;
        AbstractC9233X.m9807c(obj2);
        c16525b = c16525b2;
        obj = c16525b.f51262Y;
        if (obj != null) {
            C4716E c4716e2 = c4808y.f15678a;
            c4716e2.getClass();
            AbstractC9537d.m10031b(new C4714D(c4716e2, (SessionDescription) obj, false, 1));
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Enum m5439c(AbstractC19687c abstractC19687c) {
        C4776i c4776i;
        Object obj;
        PeerConnection.IceConnectionState iceConnectionState;
        if (abstractC19687c instanceof C4776i) {
            c4776i = (C4776i) abstractC19687c;
            int i10 = c4776i.f15577o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4776i.f15577o0 = i10 - Integer.MIN_VALUE;
            } else {
                c4776i = new C4776i(this, abstractC19687c);
            }
        } else {
            c4776i = new C4776i(this, abstractC19687c);
        }
        Object objM10032c = c4776i.f15575Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4776i.f15577o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10032c);
            obj = null;
            C4778j c4778j = new C4778j(this, null);
            if (!this.f15685h.get()) {
                C4784m c4784m = new C4784m(c4778j, this, null);
                c4776i.f15577o0 = 1;
                objM10032c = AbstractC9537d.m10032c(c4784m, c4776i);
                if (objM10032c == enumC19250a) {
                    return enumC19250a;
                }
            }
            iceConnectionState = (PeerConnection.IceConnectionState) obj;
            if (iceConnectionState == null) {
                return PeerConnection.IceConnectionState.CLOSED;
            }
            return iceConnectionState;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(objM10032c);
        obj = objM10032c;
        iceConnectionState = (PeerConnection.IceConnectionState) obj;
        if (iceConnectionState == null) {
            return PeerConnection.IceConnectionState.CLOSED;
        }
        return iceConnectionState;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m5440d(AbstractC19687c abstractC19687c) {
        C4780k c4780k;
        Object obj;
        Boolean bool;
        boolean zBooleanValue;
        if (abstractC19687c instanceof C4780k) {
            c4780k = (C4780k) abstractC19687c;
            int i10 = c4780k.f15586o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4780k.f15586o0 = i10 - Integer.MIN_VALUE;
            } else {
                c4780k = new C4780k(this, abstractC19687c);
            }
        } else {
            c4780k = new C4780k(this, abstractC19687c);
        }
        Object objM10032c = c4780k.f15584Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4780k.f15586o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10032c);
            obj = null;
            C4782l c4782l = new C4782l(this, null);
            if (!this.f15685h.get()) {
                C4784m c4784m = new C4784m(c4782l, this, null);
                c4780k.f15586o0 = 1;
                objM10032c = AbstractC9537d.m10032c(c4784m, c4780k);
                if (objM10032c == enumC19250a) {
                    return enumC19250a;
                }
            }
            bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(objM10032c);
        obj = objM10032c;
        bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0132  */
    /* JADX WARN: Code duplicated, block: B:63:0x0147 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x014d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0156  */
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0179  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x0194  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a5  */
    /* JADX INFO: renamed from: e */
    public final Object m5441e(SessionDescription sessionDescription, String str, boolean z6, AbstractC19687c abstractC19687c) {
        C4790p c4790p;
        C4808y c4808y;
        SessionDescription sessionDescription2;
        SessionDescription sessionDescription3;
        SessionDescription sessionDescription4;
        Object c8393e;
        Object obj;
        CharSequence charSequence;
        EnumC8397i enumC8397i;
        EnumC8397i enumC8397i2;
        C4794r c4794r;
        Object c8393e2;
        Object obj2;
        CharSequence charSequence2;
        EnumC8397i enumC8397i3;
        EnumC8397i enumC8397i4;
        if (abstractC19687c instanceof C4790p) {
            c4790p = (C4790p) abstractC19687c;
            int i10 = c4790p.f15628s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4790p.f15628s0 = i10 - Integer.MIN_VALUE;
            } else {
                c4790p = new C4790p(this, abstractC19687c);
            }
        } else {
            c4790p = new C4790p(this, abstractC19687c);
        }
        Object objM10032c = c4790p.f15626q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4790p.f15628s0;
        Object obj3 = null;
        if (i11 != 0) {
            if (i11 == 1) {
                z6 = c4790p.f15625p0;
                sessionDescription3 = c4790p.f15624o0;
                sessionDescription2 = c4790p.f15623Z;
                c4808y = (C4808y) c4790p.f15622Y;
                AbstractC9233X.m9807c(objM10032c);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sessionDescription = (SessionDescription) c4790p.f15622Y;
                AbstractC9233X.m9807c(objM10032c);
            }
            obj3 = objM10032c;
            c8393e2 = (AbstractC8394f) obj3;
            if (c8393e2 == null) {
                c8393e2 = new C8393e("PCT closed");
            }
            if (c8393e2 instanceof C8393e) {
                obj2 = ((C8393e) c8393e2).f26114a;
                charSequence2 = (CharSequence) obj2;
                if (charSequence2 != null && !AbstractC21322p.m21681O(charSequence2)) {
                }
                C8395g c8395g = AbstractC8396h.Companion;
                enumC8397i3 = EnumC8397i.f26119p0;
                AbstractC8396h.Companion.getClass();
                enumC8397i4 = AbstractC8396h.f26115a;
                if (enumC8397i3.compareTo(enumC8397i4) >= 0 && AbstractC22225a.m22419a() > 0) {
                    Objects.toString(sessionDescription.type);
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18571j(new Object[0]);
                }
                if (enumC8397i3.compareTo(enumC8397i4) >= 0 && AbstractC22225a.m22419a() > 0) {
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18571j(new Object[0]);
                }
            }
            return sessionDescription;
        }
        AbstractC9233X.m9807c(objM10032c);
        SessionDescription sessionDescription5 = new SessionDescription(sessionDescription.type, str);
        C8395g c8395g2 = AbstractC8396h.Companion;
        EnumC8397i enumC8397i5 = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        EnumC8397i enumC8397i6 = AbstractC8396h.f26115a;
        if (enumC8397i5.compareTo(enumC8397i6) >= 0 && AbstractC22225a.m22419a() > 0) {
            Objects.toString(sessionDescription.type);
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
        }
        if (enumC8397i5.compareTo(enumC8397i6) >= 0 && AbstractC22225a.m22419a() > 0) {
            Objects.toString(sessionDescription5.type);
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
        }
        C4792q c4792q = new C4792q(z6, this, sessionDescription5, null);
        if (this.f15685h.get()) {
            c4808y = this;
            sessionDescription4 = sessionDescription5;
            objM10032c = null;
        } else {
            C4784m c4784m = new C4784m(c4792q, this, null);
            c4790p.f15622Y = this;
            c4790p.f15623Z = sessionDescription;
            c4790p.f15624o0 = sessionDescription5;
            c4790p.f15625p0 = z6;
            c4790p.f15628s0 = 1;
            Object objM10032c2 = AbstractC9537d.m10032c(c4784m, c4790p);
            if (objM10032c2 == enumC19250a) {
                return enumC19250a;
            }
            c4808y = this;
            sessionDescription2 = sessionDescription;
            sessionDescription3 = sessionDescription5;
            objM10032c = objM10032c2;
        }
        c8393e = (AbstractC8394f) objM10032c;
        if (c8393e == null) {
            c8393e = new C8393e("PCT closed");
        }
        if (c8393e instanceof C8392d) {
            return sessionDescription4;
        }
        if (c8393e instanceof C8393e) {
            throw new C0644w();
        }
        obj = ((C8393e) c8393e).f26114a;
        charSequence = (CharSequence) obj;
        if (charSequence != null && !AbstractC21322p.m21681O(charSequence)) {
        }
        C8395g c8395g3 = AbstractC8396h.Companion;
        enumC8397i = EnumC8397i.f26119p0;
        AbstractC8396h.Companion.getClass();
        enumC8397i2 = AbstractC8396h.f26115a;
        if (enumC8397i.compareTo(enumC8397i2) >= 0 && AbstractC22225a.m22419a() > 0) {
            Objects.toString(sessionDescription4.type);
            AbstractC22225a.f70470a.getClass();
            C16831c.m18571j(new Object[0]);
        }
        if (enumC8397i.compareTo(enumC8397i2) >= 0 && AbstractC22225a.m22419a() > 0) {
            AbstractC22225a.f70470a.getClass();
            C16831c.m18571j(new Object[0]);
        }
        c4794r = new C4794r(z6, c4808y, sessionDescription, null);
        if (!c4808y.f15685h.get()) {
            C4784m c4784m2 = new C4784m(c4794r, c4808y, null);
            c4790p.f15622Y = sessionDescription;
            c4790p.f15623Z = null;
            c4790p.f15624o0 = null;
            c4790p.f15625p0 = z6;
            c4790p.f15628s0 = 2;
            objM10032c = AbstractC9537d.m10032c(c4784m2, c4790p);
            if (objM10032c == enumC19250a) {
                return enumC19250a;
            }
            obj3 = objM10032c;
        }
        c8393e2 = (AbstractC8394f) obj3;
        if (c8393e2 == null) {
            c8393e2 = new C8393e("PCT closed");
        }
        if (c8393e2 instanceof C8393e) {
            obj2 = ((C8393e) c8393e2).f26114a;
            charSequence2 = (CharSequence) obj2;
            if (charSequence2 != null) {
            }
            C8395g c8395g4 = AbstractC8396h.Companion;
            enumC8397i3 = EnumC8397i.f26119p0;
            AbstractC8396h.Companion.getClass();
            enumC8397i4 = AbstractC8396h.f26115a;
            if (enumC8397i3.compareTo(enumC8397i4) >= 0) {
                Objects.toString(sessionDescription.type);
                AbstractC22225a.f70470a.getClass();
                C16831c.m18571j(new Object[0]);
            }
            if (enumC8397i3.compareTo(enumC8397i4) >= 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18571j(new Object[0]);
            }
        }
        return sessionDescription;
        SessionDescription sessionDescription6 = sessionDescription2;
        sessionDescription4 = sessionDescription3;
        sessionDescription = sessionDescription6;
        c8393e = (AbstractC8394f) objM10032c;
        if (c8393e == null) {
            c8393e = new C8393e("PCT closed");
        }
        if (c8393e instanceof C8392d) {
            return sessionDescription4;
        }
        if (c8393e instanceof C8393e) {
            throw new C0644w();
        }
        obj = ((C8393e) c8393e).f26114a;
        charSequence = (CharSequence) obj;
        if (charSequence != null) {
        }
        C8395g c8395g5 = AbstractC8396h.Companion;
        enumC8397i = EnumC8397i.f26119p0;
        AbstractC8396h.Companion.getClass();
        enumC8397i2 = AbstractC8396h.f26115a;
        if (enumC8397i.compareTo(enumC8397i2) >= 0) {
            Objects.toString(sessionDescription4.type);
            AbstractC22225a.f70470a.getClass();
            C16831c.m18571j(new Object[0]);
        }
        if (enumC8397i.compareTo(enumC8397i2) >= 0) {
            AbstractC22225a.f70470a.getClass();
            C16831c.m18571j(new Object[0]);
        }
        c4794r = new C4794r(z6, c4808y, sessionDescription, null);
        if (!c4808y.f15685h.get()) {
            C4784m c4784m3 = new C4784m(c4794r, c4808y, null);
            c4790p.f15622Y = sessionDescription;
            c4790p.f15623Z = null;
            c4790p.f15624o0 = null;
            c4790p.f15625p0 = z6;
            c4790p.f15628s0 = 2;
            objM10032c = AbstractC9537d.m10032c(c4784m3, c4790p);
            if (objM10032c == enumC19250a) {
                return enumC19250a;
            }
            obj3 = objM10032c;
        }
        c8393e2 = (AbstractC8394f) obj3;
        if (c8393e2 == null) {
            c8393e2 = new C8393e("PCT closed");
        }
        if (c8393e2 instanceof C8393e) {
            obj2 = ((C8393e) c8393e2).f26114a;
            charSequence2 = (CharSequence) obj2;
            if (charSequence2 != null) {
            }
            C8395g c8395g6 = AbstractC8396h.Companion;
            enumC8397i3 = EnumC8397i.f26119p0;
            AbstractC8396h.Companion.getClass();
            enumC8397i4 = AbstractC8396h.f26115a;
            if (enumC8397i3.compareTo(enumC8397i4) >= 0) {
                Objects.toString(sessionDescription.type);
                AbstractC22225a.f70470a.getClass();
                C16831c.m18571j(new Object[0]);
            }
            if (enumC8397i3.compareTo(enumC8397i4) >= 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18571j(new Object[0]);
            }
        }
        return sessionDescription;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m5442f(SessionDescription sessionDescription, AbstractC19687c abstractC19687c) {
        C4796s c4796s;
        Object obj;
        C4808y c4808y;
        AbstractC8394f abstractC8394f;
        AbstractC8394f c8393e;
        AbstractC8394f abstractC8394f2;
        if (abstractC19687c instanceof C4796s) {
            c4796s = (C4796s) abstractC19687c;
            int i10 = c4796s.f15645p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4796s.f15645p0 = i10 - Integer.MIN_VALUE;
            } else {
                c4796s = new C4796s(this, abstractC19687c);
            }
        } else {
            c4796s = new C4796s(this, abstractC19687c);
        }
        Object objM10032c = c4796s.f15643Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4796s.f15645p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c4808y = (C4808y) c4796s.f15642Y;
                AbstractC9233X.m9807c(objM10032c);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC8394f2 = (AbstractC8394f) c4796s.f15642Y;
                AbstractC9233X.m9807c(objM10032c);
            }
            return abstractC8394f2;
        }
        AbstractC9233X.m9807c(objM10032c);
        obj = null;
        C4798t c4798t = new C4798t(this, sessionDescription, null);
        if (this.f15685h.get()) {
            c4808y = this;
        } else {
            C4784m c4784m = new C4784m(c4798t, this, null);
            c4796s.f15642Y = this;
            c4796s.f15645p0 = 1;
            objM10032c = AbstractC9537d.m10032c(c4784m, c4796s);
            if (objM10032c == enumC19250a) {
                return enumC19250a;
            }
            c4808y = this;
        }
        abstractC8394f = (AbstractC8394f) obj;
        if (abstractC8394f == null) {
            c8393e = new C8393e("PCT is closed.");
        } else {
            c8393e = abstractC8394f;
        }
        if (c4808y.f15683f) {
            return c8393e;
        }
        c4808y.f15683f = false;
        c4796s.f15642Y = c8393e;
        c4796s.f15645p0 = 2;
        if (c4808y.m5438b(new MediaConstraints(), c4796s) == enumC19250a) {
            return enumC19250a;
        }
        abstractC8394f2 = c8393e;
        return abstractC8394f2;
        obj = objM10032c;
        abstractC8394f = (AbstractC8394f) obj;
        if (abstractC8394f == null) {
            c8393e = new C8393e("PCT is closed.");
        } else {
            c8393e = abstractC8394f;
        }
        if (c4808y.f15683f) {
            return c8393e;
        }
        c4808y.f15683f = false;
        c4796s.f15642Y = c8393e;
        c4796s.f15645p0 = 2;
        if (c4808y.m5438b(new MediaConstraints(), c4796s) == enumC19250a) {
            return enumC19250a;
        }
        abstractC8394f2 = c8393e;
        return abstractC8394f2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Enum m5443g(AbstractC19687c abstractC19687c) {
        C4800u c4800u;
        Object obj;
        PeerConnection.SignalingState signalingState;
        if (abstractC19687c instanceof C4800u) {
            c4800u = (C4800u) abstractC19687c;
            int i10 = c4800u.f15657o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4800u.f15657o0 = i10 - Integer.MIN_VALUE;
            } else {
                c4800u = new C4800u(this, abstractC19687c);
            }
        } else {
            c4800u = new C4800u(this, abstractC19687c);
        }
        Object objM10032c = c4800u.f15655Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4800u.f15657o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10032c);
            obj = null;
            C4802v c4802v = new C4802v(this, null);
            if (!this.f15685h.get()) {
                C4784m c4784m = new C4784m(c4802v, this, null);
                c4800u.f15657o0 = 1;
                objM10032c = AbstractC9537d.m10032c(c4784m, c4800u);
                if (objM10032c == enumC19250a) {
                    return enumC19250a;
                }
            }
            signalingState = (PeerConnection.SignalingState) obj;
            if (signalingState == null) {
                return PeerConnection.SignalingState.CLOSED;
            }
            return signalingState;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(objM10032c);
        obj = objM10032c;
        signalingState = (PeerConnection.SignalingState) obj;
        if (signalingState == null) {
            return PeerConnection.SignalingState.CLOSED;
        }
        return signalingState;
    }

    /* JADX INFO: renamed from: h */
    public final Object m5444h(InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        C4806x c4806x = new C4806x(interfaceC1439n, this, null);
        if (this.f15685h.get()) {
            return null;
        }
        return AbstractC9537d.m10032c(new C4784m(c4806x, this, null), abstractC19687c);
    }
}
