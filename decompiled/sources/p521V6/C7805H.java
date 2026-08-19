package p521V6;

import af.C10564U;
import android.content.Context;
import android.graphics.PointF;
import android.view.Display;
import android.view.View;
import androidx.camera.view.PreviewView;
import fo.C13711h;
import io.sentry.android.core.AbstractC15256t;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17312o;
import p003A1.ViewOnAttachStateChangeListenerC0171H;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p045Bj.C1311i;
import p099Dj.C2064b;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1156zj.C22172l1;
import p117Eb.C2391u;
import p153Fn.AbstractC2935m;
import p178H.C3134a0;
import p178H.C3179x;
import p201Hn.C3516e;
import p228J.C3853o0;
import p326N.C5565g;
import p536W.C8406b;
import p571X9.AbstractC9233X;
import p594Y9.C9895g4;
import p647ak.C10652K0;
import p665bk.C11480a;
import p784hb.C14438g;
import p905nd.C17583k;
import p905nd.C17591s;
import p949pj.C18428A;
import p949pj.C18430C;
import p949pj.C18432E;
import p949pj.C18438K;
import p949pj.C18445S;
import p949pj.C18470i0;
import p949pj.EnumC18493x;
import p949pj.InterfaceC18483p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sj.C19661b;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: V6.H */
/* JADX INFO: loaded from: classes.dex */
public final class C7805H implements InterfaceC18483p {

    /* JADX INFO: renamed from: Y */
    public boolean f24689Y;

    /* JADX INFO: renamed from: Z */
    public final Object f24690Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f24691o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f24692p0;

    /* JADX INFO: renamed from: q0 */
    public Object f24693q0;

    /* JADX INFO: renamed from: r0 */
    public Object f24694r0;

    /* JADX INFO: renamed from: s0 */
    public Object f24695s0;

