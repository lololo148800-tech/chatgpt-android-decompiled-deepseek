package p001A;

import android.content.Context;
import android.content.IntentFilter;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import android.util.Size;
import android.view.SurfaceView;
import android.view.View;
import androidx.lifecycle.C11069E;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import io.sentry.android.core.RunnableC15195M;
import io.sentry.internal.debugmeta.C15384c;
import java.io.Serializable;
import java.lang.reflect.GenericDeclaration;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17312o;
import p001A.C0042V0;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0564B0;
import p028B.C0703j;
import p049Bm.InterfaceC1436k;
import p057C3.C1568m;
import p1000s0.AbstractC19397F;
import p1009s9.C19499b;
import p1022t9.InterfaceC19818c;
import p1031u3.C20099b;
import p1031u3.C20105h;
import p1031u3.InterfaceC20101d;
import p1031u3.InterfaceC20102e;
import p1036u9.C20155a;
import p1036u9.C20159e;
import p1036u9.C20171q;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1060v9.InterfaceC20484b;
import p1073w3.AbstractC20800b;
import p1073w3.C20813o;
import p109E3.C2268I;
import p109E3.C2269J;
import p109E3.C2273N;
import p109E3.C2281e;
import p1142z3.InterfaceC21739g;
import p117Eb.C2391u;
import p153Fn.C2925c;
import p225Im.InterfaceC3756d;
import p228J.EnumC3868w;
import p228J.InterfaceC3831d0;
import p228J.InterfaceC3866v;
import p232J3.InterfaceC4252x;
import p277L.ExecutorC4828a;
import p277L.ExecutorC4836i;
import p301M.AbstractC5229k;
import p301M.C5222d;
import p301M.RunnableC5220b;
import p301M.RunnableC5228j;
import p310M9.C5311e;
import p326N.C5560b;
import p329N3.C5625o;
import p349O0.C5997d;
import p372P3.InterfaceC6336r;
import p477Tb.C7296c;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8577W2;
import p561X.AbstractC8995i;
import p561X.C8988b;
import p561X.EnumC8994h;
import p571X9.AbstractC9233X;
import p644ab.InterfaceC10536i;
import p658b5.C11242m;
import p733eo.AbstractC13455c;
import p813ij.C15026j;
import p826j6.C16146O;
import p826j6.InterfaceC16165s;
import p848k6.AbstractC16347a;
import p885m4.C17155e;
import p887m7.C17176b;
import p913o2.AbstractC17803d;
import p949pj.C18428A;
import p949pj.C18429B;
import p949pj.C18430C;
import p949pj.InterfaceC18483p;
import p953q0.C18561T;
import p972qm.InterfaceC18770c;
import p993rj.C19024D;
import p993rj.C19025E;
import p993rj.C19030J;
import p993rj.C19031K;
import p993rj.C19032L;
import p993rj.C19038S;
import p993rj.C19039a;
import p993rj.C19041c;
import p993rj.C19042d;
import p993rj.C19043e;
import p993rj.C19048j;
import p993rj.C19051m;
import p993rj.SurfaceHolderCallbackC19063y;
import p996rm.EnumC19250a;
import sj.C19661b;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: A.V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0042V0 implements InterfaceC3831d0, InterfaceC18483p, InterfaceC20484b {

    /* JADX INFO: renamed from: Y */
    public boolean f204Y;

    /* JADX INFO: renamed from: Z */
    public final Object f205Z;

    /* JADX INFO: renamed from: o0 */
    public Object f206o0;

    /* JADX INFO: renamed from: p0 */
    public Object f207p0;

    /* JADX INFO: renamed from: q0 */
    public Object f208q0;

    /* JADX INFO: renamed from: r0 */
    public Object f209r0;

    public C0042V0(C20159e c20159e, InterfaceC19818c interfaceC19818c, C20155a c20155a) {
        this.f209r0 = c20159e;
        this.f207p0 = null;
        this.f208q0 = null;
        this.f204Y = false;
        this.f205Z = interfaceC19818c;
        this.f206o0 = c20155a;
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC0040U0 m206f(C0703j c0703j) {
        Range range;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) c0703j.m1476a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError e10) {
                AbstractC8072d6.m8493j("ZoomControl", "AssertionError, fail to get camera characteristic.", e10);
                range = null;
            }
            if (range != null) {
                return new C0052b(c0703j);
            }
        }
        return new C2391u(c0703j);
    }

    @Override // p228J.InterfaceC3831d0
    /* JADX INFO: renamed from: A */
    public void mo207A(Object obj) {
        EnumC3868w enumC3868w = (EnumC3868w) obj;
        EnumC3868w enumC3868w2 = EnumC3868w.CLOSING;
        EnumC8994h enumC8994h = EnumC8994h.f27446Y;
        if (enumC3868w == enumC3868w2 || enumC3868w == EnumC3868w.CLOSED || enumC3868w == EnumC3868w.RELEASING || enumC3868w == EnumC3868w.RELEASED) {
            m219m(enumC8994h);
            if (this.f204Y) {
                this.f204Y = false;
                C5222d c5222d = (C5222d) this.f209r0;
                if (c5222d != null) {
                    c5222d.cancel(false);
                    this.f209r0 = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((enumC3868w == EnumC3868w.OPENING || enumC3868w == EnumC3868w.OPEN || enumC3868w == EnumC3868w.PENDING_OPEN) && !this.f204Y) {
            m219m(enumC8994h);
            ArrayList arrayList = new ArrayList();
            InterfaceC3866v interfaceC3866v = (InterfaceC3866v) this.f205Z;
            C5222d c5222dM5765c = C5222d.m5765c(AbstractC16347a.m17947b(new C0083q0(this, interfaceC3866v, arrayList, 5)));
            C8988b c8988b = new C8988b(this);
            ExecutorC4828a executorC4828aM9240b = AbstractC8577W2.m9240b();
            c5222dM5765c.getClass();
            RunnableC5220b runnableC5220bM5782f = AbstractC5229k.m5782f(c5222dM5765c, c8988b, executorC4828aM9240b);
            C8988b c8988b2 = new C8988b(this);
            RunnableC5220b runnableC5220bM5782f2 = AbstractC5229k.m5782f(runnableC5220bM5782f, new C7296c(c8988b2, 18), AbstractC8577W2.m9240b());
            this.f209r0 = runnableC5220bM5782f2;
            C5311e c5311e = new C5311e(this, arrayList, false, interfaceC3866v, 15);
            runnableC5220bM5782f2.mo5766a(new RunnableC5228j(runnableC5220bM5782f2, 0, c5311e), AbstractC8577W2.m9240b());
            this.f204Y = true;
        }
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: b */
    public C2153Q0 mo209b() {
        return (C2153Q0) this.f208q0;
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: c */
    public void mo210c(boolean z6) {
        C19031K c19031k = ((C19024D) this.f207p0).f60631p;
        if (c19031k != null) {
            c19031k.f60665f = z6;
            c19031k.m20293a();
        }
    }

    @Override // p1060v9.InterfaceC20484b
    /* JADX INFO: renamed from: d */
    public void mo211d(C19499b c19499b) {
        ((C20159e) this.f209r0).f63870z0.post(new RunnableC15195M(this, 16, c19499b));
    }

    /* JADX INFO: renamed from: e */
    public C2268I m212e() {
        AbstractC20800b.m21320h(!this.f204Y);
        this.f204Y = true;
        if (((InterfaceC20102e) this.f207p0) == null) {
            InterfaceC20101d[] interfaceC20101dArr = new InterfaceC20101d[0];
            C2273N c2273n = new C2273N();
            C20105h c20105h = new C20105h();
            c20105h.f63677c = 1.0f;
            c20105h.f63678d = 1.0f;
            C20099b c20099b = C20099b.f63641e;
            c20105h.f63679e = c20099b;
            c20105h.f63680f = c20099b;
            c20105h.f63681g = c20099b;
            c20105h.f63682h = c20099b;
            ByteBuffer byteBuffer = InterfaceC20101d.f63646a;
            c20105h.f63685k = byteBuffer;
            c20105h.f63686l = byteBuffer.asShortBuffer();
            c20105h.f63687m = byteBuffer;
            c20105h.f63676b = -1;
            C11242m c11242m = new C11242m();
            InterfaceC20101d[] interfaceC20101dArr2 = new InterfaceC20101d[interfaceC20101dArr.length + 2];
            c11242m.f34018Y = interfaceC20101dArr2;
            System.arraycopy(interfaceC20101dArr, 0, interfaceC20101dArr2, 0, interfaceC20101dArr.length);
            c11242m.f34019Z = c2273n;
            c11242m.f34020o0 = c20105h;
            interfaceC20101dArr2[interfaceC20101dArr.length] = c2273n;
            interfaceC20101dArr2[interfaceC20101dArr.length + 1] = c20105h;
            this.f207p0 = c11242m;
        }
        if (((C15384c) this.f209r0) == null) {
            this.f209r0 = new C15384c((Context) this.f205Z, 5);
        }
        return new C2268I(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: g */
    public KSerializer m213g(InterfaceC3756d kClass, List typeArgumentsSerializers) {
        AbstractC16544l.m18094g(kClass, "kClass");
        AbstractC16544l.m18094g(typeArgumentsSerializers, "typeArgumentsSerializers");
        AbstractC13455c abstractC13455c = (AbstractC13455c) this.f205Z.get(kClass);
        KSerializer kSerializerMo14978a = abstractC13455c != null ? abstractC13455c.mo14978a(typeArgumentsSerializers) : null;
        if (kSerializerMo14978a instanceof KSerializer) {
            return kSerializerMo14978a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: h */
    public KSerializer m214h(InterfaceC3756d baseClass, Object value) {
        KSerializer kSerializer;
        AbstractC16544l.m18094g(baseClass, "baseClass");
        AbstractC16544l.m18094g(value, "value");
        if (!baseClass.mo4449e(value)) {
            return null;
        }
        Map map = (Map) this.f206o0.get(baseClass);
        if (map != null) {
            kSerializer = (KSerializer) map.get(AbstractC16526C.f51263a.mo5693b(value.getClass()));
        } else {
            kSerializer = null;
        }
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = this.f207p0.get(baseClass);
        InterfaceC1436k interfaceC1436k = AbstractC16529F.m18082f(1, obj) ? (InterfaceC1436k) obj : null;
        if (interfaceC1436k != null) {
            return (KSerializer) interfaceC1436k.invoke(value);
        }
        return null;
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: i */
    public View mo215i() {
        return ((C19024D) this.f207p0).f60618c;
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC10536i m216j(int i10) {
        InterfaceC10536i c1568m;
        InterfaceC10536i interfaceC10536i;
        InterfaceC10536i interfaceC10536i2;
        final int i11 = 2;
        final int i12 = 1;
        final int i13 = 3;
        HashMap map = (HashMap) this.f206o0;
        InterfaceC10536i interfaceC10536i3 = (InterfaceC10536i) map.get(Integer.valueOf(i10));
        if (interfaceC10536i3 != null) {
            return interfaceC10536i3;
        }
        final InterfaceC21739g interfaceC21739g = (InterfaceC21739g) this.f208q0;
        interfaceC21739g.getClass();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(InterfaceC4252x.class);
                    interfaceC10536i2 = new InterfaceC10536i() { // from class: J3.l
                        @Override // p644ab.InterfaceC10536i
                        public final Object get() {
                            switch (i11) {
                                case 0:
                                    return C4241m.m5010d((Class) genericDeclarationAsSubclass, interfaceC21739g);
                                case 1:
                                    return C4241m.m5010d((Class) genericDeclarationAsSubclass, interfaceC21739g);
                                case 2:
                                    return C4241m.m5010d((Class) genericDeclarationAsSubclass, interfaceC21739g);
                                default:
                                    return new C4215O(interfaceC21739g, (InterfaceC6336r) ((C0042V0) genericDeclarationAsSubclass).f205Z);
                            }
                        }
                    };
                } else if (i10 == 3) {
                    c1568m = new C1568m(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC4252x.class), i13);
                } else {
                    if (i10 != 4) {
                        throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Unrecognized contentType: "));
                    }
                    interfaceC10536i = new InterfaceC10536i() { // from class: J3.l
                        @Override // p644ab.InterfaceC10536i
                        public final Object get() {
                            switch (i13) {
                                case 0:
                                    return C4241m.m5010d((Class) this, interfaceC21739g);
                                case 1:
                                    return C4241m.m5010d((Class) this, interfaceC21739g);
                                case 2:
                                    return C4241m.m5010d((Class) this, interfaceC21739g);
                                default:
                                    return new C4215O(interfaceC21739g, (InterfaceC6336r) ((C0042V0) this).f205Z);
                            }
                        }
                    };
                }
                map.put(Integer.valueOf(i10), interfaceC10536i);
                return interfaceC10536i;
            }
            final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC4252x.class);
            interfaceC10536i2 = new InterfaceC10536i() { // from class: J3.l
                @Override // p644ab.InterfaceC10536i
                public final Object get() {
                    switch (i12) {
                        case 0:
                            return C4241m.m5010d((Class) genericDeclarationAsSubclass2, interfaceC21739g);
                        case 1:
                            return C4241m.m5010d((Class) genericDeclarationAsSubclass2, interfaceC21739g);
                        case 2:
                            return C4241m.m5010d((Class) genericDeclarationAsSubclass2, interfaceC21739g);
                        default:
                            return new C4215O(interfaceC21739g, (InterfaceC6336r) ((C0042V0) genericDeclarationAsSubclass2).f205Z);
                    }
                }
            };
            interfaceC10536i = interfaceC10536i2;
            map.put(Integer.valueOf(i10), interfaceC10536i);
            return interfaceC10536i;
        }
        final GenericDeclaration genericDeclarationAsSubclass3 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(InterfaceC4252x.class);
        final int i14 = 0;
        c1568m = new InterfaceC10536i() { // from class: J3.l
            @Override // p644ab.InterfaceC10536i
            public final Object get() {
                switch (i14) {
                    case 0:
                        return C4241m.m5010d((Class) genericDeclarationAsSubclass3, interfaceC21739g);
                    case 1:
                        return C4241m.m5010d((Class) genericDeclarationAsSubclass3, interfaceC21739g);
                    case 2:
                        return C4241m.m5010d((Class) genericDeclarationAsSubclass3, interfaceC21739g);
                    default:
                        return new C4215O(interfaceC21739g, (InterfaceC6336r) ((C0042V0) genericDeclarationAsSubclass3).f205Z);
                }
            }
        };
        interfaceC10536i = c1568m;
        map.put(Integer.valueOf(i10), interfaceC10536i);
        return interfaceC10536i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: k */
    public Object mo217k(InterfaceC18770c interfaceC18770c) {
        C19043e c19043e;
        if (interfaceC18770c instanceof C19043e) {
            c19043e = (C19043e) interfaceC18770c;
            int i10 = c19043e.f60707o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19043e.f60707o0 = i10 - Integer.MIN_VALUE;
            } else {
                c19043e = new C19043e(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c19043e = new C19043e(this, (AbstractC19687c) interfaceC18770c);
        }
        Object obj = c19043e.f60705Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19043e.f60707o0;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return ((C17312o) obj).f55139Y;
        }
        AbstractC9233X.m9807c(obj);
        C19024D c19024d = (C19024D) this.f207p0;
        c19043e.f60707o0 = 1;
        Object objM20281c = c19024d.m20281c(c19043e);
        return objM20281c == enumC19250a ? enumC19250a : objM20281c;
    }

    /* JADX INFO: renamed from: l */
    public void m218l(C5560b c5560b) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        C11069E c11069e = (C11069E) this.f208q0;
        if (looperMyLooper == mainLooper) {
            c11069e.mo12122j(c5560b);
        } else {
            c11069e.m12124k(c5560b);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m219m(EnumC8994h enumC8994h) {
        synchronized (this) {
            try {
                if (((EnumC8994h) this.f206o0).equals(enumC8994h)) {
                    return;
                }
                this.f206o0 = enumC8994h;
                AbstractC8072d6.m8486c("StreamStateObserver", "Update Preview stream state to " + enumC8994h);
                ((C11069E) this.f208q0).m12124k(enumC8994h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: n */
    public void mo220n() {
        C19024D c19024d = (C19024D) this.f207p0;
        C19031K c19031k = c19024d.f60631p;
        if (c19031k != null) {
            C19032L c19032l = c19024d.f60617b;
            int width = (int) (((double) c19032l.f60670b.getWidth()) * 0.15d);
            Size size = c19032l.f60670b;
            c19031k.f60666g = new MeteringRectangle(new Point(size.getWidth() / 2, size.getHeight() / 2), new Size(width, (int) (((double) size.getHeight()) * 0.15d)), 1000);
            C0564B0 c0564b0 = c19031k.f60667h;
            if (c0564b0 != null) {
                c0564b0.mo1275e(null);
            }
            c19031k.f60667h = AbstractC0575H.m1156D(c19031k.f60664e, null, null, new C19030J(c19031k, null), 3);
            c19031k.m20293a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: o */
    public Object mo221o(InterfaceC18770c interfaceC18770c) {
        C19041c c19041c;
        C0042V0 c0042v0;
        if (interfaceC18770c instanceof C19041c) {
            c19041c = (C19041c) interfaceC18770c;
            int i10 = c19041c.f60701p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19041c.f60701p0 = i10 - Integer.MIN_VALUE;
            } else {
                c19041c = new C19041c(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c19041c = new C19041c(this, (AbstractC19687c) interfaceC18770c);
        }
        Object objM20283e = c19041c.f60699Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19041c.f60701p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM20283e);
            if (!AbstractC16544l.m18089b(((C2153Q0) this.f208q0).getValue(), C18430C.f58799d)) {
                return Boolean.FALSE;
            }
            C19024D c19024d = (C19024D) this.f207p0;
            c19041c.f60698Y = this;
            c19041c.f60701p0 = 1;
            objM20283e = c19024d.m20283e(c19041c);
            if (objM20283e == enumC19250a) {
                return enumC19250a;
            }
            c0042v0 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0042v0 = c19041c.f60698Y;
            AbstractC9233X.m9807c(objM20283e);
        }
        Boolean bool = (Boolean) objM20283e;
        if (bool.booleanValue()) {
            c0042v0.f204Y = true;
        }
        return bool;
    }

    @Override // p228J.InterfaceC3831d0
    public void onError(Throwable th2) {
        C5222d c5222d = (C5222d) this.f209r0;
        if (c5222d != null) {
            c5222d.cancel(false);
            this.f209r0 = null;
        }
        m219m(EnumC8994h.f27446Y);
    }

    /* JADX INFO: renamed from: p */
    public void m222p(C19499b c19499b) {
        C20171q c20171q = (C20171q) ((C20159e) this.f209r0).f63866v0.get((C20155a) this.f206o0);
        if (c20171q != null) {
            c20171q.m21005o(c19499b);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m223q(boolean z6) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f204Y = z6;
        ((C16146O) this.f209r0).m17745a((Context) this.f205Z, intentFilter2);
        if (!this.f204Y) {
            ((C16146O) this.f208q0).m17745a((Context) this.f205Z, intentFilter);
            return;
        }
        C16146O c16146o = (C16146O) this.f208q0;
        Context context = (Context) this.f205Z;
        synchronized (c16146o) {
            try {
                if (!c16146o.f50104a) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        context.registerReceiver(c16146o, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != c16146o.f50105b ? 4 : 2);
                    } else {
                        context.registerReceiver(c16146o, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                    }
                    c16146o.f50104a = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: r */
    public Object mo224r(InterfaceC18770c interfaceC18770c) {
        C19042d c19042d;
        if (interfaceC18770c instanceof C19042d) {
            c19042d = (C19042d) interfaceC18770c;
            int i10 = c19042d.f60704o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19042d.f60704o0 = i10 - Integer.MIN_VALUE;
            } else {
                c19042d = new C19042d(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c19042d = new C19042d(this, (AbstractC19687c) interfaceC18770c);
        }
        Object obj = c19042d.f60702Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19042d.f60704o0;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return ((C17312o) obj).f55139Y;
        }
        AbstractC9233X.m9807c(obj);
        this.f204Y = false;
        C19024D c19024d = (C19024D) this.f207p0;
        c19042d.f60704o0 = 1;
        Serializable serializableM20284f = c19024d.m20284f(c19042d);
        return serializableM20284f == enumC19250a ? enumC19250a : serializableM20284f;
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: v */
    public C18428A mo225v() {
        return ((C19024D) this.f207p0).f60623h;
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: x */
    public void mo226x(boolean z6) {
        ((C19024D) this.f207p0).f60633r = z6;
    }

    public C0042V0(Context context, InterfaceC16165s interfaceC16165s, C15026j c15026j) {
        this.f205Z = context;
        this.f206o0 = interfaceC16165s;
        this.f207p0 = c15026j;
        this.f208q0 = new C16146O(this, true);
        this.f209r0 = new C16146O(this, false);
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: a */
    public void mo208a() {
        if (AbstractC16544l.m18089b(((C2153Q0) this.f208q0).getValue(), C18430C.f58797b) || (((C2153Q0) this.f208q0).getValue() instanceof C18429B)) {
            C0564B0 c0564b0 = (C0564B0) this.f209r0;
            if (c0564b0 != null) {
                c0564b0.mo1275e(null);
            }
            C2153Q0 c2153q0 = (C2153Q0) this.f208q0;
            C18430C c18430c = C18430C.f58798c;
            c2153q0.getClass();
            c2153q0.m3251l(null, c18430c);
            this.f209r0 = AbstractC0575H.m1156D((C2925c) this.f206o0, null, null, new C19039a(this, null), 3);
            C19024D c19024d = (C19024D) this.f207p0;
            boolean z6 = c19024d.f60621f && AbstractC17803d.m19554a(c19024d.f60616a, "android.permission.RECORD_AUDIO") != 0;
            if (AbstractC17803d.m19554a(c19024d.f60616a, YladLSetV.YZpTAP) != 0 || z6) {
                C2153Q0 c2153q1 = c19024d.f60637v;
                C19051m c19051m = new C19051m(new C19048j());
                c2153q1.getClass();
                c2153q1.m3251l(null, c19051m);
                return;
            }
            if (c19024d.f60639x) {
                return;
            }
            c19024d.f60639x = true;
            c19024d.f60635t = false;
            c19024d.f60640y = new SurfaceHolderCallbackC19063y(c19024d);
            C19038S c19038s = c19024d.f60628m;
            new C17176b(c19024d, 13);
            c19038s.getClass();
            Camera2PreviewView camera2PreviewView = c19024d.f60618c;
            camera2PreviewView.removeAllViews();
            SurfaceView surfaceView = new SurfaceView(camera2PreviewView.getContext());
            camera2PreviewView.surfaceView = surfaceView;
            camera2PreviewView.addView(surfaceView);
            camera2PreviewView.requestLayout();
            c19024d.f60618c.getHolder().addCallback(c19024d.f60640y);
            C19661b c19661b = c19024d.f60622g;
            if (c19661b.f62318e) {
                return;
            }
            c19661b.f62318e = true;
            Sensor sensor = c19661b.f62315b;
            if (sensor != null) {
                c19661b.f62314a.registerListener(c19661b.f62319f, sensor, 100000);
            }
        }
    }

    public C0042V0(C19025E c19025e) {
        this.f205Z = c19025e;
        this.f206o0 = AbstractC0575H.m1174c(AbstractC0593T.f1824a.plus(AbstractC0575H.m1176e()));
        this.f207p0 = c19025e.m20285a();
        this.f208q0 = AbstractC2124C.m3204c(C18430C.f58797b);
    }

    public C0042V0(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z6) {
        AbstractC16544l.m18094g(class2ContextualFactory, "class2ContextualFactory");
        AbstractC16544l.m18094g(polyBase2Serializers, "polyBase2Serializers");
        AbstractC16544l.m18094g(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        AbstractC16544l.m18094g(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        AbstractC16544l.m18094g(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f205Z = class2ContextualFactory;
        this.f206o0 = polyBase2Serializers;
        this.f207p0 = polyBase2DefaultSerializerProvider;
        this.f208q0 = polyBase2NamedSerializers;
        this.f209r0 = polyBase2DefaultDeserializerProvider;
        this.f204Y = z6;
    }

    public C0042V0(int i10, float f10, AbstractC19397F abstractC19397F) {
        this.f205Z = abstractC19397F;
        this.f206o0 = C5997d.m6429P(i10);
        this.f207p0 = C5997d.m6428O(f10);
        this.f209r0 = new C18561T(i10, 30, 100);
    }

    public C0042V0(InterfaceC3866v interfaceC3866v, C11069E c11069e, AbstractC8995i abstractC8995i) {
        this.f204Y = false;
        this.f205Z = interfaceC3866v;
        this.f208q0 = c11069e;
        this.f207p0 = abstractC8995i;
        synchronized (this) {
            this.f206o0 = (EnumC8994h) c11069e.mo129d();
        }
    }

    public C0042V0(C0088t c0088t, C0703j c0703j, ExecutorC4836i executorC4836i) {
        this.f204Y = false;
        C0038T0 c0038t0 = new C0038T0(this);
        this.f205Z = c0088t;
        this.f206o0 = executorC4836i;
        InterfaceC0040U0 interfaceC0040U0M206f = m206f(c0703j);
        this.f209r0 = interfaceC0040U0M206f;
        C0044W0 c0044w0 = new C0044W0(interfaceC0040U0M206f.mo200e(), interfaceC0040U0M206f.mo201g());
        this.f207p0 = c0044w0;
        c0044w0.m231e(1.0f);
        this.f208q0 = new C11069E(C5560b.m5950e(c0044w0));
        c0088t.m297a(c0038t0);
    }

    public C0042V0(Context context, C5625o c5625o) {
        this.f205Z = context.getApplicationContext();
        this.f206o0 = c5625o;
        this.f209r0 = C20813o.f66098a;
    }

    public C0042V0(Context context) {
        this.f205Z = context;
        this.f206o0 = C2281e.f7051c;
        this.f208q0 = C2269J.f7005a;
    }

    public C0042V0(InterfaceC6336r interfaceC6336r, C17155e c17155e) {
        this.f205Z = interfaceC6336r;
        this.f209r0 = c17155e;
        this.f206o0 = new HashMap();
        this.f207p0 = new HashMap();
        this.f204Y = true;
    }
}
