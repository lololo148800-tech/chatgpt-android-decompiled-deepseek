package p769gj;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p225Im.InterfaceC3756d;

/* JADX INFO: renamed from: gj.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C14173o implements InterfaceC14147A {

    /* JADX INFO: renamed from: b */
    public static final C14173o f44559b = new C14173o();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C14168j f44560a = new C14168j(AbstractC16526C.f51263a.mo5693b(C14172n.class), C14163e.f44537o0, null, 12);

    @Override // p769gj.InterfaceC14147A
    /* JADX INFO: renamed from: a */
    public final View mo1135a(Object obj, C14183y initialViewEnvironment, Context context, ViewGroup viewGroup) {
        C14172n initialRendering = (C14172n) obj;
        AbstractC16544l.m18094g(initialRendering, "initialRendering");
        AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
        return this.f44560a.mo1135a(initialRendering, initialViewEnvironment, context, viewGroup);
    }

    @Override // p769gj.InterfaceC14147A
    public final InterfaceC3756d getType() {
        return this.f44560a.f44547a;
    }
}
