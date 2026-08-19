package p701d9;

import java.util.concurrent.Executor;
import p593Y8.C9692s;
import p616Z8.C10258f;
import p643a9.InterfaceC10527b;
import p723e9.C13345c;
import p745f9.InterfaceC13586d;
import p767g9.InterfaceC13832c;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: d9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13047b implements InterfaceC10527b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f41466a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f41467b;

    /* JADX INFO: renamed from: c */
    public final C9692s f41468c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f41469d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f41470e;

    public C13047b(InterfaceC17068a interfaceC17068a, InterfaceC17068a interfaceC17068a2, C9692s c9692s, InterfaceC17068a interfaceC17068a3, InterfaceC17068a interfaceC17068a4) {
        this.f41466a = interfaceC17068a;
        this.f41467b = interfaceC17068a2;
        this.f41468c = c9692s;
        this.f41469d = interfaceC17068a3;
        this.f41470e = interfaceC17068a4;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        return new C13046a((Executor) this.f41466a.get(), (C10258f) this.f41467b.get(), (C13345c) this.f41468c.get(), (InterfaceC13586d) this.f41469d.get(), (InterfaceC13832c) this.f41470e.get());
    }
}
