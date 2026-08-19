package p999s;

import android.graphics.SurfaceTexture;
import ca.C11692a;
import io.sentry.android.core.AbstractC15256t;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p030B2.C0742X;
import p035B7.InterfaceC0847d;
import p1020t7.C19807e;
import p1035u7.C20145c;
import p1057v6.C20462b;
import p1057v6.C20463c;
import p1076w6.C20844b;
import p1113xn.AbstractC21329w;
import p1139z0.InterfaceC21654z0;
import p228J.AbstractC3794B0;
import p257K3.C4535c;
import p375P6.AbstractTextureViewSurfaceTextureListenerC6373j;
import p375P6.C6364a;
import p375P6.InterfaceC6365b;
import p375P6.InterfaceC6366c;
import p477Tb.C7296c;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8183r5;
import p523V9.AbstractC8206u4;
import p571X9.AbstractC9141H2;
import p571X9.AbstractC9154J3;
import p571X9.AbstractC9227W;
import p633a.AbstractC10441a;
import p658b5.C11234e;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p784hb.C14438g;
import p817j$.util.DesugarCollections;
import p866l7.C16828a;
import p901n7.InterfaceC17512a;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p917o6.AbstractC17865r;
import p917o6.C17859l;
import p917o6.C17860m;
import p918o7.C17878e;
import p943p7.C18303a;
import p943p7.C18304b;
import p943p7.C18305c;
import p943p7.InterfaceC18306d;

