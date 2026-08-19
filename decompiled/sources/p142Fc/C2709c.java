package p142Fc;

import bj.C11447L;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C12869g;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import gd.InterfaceC13849E;
import ni.C17629c;
import p1043ui.C20291a;
import p1081wc.C20879Z;
import p1081wc.C20881a0;
import p215Ic.C3690g;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p289Lc.C4994b;
import p289Lc.C4996d;
import p336Nc.C5706b;
import vi.C20622d;

/* JADX INFO: renamed from: Fc.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2709c implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8341a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4478i f8342b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4478i f8343c;

    public /* synthetic */ C2709c(InterfaceC4478i interfaceC4478i, InterfaceC4478i interfaceC4478i2, int i10) {
        this.f8341a = i10;
        this.f8342b = interfaceC4478i;
        this.f8343c = interfaceC4478i2;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f8341a) {
            case 0:
                return new C2708b((InterfaceC13849E) this.f8342b.get(), (C20879Z) this.f8343c.get());
            case 1:
                return new C2708b((InterfaceC13849E) this.f8342b.get(), (C20881a0) this.f8343c.get());
            case 2:
                return new C3690g((InterfaceC13849E) this.f8342b.get(), (C20879Z) this.f8343c.get());
            case 3:
                return new C4994b((C5706b) this.f8342b.get(), (C4996d) this.f8343c.get());
            case 4:
                return new C12869g((FallbackModeService) this.f8342b.get(), (C11447L) this.f8343c.get());
            default:
                return new C20622d((C20291a) this.f8342b.get(), (C17629c) this.f8343c.get());
        }
    }
}
