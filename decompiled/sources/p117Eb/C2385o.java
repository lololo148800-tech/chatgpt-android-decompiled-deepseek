package p117Eb;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.View;
import bb.AbstractC11278C;
import bb.AbstractC11320m;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.Loggable;
import livekit.org.webrtc.Logging;
import p1016t3.C19755E;
import p1016t3.C19765O;
import p1050v.InterfaceC20412a;
import p1073w3.InterfaceC20802d;
import p141Fb.C2706e;
import p158G3.C2985d;
import p167Gb.C3030a;
import p167Gb.C3031b;
import p167Gb.C3032c;
import p178H.C3120M;
import p178H.C3123P;
import p178H.C3170s0;
import p178H.InterfaceC3140d0;
import p232J3.C4218S;
import p232J3.InterfaceC4251w;
import p239Ja.InterfaceC4296B;
import p326N.C5562d;
import p372P3.InterfaceC6333o;
import p385Pj.C6428c;
import p385Pj.C6430e;
import p385Pj.C6436k;
import p385Pj.C6446u;
import p385Pj.C6447v;
import p385Pj.C6448w;
import p508Uj.AbstractC7701i;
import p508Uj.C7702j;
import p522V8.InterfaceC7838e;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC7855B6;
import p544W9.AbstractC8577W2;
import p547Wc.C8816z;
import p644ab.InterfaceC10532e;
import p658b5.C11238i;
import p658b5.C11242m;
import p769gj.InterfaceC14150D;
import p791hj.C14520c;
import p791hj.ViewOnAttachStateChangeListenerC14519b;
import p841k.C16281a;
import p841k.InterfaceC16282b;
import p885m4.C17153c;
import p890mb.InterfaceC17207d;

/* JADX INFO: renamed from: Eb.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2385o implements InterfaceC7838e, Loggable, InterfaceC17207d, InterfaceC20412a, InterfaceC10532e, InterfaceC20802d, InterfaceC4296B, InterfaceC3140d0, InterfaceC14150D, InterfaceC16282b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7413Y;

    public /* synthetic */ C2385o(int i10) {
        this.f7413Y = i10;
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m3481b(int i10, byte[] bArr) throws C2985d {
        try {
            return AbstractC7855B6.m8126f(i10, bArr);
        } catch (C19755E e10) {
            throw new C2985d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i10 + Separators.RPAREN, e10);
        } catch (IOException e11) {
            throw new C2985d(e11);
        }
    }

    @Override // p178H.InterfaceC3140d0
    /* JADX INFO: renamed from: a */
    public void mo3482a(C3170s0 c3170s0) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(c3170s0.f9535b.getWidth(), c3170s0.f9535b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        c3170s0.m3999a(surface, AbstractC8577W2.m9240b(), new C5562d(surface, 0, surfaceTexture));
    }

    @Override // p1073w3.InterfaceC20802d
    public void accept(Object obj) {
        ((C4218S) obj).f13764b.getClass();
    }

    @Override // p522V8.InterfaceC7838e, p1050v.InterfaceC20412a, p644ab.InterfaceC10532e
    /* JADX INFO: renamed from: apply */
    public Object mo22421apply(Object obj) {
        switch (this.f7413Y) {
            case 1:
                C2706e c2706e = (C2706e) obj;
                c2706e.getClass();
                C11242m c11242m = AbstractC2389s.f7424a;
                c11242m.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    c11242m.m12619x(c2706e, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 5:
                C3120M c3120m = C3123P.f9401z;
                return null;
            case 8:
                return ((InterfaceC6333o) obj).mo6855a().getClass().getSimpleName();
            case 9:
                return AbstractC11278C.m12691t(AbstractC11320m.m12740t(((InterfaceC4251w) obj).mo4924k().f13816b, new C2385o(11)));
            case 11:
                return Integer.valueOf(((C19765O) obj).f62604c);
            case 13:
                return Long.valueOf(((C17153c) obj).f54821b);
            default:
                return Long.valueOf(((C17153c) obj).f54822c);
        }
    }

    @Override // p769gj.InterfaceC14150D
    /* JADX INFO: renamed from: c */
    public void mo3483c(View view, C8816z c8816z) {
        AbstractC16544l.m18094g(view, "view");
        ViewOnAttachStateChangeListenerC14519b viewOnAttachStateChangeListenerC14519b = new ViewOnAttachStateChangeListenerC14519b(C14520c.f45760Y);
        AbstractC7841A0.m8092d(view, viewOnAttachStateChangeListenerC14519b);
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC14519b);
        c8816z.invoke();
    }

    @Override // p841k.InterfaceC16282b
    /* JADX INFO: renamed from: d */
    public void mo3484d(Object obj) {
        switch (this.f7413Y) {
            case 22:
                Integer num = (Integer) obj;
                num.getClass();
                C6428c.f20882Z.mo3231f(num);
                break;
            case 23:
                List uriList = (List) obj;
                AbstractC16544l.m18094g(uriList, "uriList");
                C6436k.f20896Z.mo3231f(uriList);
                break;
            case 24:
                List uriList2 = (List) obj;
                AbstractC16544l.m18094g(uriList2, "uriList");
                C6436k.f20896Z.mo3231f(uriList2);
                break;
            case 25:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                C6446u.f20915Z.mo3231f(bool);
                break;
            case 26:
                C6430e.f20886Z.mo3231f((Uri) obj);
                break;
            case 27:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                C6447v.f20917Z.mo3231f(bool2);
                break;
            case 28:
                C16281a success = (C16281a) obj;
                AbstractC16544l.m18094g(success, "success");
                C6448w.f20919Z.mo3231f(success);
                break;
            default:
                AbstractC7701i result = (AbstractC7701i) obj;
                AbstractC16544l.m18094g(result, "result");
                C7702j.f24252Z.mo3231f(result);
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public Constructor m3485e() {
        switch (this.f7413Y) {
            case 20:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC6333o.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC6333o.class).getConstructor(null);
        }
    }

    @Override // p890mb.InterfaceC17207d
    /* JADX INFO: renamed from: g */
    public Object mo391g(C11238i c11238i) {
        Set setM12537E0 = c11238i.m12537E0(C3030a.class);
        C3032c c3032c = C3032c.f9125o0;
        if (c3032c == null) {
            synchronized (C3032c.class) {
                try {
                    c3032c = C3032c.f9125o0;
                    if (c3032c == null) {
                        c3032c = new C3032c(0);
                        C3032c.f9125o0 = c3032c;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return new C3031b(setM12537E0, c3032c);
    }

    @Override // livekit.org.webrtc.Loggable
    public void onLogMessage(String str, Logging.Severity severity, String str2) {
    }
}
