package p593Y8;

import android.content.Context;
import p1061vb.C20513d;
import p140Fa.C2685e;
import p616Z8.C10257e;
import p643a9.InterfaceC10527b;
import p701d9.C13047b;
import p701d9.InterfaceC13048c;
import p723e9.C13343a;
import p723e9.C13345c;
import p723e9.C13350h;
import p723e9.C13351i;
import p723e9.C13352j;
import p723e9.C13353k;
import p745f9.InterfaceC13586d;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: Y8.s */
/* JADX INFO: loaded from: classes.dex */
public final class C9692s implements InterfaceC10527b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29216a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10527b f29217b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f29218c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC10527b f29219d;

    public /* synthetic */ C9692s(InterfaceC10527b interfaceC10527b, InterfaceC17068a interfaceC17068a, InterfaceC10527b interfaceC10527b2, int i10) {
        this.f29216a = i10;
        this.f29217b = interfaceC10527b;
        this.f29218c = interfaceC17068a;
        this.f29219d = interfaceC10527b2;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f29216a) {
            case 0:
                return new C9691r(new C2685e(), new C20513d(), (InterfaceC13048c) ((C13047b) this.f29217b).get(), (C13350h) ((C13351i) this.f29218c).get(), (C13352j) ((C13353k) this.f29219d).get());
            default:
                return new C13345c((Context) ((C10257e) this.f29217b).f30470b, (InterfaceC13586d) this.f29218c.get(), (C13343a) ((C9687n) this.f29219d).get());
        }
    }
}
