package p769gj;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1441p;
import p225Im.InterfaceC3756d;

/* JADX INFO: renamed from: gj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C14166h implements InterfaceC14147A {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3756d f44545a;

    /* JADX INFO: renamed from: b */
    public final AbstractC16546n f44546b;

    /* JADX WARN: Multi-variable type inference failed */
    public C14166h(InterfaceC3756d type, InterfaceC1441p interfaceC1441p) {
        AbstractC16544l.m18094g(type, "type");
        this.f44545a = type;
        this.f44546b = (AbstractC16546n) interfaceC1441p;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Bm.p, kotlin.jvm.internal.n] */
    @Override // p769gj.InterfaceC14147A
    /* JADX INFO: renamed from: a */
    public final View mo1135a(Object initialRendering, C14183y initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
        AbstractC16544l.m18094g(initialRendering, "initialRendering");
        AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
        AbstractC16544l.m18094g(contextForNewView, "contextForNewView");
        return (View) this.f44546b.mo985d(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
    }

    @Override // p769gj.InterfaceC14147A
    public final InterfaceC3756d getType() {
        return this.f44545a;
    }
}
