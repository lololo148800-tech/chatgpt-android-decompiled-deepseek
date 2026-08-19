package p046Bk;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p225Im.InterfaceC3756d;
import p366Oj.C6259a;
import p366Oj.C6263e;
import p408Qj.C6740f;
import p408Qj.C6742h;
import p769gj.C14166h;
import p769gj.C14183y;
import p769gj.InterfaceC14147A;
import p813ij.C15019c;
import p813ij.C15022f;
import p838jj.C16222c;
import p838jj.C16224e;
import p931ok.C18226g;
import p931ok.C18227h;

/* JADX INFO: renamed from: Bk.Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1361Y implements InterfaceC14147A {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3608a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C14166h f3609b;

    public C1361Y(int i10) {
        this.f3608a = i10;
        switch (i10) {
            case 1:
                this.f3609b = new C14166h(AbstractC16526C.f51263a.mo5693b(C6263e.class), C6259a.f20349Y);
                break;
            case 2:
                this.f3609b = new C14166h(AbstractC16526C.f51263a.mo5693b(C6742h.class), C6740f.f21642Y);
                break;
            case 3:
                this.f3609b = new C14166h(AbstractC16526C.f51263a.mo5693b(C15022f.class), C15019c.f46717Y);
                break;
            case 4:
                this.f3609b = new C14166h(AbstractC16526C.f51263a.mo5693b(C16224e.class), new C16222c(0));
                break;
            case 5:
                this.f3609b = new C14166h(AbstractC16526C.f51263a.mo5693b(C18226g.class), C18227h.f58079Y);
                break;
            default:
                this.f3609b = new C14166h(AbstractC16526C.f51263a.mo5693b(C1407s0.class), C1359X.f3598Y);
                break;
        }
    }

    @Override // p769gj.InterfaceC14147A
    /* JADX INFO: renamed from: a */
    public final View mo1135a(Object obj, C14183y initialViewEnvironment, Context context, ViewGroup viewGroup) {
        switch (this.f3608a) {
            case 0:
                C1407s0 initialRendering = (C1407s0) obj;
                AbstractC16544l.m18094g(initialRendering, "initialRendering");
                AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
                return this.f3609b.mo1135a(initialRendering, initialViewEnvironment, context, viewGroup);
            case 1:
                C6263e initialRendering2 = (C6263e) obj;
                AbstractC16544l.m18094g(initialRendering2, "initialRendering");
                AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
                return this.f3609b.mo1135a(initialRendering2, initialViewEnvironment, context, viewGroup);
            case 2:
                C6742h initialRendering3 = (C6742h) obj;
                AbstractC16544l.m18094g(initialRendering3, "initialRendering");
                AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
                return this.f3609b.mo1135a(initialRendering3, initialViewEnvironment, context, viewGroup);
            case 3:
                C15022f initialRendering4 = (C15022f) obj;
                AbstractC16544l.m18094g(initialRendering4, "initialRendering");
                AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
                return this.f3609b.mo1135a(initialRendering4, initialViewEnvironment, context, viewGroup);
            case 4:
                C16224e initialRendering5 = (C16224e) obj;
                AbstractC16544l.m18094g(initialRendering5, "initialRendering");
                AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
                return this.f3609b.mo1135a(initialRendering5, initialViewEnvironment, context, viewGroup);
            default:
                C18226g initialRendering6 = (C18226g) obj;
                AbstractC16544l.m18094g(initialRendering6, "initialRendering");
                AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
                return this.f3609b.mo1135a(initialRendering6, initialViewEnvironment, context, viewGroup);
        }
    }

    @Override // p769gj.InterfaceC14147A
    public final InterfaceC3756d getType() {
        switch (this.f3608a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.f3609b.f44545a;
    }
}
