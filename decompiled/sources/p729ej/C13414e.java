package p729ej;

import af.C10564U;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import fj.AbstractC13669a;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15374i0;
import io.sentry.util.AbstractC15496a;
import io.sentry.vendor.gson.stream.C15515c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AbstractC16544l;
import na.InterfaceC17540a;
import p017Af.C0485p;
import p030B2.AbstractC0738T;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p056C2.InterfaceC1522p;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p1027tp.C20063g;
import p1027tp.C20077u;
import p1027tp.InterfaceC20061e;
import p1033u5.C20116a;
import p1033u5.C20117b;
import p1033u5.InterfaceC20122g;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1087wj.InterfaceC20971B;
import p167Gb.C3032c;
import p257K3.C4535c;
import p259K5.C4544f;
import p470T4.AbstractC7255t;
import p482Tg.C7443a0;
import p544W9.AbstractC8656j3;
import p571X9.AbstractC9233X;
import p594Y9.C9895g4;
import p658b5.C11238i;
import p658b5.C11248s;
import p720e6.C13287b;
import p746fa.C13606o;
import p746fa.InterfaceC13594c;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13784r;
import p758g0.InterfaceC13772l;
import p758g0.InterfaceC13786s;
import p758g0.InterfaceC13787s0;
import p826j6.C16137F;
import p860l0.InterfaceC16694M0;
import p881m0.AbstractC17136m;
import p881m0.C17124a;
import p881m0.C17129f;
import p881m0.C17132i;
import p881m0.InterfaceC17125b;
import p917o6.C17839G;
import p917o6.C17844L;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import p949pj.C18428A;
import p949pj.C18430C;
import p949pj.C18445S;
import p949pj.InterfaceC18483p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import p999s.InterfaceC19349f0;