    public C7805H(Context context, C19661b cameraStatsManager, C14438g cameraPreview, PreviewView previewView, C2391u c2391u) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(cameraStatsManager, "cameraStatsManager");
        AbstractC16544l.m18094g(cameraPreview, "cameraPreview");
        this.f24690Z = context;
        this.f24691o0 = cameraStatsManager;
        this.f24692p0 = cameraPreview;
        this.f24693q0 = previewView;
        this.f24694r0 = c2391u;
        this.f24695s0 = AbstractC2124C.m3204c(C18430C.f58797b);
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: a */
    public void mo208a() {
        if (this.f24689Y) {
            return;
        }
        C2153Q0 c2153q0 = (C2153Q0) this.f24695s0;
        C18430C c18430c = C18430C.f58798c;
        c2153q0.getClass();
        c2153q0.m3251l(null, c18430c);
        this.f24689Y = true;
        C2391u c2391u = (C2391u) this.f24694r0;
        switch (c2391u.f7428Y) {
            case 11:
                ((C14438g) c2391u.f7430o0).m15967g(((C11480a) c2391u.f7429Z).f34726h, EnumC18493x.f58948Y, (C18470i0) c2391u.f7431p0, new C10564U((C10652K0) c2391u.f7432q0, 3));
                break;
            default:
                PreviewView previewView = ((C2064b) c2391u.f7429Z).f6309s;
                EnumC18493x enumC18493x = EnumC18493x.f58949Z;
                C1311i c1311i = ((C22172l1) c2391u.f7430o0).f70199t;
                ((C14438g) c2391u.f7431p0).m15967g(previewView, enumC18493x, (C18438K) c2391u.f7432q0, c1311i);
                break;
        }
        PreviewView previewView2 = (PreviewView) this.f24693q0;
        previewView2.getPreviewStreamState().m12120f(new C9895g4(this));
        previewView2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0171H(this, 6));
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: b */
    public C2153Q0 mo209b() {
        return (C2153Q0) this.f24695s0;
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: c */
    public void mo210c(boolean z6) {
        C13711h c13711h = (C13711h) ((C14438g) this.f24692p0).f45414Y;
        if (c13711h != null) {
            ((C8406b) c13711h.f43259Z).f26135o0.f18036B0.mo299c(z6);
        }
    }

    /* JADX INFO: renamed from: d */
    public Object m8073d(Context context, C17583k c17583k) {
        C3516e c3516e = AbstractC0593T.f1824a;
        return AbstractC0575H.m1168P(AbstractC2935m.f8797a.f3819q0, new C7804G(this, context, null), c17583k);
    }

    /* JADX INFO: renamed from: e */
    public void m8074e(String connectionName) {
        AbstractC16544l.m18094g(connectionName, "connectionName");
        ((LinkedHashMap) this.f24691o0).put("connection", connectionName);
    }

    /* JADX INFO: renamed from: f */
    public void m8075f(Map parameters) {
        AbstractC16544l.m18094g(parameters, "parameters");
        for (Map.Entry entry : parameters.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                ((LinkedHashMap) this.f24691o0).put(str, value.toString());
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m8076g() {
        Locale ROOT = Locale.ROOT;
        AbstractC16544l.m18093f(ROOT, "ROOT");
        String lowerCase = "com.openai.chatgpt".toLowerCase(ROOT);
        AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!"com.openai.chatgpt".equals(lowerCase)) {
            AbstractC15256t.m16482t(AbstractC7807J.f24699a, "Please provide the scheme in lowercase and make sure it's the same configured in the intent filter. Android expects the scheme to be lowercase.");
        }
        this.f24693q0 = "com.openai.chatgpt";
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: i */
    public View mo215i() {
        return (PreviewView) this.f24693q0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: k */
    public Object mo217k(InterfaceC18770c interfaceC18770c) {
        C18432E c18432e;
        if (interfaceC18770c instanceof C18432E) {
            c18432e = (C18432E) interfaceC18770c;
            int i10 = c18432e.f58802o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18432e.f58802o0 = i10 - Integer.MIN_VALUE;
            } else {
                c18432e = new C18432E(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c18432e = new C18432E(this, (AbstractC19687c) interfaceC18770c);
        }
        Object obj = c18432e.f58800Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18432e.f58802o0;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return ((C17312o) obj).f55139Y;
        }
        AbstractC9233X.m9807c(obj);
        c18432e.f58802o0 = 1;
        Object objM15968i = ((C14438g) this.f24692p0).m15968i((Context) this.f24690Z, c18432e);
        return objM15968i == enumC19250a ? enumC19250a : objM15968i;
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: n */
    public void mo220n() {
        C14438g c14438g = (C14438g) this.f24692p0;
        c14438g.getClass();
        PreviewView previewView = (PreviewView) this.f24693q0;
        C13711h c13711h = (C13711h) c14438g.f45414Y;
        if (c13711h != null) {
            C5565g c5565g = ((C8406b) c13711h.f43259Z).f26135o0;
            Display display = previewView.getDisplay();
            float width = previewView.getWidth();
            float height = previewView.getHeight();
            float width2 = previewView.getWidth() / 2.0f;
            float height2 = previewView.getHeight() / 2.0f;
            C3853o0 c3853o0 = c5565g.f18037C0;
            int i10 = 0;
            boolean z6 = c3853o0.mo141f() == 0;
            try {
                int iMo143h = c3853o0.mo143h(display.getRotation());
                if (z6) {
                    iMo143h = (360 - iMo143h) % 360;
                }
                i10 = iMo143h;
            } catch (Exception unused) {
            }
            if (i10 != 90 && i10 != 270) {
                width2 = height2;
                height2 = width2;
                height = width;
                width = height;
            }
            if (i10 == 90) {
                width2 = width - width2;
            } else if (i10 == 180) {
                height2 = height - height2;
                width2 = width - width2;
            } else if (i10 == 270) {
                height2 = height - height2;
            }
            if (z6) {
                height2 = height - height2;
            }
            PointF pointF = new PointF(height2 / height, width2 / width);
            float f10 = pointF.x;
            float f11 = pointF.y;
            C3134a0 c3134a0 = new C3134a0();
            c3134a0.f9435a = f10;
            c3134a0.f9436b = f11;
            c3134a0.f9437c = null;
            c5565g.f18036B0.mo302f(new C3179x(new C3179x(c3134a0)));
        }
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: o */
    public Object mo221o(InterfaceC18770c interfaceC18770c) {
        return Boolean.FALSE;
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: r */
    public Object mo224r(InterfaceC18770c interfaceC18770c) {
        return AbstractC9233X.m9806b(new C18445S());
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: v */
    public C18428A mo225v() {
        C13711h c13711h = (C13711h) ((C14438g) this.f24692p0).f45414Y;
        return c13711h != null ? (C18428A) c13711h.f43261p0 : new C18428A();
    }

    public C7805H(C17591s account) {
        AbstractC16544l.m18094g(account, "account");
        this.f24690Z = account;
        this.f24691o0 = new LinkedHashMap();
        this.f24692p0 = new LinkedHashMap();
        this.f24693q0 = "https";
        this.f24695s0 = new C7817j((C7815h) C7817j.m8082b().f9127Z);
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: x */
    public void mo226x(boolean z6) {
    }
}
