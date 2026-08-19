package p1156zj;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p006A4.C0364y;
import p225Im.InterfaceC3756d;
import p769gj.C14166h;
import p769gj.C14183y;
import p769gj.InterfaceC14147A;
import p784hb.C14438g;
import p908nk.C17645a;
import p949pj.C18438K;

/* JADX INFO: renamed from: zj.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C22104J implements InterfaceC14147A {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C14166h f69868a;

    public C22104J(C18438K governmentIdFeed, C14438g cameraPreview, C17645a systemUiController) {
        AbstractC16544l.m18094g(governmentIdFeed, "governmentIdFeed");
        AbstractC16544l.m18094g(cameraPreview, "cameraPreview");
        AbstractC16544l.m18094g(systemUiController, "systemUiController");
        this.f69868a = new C14166h(AbstractC16526C.f51263a.mo5693b(C22172l1.class), new C0364y(governmentIdFeed, 17, cameraPreview));
    }

    @Override // p769gj.InterfaceC14147A
    /* JADX INFO: renamed from: a */
    public final View mo1135a(Object obj, C14183y initialViewEnvironment, Context context, ViewGroup viewGroup) {
        C22172l1 initialRendering = (C22172l1) obj;
        AbstractC16544l.m18094g(initialRendering, "initialRendering");
        AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
        return this.f69868a.mo1135a(initialRendering, initialViewEnvironment, context, viewGroup);
    }

    @Override // p769gj.InterfaceC14147A
    public final InterfaceC3756d getType() {
        return this.f69868a.f44545a;
    }
}
