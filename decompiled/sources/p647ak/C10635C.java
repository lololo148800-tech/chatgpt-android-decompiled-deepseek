package p647ak;

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
import p949pj.C18470i0;

/* JADX INFO: renamed from: ak.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C10635C implements InterfaceC14147A {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C14166h f31555a;

    public C10635C(C14438g cameraPreview, C18470i0 selfieDirectionFeed) {
        AbstractC16544l.m18094g(cameraPreview, "cameraPreview");
        AbstractC16544l.m18094g(selfieDirectionFeed, "selfieDirectionFeed");
        this.f31555a = new C14166h(AbstractC16526C.f51263a.mo5693b(C10652K0.class), new C0364y(selfieDirectionFeed, 9, cameraPreview));
    }

    @Override // p769gj.InterfaceC14147A
    /* JADX INFO: renamed from: a */
    public final View mo1135a(Object obj, C14183y initialViewEnvironment, Context context, ViewGroup viewGroup) {
        C10652K0 initialRendering = (C10652K0) obj;
        AbstractC16544l.m18094g(initialRendering, "initialRendering");
        AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
        return this.f31555a.mo1135a(initialRendering, initialViewEnvironment, context, viewGroup);
    }

    @Override // p769gj.InterfaceC14147A
    public final InterfaceC3756d getType() {
        return this.f31555a.f44545a;
    }
}
