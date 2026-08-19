package p993rj;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.Image;
import android.media.ImageReader;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import io.sentry.instrumentation.file.C15379d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17312o;
import p003A1.AbstractC0168G;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p050Bn.C1451e;
import p077Cn.EnumC1733a;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.C2153Q0;
import p1048uo.AbstractC20405l;
import p153Fn.AbstractC2935m;
import p153Fn.C2925c;
import p201Hn.C3516e;
import p523V9.AbstractC7942M5;
import p544W9.AbstractC8752z3;
import p571X9.AbstractC9233X;
import p949pj.C18428A;
import p949pj.C18444Q;
import p996rm.EnumC19250a;
import sj.C19661b;
import sm.AbstractC19687c;
import tj.EnumC19999a;

/* JADX INFO: renamed from: rj.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C19024D {

    /* JADX INFO: renamed from: A */
    public ImageReader f60613A;

    /* JADX INFO: renamed from: B */
    public final C2127D0 f60614B;

    /* JADX INFO: renamed from: C */
    public final ConditionVariable f60615C;

    /* JADX INFO: renamed from: a */
    public final Context f60616a;

    /* JADX INFO: renamed from: b */
    public final C19032L f60617b;

    /* JADX INFO: renamed from: c */
    public final Camera2PreviewView f60618c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC19044f f60619d;

    /* JADX INFO: renamed from: e */
    public final EnumC19999a f60620e;

    /* JADX INFO: renamed from: f */
    public final boolean f60621f;

    /* JADX INFO: renamed from: g */
    public final C19661b f60622g;

    /* JADX INFO: renamed from: h */
    public final C18428A f60623h;

    /* JADX INFO: renamed from: i */
    public final C2925c f60624i;

    /* JADX INFO: renamed from: j */
    public final CameraManager f60625j;

    /* JADX INFO: renamed from: k */
    public final CameraCharacteristics f60626k;

    /* JADX INFO: renamed from: l */
    public final int f60627l;

    /* JADX INFO: renamed from: m */
    public final C19038S f60628m;

    /* JADX INFO: renamed from: n */
    public CameraDevice f60629n;

    /* JADX INFO: renamed from: o */
    public final Handler f60630o;

    /* JADX INFO: renamed from: p */
    public C19031K f60631p;

    /* JADX INFO: renamed from: q */
    public volatile boolean f60632q;

    /* JADX INFO: renamed from: r */
    public volatile boolean f60633r;

    /* JADX INFO: renamed from: s */
    public volatile boolean f60634s;

    /* JADX INFO: renamed from: t */
    public volatile boolean f60635t;

    /* JADX INFO: renamed from: u */
    public final C2153Q0 f60636u;

    /* JADX INFO: renamed from: v */
    public final C2153Q0 f60637v;

    /* JADX INFO: renamed from: w */
    public final C2153Q0 f60638w;

    /* JADX INFO: renamed from: x */
    public boolean f60639x;

    /* JADX INFO: renamed from: y */
    public SurfaceHolderCallbackC19063y f60640y;

    /* JADX INFO: renamed from: z */
    public float f60641z;

    public C19024D(Context context, C19032L cameraChoice, Camera2PreviewView camera2PreviewView, InterfaceC19044f analyzer, EnumC19999a videoCaptureMethod, boolean z6, C19661b cameraStatsManager) throws CameraAccessException {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(cameraChoice, "cameraChoice");
        AbstractC16544l.m18094g(analyzer, "analyzer");
        AbstractC16544l.m18094g(videoCaptureMethod, "videoCaptureMethod");
        AbstractC16544l.m18094g(cameraStatsManager, "cameraStatsManager");
        this.f60616a = context;
        this.f60617b = cameraChoice;
        this.f60618c = camera2PreviewView;
        this.f60619d = analyzer;
        this.f60620e = videoCaptureMethod;
        this.f60621f = z6;
        this.f60622g = cameraStatsManager;
        this.f60623h = cameraChoice.f60676h;
        C2925c c2925cM1174c = AbstractC0575H.m1174c(AbstractC0593T.f1824a.plus(AbstractC0575H.m1176e()));
        this.f60624i = c2925cM1174c;
        String str = cameraChoice.f60669a;
        Object systemService = context.getSystemService("camera");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        this.f60625j = cameraManager;
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
        AbstractC16544l.m18093f(cameraCharacteristics, "getCameraCharacteristics(...)");
        this.f60626k = cameraCharacteristics;
        Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int iIntValue = ((Number) obj).intValue();
        this.f60627l = iIntValue;
        Object upper = cameraChoice.f60672d.getUpper();
        AbstractC16544l.m18093f(upper, "getUpper(...)");
        this.f60628m = new C19038S(context, cameraChoice, ((Number) upper).intValue(), iIntValue, z6);
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        handlerThread.start();
        this.f60630o = new Handler(handlerThread.getLooper());
        this.f60633r = true;
        this.f60636u = AbstractC2124C.m3204c(null);
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(C19049k.f60711a);
        this.f60637v = c2153q0M3204c;
        this.f60638w = c2153q0M3204c;
        this.f60641z = 1.0f;
        this.f60613A = m20280b();
        this.f60614B = AbstractC2124C.m3203b(0, 1, EnumC1733a.f4961Y, 1);
        this.f60615C = new ConditionVariable();
        AbstractC0575H.m1156D(c2925cM1174c, null, null, new C19046h(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m20279a(C19024D c19024d, AbstractC19687c abstractC19687c) throws Throwable {
        C19021A c19021a;
        if (abstractC19687c instanceof C19021A) {
            c19021a = (C19021A) abstractC19687c;
            int i10 = c19021a.f60605o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19021a.f60605o0 = i10 - Integer.MIN_VALUE;
            } else {
                c19021a = new C19021A(abstractC19687c);
            }
        } else {
            c19021a = new C19021A(abstractC19687c);
        }
        Object obj = c19021a.f60604Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19021a.f60605o0;
        C17296C c17296c = C17296C.f55119a;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj);
                c19021a.f60603Y = c19024d;
                c19021a.f60605o0 = 1;
                c19024d.getClass();
                C3516e c3516e = AbstractC0593T.f1824a;
                Object objM1168P = AbstractC0575H.m1168P(AbstractC2935m.f8797a, new C19055q(c19024d, null), c19021a);
                if (objM1168P != enumC19250a) {
                    objM1168P = c17296c;
                }
                if (objM1168P == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c19024d = c19021a.f60603Y;
                AbstractC9233X.m9807c(obj);
            }
            C2153Q0 c2153q0 = c19024d.f60637v;
            C19052n c19052n = C19052n.f60714a;
            c2153q0.getClass();
            c2153q0.m3251l(null, c19052n);
        } catch (Exception e10) {
            C2153Q0 c2153q1 = c19024d.f60637v;
            C19051m c19051m = new C19051m(new C19047i("Unable to initialize Camera2 classes", e10));
            c2153q1.getClass();
            c2153q1.m3251l(null, c19051m);
        }
        return c17296c;
    }

    /* JADX INFO: renamed from: b */
    public final ImageReader m20280b() {
        C19032L c19032l = this.f60617b;
        ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (c19032l.f60670b.getWidth() * this.f60641z), (int) (c19032l.f60670b.getHeight() * this.f60641z), 35, 3);
        imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: rj.g
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                C19024D this$0 = this.f60708a;
                AbstractC16544l.m18094g(this$0, "this$0");
                Image imageAcquireNextImage = imageReader.acquireNextImage();
                int i10 = this$0.f60617b.f60673e;
                EnumC19999a enumC19999a = EnumC19999a.f63314Y;
                if (imageAcquireNextImage == null || this$0.f60614B.mo3231f(imageAcquireNextImage)) {
                    return;
                }
                imageAcquireNextImage.close();
            }
        }, this.f60630o);
        return imageReaderNewInstance;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m20281c(AbstractC19687c abstractC19687c) {
        C19057s c19057s;
        if (abstractC19687c instanceof C19057s) {
            c19057s = (C19057s) abstractC19687c;
            int i10 = c19057s.f60724o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19057s.f60724o0 = i10 - Integer.MIN_VALUE;
            } else {
                c19057s = new C19057s(this, abstractC19687c);
            }
        } else {
            c19057s = new C19057s(this, abstractC19687c);
        }
        Object objM1168P = c19057s.f60722Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19057s.f60724o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM1168P);
            C3516e c3516e = AbstractC0593T.f1824a;
            C1451e c1451e = AbstractC2935m.f8797a;
            C19060v c19060v = new C19060v(this, null);
            c19057s.f60724o0 = 1;
            objM1168P = AbstractC0575H.m1168P(c1451e, c19060v, c19057s);
            if (objM1168P == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM1168P);
        }
        return ((C17312o) objM1168P).f55139Y;
    }

    /* JADX INFO: renamed from: d */
    public final File m20282d(Image image) {
        Bitmap bitmapM21072c = AbstractC20405l.m21072c(image, this.f60627l);
        if (bitmapM21072c == null) {
            return null;
        }
        File file = new File(this.f60616a.getCacheDir(), AbstractC0168G.m533v("persona_camera_", System.currentTimeMillis(), ".jpg"));
        C15379d c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file), file);
        try {
            bitmapM21072c.compress(Bitmap.CompressFormat.JPEG, 80, c15379dM9509d);
            AbstractC7942M5.m8232a(c15379dM9509d, null);
            bitmapM21072c.recycle();
            return file;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(c15379dM9509d, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m20283e(AbstractC19687c abstractC19687c) {
        C19022B c19022b;
        C19024D c19024d;
        if (abstractC19687c instanceof C19022B) {
            c19022b = (C19022B) abstractC19687c;
            int i10 = c19022b.f60609p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19022b.f60609p0 = i10 - Integer.MIN_VALUE;
            } else {
                c19022b = new C19022B(this, abstractC19687c);
            }
        } else {
            c19022b = new C19022B(this, abstractC19687c);
        }
        Object obj = c19022b.f60607Z;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c19022b.f60609p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            if (this.f60632q) {
                return Boolean.FALSE;
            }
            C19038S c19038s = this.f60628m;
            c19022b.f60606Y = this;
            c19022b.f60609p0 = 1;
            c19038s.getClass();
            Object objM1168P = AbstractC0575H.m1168P(AbstractC0593T.f1824a, new C19036P(c19038s, null), c19022b);
            if (objM1168P != obj2) {
                objM1168P = C17296C.f55119a;
            }
            if (objM1168P == obj2) {
                return obj2;
            }
            c19024d = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c19024d = c19022b.f60606Y;
            AbstractC9233X.m9807c(obj);
        }
        c19024d.f60632q = true;
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Serializable m20284f(AbstractC19687c abstractC19687c) {
        C19023C c19023c;
        if (abstractC19687c instanceof C19023C) {
            c19023c = (C19023C) abstractC19687c;
            int i10 = c19023c.f60612o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19023c.f60612o0 = i10 - Integer.MIN_VALUE;
            } else {
                c19023c = new C19023C(this, abstractC19687c);
            }
        } else {
            c19023c = new C19023C(this, abstractC19687c);
        }
        Object objM1168P = c19023c.f60610Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19023c.f60612o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM1168P);
            if (!this.f60632q) {
                return AbstractC9233X.m9806b(new C18444Q());
            }
            this.f60632q = false;
            C19038S c19038s = this.f60628m;
            c19023c.f60612o0 = 1;
            c19038s.getClass();
            objM1168P = AbstractC0575H.m1168P(AbstractC0593T.f1824a, new C19037Q(c19038s, null), c19023c);
            if (objM1168P == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM1168P);
        }
        File file = (File) objM1168P;
        return file == null ? AbstractC9233X.m9806b(new RuntimeException("Recording failed.")) : file;
    }
}