/* JADX INFO: renamed from: ej.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C13414e implements InterfaceC13410a, InterfaceC13418i, InterfaceC13787s0, InterfaceC1522p, InterfaceC17125b, InterfaceC19349f0, InterfaceC17540a, InterfaceC17848a, InterfaceC18483p, InterfaceC13594c, InterfaceC20061e, InterfaceC20122g {

    /* JADX INFO: renamed from: Y */
    public final Object f42490Y;

    public /* synthetic */ C13414e(Object obj) {
        this.f42490Y = obj;
    }

    /* JADX INFO: renamed from: D */
    public static C9895g4 m14951D() {
        return new C9895g4(new BitSet());
    }

    @Override // p729ej.InterfaceC13418i
    /* JADX INFO: renamed from: B */
    public void mo3393B(Object obj) {
        AbstractC13431v value = (AbstractC13431v) obj;
        AbstractC16544l.m18094g(value, "value");
        new C10564U(this, 26);
        throw null;
    }

    @Override // p1027tp.InterfaceC20061e
    /* JADX INFO: renamed from: C */
    public Object mo10193C(C20077u c20077u) {
        C20063g c20063g = new C20063g(c20077u);
        c20077u.mo20893E(new C9895g4(c20063g));
        return c20063g;
    }

    /* JADX INFO: renamed from: E */
    public C9895g4 m14953E() {
        return new C9895g4((BitSet) ((BitSet) this.f42490Y).clone());
    }

    /* JADX INFO: renamed from: G */
    public void m14954G(C11248s c11248s, InterfaceC15127H interfaceC15127H, Object obj) throws IOException {
        C15515c c15515c = (C15515c) c11248s.f34081Z;
        if (obj == null) {
            c15515c.m16726m();
            return;
        }
        if (obj instanceof Character) {
            c11248s.m12660D(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            c11248s.m12660D((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            c11248s.m12661E(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            c11248s.m12659B((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                c11248s.m12660D(AbstractC8656j3.m9344l((Date) obj));
                return;
            } catch (Exception e10) {
                interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Error when serializing Date", e10);
                c15515c.m16726m();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                c11248s.m12660D(((TimeZone) obj).getID());
                return;
            } catch (Exception e11) {
                interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Error when serializing TimeZone", e11);
                c15515c.m16726m();
                return;
            }
        }
        if (obj instanceof InterfaceC15374i0) {
            ((InterfaceC15374i0) obj).serialize(c11248s, interfaceC15127H);
            return;
        }
        if (obj instanceof Collection) {
            m14955H(c11248s, interfaceC15127H, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            m14955H(c11248s, interfaceC15127H, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            m14956I(c11248s, interfaceC15127H, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            c11248s.m12660D(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = AbstractC15496a.f48415a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i10)));
            }
            m14955H(c11248s, interfaceC15127H, arrayList);
            return;
        }
        if (obj instanceof AtomicBoolean) {
            c11248s.m12661E(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            c11248s.m12660D(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            c11248s.m12660D(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            c11248s.m12660D(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            c11248s.m12660D(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            m14956I(c11248s, interfaceC15127H, AbstractC15496a.m16683a((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            c11248s.m12660D(obj.toString());
            return;
        }
        try {
            m14954G(c11248s, interfaceC15127H, ((C16137F) this.f42490Y).m17698s(interfaceC15127H, obj));
        } catch (Exception e12) {
            interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Failed serializing unknown object.", e12);
            c11248s.m12660D("[OBJECT]");
        }
    }

    /* JADX INFO: renamed from: H */
    public void m14955H(C11248s c11248s, InterfaceC15127H interfaceC15127H, Collection collection) throws IOException {
        C15515c c15515c = (C15515c) c11248s.f34081Z;
        c15515c.m16722S();
        c15515c.m16723a();
        int i10 = c15515c.f48459o0;
        int[] iArr = c15515c.f48458Z;
        if (i10 == iArr.length) {
            c15515c.f48458Z = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = c15515c.f48458Z;
        int i11 = c15515c.f48459o0;
        c15515c.f48459o0 = i11 + 1;
        iArr2[i11] = 1;
        c15515c.f48457Y.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m14954G(c11248s, interfaceC15127H, it.next());
        }
        c15515c.m16724e(']', 1, 2);
    }

    /* JADX INFO: renamed from: I */
    public void m14956I(C11248s c11248s, InterfaceC15127H interfaceC15127H, Map map) throws IOException {
        c11248s.m12663d();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                c11248s.m12668o((String) obj);
                m14954G(c11248s, interfaceC15127H, map.get(obj));
            }
        }
        c11248s.m12665h();
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, C17844L value) {
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        AbstractC16544l.m18094g(value, "value");
        ((C17839G) this.f42490Y).mo369f(writer, customScalarAdapters, value.f56901a);
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: K */
    public AbstractC13784r mo3877K(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return ((C11238i) this.f42490Y).mo3877K(j10, abstractC13784r, abstractC13784r2, abstractC13784r3);
    }

    /* JADX INFO: renamed from: L */
    public Object m14958L(InterfaceC1426a interfaceC1426a) {
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.f42490Y;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Object objInvoke = interfaceC1426a.invoke();
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            return objInvoke;
        } finally {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
        }
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: b */
    public C2153Q0 mo209b() {
        return AbstractC2124C.m3204c(C18430C.f58797b);
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: d */
    public boolean mo3881d() {
        ((C11238i) this.f42490Y).getClass();
        return false;
    }

    @Override // p1033u5.InterfaceC20122g
    /* JADX INFO: renamed from: e */
    public void mo14959e(C20116a c20116a, Bitmap bitmap, Map map) {
        ((C4544f) this.f42490Y).m5310d(c20116a, bitmap, map, AbstractC7255t.m7695c(bitmap));
    }

    @Override // p881m0.InterfaceC17125b
    /* JADX INFO: renamed from: g */
    public Object mo10556g(InterfaceC16694M0 interfaceC16694M0, Float f10, Float f11, C17129f c17129f, C17132i c17132i) {
        float fFloatValue = f10.floatValue();
        float fFloatValue2 = f11.floatValue();
        Object objM18901b = AbstractC17136m.m18901b(interfaceC16694M0, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, AbstractC13758e.m15237b(0.0f, fFloatValue2, 28), (InterfaceC13772l) this.f42490Y, c17129f, c17132i);
        return objM18901b == EnumC19250a.f61036Y ? objM18901b : (C17124a) objM18901b;
    }

    @Override // p056C2.InterfaceC1522p
    /* JADX INFO: renamed from: h */
    public boolean mo205h(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f42490Y;
        if (!swipeDismissBehavior.mo13582r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        boolean z6 = view.getLayoutDirection() == 1;
        int i10 = swipeDismissBehavior.f36407e;
        view.offsetLeftAndRight((!(i10 == 0 && z6) && (i10 != 1 || z6)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        C13287b c13287b = swipeDismissBehavior.f36404b;
        if (c13287b != null) {
            c13287b.m14906n(view);
        }
        return true;
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: i */
    public View mo215i() {
        return (Camera2PreviewView) this.f42490Y;
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        return new C17844L(((C17839G) this.f42490Y).mo373j(reader, customScalarAdapters));
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: k */
    public Object mo217k(InterfaceC18770c interfaceC18770c) {
        return AbstractC9233X.m9806b(new C18445S());
    }

    @Override // p1027tp.InterfaceC20061e
    /* JADX INFO: renamed from: m */
    public Type mo10217m() {
        return (Type) this.f42490Y;
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: o */
    public Object mo221o(InterfaceC18770c interfaceC18770c) {
        return Boolean.FALSE;
    }

    @Override // p729ej.InterfaceC13410a
    /* JADX INFO: renamed from: p */
    public Object mo3404p(AbstractC13422m child, Object obj, String key, InterfaceC1436k handler) {
        AbstractC16544l.m18094g(child, "child");
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(handler, "handler");
        new C0485p(this, 10);
        throw null;
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: q */
    public long mo3882q(AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return ((C11238i) this.f42490Y).mo3882q(abstractC13784r, abstractC13784r2, abstractC13784r3);
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: r */
    public Object mo224r(InterfaceC18770c interfaceC18770c) {
        return AbstractC9233X.m9806b(new C18445S());
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: s */
    public AbstractC13784r mo3883s(AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return ((C11238i) this.f42490Y).mo3883s(abstractC13784r, abstractC13784r2, abstractC13784r3);
    }

    @Override // p746fa.InterfaceC13594c
    /* JADX INFO: renamed from: t */
    public void mo258t(C13606o c13606o) {
        ((CountDownLatch) this.f42490Y).countDown();
    }

    @Override // p758g0.InterfaceC13787s0
    /* JADX INFO: renamed from: u */
    public AbstractC13784r mo3884u(long j10, AbstractC13784r abstractC13784r, AbstractC13784r abstractC13784r2, AbstractC13784r abstractC13784r3) {
        return ((C11238i) this.f42490Y).mo3884u(j10, abstractC13784r, abstractC13784r2, abstractC13784r3);
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: v */
    public C18428A mo225v() {
        return new C18428A();
    }

    @Override // p1033u5.InterfaceC20122g
    /* JADX INFO: renamed from: w */
    public C20117b mo14960w(C20116a c20116a) {
        return null;
    }

    @Override // p729ej.InterfaceC13410a
    /* JADX INFO: renamed from: z */
    public void mo3410z(String key, InterfaceC1439n interfaceC1439n) {
        AbstractC16544l.m18094g(key, "key");
        new C13413d(interfaceC1439n, this, null);
        new C7443a0(this, 11);
        throw null;
    }

    public C13414e() {
        this.f42490Y = new ReentrantReadWriteLock();
    }

    public C13414e(C9895g4 c9895g4) {
        this.f42490Y = (BitSet) c9895g4.f29409Y;
    }

    public C13414e(int i10) {
        this.f42490Y = new C16137F(i10);
    }

    public C13414e(InterfaceC20971B service) {
        AbstractC16544l.m18094g(service, "service");
        this.f42490Y = service;
    }

    public C13414e(C17839G wrappedAdapter) {
        AbstractC16544l.m18094g(wrappedAdapter, "wrappedAdapter");
        this.f42490Y = wrappedAdapter;
    }

    public C13414e(InterfaceC13410a interfaceC13410a, AbstractC13669a interceptor) {
        AbstractC16544l.m18094g(interceptor, "interceptor");
        this.f42490Y = interfaceC13410a;
    }

    public C13414e(float f10, float f11, AbstractC13784r abstractC13784r) {
        InterfaceC13786s c3032c;
        if (abstractC13784r != null) {
            c3032c = new C4535c(f10, f11, abstractC13784r);
        } else {
            c3032c = new C3032c(f10, f11);
        }
        this.f42490Y = new C11238i(c3032c);
    }

    @Override // p1033u5.InterfaceC20122g
    /* JADX INFO: renamed from: A */
    public void mo14952A() {
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: a */
    public void mo208a() {
    }

    @Override // p729ej.InterfaceC13410a
    /* JADX INFO: renamed from: l */
    public InterfaceC13418i mo3400l() {
        return this;
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: n */
    public void mo220n() {
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: c */
    public void mo210c(boolean z6) {
    }

    @Override // p949pj.InterfaceC18483p
    /* JADX INFO: renamed from: x */
    public void mo226x(boolean z6) {
    }

    @Override // p1033u5.InterfaceC20122g
    /* JADX INFO: renamed from: y */
    public void mo14961y(int i10) {
    }
}
