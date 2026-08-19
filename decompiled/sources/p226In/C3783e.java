package p226In;

import kotlin.jvm.internal.AbstractC16541i;
import mm.InterfaceC17302e;
import p025An.InterfaceC0595V;
import p049Bm.InterfaceC1440o;
import p153Fn.AbstractC2940r;
import p153Fn.C2942t;

/* JADX INFO: renamed from: In.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C3783e {

    /* JADX INFO: renamed from: a */
    public final Object f11423a;

    /* JADX INFO: renamed from: b */
    public final AbstractC16541i f11424b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1440o f11425c;

    /* JADX INFO: renamed from: d */
    public final C2942t f11426d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17302e f11427e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1440o f11428f;

    /* JADX INFO: renamed from: g */
    public Object f11429g;

    /* JADX INFO: renamed from: h */
    public int f11430h = -1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3785g f11431i;

    /* JADX WARN: Multi-variable type inference failed */
    public C3783e(C3785g c3785g, Object obj, InterfaceC1440o interfaceC1440o, InterfaceC1440o interfaceC1440o2, C2942t c2942t, InterfaceC17302e interfaceC17302e, InterfaceC1440o interfaceC1440o3) {
        this.f11431i = c3785g;
        this.f11423a = obj;
        this.f11424b = (AbstractC16541i) interfaceC1440o;
        this.f11425c = interfaceC1440o2;
        this.f11426d = c2942t;
        this.f11427e = interfaceC17302e;
        this.f11428f = interfaceC1440o3;
    }

    /* JADX INFO: renamed from: a */
    public final void m4453a() {
        Object obj = this.f11429g;
        if (obj instanceof AbstractC2940r) {
            ((AbstractC2940r) obj).mo2562h(this.f11430h, this.f11431i.f11437Y);
            return;
        }
        InterfaceC0595V interfaceC0595V = obj instanceof InterfaceC0595V ? (InterfaceC0595V) obj : null;
        if (interfaceC0595V != null) {
            interfaceC0595V.dispose();
        }
    }
}
