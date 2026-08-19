package io.sentry;

import io.sentry.exception.C15351a;
import io.sentry.hints.InterfaceC15362a;
import io.sentry.hints.InterfaceC15365d;
import io.sentry.protocol.C15421A;
import io.sentry.protocol.C15425E;
import io.sentry.protocol.C15431d;
import io.sentry.protocol.C15437j;
import io.sentry.protocol.C15446s;
import io.sentry.protocol.DebugImage;
import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p1009s9.C19506i;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8483G3;
import p594Y9.C9895g4;
import p658b5.C11248s;
import p690cp.C12910A;

/* JADX INFO: renamed from: io.sentry.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15398k0 implements InterfaceC15472s, Closeable {

    /* JADX INFO: renamed from: Y */
    public final C15524y1 f48005Y;

    /* JADX INFO: renamed from: Z */
    public final C11248s f48006Z;

    /* JADX INFO: renamed from: o0 */
    public final C19506i f48007o0;

    /* JADX INFO: renamed from: p0 */
    public volatile C15525z f48008p0 = null;

    public C15398k0(C15524y1 c15524y1) {
        AbstractC8483G3.m9133c(c15524y1, "The SentryOptions is required.");
        this.f48005Y = c15524y1;
        C9895g4 c9895g4 = new C9895g4(c15524y1);
        this.f48007o0 = new C19506i(c9895g4, 29);
        this.f48006Z = new C11248s(c9895g4, c15524y1);
    }

    /* JADX INFO: renamed from: E */
    public final void m16647E(AbstractC15160S0 abstractC15160S0) {
        ArrayList arrayList = new ArrayList();
        C15524y1 c15524y1 = this.f48005Y;
        if (c15524y1.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(c15524y1.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : c15524y1.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C15431d c15431d = abstractC15160S0.f47207z0;
        if (c15431d == null) {
            c15431d = new C15431d();
        }
        List list = c15431d.f48103Z;
        if (list == null) {
            c15431d.f48103Z = new ArrayList(arrayList);
        } else {
            list.addAll(arrayList);
        }
        abstractC15160S0.f47207z0 = c15431d;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m16648P(AbstractC15160S0 abstractC15160S0, C15516w c15516w) {
        if (AbstractC8465D3.m9093g(c15516w)) {
            return true;
        }
        this.f48005Y.getLogger().mo16298o(EnumC15375i1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC15160S0.f47194Y);
        return false;
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: a */
    public final C15108A1 mo16376a(C15108A1 c15108a1, C15516w c15516w) {
        if (c15108a1.f47201t0 == null) {
            c15108a1.f47201t0 = "java";
        }
        if (m16648P(c15108a1, c15516w)) {
            m16649m(c15108a1);
        }
        return c15108a1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f48008p0 != null) {
            this.f48008p0.f48485f.shutdown();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: e */
    public final C15347d1 mo16380e(C15347d1 c15347d1, C15516w c15516w) {
        ArrayList arrayList;
        Thread threadCurrentThread;
        C15437j c15437j;
        boolean z6;
        if (c15347d1.f47201t0 == null) {
            c15347d1.f47201t0 = "java";
        }
        Throwable cause = c15347d1.f47203v0;
        if (cause != null) {
            C19506i c19506i = this.f48007o0;
            c19506i.getClass();
            ArrayDeque arrayDeque = new ArrayDeque();
            HashSet hashSet = new HashSet();
            while (cause != null && hashSet.add(cause)) {
                if (cause instanceof C15351a) {
                    C15351a c15351a = (C15351a) cause;
                    C15437j c15437j2 = c15351a.f47930Y;
                    Throwable th2 = c15351a.f47931Z;
                    threadCurrentThread = c15351a.f47932o0;
                    z6 = c15351a.f47933p0;
                    cause = th2;
                    c15437j = c15437j2;
                } else {
                    threadCurrentThread = Thread.currentThread();
                    c15437j = null;
                    z6 = false;
                }
                arrayDeque.addFirst(C19506i.m20605W(cause, c15437j, Long.valueOf(threadCurrentThread.getId()), ((C9895g4) c19506i.f61960Z).m10563z(cause.getStackTrace(), c15437j != null && Boolean.FALSE.equals(c15437j.f48160p0)), z6));
                cause = cause.getCause();
            }
            c15347d1.f47918F0 = new C12910A(new ArrayList(arrayDeque));
        }
        m16647E(c15347d1);
        C15524y1 c15524y1 = this.f48005Y;
        Map mapMo16643a = c15524y1.getModulesLoader().mo16643a();
        if (mapMo16643a != null) {
            AbstractMap abstractMap = c15347d1.f47923K0;
            if (abstractMap == null) {
                c15347d1.f47923K0 = new HashMap(mapMo16643a);
            } else {
                abstractMap.putAll(mapMo16643a);
            }
        }
        if (m16648P(c15347d1, c15516w)) {
            m16649m(c15347d1);
            C12910A c12910a = c15347d1.f47917E0;
            if ((c12910a != null ? c12910a.f41066a : null) == null) {
                C12910A c12910a2 = c15347d1.f47918F0;
                ArrayList<C15446s> arrayList2 = c12910a2 == null ? null : c12910a2.f41066a;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (C15446s c15446s : arrayList2) {
                        if (c15446s.f48214r0 != null && c15446s.f48212p0 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(c15446s.f48212p0);
                        }
                    }
                }
                boolean zIsAttachThreads = c15524y1.isAttachThreads();
                C11248s c11248s = this.f48006Z;
                if (zIsAttachThreads || InterfaceC15362a.class.isInstance(AbstractC8465D3.m9088b(c15516w))) {
                    Object objM9088b = AbstractC8465D3.m9088b(c15516w);
                    boolean zMo16461c = objM9088b instanceof InterfaceC15362a ? ((InterfaceC15362a) objM9088b).mo16461c() : false;
                    c11248s.getClass();
                    c15347d1.f47917E0 = new C12910A(c11248s.m12666k(Thread.getAllStackTraces(), arrayList, zMo16461c));
                } else if (c15524y1.isAttachStacktrace() && ((arrayList2 == null || arrayList2.isEmpty()) && !InterfaceC15365d.class.isInstance(AbstractC8465D3.m9088b(c15516w)))) {
                    c11248s.getClass();
                    HashMap map = new HashMap();
                    Thread threadCurrentThread2 = Thread.currentThread();
                    map.put(threadCurrentThread2, threadCurrentThread2.getStackTrace());
                    c15347d1.f47917E0 = new C12910A(c11248s.m12666k(map, null, false));
                }
            }
        }
        return c15347d1;
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: k */
    public final C15421A mo16381k(C15421A c15421a, C15516w c15516w) {
        if (c15421a.f47201t0 == null) {
            c15421a.f47201t0 = "java";
        }
        m16647E(c15421a);
        if (m16648P(c15421a, c15516w)) {
            m16649m(c15421a);
        }
        return c15421a;
    }

    /* JADX INFO: renamed from: m */
    public final void m16649m(AbstractC15160S0 abstractC15160S0) {
        if (abstractC15160S0.f47199r0 == null) {
            abstractC15160S0.f47199r0 = this.f48005Y.getRelease();
        }
        if (abstractC15160S0.f47200s0 == null) {
            abstractC15160S0.f47200s0 = this.f48005Y.getEnvironment();
        }
        if (abstractC15160S0.f47204w0 == null) {
            abstractC15160S0.f47204w0 = this.f48005Y.getServerName();
        }
        if (this.f48005Y.isAttachServerName() && abstractC15160S0.f47204w0 == null) {
            if (this.f48008p0 == null) {
                synchronized (this) {
                    try {
                        if (this.f48008p0 == null) {
                            if (C15525z.f48479i == null) {
                                C15525z.f48479i = new C15525z();
                            }
                            this.f48008p0 = C15525z.f48479i;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (this.f48008p0 != null) {
                C15525z c15525z = this.f48008p0;
                if (c15525z.f48482c < System.currentTimeMillis() && c15525z.f48483d.compareAndSet(false, true)) {
                    c15525z.m16732a();
                }
                abstractC15160S0.f47204w0 = c15525z.f48481b;
            }
        }
        if (abstractC15160S0.f47205x0 == null) {
            abstractC15160S0.f47205x0 = this.f48005Y.getDist();
        }
        if (abstractC15160S0.f47196o0 == null) {
            abstractC15160S0.f47196o0 = this.f48005Y.getSdkVersion();
        }
        AbstractMap abstractMap = abstractC15160S0.f47198q0;
        C15524y1 c15524y1 = this.f48005Y;
        if (abstractMap == null) {
            abstractC15160S0.f47198q0 = new HashMap(new HashMap(c15524y1.getTags()));
        } else {
            for (Map.Entry<String, String> entry : c15524y1.getTags().entrySet()) {
                if (!abstractC15160S0.f47198q0.containsKey(entry.getKey())) {
                    abstractC15160S0.m16341c(entry.getKey(), entry.getValue());
                }
            }
        }
        C15425E c15425e = abstractC15160S0.f47202u0;
        if (c15425e == null) {
            c15425e = new C15425E();
            abstractC15160S0.f47202u0 = c15425e;
        }
        if (c15425e.f48066q0 == null) {
            c15425e.f48066q0 = "{{auto}}";
        }
    }
}
