package p403Qd;

import mm.EnumC17307j;
import p025An.C0644w;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Qd.w */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public abstract class AbstractC6661w extends AbstractC6601G {
    public static final C6660v Companion = new C6660v();

    /* JADX INFO: renamed from: b */
    public static final Object f21430b = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C6620a.f21349q0);

    @Override // p403Qd.AbstractC6601G
    /* JADX INFO: renamed from: a */
    public final String mo7159a() {
        if (this instanceof C6650p) {
            return ((C6650p) this).f21413c;
        }
        if (this instanceof C6644m) {
            return "error";
        }
        throw new C0644w();
    }
}