/* JADX INFO: renamed from: s.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C19341c1 implements InterfaceC18306d, InterfaceC17512a, InterfaceC21654z0 {

    /* JADX INFO: renamed from: Y */
    public Object f61254Y;

    /* JADX INFO: renamed from: Z */
    public Object f61255Z;

    /* JADX INFO: renamed from: o0 */
    public Object f61256o0;

    /* JADX INFO: renamed from: p0 */
    public Object f61257p0;

    /* JADX INFO: renamed from: q0 */
    public Object f61258q0;

    /* JADX INFO: renamed from: r0 */
    public Object f61259r0;

    /* JADX INFO: renamed from: s0 */
    public Object f61260s0;

    public C19341c1(String str, String str2, Set set) {
        C11692a c11692a = C11692a.f35478Y;
        Set setEmptySet = set == null ? Collections.emptySet() : DesugarCollections.unmodifiableSet(set);
        this.f61254Y = setEmptySet;
        Map mapEmptyMap = Collections.emptyMap();
        this.f61256o0 = mapEmptyMap;
        this.f61257p0 = str;
        this.f61258q0 = str2;
        this.f61259r0 = c11692a;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = mapEmptyMap.values().iterator();
        if (it.hasNext()) {
            throw AbstractC3794B0.m4497v(it);
        }
        this.f61255Z = DesugarCollections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: c */
    public static void m20438c(List list, String str, String str2, C4535c c4535c) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC17865r abstractC17865r = (AbstractC17865r) it.next();
            if (abstractC17865r instanceof C17859l) {
                c4535c.f14813Z.add(abstractC17865r);
            } else {
                if (!(abstractC17865r instanceof C17860m)) {
                    throw new C0644w();
                }
                C17860m c17860m = (C17860m) abstractC17865r;
                if (AbstractC17680n.m19333J(c17860m.f56953b, str2) || c17860m.f56952a.equals(str)) {
                    m20438c(c17860m.f56954c, str, str2, c4535c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m20439f(List list, String str, C14438g c14438g, String str2) {
        C4535c c4535c = new C4535c(c14438g);
        m20438c(list, str, str2, c4535c);
        ArrayList arrayList = c4535c.f14813Z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            C17859l c17859l = (C17859l) obj;
            C17309l c17309l = new C17309l(c17859l.f56947a, c17859l.f56949c);
            Object arrayList2 = linkedHashMap.get(c17309l);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(c17309l, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        Collection<List> collectionValues = linkedHashMap.values();
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(collectionValues, 10));
        for (List list2 : collectionValues) {
            C17859l c17859l2 = (C17859l) AbstractC17680n.m19341Q(list2);
            String str3 = c17859l2.f56947a;
            AbstractC9154J3 type = c17859l2.f56948b;
            AbstractC16544l.m18094g(type, "type");
            ArrayList arrayList4 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AbstractC17686t.m19398v(((C17859l) it.next()).f56951e, arrayList4);
            }
            arrayList3.add(new C17859l(str3, type, c17859l2.f56949c, c17859l2.f56950d, arrayList4));
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: j */
    public static Long m20440j(File file, InterfaceC11256c interfaceC11256c) {
        String name = file.getName();
        AbstractC16544l.m18093f(name, "this.name");
        Long lM21738y = AbstractC21329w.m21738y(name);
        if (lM21738y == null) {
            AbstractC7889G0.m8184b(interfaceC11256c, 5, EnumC11255b.f34099Z, new C18304b(file, 0), null, false, 56);
        }
        return lM21738y;
    }

    /* JADX INFO: renamed from: l */
    public static String m20441l(File file) {
        Locale locale;
        String str;
        File parentFile = file.getParentFile();
        String name = parentFile != null ? parentFile.getName() : null;
        if (name == null) {
            return null;
        }
        if (C20145c.f63814u0.m21664d(name)) {
            locale = Locale.US;
            str = "PENDING";
        } else {
            if (!C20145c.f63813t0.m21664d(name)) {
                return null;
            }
            locale = Locale.US;
            str = "GRANTED";
        }
        return AbstractC0168G.m534w(locale, "US", str, locale, "toLowerCase(...)");
    }

    @Override // p943p7.InterfaceC18306d
    /* JADX INFO: renamed from: a */
    public void mo18914a(File batchFile, C18303a c18303a) {
        AbstractC16544l.m18094g(batchFile, "batchFile");
        String str = (String) this.f61259r0;
        if (str == null || !((C11234e) this.f61258q0).m12504H()) {
            return;
        }
        InterfaceC11256c interfaceC11256c = (InterfaceC11256c) this.f61256o0;
        if (AbstractC8206u4.m8824f(batchFile, interfaceC11256c)) {
            Long lM20440j = m20440j(batchFile, interfaceC11256c);
            Map mapM19244f = null;
            if (lM20440j != null) {
                long jLongValue = c18303a.f58424a - lM20440j.longValue();
                if (jLongValue >= 0) {
                    mapM19244f = AbstractC17659D.m19244f(new C17309l("track", str), new C17309l("metric_type", "batch closed"), new C17309l("batch_duration", Long.valueOf(jLongValue)), new C17309l("uploader_window", Long.valueOf(((C19807e) this.f61255Z).f62837a)), new C17309l("batch_size", Long.valueOf(AbstractC8206u4.m8825g(batchFile, interfaceC11256c))), new C17309l("batch_events_count", Long.valueOf(c18303a.f58426c)), new C17309l("forced_new", Boolean.valueOf(c18303a.f58425b)), new C17309l("consent", m20441l(batchFile)), new C17309l("filename", batchFile.getName()), new C17309l("thread", Thread.currentThread().getName()));
                }
            }
            if (mapM19244f != null) {
                ((C17878e) interfaceC11256c).m19604c(C18305c.f58429Z, mapM19244f, 0.1f);
            }
        }
    }

    @Override // p943p7.InterfaceC18306d
    /* JADX INFO: renamed from: b */
    public void mo18915b(File batchFile, AbstractC10441a abstractC10441a) {
        AbstractC16544l.m18094g(batchFile, "batchFile");
        String str = (String) this.f61259r0;
        if (str == null || !((C11234e) this.f61258q0).m12504H()) {
            return;
        }
        InterfaceC11256c interfaceC11256c = (InterfaceC11256c) this.f61256o0;
        Long lM20440j = m20440j(batchFile, interfaceC11256c);
        Map mapM19244f = null;
        mapM19244f = null;
        if (lM20440j != null) {
            long jMo1907l = ((InterfaceC0847d) this.f61257p0).mo1907l() - lM20440j.longValue();
            if (jMo1907l >= 0) {
                C17309l c17309l = new C17309l("track", str);
                C17309l c17309l2 = new C17309l("metric_type", "batch deleted");
                C17309l c17309l3 = new C17309l("batch_age", Long.valueOf(jMo1907l));
                C16828a c16828a = (C16828a) this.f61254Y;
                mapM19244f = AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, new C17309l("uploader_delay", AbstractC17659D.m19244f(new C17309l("min", c16828a != null ? Long.valueOf(c16828a.f54002c) : null), new C17309l("max", c16828a != null ? Long.valueOf(c16828a.f54003d) : null))), new C17309l("uploader_window", Long.valueOf(((C19807e) this.f61255Z).f62837a)), new C17309l("batch_removal_reason", abstractC10441a.toString()), new C17309l("in_background", Boolean.valueOf(((AtomicBoolean) this.f61260s0).get())), new C17309l("consent", m20441l(batchFile)), new C17309l("filename", batchFile.getName()), new C17309l("thread", Thread.currentThread().getName()));
            }
        }
        if (mapM19244f != null) {
            ((C17878e) interfaceC11256c).m19604c(C18305c.f58430o0, mapM19244f, 0.1f);
        }
    }

    @Override // p901n7.InterfaceC17512a
    /* JADX INFO: renamed from: d */
    public void mo5852d() {
        ((AtomicBoolean) this.f61260s0).set(true);
    }

    /* JADX INFO: renamed from: g */
    public boolean m20442g() {
        if (((AbstractTextureViewSurfaceTextureListenerC6373j) this.f61260s0).getEnableLogEgl$lib_release()) {
            String message = "createSurface()  tid=" + Thread.currentThread().getId();
            AbstractC16544l.m18094g(message, "message");
            if (AbstractC9141H2.f27918a) {
                AbstractC15256t.m16482t("EglHelper", message);
            }
        }
        if (((EGL10) this.f61255Z) == null) {
            throw new RuntimeException("egl not initialized");
        }
        if (((EGLDisplay) this.f61256o0) == null) {
            throw new RuntimeException("eglDisplay not initialized");
        }
        if (((EGLConfig) this.f61258q0) == null) {
            throw new RuntimeException("mEglConfig not initialized");
        }
        m20443i();
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j = (AbstractTextureViewSurfaceTextureListenerC6373j) ((WeakReference) this.f61254Y).get();
        EGLSurface eGLSurfaceEglCreateWindowSurface = null;
        if (abstractTextureViewSurfaceTextureListenerC6373j != null && abstractTextureViewSurfaceTextureListenerC6373j.f20749E0 != null) {
            EGL10 egl10 = (EGL10) this.f61255Z;
            EGLDisplay eGLDisplay = (EGLDisplay) this.f61256o0;
            EGLConfig eGLConfig = (EGLConfig) this.f61258q0;
            SurfaceTexture surfaceTexture = abstractTextureViewSurfaceTextureListenerC6373j.getSurfaceTexture();
            if (egl10 != null) {
                try {
                    eGLSurfaceEglCreateWindowSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, surfaceTexture, null);
                } catch (IllegalArgumentException e10) {
                    if (AbstractC9141H2.f27918a) {
                        AbstractC15256t.m16466d("GLTextureView", "eglCreateWindowSurface", e10);
                    }
                }
            }
        }
        this.f61257p0 = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
            EGL10 egl11 = (EGL10) this.f61255Z;
            AbstractC16544l.m18091d(egl11);
            if (egl11.eglGetError() == 12299 && AbstractC9141H2.f27918a) {
                AbstractC15256t.m16465c("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
            }
            return false;
        }
        EGL10 egl12 = (EGL10) this.f61255Z;
        AbstractC16544l.m18091d(egl12);
        EGLDisplay eGLDisplay2 = (EGLDisplay) this.f61256o0;
        EGLSurface eGLSurface = (EGLSurface) this.f61257p0;
        if (egl12.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, (EGLContext) this.f61259r0)) {
            return true;
        }
        EGL10 egl13 = (EGL10) this.f61255Z;
        AbstractC16544l.m18091d(egl13);
        String message2 = AbstractC9227W.m9798a(egl13.eglGetError(), "eglMakeCurrent");
        AbstractC16544l.m18094g(message2, "message");
        if (AbstractC9141H2.f27918a) {
            AbstractC15256t.m16482t("EGLHelper", message2);
        }
        return false;
    }

    @Override // p901n7.InterfaceC17512a
    /* JADX INFO: renamed from: h */
    public void mo5854h() {
        ((AtomicBoolean) this.f61260s0).set(false);
    }

    /* JADX INFO: renamed from: i */
    public void m20443i() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = (EGLSurface) this.f61257p0;
        if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            return;
        }
        EGL10 egl10 = (EGL10) this.f61255Z;
        AbstractC16544l.m18091d(egl10);
        egl10.eglMakeCurrent((EGLDisplay) this.f61256o0, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j = (AbstractTextureViewSurfaceTextureListenerC6373j) ((WeakReference) this.f61254Y).get();
        if (abstractTextureViewSurfaceTextureListenerC6373j != null && abstractTextureViewSurfaceTextureListenerC6373j.f20749E0 != null) {
            EGL10 egl11 = (EGL10) this.f61255Z;
            EGLDisplay eGLDisplay = (EGLDisplay) this.f61256o0;
            EGLSurface eGLSurface3 = (EGLSurface) this.f61257p0;
            if (egl11 != null) {
                egl11.eglDestroySurface(eGLDisplay, eGLSurface3);
            }
        }
        this.f61257p0 = null;
    }

    /* JADX INFO: renamed from: k */
    public void m20444k(Object obj, ArrayList arrayList, List list, String str) {
        if (obj instanceof C20462b) {
            ((ArrayList) this.f61260s0).add(new C20844b(((C20462b) obj).f64956a, arrayList, list, str));
            return;
        }
        if (obj instanceof List) {
            int i10 = 0;
            for (Object obj2 : (Iterable) obj) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                m20444k(obj2, AbstractC17680n.m19362l0(arrayList, Integer.valueOf(i10)), list, str);
                i10 = i11;
            }
            return;
        }
        if (obj instanceof Map) {
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, @[JvmSuppressWildcards(suppress = <null>)] kotlin.Any?>");
            Map map = (Map) obj;
            Object obj3 = map.get("__typename");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            C14438g c14438g = (C14438g) this.f61255Z;
            ArrayList<C17859l> arrayListM20439f = m20439f(list, str, c14438g, str2);
            ArrayList arrayList2 = new ArrayList();
            for (C17859l c17859l : arrayListM20439f) {
                AbstractC8183r5.m8765c(c17859l, (Map) c14438g.f45414Y);
                Object objM21110a = ((C20463c) this.f61256o0).m21110a(c17859l, c14438g, map, "");
                String str3 = c17859l.f56947a;
                m20444k(objM21110a, AbstractC17680n.m19362l0(arrayList, str3), c17859l.f56951e, c17859l.f56948b.mo9703b().f56956a);
                arrayList2.add(new C17309l(str3, objM21110a));
            }
            AbstractC17659D.m19253o(arrayList2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX INFO: renamed from: n */
    public void m20445n() {
        EGLConfig eGLConfig;
        EGLContext eGLContextEglCreateContext;
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j = (AbstractTextureViewSurfaceTextureListenerC6373j) this.f61260s0;
        if (abstractTextureViewSurfaceTextureListenerC6373j.getEnableLogEgl$lib_release()) {
            String message = "start() tid=" + Thread.currentThread().getId();
            AbstractC16544l.m18094g(message, "message");
            if (AbstractC9141H2.f27918a) {
                AbstractC15256t.m16482t("EglHelper", message);
            }
        }
        EGL egl = EGLContext.getEGL();
        if (egl == null) {
            throw new NullPointerException("null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
        }
        EGL10 egl10 = (EGL10) egl;
        this.f61255Z = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f61256o0 = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed");
        }
        EGL10 egl11 = (EGL10) this.f61255Z;
        AbstractC16544l.m18091d(egl11);
        if (!egl11.eglInitialize((EGLDisplay) this.f61256o0, new int[2])) {
            throw new RuntimeException("eglInitialize failed");
        }
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j2 = (AbstractTextureViewSurfaceTextureListenerC6373j) ((WeakReference) this.f61254Y).get();
        if (abstractTextureViewSurfaceTextureListenerC6373j2 == null) {
            this.f61258q0 = null;
            this.f61259r0 = null;
        } else {
            InterfaceC6365b interfaceC6365b = abstractTextureViewSurfaceTextureListenerC6373j2.f20747C0;
            if (interfaceC6365b == null) {
                eGLConfig = null;
            } else {
                EGL10 egl12 = (EGL10) this.f61255Z;
                EGLDisplay eGLDisplay = (EGLDisplay) this.f61256o0;
                C6364a c6364a = (C6364a) interfaceC6365b;
                int[] iArr = new int[1];
                if (egl12 == null || !egl12.eglChooseConfig(eGLDisplay, c6364a.f20714a, null, 0, iArr)) {
                    throw new IllegalArgumentException("eglChooseConfig failed");
                }
                int i10 = iArr[0];
                if (i10 <= 0) {
                    throw new IllegalArgumentException("No configs match configSpec");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[i10];
                if (!egl12.eglChooseConfig(eGLDisplay, c6364a.f20714a, eGLConfigArr, i10, iArr)) {
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                C0742X c0742xM18098k = AbstractC16544l.m18098k(eGLConfigArr);
                while (true) {
                    if (!c0742xM18098k.hasNext()) {
                        eGLConfig = null;
                        break;
                    }
                    eGLConfig = (EGLConfig) c0742xM18098k.next();
                    int iM6976a = c6364a.m6976a(egl12, eGLDisplay, eGLConfig, 12325);
                    int iM6976a2 = c6364a.m6976a(egl12, eGLDisplay, eGLConfig, 12326);
                    if (iM6976a >= c6364a.f20721h && iM6976a2 >= 0) {
                        int iM6976a3 = c6364a.m6976a(egl12, eGLDisplay, eGLConfig, 12324);
                        int iM6976a4 = c6364a.m6976a(egl12, eGLDisplay, eGLConfig, 12323);
                        int iM6976a5 = c6364a.m6976a(egl12, eGLDisplay, eGLConfig, 12322);
                        int iM6976a6 = c6364a.m6976a(egl12, eGLDisplay, eGLConfig, 12321);
                        if (iM6976a3 == c6364a.f20717d && iM6976a4 == c6364a.f20718e && iM6976a5 == c6364a.f20719f && iM6976a6 == c6364a.f20720g) {
                            break;
                        }
                    }
                }
                if (eGLConfig == null) {
                    throw new IllegalArgumentException("No config chosen");
                }
            }
            this.f61258q0 = eGLConfig;
            InterfaceC6366c interfaceC6366c = abstractTextureViewSurfaceTextureListenerC6373j2.f20748D0;
            if (interfaceC6366c == null) {
                eGLContextEglCreateContext = null;
            } else {
                EGL10 egl13 = (EGL10) this.f61255Z;
                EGLDisplay eGLDisplay2 = (EGLDisplay) this.f61256o0;
                int i11 = ((AbstractTextureViewSurfaceTextureListenerC6373j) ((C7296c) interfaceC6366c).f23104Z).f20751G0;
                int[] iArr2 = {12440, i11, 12344};
                if (egl13 == null) {
                    eGLContextEglCreateContext = null;
                } else {
                    EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                    if (i11 == 0) {
                        iArr2 = null;
                    }
                    eGLContextEglCreateContext = egl13.eglCreateContext(eGLDisplay2, eGLConfig, eGLContext, iArr2);
                }
            }
            this.f61259r0 = eGLContextEglCreateContext;
        }
        EGLContext eGLContext2 = (EGLContext) this.f61259r0;
        if (eGLContext2 == null || eGLContext2 == EGL10.EGL_NO_CONTEXT) {
            this.f61259r0 = null;
            EGL10 egl14 = (EGL10) this.f61255Z;
            throw new RuntimeException(AbstractC9227W.m9798a(egl14 == null ? -1 : egl14.eglGetError(), "createContext"));
        }
        if (abstractTextureViewSurfaceTextureListenerC6373j.getEnableLogEgl$lib_release()) {
            String message2 = "createContext " + ((EGLContext) this.f61259r0) + " tid=" + Thread.currentThread().getId();
            AbstractC16544l.m18094g(message2, "message");
            if (AbstractC9141H2.f27918a) {
                AbstractC15256t.m16482t("EglHelper", message2);
            }
        }
        this.f61257p0 = null;
    }

    @Override // p901n7.InterfaceC17512a
    /* JADX INFO: renamed from: e */
    public void mo5853e() {
    }

    @Override // p901n7.InterfaceC17512a
    /* JADX INFO: renamed from: m */
    public void mo5858m() {
    }
}
