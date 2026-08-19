package p849k7;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import p1007s7.InterfaceC19469h;
import p523V9.AbstractC7889G0;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p699d7.InterfaceC13037a;
import p699d7.InterfaceC13038b;
import p722e8.C13298H;
import p817j$.util.concurrent.ConcurrentHashMap;
import p867l8.C16831c;
import p885m4.C17152b;
import p885m4.C17155e;
import p887m7.InterfaceC17178d;
import p887m7.InterfaceC17183i;
import p901n7.C17513b;
import p943p7.InterfaceC18306d;

/* JADX INFO: renamed from: k7.m */
/* JADX INFO: loaded from: classes.dex */
public final class C16360m {

    /* JADX INFO: renamed from: a */
    public final C16352e f50807a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13037a f50808b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC11256c f50809c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f50810d;

    /* JADX INFO: renamed from: e */
    public final Set f50811e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f50812f;

    /* JADX INFO: renamed from: g */
    public InterfaceC19469h f50813g;

    /* JADX INFO: renamed from: h */
    public InterfaceC17178d f50814h;

    /* JADX INFO: renamed from: i */
    public InterfaceC17183i f50815i;

    /* JADX INFO: renamed from: j */
    public InterfaceC18306d f50816j;

    /* JADX INFO: renamed from: k */
    public C17513b f50817k;

    public C16360m(C16352e c16352e, InterfaceC13037a interfaceC13037a, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f50807a = c16352e;
        this.f50808b = interfaceC13037a;
        this.f50809c = internalLogger;
        this.f50810d = new AtomicBoolean(false);
        this.f50811e = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f50812f = new AtomicReference(null);
        this.f50813g = new C17155e();
        this.f50814h = new C16361n();
        this.f50815i = new C16831c();
        this.f50816j = new C17152b();
    }

    /* JADX INFO: renamed from: a */
    public final void m17960a(Object obj) {
        InterfaceC13038b interfaceC13038b = (InterfaceC13038b) this.f50812f.get();
        if (interfaceC13038b != null) {
            interfaceC13038b.mo5602b(obj);
            return;
        }
        AbstractC7889G0.m8184b(this.f50809c, 3, EnumC11255b.f34098Y, new C13298H(this, 25), null, false, 56);
    }
}
