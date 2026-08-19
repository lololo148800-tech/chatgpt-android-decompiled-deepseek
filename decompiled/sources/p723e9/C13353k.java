package p723e9;

import java.util.concurrent.Executor;
import p593Y8.C9692s;
import p643a9.InterfaceC10527b;
import p745f9.InterfaceC13586d;
import p767g9.InterfaceC13832c;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: e9.k */
/* JADX INFO: loaded from: classes.dex */
public final class C13353k implements InterfaceC10527b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f42372a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f42373b;

    /* JADX INFO: renamed from: c */
    public final C9692s f42374c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f42375d;

    public C13353k(InterfaceC17068a interfaceC17068a, InterfaceC17068a interfaceC17068a2, C9692s c9692s, InterfaceC17068a interfaceC17068a3) {
        this.f42372a = interfaceC17068a;
        this.f42373b = interfaceC17068a2;
        this.f42374c = c9692s;
        this.f42375d = interfaceC17068a3;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        return new C13352j((Executor) this.f42372a.get(), (InterfaceC13586d) this.f42373b.get(), (C13345c) this.f42374c.get(), (InterfaceC13832c) this.f42375d.get());
    }
}
