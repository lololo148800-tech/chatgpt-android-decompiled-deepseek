package p001A;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.EnumC11104m;
import com.auth0.android.request.internal.C11842a;
import com.auth0.android.request.internal.C11850i;
import com.auth0.android.result.Credentials;
import com.google.gson.reflect.TypeToken;
import gn.C14198c;
import io.sentry.AbstractC15319b;
import io.sentry.C15126G1;
import io.sentry.C15138K1;
import io.sentry.C15158R1;
import io.sentry.C15347d1;
import io.sentry.C15524y1;
import io.sentry.InterfaceC15127H;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.hints.C15370i;
import io.sentry.protocol.C15425E;
import io.sentry.protocol.C15430c;
import io.sentry.protocol.C15447t;
import io.sentry.protocol.EnumC15423C;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import p001A.C0093v0;
import p001A.RunnableC0074m;
import p028B.C0703j;
import p049Bm.InterfaceC1426a;
import p053C.InterfaceC1468c;
import p057C3.RunnableC1548a;
import p057C3.SurfaceHolderCallbackC1523A;
import p1014t1.C19737n;
import p1014t1.C19740q;
import p1028u.C20087d;
import p1028u.C20089f;
import p105E.C2223b;
import p1061vb.C20513d;
import p117Eb.C2391u;
import p140Fa.C2685e;
import p160G5.p161rK.TVCuK;
import p167Gb.C3032c;
import p178H.C3133a;
import p178H.C3175v;
import p178H.InterfaceC3127U;
import p183H4.C3227b;
import p183H4.C3228c;
import p183H4.C3231f;
import p183H4.InterfaceC3230e;
import p183H4.InterfaceC3232g;
import p228J.InterfaceC3819V;
import p228J.InterfaceC3820W;
import p253K.AbstractC4502m;
import p265Kb.AbstractC4611d;
import p265Kb.C4612e;
import p265Kb.C4613f;
import p265Kb.InterfaceC4623p;
import p283L5.AbstractC4941g;
import p335Nb.AbstractC5704c;
import p392Q0.C6546d;
import p446S6.C7023b;
import p451Sb.C7102a;
import p477Tb.C7296c;
import p499U9.C7591u;
import p521V6.AbstractC7801D;
import p521V6.C7802E;
import p521V6.C7822o;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8111i5;
import p525Vb.C8258a;
import p541W6.InterfaceC8435e;
import p544W9.AbstractC8489H3;
import p544W9.AbstractC8633f4;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9915k0;
import p615Z6.C10252z0;
import p692d0.AbstractC12957J;
import p692d0.C12951D;
import p720e6.C13287b;
import p720e6.C13288c;
import p737f1.AbstractC13512d;
import p737f1.C13526r;
import p737f1.EnumC13525q;
import p746fa.C13606o;
import p746fa.InterfaceC13604m;
import p817j$.util.concurrent.ConcurrentHashMap;
import p959q8.C18639a;
import p996rm.EnumC19250a;
import sk.C19662a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: A.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0093v0 implements InterfaceC3820W, InterfaceC8435e, KotlinTypeChecker.TypeConstructorEquality {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f402Y;

    /* JADX INFO: renamed from: Z */
    public boolean f403Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f404o0;

    /* JADX INFO: renamed from: p0 */
    public Object f405p0;

    public /* synthetic */ C0093v0(Object obj, int i10, Object obj2) {
        this.f402Y = i10;
        this.f404o0 = obj;
        this.f405p0 = obj2;
    }

    /* JADX INFO: renamed from: A */
    public static void m328A(HashSet hashSet, C3175v c3175v, C13287b c13287b) {
        AbstractC4941g.m5559R("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set setMo2108a = ((InterfaceC1468c) c13287b.f42000Z).mo2108a(c3175v);
        if (setMo2108a.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(setMo2108a);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + c3175v + "\nConstraints:\n  " + TextUtils.join("\n  ", setMo2108a) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m329a(C0093v0 c0093v0) {
        ((C12951D) c0093v0.f404o0).m14615a();
        int i10 = 0;
        c0093v0.f403Z = false;
        C6546d c6546d = (C6546d) c0093v0.f405p0;
        int i11 = c6546d.f21184o0;
        if (i11 > 0) {
            Object[] objArr = c6546d.f21182Y;
            do {
                ((InterfaceC1426a) objArr[i10]).invoke();
                i10++;
            } while (i10 < i11);
        }
        c6546d.m7104i();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[LOOP:0: B:5:0x000f->B:19:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0063 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m330b(C0093v0 c0093v0) {
        C12951D c12951d = (C12951D) c0093v0.f404o0;
        Object[] objArr = c12951d.f41124b;
        long[] jArr = c12951d.f41123a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            C13526r c13526r = (C13526r) objArr[(i10 << 3) + i12];
                            c13526r.getClass();
                            EnumC13525q enumC13525q = (EnumC13525q) ((C12951D) AbstractC13512d.m15033F(c13526r).f404o0).m14619e(c13526r);
                            if (enumC13525q == null) {
                                AbstractC8111i5.m8593d("committing a node that was not updated in the current transaction");
                                throw null;
                            }
                            c13526r.f42812B0 = enumC13525q;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        c12951d.m14615a();
        c0093v0.f403Z = false;
        ((C6546d) c0093v0.f405p0).m7104i();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static Object m331e(C0093v0 c0093v0, AbstractC19687c abstractC19687c) {
        C11842a c11842a;
        if (abstractC19687c instanceof C11842a) {
            c11842a = (C11842a) abstractC19687c;
            int i10 = c11842a.f35969p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11842a.f35969p0 = i10 - Integer.MIN_VALUE;
            } else {
                c11842a = new C11842a(c0093v0, abstractC19687c);
            }
        } else {
            c11842a = new C11842a(c0093v0, abstractC19687c);
        }
        Object objM73h = c11842a.f35967Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11842a.f35969p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM73h);
            if (!c0093v0.f403Z) {
                AbstractC15256t.m16465c("v0", "The request is made without validating claims. Enable claim validation by calling AuthenticationRequest#validateClaims()");
            }
            c11842a.f35966Y = c0093v0;
            c11842a.f35969p0 = 1;
            objM73h = ((C0017I0) c0093v0.f404o0).m73h(c11842a);
            if (objM73h == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0093v0 = c11842a.f35966Y;
            AbstractC9233X.m9807c(objM73h);
        }
        Credentials credentials = (Credentials) objM73h;
        if (c0093v0.f403Z) {
            String idToken = credentials.getIdToken();
            c0093v0.getClass();
            AbstractC16544l.m18094g(idToken, "idToken");
            try {
                if (TextUtils.isEmpty(idToken)) {
                    throw new C7822o();
                }
                try {
                    C11850i c11850i = new C11850i(idToken);
                    C10252z0 c10252z0 = new C10252z0((String) c0093v0.f405p0, null);
                    c10252z0.f30459r0 = new Date(System.currentTimeMillis());
                    AbstractC9915k0.m10572b(c11850i, c10252z0, false);
                } catch (Exception e10) {
                    throw new C7802E(e10);
                }
            } catch (AbstractC7801D e11) {
                throw new C7023b("Could not verify the ID token", e11);
            }
        }
        return credentials;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m332f(C3175v c3175v, C3175v c3175v2) {
        AbstractC4941g.m5559R("Fully specified range is not actually fully specified.", c3175v2.m4023b());
        int i10 = c3175v.f9581a;
        int i11 = c3175v2.f9581a;
        if (i10 == 2 && i11 == 1) {
            return false;
        }
        if (i10 != 2 && i10 != 0 && i10 != i11) {
            return false;
        }
        int i12 = c3175v.f9582b;
        return i12 == 0 || i12 == c3175v2.f9582b;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m333g(C3175v c3175v, C3175v c3175v2, HashSet hashSet) {
        if (hashSet.contains(c3175v2)) {
            return m332f(c3175v, c3175v2);
        }
        AbstractC8072d6.m8486c("DynamicRangeResolver", "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + c3175v + "\nCandidate dynamic range:\n  " + c3175v2);
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static String m334h(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static C3175v m335l(C3175v c3175v, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (c3175v.f9581a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            C3175v c3175v2 = (C3175v) it.next();
            AbstractC4941g.m5558Q(c3175v2, "Fully specified DynamicRange cannot be null.");
            AbstractC4941g.m5559R("Fully specified DynamicRange must have fully defined encoding.", c3175v2.m4023b());
            if (c3175v2.f9581a != 1 && m333g(c3175v, c3175v2, hashSet)) {
                return c3175v2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static C0093v0 m336m(C15347d1 c15347d1, C15524y1 c15524y1) {
        C0093v0 c0093v0 = new C0093v0(c15524y1.getLogger());
        C15430c c15430c = c15347d1.f47195Z;
        C15138K1 c15138k1M16660a = c15430c.m16660a();
        c0093v0.m352v("sentry-trace_id", c15138k1M16660a != null ? c15138k1M16660a.f47144Y.toString() : null);
        c0093v0.m352v("sentry-public_key", c15524y1.retrieveParsedDsn().f48043b);
        c0093v0.m352v("sentry-release", c15347d1.f47199r0);
        c0093v0.m352v("sentry-environment", c15347d1.f47200s0);
        C15425E c15425e = c15347d1.f47202u0;
        c0093v0.m352v("sentry-user_segment", c15425e != null ? m337q(c15425e) : null);
        c0093v0.m352v("sentry-transaction", c15347d1.f47920H0);
        c0093v0.m352v("sentry-sample_rate", null);
        c0093v0.m352v("sentry-sampled", null);
        V v2 = c15430c.get("replay_id");
        if (v2 != 0 && !v2.toString().equals(C15447t.f48216Z.toString())) {
            c0093v0.m352v("sentry-replay_id", v2.toString());
            c15430c.remove("replay_id");
        }
        c0093v0.f403Z = false;
        return c0093v0;
    }

    /* JADX INFO: renamed from: B */
    public void m338B(InterfaceC13604m interfaceC13604m) {
        synchronized (this.f404o0) {
            try {
                if (((ArrayDeque) this.f405p0) == null) {
                    this.f405p0 = new ArrayDeque();
                }
                ((ArrayDeque) this.f405p0).add(interfaceC13604m);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m339C(C13606o c13606o) {
        InterfaceC13604m interfaceC13604m;
        synchronized (this.f404o0) {
            if (((ArrayDeque) this.f405p0) != null && !this.f403Z) {
                this.f403Z = true;
                while (true) {
                    synchronized (this.f404o0) {
                        try {
                            interfaceC13604m = (InterfaceC13604m) ((ArrayDeque) this.f405p0).poll();
                            if (interfaceC13604m == null) {
                                this.f403Z = false;
                                return;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    interfaceC13604m.mo15118a(c13606o);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m340c(long j10) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((C19662a) this.f405p0).f62320Y;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            if (C19737n.m20689a(((C19740q) obj).f62494a, j10)) {
                break;
            }
            i10++;
        }
        C19740q c19740q = (C19740q) obj;
        if (c19740q != null) {
            return c19740q.f62501h;
        }
        return false;
    }

    @Override // p228J.InterfaceC3820W
    public void close() {
        synchronized (this.f405p0) {
            ((ImageReader) this.f404o0).close();
        }
    }

    /* JADX INFO: renamed from: d */
    public C0093v0 m341d(Map parameters) {
        AbstractC16544l.m18094g(parameters, "parameters");
        ((C0017I0) this.f404o0).m71e(parameters);
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
    public boolean equals(TypeConstructor c9, TypeConstructor c10) {
        AbstractC16544l.m18094g(c9, "c1");
        AbstractC16544l.m18094g(c10, "c2");
        if (c9.equals(c10)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = c9.mo22589getDeclarationDescriptor();
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor2 = c10.mo22589getDeclarationDescriptor();
        if (!(classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptor) || !(classifierDescriptorMo22589getDeclarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return false;
        }
        return DescriptorEquivalenceForOverrides.INSTANCE.areTypeParametersEquivalent((TypeParameterDescriptor) classifierDescriptorMo22589getDeclarationDescriptor, (TypeParameterDescriptor) classifierDescriptorMo22589getDeclarationDescriptor2, this.f403Z, new C14198c((CallableDescriptor) this.f404o0, (CallableDescriptor) this.f405p0));
    }

    @Override // p228J.InterfaceC3820W
    public int getHeight() {
        int height;
        synchronized (this.f405p0) {
            height = ((ImageReader) this.f404o0).getHeight();
        }
        return height;
    }

    @Override // p228J.InterfaceC3820W
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f405p0) {
            surface = ((ImageReader) this.f404o0).getSurface();
        }
        return surface;
    }

    @Override // p228J.InterfaceC3820W
    public int getWidth() {
        int width;
        synchronized (this.f405p0) {
            width = ((ImageReader) this.f404o0).getWidth();
        }
        return width;
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: i */
    public InterfaceC3127U mo342i() {
        Image imageAcquireLatestImage;
        synchronized (this.f405p0) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.f404o0).acquireLatestImage();
            } catch (RuntimeException e10) {
                if (!"ImageReaderContext is not initialized".equals(e10.getMessage())) {
                    throw e10;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new C3133a(imageAcquireLatestImage);
        }
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: j */
    public int mo343j() {
        int imageFormat;
        synchronized (this.f405p0) {
            imageFormat = ((ImageReader) this.f404o0).getImageFormat();
        }
        return imageFormat;
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: k */
    public void mo344k() {
        synchronized (this.f405p0) {
            this.f403Z = true;
            ((ImageReader) this.f404o0).setOnImageAvailableListener(null, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public InterfaceC4623p m345n(TypeToken typeToken) {
        InterfaceC4623p c7296c;
        String str;
        InterfaceC4623p c2223b;
        int i10 = 10;
        int i11 = 9;
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        Map map = (Map) this.f404o0;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        if (map.get(rawType) != null) {
            throw new ClassCastException();
        }
        InterfaceC4623p c7591u = null;
        if (EnumSet.class.isAssignableFrom(rawType)) {
            c7296c = new C3032c(type, 11);
        } else {
            c7296c = rawType == EnumMap.class ? new C7296c(type, 17) : null;
        }
        if (c7296c != null) {
            return c7296c;
        }
        AbstractC4611d.m5346e((List) this.f405p0);
        if (Modifier.isAbstract(rawType.getModifiers())) {
            c2223b = null;
        } else {
            try {
                Constructor declaredConstructor = rawType.getDeclaredConstructor(null);
                AbstractC8633f4 abstractC8633f4 = AbstractC5704c.f18489a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e10) {
                    str = "Failed making constructor '" + AbstractC5704c.m6148b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage();
                }
                c2223b = str != null ? new C2223b(str) : new C13287b(declaredConstructor, 16);
            } catch (NoSuchMethodException unused) {
                c2223b = null;
            }
        }
        if (c2223b != null) {
            return c2223b;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (SortedSet.class.isAssignableFrom(rawType)) {
                c7591u = new C7102a(i11);
            } else if (Set.class.isAssignableFrom(rawType)) {
                c7591u = new C7591u(i11);
            } else {
                c7591u = Queue.class.isAssignableFrom(rawType) ? new C8258a() : new C15370i(i11);
            }
        } else if (Map.class.isAssignableFrom(rawType)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
                c7591u = new C18639a(i11);
            } else if (ConcurrentMap.class.isAssignableFrom(rawType)) {
                c7591u = new C20513d();
            } else if (SortedMap.class.isAssignableFrom(rawType)) {
                c7591u = new C2685e();
            } else {
                c7591u = (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new C7591u(i10) : new C7102a(i10);
            }
        }
        if (c7591u != null) {
            return c7591u;
        }
        String strM334h = m334h(rawType);
        if (strM334h != null) {
            return new C4613f(strM334h, 0);
        }
        if (this.f403Z) {
            return new C13288c(rawType);
        }
        return new C4612e("Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.", 0);
    }

    /* JADX INFO: renamed from: o */
    public String m346o(String str) {
        return (String) ((HashMap) this.f404o0).get(str);
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: p */
    public void mo347p(final InterfaceC3819V interfaceC3819V, final Executor executor) {
        synchronized (this.f405p0) {
            this.f403Z = false;
            ((ImageReader) this.f404o0).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: H.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C0093v0 c0093v0 = this.f9438a;
                    Executor executor2 = executor;
                    InterfaceC3819V interfaceC3819V2 = interfaceC3819V;
                    synchronized (c0093v0.f405p0) {
                        try {
                            if (!c0093v0.f403Z) {
                                executor2.execute(new RunnableC0074m(c0093v0, 19, interfaceC3819V2));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }, AbstractC4502m.m5243f());
        }
    }

    /* JADX INFO: renamed from: r */
    public void m348r() {
        InterfaceC3232g interfaceC3232g = (InterfaceC3232g) this.f404o0;
        AbstractC11105n abstractC11105nMo7809i = interfaceC3232g.mo7809i();
        if (abstractC11105nMo7809i.mo7807b() != EnumC11104m.f33475Z) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        abstractC11105nMo7809i.mo7806a(new C3227b(interfaceC3232g, 0));
        C3231f c3231f = (C3231f) this.f405p0;
        c3231f.getClass();
        if (c3231f.f9797a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        abstractC11105nMo7809i.mo7806a(new C3228c(c3231f, 0));
        c3231f.f9797a = true;
        this.f403Z = true;
    }

    /* JADX INFO: renamed from: s */
    public void m349s(Bundle bundle) {
        if (!this.f403Z) {
            m348r();
        }
        AbstractC11105n abstractC11105nMo7809i = ((InterfaceC3232g) this.f404o0).mo7809i();
        if (abstractC11105nMo7809i.mo7807b().compareTo(EnumC11104m.f33477p0) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + abstractC11105nMo7809i.mo7807b()).toString());
        }
        C3231f c3231f = (C3231f) this.f405p0;
        if (!c3231f.f9797a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c3231f.f9798b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c3231f.f9801e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c3231f.f9798b = true;
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: t */
    public int mo350t() {
        int maxImages;
        synchronized (this.f405p0) {
            maxImages = ((ImageReader) this.f404o0).getMaxImages();
        }
        return maxImages;
    }

    public String toString() {
        switch (this.f402Y) {
            case 4:
                return ((Map) this.f404o0).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m351u(Bundle outBundle) {
        AbstractC16544l.m18094g(outBundle, "outBundle");
        C3231f c3231f = (C3231f) this.f405p0;
        c3231f.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = (Bundle) c3231f.f9801e;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C20089f c20089f = (C20089f) c3231f.f9800d;
        c20089f.getClass();
        C20087d c20087d = new C20087d(c20089f);
        c20089f.f63614o0.put(c20087d, Boolean.FALSE);
        while (c20087d.hasNext()) {
            Map.Entry entry = (Map.Entry) c20087d.next();
            bundle.putBundle((String) entry.getKey(), ((InterfaceC3230e) entry.getValue()).mo612a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    /* JADX INFO: renamed from: v */
    public void m352v(String str, String str2) {
        if (this.f403Z) {
            ((HashMap) this.f404o0).put(str, str2);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m353w() {
        if (this.f403Z) {
            ((Context) this.f404o0).unregisterReceiver((RunnableC1548a) this.f405p0);
            this.f403Z = false;
        }
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: x */
    public InterfaceC3127U mo354x() {
        Image imageAcquireNextImage;
        synchronized (this.f405p0) {
            try {
                imageAcquireNextImage = ((ImageReader) this.f404o0).acquireNextImage();
            } catch (RuntimeException e10) {
                if (!"ImageReaderContext is not initialized".equals(e10.getMessage())) {
                    throw e10;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new C3133a(imageAcquireNextImage);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m355y(C15126G1 c15126g1, C15425E c15425e, C15447t c15447t, C15524y1 c15524y1, C2391u c2391u) {
        m352v("sentry-trace_id", c15126g1.f47076b.f47133c.f47144Y.toString());
        m352v("sentry-public_key", c15524y1.retrieveParsedDsn().f48043b);
        m352v("sentry-release", c15524y1.getRelease());
        m352v("sentry-environment", c15524y1.getEnvironment());
        m352v("sentry-user_segment", c15425e != null ? m337q(c15425e) : null);
        EnumC15423C enumC15423C = c15126g1.f47088n;
        m352v("sentry-transaction", (enumC15423C == null || EnumC15423C.URL.equals(enumC15423C)) ? null : c15126g1.f47079e);
        if (c15447t != null && !C15447t.f48216Z.equals(c15447t)) {
            m352v("sentry-replay_id", c15447t.toString());
        }
        Double d10 = c2391u == null ? null : (Double) c2391u.f7429Z;
        m352v("sentry-sample_rate", !AbstractC8489H3.m9146d(d10, false) ? null : new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT)).format(d10));
        Boolean bool = c2391u == null ? null : (Boolean) c2391u.f7430o0;
        m352v("sentry-sampled", bool != null ? bool.toString() : null);
    }

    /* JADX INFO: renamed from: z */
    public C15158R1 m356z() {
        String strM346o = m346o("sentry-trace_id");
        String strM346o2 = m346o("sentry-replay_id");
        String strM346o3 = m346o("sentry-public_key");
        if (strM346o == null || strM346o3 == null) {
            return null;
        }
        C15158R1 c15158r1 = new C15158R1(new C15447t(strM346o), strM346o3, m346o("sentry-release"), m346o("sentry-environment"), m346o("sentry-user_id"), m346o("sentry-user_segment"), m346o("sentry-transaction"), m346o("sentry-sample_rate"), m346o("sentry-sampled"), strM346o2 == null ? null : new C15447t(strM346o2));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : ((HashMap) this.f404o0).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!AbstractC15319b.f47861a.contains(str) && str2 != null) {
                concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
            }
        }
        c15158r1.f47192w0 = concurrentHashMap;
        return c15158r1;
    }

    public /* synthetic */ C0093v0(Map map, boolean z6, Object obj, int i10) {
        this.f402Y = i10;
        this.f404o0 = map;
        this.f403Z = z6;
        this.f405p0 = obj;
    }

    /* JADX INFO: renamed from: q */
    public static String m337q(C15425E c15425e) {
        String str = c15425e.f48065p0;
        if (str != null) {
            return str;
        }
        ConcurrentHashMap concurrentHashMap = c15425e.f48069t0;
        if (concurrentHashMap != null) {
            return (String) concurrentHashMap.get(TVCuK.rVBtFaGimdgnYA);
        }
        return null;
    }

    public C0093v0(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z6) {
        this.f402Y = 8;
        this.f403Z = z6;
        this.f404o0 = callableDescriptor;
        this.f405p0 = callableDescriptor2;
    }

    public C0093v0(InterfaceC3232g interfaceC3232g) {
        this.f402Y = 3;
        this.f404o0 = interfaceC3232g;
        this.f405p0 = new C3231f();
    }

    public C0093v0(int i10) {
        this.f402Y = i10;
        switch (i10) {
            case 7:
                this.f404o0 = new Object();
                break;
            default:
                long[] jArr = AbstractC12957J.f41150a;
                this.f404o0 = new C12951D();
                this.f405p0 = new C6546d(new InterfaceC1426a[16]);
                break;
        }
    }

    public C0093v0(Context context, Handler handler, SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A) {
        this.f402Y = 1;
        this.f404o0 = context.getApplicationContext();
        this.f405p0 = new RunnableC1548a(this, handler, surfaceHolderCallbackC1523A);
    }

    public C0093v0(ImageReader imageReader) {
        this.f402Y = 2;
        this.f405p0 = new Object();
        this.f403Z = true;
        this.f404o0 = imageReader;
    }

    public C0093v0(C0703j c0703j) {
        this.f402Y = 0;
        this.f404o0 = c0703j;
        this.f405p0 = C13287b.m14899i(c0703j);
        int[] iArr = (int[]) c0703j.m1476a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z6 = false;
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 18) {
                    z6 = true;
                    break;
                }
            }
        }
        this.f403Z = z6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0093v0(InterfaceC15127H interfaceC15127H) {
        this(new HashMap(), true, interfaceC15127H, 9);
        this.f402Y = 9;
    }
}
