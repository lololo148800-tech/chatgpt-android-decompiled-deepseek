package p906nh;

import android.app.Application;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import io.sentry.android.replay.capture.C15272c;
import java.io.Closeable;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16526C;
import mh.C17263k;
import mh.C17271s;
import mh.C17272t;
import mh.C17273u;
import mh.C17274v;
import mh.C17275w;
import mh.C17276x;
import mh.EnumC17264l;
import mm.C17296C;
import mm.C17314q;
import ni.C17627a;
import ni.C17628b;
import p003A1.RunnableC0153B;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p072Ci.C1699d;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1111xl.C21296a;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1155zi.C21941M1;
import p1155zi.C21952P1;
import p195Hh.C3430e;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p228J.AbstractC3794B0;
import p324Mn.C5551u;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p364Oh.C6250x;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p708dh.C13132J;
import p928oh.C18195b;
import p928oh.C18196c;
import p928oh.C18199f;
import p948pi.C18418a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: nh.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C17625g implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final Application f56401Y;

    /* JADX INFO: renamed from: Z */
    public final C13132J f56402Z;

    /* JADX INFO: renamed from: o0 */
    public final C18196c f56403o0;

    /* JADX INFO: renamed from: p0 */
    public final C17627a f56404p0;

    /* JADX INFO: renamed from: q0 */
    public final C3430e f56405q0 = AbstractC8168p6.m8749b("Whisper", null);

    /* JADX INFO: renamed from: r0 */
    public final C2153Q0 f56406r0 = AbstractC2124C.m3204c(C17272t.f55079c);

    /* JADX INFO: renamed from: s0 */
    public final Handler f56407s0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: t0 */
    public final C17314q f56408t0;

    /* JADX INFO: renamed from: u0 */
    public C17626h f56409u0;

    public C17625g(Application application, C13132J c13132j, C18196c c18196c, C17627a c17627a, C18418a c18418a, C17628b c17628b) {
        this.f56401Y = application;
        this.f56402Z = c13132j;
        this.f56403o0 = c18196c;
        this.f56404p0 = c17627a;
        this.f56408t0 = AbstractC9227W.m9800c(new C15272c(c18418a, this, c17628b, 16));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m19229a(AbstractC19687c abstractC19687c) {
        C17621c c17621c;
        C17625g c17625g;
        C5551u c5551u;
        if (abstractC19687c instanceof C17621c) {
            c17621c = (C17621c) abstractC19687c;
            int i10 = c17621c.f56387q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17621c.f56387q0 = i10 - Integer.MIN_VALUE;
            } else {
                c17621c = new C17621c(this, abstractC19687c);
            }
        } else {
            c17621c = new C17621c(this, abstractC19687c);
        }
        Object obj = c17621c.f56385o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17621c.f56387q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C2153Q0 c2153q0 = this.f56406r0;
            if (c2153q0.getValue() instanceof C17274v) {
                return new C21952P1(c17296c);
            }
            C5551u.Companion.getClass();
            C5551u c5551u2 = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
            C17274v c17274v = new C17274v(0, c5551u2);
            c17621c.f56383Y = this;
            c17621c.f56384Z = c5551u2;
            c17621c.f56387q0 = 1;
            c2153q0.getClass();
            c2153q0.m3251l(null, c17274v);
            if (c17296c == enumC19250a) {
                return enumC19250a;
            }
            c17625g = this;
            c5551u = c5551u2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5551u = c17621c.f56384Z;
            c17625g = c17621c.f56383Y;
            AbstractC9233X.m9807c(obj);
        }
        C17626h c17626h = c17625g.f56409u0;
        if (c17626h != null) {
            c17626h.close();
        }
        File file = new File((File) c17625g.f56408t0.getValue(), UUID.randomUUID() + ".m4a");
        MediaRecorder mediaRecorder = new MediaRecorder();
        try {
            mediaRecorder.setAudioSource(1);
            mediaRecorder.setOutputFormat(2);
            mediaRecorder.setAudioEncoder(1);
            mediaRecorder.setOutputFile(file.getPath());
            mediaRecorder.prepare();
            mediaRecorder.start();
            c17625g.f56409u0 = new C17626h(file, mediaRecorder, c5551u, 0);
            new RunnableC0153B(c17625g, 29).run();
            return new C21952P1(c17296c);
        } catch (Exception e10) {
            AbstractC8160o6.m8731f(c17625g.f56405q0, "MediaRecorder failed", e10, null, 4);
            c17625g.close();
            return new C21941M1(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC0575H.m1156D(this.f56404p0, null, null, new C17619a(this, null), 3);
        this.f56407s0.removeCallbacksAndMessages(null);
        C17626h c17626h = this.f56409u0;
        if (c17626h != null) {
            c17626h.close();
        }
        this.f56409u0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0113  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m19230e(AbstractC19687c abstractC19687c) {
        C17622d c17622d;
        C17625g c17625g;
        C17263k c17263k;
        C17625g c17625g2;
        EnumC17264l enumC17264lM18970a;
        C17626h c17626h;
        InterfaceC3777y interfaceC3777yM18075c;
        C17626h c17626h2;
        AbstractC6224C abstractC6224C;
        Object c17275w;
        if (abstractC19687c instanceof C17622d) {
            c17622d = (C17622d) abstractC19687c;
            int i10 = c17622d.f56393r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17622d.f56393r0 = i10 - Integer.MIN_VALUE;
            } else {
                c17622d = new C17622d(this, abstractC19687c);
            }
        } else {
            c17622d = new C17622d(this, abstractC19687c);
        }
        Object objM9690b = c17622d.f56391p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17622d.f56393r0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                c17625g = (C17625g) c17622d.f56388Y;
                AbstractC9233X.m9807c(objM9690b);
            } else if (i11 == 2) {
                c17263k = (C17263k) c17622d.f56389Z;
                c17625g2 = (C17625g) c17622d.f56388Y;
                AbstractC9233X.m9807c(objM9690b);
                Application application = c17625g2.f56401Y;
                c17263k.getClass();
                enumC17264lM18970a = C17263k.m18970a((C1699d) objM9690b, application);
                c17626h = c17625g2.f56409u0;
                if (c17626h != null) {
                    c17622d.f56388Y = c17625g2;
                    c17622d.f56389Z = c17626h;
                    c17622d.f56390o0 = c17626h;
                    c17622d.f56393r0 = 3;
                    C18196c c18196c = c17625g2.f56403o0;
                    C18195b c18195b = new C18195b(enumC17264lM18970a, c17626h.f56410Y, null);
                    InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C18199f.class);
                    try {
                        interfaceC3777yM18075c = AbstractC16526C.m18075c(C18199f.class);
                    } catch (Throwable unused) {
                        interfaceC3777yM18075c = null;
                    }
                    objM9690b = AbstractC9144I.m9690b(c18196c.f58025a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c18195b, c17622d);
                    if (objM9690b == enumC19250a) {
                        return enumC19250a;
                    }
                    c17626h2 = c17626h;
                    abstractC6224C = (AbstractC6224C) objM9690b;
                    if (abstractC6224C instanceof C6248v ? true : abstractC6224C instanceof C6223B) {
                        c17626h.f56410Y.delete();
                        c17625g2.f56409u0 = null;
                        if (abstractC6224C instanceof C6223B) {
                            c17275w = new C17275w(((C18199f) ((C6223B) abstractC6224C).f20258a).f58027a);
                        } else {
                            c17275w = C17272t.f55079c;
                        }
                    } else if (abstractC6224C instanceof C6250x) {
                        c17275w = C17271s.f55076a;
                    } else {
                        if (!(abstractC6224C instanceof AbstractC6249w)) {
                            throw new C0644w();
                        }
                        c17275w = C17273u.f55080a;
                    }
                    C2153Q0 c2153q0 = c17625g2.f56406r0;
                    c17622d.f56388Y = c17626h2;
                    c17622d.f56389Z = null;
                    c17622d.f56390o0 = null;
                    c17622d.f56393r0 = 4;
                    c2153q0.getClass();
                    c2153q0.m3251l(null, c17275w);
                    if (c17296c == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else if (i11 == 3) {
                c17626h = c17622d.f56390o0;
                c17626h2 = (C17626h) c17622d.f56389Z;
                c17625g2 = (C17625g) c17622d.f56388Y;
                AbstractC9233X.m9807c(objM9690b);
                abstractC6224C = (AbstractC6224C) objM9690b;
                if (abstractC6224C instanceof C6248v ? true : abstractC6224C instanceof C6223B) {
                    c17626h.f56410Y.delete();
                    c17625g2.f56409u0 = null;
                    if (abstractC6224C instanceof C6223B) {
                        c17275w = new C17275w(((C18199f) ((C6223B) abstractC6224C).f20258a).f58027a);
                    } else {
                        c17275w = C17272t.f55079c;
                    }
                } else if (abstractC6224C instanceof C6250x) {
                    c17275w = C17271s.f55076a;
                } else {
                    if (!(abstractC6224C instanceof AbstractC6249w)) {
                        throw new C0644w();
                    }
                    c17275w = C17273u.f55080a;
                }
                C2153Q0 c2153q1 = c17625g2.f56406r0;
                c17622d.f56388Y = c17626h2;
                c17622d.f56389Z = null;
                c17622d.f56390o0 = null;
                c17622d.f56393r0 = 4;
                c2153q1.getClass();
                c2153q1.m3251l(null, c17275w);
                if (c17296c == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM9690b);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(objM9690b);
        C17276x c17276x = C17276x.f55084a;
        c17622d.f56388Y = this;
        c17622d.f56393r0 = 1;
        C2153Q0 c2153q2 = this.f56406r0;
        c2153q2.getClass();
        c2153q2.m3251l(null, c17276x);
        if (c17296c == enumC19250a) {
            return enumC19250a;
        }
        c17625g = this;
        C17263k c17263k2 = EnumC17264l.f55058o0;
        C13132J c13132j = c17625g.f56402Z;
        c17622d.f56388Y = c17625g;
        c17622d.f56389Z = c17263k2;
        c17622d.f56393r0 = 2;
        Object objM3221t = AbstractC2124C.m3221t(c13132j.f41695r0, c17622d);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        C17625g c17625g3 = c17625g;
        c17263k = c17263k2;
        objM9690b = objM3221t;
        c17625g2 = c17625g3;
        Application application2 = c17625g2.f56401Y;
        c17263k.getClass();
        enumC17264lM18970a = C17263k.m18970a((C1699d) objM9690b, application2);
        c17626h = c17625g2.f56409u0;
        if (c17626h != null) {
            c17622d.f56388Y = c17625g2;
            c17622d.f56389Z = c17626h;
            c17622d.f56390o0 = c17626h;
            c17622d.f56393r0 = 3;
            C18196c c18196c2 = c17625g2.f56403o0;
            C18195b c18195b2 = new C18195b(enumC17264lM18970a, c17626h.f56410Y, null);
            InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C18199f.class);
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C18199f.class);
            objM9690b = AbstractC9144I.m9690b(c18196c2.f58025a, new C21296a(interfaceC3756dMo5693b2, interfaceC3777yM18075c), c18195b2, c17622d);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
            c17626h2 = c17626h;
            abstractC6224C = (AbstractC6224C) objM9690b;
            if (abstractC6224C instanceof C6248v ? true : abstractC6224C instanceof C6223B) {
                c17626h.f56410Y.delete();
                c17625g2.f56409u0 = null;
                if (abstractC6224C instanceof C6223B) {
                    c17275w = new C17275w(((C18199f) ((C6223B) abstractC6224C).f20258a).f58027a);
                } else {
                    c17275w = C17272t.f55079c;
                }
            } else if (abstractC6224C instanceof C6250x) {
                c17275w = C17271s.f55076a;
            } else {
                if (!(abstractC6224C instanceof AbstractC6249w)) {
                    throw new C0644w();
                }
                c17275w = C17273u.f55080a;
            }
            C2153Q0 c2153q3 = c17625g2.f56406r0;
            c17622d.f56388Y = c17626h2;
            c17622d.f56389Z = null;
            c17622d.f56390o0 = null;
            c17622d.f56393r0 = 4;
            c2153q3.getClass();
            c2153q3.m3251l(null, c17275w);
            if (c17296c == enumC19250a) {
                return enumC19250a;
            }
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m19231k(AbstractC19687c abstractC19687c) throws Exception {
        C17624f c17624f;
        if (abstractC19687c instanceof C17624f) {
            c17624f = (C17624f) abstractC19687c;
            int i10 = c17624f.f56400o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17624f.f56400o0 = i10 - Integer.MIN_VALUE;
            } else {
                c17624f = new C17624f(this, abstractC19687c);
            }
        } else {
            c17624f = new C17624f(this, abstractC19687c);
        }
        Object obj = c17624f.f56398Y;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c17624f.f56400o0;
        Object obj3 = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f56407s0.removeCallbacksAndMessages(null);
            C17626h c17626h = this.f56409u0;
            if (c17626h != null) {
                MediaRecorder mediaRecorder = c17626h.f56411Z;
                try {
                    mediaRecorder.stop();
                } catch (Exception e10) {
                    AbstractC8160o6.m8731f(this.f56405q0, "Failed to stop MediaRecorder", e10, null, 4);
                }
                mediaRecorder.release();
                C21554a c21554a = C21555b.f68260Z;
                C5551u c5551uM5947c = c17626h.f56412o0.m5947c(AbstractC8128k6.m8644j(1, EnumC21557d.SECONDS));
                C5551u.Companion.getClass();
                int iCompareTo = c5551uM5947c.compareTo(new C5551u(AbstractC3794B0.m4501z("instant(...)")));
                C2153Q0 c2153q0 = this.f56406r0;
                if (iCompareTo > 0) {
                    C17272t c17272t = C17272t.f55078b;
                    c17624f.f56400o0 = 1;
                    c2153q0.getClass();
                    c2153q0.m3251l(null, c17272t);
                    if (obj3 == obj2) {
                        return obj2;
                    }
                } else if (c17626h.f56413p0 < 2000) {
                    C17272t c17272t2 = C17272t.f55077a;
                    c17624f.f56400o0 = 2;
                    c2153q0.getClass();
                    c2153q0.m3251l(null, c17272t2);
                    if (obj3 == obj2) {
                        return obj2;
                    }
                } else {
                    c17624f.f56400o0 = 3;
                    if (m19230e(c17624f) == obj2) {
                        return obj2;
                    }
                }
            }
        } else {
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj3;
    }
}
